/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The details of the key that you want to wrap and export. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExportKeyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "keyId",
        "keyVersionId",
        "algorithm",
        "publicKey",
        "loggingContext"
    })
    public ExportKeyDetails(
            String keyId,
            String keyVersionId,
            Algorithm algorithm,
            String publicKey,
            java.util.Map<String, String> loggingContext) {
        super();
        this.keyId = keyId;
        this.keyVersionId = keyVersionId;
        this.algorithm = algorithm;
        this.publicKey = publicKey;
        this.loggingContext = loggingContext;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the master encryption key associated with the key version you want to export.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the master encryption key associated with the key version you want to export.
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
         * The OCID of the specific key version to export. If not specified, the service exports the
         * current key version.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
        private String keyVersionId;

        /**
         * The OCID of the specific key version to export. If not specified, the service exports the
         * current key version.
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
         * The encryption algorithm to use to encrypt exportable key material from a software-backed
         * key. Specifying {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which
         * generates a temporary AES key. The temporary AES key is wrapped by the RSA public
         * wrapping key provided along with the request, creating a wrapped temporary AES key. The
         * temporary AES key is also used to wrap the exportable key material. The wrapped temporary
         * AES key and the wrapped exportable key material are concatenated, producing concatenated
         * blob output that jointly represents them. Specifying {@code RSA_OAEP_SHA256} means that
         * the software key is wrapped by the RSA public wrapping key provided along with the
         * request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private Algorithm algorithm;

        /**
         * The encryption algorithm to use to encrypt exportable key material from a software-backed
         * key. Specifying {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which
         * generates a temporary AES key. The temporary AES key is wrapped by the RSA public
         * wrapping key provided along with the request, creating a wrapped temporary AES key. The
         * temporary AES key is also used to wrap the exportable key material. The wrapped temporary
         * AES key and the wrapped exportable key material are concatenated, producing concatenated
         * blob output that jointly represents them. Specifying {@code RSA_OAEP_SHA256} means that
         * the software key is wrapped by the RSA public wrapping key provided along with the
         * request.
         *
         * @param algorithm the value to set
         * @return this builder
         */
        public Builder algorithm(Algorithm algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }
        /**
         * The PEM format of the 2048-bit, 3072-bit, or 4096-bit RSA wrapping key in your possession
         * that you want to use to encrypt the key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        /**
         * The PEM format of the 2048-bit, 3072-bit, or 4096-bit RSA wrapping key in your possession
         * that you want to use to encrypt the key.
         *
         * @param publicKey the value to set
         * @return this builder
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportKeyDetails build() {
            ExportKeyDetails model =
                    new ExportKeyDetails(
                            this.keyId,
                            this.keyVersionId,
                            this.algorithm,
                            this.publicKey,
                            this.loggingContext);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportKeyDetails model) {
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyVersionId")) {
                this.keyVersionId(model.getKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("publicKey")) {
                this.publicKey(model.getPublicKey());
            }
            if (model.wasPropertyExplicitlySet("loggingContext")) {
                this.loggingContext(model.getLoggingContext());
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

    /** The OCID of the master encryption key associated with the key version you want to export. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the master encryption key associated with the key version you want to export.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * The OCID of the specific key version to export. If not specified, the service exports the
     * current key version.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    private final String keyVersionId;

    /**
     * The OCID of the specific key version to export. If not specified, the service exports the
     * current key version.
     *
     * @return the value
     */
    public String getKeyVersionId() {
        return keyVersionId;
    }

    /**
     * The encryption algorithm to use to encrypt exportable key material from a software-backed
     * key. Specifying {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which
     * generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping
     * key provided along with the request, creating a wrapped temporary AES key. The temporary AES
     * key is also used to wrap the exportable key material. The wrapped temporary AES key and the
     * wrapped exportable key material are concatenated, producing concatenated blob output that
     * jointly represents them. Specifying {@code RSA_OAEP_SHA256} means that the software key is
     * wrapped by the RSA public wrapping key provided along with the request.
     */
    public enum Algorithm implements com.oracle.bmc.http.internal.BmcEnum {
        RsaOaepAesSha256("RSA_OAEP_AES_SHA256"),
        RsaOaepSha256("RSA_OAEP_SHA256"),
        ;

        private final String value;
        private static java.util.Map<String, Algorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (Algorithm v : Algorithm.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Algorithm: " + key);
        }
    };
    /**
     * The encryption algorithm to use to encrypt exportable key material from a software-backed
     * key. Specifying {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which
     * generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping
     * key provided along with the request, creating a wrapped temporary AES key. The temporary AES
     * key is also used to wrap the exportable key material. The wrapped temporary AES key and the
     * wrapped exportable key material are concatenated, producing concatenated blob output that
     * jointly represents them. Specifying {@code RSA_OAEP_SHA256} means that the software key is
     * wrapped by the RSA public wrapping key provided along with the request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final Algorithm algorithm;

    /**
     * The encryption algorithm to use to encrypt exportable key material from a software-backed
     * key. Specifying {@code RSA_OAEP_AES_SHA256} invokes the RSA AES key wrap mechanism, which
     * generates a temporary AES key. The temporary AES key is wrapped by the RSA public wrapping
     * key provided along with the request, creating a wrapped temporary AES key. The temporary AES
     * key is also used to wrap the exportable key material. The wrapped temporary AES key and the
     * wrapped exportable key material are concatenated, producing concatenated blob output that
     * jointly represents them. Specifying {@code RSA_OAEP_SHA256} means that the software key is
     * wrapped by the RSA public wrapping key provided along with the request.
     *
     * @return the value
     */
    public Algorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * The PEM format of the 2048-bit, 3072-bit, or 4096-bit RSA wrapping key in your possession
     * that you want to use to encrypt the key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    private final String publicKey;

    /**
     * The PEM format of the 2048-bit, 3072-bit, or 4096-bit RSA wrapping key in your possession
     * that you want to use to encrypt the key.
     *
     * @return the value
     */
    public String getPublicKey() {
        return publicKey;
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
        sb.append("ExportKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyVersionId=").append(String.valueOf(this.keyVersionId));
        sb.append(", algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", publicKey=").append(String.valueOf(this.publicKey));
        sb.append(", loggingContext=").append(String.valueOf(this.loggingContext));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportKeyDetails)) {
            return false;
        }

        ExportKeyDetails other = (ExportKeyDetails) o;
        return java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyVersionId, other.keyVersionId)
                && java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.publicKey, other.publicKey)
                && java.util.Objects.equals(this.loggingContext, other.loggingContext)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.keyVersionId == null ? 43 : this.keyVersionId.hashCode());
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.publicKey == null ? 43 : this.publicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.loggingContext == null ? 43 : this.loggingContext.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
