/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * User's Capabilities
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
    builder = ExtensionCapabilitiesUser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtensionCapabilitiesUser
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "canUseApiKeys",
        "canUseAuthTokens",
        "canUseConsolePassword",
        "canUseCustomerSecretKeys",
        "canUseOAuth2ClientCredentials",
        "canUseSmtpCredentials",
        "canUseDbCredentials"
    })
    public ExtensionCapabilitiesUser(
            Boolean canUseApiKeys,
            Boolean canUseAuthTokens,
            Boolean canUseConsolePassword,
            Boolean canUseCustomerSecretKeys,
            Boolean canUseOAuth2ClientCredentials,
            Boolean canUseSmtpCredentials,
            Boolean canUseDbCredentials) {
        super();
        this.canUseApiKeys = canUseApiKeys;
        this.canUseAuthTokens = canUseAuthTokens;
        this.canUseConsolePassword = canUseConsolePassword;
        this.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
        this.canUseOAuth2ClientCredentials = canUseOAuth2ClientCredentials;
        this.canUseSmtpCredentials = canUseSmtpCredentials;
        this.canUseDbCredentials = canUseDbCredentials;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates weather a user can use api keys
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
        private Boolean canUseApiKeys;

        /**
         * Indicates weather a user can use api keys
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param canUseApiKeys the value to set
         * @return this builder
         **/
        public Builder canUseApiKeys(Boolean canUseApiKeys) {
            this.canUseApiKeys = canUseApiKeys;
            this.__explicitlySet__.add("canUseApiKeys");
            return this;
        }
        /**
         * Indicates weather a user can use auth tokens
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
        private Boolean canUseAuthTokens;

        /**
         * Indicates weather a user can use auth tokens
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param canUseAuthTokens the value to set
         * @return this builder
         **/
        public Builder canUseAuthTokens(Boolean canUseAuthTokens) {
            this.canUseAuthTokens = canUseAuthTokens;
            this.__explicitlySet__.add("canUseAuthTokens");
            return this;
        }
        /**
         * Indicates weather a user can use console password
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
        private Boolean canUseConsolePassword;

        /**
         * Indicates weather a user can use console password
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param canUseConsolePassword the value to set
         * @return this builder
         **/
        public Builder canUseConsolePassword(Boolean canUseConsolePassword) {
            this.canUseConsolePassword = canUseConsolePassword;
            this.__explicitlySet__.add("canUseConsolePassword");
            return this;
        }
        /**
         * Indicates weather a user can use customer secret keys
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
        private Boolean canUseCustomerSecretKeys;

        /**
         * Indicates weather a user can use customer secret keys
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param canUseCustomerSecretKeys the value to set
         * @return this builder
         **/
        public Builder canUseCustomerSecretKeys(Boolean canUseCustomerSecretKeys) {
            this.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
            this.__explicitlySet__.add("canUseCustomerSecretKeys");
            return this;
        }
        /**
         * Indicates weather a user can use oauth2 client credentials
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
        private Boolean canUseOAuth2ClientCredentials;

        /**
         * Indicates weather a user can use oauth2 client credentials
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param canUseOAuth2ClientCredentials the value to set
         * @return this builder
         **/
        public Builder canUseOAuth2ClientCredentials(Boolean canUseOAuth2ClientCredentials) {
            this.canUseOAuth2ClientCredentials = canUseOAuth2ClientCredentials;
            this.__explicitlySet__.add("canUseOAuth2ClientCredentials");
            return this;
        }
        /**
         * Indicates weather a user can use smtp credentials
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
        private Boolean canUseSmtpCredentials;

        /**
         * Indicates weather a user can use smtp credentials
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param canUseSmtpCredentials the value to set
         * @return this builder
         **/
        public Builder canUseSmtpCredentials(Boolean canUseSmtpCredentials) {
            this.canUseSmtpCredentials = canUseSmtpCredentials;
            this.__explicitlySet__.add("canUseSmtpCredentials");
            return this;
        }
        /**
         * Indicates weather a user can use db credentials
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canUseDbCredentials")
        private Boolean canUseDbCredentials;

        /**
         * Indicates weather a user can use db credentials
         * <p>
         **Added In:** 2012271618
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param canUseDbCredentials the value to set
         * @return this builder
         **/
        public Builder canUseDbCredentials(Boolean canUseDbCredentials) {
            this.canUseDbCredentials = canUseDbCredentials;
            this.__explicitlySet__.add("canUseDbCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionCapabilitiesUser build() {
            ExtensionCapabilitiesUser model =
                    new ExtensionCapabilitiesUser(
                            this.canUseApiKeys,
                            this.canUseAuthTokens,
                            this.canUseConsolePassword,
                            this.canUseCustomerSecretKeys,
                            this.canUseOAuth2ClientCredentials,
                            this.canUseSmtpCredentials,
                            this.canUseDbCredentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionCapabilitiesUser model) {
            if (model.wasPropertyExplicitlySet("canUseApiKeys")) {
                this.canUseApiKeys(model.getCanUseApiKeys());
            }
            if (model.wasPropertyExplicitlySet("canUseAuthTokens")) {
                this.canUseAuthTokens(model.getCanUseAuthTokens());
            }
            if (model.wasPropertyExplicitlySet("canUseConsolePassword")) {
                this.canUseConsolePassword(model.getCanUseConsolePassword());
            }
            if (model.wasPropertyExplicitlySet("canUseCustomerSecretKeys")) {
                this.canUseCustomerSecretKeys(model.getCanUseCustomerSecretKeys());
            }
            if (model.wasPropertyExplicitlySet("canUseOAuth2ClientCredentials")) {
                this.canUseOAuth2ClientCredentials(model.getCanUseOAuth2ClientCredentials());
            }
            if (model.wasPropertyExplicitlySet("canUseSmtpCredentials")) {
                this.canUseSmtpCredentials(model.getCanUseSmtpCredentials());
            }
            if (model.wasPropertyExplicitlySet("canUseDbCredentials")) {
                this.canUseDbCredentials(model.getCanUseDbCredentials());
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
     * Indicates weather a user can use api keys
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
    private final Boolean canUseApiKeys;

    /**
     * Indicates weather a user can use api keys
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCanUseApiKeys() {
        return canUseApiKeys;
    }

    /**
     * Indicates weather a user can use auth tokens
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
    private final Boolean canUseAuthTokens;

    /**
     * Indicates weather a user can use auth tokens
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCanUseAuthTokens() {
        return canUseAuthTokens;
    }

    /**
     * Indicates weather a user can use console password
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
    private final Boolean canUseConsolePassword;

    /**
     * Indicates weather a user can use console password
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCanUseConsolePassword() {
        return canUseConsolePassword;
    }

    /**
     * Indicates weather a user can use customer secret keys
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
    private final Boolean canUseCustomerSecretKeys;

    /**
     * Indicates weather a user can use customer secret keys
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCanUseCustomerSecretKeys() {
        return canUseCustomerSecretKeys;
    }

    /**
     * Indicates weather a user can use oauth2 client credentials
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
    private final Boolean canUseOAuth2ClientCredentials;

    /**
     * Indicates weather a user can use oauth2 client credentials
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCanUseOAuth2ClientCredentials() {
        return canUseOAuth2ClientCredentials;
    }

    /**
     * Indicates weather a user can use smtp credentials
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
    private final Boolean canUseSmtpCredentials;

    /**
     * Indicates weather a user can use smtp credentials
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCanUseSmtpCredentials() {
        return canUseSmtpCredentials;
    }

    /**
     * Indicates weather a user can use db credentials
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseDbCredentials")
    private final Boolean canUseDbCredentials;

    /**
     * Indicates weather a user can use db credentials
     * <p>
     **Added In:** 2012271618
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCanUseDbCredentials() {
        return canUseDbCredentials;
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
        sb.append("ExtensionCapabilitiesUser(");
        sb.append("super=").append(super.toString());
        sb.append("canUseApiKeys=").append(String.valueOf(this.canUseApiKeys));
        sb.append(", canUseAuthTokens=").append(String.valueOf(this.canUseAuthTokens));
        sb.append(", canUseConsolePassword=").append(String.valueOf(this.canUseConsolePassword));
        sb.append(", canUseCustomerSecretKeys=")
                .append(String.valueOf(this.canUseCustomerSecretKeys));
        sb.append(", canUseOAuth2ClientCredentials=")
                .append(String.valueOf(this.canUseOAuth2ClientCredentials));
        sb.append(", canUseSmtpCredentials=").append(String.valueOf(this.canUseSmtpCredentials));
        sb.append(", canUseDbCredentials=").append(String.valueOf(this.canUseDbCredentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionCapabilitiesUser)) {
            return false;
        }

        ExtensionCapabilitiesUser other = (ExtensionCapabilitiesUser) o;
        return java.util.Objects.equals(this.canUseApiKeys, other.canUseApiKeys)
                && java.util.Objects.equals(this.canUseAuthTokens, other.canUseAuthTokens)
                && java.util.Objects.equals(this.canUseConsolePassword, other.canUseConsolePassword)
                && java.util.Objects.equals(
                        this.canUseCustomerSecretKeys, other.canUseCustomerSecretKeys)
                && java.util.Objects.equals(
                        this.canUseOAuth2ClientCredentials, other.canUseOAuth2ClientCredentials)
                && java.util.Objects.equals(this.canUseSmtpCredentials, other.canUseSmtpCredentials)
                && java.util.Objects.equals(this.canUseDbCredentials, other.canUseDbCredentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.canUseApiKeys == null ? 43 : this.canUseApiKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.canUseAuthTokens == null ? 43 : this.canUseAuthTokens.hashCode());
        result =
                (result * PRIME)
                        + (this.canUseConsolePassword == null
                                ? 43
                                : this.canUseConsolePassword.hashCode());
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
                        + (this.canUseSmtpCredentials == null
                                ? 43
                                : this.canUseSmtpCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.canUseDbCredentials == null
                                ? 43
                                : this.canUseDbCredentials.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
