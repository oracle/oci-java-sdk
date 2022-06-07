/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * Properties indicating how the user is allowed to authenticate.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserCapabilities.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserCapabilities {
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
        @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
        private Boolean canUseConsolePassword;

        public Builder canUseConsolePassword(Boolean canUseConsolePassword) {
            this.canUseConsolePassword = canUseConsolePassword;
            this.__explicitlySet__.add("canUseConsolePassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
        private Boolean canUseApiKeys;

        public Builder canUseApiKeys(Boolean canUseApiKeys) {
            this.canUseApiKeys = canUseApiKeys;
            this.__explicitlySet__.add("canUseApiKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
        private Boolean canUseAuthTokens;

        public Builder canUseAuthTokens(Boolean canUseAuthTokens) {
            this.canUseAuthTokens = canUseAuthTokens;
            this.__explicitlySet__.add("canUseAuthTokens");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
        private Boolean canUseSmtpCredentials;

        public Builder canUseSmtpCredentials(Boolean canUseSmtpCredentials) {
            this.canUseSmtpCredentials = canUseSmtpCredentials;
            this.__explicitlySet__.add("canUseSmtpCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseDbCredentials")
        private Boolean canUseDbCredentials;

        public Builder canUseDbCredentials(Boolean canUseDbCredentials) {
            this.canUseDbCredentials = canUseDbCredentials;
            this.__explicitlySet__.add("canUseDbCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
        private Boolean canUseCustomerSecretKeys;

        public Builder canUseCustomerSecretKeys(Boolean canUseCustomerSecretKeys) {
            this.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
            this.__explicitlySet__.add("canUseCustomerSecretKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
        private Boolean canUseOAuth2ClientCredentials;

        public Builder canUseOAuth2ClientCredentials(Boolean canUseOAuth2ClientCredentials) {
            this.canUseOAuth2ClientCredentials = canUseOAuth2ClientCredentials;
            this.__explicitlySet__.add("canUseOAuth2ClientCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserCapabilities build() {
            UserCapabilities __instance__ =
                    new UserCapabilities(
                            canUseConsolePassword,
                            canUseApiKeys,
                            canUseAuthTokens,
                            canUseSmtpCredentials,
                            canUseDbCredentials,
                            canUseCustomerSecretKeys,
                            canUseOAuth2ClientCredentials);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserCapabilities o) {
            Builder copiedBuilder =
                    canUseConsolePassword(o.getCanUseConsolePassword())
                            .canUseApiKeys(o.getCanUseApiKeys())
                            .canUseAuthTokens(o.getCanUseAuthTokens())
                            .canUseSmtpCredentials(o.getCanUseSmtpCredentials())
                            .canUseDbCredentials(o.getCanUseDbCredentials())
                            .canUseCustomerSecretKeys(o.getCanUseCustomerSecretKeys())
                            .canUseOAuth2ClientCredentials(o.getCanUseOAuth2ClientCredentials());

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
     * Indicates if the user can log in to the console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
    private final Boolean canUseConsolePassword;

    public Boolean getCanUseConsolePassword() {
        return canUseConsolePassword;
    }

    /**
     * Indicates if the user can use API keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
    private final Boolean canUseApiKeys;

    public Boolean getCanUseApiKeys() {
        return canUseApiKeys;
    }

    /**
     * Indicates if the user can use SWIFT passwords / auth tokens.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
    private final Boolean canUseAuthTokens;

    public Boolean getCanUseAuthTokens() {
        return canUseAuthTokens;
    }

    /**
     * Indicates if the user can use SMTP passwords.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
    private final Boolean canUseSmtpCredentials;

    public Boolean getCanUseSmtpCredentials() {
        return canUseSmtpCredentials;
    }

    /**
     * Indicates if the user can use DB passwords.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseDbCredentials")
    private final Boolean canUseDbCredentials;

    public Boolean getCanUseDbCredentials() {
        return canUseDbCredentials;
    }

    /**
     * Indicates if the user can use SigV4 symmetric keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
    private final Boolean canUseCustomerSecretKeys;

    public Boolean getCanUseCustomerSecretKeys() {
        return canUseCustomerSecretKeys;
    }

    /**
     * Indicates if the user can use OAuth2 credentials and tokens.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
    private final Boolean canUseOAuth2ClientCredentials;

    public Boolean getCanUseOAuth2ClientCredentials() {
        return canUseOAuth2ClientCredentials;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UserCapabilities(");
        sb.append("canUseConsolePassword=").append(String.valueOf(this.canUseConsolePassword));
        sb.append(", canUseApiKeys=").append(String.valueOf(this.canUseApiKeys));
        sb.append(", canUseAuthTokens=").append(String.valueOf(this.canUseAuthTokens));
        sb.append(", canUseSmtpCredentials=").append(String.valueOf(this.canUseSmtpCredentials));
        sb.append(", canUseDbCredentials=").append(String.valueOf(this.canUseDbCredentials));
        sb.append(", canUseCustomerSecretKeys=")
                .append(String.valueOf(this.canUseCustomerSecretKeys));
        sb.append(", canUseOAuth2ClientCredentials=")
                .append(String.valueOf(this.canUseOAuth2ClientCredentials));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
