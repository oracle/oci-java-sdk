/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * Properties indicating how the user is allowed to authenticate. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserCapabilities.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UserCapabilities
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "canUseConsolePassword",
        "canUseApiKeys",
        "canUseAuthTokens",
        "canUseSmtpCredentials",
        "canUseDbCredentials",
        "canUseCustomerSecretKeys",
        "canUseOAuth2ClientCredentials"
    })
    public UserCapabilities(
            Boolean canUseConsolePassword,
            Boolean canUseApiKeys,
            Boolean canUseAuthTokens,
            Boolean canUseSmtpCredentials,
            Boolean canUseDbCredentials,
            Boolean canUseCustomerSecretKeys,
            Boolean canUseOAuth2ClientCredentials) {
        super();
        this.canUseConsolePassword = canUseConsolePassword;
        this.canUseApiKeys = canUseApiKeys;
        this.canUseAuthTokens = canUseAuthTokens;
        this.canUseSmtpCredentials = canUseSmtpCredentials;
        this.canUseDbCredentials = canUseDbCredentials;
        this.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
        this.canUseOAuth2ClientCredentials = canUseOAuth2ClientCredentials;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates if the user can log in to the console. */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
        private Boolean canUseConsolePassword;

        /**
         * Indicates if the user can log in to the console.
         *
         * @param canUseConsolePassword the value to set
         * @return this builder
         */
        public Builder canUseConsolePassword(Boolean canUseConsolePassword) {
            this.canUseConsolePassword = canUseConsolePassword;
            this.__explicitlySet__.add("canUseConsolePassword");
            return this;
        }
        /** Indicates if the user can use API keys. */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
        private Boolean canUseApiKeys;

        /**
         * Indicates if the user can use API keys.
         *
         * @param canUseApiKeys the value to set
         * @return this builder
         */
        public Builder canUseApiKeys(Boolean canUseApiKeys) {
            this.canUseApiKeys = canUseApiKeys;
            this.__explicitlySet__.add("canUseApiKeys");
            return this;
        }
        /** Indicates if the user can use SWIFT passwords / auth tokens. */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
        private Boolean canUseAuthTokens;

        /**
         * Indicates if the user can use SWIFT passwords / auth tokens.
         *
         * @param canUseAuthTokens the value to set
         * @return this builder
         */
        public Builder canUseAuthTokens(Boolean canUseAuthTokens) {
            this.canUseAuthTokens = canUseAuthTokens;
            this.__explicitlySet__.add("canUseAuthTokens");
            return this;
        }
        /** Indicates if the user can use SMTP passwords. */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
        private Boolean canUseSmtpCredentials;

        /**
         * Indicates if the user can use SMTP passwords.
         *
         * @param canUseSmtpCredentials the value to set
         * @return this builder
         */
        public Builder canUseSmtpCredentials(Boolean canUseSmtpCredentials) {
            this.canUseSmtpCredentials = canUseSmtpCredentials;
            this.__explicitlySet__.add("canUseSmtpCredentials");
            return this;
        }
        /** Indicates if the user can use DB passwords. */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseDbCredentials")
        private Boolean canUseDbCredentials;

        /**
         * Indicates if the user can use DB passwords.
         *
         * @param canUseDbCredentials the value to set
         * @return this builder
         */
        public Builder canUseDbCredentials(Boolean canUseDbCredentials) {
            this.canUseDbCredentials = canUseDbCredentials;
            this.__explicitlySet__.add("canUseDbCredentials");
            return this;
        }
        /** Indicates if the user can use SigV4 symmetric keys. */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
        private Boolean canUseCustomerSecretKeys;

        /**
         * Indicates if the user can use SigV4 symmetric keys.
         *
         * @param canUseCustomerSecretKeys the value to set
         * @return this builder
         */
        public Builder canUseCustomerSecretKeys(Boolean canUseCustomerSecretKeys) {
            this.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
            this.__explicitlySet__.add("canUseCustomerSecretKeys");
            return this;
        }
        /** Indicates if the user can use OAuth2 credentials and tokens. */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
        private Boolean canUseOAuth2ClientCredentials;

        /**
         * Indicates if the user can use OAuth2 credentials and tokens.
         *
         * @param canUseOAuth2ClientCredentials the value to set
         * @return this builder
         */
        public Builder canUseOAuth2ClientCredentials(Boolean canUseOAuth2ClientCredentials) {
            this.canUseOAuth2ClientCredentials = canUseOAuth2ClientCredentials;
            this.__explicitlySet__.add("canUseOAuth2ClientCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserCapabilities build() {
            UserCapabilities model =
                    new UserCapabilities(
                            this.canUseConsolePassword,
                            this.canUseApiKeys,
                            this.canUseAuthTokens,
                            this.canUseSmtpCredentials,
                            this.canUseDbCredentials,
                            this.canUseCustomerSecretKeys,
                            this.canUseOAuth2ClientCredentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserCapabilities model) {
            if (model.wasPropertyExplicitlySet("canUseConsolePassword")) {
                this.canUseConsolePassword(model.getCanUseConsolePassword());
            }
            if (model.wasPropertyExplicitlySet("canUseApiKeys")) {
                this.canUseApiKeys(model.getCanUseApiKeys());
            }
            if (model.wasPropertyExplicitlySet("canUseAuthTokens")) {
                this.canUseAuthTokens(model.getCanUseAuthTokens());
            }
            if (model.wasPropertyExplicitlySet("canUseSmtpCredentials")) {
                this.canUseSmtpCredentials(model.getCanUseSmtpCredentials());
            }
            if (model.wasPropertyExplicitlySet("canUseDbCredentials")) {
                this.canUseDbCredentials(model.getCanUseDbCredentials());
            }
            if (model.wasPropertyExplicitlySet("canUseCustomerSecretKeys")) {
                this.canUseCustomerSecretKeys(model.getCanUseCustomerSecretKeys());
            }
            if (model.wasPropertyExplicitlySet("canUseOAuth2ClientCredentials")) {
                this.canUseOAuth2ClientCredentials(model.getCanUseOAuth2ClientCredentials());
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

    /** Indicates if the user can log in to the console. */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
    private final Boolean canUseConsolePassword;

    /**
     * Indicates if the user can log in to the console.
     *
     * @return the value
     */
    public Boolean getCanUseConsolePassword() {
        return canUseConsolePassword;
    }

    /** Indicates if the user can use API keys. */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
    private final Boolean canUseApiKeys;

    /**
     * Indicates if the user can use API keys.
     *
     * @return the value
     */
    public Boolean getCanUseApiKeys() {
        return canUseApiKeys;
    }

    /** Indicates if the user can use SWIFT passwords / auth tokens. */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
    private final Boolean canUseAuthTokens;

    /**
     * Indicates if the user can use SWIFT passwords / auth tokens.
     *
     * @return the value
     */
    public Boolean getCanUseAuthTokens() {
        return canUseAuthTokens;
    }

    /** Indicates if the user can use SMTP passwords. */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
    private final Boolean canUseSmtpCredentials;

    /**
     * Indicates if the user can use SMTP passwords.
     *
     * @return the value
     */
    public Boolean getCanUseSmtpCredentials() {
        return canUseSmtpCredentials;
    }

    /** Indicates if the user can use DB passwords. */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseDbCredentials")
    private final Boolean canUseDbCredentials;

    /**
     * Indicates if the user can use DB passwords.
     *
     * @return the value
     */
    public Boolean getCanUseDbCredentials() {
        return canUseDbCredentials;
    }

    /** Indicates if the user can use SigV4 symmetric keys. */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
    private final Boolean canUseCustomerSecretKeys;

    /**
     * Indicates if the user can use SigV4 symmetric keys.
     *
     * @return the value
     */
    public Boolean getCanUseCustomerSecretKeys() {
        return canUseCustomerSecretKeys;
    }

    /** Indicates if the user can use OAuth2 credentials and tokens. */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
    private final Boolean canUseOAuth2ClientCredentials;

    /**
     * Indicates if the user can use OAuth2 credentials and tokens.
     *
     * @return the value
     */
    public Boolean getCanUseOAuth2ClientCredentials() {
        return canUseOAuth2ClientCredentials;
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
        sb.append("UserCapabilities(");
        sb.append("super=").append(super.toString());
        sb.append("canUseConsolePassword=").append(String.valueOf(this.canUseConsolePassword));
        sb.append(", canUseApiKeys=").append(String.valueOf(this.canUseApiKeys));
        sb.append(", canUseAuthTokens=").append(String.valueOf(this.canUseAuthTokens));
        sb.append(", canUseSmtpCredentials=").append(String.valueOf(this.canUseSmtpCredentials));
        sb.append(", canUseDbCredentials=").append(String.valueOf(this.canUseDbCredentials));
        sb.append(", canUseCustomerSecretKeys=")
                .append(String.valueOf(this.canUseCustomerSecretKeys));
        sb.append(", canUseOAuth2ClientCredentials=")
                .append(String.valueOf(this.canUseOAuth2ClientCredentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserCapabilities)) {
            return false;
        }

        UserCapabilities other = (UserCapabilities) o;
        return java.util.Objects.equals(this.canUseConsolePassword, other.canUseConsolePassword)
                && java.util.Objects.equals(this.canUseApiKeys, other.canUseApiKeys)
                && java.util.Objects.equals(this.canUseAuthTokens, other.canUseAuthTokens)
                && java.util.Objects.equals(this.canUseSmtpCredentials, other.canUseSmtpCredentials)
                && java.util.Objects.equals(this.canUseDbCredentials, other.canUseDbCredentials)
                && java.util.Objects.equals(
                        this.canUseCustomerSecretKeys, other.canUseCustomerSecretKeys)
                && java.util.Objects.equals(
                        this.canUseOAuth2ClientCredentials, other.canUseOAuth2ClientCredentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.canUseConsolePassword == null
                                ? 43
                                : this.canUseConsolePassword.hashCode());
        result =
                (result * PRIME)
                        + (this.canUseApiKeys == null ? 43 : this.canUseApiKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.canUseAuthTokens == null ? 43 : this.canUseAuthTokens.hashCode());
        result =
                (result * PRIME)
                        + (this.canUseSmtpCredentials == null
                                ? 43
                                : this.canUseSmtpCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.canUseDbCredentials == null
                                ? 43
                                : this.canUseDbCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.canUseCustomerSecretKeys == null
                                ? 43
                                : this.canUseCustomerSecretKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.canUseOAuth2ClientCredentials == null
                                ? 43
                                : this.canUseOAuth2ClientCredentials.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
