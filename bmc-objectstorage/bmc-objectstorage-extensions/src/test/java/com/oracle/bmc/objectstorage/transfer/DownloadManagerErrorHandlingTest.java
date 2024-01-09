/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
import com.oracle.bmc.objectstorage.transfer.helper.RandomFailureInjector;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Ignore
public class DownloadManagerErrorHandlingTest {

    /** Test the case where the very first getObject fails. */
    @Test
    public void completeFailure() throws Exception {
        // No operation will ever work
        final RandomFailureInjector alwaysFail = new RandomFailureInjector(1.0, Integer.MAX_VALUE);

        final MockObject mockObject = new MockObject(new HashMap<>(), 0, new byte[0], alwaysFail);
        final ObjectStorage objectStorage = MockObjectStorage.create(mockObject);

        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        // Keep the test fast by keeping retries short
                        .initialBackoff(Duration.ofMillis(1))
                        .maxBackoff(Duration.ofMillis(2))
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);

        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(mockObject.getNamespaceName())
                        .bucketName(mockObject.getBucketName())
                        .objectName(mockObject.getObjectName())
                        .build();
        try {
            downloadManager.getObject(request);
            Assert.fail("Expected an exception");
        } catch (BmcException e) {
            // expected
        }
    }

    /** Test the case where there are too many failures for success */
    @Test
    public void tooManyFailures() throws Exception {
        // 50% chance of failure
        final RandomFailureInjector randomFailures =
                new RandomFailureInjector(0.5, Integer.MAX_VALUE);

        final byte[] data = new byte[128 * 1024 * 1024];
        ThreadLocalRandom.current().nextBytes(data);
        final MockObject mockObject =
                new MockObject(new HashMap<>(), data.length, data, randomFailures);
        final ObjectStorage objectStorage = MockObjectStorage.create(mockObject);

        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        // Keep the test fast by keeping retries short
                        .initialBackoff(Duration.ofMillis(1))
                        .maxBackoff(Duration.ofMillis(2))
                        .maxRetries(3)
                        .partSizeInBytes(4 * 1024 * 1024)
                        .multipartDownloadThresholdInBytes(4 * 1024 * 1024)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);

        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(mockObject.getNamespaceName())
                        .bucketName(mockObject.getBucketName())
                        .objectName(mockObject.getObjectName())
                        .build();
        final byte[] readBuffer = new byte[64 * 1024];
        for (int attempt = 0; attempt < 10; ++attempt) {
            try {
                final GetObjectResponse response = downloadManager.getObject(request);
                try {
                    int offset = 0;
                    while (true) {
                        int bytesRead = response.getInputStream().read(readBuffer);
                        Assert.assertTrue(bytesRead > 0);
                        for (int i = 0; i < bytesRead; ++i) {
                            // Do a cheap check first
                            if (readBuffer[i] != data[i + offset]) {
                                Assert.assertEquals(readBuffer[i], data[i + offset]);
                            }
                        }
                        // We should never read the entire object -- we should hit the retry limit
                        // first
                        offset += bytesRead;
                        Assert.assertTrue(offset < data.length);
                    }
                } finally {
                    response.getInputStream().close();
                }
            } catch (BmcException | IOException e) {
                // Expected
            }
        }
    }

    /** Have a small chance of failure, but read byte-by-byte */
    @Test
    public void tooManyFailuresRead() throws Exception {
        // 1% chance of failure
        final RandomFailureInjector randomFailures =
                new RandomFailureInjector(0.01, Integer.MAX_VALUE);

        final byte[] data = new byte[100_000_000];
        ThreadLocalRandom.current().nextBytes(data);
        final MockObject mockObject =
                new MockObject(new HashMap<>(), data.length, data, randomFailures);
        final ObjectStorage objectStorage = MockObjectStorage.create(mockObject);

        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        // Keep the test fast by keeping retries short
                        .initialBackoff(Duration.ofMillis(1))
                        .maxBackoff(Duration.ofMillis(2))
                        .multipartDownloadThresholdInBytes(1024 * 1024 * 1024)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);

        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(mockObject.getNamespaceName())
                        .bucketName(mockObject.getBucketName())
                        .objectName(mockObject.getObjectName())
                        .build();
        final GetObjectResponse response = downloadManager.getObject(request);
        try {
            int offset = 0;
            while (true) {
                int b = response.getInputStream().read();
                Assert.assertTrue(b >= 0);
                Assert.assertEquals(b, Byte.toUnsignedInt(data[offset]));
                ++offset;
                Assert.assertTrue(offset < data.length);
            }
        } catch (IOException e) {
            // Expected
        } finally {
            response.getInputStream().close();
        }
    }

    @Test
    public void readWithFailures() throws Exception {
        // Allocate this once and use it in all the tests
        final byte[] data = new byte[128 * 1024 * 1024];
        ThreadLocalRandom.current().nextBytes(data);

        // Perform a read that creates its own executor service
        readWithFailures(null, data.length, data);

        // Create a reusable executor service for all subsequent tests
        final ExecutorService executorService = Executors.newFixedThreadPool(4);
        try {
            // Small objects
            for (int contentLength = 1; contentLength <= 16; ++contentLength) {
                readWithFailures(executorService, contentLength, data);
            }

            readWithFailures(executorService, 4 * 1024 * 1024 - 1, data);
            readWithFailures(executorService, 4 * 1024 * 1024, data);
            readWithFailures(executorService, 4 * 1024 * 1024 + 1, data);

            // Larger objects with random sizes
            for (int i = 0; i < 10; ++i) {
                final int contentLength =
                        ThreadLocalRandom.current().nextInt(5 * 1024 * 1024, data.length);
                readWithFailures(executorService, contentLength, data);
            }
        } finally {
            executorService.shutdownNow();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        }
    }

    private void readWithFailures(ExecutorService executorService, int contentLength, byte[] data)
            throws IOException {
        Assert.assertTrue(contentLength <= data.length);
        final RandomFailureInjector randomFailures = new RandomFailureInjector(0.1, 100);

        final MockObject mockObject =
                new MockObject(new HashMap<>(), contentLength, data, randomFailures);
        final ObjectStorage objectStorage = MockObjectStorage.create(mockObject);

        final DownloadConfiguration config =
                DownloadConfiguration.builder()
                        .maxRetries(101)
                        // Keep the test fast by keeping retries short
                        .initialBackoff(Duration.ofMillis(1))
                        .maxBackoff(Duration.ofMillis(2))
                        .partSizeInBytes(4 * 1024 * 1024)
                        .multipartDownloadThresholdInBytes(4 * 1024 * 1024)
                        .executorService(executorService)
                        .build();
        final DownloadManager downloadManager = new DownloadManager(objectStorage, config);

        final GetObjectRequest request =
                GetObjectRequest.builder()
                        .namespaceName(mockObject.getNamespaceName())
                        .bucketName(mockObject.getBucketName())
                        .objectName(mockObject.getObjectName())
                        .range(fullObjectRange(contentLength))
                        .build();

        // 1) Download some of the object with single-byte read and close the stream
        final GetObjectResponse r1 = downloadManager.getObject(request);
        for (int i = 0; i < Math.min(1024, contentLength - 1); ++i) {
            Assert.assertEquals(r1.getInputStream().read(), Byte.toUnsignedInt(data[i]));
        }
        r1.getInputStream().close();
        Assert.assertEquals(r1.getInputStream().read(new byte[0]), 0);

        try {
            r1.getInputStream().read();
            Assert.fail("Expected an IOException");
        } catch (IOException e) {
            // expected
        }

        try {
            r1.getInputStream().read(new byte[1]);
            Assert.fail("Expected an IOException");
        } catch (IOException e) {
            // expected
        }

        try {
            r1.getInputStream().read(new byte[1], 0, 1);
            Assert.fail("Expected an IOException");
        } catch (IOException e) {
            // expected
        }

        // 2) Download the entire object
        final GetObjectResponse r2 = downloadManager.getObject(request);
        Assert.assertEquals(r2.getContentLength(), Long.valueOf(contentLength));
        Assert.assertEquals(r2.getETag(), mockObject.getEtag());

        final byte[] readBuffer = new byte[Math.min(contentLength, 64 * 1024)];
        int offset = 0;
        while (offset < contentLength) {
            int bytesRead = r2.getInputStream().read(readBuffer);
            Assert.assertTrue(bytesRead > 0);
            for (int i = 0; i < bytesRead; ++i) {
                // Do a cheap check before asserting
                if (readBuffer[i] != data[i + offset]) {
                    Assert.assertEquals(readBuffer[i], data[i + offset]);
                }
            }
            offset += bytesRead;
        }
    }

    /** Choose a random range that will retrieve the entire object. */
    private Range fullObjectRange(int contentLength) {
        switch (ThreadLocalRandom.current().nextInt(0, 6)) {
            case 0:
                return null;
            case 1:
                return new Range(null, (long) contentLength);
            case 2:
                return new Range(null, Long.MAX_VALUE);
            case 3:
                return new Range(0L, null);
            case 4:
                return new Range(0L, (long) contentLength - 1);
            case 5:
                return new Range(0L, (long) contentLength);
            default:
                return new Range(0L, Long.MAX_VALUE);
        }
    }
}
