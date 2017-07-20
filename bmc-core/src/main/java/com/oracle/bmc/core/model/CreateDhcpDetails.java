/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDhcpDetails.Builder.class
)
public class CreateDhcpDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private java.util.List<DhcpOption> options;

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public CreateDhcpDetails build() {
            return new CreateDhcpDetails(compartmentId, displayName, options, vcnId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDhcpDetails o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .options(o.getOptions())
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
     * The OCID of the compartment to contain the set of DHCP options.
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
     * A set of DHCP options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<DhcpOption> options;

    /**
     * The OCID of the VCN the set of DHCP options belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String vcnId;
}
