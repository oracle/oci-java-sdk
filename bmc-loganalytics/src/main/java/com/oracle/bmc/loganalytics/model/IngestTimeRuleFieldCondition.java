/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The field condition(s) to evaluate for an ingest time rule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngestTimeRuleFieldCondition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IngestTimeRuleFieldCondition extends IngestTimeRuleCondition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The field name to be evaluated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * The field name to be evaluated.
         * @param fieldName the value to set
         * @return this builder
         **/
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * The operator to be used for evaluating the field.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldOperator")
        private FieldOperator fieldOperator;

        /**
         * The operator to be used for evaluating the field.
         * @param fieldOperator the value to set
         * @return this builder
         **/
        public Builder fieldOperator(FieldOperator fieldOperator) {
            this.fieldOperator = fieldOperator;
            this.__explicitlySet__.add("fieldOperator");
            return this;
        }
        /**
         * The field value to be evaluated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldValue")
        private String fieldValue;

        /**
         * The field value to be evaluated.
         * @param fieldValue the value to set
         * @return this builder
         **/
        public Builder fieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            this.__explicitlySet__.add("fieldValue");
            return this;
        }
        /**
         * Optional additional condition(s) to be evaluated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalConditions")
        private java.util.List<IngestTimeRuleAdditionalFieldCondition> additionalConditions;

        /**
         * Optional additional condition(s) to be evaluated.
         * @param additionalConditions the value to set
         * @return this builder
         **/
        public Builder additionalConditions(
                java.util.List<IngestTimeRuleAdditionalFieldCondition> additionalConditions) {
            this.additionalConditions = additionalConditions;
            this.__explicitlySet__.add("additionalConditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngestTimeRuleFieldCondition build() {
            IngestTimeRuleFieldCondition model =
                    new IngestTimeRuleFieldCondition(
                            this.fieldName,
                            this.fieldOperator,
                            this.fieldValue,
                            this.additionalConditions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngestTimeRuleFieldCondition model) {
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("fieldOperator")) {
                this.fieldOperator(model.getFieldOperator());
            }
            if (model.wasPropertyExplicitlySet("fieldValue")) {
                this.fieldValue(model.getFieldValue());
            }
            if (model.wasPropertyExplicitlySet("additionalConditions")) {
                this.additionalConditions(model.getAdditionalConditions());
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
    public IngestTimeRuleFieldCondition(
            String fieldName,
            FieldOperator fieldOperator,
            String fieldValue,
            java.util.List<IngestTimeRuleAdditionalFieldCondition> additionalConditions) {
        super();
        this.fieldName = fieldName;
        this.fieldOperator = fieldOperator;
        this.fieldValue = fieldValue;
        this.additionalConditions = additionalConditions;
    }

    /**
     * The field name to be evaluated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * The field name to be evaluated.
     * @return the value
     **/
    public String getFieldName() {
        return fieldName;
    }

    /**
     * The operator to be used for evaluating the field.
     **/
    public enum FieldOperator {
        Equal("EQUAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FieldOperator.class);

        private final String value;
        private static java.util.Map<String, FieldOperator> map;

        static {
            map = new java.util.HashMap<>();
            for (FieldOperator v : FieldOperator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FieldOperator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FieldOperator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FieldOperator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The operator to be used for evaluating the field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldOperator")
    private final FieldOperator fieldOperator;

    /**
     * The operator to be used for evaluating the field.
     * @return the value
     **/
    public FieldOperator getFieldOperator() {
        return fieldOperator;
    }

    /**
     * The field value to be evaluated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldValue")
    private final String fieldValue;

    /**
     * The field value to be evaluated.
     * @return the value
     **/
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Optional additional condition(s) to be evaluated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalConditions")
    private final java.util.List<IngestTimeRuleAdditionalFieldCondition> additionalConditions;

    /**
     * Optional additional condition(s) to be evaluated.
     * @return the value
     **/
    public java.util.List<IngestTimeRuleAdditionalFieldCondition> getAdditionalConditions() {
        return additionalConditions;
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
        sb.append("IngestTimeRuleFieldCondition(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", fieldOperator=").append(String.valueOf(this.fieldOperator));
        sb.append(", fieldValue=").append(String.valueOf(this.fieldValue));
        sb.append(", additionalConditions=").append(String.valueOf(this.additionalConditions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngestTimeRuleFieldCondition)) {
            return false;
        }

        IngestTimeRuleFieldCondition other = (IngestTimeRuleFieldCondition) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.fieldOperator, other.fieldOperator)
                && java.util.Objects.equals(this.fieldValue, other.fieldValue)
                && java.util.Objects.equals(this.additionalConditions, other.additionalConditions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldOperator == null ? 43 : this.fieldOperator.hashCode());
        result = (result * PRIME) + (this.fieldValue == null ? 43 : this.fieldValue.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalConditions == null
                                ? 43
                                : this.additionalConditions.hashCode());
        return result;
    }
}
