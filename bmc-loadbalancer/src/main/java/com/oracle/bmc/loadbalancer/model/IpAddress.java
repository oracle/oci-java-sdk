/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * A load balancer public IP address.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = IpAddress.Builder.class)
public class IpAddress {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("ipAddress")
        private String ipAddress;

        public IpAddress build() {
            return new IpAddress(ipAddress);
        }

        @JsonIgnore
        public Builder copy(IpAddress o) {
            return ipAddress(o.getIpAddress());
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
    @JsonProperty("ipAddress")
    @Valid
    @NotNull
    String ipAddress;
}
