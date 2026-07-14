/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Common creation properties shared by HostedApplication and HostedApplicationIam. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateHostedApplicationBaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateHostedApplicationBaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "description",
        "scalingConfig",
        "networkingConfig",
        "storageConfigs",
        "environmentVariables",
        "freeformTags",
        "definedTags"
    })
    public CreateHostedApplicationBaseDetails(
            String displayName,
            String compartmentId,
            String description,
            ScalingConfig scalingConfig,
            NetworkingConfig networkingConfig,
            java.util.List<StorageConfig> storageConfigs,
            java.util.List<EnvironmentVariable> environmentVariables,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.scalingConfig = scalingConfig;
        this.networkingConfig = networkingConfig;
        this.storageConfigs = storageConfigs;
        this.environmentVariables = environmentVariables;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user-friendly display name for the Hosted Application. Does not need to be unique and
         * can be updated after creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly display name for the Hosted Application. Does not need to be unique and
         * can be updated after creation.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The compartment OCID for the Hosted Application. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID for the Hosted Application.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The description for the Hosted Application. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description for the Hosted Application.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scalingConfig")
        private ScalingConfig scalingConfig;

        public Builder scalingConfig(ScalingConfig scalingConfig) {
            this.scalingConfig = scalingConfig;
            this.__explicitlySet__.add("scalingConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkingConfig")
        private NetworkingConfig networkingConfig;

        public Builder networkingConfig(NetworkingConfig networkingConfig) {
            this.networkingConfig = networkingConfig;
            this.__explicitlySet__.add("networkingConfig");
            return this;
        }
        /**
         * The list of storage configuration for the Hosted Application. Defines a list of
         * service-managed storage back-ends.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageConfigs")
        private java.util.List<StorageConfig> storageConfigs;

        /**
         * The list of storage configuration for the Hosted Application. Defines a list of
         * service-managed storage back-ends.
         *
         * @param storageConfigs the value to set
         * @return this builder
         */
        public Builder storageConfigs(java.util.List<StorageConfig> storageConfigs) {
            this.storageConfigs = storageConfigs;
            this.__explicitlySet__.add("storageConfigs");
            return this;
        }
        /**
         * The list of environment variables for the Hosted Application. Defines a list of
         * environment variables injected at runtime.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.List<EnvironmentVariable> environmentVariables;

        /**
         * The list of environment variables for the Hosted Application. Defines a list of
         * environment variables injected at runtime.
         *
         * @param environmentVariables the value to set
         * @return this builder
         */
        public Builder environmentVariables(
                java.util.List<EnvironmentVariable> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateHostedApplicationBaseDetails build() {
            CreateHostedApplicationBaseDetails model =
                    new CreateHostedApplicationBaseDetails(
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.scalingConfig,
                            this.networkingConfig,
                            this.storageConfigs,
                            this.environmentVariables,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateHostedApplicationBaseDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("scalingConfig")) {
                this.scalingConfig(model.getScalingConfig());
            }
            if (model.wasPropertyExplicitlySet("networkingConfig")) {
                this.networkingConfig(model.getNetworkingConfig());
            }
            if (model.wasPropertyExplicitlySet("storageConfigs")) {
                this.storageConfigs(model.getStorageConfigs());
            }
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The user-friendly display name for the Hosted Application. Does not need to be unique and can
     * be updated after creation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly display name for the Hosted Application. Does not need to be unique and can
     * be updated after creation.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The compartment OCID for the Hosted Application. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID for the Hosted Application.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The description for the Hosted Application. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description for the Hosted Application.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scalingConfig")
    private final ScalingConfig scalingConfig;

    public ScalingConfig getScalingConfig() {
        return scalingConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkingConfig")
    private final NetworkingConfig networkingConfig;

    public NetworkingConfig getNetworkingConfig() {
        return networkingConfig;
    }

    /**
     * The list of storage configuration for the Hosted Application. Defines a list of
     * service-managed storage back-ends.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageConfigs")
    private final java.util.List<StorageConfig> storageConfigs;

    /**
     * The list of storage configuration for the Hosted Application. Defines a list of
     * service-managed storage back-ends.
     *
     * @return the value
     */
    public java.util.List<StorageConfig> getStorageConfigs() {
        return storageConfigs;
    }

    /**
     * The list of environment variables for the Hosted Application. Defines a list of environment
     * variables injected at runtime.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.List<EnvironmentVariable> environmentVariables;

    /**
     * The list of environment variables for the Hosted Application. Defines a list of environment
     * variables injected at runtime.
     *
     * @return the value
     */
    public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateHostedApplicationBaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scalingConfig=").append(String.valueOf(this.scalingConfig));
        sb.append(", networkingConfig=").append(String.valueOf(this.networkingConfig));
        sb.append(", storageConfigs=").append(String.valueOf(this.storageConfigs));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateHostedApplicationBaseDetails)) {
            return false;
        }

        CreateHostedApplicationBaseDetails other = (CreateHostedApplicationBaseDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.scalingConfig, other.scalingConfig)
                && java.util.Objects.equals(this.networkingConfig, other.networkingConfig)
                && java.util.Objects.equals(this.storageConfigs, other.storageConfigs)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result =
                (result * PRIME)
                        + (this.scalingConfig == null ? 43 : this.scalingConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.networkingConfig == null ? 43 : this.networkingConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.storageConfigs == null ? 43 : this.storageConfigs.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentVariables == null
                                ? 43
                                : this.environmentVariables.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
