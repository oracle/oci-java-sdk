/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * Generate an Identity token for Redis cluster <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateIdentityTokenDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateIdentityTokenDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"publicKey", "redisUser"})
    public CreateIdentityTokenDetails(String publicKey, String redisUser) {
        super();
        this.publicKey = publicKey;
        this.redisUser = redisUser;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** User public key pair */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        /**
         * User public key pair
         *
         * @param publicKey the value to set
         * @return this builder
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }
        /** Redis User generating identity token. */
        @com.fasterxml.jackson.annotation.JsonProperty("redisUser")
        private String redisUser;

        /**
         * Redis User generating identity token.
         *
         * @param redisUser the value to set
         * @return this builder
         */
        public Builder redisUser(String redisUser) {
            this.redisUser = redisUser;
            this.__explicitlySet__.add("redisUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIdentityTokenDetails build() {
            CreateIdentityTokenDetails model =
                    new CreateIdentityTokenDetails(this.publicKey, this.redisUser);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIdentityTokenDetails model) {
            if (model.wasPropertyExplicitlySet("publicKey")) {
                this.publicKey(model.getPublicKey());
            }
            if (model.wasPropertyExplicitlySet("redisUser")) {
                this.redisUser(model.getRedisUser());
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

    /** User public key pair */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    private final String publicKey;

    /**
     * User public key pair
     *
     * @return the value
     */
    public String getPublicKey() {
        return publicKey;
    }

    /** Redis User generating identity token. */
    @com.fasterxml.jackson.annotation.JsonProperty("redisUser")
    private final String redisUser;

    /**
     * Redis User generating identity token.
     *
     * @return the value
     */
    public String getRedisUser() {
        return redisUser;
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
        sb.append("CreateIdentityTokenDetails(");
        sb.append("super=").append(super.toString());
        sb.append("publicKey=").append(String.valueOf(this.publicKey));
        sb.append(", redisUser=").append(String.valueOf(this.redisUser));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIdentityTokenDetails)) {
            return false;
        }

        CreateIdentityTokenDetails other = (CreateIdentityTokenDetails) o;
        return java.util.Objects.equals(this.publicKey, other.publicKey)
                && java.util.Objects.equals(this.redisUser, other.redisUser)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.publicKey == null ? 43 : this.publicKey.hashCode());
        result = (result * PRIME) + (this.redisUser == null ? 43 : this.redisUser.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
