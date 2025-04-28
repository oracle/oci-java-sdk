/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Information about a Kernel Crash. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KernelCrashEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "eventType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KernelCrashEvent extends Event {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eventFingerprint")
        private String eventFingerprint;

        public Builder eventFingerprint(String eventFingerprint) {
            this.eventFingerprint = eventFingerprint;
            this.__explicitlySet__.add("eventFingerprint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** reason of the crash */
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private String reason;

        /**
         * reason of the crash
         *
         * @param reason the value to set
         * @return this builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }
        /** First occurrence time of the event */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstOccurred")
        private java.util.Date timeFirstOccurred;

        /**
         * First occurrence time of the event
         *
         * @param timeFirstOccurred the value to set
         * @return this builder
         */
        public Builder timeFirstOccurred(java.util.Date timeFirstOccurred) {
            this.timeFirstOccurred = timeFirstOccurred;
            this.__explicitlySet__.add("timeFirstOccurred");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmcore")
        private KernelVmCoreInformation vmcore;

        public Builder vmcore(KernelVmCoreInformation vmcore) {
            this.vmcore = vmcore;
            this.__explicitlySet__.add("vmcore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private EventContent content;

        public Builder content(EventContent content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("system")
        private CrashEventSystemInformation system;

        public Builder system(CrashEventSystemInformation system) {
            this.system = system;
            this.__explicitlySet__.add("system");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KernelCrashEvent build() {
            KernelCrashEvent model =
                    new KernelCrashEvent(
                            this.id,
                            this.instanceId,
                            this.compartmentId,
                            this.tenancyId,
                            this.summary,
                            this.timestamp,
                            this.eventFingerprint,
                            this.count,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.reason,
                            this.timeFirstOccurred,
                            this.vmcore,
                            this.content,
                            this.system);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KernelCrashEvent model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("eventFingerprint")) {
                this.eventFingerprint(model.getEventFingerprint());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("reason")) {
                this.reason(model.getReason());
            }
            if (model.wasPropertyExplicitlySet("timeFirstOccurred")) {
                this.timeFirstOccurred(model.getTimeFirstOccurred());
            }
            if (model.wasPropertyExplicitlySet("vmcore")) {
                this.vmcore(model.getVmcore());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("system")) {
                this.system(model.getSystem());
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

    @Deprecated
    public KernelCrashEvent(
            String id,
            String instanceId,
            String compartmentId,
            String tenancyId,
            String summary,
            java.util.Date timestamp,
            String eventFingerprint,
            Integer count,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String reason,
            java.util.Date timeFirstOccurred,
            KernelVmCoreInformation vmcore,
            EventContent content,
            CrashEventSystemInformation system) {
        super(
                id,
                instanceId,
                compartmentId,
                tenancyId,
                summary,
                timestamp,
                eventFingerprint,
                count,
                freeformTags,
                definedTags,
                systemTags);
        this.reason = reason;
        this.timeFirstOccurred = timeFirstOccurred;
        this.vmcore = vmcore;
        this.content = content;
        this.system = system;
    }

    /** reason of the crash */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final String reason;

    /**
     * reason of the crash
     *
     * @return the value
     */
    public String getReason() {
        return reason;
    }

    /** First occurrence time of the event */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstOccurred")
    private final java.util.Date timeFirstOccurred;

    /**
     * First occurrence time of the event
     *
     * @return the value
     */
    public java.util.Date getTimeFirstOccurred() {
        return timeFirstOccurred;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vmcore")
    private final KernelVmCoreInformation vmcore;

    public KernelVmCoreInformation getVmcore() {
        return vmcore;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final EventContent content;

    public EventContent getContent() {
        return content;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("system")
    private final CrashEventSystemInformation system;

    public CrashEventSystemInformation getSystem() {
        return system;
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
        sb.append("KernelCrashEvent(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", reason=").append(String.valueOf(this.reason));
        sb.append(", timeFirstOccurred=").append(String.valueOf(this.timeFirstOccurred));
        sb.append(", vmcore=").append(String.valueOf(this.vmcore));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", system=").append(String.valueOf(this.system));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KernelCrashEvent)) {
            return false;
        }

        KernelCrashEvent other = (KernelCrashEvent) o;
        return java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.timeFirstOccurred, other.timeFirstOccurred)
                && java.util.Objects.equals(this.vmcore, other.vmcore)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.system, other.system)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstOccurred == null ? 43 : this.timeFirstOccurred.hashCode());
        result = (result * PRIME) + (this.vmcore == null ? 43 : this.vmcore.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.system == null ? 43 : this.system.hashCode());
        return result;
    }
}
