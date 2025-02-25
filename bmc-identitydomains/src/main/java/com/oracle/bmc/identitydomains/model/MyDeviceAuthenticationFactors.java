/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Authentication Factors
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
    builder = MyDeviceAuthenticationFactors.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MyDeviceAuthenticationFactors
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "status", "publicKey"})
    public MyDeviceAuthenticationFactors(Type type, Status status, String publicKey) {
        super();
        this.type = type;
        this.status = status;
        this.publicKey = publicKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Authentication Factor Type
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Authentication Factor Type
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Authentication Factor Status
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Authentication Factor Status
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Authentication Factor public key issued by client
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        /**
         * Authentication Factor public key issued by client
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         * @param publicKey the value to set
         * @return this builder
         **/
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyDeviceAuthenticationFactors build() {
            MyDeviceAuthenticationFactors model =
                    new MyDeviceAuthenticationFactors(this.type, this.status, this.publicKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyDeviceAuthenticationFactors model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("publicKey")) {
                this.publicKey(model.getPublicKey());
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
     * Authentication Factor Type
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     **/
    public enum Type {
        Email("EMAIL"),
        Sms("SMS"),
        Totp("TOTP"),
        Push("PUSH"),
        Offlinetotp("OFFLINETOTP"),
        Voice("VOICE"),
        PhoneCall("PHONE_CALL"),
        Thirdparty("THIRDPARTY"),
        FidoAuthenticator("FIDO_AUTHENTICATOR"),
        YubicoOtp("YUBICO_OTP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Authentication Factor Type
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Authentication Factor Type
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * Authentication Factor Status
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     **/
    public enum Status {
        Initiated("INITIATED"),
        Inprogress("INPROGRESS"),
        Enrolled("ENROLLED"),
        Locked("LOCKED"),
        Inactive("INACTIVE"),
        Blocked("BLOCKED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Authentication Factor Status
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Authentication Factor Status
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Authentication Factor public key issued by client
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    private final String publicKey;

    /**
     * Authentication Factor public key issued by client
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     * @return the value
     **/
    public String getPublicKey() {
        return publicKey;
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
        sb.append("MyDeviceAuthenticationFactors(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", publicKey=").append(String.valueOf(this.publicKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyDeviceAuthenticationFactors)) {
            return false;
        }

        MyDeviceAuthenticationFactors other = (MyDeviceAuthenticationFactors) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.publicKey, other.publicKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.publicKey == null ? 43 : this.publicKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
