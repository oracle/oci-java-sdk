/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VerifyDataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class VerifyDataDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("signature")
        private String signature;

        public Builder signature(String signature) {
            this.signature = signature;
            this.__explicitlySet__.add("signature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("messageType")
        private MessageType messageType;

        public Builder messageType(MessageType messageType) {
            this.messageType = messageType;
            this.__explicitlySet__.add("messageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
        private SigningAlgorithm signingAlgorithm;

        public Builder signingAlgorithm(SigningAlgorithm signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            this.__explicitlySet__.add("signingAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VerifyDataDetails build() {
            VerifyDataDetails __instance__ =
                    new VerifyDataDetails(
                            keyId, keyVersionId, signature, messageType, message, signingAlgorithm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VerifyDataDetails o) {
            Builder copiedBuilder =
                    keyId(o.getKeyId())
                            .keyVersionId(o.getKeyVersionId())
                            .signature(o.getSignature())
                            .messageType(o.getMessageType())
                            .message(o.getMessage())
                            .signingAlgorithm(o.getSigningAlgorithm());

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
     * The OCID of the key used to sign the message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    String keyId;

    /**
     * The OCID of the key version used to sign the message.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    String keyVersionId;

    /**
     * The base64-encoded binary data object denoting the cryptographic signature generated for the message.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    String signature;
    /**
     * Denotes whether the value of the message parameter is a raw message or a message digest.
     * The default value, `RAW`, indicates a message. To indicate a message digest, use `DIGEST`.
     *
     **/
    public enum MessageType {
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
     * Denotes whether the value of the message parameter is a raw message or a message digest.
     * The default value, `RAW`, indicates a message. To indicate a message digest, use `DIGEST`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messageType")
    MessageType messageType;

    /**
     * The base64-encoded binary data object denoting the message or message digest to sign. You can have a message up to 4096 bytes in size. To sign a larger message, provide the message digest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    String message;
    /**
     * The algorithm to use to sign the message or message digest.
     * For RSA keys, supported signature schemes include PKCS #1 and RSASSA-PSS, along with
     * different hashing algorithms.
     * For ECDSA keys, ECDSA is the supported signature scheme with different hashing algorithms.
     * When you pass a message digest for signing, ensure that you specify the same hashing algorithm
     * as used when creating the message digest.
     *
     **/
    public enum SigningAlgorithm {
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
     * The algorithm to use to sign the message or message digest.
     * For RSA keys, supported signature schemes include PKCS #1 and RSASSA-PSS, along with
     * different hashing algorithms.
     * For ECDSA keys, ECDSA is the supported signature scheme with different hashing algorithms.
     * When you pass a message digest for signing, ensure that you specify the same hashing algorithm
     * as used when creating the message digest.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
    SigningAlgorithm signingAlgorithm;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
