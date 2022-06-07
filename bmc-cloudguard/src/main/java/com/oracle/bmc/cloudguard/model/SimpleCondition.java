/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Simple Condition object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SimpleCondition.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SimpleCondition extends Condition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("parameter")
        private String parameter;

        public Builder parameter(String parameter) {
            this.parameter = parameter;
            this.__explicitlySet__.add("parameter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private OperatorType operator;

        public Builder operator(OperatorType operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ConditionValueType valueType;

        public Builder valueType(ConditionValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SimpleCondition build() {
            SimpleCondition __instance__ =
                    new SimpleCondition(parameter, operator, value, valueType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SimpleCondition o) {
            Builder copiedBuilder =
                    parameter(o.getParameter())
                            .operator(o.getOperator())
                            .value(o.getValue())
                            .valueType(o.getValueType());

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

    @Deprecated
    public SimpleCondition(
            String parameter, OperatorType operator, String value, ConditionValueType valueType) {
        super();
        this.parameter = parameter;
        this.operator = operator;
        this.value = value;
        this.valueType = valueType;
    }

    /**
     * parameter Key
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    private final String parameter;

    public String getParameter() {
        return parameter;
    }

    /**
     * type of operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final OperatorType operator;

    public OperatorType getOperator() {
        return operator;
    }

    /**
     * type of operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    public String getValue() {
        return value;
    }

    /**
     * type of value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    private final ConditionValueType valueType;

    public ConditionValueType getValueType() {
        return valueType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SimpleCondition(");
        sb.append("super=").append(super.toString());
        sb.append(", parameter=").append(String.valueOf(this.parameter));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", valueType=").append(String.valueOf(this.valueType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SimpleCondition)) {
            return false;
        }

        SimpleCondition other = (SimpleCondition) o;
        return java.util.Objects.equals(this.parameter, other.parameter)
                && java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.valueType, other.valueType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.parameter == null ? 43 : this.parameter.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.valueType == null ? 43 : this.valueType.hashCode());
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
