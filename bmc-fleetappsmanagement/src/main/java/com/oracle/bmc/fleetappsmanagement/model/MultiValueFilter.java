/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Content Source details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MultiValueFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "filterType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MultiValueFilter extends Filter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /** Expression for Filter */
        @com.fasterxml.jackson.annotation.JsonProperty("expression")
        private Expression expression;

        /**
         * Expression for Filter
         *
         * @param expression the value to set
         * @return this builder
         */
        public Builder expression(Expression expression) {
            this.expression = expression;
            this.__explicitlySet__.add("expression");
            return this;
        }
        /** Array of values. */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<String> values;

        /**
         * Array of values.
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MultiValueFilter build() {
            MultiValueFilter model =
                    new MultiValueFilter(this.fieldName, this.expression, this.values);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultiValueFilter model) {
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("expression")) {
                this.expression(model.getExpression());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
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
    public MultiValueFilter(
            String fieldName, Expression expression, java.util.List<String> values) {
        super(fieldName);
        this.expression = expression;
        this.values = values;
    }

    /** Expression for Filter */
    public enum Expression implements com.oracle.bmc.http.internal.BmcEnum {
        In("IN"),
        NotIn("NOT_IN"),
        Between("BETWEEN"),
        ;

        private final String value;
        private static java.util.Map<String, Expression> map;

        static {
            map = new java.util.HashMap<>();
            for (Expression v : Expression.values()) {
                map.put(v.getValue(), v);
            }
        }

        Expression(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Expression create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Expression: " + key);
        }
    };
    /** Expression for Filter */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    private final Expression expression;

    /**
     * Expression for Filter
     *
     * @return the value
     */
    public Expression getExpression() {
        return expression;
    }

    /** Array of values. */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<String> values;

    /**
     * Array of values.
     *
     * @return the value
     */
    public java.util.List<String> getValues() {
        return values;
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
        sb.append("MultiValueFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", expression=").append(String.valueOf(this.expression));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MultiValueFilter)) {
            return false;
        }

        MultiValueFilter other = (MultiValueFilter) o;
        return java.util.Objects.equals(this.expression, other.expression)
                && java.util.Objects.equals(this.values, other.values)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.expression == null ? 43 : this.expression.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        return result;
    }
}
