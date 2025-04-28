/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

/** Delay strategy that waits a constant amount of time between poll attempts. */
public class FixedTimeDelayStrategy implements DelayStrategy {
    /** The amount of time to wait (in millis) between each condition check. */
    private final long timeBetweenAttempsInMillis;

    @Override
    public long nextDelay(WaitContext context) {
        return timeBetweenAttempsInMillis;
    }

    @java.beans.ConstructorProperties({"timeBetweenAttempsInMillis"})
    public FixedTimeDelayStrategy(final long timeBetweenAttempsInMillis) {
        this.timeBetweenAttempsInMillis = timeBetweenAttempsInMillis;
    }
}
