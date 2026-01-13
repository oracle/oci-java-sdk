/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * Information about the public key and the algorithm used by the public key. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = Certificate_publicKeyInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Certificate_publicKeyInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"algorithm", "exponent", "keySize"})
    public Certificate_publicKeyInfo(String algorithm, Integer exponent, Integer keySize) {
        super();
        this.algorithm = algorithm;
        this.exponent = exponent;
        this.keySize = keySize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The algorithm identifier and parameters for the public key. */
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private String algorithm;

        /**
         * The algorithm identifier and parameters for the public key.
         *
         * @param algorithm the value to set
         * @return this builder
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }
        /** The private key exponent. */
        @com.fasterxml.jackson.annotation.JsonProperty("exponent")
        private Integer exponent;

        /**
         * The private key exponent.
         *
         * @param exponent the value to set
         * @return this builder
         */
        public Builder exponent(Integer exponent) {
            this.exponent = exponent;
            this.__explicitlySet__.add("exponent");
            return this;
        }
        /** The number of bits in a key used by a cryptographic algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("keySize")
        private Integer keySize;

        /**
         * The number of bits in a key used by a cryptographic algorithm.
         *
         * @param keySize the value to set
         * @return this builder
         */
        public Builder keySize(Integer keySize) {
            this.keySize = keySize;
            this.__explicitlySet__.add("keySize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Certificate_publicKeyInfo build() {
            Certificate_publicKeyInfo model =
                    new Certificate_publicKeyInfo(this.algorithm, this.exponent, this.keySize);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Certificate_publicKeyInfo model) {
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("exponent")) {
                this.exponent(model.getExponent());
            }
            if (model.wasPropertyExplicitlySet("keySize")) {
                this.keySize(model.getKeySize());
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

    /** The algorithm identifier and parameters for the public key. */
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final String algorithm;

    /**
     * The algorithm identifier and parameters for the public key.
     *
     * @return the value
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /** The private key exponent. */
    @com.fasterxml.jackson.annotation.JsonProperty("exponent")
    private final Integer exponent;

    /**
     * The private key exponent.
     *
     * @return the value
     */
    public Integer getExponent() {
        return exponent;
    }

    /** The number of bits in a key used by a cryptographic algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("keySize")
    private final Integer keySize;

    /**
     * The number of bits in a key used by a cryptographic algorithm.
     *
     * @return the value
     */
    public Integer getKeySize() {
        return keySize;
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
        sb.append("Certificate_publicKeyInfo(");
        sb.append("super=").append(super.toString());
        sb.append("algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", exponent=").append(String.valueOf(this.exponent));
        sb.append(", keySize=").append(String.valueOf(this.keySize));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Certificate_publicKeyInfo)) {
            return false;
        }

        Certificate_publicKeyInfo other = (Certificate_publicKeyInfo) o;
        return java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.exponent, other.exponent)
                && java.util.Objects.equals(this.keySize, other.keySize)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.exponent == null ? 43 : this.exponent.hashCode());
        result = (result * PRIME) + (this.keySize == null ? 43 : this.keySize.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
