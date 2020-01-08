/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.waiter.DelayStrategy;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import com.oracle.bmc.waiter.TerminationStrategy;
import com.oracle.bmc.waiter.WaiterConfiguration;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import java.util.concurrent.TimeUnit;

/**
 * Configuration used for retrying.
 *
 * The default termination strategy is a single attempt (i.e. no retry).
 * The default delay strategy is an exponential backoff strategy to a max wait of 30 seconds.
 * The default retry condition is {@link DefaultRetryCondition}.
 */
@ToString(callSuper = true)
public class RetryConfiguration extends WaiterConfiguration {
    static final RetryConfiguration NO_RETRY_CONFIGURATION = RetryConfiguration.builder().build();

    @Getter private final RetryCondition retryCondition;

    private RetryConfiguration(
            @NonNull final TerminationStrategy terminationStrategy,
            @NonNull final DelayStrategy delayStrategy,
            @NonNull final RetryCondition retryCondition) {
        super(terminationStrategy, delayStrategy);
        this.retryCondition = retryCondition;
    }

    /**
     * Create a builder for retry configuration
     * @return builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder class for retry configuration.
     */
    public static class Builder {
        private static final TerminationStrategy NO_RETRY_TERMINATION_STRATEGY =
                new MaxAttemptsTerminationStrategy(1);
        private static final DelayStrategy EXPONENTIAL_BACKOFF_DELAY_STRATEGY =
                new ExponentialBackoffDelayStrategy(TimeUnit.SECONDS.toMillis(30));

        private TerminationStrategy terminationStrategy = NO_RETRY_TERMINATION_STRATEGY;
        private DelayStrategy delayStrategy = EXPONENTIAL_BACKOFF_DELAY_STRATEGY;
        private RetryCondition retryCondition = new DefaultRetryCondition();

        public Builder terminationStrategy(@NonNull final TerminationStrategy terminationStrategy) {
            this.terminationStrategy = terminationStrategy;
            return this;
        }

        public Builder delayStrategy(@NonNull final DelayStrategy delayStrategy) {
            this.delayStrategy = delayStrategy;
            return this;
        }

        public Builder retryCondition(@NonNull final RetryCondition retryCondition) {
            this.retryCondition = retryCondition;
            return this;
        }

        /**
         * Build the retry configuration
         * @return the retry configuration
         */
        public RetryConfiguration build() {
            return new RetryConfiguration(terminationStrategy, delayStrategy, retryCondition);
        }
    }
}
