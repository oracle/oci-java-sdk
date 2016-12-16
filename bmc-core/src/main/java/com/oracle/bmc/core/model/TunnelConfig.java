/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * Specific connection details for an IPSec tunnel.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = TunnelConfig.Builder.class)
public class TunnelConfig {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("ipAddress")
        private String ipAddress;

        @JsonProperty("sharedSecret")
        private String sharedSecret;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public TunnelConfig build() {
            return new TunnelConfig(ipAddress, sharedSecret, timeCreated);
        }

        @JsonIgnore
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
    @JsonProperty("ipAddress")
    @Valid
    @NotNull
    @Size(min = 1, max = 46)
    String ipAddress;

    /**
     * The shared secret of the IPSec tunnel.
     * <p>
     * Example: `vFG2IF6TWq4UToUiLSRDoJEUs6j1c.p8G.dVQxiMfMO0yXMLi.lZTbYIWhGu4V8o`
     *
     **/
    @JsonProperty("sharedSecret")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String sharedSecret;

    /**
     * The date and time the IPSec connection was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;
}
