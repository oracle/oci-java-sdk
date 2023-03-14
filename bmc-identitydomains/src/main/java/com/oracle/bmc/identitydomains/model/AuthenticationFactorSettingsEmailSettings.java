/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Settings related to Email Factor, such as enabled email magic link factor, custom url for Email Link
 * <p>
 **Added In:** 20.1.3
 * <p>
 **SCIM++ Properties:**
 *  - idcsSearchable: false
 *  - multiValued: false
 *  - mutability: readWrite
 *  - required: false
 *  - returned: default
 *  - type: complex
 *  - uniqueness: none
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
    builder = AuthenticationFactorSettingsEmailSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuthenticationFactorSettingsEmailSettings
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"emailLinkEnabled", "emailLinkCustomUrl"})
    public AuthenticationFactorSettingsEmailSettings(
            Boolean emailLinkEnabled, String emailLinkCustomUrl) {
        super();
        this.emailLinkEnabled = emailLinkEnabled;
        this.emailLinkCustomUrl = emailLinkCustomUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies whether Email link is enabled or not.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailLinkEnabled")
        private Boolean emailLinkEnabled;

        /**
         * Specifies whether Email link is enabled or not.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param emailLinkEnabled the value to set
         * @return this builder
         **/
        public Builder emailLinkEnabled(Boolean emailLinkEnabled) {
            this.emailLinkEnabled = emailLinkEnabled;
            this.__explicitlySet__.add("emailLinkEnabled");
            return this;
        }
        /**
         * Custom redirect Url which will be used in email link
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailLinkCustomUrl")
        private String emailLinkCustomUrl;

        /**
         * Custom redirect Url which will be used in email link
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param emailLinkCustomUrl the value to set
         * @return this builder
         **/
        public Builder emailLinkCustomUrl(String emailLinkCustomUrl) {
            this.emailLinkCustomUrl = emailLinkCustomUrl;
            this.__explicitlySet__.add("emailLinkCustomUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationFactorSettingsEmailSettings build() {
            AuthenticationFactorSettingsEmailSettings model =
                    new AuthenticationFactorSettingsEmailSettings(
                            this.emailLinkEnabled, this.emailLinkCustomUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationFactorSettingsEmailSettings model) {
            if (model.wasPropertyExplicitlySet("emailLinkEnabled")) {
                this.emailLinkEnabled(model.getEmailLinkEnabled());
            }
            if (model.wasPropertyExplicitlySet("emailLinkCustomUrl")) {
                this.emailLinkCustomUrl(model.getEmailLinkCustomUrl());
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
     * Specifies whether Email link is enabled or not.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailLinkEnabled")
    private final Boolean emailLinkEnabled;

    /**
     * Specifies whether Email link is enabled or not.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getEmailLinkEnabled() {
        return emailLinkEnabled;
    }

    /**
     * Custom redirect Url which will be used in email link
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailLinkCustomUrl")
    private final String emailLinkCustomUrl;

    /**
     * Custom redirect Url which will be used in email link
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getEmailLinkCustomUrl() {
        return emailLinkCustomUrl;
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
        sb.append("AuthenticationFactorSettingsEmailSettings(");
        sb.append("super=").append(super.toString());
        sb.append("emailLinkEnabled=").append(String.valueOf(this.emailLinkEnabled));
        sb.append(", emailLinkCustomUrl=").append(String.valueOf(this.emailLinkCustomUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationFactorSettingsEmailSettings)) {
            return false;
        }

        AuthenticationFactorSettingsEmailSettings other =
                (AuthenticationFactorSettingsEmailSettings) o;
        return java.util.Objects.equals(this.emailLinkEnabled, other.emailLinkEnabled)
                && java.util.Objects.equals(this.emailLinkCustomUrl, other.emailLinkCustomUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.emailLinkEnabled == null ? 43 : this.emailLinkEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.emailLinkCustomUrl == null
                                ? 43
                                : this.emailLinkCustomUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
