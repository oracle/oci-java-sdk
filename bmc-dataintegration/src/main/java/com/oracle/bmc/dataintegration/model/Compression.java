/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The optional compression configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Compression.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Compression extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"codec"})
    public Compression(Codec codec) {
        super();
        this.codec = codec;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compression algorithm */
        @com.fasterxml.jackson.annotation.JsonProperty("codec")
        private Codec codec;

        /**
         * Compression algorithm
         *
         * @param codec the value to set
         * @return this builder
         */
        public Builder codec(Codec codec) {
            this.codec = codec;
            this.__explicitlySet__.add("codec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Compression build() {
            Compression model = new Compression(this.codec);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Compression model) {
            if (model.wasPropertyExplicitlySet("codec")) {
                this.codec(model.getCodec());
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

    /** Compression algorithm */
    public enum Codec implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Auto("AUTO"),
        Gzip("GZIP"),
        Bzip2("BZIP2"),
        Deflate("DEFLATE"),
        Lz4("LZ4"),
        Snappy("SNAPPY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Codec.class);

        private final String value;
        private static java.util.Map<String, Codec> map;

        static {
            map = new java.util.HashMap<>();
            for (Codec v : Codec.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Codec(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Codec create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Codec', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Compression algorithm */
    @com.fasterxml.jackson.annotation.JsonProperty("codec")
    private final Codec codec;

    /**
     * Compression algorithm
     *
     * @return the value
     */
    public Codec getCodec() {
        return codec;
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
        sb.append("Compression(");
        sb.append("super=").append(super.toString());
        sb.append("codec=").append(String.valueOf(this.codec));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Compression)) {
            return false;
        }

        Compression other = (Compression) o;
        return java.util.Objects.equals(this.codec, other.codec) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.codec == null ? 43 : this.codec.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
