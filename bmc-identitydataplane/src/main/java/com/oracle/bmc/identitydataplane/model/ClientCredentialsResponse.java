/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClientCredentialsResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ClientCredentialsResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("access_token")
        private String accessToken;

        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("token_type")
        private String tokenType;

        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            this.__explicitlySet__.add("tokenType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expires_in")
        private String expiresIn;

        public Builder expiresIn(String expiresIn) {
            this.expiresIn = expiresIn;
            this.__explicitlySet__.add("expiresIn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClientCredentialsResponse build() {
            ClientCredentialsResponse __instance__ =
                    new ClientCredentialsResponse(accessToken, tokenType, expiresIn);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClientCredentialsResponse o) {
            Builder copiedBuilder =
                    accessToken(o.getAccessToken())
                            .tokenType(o.getTokenType())
                            .expiresIn(o.getExpiresIn());

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
     * The access token.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("access_token")
    String accessToken;

    /**
     * The token type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("token_type")
    String tokenType;

    /**
     * The amount of time until the token expires.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expires_in")
    String expiresIn;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
