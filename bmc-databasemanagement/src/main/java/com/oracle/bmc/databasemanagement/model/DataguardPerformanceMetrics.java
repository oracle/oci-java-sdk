/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of Data Guard performance metrics for Managed Databases.
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
    builder = DataguardPerformanceMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataguardPerformanceMetrics
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"metricsData"})
    public DataguardPerformanceMetrics(java.util.List<PerformanceMetricsData> metricsData) {
        super();
        this.metricsData = metricsData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A summary of Data Guard performance metrics such as ApplyLag, TransportLag and RedoApplyRate, for Managed Databases.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricsData")
        private java.util.List<PerformanceMetricsData> metricsData;

        /**
         * A summary of Data Guard performance metrics such as ApplyLag, TransportLag and RedoApplyRate, for Managed Databases.
         * @param metricsData the value to set
         * @return this builder
         **/
        public Builder metricsData(java.util.List<PerformanceMetricsData> metricsData) {
            this.metricsData = metricsData;
            this.__explicitlySet__.add("metricsData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataguardPerformanceMetrics build() {
            DataguardPerformanceMetrics model = new DataguardPerformanceMetrics(this.metricsData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataguardPerformanceMetrics model) {
            if (model.wasPropertyExplicitlySet("metricsData")) {
                this.metricsData(model.getMetricsData());
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
     * A summary of Data Guard performance metrics such as ApplyLag, TransportLag and RedoApplyRate, for Managed Databases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricsData")
    private final java.util.List<PerformanceMetricsData> metricsData;

    /**
     * A summary of Data Guard performance metrics such as ApplyLag, TransportLag and RedoApplyRate, for Managed Databases.
     * @return the value
     **/
    public java.util.List<PerformanceMetricsData> getMetricsData() {
        return metricsData;
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
        sb.append("DataguardPerformanceMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("metricsData=").append(String.valueOf(this.metricsData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataguardPerformanceMetrics)) {
            return false;
        }

        DataguardPerformanceMetrics other = (DataguardPerformanceMetrics) o;
        return java.util.Objects.equals(this.metricsData, other.metricsData) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metricsData == null ? 43 : this.metricsData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
