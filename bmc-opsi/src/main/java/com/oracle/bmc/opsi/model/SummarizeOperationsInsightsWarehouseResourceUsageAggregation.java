/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Details of resource usage by an Operations Insights Warehouse resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SummarizeOperationsInsightsWarehouseResourceUsageAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SummarizeOperationsInsightsWarehouseResourceUsageAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeOperationsInsightsWarehouseResourceUsageAggregation build() {
            SummarizeOperationsInsightsWarehouseResourceUsageAggregation model =
                    new SummarizeOperationsInsightsWarehouseResourceUsageAggregation(
                            this.id, this.cpuUsed, this.storageUsedInGBs, this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeOperationsInsightsWarehouseResourceUsageAggregation model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("cpuUsed")) {
                this.cpuUsed(model.getCpuUsed());
            }
            if (model.wasPropertyExplicitlySet("storageUsedInGBs")) {
                this.storageUsedInGBs(model.getStorageUsedInGBs());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
        sb.append("SummarizeOperationsInsightsWarehouseResourceUsageAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", cpuUsed=").append(String.valueOf(this.cpuUsed));
        sb.append(", storageUsedInGBs=").append(String.valueOf(this.storageUsedInGBs));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
