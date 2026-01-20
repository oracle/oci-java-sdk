/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Information for a simple condition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SimpleCondition.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SimpleCondition extends Condition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Parameter key */
        @com.fasterxml.jackson.annotation.JsonProperty("parameter")
        private String parameter;

        /**
         * Parameter key
         *
         * @param parameter the value to set
         * @return this builder
         */
        public Builder parameter(String parameter) {
            this.parameter = parameter;
            this.__explicitlySet__.add("parameter");
            return this;
        }
        /** Type of operator */
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private OperatorType operator;

        /**
         * Type of operator
         *
         * @param operator the value to set
         * @return this builder
         */
        public Builder operator(OperatorType operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }
        /** Value of operator in condition */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value of operator in condition
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** Type of value in condition */
        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ConditionValueType valueType;

        /**
         * Type of value in condition
         *
         * @param valueType the value to set
         * @return this builder
         */
        public Builder valueType(ConditionValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SimpleCondition build() {
            SimpleCondition model =
                    new SimpleCondition(this.parameter, this.operator, this.value, this.valueType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SimpleCondition model) {
            if (model.wasPropertyExplicitlySet("parameter")) {
                this.parameter(model.getParameter());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("valueType")) {
                this.valueType(model.getValueType());
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

    @Deprecated
    public SimpleCondition(
            String parameter, OperatorType operator, String value, ConditionValueType valueType) {
        super();
        this.parameter = parameter;
        this.operator = operator;
        this.value = value;
        this.valueType = valueType;
    }

    /** Parameter key */
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    private final String parameter;

    /**
     * Parameter key
     *
     * @return the value
     */
    public String getParameter() {
        return parameter;
    }

    /** Type of operator */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final OperatorType operator;

    /**
     * Type of operator
     *
     * @return the value
     */
    public OperatorType getOperator() {
        return operator;
    }

    /** Value of operator in condition */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value of operator in condition
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** Type of value in condition */
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    private final ConditionValueType valueType;

    /**
     * Type of value in condition
     *
     * @return the value
     */
    public ConditionValueType getValueType() {
        return valueType;
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
        sb.append("SimpleCondition(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", parameter=").append(String.valueOf(this.parameter));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", valueType=").append(String.valueOf(this.valueType));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.parameter == null ? 43 : this.parameter.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.valueType == null ? 43 : this.valueType.hashCode());
        return result;
    }
}
