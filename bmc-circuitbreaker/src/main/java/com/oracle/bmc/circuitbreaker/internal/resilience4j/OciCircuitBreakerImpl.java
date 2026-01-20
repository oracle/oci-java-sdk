/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal.resilience4j;

import java.time.Clock;
import java.time.Duration;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.circuitbreaker.OciCircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

public class OciCircuitBreakerImpl implements OciCircuitBreaker {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OciCircuitBreakerImpl.class);
    private final CircuitBreaker r4jCircuitBreaker;
    private final int numberOfRecordedHistoryResponses;
    private Deque<ErrorHistoryItem> historyQueue;
    private volatile long openedTimestampMillis;

    public OciCircuitBreakerImpl(
            CircuitBreaker r4jCircuitBreaker, int numberOfRecordedHistoryResponses) {
        if (r4jCircuitBreaker == null) {
            throw new IllegalArgumentException("r4jCircuitBreaker must be non-null");
        }
        if (r4jCircuitBreaker.getName() == null) {
            String circuitBreakerName = "CircuitBreaker" + System.identityHashCode(this);
            r4jCircuitBreaker =
                    CircuitBreaker.of(
                            circuitBreakerName, r4jCircuitBreaker.getCircuitBreakerConfig());
        }
        r4jCircuitBreaker
                .getEventPublisher()
                .onStateTransition(
                        event -> {
                            CircuitBreaker.StateTransition transition = event.getStateTransition();
                            LOG.info(
                                    "Circuit breaker {} transitioned from {} to {}",
                                    getName(),
                                    transition.getFromState(),
                                    transition.getToState());
                            if (transition.getFromState() == CircuitBreaker.State.CLOSED
                                    && transition.getToState() == CircuitBreaker.State.OPEN) {
                                openedTimestampMillis = System.currentTimeMillis();
                            }
                        });

        this.r4jCircuitBreaker = r4jCircuitBreaker;
        this.historyQueue = new ArrayDeque<>();
        this.numberOfRecordedHistoryResponses = numberOfRecordedHistoryResponses;
    }

    public OciCircuitBreakerImpl(
            CircuitBreakerConfiguration circuitBreakerConfiguration,
            Predicate<Throwable> recordExceptionPredicate) {
        this(
                CircuitBreaker.of(
                        "default",
                        CircuitBreakerConfig.custom()
                                .enableAutomaticTransitionFromOpenToHalfOpen()
                                .slidingWindowType(
                                        CircuitBreakerConfig.SlidingWindowType.TIME_BASED)
                                .failureRateThreshold(
                                        circuitBreakerConfiguration.getFailureRateThreshold())
                                .slowCallRateThreshold(
                                        circuitBreakerConfiguration.getSlowCallRateThreshold())
                                .slowCallDurationThreshold(
                                        circuitBreakerConfiguration.getSlowCallDurationThreshold())
                                .permittedNumberOfCallsInHalfOpenState(
                                        circuitBreakerConfiguration
                                                .getPermittedNumberOfCallsInHalfOpenState())
                                .slidingWindowSize(
                                        circuitBreakerConfiguration.getSlidingWindowSize())
                                .minimumNumberOfCalls(
                                        circuitBreakerConfiguration.getMinimumNumberOfCalls())
                                .writableStackTraceEnabled(
                                        circuitBreakerConfiguration.isWritableStackTraceEnabled())
                                .waitDurationInOpenState(
                                        circuitBreakerConfiguration.getWaitDurationInOpenState())
                                .recordExceptions(
                                        circuitBreakerConfiguration
                                                .getRecordExceptions()
                                                .toArray(new Class[0]))
                                .recordException(recordExceptionPredicate)
                                .build()),
                circuitBreakerConfiguration.getNumberOfRecordedHistoryResponses());
    }

    @Override
    public CircuitBreaker getR4jCircuitBreaker() {
        return r4jCircuitBreaker;
    }

    @Override
    public String getName() {
        return r4jCircuitBreaker.getName();
    }

    @Override
    public CircuitBreaker.State getState() {
        return r4jCircuitBreaker.getState();
    }

    @Override
    public boolean tryAcquirePermission() {
        return r4jCircuitBreaker.tryAcquirePermission();
    }

    @Override
    public void releasePermission() {
        r4jCircuitBreaker.releasePermission();
    }

    @Override
    public void acquirePermission() {
        r4jCircuitBreaker.acquirePermission();
    }

    @Override
    public long getCurrentTimestamp() {
        return r4jCircuitBreaker.getCurrentTimestamp();
    }

    @Override
    public TimeUnit getTimestampUnit() {
        return r4jCircuitBreaker.getTimestampUnit();
    }

    @Override
    public void onError(long duration, TimeUnit durationUnit, Throwable throwable) {
        r4jCircuitBreaker.onError(duration, durationUnit, throwable);
    }

    @Override
    public void onSuccess(long duration, TimeUnit durationUnit) {
        r4jCircuitBreaker.onSuccess(duration, durationUnit);
    }

    @Override
    public void onResult(long duration, TimeUnit durationUnit, Object result) {
        r4jCircuitBreaker.onResult(duration, durationUnit, result);
    }

    @Override
    public Config getCircuitBreakerConfig() {
        return new OciCircuitBreakerConfigImpl(r4jCircuitBreaker.getCircuitBreakerConfig());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OciCircuitBreakerImpl that = (OciCircuitBreakerImpl) o;
        return Objects.equals(r4jCircuitBreaker, that.r4jCircuitBreaker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r4jCircuitBreaker);
    }

    @Override
    public String toString() {
        return "OciCircuitBreakerImpl{" + "r4jCircuitBreaker=" + r4jCircuitBreaker + '}';
    }

    @Override
    public CallNotAllowedException createCallNotAllowedException() {
        return CallNotAllowedException.createCallNotAllowedException(
                // message is identical to that from resilience4j CallNotPermittedException
                "CircuitBreaker '"
                        + this.getName()
                        + "' is "
                        + this.getState()
                        + " and does not permit further calls",
                this.getCircuitBreakerConfig().isWritableStackTraceEnabled());
    }

    /**
     * Generates CircuitBreaker message when it's open.
     *
     * @param requestUri the request URI, or null if not known
     * @return a message with error details
     */
    @Override
    public String circuitBreakerCallNotPermittedErrorMessage(String requestUri) {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder
                .append("CircuitBreaker has been OPEN for ")
                .append(getCircuitBreakerOpenTime() / 1000.0)
                .append(" seconds and all the requests sent in a window of ")
                .append(
                        r4jCircuitBreaker
                                .getCircuitBreakerConfig()
                                .getWaitDurationInOpenState()
                                .getSeconds())
                .append(" seconds will be rejected.\n");

        if (requestUri != null) {
            messageBuilder
                    .append("URL which CircuitBreaker rejected is - ")
                    .append(requestUri + "\n");
        }

        String historyAsString = getHistoryAsString();
        int numberOfCurrentRecordsinHistory =
                Math.min(numberOfRecordedHistoryResponses, historyQueue.size());
        if (historyAsString != null && !historyAsString.trim().isEmpty()) {
            messageBuilder
                    .append(
                            "The CircuitBreaker was opened because requests failed too frequently. Here are the last ")
                    .append(numberOfCurrentRecordsinHistory)
                    .append(" failed requests:\n")
                    .append(historyAsString);
        }

        return messageBuilder.toString();
    }

    /**
     * Returns the time in milliseconds since the last opening of the circuit breaker. If the
     * circuit breaker has never been opened, then {@code System.currentTimeMillis()} is returned,
     * which makes it seem like the circuit breaker has been opened since the beginning of epoch.
     * Therefore, this should only be used if the circuit breaker is open.
     *
     * @return time since last opening in milliseconds
     */
    private long getCircuitBreakerOpenTime() {
        return System.currentTimeMillis() - openedTimestampMillis;
    }

    @Override
    public synchronized void addToHistory(
            Throwable throwable, Integer status, Map<String, String> messages) {
        if (historyQueue.size() >= numberOfRecordedHistoryResponses) {
            historyQueue.removeFirst();
        }

        historyQueue.add(new ErrorHistoryItem(throwable, status, messages));
    }

    @Override
    public synchronized List<ErrorHistoryItem> getHistory() {
        return Collections.unmodifiableList(new ArrayList<>(historyQueue));
    }

    @Override
    public synchronized String getHistoryAsString() {
        StringBuilder sb = new StringBuilder();
        int index = 1;
        for (ErrorHistoryItem item : historyQueue) {
            if (index > 1) {
                sb.append(System.lineSeparator());
            }
            sb.append(index).append(". ").append(item.toString());
            ++index;
        }
        return sb.toString();
    }

    public static class OciCircuitBreakerConfigImpl implements Config {
        private final CircuitBreakerConfig r4jConfig;

        public OciCircuitBreakerConfigImpl(CircuitBreakerConfig r4jConfig) {
            this.r4jConfig = r4jConfig;
        }

        @Override
        public boolean isWritableStackTraceEnabled() {
            return r4jConfig.isWritableStackTraceEnabled();
        }

        @Override
        public float getFailureRateThreshold() {
            return r4jConfig.getFailureRateThreshold();
        }

        public IntervalFunction getWaitIntervalFunctionInOpenState() {
            return numberOfAttempts ->
                    r4jConfig.getWaitIntervalFunctionInOpenState().apply(numberOfAttempts);
        }

        @Override
        public int getSlidingWindowSize() {
            return r4jConfig.getSlidingWindowSize();
        }

        @Override
        public Predicate<Throwable> getRecordExceptionPredicate() {
            return r4jConfig.getRecordExceptionPredicate();
        }

        public Predicate<Object> getRecordResultPredicate() {
            return r4jConfig.getRecordResultPredicate();
        }

        public Predicate<Throwable> getIgnoreExceptionPredicate() {
            return r4jConfig.getIgnoreExceptionPredicate();
        }

        public Function<Clock, Long> getCurrentTimestampFunction() {
            return r4jConfig.getCurrentTimestampFunction();
        }

        public TimeUnit getTimestampUnit() {
            return r4jConfig.getTimestampUnit();
        }

        public boolean isAutomaticTransitionFromOpenToHalfOpenEnabled() {
            return r4jConfig.isAutomaticTransitionFromOpenToHalfOpenEnabled();
        }

        @Override
        public int getMinimumNumberOfCalls() {
            return r4jConfig.getMinimumNumberOfCalls();
        }

        @Override
        public int getPermittedNumberOfCallsInHalfOpenState() {
            return r4jConfig.getPermittedNumberOfCallsInHalfOpenState();
        }

        @Override
        public SlidingWindowType getSlidingWindowType() {
            return SlidingWindowType.valueOf(r4jConfig.getSlidingWindowType().name());
        }

        @Override
        public float getSlowCallRateThreshold() {
            return r4jConfig.getSlowCallRateThreshold();
        }

        @Override
        public Duration getSlowCallDurationThreshold() {
            return r4jConfig.getSlowCallDurationThreshold();
        }

        public Duration getMaxWaitDurationInHalfOpenState() {
            return r4jConfig.getMaxWaitDurationInHalfOpenState();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            OciCircuitBreakerConfigImpl that = (OciCircuitBreakerConfigImpl) o;
            return Objects.equals(r4jConfig, that.r4jConfig);
        }

        @Override
        public int hashCode() {
            return Objects.hash(r4jConfig);
        }

        @Override
        public String toString() {
            return "OciCircuitBreakerConfigImpl{" + "r4jConfig=" + r4jConfig + '}';
        }
    }
}
