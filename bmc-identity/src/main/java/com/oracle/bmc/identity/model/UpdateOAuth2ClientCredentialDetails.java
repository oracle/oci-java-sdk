/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOAuth2ClientCredentialDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateOAuth2ClientCredentialDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Description of the oauth credential to help user differentiate them. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the oauth credential to help user differentiate them.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Allowed scopes for the given oauth credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("scopes")
        private java.util.List<FullyQualifiedScope> scopes;

        /**
         * Allowed scopes for the given oauth credential.
         *
         * @param scopes the value to set
         * @return this builder
         */
        public Builder scopes(java.util.List<FullyQualifiedScope> scopes) {
            this.scopes = scopes;
            this.__explicitlySet__.add("scopes");
            return this;
        }
        /** Indicate if the password to be reset or not in the update. */
        @com.fasterxml.jackson.annotation.JsonProperty("isResetPassword")
        private Boolean isResetPassword;

        /**
         * Indicate if the password to be reset or not in the update.
         *
         * @param isResetPassword the value to set
         * @return this builder
         */
        public Builder isResetPassword(Boolean isResetPassword) {
            this.isResetPassword = isResetPassword;
            this.__explicitlySet__.add("isResetPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOAuth2ClientCredentialDetails build() {
            UpdateOAuth2ClientCredentialDetails model =
                    new UpdateOAuth2ClientCredentialDetails(
                            this.description, this.scopes, this.isResetPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOAuth2ClientCredentialDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("scopes")) {
                this.scopes(model.getScopes());
            }
            if (model.wasPropertyExplicitlySet("isResetPassword")) {
                this.isResetPassword(model.getIsResetPassword());
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

    /** Description of the oauth credential to help user differentiate them. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the oauth credential to help user differentiate them.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Allowed scopes for the given oauth credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("scopes")
    private final java.util.List<FullyQualifiedScope> scopes;

    /**
     * Allowed scopes for the given oauth credential.
     *
     * @return the value
     */
    public java.util.List<FullyQualifiedScope> getScopes() {
        return scopes;
    }

    /** Indicate if the password to be reset or not in the update. */
    @com.fasterxml.jackson.annotation.JsonProperty("isResetPassword")
    private final Boolean isResetPassword;

    /**
     * Indicate if the password to be reset or not in the update.
     *
     * @return the value
     */
    public Boolean getIsResetPassword() {
        return isResetPassword;
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
        sb.append("UpdateOAuth2ClientCredentialDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", scopes=").append(String.valueOf(this.scopes));
        sb.append(", isResetPassword=").append(String.valueOf(this.isResetPassword));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
