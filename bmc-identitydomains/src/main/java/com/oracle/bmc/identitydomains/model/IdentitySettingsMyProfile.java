/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Whether to allow users to update their own profile.
 *
 * <p>*Added In:** 2207040824
 *
 * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - required: false - type:
 * complex - uniqueness: none <br>
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
        builder = IdentitySettingsMyProfile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentitySettingsMyProfile
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "allowEndUsersToChangeTheirPassword",
        "allowEndUsersToLinkTheirSupportAccount",
        "allowEndUsersToUpdateTheirSecuritySettings",
        "allowEndUsersToManageTheirCapabilities"
    })
    public IdentitySettingsMyProfile(
            Boolean allowEndUsersToChangeTheirPassword,
            Boolean allowEndUsersToLinkTheirSupportAccount,
            Boolean allowEndUsersToUpdateTheirSecuritySettings,
            Boolean allowEndUsersToManageTheirCapabilities) {
        super();
        this.allowEndUsersToChangeTheirPassword = allowEndUsersToChangeTheirPassword;
        this.allowEndUsersToLinkTheirSupportAccount = allowEndUsersToLinkTheirSupportAccount;
        this.allowEndUsersToUpdateTheirSecuritySettings =
                allowEndUsersToUpdateTheirSecuritySettings;
        this.allowEndUsersToManageTheirCapabilities = allowEndUsersToManageTheirCapabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to allow users to change their own password.
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowEndUsersToChangeTheirPassword")
        private Boolean allowEndUsersToChangeTheirPassword;

        /**
         * Whether to allow users to change their own password.
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param allowEndUsersToChangeTheirPassword the value to set
         * @return this builder
         */
        public Builder allowEndUsersToChangeTheirPassword(
                Boolean allowEndUsersToChangeTheirPassword) {
            this.allowEndUsersToChangeTheirPassword = allowEndUsersToChangeTheirPassword;
            this.__explicitlySet__.add("allowEndUsersToChangeTheirPassword");
            return this;
        }
        /**
         * Whether to allow users to link or unlink their support accounts.
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowEndUsersToLinkTheirSupportAccount")
        private Boolean allowEndUsersToLinkTheirSupportAccount;

        /**
         * Whether to allow users to link or unlink their support accounts.
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param allowEndUsersToLinkTheirSupportAccount the value to set
         * @return this builder
         */
        public Builder allowEndUsersToLinkTheirSupportAccount(
                Boolean allowEndUsersToLinkTheirSupportAccount) {
            this.allowEndUsersToLinkTheirSupportAccount = allowEndUsersToLinkTheirSupportAccount;
            this.__explicitlySet__.add("allowEndUsersToLinkTheirSupportAccount");
            return this;
        }
        /**
         * Whether to allow users to update their security settings.
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowEndUsersToUpdateTheirSecuritySettings")
        private Boolean allowEndUsersToUpdateTheirSecuritySettings;

        /**
         * Whether to allow users to update their security settings.
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param allowEndUsersToUpdateTheirSecuritySettings the value to set
         * @return this builder
         */
        public Builder allowEndUsersToUpdateTheirSecuritySettings(
                Boolean allowEndUsersToUpdateTheirSecuritySettings) {
            this.allowEndUsersToUpdateTheirSecuritySettings =
                    allowEndUsersToUpdateTheirSecuritySettings;
            this.__explicitlySet__.add("allowEndUsersToUpdateTheirSecuritySettings");
            return this;
        }
        /**
         * Whether to allow users to update their capabilities.
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowEndUsersToManageTheirCapabilities")
        private Boolean allowEndUsersToManageTheirCapabilities;

        /**
         * Whether to allow users to update their capabilities.
         *
         * <p>*Added In:** 2207040824
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param allowEndUsersToManageTheirCapabilities the value to set
         * @return this builder
         */
        public Builder allowEndUsersToManageTheirCapabilities(
                Boolean allowEndUsersToManageTheirCapabilities) {
            this.allowEndUsersToManageTheirCapabilities = allowEndUsersToManageTheirCapabilities;
            this.__explicitlySet__.add("allowEndUsersToManageTheirCapabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentitySettingsMyProfile build() {
            IdentitySettingsMyProfile model =
                    new IdentitySettingsMyProfile(
                            this.allowEndUsersToChangeTheirPassword,
                            this.allowEndUsersToLinkTheirSupportAccount,
                            this.allowEndUsersToUpdateTheirSecuritySettings,
                            this.allowEndUsersToManageTheirCapabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentitySettingsMyProfile model) {
            if (model.wasPropertyExplicitlySet("allowEndUsersToChangeTheirPassword")) {
                this.allowEndUsersToChangeTheirPassword(
                        model.getAllowEndUsersToChangeTheirPassword());
            }
            if (model.wasPropertyExplicitlySet("allowEndUsersToLinkTheirSupportAccount")) {
                this.allowEndUsersToLinkTheirSupportAccount(
                        model.getAllowEndUsersToLinkTheirSupportAccount());
            }
            if (model.wasPropertyExplicitlySet("allowEndUsersToUpdateTheirSecuritySettings")) {
                this.allowEndUsersToUpdateTheirSecuritySettings(
                        model.getAllowEndUsersToUpdateTheirSecuritySettings());
            }
            if (model.wasPropertyExplicitlySet("allowEndUsersToManageTheirCapabilities")) {
                this.allowEndUsersToManageTheirCapabilities(
                        model.getAllowEndUsersToManageTheirCapabilities());
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
     * Whether to allow users to change their own password.
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowEndUsersToChangeTheirPassword")
    private final Boolean allowEndUsersToChangeTheirPassword;

    /**
     * Whether to allow users to change their own password.
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAllowEndUsersToChangeTheirPassword() {
        return allowEndUsersToChangeTheirPassword;
    }

    /**
     * Whether to allow users to link or unlink their support accounts.
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowEndUsersToLinkTheirSupportAccount")
    private final Boolean allowEndUsersToLinkTheirSupportAccount;

    /**
     * Whether to allow users to link or unlink their support accounts.
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAllowEndUsersToLinkTheirSupportAccount() {
        return allowEndUsersToLinkTheirSupportAccount;
    }

    /**
     * Whether to allow users to update their security settings.
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowEndUsersToUpdateTheirSecuritySettings")
    private final Boolean allowEndUsersToUpdateTheirSecuritySettings;

    /**
     * Whether to allow users to update their security settings.
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAllowEndUsersToUpdateTheirSecuritySettings() {
        return allowEndUsersToUpdateTheirSecuritySettings;
    }

    /**
     * Whether to allow users to update their capabilities.
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowEndUsersToManageTheirCapabilities")
    private final Boolean allowEndUsersToManageTheirCapabilities;

    /**
     * Whether to allow users to update their capabilities.
     *
     * <p>*Added In:** 2207040824
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAllowEndUsersToManageTheirCapabilities() {
        return allowEndUsersToManageTheirCapabilities;
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
        sb.append("IdentitySettingsMyProfile(");
        sb.append("super=").append(super.toString());
        sb.append("allowEndUsersToChangeTheirPassword=")
                .append(String.valueOf(this.allowEndUsersToChangeTheirPassword));
        sb.append(", allowEndUsersToLinkTheirSupportAccount=")
                .append(String.valueOf(this.allowEndUsersToLinkTheirSupportAccount));
        sb.append(", allowEndUsersToUpdateTheirSecuritySettings=")
                .append(String.valueOf(this.allowEndUsersToUpdateTheirSecuritySettings));
        sb.append(", allowEndUsersToManageTheirCapabilities=")
                .append(String.valueOf(this.allowEndUsersToManageTheirCapabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentitySettingsMyProfile)) {
            return false;
        }

        IdentitySettingsMyProfile other = (IdentitySettingsMyProfile) o;
        return java.util.Objects.equals(
                        this.allowEndUsersToChangeTheirPassword,
                        other.allowEndUsersToChangeTheirPassword)
                && java.util.Objects.equals(
                        this.allowEndUsersToLinkTheirSupportAccount,
                        other.allowEndUsersToLinkTheirSupportAccount)
                && java.util.Objects.equals(
                        this.allowEndUsersToUpdateTheirSecuritySettings,
                        other.allowEndUsersToUpdateTheirSecuritySettings)
                && java.util.Objects.equals(
                        this.allowEndUsersToManageTheirCapabilities,
                        other.allowEndUsersToManageTheirCapabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allowEndUsersToChangeTheirPassword == null
                                ? 43
                                : this.allowEndUsersToChangeTheirPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.allowEndUsersToLinkTheirSupportAccount == null
                                ? 43
                                : this.allowEndUsersToLinkTheirSupportAccount.hashCode());
        result =
                (result * PRIME)
                        + (this.allowEndUsersToUpdateTheirSecuritySettings == null
                                ? 43
                                : this.allowEndUsersToUpdateTheirSecuritySettings.hashCode());
        result =
                (result * PRIME)
                        + (this.allowEndUsersToManageTheirCapabilities == null
                                ? 43
                                : this.allowEndUsersToManageTheirCapabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
