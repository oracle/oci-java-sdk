/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The data to create an instance pool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateInstancePoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateInstancePoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "instanceConfigurationId",
        "placementConfigurations",
        "size",
        "loadBalancers",
        "instanceDisplayNameFormatter",
        "instanceHostnameFormatter",
        "lifecycleManagement"
    })
    public CreateInstancePoolDetails(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String instanceConfigurationId,
            java.util.List<CreateInstancePoolPlacementConfigurationDetails> placementConfigurations,
            Integer size,
            java.util.List<AttachLoadBalancerDetails> loadBalancers,
            String instanceDisplayNameFormatter,
            String instanceHostnameFormatter,
            InstancePoolLifecycleManagementDetails lifecycleManagement) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.instanceConfigurationId = instanceConfigurationId;
        this.placementConfigurations = placementConfigurations;
        this.size = size;
        this.loadBalancers = loadBalancers;
        this.instanceDisplayNameFormatter = instanceDisplayNameFormatter;
        this.instanceHostnameFormatter = instanceHostnameFormatter;
        this.lifecycleManagement = lifecycleManagement;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the instance pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the instance pool.
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
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance configuration associated with the instance pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
        private String instanceConfigurationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance configuration associated with the instance pool.
         *
         * @param instanceConfigurationId the value to set
         * @return this builder
         */
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            this.instanceConfigurationId = instanceConfigurationId;
            this.__explicitlySet__.add("instanceConfigurationId");
            return this;
        }
        /**
         * The placement configurations for the instance pool. Provide one placement configuration
         * for each availability domain.
         *
         * <p>To use the instance pool with a regional subnet, provide a placement configuration for
         * each availability domain, and include the regional subnet in each placement
         * configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("placementConfigurations")
        private java.util.List<CreateInstancePoolPlacementConfigurationDetails>
                placementConfigurations;

        /**
         * The placement configurations for the instance pool. Provide one placement configuration
         * for each availability domain.
         *
         * <p>To use the instance pool with a regional subnet, provide a placement configuration for
         * each availability domain, and include the regional subnet in each placement
         * configuration.
         *
         * @param placementConfigurations the value to set
         * @return this builder
         */
        public Builder placementConfigurations(
                java.util.List<CreateInstancePoolPlacementConfigurationDetails>
                        placementConfigurations) {
            this.placementConfigurations = placementConfigurations;
            this.__explicitlySet__.add("placementConfigurations");
            return this;
        }
        /** The number of instances that should be in the instance pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Integer size;

        /**
         * The number of instances that should be in the instance pool.
         *
         * @param size the value to set
         * @return this builder
         */
        public Builder size(Integer size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }
        /** The load balancers to attach to the instance pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancers")
        private java.util.List<AttachLoadBalancerDetails> loadBalancers;

        /**
         * The load balancers to attach to the instance pool.
         *
         * @param loadBalancers the value to set
         * @return this builder
         */
        public Builder loadBalancers(java.util.List<AttachLoadBalancerDetails> loadBalancers) {
            this.loadBalancers = loadBalancers;
            this.__explicitlySet__.add("loadBalancers");
            return this;
        }
        /**
         * A user-friendly formatter for the instance pool's instances. Instance displaynames follow
         * the format. The formatter does not retroactively change instance's displaynames, only
         * instance displaynames in the future follow the format
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNameFormatter")
        private String instanceDisplayNameFormatter;

        /**
         * A user-friendly formatter for the instance pool's instances. Instance displaynames follow
         * the format. The formatter does not retroactively change instance's displaynames, only
         * instance displaynames in the future follow the format
         *
         * @param instanceDisplayNameFormatter the value to set
         * @return this builder
         */
        public Builder instanceDisplayNameFormatter(String instanceDisplayNameFormatter) {
            this.instanceDisplayNameFormatter = instanceDisplayNameFormatter;
            this.__explicitlySet__.add("instanceDisplayNameFormatter");
            return this;
        }
        /**
         * A user-friendly formatter for the instance pool's instances. Instance hostnames follow
         * the format. The formatter does not retroactively change instance's hostnames, only
         * instance hostnames in the future follow the format
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceHostnameFormatter")
        private String instanceHostnameFormatter;

        /**
         * A user-friendly formatter for the instance pool's instances. Instance hostnames follow
         * the format. The formatter does not retroactively change instance's hostnames, only
         * instance hostnames in the future follow the format
         *
         * @param instanceHostnameFormatter the value to set
         * @return this builder
         */
        public Builder instanceHostnameFormatter(String instanceHostnameFormatter) {
            this.instanceHostnameFormatter = instanceHostnameFormatter;
            this.__explicitlySet__.add("instanceHostnameFormatter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleManagement")
        private InstancePoolLifecycleManagementDetails lifecycleManagement;

        public Builder lifecycleManagement(
                InstancePoolLifecycleManagementDetails lifecycleManagement) {
            this.lifecycleManagement = lifecycleManagement;
            this.__explicitlySet__.add("lifecycleManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateInstancePoolDetails build() {
            CreateInstancePoolDetails model =
                    new CreateInstancePoolDetails(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.instanceConfigurationId,
                            this.placementConfigurations,
                            this.size,
                            this.loadBalancers,
                            this.instanceDisplayNameFormatter,
                            this.instanceHostnameFormatter,
                            this.lifecycleManagement);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateInstancePoolDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("instanceConfigurationId")) {
                this.instanceConfigurationId(model.getInstanceConfigurationId());
            }
            if (model.wasPropertyExplicitlySet("placementConfigurations")) {
                this.placementConfigurations(model.getPlacementConfigurations());
            }
            if (model.wasPropertyExplicitlySet("size")) {
                this.size(model.getSize());
            }
            if (model.wasPropertyExplicitlySet("loadBalancers")) {
                this.loadBalancers(model.getLoadBalancers());
            }
            if (model.wasPropertyExplicitlySet("instanceDisplayNameFormatter")) {
                this.instanceDisplayNameFormatter(model.getInstanceDisplayNameFormatter());
            }
            if (model.wasPropertyExplicitlySet("instanceHostnameFormatter")) {
                this.instanceHostnameFormatter(model.getInstanceHostnameFormatter());
            }
            if (model.wasPropertyExplicitlySet("lifecycleManagement")) {
                this.lifecycleManagement(model.getLifecycleManagement());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the instance pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the instance pool.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance configuration associated with the instance pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
    private final String instanceConfigurationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance configuration associated with the instance pool.
     *
     * @return the value
     */
    public String getInstanceConfigurationId() {
        return instanceConfigurationId;
    }

    /**
     * The placement configurations for the instance pool. Provide one placement configuration for
     * each availability domain.
     *
     * <p>To use the instance pool with a regional subnet, provide a placement configuration for
     * each availability domain, and include the regional subnet in each placement configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("placementConfigurations")
    private final java.util.List<CreateInstancePoolPlacementConfigurationDetails>
            placementConfigurations;

    /**
     * The placement configurations for the instance pool. Provide one placement configuration for
     * each availability domain.
     *
     * <p>To use the instance pool with a regional subnet, provide a placement configuration for
     * each availability domain, and include the regional subnet in each placement configuration.
     *
     * @return the value
     */
    public java.util.List<CreateInstancePoolPlacementConfigurationDetails>
            getPlacementConfigurations() {
        return placementConfigurations;
    }

    /** The number of instances that should be in the instance pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Integer size;

    /**
     * The number of instances that should be in the instance pool.
     *
     * @return the value
     */
    public Integer getSize() {
        return size;
    }

    /** The load balancers to attach to the instance pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancers")
    private final java.util.List<AttachLoadBalancerDetails> loadBalancers;

    /**
     * The load balancers to attach to the instance pool.
     *
     * @return the value
     */
    public java.util.List<AttachLoadBalancerDetails> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * A user-friendly formatter for the instance pool's instances. Instance displaynames follow the
     * format. The formatter does not retroactively change instance's displaynames, only instance
     * displaynames in the future follow the format
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDisplayNameFormatter")
    private final String instanceDisplayNameFormatter;

    /**
     * A user-friendly formatter for the instance pool's instances. Instance displaynames follow the
     * format. The formatter does not retroactively change instance's displaynames, only instance
     * displaynames in the future follow the format
     *
     * @return the value
     */
    public String getInstanceDisplayNameFormatter() {
        return instanceDisplayNameFormatter;
    }

    /**
     * A user-friendly formatter for the instance pool's instances. Instance hostnames follow the
     * format. The formatter does not retroactively change instance's hostnames, only instance
     * hostnames in the future follow the format
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceHostnameFormatter")
    private final String instanceHostnameFormatter;

    /**
     * A user-friendly formatter for the instance pool's instances. Instance hostnames follow the
     * format. The formatter does not retroactively change instance's hostnames, only instance
     * hostnames in the future follow the format
     *
     * @return the value
     */
    public String getInstanceHostnameFormatter() {
        return instanceHostnameFormatter;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleManagement")
    private final InstancePoolLifecycleManagementDetails lifecycleManagement;

    public InstancePoolLifecycleManagementDetails getLifecycleManagement() {
        return lifecycleManagement;
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
        sb.append("CreateInstancePoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", instanceConfigurationId=")
                .append(String.valueOf(this.instanceConfigurationId));
        sb.append(", placementConfigurations=")
                .append(String.valueOf(this.placementConfigurations));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", loadBalancers=").append(String.valueOf(this.loadBalancers));
        sb.append(", instanceDisplayNameFormatter=")
                .append(String.valueOf(this.instanceDisplayNameFormatter));
        sb.append(", instanceHostnameFormatter=")
                .append(String.valueOf(this.instanceHostnameFormatter));
        sb.append(", lifecycleManagement=").append(String.valueOf(this.lifecycleManagement));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateInstancePoolDetails)) {
            return false;
        }

        CreateInstancePoolDetails other = (CreateInstancePoolDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(
                        this.instanceConfigurationId, other.instanceConfigurationId)
                && java.util.Objects.equals(
                        this.placementConfigurations, other.placementConfigurations)
                && java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(this.loadBalancers, other.loadBalancers)
                && java.util.Objects.equals(
                        this.instanceDisplayNameFormatter, other.instanceDisplayNameFormatter)
                && java.util.Objects.equals(
                        this.instanceHostnameFormatter, other.instanceHostnameFormatter)
                && java.util.Objects.equals(this.lifecycleManagement, other.lifecycleManagement)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceConfigurationId == null
                                ? 43
                                : this.instanceConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.placementConfigurations == null
                                ? 43
                                : this.placementConfigurations.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancers == null ? 43 : this.loadBalancers.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceDisplayNameFormatter == null
                                ? 43
                                : this.instanceDisplayNameFormatter.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceHostnameFormatter == null
                                ? 43
                                : this.instanceHostnameFormatter.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleManagement == null
                                ? 43
                                : this.lifecycleManagement.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
