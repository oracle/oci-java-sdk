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
 * The listener's configuration.
 * For more information on backend set configuration, see
 * [Managing Load Balancer Listeners](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/tasks/managinglisteners.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = Listener.Builder.class)
public class Listener {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("defaultBackendSetName")
        private String defaultBackendSetName;

        @JsonProperty("name")
        private String name;

        @JsonProperty("port")
        private Integer port;

        @JsonProperty("protocol")
        private String protocol;

        @JsonProperty("sslConfiguration")
        private SSLConfiguration sslConfiguration;

        public Listener build() {
            return new Listener(defaultBackendSetName, name, port, protocol, sslConfiguration);
        }

        @JsonIgnore
        public Builder copy(Listener o) {
            return defaultBackendSetName(o.getDefaultBackendSetName())
                    .name(o.getName())
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
    @JsonProperty("defaultBackendSetName")
    @Valid
    @NotNull
    String defaultBackendSetName;

    /**
     * A friendly name for the listener. It must be unique and it cannot be changed.
     * <p>
     * Example: `My listener`
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    String name;

    /**
     * The communication port for the listener.
     * <p>
     * Example: `80`
     *
     **/
    @JsonProperty("port")
    @Valid
    @NotNull
    Integer port;

    /**
     * The protocol on which the listener accepts connection requests.
     * To get a list of valid protocols, use the {@link #listProtocols(ListProtocolsRequest) listProtocols}
     * operation.
     * <p>
     * Example: `HTTP`
     *
     **/
    @JsonProperty("protocol")
    @Valid
    @NotNull
    String protocol;

    @JsonProperty("sslConfiguration")
    SSLConfiguration sslConfiguration;
}
