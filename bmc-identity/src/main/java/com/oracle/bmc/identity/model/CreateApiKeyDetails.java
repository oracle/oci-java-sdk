/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateApiKeyDetails.Builder.class
)
public class CreateApiKeyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public CreateApiKeyDetails build() {
            return new CreateApiKeyDetails(key);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String key;
}
