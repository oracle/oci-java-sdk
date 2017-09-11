/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * The root compartment that contains all of your organization's compartments and other
 * Oracle Bare Metal Cloud Services cloud resources. When you sign up for Oracle Bare Metal Cloud Services,
 * Oracle creates a tenancy for your company, which is a secure and isolated partition
 * where you can create, organize, and administer your cloud resources.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Tenancy.Builder.class)
public class Tenancy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        @com.fasterxml.jackson.annotation.JsonProperty("homeRegionKey")
        private String homeRegionKey;

        public Tenancy build() {
            return new Tenancy(id, name, description, homeRegionKey);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Tenancy o) {
            return id(o.getId())
                    .name(o.getName())
                    .description(o.getDescription())
                    .homeRegionKey(o.getHomeRegionKey());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The description of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The region key for the tenancy's home region.
     * <p>
     * Allowed values are:
     * - `IAD`
     * - `PHX`
     * - `FRA`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("homeRegionKey")
    String homeRegionKey;
}
