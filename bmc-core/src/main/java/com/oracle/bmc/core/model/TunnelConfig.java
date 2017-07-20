/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Specific connection details for an IPSec tunnel.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TunnelConfig.Builder.class)
public class TunnelConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
        private String sharedSecret;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public TunnelConfig build() {
            return new TunnelConfig(ipAddress, sharedSecret, timeCreated);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TunnelConfig o) {
            return ipAddress(o.getIpAddress())
                    .sharedSecret(o.getSharedSecret())
                    .timeCreated(o.getTimeCreated());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The IP address of Oracle's VPN headend.
     * <p>
     * Example: `129.146.17.50`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 46)
    String ipAddress;

    /**
     * The shared secret of the IPSec tunnel.
     * <p>
     * Example: `vFG2IF6TWq4UToUiLSRDoJEUs6j1c.p8G.dVQxiMfMO0yXMLi.lZTbYIWhGu4V8o`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String sharedSecret;

    /**
     * The date and time the IPSec connection was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
}
