/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer;

import com.oracle.bmc.objectstorage.requests.GetObjectRequest;
import com.oracle.bmc.util.internal.Validate;
import java.time.Duration;
import java.util.concurrent.ExecutorService;

/** Configuration for the {@link DownloadManager}. */
public class DownloadConfiguration {

    /** The smallest part size we will use. */
    static final int MIN_PART_SIZE_IN_BYTES = 4 * 1024 * 1024;

    /** The largest part size we will allow. */
    private static final int MAX_PART_SIZE_IN_BYTES = 1024 * 1024 * 1024;

    /** The largest value we will acceept for {@link #getParallelDownloads()}. */
    private static final int MAX_PARALLEL_DOWNLOADS = 256;

    /** The largest value we will accept as {@link #getMultipartDownloadThresholdInBytes()}. */
    private static final long MAX_MULTIPART_DOWNLOAD_THRESHOLD = 5L * 1024L * 1024L * 1024L;

    /** Maximum number of retries, not including the initial attempt. */
    private final int maxRetries;

    /** Initial backoff, before a retry is performed. */
    private final Duration initialBackoff;

    /** Maximum backoff between retries. */
    private final Duration maxBackoff;

    /** The size in bytes of the individual parts as which the object is downloaded. */
    private final int partSizeInBytes;

    /** The threshold size in bytes at which we will start splitting the object into parts. */
    private final long multipartDownloadThresholdInBytes;

    /**
     * The number of parallel operations to perform when downloading an object in multiple parts.
     * Decreasing this value will make multipart downloads less resource intensive but they may take
     * longer. Increasing this value may improve download times, but the download process will
     * consume more system resources and network bandwidth.
     *
     * <p>Note that this is per object. If you call {@link
     * DownloadManager#getObject(GetObjectRequest)} multiple times concurrently from separate
     * threads, you will get this many parallel operations per object. If you want to limit the
     * overall number of parallel parts being downloaded, you can provide an {@link ExecutorService}
     * using {@link Builder#executorService(ExecutorService)} that limits the number of threads.
     */
    private final int parallelDownloads;

    /** Executor service for parallel downloads. */
    private final ExecutorService executorService;

    /**
     * Create a configuration for the {@link DownloadManager}.
     *
     * @param maxRetries maximum number of retries, not including the initial attempt.
     * @param initialBackoff initial backoff, before a retry is performed.
     * @param maxBackoff maximum backoff between retries
     * @param partSizeInBytes the size in bytes of the individual parts as which the object is
     *     downloaded.
     * @param multipartDownloadThresholdInBytes the threshold size in bytes at which we will start
     *     splitting the object into parts
     * @param parallelDownloads maximum number of parallel downloads
     * @param executorService executor service for parallel downloads
     */
    public DownloadConfiguration(
            int maxRetries,
            Duration initialBackoff,
            Duration maxBackoff,
            int partSizeInBytes,
            long multipartDownloadThresholdInBytes,
            int parallelDownloads,
            ExecutorService executorService) {
        Validate.isTrue(
                maxRetries >= 0,
                "maxRetries [%s] must be greater than or equal to %s",
                maxRetries,
                0);
        Validate.isTrue(
                initialBackoff.compareTo(Duration.ofMillis(1)) >= 0,
                "initialBackoff [%s] must be greater than %s",
                initialBackoff,
                Duration.ZERO);
        Validate.isTrue(
                maxBackoff.compareTo(initialBackoff) >= 0,
                "maxBackoff [%s] must be greater than or equal to initialBackoff [%s]",
                maxBackoff,
                initialBackoff);
        Validate.inclusiveBetween(
                MIN_PART_SIZE_IN_BYTES,
                MAX_PART_SIZE_IN_BYTES,
                partSizeInBytes,
                "partSizeInBytes [%s] must be between %s and %s",
                partSizeInBytes,
                MIN_PART_SIZE_IN_BYTES,
                MAX_PART_SIZE_IN_BYTES);
        Validate.inclusiveBetween(
                (long) MIN_PART_SIZE_IN_BYTES,
                MAX_MULTIPART_DOWNLOAD_THRESHOLD,
                multipartDownloadThresholdInBytes,
                "multipartDownloadThresholdInBytes [%s] must be between %s and %s",
                multipartDownloadThresholdInBytes,
                MIN_PART_SIZE_IN_BYTES,
                MAX_MULTIPART_DOWNLOAD_THRESHOLD);
        Validate.inclusiveBetween(
                0,
                MAX_PARALLEL_DOWNLOADS,
                parallelDownloads,
                "parallelDownloads [%s] must be between %s and %s",
                parallelDownloads,
                0,
                MAX_PARALLEL_DOWNLOADS);

        this.maxRetries = maxRetries;
        this.initialBackoff = initialBackoff;
        this.maxBackoff = maxBackoff;
        this.partSizeInBytes = partSizeInBytes;
        this.multipartDownloadThresholdInBytes = multipartDownloadThresholdInBytes;
        this.parallelDownloads = parallelDownloads;
        this.executorService = executorService;
    }

