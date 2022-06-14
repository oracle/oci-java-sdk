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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MetricBasedVerticalScaleDownConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MetricBasedVerticalScaleDownConfig {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metric",
        "minOcpusPerNode",
        "minMemoryPerNode",
        "ocpuStepSize",
        "memoryStepSize"
    })
    public MetricBasedVerticalScaleDownConfig(
            AutoScalePolicyMetricRule metric,
            Integer minOcpusPerNode,
            Integer minMemoryPerNode,
            Integer ocpuStepSize,
            Integer memoryStepSize) {
        super();
        this.metric = metric;
        this.minOcpusPerNode = minOcpusPerNode;
        this.minMemoryPerNode = minMemoryPerNode;
        this.ocpuStepSize = ocpuStepSize;
        this.memoryStepSize = memoryStepSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("metric")
        private AutoScalePolicyMetricRule metric;

        public Builder metric(AutoScalePolicyMetricRule metric) {
            this.metric = metric;
            this.__explicitlySet__.add("metric");
            return this;
        }
        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum number of OCPUs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minOcpusPerNode")
        private Integer minOcpusPerNode;

        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum number of OCPUs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
         * @param minOcpusPerNode the value to set
         * @return this builder
         **/
        public Builder minOcpusPerNode(Integer minOcpusPerNode) {
            this.minOcpusPerNode = minOcpusPerNode;
            this.__explicitlySet__.add("minOcpusPerNode");
            return this;
        }
        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum memory in GBs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minMemoryPerNode")
        private Integer minMemoryPerNode;

        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum memory in GBs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
         * @param minMemoryPerNode the value to set
         * @return this builder
         **/
        public Builder minMemoryPerNode(Integer minMemoryPerNode) {
            this.minMemoryPerNode = minMemoryPerNode;
            this.__explicitlySet__.add("minMemoryPerNode");
            return this;
        }
        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the number of OCPUs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuStepSize")
        private Integer ocpuStepSize;

        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the number of OCPUs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
         * @param ocpuStepSize the value to set
         * @return this builder
         **/
        public Builder ocpuStepSize(Integer ocpuStepSize) {
            this.ocpuStepSize = ocpuStepSize;
            this.__explicitlySet__.add("ocpuStepSize");
            return this;
        }
        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the size of memory in GBs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryStepSize")
        private Integer memoryStepSize;

        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the size of memory in GBs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
         * @param memoryStepSize the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    private final AutoScalePolicyMetricRule metric;

    public AutoScalePolicyMetricRule getMetric() {
        return metric;
    }

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum number of OCPUs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minOcpusPerNode")
    private final Integer minOcpusPerNode;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum number of OCPUs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
     * @return the value
     **/
    public Integer getMinOcpusPerNode() {
        return minOcpusPerNode;
    }

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum memory in GBs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minMemoryPerNode")
    private final Integer minMemoryPerNode;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the minimum memory in GBs each node can be scaled-down to. This value is not used for nodes with fixed compute shapes.
     * @return the value
     **/
    public Integer getMinMemoryPerNode() {
        return minMemoryPerNode;
    }

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the number of OCPUs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuStepSize")
    private final Integer ocpuStepSize;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the number of OCPUs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
     * @return the value
     **/
    public Integer getOcpuStepSize() {
        return ocpuStepSize;
    }

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the size of memory in GBs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryStepSize")
    private final Integer memoryStepSize;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the size of memory in GBs to remove from each node during a scale-down event. This value is not used for nodes with fixed compute shapes.
     * @return the value
     **/
    public Integer getMemoryStepSize() {
        return memoryStepSize;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MetricBasedVerticalScaleDownConfig(");
        sb.append("metric=").append(String.valueOf(this.metric));
        sb.append(", minOcpusPerNode=").append(String.valueOf(this.minOcpusPerNode));
        sb.append(", minMemoryPerNode=").append(String.valueOf(this.minMemoryPerNode));
        sb.append(", ocpuStepSize=").append(String.valueOf(this.ocpuStepSize));
        sb.append(", memoryStepSize=").append(String.valueOf(this.memoryStepSize));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricBasedVerticalScaleDownConfig)) {
            return false;
        }

        MetricBasedVerticalScaleDownConfig other = (MetricBasedVerticalScaleDownConfig) o;
        return java.util.Objects.equals(this.metric, other.metric)
                && java.util.Objects.equals(this.minOcpusPerNode, other.minOcpusPerNode)
                && java.util.Objects.equals(this.minMemoryPerNode, other.minMemoryPerNode)
                && java.util.Objects.equals(this.ocpuStepSize, other.ocpuStepSize)
                && java.util.Objects.equals(this.memoryStepSize, other.memoryStepSize)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metric == null ? 43 : this.metric.hashCode());
        result =
                (result * PRIME)
                        + (this.minOcpusPerNode == null ? 43 : this.minOcpusPerNode.hashCode());
        result =
                (result * PRIME)
                        + (this.minMemoryPerNode == null ? 43 : this.minMemoryPerNode.hashCode());
        result = (result * PRIME) + (this.ocpuStepSize == null ? 43 : this.ocpuStepSize.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryStepSize == null ? 43 : this.memoryStepSize.hashCode());
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
