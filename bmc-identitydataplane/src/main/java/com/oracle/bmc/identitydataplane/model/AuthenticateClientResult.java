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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuthenticateClientResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuthenticateClientResult {
    @Deprecated
    @java.beans.ConstructorProperties({"principal", "errorMessage"})
    public AuthenticateClientResult(Principal principal, String errorMessage) {
        super();
        this.principal = principal;
        this.errorMessage = errorMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The original caller's resolved principal object if the authentication succeeds, null otherwise.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principal")
        private Principal principal;

        /**
         * The original caller's resolved principal object if the authentication succeeds, null otherwise.
         * @param principal the value to set
         * @return this builder
         **/
        public Builder principal(Principal principal) {
            this.principal = principal;
            this.__explicitlySet__.add("principal");
            return this;
        }
        /**
         * If the authentication fails for the original caller (not failing authentication of the calling service, in which case we return 401), we return a 200, but with null principal and an error message
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * If the authentication fails for the original caller (not failing authentication of the calling service, in which case we return 401), we return a 200, but with null principal and an error message
         * @param errorMessage the value to set
         * @return this builder
         **/
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticateClientResult build() {
            AuthenticateClientResult __instance__ =
                    new AuthenticateClientResult(principal, errorMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticateClientResult o) {
            Builder copiedBuilder = principal(o.getPrincipal()).errorMessage(o.getErrorMessage());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The original caller's resolved principal object if the authentication succeeds, null otherwise.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principal")
    private final Principal principal;

    /**
     * The original caller's resolved principal object if the authentication succeeds, null otherwise.
     * @return the value
     **/
    public Principal getPrincipal() {
        return principal;
    }

    /**
     * If the authentication fails for the original caller (not failing authentication of the calling service, in which case we return 401), we return a 200, but with null principal and an error message
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * If the authentication fails for the original caller (not failing authentication of the calling service, in which case we return 401), we return a 200, but with null principal and an error message
     * @return the value
     **/
    public String getErrorMessage() {
        return errorMessage;
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
        sb.append("AuthenticateClientResult(");
        sb.append("principal=").append(String.valueOf(this.principal));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticateClientResult)) {
            return false;
        }

        AuthenticateClientResult other = (AuthenticateClientResult) o;
        return java.util.Objects.equals(this.principal, other.principal)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.principal == null ? 43 : this.principal.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
