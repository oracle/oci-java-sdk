/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The algorithm object with name and key size properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KeySizeAlgorithm.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KeySizeAlgorithm
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "keySize"})
    public KeySizeAlgorithm(Algorithms name, Integer keySize) {
        super();
        this.name = name;
        this.keySize = keySize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The algorithm name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private Algorithms name;

        /**
         * The algorithm name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(Algorithms name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Key size for the encryption algorithm. Allowed values: 256 for EC, 2048 for DH/DSA/RSA
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keySize")
        private Integer keySize;

        /**
         * Key size for the encryption algorithm. Allowed values: 256 for EC, 2048 for DH/DSA/RSA
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

        public KeySizeAlgorithm build() {
            KeySizeAlgorithm model = new KeySizeAlgorithm(this.name, this.keySize);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeySizeAlgorithm model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /** The algorithm name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final Algorithms name;

    /**
     * The algorithm name.
     *
     * @return the value
     */
    public Algorithms getName() {
        return name;
    }

    /** Key size for the encryption algorithm. Allowed values: 256 for EC, 2048 for DH/DSA/RSA */
    @com.fasterxml.jackson.annotation.JsonProperty("keySize")
    private final Integer keySize;

    /**
     * Key size for the encryption algorithm. Allowed values: 256 for EC, 2048 for DH/DSA/RSA
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
        sb.append("KeySizeAlgorithm(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", keySize=").append(String.valueOf(this.keySize));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeySizeAlgorithm)) {
            return false;
        }

        KeySizeAlgorithm other = (KeySizeAlgorithm) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.keySize, other.keySize)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.keySize == null ? 43 : this.keySize.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
