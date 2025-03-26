/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import com.oracle.bmc.retrier.RetryConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExponentialBackoffDelayStrategyWithJitterTest {

    @Test
    public void testDelayStrategyWithDefaultMaxWaitTime() {
        for (int i = 0; i < 1000; ++i) {
            ExponentialBackoffDelayStrategyWithJitter strategy =
                    new ExponentialBackoffDelayStrategyWithJitter(
                            RetryConfiguration.DEFAULT_MAX_WAIT_TIME);
            WaiterConfiguration.WaitContext context =
                    new WaiterConfiguration.WaitContext(System.currentTimeMillis());
            assertInBounds(1000L, 2000L, strategy.nextDelay(context));
            context.incrementAttempts();
            assertInBounds(2000L, 3000L, strategy.nextDelay(context));
            context.incrementAttempts();
            assertInBounds(4000L, 5000L, strategy.nextDelay(context));
            context.incrementAttempts();
            assertInBounds(8000L, 9000L, strategy.nextDelay(context));
            context.incrementAttempts();
            assertInBounds(1600L, 17000L, strategy.nextDelay(context));
            context.incrementAttempts();
            assertInBounds(30000L, 31000L, strategy.nextDelay(context));
            context.incrementAttempts();
            assertInBounds(30000L, 31000L, strategy.nextDelay(context));
        }
    }

    @Test
    public void testDelayStrategyWithCustomMaxWaitTime() {
        for (int i = 0; i < 1000; ++i) {
            ExponentialBackoffDelayStrategyWithJitter strategy =
                    new ExponentialBackoffDelayStrategyWithJitter(2000);
            WaiterConfiguration.WaitContext context =
                    new WaiterConfiguration.WaitContext(System.currentTimeMillis());
            assertInBounds(1000L, 2000L, strategy.nextDelay(context));
            context.incrementAttempts();
            assertInBounds(2000L, 3000L, strategy.nextDelay(context));
            context.incrementAttempts();
            assertInBounds(2000L, 3000L, strategy.nextDelay(context));
            context.incrementAttempts();
            assertInBounds(2000L, 3000L, strategy.nextDelay(context));
        }
    }

    /**
     * Assert that the actual value is in the bounds (both are inclusive, since {@link ExponentialBackoffDelayStrategyWithJitter}
     * uses {@link Math#round(double)}, which can give us 1000 ms of jitter.
     * @param minInclusive inclusive minimum
     * @param maxInclusive inclusive maximum
     * @param actual actual value
     */
    public static void assertInBounds(long minInclusive, long maxInclusive, long actual) {
        assertTrue("Actual value was " + actual, actual >= minInclusive && actual <= maxInclusive);
    }
}
