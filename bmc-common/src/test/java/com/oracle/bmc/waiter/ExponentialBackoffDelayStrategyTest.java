/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
