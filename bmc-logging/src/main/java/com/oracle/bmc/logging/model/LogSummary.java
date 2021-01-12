/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Log object configuration summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            this.__explicitlySet__.add("logGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LogLifecycleState lifecycleState;

        public Builder lifecycleState(LogLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logType")
        private LogType logType;

        public Builder logType(LogType logType) {
            this.logType = logType;
            this.__explicitlySet__.add("logType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private Configuration configuration;

        public Builder configuration(Configuration configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retentionDuration")
        private Integer retentionDuration;

        public Builder retentionDuration(Integer retentionDuration) {
            this.retentionDuration = retentionDuration;
            this.__explicitlySet__.add("retentionDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogSummary build() {
            LogSummary __instance__ =
                    new LogSummary(
                            id,
                            logGroupId,
                            displayName,
                            isEnabled,
                            lifecycleState,
                            logType,
                            configuration,
                            definedTags,
                            freeformTags,
                            timeCreated,
                            timeLastModified,
                            retentionDuration,
                            compartmentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .logGroupId(o.getLogGroupId())
                            .displayName(o.getDisplayName())
                            .isEnabled(o.getIsEnabled())
                            .lifecycleState(o.getLifecycleState())
                            .logType(o.getLogType())
                            .configuration(o.getConfiguration())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags())
                            .timeCreated(o.getTimeCreated())
                            .timeLastModified(o.getTimeLastModified())
                            .retentionDuration(o.getRetentionDuration())
                            .compartmentId(o.getCompartmentId());

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
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Log group OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    String logGroupId;

    /**
     * The user-friendly display name. This must be unique within the enclosing resource,
     * and it's changeable. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Whether or not this resource is currently enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The pipeline state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LogLifecycleState lifecycleState;
    /**
     * The logType that the log object is for, whether custom or service.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LogType {
        Custom("CUSTOM"),
        Service("SERVICE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The logType that the log object is for, whether custom or service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logType")
    LogType logType;

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    Configuration configuration;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Time the resource was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Time the resource was last modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    java.util.Date timeLastModified;

    /**
     * Log retention duration in 30-day increments (30, 60, 90 and so on).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retentionDuration")
    Integer retentionDuration;

    /**
     * The OCID of the compartment that the resource belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
