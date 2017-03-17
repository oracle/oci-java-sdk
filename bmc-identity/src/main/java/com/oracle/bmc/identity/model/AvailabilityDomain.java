/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * One or more isolated, fault-tolerant Oracle data centers that host cloud resources such as instances, volumes,
 * and subnets. A region contains several Availability Domains. For more information, see
 * [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = AvailabilityDomain.Builder.class)
public class AvailabilityDomain {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("name")
        private String name;

        @JsonProperty("compartmentId")
        private String compartmentId;

        public AvailabilityDomain build() {
            return new AvailabilityDomain(name, compartmentId);
        }

        @JsonIgnore
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
    @JsonProperty("name")
    String name;

    /**
     * The OCID of the tenancy.
     **/
    @JsonProperty("compartmentId")
    String compartmentId;
}
