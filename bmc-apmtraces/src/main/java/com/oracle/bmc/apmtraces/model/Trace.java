/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of a trace object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Trace.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Trace extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "rootSpanOperationName",
        "timeEarliestSpanStarted",
        "timeLatestSpanEnded",
        "spanCount",
        "errorSpanCount",
        "rootSpanServiceName",
        "timeRootSpanStarted",
        "timeRootSpanEnded",
        "rootSpanDurationInMs",
        "traceDurationInMs",
        "isFault",
        "traceStatus",
        "traceErrorType",
        "traceErrorCode",
        "serviceSummaries",
        "spanSummary",
        "spans"
    })
    public Trace(
            String key,
            String rootSpanOperationName,
            java.util.Date timeEarliestSpanStarted,
            java.util.Date timeLatestSpanEnded,
            Integer spanCount,
            Integer errorSpanCount,
            String rootSpanServiceName,
            java.util.Date timeRootSpanStarted,
            java.util.Date timeRootSpanEnded,
            Integer rootSpanDurationInMs,
            Integer traceDurationInMs,
            Boolean isFault,
            String traceStatus,
            String traceErrorType,
            String traceErrorCode,
            java.util.List<TraceServiceSummary> serviceSummaries,
            TraceSpanSummary spanSummary,
            java.util.List<Span> spans) {
        super();
        this.key = key;
        this.rootSpanOperationName = rootSpanOperationName;
        this.timeEarliestSpanStarted = timeEarliestSpanStarted;
        this.timeLatestSpanEnded = timeLatestSpanEnded;
        this.spanCount = spanCount;
        this.errorSpanCount = errorSpanCount;
        this.rootSpanServiceName = rootSpanServiceName;
        this.timeRootSpanStarted = timeRootSpanStarted;
        this.timeRootSpanEnded = timeRootSpanEnded;
        this.rootSpanDurationInMs = rootSpanDurationInMs;
        this.traceDurationInMs = traceDurationInMs;
        this.isFault = isFault;
        this.traceStatus = traceStatus;
        this.traceErrorType = traceErrorType;
        this.traceErrorCode = traceErrorCode;
        this.serviceSummaries = serviceSummaries;
        this.spanSummary = spanSummary;
        this.spans = spans;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier (traceId) for the trace that represents the span set. Note that this
         * field is defined as traceKey in the API and it maps to the traceId in the trace data in
         * Application Performance Monitoring.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique identifier (traceId) for the trace that represents the span set. Note that this
         * field is defined as traceKey in the API and it maps to the traceId in the trace data in
         * Application Performance Monitoring.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Root span name associated with the trace. This is the flow start operation name. Null is
         * displayed if the root span is not yet completed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rootSpanOperationName")
        private String rootSpanOperationName;

        /**
         * Root span name associated with the trace. This is the flow start operation name. Null is
         * displayed if the root span is not yet completed.
         *
         * @param rootSpanOperationName the value to set
         * @return this builder
         */
        public Builder rootSpanOperationName(String rootSpanOperationName) {
            this.rootSpanOperationName = rootSpanOperationName;
            this.__explicitlySet__.add("rootSpanOperationName");
            return this;
        }
        /** Start time of the earliest span in the span collection. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestSpanStarted")
        private java.util.Date timeEarliestSpanStarted;

        /**
         * Start time of the earliest span in the span collection.
         *
         * @param timeEarliestSpanStarted the value to set
         * @return this builder
         */
        public Builder timeEarliestSpanStarted(java.util.Date timeEarliestSpanStarted) {
            this.timeEarliestSpanStarted = timeEarliestSpanStarted;
            this.__explicitlySet__.add("timeEarliestSpanStarted");
            return this;
        }
        /** End time of the span that most recently ended in the span collection. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSpanEnded")
        private java.util.Date timeLatestSpanEnded;

        /**
         * End time of the span that most recently ended in the span collection.
         *
         * @param timeLatestSpanEnded the value to set
         * @return this builder
         */
        public Builder timeLatestSpanEnded(java.util.Date timeLatestSpanEnded) {
            this.timeLatestSpanEnded = timeLatestSpanEnded;
            this.__explicitlySet__.add("timeLatestSpanEnded");
            return this;
        }
        /**
         * The number of spans that have been processed by the system for the trace. Note that there
         * could be additional spans that have not been processed or reported yet if the trace is
         * still in progress.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("spanCount")
        private Integer spanCount;

        /**
         * The number of spans that have been processed by the system for the trace. Note that there
         * could be additional spans that have not been processed or reported yet if the trace is
         * still in progress.
         *
         * @param spanCount the value to set
         * @return this builder
         */
        public Builder spanCount(Integer spanCount) {
            this.spanCount = spanCount;
            this.__explicitlySet__.add("spanCount");
            return this;
        }
        /**
         * The number of spans with errors that have been processed by the system for the trace.
         * Note that the number of spans with errors will be less than or equal to the total number
         * of spans in the trace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("errorSpanCount")
        private Integer errorSpanCount;

        /**
         * The number of spans with errors that have been processed by the system for the trace.
         * Note that the number of spans with errors will be less than or equal to the total number
         * of spans in the trace.
         *
         * @param errorSpanCount the value to set
         * @return this builder
         */
        public Builder errorSpanCount(Integer errorSpanCount) {
            this.errorSpanCount = errorSpanCount;
            this.__explicitlySet__.add("errorSpanCount");
            return this;
        }
        /** Service associated with the trace. */
        @com.fasterxml.jackson.annotation.JsonProperty("rootSpanServiceName")
        private String rootSpanServiceName;

        /**
         * Service associated with the trace.
         *
         * @param rootSpanServiceName the value to set
         * @return this builder
         */
        public Builder rootSpanServiceName(String rootSpanServiceName) {
            this.rootSpanServiceName = rootSpanServiceName;
            this.__explicitlySet__.add("rootSpanServiceName");
            return this;
        }
        /** Start time of the root span for the span collection. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRootSpanStarted")
        private java.util.Date timeRootSpanStarted;

        /**
         * Start time of the root span for the span collection.
         *
         * @param timeRootSpanStarted the value to set
         * @return this builder
         */
        public Builder timeRootSpanStarted(java.util.Date timeRootSpanStarted) {
            this.timeRootSpanStarted = timeRootSpanStarted;
            this.__explicitlySet__.add("timeRootSpanStarted");
            return this;
        }
        /** End time of the root span for the span collection. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRootSpanEnded")
        private java.util.Date timeRootSpanEnded;

        /**
         * End time of the root span for the span collection.
         *
         * @param timeRootSpanEnded the value to set
         * @return this builder
         */
        public Builder timeRootSpanEnded(java.util.Date timeRootSpanEnded) {
            this.timeRootSpanEnded = timeRootSpanEnded;
            this.__explicitlySet__.add("timeRootSpanEnded");
            return this;
        }
        /** Time taken for the root span operation to complete in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("rootSpanDurationInMs")
        private Integer rootSpanDurationInMs;

        /**
         * Time taken for the root span operation to complete in milliseconds.
         *
         * @param rootSpanDurationInMs the value to set
         * @return this builder
         */
        public Builder rootSpanDurationInMs(Integer rootSpanDurationInMs) {
            this.rootSpanDurationInMs = rootSpanDurationInMs;
            this.__explicitlySet__.add("rootSpanDurationInMs");
            return this;
        }
        /**
         * Time between the start of the earliest span and the end of the most recent span in
         * milliseconds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("traceDurationInMs")
        private Integer traceDurationInMs;

        /**
         * Time between the start of the earliest span and the end of the most recent span in
         * milliseconds.
         *
         * @param traceDurationInMs the value to set
         * @return this builder
         */
        public Builder traceDurationInMs(Integer traceDurationInMs) {
            this.traceDurationInMs = traceDurationInMs;
            this.__explicitlySet__.add("traceDurationInMs");
            return this;
        }
        /** Boolean flag that indicates whether the trace has an error. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFault")
        private Boolean isFault;

        /**
         * Boolean flag that indicates whether the trace has an error.
         *
         * @param isFault the value to set
         * @return this builder
         */
        public Builder isFault(Boolean isFault) {
            this.isFault = isFault;
            this.__explicitlySet__.add("isFault");
            return this;
        }
        /**
         * The status of the trace. The trace statuses are defined as follows: complete - a root
         * span has been recorded, but there is no information on the errors. success - a complete
         * root span is recorded there is a successful error type and error code - HTTP 200.
         * incomplete - the root span has not yet been received. error - the root span returned with
         * an error. There may or may not be an associated error code or error type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("traceStatus")
        private String traceStatus;

        /**
         * The status of the trace. The trace statuses are defined as follows: complete - a root
         * span has been recorded, but there is no information on the errors. success - a complete
         * root span is recorded there is a successful error type and error code - HTTP 200.
         * incomplete - the root span has not yet been received. error - the root span returned with
         * an error. There may or may not be an associated error code or error type.
         *
         * @param traceStatus the value to set
         * @return this builder
         */
        public Builder traceStatus(String traceStatus) {
            this.traceStatus = traceStatus;
            this.__explicitlySet__.add("traceStatus");
            return this;
        }
        /** Error type of the trace. */
        @com.fasterxml.jackson.annotation.JsonProperty("traceErrorType")
        private String traceErrorType;

        /**
         * Error type of the trace.
         *
         * @param traceErrorType the value to set
         * @return this builder
         */
        public Builder traceErrorType(String traceErrorType) {
            this.traceErrorType = traceErrorType;
            this.__explicitlySet__.add("traceErrorType");
            return this;
        }
        /** Error code of the trace. */
        @com.fasterxml.jackson.annotation.JsonProperty("traceErrorCode")
        private String traceErrorCode;

        /**
         * Error code of the trace.
         *
         * @param traceErrorCode the value to set
         * @return this builder
         */
        public Builder traceErrorCode(String traceErrorCode) {
            this.traceErrorCode = traceErrorCode;
            this.__explicitlySet__.add("traceErrorCode");
            return this;
        }
        /** A summary of the spans by service. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceSummaries")
        private java.util.List<TraceServiceSummary> serviceSummaries;

        /**
         * A summary of the spans by service.
         *
         * @param serviceSummaries the value to set
         * @return this builder
         */
        public Builder serviceSummaries(java.util.List<TraceServiceSummary> serviceSummaries) {
            this.serviceSummaries = serviceSummaries;
            this.__explicitlySet__.add("serviceSummaries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("spanSummary")
        private TraceSpanSummary spanSummary;

        public Builder spanSummary(TraceSpanSummary spanSummary) {
            this.spanSummary = spanSummary;
            this.__explicitlySet__.add("spanSummary");
            return this;
        }
        /** An array of spans in the trace. */
        @com.fasterxml.jackson.annotation.JsonProperty("spans")
        private java.util.List<Span> spans;

        /**
         * An array of spans in the trace.
         *
         * @param spans the value to set
         * @return this builder
         */
        public Builder spans(java.util.List<Span> spans) {
            this.spans = spans;
            this.__explicitlySet__.add("spans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Trace build() {
            Trace model =
                    new Trace(
                            this.key,
                            this.rootSpanOperationName,
                            this.timeEarliestSpanStarted,
                            this.timeLatestSpanEnded,
                            this.spanCount,
                            this.errorSpanCount,
                            this.rootSpanServiceName,
                            this.timeRootSpanStarted,
                            this.timeRootSpanEnded,
                            this.rootSpanDurationInMs,
                            this.traceDurationInMs,
                            this.isFault,
                            this.traceStatus,
                            this.traceErrorType,
                            this.traceErrorCode,
                            this.serviceSummaries,
                            this.spanSummary,
                            this.spans);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Trace model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("rootSpanOperationName")) {
                this.rootSpanOperationName(model.getRootSpanOperationName());
            }
            if (model.wasPropertyExplicitlySet("timeEarliestSpanStarted")) {
                this.timeEarliestSpanStarted(model.getTimeEarliestSpanStarted());
            }
            if (model.wasPropertyExplicitlySet("timeLatestSpanEnded")) {
                this.timeLatestSpanEnded(model.getTimeLatestSpanEnded());
            }
            if (model.wasPropertyExplicitlySet("spanCount")) {
                this.spanCount(model.getSpanCount());
            }
            if (model.wasPropertyExplicitlySet("errorSpanCount")) {
                this.errorSpanCount(model.getErrorSpanCount());
            }
            if (model.wasPropertyExplicitlySet("rootSpanServiceName")) {
                this.rootSpanServiceName(model.getRootSpanServiceName());
            }
            if (model.wasPropertyExplicitlySet("timeRootSpanStarted")) {
                this.timeRootSpanStarted(model.getTimeRootSpanStarted());
            }
            if (model.wasPropertyExplicitlySet("timeRootSpanEnded")) {
                this.timeRootSpanEnded(model.getTimeRootSpanEnded());
            }
            if (model.wasPropertyExplicitlySet("rootSpanDurationInMs")) {
                this.rootSpanDurationInMs(model.getRootSpanDurationInMs());
            }
            if (model.wasPropertyExplicitlySet("traceDurationInMs")) {
                this.traceDurationInMs(model.getTraceDurationInMs());
            }
            if (model.wasPropertyExplicitlySet("isFault")) {
                this.isFault(model.getIsFault());
            }
            if (model.wasPropertyExplicitlySet("traceStatus")) {
                this.traceStatus(model.getTraceStatus());
            }
            if (model.wasPropertyExplicitlySet("traceErrorType")) {
                this.traceErrorType(model.getTraceErrorType());
            }
            if (model.wasPropertyExplicitlySet("traceErrorCode")) {
                this.traceErrorCode(model.getTraceErrorCode());
            }
            if (model.wasPropertyExplicitlySet("serviceSummaries")) {
                this.serviceSummaries(model.getServiceSummaries());
            }
            if (model.wasPropertyExplicitlySet("spanSummary")) {
                this.spanSummary(model.getSpanSummary());
            }
            if (model.wasPropertyExplicitlySet("spans")) {
                this.spans(model.getSpans());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique identifier (traceId) for the trace that represents the span set. Note that this field
     * is defined as traceKey in the API and it maps to the traceId in the trace data in Application
     * Performance Monitoring.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique identifier (traceId) for the trace that represents the span set. Note that this field
     * is defined as traceKey in the API and it maps to the traceId in the trace data in Application
     * Performance Monitoring.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * Root span name associated with the trace. This is the flow start operation name. Null is
     * displayed if the root span is not yet completed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootSpanOperationName")
    private final String rootSpanOperationName;

    /**
     * Root span name associated with the trace. This is the flow start operation name. Null is
     * displayed if the root span is not yet completed.
     *
     * @return the value
     */
    public String getRootSpanOperationName() {
        return rootSpanOperationName;
    }

    /** Start time of the earliest span in the span collection. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEarliestSpanStarted")
    private final java.util.Date timeEarliestSpanStarted;

    /**
     * Start time of the earliest span in the span collection.
     *
     * @return the value
     */
    public java.util.Date getTimeEarliestSpanStarted() {
        return timeEarliestSpanStarted;
    }

    /** End time of the span that most recently ended in the span collection. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSpanEnded")
    private final java.util.Date timeLatestSpanEnded;

    /**
     * End time of the span that most recently ended in the span collection.
     *
     * @return the value
     */
    public java.util.Date getTimeLatestSpanEnded() {
        return timeLatestSpanEnded;
    }

    /**
     * The number of spans that have been processed by the system for the trace. Note that there
     * could be additional spans that have not been processed or reported yet if the trace is still
     * in progress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("spanCount")
    private final Integer spanCount;

    /**
     * The number of spans that have been processed by the system for the trace. Note that there
     * could be additional spans that have not been processed or reported yet if the trace is still
     * in progress.
     *
     * @return the value
     */
    public Integer getSpanCount() {
        return spanCount;
    }

    /**
     * The number of spans with errors that have been processed by the system for the trace. Note
     * that the number of spans with errors will be less than or equal to the total number of spans
     * in the trace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("errorSpanCount")
    private final Integer errorSpanCount;

    /**
     * The number of spans with errors that have been processed by the system for the trace. Note
     * that the number of spans with errors will be less than or equal to the total number of spans
     * in the trace.
     *
     * @return the value
     */
    public Integer getErrorSpanCount() {
        return errorSpanCount;
    }

    /** Service associated with the trace. */
    @com.fasterxml.jackson.annotation.JsonProperty("rootSpanServiceName")
    private final String rootSpanServiceName;

    /**
     * Service associated with the trace.
     *
     * @return the value
     */
    public String getRootSpanServiceName() {
        return rootSpanServiceName;
    }

    /** Start time of the root span for the span collection. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRootSpanStarted")
    private final java.util.Date timeRootSpanStarted;

    /**
     * Start time of the root span for the span collection.
     *
     * @return the value
     */
    public java.util.Date getTimeRootSpanStarted() {
        return timeRootSpanStarted;
    }

    /** End time of the root span for the span collection. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRootSpanEnded")
    private final java.util.Date timeRootSpanEnded;

    /**
     * End time of the root span for the span collection.
     *
     * @return the value
     */
    public java.util.Date getTimeRootSpanEnded() {
        return timeRootSpanEnded;
    }

    /** Time taken for the root span operation to complete in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("rootSpanDurationInMs")
    private final Integer rootSpanDurationInMs;

    /**
     * Time taken for the root span operation to complete in milliseconds.
     *
     * @return the value
     */
    public Integer getRootSpanDurationInMs() {
        return rootSpanDurationInMs;
    }

    /**
     * Time between the start of the earliest span and the end of the most recent span in
     * milliseconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("traceDurationInMs")
    private final Integer traceDurationInMs;

    /**
     * Time between the start of the earliest span and the end of the most recent span in
     * milliseconds.
     *
     * @return the value
     */
    public Integer getTraceDurationInMs() {
        return traceDurationInMs;
    }

    /** Boolean flag that indicates whether the trace has an error. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFault")
    private final Boolean isFault;

    /**
     * Boolean flag that indicates whether the trace has an error.
     *
     * @return the value
     */
    public Boolean getIsFault() {
        return isFault;
    }

    /**
     * The status of the trace. The trace statuses are defined as follows: complete - a root span
     * has been recorded, but there is no information on the errors. success - a complete root span
     * is recorded there is a successful error type and error code - HTTP 200. incomplete - the root
     * span has not yet been received. error - the root span returned with an error. There may or
     * may not be an associated error code or error type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("traceStatus")
    private final String traceStatus;

    /**
     * The status of the trace. The trace statuses are defined as follows: complete - a root span
     * has been recorded, but there is no information on the errors. success - a complete root span
     * is recorded there is a successful error type and error code - HTTP 200. incomplete - the root
     * span has not yet been received. error - the root span returned with an error. There may or
     * may not be an associated error code or error type.
     *
     * @return the value
     */
    public String getTraceStatus() {
        return traceStatus;
    }

    /** Error type of the trace. */
    @com.fasterxml.jackson.annotation.JsonProperty("traceErrorType")
    private final String traceErrorType;

    /**
     * Error type of the trace.
     *
     * @return the value
     */
    public String getTraceErrorType() {
        return traceErrorType;
    }

    /** Error code of the trace. */
    @com.fasterxml.jackson.annotation.JsonProperty("traceErrorCode")
    private final String traceErrorCode;

    /**
     * Error code of the trace.
     *
     * @return the value
     */
    public String getTraceErrorCode() {
        return traceErrorCode;
    }

    /** A summary of the spans by service. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceSummaries")
    private final java.util.List<TraceServiceSummary> serviceSummaries;

    /**
     * A summary of the spans by service.
     *
     * @return the value
     */
    public java.util.List<TraceServiceSummary> getServiceSummaries() {
        return serviceSummaries;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("spanSummary")
    private final TraceSpanSummary spanSummary;

    public TraceSpanSummary getSpanSummary() {
        return spanSummary;
    }

    /** An array of spans in the trace. */
    @com.fasterxml.jackson.annotation.JsonProperty("spans")
    private final java.util.List<Span> spans;

    /**
     * An array of spans in the trace.
     *
     * @return the value
     */
    public java.util.List<Span> getSpans() {
        return spans;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Trace(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", rootSpanOperationName=").append(String.valueOf(this.rootSpanOperationName));
        sb.append(", timeEarliestSpanStarted=")
                .append(String.valueOf(this.timeEarliestSpanStarted));
        sb.append(", timeLatestSpanEnded=").append(String.valueOf(this.timeLatestSpanEnded));
        sb.append(", spanCount=").append(String.valueOf(this.spanCount));
        sb.append(", errorSpanCount=").append(String.valueOf(this.errorSpanCount));
        sb.append(", rootSpanServiceName=").append(String.valueOf(this.rootSpanServiceName));
        sb.append(", timeRootSpanStarted=").append(String.valueOf(this.timeRootSpanStarted));
        sb.append(", timeRootSpanEnded=").append(String.valueOf(this.timeRootSpanEnded));
        sb.append(", rootSpanDurationInMs=").append(String.valueOf(this.rootSpanDurationInMs));
        sb.append(", traceDurationInMs=").append(String.valueOf(this.traceDurationInMs));
        sb.append(", isFault=").append(String.valueOf(this.isFault));
        sb.append(", traceStatus=").append(String.valueOf(this.traceStatus));
        sb.append(", traceErrorType=").append(String.valueOf(this.traceErrorType));
        sb.append(", traceErrorCode=").append(String.valueOf(this.traceErrorCode));
        sb.append(", serviceSummaries=").append(String.valueOf(this.serviceSummaries));
        sb.append(", spanSummary=").append(String.valueOf(this.spanSummary));
        sb.append(", spans=").append(String.valueOf(this.spans));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Trace)) {
            return false;
        }

        Trace other = (Trace) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.rootSpanOperationName, other.rootSpanOperationName)
                && java.util.Objects.equals(
                        this.timeEarliestSpanStarted, other.timeEarliestSpanStarted)
                && java.util.Objects.equals(this.timeLatestSpanEnded, other.timeLatestSpanEnded)
                && java.util.Objects.equals(this.spanCount, other.spanCount)
                && java.util.Objects.equals(this.errorSpanCount, other.errorSpanCount)
                && java.util.Objects.equals(this.rootSpanServiceName, other.rootSpanServiceName)
                && java.util.Objects.equals(this.timeRootSpanStarted, other.timeRootSpanStarted)
                && java.util.Objects.equals(this.timeRootSpanEnded, other.timeRootSpanEnded)
                && java.util.Objects.equals(this.rootSpanDurationInMs, other.rootSpanDurationInMs)
                && java.util.Objects.equals(this.traceDurationInMs, other.traceDurationInMs)
                && java.util.Objects.equals(this.isFault, other.isFault)
                && java.util.Objects.equals(this.traceStatus, other.traceStatus)
                && java.util.Objects.equals(this.traceErrorType, other.traceErrorType)
                && java.util.Objects.equals(this.traceErrorCode, other.traceErrorCode)
                && java.util.Objects.equals(this.serviceSummaries, other.serviceSummaries)
                && java.util.Objects.equals(this.spanSummary, other.spanSummary)
                && java.util.Objects.equals(this.spans, other.spans)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.rootSpanOperationName == null
                                ? 43
                                : this.rootSpanOperationName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEarliestSpanStarted == null
                                ? 43
                                : this.timeEarliestSpanStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLatestSpanEnded == null
                                ? 43
                                : this.timeLatestSpanEnded.hashCode());
        result = (result * PRIME) + (this.spanCount == null ? 43 : this.spanCount.hashCode());
        result =
                (result * PRIME)
                        + (this.errorSpanCount == null ? 43 : this.errorSpanCount.hashCode());
        result =
                (result * PRIME)
                        + (this.rootSpanServiceName == null
                                ? 43
                                : this.rootSpanServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRootSpanStarted == null
                                ? 43
                                : this.timeRootSpanStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRootSpanEnded == null ? 43 : this.timeRootSpanEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.rootSpanDurationInMs == null
                                ? 43
                                : this.rootSpanDurationInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.traceDurationInMs == null ? 43 : this.traceDurationInMs.hashCode());
        result = (result * PRIME) + (this.isFault == null ? 43 : this.isFault.hashCode());
        result = (result * PRIME) + (this.traceStatus == null ? 43 : this.traceStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.traceErrorType == null ? 43 : this.traceErrorType.hashCode());
        result =
                (result * PRIME)
                        + (this.traceErrorCode == null ? 43 : this.traceErrorCode.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceSummaries == null ? 43 : this.serviceSummaries.hashCode());
        result = (result * PRIME) + (this.spanSummary == null ? 43 : this.spanSummary.hashCode());
        result = (result * PRIME) + (this.spans == null ? 43 : this.spans.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
