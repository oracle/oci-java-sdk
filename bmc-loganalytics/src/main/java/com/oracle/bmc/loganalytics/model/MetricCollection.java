/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Metric collection specification.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetricCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MetricCollection extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metricName",
        "queryTableName",
        "metricQueryFieldName",
        "dimensions"
    })
    public MetricCollection(
            String metricName,
            String queryTableName,
            String metricQueryFieldName,
            java.util.List<DimensionField> dimensions) {
        super();
        this.metricName = metricName;
        this.queryTableName = queryTableName;
        this.metricQueryFieldName = metricQueryFieldName;
        this.dimensions = dimensions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The metric name for this metric collection.
         * A valid value starts with an alphabetical character and includes only
         * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * The metric name for this metric collection.
         * A valid value starts with an alphabetical character and includes only
         * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
         *
         * @param metricName the value to set
         * @return this builder
         **/
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /**
         * Output table in the query.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryTableName")
        private String queryTableName;

        /**
         * Output table in the query.
         * @param queryTableName the value to set
         * @return this builder
         **/
        public Builder queryTableName(String queryTableName) {
            this.queryTableName = queryTableName;
            this.__explicitlySet__.add("queryTableName");
            return this;
        }
        /**
         * Output field in the query to be used as the metric value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricQueryFieldName")
        private String metricQueryFieldName;

        /**
         * Output field in the query to be used as the metric value.
         * @param metricQueryFieldName the value to set
         * @return this builder
         **/
        public Builder metricQueryFieldName(String metricQueryFieldName) {
            this.metricQueryFieldName = metricQueryFieldName;
            this.__explicitlySet__.add("metricQueryFieldName");
            return this;
        }
        /**
         * Selected dimension fields for the metric collection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<DimensionField> dimensions;

        /**
         * Selected dimension fields for the metric collection.
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.List<DimensionField> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricCollection build() {
            MetricCollection model =
                    new MetricCollection(
                            this.metricName,
                            this.queryTableName,
                            this.metricQueryFieldName,
                            this.dimensions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricCollection model) {
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("queryTableName")) {
                this.queryTableName(model.getQueryTableName());
            }
            if (model.wasPropertyExplicitlySet("metricQueryFieldName")) {
                this.metricQueryFieldName(model.getMetricQueryFieldName());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
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
     * The metric name for this metric collection.
     * A valid value starts with an alphabetical character and includes only
     * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * The metric name for this metric collection.
     * A valid value starts with an alphabetical character and includes only
     * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     *
     * @return the value
     **/
    public String getMetricName() {
        return metricName;
    }

    /**
     * Output table in the query.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryTableName")
    private final String queryTableName;

    /**
     * Output table in the query.
     * @return the value
     **/
    public String getQueryTableName() {
        return queryTableName;
    }

    /**
     * Output field in the query to be used as the metric value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricQueryFieldName")
    private final String metricQueryFieldName;

    /**
     * Output field in the query to be used as the metric value.
     * @return the value
     **/
    public String getMetricQueryFieldName() {
        return metricQueryFieldName;
    }

    /**
     * Selected dimension fields for the metric collection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<DimensionField> dimensions;

    /**
     * Selected dimension fields for the metric collection.
     * @return the value
     **/
    public java.util.List<DimensionField> getDimensions() {
        return dimensions;
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
        sb.append("MetricCollection(");
        sb.append("super=").append(super.toString());
        sb.append("metricName=").append(String.valueOf(this.metricName));
        sb.append(", queryTableName=").append(String.valueOf(this.queryTableName));
        sb.append(", metricQueryFieldName=").append(String.valueOf(this.metricQueryFieldName));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricCollection)) {
            return false;
        }

        MetricCollection other = (MetricCollection) o;
        return java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.queryTableName, other.queryTableName)
                && java.util.Objects.equals(this.metricQueryFieldName, other.metricQueryFieldName)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result =
                (result * PRIME)
                        + (this.queryTableName == null ? 43 : this.queryTableName.hashCode());
        result =
                (result * PRIME)
                        + (this.metricQueryFieldName == null
                                ? 43
                                : this.metricQueryFieldName.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
