/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOAuth2ClientCredentialDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOAuth2ClientCredentialDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "scopes", "isResetPassword"})
    public UpdateOAuth2ClientCredentialDetails(
            String description,
            java.util.List<FullyQualifiedScope> scopes,
            Boolean isResetPassword) {
        super();
        this.description = description;
        this.scopes = scopes;
        this.isResetPassword = isResetPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scopes")
        private java.util.List<FullyQualifiedScope> scopes;

        public Builder scopes(java.util.List<FullyQualifiedScope> scopes) {
            this.scopes = scopes;
            this.__explicitlySet__.add("scopes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isResetPassword")
        private Boolean isResetPassword;

        public Builder isResetPassword(Boolean isResetPassword) {
            this.isResetPassword = isResetPassword;
            this.__explicitlySet__.add("isResetPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOAuth2ClientCredentialDetails build() {
            UpdateOAuth2ClientCredentialDetails __instance__ =
                    new UpdateOAuth2ClientCredentialDetails(description, scopes, isResetPassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOAuth2ClientCredentialDetails o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .scopes(o.getScopes())
                            .isResetPassword(o.getIsResetPassword());

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
     * Description of the oauth credential to help user differentiate them.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Allowed scopes for the given oauth credential.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    private final java.util.List<FullyQualifiedScope> scopes;

    public java.util.List<FullyQualifiedScope> getScopes() {
        return scopes;
    }

    /**
     * Indicate if the password to be reset or not in the update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResetPassword")
    private final Boolean isResetPassword;

    public Boolean getIsResetPassword() {
        return isResetPassword;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateOAuth2ClientCredentialDetails(");
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", scopes=").append(String.valueOf(this.scopes));
        sb.append(", isResetPassword=").append(String.valueOf(this.isResetPassword));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOAuth2ClientCredentialDetails)) {
            return false;
        }

        UpdateOAuth2ClientCredentialDetails other = (UpdateOAuth2ClientCredentialDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.scopes, other.scopes)
                && java.util.Objects.equals(this.isResetPassword, other.isResetPassword)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.scopes == null ? 43 : this.scopes.hashCode());
        result =
                (result * PRIME)
                        + (this.isResetPassword == null ? 43 : this.isResetPassword.hashCode());
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
