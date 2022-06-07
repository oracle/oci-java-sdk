/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * Information about the public key and the algorithm used by the public key.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = Certificate_publicKeyInfo.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Certificate_publicKeyInfo {
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
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private String algorithm;

        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exponent")
        private Integer exponent;

        public Builder exponent(Integer exponent) {
            this.exponent = exponent;
            this.__explicitlySet__.add("exponent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keySize")
        private Integer keySize;

        public Builder keySize(Integer keySize) {
            this.keySize = keySize;
            this.__explicitlySet__.add("keySize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Certificate_publicKeyInfo build() {
            Certificate_publicKeyInfo __instance__ =
                    new Certificate_publicKeyInfo(algorithm, exponent, keySize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Certificate_publicKeyInfo o) {
            Builder copiedBuilder =
                    algorithm(o.getAlgorithm()).exponent(o.getExponent()).keySize(o.getKeySize());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The algorithm identifier and parameters for the public key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final String algorithm;

    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * The private key exponent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exponent")
    private final Integer exponent;

    public Integer getExponent() {
        return exponent;
    }

    /**
     * The number of bits in a key used by a cryptographic algorithm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keySize")
    private final Integer keySize;

    public Integer getKeySize() {
        return keySize;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Certificate_publicKeyInfo(");
        sb.append("algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", exponent=").append(String.valueOf(this.exponent));
        sb.append(", keySize=").append(String.valueOf(this.keySize));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.exponent == null ? 43 : this.exponent.hashCode());
        result = (result * PRIME) + (this.keySize == null ? 43 : this.keySize.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
