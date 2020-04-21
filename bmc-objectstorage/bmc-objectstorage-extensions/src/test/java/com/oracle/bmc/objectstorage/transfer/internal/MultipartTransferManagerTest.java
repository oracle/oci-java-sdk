/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import java.util.List;
import java.util.concurrent.Executors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.model.CommitMultipartUploadPartDetails;
import com.oracle.bmc.objectstorage.requests.UploadPartRequest;
import com.oracle.bmc.objectstorage.responses.UploadPartResponse;

public class MultipartTransferManagerTest {

    private MultipartTransferManager manager;
    @Mock private ObjectStorage service;
    private MultipartManifestImpl manifest;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        manifest = new MultipartManifestImpl("uploadId");
        manager =
                new MultipartTransferManager(
                        Executors.newSingleThreadExecutor(), manifest, service);
    }

    @Test
    public void awaitCompletion() {
        UploadPartRequest request1 = UploadPartRequest.builder().uploadPartNum(1).build();
        UploadPartRequest request2 = UploadPartRequest.builder().uploadPartNum(2).build();
        final UploadPartResponse response1 = UploadPartResponse.builder().build();

        when(service.uploadPart(request1))
                .thenAnswer(
                        new Answer<UploadPartResponse>() {
                            @Override
                            public UploadPartResponse answer(InvocationOnMock arg0)
                                    throws Throwable {
                                // long enough to test 'inprogress'
                                Thread.sleep(10000L);
                                return response1;
                            }
                        });
        when(service.uploadPart(request2)).thenThrow(new RuntimeException());

        manager.startTransfer(request1);
        manager.startTransfer(request2);

        List<Integer> inProgressParts = manifest.listInProgressParts();
        // serial executor, first one sleeps 10s, so both tasks will be in
        // progress
        assertEquals(2, inProgressParts.size());
        assertEquals(1, inProgressParts.get(0).intValue());
        assertEquals(2, inProgressParts.get(1).intValue());

        manager.awaitCompletion();

        List<CommitMultipartUploadPartDetails> successfulParts = manifest.listCompletedParts();
        assertEquals(1, successfulParts.size());
        assertEquals(1, successfulParts.get(0).getPartNum().intValue());

        List<Integer> failedParts = manifest.listFailedParts();
        assertEquals(1, failedParts.size());
        assertEquals(2, failedParts.get(0).intValue());

        assertTrue(manifest.listInProgressParts().isEmpty());
    }

    @Test
    public void abortAll() throws Exception {
        UploadPartRequest request1 = UploadPartRequest.builder().uploadPartNum(1).build();
        final UploadPartResponse response1 = UploadPartResponse.builder().build();

        when(service.uploadPart(request1))
                .thenAnswer(
                        new Answer<UploadPartResponse>() {
                            @Override
                            public UploadPartResponse answer(InvocationOnMock arg0)
                                    throws Throwable {
                                // long enough to abort without starting the task
                                Thread.sleep(10000L);
                                return response1;
                            }
                        });

        manager.startTransfer(request1);
        manager.abortAll();

        // aborted before it started, should surface as an in-progress part
        List<Integer> inProgressParts = manifest.listInProgressParts();
        assertEquals(1, inProgressParts.size());
        assertEquals(1, inProgressParts.get(0).intValue());
    }
}
