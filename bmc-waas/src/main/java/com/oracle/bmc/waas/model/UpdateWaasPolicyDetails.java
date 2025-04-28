/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * Updates the configuration details of a WAAS policy.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateWaasPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateWaasPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "additionalDomains",
        "origins",
        "originGroups",
        "policyConfig",
        "wafConfig",
        "freeformTags",
        "definedTags"
    })
    public UpdateWaasPolicyDetails(
            String displayName,
            java.util.List<String> additionalDomains,
            java.util.Map<String, Origin> origins,
            java.util.Map<String, OriginGroup> originGroups,
            PolicyConfig policyConfig,
            WafConfig wafConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.additionalDomains = additionalDomains;
        this.origins = origins;
        this.originGroups = originGroups;
        this.policyConfig = policyConfig;
        this.wafConfig = wafConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name for the WAAS policy. The name can be changed and does not need to be
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the WAAS policy. The name can be changed and does not need to be
         * unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** An array of additional domains protected by this WAAS policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
        private java.util.List<String> additionalDomains;

        /**
         * An array of additional domains protected by this WAAS policy.
         *
         * @param additionalDomains the value to set
         * @return this builder
         */
        public Builder additionalDomains(java.util.List<String> additionalDomains) {
            this.additionalDomains = additionalDomains;
            this.__explicitlySet__.add("additionalDomains");
            return this;
        }
        /**
         * A map of host to origin for the web application. The key should be a customer friendly
         * name for the host, ex. primary, secondary, etc.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("origins")
        private java.util.Map<String, Origin> origins;

        /**
         * A map of host to origin for the web application. The key should be a customer friendly
         * name for the host, ex. primary, secondary, etc.
         *
         * @param origins the value to set
         * @return this builder
         */
        public Builder origins(java.util.Map<String, Origin> origins) {
            this.origins = origins;
            this.__explicitlySet__.add("origins");
            return this;
        }
        /**
         * The map of origin groups and their keys used to associate origins to the {@code
         * wafConfig}. Origin groups allow you to apply weights to groups of origins for load
         * balancing purposes. Origins with higher weights will receive larger proportions of client
         * requests. To add additional origins to your WAAS policy, update the {@code origins} field
         * of a {@code UpdateWaasPolicy} request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
        private java.util.Map<String, OriginGroup> originGroups;

        /**
         * The map of origin groups and their keys used to associate origins to the {@code
         * wafConfig}. Origin groups allow you to apply weights to groups of origins for load
         * balancing purposes. Origins with higher weights will receive larger proportions of client
         * requests. To add additional origins to your WAAS policy, update the {@code origins} field
         * of a {@code UpdateWaasPolicy} request.
         *
         * @param originGroups the value to set
         * @return this builder
         */
        public Builder originGroups(java.util.Map<String, OriginGroup> originGroups) {
            this.originGroups = originGroups;
            this.__explicitlySet__.add("originGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyConfig")
        private PolicyConfig policyConfig;

        public Builder policyConfig(PolicyConfig policyConfig) {
            this.policyConfig = policyConfig;
            this.__explicitlySet__.add("policyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wafConfig")
        private WafConfig wafConfig;

        public Builder wafConfig(WafConfig wafConfig) {
            this.wafConfig = wafConfig;
            this.__explicitlySet__.add("wafConfig");
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

        public UpdateWaasPolicyDetails build() {
            UpdateWaasPolicyDetails model =
                    new UpdateWaasPolicyDetails(
                            this.displayName,
                            this.additionalDomains,
                            this.origins,
                            this.originGroups,
                            this.policyConfig,
                            this.wafConfig,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateWaasPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("additionalDomains")) {
                this.additionalDomains(model.getAdditionalDomains());
            }
            if (model.wasPropertyExplicitlySet("origins")) {
                this.origins(model.getOrigins());
            }
            if (model.wasPropertyExplicitlySet("originGroups")) {
                this.originGroups(model.getOriginGroups());
            }
            if (model.wasPropertyExplicitlySet("policyConfig")) {
                this.policyConfig(model.getPolicyConfig());
            }
            if (model.wasPropertyExplicitlySet("wafConfig")) {
                this.wafConfig(model.getWafConfig());
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
     * A user-friendly name for the WAAS policy. The name can be changed and does not need to be
     * unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the WAAS policy. The name can be changed and does not need to be
     * unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** An array of additional domains protected by this WAAS policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
    private final java.util.List<String> additionalDomains;

    /**
     * An array of additional domains protected by this WAAS policy.
     *
     * @return the value
     */
    public java.util.List<String> getAdditionalDomains() {
        return additionalDomains;
    }

    /**
     * A map of host to origin for the web application. The key should be a customer friendly name
     * for the host, ex. primary, secondary, etc.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("origins")
    private final java.util.Map<String, Origin> origins;

    /**
     * A map of host to origin for the web application. The key should be a customer friendly name
     * for the host, ex. primary, secondary, etc.
     *
     * @return the value
     */
    public java.util.Map<String, Origin> getOrigins() {
        return origins;
    }

    /**
     * The map of origin groups and their keys used to associate origins to the {@code wafConfig}.
     * Origin groups allow you to apply weights to groups of origins for load balancing purposes.
     * Origins with higher weights will receive larger proportions of client requests. To add
     * additional origins to your WAAS policy, update the {@code origins} field of a {@code
     * UpdateWaasPolicy} request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("originGroups")
    private final java.util.Map<String, OriginGroup> originGroups;

    /**
     * The map of origin groups and their keys used to associate origins to the {@code wafConfig}.
     * Origin groups allow you to apply weights to groups of origins for load balancing purposes.
     * Origins with higher weights will receive larger proportions of client requests. To add
     * additional origins to your WAAS policy, update the {@code origins} field of a {@code
     * UpdateWaasPolicy} request.
     *
     * @return the value
     */
    public java.util.Map<String, OriginGroup> getOriginGroups() {
        return originGroups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("policyConfig")
    private final PolicyConfig policyConfig;

    public PolicyConfig getPolicyConfig() {
        return policyConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("wafConfig")
    private final WafConfig wafConfig;

    public WafConfig getWafConfig() {
        return wafConfig;
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
        sb.append("UpdateWaasPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", additionalDomains=").append(String.valueOf(this.additionalDomains));
        sb.append(", origins=").append(String.valueOf(this.origins));
        sb.append(", originGroups=").append(String.valueOf(this.originGroups));
        sb.append(", policyConfig=").append(String.valueOf(this.policyConfig));
        sb.append(", wafConfig=").append(String.valueOf(this.wafConfig));
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
        if (!(o instanceof UpdateWaasPolicyDetails)) {
            return false;
        }

        UpdateWaasPolicyDetails other = (UpdateWaasPolicyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.additionalDomains, other.additionalDomains)
                && java.util.Objects.equals(this.origins, other.origins)
                && java.util.Objects.equals(this.originGroups, other.originGroups)
                && java.util.Objects.equals(this.policyConfig, other.policyConfig)
                && java.util.Objects.equals(this.wafConfig, other.wafConfig)
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
                        + (this.additionalDomains == null ? 43 : this.additionalDomains.hashCode());
        result = (result * PRIME) + (this.origins == null ? 43 : this.origins.hashCode());
        result = (result * PRIME) + (this.originGroups == null ? 43 : this.originGroups.hashCode());
        result = (result * PRIME) + (this.policyConfig == null ? 43 : this.policyConfig.hashCode());
        result = (result * PRIME) + (this.wafConfig == null ? 43 : this.wafConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
