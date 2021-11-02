/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.waiter.DelayStrategy;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategyWithJitter;
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
    public static final RetryConfiguration NO_RETRY_CONFIGURATION =
            RetryConfiguration.builder().build();

    public static final RetryConfiguration SDK_DEFAULT_RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(8))
                    .delayStrategy(new ExponentialBackoffDelayStrategyWithJitter(30))
                    .retryCondition(
                            exception -> new DefaultRetryCondition().shouldBeRetried(exception))
                    .build();

    @Getter private final RetryCondition retryCondition;
    @Getter private final RetryOptions retryOptions;

    private RetryConfiguration(
            @NonNull final TerminationStrategy terminationStrategy,
            @NonNull final DelayStrategy delayStrategy,
            @NonNull final RetryCondition retryCondition,
            @NonNull final RetryOptions retryOptions) {
        super(terminationStrategy, delayStrategy);
        this.retryCondition = retryCondition;
        this.retryOptions = retryOptions;
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
        private static final RetryOptions DEFAULT_RETRY_OPTIONS =
                new RetryOptions(Integer.MAX_VALUE);

        private TerminationStrategy terminationStrategy = NO_RETRY_TERMINATION_STRATEGY;
        private DelayStrategy delayStrategy = EXPONENTIAL_BACKOFF_DELAY_STRATEGY;
        private RetryCondition retryCondition = new DefaultRetryCondition();
        private RetryOptions retryOptions = DEFAULT_RETRY_OPTIONS;

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

        public Builder retryOptions(@NonNull final RetryOptions retryOptions) {
            this.retryOptions = retryOptions;
            return this;
        }

        /**
         * Build the retry configuration
         * @return the retry configuration
         */
        public RetryConfiguration build() {
            return new RetryConfiguration(
                    terminationStrategy, delayStrategy, retryCondition, retryOptions);
        }
    }
}
