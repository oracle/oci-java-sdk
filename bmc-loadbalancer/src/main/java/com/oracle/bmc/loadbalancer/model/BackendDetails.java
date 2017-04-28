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
 * The load balancing configuration details of a backend server.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = BackendDetails.Builder.class)
public class BackendDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("backup")
        private Boolean backup;

        @JsonProperty("drain")
        private Boolean drain;

        @JsonProperty("ipAddress")
        private String ipAddress;

        @JsonProperty("offline")
        private Boolean offline;

        @JsonProperty("port")
        private Integer port;

        @JsonProperty("weight")
        private Integer weight;

        public BackendDetails build() {
            return new BackendDetails(backup, drain, ipAddress, offline, port, weight);
        }

        @JsonIgnore
        public Builder copy(BackendDetails o) {
            return backup(o.getBackup())
                    .drain(o.getDrain())
                    .ipAddress(o.getIpAddress())
                    .offline(o.getOffline())
                    .port(o.getPort())
                    .weight(o.getWeight());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Whether the load balancer should treat this server as a backup unit. If `true`, the load balancer forwards no ingress
     * traffic to this backend server unless all other backend servers not marked as \"backup\" fail the health check policy.
     * <p>
     * Example: `true`
     *
     **/
    @JsonProperty("backup")
    Boolean backup;

    /**
     * Whether the load balancer should drain this server. Servers marked \"drain\" receive no new
     * incoming traffic.
     * <p>
     * Example: `true`
     *
     **/
    @JsonProperty("drain")
    Boolean drain;

    /**
     * The IP address of the backend server.
     * <p>
     * Example: `10.10.10.4`
     *
     **/
    @JsonProperty("ipAddress")
    @Valid
    @NotNull
    String ipAddress;

    /**
     * Whether the load balancer should treat this server as offline. Offline servers receive no incoming
     * traffic.
     * <p>
     * Example: `true`
     *
     **/
    @JsonProperty("offline")
    Boolean offline;

    /**
     * The communication port for the backend server.
     * <p>
     * Example: `8080`
     *
     **/
    @JsonProperty("port")
    @Valid
    @NotNull
    @Min(1)
    @Max(65535)
    Integer port;

    /**
     * The load balancing policy weight assigned to the server. Backend servers with a higher weight receive a larger
     * proportion of incoming traffic. For example, a server weighted '3' receives 3 times the number of new connections
     * as a server weighted '1'.
     * For more information on load balancing policies, see
     * [How Load Balancing Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Reference/lbpolicies.htm).
     * <p>
     * Example: `3`
     *
     **/
    @JsonProperty("weight")
    Integer weight;
}
