/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * A service offering from a supported provider. For more information,
 * see [FastConnect](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = FastConnectProviderService.Builder.class)
public class FastConnectProviderService {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("description")
        private String description;

        @JsonProperty("providerName")
        private String providerName;

        @JsonProperty("providerServiceName")
        private String providerServiceName;

        public FastConnectProviderService build() {
            return new FastConnectProviderService(description, providerName, providerServiceName);
        }

        @JsonIgnore
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
    @JsonProperty("description")
    @Size(min = 1, max = 255)
    String description;

    /**
     * The name of the provider.
     *
     **/
    @JsonProperty("providerName")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String providerName;

    /**
     * The name of the service offered by the provider.
     *
     **/
    @JsonProperty("providerServiceName")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String providerServiceName;
}
