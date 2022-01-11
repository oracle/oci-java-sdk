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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummarizeOperationsInsightsWarehouseResourceUsageAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SummarizeOperationsInsightsWarehouseResourceUsageAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * OPSI Warehouse OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Number of OCPUs used by OPSI Warehouse ADW. Can be fractional.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsed")
    Double cpuUsed;

    /**
     * Storage by OPSI Warehouse ADW in GB.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInGBs")
    Double storageUsedInGBs;

    /**
     * Possible lifecycle states
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    OperationsInsightsWarehouseLifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
