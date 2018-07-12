/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.AdditionalMatchers.and;
import static org.mockito.AdditionalMatchers.gt;
import static org.mockito.AdditionalMatchers.leq;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import com.oracle.bmc.objectstorage.model.MultipartUpload;
import com.oracle.bmc.objectstorage.requests.CommitMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.CreateMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.UploadPartRequest;
import com.oracle.bmc.objectstorage.responses.CreateMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.UploadPartResponse;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.google.common.base.Strings;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.responses.CommitMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.PutObjectResponse;
import com.oracle.bmc.objectstorage.transfer.UploadManager.UploadRequest;
import com.oracle.bmc.objectstorage.transfer.UploadManager.UploadResponse;
import com.oracle.bmc.objectstorage.transfer.internal.MultipartManifestImpl;
import com.oracle.bmc.util.StreamUtils;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class UploadManagerTest {
    private static final String CONTENT = Strings.repeat("a", 2097152); // 2MiB
    private static final long CONTENT_LENGTH = CONTENT.length();
    private static final int READ_BLOCK_SIZE = 8192; // 8KB
    private static final String CLIENT_REQ_ID = "clientReqId";
    private static final String REQ_ID = "reqId";
    private static final String CONTENT_TYPE = "application/text";
    private static final String CONTENT_ENCODING = "gzip";
    private static final String CONTENT_LANG = "en";
    private static final Map<String, String> METADATA = new HashMap<>();

    private InputStream body;

    @Mock private ObjectStorage objectStorage;

    @Mock private MultipartObjectAssembler assembler;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        body = StreamUtils.createByteArrayInputStream(CONTENT.getBytes());
    }

    @Test
    public void upload_singleUpload() throws IOException {
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder().allowMultipartUploads(false).build();
        UploadManager uploadManager = new UploadManager(objectStorage, uploadConfiguration);

        UploadRequest request = createUploadRequest();

        ArgumentCaptor<PutObjectRequest> putRequestCaptor =
                ArgumentCaptor.forClass(PutObjectRequest.class);
        PutObjectResponse putResponse =
                PutObjectResponse.builder()
                        .eTag("etag")
                        .opcContentMd5("md5")
                        .opcRequestId(REQ_ID)
                        .opcClientRequestId(CLIENT_REQ_ID)
                        .build();
        when(objectStorage.putObject(putRequestCaptor.capture())).thenReturn(putResponse);

        UploadResponse uploadResponse = uploadManager.upload(request);
        assertNotNull(uploadResponse);
        assertEquals("etag", uploadResponse.getETag());
        assertEquals("md5", uploadResponse.getContentMd5());
        assertNull(uploadResponse.getMultipartMd5());
        assertEquals(REQ_ID, uploadResponse.getOpcRequestId());
        assertEquals(CLIENT_REQ_ID, uploadResponse.getOpcClientRequestId());
        byte[] buffer = new byte[(int) CONTENT_LENGTH];
        putRequestCaptor.getValue().getPutObjectBody().read(buffer);
        assertEquals(CONTENT, new String(buffer));
        assertEquals(CONTENT_LENGTH, putRequestCaptor.getValue().getContentLength().longValue());
        assertEquals(CLIENT_REQ_ID, putRequestCaptor.getValue().getOpcClientRequestId());
        assertSame(METADATA, putRequestCaptor.getValue().getOpcMeta());
    }

    @Test
    public void upload_singleUpload_enforceMd5() throws Exception {
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder().allowMultipartUploads(false).enforceMd5(true).build();
        UploadManager uploadManager = new UploadManager(objectStorage, uploadConfiguration);

        UploadRequest request = createUploadRequest();

        ArgumentCaptor<PutObjectRequest> putRequestCaptor =
                ArgumentCaptor.forClass(PutObjectRequest.class);
        PutObjectResponse putResponse = PutObjectResponse.builder().build();
        when(objectStorage.putObject(putRequestCaptor.capture())).thenReturn(putResponse);

        UploadResponse uploadResponse = uploadManager.upload(request);
        assertNotNull(uploadResponse);
        byte[] buffer = new byte[(int) CONTENT_LENGTH];
        putRequestCaptor.getValue().getPutObjectBody().read(buffer);
        assertEquals(CONTENT, new String(buffer));
        assertEquals(CONTENT_LENGTH, putRequestCaptor.getValue().getContentLength().longValue());
        assertEquals(
                "3olGG2RwGViYTJXRv7AGWg==",
                putRequestCaptor.getValue().getContentMD5()); // 'a' 2097152 times
    }

    @Test(expected = BmcException.class)
    public void upload_singleUpload_enforceMd5_streamTooLargeToBuffer() throws Exception {
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder().allowMultipartUploads(false).enforceMd5(true).build();
        UploadManager uploadManager = new UploadManager(objectStorage, uploadConfiguration);

        UploadRequest request =
                UploadRequest.builder(new ByteArrayInputStream(new byte[0]), Long.MAX_VALUE)
                        .build(PutObjectRequest.builder().build());
        uploadManager.upload(request);
    }

    @Test
    public void upload_multipartUpload() {
        // results in 2 parts
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .minimumLengthForMultipartUpload(1)
                        .minimumLengthPerUploadPart(1)
                        .build();
        UploadManager uploadManager =
                new UploadManager(objectStorage, uploadConfiguration) {
                    @Override
                    protected MultipartObjectAssembler createAssembler(
                            PutObjectRequest request,
                            UploadRequest uploadRequest,
                            ExecutorService executorService) {
                        return assembler;
                    }
                };

        UploadRequest request = createUploadRequest();
        when(assembler.commit())
                .thenReturn(
                        CommitMultipartUploadResponse.builder()
                                .eTag("finalEtag")
                                .opcRequestId(REQ_ID)
                                .opcClientRequestId(CLIENT_REQ_ID)
                                .opcMultipartMd5("multipartMd5")
                                .build());

        UploadResponse uploadResponse = uploadManager.upload(request);
        assertNotNull(uploadResponse);
        assertNull(uploadResponse.getContentMd5());
        assertEquals("multipartMd5", uploadResponse.getMultipartMd5());
        assertEquals("finalEtag", uploadResponse.getETag());
        assertEquals(CLIENT_REQ_ID, uploadResponse.getOpcClientRequestId());
        assertEquals(REQ_ID, uploadResponse.getOpcRequestId());

        verify(assembler).newRequest(CONTENT_TYPE, CONTENT_LANG, CONTENT_ENCODING, METADATA);
        verify(assembler, times(2))
                .addPart(any(InputStream.class), eq(1048576L), eq((String) null));
    }

    @Test
    public void upload_multipartUpload_enforceMd5() {
        // results in 2 parts
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .minimumLengthForMultipartUpload(1)
                        .minimumLengthPerUploadPart(1)
                        .enforceMd5(true)
                        .build();
        UploadManager uploadManager =
                new UploadManager(objectStorage, uploadConfiguration) {
                    @Override
                    protected MultipartObjectAssembler createAssembler(
                            PutObjectRequest request,
                            UploadRequest uploadRequest,
                            ExecutorService executorService) {
                        return assembler;
                    }
                };

        UploadRequest request = createUploadRequest();
        when(assembler.commit())
                .thenReturn(
                        CommitMultipartUploadResponse.builder()
                                .eTag("finalEtag")
                                .opcRequestId(REQ_ID)
                                .opcClientRequestId(CLIENT_REQ_ID)
                                .build());

        UploadResponse uploadResponse = uploadManager.upload(request);
        assertNotNull(uploadResponse);

        verify(assembler).newRequest(CONTENT_TYPE, CONTENT_LANG, CONTENT_ENCODING, METADATA);
        verify(assembler, times(2))
                .addPart(
                        any(InputStream.class),
                        eq(1048576L),
                        eq("cgKCaneRBz/ieH8MlGAyeA==")); // 'a' repeated 1048576 times
    }

    @Test
    public void upload_multipartUpload_duplicatableStream_canNotParallelize() {
        // results in 2 parts
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .minimumLengthForMultipartUpload(1)
                        .minimumLengthPerUploadPart(1)
                        .allowParallelUploads(false)
                        .build();
        UploadManager uploadManager =
                new UploadManager(objectStorage, uploadConfiguration) {
                    @Override
                    protected MultipartObjectAssembler createAssembler(
                            PutObjectRequest request,
                            UploadRequest uploadRequest,
                            ExecutorService executorService) {
                        return assembler;
                    }
                };

        UploadRequest request = createUploadRequest();
        when(assembler.commit())
                .thenReturn(
                        CommitMultipartUploadResponse.builder()
                                .eTag("finalEtag")
                                .opcRequestId(REQ_ID)
                                .opcClientRequestId(CLIENT_REQ_ID)
                                .build());

        UploadResponse uploadResponse = uploadManager.upload(request);
        assertNotNull(uploadResponse);

        verify(assembler).newRequest(CONTENT_TYPE, CONTENT_LANG, CONTENT_ENCODING, METADATA);
        verify(assembler, times(2))
                .addPart(any(InputStream.class), eq(1048576L), eq((String) null));
    }

    @Test(expected = BmcException.class)
    public void upload_multipartUpload_exception() {
        // results in 2 parts
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .minimumLengthForMultipartUpload(1)
                        .minimumLengthPerUploadPart(1)
                        .allowParallelUploads(false)
                        .build();
        UploadManager uploadManager =
                new UploadManager(objectStorage, uploadConfiguration) {
                    @Override
                    protected MultipartObjectAssembler createAssembler(
                            PutObjectRequest request,
                            UploadRequest uploadRequest,
                            ExecutorService executorService) {
                        return assembler;
                    }
                };

        UploadRequest request = createUploadRequest();
        when(assembler.newRequest(CONTENT_TYPE, CONTENT_LANG, CONTENT_ENCODING, METADATA))
                .thenReturn(new MultipartManifestImpl("uploadId"));
        when(assembler.commit()).thenThrow(new BmcException(false, "test", null, null));

        try {
            uploadManager.upload(request);
        } catch (Exception e) {
            verify(assembler).abort();
            throw e;
        }
    }

    @Test(expected = BmcException.class)
    public void upload_multipartUpload_exception_noAbort() {
        // results in 2 parts
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .minimumLengthForMultipartUpload(1)
                        .minimumLengthPerUploadPart(1)
                        .allowParallelUploads(false)
                        .disableAutoAbort(true)
                        .build();
        UploadManager uploadManager =
                new UploadManager(objectStorage, uploadConfiguration) {
                    @Override
                    protected MultipartObjectAssembler createAssembler(
                            PutObjectRequest request,
                            UploadRequest uploadRequest,
                            ExecutorService executorService) {
                        return assembler;
                    }
                };

        UploadRequest request = createUploadRequest();
        when(assembler.newRequest(CONTENT_TYPE, CONTENT_LANG, CONTENT_ENCODING, METADATA))
                .thenReturn(new MultipartManifestImpl("uploadId"));
        when(assembler.commit()).thenThrow(new BmcException(false, "test", null, null));

        try {
            uploadManager.upload(request);
        } catch (Exception e) {
            verify(assembler, times(0)).abort();
            throw e;
        }
    }

    @Test
    public void singleUpload_progressReporter() throws IOException {
        final UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder().allowMultipartUploads(false).build();
        final UploadManager uploadManager = new UploadManager(objectStorage, uploadConfiguration);

        final AtomicInteger expectedProgressNotificationCount = new AtomicInteger();
        when(objectStorage.putObject(any(PutObjectRequest.class)))
                .then(
                        new Answer<PutObjectResponse>() {
                            @Override
                            public PutObjectResponse answer(InvocationOnMock invocationOnMock)
                                    throws Throwable {
                                final PutObjectRequest putObjectRequest =
                                        invocationOnMock.getArgumentAt(0, null);
                                final InputStream inputStream = putObjectRequest.getPutObjectBody();
                                byte[] buffer = new byte[READ_BLOCK_SIZE];
                                while (inputStream.read(buffer) != -1) {
                                    expectedProgressNotificationCount.getAndIncrement();
                                }
                                return PutObjectResponse.builder().build();
                            }
                        });

        final ProgressReporter progressReporter = mock(ProgressReporter.class);
        final UploadResponse uploadResponse =
                uploadManager.upload(createUploadRequest(progressReporter));
        assertNotNull(uploadResponse);
        verify(progressReporter, times(expectedProgressNotificationCount.get()))
                .onProgress(and(gt(0L), leq(CONTENT_LENGTH)), eq(CONTENT_LENGTH));
    }

    @Test
    public void multipartUpload_progressReporter() {
        final UploadManager uploadManager =
                new UploadManager(objectStorage, getMultipartUploadConfiguration()) {
                    @Override
                    protected MultipartObjectAssembler createAssembler(
                            PutObjectRequest request,
                            UploadRequest uploadRequest,
                            ExecutorService executorService) {
                        return assembler;
                    }
                };

        final AtomicInteger onProgressCallbackCount = new AtomicInteger();
        when(assembler.addPart(any(InputStream.class), anyLong(), anyString()))
                .thenAnswer(
                        new Answer<Integer>() {
                            @Override
                            public Integer answer(InvocationOnMock invocationOnMock)
                                    throws Throwable {
                                final InputStream inputStream = invocationOnMock.getArgumentAt(0, null);
                                final byte[] buffer = new byte[READ_BLOCK_SIZE];
                                while (inputStream.read(buffer) != -1) {
                                    onProgressCallbackCount.incrementAndGet();
                                }
                                return ThreadLocalRandom.current().nextInt();
                            }
                        });
        when(assembler.commit()).thenReturn(CommitMultipartUploadResponse.builder().build());

        final ProgressReporter progressReporter = mock(ProgressReporter.class);
        final UploadResponse uploadResponse =
                uploadManager.upload(createUploadRequest(progressReporter));
        assertNotNull(uploadResponse);

        verify(progressReporter, times(onProgressCallbackCount.get()))
                .onProgress(and(gt(0L), leq(CONTENT_LENGTH)), eq(CONTENT_LENGTH));
    }

    @Test
    public void multipartUpload_progressReporter_withRetries() {
        final UploadManager uploadManager =
                new UploadManager(objectStorage, getMultipartUploadConfiguration());

        when(objectStorage.createMultipartUpload(any(CreateMultipartUploadRequest.class)))
                .thenReturn(
                        CreateMultipartUploadResponse.builder()
                                .multipartUpload(MultipartUpload.builder().build())
                                .build());
        final AtomicInteger onProgressCallbackCount = new AtomicInteger();
        final ConcurrentMap<Integer, Integer> retryCountMap = new ConcurrentHashMap<>();
        when(objectStorage.uploadPart(any(UploadPartRequest.class)))
                .thenAnswer(
                        new Answer<UploadPartResponse>() {
                            @Override
                            public UploadPartResponse answer(InvocationOnMock invocationOnMock)
                                    throws Throwable {
                                final UploadPartRequest uploadPartRequest =
                                        invocationOnMock.getArgumentAt(0, null);
                                final int uploadPartNum = uploadPartRequest.getUploadPartNum();
                                final InputStream inputStream =
                                        uploadPartRequest.getUploadPartBody();
                                final byte[] buffer = new byte[READ_BLOCK_SIZE];
                                while (inputStream.read(buffer) != -1) {
                                    onProgressCallbackCount.incrementAndGet();

                                    if (!retryCountMap.containsKey(uploadPartNum)) {
                                        retryCountMap.put(uploadPartNum, 0);
                                    }
                                    final int retryCount = retryCountMap.get(uploadPartNum);
                                    final boolean shouldTriggerRetry =
                                            ThreadLocalRandom.current().nextBoolean()
                                                    && retryCount < 2
                                                    && retryCountMap.replace(
                                                            uploadPartNum,
                                                            retryCount,
                                                            retryCount + 1);
                                    if (shouldTriggerRetry) {
                                        throw new BmcException(-1, null, null, null);
                                    }
                                }
                                return UploadPartResponse.builder().build();
                            }
                        });
        when(objectStorage.commitMultipartUpload(any(CommitMultipartUploadRequest.class)))
                .thenReturn(CommitMultipartUploadResponse.builder().build());

        final ProgressReporter progressReporter = mock(ProgressReporter.class);
        final UploadResponse uploadResponse =
                uploadManager.upload(createUploadRequest(progressReporter));
        assertNotNull(uploadResponse);

        verify(progressReporter, times(onProgressCallbackCount.get()))
                .onProgress(and(gt(0L), leq(CONTENT_LENGTH)), eq(CONTENT_LENGTH));
    }

    private static UploadConfiguration getMultipartUploadConfiguration() {
        return UploadConfiguration.builder()
                .minimumLengthForMultipartUpload(0)
                .minimumLengthPerUploadPart(1)
                .build();
    }

    private UploadRequest createUploadRequest(ProgressReporter progressReporter) {
        PutObjectRequest request =
                PutObjectRequest.builder()
                        .opcMeta(METADATA)
                        .opcClientRequestId(CLIENT_REQ_ID)
                        .contentLanguage(CONTENT_LANG)
                        .contentType(CONTENT_TYPE)
                        .contentEncoding(CONTENT_ENCODING)
                        .build();
        return UploadRequest.builder(body, CONTENT_LENGTH)
                .progressReporter(progressReporter)
                .build(request);
    }

    private UploadRequest createUploadRequest() {
        return createUploadRequest(null);
    }
}
