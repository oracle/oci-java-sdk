/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A service offering from a supported provider. For more information,
 * see [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FastConnectProviderService.Builder.class
)
public class FastConnectProviderService {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
        private String providerServiceName;

        public FastConnectProviderService build() {
            return new FastConnectProviderService(description, providerName, providerServiceName);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FastConnectProviderService o) {
            return description(o.getDescription())
                    .providerName(o.getProviderName())
                    .providerServiceName(o.getProviderServiceName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A description of the service offered by the provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String description;

    /**
     * The name of the provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String providerName;

    /**
     * The name of the service offered by the provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerServiceName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String providerServiceName;
}
