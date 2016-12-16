/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

import lombok.RequiredArgsConstructor;

/**
 * Termination strategy that allows up to X milliseconds to have elapsed
 * before terminating.
 */
@RequiredArgsConstructor
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
}
