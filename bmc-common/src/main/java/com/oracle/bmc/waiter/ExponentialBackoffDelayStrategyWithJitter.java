/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

/** Delay strategy that increases the wait time exponentially until a max time has been reached. */
public class ExponentialBackoffDelayStrategyWithJitter extends ExponentialBackoffDelayStrategy {

    public ExponentialBackoffDelayStrategyWithJitter(long maxDelayInMillis) {
        super(maxDelayInMillis);
    }

    @Override
    public long nextDelay(WaiterConfiguration.WaitContext context) {
        double random = Math.random();
        long jitterValue = Math.round(random * 1000);
        long delay = super.nextDelay(context) + jitterValue;
        return delay;
    }
}
