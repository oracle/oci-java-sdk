/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Configration for a metric based vertical scale-down policy.
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
    builder = MetricBasedVerticalScaleDownConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MetricBasedVerticalScaleDownConfig {
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

        @com.fasterxml.jackson.annotation.JsonProperty("minOcpusPerNode")
        private Integer minOcpusPerNode;

        public Builder minOcpusPerNode(Integer minOcpusPerNode) {
            this.minOcpusPerNode = minOcpusPerNode;
            this.__explicitlySet__.add("minOcpusPerNode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minMemoryPerNode")
        private Integer minMemoryPerNode;

        public Builder minMemoryPerNode(Integer minMemoryPerNode) {
            this.minMemoryPerNode = minMemoryPerNode;
            this.__explicitlySet__.add("minMemoryPerNode");
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

        public MetricBasedVerticalScaleDownConfig build() {
            MetricBasedVerticalScaleDownConfig __instance__ =
                    new MetricBasedVerticalScaleDownConfig(
                            metric,
                            minOcpusPerNode,
                            minMemoryPerNode,
                            ocpuStepSize,
                            memoryStepSize);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricBasedVerticalScaleDownConfig o) {
            Builder copiedBuilder =
                    metric(o.getMetric())
                            .minOcpusPerNode(o.getMinOcpusPerNode())
                            .minMemoryPerNode(o.getMinMemoryPerNode())
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
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum number of OCPUs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minOcpusPerNode")
    Integer minOcpusPerNode;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum memory in GBs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minMemoryPerNode")
    Integer minMemoryPerNode;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the number of OCPUs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuStepSize")
    Integer ocpuStepSize;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the size of memory in GBs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryStepSize")
    Integer memoryStepSize;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
