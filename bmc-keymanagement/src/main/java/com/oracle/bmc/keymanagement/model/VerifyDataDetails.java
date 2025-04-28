/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The details of the message that you want to verify. <br>
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
        builder = VerifyDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VerifyDataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "keyId",
        "keyVersionId",
        "signature",
        "messageType",
        "message",
        "signingAlgorithm"
    })
    public VerifyDataDetails(
            String keyId,
            String keyVersionId,
            String signature,
            MessageType messageType,
            String message,
            SigningAlgorithm signingAlgorithm) {
        super();
        this.keyId = keyId;
        this.keyVersionId = keyVersionId;
        this.signature = signature;
        this.messageType = messageType;
        this.message = message;
        this.signingAlgorithm = signingAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the key used to sign the message. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the key used to sign the message.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** The OCID of the key version used to sign the message. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
        private String keyVersionId;

        /**
         * The OCID of the key version used to sign the message.
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
         * The base64-encoded binary data object denoting the cryptographic signature generated for
         * the message.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signature")
        private String signature;

        /**
         * The base64-encoded binary data object denoting the cryptographic signature generated for
         * the message.
         *
         * @param signature the value to set
         * @return this builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
            this.__explicitlySet__.add("signature");
            return this;
        }
        /**
         * Denotes whether the value of the message parameter is a raw message or a message digest.
         * The default value, {@code RAW}, indicates a message. To indicate a message digest, use
         * {@code DIGEST}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("messageType")
        private MessageType messageType;

        /**
         * Denotes whether the value of the message parameter is a raw message or a message digest.
         * The default value, {@code RAW}, indicates a message. To indicate a message digest, use
         * {@code DIGEST}.
         *
         * @param messageType the value to set
         * @return this builder
         */
        public Builder messageType(MessageType messageType) {
            this.messageType = messageType;
            this.__explicitlySet__.add("messageType");
            return this;
        }
        /**
         * The base64-encoded binary data object denoting the message or message digest to sign. You
         * can have a message up to 4096 bytes in size. To sign a larger message, provide the
         * message digest.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The base64-encoded binary data object denoting the message or message digest to sign. You
         * can have a message up to 4096 bytes in size. To sign a larger message, provide the
         * message digest.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * The algorithm to use to sign the message or message digest. For RSA keys, supported
         * signature schemes include PKCS #1 and RSASSA-PSS, along with different hashing
         * algorithms. For ECDSA keys, ECDSA is the supported signature scheme with different
         * hashing algorithms. When you pass a message digest for signing, ensure that you specify
         * the same hashing algorithm as used when creating the message digest.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
        private SigningAlgorithm signingAlgorithm;

        /**
         * The algorithm to use to sign the message or message digest. For RSA keys, supported
         * signature schemes include PKCS #1 and RSASSA-PSS, along with different hashing
         * algorithms. For ECDSA keys, ECDSA is the supported signature scheme with different
         * hashing algorithms. When you pass a message digest for signing, ensure that you specify
         * the same hashing algorithm as used when creating the message digest.
         *
         * @param signingAlgorithm the value to set
         * @return this builder
         */
        public Builder signingAlgorithm(SigningAlgorithm signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            this.__explicitlySet__.add("signingAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VerifyDataDetails build() {
            VerifyDataDetails model =
                    new VerifyDataDetails(
                            this.keyId,
                            this.keyVersionId,
                            this.signature,
                            this.messageType,
                            this.message,
                            this.signingAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VerifyDataDetails model) {
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyVersionId")) {
                this.keyVersionId(model.getKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("signature")) {
                this.signature(model.getSignature());
            }
            if (model.wasPropertyExplicitlySet("messageType")) {
                this.messageType(model.getMessageType());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("signingAlgorithm")) {
                this.signingAlgorithm(model.getSigningAlgorithm());
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

    /** The OCID of the key used to sign the message. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the key used to sign the message.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** The OCID of the key version used to sign the message. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    private final String keyVersionId;

    /**
     * The OCID of the key version used to sign the message.
     *
     * @return the value
     */
    public String getKeyVersionId() {
        return keyVersionId;
    }

    /**
     * The base64-encoded binary data object denoting the cryptographic signature generated for the
     * message.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    private final String signature;

    /**
     * The base64-encoded binary data object denoting the cryptographic signature generated for the
     * message.
     *
     * @return the value
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Denotes whether the value of the message parameter is a raw message or a message digest. The
     * default value, {@code RAW}, indicates a message. To indicate a message digest, use {@code
     * DIGEST}.
     */
    public enum MessageType implements com.oracle.bmc.http.internal.BmcEnum {
        Raw("RAW"),
        Digest("DIGEST"),
        ;

        private final String value;
        private static java.util.Map<String, MessageType> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageType v : MessageType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MessageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MessageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MessageType: " + key);
        }
    };
    /**
     * Denotes whether the value of the message parameter is a raw message or a message digest. The
     * default value, {@code RAW}, indicates a message. To indicate a message digest, use {@code
     * DIGEST}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("messageType")
    private final MessageType messageType;

    /**
     * Denotes whether the value of the message parameter is a raw message or a message digest. The
     * default value, {@code RAW}, indicates a message. To indicate a message digest, use {@code
     * DIGEST}.
     *
     * @return the value
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * The base64-encoded binary data object denoting the message or message digest to sign. You can
     * have a message up to 4096 bytes in size. To sign a larger message, provide the message
     * digest.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The base64-encoded binary data object denoting the message or message digest to sign. You can
     * have a message up to 4096 bytes in size. To sign a larger message, provide the message
     * digest.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /**
     * The algorithm to use to sign the message or message digest. For RSA keys, supported signature
     * schemes include PKCS #1 and RSASSA-PSS, along with different hashing algorithms. For ECDSA
     * keys, ECDSA is the supported signature scheme with different hashing algorithms. When you
     * pass a message digest for signing, ensure that you specify the same hashing algorithm as used
     * when creating the message digest.
     */
    public enum SigningAlgorithm implements com.oracle.bmc.http.internal.BmcEnum {
        Sha224RsaPkcsPss("SHA_224_RSA_PKCS_PSS"),
        Sha256RsaPkcsPss("SHA_256_RSA_PKCS_PSS"),
        Sha384RsaPkcsPss("SHA_384_RSA_PKCS_PSS"),
        Sha512RsaPkcsPss("SHA_512_RSA_PKCS_PSS"),
        Sha224RsaPkcs1V15("SHA_224_RSA_PKCS1_V1_5"),
        Sha256RsaPkcs1V15("SHA_256_RSA_PKCS1_V1_5"),
        Sha384RsaPkcs1V15("SHA_384_RSA_PKCS1_V1_5"),
        Sha512RsaPkcs1V15("SHA_512_RSA_PKCS1_V1_5"),
        EcdsaSha256("ECDSA_SHA_256"),
        EcdsaSha384("ECDSA_SHA_384"),
        EcdsaSha512("ECDSA_SHA_512"),
        ;

        private final String value;
        private static java.util.Map<String, SigningAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (SigningAlgorithm v : SigningAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        SigningAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SigningAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SigningAlgorithm: " + key);
        }
    };
    /**
     * The algorithm to use to sign the message or message digest. For RSA keys, supported signature
     * schemes include PKCS #1 and RSASSA-PSS, along with different hashing algorithms. For ECDSA
     * keys, ECDSA is the supported signature scheme with different hashing algorithms. When you
     * pass a message digest for signing, ensure that you specify the same hashing algorithm as used
     * when creating the message digest.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
    private final SigningAlgorithm signingAlgorithm;

    /**
     * The algorithm to use to sign the message or message digest. For RSA keys, supported signature
     * schemes include PKCS #1 and RSASSA-PSS, along with different hashing algorithms. For ECDSA
     * keys, ECDSA is the supported signature scheme with different hashing algorithms. When you
     * pass a message digest for signing, ensure that you specify the same hashing algorithm as used
     * when creating the message digest.
     *
     * @return the value
     */
    public SigningAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
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
        sb.append("VerifyDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyVersionId=").append(String.valueOf(this.keyVersionId));
        sb.append(", signature=").append(String.valueOf(this.signature));
        sb.append(", messageType=").append(String.valueOf(this.messageType));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", signingAlgorithm=").append(String.valueOf(this.signingAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerifyDataDetails)) {
            return false;
        }

        VerifyDataDetails other = (VerifyDataDetails) o;
        return java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyVersionId, other.keyVersionId)
                && java.util.Objects.equals(this.signature, other.signature)
                && java.util.Objects.equals(this.messageType, other.messageType)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.signingAlgorithm, other.signingAlgorithm)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.keyVersionId == null ? 43 : this.keyVersionId.hashCode());
        result = (result * PRIME) + (this.signature == null ? 43 : this.signature.hashCode());
        result = (result * PRIME) + (this.messageType == null ? 43 : this.messageType.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.signingAlgorithm == null ? 43 : this.signingAlgorithm.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
