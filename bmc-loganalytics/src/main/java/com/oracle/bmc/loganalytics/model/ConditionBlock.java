/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A condition block. This could represent a single condition, or have nested condition blocks under
 * it. To form a single condition, specify the fieldName, labelConditionOperator and
 * labelConditionValue(s). To form nested conditions, specify the conditions in conditionBlocks, and
 * how to join them in conditionBlocksOperator. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ConditionBlock.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConditionBlock
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "conditionBlocksOperator",
        "fieldName",
        "labelConditionOperator",
        "labelConditionValue",
        "labelConditionValues",
        "conditionBlocks"
    })
    public ConditionBlock(
            ConditionBlocksOperator conditionBlocksOperator,
            String fieldName,
            String labelConditionOperator,
            String labelConditionValue,
            java.util.List<String> labelConditionValues,
            java.util.List<ConditionBlock> conditionBlocks) {
        super();
        this.conditionBlocksOperator = conditionBlocksOperator;
        this.fieldName = fieldName;
        this.labelConditionOperator = labelConditionOperator;
        this.labelConditionValue = labelConditionValue;
        this.labelConditionValues = labelConditionValues;
        this.conditionBlocks = conditionBlocks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operator using which the conditionBlocks should be joined. Specify this for nested
         * conditions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionBlocksOperator")
        private ConditionBlocksOperator conditionBlocksOperator;

        /**
         * Operator using which the conditionBlocks should be joined. Specify this for nested
         * conditions.
         *
         * @param conditionBlocksOperator the value to set
         * @return this builder
         */
        public Builder conditionBlocksOperator(ConditionBlocksOperator conditionBlocksOperator) {
            this.conditionBlocksOperator = conditionBlocksOperator;
            this.__explicitlySet__.add("conditionBlocksOperator");
            return this;
        }
        /**
         * The name of the field the condition is based on. Specify this if this condition block
         * represents a single condition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * The name of the field the condition is based on. Specify this if this condition block
         * represents a single condition.
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
         * The condition operator. Specify this if this condition block represents a single
         * condition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionOperator")
        private String labelConditionOperator;

        /**
         * The condition operator. Specify this if this condition block represents a single
         * condition.
         *
         * @param labelConditionOperator the value to set
         * @return this builder
         */
        public Builder labelConditionOperator(String labelConditionOperator) {
            this.labelConditionOperator = labelConditionOperator;
            this.__explicitlySet__.add("labelConditionOperator");
            return this;
        }
        /**
         * The condition value. Specify this if this condition block represents a single condition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValue")
        private String labelConditionValue;

        /**
         * The condition value. Specify this if this condition block represents a single condition.
         *
         * @param labelConditionValue the value to set
         * @return this builder
         */
        public Builder labelConditionValue(String labelConditionValue) {
            this.labelConditionValue = labelConditionValue;
            this.__explicitlySet__.add("labelConditionValue");
            return this;
        }
        /**
         * A list of condition values. Specify this if this condition block represents a single
         * condition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValues")
        private java.util.List<String> labelConditionValues;

        /**
         * A list of condition values. Specify this if this condition block represents a single
         * condition.
         *
         * @param labelConditionValues the value to set
         * @return this builder
         */
        public Builder labelConditionValues(java.util.List<String> labelConditionValues) {
            this.labelConditionValues = labelConditionValues;
            this.__explicitlySet__.add("labelConditionValues");
            return this;
        }
        /**
         * Condition blocks to evaluate within this condition block. Specify this for nested
         * conditions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("conditionBlocks")
        private java.util.List<ConditionBlock> conditionBlocks;

        /**
         * Condition blocks to evaluate within this condition block. Specify this for nested
         * conditions.
         *
         * @param conditionBlocks the value to set
         * @return this builder
         */
        public Builder conditionBlocks(java.util.List<ConditionBlock> conditionBlocks) {
            this.conditionBlocks = conditionBlocks;
            this.__explicitlySet__.add("conditionBlocks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConditionBlock build() {
            ConditionBlock model =
                    new ConditionBlock(
                            this.conditionBlocksOperator,
                            this.fieldName,
                            this.labelConditionOperator,
                            this.labelConditionValue,
                            this.labelConditionValues,
                            this.conditionBlocks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConditionBlock model) {
            if (model.wasPropertyExplicitlySet("conditionBlocksOperator")) {
                this.conditionBlocksOperator(model.getConditionBlocksOperator());
            }
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("labelConditionOperator")) {
                this.labelConditionOperator(model.getLabelConditionOperator());
            }
            if (model.wasPropertyExplicitlySet("labelConditionValue")) {
                this.labelConditionValue(model.getLabelConditionValue());
            }
            if (model.wasPropertyExplicitlySet("labelConditionValues")) {
                this.labelConditionValues(model.getLabelConditionValues());
            }
            if (model.wasPropertyExplicitlySet("conditionBlocks")) {
                this.conditionBlocks(model.getConditionBlocks());
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
     * Operator using which the conditionBlocks should be joined. Specify this for nested
     * conditions.
     */
    public enum ConditionBlocksOperator implements com.oracle.bmc.http.internal.BmcEnum {
        And("AND"),
        Or("OR"),
        NotAnd("NOT_AND"),
        NotOr("NOT_OR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConditionBlocksOperator.class);

        private final String value;
        private static java.util.Map<String, ConditionBlocksOperator> map;

        static {
            map = new java.util.HashMap<>();
            for (ConditionBlocksOperator v : ConditionBlocksOperator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConditionBlocksOperator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConditionBlocksOperator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConditionBlocksOperator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Operator using which the conditionBlocks should be joined. Specify this for nested
     * conditions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionBlocksOperator")
    private final ConditionBlocksOperator conditionBlocksOperator;

    /**
     * Operator using which the conditionBlocks should be joined. Specify this for nested
     * conditions.
     *
     * @return the value
     */
    public ConditionBlocksOperator getConditionBlocksOperator() {
        return conditionBlocksOperator;
    }

    /**
     * The name of the field the condition is based on. Specify this if this condition block
     * represents a single condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * The name of the field the condition is based on. Specify this if this condition block
     * represents a single condition.
     *
     * @return the value
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * The condition operator. Specify this if this condition block represents a single condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionOperator")
    private final String labelConditionOperator;

    /**
     * The condition operator. Specify this if this condition block represents a single condition.
     *
     * @return the value
     */
    public String getLabelConditionOperator() {
        return labelConditionOperator;
    }

    /** The condition value. Specify this if this condition block represents a single condition. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValue")
    private final String labelConditionValue;

    /**
     * The condition value. Specify this if this condition block represents a single condition.
     *
     * @return the value
     */
    public String getLabelConditionValue() {
        return labelConditionValue;
    }

    /**
     * A list of condition values. Specify this if this condition block represents a single
     * condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labelConditionValues")
    private final java.util.List<String> labelConditionValues;

    /**
     * A list of condition values. Specify this if this condition block represents a single
     * condition.
     *
     * @return the value
     */
    public java.util.List<String> getLabelConditionValues() {
        return labelConditionValues;
    }

    /**
     * Condition blocks to evaluate within this condition block. Specify this for nested conditions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionBlocks")
    private final java.util.List<ConditionBlock> conditionBlocks;

    /**
     * Condition blocks to evaluate within this condition block. Specify this for nested conditions.
     *
     * @return the value
     */
    public java.util.List<ConditionBlock> getConditionBlocks() {
        return conditionBlocks;
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
        sb.append("ConditionBlock(");
        sb.append("super=").append(super.toString());
        sb.append("conditionBlocksOperator=").append(String.valueOf(this.conditionBlocksOperator));
        sb.append(", fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", labelConditionOperator=").append(String.valueOf(this.labelConditionOperator));
        sb.append(", labelConditionValue=").append(String.valueOf(this.labelConditionValue));
        sb.append(", labelConditionValues=").append(String.valueOf(this.labelConditionValues));
        sb.append(", conditionBlocks=").append(String.valueOf(this.conditionBlocks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConditionBlock)) {
            return false;
        }

        ConditionBlock other = (ConditionBlock) o;
        return java.util.Objects.equals(this.conditionBlocksOperator, other.conditionBlocksOperator)
                && java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(
                        this.labelConditionOperator, other.labelConditionOperator)
                && java.util.Objects.equals(this.labelConditionValue, other.labelConditionValue)
                && java.util.Objects.equals(this.labelConditionValues, other.labelConditionValues)
                && java.util.Objects.equals(this.conditionBlocks, other.conditionBlocks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.conditionBlocksOperator == null
                                ? 43
                                : this.conditionBlocksOperator.hashCode());
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionOperator == null
                                ? 43
                                : this.labelConditionOperator.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionValue == null
                                ? 43
                                : this.labelConditionValue.hashCode());
        result =
                (result * PRIME)
                        + (this.labelConditionValues == null
                                ? 43
                                : this.labelConditionValues.hashCode());
        result =
                (result * PRIME)
                        + (this.conditionBlocks == null ? 43 : this.conditionBlocks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
