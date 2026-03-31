/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerregistry.model;

/**
 * Access token response for OCI Container Registry extension authentication.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180419")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AccessToken.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AccessToken extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"token", "accessToken", "scope", "expiresIn"})
    public AccessToken(String token, String accessToken, String scope, Integer expiresIn) {
        super();
        this.token = token;
        this.accessToken = accessToken;
        this.scope = scope;
        this.expiresIn = expiresIn;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Access token string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("token")
        private String token;

        /**
         * Access token string.
         * @param token the value to set
         * @return this builder
         **/
        public Builder token(String token) {
            this.token = token;
            this.__explicitlySet__.add("token");
            return this;
        }
        /**
         * Access token string (alias for token).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("access_token")
        private String accessToken;

        /**
         * Access token string (alias for token).
         * @param accessToken the value to set
         * @return this builder
         **/
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }
        /**
         * Scope that restricts access to resources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * Scope that restricts access to resources.
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * Seconds until the token expires.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expires_in")
        private Integer expiresIn;

        /**
         * Seconds until the token expires.
         * @param expiresIn the value to set
         * @return this builder
         **/
        public Builder expiresIn(Integer expiresIn) {
            this.expiresIn = expiresIn;
            this.__explicitlySet__.add("expiresIn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessToken build() {
            AccessToken model =
                    new AccessToken(this.token, this.accessToken, this.scope, this.expiresIn);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessToken model) {
            if (model.wasPropertyExplicitlySet("token")) {
                this.token(model.getToken());
            }
            if (model.wasPropertyExplicitlySet("accessToken")) {
                this.accessToken(model.getAccessToken());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("expiresIn")) {
                this.expiresIn(model.getExpiresIn());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Access token string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("token")
    private final String token;

    /**
     * Access token string.
     * @return the value
     **/
    public String getToken() {
        return token;
    }

    /**
     * Access token string (alias for token).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("access_token")
    private final String accessToken;

    /**
     * Access token string (alias for token).
     * @return the value
     **/
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Scope that restricts access to resources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * Scope that restricts access to resources.
     * @return the value
     **/
    public String getScope() {
        return scope;
    }

    /**
     * Seconds until the token expires.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expires_in")
    private final Integer expiresIn;

    /**
     * Seconds until the token expires.
     * @return the value
     **/
    public Integer getExpiresIn() {
        return expiresIn;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AccessToken(");
        sb.append("super=").append(super.toString());
        sb.append("token=").append(String.valueOf(this.token));
        sb.append(", accessToken=").append(String.valueOf(this.accessToken));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", expiresIn=").append(String.valueOf(this.expiresIn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessToken)) {
            return false;
        }

        AccessToken other = (AccessToken) o;
        return java.util.Objects.equals(this.token, other.token)
                && java.util.Objects.equals(this.accessToken, other.accessToken)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.expiresIn, other.expiresIn)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.expiresIn == null ? 43 : this.expiresIn.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
