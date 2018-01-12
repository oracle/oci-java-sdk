/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

/**
 * Interface that defines how long to wait between poll attempts.
 */
public interface DelayStrategy {
    /**
     * Returns the amount of time to wait (in millis) before making another poll
     * attempt.
     *
     * @param context
     *            The context after the last attempt.
     * @return The amount of time to wait, in millis.
     */
    long nextDelay(WaitContext context);
}
