/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Configration for a metric based vertical scale-up policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MetricBasedVerticalScaleUpConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MetricBasedVerticalScaleUpConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metric")
        private AutoScalePolicyMetricRule metric;

        public Builder metric(AutoScalePolicyMetricRule metric) {
            this.metric = metric;
            this.__explicitlySet__.add("metric");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxOcpusPerNode")
        private Integer maxOcpusPerNode;

        public Builder maxOcpusPerNode(Integer maxOcpusPerNode) {
            this.maxOcpusPerNode = maxOcpusPerNode;
            this.__explicitlySet__.add("maxOcpusPerNode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryPerNode")
        private Integer maxMemoryPerNode;

        public Builder maxMemoryPerNode(Integer maxMemoryPerNode) {
            this.maxMemoryPerNode = maxMemoryPerNode;
            this.__explicitlySet__.add("maxMemoryPerNode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuStepSize")
        private Integer ocpuStepSize;

        public Builder ocpuStepSize(Integer ocpuStepSize) {
            this.ocpuStepSize = ocpuStepSize;
            this.__explicitlySet__.add("ocpuStepSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryStepSize")
        private Integer memoryStepSize;

        public Builder memoryStepSize(Integer memoryStepSize) {
            this.memoryStepSize = memoryStepSize;
            this.__explicitlySet__.add("memoryStepSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricBasedVerticalScaleUpConfig build() {
            MetricBasedVerticalScaleUpConfig __instance__ =
                    new MetricBasedVerticalScaleUpConfig(
                            metric,
                            maxOcpusPerNode,
                            maxMemoryPerNode,
                            ocpuStepSize,
                            memoryStepSize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricBasedVerticalScaleUpConfig o) {
            Builder copiedBuilder =
                    metric(o.getMetric())
                            .maxOcpusPerNode(o.getMaxOcpusPerNode())
                            .maxMemoryPerNode(o.getMaxMemoryPerNode())
                            .ocpuStepSize(o.getOcpuStepSize())
                            .memoryStepSize(o.getMemoryStepSize());

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

    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    AutoScalePolicyMetricRule metric;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the maximum number of OCPUs each node can be scaled-up to. This value is not used for nodes with fixed compute shapes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxOcpusPerNode")
    Integer maxOcpusPerNode;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the maximum memory in GBs each node can be scaled-up to. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryPerNode")
    Integer maxMemoryPerNode;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the number of OCPUs to add to each node during a scale-up event. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuStepSize")
    Integer ocpuStepSize;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the size of memory in GBs to add to each node during a scale-up event. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryStepSize")
    Integer memoryStepSize;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
