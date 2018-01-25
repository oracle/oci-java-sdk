/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for updating a listener.
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
    builder = UpdateListenerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateListenerDetails {
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

        public UpdateListenerDetails build() {
            UpdateListenerDetails __instance__ =
                    new UpdateListenerDetails(
                            connectionConfiguration,
                            defaultBackendSetName,
                            port,
                            protocol,
                            sslConfiguration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateListenerDetails o) {
            Builder copiedBuilder =
                    connectionConfiguration(o.getConnectionConfiguration())
                            .defaultBackendSetName(o.getDefaultBackendSetName())
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
     * Example: `My_backend_set`
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

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    SSLConfigurationDetails sslConfiguration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
