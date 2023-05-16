/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * User's credentials <br>
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
        builder = ExtensionUserCredentialsUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionUserCredentialsUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dbCredentials",
        "customerSecretKeys",
        "authTokens",
        "smtpCredentials",
        "apiKeys",
        "oAuth2ClientCredentials"
    })
    public ExtensionUserCredentialsUser(
            java.util.List<UserExtDbCredentials> dbCredentials,
            java.util.List<UserExtCustomerSecretKeys> customerSecretKeys,
            java.util.List<UserExtAuthTokens> authTokens,
            java.util.List<UserExtSmtpCredentials> smtpCredentials,
            java.util.List<UserExtApiKeys> apiKeys,
            java.util.List<UserExtOAuth2ClientCredentials> oAuth2ClientCredentials) {
        super();
        this.dbCredentials = dbCredentials;
        this.customerSecretKeys = customerSecretKeys;
        this.authTokens = authTokens;
        this.smtpCredentials = smtpCredentials;
        this.apiKeys = apiKeys;
        this.oAuth2ClientCredentials = oAuth2ClientCredentials;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of db credentials corresponding to user.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbCredentials")
        private java.util.List<UserExtDbCredentials> dbCredentials;

        /**
         * A list of db credentials corresponding to user.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param dbCredentials the value to set
         * @return this builder
         */
        public Builder dbCredentials(java.util.List<UserExtDbCredentials> dbCredentials) {
            this.dbCredentials = dbCredentials;
            this.__explicitlySet__.add("dbCredentials");
            return this;
        }
        /**
         * A list of customer secret keys corresponding to user.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerSecretKeys")
        private java.util.List<UserExtCustomerSecretKeys> customerSecretKeys;

        /**
         * A list of customer secret keys corresponding to user.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param customerSecretKeys the value to set
         * @return this builder
         */
        public Builder customerSecretKeys(
                java.util.List<UserExtCustomerSecretKeys> customerSecretKeys) {
            this.customerSecretKeys = customerSecretKeys;
            this.__explicitlySet__.add("customerSecretKeys");
            return this;
        }
        /**
         * A list of auth tokens corresponding to user.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authTokens")
        private java.util.List<UserExtAuthTokens> authTokens;

        /**
         * A list of auth tokens corresponding to user.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param authTokens the value to set
         * @return this builder
         */
        public Builder authTokens(java.util.List<UserExtAuthTokens> authTokens) {
            this.authTokens = authTokens;
            this.__explicitlySet__.add("authTokens");
            return this;
        }
        /**
         * A list of smtp credentials corresponding to user.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("smtpCredentials")
        private java.util.List<UserExtSmtpCredentials> smtpCredentials;

        /**
         * A list of smtp credentials corresponding to user.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param smtpCredentials the value to set
         * @return this builder
         */
        public Builder smtpCredentials(java.util.List<UserExtSmtpCredentials> smtpCredentials) {
            this.smtpCredentials = smtpCredentials;
            this.__explicitlySet__.add("smtpCredentials");
            return this;
        }
        /**
         * A list of api keys corresponding to user.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("apiKeys")
        private java.util.List<UserExtApiKeys> apiKeys;

        /**
         * A list of api keys corresponding to user.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param apiKeys the value to set
         * @return this builder
         */
        public Builder apiKeys(java.util.List<UserExtApiKeys> apiKeys) {
            this.apiKeys = apiKeys;
            this.__explicitlySet__.add("apiKeys");
            return this;
        }
        /**
         * A list of oauth2 client credentials corresponding to user.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oAuth2ClientCredentials")
        private java.util.List<UserExtOAuth2ClientCredentials> oAuth2ClientCredentials;

        /**
         * A list of oauth2 client credentials corresponding to user.
         *
         * <p>*Added In:** 2012271618
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param oAuth2ClientCredentials the value to set
         * @return this builder
         */
        public Builder oAuth2ClientCredentials(
                java.util.List<UserExtOAuth2ClientCredentials> oAuth2ClientCredentials) {
            this.oAuth2ClientCredentials = oAuth2ClientCredentials;
            this.__explicitlySet__.add("oAuth2ClientCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionUserCredentialsUser build() {
            ExtensionUserCredentialsUser model =
                    new ExtensionUserCredentialsUser(
                            this.dbCredentials,
                            this.customerSecretKeys,
                            this.authTokens,
                            this.smtpCredentials,
                            this.apiKeys,
                            this.oAuth2ClientCredentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionUserCredentialsUser model) {
            if (model.wasPropertyExplicitlySet("dbCredentials")) {
                this.dbCredentials(model.getDbCredentials());
            }
            if (model.wasPropertyExplicitlySet("customerSecretKeys")) {
                this.customerSecretKeys(model.getCustomerSecretKeys());
            }
            if (model.wasPropertyExplicitlySet("authTokens")) {
                this.authTokens(model.getAuthTokens());
            }
            if (model.wasPropertyExplicitlySet("smtpCredentials")) {
                this.smtpCredentials(model.getSmtpCredentials());
            }
            if (model.wasPropertyExplicitlySet("apiKeys")) {
                this.apiKeys(model.getApiKeys());
            }
            if (model.wasPropertyExplicitlySet("oAuth2ClientCredentials")) {
                this.oAuth2ClientCredentials(model.getOAuth2ClientCredentials());
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
     * A list of db credentials corresponding to user.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbCredentials")
    private final java.util.List<UserExtDbCredentials> dbCredentials;

    /**
     * A list of db credentials corresponding to user.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtDbCredentials> getDbCredentials() {
        return dbCredentials;
    }

    /**
     * A list of customer secret keys corresponding to user.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerSecretKeys")
    private final java.util.List<UserExtCustomerSecretKeys> customerSecretKeys;

    /**
     * A list of customer secret keys corresponding to user.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtCustomerSecretKeys> getCustomerSecretKeys() {
        return customerSecretKeys;
    }

    /**
     * A list of auth tokens corresponding to user.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authTokens")
    private final java.util.List<UserExtAuthTokens> authTokens;

    /**
     * A list of auth tokens corresponding to user.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtAuthTokens> getAuthTokens() {
        return authTokens;
    }

    /**
     * A list of smtp credentials corresponding to user.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("smtpCredentials")
    private final java.util.List<UserExtSmtpCredentials> smtpCredentials;

    /**
     * A list of smtp credentials corresponding to user.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtSmtpCredentials> getSmtpCredentials() {
        return smtpCredentials;
    }

    /**
     * A list of api keys corresponding to user.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apiKeys")
    private final java.util.List<UserExtApiKeys> apiKeys;

    /**
     * A list of api keys corresponding to user.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtApiKeys> getApiKeys() {
        return apiKeys;
    }

    /**
     * A list of oauth2 client credentials corresponding to user.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oAuth2ClientCredentials")
    private final java.util.List<UserExtOAuth2ClientCredentials> oAuth2ClientCredentials;

    /**
     * A list of oauth2 client credentials corresponding to user.
     *
     * <p>*Added In:** 2012271618
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtOAuth2ClientCredentials> getOAuth2ClientCredentials() {
        return oAuth2ClientCredentials;
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
        sb.append("ExtensionUserCredentialsUser(");
        sb.append("super=").append(super.toString());
        sb.append("dbCredentials=").append(String.valueOf(this.dbCredentials));
        sb.append(", customerSecretKeys=").append(String.valueOf(this.customerSecretKeys));
        sb.append(", authTokens=").append(String.valueOf(this.authTokens));
        sb.append(", smtpCredentials=").append(String.valueOf(this.smtpCredentials));
        sb.append(", apiKeys=").append(String.valueOf(this.apiKeys));
        sb.append(", oAuth2ClientCredentials=")
                .append(String.valueOf(this.oAuth2ClientCredentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionUserCredentialsUser)) {
            return false;
        }

        ExtensionUserCredentialsUser other = (ExtensionUserCredentialsUser) o;
        return java.util.Objects.equals(this.dbCredentials, other.dbCredentials)
                && java.util.Objects.equals(this.customerSecretKeys, other.customerSecretKeys)
                && java.util.Objects.equals(this.authTokens, other.authTokens)
                && java.util.Objects.equals(this.smtpCredentials, other.smtpCredentials)
                && java.util.Objects.equals(this.apiKeys, other.apiKeys)
                && java.util.Objects.equals(
                        this.oAuth2ClientCredentials, other.oAuth2ClientCredentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dbCredentials == null ? 43 : this.dbCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.customerSecretKeys == null
                                ? 43
                                : this.customerSecretKeys.hashCode());
        result = (result * PRIME) + (this.authTokens == null ? 43 : this.authTokens.hashCode());
        result =
                (result * PRIME)
                        + (this.smtpCredentials == null ? 43 : this.smtpCredentials.hashCode());
        result = (result * PRIME) + (this.apiKeys == null ? 43 : this.apiKeys.hashCode());
        result =
                (result * PRIME)
                        + (this.oAuth2ClientCredentials == null
                                ? 43
                                : this.oAuth2ClientCredentials.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
