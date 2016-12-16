/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateSecurityListDetails.Builder.class)
public class CreateSecurityListDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("egressSecurityRules")
        private List<EgressSecurityRule> egressSecurityRules;

        @JsonProperty("ingressSecurityRules")
        private List<IngressSecurityRule> ingressSecurityRules;

        @JsonProperty("vcnId")
        private String vcnId;

        public CreateSecurityListDetails build() {
            return new CreateSecurityListDetails(
                    compartmentId, displayName, egressSecurityRules, ingressSecurityRules, vcnId);
        }

        @JsonIgnore
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
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * Rules for allowing egress IP packets.
     **/
    @JsonProperty("egressSecurityRules")
    @Valid
    @NotNull
    List<EgressSecurityRule> egressSecurityRules;

    /**
     * Rules for allowing ingress IP packets.
     **/
    @JsonProperty("ingressSecurityRules")
    @Valid
    @NotNull
    List<IngressSecurityRule> ingressSecurityRules;

    /**
     * The OCID of the VCN the security list belongs to.
     **/
    @JsonProperty("vcnId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String vcnId;
}
