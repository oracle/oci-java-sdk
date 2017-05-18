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
 * A localized geographic area, such as Phoenix, AZ. Oracle Bare Metal Cloud Services is hosted in regions and Availability
 * Domains. A region is composed of several Availability Domains. An Availability Domain is one or more data centers
 * located within a region. For more information, see [Regions and Availability Domains](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/regions.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = Region.Builder.class)
public class Region {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("key")
        private String key;

        @JsonProperty("name")
        private String name;

        public Region build() {
            return new Region(key, name);
        }

        @JsonIgnore
        public Builder copy(Region o) {
            return key(o.getKey()).name(o.getName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The key of the region.
     * <p>
     * Allowed values are:
     * - `PHX`
     * - `IAD`
     *
     **/
    @JsonProperty("key")
    @Size(min = 1, max = 16)
    String key;

    /**
     * The name of the region.
     * <p>
     * Allowed values are:
     * - `us-phoenix-1`
     * - `us-ashburn-1`
     *
     **/
    @JsonProperty("name")
    @Size(min = 1, max = 16)
    String name;
}
