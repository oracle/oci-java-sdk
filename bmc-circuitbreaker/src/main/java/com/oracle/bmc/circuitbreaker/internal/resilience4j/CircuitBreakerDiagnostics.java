/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker.internal.resilience4j;

import com.oracle.bmc.circuitbreaker.CallNotAllowedException;
import com.oracle.bmc.circuitbreaker.HttpStatusProvider;
import com.oracle.bmc.circuitbreaker.CircuitBreakerOpenEvent;
import com.oracle.bmc.circuitbreaker.CircuitBreakerOpenEvent.FailureCategory;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.time.Instant;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;

/** Collects safe diagnostics for calls counted as circuit-breaker failures. */
final class CircuitBreakerDiagnostics {
    private final CircuitBreaker circuitBreaker;
    private final CircuitBreakerConfig config;
    private long callPosition;
    private final NavigableMap<Long, FailureBucket> failures = new TreeMap<>();
    private final ThreadLocal<RejectionCapture> rejectionCapture = new ThreadLocal<>();

    private CircuitBreakerOpenEvent openEvent;
    private CircuitBreaker.State windowState;
    private CircuitBreaker.Metrics windowMetrics;

    CircuitBreakerDiagnostics(CircuitBreaker circuitBreaker) {
        this.circuitBreaker = java.util.Objects.requireNonNull(circuitBreaker, "circuitBreaker");
        this.config = circuitBreaker.getCircuitBreakerConfig();
        this.windowState = circuitBreaker.getState();
        this.windowMetrics = circuitBreaker.getMetrics();
        circuitBreaker
                .getEventPublisher()
                .onError(event -> recordFailure(event.getThrowable()))
                .onSuccess(event -> recordSuccess())
                .onStateTransition(event -> stateChanged(event.getStateTransition()))
                .onCallNotPermitted(event -> captureRejection())
                .onReset(event -> refreshWindow());
    }

    synchronized CircuitBreakerOpenEvent getOpenEvent() {
        refreshWindow();
        return openEvent;
    }

    void withRejectionCapture(Runnable permissionCheck) {
        RejectionCapture previous = rejectionCapture.get();
        RejectionCapture capture = new RejectionCapture();
        rejectionCapture.set(capture);
        try {
            permissionCheck.run();
        } finally {
            if (previous == null) {
                rejectionCapture.remove();
            } else {
                rejectionCapture.set(previous);
            }
        }
    }

    private void captureRejection() {
        RejectionCapture capture = rejectionCapture.get();
        if (capture != null && capture.rejection == null) {
            capture.rejection = newRejection();
        }
    }

    CallNotAllowedException createRejection() {
        RejectionCapture capture = rejectionCapture.get();
        return capture == null || capture.rejection == null ? newRejection() : capture.rejection;
    }

    private CallNotAllowedException newRejection() {
        String message =
                "CircuitBreaker '"
                        + circuitBreaker.getName()
                        + "' is "
                        + circuitBreaker.getState()
                        + " and does not permit further calls";
        return CallNotAllowedException.createCallNotAllowedException(
                message, config.isWritableStackTraceEnabled(), getOpenEvent());
    }

    private void recordFailure(Throwable throwable) {
        Integer status = null;
        FailureCategory category = FailureCategory.OTHER;
        Throwable cause = throwable;
        for (int depth = 0; cause != null && depth < 16; depth++) {
            status =
                    cause instanceof HttpStatusProvider
                            ? ((HttpStatusProvider) cause).getStatusCode()
                            : null;
            if (status != null && status >= 100 && status <= 599) {
                category = FailureCategory.REMOTE_HTTP;
                break;
            }
            status = null;
            FailureCategory candidate = classify(cause);
            if (candidate != FailureCategory.OTHER) {
                category = candidate;
                break;
            }
            cause = cause.getCause();
        }
        synchronized (this) {
            refreshWindow();
            long position = nextPosition();
            prune(position);
            FailureBucket bucket =
                    failures.computeIfAbsent(position, ignored -> new FailureBucket());
            bucket.categories[category.ordinal()]++;
            if (status != null) {
                bucket.statuses.merge(status, 1L, Long::sum);
            }
        }
    }

