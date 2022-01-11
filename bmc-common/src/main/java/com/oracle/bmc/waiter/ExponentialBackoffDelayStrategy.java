/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Delay strategy that increases the wait time exponentially until a max time has been reached.
 */
@RequiredArgsConstructor
@ToString
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
