/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.model;

/**
 * child class of AuthenticationMode. <br>
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
        builder = PasswordAuthenticationMode.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "authenticationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PasswordAuthenticationMode extends AuthenticationMode {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * SHA-256 hashed passwords for OCI Cache user,required if authenticationType is set to
         * PASSWORD.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hashedPasswords")
        private java.util.List<String> hashedPasswords;

        /**
         * SHA-256 hashed passwords for OCI Cache user,required if authenticationType is set to
         * PASSWORD.
         *
         * @param hashedPasswords the value to set
         * @return this builder
         */
        public Builder hashedPasswords(java.util.List<String> hashedPasswords) {
            this.hashedPasswords = hashedPasswords;
            this.__explicitlySet__.add("hashedPasswords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PasswordAuthenticationMode build() {
            PasswordAuthenticationMode model = new PasswordAuthenticationMode(this.hashedPasswords);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PasswordAuthenticationMode model) {
            if (model.wasPropertyExplicitlySet("hashedPasswords")) {
                this.hashedPasswords(model.getHashedPasswords());
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

    @Deprecated
    public PasswordAuthenticationMode(java.util.List<String> hashedPasswords) {
        super();
        this.hashedPasswords = hashedPasswords;
    }

    /**
     * SHA-256 hashed passwords for OCI Cache user,required if authenticationType is set to
     * PASSWORD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hashedPasswords")
    private final java.util.List<String> hashedPasswords;

    /**
     * SHA-256 hashed passwords for OCI Cache user,required if authenticationType is set to
     * PASSWORD.
     *
     * @return the value
     */
    public java.util.List<String> getHashedPasswords() {
        return hashedPasswords;
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
        sb.append("PasswordAuthenticationMode(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", hashedPasswords=").append(String.valueOf(this.hashedPasswords));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PasswordAuthenticationMode)) {
            return false;
        }

        PasswordAuthenticationMode other = (PasswordAuthenticationMode) o;
        return java.util.Objects.equals(this.hashedPasswords, other.hashedPasswords)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.hashedPasswords == null ? 43 : this.hashedPasswords.hashCode());
        return result;
    }
}
