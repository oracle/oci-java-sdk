/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information to be updated. <br>
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
        builder = UpdateOperationsInsightsWarehouseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOperationsInsightsWarehouseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "cpuAllocated",
        "computeModel",
        "storageAllocatedInGBs",
        "freeformTags",
        "definedTags"
    })
    public UpdateOperationsInsightsWarehouseDetails(
            String displayName,
            Double cpuAllocated,
            OperationsInsightsWarehouse.ComputeModel computeModel,
            Double storageAllocatedInGBs,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.cpuAllocated = cpuAllocated;
        this.computeModel = computeModel;
        this.storageAllocatedInGBs = storageAllocatedInGBs;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** Number of CPUs allocated to OPSI Warehouse ADW. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuAllocated")
        private Double cpuAllocated;

        /**
         * Number of CPUs allocated to OPSI Warehouse ADW.
         *
         * @param cpuAllocated the value to set
         * @return this builder
         */
        public Builder cpuAllocated(Double cpuAllocated) {
            this.cpuAllocated = cpuAllocated;
            this.__explicitlySet__.add("cpuAllocated");
            return this;
        }
        /** The compute model for the OPSI warehouse ADW (OCPU or ECPU) */
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private OperationsInsightsWarehouse.ComputeModel computeModel;

        /**
         * The compute model for the OPSI warehouse ADW (OCPU or ECPU)
         *
         * @param computeModel the value to set
         * @return this builder
         */
        public Builder computeModel(OperationsInsightsWarehouse.ComputeModel computeModel) {
            this.computeModel = computeModel;
            this.__explicitlySet__.add("computeModel");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOperationsInsightsWarehouseDetails build() {
            UpdateOperationsInsightsWarehouseDetails model =
                    new UpdateOperationsInsightsWarehouseDetails(
                            this.displayName,
                            this.cpuAllocated,
                            this.computeModel,
                            this.storageAllocatedInGBs,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOperationsInsightsWarehouseDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("cpuAllocated")) {
                this.cpuAllocated(model.getCpuAllocated());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("storageAllocatedInGBs")) {
                this.storageAllocatedInGBs(model.getStorageAllocatedInGBs());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** Number of CPUs allocated to OPSI Warehouse ADW. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuAllocated")
    private final Double cpuAllocated;

    /**
     * Number of CPUs allocated to OPSI Warehouse ADW.
     *
     * @return the value
     */
    public Double getCpuAllocated() {
        return cpuAllocated;
    }

    /** The compute model for the OPSI warehouse ADW (OCPU or ECPU) */
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final OperationsInsightsWarehouse.ComputeModel computeModel;

    /**
     * The compute model for the OPSI warehouse ADW (OCPU or ECPU)
     *
     * @return the value
     */
    public OperationsInsightsWarehouse.ComputeModel getComputeModel() {
        return computeModel;
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
        sb.append("UpdateOperationsInsightsWarehouseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", cpuAllocated=").append(String.valueOf(this.cpuAllocated));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", storageAllocatedInGBs=").append(String.valueOf(this.storageAllocatedInGBs));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOperationsInsightsWarehouseDetails)) {
            return false;
        }

        UpdateOperationsInsightsWarehouseDetails other =
                (UpdateOperationsInsightsWarehouseDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.cpuAllocated, other.cpuAllocated)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(this.storageAllocatedInGBs, other.storageAllocatedInGBs)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.cpuAllocated == null ? 43 : this.cpuAllocated.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result =
                (result * PRIME)
                        + (this.storageAllocatedInGBs == null
                                ? 43
                                : this.storageAllocatedInGBs.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
