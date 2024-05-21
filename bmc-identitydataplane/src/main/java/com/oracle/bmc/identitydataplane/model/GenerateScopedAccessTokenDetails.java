/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GenerateScopedAccessTokenDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenerateScopedAccessTokenDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"scope", "publicKey"})
    public GenerateScopedAccessTokenDetails(String scope, String publicKey) {
        super();
        this.scope = scope;
        this.publicKey = publicKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Scope definition for the scoped access token
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        /**
         * Scope definition for the scoped access token
         *
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * A temporary public key, owned by the service. The service also owns the corresponding private key. This public
         * key will be put inside the security token by the auth service after successful validation of the certificate.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        /**
         * A temporary public key, owned by the service. The service also owns the corresponding private key. This public
         * key will be put inside the security token by the auth service after successful validation of the certificate.
         *
         * @param publicKey the value to set
         * @return this builder
         **/
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateScopedAccessTokenDetails build() {
            GenerateScopedAccessTokenDetails model =
                    new GenerateScopedAccessTokenDetails(this.scope, this.publicKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateScopedAccessTokenDetails model) {
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("publicKey")) {
                this.publicKey(model.getPublicKey());
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
     * Scope definition for the scoped access token
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * Scope definition for the scoped access token
     *
     * @return the value
     **/
    public String getScope() {
        return scope;
    }

    /**
     * A temporary public key, owned by the service. The service also owns the corresponding private key. This public
     * key will be put inside the security token by the auth service after successful validation of the certificate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    private final String publicKey;

    /**
     * A temporary public key, owned by the service. The service also owns the corresponding private key. This public
     * key will be put inside the security token by the auth service after successful validation of the certificate.
     *
     * @return the value
     **/
    public String getPublicKey() {
        return publicKey;
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
        sb.append("GenerateScopedAccessTokenDetails(");
        sb.append("super=").append(super.toString());
        sb.append("scope=").append(String.valueOf(this.scope));
        sb.append(", publicKey=").append(String.valueOf(this.publicKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateScopedAccessTokenDetails)) {
            return false;
        }

        GenerateScopedAccessTokenDetails other = (GenerateScopedAccessTokenDetails) o;
        return java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.publicKey, other.publicKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.publicKey == null ? 43 : this.publicKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
