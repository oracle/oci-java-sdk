/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * PostgreSQL configuration for a database system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Configuration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Configuration extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "timeCreated",
        "lifecycleState",
        "lifecycleDetails",
        "dbVersion",
        "configType",
        "shape",
        "isFlexible",
        "instanceOcpuCount",
        "instanceMemorySizeInGBs",
        "compatibleShapes",
        "defaultConfigId",
        "configurationDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Configuration(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String dbVersion,
            ConfigType configType,
            String shape,
            Boolean isFlexible,
            Integer instanceOcpuCount,
            Integer instanceMemorySizeInGBs,
            java.util.List<String> compatibleShapes,
            String defaultConfigId,
            ConfigurationDetails configurationDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.dbVersion = dbVersion;
        this.configType = configType;
        this.shape = shape;
        this.isFlexible = isFlexible;
        this.instanceOcpuCount = instanceOcpuCount;
        this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
        this.compatibleShapes = compatibleShapes;
        this.defaultConfigId = defaultConfigId;
        this.configurationDetails = configurationDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A unique identifier for the configuration. Immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier for the configuration. Immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly display name for the configuration. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the configuration. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A description for the configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description for the configuration.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the configuration.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The date and time that the configuration was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the configuration was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current state of the configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the configuration.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Version of the PostgreSQL database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * Version of the PostgreSQL database.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /** The type of configuration. Either user-created or a default configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("configType")
        private ConfigType configType;

        /**
         * The type of configuration. Either user-created or a default configuration.
         *
         * @param configType the value to set
         * @return this builder
         */
        public Builder configType(ConfigType configType) {
            this.configType = configType;
            this.__explicitlySet__.add("configType");
            return this;
        }
        /**
         * The name of the shape for the configuration.
         *
         * <p>For multi-shape enabled configurations, it is set to PostgreSQL. Please use
         * compatibleShapes property to get list of supported shapes for such configurations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The name of the shape for the configuration.
         *
         * <p>For multi-shape enabled configurations, it is set to PostgreSQL. Please use
         * compatibleShapes property to get list of supported shapes for such configurations.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** Whether the configuration supports flexible shapes. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFlexible")
        private Boolean isFlexible;

        /**
         * Whether the configuration supports flexible shapes.
         *
         * @param isFlexible the value to set
         * @return this builder
         */
        public Builder isFlexible(Boolean isFlexible) {
            this.isFlexible = isFlexible;
            this.__explicitlySet__.add("isFlexible");
            return this;
        }
        /**
         * CPU core count.
         *
         * <p>It's value is set to 0 if configuration is for a flexible shape.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
        private Integer instanceOcpuCount;

        /**
         * CPU core count.
         *
         * <p>It's value is set to 0 if configuration is for a flexible shape.
         *
         * @param instanceOcpuCount the value to set
         * @return this builder
         */
        public Builder instanceOcpuCount(Integer instanceOcpuCount) {
            this.instanceOcpuCount = instanceOcpuCount;
            this.__explicitlySet__.add("instanceOcpuCount");
            return this;
        }
        /**
         * Memory size in gigabytes with 1GB increment.
         *
         * <p>It's value is set to 0 if configuration is for a flexible shape.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
        private Integer instanceMemorySizeInGBs;

        /**
         * Memory size in gigabytes with 1GB increment.
         *
         * <p>It's value is set to 0 if configuration is for a flexible shape.
         *
         * @param instanceMemorySizeInGBs the value to set
         * @return this builder
         */
        public Builder instanceMemorySizeInGBs(Integer instanceMemorySizeInGBs) {
            this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
            this.__explicitlySet__.add("instanceMemorySizeInGBs");
            return this;
        }
        /** Indicates the collection of compatible shapes for this configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("compatibleShapes")
        private java.util.List<String> compatibleShapes;

        /**
         * Indicates the collection of compatible shapes for this configuration.
         *
         * @param compatibleShapes the value to set
         * @return this builder
         */
        public Builder compatibleShapes(java.util.List<String> compatibleShapes) {
            this.compatibleShapes = compatibleShapes;
            this.__explicitlySet__.add("compatibleShapes");
            return this;
        }
        /** The Default configuration used for this configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultConfigId")
        private String defaultConfigId;

        /**
         * The Default configuration used for this configuration.
         *
         * @param defaultConfigId the value to set
         * @return this builder
         */
        public Builder defaultConfigId(String defaultConfigId) {
            this.defaultConfigId = defaultConfigId;
            this.__explicitlySet__.add("defaultConfigId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
        private ConfigurationDetails configurationDetails;

        public Builder configurationDetails(ConfigurationDetails configurationDetails) {
            this.configurationDetails = configurationDetails;
            this.__explicitlySet__.add("configurationDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Configuration build() {
            Configuration model =
                    new Configuration(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.timeCreated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.dbVersion,
                            this.configType,
                            this.shape,
                            this.isFlexible,
                            this.instanceOcpuCount,
                            this.instanceMemorySizeInGBs,
                            this.compatibleShapes,
                            this.defaultConfigId,
                            this.configurationDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Configuration model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("configType")) {
                this.configType(model.getConfigType());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("isFlexible")) {
                this.isFlexible(model.getIsFlexible());
            }
            if (model.wasPropertyExplicitlySet("instanceOcpuCount")) {
                this.instanceOcpuCount(model.getInstanceOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("instanceMemorySizeInGBs")) {
                this.instanceMemorySizeInGBs(model.getInstanceMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("compatibleShapes")) {
                this.compatibleShapes(model.getCompatibleShapes());
            }
            if (model.wasPropertyExplicitlySet("defaultConfigId")) {
                this.defaultConfigId(model.getDefaultConfigId());
            }
            if (model.wasPropertyExplicitlySet("configurationDetails")) {
                this.configurationDetails(model.getConfigurationDetails());
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

    /** A unique identifier for the configuration. Immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier for the configuration. Immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A user-friendly display name for the configuration. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the configuration. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A description for the configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description for the configuration.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the configuration.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time that the configuration was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the configuration was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current state of the configuration. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the configuration.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Version of the PostgreSQL database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * Version of the PostgreSQL database.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /** The type of configuration. Either user-created or a default configuration. */
    public enum ConfigType implements com.oracle.bmc.http.internal.BmcEnum {
        Default("DEFAULT"),
        Custom("CUSTOM"),
        Copied("COPIED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConfigType.class);

        private final String value;
        private static java.util.Map<String, ConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigType v : ConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of configuration. Either user-created or a default configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("configType")
    private final ConfigType configType;

    /**
     * The type of configuration. Either user-created or a default configuration.
     *
     * @return the value
     */
    public ConfigType getConfigType() {
        return configType;
    }

    /**
     * The name of the shape for the configuration.
     *
     * <p>For multi-shape enabled configurations, it is set to PostgreSQL. Please use
     * compatibleShapes property to get list of supported shapes for such configurations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The name of the shape for the configuration.
     *
     * <p>For multi-shape enabled configurations, it is set to PostgreSQL. Please use
     * compatibleShapes property to get list of supported shapes for such configurations.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** Whether the configuration supports flexible shapes. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFlexible")
    private final Boolean isFlexible;

    /**
     * Whether the configuration supports flexible shapes.
     *
     * @return the value
     */
    public Boolean getIsFlexible() {
        return isFlexible;
    }

    /**
     * CPU core count.
     *
     * <p>It's value is set to 0 if configuration is for a flexible shape.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
    private final Integer instanceOcpuCount;

    /**
     * CPU core count.
     *
     * <p>It's value is set to 0 if configuration is for a flexible shape.
     *
     * @return the value
     */
    public Integer getInstanceOcpuCount() {
        return instanceOcpuCount;
    }

    /**
     * Memory size in gigabytes with 1GB increment.
     *
     * <p>It's value is set to 0 if configuration is for a flexible shape.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
    private final Integer instanceMemorySizeInGBs;

    /**
     * Memory size in gigabytes with 1GB increment.
     *
     * <p>It's value is set to 0 if configuration is for a flexible shape.
     *
     * @return the value
     */
    public Integer getInstanceMemorySizeInGBs() {
        return instanceMemorySizeInGBs;
    }

    /** Indicates the collection of compatible shapes for this configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("compatibleShapes")
    private final java.util.List<String> compatibleShapes;

    /**
     * Indicates the collection of compatible shapes for this configuration.
     *
     * @return the value
     */
    public java.util.List<String> getCompatibleShapes() {
        return compatibleShapes;
    }

    /** The Default configuration used for this configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultConfigId")
    private final String defaultConfigId;

    /**
     * The Default configuration used for this configuration.
     *
     * @return the value
     */
    public String getDefaultConfigId() {
        return defaultConfigId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
    private final ConfigurationDetails configurationDetails;

    public ConfigurationDetails getConfigurationDetails() {
        return configurationDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Configuration(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", configType=").append(String.valueOf(this.configType));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", isFlexible=").append(String.valueOf(this.isFlexible));
        sb.append(", instanceOcpuCount=").append(String.valueOf(this.instanceOcpuCount));
        sb.append(", instanceMemorySizeInGBs=")
                .append(String.valueOf(this.instanceMemorySizeInGBs));
        sb.append(", compatibleShapes=").append(String.valueOf(this.compatibleShapes));
        sb.append(", defaultConfigId=").append(String.valueOf(this.defaultConfigId));
        sb.append(", configurationDetails=").append(String.valueOf(this.configurationDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Configuration)) {
            return false;
        }

        Configuration other = (Configuration) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.configType, other.configType)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.isFlexible, other.isFlexible)
                && java.util.Objects.equals(this.instanceOcpuCount, other.instanceOcpuCount)
                && java.util.Objects.equals(
                        this.instanceMemorySizeInGBs, other.instanceMemorySizeInGBs)
                && java.util.Objects.equals(this.compatibleShapes, other.compatibleShapes)
                && java.util.Objects.equals(this.defaultConfigId, other.defaultConfigId)
                && java.util.Objects.equals(this.configurationDetails, other.configurationDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.configType == null ? 43 : this.configType.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.isFlexible == null ? 43 : this.isFlexible.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceOcpuCount == null ? 43 : this.instanceOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceMemorySizeInGBs == null
                                ? 43
                                : this.instanceMemorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.compatibleShapes == null ? 43 : this.compatibleShapes.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConfigId == null ? 43 : this.defaultConfigId.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationDetails == null
                                ? 43
                                : this.configurationDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
