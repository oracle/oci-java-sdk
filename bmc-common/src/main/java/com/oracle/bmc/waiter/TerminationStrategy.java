/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

/**
 * Defines the strategy that determines when no more poll attempts should be
 * made.
 */
public interface TerminationStrategy {
    /**
     * Returns whether or not polling should be terminated.
     *
     * @param context
     *            The context after the last poll attempt.
     * @return true to terminate polling, false to continue.
     */
    boolean shouldTerminate(WaitContext context);
}
