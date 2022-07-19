/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Time of day and vertical scaling configuration.
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
    builder = TimeAndVerticalScalingConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TimeAndVerticalScalingConfig {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeRecurrence",
        "targetShape",
        "targetOcpusPerNode",
        "targetMemoryPerNode"
    })
    public TimeAndVerticalScalingConfig(
            String timeRecurrence,
            String targetShape,
            Integer targetOcpusPerNode,
            Integer targetMemoryPerNode) {
        super();
        this.timeRecurrence = timeRecurrence;
        this.targetShape = targetShape;
        this.targetOcpusPerNode = targetOcpusPerNode;
        this.targetMemoryPerNode = targetMemoryPerNode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Day/time recurrence (specified following RFC 5545) at which to trigger autoscaling action. Currently only WEEKLY frequency is supported. Days of the week are specified using BYDAY field. Time of the day is specified using BYHOUR and BYMINUTE fields. Other fields are not supported.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRecurrence")
        private String timeRecurrence;

        /**
         * Day/time recurrence (specified following RFC 5545) at which to trigger autoscaling action. Currently only WEEKLY frequency is supported. Days of the week are specified using BYDAY field. Time of the day is specified using BYHOUR and BYMINUTE fields. Other fields are not supported.
         *
         * @param timeRecurrence the value to set
         * @return this builder
         **/
        public Builder timeRecurrence(String timeRecurrence) {
            this.timeRecurrence = timeRecurrence;
            this.__explicitlySet__.add("timeRecurrence");
            return this;
        }
        /**
         * For nodes with [fixed compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired shape of each node. This value is not used for nodes with flexible compute shapes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetShape")
        private String targetShape;

        /**
         * For nodes with [fixed compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired shape of each node. This value is not used for nodes with flexible compute shapes.
         *
         * @param targetShape the value to set
         * @return this builder
         **/
        public Builder targetShape(String targetShape) {
            this.targetShape = targetShape;
            this.__explicitlySet__.add("targetShape");
            return this;
        }
        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired OCPUs count on each node. This value is not used for nodes with fixed compute shapes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetOcpusPerNode")
        private Integer targetOcpusPerNode;

        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired OCPUs count on each node. This value is not used for nodes with fixed compute shapes.
         *
         * @param targetOcpusPerNode the value to set
         * @return this builder
         **/
        public Builder targetOcpusPerNode(Integer targetOcpusPerNode) {
            this.targetOcpusPerNode = targetOcpusPerNode;
            this.__explicitlySet__.add("targetOcpusPerNode");
            return this;
        }
        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired memory in GBs on each node. This value is not used for nodes with fixed compute shapes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetMemoryPerNode")
        private Integer targetMemoryPerNode;

        /**
         * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired memory in GBs on each node. This value is not used for nodes with fixed compute shapes.
         *
         * @param targetMemoryPerNode the value to set
         * @return this builder
         **/
        public Builder targetMemoryPerNode(Integer targetMemoryPerNode) {
            this.targetMemoryPerNode = targetMemoryPerNode;
            this.__explicitlySet__.add("targetMemoryPerNode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TimeAndVerticalScalingConfig build() {
            TimeAndVerticalScalingConfig __instance__ =
                    new TimeAndVerticalScalingConfig(
                            timeRecurrence, targetShape, targetOcpusPerNode, targetMemoryPerNode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeAndVerticalScalingConfig o) {
            Builder copiedBuilder =
                    timeRecurrence(o.getTimeRecurrence())
                            .targetShape(o.getTargetShape())
                            .targetOcpusPerNode(o.getTargetOcpusPerNode())
                            .targetMemoryPerNode(o.getTargetMemoryPerNode());

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
     * Day/time recurrence (specified following RFC 5545) at which to trigger autoscaling action. Currently only WEEKLY frequency is supported. Days of the week are specified using BYDAY field. Time of the day is specified using BYHOUR and BYMINUTE fields. Other fields are not supported.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRecurrence")
    private final String timeRecurrence;

    /**
     * Day/time recurrence (specified following RFC 5545) at which to trigger autoscaling action. Currently only WEEKLY frequency is supported. Days of the week are specified using BYDAY field. Time of the day is specified using BYHOUR and BYMINUTE fields. Other fields are not supported.
     *
     * @return the value
     **/
    public String getTimeRecurrence() {
        return timeRecurrence;
    }

    /**
     * For nodes with [fixed compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired shape of each node. This value is not used for nodes with flexible compute shapes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetShape")
    private final String targetShape;

    /**
     * For nodes with [fixed compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired shape of each node. This value is not used for nodes with flexible compute shapes.
     *
     * @return the value
     **/
    public String getTargetShape() {
        return targetShape;
    }

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired OCPUs count on each node. This value is not used for nodes with fixed compute shapes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetOcpusPerNode")
    private final Integer targetOcpusPerNode;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired OCPUs count on each node. This value is not used for nodes with fixed compute shapes.
     *
     * @return the value
     **/
    public Integer getTargetOcpusPerNode() {
        return targetOcpusPerNode;
    }

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired memory in GBs on each node. This value is not used for nodes with fixed compute shapes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetMemoryPerNode")
    private final Integer targetMemoryPerNode;

    /**
     * For nodes with [flexible compute shapes](https://docs.cloud.oracle.com/iaas/Content/bigdata/create-cluster.htm#cluster-plan-shape), this value is the desired memory in GBs on each node. This value is not used for nodes with fixed compute shapes.
     *
     * @return the value
     **/
    public Integer getTargetMemoryPerNode() {
        return targetMemoryPerNode;
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
        sb.append("TimeAndVerticalScalingConfig(");
        sb.append("timeRecurrence=").append(String.valueOf(this.timeRecurrence));
        sb.append(", targetShape=").append(String.valueOf(this.targetShape));
        sb.append(", targetOcpusPerNode=").append(String.valueOf(this.targetOcpusPerNode));
        sb.append(", targetMemoryPerNode=").append(String.valueOf(this.targetMemoryPerNode));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeAndVerticalScalingConfig)) {
            return false;
        }

        TimeAndVerticalScalingConfig other = (TimeAndVerticalScalingConfig) o;
        return java.util.Objects.equals(this.timeRecurrence, other.timeRecurrence)
                && java.util.Objects.equals(this.targetShape, other.targetShape)
                && java.util.Objects.equals(this.targetOcpusPerNode, other.targetOcpusPerNode)
                && java.util.Objects.equals(this.targetMemoryPerNode, other.targetMemoryPerNode)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeRecurrence == null ? 43 : this.timeRecurrence.hashCode());
        result = (result * PRIME) + (this.targetShape == null ? 43 : this.targetShape.hashCode());
        result =
                (result * PRIME)
                        + (this.targetOcpusPerNode == null
                                ? 43
                                : this.targetOcpusPerNode.hashCode());
        result =
                (result * PRIME)
                        + (this.targetMemoryPerNode == null
                                ? 43
                                : this.targetMemoryPerNode.hashCode());
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
