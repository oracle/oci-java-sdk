/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * An individual field that can be used as part of a query filter. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = QueryableFieldSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueryableFieldSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldType", "fieldName", "objectProperties"})
    public QueryableFieldSummary(
            FieldType fieldType,
            String fieldName,
            java.util.List<QueryableFieldSummary> objectProperties) {
        super();
        this.fieldType = fieldType;
        this.fieldName = fieldName;
        this.objectProperties = objectProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the field, which dictates the semantics and query constraints that you can
         * use when searching or querying.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
        private FieldType fieldType;

        /**
         * The type of the field, which dictates the semantics and query constraints that you can
         * use when searching or querying.
         *
         * @param fieldType the value to set
         * @return this builder
         */
        public Builder fieldType(FieldType fieldType) {
            this.fieldType = fieldType;
            this.__explicitlySet__.add("fieldType");
            return this;
        }
        /**
         * The name of the field to use when constructing the query. Field names are present for all
         * types except {@code OBJECT}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * The name of the field to use when constructing the query. Field names are present for all
         * types except {@code OBJECT}.
         *
         * @param fieldName the value to set
         * @return this builder
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * If the field type is {@code OBJECT}, this property lists the individual properties of the
         * object that can be queried.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectProperties")
        private java.util.List<QueryableFieldSummary> objectProperties;

        /**
         * If the field type is {@code OBJECT}, this property lists the individual properties of the
         * object that can be queried.
         *
         * @param objectProperties the value to set
         * @return this builder
         */
        public Builder objectProperties(java.util.List<QueryableFieldSummary> objectProperties) {
            this.objectProperties = objectProperties;
            this.__explicitlySet__.add("objectProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryableFieldSummary build() {
            QueryableFieldSummary model =
                    new QueryableFieldSummary(
                            this.fieldType, this.fieldName, this.objectProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryableFieldSummary model) {
            if (model.wasPropertyExplicitlySet("fieldType")) {
                this.fieldType(model.getFieldType());
            }
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("objectProperties")) {
                this.objectProperties(model.getObjectProperties());
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

    /**
     * The type of the field, which dictates the semantics and query constraints that you can use
     * when searching or querying.
     */
    public enum FieldType implements com.oracle.bmc.http.internal.BmcEnum {
        String("STRING"),
        Integer("INTEGER"),
        Boolean("BOOLEAN"),
        DateTime("DATE_TIME"),
        Object("OBJECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The type of the field, which dictates the semantics and query constraints that you can use
     * when searching or querying.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
    private final FieldType fieldType;

    /**
     * The type of the field, which dictates the semantics and query constraints that you can use
     * when searching or querying.
     *
     * @return the value
     */
    public FieldType getFieldType() {
        return fieldType;
    }

    /**
     * The name of the field to use when constructing the query. Field names are present for all
     * types except {@code OBJECT}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * The name of the field to use when constructing the query. Field names are present for all
     * types except {@code OBJECT}.
     *
     * @return the value
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * If the field type is {@code OBJECT}, this property lists the individual properties of the
     * object that can be queried.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectProperties")
    private final java.util.List<QueryableFieldSummary> objectProperties;

    /**
     * If the field type is {@code OBJECT}, this property lists the individual properties of the
     * object that can be queried.
     *
     * @return the value
     */
    public java.util.List<QueryableFieldSummary> getObjectProperties() {
        return objectProperties;
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
        sb.append("QueryableFieldSummary(");
        sb.append("super=").append(super.toString());
        sb.append("fieldType=").append(String.valueOf(this.fieldType));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", objectProperties=").append(String.valueOf(this.objectProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryableFieldSummary)) {
            return false;
        }

        QueryableFieldSummary other = (QueryableFieldSummary) o;
        return java.util.Objects.equals(this.fieldType, other.fieldType)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.objectProperties, other.objectProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldType == null ? 43 : this.fieldType.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.objectProperties == null ? 43 : this.objectProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