    private synchronized void recordSuccess() {
        refreshWindow();
        prune(nextPosition());
    }

    private long nextPosition() {
        return config.getSlidingWindowType() == CircuitBreakerConfig.SlidingWindowType.COUNT_BASED
                ? ++callPosition
                : Instant.now().getEpochSecond();
    }

    private synchronized void stateChanged(CircuitBreaker.StateTransition transition) {
        refreshWindow();
        CircuitBreaker.State from = transition.getFromState();
        if (transition.getToState() == CircuitBreaker.State.OPEN
                && circuitBreaker.getState() == CircuitBreaker.State.OPEN
                && openEvent == null
                && (from == CircuitBreaker.State.CLOSED
                        || from == CircuitBreaker.State.HALF_OPEN)) {
            openEvent = snapshot(from, CircuitBreaker.State.OPEN);
        }
    }

    private synchronized void refreshWindow() {
        CircuitBreaker.Metrics metrics = circuitBreaker.getMetrics();
        CircuitBreaker.State state = circuitBreaker.getState();
        if (metrics != windowMetrics) {
            // Adopt each evaluation window once, even before its transition callback arrives.
            clear(state, state != CircuitBreaker.State.HALF_OPEN);
            windowMetrics = metrics;
        }
        if (state == CircuitBreaker.State.OPEN
                && (windowState == CircuitBreaker.State.CLOSED
                        || windowState == CircuitBreaker.State.HALF_OPEN)) {
            // Rejections can arrive after the state changes but before the OPEN callback runs.
            openEvent = snapshot(windowState, state);
        }
        windowState = state;
    }

    private synchronized void clear(CircuitBreaker.State state, boolean clearOpenEvent) {
        failures.clear();
        callPosition = 0;
        windowState = state;
        if (clearOpenEvent) {
            openEvent = null;
        }
    }

    private CircuitBreakerOpenEvent snapshot(CircuitBreaker.State from, CircuitBreaker.State to) {
        prune(
                config.getSlidingWindowType() == CircuitBreakerConfig.SlidingWindowType.COUNT_BASED
                        ? callPosition
                        : Instant.now().getEpochSecond());
        Map<FailureCategory, Long> categoryCounts = new EnumMap<>(FailureCategory.class);
        Map<Integer, Long> statusCounts = new HashMap<>();
        for (FailureBucket bucket : failures.values()) {
            for (FailureCategory category : FailureCategory.values()) {
                long count = bucket.categories[category.ordinal()];
                if (count > 0) {
                    categoryCounts.merge(category, count, Long::sum);
                }
            }
            bucket.statuses.forEach(
                    (status, count) -> statusCounts.merge(status, count, Long::sum));
        }
        CircuitBreaker.Metrics metrics = windowMetrics;
        return new CircuitBreakerOpenEvent(
                UUID.randomUUID().toString(),
                Instant.now(),
                from.name(),
                to.name(),
                metrics.getNumberOfBufferedCalls(),
                metrics.getNumberOfFailedCalls(),
                categoryCounts,
                statusCounts);
    }

    private void prune(long currentSecond) {
        if (windowState == CircuitBreaker.State.HALF_OPEN) {
            return;
        }
        long earliest = currentSecond - config.getSlidingWindowSize() + 1;
        failures.headMap(earliest, false).clear();
    }

    private static FailureCategory classify(Throwable cause) {
        if (cause instanceof UnknownHostException) {
            return FailureCategory.DNS;
        }
        if (cause instanceof SSLException) {
            return FailureCategory.TLS;
        }
        if (cause instanceof InterruptedIOException || cause instanceof TimeoutException) {
            return FailureCategory.TIMEOUT;
        }
        if (cause instanceof ConnectException
                || cause instanceof NoRouteToHostException
                || cause instanceof SocketException) {
            return FailureCategory.CONNECTION;
        }
        return FailureCategory.OTHER;
    }

    private static final class RejectionCapture {
        private CallNotAllowedException rejection;
    }

    private static final class FailureBucket {
        private final long[] categories = new long[FailureCategory.values().length];
        private final Map<Integer, Long> statuses = new HashMap<>();
    }
}
