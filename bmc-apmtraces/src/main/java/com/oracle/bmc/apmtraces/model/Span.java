/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of a span object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Span.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Span extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "parentSpanKey",
        "traceKey",
        "timeStarted",
        "timeEnded",
        "durationInMs",
        "operationName",
        "serviceName",
        "kind",
        "tags",
        "tagsMetadata",
        "logs",
        "isError",
        "sourceName"
    })
    public Span(
            String key,
            String parentSpanKey,
            String traceKey,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Long durationInMs,
            String operationName,
            String serviceName,
            String kind,
            java.util.List<Tag> tags,
            java.util.Map<String, TagMetadata> tagsMetadata,
            java.util.List<SpanLogCollection> logs,
            Boolean isError,
            SourceName sourceName) {
        super();
        this.key = key;
        this.parentSpanKey = parentSpanKey;
        this.traceKey = traceKey;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.durationInMs = durationInMs;
        this.operationName = operationName;
        this.serviceName = serviceName;
        this.kind = kind;
        this.tags = tags;
        this.tagsMetadata = tagsMetadata;
        this.logs = logs;
        this.isError = isError;
        this.sourceName = sourceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier (spanId) for the span. Note that this field is defined as spanKey in
         * the API and it maps to the spanId in the trace data in Application Performance
         * Monitoring.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique identifier (spanId) for the span. Note that this field is defined as spanKey in
         * the API and it maps to the spanId in the trace data in Application Performance
         * Monitoring.
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
         * Unique parent identifier for the span if one exists. For root spans this will be null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parentSpanKey")
        private String parentSpanKey;

        /**
         * Unique parent identifier for the span if one exists. For root spans this will be null.
         *
         * @param parentSpanKey the value to set
         * @return this builder
         */
        public Builder parentSpanKey(String parentSpanKey) {
            this.parentSpanKey = parentSpanKey;
            this.__explicitlySet__.add("parentSpanKey");
            return this;
        }
        /** Unique identifier for the trace. */
        @com.fasterxml.jackson.annotation.JsonProperty("traceKey")
        private String traceKey;

        /**
         * Unique identifier for the trace.
         *
         * @param traceKey the value to set
         * @return this builder
         */
        public Builder traceKey(String traceKey) {
            this.traceKey = traceKey;
            this.__explicitlySet__.add("traceKey");
            return this;
        }
        /** Span start time. Timestamp when the span was started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Span start time. Timestamp when the span was started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** Span end time. Timestamp when the span was completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * Span end time. Timestamp when the span was completed.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** Total span duration in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
        private Long durationInMs;

        /**
         * Total span duration in milliseconds.
         *
         * @param durationInMs the value to set
         * @return this builder
         */
        public Builder durationInMs(Long durationInMs) {
            this.durationInMs = durationInMs;
            this.__explicitlySet__.add("durationInMs");
            return this;
        }
        /**
         * Span name associated with the trace. This is usually the method or URI of the request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operationName")
        private String operationName;

        /**
         * Span name associated with the trace. This is usually the method or URI of the request.
         *
         * @param operationName the value to set
         * @return this builder
         */
        public Builder operationName(String operationName) {
            this.operationName = operationName;
            this.__explicitlySet__.add("operationName");
            return this;
        }
        /** Service name associated with the span. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Service name associated with the span.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** Kind associated with the span. */
        @com.fasterxml.jackson.annotation.JsonProperty("kind")
        private String kind;

        /**
         * Kind associated with the span.
         *
         * @param kind the value to set
         * @return this builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            this.__explicitlySet__.add("kind");
            return this;
        }
        /** List of tags associated with the span. */
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        /**
         * List of tags associated with the span.
         *
         * @param tags the value to set
         * @return this builder
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }
        /** Metadata about the tags in the span. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagsMetadata")
        private java.util.Map<String, TagMetadata> tagsMetadata;

        /**
         * Metadata about the tags in the span.
         *
         * @param tagsMetadata the value to set
         * @return this builder
         */
        public Builder tagsMetadata(java.util.Map<String, TagMetadata> tagsMetadata) {
            this.tagsMetadata = tagsMetadata;
            this.__explicitlySet__.add("tagsMetadata");
            return this;
        }
        /** List of logs associated with the span. */
        @com.fasterxml.jackson.annotation.JsonProperty("logs")
        private java.util.List<SpanLogCollection> logs;

        /**
         * List of logs associated with the span.
         *
         * @param logs the value to set
         * @return this builder
         */
        public Builder logs(java.util.List<SpanLogCollection> logs) {
            this.logs = logs;
            this.__explicitlySet__.add("logs");
            return this;
        }
        /** Indicates if the span has an error. */
        @com.fasterxml.jackson.annotation.JsonProperty("isError")
        private Boolean isError;

        /**
         * Indicates if the span has an error.
         *
         * @param isError the value to set
         * @return this builder
         */
        public Builder isError(Boolean isError) {
            this.isError = isError;
            this.__explicitlySet__.add("isError");
            return this;
        }
        /** Source of span (spans, syn_spans). */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private SourceName sourceName;

        /**
         * Source of span (spans, syn_spans).
         *
         * @param sourceName the value to set
         * @return this builder
         */
        public Builder sourceName(SourceName sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Span build() {
            Span model =
                    new Span(
                            this.key,
                            this.parentSpanKey,
                            this.traceKey,
                            this.timeStarted,
                            this.timeEnded,
                            this.durationInMs,
                            this.operationName,
                            this.serviceName,
                            this.kind,
                            this.tags,
                            this.tagsMetadata,
                            this.logs,
                            this.isError,
                            this.sourceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Span model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("parentSpanKey")) {
                this.parentSpanKey(model.getParentSpanKey());
            }
            if (model.wasPropertyExplicitlySet("traceKey")) {
                this.traceKey(model.getTraceKey());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("durationInMs")) {
                this.durationInMs(model.getDurationInMs());
            }
            if (model.wasPropertyExplicitlySet("operationName")) {
                this.operationName(model.getOperationName());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("kind")) {
                this.kind(model.getKind());
            }
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
            }
            if (model.wasPropertyExplicitlySet("tagsMetadata")) {
                this.tagsMetadata(model.getTagsMetadata());
            }
            if (model.wasPropertyExplicitlySet("logs")) {
                this.logs(model.getLogs());
            }
            if (model.wasPropertyExplicitlySet("isError")) {
                this.isError(model.getIsError());
            }
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
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
     * Unique identifier (spanId) for the span. Note that this field is defined as spanKey in the
     * API and it maps to the spanId in the trace data in Application Performance Monitoring.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique identifier (spanId) for the span. Note that this field is defined as spanKey in the
     * API and it maps to the spanId in the trace data in Application Performance Monitoring.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Unique parent identifier for the span if one exists. For root spans this will be null. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentSpanKey")
    private final String parentSpanKey;

    /**
     * Unique parent identifier for the span if one exists. For root spans this will be null.
     *
     * @return the value
     */
    public String getParentSpanKey() {
        return parentSpanKey;
    }

    /** Unique identifier for the trace. */
    @com.fasterxml.jackson.annotation.JsonProperty("traceKey")
    private final String traceKey;

    /**
     * Unique identifier for the trace.
     *
     * @return the value
     */
    public String getTraceKey() {
        return traceKey;
    }

    /** Span start time. Timestamp when the span was started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Span start time. Timestamp when the span was started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** Span end time. Timestamp when the span was completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * Span end time. Timestamp when the span was completed.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** Total span duration in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("durationInMs")
    private final Long durationInMs;

    /**
     * Total span duration in milliseconds.
     *
     * @return the value
     */
    public Long getDurationInMs() {
        return durationInMs;
    }

    /** Span name associated with the trace. This is usually the method or URI of the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationName")
    private final String operationName;

    /**
     * Span name associated with the trace. This is usually the method or URI of the request.
     *
     * @return the value
     */
    public String getOperationName() {
        return operationName;
    }

    /** Service name associated with the span. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Service name associated with the span.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** Kind associated with the span. */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final String kind;

    /**
     * Kind associated with the span.
     *
     * @return the value
     */
    public String getKind() {
        return kind;
    }

    /** List of tags associated with the span. */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tag> tags;

    /**
     * List of tags associated with the span.
     *
     * @return the value
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /** Metadata about the tags in the span. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagsMetadata")
    private final java.util.Map<String, TagMetadata> tagsMetadata;

    /**
     * Metadata about the tags in the span.
     *
     * @return the value
     */
    public java.util.Map<String, TagMetadata> getTagsMetadata() {
        return tagsMetadata;
    }

    /** List of logs associated with the span. */
    @com.fasterxml.jackson.annotation.JsonProperty("logs")
    private final java.util.List<SpanLogCollection> logs;

    /**
     * List of logs associated with the span.
     *
     * @return the value
     */
    public java.util.List<SpanLogCollection> getLogs() {
        return logs;
    }

    /** Indicates if the span has an error. */
    @com.fasterxml.jackson.annotation.JsonProperty("isError")
    private final Boolean isError;

    /**
     * Indicates if the span has an error.
     *
     * @return the value
     */
    public Boolean getIsError() {
        return isError;
    }

    /** Source of span (spans, syn_spans). */
    public enum SourceName implements com.oracle.bmc.http.internal.BmcEnum {
        Spans("SPANS"),
        SynSpans("SYN_SPANS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SourceName.class);

        private final String value;
        private static java.util.Map<String, SourceName> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceName v : SourceName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SourceName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SourceName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Source of span (spans, syn_spans). */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final SourceName sourceName;

    /**
     * Source of span (spans, syn_spans).
     *
     * @return the value
     */
    public SourceName getSourceName() {
        return sourceName;
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
        sb.append("Span(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", parentSpanKey=").append(String.valueOf(this.parentSpanKey));
        sb.append(", traceKey=").append(String.valueOf(this.traceKey));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", durationInMs=").append(String.valueOf(this.durationInMs));
        sb.append(", operationName=").append(String.valueOf(this.operationName));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", tagsMetadata=").append(String.valueOf(this.tagsMetadata));
        sb.append(", logs=").append(String.valueOf(this.logs));
        sb.append(", isError=").append(String.valueOf(this.isError));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Span)) {
            return false;
        }

        Span other = (Span) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.parentSpanKey, other.parentSpanKey)
                && java.util.Objects.equals(this.traceKey, other.traceKey)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.durationInMs, other.durationInMs)
                && java.util.Objects.equals(this.operationName, other.operationName)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.kind, other.kind)
                && java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.tagsMetadata, other.tagsMetadata)
                && java.util.Objects.equals(this.logs, other.logs)
                && java.util.Objects.equals(this.isError, other.isError)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.parentSpanKey == null ? 43 : this.parentSpanKey.hashCode());
        result = (result * PRIME) + (this.traceKey == null ? 43 : this.traceKey.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.durationInMs == null ? 43 : this.durationInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.operationName == null ? 43 : this.operationName.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.tagsMetadata == null ? 43 : this.tagsMetadata.hashCode());
        result = (result * PRIME) + (this.logs == null ? 43 : this.logs.hashCode());
        result = (result * PRIME) + (this.isError == null ? 43 : this.isError.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
