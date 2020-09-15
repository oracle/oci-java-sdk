/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SimpleCondition.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SimpleCondition extends Condition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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
    String parameter;

    /**
     * type of operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    OperatorType operator;

    /**
     * type of operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * type of value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    ConditionValueType valueType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
