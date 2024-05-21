/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Represents collection of SQL Plan Insights.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlPlanInsights.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlPlanInsights extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"text", "value", "category"})
    public SqlPlanInsights(String text, Long value, String category) {
        super();
        this.text = text;
        this.value = value;
        this.category = category;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * SQL Plan Insight text.
         * For example {@code Number of Plans Used}, {@code Most Executed Plan},
         *   {@code Best Performing Plan}, {@code Worst Performing Plan},
         *   {@code Plan With Most IO},
         *   {@code Plan with Most CPU}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * SQL Plan Insight text.
         * For example {@code Number of Plans Used}, {@code Most Executed Plan},
         *   {@code Best Performing Plan}, {@code Worst Performing Plan},
         *   {@code Plan With Most IO},
         *   {@code Plan with Most CPU}
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
         * SQL execution plan hash value for a given insight. For example {@code Most Executed Plan} insight will have value as "3975467901"
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Long value;

        /**
         * SQL execution plan hash value for a given insight. For example {@code Most Executed Plan} insight will have value as "3975467901"
         *
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(Long value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * SQL Insight category. For example PLANS_USED, MOST_EXECUTED, BEST_PERFORMER, WORST_PERFORMER, MOST_CPU or MOST_IO.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * SQL Insight category. For example PLANS_USED, MOST_EXECUTED, BEST_PERFORMER, WORST_PERFORMER, MOST_CPU or MOST_IO.
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

        public SqlPlanInsights build() {
            SqlPlanInsights model = new SqlPlanInsights(this.text, this.value, this.category);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanInsights model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
     * SQL Plan Insight text.
     * For example {@code Number of Plans Used}, {@code Most Executed Plan},
     *   {@code Best Performing Plan}, {@code Worst Performing Plan},
     *   {@code Plan With Most IO},
     *   {@code Plan with Most CPU}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * SQL Plan Insight text.
     * For example {@code Number of Plans Used}, {@code Most Executed Plan},
     *   {@code Best Performing Plan}, {@code Worst Performing Plan},
     *   {@code Plan With Most IO},
     *   {@code Plan with Most CPU}
     *
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * SQL execution plan hash value for a given insight. For example {@code Most Executed Plan} insight will have value as "3975467901"
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Long value;

    /**
     * SQL execution plan hash value for a given insight. For example {@code Most Executed Plan} insight will have value as "3975467901"
     *
     * @return the value
     **/
    public Long getValue() {
        return value;
    }

    /**
     * SQL Insight category. For example PLANS_USED, MOST_EXECUTED, BEST_PERFORMER, WORST_PERFORMER, MOST_CPU or MOST_IO.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * SQL Insight category. For example PLANS_USED, MOST_EXECUTED, BEST_PERFORMER, WORST_PERFORMER, MOST_CPU or MOST_IO.
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
        sb.append("SqlPlanInsights(");
        sb.append("super=").append(super.toString());
        sb.append("text=").append(String.valueOf(this.text));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlPlanInsights)) {
            return false;
        }

        SqlPlanInsights other = (SqlPlanInsights) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.category, other.category)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
