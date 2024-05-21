/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Default configurations for PostgreSQL database systems.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DefaultConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DefaultConfiguration extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "timeCreated",
        "lifecycleState",
        "lifecycleDetails",
        "shape",
        "instanceOcpuCount",
        "instanceMemorySizeInGBs",
        "dbVersion",
        "configurationDetails"
    })
    public DefaultConfiguration(
            String id,
            String displayName,
            String description,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String shape,
            Integer instanceOcpuCount,
            Integer instanceMemorySizeInGBs,
            String dbVersion,
            DefaultConfigurationDetails configurationDetails) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.shape = shape;
        this.instanceOcpuCount = instanceOcpuCount;
        this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
        this.dbVersion = dbVersion;
        this.configurationDetails = configurationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique identifier for the configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier for the configuration.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly display name for the configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the configuration.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A description for the configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description for the configuration.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The date and time that the configuration was created, expressed in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the configuration was created, expressed in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current state of the configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the configuration.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The name of the shape for the configuration.
         * Example: {@code VM.Standard.E4.Flex}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The name of the shape for the configuration.
         * Example: {@code VM.Standard.E4.Flex}
         *
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * CPU core count. Minimum value is 1.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
        private Integer instanceOcpuCount;

        /**
         * CPU core count. Minimum value is 1.
         *
         * @param instanceOcpuCount the value to set
         * @return this builder
         **/
        public Builder instanceOcpuCount(Integer instanceOcpuCount) {
            this.instanceOcpuCount = instanceOcpuCount;
            this.__explicitlySet__.add("instanceOcpuCount");
            return this;
        }
        /**
         * Memory size in gigabytes with 1GB increment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
        private Integer instanceMemorySizeInGBs;

        /**
         * Memory size in gigabytes with 1GB increment.
         *
         * @param instanceMemorySizeInGBs the value to set
         * @return this builder
         **/
        public Builder instanceMemorySizeInGBs(Integer instanceMemorySizeInGBs) {
            this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
            this.__explicitlySet__.add("instanceMemorySizeInGBs");
            return this;
        }
        /**
         * Version of the PostgreSQL database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * Version of the PostgreSQL database.
         * @param dbVersion the value to set
         * @return this builder
         **/
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
        private DefaultConfigurationDetails configurationDetails;

        public Builder configurationDetails(DefaultConfigurationDetails configurationDetails) {
            this.configurationDetails = configurationDetails;
            this.__explicitlySet__.add("configurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultConfiguration build() {
            DefaultConfiguration model =
                    new DefaultConfiguration(
                            this.id,
                            this.displayName,
                            this.description,
                            this.timeCreated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.shape,
                            this.instanceOcpuCount,
                            this.instanceMemorySizeInGBs,
                            this.dbVersion,
                            this.configurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultConfiguration model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("instanceOcpuCount")) {
                this.instanceOcpuCount(model.getInstanceOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("instanceMemorySizeInGBs")) {
                this.instanceMemorySizeInGBs(model.getInstanceMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("configurationDetails")) {
                this.configurationDetails(model.getConfigurationDetails());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A unique identifier for the configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier for the configuration.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly display name for the configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the configuration.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A description for the configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description for the configuration.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The date and time that the configuration was created, expressed in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the configuration was created, expressed in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current state of the configuration.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The current state of the configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the configuration.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The name of the shape for the configuration.
     * Example: {@code VM.Standard.E4.Flex}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The name of the shape for the configuration.
     * Example: {@code VM.Standard.E4.Flex}
     *
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * CPU core count. Minimum value is 1.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
    private final Integer instanceOcpuCount;

    /**
     * CPU core count. Minimum value is 1.
     *
     * @return the value
     **/
    public Integer getInstanceOcpuCount() {
        return instanceOcpuCount;
    }

    /**
     * Memory size in gigabytes with 1GB increment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
    private final Integer instanceMemorySizeInGBs;

    /**
     * Memory size in gigabytes with 1GB increment.
     *
     * @return the value
     **/
    public Integer getInstanceMemorySizeInGBs() {
        return instanceMemorySizeInGBs;
    }

    /**
     * Version of the PostgreSQL database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * Version of the PostgreSQL database.
     * @return the value
     **/
    public String getDbVersion() {
        return dbVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configurationDetails")
    private final DefaultConfigurationDetails configurationDetails;

    public DefaultConfigurationDetails getConfigurationDetails() {
        return configurationDetails;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DefaultConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", instanceOcpuCount=").append(String.valueOf(this.instanceOcpuCount));
        sb.append(", instanceMemorySizeInGBs=")
                .append(String.valueOf(this.instanceMemorySizeInGBs));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", configurationDetails=").append(String.valueOf(this.configurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultConfiguration)) {
            return false;
        }

        DefaultConfiguration other = (DefaultConfiguration) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.instanceOcpuCount, other.instanceOcpuCount)
                && java.util.Objects.equals(
                        this.instanceMemorySizeInGBs, other.instanceMemorySizeInGBs)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.configurationDetails, other.configurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceOcpuCount == null ? 43 : this.instanceOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceMemorySizeInGBs == null
                                ? 43
                                : this.instanceMemorySizeInGBs.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationDetails == null
                                ? 43
                                : this.configurationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