    /**
     * Create a new builder for the {@link DownloadManager} configuration
     *
     * @return builder for the configuration
     */
    public static Builder builder() {
        return new Builder();
    }

    /** Builder for {@link DownloadConfiguration}. */
    public static class Builder {
        private int maxRetries;
        private Duration initialBackoff;
        private Duration maxBackoff;
        private int partSizeInBytes;
        private long multipartDownloadThresholdInBytes;
        private int parallelDownloads;
        private ExecutorService executorService;

        private Builder() {
            this.maxRetries = 10;
            this.initialBackoff = Duration.ofMillis(100);
            this.maxBackoff = Duration.ofSeconds(30);
            this.partSizeInBytes = 32 * 1024 * 1024;
            this.multipartDownloadThresholdInBytes =
                    DownloadConfiguration.MIN_PART_SIZE_IN_BYTES * 2;
            this.parallelDownloads = 3;
            this.executorService = null;
        }

        /**
         * Build the {@link DownloadConfiguration}.
         *
         * @return the {@link DownloadConfiguration}
         */
        public DownloadConfiguration build() {
            return new DownloadConfiguration(
                    this.maxRetries,
                    this.initialBackoff,
                    this.maxBackoff,
                    this.partSizeInBytes,
                    this.multipartDownloadThresholdInBytes,
                    this.parallelDownloads,
                    this.executorService);
        }

        /**
         * Copy the values from a {@link DownloadConfiguration} into this builder
         *
         * @param that other {@link DownloadConfiguration}
         * @return this builder
         */
        public Builder copy(DownloadConfiguration that) {
            this.maxRetries = that.maxRetries;
            this.initialBackoff = that.initialBackoff;
            this.maxBackoff = that.maxBackoff;
            this.partSizeInBytes = that.partSizeInBytes;
            this.multipartDownloadThresholdInBytes = that.multipartDownloadThresholdInBytes;
            this.parallelDownloads = that.parallelDownloads;
            this.executorService = that.executorService;
            return this;
        }

        /**
         * Maximum number of retries to attempt when downloading an object/part. The default value
         * is 10 retries.
         *
         * <p>The retries in the download manager are smarter than the retries built into the
         * client: The download manager modifies the request to only retry the parts that haven't
         * been read yet. The client would retry the entire request, and re-download parts that have
         * already been downloaded.
         *
         * <p>Since these retries have been implemented independent of the regular client retries,
         * client retries set using {@link com.oracle.bmc.retrier.RetryConfiguration} are ignored.
         *
         * @param value
         * @return this builder
         */
        public Builder maxRetries(int value) {
            this.maxRetries = value;
            return this;
        }

