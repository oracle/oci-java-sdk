/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The response containing the cluster cache metrics for the
 * Oracle Real Application Clusters (Oracle RAC) database.
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
    builder = ClusterCacheMetric.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterCacheMetric extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"clusterCacheMetrics"})
    public ClusterCacheMetric(java.util.List<TimeSeriesMetricDefinition> clusterCacheMetrics) {
        super();
        this.clusterCacheMetrics = clusterCacheMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of cluster cache metrics for a specific Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterCacheMetrics")
        private java.util.List<TimeSeriesMetricDefinition> clusterCacheMetrics;

        /**
         * A list of cluster cache metrics for a specific Managed Database.
         * @param clusterCacheMetrics the value to set
         * @return this builder
         **/
        public Builder clusterCacheMetrics(
                java.util.List<TimeSeriesMetricDefinition> clusterCacheMetrics) {
            this.clusterCacheMetrics = clusterCacheMetrics;
            this.__explicitlySet__.add("clusterCacheMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterCacheMetric build() {
            ClusterCacheMetric model = new ClusterCacheMetric(this.clusterCacheMetrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterCacheMetric model) {
            if (model.wasPropertyExplicitlySet("clusterCacheMetrics")) {
                this.clusterCacheMetrics(model.getClusterCacheMetrics());
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
     * A list of cluster cache metrics for a specific Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterCacheMetrics")
    private final java.util.List<TimeSeriesMetricDefinition> clusterCacheMetrics;

    /**
     * A list of cluster cache metrics for a specific Managed Database.
     * @return the value
     **/
    public java.util.List<TimeSeriesMetricDefinition> getClusterCacheMetrics() {
        return clusterCacheMetrics;
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
        sb.append("ClusterCacheMetric(");
        sb.append("super=").append(super.toString());
        sb.append("clusterCacheMetrics=").append(String.valueOf(this.clusterCacheMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterCacheMetric)) {
            return false;
        }

        ClusterCacheMetric other = (ClusterCacheMetric) o;
        return java.util.Objects.equals(this.clusterCacheMetrics, other.clusterCacheMetrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clusterCacheMetrics == null
                                ? 43
                                : this.clusterCacheMetrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
