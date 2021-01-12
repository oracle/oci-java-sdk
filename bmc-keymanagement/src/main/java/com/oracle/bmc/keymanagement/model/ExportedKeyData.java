/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The response to a request to export key material.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportedKeyData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExportedKeyData {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
        private String keyVersionId;

        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            this.__explicitlySet__.add("keyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptedKey")
        private String encryptedKey;

        public Builder encryptedKey(String encryptedKey) {
            this.encryptedKey = encryptedKey;
            this.__explicitlySet__.add("encryptedKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private Algorithm algorithm;

        public Builder algorithm(Algorithm algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportedKeyData build() {
            ExportedKeyData __instance__ =
                    new ExportedKeyData(
                            keyVersionId, keyId, timeCreated, vaultId, encryptedKey, algorithm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportedKeyData o) {
            Builder copiedBuilder =
                    keyVersionId(o.getKeyVersionId())
                            .keyId(o.getKeyId())
                            .timeCreated(o.getTimeCreated())
                            .vaultId(o.getVaultId())
                            .encryptedKey(o.getEncryptedKey())
                            .algorithm(o.getAlgorithm());

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
     * The OCID of the key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    String keyVersionId;

    /**
     * The OCID of the master encryption key associated with this key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    String keyId;

    /**
     * The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The OCID of the vault that contains this key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    String vaultId;

    /**
     * The base64-encoded exported key material, which is encrypted by using the public RSA wrapping key specified in the export request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptedKey")
    String encryptedKey;
    /**
     * The encryption algorithm to use to encrypt exportable key material from a key that persists on the server (as opposed to a key that
     * persists on a hardware security module and, therefore, cannot be exported). Specifying `RSA_OAEP_AES_SHA256` invokes the RSA AES key
     * wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping key provided along
     * with the request, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the exportable key material. The
     * wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly
     * represents them. Specifying `RSA_OAEP_SHA256` means that the exportable key material is wrapped by the RSA public wrapping key provided
     * along with the request.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Algorithm {
        RsaOaepAesSha256("RSA_OAEP_AES_SHA256"),
        RsaOaepSha256("RSA_OAEP_SHA256"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Algorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (Algorithm v : Algorithm.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Algorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Algorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Algorithm', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The encryption algorithm to use to encrypt exportable key material from a key that persists on the server (as opposed to a key that
     * persists on a hardware security module and, therefore, cannot be exported). Specifying `RSA_OAEP_AES_SHA256` invokes the RSA AES key
     * wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping key provided along
     * with the request, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the exportable key material. The
     * wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly
     * represents them. Specifying `RSA_OAEP_SHA256` means that the exportable key material is wrapped by the RSA public wrapping key provided
     * along with the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    Algorithm algorithm;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
