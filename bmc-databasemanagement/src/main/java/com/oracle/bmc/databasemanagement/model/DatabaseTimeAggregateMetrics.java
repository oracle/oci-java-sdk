/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The database time metric details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseTimeAggregateMetrics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseTimeAggregateMetrics {
    @Deprecated
    @java.beans.ConstructorProperties({"cpuCount", "cpuTime", "waitTime", "userIoTime", "cluster"})
    public DatabaseTimeAggregateMetrics(
            MetricDataPoint cpuCount,
            MetricDataPoint cpuTime,
            MetricDataPoint waitTime,
            MetricDataPoint userIoTime,
            MetricDataPoint cluster) {
        super();
        this.cpuCount = cpuCount;
        this.cpuTime = cpuTime;
        this.waitTime = waitTime;
        this.userIoTime = userIoTime;
        this.cluster = cluster;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private MetricDataPoint cpuCount;

        public Builder cpuCount(MetricDataPoint cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTime")
        private MetricDataPoint cpuTime;

        public Builder cpuTime(MetricDataPoint cpuTime) {
            this.cpuTime = cpuTime;
            this.__explicitlySet__.add("cpuTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("waitTime")
        private MetricDataPoint waitTime;

        public Builder waitTime(MetricDataPoint waitTime) {
            this.waitTime = waitTime;
            this.__explicitlySet__.add("waitTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userIoTime")
        private MetricDataPoint userIoTime;

        public Builder userIoTime(MetricDataPoint userIoTime) {
            this.userIoTime = userIoTime;
            this.__explicitlySet__.add("userIoTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cluster")
        private MetricDataPoint cluster;

        public Builder cluster(MetricDataPoint cluster) {
            this.cluster = cluster;
            this.__explicitlySet__.add("cluster");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseTimeAggregateMetrics build() {
            DatabaseTimeAggregateMetrics __instance__ =
                    new DatabaseTimeAggregateMetrics(
                            cpuCount, cpuTime, waitTime, userIoTime, cluster);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseTimeAggregateMetrics o) {
            Builder copiedBuilder =
                    cpuCount(o.getCpuCount())
                            .cpuTime(o.getCpuTime())
                            .waitTime(o.getWaitTime())
                            .userIoTime(o.getUserIoTime())
                            .cluster(o.getCluster());

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

    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    private final MetricDataPoint cpuCount;

    public MetricDataPoint getCpuCount() {
        return cpuCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpuTime")
    private final MetricDataPoint cpuTime;

    public MetricDataPoint getCpuTime() {
        return cpuTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("waitTime")
    private final MetricDataPoint waitTime;

    public MetricDataPoint getWaitTime() {
        return waitTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userIoTime")
    private final MetricDataPoint userIoTime;

    public MetricDataPoint getUserIoTime() {
        return userIoTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cluster")
    private final MetricDataPoint cluster;

    public MetricDataPoint getCluster() {
        return cluster;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseTimeAggregateMetrics(");
        sb.append("cpuCount=").append(String.valueOf(this.cpuCount));
        sb.append(", cpuTime=").append(String.valueOf(this.cpuTime));
        sb.append(", waitTime=").append(String.valueOf(this.waitTime));
        sb.append(", userIoTime=").append(String.valueOf(this.userIoTime));
        sb.append(", cluster=").append(String.valueOf(this.cluster));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseTimeAggregateMetrics)) {
            return false;
        }

        DatabaseTimeAggregateMetrics other = (DatabaseTimeAggregateMetrics) o;
        return java.util.Objects.equals(this.cpuCount, other.cpuCount)
                && java.util.Objects.equals(this.cpuTime, other.cpuTime)
                && java.util.Objects.equals(this.waitTime, other.waitTime)
                && java.util.Objects.equals(this.userIoTime, other.userIoTime)
                && java.util.Objects.equals(this.cluster, other.cluster)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cpuCount == null ? 43 : this.cpuCount.hashCode());
        result = (result * PRIME) + (this.cpuTime == null ? 43 : this.cpuTime.hashCode());
        result = (result * PRIME) + (this.waitTime == null ? 43 : this.waitTime.hashCode());
        result = (result * PRIME) + (this.userIoTime == null ? 43 : this.userIoTime.hashCode());
        result = (result * PRIME) + (this.cluster == null ? 43 : this.cluster.hashCode());
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
