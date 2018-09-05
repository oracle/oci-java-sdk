/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for adding a listener to a backend set.
 * For more information on listener configuration, see
 * [Managing Load Balancer Listeners](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/managinglisteners.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateListenerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateListenerDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("connectionConfiguration")
        private ConnectionConfiguration connectionConfiguration;

        public Builder connectionConfiguration(ConnectionConfiguration connectionConfiguration) {
            this.connectionConfiguration = connectionConfiguration;
            this.__explicitlySet__.add("connectionConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
        private String defaultBackendSetName;

        public Builder defaultBackendSetName(String defaultBackendSetName) {
            this.defaultBackendSetName = defaultBackendSetName;
            this.__explicitlySet__.add("defaultBackendSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameNames")
        private java.util.List<String> hostnameNames;

        public Builder hostnameNames(java.util.List<String> hostnameNames) {
            this.hostnameNames = hostnameNames;
            this.__explicitlySet__.add("hostnameNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSetName")
        private String pathRouteSetName;

        public Builder pathRouteSetName(String pathRouteSetName) {
            this.pathRouteSetName = pathRouteSetName;
            this.__explicitlySet__.add("pathRouteSetName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
        private SSLConfigurationDetails sslConfiguration;

        public Builder sslConfiguration(SSLConfigurationDetails sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            this.__explicitlySet__.add("sslConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateListenerDetails build() {
            CreateListenerDetails __instance__ =
                    new CreateListenerDetails(
                            connectionConfiguration,
                            defaultBackendSetName,
                            hostnameNames,
                            name,
                            pathRouteSetName,
                            port,
                            protocol,
                            sslConfiguration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateListenerDetails o) {
            Builder copiedBuilder =
                    connectionConfiguration(o.getConnectionConfiguration())
                            .defaultBackendSetName(o.getDefaultBackendSetName())
                            .hostnameNames(o.getHostnameNames())
                            .name(o.getName())
                            .pathRouteSetName(o.getPathRouteSetName())
                            .port(o.getPort())
                            .protocol(o.getProtocol())
                            .sslConfiguration(o.getSslConfiguration());

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

    @com.fasterxml.jackson.annotation.JsonProperty("connectionConfiguration")
    ConnectionConfiguration connectionConfiguration;

    /**
     * The name of the associated backend set.
     * <p>
     * Example: `example_backend_set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
    String defaultBackendSetName;

    /**
     * An array of hostname resource names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameNames")
    java.util.List<String> hostnameNames;

    /**
     * A friendly name for the listener. It must be unique and it cannot be changed.
     * Avoid entering confidential information.
     * <p>
     * Example: `example_listener`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The name of the set of path-based routing rules, {@link PathRouteSet},
     * applied to this listener's traffic.
     * <p>
     * Example: `example_path_route_set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathRouteSetName")
    String pathRouteSetName;

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

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    SSLConfigurationDetails sslConfiguration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
