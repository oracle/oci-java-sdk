/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
