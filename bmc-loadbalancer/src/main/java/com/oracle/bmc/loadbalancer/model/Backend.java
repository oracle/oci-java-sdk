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
 * The configuration of a backend server that is a member of a load balancer backend set.
 * For more information, see [Managing Backend Servers](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/managingbackendservers.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = Backend.Builder.class)
public class Backend {
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

        @JsonProperty("name")
        private String name;

        @JsonProperty("offline")
        private Boolean offline;

        @JsonProperty("port")
        private Integer port;

        @JsonProperty("weight")
        private Integer weight;

        public Backend build() {
            return new Backend(backup, drain, ipAddress, name, offline, port, weight);
        }

        @JsonIgnore
        public Builder copy(Backend o) {
            return backup(o.getBackup())
                    .drain(o.getDrain())
                    .ipAddress(o.getIpAddress())
                    .name(o.getName())
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
    @Valid
    @NotNull
    Boolean backup;

    /**
     * Whether the load balancer should drain this server. Servers marked \"drain\" receive no new
     * incoming traffic.
     * <p>
     * Example: `true`
     *
     **/
    @JsonProperty("drain")
    @Valid
    @NotNull
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
     * A name to uniquely identify this backend server in the backend set.
     * <p>
     * Example: `My first backend server`
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    String name;

    /**
     * Whether the load balancer should treat this server as offline. Offline servers receive no incoming
     * traffic.
     * <p>
     * Example: `true`
     *
     **/
    @JsonProperty("offline")
    @Valid
    @NotNull
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
    @Valid
    @NotNull
    Integer weight;
}
