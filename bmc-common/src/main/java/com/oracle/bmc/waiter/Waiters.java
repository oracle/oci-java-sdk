/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
     * The default BMC polling waiter that will be used. Configured using
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
        return seconds * 1000;
    }
}
