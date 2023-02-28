/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * All the attributes of an audit event. For more information, see [Viewing Audit Log
 * Events](https://docs.cloud.oracle.com/iaas/Content/Audit/Tasks/viewinglogevents.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AuditEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AuditEvent extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "eventType",
        "cloudEventsVersion",
        "eventTypeVersion",
        "source",
        "eventId",
        "eventTime",
        "contentType",
        "data"
    })
    public AuditEvent(
            String eventType,
            String cloudEventsVersion,
            String eventTypeVersion,
            String source,
            String eventId,
            java.util.Date eventTime,
            String contentType,
            Data data) {
        super();
        this.eventType = eventType;
        this.cloudEventsVersion = cloudEventsVersion;
        this.eventTypeVersion = eventTypeVersion;
        this.source = source;
        this.eventId = eventId;
        this.eventTime = eventTime;
        this.contentType = contentType;
        this.data = data;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of event that happened.
         *
         * <p>The service that produces the event can also add, remove, or change the meaning of a
         * field. A service implementing these type changes would publish a new version of an {@code
         * eventType} and revise the {@code eventTypeVersion} field.
         *
         * <p>Example: {@code com.oraclecloud.ComputeApi.GetInstance}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eventType")
        private String eventType;

        /**
         * The type of event that happened.
         *
         * <p>The service that produces the event can also add, remove, or change the meaning of a
         * field. A service implementing these type changes would publish a new version of an {@code
         * eventType} and revise the {@code eventTypeVersion} field.
         *
         * <p>Example: {@code com.oraclecloud.ComputeApi.GetInstance}
         *
         * @param eventType the value to set
         * @return this builder
         */
        public Builder eventType(String eventType) {
            this.eventType = eventType;
            this.__explicitlySet__.add("eventType");
            return this;
        }
        /**
         * The version of the CloudEvents specification. The structure of the envelope follows the
         * [CloudEvents](https://github.com/cloudevents/spec) industry standard format hosted by the
         * [Cloud Native Computing Foundation ( CNCF)](https://www.cncf.io/).
         *
         * <p>Audit uses version 0.1 specification of the CloudEvents event envelope.
         *
         * <p>Example: {@code 0.1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudEventsVersion")
        private String cloudEventsVersion;

        /**
         * The version of the CloudEvents specification. The structure of the envelope follows the
         * [CloudEvents](https://github.com/cloudevents/spec) industry standard format hosted by the
         * [Cloud Native Computing Foundation ( CNCF)](https://www.cncf.io/).
         *
         * <p>Audit uses version 0.1 specification of the CloudEvents event envelope.
         *
         * <p>Example: {@code 0.1}
         *
         * @param cloudEventsVersion the value to set
         * @return this builder
         */
        public Builder cloudEventsVersion(String cloudEventsVersion) {
            this.cloudEventsVersion = cloudEventsVersion;
            this.__explicitlySet__.add("cloudEventsVersion");
            return this;
        }
        /**
         * The version of the event type. This version applies to the payload of the event, not the
         * envelope. Use {@code cloudEventsVersion} to determine the version of the envelope.
         *
         * <p>Example: {@code 2.0}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eventTypeVersion")
        private String eventTypeVersion;

        /**
         * The version of the event type. This version applies to the payload of the event, not the
         * envelope. Use {@code cloudEventsVersion} to determine the version of the envelope.
         *
         * <p>Example: {@code 2.0}
         *
         * @param eventTypeVersion the value to set
         * @return this builder
         */
        public Builder eventTypeVersion(String eventTypeVersion) {
            this.eventTypeVersion = eventTypeVersion;
            this.__explicitlySet__.add("eventTypeVersion");
            return this;
        }
        /**
         * The source of the event.
         *
         * <p>Example: {@code ComputeApi}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * The source of the event.
         *
         * <p>Example: {@code ComputeApi}
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** The GUID of the event. */
        @com.fasterxml.jackson.annotation.JsonProperty("eventId")
        private String eventId;

        /**
         * The GUID of the event.
         *
         * @param eventId the value to set
         * @return this builder
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            this.__explicitlySet__.add("eventId");
            return this;
        }
        /**
         * The time the event occurred, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         *
         * <p>Example: {@code 2019-09-18T00:10:59.252Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eventTime")
        private java.util.Date eventTime;

        /**
         * The time the event occurred, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         *
         * <p>Example: {@code 2019-09-18T00:10:59.252Z}
         *
         * @param eventTime the value to set
         * @return this builder
         */
        public Builder eventTime(java.util.Date eventTime) {
            this.eventTime = eventTime;
            this.__explicitlySet__.add("eventTime");
            return this;
        }
        /**
         * The content type of the data contained in {@code data}.
         *
         * <p>Example: {@code application/json}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

        /**
         * The content type of the data contained in {@code data}.
         *
         * <p>Example: {@code application/json}
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private Data data;

        public Builder data(Data data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditEvent build() {
            AuditEvent model =
                    new AuditEvent(
                            this.eventType,
                            this.cloudEventsVersion,
                            this.eventTypeVersion,
                            this.source,
                            this.eventId,
                            this.eventTime,
                            this.contentType,
                            this.data);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditEvent model) {
            if (model.wasPropertyExplicitlySet("eventType")) {
                this.eventType(model.getEventType());
            }
            if (model.wasPropertyExplicitlySet("cloudEventsVersion")) {
                this.cloudEventsVersion(model.getCloudEventsVersion());
            }
            if (model.wasPropertyExplicitlySet("eventTypeVersion")) {
                this.eventTypeVersion(model.getEventTypeVersion());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("eventId")) {
                this.eventId(model.getEventId());
            }
            if (model.wasPropertyExplicitlySet("eventTime")) {
                this.eventTime(model.getEventTime());
            }
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
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
     * The type of event that happened.
     *
     * <p>The service that produces the event can also add, remove, or change the meaning of a
     * field. A service implementing these type changes would publish a new version of an {@code
     * eventType} and revise the {@code eventTypeVersion} field.
     *
     * <p>Example: {@code com.oraclecloud.ComputeApi.GetInstance}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventType")
    private final String eventType;

    /**
     * The type of event that happened.
     *
     * <p>The service that produces the event can also add, remove, or change the meaning of a
     * field. A service implementing these type changes would publish a new version of an {@code
     * eventType} and revise the {@code eventTypeVersion} field.
     *
     * <p>Example: {@code com.oraclecloud.ComputeApi.GetInstance}
     *
     * @return the value
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * The version of the CloudEvents specification. The structure of the envelope follows the
     * [CloudEvents](https://github.com/cloudevents/spec) industry standard format hosted by the
     * [Cloud Native Computing Foundation ( CNCF)](https://www.cncf.io/).
     *
     * <p>Audit uses version 0.1 specification of the CloudEvents event envelope.
     *
     * <p>Example: {@code 0.1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudEventsVersion")
    private final String cloudEventsVersion;

    /**
     * The version of the CloudEvents specification. The structure of the envelope follows the
     * [CloudEvents](https://github.com/cloudevents/spec) industry standard format hosted by the
     * [Cloud Native Computing Foundation ( CNCF)](https://www.cncf.io/).
     *
     * <p>Audit uses version 0.1 specification of the CloudEvents event envelope.
     *
     * <p>Example: {@code 0.1}
     *
     * @return the value
     */
    public String getCloudEventsVersion() {
        return cloudEventsVersion;
    }

    /**
     * The version of the event type. This version applies to the payload of the event, not the
     * envelope. Use {@code cloudEventsVersion} to determine the version of the envelope.
     *
     * <p>Example: {@code 2.0}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventTypeVersion")
    private final String eventTypeVersion;

    /**
     * The version of the event type. This version applies to the payload of the event, not the
     * envelope. Use {@code cloudEventsVersion} to determine the version of the envelope.
     *
     * <p>Example: {@code 2.0}
     *
     * @return the value
     */
    public String getEventTypeVersion() {
        return eventTypeVersion;
    }

    /**
     * The source of the event.
     *
     * <p>Example: {@code ComputeApi}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * The source of the event.
     *
     * <p>Example: {@code ComputeApi}
     *
     * @return the value
     */
    public String getSource() {
        return source;
    }

    /** The GUID of the event. */
    @com.fasterxml.jackson.annotation.JsonProperty("eventId")
    private final String eventId;

    /**
     * The GUID of the event.
     *
     * @return the value
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * The time the event occurred, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     *
     * <p>Example: {@code 2019-09-18T00:10:59.252Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventTime")
    private final java.util.Date eventTime;

    /**
     * The time the event occurred, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     *
     * <p>Example: {@code 2019-09-18T00:10:59.252Z}
     *
     * @return the value
     */
    public java.util.Date getEventTime() {
        return eventTime;
    }

    /**
     * The content type of the data contained in {@code data}.
     *
     * <p>Example: {@code application/json}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final String contentType;

    /**
     * The content type of the data contained in {@code data}.
     *
     * <p>Example: {@code application/json}
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final Data data;

    public Data getData() {
        return data;
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
        sb.append("AuditEvent(");
        sb.append("super=").append(super.toString());
        sb.append("eventType=").append(String.valueOf(this.eventType));
        sb.append(", cloudEventsVersion=").append(String.valueOf(this.cloudEventsVersion));
        sb.append(", eventTypeVersion=").append(String.valueOf(this.eventTypeVersion));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", eventId=").append(String.valueOf(this.eventId));
        sb.append(", eventTime=").append(String.valueOf(this.eventTime));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditEvent)) {
            return false;
        }

        AuditEvent other = (AuditEvent) o;
        return java.util.Objects.equals(this.eventType, other.eventType)
                && java.util.Objects.equals(this.cloudEventsVersion, other.cloudEventsVersion)
                && java.util.Objects.equals(this.eventTypeVersion, other.eventTypeVersion)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.eventId, other.eventId)
                && java.util.Objects.equals(this.eventTime, other.eventTime)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.data, other.data)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.eventType == null ? 43 : this.eventType.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudEventsVersion == null
                                ? 43
                                : this.cloudEventsVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.eventTypeVersion == null ? 43 : this.eventTypeVersion.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.eventId == null ? 43 : this.eventId.hashCode());
        result = (result * PRIME) + (this.eventTime == null ? 43 : this.eventTime.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
