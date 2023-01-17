/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloadConfigurationTest {

    @Test
    public void defaultsAreSane() {
        final DownloadConfiguration config = DownloadConfiguration.builder().build();
        Assert.assertEquals(config.getExecutorService(), null);
        Assert.assertTrue(config.getInitialBackoff().compareTo(Duration.ZERO) > 0);
        Assert.assertTrue(config.getMaxBackoff().compareTo(Duration.ZERO) > 0);
        Assert.assertTrue(config.getMaxBackoff().compareTo(config.getInitialBackoff()) > 0);
        Assert.assertTrue(config.getMaxRetries() > 0);
        Assert.assertTrue(config.getMultipartDownloadThresholdInBytes() > 0L);
        Assert.assertTrue(config.getParallelDownloads() > 0L);
        Assert.assertTrue(config.getPartSizeInBytes() > 0L);
    }

    @Test
    public void setProperties() {
        final ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            final DownloadConfiguration config =
                    DownloadConfiguration.builder()
                            .executorService(executorService)
                            .initialBackoff(Duration.ofMinutes(1))
                            .maxBackoff(Duration.ofMinutes(2))
                            .maxRetries(3)
                            .multipartDownloadThresholdInBytes(5L * 1024L * 1024L * 1024L)
                            .parallelDownloads(6)
                            .partSizeInBytes(7 * 1024 * 1024)
                            .build();
            Assert.assertEquals(config.getExecutorService(), executorService);
            Assert.assertEquals(config.getInitialBackoff(), Duration.ofMinutes(1));
            Assert.assertEquals(config.getMaxBackoff(), Duration.ofMinutes(2));
            Assert.assertEquals(config.getMaxRetries(), 3);
            Assert.assertEquals(
                    config.getMultipartDownloadThresholdInBytes(), 5L * 1024L * 1024L * 1024L);
            Assert.assertEquals(config.getParallelDownloads(), 6);
            Assert.assertEquals(config.getPartSizeInBytes(), 7 * 1024 * 1024);

            final DownloadConfiguration copy = DownloadConfiguration.builder().copy(config).build();
            Assert.assertEquals(copy.getExecutorService(), config.getExecutorService());
            Assert.assertEquals(copy.getInitialBackoff(), config.getInitialBackoff());
            Assert.assertEquals(copy.getMaxBackoff(), config.getMaxBackoff());
            Assert.assertEquals(copy.getMaxRetries(), config.getMaxRetries());
            Assert.assertEquals(
                    copy.getMultipartDownloadThresholdInBytes(),
                    config.getMultipartDownloadThresholdInBytes());
            Assert.assertEquals(copy.getParallelDownloads(), config.getParallelDownloads());
            Assert.assertEquals(copy.getPartSizeInBytes(), config.getPartSizeInBytes());
        } finally {
            executorService.shutdown();
        }
    }
}
