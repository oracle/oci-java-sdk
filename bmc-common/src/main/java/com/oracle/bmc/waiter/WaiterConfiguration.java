/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waiter;

/** Configuration used when invoking a waiter loop. */
public class WaiterConfiguration {
    private final TerminationStrategy terminationStrategy;
    private final DelayStrategy delayStrategy;

    /** The context that should be maintained by the wait loop. */
    public static class WaitContext {
        /** The time the polling starting (ex, System.currentTimeMillis()). */
        private final long startTime;
        /** The number of attempts that have been made so far. */
        private int attemptsMade;
        /** The current time (ex, System.currentTimeMillis()). Exposed for tests. */
        private long currentTime;

        // currentTime = startTime as well
        public WaitContext(long startTime) {
            this.startTime = startTime;
            this.attemptsMade = 0;
            this.currentTime = startTime;
        }

        // exposed for tests
        void setCurrentTime(long currentTime) {
            this.currentTime = currentTime;
        }

        /** Increments the number of attempts made. */
        public void incrementAttempts() {
            this.attemptsMade++;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "WaiterConfiguration.WaitContext(startTime="
                    + this.getStartTime()
                    + ", attemptsMade="
                    + this.getAttemptsMade()
                    + ", currentTime="
                    + this.getCurrentTime()
                    + ")";
        }

        public long getStartTime() {
            return this.startTime;
        }

        public int getAttemptsMade() {
            return this.attemptsMade;
        }

        public long getCurrentTime() {
            return this.currentTime;
        }
    }

    public TerminationStrategy getTerminationStrategy() {
        return this.terminationStrategy;
    }

    public DelayStrategy getDelayStrategy() {
        return this.delayStrategy;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "WaiterConfiguration(terminationStrategy="
                + this.getTerminationStrategy()
                + ", delayStrategy="
                + this.getDelayStrategy()
                + ")";
    }

    @java.beans.ConstructorProperties({"terminationStrategy", "delayStrategy"})
    public WaiterConfiguration(
            final TerminationStrategy terminationStrategy, final DelayStrategy delayStrategy) {
        this.terminationStrategy = terminationStrategy;
        this.delayStrategy = delayStrategy;
    }
}
