/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of a log object. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Log.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Log extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "logKey",
        "eventName",
        "timestamp",
        "traceKey",
        "spanKey",
        "traceFlags",
        "timeCreated",
        "timeObserved",
        "severityText",
        "severityNumber",
        "body",
        "overflowAttributes",
        "attributes",
        "attributeMetadata"
    })
    public Log(
            String logKey,
            String eventName,
            java.util.Date timestamp,
            String traceKey,
            String spanKey,
            Integer traceFlags,
            java.util.Date timeCreated,
            java.util.Date timeObserved,
            String severityText,
            Integer severityNumber,
            String body,
            String overflowAttributes,
            java.util.List<Attribute> attributes,
            java.util.Map<String, AttributeMetadata> attributeMetadata) {
        super();
        this.logKey = logKey;
        this.eventName = eventName;
        this.timestamp = timestamp;
        this.traceKey = traceKey;
        this.spanKey = spanKey;
        this.traceFlags = traceFlags;
        this.timeCreated = timeCreated;
        this.timeObserved = timeObserved;
        this.severityText = severityText;
        this.severityNumber = severityNumber;
        this.body = body;
        this.overflowAttributes = overflowAttributes;
        this.attributes = attributes;
        this.attributeMetadata = attributeMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier (logId) for the logKey. Note that this field is defined as logKey in
         * the API and it maps to the logId in Application Performance Monitoring.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logKey")
        private String logKey;

        /**
         * Unique identifier (logId) for the logKey. Note that this field is defined as logKey in
         * the API and it maps to the logId in Application Performance Monitoring.
         *
         * @param logKey the value to set
         * @return this builder
         */
        public Builder logKey(String logKey) {
            this.logKey = logKey;
            this.__explicitlySet__.add("logKey");
            return this;
        }
        /** Name of the event. */
        @com.fasterxml.jackson.annotation.JsonProperty("eventName")
        private String eventName;

        /**
         * Name of the event.
         *
         * @param eventName the value to set
         * @return this builder
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            this.__explicitlySet__.add("eventName");
            return this;
        }
        /**
         * Time used by the time picker (RecordedTime). Either the timeCreated if present or the
         * timeObserved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Time used by the time picker (RecordedTime). Either the timeCreated if present or the
         * timeObserved.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** Unique identifier for the trace (traceId) associated with this log. */
        @com.fasterxml.jackson.annotation.JsonProperty("traceKey")
        private String traceKey;

        /**
         * Unique identifier for the trace (traceId) associated with this log.
         *
         * @param traceKey the value to set
         * @return this builder
         */
        public Builder traceKey(String traceKey) {
            this.traceKey = traceKey;
            this.__explicitlySet__.add("traceKey");
            return this;
        }
        /** Unique identifier for the span (spanId) associated with this log. */
        @com.fasterxml.jackson.annotation.JsonProperty("spanKey")
        private String spanKey;

        /**
         * Unique identifier for the span (spanId) associated with this log.
         *
         * @param spanKey the value to set
         * @return this builder
         */
        public Builder spanKey(String spanKey) {
            this.spanKey = spanKey;
            this.__explicitlySet__.add("spanKey");
            return this;
        }
        /** Trace flags. */
        @com.fasterxml.jackson.annotation.JsonProperty("traceFlags")
        private Integer traceFlags;

        /**
         * Trace flags.
         *
         * @param traceFlags the value to set
         * @return this builder
         */
        public Builder traceFlags(Integer traceFlags) {
            this.traceFlags = traceFlags;
            this.__explicitlySet__.add("traceFlags");
            return this;
        }
        /** Time that the log event occurred (CreatedTime). */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time that the log event occurred (CreatedTime).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Time that the log was received by apm (ObservedTime). */
        @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
        private java.util.Date timeObserved;

        /**
         * Time that the log was received by apm (ObservedTime).
         *
         * @param timeObserved the value to set
         * @return this builder
         */
        public Builder timeObserved(java.util.Date timeObserved) {
            this.timeObserved = timeObserved;
            this.__explicitlySet__.add("timeObserved");
            return this;
        }
        /** Log Severity text (SeverityText). Also known as Log level. */
        @com.fasterxml.jackson.annotation.JsonProperty("severityText")
        private String severityText;

        /**
         * Log Severity text (SeverityText). Also known as Log level.
         *
         * @param severityText the value to set
         * @return this builder
         */
        public Builder severityText(String severityText) {
            this.severityText = severityText;
            this.__explicitlySet__.add("severityText");
            return this;
        }
        /** Log Severity number (SeverityNumber). */
        @com.fasterxml.jackson.annotation.JsonProperty("severityNumber")
        private Integer severityNumber;

        /**
         * Log Severity number (SeverityNumber).
         *
         * @param severityNumber the value to set
         * @return this builder
         */
        public Builder severityNumber(Integer severityNumber) {
            this.severityNumber = severityNumber;
            this.__explicitlySet__.add("severityNumber");
            return this;
        }
        /** Log body (Body). */
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;

        /**
         * Log body (Body).
         *
         * @param body the value to set
         * @return this builder
         */
        public Builder body(String body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }
        /**
         * Full values for attributes that are too long to be stored as a log attribute (Overflow).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("overflowAttributes")
        private String overflowAttributes;

        /**
         * Full values for attributes that are too long to be stored as a log attribute (Overflow).
         *
         * @param overflowAttributes the value to set
         * @return this builder
         */
        public Builder overflowAttributes(String overflowAttributes) {
            this.overflowAttributes = overflowAttributes;
            this.__explicitlySet__.add("overflowAttributes");
            return this;
        }
        /** List of attributes associated with the logs. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<Attribute> attributes;

        /**
         * List of attributes associated with the logs.
         *
         * @param attributes the value to set
         * @return this builder
         */
        public Builder attributes(java.util.List<Attribute> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }
        /** Metadata about the attributes in the logs. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeMetadata")
        private java.util.Map<String, AttributeMetadata> attributeMetadata;

        /**
         * Metadata about the attributes in the logs.
         *
         * @param attributeMetadata the value to set
         * @return this builder
         */
        public Builder attributeMetadata(
                java.util.Map<String, AttributeMetadata> attributeMetadata) {
            this.attributeMetadata = attributeMetadata;
            this.__explicitlySet__.add("attributeMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Log build() {
            Log model =
                    new Log(
                            this.logKey,
                            this.eventName,
                            this.timestamp,
                            this.traceKey,
                            this.spanKey,
                            this.traceFlags,
                            this.timeCreated,
                            this.timeObserved,
                            this.severityText,
                            this.severityNumber,
                            this.body,
                            this.overflowAttributes,
                            this.attributes,
                            this.attributeMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Log model) {
            if (model.wasPropertyExplicitlySet("logKey")) {
                this.logKey(model.getLogKey());
            }
            if (model.wasPropertyExplicitlySet("eventName")) {
                this.eventName(model.getEventName());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("traceKey")) {
                this.traceKey(model.getTraceKey());
            }
            if (model.wasPropertyExplicitlySet("spanKey")) {
                this.spanKey(model.getSpanKey());
            }
            if (model.wasPropertyExplicitlySet("traceFlags")) {
                this.traceFlags(model.getTraceFlags());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeObserved")) {
                this.timeObserved(model.getTimeObserved());
            }
            if (model.wasPropertyExplicitlySet("severityText")) {
                this.severityText(model.getSeverityText());
            }
            if (model.wasPropertyExplicitlySet("severityNumber")) {
                this.severityNumber(model.getSeverityNumber());
            }
            if (model.wasPropertyExplicitlySet("body")) {
                this.body(model.getBody());
            }
            if (model.wasPropertyExplicitlySet("overflowAttributes")) {
                this.overflowAttributes(model.getOverflowAttributes());
            }
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
            }
            if (model.wasPropertyExplicitlySet("attributeMetadata")) {
                this.attributeMetadata(model.getAttributeMetadata());
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
     * Unique identifier (logId) for the logKey. Note that this field is defined as logKey in the
     * API and it maps to the logId in Application Performance Monitoring.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logKey")
    private final String logKey;

    /**
     * Unique identifier (logId) for the logKey. Note that this field is defined as logKey in the
     * API and it maps to the logId in Application Performance Monitoring.
     *
     * @return the value
     */
    public String getLogKey() {
        return logKey;
    }

    /** Name of the event. */
    @com.fasterxml.jackson.annotation.JsonProperty("eventName")
    private final String eventName;

    /**
     * Name of the event.
     *
     * @return the value
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Time used by the time picker (RecordedTime). Either the timeCreated if present or the
     * timeObserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Time used by the time picker (RecordedTime). Either the timeCreated if present or the
     * timeObserved.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** Unique identifier for the trace (traceId) associated with this log. */
    @com.fasterxml.jackson.annotation.JsonProperty("traceKey")
    private final String traceKey;

    /**
     * Unique identifier for the trace (traceId) associated with this log.
     *
     * @return the value
     */
    public String getTraceKey() {
        return traceKey;
    }

    /** Unique identifier for the span (spanId) associated with this log. */
    @com.fasterxml.jackson.annotation.JsonProperty("spanKey")
    private final String spanKey;

    /**
     * Unique identifier for the span (spanId) associated with this log.
     *
     * @return the value
     */
    public String getSpanKey() {
        return spanKey;
    }

    /** Trace flags. */
    @com.fasterxml.jackson.annotation.JsonProperty("traceFlags")
    private final Integer traceFlags;

    /**
     * Trace flags.
     *
     * @return the value
     */
    public Integer getTraceFlags() {
        return traceFlags;
    }

    /** Time that the log event occurred (CreatedTime). */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time that the log event occurred (CreatedTime).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Time that the log was received by apm (ObservedTime). */
    @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
    private final java.util.Date timeObserved;

    /**
     * Time that the log was received by apm (ObservedTime).
     *
     * @return the value
     */
    public java.util.Date getTimeObserved() {
        return timeObserved;
    }

    /** Log Severity text (SeverityText). Also known as Log level. */
    @com.fasterxml.jackson.annotation.JsonProperty("severityText")
    private final String severityText;

    /**
     * Log Severity text (SeverityText). Also known as Log level.
     *
     * @return the value
     */
    public String getSeverityText() {
        return severityText;
    }

    /** Log Severity number (SeverityNumber). */
    @com.fasterxml.jackson.annotation.JsonProperty("severityNumber")
    private final Integer severityNumber;

    /**
     * Log Severity number (SeverityNumber).
     *
     * @return the value
     */
    public Integer getSeverityNumber() {
        return severityNumber;
    }

    /** Log body (Body). */
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final String body;

    /**
     * Log body (Body).
     *
     * @return the value
     */
    public String getBody() {
        return body;
    }

    /** Full values for attributes that are too long to be stored as a log attribute (Overflow). */
    @com.fasterxml.jackson.annotation.JsonProperty("overflowAttributes")
    private final String overflowAttributes;

    /**
     * Full values for attributes that are too long to be stored as a log attribute (Overflow).
     *
     * @return the value
     */
    public String getOverflowAttributes() {
        return overflowAttributes;
    }

    /** List of attributes associated with the logs. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.List<Attribute> attributes;

    /**
     * List of attributes associated with the logs.
     *
     * @return the value
     */
    public java.util.List<Attribute> getAttributes() {
        return attributes;
    }

    /** Metadata about the attributes in the logs. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeMetadata")
    private final java.util.Map<String, AttributeMetadata> attributeMetadata;

    /**
     * Metadata about the attributes in the logs.
     *
     * @return the value
     */
    public java.util.Map<String, AttributeMetadata> getAttributeMetadata() {
        return attributeMetadata;
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
        sb.append("Log(");
        sb.append("super=").append(super.toString());
        sb.append("logKey=").append(String.valueOf(this.logKey));
        sb.append(", eventName=").append(String.valueOf(this.eventName));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", traceKey=").append(String.valueOf(this.traceKey));
        sb.append(", spanKey=").append(String.valueOf(this.spanKey));
        sb.append(", traceFlags=").append(String.valueOf(this.traceFlags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeObserved=").append(String.valueOf(this.timeObserved));
        sb.append(", severityText=").append(String.valueOf(this.severityText));
        sb.append(", severityNumber=").append(String.valueOf(this.severityNumber));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(", overflowAttributes=").append(String.valueOf(this.overflowAttributes));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(", attributeMetadata=").append(String.valueOf(this.attributeMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Log)) {
            return false;
        }

        Log other = (Log) o;
        return java.util.Objects.equals(this.logKey, other.logKey)
                && java.util.Objects.equals(this.eventName, other.eventName)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.traceKey, other.traceKey)
                && java.util.Objects.equals(this.spanKey, other.spanKey)
                && java.util.Objects.equals(this.traceFlags, other.traceFlags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeObserved, other.timeObserved)
                && java.util.Objects.equals(this.severityText, other.severityText)
                && java.util.Objects.equals(this.severityNumber, other.severityNumber)
                && java.util.Objects.equals(this.body, other.body)
                && java.util.Objects.equals(this.overflowAttributes, other.overflowAttributes)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.attributeMetadata, other.attributeMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.logKey == null ? 43 : this.logKey.hashCode());
        result = (result * PRIME) + (this.eventName == null ? 43 : this.eventName.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.traceKey == null ? 43 : this.traceKey.hashCode());
        result = (result * PRIME) + (this.spanKey == null ? 43 : this.spanKey.hashCode());
        result = (result * PRIME) + (this.traceFlags == null ? 43 : this.traceFlags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeObserved == null ? 43 : this.timeObserved.hashCode());
        result = (result * PRIME) + (this.severityText == null ? 43 : this.severityText.hashCode());
        result =
                (result * PRIME)
                        + (this.severityNumber == null ? 43 : this.severityNumber.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        result =
                (result * PRIME)
                        + (this.overflowAttributes == null
                                ? 43
                                : this.overflowAttributes.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeMetadata == null ? 43 : this.attributeMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
