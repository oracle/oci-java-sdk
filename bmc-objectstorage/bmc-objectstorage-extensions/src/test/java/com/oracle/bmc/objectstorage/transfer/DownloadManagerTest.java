/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.model.Range;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.objectstorage.responses.GetObjectResponse;
import com.oracle.bmc.objectstorage.transfer.helper.MockObject;
import com.oracle.bmc.objectstorage.transfer.helper.MockObjectStorage;
import com.oracle.bmc.objectstorage.transfer.helper.NoFailureInjector;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class DownloadManagerTest {

    /** Use this for all tests to save setup/teardown time. Tests should not modify this data! */
    private static byte[] data;

    /**
     * Use the same executor service for all tests to save setup/teardown time. Test should not
     * terminate this service!
     */
    private static ExecutorService executorService;

    private ObjectStorage objectStorage;
    private String namespaceName;
    private String bucketName;
    private String objectName;
    private String etag;

    @BeforeClass
    public static void setupClass() {
        data = new byte[64 * 1024 * 1024];
        ThreadLocalRandom.current().nextBytes(data);
        executorService = Executors.newFixedThreadPool(8);
    }

    @AfterClass
    public static void teardownClass() throws InterruptedException {
        executorService.shutdownNow();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
    }

    @Before
    public void setup() {
        final MockObject mockObject =
                new MockObject(new HashMap<>(), data.length, data, NoFailureInjector.INSTANCE);
        this.namespaceName = mockObject.getNamespaceName();
        this.bucketName = mockObject.getBucketName();
        this.objectName = mockObject.getObjectName();
        this.etag = mockObject.getEtag();
        this.objectStorage = MockObjectStorage.create(mockObject);
    }

    @Test
    public void notFound() {
        final DownloadConfiguration config =
                DownloadConfiguration.builder().executorService(executorService).build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName("wrongnamespace")
                        .bucketName("wrongbucket")
                        .objectName("wrongobject")
                        .build();
        try {
            downloadManager.getObject(request);
            Assert.fail("Expected a BmcException");
        } catch (BmcException ex) {
            Assert.assertEquals(ex.getStatusCode(), 404);
        }
    }

    @Test
    public void notModified() {
        final DownloadConfiguration config =
                DownloadConfiguration.builder().executorService(executorService).build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .ifNoneMatch(etag)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        Assert.assertTrue(response.isNotModified());
    }

    @Test
    public void defaultOptions() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder().executorService(executorService).build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        verify(request, response);
    }

    @Test
    public void minDownloadThreshold() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .multipartDownloadThresholdInBytes(4 * 1024 * 1024)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        verify(request, response);
    }

    @Test
    public void maxDownloadThreshold() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .multipartDownloadThresholdInBytes(1024 * 1024 * 1024)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        verify(request, response);
    }

    @Test
    public void minPartSize() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .partSizeInBytes(4 * 1024 * 1024)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        verify(request, response);
    }

    @Test
    public void maxPartSize() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .partSizeInBytes(1024 * 1024 * 1024)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        verify(request, response);
    }

    @Test
    public void noParallelDownloads() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .partSizeInBytes(4 * 1024 * 1024)
                        .multipartDownloadThresholdInBytes(4 * 1024 * 1024)
                        .parallelDownloads(0)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        verify(request, response);
    }

    @Test
    public void oneParallelDownload() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .partSizeInBytes(4 * 1024 * 1024)
                        .multipartDownloadThresholdInBytes(4 * 1024 * 1024)
                        .parallelDownloads(1)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        verify(request, response);
    }

    @Test
    public void twoParallelDownloads() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .partSizeInBytes(4 * 1024 * 1024)
                        .multipartDownloadThresholdInBytes(4 * 1024 * 1024)
                        .parallelDownloads(2)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        verify(request, response);
    }

    @Test
    public void maxParallelDownloads() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .partSizeInBytes(4 * 1024 * 1024)
                        .multipartDownloadThresholdInBytes(4 * 1024 * 1024)
                        .parallelDownloads(256)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        verify(request, response);
    }

    @Test
    public void closeStream() throws Exception {
        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .partSizeInBytes(4 * 1024 * 1024)
                        .multipartDownloadThresholdInBytes(4 * 1024 * 1024)
                        .parallelDownloads(8)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);
        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(namespaceName)
                        .bucketName(bucketName)
                        .objectName(objectName)
                        .build();

        final byte[] buffer = new byte[9_000_000];
        assert buffer.length < data.length;
        for (int iteration = 0; iteration < 10; ++iteration) {
            final GetObjectResponse response = downloadManager.getObject(request);

            // Read some data
            final int dataToRead = ThreadLocalRandom.current().nextInt(1, buffer.length);
            final int bytesRead = response.getInputStream().read(buffer, 0, dataToRead);
            Assert.assertTrue(bytesRead > 0);

            // Check the data
            for (int i = 0; i < bytesRead; ++i) {
                Assert.assertEquals(buffer[i], data[i]);
            }

            // Close the stream
            response.getInputStream().close();
        }
    }

    @Test
    public void rangeGets() throws Exception {
        // Range get of the entire object
        final Collection<Range> ranges = new ArrayList<>();
        ranges.add(null);
        ranges.add(new Range(0L, null));
        ranges.add(new Range(0L, data.length - 1L));
        ranges.add(new Range(0L, (long) data.length));
        ranges.add(new Range(0L, data.length + 1L));
        ranges.add(new Range(0L, Long.MAX_VALUE));
        ranges.add(new Range(null, (long) data.length));
        ranges.add(new Range(null, data.length + 1L));
        ranges.add(new Range(null, Long.MAX_VALUE));

        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .partSizeInBytes(4 * 1024 * 1024)
                        .multipartDownloadThresholdInBytes(4 * 1024 * 1024)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);

        for (Range range : ranges) {
            final GetObjectRequest request =
                    GetObjectRequest.builder()
                            .namespaceName(namespaceName)
                            .bucketName(bucketName)
                            .objectName(objectName)
                            .range(range)
                            .build();
            final GetObjectResponse response = downloadManager.getObject(request);
            verify(request, response);
        }
    }

    private void verify(GetObjectRequest request, GetObjectResponse response) throws IOException {
        Assert.assertEquals(etag, response.getETag());
        Assert.assertEquals(Long.valueOf(data.length), response.getContentLength());
        final byte[] zeroLengthBuffer = new byte[0];
        final byte[] buffer = new byte[65 * 1024 - 1];
        int dataStart = 0;
        if (request.getRange() != null
                && request.getRange().getStartByte() == null
                && request.getRange().getEndByte() != null) {
            // this is an end-only range
            Long endByte = Math.min(Integer.MAX_VALUE, request.getRange().getEndByte());
            dataStart = Math.max(0, data.length - Math.toIntExact(endByte));
        }
        int offset = 0;
        while (offset < response.getContentLength()) {
            Assert.assertEquals(0, response.getInputStream().read(buffer, 0, 0));
            int bytesRead = response.getInputStream().read(buffer);
            Assert.assertTrue(bytesRead > 0);
            for (int i = 0; i < bytesRead; ++i) {
                // Do a cheap check before asserting
                if (buffer[i] != data[dataStart + i + offset]) {
                    Assert.assertEquals(data[dataStart + i + offset], buffer[i]);
                }
            }
            offset += bytesRead;

            Assert.assertEquals(0, response.getInputStream().read(zeroLengthBuffer));
            Assert.assertEquals(0, response.getInputStream().read(buffer, 0, 0));
        }

        Assert.assertEquals(-1, response.getInputStream().read());
        Assert.assertEquals(-1, response.getInputStream().read(buffer));
        Assert.assertEquals(0, response.getInputStream().read(buffer, 0, 0));
        Assert.assertEquals(-1, response.getInputStream().read(buffer, 0, 1));
    }
}
