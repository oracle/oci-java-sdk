/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A {@link CircuitBreakerConfiguration} configures a circuit breaker
 *
 * <p>Setting an invocation response timeout lower that the slow call threshold will bypass the
 * intended effect of the circuit breaker
 */
public class CircuitBreakerConfiguration {

    public static final int DEFAULT_FAILURE_RATE_THRESHOLD = 80; // Percentage
    public static final int DEFAULT_SLOW_CALL_RATE_THRESHOLD = 100; // Percentage
    public static final int DEFAULT_WAIT_DURATION_IN_OPEN_STATE = 30; // Seconds
    public static final int DEFAULT_PERMITTED_CALLS_IN_HALF_OPEN_STATE = 10;
    public static final int DEFAULT_MINIMUM_NUMBER_OF_CALLS = 10;
    public static final int DEFAULT_SLIDING_WINDOW_SIZE = 120;
    public static final int DEFAULT_SLOW_CALL_DURATION_THRESHOLD = 60; // Minutes
    public static final boolean DEFAULT_WRITABLE_STACK_TRACE_ENABLED = true;
    public static final int NUMBER_OF_RECORDED_HISTORY_RESPONSES = 5;

    public static final int TOO_MANY_REQUESTS = 429;
    public static final int INTERNAL_SERVER_ERROR = 500;
    public static final int SERVICE_UNAVAILABLE = 503;
    public static final int BAD_GATEWAY = 502;
    public static final int GATEWAY_TIMEOUT = 504;

    private final int failureRateThreshold;

    private final int slowCallRateThreshold;

    private final Duration waitDurationInOpenState;

    private final int permittedNumberOfCallsInHalfOpenState;

    private final int minimumNumberOfCalls;

    private final int slidingWindowSize;

    private final Duration slowCallDurationThreshold;

    private final boolean writableStackTraceEnabled;

    private final int numberOfRecordedHistoryResponses;

    /** List of default http error codes to record as circuit breaker failure */
    private final Set<Integer> recordHttpStatuses;

    /**
     * List of exceptions for circuitBreaker to consider as failures, we are limiting the list to
     * subclasses of RuntimeException because all JaxRs exceptions inherit from the RuntimeException
     */
    private final List<Class<? extends RuntimeException>> recordExceptions;

    private final boolean recordProcessingFailures;

    protected CircuitBreakerConfiguration(
            int failureRateThreshold,
            int slowCallRateThreshold,
            Duration waitDurationInOpenState,
            int permittedNumberOfCallsInHalfOpenState,
            int minimumNumberOfCalls,
            int slidingWindowSize,
            Duration slowCallDurationThreshold,
            boolean writableStackTraceEnabled,
            Set<Integer> recordHttpStatuses,
            List<Class<? extends RuntimeException>> recordExceptions,
            boolean recordProcessingFailures) {
        this(
                failureRateThreshold,
                slowCallRateThreshold,
                waitDurationInOpenState,
                permittedNumberOfCallsInHalfOpenState,
                minimumNumberOfCalls,
                slidingWindowSize,
                slowCallDurationThreshold,
                writableStackTraceEnabled,
                recordHttpStatuses,
                recordExceptions,
                recordProcessingFailures,
                NUMBER_OF_RECORDED_HISTORY_RESPONSES);
    }

