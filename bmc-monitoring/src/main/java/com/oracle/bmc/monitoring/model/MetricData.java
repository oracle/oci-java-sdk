/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The set of aggregated data returned for a metric.
 * For information about metrics, see [Metrics Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#MetricsOverview).
 * <p>
 * Limits information for returned data follows.
 * <p>
 * Data points: 100,000.
 * * Metric streams* within data points: 2,000.
 * * Time range returned for 1-hour resolution: 90 days.
 * * Time range returned for 5-minute resolution: 30 days.
 * * Time range returned for any other resolution: 7 days.
 * <p>
 *A metric stream is an individual set of aggregated data for a metric, typically specific to a single resource.
 * Metric streams cannot be aggregated across metric groups.
 * A metric group is the combination of a given metric, metric namespace, and tenancy for the purpose of determining limits.
 * For more information about metric-related concepts, see [Monitoring Concepts](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#concepts).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetricData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MetricData {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resolution")
        private String resolution;

        public Builder resolution(String resolution) {
            this.resolution = resolution;
            this.__explicitlySet__.add("resolution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedDatapoints")
        private java.util.List<AggregatedDatapoint> aggregatedDatapoints;

        public Builder aggregatedDatapoints(
                java.util.List<AggregatedDatapoint> aggregatedDatapoints) {
            this.aggregatedDatapoints = aggregatedDatapoints;
            this.__explicitlySet__.add("aggregatedDatapoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricData build() {
            MetricData __instance__ =
                    new MetricData(
                            namespace,
                            resourceGroup,
                            compartmentId,
                            name,
                            dimensions,
                            metadata,
                            resolution,
                            aggregatedDatapoints);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricData o) {
            Builder copiedBuilder =
                    namespace(o.getNamespace())
                            .resourceGroup(o.getResourceGroup())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .dimensions(o.getDimensions())
                            .metadata(o.getMetadata())
                            .resolution(o.getResolution())
                            .aggregatedDatapoints(o.getAggregatedDatapoints());

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
     * The reference provided in a metric definition to indicate the source service or
     * application that emitted the metric.
     * <p>
     * Example: `oci_computeagent`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * Resource group provided with the posted metric. A resource group is a custom string that can be used as a filter. Only one resource group can be applied per metric.
     * A valid resourceGroup value starts with an alphabetical character and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     * Avoid entering confidential information.
     * <p>
     * Example: `frontend-fleet`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    String resourceGroup;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the
     * resources from which the aggregated data was returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The name of the metric.
     * <p>
     * Example: `CpuUtilization`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Qualifiers provided in the definition of the returned metric.
     * Available dimensions vary by metric namespace. Each dimension takes the form of a key-value pair.
     * <p>
     * Example: `\"resourceId\": \"ocid1.instance.region1.phx.exampleuniqueID\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    java.util.Map<String, String> dimensions;

    /**
     * The references provided in a metric definition to indicate extra information about the metric.
     * <p>
     * Example: `\"unit\": \"bytes\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;

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

    /**
     * The list of timestamp-value pairs returned for the specified request. Metric values are rolled up to the start time specified in the request.
     * For important limits information related to data points, see MetricData Reference at the top of this page.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedDatapoints")
    java.util.List<AggregatedDatapoint> aggregatedDatapoints;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
