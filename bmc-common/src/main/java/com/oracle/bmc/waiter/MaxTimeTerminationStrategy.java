/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;
import java.util.concurrent.TimeUnit;

/**
 * Termination strategy that allows up to X milliseconds to have elapsed
 * before terminating.
 */
public class MaxTimeTerminationStrategy implements TerminationStrategy {
    /**
     * The max amount of time to wait (in millis) before returning.
     */
    private final long maxTimeInMillis;

    @Override
    public boolean shouldTerminate(WaitContext context) {
        final long endTime = context.getStartTime() + maxTimeInMillis;
        final long currentTime = context.getCurrentTime();
        return endTime <= currentTime;
    }

    /**
     * Create a new termination strategy that allows up to the specified number of time units to have elapsed before terminating.
     * @param maxTime number of time units
     * @param timeUnit time unit
     * @return termination strategy
     */
    public static MaxTimeTerminationStrategy ofTimeUnit(
            final long maxTime, final TimeUnit timeUnit) {
        return new MaxTimeTerminationStrategy(timeUnit.toMillis(maxTime));
    }

    /**
     * Create a new termination strategy that allows up to the specified number of milliseconds to have elapsed before terminating.
     * @param maxTimeInMillis number of milliseconds
     * @return termination strategy
     */
    public static MaxTimeTerminationStrategy ofMillis(final long maxTimeInMillis) {
        return ofTimeUnit(maxTimeInMillis, TimeUnit.MILLISECONDS);
    }

    /**
     * Create a new termination strategy that allows up to the specified number of seconds to have elapsed before terminating.
     * @param maxTimeInSeconds number of seconds
     * @return termination strategy
     */
    public static MaxTimeTerminationStrategy ofSeconds(final long maxTimeInSeconds) {
        return ofTimeUnit(maxTimeInSeconds, TimeUnit.SECONDS);
    }

    /**
     * Create a new termination strategy that allows up to the specified number of minutes to have elapsed before terminating.
     * @param maxTimeInMinutes number of minutes
     * @return termination strategy
     */
    public static MaxTimeTerminationStrategy ofMinutes(final long maxTimeInMinutes) {
        return ofTimeUnit(maxTimeInMinutes, TimeUnit.MINUTES);
    }

    @java.beans.ConstructorProperties({"maxTimeInMillis"})
    public MaxTimeTerminationStrategy(final long maxTimeInMillis) {
        this.maxTimeInMillis = maxTimeInMillis;
    }
}
