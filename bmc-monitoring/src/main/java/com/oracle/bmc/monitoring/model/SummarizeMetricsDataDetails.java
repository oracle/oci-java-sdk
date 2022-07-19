/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The request details for retrieving aggregated data.
 * Use the query and optional properties to filter the returned results.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummarizeMetricsDataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummarizeMetricsDataDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespace",
        "resourceGroup",
        "query",
        "startTime",
        "endTime",
        "resolution"
    })
    public SummarizeMetricsDataDetails(
            String namespace,
            String resourceGroup,
            String query,
            java.util.Date startTime,
            java.util.Date endTime,
            String resolution) {
        super();
        this.namespace = namespace;
        this.resourceGroup = resourceGroup;
        this.query = query;
        this.startTime = startTime;
        this.endTime = endTime;
        this.resolution = resolution;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The source service or application to use when searching for metric data points to aggregate.
         * <p>
         * Example: {@code oci_computeagent}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The source service or application to use when searching for metric data points to aggregate.
         * <p>
         * Example: {@code oci_computeagent}
         *
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Resource group that you want to match. A null value returns only metric data that has no resource groups. The specified resource group must exist in the definition of the posted metric. Only one resource group can be applied per metric.
         * A valid resourceGroup value starts with an alphabetical character and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
         * <p>
         * Example: {@code frontend-fleet}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * Resource group that you want to match. A null value returns only metric data that has no resource groups. The specified resource group must exist in the definition of the posted metric. Only one resource group can be applied per metric.
         * A valid resourceGroup value starts with an alphabetical character and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
         * <p>
         * Example: {@code frontend-fleet}
         *
         * @param resourceGroup the value to set
         * @return this builder
         **/
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }
        /**
         * The Monitoring Query Language (MQL) expression to use when searching for metric data points to
         * aggregate. The query must specify a metric, statistic, and interval.
         * Supported values for interval depend on the specified time range. More interval values are supported for smaller time ranges.
         * You can optionally specify dimensions and grouping functions.
         * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
         * <p>
         * Construct your query to avoid exceeding limits on returned data. See {@link MetricData}.
         * <p>
         * For details about Monitoring Query Language (MQL), see
         * [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
         * For available dimensions, review the metric definition for the supported service.
         * See [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
         * <p>
         * Example: {@code CpuUtilization[1m].sum()}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The Monitoring Query Language (MQL) expression to use when searching for metric data points to
         * aggregate. The query must specify a metric, statistic, and interval.
         * Supported values for interval depend on the specified time range. More interval values are supported for smaller time ranges.
         * You can optionally specify dimensions and grouping functions.
         * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
         * <p>
         * Construct your query to avoid exceeding limits on returned data. See {@link MetricData}.
         * <p>
         * For details about Monitoring Query Language (MQL), see
         * [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
         * For available dimensions, review the metric definition for the supported service.
         * See [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
         * <p>
         * Example: {@code CpuUtilization[1m].sum()}
         *
         * @param query the value to set
         * @return this builder
         **/
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /**
         * The beginning of the time range to use when searching for metric data points.
         * Format is defined by RFC3339. The response includes metric data points for the startTime.
         * Default value: the timestamp 3 hours before the call was sent.
         * <p>
         * Example: {@code 2019-02-01T01:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private java.util.Date startTime;

        /**
         * The beginning of the time range to use when searching for metric data points.
         * Format is defined by RFC3339. The response includes metric data points for the startTime.
         * Default value: the timestamp 3 hours before the call was sent.
         * <p>
         * Example: {@code 2019-02-01T01:02:29.600Z}
         *
         * @param startTime the value to set
         * @return this builder
         **/
        public Builder startTime(java.util.Date startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /**
         * The end of the time range to use when searching for metric data points.
         * Format is defined by RFC3339. The response excludes metric data points for the endTime.
         * Default value: the timestamp representing when the call was sent.
         * <p>
         * Example: {@code 2019-02-01T02:02:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private java.util.Date endTime;

        /**
         * The end of the time range to use when searching for metric data points.
         * Format is defined by RFC3339. The response excludes metric data points for the endTime.
         * Default value: the timestamp representing when the call was sent.
         * <p>
         * Example: {@code 2019-02-01T02:02:29.600Z}
         *
         * @param endTime the value to set
         * @return this builder
         **/
        public Builder endTime(java.util.Date endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }
        /**
         * The time between calculated aggregation windows. Use with the query interval to vary the
         * frequency at which aggregated data points are returned. For example, use a query interval of
         * 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute
         * frequency. The resolution must be equal or less than the interval in the query. The default
         * resolution is 1m (one minute). Supported values: {@code 1m}-{@code 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
         * <p>
         * Example: {@code 5m}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resolution")
        private String resolution;

        /**
         * The time between calculated aggregation windows. Use with the query interval to vary the
         * frequency at which aggregated data points are returned. For example, use a query interval of
         * 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute
         * frequency. The resolution must be equal or less than the interval in the query. The default
         * resolution is 1m (one minute). Supported values: {@code 1m}-{@code 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
         * <p>
         * Example: {@code 5m}
         *
         * @param resolution the value to set
         * @return this builder
         **/
        public Builder resolution(String resolution) {
            this.resolution = resolution;
            this.__explicitlySet__.add("resolution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeMetricsDataDetails build() {
            SummarizeMetricsDataDetails __instance__ =
                    new SummarizeMetricsDataDetails(
                            namespace, resourceGroup, query, startTime, endTime, resolution);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeMetricsDataDetails o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .resourceGroup(o.getResourceGroup())
                            .query(o.getQuery())
                            .startTime(o.getStartTime())
                            .endTime(o.getEndTime())
                            .resolution(o.getResolution());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The source service or application to use when searching for metric data points to aggregate.
     * <p>
     * Example: {@code oci_computeagent}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The source service or application to use when searching for metric data points to aggregate.
     * <p>
     * Example: {@code oci_computeagent}
     *
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * Resource group that you want to match. A null value returns only metric data that has no resource groups. The specified resource group must exist in the definition of the posted metric. Only one resource group can be applied per metric.
     * A valid resourceGroup value starts with an alphabetical character and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     * <p>
     * Example: {@code frontend-fleet}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * Resource group that you want to match. A null value returns only metric data that has no resource groups. The specified resource group must exist in the definition of the posted metric. Only one resource group can be applied per metric.
     * A valid resourceGroup value starts with an alphabetical character and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     * <p>
     * Example: {@code frontend-fleet}
     *
     * @return the value
     **/
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * The Monitoring Query Language (MQL) expression to use when searching for metric data points to
     * aggregate. The query must specify a metric, statistic, and interval.
     * Supported values for interval depend on the specified time range. More interval values are supported for smaller time ranges.
     * You can optionally specify dimensions and grouping functions.
     * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
     * <p>
     * Construct your query to avoid exceeding limits on returned data. See {@link MetricData}.
     * <p>
     * For details about Monitoring Query Language (MQL), see
     * [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
     * For available dimensions, review the metric definition for the supported service.
     * See [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
     * <p>
     * Example: {@code CpuUtilization[1m].sum()}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The Monitoring Query Language (MQL) expression to use when searching for metric data points to
     * aggregate. The query must specify a metric, statistic, and interval.
     * Supported values for interval depend on the specified time range. More interval values are supported for smaller time ranges.
     * You can optionally specify dimensions and grouping functions.
     * Supported grouping functions: {@code grouping()}, {@code groupBy()}.
     * <p>
     * Construct your query to avoid exceeding limits on returned data. See {@link MetricData}.
     * <p>
     * For details about Monitoring Query Language (MQL), see
     * [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
     * For available dimensions, review the metric definition for the supported service.
     * See [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
     * <p>
     * Example: {@code CpuUtilization[1m].sum()}
     *
     * @return the value
     **/
    public String getQuery() {
        return query;
    }

    /**
     * The beginning of the time range to use when searching for metric data points.
     * Format is defined by RFC3339. The response includes metric data points for the startTime.
     * Default value: the timestamp 3 hours before the call was sent.
     * <p>
     * Example: {@code 2019-02-01T01:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final java.util.Date startTime;

    /**
     * The beginning of the time range to use when searching for metric data points.
     * Format is defined by RFC3339. The response includes metric data points for the startTime.
     * Default value: the timestamp 3 hours before the call was sent.
     * <p>
     * Example: {@code 2019-02-01T01:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * The end of the time range to use when searching for metric data points.
     * Format is defined by RFC3339. The response excludes metric data points for the endTime.
     * Default value: the timestamp representing when the call was sent.
     * <p>
     * Example: {@code 2019-02-01T02:02:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final java.util.Date endTime;

    /**
     * The end of the time range to use when searching for metric data points.
     * Format is defined by RFC3339. The response excludes metric data points for the endTime.
     * Default value: the timestamp representing when the call was sent.
     * <p>
     * Example: {@code 2019-02-01T02:02:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * The time between calculated aggregation windows. Use with the query interval to vary the
     * frequency at which aggregated data points are returned. For example, use a query interval of
     * 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute
     * frequency. The resolution must be equal or less than the interval in the query. The default
     * resolution is 1m (one minute). Supported values: {@code 1m}-{@code 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
     * <p>
     * Example: {@code 5m}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    private final String resolution;

    /**
     * The time between calculated aggregation windows. Use with the query interval to vary the
     * frequency at which aggregated data points are returned. For example, use a query interval of
     * 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute
     * frequency. The resolution must be equal or less than the interval in the query. The default
     * resolution is 1m (one minute). Supported values: {@code 1m}-{@code 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
     * <p>
     * Example: {@code 5m}
     *
     * @return the value
     **/
    public String getResolution() {
        return resolution;
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
        sb.append("SummarizeMetricsDataDetails(");
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", resolution=").append(String.valueOf(this.resolution));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeMetricsDataDetails)) {
            return false;
        }

        SummarizeMetricsDataDetails other = (SummarizeMetricsDataDetails) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.resolution, other.resolution)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.resolution == null ? 43 : this.resolution.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
