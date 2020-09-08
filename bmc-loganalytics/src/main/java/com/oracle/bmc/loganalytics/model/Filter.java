/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Query builder filter action to apply edit to queryString.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Filter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Filter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<Object> values;

        public Builder values(java.util.List<Object> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Filter build() {
            Filter __instance__ = new Filter(fieldName, values, operator);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Filter o) {
            Builder copiedBuilder =
                    fieldName(o.getFieldName()).values(o.getValues()).operator(o.getOperator());

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

    /**
     * Field filter references when inserting filter into the query string. Field must be a valid enterprise logging out-of-the-box field, virtual field calculated in the query or a user defined field.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    String fieldName;

    /**
     * Field values that will be inserted into the query string for the specified fieldName. Please note all values should reflect the fields data type otherwise the insert is subject to fail.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    java.util.List<Object> values;
    /**
     * Operator to apply when editing the query string.
     *
     **/
    public enum Operator {
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
    /**
     * Operator to apply when editing the query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    Operator operator;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
