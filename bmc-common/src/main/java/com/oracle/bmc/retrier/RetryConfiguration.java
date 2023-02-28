/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.retrier;

import com.oracle.bmc.waiter.DelayStrategy;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategy;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategyWithJitter;
import com.oracle.bmc.waiter.MaxAttemptsTerminationStrategy;
import com.oracle.bmc.waiter.TerminationStrategy;
import com.oracle.bmc.waiter.WaiterConfiguration;
import jakarta.annotation.Nonnull;
import java.util.concurrent.TimeUnit;

/**
 * Configuration used for retrying.
 *
 * <p>The default termination strategy is a single attempt (i.e. no retry). The default delay
 * strategy is an exponential backoff strategy to a max wait of 30 seconds. The default retry
 * condition is {@link DefaultRetryCondition}.
 */
public class RetryConfiguration extends WaiterConfiguration {
    public static final RetryConfiguration NO_RETRY_CONFIGURATION =
            RetryConfiguration.builder().build();

    public static final int DEFAULT_MAX_RETRY_ATTEMPTS = 8;
    public static final long DEFAULT_MAX_WAIT_TIME = TimeUnit.SECONDS.toMillis(30);

    public static final RetryConfiguration SDK_DEFAULT_RETRY_CONFIGURATION =
            RetryConfiguration.builder()
                    .terminationStrategy(new MaxAttemptsTerminationStrategy(8))
                    .delayStrategy(new ExponentialBackoffDelayStrategyWithJitter(30))
                    .terminationStrategy(
                            new MaxAttemptsTerminationStrategy(DEFAULT_MAX_RETRY_ATTEMPTS))
                    .delayStrategy(
                            new ExponentialBackoffDelayStrategyWithJitter(DEFAULT_MAX_WAIT_TIME))
                    .retryCondition(
                            exception -> new DefaultRetryCondition().shouldBeRetried(exception))
                    .build();

    private final RetryCondition retryCondition;
    private final RetryOptions retryOptions;

    private RetryConfiguration(
            @Nonnull final TerminationStrategy terminationStrategy,
            @Nonnull final DelayStrategy delayStrategy,
            @Nonnull final RetryCondition retryCondition,
            @Nonnull final RetryOptions retryOptions) {
        super(terminationStrategy, delayStrategy);
        if (terminationStrategy == null) {
            throw new java.lang.NullPointerException(
                    "terminationStrategy is marked non-null but is null");
        }
        if (delayStrategy == null) {
            throw new java.lang.NullPointerException(
                    "delayStrategy is marked non-null but is null");
        }
        if (retryCondition == null) {
            throw new java.lang.NullPointerException(
                    "retryCondition is marked non-null but is null");
        }
        if (retryOptions == null) {
            throw new java.lang.NullPointerException("retryOptions is marked non-null but is null");
        }
        this.retryCondition = retryCondition;
        this.retryOptions = retryOptions;
    }

    /**
     * Create a builder for retry configuration
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /** Builder class for retry configuration. */
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

        public Builder terminationStrategy(@Nonnull final TerminationStrategy terminationStrategy) {
            if (terminationStrategy == null) {
                throw new java.lang.NullPointerException(
                        "terminationStrategy is marked non-null but is null");
            }
            this.terminationStrategy = terminationStrategy;
            return this;
        }

        public Builder delayStrategy(@Nonnull final DelayStrategy delayStrategy) {
            if (delayStrategy == null) {
                throw new java.lang.NullPointerException(
                        "delayStrategy is marked non-null but is null");
            }
            this.delayStrategy = delayStrategy;
            return this;
        }

        public Builder retryCondition(@Nonnull final RetryCondition retryCondition) {
            if (retryCondition == null) {
                throw new java.lang.NullPointerException(
                        "retryCondition is marked non-null but is null");
            }
            this.retryCondition = retryCondition;
            return this;
        }

        public Builder retryOptions(@Nonnull final RetryOptions retryOptions) {
            if (retryOptions == null) {
                throw new java.lang.NullPointerException(
                        "retryOptions is marked non-null but is null");
            }
            this.retryOptions = retryOptions;
            return this;
        }

        /**
         * Build the retry configuration
         *
         * @return the retry configuration
         */
        public RetryConfiguration build() {
            return new RetryConfiguration(
                    terminationStrategy, delayStrategy, retryCondition, retryOptions);
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "RetryConfiguration(super="
                + super.toString()
                + ", retryCondition="
                + this.getRetryCondition()
                + ", retryOptions="
                + this.getRetryOptions()
                + ")";
    }

    public RetryCondition getRetryCondition() {
        return this.retryCondition;
    }

    public RetryOptions getRetryOptions() {
        return this.retryOptions;
    }
}
