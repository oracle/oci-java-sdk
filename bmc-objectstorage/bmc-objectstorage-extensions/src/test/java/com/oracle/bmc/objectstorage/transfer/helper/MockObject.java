/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.helper;

import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import org.junit.Assert;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public final class MockObject implements Answer<GetObjectResponse> {
    private final String namespaceName;
    private final String bucketName;
    private final String objectName;
    private final Map<String, String> metadata;
    private final int dataLength;
    private final byte[] data;
    private final String etag;
    private final FailureInjector failureInjector;

    public MockObject(
            Map<String, String> metadata,
            int dataLength,
            byte[] data,
            FailureInjector failureInjector) {
        this.namespaceName = "namespace" + randomSuffix();
        this.bucketName = "bucket" + randomSuffix();
        this.objectName = "object" + randomSuffix();
        this.dataLength = dataLength;
        this.data = data;
        this.metadata = metadata;
        this.etag = UUID.randomUUID().toString();
        this.failureInjector = failureInjector;
    }

    public String getNamespaceName() {
        return namespaceName;
    }

    public String getBucketName() {
        return bucketName;
    }

    public String getObjectName() {
        return objectName;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public int getDataLength() {
        return dataLength;
    }

    public byte[] getData() {
        return data;
    }

    public String getEtag() {
        return etag;
    }

    @Override
    public GetObjectResponse answer(InvocationOnMock invocationOnMock) throws Throwable {
        return this.getObject((GetObjectRequest) invocationOnMock.getArguments()[0]);
    }

    GetObjectResponse getObject(GetObjectRequest request) {
        failureInjector.onGetObjectRequest();
        if (!request.getNamespaceName().equals(getNamespaceName())
                || !request.getBucketName().equals(getBucketName())
                || !request.getObjectName().equals(getObjectName())) {
            throw new BmcException(404, "NotFound", "object not found", "fakerequestid");
        }
        if (request.getIfMatch() != null && !getEtag().equals(request.getIfMatch())) {
            throw new BmcException(412, "IfMatch", "if-match mismatch", "fakerequestid");
        }
        if (request.getIfNoneMatch() != null && getEtag().equals(request.getIfNoneMatch())) {
            return GetObjectResponse.builder().isNotModified(true).build();
        }
        final InputStream inputStream;
        final long contentLength;
        if (request.getRange() != null) {
            if (request.getRange().getStartByte() == null
                    && request.getRange().getEndByte() != null) {
                // end-only range
                final long rangeStart =
                        Math.max(0L, getDataLength() - request.getRange().getEndByte());
                final long availableData = getDataLength() - rangeStart;
                Assert.assertTrue(availableData >= 0);
                contentLength = Math.toIntExact(availableData);
                inputStream =
                        new ByteArrayInputStream(
                                getData(),
                                Math.toIntExact(rangeStart),
                                Math.toIntExact(contentLength));
            } else {
                final long rangeStart =
                        request.getRange().getStartByte() == null
                                ? 0L
                                : request.getRange().getStartByte();
                final long rangeEnd =
                        request.getRange().getEndByte() == null
                                ? Long.MAX_VALUE
                                : request.getRange().getEndByte();
                final long availableData = getDataLength() - rangeStart;
                Assert.assertTrue(availableData >= 0);
                if (rangeEnd - rangeStart > availableData - 1) {
                    contentLength = Math.toIntExact(availableData);
                } else {
                    contentLength = Math.toIntExact(rangeEnd - rangeStart + 1);
                }
                inputStream =
                        new ByteArrayInputStream(
                                getData(),
                                Math.toIntExact(rangeStart),
                                Math.toIntExact(contentLength));
            }
        } else {
            contentLength = getDataLength();
            inputStream = new ByteArrayInputStream(getData());
        }

        return GetObjectResponse.builder()
                .eTag(getEtag())
                .opcMeta(getMetadata())
                .inputStream(new FailingInputStream(failureInjector, inputStream))
                .contentLength(contentLength)
                .build();
    }

    private static String randomSuffix() {
        return Long.toHexString(ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE));
    }
}
