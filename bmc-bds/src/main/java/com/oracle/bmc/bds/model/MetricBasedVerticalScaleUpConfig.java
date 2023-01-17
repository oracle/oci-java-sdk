/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Configration for a metric based vertical scale-up policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MetricBasedVerticalScaleUpConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MetricBasedVerticalScaleUpConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metric",
        "maxOcpusPerNode",
        "maxMemoryPerNode",
        "ocpuStepSize",
        "memoryStepSize"
    })
    public MetricBasedVerticalScaleUpConfig(
            AutoScalePolicyMetricRule metric,
            Integer maxOcpusPerNode,
            Integer maxMemoryPerNode,
            Integer ocpuStepSize,
            Integer memoryStepSize) {
        super();
        this.metric = metric;
        this.maxOcpusPerNode = maxOcpusPerNode;
        this.maxMemoryPerNode = maxMemoryPerNode;
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
         * For nodes with [flexible compute
         * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
         * this value is the maximum number of OCPUs each node can be scaled-up to. This value is
         * not used for nodes with fixed compute shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxOcpusPerNode")
        private Integer maxOcpusPerNode;

        /**
         * For nodes with [flexible compute
         * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
         * this value is the maximum number of OCPUs each node can be scaled-up to. This value is
         * not used for nodes with fixed compute shapes.
         *
         * @param maxOcpusPerNode the value to set
         * @return this builder
         */
        public Builder maxOcpusPerNode(Integer maxOcpusPerNode) {
            this.maxOcpusPerNode = maxOcpusPerNode;
            this.__explicitlySet__.add("maxOcpusPerNode");
            return this;
        }
        /**
         * For nodes with [flexible compute
         * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
         * this value is the maximum memory in GBs each node can be scaled-up to. This value is not
         * used for nodes with fixed compute shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryPerNode")
        private Integer maxMemoryPerNode;

        /**
         * For nodes with [flexible compute
         * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
         * this value is the maximum memory in GBs each node can be scaled-up to. This value is not
         * used for nodes with fixed compute shapes.
         *
         * @param maxMemoryPerNode the value to set
         * @return this builder
         */
        public Builder maxMemoryPerNode(Integer maxMemoryPerNode) {
            this.maxMemoryPerNode = maxMemoryPerNode;
            this.__explicitlySet__.add("maxMemoryPerNode");
            return this;
        }
        /**
         * For nodes with [flexible compute
         * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
         * this value is the number of OCPUs to add to each node during a scale-up event. This value
         * is not used for nodes with fixed compute shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuStepSize")
        private Integer ocpuStepSize;

        /**
         * For nodes with [flexible compute
         * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
         * this value is the number of OCPUs to add to each node during a scale-up event. This value
         * is not used for nodes with fixed compute shapes.
         *
         * @param ocpuStepSize the value to set
         * @return this builder
         */
        public Builder ocpuStepSize(Integer ocpuStepSize) {
            this.ocpuStepSize = ocpuStepSize;
            this.__explicitlySet__.add("ocpuStepSize");
            return this;
        }
        /**
         * For nodes with [flexible compute
         * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
         * this value is the size of memory in GBs to add to each node during a scale-up event. This
         * value is not used for nodes with fixed compute shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryStepSize")
        private Integer memoryStepSize;

        /**
         * For nodes with [flexible compute
         * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
         * this value is the size of memory in GBs to add to each node during a scale-up event. This
         * value is not used for nodes with fixed compute shapes.
         *
         * @param memoryStepSize the value to set
         * @return this builder
         */
        public Builder memoryStepSize(Integer memoryStepSize) {
            this.memoryStepSize = memoryStepSize;
            this.__explicitlySet__.add("memoryStepSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricBasedVerticalScaleUpConfig build() {
            MetricBasedVerticalScaleUpConfig model =
                    new MetricBasedVerticalScaleUpConfig(
                            this.metric,
                            this.maxOcpusPerNode,
                            this.maxMemoryPerNode,
                            this.ocpuStepSize,
                            this.memoryStepSize);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricBasedVerticalScaleUpConfig model) {
            if (model.wasPropertyExplicitlySet("metric")) {
                this.metric(model.getMetric());
            }
            if (model.wasPropertyExplicitlySet("maxOcpusPerNode")) {
                this.maxOcpusPerNode(model.getMaxOcpusPerNode());
            }
            if (model.wasPropertyExplicitlySet("maxMemoryPerNode")) {
                this.maxMemoryPerNode(model.getMaxMemoryPerNode());
            }
            if (model.wasPropertyExplicitlySet("ocpuStepSize")) {
                this.ocpuStepSize(model.getOcpuStepSize());
            }
            if (model.wasPropertyExplicitlySet("memoryStepSize")) {
                this.memoryStepSize(model.getMemoryStepSize());
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

    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    private final AutoScalePolicyMetricRule metric;

    public AutoScalePolicyMetricRule getMetric() {
        return metric;
    }

    /**
     * For nodes with [flexible compute
     * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
     * this value is the maximum number of OCPUs each node can be scaled-up to. This value is not
     * used for nodes with fixed compute shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxOcpusPerNode")
    private final Integer maxOcpusPerNode;

    /**
     * For nodes with [flexible compute
     * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
     * this value is the maximum number of OCPUs each node can be scaled-up to. This value is not
     * used for nodes with fixed compute shapes.
     *
     * @return the value
     */
    public Integer getMaxOcpusPerNode() {
        return maxOcpusPerNode;
    }

    /**
     * For nodes with [flexible compute
     * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
     * this value is the maximum memory in GBs each node can be scaled-up to. This value is not used
     * for nodes with fixed compute shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryPerNode")
    private final Integer maxMemoryPerNode;

    /**
     * For nodes with [flexible compute
     * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
     * this value is the maximum memory in GBs each node can be scaled-up to. This value is not used
     * for nodes with fixed compute shapes.
     *
     * @return the value
     */
    public Integer getMaxMemoryPerNode() {
        return maxMemoryPerNode;
    }

    /**
     * For nodes with [flexible compute
     * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
     * this value is the number of OCPUs to add to each node during a scale-up event. This value is
     * not used for nodes with fixed compute shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuStepSize")
    private final Integer ocpuStepSize;

    /**
     * For nodes with [flexible compute
     * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
     * this value is the number of OCPUs to add to each node during a scale-up event. This value is
     * not used for nodes with fixed compute shapes.
     *
     * @return the value
     */
    public Integer getOcpuStepSize() {
        return ocpuStepSize;
    }

    /**
     * For nodes with [flexible compute
     * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
     * this value is the size of memory in GBs to add to each node during a scale-up event. This
     * value is not used for nodes with fixed compute shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryStepSize")
    private final Integer memoryStepSize;

    /**
     * For nodes with [flexible compute
     * shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape),
     * this value is the size of memory in GBs to add to each node during a scale-up event. This
     * value is not used for nodes with fixed compute shapes.
     *
     * @return the value
     */
    public Integer getMemoryStepSize() {
        return memoryStepSize;
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
        sb.append("MetricBasedVerticalScaleUpConfig(");
        sb.append("super=").append(super.toString());
        sb.append("metric=").append(String.valueOf(this.metric));
        sb.append(", maxOcpusPerNode=").append(String.valueOf(this.maxOcpusPerNode));
        sb.append(", maxMemoryPerNode=").append(String.valueOf(this.maxMemoryPerNode));
        sb.append(", ocpuStepSize=").append(String.valueOf(this.ocpuStepSize));
        sb.append(", memoryStepSize=").append(String.valueOf(this.memoryStepSize));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricBasedVerticalScaleUpConfig)) {
            return false;
        }

        MetricBasedVerticalScaleUpConfig other = (MetricBasedVerticalScaleUpConfig) o;
        return java.util.Objects.equals(this.metric, other.metric)
                && java.util.Objects.equals(this.maxOcpusPerNode, other.maxOcpusPerNode)
                && java.util.Objects.equals(this.maxMemoryPerNode, other.maxMemoryPerNode)
                && java.util.Objects.equals(this.ocpuStepSize, other.ocpuStepSize)
                && java.util.Objects.equals(this.memoryStepSize, other.memoryStepSize)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metric == null ? 43 : this.metric.hashCode());
        result =
                (result * PRIME)
                        + (this.maxOcpusPerNode == null ? 43 : this.maxOcpusPerNode.hashCode());
        result =
                (result * PRIME)
                        + (this.maxMemoryPerNode == null ? 43 : this.maxMemoryPerNode.hashCode());
        result = (result * PRIME) + (this.ocpuStepSize == null ? 43 : this.ocpuStepSize.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryStepSize == null ? 43 : this.memoryStepSize.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
