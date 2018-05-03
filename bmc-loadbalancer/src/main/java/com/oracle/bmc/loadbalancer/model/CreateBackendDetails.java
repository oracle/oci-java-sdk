/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for creating a backend server in a backend set.
 * For more information on backend server configuration, see
 * [Managing Backend Servers](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/tasks/managingbackendservers.htm).
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateBackendDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateBackendDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backup")
        private Boolean backup;

        public Builder backup(Boolean backup) {
            this.backup = backup;
            this.__explicitlySet__.add("backup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("drain")
        private Boolean drain;

        public Builder drain(Boolean drain) {
            this.drain = drain;
            this.__explicitlySet__.add("drain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offline")
        private Boolean offline;

        public Builder offline(Boolean offline) {
            this.offline = offline;
            this.__explicitlySet__.add("offline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBackendDetails build() {
            CreateBackendDetails __instance__ =
                    new CreateBackendDetails(backup, drain, ipAddress, offline, port, weight);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBackendDetails o) {
            Builder copiedBuilder =
                    backup(o.getBackup())
                            .drain(o.getDrain())
                            .ipAddress(o.getIpAddress())
                            .offline(o.getOffline())
                            .port(o.getPort())
                            .weight(o.getWeight());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Example: `false`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backup")
    Boolean backup;

    /**
     * Whether the load balancer should drain this server. Servers marked \"drain\" receive no new
     * incoming traffic.
     * <p>
     * Example: `false`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drain")
    Boolean drain;

    /**
     * The IP address of the backend server.
     * <p>
     * Example: `10.0.0.3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    String ipAddress;

    /**
     * Whether the load balancer should treat this server as offline. Offline servers receive no incoming
     * traffic.
     * <p>
     * Example: `false`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offline")
    Boolean offline;

    /**
     * The communication port for the backend server.
     * <p>
     * Example: `8080`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
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
    Integer weight;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
