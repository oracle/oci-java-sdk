/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * User's Capabilities <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtensionCapabilitiesUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionCapabilitiesUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "canUseApiKeys",
        "canUseAuthTokens",
        "canUseConsolePassword",
        "canUseCustomerSecretKeys",
        "canUseOAuth2ClientCredentials",
        "canUseSmtpCredentials",
        "canUseDbCredentials",
        "canUseConsole"
    })
    public ExtensionCapabilitiesUser(
            Boolean canUseApiKeys,
            Boolean canUseAuthTokens,
            Boolean canUseConsolePassword,
            Boolean canUseCustomerSecretKeys,
            Boolean canUseOAuth2ClientCredentials,
            Boolean canUseSmtpCredentials,
            Boolean canUseDbCredentials,
            Boolean canUseConsole) {
        super();
        this.canUseApiKeys = canUseApiKeys;
        this.canUseAuthTokens = canUseAuthTokens;
        this.canUseConsolePassword = canUseConsolePassword;
        this.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
        this.canUseOAuth2ClientCredentials = canUseOAuth2ClientCredentials;
        this.canUseSmtpCredentials = canUseSmtpCredentials;
        this.canUseDbCredentials = canUseDbCredentials;
        this.canUseConsole = canUseConsole;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether a user can use API keys.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
        private Boolean canUseApiKeys;

        /**
         * Indicates whether a user can use API keys.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param canUseApiKeys the value to set
         * @return this builder
         */
        public Builder canUseApiKeys(Boolean canUseApiKeys) {
            this.canUseApiKeys = canUseApiKeys;
            this.__explicitlySet__.add("canUseApiKeys");
            return this;
        }
        /**
         * Indicates whether a user can use Auth tokens.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
        private Boolean canUseAuthTokens;

        /**
         * Indicates whether a user can use Auth tokens.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param canUseAuthTokens the value to set
         * @return this builder
         */
        public Builder canUseAuthTokens(Boolean canUseAuthTokens) {
            this.canUseAuthTokens = canUseAuthTokens;
            this.__explicitlySet__.add("canUseAuthTokens");
            return this;
        }
        /**
         * Indicates whether a user can use Console passwords.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
        private Boolean canUseConsolePassword;

        /**
         * Indicates whether a user can use Console passwords.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param canUseConsolePassword the value to set
         * @return this builder
         */
        public Builder canUseConsolePassword(Boolean canUseConsolePassword) {
            this.canUseConsolePassword = canUseConsolePassword;
            this.__explicitlySet__.add("canUseConsolePassword");
            return this;
        }
        /**
         * Indicates whether a user can use customer secret keys.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
        private Boolean canUseCustomerSecretKeys;

        /**
         * Indicates whether a user can use customer secret keys.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param canUseCustomerSecretKeys the value to set
         * @return this builder
         */
        public Builder canUseCustomerSecretKeys(Boolean canUseCustomerSecretKeys) {
            this.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
            this.__explicitlySet__.add("canUseCustomerSecretKeys");
            return this;
        }
        /**
         * Indicates whether a user can use OAuth2 client credentials.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
        private Boolean canUseOAuth2ClientCredentials;

        /**
         * Indicates whether a user can use OAuth2 client credentials.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param canUseOAuth2ClientCredentials the value to set
         * @return this builder
         */
        public Builder canUseOAuth2ClientCredentials(Boolean canUseOAuth2ClientCredentials) {
            this.canUseOAuth2ClientCredentials = canUseOAuth2ClientCredentials;
            this.__explicitlySet__.add("canUseOAuth2ClientCredentials");
            return this;
        }
        /**
         * Indicates whether a user can use SMTP credentials.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
        private Boolean canUseSmtpCredentials;

        /**
         * Indicates whether a user can use SMTP credentials.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param canUseSmtpCredentials the value to set
         * @return this builder
         */
        public Builder canUseSmtpCredentials(Boolean canUseSmtpCredentials) {
            this.canUseSmtpCredentials = canUseSmtpCredentials;
            this.__explicitlySet__.add("canUseSmtpCredentials");
            return this;
        }
        /**
         * Indicates whether a user can use database credentials.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseDbCredentials")
        private Boolean canUseDbCredentials;

        /**
         * Indicates whether a user can use database credentials.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param canUseDbCredentials the value to set
         * @return this builder
         */
        public Builder canUseDbCredentials(Boolean canUseDbCredentials) {
            this.canUseDbCredentials = canUseDbCredentials;
            this.__explicitlySet__.add("canUseDbCredentials");
            return this;
        }
        /**
         * Specifies whether user can access the Console.
         *
         * <p>*Added In:** 2206280902
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("canUseConsole")
        private Boolean canUseConsole;

        /**
         * Specifies whether user can access the Console.
         *
         * <p>*Added In:** 2206280902
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: boolean -
         * uniqueness: none
         *
         * @param canUseConsole the value to set
         * @return this builder
         */
        public Builder canUseConsole(Boolean canUseConsole) {
            this.canUseConsole = canUseConsole;
            this.__explicitlySet__.add("canUseConsole");
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
                            this.canUseDbCredentials,
                            this.canUseConsole);
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
            if (model.wasPropertyExplicitlySet("canUseConsole")) {
                this.canUseConsole(model.getCanUseConsole());
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

    /**
     * Indicates whether a user can use API keys.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
    private final Boolean canUseApiKeys;

    /**
     * Indicates whether a user can use API keys.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCanUseApiKeys() {
        return canUseApiKeys;
    }

    /**
     * Indicates whether a user can use Auth tokens.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
    private final Boolean canUseAuthTokens;

    /**
     * Indicates whether a user can use Auth tokens.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCanUseAuthTokens() {
        return canUseAuthTokens;
    }

    /**
     * Indicates whether a user can use Console passwords.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
    private final Boolean canUseConsolePassword;

    /**
     * Indicates whether a user can use Console passwords.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCanUseConsolePassword() {
        return canUseConsolePassword;
    }

    /**
     * Indicates whether a user can use customer secret keys.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
    private final Boolean canUseCustomerSecretKeys;

    /**
     * Indicates whether a user can use customer secret keys.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCanUseCustomerSecretKeys() {
        return canUseCustomerSecretKeys;
    }

    /**
     * Indicates whether a user can use OAuth2 client credentials.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
    private final Boolean canUseOAuth2ClientCredentials;

    /**
     * Indicates whether a user can use OAuth2 client credentials.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCanUseOAuth2ClientCredentials() {
        return canUseOAuth2ClientCredentials;
    }

    /**
     * Indicates whether a user can use SMTP credentials.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
    private final Boolean canUseSmtpCredentials;

    /**
     * Indicates whether a user can use SMTP credentials.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCanUseSmtpCredentials() {
        return canUseSmtpCredentials;
    }

    /**
     * Indicates whether a user can use database credentials.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseDbCredentials")
    private final Boolean canUseDbCredentials;

    /**
     * Indicates whether a user can use database credentials.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCanUseDbCredentials() {
        return canUseDbCredentials;
    }

    /**
     * Specifies whether user can access the Console.
     *
     * <p>*Added In:** 2206280902
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canUseConsole")
    private final Boolean canUseConsole;

    /**
     * Specifies whether user can access the Console.
     *
     * <p>*Added In:** 2206280902
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getCanUseConsole() {
        return canUseConsole;
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
        sb.append(", canUseConsole=").append(String.valueOf(this.canUseConsole));
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
                && java.util.Objects.equals(this.canUseConsole, other.canUseConsole)
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
        result =
                (result * PRIME)
                        + (this.canUseConsole == null ? 43 : this.canUseConsole.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
