/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The data format object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataFormat.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DataFormat extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"formatAttribute", "type", "compressionConfig"})
    public DataFormat(
            AbstractFormatAttribute formatAttribute, Type type, Compression compressionConfig) {
        super();
        this.formatAttribute = formatAttribute;
        this.type = type;
        this.compressionConfig = compressionConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("formatAttribute")
        private AbstractFormatAttribute formatAttribute;

        public Builder formatAttribute(AbstractFormatAttribute formatAttribute) {
            this.formatAttribute = formatAttribute;
            this.__explicitlySet__.add("formatAttribute");
            return this;
        }
        /** type */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * type
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compressionConfig")
        private Compression compressionConfig;

        public Builder compressionConfig(Compression compressionConfig) {
            this.compressionConfig = compressionConfig;
            this.__explicitlySet__.add("compressionConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataFormat build() {
            DataFormat model =
                    new DataFormat(this.formatAttribute, this.type, this.compressionConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataFormat model) {
            if (model.wasPropertyExplicitlySet("formatAttribute")) {
                this.formatAttribute(model.getFormatAttribute());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("compressionConfig")) {
                this.compressionConfig(model.getCompressionConfig());
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

    @com.fasterxml.jackson.annotation.JsonProperty("formatAttribute")
    private final AbstractFormatAttribute formatAttribute;

    public AbstractFormatAttribute getFormatAttribute() {
        return formatAttribute;
    }

    /** type */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Xml("XML"),
        Json("JSON"),
        Csv("CSV"),
        Orc("ORC"),
        Parquet("PARQUET"),
        Avro("AVRO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** type */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * type
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("compressionConfig")
    private final Compression compressionConfig;

    public Compression getCompressionConfig() {
        return compressionConfig;
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
        sb.append("DataFormat(");
        sb.append("super=").append(super.toString());
        sb.append("formatAttribute=").append(String.valueOf(this.formatAttribute));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", compressionConfig=").append(String.valueOf(this.compressionConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataFormat)) {
            return false;
        }

        DataFormat other = (DataFormat) o;
        return java.util.Objects.equals(this.formatAttribute, other.formatAttribute)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.compressionConfig, other.compressionConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.formatAttribute == null ? 43 : this.formatAttribute.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.compressionConfig == null ? 43 : this.compressionConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
