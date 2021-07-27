/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration of a backend server that is a member of a load balancer backend set.
 * For more information, see [Managing Backend Servers](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingbackendservers.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Backend.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Backend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
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

        @com.fasterxml.jackson.annotation.JsonProperty("drain")
        private Boolean drain;

        public Builder drain(Boolean drain) {
            this.drain = drain;
            this.__explicitlySet__.add("drain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backup")
        private Boolean backup;

        public Builder backup(Boolean backup) {
            this.backup = backup;
            this.__explicitlySet__.add("backup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offline")
        private Boolean offline;

        public Builder offline(Boolean offline) {
            this.offline = offline;
            this.__explicitlySet__.add("offline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Backend build() {
            Backend __instance__ =
                    new Backend(name, ipAddress, port, weight, drain, backup, offline);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Backend o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .ipAddress(o.getIpAddress())
                            .port(o.getPort())
                            .weight(o.getWeight())
                            .drain(o.getDrain())
                            .backup(o.getBackup())
                            .offline(o.getOffline());

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
     * A read-only field showing the IP address and port that uniquely identify this backend server in the backend set.
     * <p>
     * Example: {@code 10.0.0.3:8080}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The IP address of the backend server.
     * <p>
     * Example: {@code 10.0.0.3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    String ipAddress;

    /**
     * The communication port for the backend server.
     * <p>
     * Example: {@code 8080}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * The load balancing policy weight assigned to the server. Backend servers with a higher weight receive a larger
     * proportion of incoming traffic. For example, a server weighted '3' receives 3 times the number of new connections
     * as a server weighted '1'.
     * For more information on load balancing policies, see
     * [How Load Balancing Policies Work](https://docs.cloud.oracle.com/Content/Balance/Reference/lbpolicies.htm).
     * <p>
     * Example: {@code 3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    Integer weight;

    /**
     * Whether the load balancer should drain this server. Servers marked "drain" receive no new
     * incoming traffic.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drain")
    Boolean drain;

    /**
     * Whether the load balancer should treat this server as a backup unit. If {@code true}, the load balancer forwards no ingress
     * traffic to this backend server unless all other backend servers not marked as "backup" fail the health check policy.
     * <p>
     **Note:** You cannot add a backend server marked as {@code backup} to a backend set that uses the IP Hash policy.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backup")
    Boolean backup;

    /**
     * Whether the load balancer should treat this server as offline. Offline servers receive no incoming
     * traffic.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offline")
    Boolean offline;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
