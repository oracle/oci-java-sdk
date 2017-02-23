/**
 * Copyright (c) 2016-2017 Oracle and/or its affiliates. All rights reserved.
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
@JsonDeserialize(builder = CreateVcnDetails.Builder.class)
public class CreateVcnDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("cidrBlock")
        private String cidrBlock;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        public CreateVcnDetails build() {
            return new CreateVcnDetails(cidrBlock, compartmentId, displayName);
        }

        @JsonIgnore
        public Builder copy(CreateVcnDetails o) {
            return cidrBlock(o.getCidrBlock())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The CIDR IP address block of the VCN.
     * <p>
     * Example: `172.16.0.0/16`
     *
     **/
    @JsonProperty("cidrBlock")
    @Valid
    @NotNull
    @Size(min = 1, max = 32)
    String cidrBlock;

    /**
     * The OCID of the compartment to contain the VCN.
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
}
