/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Settings related to Duo Security
 *
 * <p>*Added In:** 19.2.1
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
        builder = AuthenticationFactorSettingsDuoSecuritySettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuthenticationFactorSettingsDuoSecuritySettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "integrationKey",
        "secretKey",
        "attestationKey",
        "apiHostname",
        "userMappingAttribute"
    })
    public AuthenticationFactorSettingsDuoSecuritySettings(
            String integrationKey,
            String secretKey,
            String attestationKey,
            String apiHostname,
            UserMappingAttribute userMappingAttribute) {
        super();
        this.integrationKey = integrationKey;
        this.secretKey = secretKey;
        this.attestationKey = attestationKey;
        this.apiHostname = apiHostname;
        this.userMappingAttribute = userMappingAttribute;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Integration key from Duo Security authenticator
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("integrationKey")
        private String integrationKey;

        /**
         * Integration key from Duo Security authenticator
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param integrationKey the value to set
         * @return this builder
         */
        public Builder integrationKey(String integrationKey) {
            this.integrationKey = integrationKey;
            this.__explicitlySet__.add("integrationKey");
            return this;
        }
        /**
         * Secret key from Duo Security authenticator
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
        private String secretKey;

        /**
         * Secret key from Duo Security authenticator
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param secretKey the value to set
         * @return this builder
         */
        public Builder secretKey(String secretKey) {
            this.secretKey = secretKey;
            this.__explicitlySet__.add("secretKey");
            return this;
        }
        /**
         * Attestation key to attest the request and response between Duo Security
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: never - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attestationKey")
        private String attestationKey;

        /**
         * Attestation key to attest the request and response between Duo Security
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: never - type: string - uniqueness: none
         *
         * @param attestationKey the value to set
         * @return this builder
         */
        public Builder attestationKey(String attestationKey) {
            this.attestationKey = attestationKey;
            this.__explicitlySet__.add("attestationKey");
            return this;
        }
        /**
         * Hostname to access the Duo security account
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("apiHostname")
        private String apiHostname;

        /**
         * Hostname to access the Duo security account
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param apiHostname the value to set
         * @return this builder
         */
        public Builder apiHostname(String apiHostname) {
            this.apiHostname = apiHostname;
            this.__explicitlySet__.add("apiHostname");
            return this;
        }
        /**
         * User attribute mapping value
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userMappingAttribute")
        private UserMappingAttribute userMappingAttribute;

        /**
         * User attribute mapping value
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: true - returned: default - type: string - uniqueness: none
         *
         * @param userMappingAttribute the value to set
         * @return this builder
         */
        public Builder userMappingAttribute(UserMappingAttribute userMappingAttribute) {
            this.userMappingAttribute = userMappingAttribute;
            this.__explicitlySet__.add("userMappingAttribute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationFactorSettingsDuoSecuritySettings build() {
            AuthenticationFactorSettingsDuoSecuritySettings model =
                    new AuthenticationFactorSettingsDuoSecuritySettings(
                            this.integrationKey,
                            this.secretKey,
                            this.attestationKey,
                            this.apiHostname,
                            this.userMappingAttribute);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationFactorSettingsDuoSecuritySettings model) {
            if (model.wasPropertyExplicitlySet("integrationKey")) {
                this.integrationKey(model.getIntegrationKey());
            }
            if (model.wasPropertyExplicitlySet("secretKey")) {
                this.secretKey(model.getSecretKey());
            }
            if (model.wasPropertyExplicitlySet("attestationKey")) {
                this.attestationKey(model.getAttestationKey());
            }
            if (model.wasPropertyExplicitlySet("apiHostname")) {
                this.apiHostname(model.getApiHostname());
            }
            if (model.wasPropertyExplicitlySet("userMappingAttribute")) {
                this.userMappingAttribute(model.getUserMappingAttribute());
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
     * Integration key from Duo Security authenticator
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("integrationKey")
    private final String integrationKey;

    /**
     * Integration key from Duo Security authenticator
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getIntegrationKey() {
        return integrationKey;
    }

    /**
     * Secret key from Duo Security authenticator
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretKey")
    private final String secretKey;

    /**
     * Secret key from Duo Security authenticator
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Attestation key to attest the request and response between Duo Security
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: never - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attestationKey")
    private final String attestationKey;

    /**
     * Attestation key to attest the request and response between Duo Security
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: never - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAttestationKey() {
        return attestationKey;
    }

    /**
     * Hostname to access the Duo security account
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apiHostname")
    private final String apiHostname;

    /**
     * Hostname to access the Duo security account
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getApiHostname() {
        return apiHostname;
    }

    /**
     * User attribute mapping value
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    public enum UserMappingAttribute implements com.oracle.bmc.http.internal.BmcEnum {
        PrimaryEmail("primaryEmail"),
        UserName("userName"),
        GivenName("givenName"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UserMappingAttribute.class);

        private final String value;
        private static java.util.Map<String, UserMappingAttribute> map;

        static {
            map = new java.util.HashMap<>();
            for (UserMappingAttribute v : UserMappingAttribute.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UserMappingAttribute(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UserMappingAttribute create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UserMappingAttribute', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * User attribute mapping value
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userMappingAttribute")
    private final UserMappingAttribute userMappingAttribute;

    /**
     * User attribute mapping value
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public UserMappingAttribute getUserMappingAttribute() {
        return userMappingAttribute;
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
        sb.append("AuthenticationFactorSettingsDuoSecuritySettings(");
        sb.append("super=").append(super.toString());
        sb.append("integrationKey=").append(String.valueOf(this.integrationKey));
        sb.append(", secretKey=").append(String.valueOf(this.secretKey));
        sb.append(", attestationKey=").append(String.valueOf(this.attestationKey));
        sb.append(", apiHostname=").append(String.valueOf(this.apiHostname));
        sb.append(", userMappingAttribute=").append(String.valueOf(this.userMappingAttribute));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationFactorSettingsDuoSecuritySettings)) {
            return false;
        }

        AuthenticationFactorSettingsDuoSecuritySettings other =
                (AuthenticationFactorSettingsDuoSecuritySettings) o;
        return java.util.Objects.equals(this.integrationKey, other.integrationKey)
                && java.util.Objects.equals(this.secretKey, other.secretKey)
                && java.util.Objects.equals(this.attestationKey, other.attestationKey)
                && java.util.Objects.equals(this.apiHostname, other.apiHostname)
                && java.util.Objects.equals(this.userMappingAttribute, other.userMappingAttribute)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.integrationKey == null ? 43 : this.integrationKey.hashCode());
        result = (result * PRIME) + (this.secretKey == null ? 43 : this.secretKey.hashCode());
        result =
                (result * PRIME)
                        + (this.attestationKey == null ? 43 : this.attestationKey.hashCode());
        result = (result * PRIME) + (this.apiHostname == null ? 43 : this.apiHostname.hashCode());
        result =
                (result * PRIME)
                        + (this.userMappingAttribute == null
                                ? 43
                                : this.userMappingAttribute.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
