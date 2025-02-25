/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Specifies the details of the customer-provided encryption key (SSE-C) associated with an object.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SSECustomerKeyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SSECustomerKeyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"algorithm", "key", "keySha256"})
    public SSECustomerKeyDetails(Algorithm algorithm, String key, String keySha256) {
        super();
        this.algorithm = algorithm;
        this.key = key;
        this.keySha256 = keySha256;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies the encryption algorithm. The only supported value is "AES256".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private Algorithm algorithm;

        /**
         * Specifies the encryption algorithm. The only supported value is "AES256".
         *
         * @param algorithm the value to set
         * @return this builder
         **/
        public Builder algorithm(Algorithm algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }
        /**
         * Specifies the base64-encoded 256-bit encryption key to use to encrypt or decrypt the object data.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Specifies the base64-encoded 256-bit encryption key to use to encrypt or decrypt the object data.
         *
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Specifies the base64-encoded SHA256 hash of the encryption key. This value is used to check the integrity
         * of the encryption key.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keySha256")
        private String keySha256;

        /**
         * Specifies the base64-encoded SHA256 hash of the encryption key. This value is used to check the integrity
         * of the encryption key.
         *
         * @param keySha256 the value to set
         * @return this builder
         **/
        public Builder keySha256(String keySha256) {
            this.keySha256 = keySha256;
            this.__explicitlySet__.add("keySha256");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SSECustomerKeyDetails build() {
            SSECustomerKeyDetails model =
                    new SSECustomerKeyDetails(this.algorithm, this.key, this.keySha256);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SSECustomerKeyDetails model) {
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("keySha256")) {
                this.keySha256(model.getKeySha256());
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
     * Specifies the encryption algorithm. The only supported value is "AES256".
     *
     **/
    public enum Algorithm {
        Aes256("AES256"),
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
     * Specifies the encryption algorithm. The only supported value is "AES256".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final Algorithm algorithm;

    /**
     * Specifies the encryption algorithm. The only supported value is "AES256".
     *
     * @return the value
     **/
    public Algorithm getAlgorithm() {
        return algorithm;
    }

    /**
     * Specifies the base64-encoded 256-bit encryption key to use to encrypt or decrypt the object data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Specifies the base64-encoded 256-bit encryption key to use to encrypt or decrypt the object data.
     *
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Specifies the base64-encoded SHA256 hash of the encryption key. This value is used to check the integrity
     * of the encryption key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keySha256")
    private final String keySha256;

    /**
     * Specifies the base64-encoded SHA256 hash of the encryption key. This value is used to check the integrity
     * of the encryption key.
     *
     * @return the value
     **/
    public String getKeySha256() {
        return keySha256;
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
        sb.append("SSECustomerKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", keySha256=").append(String.valueOf(this.keySha256));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SSECustomerKeyDetails)) {
            return false;
        }

        SSECustomerKeyDetails other = (SSECustomerKeyDetails) o;
        return java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.keySha256, other.keySha256)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.keySha256 == null ? 43 : this.keySha256.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
