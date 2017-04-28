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
 * The configuration details for updating a listener.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = UpdateListenerDetails.Builder.class)
public class UpdateListenerDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("defaultBackendSetName")
        private String defaultBackendSetName;

        @JsonProperty("port")
        private Integer port;

        @JsonProperty("protocol")
        private String protocol;

        @JsonProperty("sslConfiguration")
        private SSLConfigurationDetails sslConfiguration;

        public UpdateListenerDetails build() {
            return new UpdateListenerDetails(
                    defaultBackendSetName, port, protocol, sslConfiguration);
        }

        @JsonIgnore
        public Builder copy(UpdateListenerDetails o) {
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
    @JsonProperty("defaultBackendSetName")
    @Valid
    @NotNull
    String defaultBackendSetName;

    /**
     * The communication port for the listener.
     * <p>
     * Example: `80`
     *
     **/
    @JsonProperty("port")
    @Valid
    @NotNull
    @Min(1)
    @Max(65535)
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
    SSLConfigurationDetails sslConfiguration;
}