    /**
     * Use {@link #builder()} instead.
     *
     * @param failureRateThreshold
     * @param slowCallRateThreshold
     * @param waitDurationInOpenState
     * @param permittedNumberOfCallsInHalfOpenState
     * @param minimumNumberOfCalls
     * @param slidingWindowSize
     * @param slowCallDurationThreshold
     * @param writableStackTraceEnabled
     * @param recordHttpStatuses
     * @param recordExceptions
     * @param recordProcessingFailures
     * @param numberOfRecordedHistoryResponses
     */
    @java.beans.ConstructorProperties({
        "failureRateThreshold",
        "slowCallRateThreshold",
        "waitDurationInOpenState",
        "permittedNumberOfCallsInHalfOpenState",
        "minimumNumberOfCalls",
        "slidingWindowSize",
        "slowCallDurationThreshold",
        "writableStackTraceEnabled",
        "recordHttpStatuses",
        "recordExceptions",
        "numberOfRecordedHistoryResponses"
    })
    protected CircuitBreakerConfiguration(
            int failureRateThreshold,
            int slowCallRateThreshold,
            Duration waitDurationInOpenState,
            int permittedNumberOfCallsInHalfOpenState,
            int minimumNumberOfCalls,
            int slidingWindowSize,
            Duration slowCallDurationThreshold,
            boolean writableStackTraceEnabled,
            Set<Integer> recordHttpStatuses,
            List<Class<? extends RuntimeException>> recordExceptions,
            boolean recordProcessingFailures,
            int numberOfRecordedHistoryResponses) {
        this.failureRateThreshold = failureRateThreshold;
        this.slowCallRateThreshold = slowCallRateThreshold;
        this.waitDurationInOpenState = waitDurationInOpenState;
        this.permittedNumberOfCallsInHalfOpenState = permittedNumberOfCallsInHalfOpenState;
        this.minimumNumberOfCalls = minimumNumberOfCalls;
        this.slidingWindowSize = slidingWindowSize;
        this.slowCallDurationThreshold = slowCallDurationThreshold;
        this.writableStackTraceEnabled = writableStackTraceEnabled;
        this.recordHttpStatuses = recordHttpStatuses;
        this.recordExceptions = recordExceptions;
        this.recordProcessingFailures = recordProcessingFailures;
        this.numberOfRecordedHistoryResponses = numberOfRecordedHistoryResponses;
    }

    public CircuitBreakerConfiguration() {
        this.failureRateThreshold = DEFAULT_FAILURE_RATE_THRESHOLD;
        this.slowCallRateThreshold = DEFAULT_SLOW_CALL_RATE_THRESHOLD;
        this.waitDurationInOpenState = Duration.ofSeconds(DEFAULT_WAIT_DURATION_IN_OPEN_STATE);
        this.permittedNumberOfCallsInHalfOpenState = DEFAULT_PERMITTED_CALLS_IN_HALF_OPEN_STATE;
        this.minimumNumberOfCalls = DEFAULT_MINIMUM_NUMBER_OF_CALLS;
        this.slidingWindowSize = DEFAULT_SLIDING_WINDOW_SIZE;
        this.slowCallDurationThreshold = Duration.ofMinutes(DEFAULT_SLOW_CALL_DURATION_THRESHOLD);
        this.writableStackTraceEnabled = DEFAULT_WRITABLE_STACK_TRACE_ENABLED;
        this.recordHttpStatuses = defaultRecordHttpStatuses();
        this.recordExceptions = defaultRecordExceptions();
        this.recordProcessingFailures = true;
        this.numberOfRecordedHistoryResponses = NUMBER_OF_RECORDED_HISTORY_RESPONSES;
    }

    private static Set<Integer> defaultRecordHttpStatuses() {
        return Collections.unmodifiableSet(
                new HashSet<>(
                        Arrays.asList(
                                TOO_MANY_REQUESTS,
                                INTERNAL_SERVER_ERROR,
                                BAD_GATEWAY,
                                SERVICE_UNAVAILABLE,
                                GATEWAY_TIMEOUT)));
    }

    private static List<Class<? extends RuntimeException>> defaultRecordExceptions() {
        return Collections.emptyList();
    }

    public static CircuitBreakerConfigurationBuilder builder() {
        return new CircuitBreakerConfigurationBuilder();
    }

    public int getFailureRateThreshold() {
        return this.failureRateThreshold;
    }

    public int getSlowCallRateThreshold() {
        return this.slowCallRateThreshold;
    }

    public Duration getWaitDurationInOpenState() {
        return this.waitDurationInOpenState;
    }

    public int getPermittedNumberOfCallsInHalfOpenState() {
        return this.permittedNumberOfCallsInHalfOpenState;
    }

    public int getMinimumNumberOfCalls() {
        return this.minimumNumberOfCalls;
    }

    public int getSlidingWindowSize() {
        return this.slidingWindowSize;
    }

    public Duration getSlowCallDurationThreshold() {
        return this.slowCallDurationThreshold;
    }

    public boolean isWritableStackTraceEnabled() {
        return this.writableStackTraceEnabled;
    }

    public int getNumberOfRecordedHistoryResponses() {
        return this.numberOfRecordedHistoryResponses;
    }

    public Set<Integer> getRecordHttpStatuses() {
        return this.recordHttpStatuses;
    }

