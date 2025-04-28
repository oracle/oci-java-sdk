/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ClientCredentialsResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ClientCredentialsResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"accessToken", "tokenType", "expiresIn"})
    public ClientCredentialsResponse(String accessToken, String tokenType, String expiresIn) {
        super();
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The access token. */
        @com.fasterxml.jackson.annotation.JsonProperty("access_token")
        private String accessToken;

        /**
         * The access token.
         *
         * @param accessToken the value to set
         * @return this builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }
        /** The token type. */
        @com.fasterxml.jackson.annotation.JsonProperty("token_type")
        private String tokenType;

        /**
         * The token type.
         *
         * @param tokenType the value to set
         * @return this builder
         */
        public Builder tokenType(String tokenType) {
            this.tokenType = tokenType;
            this.__explicitlySet__.add("tokenType");
            return this;
        }
        /** The amount of time until the token expires. */
        @com.fasterxml.jackson.annotation.JsonProperty("expires_in")
        private String expiresIn;

        /**
         * The amount of time until the token expires.
         *
         * @param expiresIn the value to set
         * @return this builder
         */
        public Builder expiresIn(String expiresIn) {
            this.expiresIn = expiresIn;
            this.__explicitlySet__.add("expiresIn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClientCredentialsResponse build() {
            ClientCredentialsResponse model =
                    new ClientCredentialsResponse(this.accessToken, this.tokenType, this.expiresIn);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClientCredentialsResponse model) {
            if (model.wasPropertyExplicitlySet("accessToken")) {
                this.accessToken(model.getAccessToken());
            }
            if (model.wasPropertyExplicitlySet("tokenType")) {
                this.tokenType(model.getTokenType());
            }
            if (model.wasPropertyExplicitlySet("expiresIn")) {
                this.expiresIn(model.getExpiresIn());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The access token. */
    @com.fasterxml.jackson.annotation.JsonProperty("access_token")
    private final String accessToken;

    /**
     * The access token.
     *
     * @return the value
     */
    public String getAccessToken() {
        return accessToken;
    }

    /** The token type. */
    @com.fasterxml.jackson.annotation.JsonProperty("token_type")
    private final String tokenType;

    /**
     * The token type.
     *
     * @return the value
     */
    public String getTokenType() {
        return tokenType;
    }

    /** The amount of time until the token expires. */
    @com.fasterxml.jackson.annotation.JsonProperty("expires_in")
    private final String expiresIn;

    /**
     * The amount of time until the token expires.
     *
     * @return the value
     */
    public String getExpiresIn() {
        return expiresIn;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClientCredentialsResponse(");
        sb.append("super=").append(super.toString());
        sb.append("accessToken=").append(String.valueOf(this.accessToken));
        sb.append(", tokenType=").append(String.valueOf(this.tokenType));
        sb.append(", expiresIn=").append(String.valueOf(this.expiresIn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClientCredentialsResponse)) {
            return false;
        }

        ClientCredentialsResponse other = (ClientCredentialsResponse) o;
        return java.util.Objects.equals(this.accessToken, other.accessToken)
                && java.util.Objects.equals(this.tokenType, other.tokenType)
                && java.util.Objects.equals(this.expiresIn, other.expiresIn)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        result = (result * PRIME) + (this.tokenType == null ? 43 : this.tokenType.hashCode());
        result = (result * PRIME) + (this.expiresIn == null ? 43 : this.expiresIn.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
