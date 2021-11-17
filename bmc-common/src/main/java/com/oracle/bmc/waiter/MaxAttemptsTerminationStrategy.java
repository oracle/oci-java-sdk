/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
    @lombok.Getter private final int maxAttempts;

    @Override
    public boolean shouldTerminate(WaitContext context) {
        return context.getAttemptsMade() >= maxAttempts;
    }
}
