/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * All the attributes of an audit event. For more information, see [Viewing Audit Log Events](https://docs.cloud.oracle.com/iaas/Content/Audit/Tasks/viewinglogevents.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AuditEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AuditEvent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("eventType")
        private String eventType;

        public Builder eventType(String eventType) {
            this.eventType = eventType;
            this.__explicitlySet__.add("eventType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudEventsVersion")
        private String cloudEventsVersion;

        public Builder cloudEventsVersion(String cloudEventsVersion) {
            this.cloudEventsVersion = cloudEventsVersion;
            this.__explicitlySet__.add("cloudEventsVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventTypeVersion")
        private String eventTypeVersion;

        public Builder eventTypeVersion(String eventTypeVersion) {
            this.eventTypeVersion = eventTypeVersion;
            this.__explicitlySet__.add("eventTypeVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventId")
        private String eventId;

        public Builder eventId(String eventId) {
            this.eventId = eventId;
            this.__explicitlySet__.add("eventId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventTime")
        private java.util.Date eventTime;

        public Builder eventTime(java.util.Date eventTime) {
            this.eventTime = eventTime;
            this.__explicitlySet__.add("eventTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

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
            AuditEvent __instance__ =
                    new AuditEvent(
                            eventType,
                            cloudEventsVersion,
                            eventTypeVersion,
                            source,
                            eventId,
                            eventTime,
                            contentType,
                            data);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditEvent o) {
            Builder copiedBuilder =
                    eventType(o.getEventType())
                            .cloudEventsVersion(o.getCloudEventsVersion())
                            .eventTypeVersion(o.getEventTypeVersion())
                            .source(o.getSource())
                            .eventId(o.getEventId())
                            .eventTime(o.getEventTime())
                            .contentType(o.getContentType())
                            .data(o.getData());

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
     * The type of event that happened.
     * <p>
     * The service that produces the event can also add, remove, or change the meaning of a field.
     * A service implementing these type changes would publish a new version of an `eventType` and
     * revise the `eventTypeVersion` field.
     * <p>
     * Example: `com.oraclecloud.ComputeApi.GetInstance`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventType")
    String eventType;

    /**
     * The version of the CloudEvents specification. The structure of the envelope follows the
     * [CloudEvents](https://github.com/cloudevents/spec) industry standard format hosted by the
     * [Cloud Native Computing Foundation ( CNCF)](https://www.cncf.io/).
     * <p>
     * Audit uses version 0.1 specification of the CloudEvents event envelope.
     * <p>
     * Example: `0.1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudEventsVersion")
    String cloudEventsVersion;

    /**
     * The version of the event type. This version applies to the payload of the event, not the envelope.
     * Use `cloudEventsVersion` to determine the version of the envelope.
     * <p>
     * Example: `2.0`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventTypeVersion")
    String eventTypeVersion;

    /**
     * The source of the event.
     * <p>
     * Example: `ComputeApi`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    String source;

    /**
     * The GUID of the event.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventId")
    String eventId;

    /**
     * The time the event occurred, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * Example: `2019-09-18T00:10:59.252Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eventTime")
    java.util.Date eventTime;

    /**
     * The content type of the data contained in `data`.
     * <p>
     * Example: `application/json`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    String contentType;

    @com.fasterxml.jackson.annotation.JsonProperty("data")
    Data data;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
