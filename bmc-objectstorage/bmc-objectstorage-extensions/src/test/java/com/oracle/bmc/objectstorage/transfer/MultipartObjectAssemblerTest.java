/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.oracle.bmc.retrier.DefaultRetryCondition;
import com.oracle.bmc.retrier.RetryConfiguration;
import com.oracle.bmc.util.internal.Consumer;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.model.MultipartUpload;
import com.oracle.bmc.objectstorage.model.MultipartUploadPartSummary;
import com.oracle.bmc.objectstorage.requests.AbortMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.CommitMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.CreateMultipartUploadRequest;
import com.oracle.bmc.objectstorage.requests.ListMultipartUploadPartsRequest;
import com.oracle.bmc.objectstorage.requests.ListMultipartUploadsRequest;
import com.oracle.bmc.objectstorage.requests.UploadPartRequest;
import com.oracle.bmc.objectstorage.responses.AbortMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.CommitMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.CreateMultipartUploadResponse;
import com.oracle.bmc.objectstorage.responses.ListMultipartUploadPartsResponse;
import com.oracle.bmc.objectstorage.responses.ListMultipartUploadsResponse;
import com.oracle.bmc.objectstorage.responses.UploadPartResponse;
import com.oracle.bmc.util.StreamUtils;
import org.mockito.runners.MockitoJUnitRunner;

import javax.ws.rs.client.Invocation;

@RunWith(MockitoJUnitRunner.class)
public class MultipartObjectAssemblerTest {
    private static final String NAMESPACE = "namespace";
    private static final String BUCKET = "bucket";
    private static final String OBJECT = "object";
    private static final String CONTENT_TYPE = "json";
    private static final String CONTENT_LANGUAGE = "en";
    private static final String CONTENT_ENCODING = "gzip";
    private static final String CACHE_CONTROL = "no-cache";
    private static final String CONTENT_DISPOSITION = "inline";
    private static final Map<String, String> OPC_META = new HashMap<>();
    private static final boolean ALLOW_OVERWRITE = false;

    private static final RetryConfiguration RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .delayStrategy(new ExponentialBackoffDelayStrategy(120000))
                    .retryCondition(new DefaultRetryCondition())
                    .build();

    private ExecutorService executorService;
    private MultipartObjectAssembler assembler;
    private MultipartObjectAssembler assemblerWithRetryConfiguration;

    @Mock private Consumer<Invocation.Builder> mockInvocationCallback;

    @Mock private ObjectStorage service;

