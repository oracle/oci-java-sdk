/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The listener's configuration details.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListenerDetails.Builder.class)
public class ListenerDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
        private String defaultBackendSetName;

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
        private SSLConfigurationDetails sslConfiguration;

        public ListenerDetails build() {
            return new ListenerDetails(defaultBackendSetName, port, protocol, sslConfiguration);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListenerDetails o) {
            return defaultBackendSetName(o.getDefaultBackendSetName())
                    .port(o.getPort())
                    .protocol(o.getProtocol())
                    .sslConfiguration(o.getSslConfiguration());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the associated backend set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultBackendSetName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String defaultBackendSetName;

    /**
     * The communication port for the listener.
     * <p>
     * Example: `80`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Min(1)
    @javax.validation.constraints.Max(65535)
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String protocol;

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    SSLConfigurationDetails sslConfiguration;
}
