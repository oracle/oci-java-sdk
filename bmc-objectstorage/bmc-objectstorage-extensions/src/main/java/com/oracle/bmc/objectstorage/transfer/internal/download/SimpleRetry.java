/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal.download;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.objectstorage.transfer.DownloadConfiguration;
import com.oracle.bmc.retrier.DefaultRetryCondition;

class SimpleRetry implements DownloadExecution {

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(SimpleRetry.class);

    /**
     * Maximum amount of time we are willing to wait for. We will perform exponential backoff from
     * {@link #currentBackoffMillis} until we hit this value.
     */
    final Duration maximumBackoff;

    /** Maximum number of retries we are willing to do. */
    final long maxRetries;

    /** How long to sleep on the next retry. */
    final AtomicLong currentBackoffMillis;

    /** Number of retries we have performed so far. */
    final AtomicLong currentRetries;

    /** Default retry condition, to re-use the retry conditions from the rest of the SDK. */
    static final DefaultRetryCondition defaultRetryCondition = new DefaultRetryCondition();

    private SimpleRetry(Duration initialBackoff, Duration maximumBackoff, int maxRetries) {
        this.maximumBackoff = maximumBackoff;
        this.maxRetries = maxRetries;
        this.currentBackoffMillis = new AtomicLong(initialBackoff.toMillis());
        this.currentRetries = new AtomicLong(0L);
    }

    static SimpleRetry simpleRetryFromConfig(DownloadConfiguration config) {
        return new SimpleRetry(
                config.getInitialBackoff(), config.getMaxBackoff(), config.getMaxRetries());
    }

    @Override
    public boolean shouldRetryOn(Throwable t) {
        if (!isRetryableError(t)) {
            LOG.debug("Non-retryable exception", t);
            return false;
        }
        if (this.currentRetries.get() >= this.maxRetries
                || this.currentRetries.getAndIncrement() >= this.maxRetries) {
            LOG.error("Too many retries ({}/{})", this.currentRetries.get(), this.maxRetries, t);
            return false;
        }

        final long oldBackoff = this.currentBackoffMillis.get();
        try {
            // Introduce jitter: we will sleep for a random time up to the
            // backoff value.
            final long sleepTime = ThreadLocalRandom.current().nextLong(0, oldBackoff);
            LOG.info("Retrying request. Sleeping for {}ms before retry", sleepTime, t);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Increase the backoff
        final long newBackoff = Math.min(oldBackoff * 2, this.maximumBackoff.toMillis());
        // If another thread has already increased the backoff we will not bother.
        this.currentBackoffMillis.compareAndSet(oldBackoff, newBackoff);
        return true;
    }

    private static boolean isRetryableError(Throwable t) {
        return shouldBeRetriedPerDefault(t) || isIOException(t);
    }

    private static boolean shouldBeRetriedPerDefault(Throwable t) {
        if (t instanceof BmcException) {
            final BmcException e = (BmcException) t;
            return defaultRetryCondition.shouldBeRetried(e);
        }
        return false;
    }

    private static boolean isIOException(Throwable t) {
        return t instanceof IOException;
    }
}
