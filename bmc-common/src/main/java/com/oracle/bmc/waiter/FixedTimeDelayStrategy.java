/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

import lombok.RequiredArgsConstructor;

/**
 * Delay strategy that waits a constant amount of time between poll attempts.
 */
@RequiredArgsConstructor
public class FixedTimeDelayStrategy implements DelayStrategy {
    /**
     * The amount of time to wait (in millis) between each condition check.
     */
    private final long timeBetweenAttempsInMillis;

    @Override
    public long nextDelay(WaitContext context) {
        return timeBetweenAttempsInMillis;
    }
}
