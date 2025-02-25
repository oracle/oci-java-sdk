/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingsearch.model;

/**
 * Contains field schema information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FieldInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FieldInfo extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "fieldType"})
    public FieldInfo(String fieldName, FieldType fieldType) {
        super();
        this.fieldName = fieldName;
        this.fieldType = fieldType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Field name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * Field name
         * @param fieldName the value to set
         * @return this builder
         **/
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * Field type -
         * * {@code STRING}: A sequence of characters.
         * * {@code NUMBER}: Numeric type which can be an integer or floating point.
         * * {@code BOOLEAN}: Either true or false.
         * * {@code ARRAY}: An ordered collection of values.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
        private FieldType fieldType;

        /**
         * Field type -
         * * {@code STRING}: A sequence of characters.
         * * {@code NUMBER}: Numeric type which can be an integer or floating point.
         * * {@code BOOLEAN}: Either true or false.
         * * {@code ARRAY}: An ordered collection of values.
         *
         * @param fieldType the value to set
         * @return this builder
         **/
        public Builder fieldType(FieldType fieldType) {
            this.fieldType = fieldType;
            this.__explicitlySet__.add("fieldType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FieldInfo build() {
            FieldInfo model = new FieldInfo(this.fieldName, this.fieldType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FieldInfo model) {
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("fieldType")) {
                this.fieldType(model.getFieldType());
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
     * Field name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * Field name
     * @return the value
     **/
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Field type -
     * * {@code STRING}: A sequence of characters.
     * * {@code NUMBER}: Numeric type which can be an integer or floating point.
     * * {@code BOOLEAN}: Either true or false.
     * * {@code ARRAY}: An ordered collection of values.
     *
     **/
    public enum FieldType {
        String("STRING"),
        Number("NUMBER"),
        Boolean("BOOLEAN"),
        Array("ARRAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FieldType.class);

        private final String value;
        private static java.util.Map<String, FieldType> map;

        static {
            map = new java.util.HashMap<>();
            for (FieldType v : FieldType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FieldType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FieldType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FieldType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Field type -
     * * {@code STRING}: A sequence of characters.
     * * {@code NUMBER}: Numeric type which can be an integer or floating point.
     * * {@code BOOLEAN}: Either true or false.
     * * {@code ARRAY}: An ordered collection of values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
    private final FieldType fieldType;

    /**
     * Field type -
     * * {@code STRING}: A sequence of characters.
     * * {@code NUMBER}: Numeric type which can be an integer or floating point.
     * * {@code BOOLEAN}: Either true or false.
     * * {@code ARRAY}: An ordered collection of values.
     *
     * @return the value
     **/
    public FieldType getFieldType() {
        return fieldType;
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
        sb.append("FieldInfo(");
        sb.append("super=").append(super.toString());
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", fieldType=").append(String.valueOf(this.fieldType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FieldInfo)) {
            return false;
        }

        FieldInfo other = (FieldInfo) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.fieldType, other.fieldType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.fieldType == null ? 43 : this.fieldType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
