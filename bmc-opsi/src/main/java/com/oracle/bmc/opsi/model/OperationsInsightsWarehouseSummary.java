/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a Operations Insights Warehouse resource.
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
    builder = OperationsInsightsWarehouseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OperationsInsightsWarehouseSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuAllocated")
        private Double cpuAllocated;

        public Builder cpuAllocated(Double cpuAllocated) {
            this.cpuAllocated = cpuAllocated;
            this.__explicitlySet__.add("cpuAllocated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsed")
        private Double cpuUsed;

        public Builder cpuUsed(Double cpuUsed) {
            this.cpuUsed = cpuUsed;
            this.__explicitlySet__.add("cpuUsed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageAllocatedInGBs")
        private Double storageAllocatedInGBs;

        public Builder storageAllocatedInGBs(Double storageAllocatedInGBs) {
            this.storageAllocatedInGBs = storageAllocatedInGBs;
            this.__explicitlySet__.add("storageAllocatedInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInGBs")
        private Double storageUsedInGBs;

        public Builder storageUsedInGBs(Double storageUsedInGBs) {
            this.storageUsedInGBs = storageUsedInGBs;
            this.__explicitlySet__.add("storageUsedInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dynamicGroupId")
        private String dynamicGroupId;

        public Builder dynamicGroupId(String dynamicGroupId) {
            this.dynamicGroupId = dynamicGroupId;
            this.__explicitlySet__.add("dynamicGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsTenancyId")
        private String operationsInsightsTenancyId;

        public Builder operationsInsightsTenancyId(String operationsInsightsTenancyId) {
            this.operationsInsightsTenancyId = operationsInsightsTenancyId;
            this.__explicitlySet__.add("operationsInsightsTenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastWalletRotated")
        private java.util.Date timeLastWalletRotated;

        public Builder timeLastWalletRotated(java.util.Date timeLastWalletRotated) {
            this.timeLastWalletRotated = timeLastWalletRotated;
            this.__explicitlySet__.add("timeLastWalletRotated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperationsInsightsWarehouseLifecycleState lifecycleState;

        public Builder lifecycleState(OperationsInsightsWarehouseLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationsInsightsWarehouseSummary build() {
            OperationsInsightsWarehouseSummary __instance__ =
                    new OperationsInsightsWarehouseSummary(
                            id,
                            compartmentId,
                            displayName,
                            cpuAllocated,
                            cpuUsed,
                            storageAllocatedInGBs,
                            storageUsedInGBs,
                            dynamicGroupId,
                            operationsInsightsTenancyId,
                            timeLastWalletRotated,
                            freeformTags,
                            definedTags,
                            systemTags,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationsInsightsWarehouseSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .cpuAllocated(o.getCpuAllocated())
                            .cpuUsed(o.getCpuUsed())
                            .storageAllocatedInGBs(o.getStorageAllocatedInGBs())
                            .storageUsedInGBs(o.getStorageUsedInGBs())
                            .dynamicGroupId(o.getDynamicGroupId())
                            .operationsInsightsTenancyId(o.getOperationsInsightsTenancyId())
                            .timeLastWalletRotated(o.getTimeLastWalletRotated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * User-friedly name of Operations Insights Warehouse that does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Number of OCPUs allocated to OPSI Warehouse ADW.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuAllocated")
    Double cpuAllocated;

    /**
     * Number of OCPUs used by OPSI Warehouse ADW. Can be fractional.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsed")
    Double cpuUsed;

    /**
     * Storage allocated to OPSI Warehouse ADW.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageAllocatedInGBs")
    Double storageAllocatedInGBs;

    /**
     * Storage by OPSI Warehouse ADW in GB.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInGBs")
    Double storageUsedInGBs;

    /**
     * OCID of the dynamic group created for the warehouse
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicGroupId")
    String dynamicGroupId;

    /**
     * Tenancy Identifier of Operations Insights service
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsTenancyId")
    String operationsInsightsTenancyId;

    /**
     * The time at which the ADW wallet was last rotated for the Operations Insights Warehouse. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastWalletRotated")
    java.util.Date timeLastWalletRotated;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The time at which the resource was first created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time at which the resource was last updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Possible lifecycle states
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    OperationsInsightsWarehouseLifecycleState lifecycleState;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
