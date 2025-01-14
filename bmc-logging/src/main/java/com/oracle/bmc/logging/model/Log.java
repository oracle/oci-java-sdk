/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Represents a log object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Log.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Log extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "tenancyId",
        "logGroupId",
        "displayName",
        "logType",
        "isEnabled",
        "definedTags",
        "freeformTags",
        "configuration",
        "lifecycleState",
        "timeCreated",
        "timeLastModified",
        "retentionDuration",
        "compartmentId"
    })
    public Log(
            String id,
            String tenancyId,
            String logGroupId,
            String displayName,
            LogType logType,
            Boolean isEnabled,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            Configuration configuration,
            LogLifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeLastModified,
            Integer retentionDuration,
            String compartmentId) {
        super();
        this.id = id;
        this.tenancyId = tenancyId;
        this.logGroupId = logGroupId;
        this.displayName = displayName;
        this.logType = logType;
        this.isEnabled = isEnabled;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.configuration = configuration;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeLastModified = timeLastModified;
        this.retentionDuration = retentionDuration;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The OCID of the tenancy.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /** Log group OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        /**
         * Log group OCID.
         *
         * @param logGroupId the value to set
         * @return this builder
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }
        /**
         * The user-friendly display name. This must be unique within the enclosing resource, and
         * it's changeable. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly display name. This must be unique within the enclosing resource, and
         * it's changeable. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The logType that the log object is for, whether custom or service. */
        @com.fasterxml.jackson.annotation.JsonProperty("logType")
        private LogType logType;

        /**
         * The logType that the log object is for, whether custom or service.
         *
         * @param logType the value to set
         * @return this builder
         */
        public Builder logType(LogType logType) {
            this.logType = logType;
            this.__explicitlySet__.add("logType");
            return this;
        }
        /** Whether or not this resource is currently enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether or not this resource is currently enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private Configuration configuration;

        public Builder configuration(Configuration configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }
        /** The pipeline state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LogLifecycleState lifecycleState;

        /**
         * The pipeline state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LogLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Time the resource was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time the resource was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Time the resource was last modified. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * Time the resource was last modified.
         *
         * @param timeLastModified the value to set
         * @return this builder
         */
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }
        /** Log retention duration in 30-day increments (30, 60, 90 and so on until 180). */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionDuration")
        private Integer retentionDuration;

        /**
         * Log retention duration in 30-day increments (30, 60, 90 and so on until 180).
         *
         * @param retentionDuration the value to set
         * @return this builder
         */
        public Builder retentionDuration(Integer retentionDuration) {
            this.retentionDuration = retentionDuration;
            this.__explicitlySet__.add("retentionDuration");
            return this;
        }
        /** The OCID of the compartment that the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that the resource belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Log build() {
            Log model =
                    new Log(
                            this.id,
                            this.tenancyId,
                            this.logGroupId,
                            this.displayName,
                            this.logType,
                            this.isEnabled,
                            this.definedTags,
                            this.freeformTags,
                            this.configuration,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeLastModified,
                            this.retentionDuration,
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Log model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("logGroupId")) {
                this.logGroupId(model.getLogGroupId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("logType")) {
                this.logType(model.getLogType());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastModified")) {
                this.timeLastModified(model.getTimeLastModified());
            }
            if (model.wasPropertyExplicitlySet("retentionDuration")) {
                this.retentionDuration(model.getRetentionDuration());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The OCID of the tenancy.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /** Log group OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

    /**
     * Log group OCID.
     *
     * @return the value
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    /**
     * The user-friendly display name. This must be unique within the enclosing resource, and it's
     * changeable. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly display name. This must be unique within the enclosing resource, and it's
     * changeable. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The logType that the log object is for, whether custom or service. */
    public enum LogType implements com.oracle.bmc.http.internal.BmcEnum {
        Custom("CUSTOM"),
        Service("SERVICE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LogType.class);

        private final String value;
        private static java.util.Map<String, LogType> map;

        static {
            map = new java.util.HashMap<>();
            for (LogType v : LogType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LogType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LogType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LogType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The logType that the log object is for, whether custom or service. */
    @com.fasterxml.jackson.annotation.JsonProperty("logType")
    private final LogType logType;

    /**
     * The logType that the log object is for, whether custom or service.
     *
     * @return the value
     */
    public LogType getLogType() {
        return logType;
    }

    /** Whether or not this resource is currently enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether or not this resource is currently enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final Configuration configuration;

    public Configuration getConfiguration() {
        return configuration;
    }

    /** The pipeline state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LogLifecycleState lifecycleState;

    /**
     * The pipeline state.
     *
     * @return the value
     */
    public LogLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Time the resource was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time the resource was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Time the resource was last modified. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    /**
     * Time the resource was last modified.
     *
     * @return the value
     */
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
    }

    /** Log retention duration in 30-day increments (30, 60, 90 and so on until 180). */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionDuration")
    private final Integer retentionDuration;

    /**
     * Log retention duration in 30-day increments (30, 60, 90 and so on until 180).
     *
     * @return the value
     */
    public Integer getRetentionDuration() {
        return retentionDuration;
    }

    /** The OCID of the compartment that the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that the resource belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", logType=").append(String.valueOf(this.logType));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(", retentionDuration=").append(String.valueOf(this.retentionDuration));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
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
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.logType, other.logType)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && java.util.Objects.equals(this.retentionDuration, other.retentionDuration)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.logType == null ? 43 : this.logType.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionDuration == null ? 43 : this.retentionDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
