/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Query builder filter action to apply edit to queryString. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Filter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Filter extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "values", "operator"})
    public Filter(String fieldName, java.util.List<Object> values, Operator operator) {
        super();
        this.fieldName = fieldName;
        this.values = values;
        this.operator = operator;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Field filter references when inserting filter into the query string. Field must be a
         * valid logging analytics out-of-the-box field, virtual field calculated in the query or a
         * user defined field.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * Field filter references when inserting filter into the query string. Field must be a
         * valid logging analytics out-of-the-box field, virtual field calculated in the query or a
         * user defined field.
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
         * Field values that will be inserted into the query string for the specified fieldName.
         * Please note all values should reflect the fields data type otherwise the insert is
         * subject to fail.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<Object> values;

        /**
         * Field values that will be inserted into the query string for the specified fieldName.
         * Please note all values should reflect the fields data type otherwise the insert is
         * subject to fail.
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.List<Object> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
        /** Operator to apply when editing the query string. */
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        /**
         * Operator to apply when editing the query string.
         *
         * @param operator the value to set
         * @return this builder
         */
        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Filter build() {
            Filter model = new Filter(this.fieldName, this.values, this.operator);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Filter model) {
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
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
     * Field filter references when inserting filter into the query string. Field must be a valid
     * logging analytics out-of-the-box field, virtual field calculated in the query or a user
     * defined field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * Field filter references when inserting filter into the query string. Field must be a valid
     * logging analytics out-of-the-box field, virtual field calculated in the query or a user
     * defined field.
     *
     * @return the value
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Field values that will be inserted into the query string for the specified fieldName. Please
     * note all values should reflect the fields data type otherwise the insert is subject to fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<Object> values;

    /**
     * Field values that will be inserted into the query string for the specified fieldName. Please
     * note all values should reflect the fields data type otherwise the insert is subject to fail.
     *
     * @return the value
     */
    public java.util.List<Object> getValues() {
        return values;
    }

    /** Operator to apply when editing the query string. */
    public enum Operator implements com.oracle.bmc.http.internal.BmcEnum {
        Clear("CLEAR"),
        Replace("REPLACE"),
        Equals("EQUALS"),
        NotEquals("NOT_EQUALS"),
        StartsWith("STARTS_WITH"),
        DoesNotStartWith("DOES_NOT_START_WITH"),
        EndsWith("ENDS_WITH"),
        DoesNotEndWith("DOES_NOT_END_WITH"),
        Contains("CONTAINS"),
        DoesNotContain("DOES_NOT_CONTAIN"),
        IsLessThan("IS_LESS_THAN"),
        IsLessThanOrEqualTo("IS_LESS_THAN_OR_EQUAL_TO"),
        IsGreaterThan("IS_GREATER_THAN"),
        IsGreaterThanOrEqualTo("IS_GREATER_THAN_OR_EQUAL_TO"),
        IsBetween("IS_BETWEEN"),
        IsNotBetween("IS_NOT_BETWEEN"),
        AddSubquery("ADD_SUBQUERY"),
        ClearSubquery("CLEAR_SUBQUERY"),
        ;

        private final String value;
        private static java.util.Map<String, Operator> map;

        static {
            map = new java.util.HashMap<>();
            for (Operator v : Operator.values()) {
                map.put(v.getValue(), v);
            }
        }

        Operator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Operator: " + key);
        }
    };
    /** Operator to apply when editing the query string. */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final Operator operator;

    /**
     * Operator to apply when editing the query string.
     *
     * @return the value
     */
    public Operator getOperator() {
        return operator;
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
        sb.append("Filter(");
        sb.append("super=").append(super.toString());
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Filter)) {
            return false;
        }

        Filter other = (Filter) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.operator, other.operator)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
