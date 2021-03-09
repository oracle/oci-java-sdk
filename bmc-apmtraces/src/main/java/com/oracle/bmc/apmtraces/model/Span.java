/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of a span object.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Span.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Span {
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

        @com.fasterxml.jackson.annotation.JsonProperty("parentSpanKey")
        private String parentSpanKey;

        public Builder parentSpanKey(String parentSpanKey) {
            this.parentSpanKey = parentSpanKey;
            this.__explicitlySet__.add("parentSpanKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("traceKey")
        private String traceKey;

        public Builder traceKey(String traceKey) {
            this.traceKey = traceKey;
            this.__explicitlySet__.add("traceKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
        private Long durationInMs;

        public Builder durationInMs(Long durationInMs) {
            this.durationInMs = durationInMs;
            this.__explicitlySet__.add("durationInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationName")
        private String operationName;

        public Builder operationName(String operationName) {
            this.operationName = operationName;
            this.__explicitlySet__.add("operationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kind")
        private String kind;

        public Builder kind(String kind) {
            this.kind = kind;
            this.__explicitlySet__.add("kind");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logs")
        private java.util.List<SpanLogCollection> logs;

        public Builder logs(java.util.List<SpanLogCollection> logs) {
            this.logs = logs;
            this.__explicitlySet__.add("logs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isError")
        private Boolean isError;

        public Builder isError(Boolean isError) {
            this.isError = isError;
            this.__explicitlySet__.add("isError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Span build() {
            Span __instance__ =
                    new Span(
                            key,
                            parentSpanKey,
                            traceKey,
                            timeStarted,
                            timeEnded,
                            durationInMs,
                            operationName,
                            serviceName,
                            kind,
                            tags,
                            logs,
                            isError);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Span o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .parentSpanKey(o.getParentSpanKey())
                            .traceKey(o.getTraceKey())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
                            .durationInMs(o.getDurationInMs())
                            .operationName(o.getOperationName())
                            .serviceName(o.getServiceName())
                            .kind(o.getKind())
                            .tags(o.getTags())
                            .logs(o.getLogs())
                            .isError(o.getIsError());

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
     * Unique identifier (spanId) for the span.  Note that this field is
     * defined as spanKey in the API to comply with OCI API fields naming conventions.
     * The spanKey maps to the spanId in the APM repository.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Unique parent identifier for the span if one exists. For root spans this will be null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentSpanKey")
    String parentSpanKey;

    /**
     * Unique identifier for the trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("traceKey")
    String traceKey;

    /**
     * Span start time.  Timestamp when the span was started.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * Span end time.  Timestamp when the span was completed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    java.util.Date timeEnded;

    /**
     * Total span duration in milliseconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
    Long durationInMs;

    /**
     * Span name associated with the trace.  This is usually the method or uri of the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationName")
    String operationName;

    /**
     * Service name associated with the span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    String serviceName;

    /**
     * Kind associated with the span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    String kind;

    /**
     * List of tags associated with the span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    java.util.List<Tag> tags;

    /**
     * List of logs associated with the span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logs")
    java.util.List<SpanLogCollection> logs;

    /**
     * Indicates if the span has an error
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isError")
    Boolean isError;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