        /**
         * Set the initial backoff before the first retry.
         *
         * @param value initial backoff before the first retry
         * @return this builder
         */
        public Builder initialBackoff(Duration value) {
            this.initialBackoff = value;
            return this;
        }

        /**
         * Set the maximum backoff between retries.
         *
         * @param value maximum backoff between retries
         * @return this builder
         */
        public Builder maxBackoff(Duration value) {
            this.maxBackoff = value;
            return this;
        }

        /**
         * Set the part size to use when downloading an object in multiple parts. The default value
         * is 32 MiB, the minimum allowable size is 4 MiB, and the maximum allowable size is 1 GiB.
         *
         * @param value the size in bytes of the individual parts as which the object is downloaded.
         * @return this builder
         */
        public Builder partSizeInBytes(int value) {
            this.partSizeInBytes = value;
            return this;
        }

        /**
         * Objects larger than this size will be downloaded in multiple parts. The default value is
         * 64 MiB, the minimum allowable threshold is 4 MiB, and the maximum allowable threshold is
         * 5 GiB.
         *
         * @param value the threshold size in bytes at which we will start splitting the object into
         *     parts
         * @return this builder
         */
        public Builder multipartDownloadThresholdInBytes(long value) {
            this.multipartDownloadThresholdInBytes = value;
            return this;
        }

        /**
         * The number of parallel operations to perform when downloading an object in multiple
         * parts. Decreasing this value will make multipart downloads less resource intensive but
         * they may take longer. Increasing this value may improve download times, but the download
         * process will consume more system resources and network bandwidth. The maximum allowed
         * value is 256 and the default value is 3.
         *
         * <p>Note that this is per object. If you call {@link
         * DownloadManager#getObject(GetObjectRequest)} multiple times concurrently from separate
         * threads, you will get this many parallel operations per object. If you want to limit the
         * overall number of parallel parts being downloaded, you can provide an {@link
         * ExecutorService} using {@link #executorService(ExecutorService)} that limits the number
         * of threads.
         *
         * @param value maximum number of parallel operations when downloading a single object
         * @return this builder
         */
        public Builder parallelDownloads(int value) {
            this.parallelDownloads = value;
            return this;
        }

        /**
         * The executor service to use when performing parallel operations. If this is null (the
         * default) each download will create its own executor service if necessary.
         *
         * @param value executor service for parallel downloads
         * @return this builder
         */
        public Builder executorService(ExecutorService value) {
            this.executorService = value;
            return this;
        }
    }

    /** Maximum number of retries, not including the initial attempt. */
    public int getMaxRetries() {
        return this.maxRetries;
    }

    /** Initial backoff, before a retry is performed. */
    public Duration getInitialBackoff() {
        return this.initialBackoff;
    }

    /** Maximum backoff between retries. */
    public Duration getMaxBackoff() {
        return this.maxBackoff;
    }

    /** The size in bytes of the individual parts as which the object is downloaded. */
    public int getPartSizeInBytes() {
        return this.partSizeInBytes;
    }

    /** The threshold size in bytes at which we will start splitting the object into parts. */
    public long getMultipartDownloadThresholdInBytes() {
        return this.multipartDownloadThresholdInBytes;
    }

    /**
     * The number of parallel operations to perform when downloading an object in multiple parts.
     * Decreasing this value will make multipart downloads less resource intensive but they may take
     * longer. Increasing this value may improve download times, but the download process will
     * consume more system resources and network bandwidth.
     *
     * <p>Note that this is per object. If you call {@link
     * DownloadManager#getObject(GetObjectRequest)} multiple times concurrently from separate
     * threads, you will get this many parallel operations per object. If you want to limit the
     * overall number of parallel parts being downloaded, you can provide an {@link ExecutorService}
     * using {@link Builder#executorService(ExecutorService)} that limits the number of threads.
     */
    public int getParallelDownloads() {
        return this.parallelDownloads;
    }

    /** Executor service for parallel downloads. */
    public ExecutorService getExecutorService() {
        return this.executorService;
    }
}
