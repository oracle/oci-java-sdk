/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * Updates the configuration details of a WAAS policy.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateWaasPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateWaasPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
        private java.util.List<String> additionalDomains;

        public Builder additionalDomains(java.util.List<String> additionalDomains) {
            this.additionalDomains = additionalDomains;
            this.__explicitlySet__.add("additionalDomains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("origins")
        private java.util.Map<String, Origin> origins;

        public Builder origins(java.util.Map<String, Origin> origins) {
            this.origins = origins;
            this.__explicitlySet__.add("origins");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateWaasPolicyDetails build() {
            UpdateWaasPolicyDetails __instance__ =
                    new UpdateWaasPolicyDetails(
                            displayName,
                            additionalDomains,
                            origins,
                            policyConfig,
                            wafConfig,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateWaasPolicyDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .additionalDomains(o.getAdditionalDomains())
                            .origins(o.getOrigins())
                            .policyConfig(o.getPolicyConfig())
                            .wafConfig(o.getWafConfig())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * A user-friendly name for the WAAS policy. The name is can be changed and does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * An array of additional domains protected by this WAAS policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDomains")
    java.util.List<String> additionalDomains;

    /**
     * A map of host to origin for the web application. The key should be a customer friendly name for the host, ex. primary, secondary, etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("origins")
    java.util.Map<String, Origin> origins;

    @com.fasterxml.jackson.annotation.JsonProperty("policyConfig")
    PolicyConfig policyConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("wafConfig")
    WafConfig wafConfig;

    /**
     * A simple key-value pair without any defined schema.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/resourcetags.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
