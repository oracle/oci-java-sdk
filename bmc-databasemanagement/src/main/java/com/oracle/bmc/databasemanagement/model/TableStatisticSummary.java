/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of table statistics statuses, which includes status categories such as Stale, Not Stale, and No Stats,
 * the number of table statistics grouped by status category, and the percentage of objects with a particular status.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TableStatisticSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TableStatisticSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "count", "percentage"})
    public TableStatisticSummary(
            TableStatisticsStatusCategory type, Integer count, Double percentage) {
        super();
        this.type = type;
        this.count = count;
        this.percentage = percentage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The valid status categories of table statistics.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private TableStatisticsStatusCategory type;

        /**
         * The valid status categories of table statistics.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(TableStatisticsStatusCategory type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The number of objects aggregated by status category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The number of objects aggregated by status category.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /**
         * The percentage of objects with a particular status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentage")
        private Double percentage;

        /**
         * The percentage of objects with a particular status.
         * @param percentage the value to set
         * @return this builder
         **/
        public Builder percentage(Double percentage) {
            this.percentage = percentage;
            this.__explicitlySet__.add("percentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableStatisticSummary build() {
            TableStatisticSummary model =
                    new TableStatisticSummary(this.type, this.count, this.percentage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableStatisticSummary model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("percentage")) {
                this.percentage(model.getPercentage());
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
     * The valid status categories of table statistics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final TableStatisticsStatusCategory type;

    /**
     * The valid status categories of table statistics.
     * @return the value
     **/
    public TableStatisticsStatusCategory getType() {
        return type;
    }

    /**
     * The number of objects aggregated by status category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The number of objects aggregated by status category.
     * @return the value
     **/
    public Integer getCount() {
        return count;
    }

    /**
     * The percentage of objects with a particular status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentage")
    private final Double percentage;

    /**
     * The percentage of objects with a particular status.
     * @return the value
     **/
    public Double getPercentage() {
        return percentage;
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
        sb.append("TableStatisticSummary(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(", percentage=").append(String.valueOf(this.percentage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableStatisticSummary)) {
            return false;
        }

        TableStatisticSummary other = (TableStatisticSummary) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.percentage, other.percentage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.percentage == null ? 43 : this.percentage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
