/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details of each keytab entry read from the keytab file. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KerberosKeytabEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KerberosKeytabEntry
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"principal", "encryptionType", "keyVersionNumber"})
    public KerberosKeytabEntry(
            String principal, EncryptionType encryptionType, Long keyVersionNumber) {
        super();
        this.principal = principal;
        this.encryptionType = encryptionType;
        this.keyVersionNumber = keyVersionNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Keytab principal. */
        @com.fasterxml.jackson.annotation.JsonProperty("principal")
        private String principal;

        /**
         * Keytab principal.
         *
         * @param principal the value to set
         * @return this builder
         */
        public Builder principal(String principal) {
            this.principal = principal;
            this.__explicitlySet__.add("principal");
            return this;
        }
        /**
         * Encryption type with with keytab was generated. Secure: aes128-cts-hmac-sha256-128
         * Secure: aes256-cts-hmac-sha384-192 Less Secure: aes128-cts-hmac-sha1-96 Less Secure:
         * aes256-cts-hmac-sha1-96
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionType")
        private EncryptionType encryptionType;

        /**
         * Encryption type with with keytab was generated. Secure: aes128-cts-hmac-sha256-128
         * Secure: aes256-cts-hmac-sha384-192 Less Secure: aes128-cts-hmac-sha1-96 Less Secure:
         * aes256-cts-hmac-sha1-96
         *
         * @param encryptionType the value to set
         * @return this builder
         */
        public Builder encryptionType(EncryptionType encryptionType) {
            this.encryptionType = encryptionType;
            this.__explicitlySet__.add("encryptionType");
            return this;
        }
        /** Kerberos KVNO (key version number) for key in keytab entry. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionNumber")
        private Long keyVersionNumber;

        /**
         * Kerberos KVNO (key version number) for key in keytab entry.
         *
         * @param keyVersionNumber the value to set
         * @return this builder
         */
        public Builder keyVersionNumber(Long keyVersionNumber) {
            this.keyVersionNumber = keyVersionNumber;
            this.__explicitlySet__.add("keyVersionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KerberosKeytabEntry build() {
            KerberosKeytabEntry model =
                    new KerberosKeytabEntry(
                            this.principal, this.encryptionType, this.keyVersionNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KerberosKeytabEntry model) {
            if (model.wasPropertyExplicitlySet("principal")) {
                this.principal(model.getPrincipal());
            }
            if (model.wasPropertyExplicitlySet("encryptionType")) {
                this.encryptionType(model.getEncryptionType());
            }
            if (model.wasPropertyExplicitlySet("keyVersionNumber")) {
                this.keyVersionNumber(model.getKeyVersionNumber());
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

    /** Keytab principal. */
    @com.fasterxml.jackson.annotation.JsonProperty("principal")
    private final String principal;

    /**
     * Keytab principal.
     *
     * @return the value
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * Encryption type with with keytab was generated. Secure: aes128-cts-hmac-sha256-128 Secure:
     * aes256-cts-hmac-sha384-192 Less Secure: aes128-cts-hmac-sha1-96 Less Secure:
     * aes256-cts-hmac-sha1-96
     */
    public enum EncryptionType implements com.oracle.bmc.http.internal.BmcEnum {
        Aes128CtsHmacSha256128("AES128_CTS_HMAC_SHA256_128"),
        Aes256CtsHmacSha384192("AES256_CTS_HMAC_SHA384_192"),
        Aes128CtsHmacSha196("AES128_CTS_HMAC_SHA1_96"),
        Aes256CtsHmacSha196("AES256_CTS_HMAC_SHA1_96"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EncryptionType.class);

        private final String value;
        private static java.util.Map<String, EncryptionType> map;

        static {
            map = new java.util.HashMap<>();
            for (EncryptionType v : EncryptionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EncryptionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EncryptionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EncryptionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Encryption type with with keytab was generated. Secure: aes128-cts-hmac-sha256-128 Secure:
     * aes256-cts-hmac-sha384-192 Less Secure: aes128-cts-hmac-sha1-96 Less Secure:
     * aes256-cts-hmac-sha1-96
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionType")
    private final EncryptionType encryptionType;

    /**
     * Encryption type with with keytab was generated. Secure: aes128-cts-hmac-sha256-128 Secure:
     * aes256-cts-hmac-sha384-192 Less Secure: aes128-cts-hmac-sha1-96 Less Secure:
     * aes256-cts-hmac-sha1-96
     *
     * @return the value
     */
    public EncryptionType getEncryptionType() {
        return encryptionType;
    }

    /** Kerberos KVNO (key version number) for key in keytab entry. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionNumber")
    private final Long keyVersionNumber;

    /**
     * Kerberos KVNO (key version number) for key in keytab entry.
     *
     * @return the value
     */
    public Long getKeyVersionNumber() {
        return keyVersionNumber;
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
        sb.append("KerberosKeytabEntry(");
        sb.append("super=").append(super.toString());
        sb.append("principal=").append(String.valueOf(this.principal));
        sb.append(", encryptionType=").append(String.valueOf(this.encryptionType));
        sb.append(", keyVersionNumber=").append(String.valueOf(this.keyVersionNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KerberosKeytabEntry)) {
            return false;
        }

        KerberosKeytabEntry other = (KerberosKeytabEntry) o;
        return java.util.Objects.equals(this.principal, other.principal)
                && java.util.Objects.equals(this.encryptionType, other.encryptionType)
                && java.util.Objects.equals(this.keyVersionNumber, other.keyVersionNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.principal == null ? 43 : this.principal.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionType == null ? 43 : this.encryptionType.hashCode());
        result =
                (result * PRIME)
                        + (this.keyVersionNumber == null ? 43 : this.keyVersionNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
