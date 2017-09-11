/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration of a backend server that is a member of a load balancer backend set.
 * For more information, see [Managing Backend Servers](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/managingbackendservers.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Backend.Builder.class)
public class Backend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backup")
        private Boolean backup;

        @com.fasterxml.jackson.annotation.JsonProperty("drain")
        private Boolean drain;

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("offline")
        private Boolean offline;

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        public Backend build() {
            return new Backend(backup, drain, ipAddress, name, offline, port, weight);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("backup")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Boolean backup;

    /**
     * Whether the load balancer should drain this server. Servers marked \"drain\" receive no new
     * incoming traffic.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drain")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Boolean drain;

    /**
     * The IP address of the backend server.
     * <p>
     * Example: `10.10.10.4`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String ipAddress;

    /**
     * A read-only field showing the IP address and port that uniquely identify this backend server in the backend set.
     * <p>
     * Example: `10.10.10.4:8080`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String name;

    /**
     * Whether the load balancer should treat this server as offline. Offline servers receive no incoming
     * traffic.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offline")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Boolean offline;

    /**
     * The communication port for the backend server.
     * <p>
     * Example: `8080`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
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
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Integer weight;
}
