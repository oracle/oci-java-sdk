/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

import java.io.InputStream;

import com.google.common.base.Function;
import com.oracle.bmc.io.DuplicatableInputStream;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.requests.UploadPartRequest;
import com.oracle.bmc.objectstorage.responses.PutObjectResponse;
import com.oracle.bmc.objectstorage.responses.UploadPartResponse;

import lombok.RequiredArgsConstructor;

// Really basic retry, replace with SDK retry strategy when that's available
@RequiredArgsConstructor
public class SimpleRetry {
    private static final int MAX_RETRIES = 3;
    private final ObjectStorage service;

    public Function<PutObjectRequest, PutObjectResponse> createPutObjectFunction() {
        return new Function<PutObjectRequest, PutObjectResponse>() {
            @Override
            public PutObjectResponse apply(PutObjectRequest request) {
                InputStream stream = request.getPutObjectBody();

                BmcException ex = null;
                for (int i = 1; i <= MAX_RETRIES; i++) {
                    try {
                        return service.putObject(request);
                    } catch (BmcException e) {
                        ex = e;
                        if (canRetry(stream, e, i)) {
                            request =
                                    PutObjectRequest.builder()
                                            .copy(request)
                                            .putObjectBody(
                                                    ((DuplicatableInputStream) stream).duplicate())
                                            .build();
                        } else {
                            break;
                        }
                    }
                }
                throw ex;
            }
        };
    }

    public Function<UploadPartRequest, UploadPartResponse> createUploadPartFunction() {
        return new Function<UploadPartRequest, UploadPartResponse>() {
            @Override
            public UploadPartResponse apply(UploadPartRequest request) {
                InputStream stream = request.getUploadPartBody();

                BmcException ex = null;
                for (int i = 1; i <= MAX_RETRIES; i++) {
                    try {
                        return service.uploadPart(request);
                    } catch (BmcException e) {
                        ex = e;
                        if (canRetry(stream, e, i)) {
                            request =
                                    UploadPartRequest.builder()
                                            .copy(request)
                                            .uploadPartBody(
                                                    ((DuplicatableInputStream) stream).duplicate())
                                            .build();
                        } else {
                            break;
                        }
                    }
                }
                throw ex;
            }
        };
    }

    private static boolean canRetry(InputStream stream, BmcException e, int currentAttempt) {
        boolean isDuplicatable = stream instanceof DuplicatableInputStream;
        boolean hasMoreAttempts = currentAttempt < MAX_RETRIES;
        // retry if:
        // 1) client timeout
        // 2) client unknown exception (-1)
        // 3) server error (>= 500)
        // 4) edge case when too many concurrent uploads start/complete at the same time and potentially cause a 409
        boolean isExceptionRetryable =
                e.isTimeout()
                        || e.getStatusCode() == -1
                        || e.getStatusCode() >= 500
                        || (e.getStatusCode() == 409
                                && "ConcurrentObjectUpdate".equals(e.getServiceCode()));
        return isDuplicatable && hasMoreAttempts && isExceptionRetryable;
    }
}
