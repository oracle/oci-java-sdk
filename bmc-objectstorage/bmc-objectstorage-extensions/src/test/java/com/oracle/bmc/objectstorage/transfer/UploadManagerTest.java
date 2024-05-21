/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.internal.EndpointBuilder;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.Service;
import com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.http.internal.WrappedWebTarget;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.http.signing.RequestSignerFactory;
import com.oracle.bmc.http.signing.SigningStrategy;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.internal.http.CommitMultipartUploadConverter;
import com.oracle.bmc.objectstorage.internal.http.CreateMultipartUploadConverter;
import com.oracle.bmc.objectstorage.internal.http.UploadPartConverter;
import com.oracle.bmc.objectstorage.model.MultipartUpload;
import com.oracle.bmc.objectstorage.model.StorageTier;
import com.oracle.bmc.objectstorage.requests.AbortMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.CommitMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.CreateMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.requests.UploadPartRequest;
import com.oracle.bmc.objectstorage.responses.CommitMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.CreateMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.PutObjectResponse;
import com.oracle.bmc.objectstorage.responses.UploadPartResponse;
import com.oracle.bmc.objectstorage.transfer.UploadManager.UploadRequest;
import com.oracle.bmc.objectstorage.transfer.UploadManager.UploadResponse;
import com.oracle.bmc.objectstorage.transfer.internal.MultipartManifestImpl;
import com.oracle.bmc.objectstorage.transfer.internal.MultipartUtils;
import com.oracle.bmc.retrier.DefaultRetryCondition;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.StreamUtils;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
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

@RunWith(PowerMockRunner.class)
@PrepareForTest({
    RestClientFactory.class,
    CreateMultipartUploadConverter.class,
    UploadPartConverter.class,
    CommitMultipartUploadConverter.class,
    EndpointBuilder.class
})
public class UploadManagerTest {
    private static final String CONTENT =
            StringUtils.repeat("a", (int) (20 * MultipartUtils.MiB)); // 20 MiB
    private static final long CONTENT_LENGTH = CONTENT.length();
    private static final int READ_BLOCK_SIZE = 8192; // 8KB
    private static final String CLIENT_REQ_ID = "clientReqId";
    private static final String REQ_ID = "reqId";
    private static final String CONTENT_TYPE = "application/text";
    private static final String CONTENT_ENCODING = "gzip";
    private static final String CONTENT_LANG = "en";
    private static final Map<String, String> METADATA = new HashMap<>();
    private static final String NAMESPACE_NAME = "namespaceName";
    private static final String BUCKET_NAME = "bucketName";
    private static final String UPLOAD_ID = "12345";
    private static final String OBJECT_NAME = "objectName";

    private InputStream body;

    @Mock private ObjectStorage objectStorage;

    @Mock private MultipartObjectAssembler assembler;

