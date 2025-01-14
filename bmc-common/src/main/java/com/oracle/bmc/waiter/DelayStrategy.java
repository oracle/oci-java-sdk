/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

/** Interface that defines how long to wait between poll attempts. */
public interface DelayStrategy {
    /**
     * Returns the amount of time to wait (in millis) before making another poll attempt.
     *
     * @param context The context after the last attempt.
     * @return The amount of time to wait, in millis.
     */
    long nextDelay(WaitContext context);
}
