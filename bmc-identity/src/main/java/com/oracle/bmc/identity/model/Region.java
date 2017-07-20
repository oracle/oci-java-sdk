/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Region.Builder.class)
public class Region {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Region build() {
            return new Region(key, name);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    @javax.validation.constraints.Size(min = 1, max = 16)
    String key;

    /**
     * The name of the region.
     * <p>
     * Allowed values are:
     * - `us-phoenix-1`
     * - `us-ashburn-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.constraints.Size(min = 1, max = 16)
    String name;
}
