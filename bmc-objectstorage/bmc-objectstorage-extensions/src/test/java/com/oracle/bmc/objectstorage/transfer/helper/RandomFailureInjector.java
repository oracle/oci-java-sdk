/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.helper;

import com.oracle.bmc.model.BmcException;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

public class RandomFailureInjector implements FailureInjector {

    /**
     * Chance that an operation will fail.
     */
    private final double pctFailureChance;

    /**
     * Maximum numbers of failures we will generate on a thread.
     */
    private final int maxFailures;

    /**
     * Failures we have seen so far
     */
    private AtomicLong failures;

    public RandomFailureInjector(double pctFailureChance, int maxFailures) {
        this.pctFailureChance = pctFailureChance;
        this.maxFailures = maxFailures;
        this.failures = new AtomicLong(0L);
    }

    @Override
    public void onGetObjectRequest() {
        if (this.shouldFail()) {
            switch (ThreadLocalRandom.current().nextInt(0, 5)) {
                case 0:
                    throw new BmcException(
                            429, "TooManyRequests", "Too many requests (throttling)", requestId());
                case 1:
                    throw new BmcException(
                            500, "InternalServerError", "Internal service error", requestId());
                case 2:
                    throw new BmcException(
                            503,
                            "ServiceUnavailable",
                            "Service unavailable (throttling)",
                            requestId());
                case 3:
                    throw new BmcException(
                            true, "Timeout", new SocketTimeoutException(), requestId());
                default:
                    throw new BmcException(false, "IOError", new SocketException(), requestId());
            }
        }
    }

    @Override
    public void onDataRead() throws IOException {
        if (this.shouldFail()) {
            throw new IOException("IO exception on data read");
        }
    }

    private static String requestId() {
        return Long.toHexString(ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE));
    }

    private boolean shouldFail() {
        if (this.failures.get() >= this.maxFailures) {
            // no failures possible
            return false;
        }
        if (ThreadLocalRandom.current().nextDouble() > this.pctFailureChance) {
            // no random failure
            return false;
        }
        while (true) {
            final long currentFailures = this.failures.get();
            if (currentFailures < this.maxFailures) {
                final long newFailures = currentFailures + 1;
                if (this.failures.compareAndSet(currentFailures, newFailures)) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
