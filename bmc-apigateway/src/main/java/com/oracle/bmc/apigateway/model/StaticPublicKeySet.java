/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A set of static public keys that will be used to verify the JWT signature.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StaticPublicKeySet.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StaticPublicKeySet extends PublicKeySet {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The set of static public keys.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keys")
        private java.util.List<StaticPublicKey> keys;

        /**
         * The set of static public keys.
         * @param keys the value to set
         * @return this builder
         **/
        public Builder keys(java.util.List<StaticPublicKey> keys) {
            this.keys = keys;
            this.__explicitlySet__.add("keys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StaticPublicKeySet build() {
            StaticPublicKeySet model = new StaticPublicKeySet(this.keys);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StaticPublicKeySet model) {
            if (model.wasPropertyExplicitlySet("keys")) {
                this.keys(model.getKeys());
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

    @Deprecated
    public StaticPublicKeySet(java.util.List<StaticPublicKey> keys) {
        super();
        this.keys = keys;
    }

    /**
     * The set of static public keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keys")
    private final java.util.List<StaticPublicKey> keys;

    /**
     * The set of static public keys.
     * @return the value
     **/
    public java.util.List<StaticPublicKey> getKeys() {
        return keys;
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
        sb.append("StaticPublicKeySet(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", keys=").append(String.valueOf(this.keys));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StaticPublicKeySet)) {
            return false;
        }

        StaticPublicKeySet other = (StaticPublicKeySet) o;
        return java.util.Objects.equals(this.keys, other.keys) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.keys == null ? 43 : this.keys.hashCode());
        return result;
    }
}
