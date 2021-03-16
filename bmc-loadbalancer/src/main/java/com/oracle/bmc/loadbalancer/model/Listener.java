/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The listener's configuration.
 * For more information on backend set configuration, see
 * [Managing Load Balancer Listeners](https://docs.cloud.oracle.com/Content/Balance/Tasks/managinglisteners.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Listener.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Listener {
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

        @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
        private String defaultBackendSetName;

        public Builder defaultBackendSetName(String defaultBackendSetName) {
            this.defaultBackendSetName = defaultBackendSetName;
            this.__explicitlySet__.add("defaultBackendSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameNames")
        private java.util.List<String> hostnameNames;

        public Builder hostnameNames(java.util.List<String> hostnameNames) {
            this.hostnameNames = hostnameNames;
            this.__explicitlySet__.add("hostnameNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSetName")
        private String pathRouteSetName;

        public Builder pathRouteSetName(String pathRouteSetName) {
            this.pathRouteSetName = pathRouteSetName;
            this.__explicitlySet__.add("pathRouteSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
        private SSLConfiguration sslConfiguration;

        public Builder sslConfiguration(SSLConfiguration sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            this.__explicitlySet__.add("sslConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionConfiguration")
        private ConnectionConfiguration connectionConfiguration;

        public Builder connectionConfiguration(ConnectionConfiguration connectionConfiguration) {
            this.connectionConfiguration = connectionConfiguration;
            this.__explicitlySet__.add("connectionConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleSetNames")
        private java.util.List<String> ruleSetNames;

        public Builder ruleSetNames(java.util.List<String> ruleSetNames) {
            this.ruleSetNames = ruleSetNames;
            this.__explicitlySet__.add("ruleSetNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingPolicyName")
        private String routingPolicyName;

        public Builder routingPolicyName(String routingPolicyName) {
            this.routingPolicyName = routingPolicyName;
            this.__explicitlySet__.add("routingPolicyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Listener build() {
            Listener __instance__ =
                    new Listener(
                            name,
                            defaultBackendSetName,
                            port,
                            protocol,
                            hostnameNames,
                            pathRouteSetName,
                            sslConfiguration,
                            connectionConfiguration,
                            ruleSetNames,
                            routingPolicyName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Listener o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .defaultBackendSetName(o.getDefaultBackendSetName())
                            .port(o.getPort())
                            .protocol(o.getProtocol())
                            .hostnameNames(o.getHostnameNames())
                            .pathRouteSetName(o.getPathRouteSetName())
                            .sslConfiguration(o.getSslConfiguration())
                            .connectionConfiguration(o.getConnectionConfiguration())
                            .ruleSetNames(o.getRuleSetNames())
                            .routingPolicyName(o.getRoutingPolicyName());

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
     * A friendly name for the listener. It must be unique and it cannot be changed.
     * <p>
     * Example: `example_listener`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The name of the associated backend set.
     * <p>
     * Example: `example_backend_set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
    String defaultBackendSetName;

    /**
     * The communication port for the listener.
     * <p>
     * Example: `80`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * The protocol on which the listener accepts connection requests.
     * To get a list of valid protocols, use the {@link #listProtocols(ListProtocolsRequest) listProtocols}
     * operation.
     * <p>
     * Example: `HTTP`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    String protocol;

    /**
     * An array of hostname resource names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameNames")
    java.util.List<String> hostnameNames;

    /**
     * Deprecated. Please use `routingPolicies` instead.
     * <p>
     * The name of the set of path-based routing rules, {@link PathRouteSet},
     * applied to this listener's traffic.
     * <p>
     * Example: `example_path_route_set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSetName")
    String pathRouteSetName;

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    SSLConfiguration sslConfiguration;

    @com.fasterxml.jackson.annotation.JsonProperty("connectionConfiguration")
    ConnectionConfiguration connectionConfiguration;

    /**
     * The names of the {@link RuleSet} to apply to the listener.
     * <p>
     * Example: [\"example_rule_set\"]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleSetNames")
    java.util.List<String> ruleSetNames;

    /**
     * The name of the routing policy applied to this listener's traffic.
     * <p>
     * Example: `example_routing_policy_name`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routingPolicyName")
    String routingPolicyName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
