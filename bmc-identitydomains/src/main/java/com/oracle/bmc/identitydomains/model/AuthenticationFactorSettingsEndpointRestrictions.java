/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Settings that describe the set of restrictions that the system should apply to devices and
 * trusted endpoints of a user
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
        builder = AuthenticationFactorSettingsEndpointRestrictions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuthenticationFactorSettingsEndpointRestrictions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maxEnrolledDevices",
        "maxTrustedEndpoints",
        "maxEndpointTrustDurationInDays",
        "trustedEndpointsEnabled",
        "maxIncorrectAttempts"
    })
    public AuthenticationFactorSettingsEndpointRestrictions(
            Integer maxEnrolledDevices,
            Integer maxTrustedEndpoints,
            Integer maxEndpointTrustDurationInDays,
            Boolean trustedEndpointsEnabled,
            Integer maxIncorrectAttempts) {
        super();
        this.maxEnrolledDevices = maxEnrolledDevices;
        this.maxTrustedEndpoints = maxTrustedEndpoints;
        this.maxEndpointTrustDurationInDays = maxEndpointTrustDurationInDays;
        this.trustedEndpointsEnabled = trustedEndpointsEnabled;
        this.maxIncorrectAttempts = maxIncorrectAttempts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Maximum number of enrolled devices per user
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 1 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxEnrolledDevices")
        private Integer maxEnrolledDevices;

        /**
         * Maximum number of enrolled devices per user
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 1 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param maxEnrolledDevices the value to set
         * @return this builder
         */
        public Builder maxEnrolledDevices(Integer maxEnrolledDevices) {
            this.maxEnrolledDevices = maxEnrolledDevices;
            this.__explicitlySet__.add("maxEnrolledDevices");
            return this;
        }
        /**
         * Max number of trusted endpoints per user
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 1 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTrustedEndpoints")
        private Integer maxTrustedEndpoints;

        /**
         * Max number of trusted endpoints per user
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 1 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param maxTrustedEndpoints the value to set
         * @return this builder
         */
        public Builder maxTrustedEndpoints(Integer maxTrustedEndpoints) {
            this.maxTrustedEndpoints = maxTrustedEndpoints;
            this.__explicitlySet__.add("maxTrustedEndpoints");
            return this;
        }
        /**
         * Maximum number of days until an endpoint can be trusted
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 180 - idcsMinValue: 1 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxEndpointTrustDurationInDays")
        private Integer maxEndpointTrustDurationInDays;

        /**
         * Maximum number of days until an endpoint can be trusted
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 180 - idcsMinValue: 1 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param maxEndpointTrustDurationInDays the value to set
         * @return this builder
         */
        public Builder maxEndpointTrustDurationInDays(Integer maxEndpointTrustDurationInDays) {
            this.maxEndpointTrustDurationInDays = maxEndpointTrustDurationInDays;
            this.__explicitlySet__.add("maxEndpointTrustDurationInDays");
            return this;
        }
        /**
         * Specify if trusted endpoints are enabled
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustedEndpointsEnabled")
        private Boolean trustedEndpointsEnabled;

        /**
         * Specify if trusted endpoints are enabled
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param trustedEndpointsEnabled the value to set
         * @return this builder
         */
        public Builder trustedEndpointsEnabled(Boolean trustedEndpointsEnabled) {
            this.trustedEndpointsEnabled = trustedEndpointsEnabled;
            this.__explicitlySet__.add("trustedEndpointsEnabled");
            return this;
        }
        /**
         * An integer that represents the maximum number of failed MFA logins before an account is
         * locked
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 5 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxIncorrectAttempts")
        private Integer maxIncorrectAttempts;

        /**
         * An integer that represents the maximum number of failed MFA logins before an account is
         * locked
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 5 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param maxIncorrectAttempts the value to set
         * @return this builder
         */
        public Builder maxIncorrectAttempts(Integer maxIncorrectAttempts) {
            this.maxIncorrectAttempts = maxIncorrectAttempts;
            this.__explicitlySet__.add("maxIncorrectAttempts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationFactorSettingsEndpointRestrictions build() {
            AuthenticationFactorSettingsEndpointRestrictions model =
                    new AuthenticationFactorSettingsEndpointRestrictions(
                            this.maxEnrolledDevices,
                            this.maxTrustedEndpoints,
                            this.maxEndpointTrustDurationInDays,
                            this.trustedEndpointsEnabled,
                            this.maxIncorrectAttempts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationFactorSettingsEndpointRestrictions model) {
            if (model.wasPropertyExplicitlySet("maxEnrolledDevices")) {
                this.maxEnrolledDevices(model.getMaxEnrolledDevices());
            }
            if (model.wasPropertyExplicitlySet("maxTrustedEndpoints")) {
                this.maxTrustedEndpoints(model.getMaxTrustedEndpoints());
            }
            if (model.wasPropertyExplicitlySet("maxEndpointTrustDurationInDays")) {
                this.maxEndpointTrustDurationInDays(model.getMaxEndpointTrustDurationInDays());
            }
            if (model.wasPropertyExplicitlySet("trustedEndpointsEnabled")) {
                this.trustedEndpointsEnabled(model.getTrustedEndpointsEnabled());
            }
            if (model.wasPropertyExplicitlySet("maxIncorrectAttempts")) {
                this.maxIncorrectAttempts(model.getMaxIncorrectAttempts());
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
     * Maximum number of enrolled devices per user
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 1 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxEnrolledDevices")
    private final Integer maxEnrolledDevices;

    /**
     * Maximum number of enrolled devices per user
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 1 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxEnrolledDevices() {
        return maxEnrolledDevices;
    }

    /**
     * Max number of trusted endpoints per user
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 1 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTrustedEndpoints")
    private final Integer maxTrustedEndpoints;

    /**
     * Max number of trusted endpoints per user
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 1 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxTrustedEndpoints() {
        return maxTrustedEndpoints;
    }

    /**
     * Maximum number of days until an endpoint can be trusted
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 180 - idcsMinValue: 1 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxEndpointTrustDurationInDays")
    private final Integer maxEndpointTrustDurationInDays;

    /**
     * Maximum number of days until an endpoint can be trusted
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 180 - idcsMinValue: 1 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxEndpointTrustDurationInDays() {
        return maxEndpointTrustDurationInDays;
    }

    /**
     * Specify if trusted endpoints are enabled
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustedEndpointsEnabled")
    private final Boolean trustedEndpointsEnabled;

    /**
     * Specify if trusted endpoints are enabled
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getTrustedEndpointsEnabled() {
        return trustedEndpointsEnabled;
    }

    /**
     * An integer that represents the maximum number of failed MFA logins before an account is
     * locked
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 5 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxIncorrectAttempts")
    private final Integer maxIncorrectAttempts;

    /**
     * An integer that represents the maximum number of failed MFA logins before an account is
     * locked
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 20 - idcsMinValue: 5 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxIncorrectAttempts() {
        return maxIncorrectAttempts;
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
        sb.append("AuthenticationFactorSettingsEndpointRestrictions(");
        sb.append("super=").append(super.toString());
        sb.append("maxEnrolledDevices=").append(String.valueOf(this.maxEnrolledDevices));
        sb.append(", maxTrustedEndpoints=").append(String.valueOf(this.maxTrustedEndpoints));
        sb.append(", maxEndpointTrustDurationInDays=")
                .append(String.valueOf(this.maxEndpointTrustDurationInDays));
        sb.append(", trustedEndpointsEnabled=")
                .append(String.valueOf(this.trustedEndpointsEnabled));
        sb.append(", maxIncorrectAttempts=").append(String.valueOf(this.maxIncorrectAttempts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationFactorSettingsEndpointRestrictions)) {
            return false;
        }

        AuthenticationFactorSettingsEndpointRestrictions other =
                (AuthenticationFactorSettingsEndpointRestrictions) o;
        return java.util.Objects.equals(this.maxEnrolledDevices, other.maxEnrolledDevices)
                && java.util.Objects.equals(this.maxTrustedEndpoints, other.maxTrustedEndpoints)
                && java.util.Objects.equals(
                        this.maxEndpointTrustDurationInDays, other.maxEndpointTrustDurationInDays)
                && java.util.Objects.equals(
                        this.trustedEndpointsEnabled, other.trustedEndpointsEnabled)
                && java.util.Objects.equals(this.maxIncorrectAttempts, other.maxIncorrectAttempts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maxEnrolledDevices == null
                                ? 43
                                : this.maxEnrolledDevices.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTrustedEndpoints == null
                                ? 43
                                : this.maxTrustedEndpoints.hashCode());
        result =
                (result * PRIME)
                        + (this.maxEndpointTrustDurationInDays == null
                                ? 43
                                : this.maxEndpointTrustDurationInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.trustedEndpointsEnabled == null
                                ? 43
                                : this.trustedEndpointsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.maxIncorrectAttempts == null
                                ? 43
                                : this.maxIncorrectAttempts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
