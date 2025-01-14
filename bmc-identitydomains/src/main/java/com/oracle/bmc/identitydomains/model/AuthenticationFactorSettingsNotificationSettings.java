/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Settings related to the Mobile App Notification channel, such as pull
 *
 * <p>*Added In:** 17.4.2
 *
 * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite -
 * required: true - returned: default - type: complex - uniqueness: none <br>
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
        builder = AuthenticationFactorSettingsNotificationSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuthenticationFactorSettingsNotificationSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pullEnabled"})
    public AuthenticationFactorSettingsNotificationSettings(Boolean pullEnabled) {
        super();
        this.pullEnabled = pullEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, indicates that the Mobile App Pull Notification channel is enabled for
         * authentication
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pullEnabled")
        private Boolean pullEnabled;

        /**
         * If true, indicates that the Mobile App Pull Notification channel is enabled for
         * authentication
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param pullEnabled the value to set
         * @return this builder
         */
        public Builder pullEnabled(Boolean pullEnabled) {
            this.pullEnabled = pullEnabled;
            this.__explicitlySet__.add("pullEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationFactorSettingsNotificationSettings build() {
            AuthenticationFactorSettingsNotificationSettings model =
                    new AuthenticationFactorSettingsNotificationSettings(this.pullEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationFactorSettingsNotificationSettings model) {
            if (model.wasPropertyExplicitlySet("pullEnabled")) {
                this.pullEnabled(model.getPullEnabled());
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
     * If true, indicates that the Mobile App Pull Notification channel is enabled for
     * authentication
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pullEnabled")
    private final Boolean pullEnabled;

    /**
     * If true, indicates that the Mobile App Pull Notification channel is enabled for
     * authentication
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getPullEnabled() {
        return pullEnabled;
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
        sb.append("AuthenticationFactorSettingsNotificationSettings(");
        sb.append("super=").append(super.toString());
        sb.append("pullEnabled=").append(String.valueOf(this.pullEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationFactorSettingsNotificationSettings)) {
            return false;
        }

        AuthenticationFactorSettingsNotificationSettings other =
                (AuthenticationFactorSettingsNotificationSettings) o;
        return java.util.Objects.equals(this.pullEnabled, other.pullEnabled) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pullEnabled == null ? 43 : this.pullEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
