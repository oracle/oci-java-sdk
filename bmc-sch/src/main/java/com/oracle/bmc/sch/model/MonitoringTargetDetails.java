/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.sch.model;

/**
 * The metric and metric namespace used for the Monitoring target.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200909")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MonitoringTargetDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "kind"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MonitoringTargetDetails extends TargetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricNamespace")
        private String metricNamespace;

        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = metricNamespace;
            this.__explicitlySet__.add("metricNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metric")
        private String metric;

        public Builder metric(String metric) {
            this.metric = metric;
            this.__explicitlySet__.add("metric");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MonitoringTargetDetails build() {
            MonitoringTargetDetails __instance__ =
                    new MonitoringTargetDetails(compartmentId, metricNamespace, metric);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MonitoringTargetDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .metricNamespace(o.getMetricNamespace())
                            .metric(o.getMetric());

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

    @Deprecated
    public MonitoringTargetDetails(String compartmentId, String metricNamespace, String metric) {
        super();
        this.compartmentId = compartmentId;
        this.metricNamespace = metricNamespace;
        this.metric = metric;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The namespace of the metric.
     * <p>
     * Example: `oci_computeagent`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricNamespace")
    String metricNamespace;

    /**
     * The name of the metric.
     * <p>
     * Example: `CpuUtilization`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    String metric;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
