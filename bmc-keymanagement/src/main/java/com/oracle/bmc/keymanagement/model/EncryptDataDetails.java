/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The details of the plaintext data that you want to encrypt. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EncryptDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EncryptDataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "associatedData",
        "keyId",
        "loggingContext",
        "plaintext",
        "keyVersionId",
        "encryptionAlgorithm"
    })
    public EncryptDataDetails(
            java.util.Map<String, String> associatedData,
            String keyId,
            java.util.Map<String, String> loggingContext,
            String plaintext,
            String keyVersionId,
            EncryptionAlgorithm encryptionAlgorithm) {
        super();
        this.associatedData = associatedData;
        this.keyId = keyId;
        this.loggingContext = loggingContext;
        this.plaintext = plaintext;
        this.keyVersionId = keyVersionId;
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Information that can be used to provide an encryption context for the encrypted data. The
         * length of the string representation of the associated data must be fewer than 4096
         * characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedData")
        private java.util.Map<String, String> associatedData;

        /**
         * Information that can be used to provide an encryption context for the encrypted data. The
         * length of the string representation of the associated data must be fewer than 4096
         * characters.
         *
         * @param associatedData the value to set
         * @return this builder
         */
        public Builder associatedData(java.util.Map<String, String> associatedData) {
            this.associatedData = associatedData;
            this.__explicitlySet__.add("associatedData");
            return this;
        }
        /** The OCID of the key to encrypt with. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the key to encrypt with.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /**
         * Information that provides context for audit logging. You can provide this additional data
         * as key-value pairs to include in the audit logs when audit logging is enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loggingContext")
        private java.util.Map<String, String> loggingContext;

        /**
         * Information that provides context for audit logging. You can provide this additional data
         * as key-value pairs to include in the audit logs when audit logging is enabled.
         *
         * @param loggingContext the value to set
         * @return this builder
         */
        public Builder loggingContext(java.util.Map<String, String> loggingContext) {
            this.loggingContext = loggingContext;
            this.__explicitlySet__.add("loggingContext");
            return this;
        }
        /** The plaintext data to encrypt. */
        @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
        private String plaintext;

        /**
         * The plaintext data to encrypt.
         *
         * @param plaintext the value to set
         * @return this builder
         */
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            this.__explicitlySet__.add("plaintext");
            return this;
        }
        /** The OCID of the key version used to encrypt the ciphertext. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
        private String keyVersionId;

        /**
         * The OCID of the key version used to encrypt the ciphertext.
         *
         * @param keyVersionId the value to set
         * @return this builder
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            this.__explicitlySet__.add("keyVersionId");
            return this;
        }
        /**
         * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key.
         * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
         * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
         * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses
         * the RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP).
         * {@code RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA
         * encryption algorithm with a SHA-256 hash and uses OAEP.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
        private EncryptionAlgorithm encryptionAlgorithm;

        /**
         * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key.
         * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
         * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
         * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses
         * the RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP).
         * {@code RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA
         * encryption algorithm with a SHA-256 hash and uses OAEP.
         *
         * @param encryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder encryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            this.__explicitlySet__.add("encryptionAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EncryptDataDetails build() {
            EncryptDataDetails model =
                    new EncryptDataDetails(
                            this.associatedData,
                            this.keyId,
                            this.loggingContext,
                            this.plaintext,
                            this.keyVersionId,
                            this.encryptionAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EncryptDataDetails model) {
            if (model.wasPropertyExplicitlySet("associatedData")) {
                this.associatedData(model.getAssociatedData());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("loggingContext")) {
                this.loggingContext(model.getLoggingContext());
            }
            if (model.wasPropertyExplicitlySet("plaintext")) {
                this.plaintext(model.getPlaintext());
            }
            if (model.wasPropertyExplicitlySet("keyVersionId")) {
                this.keyVersionId(model.getKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("encryptionAlgorithm")) {
                this.encryptionAlgorithm(model.getEncryptionAlgorithm());
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
     * Information that can be used to provide an encryption context for the encrypted data. The
     * length of the string representation of the associated data must be fewer than 4096
     * characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedData")
    private final java.util.Map<String, String> associatedData;

    /**
     * Information that can be used to provide an encryption context for the encrypted data. The
     * length of the string representation of the associated data must be fewer than 4096
     * characters.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAssociatedData() {
        return associatedData;
    }

    /** The OCID of the key to encrypt with. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the key to encrypt with.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Information that provides context for audit logging. You can provide this additional data as
     * key-value pairs to include in the audit logs when audit logging is enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loggingContext")
    private final java.util.Map<String, String> loggingContext;

    /**
     * Information that provides context for audit logging. You can provide this additional data as
     * key-value pairs to include in the audit logs when audit logging is enabled.
     *
     * @return the value
     */
    public java.util.Map<String, String> getLoggingContext() {
        return loggingContext;
    }

    /** The plaintext data to encrypt. */
    @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
    private final String plaintext;

    /**
     * The plaintext data to encrypt.
     *
     * @return the value
     */
    public String getPlaintext() {
        return plaintext;
    }

    /** The OCID of the key version used to encrypt the ciphertext. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    private final String keyVersionId;

    /**
     * The OCID of the key version used to encrypt the ciphertext.
     *
     * @return the value
     */
    public String getKeyVersionId() {
        return keyVersionId;
    }

    /**
     * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key.
     * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
     * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
     * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses the
     * RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP). {@code
     * RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA encryption
     * algorithm with a SHA-256 hash and uses OAEP.
     */
    public enum EncryptionAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        Aes256Gcm("AES_256_GCM"),
        RsaOaepSha1("RSA_OAEP_SHA_1"),
        RsaOaepSha256("RSA_OAEP_SHA_256"),
        ;

        private final String value;
        private static java.util.Map<String, EncryptionAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (EncryptionAlgorithm v : EncryptionAlgorithm.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid EncryptionAlgorithm: " + key);
        }
    };
    /**
     * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key.
     * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
     * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
     * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses the
     * RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP). {@code
     * RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA encryption
     * algorithm with a SHA-256 hash and uses OAEP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithm")
    private final EncryptionAlgorithm encryptionAlgorithm;

    /**
     * The encryption algorithm to use to encrypt and decrypt data with a customer-managed key.
     * {@code AES_256_GCM} indicates that the key is a symmetric key that uses the Advanced
     * Encryption Standard (AES) algorithm and that the mode of encryption is the Galois/Counter
     * Mode (GCM). {@code RSA_OAEP_SHA_1} indicates that the key is an asymmetric key that uses the
     * RSA encryption algorithm and uses Optimal Asymmetric Encryption Padding (OAEP). {@code
     * RSA_OAEP_SHA_256} indicates that the key is an asymmetric key that uses the RSA encryption
     * algorithm with a SHA-256 hash and uses OAEP.
     *
     * @return the value
     */
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return encryptionAlgorithm;
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
        sb.append("EncryptDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("associatedData=").append(String.valueOf(this.associatedData));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", loggingContext=").append(String.valueOf(this.loggingContext));
        sb.append(", plaintext=").append(String.valueOf(this.plaintext));
        sb.append(", keyVersionId=").append(String.valueOf(this.keyVersionId));
        sb.append(", encryptionAlgorithm=").append(String.valueOf(this.encryptionAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EncryptDataDetails)) {
            return false;
        }

        EncryptDataDetails other = (EncryptDataDetails) o;
        return java.util.Objects.equals(this.associatedData, other.associatedData)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.loggingContext, other.loggingContext)
                && java.util.Objects.equals(this.plaintext, other.plaintext)
                && java.util.Objects.equals(this.keyVersionId, other.keyVersionId)
                && java.util.Objects.equals(this.encryptionAlgorithm, other.encryptionAlgorithm)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.associatedData == null ? 43 : this.associatedData.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result =
                (result * PRIME)
                        + (this.loggingContext == null ? 43 : this.loggingContext.hashCode());
        result = (result * PRIME) + (this.plaintext == null ? 43 : this.plaintext.hashCode());
        result = (result * PRIME) + (this.keyVersionId == null ? 43 : this.keyVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionAlgorithm == null
                                ? 43
                                : this.encryptionAlgorithm.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
