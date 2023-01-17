/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.helper;

import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.model.Range;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class MockObjectTest {

    /** Use this for all tests to save setup/teardown time. Tests should not modify this data! */
    private static byte[] data;

    @BeforeClass
    public static void setupClass() {
        data = new byte[1024];
        ThreadLocalRandom.current().nextBytes(data);
    }

    @Test
    public void objectNotFound() {
        final MockObject object =
                new MockObject(new HashMap<>(), data.length, data, NoFailureInjector.INSTANCE);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName("n")
                        .bucketName("b")
                        .objectName("o")
                        .build();
        try {
            object.getObject(request);
            Assert.fail("Expected an exception");
        } catch (BmcException e) {
            Assert.assertEquals(e.getStatusCode(), 404);
        }
    }

    @Test
    public void notModified() {
        final MockObject object =
                new MockObject(new HashMap<>(), data.length, data, NoFailureInjector.INSTANCE);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(object.getNamespaceName())
                        .bucketName(object.getBucketName())
                        .objectName(object.getObjectName())
                        .ifNoneMatch(object.getEtag())
                        .build();
        final GetObjectResponse response = object.getObject(request);
        Assert.assertTrue(response.isNotModified());
    }

    @Test
    public void etagMismatch() {
        final MockObject object =
                new MockObject(new HashMap<>(), data.length, data, NoFailureInjector.INSTANCE);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(object.getNamespaceName())
                        .bucketName(object.getBucketName())
                        .objectName(object.getObjectName())
                        .ifMatch("wrongetag")
                        .build();
        try {
            object.getObject(request);
            Assert.fail("Expected an exception");
        } catch (BmcException e) {
            Assert.assertEquals(e.getStatusCode(), 412);
        }
    }

    @Test
    public void read() throws Exception {
        final MockObject object =
                new MockObject(new HashMap<>(), data.length, data, NoFailureInjector.INSTANCE);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(object.getNamespaceName())
                        .bucketName(object.getBucketName())
                        .objectName(object.getObjectName())
                        .build();
        final GetObjectResponse response = object.getObject(request);
        Assert.assertEquals(response.getInputStream().read(), Byte.toUnsignedInt(data[0]));
    }

    @Test
    public void rangeRead() throws Exception {
        final MockObject object =
                new MockObject(new HashMap<>(), data.length, data, NoFailureInjector.INSTANCE);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(object.getNamespaceName())
                        .bucketName(object.getBucketName())
                        .objectName(object.getObjectName())
                        .range(new Range(100L, null))
                        .build();
        final GetObjectResponse response = object.getObject(request);
        Assert.assertEquals(response.getInputStream().read(), Byte.toUnsignedInt(data[100]));
    }

    @Test
    public void getObjectFails() throws Exception {
        final FailureInjector failureInjector = new RandomFailureInjector(1.0, 1);
        final MockObject object =
                new MockObject(new HashMap<>(), data.length, data, failureInjector);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(object.getNamespaceName())
                        .bucketName(object.getBucketName())
                        .objectName(object.getObjectName())
                        .range(new Range(100L, null))
                        .build();
        try {
            object.getObject(request);
            Assert.fail("Expected an exception");
        } catch (Exception e) {
            // expected
        }
    }
}
