/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
@JsonDeserialize(builder = CreateIPSecConnectionDetails.Builder.class)
public class CreateIPSecConnectionDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("cpeId")
        private String cpeId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("drgId")
        private String drgId;

        @JsonProperty("staticRoutes")
        private List<String> staticRoutes;

        public CreateIPSecConnectionDetails build() {
            return new CreateIPSecConnectionDetails(
                    compartmentId, cpeId, displayName, drgId, staticRoutes);
        }

        @JsonIgnore
        public Builder copy(CreateIPSecConnectionDetails o) {
            return compartmentId(o.getCompartmentId())
                    .cpeId(o.getCpeId())
                    .displayName(o.getDisplayName())
                    .drgId(o.getDrgId())
                    .staticRoutes(o.getStaticRoutes());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment to contain the IPSec connection.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The OCID of the CPE.
     **/
    @JsonProperty("cpeId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String cpeId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the DRG.
     **/
    @JsonProperty("drgId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String drgId;

    /**
     * Static routes to the CPE. At least one route must be included. The CIDR must not be a
     * multicast address or class E address.
     * <p>
     * Example: `10.0.1.0/24`
     *
     **/
    @JsonProperty("staticRoutes")
    @Valid
    @NotNull
    List<String> staticRoutes;
}
