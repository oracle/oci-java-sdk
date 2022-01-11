/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Represents a SQL Insight.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlInsightAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlInsightAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<Integer> values;

        public Builder values(java.util.List<Integer> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlInsightAggregation build() {
            SqlInsightAggregation __instance__ = new SqlInsightAggregation(text, values, category);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlInsightAggregation o) {
            Builder copiedBuilder =
                    text(o.getText()).values(o.getValues()).category(o.getCategory());

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
     * Insight text.
     * For example {@code Degrading SQLs}, {@code Variant SQLs},
     *   {@code Inefficient SQLs}, {@code Improving SQLs}, {@code SQLs with Plan Changes},
     *   {@code Degrading SQLs have increasing IO Time above 50%},
     *   {@code Degrading SQLs are variant},
     *   {@code 2 of the 2 variant SQLs have plan changes},
     *   Inefficient SQLs have increasing CPU Time above 50%
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    String text;

    /**
     * SQL counts for a given insight. For example insight text {@code 2 of 10 SQLs have degrading response time} will have values as [2,10]"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    java.util.List<Integer> values;

    /**
     * Insight category. It would be one of the following
     * DEGRADING,
     * VARIANT,
     * INEFFICIENT,
     * CHANGING_PLANS,
     * IMPROVING,
     * DEGRADING_VARIANT,
     * DEGRADING_INEFFICIENT,
     * DEGRADING_CHANGING_PLANS,
     * DEGRADING_INCREASING_IO,
     * DEGRADING_INCREASING_CPU,
     * DEGRADING_INCREASING_INEFFICIENT_WAIT,
     * DEGRADING_CHANGING_PLANS_AND_INCREASING_IO,
     * DEGRADING_CHANGING_PLANS_AND_INCREASING_CPU,
     * DEGRADING_CHANGING_PLANS_AND_INCREASING_INEFFICIENT_WAIT,VARIANT_INEFFICIENT,
     * VARIANT_CHANGING_PLANS,
     * VARIANT_INCREASING_IO,
     * VARIANT_INCREASING_CPU,
     * VARIANT_INCREASING_INEFFICIENT_WAIT,
     * VARIANT_CHANGING_PLANS_AND_INCREASING_IO,
     * VARIANT_CHANGING_PLANS_AND_INCREASING_CPU,
     * VARIANT_CHANGING_PLANS_AND_INCREASING_INEFFICIENT_WAIT,
     * INEFFICIENT_CHANGING_PLANS,
     * INEFFICIENT_INCREASING_INEFFICIENT_WAIT,
     * INEFFICIENT_CHANGING_PLANS_AND_INCREASING_INEFFICIENT_WAIT
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    String category;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
