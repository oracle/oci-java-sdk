/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcesearch.model;

/**
 * An individual field that can be used as part of a query filter.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180409")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QueryableFieldDescription.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryableFieldDescription {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldType", "fieldName", "isArray", "objectProperties"})
    public QueryableFieldDescription(
            FieldType fieldType,
            String fieldName,
            Boolean isArray,
            java.util.List<QueryableFieldDescription> objectProperties) {
        super();
        this.fieldType = fieldType;
        this.fieldName = fieldName;
        this.isArray = isArray;
        this.objectProperties = objectProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
        private FieldType fieldType;

        public Builder fieldType(FieldType fieldType) {
            this.fieldType = fieldType;
            this.__explicitlySet__.add("fieldType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isArray")
        private Boolean isArray;

        public Builder isArray(Boolean isArray) {
            this.isArray = isArray;
            this.__explicitlySet__.add("isArray");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectProperties")
        private java.util.List<QueryableFieldDescription> objectProperties;

        public Builder objectProperties(
                java.util.List<QueryableFieldDescription> objectProperties) {
            this.objectProperties = objectProperties;
            this.__explicitlySet__.add("objectProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryableFieldDescription build() {
            QueryableFieldDescription __instance__ =
                    new QueryableFieldDescription(fieldType, fieldName, isArray, objectProperties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryableFieldDescription o) {
            Builder copiedBuilder =
                    fieldType(o.getFieldType())
                            .fieldName(o.getFieldName())
                            .isArray(o.getIsArray())
                            .objectProperties(o.getObjectProperties());

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
     * The type of the field, which dictates what semantics and query constraints you can use when searching or querying.
     *
     **/
    public enum FieldType {
        Identifier("IDENTIFIER"),
        String("STRING"),
        Integer("INTEGER"),
        Rational("RATIONAL"),
        Boolean("BOOLEAN"),
        Datetime("DATETIME"),
        Ip("IP"),
        Object("OBJECT"),

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
     * The type of the field, which dictates what semantics and query constraints you can use when searching or querying.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
    private final FieldType fieldType;

    public FieldType getFieldType() {
        return fieldType;
    }

    /**
     * The name of the field to use when constructing the query. Field names are present for all types except {@code OBJECT}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    public String getFieldName() {
        return fieldName;
    }

    /**
     * Indicates that this field is actually an array of the specified field type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isArray")
    private final Boolean isArray;

    public Boolean getIsArray() {
        return isArray;
    }

    /**
     * If the field type is {@code OBJECT}, then this property will provide all the individual properties of the object that can
     * be queried.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectProperties")
    private final java.util.List<QueryableFieldDescription> objectProperties;

    public java.util.List<QueryableFieldDescription> getObjectProperties() {
        return objectProperties;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryableFieldDescription(");
        sb.append("fieldType=").append(String.valueOf(this.fieldType));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", isArray=").append(String.valueOf(this.isArray));
        sb.append(", objectProperties=").append(String.valueOf(this.objectProperties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryableFieldDescription)) {
            return false;
        }

        QueryableFieldDescription other = (QueryableFieldDescription) o;
        return java.util.Objects.equals(this.fieldType, other.fieldType)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.isArray, other.isArray)
                && java.util.Objects.equals(this.objectProperties, other.objectProperties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldType == null ? 43 : this.fieldType.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.isArray == null ? 43 : this.isArray.hashCode());
        result =
                (result * PRIME)
                        + (this.objectProperties == null ? 43 : this.objectProperties.hashCode());
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
