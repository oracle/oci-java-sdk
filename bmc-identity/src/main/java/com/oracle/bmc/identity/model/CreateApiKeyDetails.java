/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateApiKeyDetails.Builder.class)
public class CreateApiKeyDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("key")
        private String key;

        public CreateApiKeyDetails build() {
            return new CreateApiKeyDetails(key);
        }

        @JsonIgnore
        public Builder copy(CreateApiKeyDetails o) {
            return key(o.getKey());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The public key.  Must be an RSA key in PEM format.
     **/
    @JsonProperty("key")
    @Valid
    @NotNull
    String key;
}
