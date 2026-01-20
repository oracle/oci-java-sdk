/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes used to manage Multi-Factor Authentication within a service
 * provider. The extension is typically applied to a User resource, but MAY be applied to other
 * resources that use MFA. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExtensionMfaUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionMfaUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "preferredAuthenticationFactor",
        "mfaStatus",
        "preferredThirdPartyVendor",
        "preferredAuthenticationMethod",
        "loginAttempts",
        "mfaEnabledOn",
        "mfaIgnoredApps",
        "preferredDevice",
        "devices",
        "bypassCodes",
        "trustedUserAgents"
    })
    public ExtensionMfaUser(
            PreferredAuthenticationFactor preferredAuthenticationFactor,
            MfaStatus mfaStatus,
            String preferredThirdPartyVendor,
            String preferredAuthenticationMethod,
            Integer loginAttempts,
            String mfaEnabledOn,
            java.util.List<String> mfaIgnoredApps,
            UserExtPreferredDevice preferredDevice,
            java.util.List<UserExtDevices> devices,
            java.util.List<UserExtBypassCodes> bypassCodes,
            java.util.List<UserExtTrustedUserAgents> trustedUserAgents) {
        super();
        this.preferredAuthenticationFactor = preferredAuthenticationFactor;
        this.mfaStatus = mfaStatus;
        this.preferredThirdPartyVendor = preferredThirdPartyVendor;
        this.preferredAuthenticationMethod = preferredAuthenticationMethod;
        this.loginAttempts = loginAttempts;
        this.mfaEnabledOn = mfaEnabledOn;
        this.mfaIgnoredApps = mfaIgnoredApps;
        this.preferredDevice = preferredDevice;
        this.devices = devices;
        this.bypassCodes = bypassCodes;
        this.trustedUserAgents = trustedUserAgents;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The preferred authentication factor type.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preferredAuthenticationFactor")
        private PreferredAuthenticationFactor preferredAuthenticationFactor;

        /**
         * The preferred authentication factor type.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param preferredAuthenticationFactor the value to set
         * @return this builder
         */
        public Builder preferredAuthenticationFactor(
                PreferredAuthenticationFactor preferredAuthenticationFactor) {
            this.preferredAuthenticationFactor = preferredAuthenticationFactor;
            this.__explicitlySet__.add("preferredAuthenticationFactor");
            return this;
        }
        /**
         * The user opted for MFA.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - idcsRequiresWriteForAccessFlows: true - required: false -
         * returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mfaStatus")
        private MfaStatus mfaStatus;

        /**
         * The user opted for MFA.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - idcsRequiresWriteForAccessFlows: true - required: false -
         * returned: default - type: string - uniqueness: none
         *
         * @param mfaStatus the value to set
         * @return this builder
         */
        public Builder mfaStatus(MfaStatus mfaStatus) {
            this.mfaStatus = mfaStatus;
            this.__explicitlySet__.add("mfaStatus");
            return this;
        }
        /**
         * The preferred third-party vendor name.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preferredThirdPartyVendor")
        private String preferredThirdPartyVendor;

        /**
         * The preferred third-party vendor name.
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param preferredThirdPartyVendor the value to set
         * @return this builder
         */
        public Builder preferredThirdPartyVendor(String preferredThirdPartyVendor) {
            this.preferredThirdPartyVendor = preferredThirdPartyVendor;
            this.__explicitlySet__.add("preferredThirdPartyVendor");
            return this;
        }
        /**
         * The preferred authentication method.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preferredAuthenticationMethod")
        private String preferredAuthenticationMethod;

        /**
         * The preferred authentication method.
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param preferredAuthenticationMethod the value to set
         * @return this builder
         */
        public Builder preferredAuthenticationMethod(String preferredAuthenticationMethod) {
            this.preferredAuthenticationMethod = preferredAuthenticationMethod;
            this.__explicitlySet__.add("preferredAuthenticationMethod");
            return this;
        }
        /**
         * The number of incorrect multi factor authentication sign in attempts made by this user.
         * The user is locked if this reaches the threshold specified in the maxIncorrectAttempts
         * attribute in AuthenticationFactorSettings.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - idcsRequiresWriteForAccessFlows: true -
         * idcsRequiresImmediateReadAfterWriteForAccessFlows: true - required: false - returned:
         * default - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loginAttempts")
        private Integer loginAttempts;

        /**
         * The number of incorrect multi factor authentication sign in attempts made by this user.
         * The user is locked if this reaches the threshold specified in the maxIncorrectAttempts
         * attribute in AuthenticationFactorSettings.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - idcsRequiresWriteForAccessFlows: true -
         * idcsRequiresImmediateReadAfterWriteForAccessFlows: true - required: false - returned:
         * default - type: integer - uniqueness: none
         *
         * @param loginAttempts the value to set
         * @return this builder
         */
        public Builder loginAttempts(Integer loginAttempts) {
            this.loginAttempts = loginAttempts;
            this.__explicitlySet__.add("loginAttempts");
            return this;
        }
        /**
         * The date when the user enrolled in multi factor authentication. This will be set to null,
         * when the user resets their factors.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: dateTime - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mfaEnabledOn")
        private String mfaEnabledOn;

        /**
         * The date when the user enrolled in multi factor authentication. This will be set to null,
         * when the user resets their factors.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: dateTime - uniqueness: none
         *
         * @param mfaEnabledOn the value to set
         * @return this builder
         */
        public Builder mfaEnabledOn(String mfaEnabledOn) {
            this.mfaEnabledOn = mfaEnabledOn;
            this.__explicitlySet__.add("mfaEnabledOn");
            return this;
        }
        /**
         * User MFA Ignored Apps Identifiers
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mfaIgnoredApps")
        private java.util.List<String> mfaIgnoredApps;

        /**
         * User MFA Ignored Apps Identifiers
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param mfaIgnoredApps the value to set
         * @return this builder
         */
        public Builder mfaIgnoredApps(java.util.List<String> mfaIgnoredApps) {
            this.mfaIgnoredApps = mfaIgnoredApps;
            this.__explicitlySet__.add("mfaIgnoredApps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("preferredDevice")
        private UserExtPreferredDevice preferredDevice;

        public Builder preferredDevice(UserExtPreferredDevice preferredDevice) {
            this.preferredDevice = preferredDevice;
            this.__explicitlySet__.add("preferredDevice");
            return this;
        }
        /**
         * A list of devices enrolled by the user.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("devices")
        private java.util.List<UserExtDevices> devices;

        /**
         * A list of devices enrolled by the user.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         *
         * @param devices the value to set
         * @return this builder
         */
        public Builder devices(java.util.List<UserExtDevices> devices) {
            this.devices = devices;
            this.__explicitlySet__.add("devices");
            return this;
        }
        /**
         * A list of bypass codes that belongs to the user.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bypassCodes")
        private java.util.List<UserExtBypassCodes> bypassCodes;

        /**
         * A list of bypass codes that belongs to the user.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         *
         * @param bypassCodes the value to set
         * @return this builder
         */
        public Builder bypassCodes(java.util.List<UserExtBypassCodes> bypassCodes) {
            this.bypassCodes = bypassCodes;
            this.__explicitlySet__.add("bypassCodes");
            return this;
        }
        /**
         * A list of trusted User Agents owned by this user. Multi-Factored Authentication uses
         * Trusted User Agents to authenticate users. A User Agent is software application that a
         * user uses to issue requests. For example, a User Agent could be a particular browser
         * (possibly one of several executing on a desktop or laptop) or a particular mobile
         * application (again, oneof several executing on a particular mobile device). A User Agent
         * is trusted once the Multi-Factor Authentication has verified it in some way.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readWrite - required: false - returned: request - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustedUserAgents")
        private java.util.List<UserExtTrustedUserAgents> trustedUserAgents;

        /**
         * A list of trusted User Agents owned by this user. Multi-Factored Authentication uses
         * Trusted User Agents to authenticate users. A User Agent is software application that a
         * user uses to issue requests. For example, a User Agent could be a particular browser
         * (possibly one of several executing on a desktop or laptop) or a particular mobile
         * application (again, oneof several executing on a particular mobile device). A User Agent
         * is trusted once the Multi-Factor Authentication has verified it in some way.
         *
         * <p>*Added In:** 18.3.6
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readWrite - required: false - returned: request - type: complex - uniqueness: none
         *
         * @param trustedUserAgents the value to set
         * @return this builder
         */
        public Builder trustedUserAgents(
                java.util.List<UserExtTrustedUserAgents> trustedUserAgents) {
            this.trustedUserAgents = trustedUserAgents;
            this.__explicitlySet__.add("trustedUserAgents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionMfaUser build() {
            ExtensionMfaUser model =
                    new ExtensionMfaUser(
                            this.preferredAuthenticationFactor,
                            this.mfaStatus,
                            this.preferredThirdPartyVendor,
                            this.preferredAuthenticationMethod,
                            this.loginAttempts,
                            this.mfaEnabledOn,
                            this.mfaIgnoredApps,
                            this.preferredDevice,
                            this.devices,
                            this.bypassCodes,
                            this.trustedUserAgents);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionMfaUser model) {
            if (model.wasPropertyExplicitlySet("preferredAuthenticationFactor")) {
                this.preferredAuthenticationFactor(model.getPreferredAuthenticationFactor());
            }
            if (model.wasPropertyExplicitlySet("mfaStatus")) {
                this.mfaStatus(model.getMfaStatus());
            }
            if (model.wasPropertyExplicitlySet("preferredThirdPartyVendor")) {
                this.preferredThirdPartyVendor(model.getPreferredThirdPartyVendor());
            }
            if (model.wasPropertyExplicitlySet("preferredAuthenticationMethod")) {
                this.preferredAuthenticationMethod(model.getPreferredAuthenticationMethod());
            }
            if (model.wasPropertyExplicitlySet("loginAttempts")) {
                this.loginAttempts(model.getLoginAttempts());
            }
            if (model.wasPropertyExplicitlySet("mfaEnabledOn")) {
                this.mfaEnabledOn(model.getMfaEnabledOn());
            }
            if (model.wasPropertyExplicitlySet("mfaIgnoredApps")) {
                this.mfaIgnoredApps(model.getMfaIgnoredApps());
            }
            if (model.wasPropertyExplicitlySet("preferredDevice")) {
                this.preferredDevice(model.getPreferredDevice());
            }
            if (model.wasPropertyExplicitlySet("devices")) {
                this.devices(model.getDevices());
            }
            if (model.wasPropertyExplicitlySet("bypassCodes")) {
                this.bypassCodes(model.getBypassCodes());
            }
            if (model.wasPropertyExplicitlySet("trustedUserAgents")) {
                this.trustedUserAgents(model.getTrustedUserAgents());
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
     * The preferred authentication factor type.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum PreferredAuthenticationFactor implements com.oracle.bmc.http.internal.BmcEnum {
        Email("EMAIL"),
        Sms("SMS"),
        Totp("TOTP"),
        Push("PUSH"),
        Offlinetotp("OFFLINETOTP"),
        UsernamePassword("USERNAME_PASSWORD"),
        SecurityQuestions("SECURITY_QUESTIONS"),
        Voice("VOICE"),
        PhoneCall("PHONE_CALL"),
        Thirdparty("THIRDPARTY"),
        FidoAuthenticator("FIDO_AUTHENTICATOR"),
        YubicoOtp("YUBICO_OTP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PreferredAuthenticationFactor.class);

        private final String value;
        private static java.util.Map<String, PreferredAuthenticationFactor> map;

        static {
            map = new java.util.HashMap<>();
            for (PreferredAuthenticationFactor v : PreferredAuthenticationFactor.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PreferredAuthenticationFactor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PreferredAuthenticationFactor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PreferredAuthenticationFactor', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The preferred authentication factor type.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredAuthenticationFactor")
    private final PreferredAuthenticationFactor preferredAuthenticationFactor;

    /**
     * The preferred authentication factor type.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public PreferredAuthenticationFactor getPreferredAuthenticationFactor() {
        return preferredAuthenticationFactor;
    }

    /**
     * The user opted for MFA.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - idcsRequiresWriteForAccessFlows: true - required: false - returned:
     * default - type: string - uniqueness: none
     */
    public enum MfaStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enrolled("ENROLLED"),
        Ignored("IGNORED"),
        UnEnrolled("UN_ENROLLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MfaStatus.class);

        private final String value;
        private static java.util.Map<String, MfaStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (MfaStatus v : MfaStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MfaStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MfaStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MfaStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The user opted for MFA.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - idcsRequiresWriteForAccessFlows: true - required: false - returned:
     * default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mfaStatus")
    private final MfaStatus mfaStatus;

    /**
     * The user opted for MFA.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - idcsRequiresWriteForAccessFlows: true - required: false - returned:
     * default - type: string - uniqueness: none
     *
     * @return the value
     */
    public MfaStatus getMfaStatus() {
        return mfaStatus;
    }

    /**
     * The preferred third-party vendor name.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredThirdPartyVendor")
    private final String preferredThirdPartyVendor;

    /**
     * The preferred third-party vendor name.
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getPreferredThirdPartyVendor() {
        return preferredThirdPartyVendor;
    }

    /**
     * The preferred authentication method.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredAuthenticationMethod")
    private final String preferredAuthenticationMethod;

    /**
     * The preferred authentication method.
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getPreferredAuthenticationMethod() {
        return preferredAuthenticationMethod;
    }

    /**
     * The number of incorrect multi factor authentication sign in attempts made by this user. The
     * user is locked if this reaches the threshold specified in the maxIncorrectAttempts attribute
     * in AuthenticationFactorSettings.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - idcsRequiresWriteForAccessFlows: true - idcsRequiresImmediateReadAfterWriteForAccessFlows:
     * true - required: false - returned: default - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loginAttempts")
    private final Integer loginAttempts;

    /**
     * The number of incorrect multi factor authentication sign in attempts made by this user. The
     * user is locked if this reaches the threshold specified in the maxIncorrectAttempts attribute
     * in AuthenticationFactorSettings.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - idcsRequiresWriteForAccessFlows: true - idcsRequiresImmediateReadAfterWriteForAccessFlows:
     * true - required: false - returned: default - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getLoginAttempts() {
        return loginAttempts;
    }

    /**
     * The date when the user enrolled in multi factor authentication. This will be set to null,
     * when the user resets their factors.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: dateTime - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mfaEnabledOn")
    private final String mfaEnabledOn;

    /**
     * The date when the user enrolled in multi factor authentication. This will be set to null,
     * when the user resets their factors.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: dateTime - uniqueness: none
     *
     * @return the value
     */
    public String getMfaEnabledOn() {
        return mfaEnabledOn;
    }

    /**
     * User MFA Ignored Apps Identifiers
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mfaIgnoredApps")
    private final java.util.List<String> mfaIgnoredApps;

    /**
     * User MFA Ignored Apps Identifiers
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: true -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getMfaIgnoredApps() {
        return mfaIgnoredApps;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("preferredDevice")
    private final UserExtPreferredDevice preferredDevice;

    public UserExtPreferredDevice getPreferredDevice() {
        return preferredDevice;
    }

    /**
     * A list of devices enrolled by the user.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readOnly - required: false - returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devices")
    private final java.util.List<UserExtDevices> devices;

    /**
     * A list of devices enrolled by the user.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readOnly - required: false - returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtDevices> getDevices() {
        return devices;
    }

    /**
     * A list of bypass codes that belongs to the user.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readOnly - required: false - returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bypassCodes")
    private final java.util.List<UserExtBypassCodes> bypassCodes;

    /**
     * A list of bypass codes that belongs to the user.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readOnly - required: false - returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtBypassCodes> getBypassCodes() {
        return bypassCodes;
    }

    /**
     * A list of trusted User Agents owned by this user. Multi-Factored Authentication uses Trusted
     * User Agents to authenticate users. A User Agent is software application that a user uses to
     * issue requests. For example, a User Agent could be a particular browser (possibly one of
     * several executing on a desktop or laptop) or a particular mobile application (again, oneof
     * several executing on a particular mobile device). A User Agent is trusted once the
     * Multi-Factor Authentication has verified it in some way.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readWrite - required: false - returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustedUserAgents")
    private final java.util.List<UserExtTrustedUserAgents> trustedUserAgents;

    /**
     * A list of trusted User Agents owned by this user. Multi-Factored Authentication uses Trusted
     * User Agents to authenticate users. A User Agent is software application that a user uses to
     * issue requests. For example, a User Agent could be a particular browser (possibly one of
     * several executing on a desktop or laptop) or a particular mobile application (again, oneof
     * several executing on a particular mobile device). A User Agent is trusted once the
     * Multi-Factor Authentication has verified it in some way.
     *
     * <p>*Added In:** 18.3.6
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readWrite - required: false - returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtTrustedUserAgents> getTrustedUserAgents() {
        return trustedUserAgents;
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
        sb.append("ExtensionMfaUser(");
        sb.append("super=").append(super.toString());
        sb.append("preferredAuthenticationFactor=")
                .append(String.valueOf(this.preferredAuthenticationFactor));
        sb.append(", mfaStatus=").append(String.valueOf(this.mfaStatus));
        sb.append(", preferredThirdPartyVendor=")
                .append(String.valueOf(this.preferredThirdPartyVendor));
        sb.append(", preferredAuthenticationMethod=")
                .append(String.valueOf(this.preferredAuthenticationMethod));
        sb.append(", loginAttempts=").append(String.valueOf(this.loginAttempts));
        sb.append(", mfaEnabledOn=").append(String.valueOf(this.mfaEnabledOn));
        sb.append(", mfaIgnoredApps=").append(String.valueOf(this.mfaIgnoredApps));
        sb.append(", preferredDevice=").append(String.valueOf(this.preferredDevice));
        sb.append(", devices=").append(String.valueOf(this.devices));
        sb.append(", bypassCodes=").append(String.valueOf(this.bypassCodes));
        sb.append(", trustedUserAgents=").append(String.valueOf(this.trustedUserAgents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionMfaUser)) {
            return false;
        }

        ExtensionMfaUser other = (ExtensionMfaUser) o;
        return java.util.Objects.equals(
                        this.preferredAuthenticationFactor, other.preferredAuthenticationFactor)
                && java.util.Objects.equals(this.mfaStatus, other.mfaStatus)
                && java.util.Objects.equals(
                        this.preferredThirdPartyVendor, other.preferredThirdPartyVendor)
                && java.util.Objects.equals(
                        this.preferredAuthenticationMethod, other.preferredAuthenticationMethod)
                && java.util.Objects.equals(this.loginAttempts, other.loginAttempts)
                && java.util.Objects.equals(this.mfaEnabledOn, other.mfaEnabledOn)
                && java.util.Objects.equals(this.mfaIgnoredApps, other.mfaIgnoredApps)
                && java.util.Objects.equals(this.preferredDevice, other.preferredDevice)
                && java.util.Objects.equals(this.devices, other.devices)
                && java.util.Objects.equals(this.bypassCodes, other.bypassCodes)
                && java.util.Objects.equals(this.trustedUserAgents, other.trustedUserAgents)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.preferredAuthenticationFactor == null
                                ? 43
                                : this.preferredAuthenticationFactor.hashCode());
        result = (result * PRIME) + (this.mfaStatus == null ? 43 : this.mfaStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredThirdPartyVendor == null
                                ? 43
                                : this.preferredThirdPartyVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredAuthenticationMethod == null
                                ? 43
                                : this.preferredAuthenticationMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.loginAttempts == null ? 43 : this.loginAttempts.hashCode());
        result = (result * PRIME) + (this.mfaEnabledOn == null ? 43 : this.mfaEnabledOn.hashCode());
        result =
                (result * PRIME)
                        + (this.mfaIgnoredApps == null ? 43 : this.mfaIgnoredApps.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredDevice == null ? 43 : this.preferredDevice.hashCode());
        result = (result * PRIME) + (this.devices == null ? 43 : this.devices.hashCode());
        result = (result * PRIME) + (this.bypassCodes == null ? 43 : this.bypassCodes.hashCode());
        result =
                (result * PRIME)
                        + (this.trustedUserAgents == null ? 43 : this.trustedUserAgents.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
