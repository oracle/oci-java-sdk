/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

public class MaxTimeTerminationStrategyTest {
    private final MaxTimeTerminationStrategy STRATEGY = new MaxTimeTerminationStrategy(1000L);

    @Test
    public void shouldTerminate_greater() {
        WaitContext context = new WaitContext(0L);
        context.setCurrentTime(1500L);
        assertTrue(STRATEGY.shouldTerminate(context));
    }

    @Test
    public void shouldTerminate_equal() {
        WaitContext context = new WaitContext(0L);
        context.setCurrentTime(1000L);
        assertTrue(STRATEGY.shouldTerminate(context));
    }

    @Test
    public void shouldNotTerminate() {
        WaitContext context = new WaitContext(0L);
        context.setCurrentTime(500L);
        assertFalse(STRATEGY.shouldTerminate(context));
    }
}