    public List<Class<? extends RuntimeException>> getRecordExceptions() {
        return this.recordExceptions;
    }

    public boolean isRecordProcessingFailures() {
        return recordProcessingFailures;
    }

    public static class CircuitBreakerConfigurationBuilder {
        private int failureRateThreshold$value;
        private boolean failureRateThreshold$set;
        private int slowCallRateThreshold$value;
        private boolean slowCallRateThreshold$set;
        private Duration waitDurationInOpenState$value;
        private boolean waitDurationInOpenState$set;
        private int permittedNumberOfCallsInHalfOpenState$value;
        private boolean permittedNumberOfCallsInHalfOpenState$set;
        private int minimumNumberOfCalls$value;
        private boolean minimumNumberOfCalls$set;
        private int slidingWindowSize$value;
        private boolean slidingWindowSize$set;
        private Duration slowCallDurationThreshold$value;
        private boolean slowCallDurationThreshold$set;
        private boolean writableStackTraceEnabled$value;
        private boolean writableStackTraceEnabled$set;
        private Set<Integer> recordHttpStatuses$value;
        private boolean recordHttpStatuses$set;
        private List<Class<? extends RuntimeException>> recordExceptions$value;
        private boolean recordExceptions$set;
        private boolean recordProcessingFailures = true;
        private int numberOfRecordedHistoryResponses$value;
        private boolean numberOfRecordedHistoryResponses$set;

        CircuitBreakerConfigurationBuilder() {}

