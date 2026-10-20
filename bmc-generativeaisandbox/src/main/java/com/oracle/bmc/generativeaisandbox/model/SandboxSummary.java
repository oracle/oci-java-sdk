/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Sandbox resource representation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SandboxSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "projectId",
        "lifecycleState",
        "warmpoolName",
        "runtime",
        "publishedPortAuthMode",
        "publishedPorts",
        "expiresInMinutes",
        "expirationDuration",
        "shape",
        "timeCreated",
        "timeUpdated",
        "timeExpires",
        "timeStopped"
    })
    public SandboxSummary(
            String id,
            String displayName,
            String projectId,
            Sandbox.LifecycleState lifecycleState,
            String warmpoolName,
            String runtime,
            Sandbox.PublishedPortAuthMode publishedPortAuthMode,
            java.util.List<PublishedPort> publishedPorts,
            Integer expiresInMinutes,
            String expirationDuration,
            Shape shape,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeExpires,
            java.util.Date timeStopped) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.projectId = projectId;
        this.lifecycleState = lifecycleState;
        this.warmpoolName = warmpoolName;
        this.runtime = runtime;
        this.publishedPortAuthMode = publishedPortAuthMode;
        this.publishedPorts = publishedPorts;
        this.expiresInMinutes = expiresInMinutes;
        this.expirationDuration = expirationDuration;
        this.shape = shape;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeExpires = timeExpires;
        this.timeStopped = timeStopped;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Sandbox identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Sandbox identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Display name for sandbox */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name for sandbox
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** GenerativeAiProject ID that sandbox belongs to */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * GenerativeAiProject ID that sandbox belongs to
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * The current state of the Sandbox. Allowed values are: - RUNNING - CREATING - UPDATING -
         * DELETED - FAILED - SUSPENDING - SUSPENDED - RESUMING - STOPPING - STOPPED
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Sandbox.LifecycleState lifecycleState;

        /**
         * The current state of the Sandbox. Allowed values are: - RUNNING - CREATING - UPDATING -
         * DELETED - FAILED - SUSPENDING - SUSPENDED - RESUMING - STOPPING - STOPPED
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Sandbox.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Name of the source warm pool, when selected explicitly or automatically at creation. The
         * persisted association is retained on retries.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("warmpoolName")
        private String warmpoolName;

        /**
         * Name of the source warm pool, when selected explicitly or automatically at creation. The
         * persisted association is retained on retries.
         *
         * @param warmpoolName the value to set
         * @return this builder
         */
        public Builder warmpoolName(String warmpoolName) {
            this.warmpoolName = warmpoolName;
            this.__explicitlySet__.add("warmpoolName");
            return this;
        }
        /**
         * The sandbox runtime type. For customer-provided containers, use a same-region Oracle
         * Cloud Infrastructure Registry image reference.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runtime")
        private String runtime;

        /**
         * The sandbox runtime type. For customer-provided containers, use a same-region Oracle
         * Cloud Infrastructure Registry image reference.
         *
         * @param runtime the value to set
         * @return this builder
         */
        public Builder runtime(String runtime) {
            this.runtime = runtime;
            this.__explicitlySet__.add("runtime");
            return this;
        }
        /** Persisted published-port authorization mode. Absent for legacy sandboxes. */
        @com.fasterxml.jackson.annotation.JsonProperty("publishedPortAuthMode")
        private Sandbox.PublishedPortAuthMode publishedPortAuthMode;

        /**
         * Persisted published-port authorization mode. Absent for legacy sandboxes.
         *
         * @param publishedPortAuthMode the value to set
         * @return this builder
         */
        public Builder publishedPortAuthMode(Sandbox.PublishedPortAuthMode publishedPortAuthMode) {
            this.publishedPortAuthMode = publishedPortAuthMode;
            this.__explicitlySet__.add("publishedPortAuthMode");
            return this;
        }
        /** Published ports for the sandbox proxy endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("publishedPorts")
        private java.util.List<PublishedPort> publishedPorts;

        /**
         * Published ports for the sandbox proxy endpoint.
         *
         * @param publishedPorts the value to set
         * @return this builder
         */
        public Builder publishedPorts(java.util.List<PublishedPort> publishedPorts) {
            this.publishedPorts = publishedPorts;
            this.__explicitlySet__.add("publishedPorts");
            return this;
        }
        /**
         * Number of minutes from creation until automatic sandbox expiration. Use {@code -1} to
         * disable automatic expiration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expiresInMinutes")
        private Integer expiresInMinutes;

        /**
         * Number of minutes from creation until automatic sandbox expiration. Use {@code -1} to
         * disable automatic expiration.
         *
         * @param expiresInMinutes the value to set
         * @return this builder
         */
        public Builder expiresInMinutes(Integer expiresInMinutes) {
            this.expiresInMinutes = expiresInMinutes;
            this.__explicitlySet__.add("expiresInMinutes");
            return this;
        }
        /**
         * Deprecated. Use {@code expiresInMinutes} instead. Existing clients may pass {@code -1} to
         * disable automatic expiration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expirationDuration")
        private String expirationDuration;

        /**
         * Deprecated. Use {@code expiresInMinutes} instead. Existing clients may pass {@code -1} to
         * disable automatic expiration.
         *
         * @param expirationDuration the value to set
         * @return this builder
         */
        public Builder expirationDuration(String expirationDuration) {
            this.expirationDuration = expirationDuration;
            this.__explicitlySet__.add("expirationDuration");
            return this;
        }
        /** shape for sandbox */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private Shape shape;

        /**
         * shape for sandbox
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The date and time the sandbox was created, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the sandbox was created, in RFC 3339 format.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the sandbox was updated, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the sandbox was updated, in RFC 3339 format.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The date and time the sandbox expires, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * The date and time the sandbox expires, in RFC 3339 format.
         *
         * @param timeExpires the value to set
         * @return this builder
         */
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }
        /** The date and time the sandbox was stopped or expired, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStopped")
        private java.util.Date timeStopped;

        /**
         * The date and time the sandbox was stopped or expired, in RFC 3339 format.
         *
         * @param timeStopped the value to set
         * @return this builder
         */
        public Builder timeStopped(java.util.Date timeStopped) {
            this.timeStopped = timeStopped;
            this.__explicitlySet__.add("timeStopped");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxSummary build() {
            SandboxSummary model =
                    new SandboxSummary(
                            this.id,
                            this.displayName,
                            this.projectId,
                            this.lifecycleState,
                            this.warmpoolName,
                            this.runtime,
                            this.publishedPortAuthMode,
                            this.publishedPorts,
                            this.expiresInMinutes,
                            this.expirationDuration,
                            this.shape,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeExpires,
                            this.timeStopped);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("warmpoolName")) {
                this.warmpoolName(model.getWarmpoolName());
            }
            if (model.wasPropertyExplicitlySet("runtime")) {
                this.runtime(model.getRuntime());
            }
            if (model.wasPropertyExplicitlySet("publishedPortAuthMode")) {
                this.publishedPortAuthMode(model.getPublishedPortAuthMode());
            }
            if (model.wasPropertyExplicitlySet("publishedPorts")) {
                this.publishedPorts(model.getPublishedPorts());
            }
            if (model.wasPropertyExplicitlySet("expiresInMinutes")) {
                this.expiresInMinutes(model.getExpiresInMinutes());
            }
            if (model.wasPropertyExplicitlySet("expirationDuration")) {
                this.expirationDuration(model.getExpirationDuration());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            if (model.wasPropertyExplicitlySet("timeStopped")) {
                this.timeStopped(model.getTimeStopped());
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

    /** Sandbox identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Sandbox identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Display name for sandbox */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name for sandbox
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** GenerativeAiProject ID that sandbox belongs to */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * GenerativeAiProject ID that sandbox belongs to
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * The current state of the Sandbox. Allowed values are: - RUNNING - CREATING - UPDATING -
     * DELETED - FAILED - SUSPENDING - SUSPENDED - RESUMING - STOPPING - STOPPED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Sandbox.LifecycleState lifecycleState;

    /**
     * The current state of the Sandbox. Allowed values are: - RUNNING - CREATING - UPDATING -
     * DELETED - FAILED - SUSPENDING - SUSPENDED - RESUMING - STOPPING - STOPPED
     *
     * @return the value
     */
    public Sandbox.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Name of the source warm pool, when selected explicitly or automatically at creation. The
     * persisted association is retained on retries.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warmpoolName")
    private final String warmpoolName;

    /**
     * Name of the source warm pool, when selected explicitly or automatically at creation. The
     * persisted association is retained on retries.
     *
     * @return the value
     */
    public String getWarmpoolName() {
        return warmpoolName;
    }

    /**
     * The sandbox runtime type. For customer-provided containers, use a same-region Oracle Cloud
     * Infrastructure Registry image reference.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtime")
    private final String runtime;

    /**
     * The sandbox runtime type. For customer-provided containers, use a same-region Oracle Cloud
     * Infrastructure Registry image reference.
     *
     * @return the value
     */
    public String getRuntime() {
        return runtime;
    }

    /** Persisted published-port authorization mode. Absent for legacy sandboxes. */
    @com.fasterxml.jackson.annotation.JsonProperty("publishedPortAuthMode")
    private final Sandbox.PublishedPortAuthMode publishedPortAuthMode;

    /**
     * Persisted published-port authorization mode. Absent for legacy sandboxes.
     *
     * @return the value
     */
    public Sandbox.PublishedPortAuthMode getPublishedPortAuthMode() {
        return publishedPortAuthMode;
    }

    /** Published ports for the sandbox proxy endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("publishedPorts")
    private final java.util.List<PublishedPort> publishedPorts;

    /**
     * Published ports for the sandbox proxy endpoint.
     *
     * @return the value
     */
    public java.util.List<PublishedPort> getPublishedPorts() {
        return publishedPorts;
    }

    /**
     * Number of minutes from creation until automatic sandbox expiration. Use {@code -1} to disable
     * automatic expiration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expiresInMinutes")
    private final Integer expiresInMinutes;

    /**
     * Number of minutes from creation until automatic sandbox expiration. Use {@code -1} to disable
     * automatic expiration.
     *
     * @return the value
     */
    public Integer getExpiresInMinutes() {
        return expiresInMinutes;
    }

    /**
     * Deprecated. Use {@code expiresInMinutes} instead. Existing clients may pass {@code -1} to
     * disable automatic expiration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDuration")
    private final String expirationDuration;

    /**
     * Deprecated. Use {@code expiresInMinutes} instead. Existing clients may pass {@code -1} to
     * disable automatic expiration.
     *
     * @return the value
     */
    public String getExpirationDuration() {
        return expirationDuration;
    }

    /** shape for sandbox */
    public enum Shape implements com.oracle.bmc.http.internal.BmcEnum {
        Small("SMALL"),
        Medium("MEDIUM"),
        Large("LARGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Shape.class);

        private final String value;
        private static java.util.Map<String, Shape> map;

        static {
            map = new java.util.HashMap<>();
            for (Shape v : Shape.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Shape(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Shape create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Shape', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** shape for sandbox */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final Shape shape;

    /**
     * shape for sandbox
     *
     * @return the value
     */
    public Shape getShape() {
        return shape;
    }

    /** The date and time the sandbox was created, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the sandbox was created, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the sandbox was updated, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the sandbox was updated, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The date and time the sandbox expires, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * The date and time the sandbox expires, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    /** The date and time the sandbox was stopped or expired, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStopped")
    private final java.util.Date timeStopped;

    /**
     * The date and time the sandbox was stopped or expired, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeStopped() {
        return timeStopped;
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
        sb.append("SandboxSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", warmpoolName=").append(String.valueOf(this.warmpoolName));
        sb.append(", runtime=").append(String.valueOf(this.runtime));
        sb.append(", publishedPortAuthMode=").append(String.valueOf(this.publishedPortAuthMode));
        sb.append(", publishedPorts=").append(String.valueOf(this.publishedPorts));
        sb.append(", expiresInMinutes=").append(String.valueOf(this.expiresInMinutes));
        sb.append(", expirationDuration=").append(String.valueOf(this.expirationDuration));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(", timeStopped=").append(String.valueOf(this.timeStopped));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxSummary)) {
            return false;
        }

        SandboxSummary other = (SandboxSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.warmpoolName, other.warmpoolName)
                && java.util.Objects.equals(this.runtime, other.runtime)
                && java.util.Objects.equals(this.publishedPortAuthMode, other.publishedPortAuthMode)
                && java.util.Objects.equals(this.publishedPorts, other.publishedPorts)
                && java.util.Objects.equals(this.expiresInMinutes, other.expiresInMinutes)
                && java.util.Objects.equals(this.expirationDuration, other.expirationDuration)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && java.util.Objects.equals(this.timeStopped, other.timeStopped)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.warmpoolName == null ? 43 : this.warmpoolName.hashCode());
        result = (result * PRIME) + (this.runtime == null ? 43 : this.runtime.hashCode());
        result =
                (result * PRIME)
                        + (this.publishedPortAuthMode == null
                                ? 43
                                : this.publishedPortAuthMode.hashCode());
        result =
                (result * PRIME)
                        + (this.publishedPorts == null ? 43 : this.publishedPorts.hashCode());
        result =
                (result * PRIME)
                        + (this.expiresInMinutes == null ? 43 : this.expiresInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationDuration == null
                                ? 43
                                : this.expirationDuration.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + (this.timeStopped == null ? 43 : this.timeStopped.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
