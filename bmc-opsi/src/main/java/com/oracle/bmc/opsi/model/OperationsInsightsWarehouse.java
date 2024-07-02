/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * OPSI warehouse resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OperationsInsightsWarehouse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OperationsInsightsWarehouse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "cpuAllocated",
        "cpuUsed",
        "storageAllocatedInGBs",
        "storageUsedInGBs",
        "dynamicGroupId",
        "operationsInsightsTenancyId",
        "timeLastWalletRotated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails"
    })
    public OperationsInsightsWarehouse(
            String id,
            String compartmentId,
            String displayName,
            Double cpuAllocated,
            Double cpuUsed,
            Double storageAllocatedInGBs,
            Double storageUsedInGBs,
            String dynamicGroupId,
            String operationsInsightsTenancyId,
            java.util.Date timeLastWalletRotated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            OperationsInsightsWarehouseLifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.cpuAllocated = cpuAllocated;
        this.cpuUsed = cpuUsed;
        this.storageAllocatedInGBs = storageAllocatedInGBs;
        this.storageUsedInGBs = storageUsedInGBs;
        this.dynamicGroupId = dynamicGroupId;
        this.operationsInsightsTenancyId = operationsInsightsTenancyId;
        this.timeLastWalletRotated = timeLastWalletRotated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OPSI Warehouse OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OPSI Warehouse OCID
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** User-friedly name of Ops Insights Warehouse that does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friedly name of Ops Insights Warehouse that does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Number of OCPUs allocated to OPSI Warehouse ADW. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuAllocated")
        private Double cpuAllocated;

        /**
         * Number of OCPUs allocated to OPSI Warehouse ADW.
         *
         * @param cpuAllocated the value to set
         * @return this builder
         */
        public Builder cpuAllocated(Double cpuAllocated) {
            this.cpuAllocated = cpuAllocated;
            this.__explicitlySet__.add("cpuAllocated");
            return this;
        }
        /** Number of OCPUs used by OPSI Warehouse ADW. Can be fractional. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuUsed")
        private Double cpuUsed;

        /**
         * Number of OCPUs used by OPSI Warehouse ADW. Can be fractional.
         *
         * @param cpuUsed the value to set
         * @return this builder
         */
        public Builder cpuUsed(Double cpuUsed) {
            this.cpuUsed = cpuUsed;
            this.__explicitlySet__.add("cpuUsed");
            return this;
        }
        /** Storage allocated to OPSI Warehouse ADW. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageAllocatedInGBs")
        private Double storageAllocatedInGBs;

        /**
         * Storage allocated to OPSI Warehouse ADW.
         *
         * @param storageAllocatedInGBs the value to set
         * @return this builder
         */
        public Builder storageAllocatedInGBs(Double storageAllocatedInGBs) {
            this.storageAllocatedInGBs = storageAllocatedInGBs;
            this.__explicitlySet__.add("storageAllocatedInGBs");
            return this;
        }
        /** Storage by OPSI Warehouse ADW in GB. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInGBs")
        private Double storageUsedInGBs;

        /**
         * Storage by OPSI Warehouse ADW in GB.
         *
         * @param storageUsedInGBs the value to set
         * @return this builder
         */
        public Builder storageUsedInGBs(Double storageUsedInGBs) {
            this.storageUsedInGBs = storageUsedInGBs;
            this.__explicitlySet__.add("storageUsedInGBs");
            return this;
        }
        /** OCID of the dynamic group created for the warehouse */
        @com.fasterxml.jackson.annotation.JsonProperty("dynamicGroupId")
        private String dynamicGroupId;

        /**
         * OCID of the dynamic group created for the warehouse
         *
         * @param dynamicGroupId the value to set
         * @return this builder
         */
        public Builder dynamicGroupId(String dynamicGroupId) {
            this.dynamicGroupId = dynamicGroupId;
            this.__explicitlySet__.add("dynamicGroupId");
            return this;
        }
        /** Tenancy Identifier of Ops Insights service */
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsTenancyId")
        private String operationsInsightsTenancyId;

        /**
         * Tenancy Identifier of Ops Insights service
         *
         * @param operationsInsightsTenancyId the value to set
         * @return this builder
         */
        public Builder operationsInsightsTenancyId(String operationsInsightsTenancyId) {
            this.operationsInsightsTenancyId = operationsInsightsTenancyId;
            this.__explicitlySet__.add("operationsInsightsTenancyId");
            return this;
        }
        /**
         * The time at which the ADW wallet was last rotated for the Ops Insights Warehouse. An
         * RFC3339 formatted datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastWalletRotated")
        private java.util.Date timeLastWalletRotated;

        /**
         * The time at which the ADW wallet was last rotated for the Ops Insights Warehouse. An
         * RFC3339 formatted datetime string
         *
         * @param timeLastWalletRotated the value to set
         * @return this builder
         */
        public Builder timeLastWalletRotated(java.util.Date timeLastWalletRotated) {
            this.timeLastWalletRotated = timeLastWalletRotated;
            this.__explicitlySet__.add("timeLastWalletRotated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The time at which the resource was first created. An RFC3339 formatted datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time at which the resource was first created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time at which the resource was last updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time at which the resource was last updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Possible lifecycle states */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OperationsInsightsWarehouseLifecycleState lifecycleState;

        /**
         * Possible lifecycle states
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OperationsInsightsWarehouseLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationsInsightsWarehouse build() {
            OperationsInsightsWarehouse model =
                    new OperationsInsightsWarehouse(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.cpuAllocated,
                            this.cpuUsed,
                            this.storageAllocatedInGBs,
                            this.storageUsedInGBs,
                            this.dynamicGroupId,
                            this.operationsInsightsTenancyId,
                            this.timeLastWalletRotated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationsInsightsWarehouse model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("cpuAllocated")) {
                this.cpuAllocated(model.getCpuAllocated());
            }
            if (model.wasPropertyExplicitlySet("cpuUsed")) {
                this.cpuUsed(model.getCpuUsed());
            }
            if (model.wasPropertyExplicitlySet("storageAllocatedInGBs")) {
                this.storageAllocatedInGBs(model.getStorageAllocatedInGBs());
            }
            if (model.wasPropertyExplicitlySet("storageUsedInGBs")) {
                this.storageUsedInGBs(model.getStorageUsedInGBs());
            }
            if (model.wasPropertyExplicitlySet("dynamicGroupId")) {
                this.dynamicGroupId(model.getDynamicGroupId());
            }
            if (model.wasPropertyExplicitlySet("operationsInsightsTenancyId")) {
                this.operationsInsightsTenancyId(model.getOperationsInsightsTenancyId());
            }
            if (model.wasPropertyExplicitlySet("timeLastWalletRotated")) {
                this.timeLastWalletRotated(model.getTimeLastWalletRotated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** OPSI Warehouse OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OPSI Warehouse OCID
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** User-friedly name of Ops Insights Warehouse that does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friedly name of Ops Insights Warehouse that does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Number of OCPUs allocated to OPSI Warehouse ADW. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuAllocated")
    private final Double cpuAllocated;

    /**
     * Number of OCPUs allocated to OPSI Warehouse ADW.
     *
     * @return the value
     */
    public Double getCpuAllocated() {
        return cpuAllocated;
    }

    /** Number of OCPUs used by OPSI Warehouse ADW. Can be fractional. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuUsed")
    private final Double cpuUsed;

    /**
     * Number of OCPUs used by OPSI Warehouse ADW. Can be fractional.
     *
     * @return the value
     */
    public Double getCpuUsed() {
        return cpuUsed;
    }

    /** Storage allocated to OPSI Warehouse ADW. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageAllocatedInGBs")
    private final Double storageAllocatedInGBs;

    /**
     * Storage allocated to OPSI Warehouse ADW.
     *
     * @return the value
     */
    public Double getStorageAllocatedInGBs() {
        return storageAllocatedInGBs;
    }

    /** Storage by OPSI Warehouse ADW in GB. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInGBs")
    private final Double storageUsedInGBs;

    /**
     * Storage by OPSI Warehouse ADW in GB.
     *
     * @return the value
     */
    public Double getStorageUsedInGBs() {
        return storageUsedInGBs;
    }

    /** OCID of the dynamic group created for the warehouse */
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicGroupId")
    private final String dynamicGroupId;

    /**
     * OCID of the dynamic group created for the warehouse
     *
     * @return the value
     */
    public String getDynamicGroupId() {
        return dynamicGroupId;
    }

    /** Tenancy Identifier of Ops Insights service */
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsTenancyId")
    private final String operationsInsightsTenancyId;

    /**
     * Tenancy Identifier of Ops Insights service
     *
     * @return the value
     */
    public String getOperationsInsightsTenancyId() {
        return operationsInsightsTenancyId;
    }

    /**
     * The time at which the ADW wallet was last rotated for the Ops Insights Warehouse. An RFC3339
     * formatted datetime string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastWalletRotated")
    private final java.util.Date timeLastWalletRotated;

    /**
     * The time at which the ADW wallet was last rotated for the Ops Insights Warehouse. An RFC3339
     * formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeLastWalletRotated() {
        return timeLastWalletRotated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** The time at which the resource was first created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time at which the resource was first created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time at which the resource was last updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time at which the resource was last updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Possible lifecycle states */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OperationsInsightsWarehouseLifecycleState lifecycleState;

    /**
     * Possible lifecycle states
     *
     * @return the value
     */
    public OperationsInsightsWarehouseLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("OperationsInsightsWarehouse(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", cpuAllocated=").append(String.valueOf(this.cpuAllocated));
        sb.append(", cpuUsed=").append(String.valueOf(this.cpuUsed));
        sb.append(", storageAllocatedInGBs=").append(String.valueOf(this.storageAllocatedInGBs));
        sb.append(", storageUsedInGBs=").append(String.valueOf(this.storageUsedInGBs));
        sb.append(", dynamicGroupId=").append(String.valueOf(this.dynamicGroupId));
        sb.append(", operationsInsightsTenancyId=")
                .append(String.valueOf(this.operationsInsightsTenancyId));
        sb.append(", timeLastWalletRotated=").append(String.valueOf(this.timeLastWalletRotated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperationsInsightsWarehouse)) {
            return false;
        }

        OperationsInsightsWarehouse other = (OperationsInsightsWarehouse) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.cpuAllocated, other.cpuAllocated)
                && java.util.Objects.equals(this.cpuUsed, other.cpuUsed)
                && java.util.Objects.equals(this.storageAllocatedInGBs, other.storageAllocatedInGBs)
                && java.util.Objects.equals(this.storageUsedInGBs, other.storageUsedInGBs)
                && java.util.Objects.equals(this.dynamicGroupId, other.dynamicGroupId)
                && java.util.Objects.equals(
                        this.operationsInsightsTenancyId, other.operationsInsightsTenancyId)
                && java.util.Objects.equals(this.timeLastWalletRotated, other.timeLastWalletRotated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.cpuAllocated == null ? 43 : this.cpuAllocated.hashCode());
        result = (result * PRIME) + (this.cpuUsed == null ? 43 : this.cpuUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.storageAllocatedInGBs == null
                                ? 43
                                : this.storageAllocatedInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.storageUsedInGBs == null ? 43 : this.storageUsedInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dynamicGroupId == null ? 43 : this.dynamicGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.operationsInsightsTenancyId == null
                                ? 43
                                : this.operationsInsightsTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastWalletRotated == null
                                ? 43
                                : this.timeLastWalletRotated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
