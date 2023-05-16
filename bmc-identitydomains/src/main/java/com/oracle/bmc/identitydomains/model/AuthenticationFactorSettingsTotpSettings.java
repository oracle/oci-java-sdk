/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Settings related to Time-Based One-Time Passcodes (TOTP), such as hashing algo, totp time step,
 * passcode length, and so on
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
        builder = AuthenticationFactorSettingsTotpSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuthenticationFactorSettingsTotpSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hashingAlgorithm",
        "passcodeLength",
        "keyRefreshIntervalInDays",
        "timeStepInSecs",
        "timeStepTolerance",
        "smsOtpValidityDurationInMins",
        "jwtValidityDurationInSecs",
        "smsPasscodeLength",
        "emailOtpValidityDurationInMins",
        "emailPasscodeLength"
    })
    public AuthenticationFactorSettingsTotpSettings(
            HashingAlgorithm hashingAlgorithm,
            Integer passcodeLength,
            Integer keyRefreshIntervalInDays,
            Integer timeStepInSecs,
            Integer timeStepTolerance,
            Integer smsOtpValidityDurationInMins,
            Integer jwtValidityDurationInSecs,
            Integer smsPasscodeLength,
            Integer emailOtpValidityDurationInMins,
            Integer emailPasscodeLength) {
        super();
        this.hashingAlgorithm = hashingAlgorithm;
        this.passcodeLength = passcodeLength;
        this.keyRefreshIntervalInDays = keyRefreshIntervalInDays;
        this.timeStepInSecs = timeStepInSecs;
        this.timeStepTolerance = timeStepTolerance;
        this.smsOtpValidityDurationInMins = smsOtpValidityDurationInMins;
        this.jwtValidityDurationInSecs = jwtValidityDurationInSecs;
        this.smsPasscodeLength = smsPasscodeLength;
        this.emailOtpValidityDurationInMins = emailOtpValidityDurationInMins;
        this.emailPasscodeLength = emailPasscodeLength;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The hashing algorithm to be used to calculate a One-Time Passcode. By default, the system
         * uses SHA1.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hashingAlgorithm")
        private HashingAlgorithm hashingAlgorithm;

        /**
         * The hashing algorithm to be used to calculate a One-Time Passcode. By default, the system
         * uses SHA1.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param hashingAlgorithm the value to set
         * @return this builder
         */
        public Builder hashingAlgorithm(HashingAlgorithm hashingAlgorithm) {
            this.hashingAlgorithm = hashingAlgorithm;
            this.__explicitlySet__.add("hashingAlgorithm");
            return this;
        }
        /**
         * Exact length of the One-Time Passcode that the system should generate
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passcodeLength")
        private Integer passcodeLength;

        /**
         * Exact length of the One-Time Passcode that the system should generate
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param passcodeLength the value to set
         * @return this builder
         */
        public Builder passcodeLength(Integer passcodeLength) {
            this.passcodeLength = passcodeLength;
            this.__explicitlySet__.add("passcodeLength");
            return this;
        }
        /**
         * The duration of time (in days) after which the shared secret has to be refreshed
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 999 - idcsMinValue: 30 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyRefreshIntervalInDays")
        private Integer keyRefreshIntervalInDays;

        /**
         * The duration of time (in days) after which the shared secret has to be refreshed
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 999 - idcsMinValue: 30 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param keyRefreshIntervalInDays the value to set
         * @return this builder
         */
        public Builder keyRefreshIntervalInDays(Integer keyRefreshIntervalInDays) {
            this.keyRefreshIntervalInDays = keyRefreshIntervalInDays;
            this.__explicitlySet__.add("keyRefreshIntervalInDays");
            return this;
        }
        /**
         * Time (in secs) to be used as the time step
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 300 - idcsMinValue: 30 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStepInSecs")
        private Integer timeStepInSecs;

        /**
         * Time (in secs) to be used as the time step
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 300 - idcsMinValue: 30 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param timeStepInSecs the value to set
         * @return this builder
         */
        public Builder timeStepInSecs(Integer timeStepInSecs) {
            this.timeStepInSecs = timeStepInSecs;
            this.__explicitlySet__.add("timeStepInSecs");
            return this;
        }
        /**
         * The tolerance/step-size that the system should use when validating a One-Time Passcode
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 3 - idcsMinValue: 2 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStepTolerance")
        private Integer timeStepTolerance;

        /**
         * The tolerance/step-size that the system should use when validating a One-Time Passcode
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 3 - idcsMinValue: 2 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param timeStepTolerance the value to set
         * @return this builder
         */
        public Builder timeStepTolerance(Integer timeStepTolerance) {
            this.timeStepTolerance = timeStepTolerance;
            this.__explicitlySet__.add("timeStepTolerance");
            return this;
        }
        /**
         * The period of time (in minutes) for which a One-Time Passcode that the system sends by
         * Short Message Service (SMS) or by voice remains valid
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 60 - idcsMinValue: 2 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("smsOtpValidityDurationInMins")
        private Integer smsOtpValidityDurationInMins;

        /**
         * The period of time (in minutes) for which a One-Time Passcode that the system sends by
         * Short Message Service (SMS) or by voice remains valid
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 60 - idcsMinValue: 2 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param smsOtpValidityDurationInMins the value to set
         * @return this builder
         */
        public Builder smsOtpValidityDurationInMins(Integer smsOtpValidityDurationInMins) {
            this.smsOtpValidityDurationInMins = smsOtpValidityDurationInMins;
            this.__explicitlySet__.add("smsOtpValidityDurationInMins");
            return this;
        }
        /**
         * The period of time (in seconds) that a JSON Web Token (JWT) is valid
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 99999 - idcsMinValue: 30 - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jwtValidityDurationInSecs")
        private Integer jwtValidityDurationInSecs;

        /**
         * The period of time (in seconds) that a JSON Web Token (JWT) is valid
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 99999 - idcsMinValue: 30 - idcsSearchable: false
         * - multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param jwtValidityDurationInSecs the value to set
         * @return this builder
         */
        public Builder jwtValidityDurationInSecs(Integer jwtValidityDurationInSecs) {
            this.jwtValidityDurationInSecs = jwtValidityDurationInSecs;
            this.__explicitlySet__.add("jwtValidityDurationInSecs");
            return this;
        }
        /**
         * Exact length of the Short Message Service (SMS) One-Time Passcode
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("smsPasscodeLength")
        private Integer smsPasscodeLength;

        /**
         * Exact length of the Short Message Service (SMS) One-Time Passcode
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param smsPasscodeLength the value to set
         * @return this builder
         */
        public Builder smsPasscodeLength(Integer smsPasscodeLength) {
            this.smsPasscodeLength = smsPasscodeLength;
            this.__explicitlySet__.add("smsPasscodeLength");
            return this;
        }
        /**
         * The period of time (in minutes) that a one-time passcode remains valid that the system
         * sends by email.
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 60 - idcsMinValue: 2 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("emailOtpValidityDurationInMins")
        private Integer emailOtpValidityDurationInMins;

        /**
         * The period of time (in minutes) that a one-time passcode remains valid that the system
         * sends by email.
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 60 - idcsMinValue: 2 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param emailOtpValidityDurationInMins the value to set
         * @return this builder
         */
        public Builder emailOtpValidityDurationInMins(Integer emailOtpValidityDurationInMins) {
            this.emailOtpValidityDurationInMins = emailOtpValidityDurationInMins;
            this.__explicitlySet__.add("emailOtpValidityDurationInMins");
            return this;
        }
        /**
         * Exact length of the email one-time passcode.
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("emailPasscodeLength")
        private Integer emailPasscodeLength;

        /**
         * Exact length of the email one-time passcode.
         *
         * <p>*Added In:** 18.1.2
         *
         * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
         * multiValued: false - mutability: readWrite - required: true - returned: default - type:
         * integer - uniqueness: none
         *
         * @param emailPasscodeLength the value to set
         * @return this builder
         */
        public Builder emailPasscodeLength(Integer emailPasscodeLength) {
            this.emailPasscodeLength = emailPasscodeLength;
            this.__explicitlySet__.add("emailPasscodeLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationFactorSettingsTotpSettings build() {
            AuthenticationFactorSettingsTotpSettings model =
                    new AuthenticationFactorSettingsTotpSettings(
                            this.hashingAlgorithm,
                            this.passcodeLength,
                            this.keyRefreshIntervalInDays,
                            this.timeStepInSecs,
                            this.timeStepTolerance,
                            this.smsOtpValidityDurationInMins,
                            this.jwtValidityDurationInSecs,
                            this.smsPasscodeLength,
                            this.emailOtpValidityDurationInMins,
                            this.emailPasscodeLength);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationFactorSettingsTotpSettings model) {
            if (model.wasPropertyExplicitlySet("hashingAlgorithm")) {
                this.hashingAlgorithm(model.getHashingAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("passcodeLength")) {
                this.passcodeLength(model.getPasscodeLength());
            }
            if (model.wasPropertyExplicitlySet("keyRefreshIntervalInDays")) {
                this.keyRefreshIntervalInDays(model.getKeyRefreshIntervalInDays());
            }
            if (model.wasPropertyExplicitlySet("timeStepInSecs")) {
                this.timeStepInSecs(model.getTimeStepInSecs());
            }
            if (model.wasPropertyExplicitlySet("timeStepTolerance")) {
                this.timeStepTolerance(model.getTimeStepTolerance());
            }
            if (model.wasPropertyExplicitlySet("smsOtpValidityDurationInMins")) {
                this.smsOtpValidityDurationInMins(model.getSmsOtpValidityDurationInMins());
            }
            if (model.wasPropertyExplicitlySet("jwtValidityDurationInSecs")) {
                this.jwtValidityDurationInSecs(model.getJwtValidityDurationInSecs());
            }
            if (model.wasPropertyExplicitlySet("smsPasscodeLength")) {
                this.smsPasscodeLength(model.getSmsPasscodeLength());
            }
            if (model.wasPropertyExplicitlySet("emailOtpValidityDurationInMins")) {
                this.emailOtpValidityDurationInMins(model.getEmailOtpValidityDurationInMins());
            }
            if (model.wasPropertyExplicitlySet("emailPasscodeLength")) {
                this.emailPasscodeLength(model.getEmailPasscodeLength());
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
     * The hashing algorithm to be used to calculate a One-Time Passcode. By default, the system
     * uses SHA1.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    public enum HashingAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        Sha1("SHA1"),
        Sha256("SHA256"),
        Sha384("SHA384"),
        Sha512("SHA512"),
        Md5("MD5"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HashingAlgorithm.class);

        private final String value;
        private static java.util.Map<String, HashingAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (HashingAlgorithm v : HashingAlgorithm.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HashingAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HashingAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HashingAlgorithm', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The hashing algorithm to be used to calculate a One-Time Passcode. By default, the system
     * uses SHA1.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hashingAlgorithm")
    private final HashingAlgorithm hashingAlgorithm;

    /**
     * The hashing algorithm to be used to calculate a One-Time Passcode. By default, the system
     * uses SHA1.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public HashingAlgorithm getHashingAlgorithm() {
        return hashingAlgorithm;
    }

    /**
     * Exact length of the One-Time Passcode that the system should generate
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passcodeLength")
    private final Integer passcodeLength;

    /**
     * Exact length of the One-Time Passcode that the system should generate
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getPasscodeLength() {
        return passcodeLength;
    }

    /**
     * The duration of time (in days) after which the shared secret has to be refreshed
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 999 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyRefreshIntervalInDays")
    private final Integer keyRefreshIntervalInDays;

    /**
     * The duration of time (in days) after which the shared secret has to be refreshed
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 999 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getKeyRefreshIntervalInDays() {
        return keyRefreshIntervalInDays;
    }

    /**
     * Time (in secs) to be used as the time step
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 300 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStepInSecs")
    private final Integer timeStepInSecs;

    /**
     * Time (in secs) to be used as the time step
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 300 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getTimeStepInSecs() {
        return timeStepInSecs;
    }

    /**
     * The tolerance/step-size that the system should use when validating a One-Time Passcode
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 3 - idcsMinValue: 2 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStepTolerance")
    private final Integer timeStepTolerance;

    /**
     * The tolerance/step-size that the system should use when validating a One-Time Passcode
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 3 - idcsMinValue: 2 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getTimeStepTolerance() {
        return timeStepTolerance;
    }

    /**
     * The period of time (in minutes) for which a One-Time Passcode that the system sends by Short
     * Message Service (SMS) or by voice remains valid
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 60 - idcsMinValue: 2 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("smsOtpValidityDurationInMins")
    private final Integer smsOtpValidityDurationInMins;

    /**
     * The period of time (in minutes) for which a One-Time Passcode that the system sends by Short
     * Message Service (SMS) or by voice remains valid
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 60 - idcsMinValue: 2 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getSmsOtpValidityDurationInMins() {
        return smsOtpValidityDurationInMins;
    }

    /**
     * The period of time (in seconds) that a JSON Web Token (JWT) is valid
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 99999 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwtValidityDurationInSecs")
    private final Integer jwtValidityDurationInSecs;

    /**
     * The period of time (in seconds) that a JSON Web Token (JWT) is valid
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 99999 - idcsMinValue: 30 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getJwtValidityDurationInSecs() {
        return jwtValidityDurationInSecs;
    }

    /**
     * Exact length of the Short Message Service (SMS) One-Time Passcode
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("smsPasscodeLength")
    private final Integer smsPasscodeLength;

    /**
     * Exact length of the Short Message Service (SMS) One-Time Passcode
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getSmsPasscodeLength() {
        return smsPasscodeLength;
    }

    /**
     * The period of time (in minutes) that a one-time passcode remains valid that the system sends
     * by email.
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 60 - idcsMinValue: 2 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emailOtpValidityDurationInMins")
    private final Integer emailOtpValidityDurationInMins;

    /**
     * The period of time (in minutes) that a one-time passcode remains valid that the system sends
     * by email.
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 60 - idcsMinValue: 2 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getEmailOtpValidityDurationInMins() {
        return emailOtpValidityDurationInMins;
    }

    /**
     * Exact length of the email one-time passcode.
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emailPasscodeLength")
    private final Integer emailPasscodeLength;

    /**
     * Exact length of the email one-time passcode.
     *
     * <p>*Added In:** 18.1.2
     *
     * <p>*SCIM++ Properties:** - idcsMaxValue: 10 - idcsMinValue: 4 - idcsSearchable: false -
     * multiValued: false - mutability: readWrite - required: true - returned: default - type:
     * integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getEmailPasscodeLength() {
        return emailPasscodeLength;
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
        sb.append("AuthenticationFactorSettingsTotpSettings(");
        sb.append("super=").append(super.toString());
        sb.append("hashingAlgorithm=").append(String.valueOf(this.hashingAlgorithm));
        sb.append(", passcodeLength=").append(String.valueOf(this.passcodeLength));
        sb.append(", keyRefreshIntervalInDays=")
                .append(String.valueOf(this.keyRefreshIntervalInDays));
        sb.append(", timeStepInSecs=").append(String.valueOf(this.timeStepInSecs));
        sb.append(", timeStepTolerance=").append(String.valueOf(this.timeStepTolerance));
        sb.append(", smsOtpValidityDurationInMins=")
                .append(String.valueOf(this.smsOtpValidityDurationInMins));
        sb.append(", jwtValidityDurationInSecs=")
                .append(String.valueOf(this.jwtValidityDurationInSecs));
        sb.append(", smsPasscodeLength=").append(String.valueOf(this.smsPasscodeLength));
        sb.append(", emailOtpValidityDurationInMins=")
                .append(String.valueOf(this.emailOtpValidityDurationInMins));
        sb.append(", emailPasscodeLength=").append(String.valueOf(this.emailPasscodeLength));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationFactorSettingsTotpSettings)) {
            return false;
        }

        AuthenticationFactorSettingsTotpSettings other =
                (AuthenticationFactorSettingsTotpSettings) o;
        return java.util.Objects.equals(this.hashingAlgorithm, other.hashingAlgorithm)
                && java.util.Objects.equals(this.passcodeLength, other.passcodeLength)
                && java.util.Objects.equals(
                        this.keyRefreshIntervalInDays, other.keyRefreshIntervalInDays)
                && java.util.Objects.equals(this.timeStepInSecs, other.timeStepInSecs)
                && java.util.Objects.equals(this.timeStepTolerance, other.timeStepTolerance)
                && java.util.Objects.equals(
                        this.smsOtpValidityDurationInMins, other.smsOtpValidityDurationInMins)
                && java.util.Objects.equals(
                        this.jwtValidityDurationInSecs, other.jwtValidityDurationInSecs)
                && java.util.Objects.equals(this.smsPasscodeLength, other.smsPasscodeLength)
                && java.util.Objects.equals(
                        this.emailOtpValidityDurationInMins, other.emailOtpValidityDurationInMins)
                && java.util.Objects.equals(this.emailPasscodeLength, other.emailPasscodeLength)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.hashingAlgorithm == null ? 43 : this.hashingAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.passcodeLength == null ? 43 : this.passcodeLength.hashCode());
        result =
                (result * PRIME)
                        + (this.keyRefreshIntervalInDays == null
                                ? 43
                                : this.keyRefreshIntervalInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStepInSecs == null ? 43 : this.timeStepInSecs.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStepTolerance == null ? 43 : this.timeStepTolerance.hashCode());
        result =
                (result * PRIME)
                        + (this.smsOtpValidityDurationInMins == null
                                ? 43
                                : this.smsOtpValidityDurationInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.jwtValidityDurationInSecs == null
                                ? 43
                                : this.jwtValidityDurationInSecs.hashCode());
        result =
                (result * PRIME)
                        + (this.smsPasscodeLength == null ? 43 : this.smsPasscodeLength.hashCode());
        result =
                (result * PRIME)
                        + (this.emailOtpValidityDurationInMins == null
                                ? 43
                                : this.emailOtpValidityDurationInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.emailPasscodeLength == null
                                ? 43
                                : this.emailPasscodeLength.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
