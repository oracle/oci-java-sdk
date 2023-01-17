/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * See ValidAuthenticateUserResult, BadUserStateAuthenticateUserResult,
 * UserNotFoundAuthenticateUserResult, TenantNotFoundAuthenticateUserResult <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuthenticateUserResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AuthenticateUserResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tenantInput", "userInput"})
    public AuthenticateUserResult(String tenantInput, String userInput) {
        super();
        this.tenantInput = tenantInput;
        this.userInput = userInput;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The tenant name. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantInput")
        private String tenantInput;

        /**
         * The tenant name.
         *
         * @param tenantInput the value to set
         * @return this builder
         */
        public Builder tenantInput(String tenantInput) {
            this.tenantInput = tenantInput;
            this.__explicitlySet__.add("tenantInput");
            return this;
        }
        /** The user name. */
        @com.fasterxml.jackson.annotation.JsonProperty("userInput")
        private String userInput;

        /**
         * The user name.
         *
         * @param userInput the value to set
         * @return this builder
         */
        public Builder userInput(String userInput) {
            this.userInput = userInput;
            this.__explicitlySet__.add("userInput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticateUserResult build() {
            AuthenticateUserResult model =
                    new AuthenticateUserResult(this.tenantInput, this.userInput);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticateUserResult model) {
            if (model.wasPropertyExplicitlySet("tenantInput")) {
                this.tenantInput(model.getTenantInput());
            }
            if (model.wasPropertyExplicitlySet("userInput")) {
                this.userInput(model.getUserInput());
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

    /** The tenant name. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantInput")
    private final String tenantInput;

    /**
     * The tenant name.
     *
     * @return the value
     */
    public String getTenantInput() {
        return tenantInput;
    }

    /** The user name. */
    @com.fasterxml.jackson.annotation.JsonProperty("userInput")
    private final String userInput;

    /**
     * The user name.
     *
     * @return the value
     */
    public String getUserInput() {
        return userInput;
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
        sb.append("AuthenticateUserResult(");
        sb.append("super=").append(super.toString());
        sb.append("tenantInput=").append(String.valueOf(this.tenantInput));
        sb.append(", userInput=").append(String.valueOf(this.userInput));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticateUserResult)) {
            return false;
        }

        AuthenticateUserResult other = (AuthenticateUserResult) o;
        return java.util.Objects.equals(this.tenantInput, other.tenantInput)
                && java.util.Objects.equals(this.userInput, other.userInput)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenantInput == null ? 43 : this.tenantInput.hashCode());
        result = (result * PRIME) + (this.userInput == null ? 43 : this.userInput.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
