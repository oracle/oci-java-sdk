/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The additional field condition(s) to evaluate for an ingest time rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IngestTimeRuleAdditionalFieldCondition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IngestTimeRuleAdditionalFieldCondition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"conditionField", "conditionOperator", "conditionValue"})
    public IngestTimeRuleAdditionalFieldCondition(
            String conditionField, ConditionOperator conditionOperator, String conditionValue) {
        super();
        this.conditionField = conditionField;
        this.conditionOperator = conditionOperator;
        this.conditionValue = conditionValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The additional field name to be evaluated. */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionField")
        private String conditionField;

        /**
         * The additional field name to be evaluated.
         *
         * @param conditionField the value to set
         * @return this builder
         */
        public Builder conditionField(String conditionField) {
            this.conditionField = conditionField;
            this.__explicitlySet__.add("conditionField");
            return this;
        }
        /** The operator to be used for evaluating the additional field. */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionOperator")
        private ConditionOperator conditionOperator;

        /**
         * The operator to be used for evaluating the additional field.
         *
         * @param conditionOperator the value to set
         * @return this builder
         */
        public Builder conditionOperator(ConditionOperator conditionOperator) {
            this.conditionOperator = conditionOperator;
            this.__explicitlySet__.add("conditionOperator");
            return this;
        }
        /** The additional field value to be evaluated. */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionValue")
        private String conditionValue;

        /**
         * The additional field value to be evaluated.
         *
         * @param conditionValue the value to set
         * @return this builder
         */
        public Builder conditionValue(String conditionValue) {
            this.conditionValue = conditionValue;
            this.__explicitlySet__.add("conditionValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngestTimeRuleAdditionalFieldCondition build() {
            IngestTimeRuleAdditionalFieldCondition model =
                    new IngestTimeRuleAdditionalFieldCondition(
                            this.conditionField, this.conditionOperator, this.conditionValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngestTimeRuleAdditionalFieldCondition model) {
            if (model.wasPropertyExplicitlySet("conditionField")) {
                this.conditionField(model.getConditionField());
            }
            if (model.wasPropertyExplicitlySet("conditionOperator")) {
                this.conditionOperator(model.getConditionOperator());
            }
            if (model.wasPropertyExplicitlySet("conditionValue")) {
                this.conditionValue(model.getConditionValue());
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

    /** The additional field name to be evaluated. */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionField")
    private final String conditionField;

    /**
     * The additional field name to be evaluated.
     *
     * @return the value
     */
    public String getConditionField() {
        return conditionField;
    }

    /** The operator to be used for evaluating the additional field. */
    public enum ConditionOperator implements com.oracle.bmc.http.internal.BmcEnum {
        Contains("CONTAINS"),
        ContainsIgnoreCase("CONTAINS_IGNORE_CASE"),
        ContainsRegex("CONTAINS_REGEX"),
        ContainsOneofRegexes("CONTAINS_ONEOF_REGEXES"),
        EndsWith("ENDS_WITH"),
        Equal("EQUAL"),
        EqualIgnoreCase("EQUAL_IGNORE_CASE"),
        In("IN"),
        InIgnoreCase("IN_IGNORE_CASE"),
        NotContains("NOT_CONTAINS"),
        NotEqual("NOT_EQUAL"),
        NotIn("NOT_IN"),
        NotNull("NOT_NULL"),
        StartsWith("STARTS_WITH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConditionOperator.class);

        private final String value;
        private static java.util.Map<String, ConditionOperator> map;

        static {
            map = new java.util.HashMap<>();
            for (ConditionOperator v : ConditionOperator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConditionOperator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConditionOperator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConditionOperator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The operator to be used for evaluating the additional field. */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionOperator")
    private final ConditionOperator conditionOperator;

    /**
     * The operator to be used for evaluating the additional field.
     *
     * @return the value
     */
    public ConditionOperator getConditionOperator() {
        return conditionOperator;
    }

    /** The additional field value to be evaluated. */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionValue")
    private final String conditionValue;

    /**
     * The additional field value to be evaluated.
     *
     * @return the value
     */
    public String getConditionValue() {
        return conditionValue;
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
        sb.append("IngestTimeRuleAdditionalFieldCondition(");
        sb.append("super=").append(super.toString());
        sb.append("conditionField=").append(String.valueOf(this.conditionField));
        sb.append(", conditionOperator=").append(String.valueOf(this.conditionOperator));
        sb.append(", conditionValue=").append(String.valueOf(this.conditionValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngestTimeRuleAdditionalFieldCondition)) {
            return false;
        }

        IngestTimeRuleAdditionalFieldCondition other = (IngestTimeRuleAdditionalFieldCondition) o;
        return java.util.Objects.equals(this.conditionField, other.conditionField)
                && java.util.Objects.equals(this.conditionOperator, other.conditionOperator)
                && java.util.Objects.equals(this.conditionValue, other.conditionValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.conditionField == null ? 43 : this.conditionField.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionOperator == null ? 43 : this.conditionOperator.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionValue == null ? 43 : this.conditionValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
