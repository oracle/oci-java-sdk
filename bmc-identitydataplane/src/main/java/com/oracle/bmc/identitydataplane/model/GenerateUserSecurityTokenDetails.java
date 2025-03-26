/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * Request parameters in body for obtaining a user principal session token (UPST) for self.
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
    builder = GenerateUserSecurityTokenDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenerateUserSecurityTokenDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"publicKey", "sessionExpirationInMinutes"})
    public GenerateUserSecurityTokenDetails(String publicKey, Integer sessionExpirationInMinutes) {
        super();
        this.publicKey = publicKey;
        this.sessionExpirationInMinutes = sessionExpirationInMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user-owned public key in PEM format that corresponds to the RSA key pair used for signing requests.
         * The user also owns the corresponding private key. This public key will be put inside the user
         * security token by the auth service after successful validation of the request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        /**
         * The user-owned public key in PEM format that corresponds to the RSA key pair used for signing requests.
         * The user also owns the corresponding private key. This public key will be put inside the user
         * security token by the auth service after successful validation of the request.
         *
         * @param publicKey the value to set
         * @return this builder
         **/
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }
        /**
         * User session expiration in minutes to which the requested user principal session token (UPST) is bounded.
         * Valid values are from 5 to 60 for all realms.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sessionExpirationInMinutes")
        private Integer sessionExpirationInMinutes;

        /**
         * User session expiration in minutes to which the requested user principal session token (UPST) is bounded.
         * Valid values are from 5 to 60 for all realms.
         *
         * @param sessionExpirationInMinutes the value to set
         * @return this builder
         **/
        public Builder sessionExpirationInMinutes(Integer sessionExpirationInMinutes) {
            this.sessionExpirationInMinutes = sessionExpirationInMinutes;
            this.__explicitlySet__.add("sessionExpirationInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateUserSecurityTokenDetails build() {
            GenerateUserSecurityTokenDetails model =
                    new GenerateUserSecurityTokenDetails(
                            this.publicKey, this.sessionExpirationInMinutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateUserSecurityTokenDetails model) {
            if (model.wasPropertyExplicitlySet("publicKey")) {
                this.publicKey(model.getPublicKey());
            }
            if (model.wasPropertyExplicitlySet("sessionExpirationInMinutes")) {
                this.sessionExpirationInMinutes(model.getSessionExpirationInMinutes());
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
     * The user-owned public key in PEM format that corresponds to the RSA key pair used for signing requests.
     * The user also owns the corresponding private key. This public key will be put inside the user
     * security token by the auth service after successful validation of the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    private final String publicKey;

    /**
     * The user-owned public key in PEM format that corresponds to the RSA key pair used for signing requests.
     * The user also owns the corresponding private key. This public key will be put inside the user
     * security token by the auth service after successful validation of the request.
     *
     * @return the value
     **/
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * User session expiration in minutes to which the requested user principal session token (UPST) is bounded.
     * Valid values are from 5 to 60 for all realms.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sessionExpirationInMinutes")
    private final Integer sessionExpirationInMinutes;

    /**
     * User session expiration in minutes to which the requested user principal session token (UPST) is bounded.
     * Valid values are from 5 to 60 for all realms.
     *
     * @return the value
     **/
    public Integer getSessionExpirationInMinutes() {
        return sessionExpirationInMinutes;
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
        sb.append("GenerateUserSecurityTokenDetails(");
        sb.append("super=").append(super.toString());
        sb.append("publicKey=").append(String.valueOf(this.publicKey));
        sb.append(", sessionExpirationInMinutes=")
                .append(String.valueOf(this.sessionExpirationInMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateUserSecurityTokenDetails)) {
            return false;
        }

        GenerateUserSecurityTokenDetails other = (GenerateUserSecurityTokenDetails) o;
        return java.util.Objects.equals(this.publicKey, other.publicKey)
                && java.util.Objects.equals(
                        this.sessionExpirationInMinutes, other.sessionExpirationInMinutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.publicKey == null ? 43 : this.publicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionExpirationInMinutes == null
                                ? 43
                                : this.sessionExpirationInMinutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