    @Before
    public void setUp() {
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
        assertSame(
                UploadManager.RETRY_CONFIGURATION,
                putRequestCaptor.getValue().getRetryConfiguration());
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
                "U2yw5mJhFHg/U4cBMrrFyw==",
                putRequestCaptor.getValue().getContentMD5()); // 'a' times content-length
    }

    @Test
    public void upload_singleUpload_uploadRequestRetryConfiguration() throws Exception {
        RetryConfiguration retryConfiguration =
                RetryConfiguration.builder()
                        .delayStrategy(new ExponentialBackoffDelayStrategy(120000))
                        .retryCondition(new DefaultRetryCondition())
                        .build();

        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder().allowMultipartUploads(false).build();
        UploadManager uploadManager = new UploadManager(objectStorage, uploadConfiguration);

        UploadRequest request = createUploadRequest(retryConfiguration);

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
        assertSame(retryConfiguration, putRequestCaptor.getValue().getRetryConfiguration());
        assertEquals(CONTENT, new String(buffer));
        assertEquals(CONTENT_LENGTH, putRequestCaptor.getValue().getContentLength().longValue());
        assertEquals(CLIENT_REQ_ID, putRequestCaptor.getValue().getOpcClientRequestId());
        assertSame(METADATA, putRequestCaptor.getValue().getOpcMeta());
    }

    @Test(expected = BmcException.class)
    public void upload_singleUpload_enforceMd5_streamTooLargeToBuffer() {
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
                        .minimumLengthForMultipartUpload(10)
                        .lengthPerUploadPart(10)
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
        validateUploadResponseForMultipart(uploadResponse);

        verify(assembler).newRequest(CONTENT_TYPE, CONTENT_LANG, CONTENT_ENCODING, METADATA);
        verify(assembler, times(2))
                .addPart(any(InputStream.class), eq(CONTENT_LENGTH / 2), eq(null));
    }

    @Test
    public void upload_multipartUpload_enforceMd5() {
        // results in 2 parts
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .minimumLengthForMultipartUpload(10)
                        .lengthPerUploadPart(10)
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
                        eq(CONTENT_LENGTH / 2), // 10 MiB
                        eq("5W4QR5ShjfX0H20th7TMZw==")); // 'a' times content-length
    }

    @Test
    public void upload_multipartUpload_duplicatableStream_canNotParallelize() {
        // results in 2 parts
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .minimumLengthForMultipartUpload(10)
                        .lengthPerUploadPart(10)
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
                .addPart(any(InputStream.class), eq(CONTENT_LENGTH / 2), eq(null));
    }

    @Test(expected = BmcException.class)
    public void upload_multipartUpload_exception() {
        // results in 2 parts
        UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .minimumLengthForMultipartUpload(10)
                        .lengthPerUploadPart(10)
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
                        .minimumLengthForMultipartUpload(10)
                        .lengthPerUploadPart(10)
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
    public void singleUpload_progressReporter() {
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
                                final InputStream inputStream =
                                        invocationOnMock.getArgumentAt(0, null);
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
    public void multipartUpload_progressReporter_withRetries() throws Exception {
        // we have to build a full client to test retries
        // to make sure we don't accidentally use the interface mock, set it to null
        objectStorage = null;

        AbstractAuthenticationDetailsProvider authenticationDetailsProvider =
                mock(BasicAuthenticationDetailsProvider.class);
        ClientConfiguration configuration = ClientConfiguration.builder().build();
        ClientConfigurator clientConfigurator = null;
        RequestSignerFactory defaultRequestSignerFactory = mock(RequestSignerFactory.class);
        RequestSigner mockRequestSigner = mock(RequestSigner.class);
        when(
                        defaultRequestSignerFactory.createRequestSigner(
                                any(Service.class), eq(authenticationDetailsProvider)))
                .thenReturn(mockRequestSigner);

        Map<
                        com.oracle.bmc.http.signing.SigningStrategy,
                        com.oracle.bmc.http.signing.RequestSignerFactory>
                signingStrategyRequestSignerFactories = new HashMap<>();

        for (SigningStrategy s : SigningStrategy.values()) {
            signingStrategyRequestSignerFactories.put(s, defaultRequestSignerFactory);
        }

        List<ClientConfigurator> additionalClientConfigurators = Collections.emptyList();
        String endpoint = null;
        java.util.concurrent.ExecutorService executorService = null;

        RestClient mockRestClient = PowerMockito.mock(RestClient.class);
        PowerMockito.whenNew(RestClient.class).withAnyArguments().thenReturn(mockRestClient);

        WrappedWebTarget mockBaseTarget = mock(WrappedWebTarget.class);
        when(mockRestClient.getBaseTarget()).thenReturn(mockBaseTarget);
        when(mockBaseTarget.path(anyString())).thenReturn(mockBaseTarget);
        when(mockBaseTarget.queryParam(anyString(), any())).thenReturn(mockBaseTarget);

        WrappedInvocationBuilder mockInvocationBuilder = mock(WrappedInvocationBuilder.class);
        when(mockBaseTarget.request()).thenReturn(mockInvocationBuilder);

        URI testURI = new URI("https://objectstorage.test-region.test.domain/");
        when(mockInvocationBuilder.getRequestUri()).thenReturn(testURI);

        final AtomicInteger onProgressCallbackCount = new AtomicInteger();

        when(mockRestClient.put(any(WrappedInvocationBuilder.class), any(InputStream.class), any()))
                .then(
                        invocationOnMock -> {
                            Object[] arguments = invocationOnMock.getArguments();
                            if (arguments[1] instanceof InputStream) {
                                // read as much as we can
                                InputStream inputStream = (InputStream) arguments[1];
                                final byte[] buffer = new byte[READ_BLOCK_SIZE];
                                while (inputStream.read(buffer) != -1) {
                                    onProgressCallbackCount.incrementAndGet();
                                }
                            }
                            return null;
                        });

        // CreateMultipartUpload
        java.util.function.Function<javax.ws.rs.core.Response, CreateMultipartUploadResponse>
                mockCreateResponseConverter = mock(java.util.function.Function.class);

        PowerMockito.mockStatic(CreateMultipartUploadConverter.class);
        PowerMockito.when(
                        CreateMultipartUploadConverter.fromResponse(any(java.util.Optional.class)))
                .thenReturn(mockCreateResponseConverter);
        PowerMockito.when(
                        CreateMultipartUploadConverter.fromRequest(
                                any(RestClient.class), any(CreateMultipartUploadRequest.class)))
                .thenCallRealMethod();
        PowerMockito.when(
                        CreateMultipartUploadConverter.interceptRequest(
                                any(CreateMultipartUploadRequest.class)))
                .thenCallRealMethod();

        CreateMultipartUploadResponse createMultipartUploadResponse =
                CreateMultipartUploadResponse.builder()
                        .multipartUpload(MultipartUpload.builder().uploadId(UPLOAD_ID).build())
                        .build();
        when(mockCreateResponseConverter.apply(any(javax.ws.rs.core.Response.class)))
                .thenReturn(createMultipartUploadResponse);

        // uploadPart
        java.util.function.Function<javax.ws.rs.core.Response, UploadPartResponse>
                mockUploadResponseConverter = mock(java.util.function.Function.class);

        PowerMockito.mockStatic(UploadPartConverter.class);
        PowerMockito.when(UploadPartConverter.fromResponse(any(java.util.Optional.class)))
                .thenReturn(mockUploadResponseConverter);
        PowerMockito.when(
                        UploadPartConverter.fromRequest(
                                any(RestClient.class), any(UploadPartRequest.class)))
                .thenCallRealMethod();
        PowerMockito.when(UploadPartConverter.interceptRequest(any(UploadPartRequest.class)))
                .thenCallRealMethod();

        UploadPartResponse uploadPartResponse = UploadPartResponse.builder().build();
        when(mockUploadResponseConverter.apply(any(javax.ws.rs.core.Response.class)))
                .thenThrow(new BmcException(500, "serviceCode", "message", "opcRequestId"))
                .thenThrow(new BmcException(500, "serviceCode", "message", "opcRequestId"))
                .thenReturn(uploadPartResponse);

        // commitMultipartUpload

        // uploadPart
        java.util.function.Function<javax.ws.rs.core.Response, CommitMultipartUploadResponse>
                mockCommitResponseConverter = mock(java.util.function.Function.class);

        PowerMockito.mockStatic(CommitMultipartUploadConverter.class);
        PowerMockito.when(
                        CommitMultipartUploadConverter.fromResponse(any(java.util.Optional.class)))
                .thenReturn(mockCommitResponseConverter);
        PowerMockito.when(
                        CommitMultipartUploadConverter.fromRequest(
                                any(RestClient.class), any(CommitMultipartUploadRequest.class)))
                .thenCallRealMethod();
        PowerMockito.when(
                        CommitMultipartUploadConverter.interceptRequest(
                                any(CommitMultipartUploadRequest.class)))
                .thenCallRealMethod();

        CommitMultipartUploadResponse commitMultipartUploadResponse =
                CommitMultipartUploadResponse.builder().build();
        when(mockCommitResponseConverter.apply(any(javax.ws.rs.core.Response.class)))
                .thenReturn(commitMultipartUploadResponse);

        PowerMockito.mockStatic(EndpointBuilder.class);
        PowerMockito.when(
                        EndpointBuilder.populateServiceParametersInEndpoint(
                                any(RestClient.class), any(Map.class)))
                .thenReturn(mockBaseTarget);

        ObjectStorageClient objectStorageClient =
                new ObjectStorageClient(
                        authenticationDetailsProvider,
                        configuration,
                        clientConfigurator,
                        defaultRequestSignerFactory,
                        signingStrategyRequestSignerFactories,
                        additionalClientConfigurators,
                        endpoint,
                        executorService);

        final UploadManager uploadManager =
                new UploadManager(objectStorageClient, getMultipartUploadConfiguration());

        final ProgressReporter progressReporter = mock(ProgressReporter.class);
        final UploadResponse uploadResponse =
                uploadManager.upload(createUploadRequest(progressReporter));
        assertNotNull(uploadResponse);

        // 2 parts, each fails once, resulting in 4 calls
        verify(mockUploadResponseConverter, times(4)).apply(any());

        verify(progressReporter, times(onProgressCallbackCount.get()))
                .onProgress(and(gt(0L), leq(CONTENT_LENGTH)), eq(CONTENT_LENGTH));
    }

    @Test
    public void upload_multipartUpload_with_minConfiguration() {
        // results in 20 parts
        final UploadConfiguration uploadConfiguration =
                UploadConfiguration.builder()
                        .minimumLengthForMultipartUpload(0)
                        .lengthPerUploadPart(1)
                        .build();

        final UploadManager uploadManager =
                new UploadManager(objectStorage, uploadConfiguration) {
                    @Override
                    protected MultipartObjectAssembler createAssembler(
                            PutObjectRequest request,
                            UploadRequest uploadRequest,
                            ExecutorService executorService) {
                        return assembler;
                    }
                };

        final UploadRequest request = createUploadRequest();
        when(assembler.commit())
                .thenReturn(
                        CommitMultipartUploadResponse.builder()
                                .eTag("finalEtag")
                                .opcRequestId(REQ_ID)
                                .opcClientRequestId(CLIENT_REQ_ID)
                                .opcMultipartMd5("multipartMd5")
                                .build());

        final UploadResponse uploadResponse = uploadManager.upload(request);
        validateUploadResponseForMultipart(uploadResponse);

        verify(assembler).newRequest(CONTENT_TYPE, CONTENT_LANG, CONTENT_ENCODING, METADATA);
        verify(assembler, times(20))
                .addPart(any(InputStream.class), eq(CONTENT_LENGTH / 20), eq(null));
    }

    @Test
    public void multiplartUpload_shouldAbort_whenNoPartsWereUploaded() {
        final UploadManager uploadManager =
                new UploadManager(objectStorage, getMultipartUploadConfiguration());

        when(objectStorage.createMultipartUpload(any(CreateMultipartUploadRequest.class)))
                .thenReturn(
                        CreateMultipartUploadResponse.builder()
                                .multipartUpload(MultipartUpload.builder().build())
                                .build());
        when(objectStorage.uploadPart(any(UploadPartRequest.class)))
                .thenThrow(new BmcException(-1, null, null, null));

        try {
            uploadManager.upload(createUploadRequest());
            fail("BmcException should have been thrown");
        } catch (BmcException e) {
            assertThat(e.getCause(), Matchers.instanceOf(IllegalStateException.class));
            verify(objectStorage).abortMultipartUpload(any(AbortMultipartUploadRequest.class));
        }
    }

    private static UploadConfiguration getMultipartUploadConfiguration() {
        return UploadConfiguration.builder()
                .minimumLengthForMultipartUpload(10)
                .lengthPerUploadPart(10)
                .build();
    }

    private UploadRequest createUploadRequest(
            ProgressReporter progressReporter, RetryConfiguration retryConfiguration) {
        PutObjectRequest request =
                PutObjectRequest.builder()
                        .opcMeta(METADATA)
                        .opcClientRequestId(CLIENT_REQ_ID)
                        .contentLanguage(CONTENT_LANG)
                        .contentType(CONTENT_TYPE)
                        .contentEncoding(CONTENT_ENCODING)
                        .namespaceName(NAMESPACE_NAME)
                        .bucketName(BUCKET_NAME)
                        .objectName(OBJECT_NAME)
                        .storageTier(StorageTier.InfrequentAccess)
                        .retryConfiguration(retryConfiguration)
                        .build();
        return UploadRequest.builder(body, CONTENT_LENGTH)
                .progressReporter(progressReporter)
                .build(request);
    }

    private UploadRequest createUploadRequest(ProgressReporter progressReporter) {
        return createUploadRequest(progressReporter, null);
    }

    private UploadRequest createUploadRequest() {
        return createUploadRequest(null, null);
    }

    private UploadRequest createUploadRequest(RetryConfiguration retryConfiguration) {
        return createUploadRequest(null, retryConfiguration);
    }

    private static void validateUploadResponseForMultipart(final UploadResponse response) {
        assertNotNull(response);
        assertNull(response.getContentMd5());
        assertEquals("multipartMd5", response.getMultipartMd5());
        assertEquals("finalEtag", response.getETag());
        assertEquals(CLIENT_REQ_ID, response.getOpcClientRequestId());
        assertEquals(REQ_ID, response.getOpcRequestId());
    }
}
