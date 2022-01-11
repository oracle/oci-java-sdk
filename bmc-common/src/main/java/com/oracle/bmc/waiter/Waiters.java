/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import javax.annotation.Nullable;

public class Waiters {

    /**
     * Default polling delay strategy is to use exponential backoff with a max
     * of 30 seconds between attempts.
     */
    public static final DelayStrategy DEFAULT_POLLING_DELAY_STRATEGY =
            new ExponentialBackoffDelayStrategy(secondsToMillis(30));

    /**
     * Default polling termination strategy is to wait up to 20 mins.
     */
    public static final TerminationStrategy DEFAULT_POLLING_TERMINATION_STRATEGY =
            new MaxTimeTerminationStrategy(secondsToMillis(1200));

    /**
     * The default OCI polling waiter that will be used. Configured using
     * {@link #DEFAULT_POLLING_TERMINATION_STRATEGY} and
     * {@link #DEFAULT_POLLING_DELAY_STRATEGY}.
     */
    public static final BmcGenericWaiter DEFAULT_POLLING_WAITER =
            new BmcGenericWaiter(
                    DEFAULT_POLLING_TERMINATION_STRATEGY, DEFAULT_POLLING_DELAY_STRATEGY);

    /**
     * Creates a new waiter using the given strategies. If any of the args are
     * null, the default strategy listed in this class will be used.
     *
     * @param terminationStrategy
     *            The termination strategy.
     * @param delayStrategy
     *            The delay strategy.
     * @return A new waiter instance.
     */
    public static BmcGenericWaiter newWaiter(
            @Nullable TerminationStrategy terminationStrategy,
            @Nullable DelayStrategy delayStrategy) {
        TerminationStrategy terminationStrategyToUse =
                terminationStrategy != null
                        ? terminationStrategy
                        : DEFAULT_POLLING_TERMINATION_STRATEGY;
        DelayStrategy delayStrategyToUse =
                delayStrategy != null ? delayStrategy : DEFAULT_POLLING_DELAY_STRATEGY;
        return new BmcGenericWaiter(terminationStrategyToUse, delayStrategyToUse);
    }

    private static long secondsToMillis(int seconds) {
        return seconds * 1000L;
    }
}
