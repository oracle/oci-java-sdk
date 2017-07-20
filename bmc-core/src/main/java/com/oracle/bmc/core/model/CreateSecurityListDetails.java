/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSecurityListDetails.Builder.class
)
public class CreateSecurityListDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityRules")
        private java.util.List<EgressSecurityRule> egressSecurityRules;

        @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityRules")
        private java.util.List<IngressSecurityRule> ingressSecurityRules;

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public CreateSecurityListDetails build() {
            return new CreateSecurityListDetails(
                    compartmentId, displayName, egressSecurityRules, ingressSecurityRules, vcnId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSecurityListDetails o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .egressSecurityRules(o.getEgressSecurityRules())
                    .ingressSecurityRules(o.getIngressSecurityRules())
                    .vcnId(o.getVcnId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment to contain the security list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * Rules for allowing egress IP packets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityRules")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<EgressSecurityRule> egressSecurityRules;

    /**
     * Rules for allowing ingress IP packets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityRules")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<IngressSecurityRule> ingressSecurityRules;

    /**
     * The OCID of the VCN the security list belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String vcnId;
}
