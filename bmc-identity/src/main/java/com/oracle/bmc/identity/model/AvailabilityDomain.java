/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * One or more isolated, fault-tolerant Oracle data centers that host cloud resources such as instances, volumes,
 * and subnets. A region contains several Availability Domains. For more information, see
 * [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AvailabilityDomain.Builder.class
)
public class AvailabilityDomain {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public AvailabilityDomain build() {
            return new AvailabilityDomain(name, compartmentId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailabilityDomain o) {
            return name(o.getName()).compartmentId(o.getCompartmentId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the Availability Domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;
}