    @Rule public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        executorService = Executors.newSingleThreadExecutor();
        assembler =
                MultipartObjectAssembler.builder()
                        .allowOverwrite(ALLOW_OVERWRITE)
                        .bucketName(BUCKET)
                        .executorService(executorService)
                        .invocationCallback(mockInvocationCallback)
                        .namespaceName(NAMESPACE)
                        .objectName(OBJECT)
                        .service(service)
                        .cacheControl(CACHE_CONTROL)
                        .contentDisposition(CONTENT_DISPOSITION)
                        .build();
        assemblerWithRetryConfiguration =
                MultipartObjectAssembler.builder()
                        .allowOverwrite(ALLOW_OVERWRITE)
                        .bucketName(BUCKET)
                        .executorService(executorService)
                        .invocationCallback(mockInvocationCallback)
                        .namespaceName(NAMESPACE)
                        .objectName(OBJECT)
                        .service(service)
                        .cacheControl(CACHE_CONTROL)
                        .contentDisposition(CONTENT_DISPOSITION)
                        .retryConfiguration(RETRY_CONFIGURATION)
                        .build();
    }

    @After
    public void tearDown() {
        executorService.shutdownNow();
    }

    @Test
    public void newRequest_andVerifyManifestWithRetryConfiguration() {
        String uploadId = "uploadId";

        initializeCreateMultipartUpload(uploadId);

        MultipartManifest manifest =
                assemblerWithRetryConfiguration.newRequest(
                        CONTENT_TYPE, CONTENT_LANGUAGE, CONTENT_ENCODING, OPC_META);
        assertNotNull(manifest);
        assertEquals(uploadId, manifest.getUploadId());

        ArgumentCaptor<CreateMultipartUploadRequest> captor =
                ArgumentCaptor.forClass(CreateMultipartUploadRequest.class);
        verify(service).createMultipartUpload(captor.capture());

        CreateMultipartUploadRequest request = captor.getValue();
        assertEquals(NAMESPACE, request.getNamespaceName());
        assertEquals(BUCKET, request.getBucketName());
        assertEquals(OBJECT, request.getCreateMultipartUploadDetails().getObject());
        assertEquals(CONTENT_TYPE, request.getCreateMultipartUploadDetails().getContentType());
        assertEquals(
                CONTENT_LANGUAGE, request.getCreateMultipartUploadDetails().getContentLanguage());
        assertEquals(
                CONTENT_ENCODING, request.getCreateMultipartUploadDetails().getContentEncoding());
        assertEquals(OPC_META, request.getCreateMultipartUploadDetails().getMetadata());
        assertEquals(mockInvocationCallback, request.getInvocationCallback());
        assertEquals(CACHE_CONTROL, request.getCreateMultipartUploadDetails().getCacheControl());
        assertEquals(
                CONTENT_DISPOSITION,
                request.getCreateMultipartUploadDetails().getContentDisposition());
    }

    @Test
    public void newRequest_andVerifyManifest() {
        String uploadId = "uploadId";

        initializeCreateMultipartUpload(uploadId);

        MultipartManifest manifest =
                assembler.newRequest(CONTENT_TYPE, CONTENT_LANGUAGE, CONTENT_ENCODING, OPC_META);
        assertNotNull(manifest);
        assertEquals(uploadId, manifest.getUploadId());

        ArgumentCaptor<CreateMultipartUploadRequest> captor =
                ArgumentCaptor.forClass(CreateMultipartUploadRequest.class);
        verify(service).createMultipartUpload(captor.capture());

        CreateMultipartUploadRequest request = captor.getValue();
        assertEquals(NAMESPACE, request.getNamespaceName());
        assertEquals(BUCKET, request.getBucketName());
        assertEquals(OBJECT, request.getCreateMultipartUploadDetails().getObject());
        assertEquals(CONTENT_TYPE, request.getCreateMultipartUploadDetails().getContentType());
        assertEquals(
                CONTENT_LANGUAGE, request.getCreateMultipartUploadDetails().getContentLanguage());
        assertEquals(
                CONTENT_ENCODING, request.getCreateMultipartUploadDetails().getContentEncoding());
        assertEquals(OPC_META, request.getCreateMultipartUploadDetails().getMetadata());
        assertEquals(mockInvocationCallback, request.getInvocationCallback());
        assertEquals(CACHE_CONTROL, request.getCreateMultipartUploadDetails().getCacheControl());
        assertEquals(
                CONTENT_DISPOSITION,
                request.getCreateMultipartUploadDetails().getContentDisposition());
    }

    @Test
    public void newRequest_withAlreadyInitializedAssembler_shouldThrowIllegalStateException() {
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Assembler has already been initialized");

        newRequest_andVerifyManifest();
        newRequest_andVerifyManifest();
    }

    @Test
    public void resumeUpload_noMatchingUploadId_shouldThrowIllegalArgumentException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Could not find existing upload with ID doesNotExist");

        ArrayList<MultipartUpload> existingUploads = new ArrayList<>();
        existingUploads.add(MultipartUpload.builder().uploadId("foobar").build());
        ListMultipartUploadsResponse listResponse1 =
                ListMultipartUploadsResponse.builder()
                        .opcNextPage("nextPage")
                        .items(existingUploads)
                        .build();
        ListMultipartUploadsResponse listResponse2 =
                ListMultipartUploadsResponse.builder()
                        .items(new ArrayList<MultipartUpload>())
                        .build();
        when(service.listMultipartUploads(any(ListMultipartUploadsRequest.class)))
                .thenReturn(listResponse1)
                .thenReturn(listResponse2);

        assembler.resumeRequest("doesNotExist");
    }

    @Test
    public void resumeUpload_andVerifyListMultipartUploadPartsResponse() {
        String pageToken = "nextPage";
        String uploadId = "exists";

        ArrayList<MultipartUpload> existingUploads = new ArrayList<>();
        existingUploads.add(MultipartUpload.builder().uploadId(uploadId).build());
        // empty first page, result found on second page
        ListMultipartUploadsResponse listResponse1 =
                ListMultipartUploadsResponse.builder()
                        .opcNextPage(pageToken)
                        .items(new ArrayList<MultipartUpload>())
                        .build();
        ListMultipartUploadsResponse listResponse2 =
                ListMultipartUploadsResponse.builder().items(existingUploads).build();
        when(service.listMultipartUploads(any(ListMultipartUploadsRequest.class)))
                .thenReturn(listResponse1)
                .thenReturn(listResponse2);

        ArrayList<MultipartUploadPartSummary> parts1 = new ArrayList<>();
        parts1.add(MultipartUploadPartSummary.builder().etag("etag1").partNumber(1).build());
        ArrayList<MultipartUploadPartSummary> parts2 = new ArrayList<>();
        parts2.add(MultipartUploadPartSummary.builder().etag("etag3").partNumber(3).build());

        ListMultipartUploadPartsResponse partsResponse1 =
                ListMultipartUploadPartsResponse.builder()
                        .opcNextPage(pageToken)
                        .items(parts1)
                        .build();
        ListMultipartUploadPartsResponse partsResponse2 =
                ListMultipartUploadPartsResponse.builder().items(parts2).build();
        when(service.listMultipartUploadParts(any(ListMultipartUploadPartsRequest.class)))
                .thenReturn(partsResponse1)
                .thenReturn(partsResponse2);

        MultipartManifest manifest = assembler.resumeRequest(uploadId);
        assertNotNull(manifest);
        assertEquals(uploadId, manifest.getUploadId());
        assertEquals(2, manifest.listCompletedParts().size());

        ArgumentCaptor<ListMultipartUploadsRequest> listUploadsCaptor =
                ArgumentCaptor.forClass(ListMultipartUploadsRequest.class);
        verify(service, times(2)).listMultipartUploads(listUploadsCaptor.capture());
        ListMultipartUploadsRequest listUploadsRequest1 = listUploadsCaptor.getAllValues().get(0);
        assertEquals(NAMESPACE, listUploadsRequest1.getNamespaceName());
        assertEquals(BUCKET, listUploadsRequest1.getBucketName());
        assertEquals(100, listUploadsRequest1.getLimit().intValue());
        assertEquals(mockInvocationCallback, listUploadsRequest1.getInvocationCallback());
        assertNull(listUploadsRequest1.getPage());
        ListMultipartUploadsRequest listUploadsRequest2 = listUploadsCaptor.getAllValues().get(1);
        assertEquals(NAMESPACE, listUploadsRequest2.getNamespaceName());
        assertEquals(BUCKET, listUploadsRequest2.getBucketName());
        assertEquals(100, listUploadsRequest2.getLimit().intValue());
        assertEquals(pageToken, listUploadsRequest2.getPage());
        assertEquals(mockInvocationCallback, listUploadsRequest2.getInvocationCallback());

        ArgumentCaptor<ListMultipartUploadPartsRequest> listPartsCaptor =
                ArgumentCaptor.forClass(ListMultipartUploadPartsRequest.class);
        verify(service, times(2)).listMultipartUploadParts(listPartsCaptor.capture());
        ListMultipartUploadPartsRequest listPartsRequest1 = listPartsCaptor.getAllValues().get(0);
        assertEquals(NAMESPACE, listPartsRequest1.getNamespaceName());
        assertEquals(BUCKET, listPartsRequest1.getBucketName());
        assertEquals(uploadId, listPartsRequest1.getUploadId());
        assertEquals(100, listPartsRequest1.getLimit().intValue());
        assertEquals(mockInvocationCallback, listPartsRequest1.getInvocationCallback());
        assertNull(listPartsRequest1.getPage());
        ListMultipartUploadPartsRequest listPartsRequest2 = listPartsCaptor.getAllValues().get(1);
        assertEquals(NAMESPACE, listPartsRequest2.getNamespaceName());
        assertEquals(BUCKET, listPartsRequest2.getBucketName());
        assertEquals(uploadId, listPartsRequest2.getUploadId());
        assertEquals(100, listPartsRequest2.getLimit().intValue());
        assertEquals(pageToken, listPartsRequest2.getPage());
        assertEquals(mockInvocationCallback, listPartsRequest2.getInvocationCallback());
    }

    @Test
    public void resumeUpload_alreadyInitialized_shouldThrowIllegalStateException() {
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Assembler has already been initialized");

        resumeUpload_andVerifyListMultipartUploadPartsResponse();
        resumeUpload_andVerifyListMultipartUploadPartsResponse();
    }

    @Test
    public void addParts_allSuccessful_commit() throws Exception {
        String uploadId = "uploadId";
        initializeCreateMultipartUpload(uploadId);
        MultipartManifest manifest =
                assembler.newRequest(CONTENT_TYPE, CONTENT_LANGUAGE, CONTENT_ENCODING, OPC_META);

        byte[] bytes = "abcd".getBytes();

        File file = File.createTempFile("unitTest", ".txt");
        file.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(bytes);
        }

        String etag1 = "etag1";
        String etag2 = "etag2";
        UploadPartResponse uploadPartResponse1 = UploadPartResponse.builder().eTag(etag1).build();
        UploadPartResponse uploadPartResponse2 = UploadPartResponse.builder().eTag(etag2).build();
        when(service.uploadPart(any(UploadPartRequest.class)))
                .thenReturn(uploadPartResponse1)
                .thenReturn(uploadPartResponse2);

        CommitMultipartUploadResponse finalCommitResponse =
                CommitMultipartUploadResponse.builder().build();
        when(service.commitMultipartUpload(any(CommitMultipartUploadRequest.class)))
                .thenReturn(finalCommitResponse);

        String md5_1 = "md5_1";
        String md5_2 = "md5_2";

        assembler.addPart(file, md5_1);
        assembler.addPart(StreamUtils.createByteArrayInputStream(bytes), bytes.length, md5_2);

        CommitMultipartUploadResponse commitResponse = assembler.commit();
        assertSame(finalCommitResponse, commitResponse);

        ArgumentCaptor<CommitMultipartUploadRequest> commitCaptor =
                ArgumentCaptor.forClass(CommitMultipartUploadRequest.class);
        verify(service).commitMultipartUpload(commitCaptor.capture());
        CommitMultipartUploadRequest actualCommitRequest = commitCaptor.getValue();
        assertEquals(NAMESPACE, actualCommitRequest.getNamespaceName());
        assertEquals(BUCKET, actualCommitRequest.getBucketName());
        assertEquals(OBJECT, actualCommitRequest.getObjectName());
        assertEquals(uploadId, actualCommitRequest.getUploadId());
        assertEquals(mockInvocationCallback, actualCommitRequest.getInvocationCallback());

        assertTrue(manifest.isUploadComplete());
        assertTrue(manifest.isUploadSuccessful());
        assertEquals(2, manifest.listCompletedParts().size());
        assertEquals(1, manifest.listCompletedParts().get(0).getPartNum().intValue());
        assertEquals(etag1, manifest.listCompletedParts().get(0).getEtag());
        assertEquals(2, manifest.listCompletedParts().get(1).getPartNum().intValue());
        assertEquals(etag2, manifest.listCompletedParts().get(1).getEtag());

        ArgumentCaptor<UploadPartRequest> uploadCaptor =
                ArgumentCaptor.forClass(UploadPartRequest.class);
        verify(service, times(2)).uploadPart(uploadCaptor.capture());
        verifyUploadPart(uploadCaptor.getAllValues().get(0), uploadId, 1, md5_1);
        verifyUploadPart(uploadCaptor.getAllValues().get(1), uploadId, 2, md5_2);

        file.delete();
    }

    @Test
    public void addParts_allSuccessful_withRetryConfiguration_commit() throws Exception {
        String uploadId = "uploadId";
        initializeCreateMultipartUpload(uploadId);
        MultipartManifest manifest =
                assemblerWithRetryConfiguration.newRequest(
                        CONTENT_TYPE, CONTENT_LANGUAGE, CONTENT_ENCODING, OPC_META);

        byte[] bytes = "abcd".getBytes();

        File file = File.createTempFile("unitTest", ".txt");
        file.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(bytes);
        }

        String etag1 = "etag1";
        String etag2 = "etag2";
        UploadPartResponse uploadPartResponse1 = UploadPartResponse.builder().eTag(etag1).build();
        UploadPartResponse uploadPartResponse2 = UploadPartResponse.builder().eTag(etag2).build();
        when(service.uploadPart(any(UploadPartRequest.class)))
                .thenReturn(uploadPartResponse1)
                .thenReturn(uploadPartResponse2);

        CommitMultipartUploadResponse finalCommitResponse =
                CommitMultipartUploadResponse.builder().build();
        when(service.commitMultipartUpload(any(CommitMultipartUploadRequest.class)))
                .thenReturn(finalCommitResponse);

        String md5_1 = "md5_1";
        String md5_2 = "md5_2";

        assemblerWithRetryConfiguration.addPart(file, md5_1);
        assemblerWithRetryConfiguration.addPart(
                StreamUtils.createByteArrayInputStream(bytes), bytes.length, md5_2);

        CommitMultipartUploadResponse commitResponse = assemblerWithRetryConfiguration.commit();
        assertSame(finalCommitResponse, commitResponse);

        ArgumentCaptor<CommitMultipartUploadRequest> commitCaptor =
                ArgumentCaptor.forClass(CommitMultipartUploadRequest.class);
        verify(service).commitMultipartUpload(commitCaptor.capture());
        CommitMultipartUploadRequest actualCommitRequest = commitCaptor.getValue();
        assertEquals(NAMESPACE, actualCommitRequest.getNamespaceName());
        assertEquals(BUCKET, actualCommitRequest.getBucketName());
        assertEquals(OBJECT, actualCommitRequest.getObjectName());
        assertEquals(uploadId, actualCommitRequest.getUploadId());
        assertEquals(mockInvocationCallback, actualCommitRequest.getInvocationCallback());

        assertTrue(manifest.isUploadComplete());
        assertTrue(manifest.isUploadSuccessful());
        assertEquals(2, manifest.listCompletedParts().size());
        assertEquals(1, manifest.listCompletedParts().get(0).getPartNum().intValue());
        assertEquals(etag1, manifest.listCompletedParts().get(0).getEtag());
        assertEquals(2, manifest.listCompletedParts().get(1).getPartNum().intValue());
        assertEquals(etag2, manifest.listCompletedParts().get(1).getEtag());

        ArgumentCaptor<UploadPartRequest> uploadCaptor =
                ArgumentCaptor.forClass(UploadPartRequest.class);
        verify(service, times(2)).uploadPart(uploadCaptor.capture());
        verifyUploadPart(uploadCaptor.getAllValues().get(0), uploadId, 1, md5_1);
        verifyUploadPart(uploadCaptor.getAllValues().get(1), uploadId, 2, md5_2);

        uploadCaptor
                .getAllValues()
                .forEach(r -> assertSame(RETRY_CONFIGURATION, r.getRetryConfiguration()));

        file.delete();
    }

    @Test
    public void addParts_someFailed_commitFailure() throws Exception {
        String uploadId = "uploadId";
        initializeCreateMultipartUpload(uploadId);
        MultipartManifest manifest =
                assembler.newRequest(CONTENT_TYPE, CONTENT_LANGUAGE, CONTENT_ENCODING, OPC_META);

        byte[] bytes = "abcd".getBytes();

        File file = File.createTempFile("unitTest", ".txt");
        file.deleteOnExit();
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(bytes);
        }

        String etag1 = "etag1";
        String failureCauseMsg = "failureCauseMsg1";

        UploadPartResponse uploadPartResponse1 = UploadPartResponse.builder().eTag(etag1).build();
        when(service.uploadPart(any(UploadPartRequest.class)))
                .thenReturn(uploadPartResponse1)
                .thenThrow(new RuntimeException(failureCauseMsg));

        String md5_1 = "md5_1";
        String md5_2 = "md5_2";

        assembler.addPart(file, md5_1);
        assembler.addPart(StreamUtils.createByteArrayInputStream(bytes), bytes.length, md5_2);

        try {
            assembler.commit();
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
        }

        assertTrue(manifest.isUploadComplete());
        assertFalse(manifest.isUploadSuccessful());
        assertEquals(1, manifest.listCompletedParts().size());
        assertEquals(1, manifest.listCompletedParts().get(0).getPartNum().intValue());
        assertEquals(etag1, manifest.listCompletedParts().get(0).getEtag());
        assertEquals(2, manifest.listFailedParts().get(0).intValue());
        assertEquals(2, manifest.listFailedPartsDetails().get(0).getPartNumber());
        assertEquals(
                manifest.listFailedPartsDetails().get(0).getFailureCause().getMessage(),
                failureCauseMsg);

        ArgumentCaptor<UploadPartRequest> uploadCaptor =
                ArgumentCaptor.forClass(UploadPartRequest.class);
        verify(service, times(2)).uploadPart(uploadCaptor.capture());
        verifyUploadPart(uploadCaptor.getAllValues().get(0), uploadId, 1, md5_1);
        verifyUploadPart(uploadCaptor.getAllValues().get(1), uploadId, 2, md5_2);

        file.delete();
    }

    @Test
    public void commit_addPart_afterAbort() throws Exception {
        String uploadId = "uploadId";
        initializeCreateMultipartUpload(uploadId);
        assembler.newRequest(CONTENT_TYPE, CONTENT_LANGUAGE, CONTENT_ENCODING, OPC_META);
        assembler.abort();

        try {
            assembler.addPart(StreamUtils.createByteArrayInputStream("a".getBytes()), 1, null);
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
        }

        try {
            assembler.commit();
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
        }
    }

    private void verifyUploadPart(
            UploadPartRequest request, String uploadId, int partNum, String md5) {
        assertEquals(NAMESPACE, request.getNamespaceName());
        assertEquals(BUCKET, request.getBucketName());
        assertEquals(uploadId, request.getUploadId());
        assertEquals(partNum, request.getUploadPartNum().intValue());
        assertEquals(md5, request.getContentMD5());
        assertEquals(
                null, request.getIfNoneMatch()); // we allow overwriting parts, to help with retries
        assertEquals(mockInvocationCallback, request.getInvocationCallback());
        assertNotNull(request.getUploadPartBody());
    }

    @Test
    public void abort() {
        String uploadId = "uploadId";
        initializeCreateMultipartUpload(uploadId);
        MultipartManifest manifest =
                assembler.newRequest(CONTENT_TYPE, CONTENT_LANGUAGE, CONTENT_ENCODING, OPC_META);

        when(service.abortMultipartUpload(any(AbortMultipartUploadRequest.class)))
                .thenReturn(AbortMultipartUploadResponse.builder().build());

        assertFalse(manifest.isUploadAborted());
        assertNotNull(assembler.abort());
        assertTrue(manifest.isUploadAborted());

        ArgumentCaptor<AbortMultipartUploadRequest> captor =
                ArgumentCaptor.forClass(AbortMultipartUploadRequest.class);
        verify(service).abortMultipartUpload(captor.capture());

        AbortMultipartUploadRequest request = captor.getValue();
        assertEquals(NAMESPACE, request.getNamespaceName());
        assertEquals(BUCKET, request.getBucketName());
        assertEquals(uploadId, request.getUploadId());
        assertEquals(mockInvocationCallback, request.getInvocationCallback());
    }

    private void initializeCreateMultipartUpload(String uploadId) {
        CreateMultipartUploadResponse response =
                CreateMultipartUploadResponse.builder()
                        .multipartUpload(MultipartUpload.builder().uploadId(uploadId).build())
                        .build();
        when(service.createMultipartUpload(any(CreateMultipartUploadRequest.class)))
                .thenReturn(response);
    }
}
