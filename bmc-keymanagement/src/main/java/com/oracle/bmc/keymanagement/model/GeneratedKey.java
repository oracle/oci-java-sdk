/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GeneratedKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GeneratedKey {
    @Deprecated
    @java.beans.ConstructorProperties({"ciphertext", "plaintext", "plaintextChecksum"})
    public GeneratedKey(String ciphertext, String plaintext, String plaintextChecksum) {
        super();
        this.ciphertext = ciphertext;
        this.plaintext = plaintext;
        this.plaintextChecksum = plaintextChecksum;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The encrypted data encryption key generated from a master encryption key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ciphertext")
        private String ciphertext;

        /**
         * The encrypted data encryption key generated from a master encryption key.
         * @param ciphertext the value to set
         * @return this builder
         **/
        public Builder ciphertext(String ciphertext) {
            this.ciphertext = ciphertext;
            this.__explicitlySet__.add("ciphertext");
            return this;
        }
        /**
         * The plaintext data encryption key, a base64-encoded sequence of random bytes, which is
         * included if the [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
         * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
        private String plaintext;

        /**
         * The plaintext data encryption key, a base64-encoded sequence of random bytes, which is
         * included if the [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
         * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
         *
         * @param plaintext the value to set
         * @return this builder
         **/
        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            this.__explicitlySet__.add("plaintext");
            return this;
        }
        /**
         * The checksum of the plaintext data encryption key, which is included if the
         * [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
         * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("plaintextChecksum")
        private String plaintextChecksum;

        /**
         * The checksum of the plaintext data encryption key, which is included if the
         * [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
         * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
         *
         * @param plaintextChecksum the value to set
         * @return this builder
         **/
        public Builder plaintextChecksum(String plaintextChecksum) {
            this.plaintextChecksum = plaintextChecksum;
            this.__explicitlySet__.add("plaintextChecksum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GeneratedKey build() {
            GeneratedKey __instance__ = new GeneratedKey(ciphertext, plaintext, plaintextChecksum);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GeneratedKey o) {
            Builder copiedBuilder =
                    ciphertext(o.getCiphertext())
                            .plaintext(o.getPlaintext())
                            .plaintextChecksum(o.getPlaintextChecksum());

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
     * The encrypted data encryption key generated from a master encryption key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ciphertext")
    private final String ciphertext;

    /**
     * The encrypted data encryption key generated from a master encryption key.
     * @return the value
     **/
    public String getCiphertext() {
        return ciphertext;
    }

    /**
     * The plaintext data encryption key, a base64-encoded sequence of random bytes, which is
     * included if the [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
     * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
    private final String plaintext;

    /**
     * The plaintext data encryption key, a base64-encoded sequence of random bytes, which is
     * included if the [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
     * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
     *
     * @return the value
     **/
    public String getPlaintext() {
        return plaintext;
    }

    /**
     * The checksum of the plaintext data encryption key, which is included if the
     * [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
     * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plaintextChecksum")
    private final String plaintextChecksum;

    /**
     * The checksum of the plaintext data encryption key, which is included if the
     * [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
     * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
     *
     * @return the value
     **/
    public String getPlaintextChecksum() {
        return plaintextChecksum;
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
        sb.append("GeneratedKey(");
        sb.append("ciphertext=").append(String.valueOf(this.ciphertext));
        sb.append(", plaintext=").append(String.valueOf(this.plaintext));
        sb.append(", plaintextChecksum=").append(String.valueOf(this.plaintextChecksum));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeneratedKey)) {
            return false;
        }

        GeneratedKey other = (GeneratedKey) o;
        return java.util.Objects.equals(this.ciphertext, other.ciphertext)
                && java.util.Objects.equals(this.plaintext, other.plaintext)
                && java.util.Objects.equals(this.plaintextChecksum, other.plaintextChecksum)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ciphertext == null ? 43 : this.ciphertext.hashCode());
        result = (result * PRIME) + (this.plaintext == null ? 43 : this.plaintext.hashCode());
        result =
                (result * PRIME)
                        + (this.plaintextChecksum == null ? 43 : this.plaintextChecksum.hashCode());
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