        public CircuitBreakerConfigurationBuilder failureRateThreshold(int failureRateThreshold) {
            this.failureRateThreshold$value = failureRateThreshold;
            this.failureRateThreshold$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder slowCallRateThreshold(int slowCallRateThreshold) {
            this.slowCallRateThreshold$value = slowCallRateThreshold;
            this.slowCallRateThreshold$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder waitDurationInOpenState(
                Duration waitDurationInOpenState) {
            this.waitDurationInOpenState$value = waitDurationInOpenState;
            this.waitDurationInOpenState$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder permittedNumberOfCallsInHalfOpenState(
                int permittedNumberOfCallsInHalfOpenState) {
            this.permittedNumberOfCallsInHalfOpenState$value =
                    permittedNumberOfCallsInHalfOpenState;
            this.permittedNumberOfCallsInHalfOpenState$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder minimumNumberOfCalls(int minimumNumberOfCalls) {
            this.minimumNumberOfCalls$value = minimumNumberOfCalls;
            this.minimumNumberOfCalls$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder slidingWindowSize(int slidingWindowSize) {
            this.slidingWindowSize$value = slidingWindowSize;
            this.slidingWindowSize$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder slowCallDurationThreshold(
                Duration slowCallDurationThreshold) {
            this.slowCallDurationThreshold$value = slowCallDurationThreshold;
            this.slowCallDurationThreshold$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder writableStackTraceEnabled(
                boolean writableStackTraceEnabled) {
            this.writableStackTraceEnabled$value = writableStackTraceEnabled;
            this.writableStackTraceEnabled$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder recordHttpStatuses(
                Set<Integer> recordHttpStatuses) {
            this.recordHttpStatuses$value = recordHttpStatuses;
            this.recordHttpStatuses$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder recordExceptions(
                List<Class<? extends RuntimeException>> recordExceptions) {
            this.recordExceptions$value = recordExceptions;
            this.recordExceptions$set = true;
            return this;
        }

        public CircuitBreakerConfigurationBuilder recordProcessingFailures(
                boolean recordProcessingFailures) {
            this.recordProcessingFailures = recordProcessingFailures;
            return this;
        }

        public CircuitBreakerConfigurationBuilder numberOfRecordedHistoryResponses(
                int numberOfRecordedHistoryResponses) {
            this.numberOfRecordedHistoryResponses$value = numberOfRecordedHistoryResponses;
            this.numberOfRecordedHistoryResponses$set = true;
            return this;
        }

        public CircuitBreakerConfiguration build() {
            int failureRateThreshold$value = this.failureRateThreshold$value;
            if (!this.failureRateThreshold$set) {
                failureRateThreshold$value = DEFAULT_FAILURE_RATE_THRESHOLD;
            }
            int slowCallRateThreshold$value = this.slowCallRateThreshold$value;
            if (!this.slowCallRateThreshold$set) {
                slowCallRateThreshold$value = DEFAULT_SLOW_CALL_RATE_THRESHOLD;
            }
            Duration waitDurationInOpenState$value = this.waitDurationInOpenState$value;
            if (!this.waitDurationInOpenState$set) {
                waitDurationInOpenState$value =
                        Duration.ofSeconds(DEFAULT_WAIT_DURATION_IN_OPEN_STATE);
                ;
            }
            int permittedNumberOfCallsInHalfOpenState$value =
                    this.permittedNumberOfCallsInHalfOpenState$value;
            if (!this.permittedNumberOfCallsInHalfOpenState$set) {
                permittedNumberOfCallsInHalfOpenState$value =
                        DEFAULT_PERMITTED_CALLS_IN_HALF_OPEN_STATE;
            }
            int minimumNumberOfCalls$value = this.minimumNumberOfCalls$value;
            if (!this.minimumNumberOfCalls$set) {
                minimumNumberOfCalls$value = DEFAULT_MINIMUM_NUMBER_OF_CALLS;
            }
            int slidingWindowSize$value = this.slidingWindowSize$value;
            if (!this.slidingWindowSize$set) {
                slidingWindowSize$value = DEFAULT_SLIDING_WINDOW_SIZE;
            }
            Duration slowCallDurationThreshold$value = this.slowCallDurationThreshold$value;
            if (!this.slowCallDurationThreshold$set) {
                slowCallDurationThreshold$value =
                        Duration.ofMinutes(DEFAULT_SLOW_CALL_DURATION_THRESHOLD);
            }
            boolean writableStackTraceEnabled$value = this.writableStackTraceEnabled$value;
            if (!this.writableStackTraceEnabled$set) {
                writableStackTraceEnabled$value = DEFAULT_WRITABLE_STACK_TRACE_ENABLED;
            }
            Set<Integer> recordHttpStatuses$value = this.recordHttpStatuses$value;
            if (!this.recordHttpStatuses$set) {
                recordHttpStatuses$value = defaultRecordHttpStatuses();
            }
            List<Class<? extends RuntimeException>> recordExceptions$value =
                    this.recordExceptions$value;
            if (!this.recordExceptions$set) {
                recordExceptions$value = defaultRecordExceptions();
            }
            if (!this.numberOfRecordedHistoryResponses$set) {
                numberOfRecordedHistoryResponses$value = NUMBER_OF_RECORDED_HISTORY_RESPONSES;
            }
            return new CircuitBreakerConfiguration(
                    failureRateThreshold$value,
                    slowCallRateThreshold$value,
                    waitDurationInOpenState$value,
                    permittedNumberOfCallsInHalfOpenState$value,
                    minimumNumberOfCalls$value,
                    slidingWindowSize$value,
                    slowCallDurationThreshold$value,
                    writableStackTraceEnabled$value,
                    recordHttpStatuses$value,
                    recordExceptions$value,
                    recordProcessingFailures,
                    numberOfRecordedHistoryResponses$value);
        }

        public String toString() {
            return "CircuitBreakerConfiguration.CircuitBreakerConfigurationBuilder(failureRateThreshold$value="
                    + this.failureRateThreshold$value
                    + ", slowCallRateThreshold$value="
                    + this.slowCallRateThreshold$value
                    + ", waitDurationInOpenState$value="
                    + this.waitDurationInOpenState$value
                    + ", permittedNumberOfCallsInHalfOpenState$value="
                    + this.permittedNumberOfCallsInHalfOpenState$value
                    + ", minimumNumberOfCalls$value="
                    + this.minimumNumberOfCalls$value
                    + ", slidingWindowSize$value="
                    + this.slidingWindowSize$value
                    + ", slowCallDurationThreshold$value="
                    + this.slowCallDurationThreshold$value
                    + ", writableStackTraceEnabled$value="
                    + this.writableStackTraceEnabled$value
                    + ", recordHttpStatuses$value="
                    + this.recordHttpStatuses$value
                    + ", recordExceptions$value="
                    + this.recordExceptions$value
                    + ", recordExceptions$value="
                    + this.recordExceptions$value
                    + ", numberOfRecordedHistoryResponses$value="
                    + this.numberOfRecordedHistoryResponses$value
                    + ")";
        }
    }
}
