/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes used to manage Passwordless-Factor Authentication within a
 * service provider. The extension is typically applied to a User resource, but MAY be applied to
 * other resources that use MFA. <br>
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
        builder = ExtensionPasswordlessUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionPasswordlessUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"factorType", "factorMethod", "factorIdentifier"})
    public ExtensionPasswordlessUser(
            FactorType factorType, String factorMethod, UserExtFactorIdentifier factorIdentifier) {
        super();
        this.factorType = factorType;
        this.factorMethod = factorMethod;
        this.factorIdentifier = factorIdentifier;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Authentication Factor Type
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("factorType")
        private FactorType factorType;

        /**
         * Authentication Factor Type
         *
         * <p>*Added In:** 20.1.3
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param factorType the value to set
         * @return this builder
         */
        public Builder factorType(FactorType factorType) {
            this.factorType = factorType;
            this.__explicitlySet__.add("factorType");
            return this;
        }
        /**
         * Authentication Factor Method
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("factorMethod")
        private String factorMethod;

        /**
         * Authentication Factor Method
         *
         * <p>*Added In:** 2009232244
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param factorMethod the value to set
         * @return this builder
         */
        public Builder factorMethod(String factorMethod) {
            this.factorMethod = factorMethod;
            this.__explicitlySet__.add("factorMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("factorIdentifier")
        private UserExtFactorIdentifier factorIdentifier;

        public Builder factorIdentifier(UserExtFactorIdentifier factorIdentifier) {
            this.factorIdentifier = factorIdentifier;
            this.__explicitlySet__.add("factorIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionPasswordlessUser build() {
            ExtensionPasswordlessUser model =
                    new ExtensionPasswordlessUser(
                            this.factorType, this.factorMethod, this.factorIdentifier);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionPasswordlessUser model) {
            if (model.wasPropertyExplicitlySet("factorType")) {
                this.factorType(model.getFactorType());
            }
            if (model.wasPropertyExplicitlySet("factorMethod")) {
                this.factorMethod(model.getFactorMethod());
            }
            if (model.wasPropertyExplicitlySet("factorIdentifier")) {
                this.factorIdentifier(model.getFactorIdentifier());
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
     * Authentication Factor Type
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum FactorType implements com.oracle.bmc.http.internal.BmcEnum {
        Email("EMAIL"),
        Sms("SMS"),
        PhoneCall("PHONE_CALL"),
        Totp("TOTP"),
        Push("PUSH"),
        Offlinetotp("OFFLINETOTP"),
        SecurityQuestions("SECURITY_QUESTIONS"),
        Voice("VOICE"),
        UsernamePassword("USERNAME_PASSWORD"),
        Thirdparty("THIRDPARTY"),
        FidoAuthenticator("FIDO_AUTHENTICATOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FactorType.class);

        private final String value;
        private static java.util.Map<String, FactorType> map;

        static {
            map = new java.util.HashMap<>();
            for (FactorType v : FactorType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FactorType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FactorType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FactorType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Authentication Factor Type
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("factorType")
    private final FactorType factorType;

    /**
     * Authentication Factor Type
     *
     * <p>*Added In:** 20.1.3
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public FactorType getFactorType() {
        return factorType;
    }

    /**
     * Authentication Factor Method
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("factorMethod")
    private final String factorMethod;

    /**
     * Authentication Factor Method
     *
     * <p>*Added In:** 2009232244
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getFactorMethod() {
        return factorMethod;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("factorIdentifier")
    private final UserExtFactorIdentifier factorIdentifier;

    public UserExtFactorIdentifier getFactorIdentifier() {
        return factorIdentifier;
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
        sb.append("ExtensionPasswordlessUser(");
        sb.append("super=").append(super.toString());
        sb.append("factorType=").append(String.valueOf(this.factorType));
        sb.append(", factorMethod=").append(String.valueOf(this.factorMethod));
        sb.append(", factorIdentifier=").append(String.valueOf(this.factorIdentifier));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionPasswordlessUser)) {
            return false;
        }

        ExtensionPasswordlessUser other = (ExtensionPasswordlessUser) o;
        return java.util.Objects.equals(this.factorType, other.factorType)
                && java.util.Objects.equals(this.factorMethod, other.factorMethod)
                && java.util.Objects.equals(this.factorIdentifier, other.factorIdentifier)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.factorType == null ? 43 : this.factorType.hashCode());
        result = (result * PRIME) + (this.factorMethod == null ? 43 : this.factorMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.factorIdentifier == null ? 43 : this.factorIdentifier.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
