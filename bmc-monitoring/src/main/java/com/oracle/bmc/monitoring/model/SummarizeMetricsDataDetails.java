/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummarizeMetricsDataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SummarizeMetricsDataDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private java.util.Date startTime;

        public Builder startTime(java.util.Date startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private java.util.Date endTime;

        public Builder endTime(java.util.Date endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resolution")
        private String resolution;

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

    /**
     * The source service or application to use when searching for metric data points to aggregate.
     * <p>
     * Example: `oci_computeagent`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * Resource group that you want to use as a filter. The specified resource group must exist in the definition of the posted metric. Only one resource group can be applied per metric.
     * A valid resourceGroup value starts with an alphabetical character and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     * Avoid entering confidential information.
     * <p>
     * Example: `frontend-fleet`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    String resourceGroup;

    /**
     * The Monitoring Query Language (MQL) expression to use when searching for metric data points to
     * aggregate. The query must specify a metric, statistic, and interval. Supported values for
     * interval: `1m`-`60m` (also `1h`). You can optionally specify dimensions and grouping functions.
     * Supported grouping functions: `grouping()`, `groupBy()`.
     * <p>
     * Construct your query to avoid exceeding limits on returned data. See {@link MetricData}.
     * <p>
     * For details about Monitoring Query Language (MQL), see
     * [Monitoring Query Language (MQL) Reference](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Reference/mql.htm).
     * For available dimensions, review the metric definition for the supported service.
     * See [Supported Services](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#SupportedServices).
     * <p>
     * Example: `CpuUtilization[1m].sum()`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    String query;

    /**
     * The beginning of the time range to use when searching for metric data points.
     * Format is defined by RFC3339. The response includes metric data points for the startTime.
     * Default value: the timestamp 3 hours before the call was sent.
     * <p>
     * Example: `2019-02-01T01:02:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    java.util.Date startTime;

    /**
     * The end of the time range to use when searching for metric data points.
     * Format is defined by RFC3339. The response excludes metric data points for the endTime.
     * Default value: the timestamp representing when the call was sent.
     * <p>
     * Example: `2019-02-01T02:02:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    java.util.Date endTime;

    /**
     * The time between calculated aggregation windows. Use with the query interval to vary the
     * frequency at which aggregated data points are returned. For example, use a query interval of
     * 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute
     * frequency. The resolution must be equal or less than the interval in the query. The default
     * resolution is 1m (one minute). Supported values: `1m`-`60m` (also `1h`).
     * <p>
     * Example: `5m`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    String resolution;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
