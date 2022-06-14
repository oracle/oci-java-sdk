/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Form field.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DocumentField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DocumentField {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldType", "fieldLabel", "fieldName", "fieldValue"})
    public DocumentField(
            FieldType fieldType,
            FieldLabel fieldLabel,
            FieldName fieldName,
            FieldValue fieldValue) {
        super();
        this.fieldType = fieldType;
        this.fieldLabel = fieldLabel;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The field type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
        private FieldType fieldType;

        /**
         * The field type.
         * @param fieldType the value to set
         * @return this builder
         **/
        public Builder fieldType(FieldType fieldType) {
            this.fieldType = fieldType;
            this.__explicitlySet__.add("fieldType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldLabel")
        private FieldLabel fieldLabel;

        public Builder fieldLabel(FieldLabel fieldLabel) {
            this.fieldLabel = fieldLabel;
            this.__explicitlySet__.add("fieldLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private FieldName fieldName;

        public Builder fieldName(FieldName fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldValue")
        private FieldValue fieldValue;

        public Builder fieldValue(FieldValue fieldValue) {
            this.fieldValue = fieldValue;
            this.__explicitlySet__.add("fieldValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentField build() {
            DocumentField __instance__ =
                    new DocumentField(fieldType, fieldLabel, fieldName, fieldValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DocumentField o) {
            Builder copiedBuilder =
                    fieldType(o.getFieldType())
                            .fieldLabel(o.getFieldLabel())
                            .fieldName(o.getFieldName())
                            .fieldValue(o.getFieldValue());

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
     * The field type.
     **/
    public enum FieldType {
        LineItemGroup("LINE_ITEM_GROUP"),
        LineItem("LINE_ITEM"),
        LineItemField("LINE_ITEM_FIELD"),
        KeyValue("KEY_VALUE"),

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
     * The field type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldType")
    private final FieldType fieldType;

    /**
     * The field type.
     * @return the value
     **/
    public FieldType getFieldType() {
        return fieldType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fieldLabel")
    private final FieldLabel fieldLabel;

    public FieldLabel getFieldLabel() {
        return fieldLabel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final FieldName fieldName;

    public FieldName getFieldName() {
        return fieldName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fieldValue")
    private final FieldValue fieldValue;

    public FieldValue getFieldValue() {
        return fieldValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentField(");
        sb.append("fieldType=").append(String.valueOf(this.fieldType));
        sb.append(", fieldLabel=").append(String.valueOf(this.fieldLabel));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", fieldValue=").append(String.valueOf(this.fieldValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DocumentField)) {
            return false;
        }

        DocumentField other = (DocumentField) o;
        return java.util.Objects.equals(this.fieldType, other.fieldType)
                && java.util.Objects.equals(this.fieldLabel, other.fieldLabel)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.fieldValue, other.fieldValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldType == null ? 43 : this.fieldType.hashCode());
        result = (result * PRIME) + (this.fieldLabel == null ? 43 : this.fieldLabel.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.fieldValue == null ? 43 : this.fieldValue.hashCode());
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
