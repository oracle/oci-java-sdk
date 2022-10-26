/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;

public interface OciCircuitBreaker {
    CircuitBreaker getR4jCircuitBreaker();

    /**
     * Returns the name of this CircuitBreaker.
     *
     * @return the name of this CircuitBreaker
     */
    String getName();

    /**
     * Returns the state of this CircuitBreaker.
     *
     * @return the state of this CircuitBreaker
     */
    CircuitBreaker.State getState();

    /**
     * Acquires a permission to execute a call, only if one is available at the time of invocation.
     * If a call is not permitted, the number of not permitted calls is increased.
     *
     * <p>Returns false when the state is OPEN or FORCED_OPEN. Returns true when the state is CLOSED
     * or DISABLED. Returns true when the state is HALF_OPEN and further test calls are allowed.
     * Returns false when the state is HALF_OPEN and the number of test calls has been reached. If
     * the state is HALF_OPEN, the number of allowed test calls is decreased. Important: Make sure
     * to call onSuccess or onError after the call is finished. If the call is cancelled before it
     * is invoked, you have to release the permission again.
     *
     * @return {@code true} if a permission was acquired and {@code false} otherwise
     */
    boolean tryAcquirePermission();

    /**
     * Releases a permission.
     *
     * <p>Should only be used when a permission was acquired but not used. Otherwise use {@link
     * CircuitBreaker#onSuccess(long, TimeUnit)} or {@link CircuitBreaker#onError(long, TimeUnit,
     * Throwable)} to signal a completed or failed call.
     *
     * <p>If the state is HALF_OPEN, the number of allowed test calls is increased by one.
     */
    void releasePermission();

    /**
     * Try to obtain a permission to execute a call. If a call is not permitted, the number of not
     * permitted calls is increased.
     *
     * <p>Throws a CallNotPermittedException when the state is OPEN or FORCED_OPEN. Returns when the
     * state is CLOSED or DISABLED. Returns when the state is HALF_OPEN and further test calls are
     * allowed. Throws a CallNotPermittedException when the state is HALF_OPEN and the number of
     * test calls has been reached. If the state is HALF_OPEN, the number of allowed test calls is
     * decreased. Important: Make sure to call onSuccess or onError after the call is finished. If
     * the call is cancelled before it is invoked, you have to release the permission again.
     *
     * @throws CallNotPermittedException when CircuitBreaker is OPEN or HALF_OPEN and no further
     *     test calls are permitted.
     */
    void acquirePermission();

    /**
     * Returns the current time with respect to the CircuitBreaker currentTimeFunction. Returns
     * System.nanoTime() by default.
     *
     * @return current timestamp
     */
    long getCurrentTimestamp();

    /**
     * Returns the timeUnit of current timestamp. Default is TimeUnit.NANOSECONDS.
     *
     * @return the timeUnit of current timestamp
     */
    TimeUnit getTimestampUnit();

    /**
     * Records a failed call. This method must be invoked when a call failed.
     *
     * @param duration The elapsed time duration of the call
     * @param durationUnit The duration unit
     * @param throwable The throwable which must be recorded
     */
    void onError(long duration, TimeUnit durationUnit, Throwable throwable);

    /**
     * Records a successful call. This method must be invoked when a call was successful.
     *
     * @param duration The elapsed time duration of the call
     * @param durationUnit The duration unit
     */
    void onSuccess(long duration, TimeUnit durationUnit);

    /**
     * This method must be invoked when a call returned a result and the result predicate should
     * decide if the call was successful or not.
     *
     * @param duration The elapsed time duration of the call
     * @param durationUnit The duration unit
     * @param result The result of the protected function
     */
    void onResult(long duration, TimeUnit durationUnit, Object result);

    /**
     * Returns the CircuitBreakerConfig of this CircuitBreaker.
     *
     * @return the CircuitBreakerConfig of this CircuitBreaker
     */
    Config getCircuitBreakerConfig();

    CallNotAllowedException createCallNotAllowedException();

    String circuitBreakerCallNotPermittedErrorMessage(String requestUri);

    // history

    void addToHistory(Throwable throwable, Integer status, Map<String, String> messages);

    List<ErrorHistoryItem> getHistory();

    String getHistoryAsString();

    interface Config {
        boolean isWritableStackTraceEnabled();

        float getFailureRateThreshold();

        int getSlidingWindowSize();

        Predicate<Throwable> getRecordExceptionPredicate();

        int getMinimumNumberOfCalls();

        int getPermittedNumberOfCallsInHalfOpenState();

        SlidingWindowType getSlidingWindowType();

        float getSlowCallRateThreshold();

        Duration getSlowCallDurationThreshold();

        enum SlidingWindowType {
            TIME_BASED,
            COUNT_BASED
        }

        /**
         * An IntervalFunction which can be used to calculate the wait interval. The input parameter
         * of the function is the number of attempts (attempt), the output parameter the wait
         * interval in milliseconds. The attempt parameter starts at 1 and increases with every
         * further attempt.
         */
        @FunctionalInterface
        interface IntervalFunction extends Function<Integer, Long> {}
    }

    class ErrorHistoryItem {
        private final Throwable throwable;
        private final Integer status;
        private final Map<String, String> messages;

        public ErrorHistoryItem(Throwable throwable, Integer status, Map<String, String> messages) {
            this.throwable = throwable;
            this.messages = messages;
            this.status = status;
        }

        public Throwable getThrowable() {
            return throwable;
        }

        public Map<String, String> getMessages() {
            return messages;
        }

        public int getStatus() {
            return status;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> e : messages.entrySet()) {
                sb.append(e.getKey()).append(": ").append(e.getValue()).append("; ");
            }
            sb.append("status: ").append(status);
            return sb.toString();
        }
    }
}
