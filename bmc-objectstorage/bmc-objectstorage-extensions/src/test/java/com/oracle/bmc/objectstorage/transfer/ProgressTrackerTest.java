/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.transfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.AdditionalMatchers.and;
import static org.mockito.AdditionalMatchers.gt;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.AdditionalMatchers.leq;

import lombok.RequiredArgsConstructor;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ProgressTrackerTest {
    private static final long READ_CHUNK_SIZE = 8192L;
    private static final long MAX_BLOCK_SIZE = 128 * 1024 * 1024;
    private static final long EXECUTION_SERVICE_TIMEOUT_IN_SECONDS = 20;

    @Test
    public void nullProgressReporter() {
        ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createSingleUploadProgressTrackerFactory(null, 0L);
        assertNotNull(progressTrackerFactory);
        assertNull(progressTrackerFactory.getProgressTracker());
        progressTrackerFactory =
                ProgressTrackerFactory.createMultiPartUploadProgressTrackerFactory(null, 0L);
        assertNotNull(progressTrackerFactory);
        assertNull(progressTrackerFactory.getProgressTracker());
    }

    @Test(expected = IllegalStateException.class)
    public void illegalProgressReport_overflow() {
        ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createSingleUploadProgressTrackerFactory(
                        new ProgressReporter() {
                            @Override
                            public void onProgress(long completed, long total) {}
                        },
                        0L);
        progressTrackerFactory.getProgressTracker().onBytesRead(READ_CHUNK_SIZE);
    }

    @Test(expected = IllegalStateException.class)
    public void illegalProgressReport_underflow() {
        ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createSingleUploadProgressTrackerFactory(
                        new ProgressReporter() {
                            @Override
                            public void onProgress(long completed, long total) {}
                        },
                        0L);
        progressTrackerFactory.getProgressTracker().onBytesRead(-1);
    }

    @Test(expected = IllegalStateException.class)
    public void illegalProgressReset() {
        ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createSingleUploadProgressTrackerFactory(
                        new ProgressReporter() {
                            @Override
                            public void onProgress(long completed, long total) {}
                        },
                        0L);
        progressTrackerFactory.getProgressTracker().invalidateBytesRead(1);
    }

    @Test
    public void singleUploadProgressTrackerFactory_sameProgressTracker() {
        final ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createSingleUploadProgressTrackerFactory(
                        new ProgressReporter() {
                            @Override
                            public void onProgress(long completed, long total) {}
                        },
                        0L);

        assertNotNull(progressTrackerFactory);
        assertSame(
                progressTrackerFactory.getProgressTracker(),
                progressTrackerFactory.getProgressTracker());
    }

    @Test
    public void singleUploadProgressTrackerFactory_progressTrackerFunctionality()
            throws InterruptedException {
        final long totalBytes = ThreadLocalRandom.current().nextLong(MAX_BLOCK_SIZE);
        final ProgressReporter mockProgressReporter = mock(ProgressReporter.class);
        final ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createSingleUploadProgressTrackerFactory(
                        mockProgressReporter, totalBytes);

        int count = trackProgressAndGetCallbackCount(progressTrackerFactory, totalBytes, 1);
        verify(mockProgressReporter, times(count))
                .onProgress(and(gt(0L), leq(totalBytes)), eq(totalBytes));
    }

    @Test
    public void singleUploadProgressTrackerFactory_resetProgressTracker() {
        final long totalBytes = ThreadLocalRandom.current().nextLong(MAX_BLOCK_SIZE);
        final ProgressReporter mockProgressReporter = mock(ProgressReporter.class);
        final ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createSingleUploadProgressTrackerFactory(
                        mockProgressReporter, totalBytes);
        final ProgressTracker progressTracker = progressTrackerFactory.getProgressTracker();

        progressTracker.reset();
        progressTracker.onBytesRead(READ_CHUNK_SIZE);
        progressTracker.onBytesRead(READ_CHUNK_SIZE);
        progressTracker.reset();
        progressTracker.onBytesRead(READ_CHUNK_SIZE);
        progressTracker.onBytesRead(READ_CHUNK_SIZE);
        progressTracker.onBytesRead(READ_CHUNK_SIZE);
        progressTracker.onBytesRead(READ_CHUNK_SIZE);
        progressTracker.reset();
        progressTracker.reset();

        ArgumentCaptor<Long> bytesReadArgumentCaptor = ArgumentCaptor.forClass(Long.class);
        verify(mockProgressReporter, times(6))
                .onProgress(bytesReadArgumentCaptor.capture(), eq(totalBytes));

        List<Long> expectedBytesReadList =
                Arrays.asList(
                        READ_CHUNK_SIZE,
                        2 * READ_CHUNK_SIZE,
                        READ_CHUNK_SIZE,
                        2 * READ_CHUNK_SIZE,
                        3 * READ_CHUNK_SIZE,
                        4 * READ_CHUNK_SIZE);
        assertEquals(expectedBytesReadList, bytesReadArgumentCaptor.getAllValues());
    }

    @Test
    public void multipartUploadProgressTrackerFactory_differentProgressTracker() {
        final ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createMultiPartUploadProgressTrackerFactory(
                        new ProgressReporter() {
                            @Override
                            public void onProgress(long completed, long total) {}
                        },
                        0L);

        assertNotNull(progressTrackerFactory);
        assertNotEquals(
                progressTrackerFactory.getProgressTracker(),
                progressTrackerFactory.getProgressTracker());
    }

    @Test
    public void multipartUploadProgressTrackerFactory_progressTrackerFunctionality()
            throws InterruptedException {
        final long totalBytes = ThreadLocalRandom.current().nextLong(MAX_BLOCK_SIZE);
        final ProgressReporter mockProgressReporter = mock(ProgressReporter.class);
        final ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createMultiPartUploadProgressTrackerFactory(
                        mockProgressReporter, totalBytes);

        final int invocationCount =
                trackProgressAndGetCallbackCount(progressTrackerFactory, totalBytes, 30);

        verify(mockProgressReporter, times(invocationCount))
                .onProgress(and(gt(0L), leq(totalBytes)), eq(totalBytes));
    }

    @Test
    public void multipartUploadProgressTrackerFactory_resetProgressTracker() {
        final long totalBytes = ThreadLocalRandom.current().nextLong(MAX_BLOCK_SIZE);
        final ProgressReporter mockProgressReporter = mock(ProgressReporter.class);
        final ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createMultiPartUploadProgressTrackerFactory(
                        mockProgressReporter, totalBytes);
        final ProgressTracker progressTracker1 = progressTrackerFactory.getProgressTracker();
        final ProgressTracker progressTracker2 = progressTrackerFactory.getProgressTracker();

        progressTracker1.onBytesRead(READ_CHUNK_SIZE);
        progressTracker1.reset();
        progressTracker2.reset();
        progressTracker2.onBytesRead(READ_CHUNK_SIZE);
        progressTracker1.onBytesRead(READ_CHUNK_SIZE);
        progressTracker2.onBytesRead(READ_CHUNK_SIZE);
        progressTracker1.reset();
        progressTracker1.onBytesRead(READ_CHUNK_SIZE);
        progressTracker2.reset();
        progressTracker1.reset();
        progressTracker1.reset();
        progressTracker1.onBytesRead(READ_CHUNK_SIZE);

        ArgumentCaptor<Long> bytesReadArgumentCaptor = ArgumentCaptor.forClass(Long.class);
        verify(mockProgressReporter, times(6))
                .onProgress(bytesReadArgumentCaptor.capture(), eq(totalBytes));

        List<Long> expectedBytesReadList =
                Arrays.asList(
                        READ_CHUNK_SIZE,
                        READ_CHUNK_SIZE,
                        2 * READ_CHUNK_SIZE,
                        3 * READ_CHUNK_SIZE,
                        3 * READ_CHUNK_SIZE,
                        READ_CHUNK_SIZE);
        assertEquals(expectedBytesReadList, bytesReadArgumentCaptor.getAllValues());
    }

    @Test
    public void multipartUploadProgressTrackerFactory_simulateRealLifeScenario()
            throws InterruptedException {
        final long totalBytes = Long.MAX_VALUE;
        final ProgressReporter mockProgressReporter = mock(ProgressReporter.class);
        final ProgressTrackerFactory progressTrackerFactory =
                ProgressTrackerFactory.createMultiPartUploadProgressTrackerFactory(
                        mockProgressReporter, totalBytes);

        final List<Long> expectedBytesReadList =
                Collections.synchronizedList(new ArrayList<Long>());
        final AtomicLong totalBytesRead = new AtomicLong();
        final int THREAD_POOL_SIZE = 3;
        final int NUMBER_OF_CHUNKS = 10;
        final int SIZE_OF_CHUNK = 128 * 1024 * 1024; // 128 MB
        final ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

        for (int i = 0; i < NUMBER_OF_CHUNKS; i++) {
            executorService.submit(
                    new Runnable() {
                        final ProgressTracker progressTracker =
                                progressTrackerFactory.getProgressTracker();

                        @Override
                        public void run() {
                            long expectedBytesRead = 0;
                            for (int i = 0; i < SIZE_OF_CHUNK / READ_CHUNK_SIZE; i++) {
                                int diceRoll = ThreadLocalRandom.current().nextInt();
                                synchronized (expectedBytesReadList) {
                                    if (diceRoll % 10 == 0) {
                                        progressTracker.reset();
                                        totalBytesRead.addAndGet(-1 * expectedBytesRead);
                                        expectedBytesRead = 0;
                                    } else {
                                        progressTracker.onBytesRead(READ_CHUNK_SIZE);
                                        expectedBytesRead += READ_CHUNK_SIZE;
                                        expectedBytesReadList.add(
                                                totalBytesRead.addAndGet(READ_CHUNK_SIZE));
                                    }
                                }
                            }
                        }
                    });
        }

        executorService.shutdown();
        executorService.awaitTermination(EXECUTION_SERVICE_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);

        ArgumentCaptor<Long> bytesReadArgumentCaptor = ArgumentCaptor.forClass(Long.class);
        verify(mockProgressReporter, times(expectedBytesReadList.size()))
                .onProgress(bytesReadArgumentCaptor.capture(), eq(totalBytes));

        assertEquals(expectedBytesReadList, bytesReadArgumentCaptor.getAllValues());
    }

    private static int trackProgressAndGetCallbackCount(
            final ProgressTrackerFactory progressTrackerFactory,
            final long totalBytes,
            final int executorCount)
            throws InterruptedException {
        final AtomicInteger callbackCount = new AtomicInteger();
        final ExecutorService executorService = Executors.newCachedThreadPool();

        @RequiredArgsConstructor
        abstract class MockProgressTrackerSource implements Runnable {
            final ProgressTracker progressTracker;
            final long totalBytesToRead;
        }

        for (int i = 0; i < executorCount; i++) {
            executorService.submit(
                    new MockProgressTrackerSource(
                            progressTrackerFactory.getProgressTracker(),
                            (i == executorCount - 1)
                                    ? totalBytes / executorCount + totalBytes % executorCount
                                    : totalBytes / executorCount) {
                        @Override
                        public void run() {
                            long totalBytesRead = 0;
                            while (totalBytesRead < totalBytesToRead) {
                                final long bytesRead =
                                        Math.min(
                                                READ_CHUNK_SIZE, totalBytesToRead - totalBytesRead);
                                totalBytesRead += bytesRead;
                                callbackCount.getAndIncrement();
                                progressTracker.onBytesRead(bytesRead);
                            }
                        }
                    });
        }

        executorService.shutdown();
        executorService.awaitTermination(EXECUTION_SERVICE_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);

        return callbackCount.get();
    }
}
