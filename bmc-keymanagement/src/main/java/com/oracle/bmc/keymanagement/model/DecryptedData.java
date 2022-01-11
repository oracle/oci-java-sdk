/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DecryptedData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DecryptedData {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
        private String plaintext;

        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            this.__explicitlySet__.add("plaintext");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("plaintextChecksum")
        private String plaintextChecksum;

        public Builder plaintextChecksum(String plaintextChecksum) {
            this.plaintextChecksum = plaintextChecksum;
            this.__explicitlySet__.add("plaintextChecksum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
        private String keyVersionId;

        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            this.__explicitlySet__.add("keyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
        private EncryptionAlgorithm encryptionAlgorithm;

        public Builder encryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            this.__explicitlySet__.add("encryptionAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DecryptedData build() {
            DecryptedData __instance__ =
                    new DecryptedData(
                            plaintext, plaintextChecksum, keyId, keyVersionId, encryptionAlgorithm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DecryptedData o) {
            Builder copiedBuilder =
                    plaintext(o.getPlaintext())
                            .plaintextChecksum(o.getPlaintextChecksum())
                            .keyId(o.getKeyId())
                            .keyVersionId(o.getKeyVersionId())
                            .encryptionAlgorithm(o.getEncryptionAlgorithm());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The decrypted data, expressed as a base64-encoded value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
    String plaintext;

    /**
     * The checksum of the decrypted data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plaintextChecksum")
    String plaintextChecksum;

    /**
     * The OCID of the key used to encrypt the ciphertext.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    String keyId;

    /**
     * The OCID of the key version used to encrypt the ciphertext.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    String keyVersionId;
    /**
     * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key
     * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced Encryption Standard (AES) algorithm and
     * that the mode of encryption is the Galois/Counter Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the
     * key is an asymmetric key that uses the RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP).
     * {@code RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA encryption algorithm with a SHA-256 hash
     * and uses OAEP.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum EncryptionAlgorithm {
        Aes256Gcm("AES_256_GCM"),
        RsaOaepSha1("RSA_OAEP_SHA_1"),
        RsaOaepSha256("RSA_OAEP_SHA_256"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, EncryptionAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (EncryptionAlgorithm v : EncryptionAlgorithm.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EncryptionAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EncryptionAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EncryptionAlgorithm', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key
     * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced Encryption Standard (AES) algorithm and
     * that the mode of encryption is the Galois/Counter Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the
     * key is an asymmetric key that uses the RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP).
     * {@code RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA encryption algorithm with a SHA-256 hash
     * and uses OAEP.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    EncryptionAlgorithm encryptionAlgorithm;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
