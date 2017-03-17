/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waiter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.oracle.bmc.waiter.WaiterConfiguration.WaitContext;

public class ExponentialBackoffDelayStrategyTest {

    @Test
    public void getDelays() {
        ExponentialBackoffDelayStrategy strategy = new ExponentialBackoffDelayStrategy(30000L);
        WaitContext context = new WaitContext(System.currentTimeMillis());
        assertEquals(1000L, strategy.nextDelay(context));
        context.incrementAttempts();
        assertEquals(2000L, strategy.nextDelay(context));
        context.incrementAttempts();
        assertEquals(4000L, strategy.nextDelay(context));
        context.incrementAttempts();
        assertEquals(8000L, strategy.nextDelay(context));
        context.incrementAttempts();
        assertEquals(16000L, strategy.nextDelay(context));
        context.incrementAttempts();
        assertEquals(30000L, strategy.nextDelay(context));
        context.incrementAttempts();
        assertEquals(30000L, strategy.nextDelay(context));
    }

    @Test
    public void getDelays_overflow() {
        ExponentialBackoffDelayStrategy strategy = new ExponentialBackoffDelayStrategy(30000L);
        WaitContext context = new WaitContext(System.currentTimeMillis());
        for (int attempt = 0; attempt < 100; attempt++) {
            context.incrementAttempts();
            assertTrue(strategy.nextDelay(context) > 0);
            assertTrue(strategy.nextDelay(context) <= 30000L);
        }
    }
}
