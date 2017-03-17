/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

import lombok.RequiredArgsConstructor;

/**
 * Delay strategy that increases the wait time exponentially until a max time has been reached.
 */
@RequiredArgsConstructor
public class ExponentialBackoffDelayStrategy implements DelayStrategy {
    private final long maxDelayInMillis;

    @Override
    public long nextDelay(WaitContext context) {
        long delay = (long) Math.pow(2, context.getAttemptsMade());
        delay *= 1000;
        if (delay <= 0) {
            return maxDelayInMillis;
        }
        return Math.min(delay, maxDelayInMillis);
    }
}
