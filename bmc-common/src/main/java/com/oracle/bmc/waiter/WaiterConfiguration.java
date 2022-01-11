/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Configuration used when invoking a waiter loop.
 */
@Getter
@ToString
@RequiredArgsConstructor
public class WaiterConfiguration {
    private final TerminationStrategy terminationStrategy;
    private final DelayStrategy delayStrategy;

    /**
     * The context that should be maintained by the wait loop.
     */
    @ToString
    public static class WaitContext {
        /**
         * The time the polling starting (ex, System.currentTimeMillis()).
         */
        @Getter private final long startTime;
        /**
         * The number of attempts that have been made so far.
         */
        @Getter private int attemptsMade;
        /**
         * The current time (ex, System.currentTimeMillis()).  Exposed for
         * tests.
         */
        @Getter private long currentTime;

        // currentTime = startTime as well
        WaitContext(long startTime) {
            this.startTime = startTime;
            this.attemptsMade = 0;
            this.currentTime = startTime;
        }

        // exposed for tests
        void setCurrentTime(long currentTime) {
            this.currentTime = currentTime;
        }

        /**
         * Increments the number of attempts made.
         */
        void incrementAttempts() {
            this.attemptsMade++;
        }
    }
}
