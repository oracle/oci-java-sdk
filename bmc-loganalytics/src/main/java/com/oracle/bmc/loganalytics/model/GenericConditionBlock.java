/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A condition block. This could represent a single condition, or have nested condition blocks under
 * it. To form a single condition, specify the name, operator and value(s). To form nested
 * conditions, specify the conditions in conditionBlocks, and how to join them in
 * conditionBlocksOperator. <br>
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
        builder = GenericConditionBlock.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenericConditionBlock
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "conditionBlocksOperator",
        "name",
        "operator",
        "value",
        "values",
        "genericConditionBlocks"
    })
    public GenericConditionBlock(
            ConditionBlocksOperator conditionBlocksOperator,
            String name,
            String operator,
            String value,
            java.util.List<String> values,
            java.util.List<GenericConditionBlock> genericConditionBlocks) {
        super();
        this.conditionBlocksOperator = conditionBlocksOperator;
        this.name = name;
        this.operator = operator;
        this.value = value;
        this.values = values;
        this.genericConditionBlocks = genericConditionBlocks;
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
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the field the condition is based on. Specify this if this condition block
         * represents a single condition.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The condition operator. Specify this if this condition block represents a single
         * condition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private String operator;

        /**
         * The condition operator. Specify this if this condition block represents a single
         * condition.
         *
         * @param operator the value to set
         * @return this builder
         */
        public Builder operator(String operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }
        /**
         * The condition value. Specify this if this condition block represents a single condition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The condition value. Specify this if this condition block represents a single condition.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * A list of condition values. Specify this if this condition block represents a single
         * condition.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<String> values;

        /**
         * A list of condition values. Specify this if this condition block represents a single
         * condition.
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
        /**
         * Condition blocks to evaluate within this condition block. Specify this for nested
         * conditions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("genericConditionBlocks")
        private java.util.List<GenericConditionBlock> genericConditionBlocks;

        /**
         * Condition blocks to evaluate within this condition block. Specify this for nested
         * conditions.
         *
         * @param genericConditionBlocks the value to set
         * @return this builder
         */
        public Builder genericConditionBlocks(
                java.util.List<GenericConditionBlock> genericConditionBlocks) {
            this.genericConditionBlocks = genericConditionBlocks;
            this.__explicitlySet__.add("genericConditionBlocks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericConditionBlock build() {
            GenericConditionBlock model =
                    new GenericConditionBlock(
                            this.conditionBlocksOperator,
                            this.name,
                            this.operator,
                            this.value,
                            this.values,
                            this.genericConditionBlocks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericConditionBlock model) {
            if (model.wasPropertyExplicitlySet("conditionBlocksOperator")) {
                this.conditionBlocksOperator(model.getConditionBlocksOperator());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("genericConditionBlocks")) {
                this.genericConditionBlocks(model.getGenericConditionBlocks());
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
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the field the condition is based on. Specify this if this condition block
     * represents a single condition.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The condition operator. Specify this if this condition block represents a single condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final String operator;

    /**
     * The condition operator. Specify this if this condition block represents a single condition.
     *
     * @return the value
     */
    public String getOperator() {
        return operator;
    }

    /** The condition value. Specify this if this condition block represents a single condition. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The condition value. Specify this if this condition block represents a single condition.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * A list of condition values. Specify this if this condition block represents a single
     * condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<String> values;

    /**
     * A list of condition values. Specify this if this condition block represents a single
     * condition.
     *
     * @return the value
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * Condition blocks to evaluate within this condition block. Specify this for nested conditions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("genericConditionBlocks")
    private final java.util.List<GenericConditionBlock> genericConditionBlocks;

    /**
     * Condition blocks to evaluate within this condition block. Specify this for nested conditions.
     *
     * @return the value
     */
    public java.util.List<GenericConditionBlock> getGenericConditionBlocks() {
        return genericConditionBlocks;
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
        sb.append("GenericConditionBlock(");
        sb.append("super=").append(super.toString());
        sb.append("conditionBlocksOperator=").append(String.valueOf(this.conditionBlocksOperator));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", genericConditionBlocks=").append(String.valueOf(this.genericConditionBlocks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericConditionBlock)) {
            return false;
        }

        GenericConditionBlock other = (GenericConditionBlock) o;
        return java.util.Objects.equals(this.conditionBlocksOperator, other.conditionBlocksOperator)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(
                        this.genericConditionBlocks, other.genericConditionBlocks)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result =
                (result * PRIME)
                        + (this.genericConditionBlocks == null
                                ? 43
                                : this.genericConditionBlocks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
