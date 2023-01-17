/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlInsightAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlInsightAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"text", "values", "category"})
    public SqlInsightAggregation(String text, java.util.List<Integer> values, String category) {
        super();
        this.text = text;
        this.values = values;
        this.category = category;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        private String text;

        /**
         * Insight text.
         * For example {@code Degrading SQLs}, {@code Variant SQLs},
         *   {@code Inefficient SQLs}, {@code Improving SQLs}, {@code SQLs with Plan Changes},
         *   {@code Degrading SQLs have increasing IO Time above 50%},
         *   {@code Degrading SQLs are variant},
         *   {@code 2 of the 2 variant SQLs have plan changes},
         *   Inefficient SQLs have increasing CPU Time above 50%
         *
         * @param text the value to set
         * @return this builder
         **/
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /**
         * SQL counts for a given insight. For example insight text {@code 2 of 10 SQLs have degrading response time} will have values as [2,10]"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<Integer> values;

        /**
         * SQL counts for a given insight. For example insight text {@code 2 of 10 SQLs have degrading response time} will have values as [2,10]"
         *
         * @param values the value to set
         * @return this builder
         **/
        public Builder values(java.util.List<Integer> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
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
        private String category;

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
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlInsightAggregation build() {
            SqlInsightAggregation model =
                    new SqlInsightAggregation(this.text, this.values, this.category);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlInsightAggregation model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            return this;
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
    private final String text;

    /**
     * Insight text.
     * For example {@code Degrading SQLs}, {@code Variant SQLs},
     *   {@code Inefficient SQLs}, {@code Improving SQLs}, {@code SQLs with Plan Changes},
     *   {@code Degrading SQLs have increasing IO Time above 50%},
     *   {@code Degrading SQLs are variant},
     *   {@code 2 of the 2 variant SQLs have plan changes},
     *   Inefficient SQLs have increasing CPU Time above 50%
     *
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * SQL counts for a given insight. For example insight text {@code 2 of 10 SQLs have degrading response time} will have values as [2,10]"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<Integer> values;

    /**
     * SQL counts for a given insight. For example insight text {@code 2 of 10 SQLs have degrading response time} will have values as [2,10]"
     *
     * @return the value
     **/
    public java.util.List<Integer> getValues() {
        return values;
    }

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
    private final String category;

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
     * @return the value
     **/
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlInsightAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("text=").append(String.valueOf(this.text));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlInsightAggregation)) {
            return false;
        }

        SqlInsightAggregation other = (SqlInsightAggregation) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.category, other.category)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
