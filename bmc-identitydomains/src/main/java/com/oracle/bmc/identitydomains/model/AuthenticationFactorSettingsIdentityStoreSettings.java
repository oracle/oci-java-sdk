/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Settings related to the use of a user's profile details from the identity store
 *
 * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite -
 * required: false - returned: default - type: complex - uniqueness: none <br>
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
        builder = AuthenticationFactorSettingsIdentityStoreSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuthenticationFactorSettingsIdentityStoreSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mobileNumberEnabled", "mobileNumberUpdateEnabled"})
    public AuthenticationFactorSettingsIdentityStoreSettings(
            Boolean mobileNumberEnabled, Boolean mobileNumberUpdateEnabled) {
        super();
        this.mobileNumberEnabled = mobileNumberEnabled;
        this.mobileNumberUpdateEnabled = mobileNumberUpdateEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, indicates that Multi-Factor Authentication should use the mobile number in the
         * identity store
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mobileNumberEnabled")
        private Boolean mobileNumberEnabled;

        /**
         * If true, indicates that Multi-Factor Authentication should use the mobile number in the
         * identity store
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param mobileNumberEnabled the value to set
         * @return this builder
         */
        public Builder mobileNumberEnabled(Boolean mobileNumberEnabled) {
            this.mobileNumberEnabled = mobileNumberEnabled;
            this.__explicitlySet__.add("mobileNumberEnabled");
            return this;
        }
        /**
         * If true, indicates that the user can update the mobile number in the user's Multi-Factor
         * Authentication profile
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mobileNumberUpdateEnabled")
        private Boolean mobileNumberUpdateEnabled;

        /**
         * If true, indicates that the user can update the mobile number in the user's Multi-Factor
         * Authentication profile
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param mobileNumberUpdateEnabled the value to set
         * @return this builder
         */
        public Builder mobileNumberUpdateEnabled(Boolean mobileNumberUpdateEnabled) {
            this.mobileNumberUpdateEnabled = mobileNumberUpdateEnabled;
            this.__explicitlySet__.add("mobileNumberUpdateEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationFactorSettingsIdentityStoreSettings build() {
            AuthenticationFactorSettingsIdentityStoreSettings model =
                    new AuthenticationFactorSettingsIdentityStoreSettings(
                            this.mobileNumberEnabled, this.mobileNumberUpdateEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationFactorSettingsIdentityStoreSettings model) {
            if (model.wasPropertyExplicitlySet("mobileNumberEnabled")) {
                this.mobileNumberEnabled(model.getMobileNumberEnabled());
            }
            if (model.wasPropertyExplicitlySet("mobileNumberUpdateEnabled")) {
                this.mobileNumberUpdateEnabled(model.getMobileNumberUpdateEnabled());
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
     * If true, indicates that Multi-Factor Authentication should use the mobile number in the
     * identity store
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mobileNumberEnabled")
    private final Boolean mobileNumberEnabled;

    /**
     * If true, indicates that Multi-Factor Authentication should use the mobile number in the
     * identity store
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getMobileNumberEnabled() {
        return mobileNumberEnabled;
    }

    /**
     * If true, indicates that the user can update the mobile number in the user's Multi-Factor
     * Authentication profile
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mobileNumberUpdateEnabled")
    private final Boolean mobileNumberUpdateEnabled;

    /**
     * If true, indicates that the user can update the mobile number in the user's Multi-Factor
     * Authentication profile
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getMobileNumberUpdateEnabled() {
        return mobileNumberUpdateEnabled;
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
        sb.append("AuthenticationFactorSettingsIdentityStoreSettings(");
        sb.append("super=").append(super.toString());
        sb.append("mobileNumberEnabled=").append(String.valueOf(this.mobileNumberEnabled));
        sb.append(", mobileNumberUpdateEnabled=")
                .append(String.valueOf(this.mobileNumberUpdateEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationFactorSettingsIdentityStoreSettings)) {
            return false;
        }

        AuthenticationFactorSettingsIdentityStoreSettings other =
                (AuthenticationFactorSettingsIdentityStoreSettings) o;
        return java.util.Objects.equals(this.mobileNumberEnabled, other.mobileNumberEnabled)
                && java.util.Objects.equals(
                        this.mobileNumberUpdateEnabled, other.mobileNumberUpdateEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mobileNumberEnabled == null
                                ? 43
                                : this.mobileNumberEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.mobileNumberUpdateEnabled == null
                                ? 43
                                : this.mobileNumberUpdateEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
