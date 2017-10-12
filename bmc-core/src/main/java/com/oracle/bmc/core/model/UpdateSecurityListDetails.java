/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateSecurityListDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateSecurityListDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityRules")
        private java.util.List<EgressSecurityRule> egressSecurityRules;

        public Builder egressSecurityRules(java.util.List<EgressSecurityRule> egressSecurityRules) {
            this.egressSecurityRules = egressSecurityRules;
            this.__explicitlySet__.add("egressSecurityRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityRules")
        private java.util.List<IngressSecurityRule> ingressSecurityRules;

        public Builder ingressSecurityRules(
                java.util.List<IngressSecurityRule> ingressSecurityRules) {
            this.ingressSecurityRules = ingressSecurityRules;
            this.__explicitlySet__.add("ingressSecurityRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSecurityListDetails build() {
            UpdateSecurityListDetails __instance__ =
                    new UpdateSecurityListDetails(
                            displayName, egressSecurityRules, ingressSecurityRules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSecurityListDetails o) {
            return displayName(o.getDisplayName())
                    .egressSecurityRules(o.getEgressSecurityRules())
                    .ingressSecurityRules(o.getIngressSecurityRules());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Rules for allowing egress IP packets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityRules")
    java.util.List<EgressSecurityRule> egressSecurityRules;

    /**
     * Rules for allowing ingress IP packets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityRules")
    java.util.List<IngressSecurityRule> ingressSecurityRules;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
