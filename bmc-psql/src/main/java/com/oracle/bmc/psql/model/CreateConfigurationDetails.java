/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * The information to create a new configuration. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "description",
        "dbVersion",
        "shape",
        "isFlexible",
        "instanceOcpuCount",
        "instanceMemorySizeInGBs",
        "compatibleShapes",
        "dbConfigurationOverrides",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CreateConfigurationDetails(
            String displayName,
            String compartmentId,
            String description,
            String dbVersion,
            String shape,
            Boolean isFlexible,
            Integer instanceOcpuCount,
            Integer instanceMemorySizeInGBs,
            java.util.List<String> compatibleShapes,
            DbConfigurationOverrideCollection dbConfigurationOverrides,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.dbVersion = dbVersion;
        this.shape = shape;
        this.isFlexible = isFlexible;
        this.instanceOcpuCount = instanceOcpuCount;
        this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
        this.compatibleShapes = compatibleShapes;
        this.dbConfigurationOverrides = dbConfigurationOverrides;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** Details about the configuration set. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Details about the configuration set.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
        /**
         * The name of the shape for the configuration.
         *
         * <p>For multi-shape enabled configurations, it is set to PostgreSQL.X86 or similar. Please
         * use compatibleShapes property to set the list of supported shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The name of the shape for the configuration.
         *
         * <p>For multi-shape enabled configurations, it is set to PostgreSQL.X86 or similar. Please
         * use compatibleShapes property to set the list of supported shapes.
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
         * <p>Skip or set it's value to 0 if configuration is for a flexible shape.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
        private Integer instanceOcpuCount;

        /**
         * CPU core count.
         *
         * <p>Skip or set it's value to 0 if configuration is for a flexible shape.
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
         * <p>Skip or set it's value to 0 if configuration is for a flexible shape.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
        private Integer instanceMemorySizeInGBs;

        /**
         * Memory size in gigabytes with 1GB increment.
         *
         * <p>Skip or set it's value to 0 if configuration is for a flexible shape.
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

        @com.fasterxml.jackson.annotation.JsonProperty("dbConfigurationOverrides")
        private DbConfigurationOverrideCollection dbConfigurationOverrides;

        public Builder dbConfigurationOverrides(
                DbConfigurationOverrideCollection dbConfigurationOverrides) {
            this.dbConfigurationOverrides = dbConfigurationOverrides;
            this.__explicitlySet__.add("dbConfigurationOverrides");
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

        public CreateConfigurationDetails build() {
            CreateConfigurationDetails model =
                    new CreateConfigurationDetails(
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.dbVersion,
                            this.shape,
                            this.isFlexible,
                            this.instanceOcpuCount,
                            this.instanceMemorySizeInGBs,
                            this.compatibleShapes,
                            this.dbConfigurationOverrides,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
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
            if (model.wasPropertyExplicitlySet("dbConfigurationOverrides")) {
                this.dbConfigurationOverrides(model.getDbConfigurationOverrides());
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

    /** Details about the configuration set. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details about the configuration set.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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

    /**
     * The name of the shape for the configuration.
     *
     * <p>For multi-shape enabled configurations, it is set to PostgreSQL.X86 or similar. Please use
     * compatibleShapes property to set the list of supported shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The name of the shape for the configuration.
     *
     * <p>For multi-shape enabled configurations, it is set to PostgreSQL.X86 or similar. Please use
     * compatibleShapes property to set the list of supported shapes.
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
     * <p>Skip or set it's value to 0 if configuration is for a flexible shape.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
    private final Integer instanceOcpuCount;

    /**
     * CPU core count.
     *
     * <p>Skip or set it's value to 0 if configuration is for a flexible shape.
     *
     * @return the value
     */
    public Integer getInstanceOcpuCount() {
        return instanceOcpuCount;
    }

    /**
     * Memory size in gigabytes with 1GB increment.
     *
     * <p>Skip or set it's value to 0 if configuration is for a flexible shape.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
    private final Integer instanceMemorySizeInGBs;

    /**
     * Memory size in gigabytes with 1GB increment.
     *
     * <p>Skip or set it's value to 0 if configuration is for a flexible shape.
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

    @com.fasterxml.jackson.annotation.JsonProperty("dbConfigurationOverrides")
    private final DbConfigurationOverrideCollection dbConfigurationOverrides;

    public DbConfigurationOverrideCollection getDbConfigurationOverrides() {
        return dbConfigurationOverrides;
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
        sb.append("CreateConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", isFlexible=").append(String.valueOf(this.isFlexible));
        sb.append(", instanceOcpuCount=").append(String.valueOf(this.instanceOcpuCount));
        sb.append(", instanceMemorySizeInGBs=")
                .append(String.valueOf(this.instanceMemorySizeInGBs));
        sb.append(", compatibleShapes=").append(String.valueOf(this.compatibleShapes));
        sb.append(", dbConfigurationOverrides=")
                .append(String.valueOf(this.dbConfigurationOverrides));
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
        if (!(o instanceof CreateConfigurationDetails)) {
            return false;
        }

        CreateConfigurationDetails other = (CreateConfigurationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.isFlexible, other.isFlexible)
                && java.util.Objects.equals(this.instanceOcpuCount, other.instanceOcpuCount)
                && java.util.Objects.equals(
                        this.instanceMemorySizeInGBs, other.instanceMemorySizeInGBs)
                && java.util.Objects.equals(this.compatibleShapes, other.compatibleShapes)
                && java.util.Objects.equals(
                        this.dbConfigurationOverrides, other.dbConfigurationOverrides)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
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
                        + (this.dbConfigurationOverrides == null
                                ? 43
                                : this.dbConfigurationOverrides.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
