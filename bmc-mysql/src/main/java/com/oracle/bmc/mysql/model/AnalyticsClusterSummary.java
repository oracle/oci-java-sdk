/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * DEPRECATED -- please use HeatWave API instead.
 * A summary of an Analytics Cluster.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyticsClusterSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnalyticsClusterSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "shapeName",
        "clusterSize",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public AnalyticsClusterSummary(
            String shapeName,
            Integer clusterSize,
            AnalyticsCluster.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.shapeName = shapeName;
        this.clusterSize = clusterSize;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The shape determines resources to allocate to the Analytics
         * Cluster nodes - CPU cores, memory.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape determines resources to allocate to the Analytics
         * Cluster nodes - CPU cores, memory.
         *
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * The number of analytics-processing compute instances, of the
         * specified shape, in the Analytics Cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
        private Integer clusterSize;

        /**
         * The number of analytics-processing compute instances, of the
         * specified shape, in the Analytics Cluster.
         *
         * @param clusterSize the value to set
         * @return this builder
         **/
        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = clusterSize;
            this.__explicitlySet__.add("clusterSize");
            return this;
        }
        /**
         * The current state of the MySQL Analytics Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AnalyticsCluster.LifecycleState lifecycleState;

        /**
         * The current state of the MySQL Analytics Cluster.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AnalyticsCluster.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the Analytics Cluster was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Analytics Cluster was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the Analytics Cluster was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Analytics Cluster was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyticsClusterSummary build() {
            AnalyticsClusterSummary __instance__ =
                    new AnalyticsClusterSummary(
                            shapeName, clusterSize, lifecycleState, timeCreated, timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyticsClusterSummary o) {
            Builder copiedBuilder =
                    shapeName(o.getShapeName())
                            .clusterSize(o.getClusterSize())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

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
     * The shape determines resources to allocate to the Analytics
     * Cluster nodes - CPU cores, memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape determines resources to allocate to the Analytics
     * Cluster nodes - CPU cores, memory.
     *
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    /**
     * The number of analytics-processing compute instances, of the
     * specified shape, in the Analytics Cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
    private final Integer clusterSize;

    /**
     * The number of analytics-processing compute instances, of the
     * specified shape, in the Analytics Cluster.
     *
     * @return the value
     **/
    public Integer getClusterSize() {
        return clusterSize;
    }

    /**
     * The current state of the MySQL Analytics Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AnalyticsCluster.LifecycleState lifecycleState;

    /**
     * The current state of the MySQL Analytics Cluster.
     * @return the value
     **/
    public AnalyticsCluster.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the Analytics Cluster was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Analytics Cluster was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the Analytics Cluster was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Analytics Cluster was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("AnalyticsClusterSummary(");
        sb.append("shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", clusterSize=").append(String.valueOf(this.clusterSize));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyticsClusterSummary)) {
            return false;
        }

        AnalyticsClusterSummary other = (AnalyticsClusterSummary) o;
        return java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.clusterSize, other.clusterSize)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.clusterSize == null ? 43 : this.clusterSize.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
