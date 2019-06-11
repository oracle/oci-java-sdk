/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Termination strategy that allows up to X attempts before terminating.
 */
@RequiredArgsConstructor
@ToString
public class MaxAttemptsTerminationStrategy implements TerminationStrategy {
    /**
     * The maximum number of attempts to make.
     */
    private final int maxAttempts;

    @Override
    public boolean shouldTerminate(WaitContext context) {
        return context.getAttemptsMade() >= maxAttempts;
    }
}
