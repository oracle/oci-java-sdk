/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Settings related to compliance, Personal Identification Number (PIN) policy, and so on
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
        builder = AuthenticationFactorSettingsClientAppSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuthenticationFactorSettingsClientAppSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "minPinLength",
        "maxFailuresBeforeWarning",
        "maxFailuresBeforeLockout",
        "initialLockoutPeriodInSecs",
        "lockoutEscalationPattern",
        "maxLockoutIntervalInSecs",
        "requestSigningAlgo",
        "policyUpdateFreqInDays",
        "keyPairLength",
        "deviceProtectionPolicy",
        "unlockAppForEachRequestEnabled",
        "unlockOnAppStartEnabled",
        "unlockAppIntervalInSecs",
        "sharedSecretEncoding",
        "unlockOnAppForegroundEnabled"
    })
    public AuthenticationFactorSettingsClientAppSettings(
            Integer minPinLength,
            Integer maxFailuresBeforeWarning,
            Integer maxFailuresBeforeLockout,
            Integer initialLockoutPeriodInSecs,
            String lockoutEscalationPattern,
            Integer maxLockoutIntervalInSecs,
            RequestSigningAlgo requestSigningAlgo,
            Integer policyUpdateFreqInDays,
            Integer keyPairLength,
            String deviceProtectionPolicy,
            Boolean unlockAppForEachRequestEnabled,
            Boolean unlockOnAppStartEnabled,
            Integer unlockAppIntervalInSecs,
            SharedSecretEncoding sharedSecretEncoding,
            Boolean unlockOnAppForegroundEnabled) {
        super();
        this.minPinLength = minPinLength;
        this.maxFailuresBeforeWarning = maxFailuresBeforeWarning;
        this.maxFailuresBeforeLockout = maxFailuresBeforeLockout;
        this.initialLockoutPeriodInSecs = initialLockoutPeriodInSecs;
        this.lockoutEscalationPattern = lockoutEscalationPattern;
        this.maxLockoutIntervalInSecs = maxLockoutIntervalInSecs;
        this.requestSigningAlgo = requestSigningAlgo;
        this.policyUpdateFreqInDays = policyUpdateFreqInDays;
        this.keyPairLength = keyPairLength;
        this.deviceProtectionPolicy = deviceProtectionPolicy;
        this.unlockAppForEachRequestEnabled = unlockAppForEachRequestEnabled;
        this.unlockOnAppStartEnabled = unlockOnAppStartEnabled;
        this.unlockAppIntervalInSecs = unlockAppIntervalInSecs;
        this.sharedSecretEncoding = sharedSecretEncoding;
        this.unlockOnAppForegroundEnabled = unlockOnAppForegroundEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Minimum length of the Personal Identification Number (PIN)
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 6 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minPinLength")
        private Integer minPinLength;

        /**
         * Minimum length of the Personal Identification Number (PIN)
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 6 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param minPinLength the value to set
         * @return this builder
         */
        public Builder minPinLength(Integer minPinLength) {
            this.minPinLength = minPinLength;
            this.__explicitlySet__.add("minPinLength");
            return this;
        }
        /**
         * The maximum number of login failures that the system will allow before raising a warning
         * and sending an alert via email
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 0 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxFailuresBeforeWarning")
        private Integer maxFailuresBeforeWarning;

        /**
         * The maximum number of login failures that the system will allow before raising a warning
         * and sending an alert via email
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 0 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param maxFailuresBeforeWarning the value to set
         * @return this builder
         */
        public Builder maxFailuresBeforeWarning(Integer maxFailuresBeforeWarning) {
            this.maxFailuresBeforeWarning = maxFailuresBeforeWarning;
            this.__explicitlySet__.add("maxFailuresBeforeWarning");
            return this;
        }
        /**
         * The maximum number of times that a particular user can fail to login before the system
         * locks that user out of the service
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 5 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxFailuresBeforeLockout")
        private Integer maxFailuresBeforeLockout;

        /**
         * The maximum number of times that a particular user can fail to login before the system
         * locks that user out of the service
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 5 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param maxFailuresBeforeLockout the value to set
         * @return this builder
         */
        public Builder maxFailuresBeforeLockout(Integer maxFailuresBeforeLockout) {
            this.maxFailuresBeforeLockout = maxFailuresBeforeLockout;
            this.__explicitlySet__.add("maxFailuresBeforeLockout");
            return this;
        }
        /**
         * The period of time in seconds that the system will lock a user out of the service after
         * that user exceeds the maximum number of login failures
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 86400 - idcsMinValue: 30 - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("initialLockoutPeriodInSecs")
        private Integer initialLockoutPeriodInSecs;

        /**
         * The period of time in seconds that the system will lock a user out of the service after
         * that user exceeds the maximum number of login failures
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 86400 - idcsMinValue: 30 - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param initialLockoutPeriodInSecs the value to set
         * @return this builder
         */
        public Builder initialLockoutPeriodInSecs(Integer initialLockoutPeriodInSecs) {
            this.initialLockoutPeriodInSecs = initialLockoutPeriodInSecs;
            this.__explicitlySet__.add("initialLockoutPeriodInSecs");
            return this;
        }
        /**
         * The pattern of escalation that the system follows, in locking a particular user out of
         * the service.
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
         * "lockoutEscalationPattern" and attrValues.value eq "$(lockoutEscalationPattern)" -
         * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
         * false - mutability: readWrite - required: true - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lockoutEscalationPattern")
        private String lockoutEscalationPattern;

        /**
         * The pattern of escalation that the system follows, in locking a particular user out of
         * the service.
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
         * "lockoutEscalationPattern" and attrValues.value eq "$(lockoutEscalationPattern)" -
         * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
         * false - mutability: readWrite - required: true - returned: default - type: string -
         * uniqueness: none
         *
         * @param lockoutEscalationPattern the value to set
         * @return this builder
         */
        public Builder lockoutEscalationPattern(String lockoutEscalationPattern) {
            this.lockoutEscalationPattern = lockoutEscalationPattern;
            this.__explicitlySet__.add("lockoutEscalationPattern");
            return this;
        }
        /**
         * The maximum period of time that the system will lock a particular user out of the service
         * regardless of what the configured pattern of escalation would otherwise dictate
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 86400 - idcsMinValue: 30 - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxLockoutIntervalInSecs")
        private Integer maxLockoutIntervalInSecs;

        /**
         * The maximum period of time that the system will lock a particular user out of the service
         * regardless of what the configured pattern of escalation would otherwise dictate
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 86400 - idcsMinValue: 30 - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param maxLockoutIntervalInSecs the value to set
         * @return this builder
         */
        public Builder maxLockoutIntervalInSecs(Integer maxLockoutIntervalInSecs) {
            this.maxLockoutIntervalInSecs = maxLockoutIntervalInSecs;
            this.__explicitlySet__.add("maxLockoutIntervalInSecs");
            return this;
        }
        /**
         * Indicates which algorithm the system will use to sign requests
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestSigningAlgo")
        private RequestSigningAlgo requestSigningAlgo;

        /**
         * Indicates which algorithm the system will use to sign requests
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param requestSigningAlgo the value to set
         * @return this builder
         */
        public Builder requestSigningAlgo(RequestSigningAlgo requestSigningAlgo) {
            this.requestSigningAlgo = requestSigningAlgo;
            this.__explicitlySet__.add("requestSigningAlgo");
            return this;
        }
        /**
         * The period of time in days after which a client should refresh its policy by re-reading
         * that policy from the server
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 999 - idcsMinValue: 1 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("policyUpdateFreqInDays")
        private Integer policyUpdateFreqInDays;

        /**
         * The period of time in days after which a client should refresh its policy by re-reading
         * that policy from the server
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 999 - idcsMinValue: 1 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param policyUpdateFreqInDays the value to set
         * @return this builder
         */
        public Builder policyUpdateFreqInDays(Integer policyUpdateFreqInDays) {
            this.policyUpdateFreqInDays = policyUpdateFreqInDays;
            this.__explicitlySet__.add("policyUpdateFreqInDays");
            return this;
        }
        /**
         * The size of the key that the system uses to generate the public-private key pair
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 4000 - idcsMinValue: 32 - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyPairLength")
        private Integer keyPairLength;

        /**
         * The size of the key that the system uses to generate the public-private key pair
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 4000 - idcsMinValue: 32 - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param keyPairLength the value to set
         * @return this builder
         */
        public Builder keyPairLength(Integer keyPairLength) {
            this.keyPairLength = keyPairLength;
            this.__explicitlySet__.add("keyPairLength");
            return this;
        }
        /**
         * Indicates what protection policy that the system applies on a device. By default, the
         * value is NONE, which indicates that the system applies no protection policy. A value of
         * APP_PIN indicates that the system requires a Personal Identification Number (PIN). A
         * value of DEVICE_BIOMETRIC_OR_APP_PIN indicates that either a PIN or a biometric
         * authentication factor is required.
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
         * "deviceProtectionPolicy" and attrValues.value eq "$(deviceProtectionPolicy)" -
         * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
         * false - mutability: readWrite - required: true - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deviceProtectionPolicy")
        private String deviceProtectionPolicy;

        /**
         * Indicates what protection policy that the system applies on a device. By default, the
         * value is NONE, which indicates that the system applies no protection policy. A value of
         * APP_PIN indicates that the system requires a Personal Identification Number (PIN). A
         * value of DEVICE_BIOMETRIC_OR_APP_PIN indicates that either a PIN or a biometric
         * authentication factor is required.
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
         * "deviceProtectionPolicy" and attrValues.value eq "$(deviceProtectionPolicy)" -
         * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
         * false - mutability: readWrite - required: true - returned: default - type: string -
         * uniqueness: none
         *
         * @param deviceProtectionPolicy the value to set
         * @return this builder
         */
        public Builder deviceProtectionPolicy(String deviceProtectionPolicy) {
            this.deviceProtectionPolicy = deviceProtectionPolicy;
            this.__explicitlySet__.add("deviceProtectionPolicy");
            return this;
        }
        /**
         * If true, indicates that the system should require the user to unlock the client app for
         * each request. In order to unlock the App, the user must supply a Personal Identification
         * Number (PIN) or a biometric authentication-factor.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unlockAppForEachRequestEnabled")
        private Boolean unlockAppForEachRequestEnabled;

        /**
         * If true, indicates that the system should require the user to unlock the client app for
         * each request. In order to unlock the App, the user must supply a Personal Identification
         * Number (PIN) or a biometric authentication-factor.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param unlockAppForEachRequestEnabled the value to set
         * @return this builder
         */
        public Builder unlockAppForEachRequestEnabled(Boolean unlockAppForEachRequestEnabled) {
            this.unlockAppForEachRequestEnabled = unlockAppForEachRequestEnabled;
            this.__explicitlySet__.add("unlockAppForEachRequestEnabled");
            return this;
        }
        /**
         * If true, indicates that the system should require the user to unlock the client App
         * whenever the App is started. In order to unlock the App, the user must supply a Personal
         * Identification Number (PIN) or a biometric authentication-factor.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unlockOnAppStartEnabled")
        private Boolean unlockOnAppStartEnabled;

        /**
         * If true, indicates that the system should require the user to unlock the client App
         * whenever the App is started. In order to unlock the App, the user must supply a Personal
         * Identification Number (PIN) or a biometric authentication-factor.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param unlockOnAppStartEnabled the value to set
         * @return this builder
         */
        public Builder unlockOnAppStartEnabled(Boolean unlockOnAppStartEnabled) {
            this.unlockOnAppStartEnabled = unlockOnAppStartEnabled;
            this.__explicitlySet__.add("unlockOnAppStartEnabled");
            return this;
        }
        /**
         * Specifies the period of time in seconds after which the client App should require the
         * user to unlock the App. In order to unlock the App, the user must supply a Personal
         * Identification Number (PIN) or a biometric authentication-factor. A value of zero means
         * that it is disabled.
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 9999999 - idcsMinValue: 0 - idcsSearchable:
         * false - multiValued: false - mutability: readWrite - required: true - returned: default -
         * type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unlockAppIntervalInSecs")
        private Integer unlockAppIntervalInSecs;

        /**
         * Specifies the period of time in seconds after which the client App should require the
         * user to unlock the App. In order to unlock the App, the user must supply a Personal
         * Identification Number (PIN) or a biometric authentication-factor. A value of zero means
         * that it is disabled.
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 9999999 - idcsMinValue: 0 - idcsSearchable:
         * false - multiValued: false - mutability: readWrite - required: true - returned: default -
         * type: integer - uniqueness: none
         *
         * @param unlockAppIntervalInSecs the value to set
         * @return this builder
         */
        public Builder unlockAppIntervalInSecs(Integer unlockAppIntervalInSecs) {
            this.unlockAppIntervalInSecs = unlockAppIntervalInSecs;
            this.__explicitlySet__.add("unlockAppIntervalInSecs");
            return this;
        }
        /**
         * Indicates the type of encoding that the system should use to generate a shared secret
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sharedSecretEncoding")
        private SharedSecretEncoding sharedSecretEncoding;

        /**
         * Indicates the type of encoding that the system should use to generate a shared secret
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param sharedSecretEncoding the value to set
         * @return this builder
         */
        public Builder sharedSecretEncoding(SharedSecretEncoding sharedSecretEncoding) {
            this.sharedSecretEncoding = sharedSecretEncoding;
            this.__explicitlySet__.add("sharedSecretEncoding");
            return this;
        }
        /**
         * If true, indicates that the system should require the user to unlock the client App, when
         * the client App comes to the foreground in the display of the device. In order to unlock
         * the App, the user must supply a Personal Identification Number (PIN) or a biometric
         * authentication-factor.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("unlockOnAppForegroundEnabled")
        private Boolean unlockOnAppForegroundEnabled;

        /**
         * If true, indicates that the system should require the user to unlock the client App, when
         * the client App comes to the foreground in the display of the device. In order to unlock
         * the App, the user must supply a Personal Identification Number (PIN) or a biometric
         * authentication-factor.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: boolean - uniqueness: none
         *
         * @param unlockOnAppForegroundEnabled the value to set
         * @return this builder
         */
        public Builder unlockOnAppForegroundEnabled(Boolean unlockOnAppForegroundEnabled) {
            this.unlockOnAppForegroundEnabled = unlockOnAppForegroundEnabled;
            this.__explicitlySet__.add("unlockOnAppForegroundEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationFactorSettingsClientAppSettings build() {
            AuthenticationFactorSettingsClientAppSettings model =
                    new AuthenticationFactorSettingsClientAppSettings(
                            this.minPinLength,
                            this.maxFailuresBeforeWarning,
                            this.maxFailuresBeforeLockout,
                            this.initialLockoutPeriodInSecs,
                            this.lockoutEscalationPattern,
                            this.maxLockoutIntervalInSecs,
                            this.requestSigningAlgo,
                            this.policyUpdateFreqInDays,
                            this.keyPairLength,
                            this.deviceProtectionPolicy,
                            this.unlockAppForEachRequestEnabled,
                            this.unlockOnAppStartEnabled,
                            this.unlockAppIntervalInSecs,
                            this.sharedSecretEncoding,
                            this.unlockOnAppForegroundEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationFactorSettingsClientAppSettings model) {
            if (model.wasPropertyExplicitlySet("minPinLength")) {
                this.minPinLength(model.getMinPinLength());
            }
            if (model.wasPropertyExplicitlySet("maxFailuresBeforeWarning")) {
                this.maxFailuresBeforeWarning(model.getMaxFailuresBeforeWarning());
            }
            if (model.wasPropertyExplicitlySet("maxFailuresBeforeLockout")) {
                this.maxFailuresBeforeLockout(model.getMaxFailuresBeforeLockout());
            }
            if (model.wasPropertyExplicitlySet("initialLockoutPeriodInSecs")) {
                this.initialLockoutPeriodInSecs(model.getInitialLockoutPeriodInSecs());
            }
            if (model.wasPropertyExplicitlySet("lockoutEscalationPattern")) {
                this.lockoutEscalationPattern(model.getLockoutEscalationPattern());
            }
            if (model.wasPropertyExplicitlySet("maxLockoutIntervalInSecs")) {
                this.maxLockoutIntervalInSecs(model.getMaxLockoutIntervalInSecs());
            }
            if (model.wasPropertyExplicitlySet("requestSigningAlgo")) {
                this.requestSigningAlgo(model.getRequestSigningAlgo());
            }
            if (model.wasPropertyExplicitlySet("policyUpdateFreqInDays")) {
                this.policyUpdateFreqInDays(model.getPolicyUpdateFreqInDays());
            }
            if (model.wasPropertyExplicitlySet("keyPairLength")) {
                this.keyPairLength(model.getKeyPairLength());
            }
            if (model.wasPropertyExplicitlySet("deviceProtectionPolicy")) {
                this.deviceProtectionPolicy(model.getDeviceProtectionPolicy());
            }
            if (model.wasPropertyExplicitlySet("unlockAppForEachRequestEnabled")) {
                this.unlockAppForEachRequestEnabled(model.getUnlockAppForEachRequestEnabled());
            }
            if (model.wasPropertyExplicitlySet("unlockOnAppStartEnabled")) {
                this.unlockOnAppStartEnabled(model.getUnlockOnAppStartEnabled());
            }
            if (model.wasPropertyExplicitlySet("unlockAppIntervalInSecs")) {
                this.unlockAppIntervalInSecs(model.getUnlockAppIntervalInSecs());
            }
            if (model.wasPropertyExplicitlySet("sharedSecretEncoding")) {
                this.sharedSecretEncoding(model.getSharedSecretEncoding());
            }
            if (model.wasPropertyExplicitlySet("unlockOnAppForegroundEnabled")) {
                this.unlockOnAppForegroundEnabled(model.getUnlockOnAppForegroundEnabled());
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
     * Minimum length of the Personal Identification Number (PIN)
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 6 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minPinLength")
    private final Integer minPinLength;

    /**
     * Minimum length of the Personal Identification Number (PIN)
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 6 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMinPinLength() {
        return minPinLength;
    }

    /**
     * The maximum number of login failures that the system will allow before raising a warning and
     * sending an alert via email
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 0 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxFailuresBeforeWarning")
    private final Integer maxFailuresBeforeWarning;

    /**
     * The maximum number of login failures that the system will allow before raising a warning and
     * sending an alert via email
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 0 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxFailuresBeforeWarning() {
        return maxFailuresBeforeWarning;
    }

    /**
     * The maximum number of times that a particular user can fail to login before the system locks
     * that user out of the service
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 5 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxFailuresBeforeLockout")
    private final Integer maxFailuresBeforeLockout;

    /**
     * The maximum number of times that a particular user can fail to login before the system locks
     * that user out of the service
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 5 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxFailuresBeforeLockout() {
        return maxFailuresBeforeLockout;
    }

    /**
     * The period of time in seconds that the system will lock a user out of the service after that
     * user exceeds the maximum number of login failures
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 86400 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialLockoutPeriodInSecs")
    private final Integer initialLockoutPeriodInSecs;

    /**
     * The period of time in seconds that the system will lock a user out of the service after that
     * user exceeds the maximum number of login failures
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 86400 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getInitialLockoutPeriodInSecs() {
        return initialLockoutPeriodInSecs;
    }

    /**
     * The pattern of escalation that the system follows, in locking a particular user out of the
     * service.
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
     * "lockoutEscalationPattern" and attrValues.value eq "$(lockoutEscalationPattern)" -
     * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
     * false - mutability: readWrite - required: true - returned: default - type: string -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lockoutEscalationPattern")
    private final String lockoutEscalationPattern;

    /**
     * The pattern of escalation that the system follows, in locking a particular user out of the
     * service.
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
     * "lockoutEscalationPattern" and attrValues.value eq "$(lockoutEscalationPattern)" -
     * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
     * false - mutability: readWrite - required: true - returned: default - type: string -
     * uniqueness: none
     *
     * @return the value
     */
    public String getLockoutEscalationPattern() {
        return lockoutEscalationPattern;
    }

    /**
     * The maximum period of time that the system will lock a particular user out of the service
     * regardless of what the configured pattern of escalation would otherwise dictate
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 86400 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxLockoutIntervalInSecs")
    private final Integer maxLockoutIntervalInSecs;

    /**
     * The maximum period of time that the system will lock a particular user out of the service
     * regardless of what the configured pattern of escalation would otherwise dictate
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 86400 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getMaxLockoutIntervalInSecs() {
        return maxLockoutIntervalInSecs;
    }

    /**
     * Indicates which algorithm the system will use to sign requests
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    public enum RequestSigningAlgo implements com.oracle.bmc.http.internal.BmcEnum {
        Sha256withRsa("SHA256withRSA"),
        Sha384withRsa("SHA384withRSA"),
        Sha512withRsa("SHA512withRSA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RequestSigningAlgo.class);

        private final String value;
        private static java.util.Map<String, RequestSigningAlgo> map;

        static {
            map = new java.util.HashMap<>();
            for (RequestSigningAlgo v : RequestSigningAlgo.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RequestSigningAlgo(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequestSigningAlgo create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RequestSigningAlgo', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates which algorithm the system will use to sign requests
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestSigningAlgo")
    private final RequestSigningAlgo requestSigningAlgo;

    /**
     * Indicates which algorithm the system will use to sign requests
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public RequestSigningAlgo getRequestSigningAlgo() {
        return requestSigningAlgo;
    }

    /**
     * The period of time in days after which a client should refresh its policy by re-reading that
     * policy from the server
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 999 - idcsMinValue: 1 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policyUpdateFreqInDays")
    private final Integer policyUpdateFreqInDays;

    /**
     * The period of time in days after which a client should refresh its policy by re-reading that
     * policy from the server
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 999 - idcsMinValue: 1 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getPolicyUpdateFreqInDays() {
        return policyUpdateFreqInDays;
    }

    /**
     * The size of the key that the system uses to generate the public-private key pair
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 4000 - idcsMinValue: 32 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyPairLength")
    private final Integer keyPairLength;

    /**
     * The size of the key that the system uses to generate the public-private key pair
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 4000 - idcsMinValue: 32 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getKeyPairLength() {
        return keyPairLength;
    }

    /**
     * Indicates what protection policy that the system applies on a device. By default, the value
     * is NONE, which indicates that the system applies no protection policy. A value of APP_PIN
     * indicates that the system requires a Personal Identification Number (PIN). A value of
     * DEVICE_BIOMETRIC_OR_APP_PIN indicates that either a PIN or a biometric authentication factor
     * is required.
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
     * "deviceProtectionPolicy" and attrValues.value eq "$(deviceProtectionPolicy)" -
     * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
     * false - mutability: readWrite - required: true - returned: default - type: string -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deviceProtectionPolicy")
    private final String deviceProtectionPolicy;

    /**
     * Indicates what protection policy that the system applies on a device. By default, the value
     * is NONE, which indicates that the system applies no protection policy. A value of APP_PIN
     * indicates that the system requires a Personal Identification Number (PIN). A value of
     * DEVICE_BIOMETRIC_OR_APP_PIN indicates that either a PIN or a biometric authentication factor
     * is required.
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq
     * "deviceProtectionPolicy" and attrValues.value eq "$(deviceProtectionPolicy)" -
     * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: false - multiValued:
     * false - mutability: readWrite - required: true - returned: default - type: string -
     * uniqueness: none
     *
     * @return the value
     */
    public String getDeviceProtectionPolicy() {
        return deviceProtectionPolicy;
    }

    /**
     * If true, indicates that the system should require the user to unlock the client app for each
     * request. In order to unlock the App, the user must supply a Personal Identification Number
     * (PIN) or a biometric authentication-factor.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unlockAppForEachRequestEnabled")
    private final Boolean unlockAppForEachRequestEnabled;

    /**
     * If true, indicates that the system should require the user to unlock the client app for each
     * request. In order to unlock the App, the user must supply a Personal Identification Number
     * (PIN) or a biometric authentication-factor.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getUnlockAppForEachRequestEnabled() {
        return unlockAppForEachRequestEnabled;
    }

    /**
     * If true, indicates that the system should require the user to unlock the client App whenever
     * the App is started. In order to unlock the App, the user must supply a Personal
     * Identification Number (PIN) or a biometric authentication-factor.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unlockOnAppStartEnabled")
    private final Boolean unlockOnAppStartEnabled;

    /**
     * If true, indicates that the system should require the user to unlock the client App whenever
     * the App is started. In order to unlock the App, the user must supply a Personal
     * Identification Number (PIN) or a biometric authentication-factor.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getUnlockOnAppStartEnabled() {
        return unlockOnAppStartEnabled;
    }

    /**
     * Specifies the period of time in seconds after which the client App should require the user to
     * unlock the App. In order to unlock the App, the user must supply a Personal Identification
     * Number (PIN) or a biometric authentication-factor. A value of zero means that it is disabled.
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 9999999 - idcsMinValue: 0 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unlockAppIntervalInSecs")
    private final Integer unlockAppIntervalInSecs;

    /**
     * Specifies the period of time in seconds after which the client App should require the user to
     * unlock the App. In order to unlock the App, the user must supply a Personal Identification
     * Number (PIN) or a biometric authentication-factor. A value of zero means that it is disabled.
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 9999999 - idcsMinValue: 0 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getUnlockAppIntervalInSecs() {
        return unlockAppIntervalInSecs;
    }

    /**
     * Indicates the type of encoding that the system should use to generate a shared secret
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    public enum SharedSecretEncoding implements com.oracle.bmc.http.internal.BmcEnum {
        Base32("Base32"),
        Base64("Base64"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SharedSecretEncoding.class);

        private final String value;
        private static java.util.Map<String, SharedSecretEncoding> map;

        static {
            map = new java.util.HashMap<>();
            for (SharedSecretEncoding v : SharedSecretEncoding.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SharedSecretEncoding(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SharedSecretEncoding create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SharedSecretEncoding', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates the type of encoding that the system should use to generate a shared secret
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sharedSecretEncoding")
    private final SharedSecretEncoding sharedSecretEncoding;

    /**
     * Indicates the type of encoding that the system should use to generate a shared secret
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public SharedSecretEncoding getSharedSecretEncoding() {
        return sharedSecretEncoding;
    }

    /**
     * If true, indicates that the system should require the user to unlock the client App, when the
     * client App comes to the foreground in the display of the device. In order to unlock the App,
     * the user must supply a Personal Identification Number (PIN) or a biometric
     * authentication-factor.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("unlockOnAppForegroundEnabled")
    private final Boolean unlockOnAppForegroundEnabled;

    /**
     * If true, indicates that the system should require the user to unlock the client App, when the
     * client App comes to the foreground in the display of the device. In order to unlock the App,
     * the user must supply a Personal Identification Number (PIN) or a biometric
     * authentication-factor.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getUnlockOnAppForegroundEnabled() {
        return unlockOnAppForegroundEnabled;
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
        sb.append("AuthenticationFactorSettingsClientAppSettings(");
        sb.append("super=").append(super.toString());
        sb.append("minPinLength=").append(String.valueOf(this.minPinLength));
        sb.append(", maxFailuresBeforeWarning=")
                .append(String.valueOf(this.maxFailuresBeforeWarning));
        sb.append(", maxFailuresBeforeLockout=")
                .append(String.valueOf(this.maxFailuresBeforeLockout));
        sb.append(", initialLockoutPeriodInSecs=")
                .append(String.valueOf(this.initialLockoutPeriodInSecs));
        sb.append(", lockoutEscalationPattern=")
                .append(String.valueOf(this.lockoutEscalationPattern));
        sb.append(", maxLockoutIntervalInSecs=")
                .append(String.valueOf(this.maxLockoutIntervalInSecs));
        sb.append(", requestSigningAlgo=").append(String.valueOf(this.requestSigningAlgo));
        sb.append(", policyUpdateFreqInDays=").append(String.valueOf(this.policyUpdateFreqInDays));
        sb.append(", keyPairLength=").append(String.valueOf(this.keyPairLength));
        sb.append(", deviceProtectionPolicy=").append(String.valueOf(this.deviceProtectionPolicy));
        sb.append(", unlockAppForEachRequestEnabled=")
                .append(String.valueOf(this.unlockAppForEachRequestEnabled));
        sb.append(", unlockOnAppStartEnabled=")
                .append(String.valueOf(this.unlockOnAppStartEnabled));
        sb.append(", unlockAppIntervalInSecs=")
                .append(String.valueOf(this.unlockAppIntervalInSecs));
        sb.append(", sharedSecretEncoding=").append(String.valueOf(this.sharedSecretEncoding));
        sb.append(", unlockOnAppForegroundEnabled=")
                .append(String.valueOf(this.unlockOnAppForegroundEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationFactorSettingsClientAppSettings)) {
            return false;
        }

        AuthenticationFactorSettingsClientAppSettings other =
                (AuthenticationFactorSettingsClientAppSettings) o;
        return java.util.Objects.equals(this.minPinLength, other.minPinLength)
                && java.util.Objects.equals(
                        this.maxFailuresBeforeWarning, other.maxFailuresBeforeWarning)
                && java.util.Objects.equals(
                        this.maxFailuresBeforeLockout, other.maxFailuresBeforeLockout)
                && java.util.Objects.equals(
                        this.initialLockoutPeriodInSecs, other.initialLockoutPeriodInSecs)
                && java.util.Objects.equals(
                        this.lockoutEscalationPattern, other.lockoutEscalationPattern)
                && java.util.Objects.equals(
                        this.maxLockoutIntervalInSecs, other.maxLockoutIntervalInSecs)
                && java.util.Objects.equals(this.requestSigningAlgo, other.requestSigningAlgo)
                && java.util.Objects.equals(
                        this.policyUpdateFreqInDays, other.policyUpdateFreqInDays)
                && java.util.Objects.equals(this.keyPairLength, other.keyPairLength)
                && java.util.Objects.equals(
                        this.deviceProtectionPolicy, other.deviceProtectionPolicy)
                && java.util.Objects.equals(
                        this.unlockAppForEachRequestEnabled, other.unlockAppForEachRequestEnabled)
                && java.util.Objects.equals(
                        this.unlockOnAppStartEnabled, other.unlockOnAppStartEnabled)
                && java.util.Objects.equals(
                        this.unlockAppIntervalInSecs, other.unlockAppIntervalInSecs)
                && java.util.Objects.equals(this.sharedSecretEncoding, other.sharedSecretEncoding)
                && java.util.Objects.equals(
                        this.unlockOnAppForegroundEnabled, other.unlockOnAppForegroundEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minPinLength == null ? 43 : this.minPinLength.hashCode());
        result =
                (result * PRIME)
                        + (this.maxFailuresBeforeWarning == null
                                ? 43
                                : this.maxFailuresBeforeWarning.hashCode());
        result =
                (result * PRIME)
                        + (this.maxFailuresBeforeLockout == null
                                ? 43
                                : this.maxFailuresBeforeLockout.hashCode());
        result =
                (result * PRIME)
                        + (this.initialLockoutPeriodInSecs == null
                                ? 43
                                : this.initialLockoutPeriodInSecs.hashCode());
        result =
                (result * PRIME)
                        + (this.lockoutEscalationPattern == null
                                ? 43
                                : this.lockoutEscalationPattern.hashCode());
        result =
                (result * PRIME)
                        + (this.maxLockoutIntervalInSecs == null
                                ? 43
                                : this.maxLockoutIntervalInSecs.hashCode());
        result =
                (result * PRIME)
                        + (this.requestSigningAlgo == null
                                ? 43
                                : this.requestSigningAlgo.hashCode());
        result =
                (result * PRIME)
                        + (this.policyUpdateFreqInDays == null
                                ? 43
                                : this.policyUpdateFreqInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.keyPairLength == null ? 43 : this.keyPairLength.hashCode());
        result =
                (result * PRIME)
                        + (this.deviceProtectionPolicy == null
                                ? 43
                                : this.deviceProtectionPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.unlockAppForEachRequestEnabled == null
                                ? 43
                                : this.unlockAppForEachRequestEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.unlockOnAppStartEnabled == null
                                ? 43
                                : this.unlockOnAppStartEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.unlockAppIntervalInSecs == null
                                ? 43
                                : this.unlockAppIntervalInSecs.hashCode());
        result =
                (result * PRIME)
                        + (this.sharedSecretEncoding == null
                                ? 43
                                : this.sharedSecretEncoding.hashCode());
        result =
                (result * PRIME)
                        + (this.unlockOnAppForegroundEnabled == null
                                ? 43
                                : this.unlockOnAppForegroundEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
