/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.model;

/**
 * The set of aggregated data returned for a metric. For information about metrics, see [Metrics
 * Overview](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#MetricsOverview).
 *
 * <p>Limits information for returned data follows.
 *
 * <p>Data points: 100,000. * Metric streams* within data points: 2,000. * Time range returned for
 * 1-day resolution: 90 days. * Time range returned for 1-hour resolution: 90 days. * Time range
 * returned for 5-minute resolution: 30 days. * Time range returned for 1-minute resolution: 7 days.
 *
 * <p>A metric stream is an individual set of aggregated data for a metric with zero or more
 * dimension values. Metric streams cannot be aggregated across metric groups. A metric group is the
 * combination of a given metric, metric namespace, and tenancy for the purpose of determining
 * limits. For more information about metric-related concepts, see [Monitoring
 * Concepts](https://docs.cloud.oracle.com/iaas/Content/Monitoring/Concepts/monitoringoverview.htm#concepts).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MetricData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MetricData extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespace",
        "resourceGroup",
        "compartmentId",
        "name",
        "dimensions",
        "metadata",
        "resolution",
        "aggregatedDatapoints"
    })
    public MetricData(
            String namespace,
            String resourceGroup,
            String compartmentId,
            String name,
            java.util.Map<String, String> dimensions,
            java.util.Map<String, String> metadata,
            String resolution,
            java.util.List<AggregatedDatapoint> aggregatedDatapoints) {
        super();
        this.namespace = namespace;
        this.resourceGroup = resourceGroup;
        this.compartmentId = compartmentId;
        this.name = name;
        this.dimensions = dimensions;
        this.metadata = metadata;
        this.resolution = resolution;
        this.aggregatedDatapoints = aggregatedDatapoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The reference provided in a metric definition to indicate the source service or
         * application that emitted the metric.
         *
         * <p>Example: {@code oci_computeagent}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The reference provided in a metric definition to indicate the source service or
         * application that emitted the metric.
         *
         * <p>Example: {@code oci_computeagent}
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Resource group provided with the posted metric. A resource group is a custom string that
         * you can match when retrieving custom metrics. Only one resource group can be applied per
         * metric. A valid resourceGroup value starts with an alphabetical character and includes
         * only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs
         * ($).
         *
         * <p>Example: {@code frontend-fleet}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
        private String resourceGroup;

        /**
         * Resource group provided with the posted metric. A resource group is a custom string that
         * you can match when retrieving custom metrics. Only one resource group can be applied per
         * metric. A valid resourceGroup value starts with an alphabetical character and includes
         * only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs
         * ($).
         *
         * <p>Example: {@code frontend-fleet}
         *
         * @param resourceGroup the value to set
         * @return this builder
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            this.__explicitlySet__.add("resourceGroup");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the resources that the aggregated data was returned from.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the resources that the aggregated data was returned from.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the metric.
         *
         * <p>Example: {@code CpuUtilization}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the metric.
         *
         * <p>Example: {@code CpuUtilization}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Qualifiers provided in the definition of the returned metric. Available dimensions vary
         * by metric namespace. Each dimension takes the form of a key-value pair.
         *
         * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.Map<String, String> dimensions;

        /**
         * Qualifiers provided in the definition of the returned metric. Available dimensions vary
         * by metric namespace. Each dimension takes the form of a key-value pair.
         *
         * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
         *
         * @param dimensions the value to set
         * @return this builder
         */
        public Builder dimensions(java.util.Map<String, String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * The references provided in a metric definition to indicate extra information about the
         * metric.
         *
         * <p>Example: {@code "unit": "bytes"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * The references provided in a metric definition to indicate extra information about the
         * metric.
         *
         * <p>Example: {@code "unit": "bytes"}
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The time between calculated aggregation windows. Use with the query interval to vary the
         * frequency for returning aggregated data points. For example, use a query interval of 5
         * minutes with a resolution of 1 minute to retrieve five-minute aggregations at a
         * one-minute frequency. The resolution must be equal or less than the interval in the
         * query. The default resolution is 1m (one minute). Supported values: {@code 1m}-{@code
         * 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
         *
         * <p>Example: {@code 5m}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resolution")
        private String resolution;

        /**
         * The time between calculated aggregation windows. Use with the query interval to vary the
         * frequency for returning aggregated data points. For example, use a query interval of 5
         * minutes with a resolution of 1 minute to retrieve five-minute aggregations at a
         * one-minute frequency. The resolution must be equal or less than the interval in the
         * query. The default resolution is 1m (one minute). Supported values: {@code 1m}-{@code
         * 60m}, {@code 1h}-{@code 24h}, {@code 1d}.
         *
         * <p>Example: {@code 5m}
         *
         * @param resolution the value to set
         * @return this builder
         */
        public Builder resolution(String resolution) {
            this.resolution = resolution;
            this.__explicitlySet__.add("resolution");
            return this;
        }
        /**
         * The list of timestamp-value pairs returned for the specified request. Metric values are
         * rolled up to the start time specified in the request. For important limits information
         * related to data points, see MetricData Reference at the top of this page.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedDatapoints")
        private java.util.List<AggregatedDatapoint> aggregatedDatapoints;

        /**
         * The list of timestamp-value pairs returned for the specified request. Metric values are
         * rolled up to the start time specified in the request. For important limits information
         * related to data points, see MetricData Reference at the top of this page.
         *
         * @param aggregatedDatapoints the value to set
         * @return this builder
         */
        public Builder aggregatedDatapoints(
                java.util.List<AggregatedDatapoint> aggregatedDatapoints) {
            this.aggregatedDatapoints = aggregatedDatapoints;
            this.__explicitlySet__.add("aggregatedDatapoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricData build() {
            MetricData model =
                    new MetricData(
                            this.namespace,
                            this.resourceGroup,
                            this.compartmentId,
                            this.name,
                            this.dimensions,
                            this.metadata,
                            this.resolution,
                            this.aggregatedDatapoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricData model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("resourceGroup")) {
                this.resourceGroup(model.getResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("resolution")) {
                this.resolution(model.getResolution());
            }
            if (model.wasPropertyExplicitlySet("aggregatedDatapoints")) {
                this.aggregatedDatapoints(model.getAggregatedDatapoints());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The reference provided in a metric definition to indicate the source service or application
     * that emitted the metric.
     *
     * <p>Example: {@code oci_computeagent}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The reference provided in a metric definition to indicate the source service or application
     * that emitted the metric.
     *
     * <p>Example: {@code oci_computeagent}
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Resource group provided with the posted metric. A resource group is a custom string that you
     * can match when retrieving custom metrics. Only one resource group can be applied per metric.
     * A valid resourceGroup value starts with an alphabetical character and includes only
     * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     *
     * <p>Example: {@code frontend-fleet}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

    /**
     * Resource group provided with the posted metric. A resource group is a custom string that you
     * can match when retrieving custom metrics. Only one resource group can be applied per metric.
     * A valid resourceGroup value starts with an alphabetical character and includes only
     * alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).
     *
     * <p>Example: {@code frontend-fleet}
     *
     * @return the value
     */
    public String getResourceGroup() {
        return resourceGroup;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the resources that the aggregated data was returned from.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the resources that the aggregated data was returned from.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the metric.
     *
     * <p>Example: {@code CpuUtilization}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the metric.
     *
     * <p>Example: {@code CpuUtilization}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Qualifiers provided in the definition of the returned metric. Available dimensions vary by
     * metric namespace. Each dimension takes the form of a key-value pair.
     *
     * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.Map<String, String> dimensions;

    /**
     * Qualifiers provided in the definition of the returned metric. Available dimensions vary by
     * metric namespace. Each dimension takes the form of a key-value pair.
     *
     * <p>Example: {@code {"resourceId": "ocid1.instance.region1.phx.exampleuniqueID"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * The references provided in a metric definition to indicate extra information about the
     * metric.
     *
     * <p>Example: {@code "unit": "bytes"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * The references provided in a metric definition to indicate extra information about the
     * metric.
     *
     * <p>Example: {@code "unit": "bytes"}
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * The time between calculated aggregation windows. Use with the query interval to vary the
     * frequency for returning aggregated data points. For example, use a query interval of 5
     * minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute
     * frequency. The resolution must be equal or less than the interval in the query. The default
     * resolution is 1m (one minute). Supported values: {@code 1m}-{@code 60m}, {@code 1h}-{@code
     * 24h}, {@code 1d}.
     *
     * <p>Example: {@code 5m}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    private final String resolution;

    /**
     * The time between calculated aggregation windows. Use with the query interval to vary the
     * frequency for returning aggregated data points. For example, use a query interval of 5
     * minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute
     * frequency. The resolution must be equal or less than the interval in the query. The default
     * resolution is 1m (one minute). Supported values: {@code 1m}-{@code 60m}, {@code 1h}-{@code
     * 24h}, {@code 1d}.
     *
     * <p>Example: {@code 5m}
     *
     * @return the value
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * The list of timestamp-value pairs returned for the specified request. Metric values are
     * rolled up to the start time specified in the request. For important limits information
     * related to data points, see MetricData Reference at the top of this page.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedDatapoints")
    private final java.util.List<AggregatedDatapoint> aggregatedDatapoints;

    /**
     * The list of timestamp-value pairs returned for the specified request. Metric values are
     * rolled up to the start time specified in the request. For important limits information
     * related to data points, see MetricData Reference at the top of this page.
     *
     * @return the value
     */
    public java.util.List<AggregatedDatapoint> getAggregatedDatapoints() {
        return aggregatedDatapoints;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MetricData(");
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", resolution=").append(String.valueOf(this.resolution));
        sb.append(", aggregatedDatapoints=").append(String.valueOf(this.aggregatedDatapoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricData)) {
            return false;
        }

        MetricData other = (MetricData) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.resolution, other.resolution)
                && java.util.Objects.equals(this.aggregatedDatapoints, other.aggregatedDatapoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.resolution == null ? 43 : this.resolution.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatedDatapoints == null
                                ? 43
                                : this.aggregatedDatapoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
