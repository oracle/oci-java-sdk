/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A load balancer IP address.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IpAddress.Builder.class)
public class IpAddress {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
        private Boolean isPublic;

        public IpAddress build() {
            return new IpAddress(ipAddress, isPublic);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpAddress o) {
            return ipAddress(o.getIpAddress()).isPublic(o.getIsPublic());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * An IP address.
     * <p>
     * Example: `128.148.10.20`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String ipAddress;

    /**
     * Whether the IP address is public or private.
     * <p>
     * If \"true\", the IP address is public and accessible from the internet.
     * <p>
     * If \"false\", the IP address is private and accessible only from within the associated VCN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPublic")
    Boolean isPublic;
}
