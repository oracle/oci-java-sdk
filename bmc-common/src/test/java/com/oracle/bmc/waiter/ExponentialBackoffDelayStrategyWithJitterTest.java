/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExponentialBackoffDelayStrategyWithJitterTest {

    @Test
    public void getDelays() {
        ExponentialBackoffDelayStrategyWithJitter strategy =
                new ExponentialBackoffDelayStrategyWithJitter(30000L);
        WaiterConfiguration.WaitContext context =
                new WaiterConfiguration.WaitContext(System.currentTimeMillis());
        assertTrue(strategy.nextDelay(context) > 1000L && strategy.nextDelay(context) < 2000L);
        context.incrementAttempts();
        assertTrue(strategy.nextDelay(context) > 2000L && strategy.nextDelay(context) < 4000L);
        context.incrementAttempts();
        assertTrue(strategy.nextDelay(context) > 4000L && strategy.nextDelay(context) < 8000L);
        context.incrementAttempts();
        assertTrue(strategy.nextDelay(context) > 8000L && strategy.nextDelay(context) < 16000L);
        context.incrementAttempts();
        assertTrue(strategy.nextDelay(context) > 16000L && strategy.nextDelay(context) < 30000L);
        context.incrementAttempts();
        assertTrue(strategy.nextDelay(context) > 30000L && strategy.nextDelay(context) < 31000);
        context.incrementAttempts();
        assertTrue(strategy.nextDelay(context) > 30000L && strategy.nextDelay(context) < 31000);
    }
}
