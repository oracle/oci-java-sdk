/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateCpeDetails.Builder.class)
public class CreateCpeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public CreateCpeDetails build() {
            return new CreateCpeDetails(compartmentId, displayName, ipAddress);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCpeDetails o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .ipAddress(o.getIpAddress());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment to contain the CPE.
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
     * The public IP address of the on-premise router.
     * <p>
     * Example: `143.19.23.16`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 46)
    String ipAddress;
}
