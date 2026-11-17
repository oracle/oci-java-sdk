/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.circuitbreaker;

import java.io.Serializable;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Immutable observations captured when the breaker opens, shared by subsequent locally rejected
 * calls.
 *
 * <p>The formatted ObservedFailures count is the sum of the observed failure categories.
 * Attribution to the opening threshold is best effort: error notifications precede breaker metric
 * updates and the diagnostic and metric windows are maintained separately. Observed counts can
 * differ from the captured breaker metrics. A later rejection does not reach the service or add an
 * observed failure.
 */
public final class CircuitBreakerOpenEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter LOG_TIMESTAMP_FORMATTER =
            new DateTimeFormatterBuilder().appendInstant(3).toFormatter();

    /** Categories for failures observed by the diagnostic collector. */
    public enum FailureCategory {
        REMOTE_HTTP,
        DNS,
        CONNECTION,
        TLS,
        TIMEOUT,
        OTHER
    }

    private final String correlationId;
    private final Instant openedAt;
    private final String previousState;
    private final String state;
    private final long totalCalls;
    private final long failedCalls;
    private final Map<FailureCategory, Long> failureCounts;
    private final Map<Integer, Long> httpStatusCounts;

    public CircuitBreakerOpenEvent(
            String correlationId,
            Instant openedAt,
            String previousState,
            String state,
            long totalCalls,
            long failedCalls,
            Map<FailureCategory, Long> failureCounts,
            Map<Integer, Long> httpStatusCounts) {
        this.correlationId = correlationId;
        this.openedAt = openedAt;
        this.previousState = previousState;
        this.state = state;
        this.totalCalls = totalCalls;
        this.failedCalls = failedCalls;
        EnumMap<FailureCategory, Long> counts = new EnumMap<>(FailureCategory.class);
        counts.putAll(failureCounts);
        this.failureCounts = Collections.unmodifiableMap(counts);
        this.httpStatusCounts = Collections.unmodifiableMap(new TreeMap<>(httpStatusCounts));
    }

    /** Returns the identifier shared by this opening and calls rejected because of it. */
    public String getCorrelationId() {
        return correlationId;
    }

    public Instant getOpenedAt() {
        return openedAt;
    }

    public String getPreviousState() {
        return previousState;
    }

    public String getState() {
        return state;
    }

    /** Returns the captured breaker buffered-call metric, omitted from the formatted summary. */
    public long getTotalCalls() {
        return totalCalls;
    }

    /**
     * Returns the captured breaker failure metric, which may differ from the observed category sum
     * printed in the summary.
     */
    public long getFailedCalls() {
        return failedCalls;
    }

    public Map<FailureCategory, Long> getFailureCounts() {
        return failureCounts;
    }

    public Map<Integer, Long> getHttpStatusCounts() {
        return httpStatusCounts;
    }

    @Override
    public String toString() {
        long observedFailures = failureCounts.values().stream().mapToLong(Long::longValue).sum();
        return String.format(
                "CorrelationId - %s; Transition - %s->%s; OpenedAt - %s"
                        + "; ObservedFailures - %d"
                        + "; FailureCounts - %s; HttpStatusCounts - %s",
                correlationId,
                previousState,
                state,
                formatTimestamp(openedAt),
                observedFailures,
                failureCounts,
                httpStatusCounts);
    }

    private static String formatTimestamp(Instant timestamp) {
        return timestamp == null ? null : LOG_TIMESTAMP_FORMATTER.format(timestamp);
    }
}
