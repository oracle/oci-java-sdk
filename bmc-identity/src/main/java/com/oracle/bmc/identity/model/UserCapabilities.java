/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserCapabilities.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UserCapabilities {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
        private Boolean canUseCustomerSecretKeys;

        public Builder canUseCustomerSecretKeys(Boolean canUseCustomerSecretKeys) {
            this.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
            this.__explicitlySet__.add("canUseCustomerSecretKeys");
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
                            canUseCustomerSecretKeys);
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
                            .canUseCustomerSecretKeys(o.getCanUseCustomerSecretKeys());

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

    /**
     * Indicates if the user can log in to the console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
    Boolean canUseConsolePassword;

    /**
     * Indicates if the user can use API keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
    Boolean canUseApiKeys;

    /**
     * Indicates if the user can use SWIFT passwords / auth tokens.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
    Boolean canUseAuthTokens;

    /**
     * Indicates if the user can use SMTP passwords.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
    Boolean canUseSmtpCredentials;

    /**
     * Indicates if the user can use SigV4 symmetric keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
    Boolean canUseCustomerSecretKeys;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
