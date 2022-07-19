/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Summary of an application.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplicationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApplicationSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "lifecycleState",
        "subnetIds",
        "networkSecurityGroupIds",
        "traceConfig",
        "freeformTags",
        "definedTags",
        "timeCreated",
        "timeUpdated",
        "imagePolicyConfig"
    })
    public ApplicationSummary(
            String id,
            String compartmentId,
            String displayName,
            Application.LifecycleState lifecycleState,
            java.util.List<String> subnetIds,
            java.util.List<String> networkSecurityGroupIds,
            ApplicationTraceConfig traceConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ImagePolicyConfig imagePolicyConfig) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.subnetIds = subnetIds;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.traceConfig = traceConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.imagePolicyConfig = imagePolicyConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the application.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment that contains the application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the application.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The display name of the application. The display name is unique within the compartment containing the application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the application. The display name is unique within the compartment containing the application.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The current state of the application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Application.LifecycleState lifecycleState;

        /**
         * The current state of the application.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(Application.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the subnets in which to run functions in the application.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the subnets in which to run functions in the application.
         *
         * @param subnetIds the value to set
         * @return this builder
         **/
        public Builder subnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            this.__explicitlySet__.add("subnetIds");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the Network Security Groups to add the application to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the Network Security Groups to add the application to.
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         **/
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("traceConfig")
        private ApplicationTraceConfig traceConfig;

        public Builder traceConfig(ApplicationTraceConfig traceConfig) {
            this.traceConfig = traceConfig;
            this.__explicitlySet__.add("traceConfig");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The time the application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * <p>
         * Example: {@code 2018-09-12T22:47:12.613Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * <p>
         * Example: {@code 2018-09-12T22:47:12.613Z}
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
         * The time the application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2018-09-12T22:47:12.613Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format.
         * Example: {@code 2018-09-12T22:47:12.613Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
        private ImagePolicyConfig imagePolicyConfig;

        public Builder imagePolicyConfig(ImagePolicyConfig imagePolicyConfig) {
            this.imagePolicyConfig = imagePolicyConfig;
            this.__explicitlySet__.add("imagePolicyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationSummary build() {
            ApplicationSummary __instance__ =
                    new ApplicationSummary(
                            id,
                            compartmentId,
                            displayName,
                            lifecycleState,
                            subnetIds,
                            networkSecurityGroupIds,
                            traceConfig,
                            freeformTags,
                            definedTags,
                            timeCreated,
                            timeUpdated,
                            imagePolicyConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .lifecycleState(o.getLifecycleState())
                            .subnetIds(o.getSubnetIds())
                            .networkSecurityGroupIds(o.getNetworkSecurityGroupIds())
                            .traceConfig(o.getTraceConfig())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .imagePolicyConfig(o.getImagePolicyConfig());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the application.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment that contains the application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the application.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The display name of the application. The display name is unique within the compartment containing the application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the application. The display name is unique within the compartment containing the application.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The current state of the application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Application.LifecycleState lifecycleState;

    /**
     * The current state of the application.
     *
     * @return the value
     **/
    public Application.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the subnets in which to run functions in the application.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    private final java.util.List<String> subnetIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the subnets in which to run functions in the application.
     *
     * @return the value
     **/
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the Network Security Groups to add the application to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of the Network Security Groups to add the application to.
     *
     * @return the value
     **/
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("traceConfig")
    private final ApplicationTraceConfig traceConfig;

    public ApplicationTraceConfig getTraceConfig() {
        return traceConfig;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The time the application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * <p>
     * Example: {@code 2018-09-12T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * <p>
     * Example: {@code 2018-09-12T22:47:12.613Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2018-09-12T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2018-09-12T22:47:12.613Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
    private final ImagePolicyConfig imagePolicyConfig;

    public ImagePolicyConfig getImagePolicyConfig() {
        return imagePolicyConfig;
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
        sb.append("ApplicationSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", subnetIds=").append(String.valueOf(this.subnetIds));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", traceConfig=").append(String.valueOf(this.traceConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", imagePolicyConfig=").append(String.valueOf(this.imagePolicyConfig));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationSummary)) {
            return false;
        }

        ApplicationSummary other = (ApplicationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.subnetIds, other.subnetIds)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.traceConfig, other.traceConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.imagePolicyConfig, other.imagePolicyConfig)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.subnetIds == null ? 43 : this.subnetIds.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + (this.traceConfig == null ? 43 : this.traceConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.imagePolicyConfig == null ? 43 : this.imagePolicyConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
