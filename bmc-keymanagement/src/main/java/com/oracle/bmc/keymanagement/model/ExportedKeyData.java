/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportedKeyData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExportedKeyData extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "keyVersionId",
        "keyId",
        "timeCreated",
        "vaultId",
        "encryptedKey",
        "algorithm"
    })
    public ExportedKeyData(
            String keyVersionId,
            String keyId,
            java.util.Date timeCreated,
            String vaultId,
            String encryptedKey,
            Algorithm algorithm) {
        super();
        this.keyVersionId = keyVersionId;
        this.keyId = keyId;
        this.timeCreated = timeCreated;
        this.vaultId = vaultId;
        this.encryptedKey = encryptedKey;
        this.algorithm = algorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the key version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
        private String keyVersionId;

        /**
         * The OCID of the key version.
         * @param keyVersionId the value to set
         * @return this builder
         **/
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            this.__explicitlySet__.add("keyVersionId");
            return this;
        }
        /**
         * The OCID of the master encryption key associated with this key version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the master encryption key associated with this key version.
         * @param keyId the value to set
         * @return this builder
         **/
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /**
         * The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The OCID of the vault that contains this key version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The OCID of the vault that contains this key version.
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The base64-encoded exported key material, which is encrypted by using the public RSA wrapping key specified in the export request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("encryptedKey")
        private String encryptedKey;

        /**
         * The base64-encoded exported key material, which is encrypted by using the public RSA wrapping key specified in the export request.
         *
         * @param encryptedKey the value to set
         * @return this builder
         **/
        public Builder encryptedKey(String encryptedKey) {
            this.encryptedKey = encryptedKey;
            this.__explicitlySet__.add("encryptedKey");
            return this;
        }
        /**
         * The encryption algorithm to use to encrypt exportable key material from a key that persists on the server (as opposed to a key that
         * persists on a hardware security module and, therefore, cannot be exported). Specifying RSA_OAEP_AES_SHA256 invokes the RSA AES key
         * wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping key provided along
         * with the request, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the exportable key material. The
         * wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly
         * represents them. Specifying RSA_OAEP_SHA256 means that the exportable key material is wrapped by the RSA public wrapping key provided
         * along with the request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private Algorithm algorithm;

        /**
         * The encryption algorithm to use to encrypt exportable key material from a key that persists on the server (as opposed to a key that
         * persists on a hardware security module and, therefore, cannot be exported). Specifying RSA_OAEP_AES_SHA256 invokes the RSA AES key
         * wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping key provided along
         * with the request, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the exportable key material. The
         * wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly
         * represents them. Specifying RSA_OAEP_SHA256 means that the exportable key material is wrapped by the RSA public wrapping key provided
         * along with the request.
         *
         * @param algorithm the value to set
         * @return this builder
         **/
        public Builder algorithm(Algorithm algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportedKeyData build() {
            ExportedKeyData model =
                    new ExportedKeyData(
                            this.keyVersionId,
                            this.keyId,
                            this.timeCreated,
                            this.vaultId,
                            this.encryptedKey,
                            this.algorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportedKeyData model) {
            if (model.wasPropertyExplicitlySet("keyVersionId")) {
                this.keyVersionId(model.getKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("encryptedKey")) {
                this.encryptedKey(model.getEncryptedKey());
            }
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
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
     * The OCID of the key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    private final String keyVersionId;

    /**
     * The OCID of the key version.
     * @return the value
     **/
    public String getKeyVersionId() {
        return keyVersionId;
    }

    /**
     * The OCID of the master encryption key associated with this key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the master encryption key associated with this key version.
     * @return the value
     **/
    public String getKeyId() {
        return keyId;
    }

    /**
     * The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time this key version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The OCID of the vault that contains this key version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The OCID of the vault that contains this key version.
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The base64-encoded exported key material, which is encrypted by using the public RSA wrapping key specified in the export request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptedKey")
    private final String encryptedKey;

    /**
     * The base64-encoded exported key material, which is encrypted by using the public RSA wrapping key specified in the export request.
     *
     * @return the value
     **/
    public String getEncryptedKey() {
        return encryptedKey;
    }

    /**
     * The encryption algorithm to use to encrypt exportable key material from a key that persists on the server (as opposed to a key that
     * persists on a hardware security module and, therefore, cannot be exported). Specifying RSA_OAEP_AES_SHA256 invokes the RSA AES key
     * wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping key provided along
     * with the request, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the exportable key material. The
     * wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly
     * represents them. Specifying RSA_OAEP_SHA256 means that the exportable key material is wrapped by the RSA public wrapping key provided
     * along with the request.
     *
     **/
    public enum Algorithm {
        RsaOaepAesSha256("RSA_OAEP_AES_SHA256"),
        RsaOaepSha256("RSA_OAEP_SHA256"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Algorithm.class);

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
     * persists on a hardware security module and, therefore, cannot be exported). Specifying RSA_OAEP_AES_SHA256 invokes the RSA AES key
     * wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping key provided along
     * with the request, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the exportable key material. The
     * wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly
     * represents them. Specifying RSA_OAEP_SHA256 means that the exportable key material is wrapped by the RSA public wrapping key provided
     * along with the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final Algorithm algorithm;

    /**
     * The encryption algorithm to use to encrypt exportable key material from a key that persists on the server (as opposed to a key that
     * persists on a hardware security module and, therefore, cannot be exported). Specifying RSA_OAEP_AES_SHA256 invokes the RSA AES key
     * wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping key provided along
     * with the request, creating a wrapped temporary AES key. The temporary AES key is also used to wrap the exportable key material. The
     * wrapped temporary AES key and the wrapped exportable key material are concatenated, producing concatenated blob output that jointly
     * represents them. Specifying RSA_OAEP_SHA256 means that the exportable key material is wrapped by the RSA public wrapping key provided
     * along with the request.
     *
     * @return the value
     **/
    public Algorithm getAlgorithm() {
        return algorithm;
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
        sb.append("ExportedKeyData(");
        sb.append("super=").append(super.toString());
        sb.append("keyVersionId=").append(String.valueOf(this.keyVersionId));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", encryptedKey=").append(String.valueOf(this.encryptedKey));
        sb.append(", algorithm=").append(String.valueOf(this.algorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportedKeyData)) {
            return false;
        }

        ExportedKeyData other = (ExportedKeyData) o;
        return java.util.Objects.equals(this.keyVersionId, other.keyVersionId)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.encryptedKey, other.encryptedKey)
                && java.util.Objects.equals(this.algorithm, other.algorithm)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyVersionId == null ? 43 : this.keyVersionId.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.encryptedKey == null ? 43 : this.encryptedKey.hashCode());
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
