/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DecryptDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DecryptDataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "associatedData",
        "ciphertext",
        "keyId",
        "loggingContext",
        "keyVersionId",
        "encryptionAlgorithm"
    })
    public DecryptDataDetails(
            java.util.Map<String, String> associatedData,
            String ciphertext,
            String keyId,
            java.util.Map<String, String> loggingContext,
            String keyVersionId,
            EncryptionAlgorithm encryptionAlgorithm) {
        super();
        this.associatedData = associatedData;
        this.ciphertext = ciphertext;
        this.keyId = keyId;
        this.loggingContext = loggingContext;
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
        /** The encrypted data to decrypt. */
        @com.fasterxml.jackson.annotation.JsonProperty("ciphertext")
        private String ciphertext;

        /**
         * The encrypted data to decrypt.
         *
         * @param ciphertext the value to set
         * @return this builder
         */
        public Builder ciphertext(String ciphertext) {
            this.ciphertext = ciphertext;
            this.__explicitlySet__.add("ciphertext");
            return this;
        }
        /** The OCID of the key used to encrypt the ciphertext. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the key used to encrypt the ciphertext.
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
         * as key-value pairs to include in audit logs when audit logging is enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loggingContext")
        private java.util.Map<String, String> loggingContext;

        /**
         * Information that provides context for audit logging. You can provide this additional data
         * as key-value pairs to include in audit logs when audit logging is enabled.
         *
         * @param loggingContext the value to set
         * @return this builder
         */
        public Builder loggingContext(java.util.Map<String, String> loggingContext) {
            this.loggingContext = loggingContext;
            this.__explicitlySet__.add("loggingContext");
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
         * The encryption algorithm to use to encrypt or decrypt data with a customer-managed key.
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
         * The encryption algorithm to use to encrypt or decrypt data with a customer-managed key.
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

        public DecryptDataDetails build() {
            DecryptDataDetails model =
                    new DecryptDataDetails(
                            this.associatedData,
                            this.ciphertext,
                            this.keyId,
                            this.loggingContext,
                            this.keyVersionId,
                            this.encryptionAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DecryptDataDetails model) {
            if (model.wasPropertyExplicitlySet("associatedData")) {
                this.associatedData(model.getAssociatedData());
            }
            if (model.wasPropertyExplicitlySet("ciphertext")) {
                this.ciphertext(model.getCiphertext());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("loggingContext")) {
                this.loggingContext(model.getLoggingContext());
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

    /** The encrypted data to decrypt. */
    @com.fasterxml.jackson.annotation.JsonProperty("ciphertext")
    private final String ciphertext;

    /**
     * The encrypted data to decrypt.
     *
     * @return the value
     */
    public String getCiphertext() {
        return ciphertext;
    }

    /** The OCID of the key used to encrypt the ciphertext. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the key used to encrypt the ciphertext.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Information that provides context for audit logging. You can provide this additional data as
     * key-value pairs to include in audit logs when audit logging is enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loggingContext")
    private final java.util.Map<String, String> loggingContext;

    /**
     * Information that provides context for audit logging. You can provide this additional data as
     * key-value pairs to include in audit logs when audit logging is enabled.
     *
     * @return the value
     */
    public java.util.Map<String, String> getLoggingContext() {
        return loggingContext;
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
     * The encryption algorithm to use to encrypt or decrypt data with a customer-managed key.
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
     * The encryption algorithm to use to encrypt or decrypt data with a customer-managed key.
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
     * The encryption algorithm to use to encrypt or decrypt data with a customer-managed key.
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
        sb.append("DecryptDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("associatedData=").append(String.valueOf(this.associatedData));
        sb.append(", ciphertext=").append(String.valueOf(this.ciphertext));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", loggingContext=").append(String.valueOf(this.loggingContext));
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
        if (!(o instanceof DecryptDataDetails)) {
            return false;
        }

        DecryptDataDetails other = (DecryptDataDetails) o;
        return java.util.Objects.equals(this.associatedData, other.associatedData)
                && java.util.Objects.equals(this.ciphertext, other.ciphertext)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.loggingContext, other.loggingContext)
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
        result = (result * PRIME) + (this.ciphertext == null ? 43 : this.ciphertext.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result =
                (result * PRIME)
                        + (this.loggingContext == null ? 43 : this.loggingContext.hashCode());
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
