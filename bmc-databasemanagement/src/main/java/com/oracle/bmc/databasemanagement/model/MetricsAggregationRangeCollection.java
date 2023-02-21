/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The collection of metrics.
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
    builder = MetricsAggregationRangeCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MetricsAggregationRangeCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "startTime", "endTime"})
    public MetricsAggregationRangeCollection(
            java.util.List<MetricsAggregationRange> items, String startTime, String endTime) {
        super();
        this.items = items;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The metric data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<MetricsAggregationRange> items;

        /**
         * The metric data.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<MetricsAggregationRange> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /**
         * The beginning of the metric data query time range. Expressed in UTC in
         * ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private String startTime;

        /**
         * The beginning of the metric data query time range. Expressed in UTC in
         * ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
         *
         * @param startTime the value to set
         * @return this builder
         **/
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /**
         * The end of the metric data query time range. Expressed in UTC in
         * ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private String endTime;

        /**
         * The end of the metric data query time range. Expressed in UTC in
         * ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
         *
         * @param endTime the value to set
         * @return this builder
         **/
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricsAggregationRangeCollection build() {
            MetricsAggregationRangeCollection model =
                    new MetricsAggregationRangeCollection(this.items, this.startTime, this.endTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricsAggregationRangeCollection model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("endTime")) {
                this.endTime(model.getEndTime());
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
     * The metric data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<MetricsAggregationRange> items;

    /**
     * The metric data.
     * @return the value
     **/
    public java.util.List<MetricsAggregationRange> getItems() {
        return items;
    }

    /**
     * The beginning of the metric data query time range. Expressed in UTC in
     * ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final String startTime;

    /**
     * The beginning of the metric data query time range. Expressed in UTC in
     * ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
     *
     * @return the value
     **/
    public String getStartTime() {
        return startTime;
    }

    /**
     * The end of the metric data query time range. Expressed in UTC in
     * ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final String endTime;

    /**
     * The end of the metric data query time range. Expressed in UTC in
     * ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
     *
     * @return the value
     **/
    public String getEndTime() {
        return endTime;
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
        sb.append("MetricsAggregationRangeCollection(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricsAggregationRangeCollection)) {
            return false;
        }

        MetricsAggregationRangeCollection other = (MetricsAggregationRangeCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
