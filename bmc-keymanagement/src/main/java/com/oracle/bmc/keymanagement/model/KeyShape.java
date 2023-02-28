/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The cryptographic properties of a key. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KeyShape.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class KeyShape extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"algorithm", "length", "curveId"})
    public KeyShape(Algorithm algorithm, Integer length, CurveId curveId) {
        super();
        this.algorithm = algorithm;
        this.length = length;
        this.curveId = curveId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The algorithm used by a key's key versions to encrypt or decrypt. */
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private Algorithm algorithm;

        /**
         * The algorithm used by a key's key versions to encrypt or decrypt.
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
         * The length of the key in bytes, expressed as an integer. Supported values include the
         * following: - AES: 16, 24, or 32 - RSA: 256, 384, or 512 - ECDSA: 32, 48, or 66
         */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        /**
         * The length of the key in bytes, expressed as an integer. Supported values include the
         * following: - AES: 16, 24, or 32 - RSA: 256, 384, or 512 - ECDSA: 32, 48, or 66
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /** Supported curve IDs for ECDSA keys. */
        @com.fasterxml.jackson.annotation.JsonProperty("curveId")
        private CurveId curveId;

        /**
         * Supported curve IDs for ECDSA keys.
         *
         * @param curveId the value to set
         * @return this builder
         */
        public Builder curveId(CurveId curveId) {
            this.curveId = curveId;
            this.__explicitlySet__.add("curveId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyShape build() {
            KeyShape model = new KeyShape(this.algorithm, this.length, this.curveId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyShape model) {
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("curveId")) {
                this.curveId(model.getCurveId());
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

    /** The algorithm used by a key's key versions to encrypt or decrypt. */
    public enum Algorithm implements com.oracle.bmc.http.internal.BmcEnum {
        Aes("AES"),
        Rsa("RSA"),
        Ecdsa("ECDSA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The algorithm used by a key's key versions to encrypt or decrypt. */
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final Algorithm algorithm;

    /**
     * The algorithm used by a key's key versions to encrypt or decrypt.
     *
     * @return the value
     */
    public Algorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * The length of the key in bytes, expressed as an integer. Supported values include the
     * following: - AES: 16, 24, or 32 - RSA: 256, 384, or 512 - ECDSA: 32, 48, or 66
     */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    /**
     * The length of the key in bytes, expressed as an integer. Supported values include the
     * following: - AES: 16, 24, or 32 - RSA: 256, 384, or 512 - ECDSA: 32, 48, or 66
     *
     * @return the value
     */
    public Integer getLength() {
        return length;
    }

    /** Supported curve IDs for ECDSA keys. */
    public enum CurveId implements com.oracle.bmc.http.internal.BmcEnum {
        NistP256("NIST_P256"),
        NistP384("NIST_P384"),
        NistP521("NIST_P521"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CurveId.class);

        private final String value;
        private static java.util.Map<String, CurveId> map;

        static {
            map = new java.util.HashMap<>();
            for (CurveId v : CurveId.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CurveId(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CurveId create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CurveId', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Supported curve IDs for ECDSA keys. */
    @com.fasterxml.jackson.annotation.JsonProperty("curveId")
    private final CurveId curveId;

    /**
     * Supported curve IDs for ECDSA keys.
     *
     * @return the value
     */
    public CurveId getCurveId() {
        return curveId;
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
        sb.append("KeyShape(");
        sb.append("super=").append(super.toString());
        sb.append("algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", curveId=").append(String.valueOf(this.curveId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyShape)) {
            return false;
        }

        KeyShape other = (KeyShape) o;
        return java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.curveId, other.curveId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.curveId == null ? 43 : this.curveId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
