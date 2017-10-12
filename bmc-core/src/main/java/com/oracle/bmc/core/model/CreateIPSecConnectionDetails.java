/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIPSecConnectionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateIPSecConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeId")
        private String cpeId;

        public Builder cpeId(String cpeId) {
            this.cpeId = cpeId;
            this.__explicitlySet__.add("cpeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
        private java.util.List<String> staticRoutes;

        public Builder staticRoutes(java.util.List<String> staticRoutes) {
            this.staticRoutes = staticRoutes;
            this.__explicitlySet__.add("staticRoutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIPSecConnectionDetails build() {
            CreateIPSecConnectionDetails __instance__ =
                    new CreateIPSecConnectionDetails(
                            compartmentId, cpeId, displayName, drgId, staticRoutes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the CPE.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeId")
    String cpeId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the DRG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    String drgId;

    /**
     * Static routes to the CPE. At least one route must be included. The CIDR must not be a
     * multicast address or class E address.
     * <p>
     * Example: `10.0.1.0/24`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
    java.util.List<String> staticRoutes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
