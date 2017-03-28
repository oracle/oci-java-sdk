/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

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

public class UploadManagerTest {
    private static final String CONTENT = Strings.repeat("a", 2097152); // 2MiB
    private static final long CONTENT_LENGTH = CONTENT.length();
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
    public void upload_singleUpload() {
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
        assertSame(body, putRequestCaptor.getValue().getPutObjectBody());
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
        assertSame(body, putRequestCaptor.getValue().getPutObjectBody());
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
        when(assembler.commit()).thenThrow(new BmcException(false, "test", null));

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
        when(assembler.commit()).thenThrow(new BmcException(false, "test", null));

        try {
            uploadManager.upload(request);
        } catch (Exception e) {
            verify(assembler, times(0)).abort();
            throw e;
        }
    }

    private UploadRequest createUploadRequest() {
        PutObjectRequest request =
                PutObjectRequest.builder()
                        .opcMeta(METADATA)
                        .opcClientRequestId(CLIENT_REQ_ID)
                        .contentLanguage(CONTENT_LANG)
                        .contentType(CONTENT_TYPE)
                        .contentEncoding(CONTENT_ENCODING)
                        .build();
        return UploadRequest.builder(body, CONTENT_LENGTH).build(request);
    }
}
