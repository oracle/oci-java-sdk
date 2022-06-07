/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Details of resource usage by an Operations Insights Warehouse resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummarizeOperationsInsightsWarehouseResourceUsageAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummarizeOperationsInsightsWarehouseResourceUsageAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "cpuUsed", "storageUsedInGBs", "lifecycleState"})
    public SummarizeOperationsInsightsWarehouseResourceUsageAggregation(
            String id,
            Double cpuUsed,
            Double storageUsedInGBs,
            OperationsInsightsWarehouseLifecycleState lifecycleState) {
        super();
        this.id = id;
        this.cpuUsed = cpuUsed;
        this.storageUsedInGBs = storageUsedInGBs;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsed")
        private Double cpuUsed;

        public Builder cpuUsed(Double cpuUsed) {
            this.cpuUsed = cpuUsed;
            this.__explicitlySet__.add("cpuUsed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInGBs")
        private Double storageUsedInGBs;

        public Builder storageUsedInGBs(Double storageUsedInGBs) {
            this.storageUsedInGBs = storageUsedInGBs;
            this.__explicitlySet__.add("storageUsedInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperationsInsightsWarehouseLifecycleState lifecycleState;

        public Builder lifecycleState(OperationsInsightsWarehouseLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeOperationsInsightsWarehouseResourceUsageAggregation build() {
            SummarizeOperationsInsightsWarehouseResourceUsageAggregation __instance__ =
                    new SummarizeOperationsInsightsWarehouseResourceUsageAggregation(
                            id, cpuUsed, storageUsedInGBs, lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeOperationsInsightsWarehouseResourceUsageAggregation o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .cpuUsed(o.getCpuUsed())
                            .storageUsedInGBs(o.getStorageUsedInGBs())
                            .lifecycleState(o.getLifecycleState());

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
     * OPSI Warehouse OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * Number of OCPUs used by OPSI Warehouse ADW. Can be fractional.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsed")
    private final Double cpuUsed;

    public Double getCpuUsed() {
        return cpuUsed;
    }

    /**
     * Storage by OPSI Warehouse ADW in GB.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInGBs")
    private final Double storageUsedInGBs;

    public Double getStorageUsedInGBs() {
        return storageUsedInGBs;
    }

    /**
     * Possible lifecycle states
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OperationsInsightsWarehouseLifecycleState lifecycleState;

    public OperationsInsightsWarehouseLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SummarizeOperationsInsightsWarehouseResourceUsageAggregation(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", cpuUsed=").append(String.valueOf(this.cpuUsed));
        sb.append(", storageUsedInGBs=").append(String.valueOf(this.storageUsedInGBs));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeOperationsInsightsWarehouseResourceUsageAggregation)) {
            return false;
        }

        SummarizeOperationsInsightsWarehouseResourceUsageAggregation other =
                (SummarizeOperationsInsightsWarehouseResourceUsageAggregation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.cpuUsed, other.cpuUsed)
                && java.util.Objects.equals(this.storageUsedInGBs, other.storageUsedInGBs)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.cpuUsed == null ? 43 : this.cpuUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.storageUsedInGBs == null ? 43 : this.storageUsedInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
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
