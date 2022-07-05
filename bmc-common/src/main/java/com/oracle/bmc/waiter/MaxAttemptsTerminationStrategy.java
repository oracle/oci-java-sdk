/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

/**
 * Termination strategy that allows up to X attempts before terminating.
 */
public class MaxAttemptsTerminationStrategy implements TerminationStrategy {
    /**
     * The maximum number of attempts to make.
     */
    private final int maxAttempts;

    @Override
    public boolean shouldTerminate(WaitContext context) {
        return context.getAttemptsMade() >= maxAttempts;
    }

    @java.beans.ConstructorProperties({"maxAttempts"})
    public MaxAttemptsTerminationStrategy(final int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MaxAttemptsTerminationStrategy(maxAttempts=" + this.getMaxAttempts() + ")";
    }

    /**
     * The maximum number of attempts to make.
     */
    public int getMaxAttempts() {
        return this.maxAttempts;
    }
}
