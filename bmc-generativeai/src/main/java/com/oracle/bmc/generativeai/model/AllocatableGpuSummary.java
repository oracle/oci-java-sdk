/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Information about allocatable GPUs that can be used to launch dedicated AI clusters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AllocatableGpuSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AllocatableGpuSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "computeShape",
        "totalAvailableGpuUnits",
        "totalUsedGpuUnits",
        "maxAllocatableGpuUnits",
        "gpuAllocations"
    })
    public AllocatableGpuSummary(
            String computeShape,
            Integer totalAvailableGpuUnits,
            Integer totalUsedGpuUnits,
            Integer maxAllocatableGpuUnits,
            java.util.List<GpuAllocation> gpuAllocations) {
        super();
        this.computeShape = computeShape;
        this.totalAvailableGpuUnits = totalAvailableGpuUnits;
        this.totalUsedGpuUnits = totalUsedGpuUnits;
        this.maxAllocatableGpuUnits = maxAllocatableGpuUnits;
        this.gpuAllocations = gpuAllocations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The compute shape for the allocatable GPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
        private String computeShape;

        /**
         * The compute shape for the allocatable GPUs.
         *
         * @param computeShape the value to set
         * @return this builder
         */
        public Builder computeShape(String computeShape) {
            this.computeShape = computeShape;
            this.__explicitlySet__.add("computeShape");
            return this;
        }
        /** The total number of available GPU units for the compute shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalAvailableGpuUnits")
        private Integer totalAvailableGpuUnits;

        /**
         * The total number of available GPU units for the compute shape.
         *
         * @param totalAvailableGpuUnits the value to set
         * @return this builder
         */
        public Builder totalAvailableGpuUnits(Integer totalAvailableGpuUnits) {
            this.totalAvailableGpuUnits = totalAvailableGpuUnits;
            this.__explicitlySet__.add("totalAvailableGpuUnits");
            return this;
        }
        /** The total number of used GPU units for the compute shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalUsedGpuUnits")
        private Integer totalUsedGpuUnits;

        /**
         * The total number of used GPU units for the compute shape.
         *
         * @param totalUsedGpuUnits the value to set
         * @return this builder
         */
        public Builder totalUsedGpuUnits(Integer totalUsedGpuUnits) {
            this.totalUsedGpuUnits = totalUsedGpuUnits;
            this.__explicitlySet__.add("totalUsedGpuUnits");
            return this;
        }
        /**
         * The largest contiguous number of GPU units available from one reservation-backed host for
         * the compute shape. This includes an unused reserved host that must be provisioned before
         * workloads can be scheduled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAllocatableGpuUnits")
        private Integer maxAllocatableGpuUnits;

        /**
         * The largest contiguous number of GPU units available from one reservation-backed host for
         * the compute shape. This includes an unused reserved host that must be provisioned before
         * workloads can be scheduled.
         *
         * @param maxAllocatableGpuUnits the value to set
         * @return this builder
         */
        public Builder maxAllocatableGpuUnits(Integer maxAllocatableGpuUnits) {
            this.maxAllocatableGpuUnits = maxAllocatableGpuUnits;
            this.__explicitlySet__.add("maxAllocatableGpuUnits");
            return this;
        }
        /**
         * The GPU allocation details for the compute shape. Each item represents one underlying
         * capacity allocation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuAllocations")
        private java.util.List<GpuAllocation> gpuAllocations;

        /**
         * The GPU allocation details for the compute shape. Each item represents one underlying
         * capacity allocation.
         *
         * @param gpuAllocations the value to set
         * @return this builder
         */
        public Builder gpuAllocations(java.util.List<GpuAllocation> gpuAllocations) {
            this.gpuAllocations = gpuAllocations;
            this.__explicitlySet__.add("gpuAllocations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllocatableGpuSummary build() {
            AllocatableGpuSummary model =
                    new AllocatableGpuSummary(
                            this.computeShape,
                            this.totalAvailableGpuUnits,
                            this.totalUsedGpuUnits,
                            this.maxAllocatableGpuUnits,
                            this.gpuAllocations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllocatableGpuSummary model) {
            if (model.wasPropertyExplicitlySet("computeShape")) {
                this.computeShape(model.getComputeShape());
            }
            if (model.wasPropertyExplicitlySet("totalAvailableGpuUnits")) {
                this.totalAvailableGpuUnits(model.getTotalAvailableGpuUnits());
            }
            if (model.wasPropertyExplicitlySet("totalUsedGpuUnits")) {
                this.totalUsedGpuUnits(model.getTotalUsedGpuUnits());
            }
            if (model.wasPropertyExplicitlySet("maxAllocatableGpuUnits")) {
                this.maxAllocatableGpuUnits(model.getMaxAllocatableGpuUnits());
            }
            if (model.wasPropertyExplicitlySet("gpuAllocations")) {
                this.gpuAllocations(model.getGpuAllocations());
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

    /** The compute shape for the allocatable GPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
    private final String computeShape;

    /**
     * The compute shape for the allocatable GPUs.
     *
     * @return the value
     */
    public String getComputeShape() {
        return computeShape;
    }

    /** The total number of available GPU units for the compute shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalAvailableGpuUnits")
    private final Integer totalAvailableGpuUnits;

    /**
     * The total number of available GPU units for the compute shape.
     *
     * @return the value
     */
    public Integer getTotalAvailableGpuUnits() {
        return totalAvailableGpuUnits;
    }

    /** The total number of used GPU units for the compute shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalUsedGpuUnits")
    private final Integer totalUsedGpuUnits;

    /**
     * The total number of used GPU units for the compute shape.
     *
     * @return the value
     */
    public Integer getTotalUsedGpuUnits() {
        return totalUsedGpuUnits;
    }

    /**
     * The largest contiguous number of GPU units available from one reservation-backed host for the
     * compute shape. This includes an unused reserved host that must be provisioned before
     * workloads can be scheduled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAllocatableGpuUnits")
    private final Integer maxAllocatableGpuUnits;

    /**
     * The largest contiguous number of GPU units available from one reservation-backed host for the
     * compute shape. This includes an unused reserved host that must be provisioned before
     * workloads can be scheduled.
     *
     * @return the value
     */
    public Integer getMaxAllocatableGpuUnits() {
        return maxAllocatableGpuUnits;
    }

    /**
     * The GPU allocation details for the compute shape. Each item represents one underlying
     * capacity allocation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuAllocations")
    private final java.util.List<GpuAllocation> gpuAllocations;

    /**
     * The GPU allocation details for the compute shape. Each item represents one underlying
     * capacity allocation.
     *
     * @return the value
     */
    public java.util.List<GpuAllocation> getGpuAllocations() {
        return gpuAllocations;
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
        sb.append("AllocatableGpuSummary(");
        sb.append("super=").append(super.toString());
        sb.append("computeShape=").append(String.valueOf(this.computeShape));
        sb.append(", totalAvailableGpuUnits=").append(String.valueOf(this.totalAvailableGpuUnits));
        sb.append(", totalUsedGpuUnits=").append(String.valueOf(this.totalUsedGpuUnits));
        sb.append(", maxAllocatableGpuUnits=").append(String.valueOf(this.maxAllocatableGpuUnits));
        sb.append(", gpuAllocations=").append(String.valueOf(this.gpuAllocations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllocatableGpuSummary)) {
            return false;
        }

        AllocatableGpuSummary other = (AllocatableGpuSummary) o;
        return java.util.Objects.equals(this.computeShape, other.computeShape)
                && java.util.Objects.equals(
                        this.totalAvailableGpuUnits, other.totalAvailableGpuUnits)
                && java.util.Objects.equals(this.totalUsedGpuUnits, other.totalUsedGpuUnits)
                && java.util.Objects.equals(
                        this.maxAllocatableGpuUnits, other.maxAllocatableGpuUnits)
                && java.util.Objects.equals(this.gpuAllocations, other.gpuAllocations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.computeShape == null ? 43 : this.computeShape.hashCode());
        result =
                (result * PRIME)
                        + (this.totalAvailableGpuUnits == null
                                ? 43
                                : this.totalAvailableGpuUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.totalUsedGpuUnits == null ? 43 : this.totalUsedGpuUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.maxAllocatableGpuUnits == null
                                ? 43
                                : this.maxAllocatableGpuUnits.hashCode());
        result =
                (result * PRIME)
                        + (this.gpuAllocations == null ? 43 : this.gpuAllocations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
