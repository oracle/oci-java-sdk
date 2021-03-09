/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Trace Span summary object is the summary of the span information for the spans in the span collection
 * in the trace window that is being queried.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TraceSpanSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TraceSpanSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rootSpanOperationName")
        private String rootSpanOperationName;

        public Builder rootSpanOperationName(String rootSpanOperationName) {
            this.rootSpanOperationName = rootSpanOperationName;
            this.__explicitlySet__.add("rootSpanOperationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestSpanStarted")
        private java.util.Date timeEarliestSpanStarted;

        public Builder timeEarliestSpanStarted(java.util.Date timeEarliestSpanStarted) {
            this.timeEarliestSpanStarted = timeEarliestSpanStarted;
            this.__explicitlySet__.add("timeEarliestSpanStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSpanEnded")
        private java.util.Date timeLatestSpanEnded;

        public Builder timeLatestSpanEnded(java.util.Date timeLatestSpanEnded) {
            this.timeLatestSpanEnded = timeLatestSpanEnded;
            this.__explicitlySet__.add("timeLatestSpanEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("spanCount")
        private Integer spanCount;

        public Builder spanCount(Integer spanCount) {
            this.spanCount = spanCount;
            this.__explicitlySet__.add("spanCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorSpanCount")
        private Integer errorSpanCount;

        public Builder errorSpanCount(Integer errorSpanCount) {
            this.errorSpanCount = errorSpanCount;
            this.__explicitlySet__.add("errorSpanCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rootSpanServiceName")
        private String rootSpanServiceName;

        public Builder rootSpanServiceName(String rootSpanServiceName) {
            this.rootSpanServiceName = rootSpanServiceName;
            this.__explicitlySet__.add("rootSpanServiceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeRootSpanStarted")
        private java.util.Date timeRootSpanStarted;

        public Builder timeRootSpanStarted(java.util.Date timeRootSpanStarted) {
            this.timeRootSpanStarted = timeRootSpanStarted;
            this.__explicitlySet__.add("timeRootSpanStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeRootSpanEnded")
        private java.util.Date timeRootSpanEnded;

        public Builder timeRootSpanEnded(java.util.Date timeRootSpanEnded) {
            this.timeRootSpanEnded = timeRootSpanEnded;
            this.__explicitlySet__.add("timeRootSpanEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rootSpanDurationInMs")
        private Integer rootSpanDurationInMs;

        public Builder rootSpanDurationInMs(Integer rootSpanDurationInMs) {
            this.rootSpanDurationInMs = rootSpanDurationInMs;
            this.__explicitlySet__.add("rootSpanDurationInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("traceDurationInMs")
        private Integer traceDurationInMs;

        public Builder traceDurationInMs(Integer traceDurationInMs) {
            this.traceDurationInMs = traceDurationInMs;
            this.__explicitlySet__.add("traceDurationInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFault")
        private Boolean isFault;

        public Builder isFault(Boolean isFault) {
            this.isFault = isFault;
            this.__explicitlySet__.add("isFault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("traceStatus")
        private String traceStatus;

        public Builder traceStatus(String traceStatus) {
            this.traceStatus = traceStatus;
            this.__explicitlySet__.add("traceStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("traceErrorType")
        private String traceErrorType;

        public Builder traceErrorType(String traceErrorType) {
            this.traceErrorType = traceErrorType;
            this.__explicitlySet__.add("traceErrorType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("traceErrorCode")
        private String traceErrorCode;

        public Builder traceErrorCode(String traceErrorCode) {
            this.traceErrorCode = traceErrorCode;
            this.__explicitlySet__.add("traceErrorCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceSummaries")
        private java.util.List<TraceServiceSummary> serviceSummaries;

        public Builder serviceSummaries(java.util.List<TraceServiceSummary> serviceSummaries) {
            this.serviceSummaries = serviceSummaries;
            this.__explicitlySet__.add("serviceSummaries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TraceSpanSummary build() {
            TraceSpanSummary __instance__ =
                    new TraceSpanSummary(
                            key,
                            rootSpanOperationName,
                            timeEarliestSpanStarted,
                            timeLatestSpanEnded,
                            spanCount,
                            errorSpanCount,
                            rootSpanServiceName,
                            timeRootSpanStarted,
                            timeRootSpanEnded,
                            rootSpanDurationInMs,
                            traceDurationInMs,
                            isFault,
                            traceStatus,
                            traceErrorType,
                            traceErrorCode,
                            serviceSummaries);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TraceSpanSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .rootSpanOperationName(o.getRootSpanOperationName())
                            .timeEarliestSpanStarted(o.getTimeEarliestSpanStarted())
                            .timeLatestSpanEnded(o.getTimeLatestSpanEnded())
                            .spanCount(o.getSpanCount())
                            .errorSpanCount(o.getErrorSpanCount())
                            .rootSpanServiceName(o.getRootSpanServiceName())
                            .timeRootSpanStarted(o.getTimeRootSpanStarted())
                            .timeRootSpanEnded(o.getTimeRootSpanEnded())
                            .rootSpanDurationInMs(o.getRootSpanDurationInMs())
                            .traceDurationInMs(o.getTraceDurationInMs())
                            .isFault(o.getIsFault())
                            .traceStatus(o.getTraceStatus())
                            .traceErrorType(o.getTraceErrorType())
                            .traceErrorCode(o.getTraceErrorCode())
                            .serviceSummaries(o.getServiceSummaries());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier (traceId) for the trace that represents the span set.  Note that this field is
     * defined as traceKey in the API to comply with OCI API fields naming conventions.  The traceKey maps to
     * the traceId in the APM repository.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Root span name associated with the trace. This is usually the flow start operation name.
     * Null if the root span is not yet completed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootSpanOperationName")
    String rootSpanOperationName;

    /**
     * Start time of the earliest span in this span collection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestSpanStarted")
    java.util.Date timeEarliestSpanStarted;

    /**
     * End time of the span that most recently ended in this span collection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSpanEnded")
    java.util.Date timeLatestSpanEnded;

    /**
     * The number of spans that have been processed by the system for this trace.  Note that there
     * could be additional spans that have not been processed or reported yet if the trace is still
     * in progress.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spanCount")
    Integer spanCount;

    /**
     * The number of spans with error that have been processed by the system for this trace.
     * Note that the number of spans with errors may be less than the total number of actual spans
     * in this trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorSpanCount")
    Integer errorSpanCount;

    /**
     * Service associated with this trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootSpanServiceName")
    String rootSpanServiceName;

    /**
     * Start time of the root span for this span collection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRootSpanStarted")
    java.util.Date timeRootSpanStarted;

    /**
     * End time of the root span for this span collection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRootSpanEnded")
    java.util.Date timeRootSpanEnded;

    /**
     * Time taken for the root span operation to complete in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootSpanDurationInMs")
    Integer rootSpanDurationInMs;

    /**
     * Time between the start of the earliest span and the end of the most recent span in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("traceDurationInMs")
    Integer traceDurationInMs;

    /**
     * Boolean flag that indicates whether the trace errored out.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFault")
    Boolean isFault;

    /**
     * The status of the trace.
     * The trace statuses are defined as follows:
     * complete \u2013 a root span has been recorded, but there is no information on the errors.
     * success - a complete root span is recorded there is a successful error type and error code - HTTP 200.
     * incomplete - the root span has not yet been received.
     * error - the root span returned with an error. There may or may not be an associated error code or error type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("traceStatus")
    String traceStatus;

    /**
     * Error type of the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("traceErrorType")
    String traceErrorType;

    /**
     * Error code of the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("traceErrorCode")
    String traceErrorCode;

    /**
     * A summary of the spans by service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceSummaries")
    java.util.List<TraceServiceSummary> serviceSummaries;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
