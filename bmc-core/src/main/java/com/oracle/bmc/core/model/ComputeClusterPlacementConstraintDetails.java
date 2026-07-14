/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The details for providing placement constraints for a compute cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeClusterPlacementConstraintDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeClusterPlacementConstraintDetails extends PlacementConstraintDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * HPC island for the compute cluster.
         *
         * <p>This field cannot be updated after creation of the compute cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hpcIslandId")
        private String hpcIslandId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * HPC island for the compute cluster.
         *
         * <p>This field cannot be updated after creation of the compute cluster.
         *
         * @param hpcIslandId the value to set
         * @return this builder
         */
        public Builder hpcIslandId(String hpcIslandId) {
            this.hpcIslandId = hpcIslandId;
            this.__explicitlySet__.add("hpcIslandId");
            return this;
        }
        /**
         * The list of target network block OCIDs to constrain placement.
         *
         * <p>If {@code targetNetworkBlockIds} is provided, the {@code hpcIslandId} must be set on
         * the compute cluster, and the provided network blocks must belong to that same HPC island.
         *
         * <p>The ordering of the array will be preserved. Ensure that all items in the array are
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetNetworkBlockIds")
        private java.util.List<String> targetNetworkBlockIds;

        /**
         * The list of target network block OCIDs to constrain placement.
         *
         * <p>If {@code targetNetworkBlockIds} is provided, the {@code hpcIslandId} must be set on
         * the compute cluster, and the provided network blocks must belong to that same HPC island.
         *
         * <p>The ordering of the array will be preserved. Ensure that all items in the array are
         * unique.
         *
         * @param targetNetworkBlockIds the value to set
         * @return this builder
         */
        public Builder targetNetworkBlockIds(java.util.List<String> targetNetworkBlockIds) {
            this.targetNetworkBlockIds = targetNetworkBlockIds;
            this.__explicitlySet__.add("targetNetworkBlockIds");
            return this;
        }
        /**
         * The list of target GPU memory fabric OCIDs to constrain placement.
         *
         * <p>If GMFs are passed in, the {@code hpcIslandId} must be set on the compute cluster, and
         * the provided GMFs must belong to that same HPC island.
         *
         * <p>The ordering of the array will be preserved. Ensure that all items in the array are
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetMemoryFabricIds")
        private java.util.List<String> targetMemoryFabricIds;

        /**
         * The list of target GPU memory fabric OCIDs to constrain placement.
         *
         * <p>If GMFs are passed in, the {@code hpcIslandId} must be set on the compute cluster, and
         * the provided GMFs must belong to that same HPC island.
         *
         * <p>The ordering of the array will be preserved. Ensure that all items in the array are
         * unique.
         *
         * @param targetMemoryFabricIds the value to set
         * @return this builder
         */
        public Builder targetMemoryFabricIds(java.util.List<String> targetMemoryFabricIds) {
            this.targetMemoryFabricIds = targetMemoryFabricIds;
            this.__explicitlySet__.add("targetMemoryFabricIds");
            return this;
        }
        /**
         * The logical placement strategy to apply. Allowed values are {@code SINGLE_TIER}, {@code
         * SINGLE_BLOCK}, and {@code PACKED_DISTRIBUTION_MULTI_BLOCK}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logicalPlacementConstraint")
        private ComputeClusterLogicalPlacementConstraint logicalPlacementConstraint;

        /**
         * The logical placement strategy to apply. Allowed values are {@code SINGLE_TIER}, {@code
         * SINGLE_BLOCK}, and {@code PACKED_DISTRIBUTION_MULTI_BLOCK}.
         *
         * @param logicalPlacementConstraint the value to set
         * @return this builder
         */
        public Builder logicalPlacementConstraint(
                ComputeClusterLogicalPlacementConstraint logicalPlacementConstraint) {
            this.logicalPlacementConstraint = logicalPlacementConstraint;
            this.__explicitlySet__.add("logicalPlacementConstraint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeClusterPlacementConstraintDetails build() {
            ComputeClusterPlacementConstraintDetails model =
                    new ComputeClusterPlacementConstraintDetails(
                            this.hpcIslandId,
                            this.targetNetworkBlockIds,
                            this.targetMemoryFabricIds,
                            this.logicalPlacementConstraint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeClusterPlacementConstraintDetails model) {
            if (model.wasPropertyExplicitlySet("hpcIslandId")) {
                this.hpcIslandId(model.getHpcIslandId());
            }
            if (model.wasPropertyExplicitlySet("targetNetworkBlockIds")) {
                this.targetNetworkBlockIds(model.getTargetNetworkBlockIds());
            }
            if (model.wasPropertyExplicitlySet("targetMemoryFabricIds")) {
                this.targetMemoryFabricIds(model.getTargetMemoryFabricIds());
            }
            if (model.wasPropertyExplicitlySet("logicalPlacementConstraint")) {
                this.logicalPlacementConstraint(model.getLogicalPlacementConstraint());
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

    @Deprecated
    public ComputeClusterPlacementConstraintDetails(
            String hpcIslandId,
            java.util.List<String> targetNetworkBlockIds,
            java.util.List<String> targetMemoryFabricIds,
            ComputeClusterLogicalPlacementConstraint logicalPlacementConstraint) {
        super();
        this.hpcIslandId = hpcIslandId;
        this.targetNetworkBlockIds = targetNetworkBlockIds;
        this.targetMemoryFabricIds = targetMemoryFabricIds;
        this.logicalPlacementConstraint = logicalPlacementConstraint;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HPC
     * island for the compute cluster.
     *
     * <p>This field cannot be updated after creation of the compute cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hpcIslandId")
    private final String hpcIslandId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the HPC
     * island for the compute cluster.
     *
     * <p>This field cannot be updated after creation of the compute cluster.
     *
     * @return the value
     */
    public String getHpcIslandId() {
        return hpcIslandId;
    }

    /**
     * The list of target network block OCIDs to constrain placement.
     *
     * <p>If {@code targetNetworkBlockIds} is provided, the {@code hpcIslandId} must be set on the
     * compute cluster, and the provided network blocks must belong to that same HPC island.
     *
     * <p>The ordering of the array will be preserved. Ensure that all items in the array are
     * unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetNetworkBlockIds")
    private final java.util.List<String> targetNetworkBlockIds;

    /**
     * The list of target network block OCIDs to constrain placement.
     *
     * <p>If {@code targetNetworkBlockIds} is provided, the {@code hpcIslandId} must be set on the
     * compute cluster, and the provided network blocks must belong to that same HPC island.
     *
     * <p>The ordering of the array will be preserved. Ensure that all items in the array are
     * unique.
     *
     * @return the value
     */
    public java.util.List<String> getTargetNetworkBlockIds() {
        return targetNetworkBlockIds;
    }

    /**
     * The list of target GPU memory fabric OCIDs to constrain placement.
     *
     * <p>If GMFs are passed in, the {@code hpcIslandId} must be set on the compute cluster, and the
     * provided GMFs must belong to that same HPC island.
     *
     * <p>The ordering of the array will be preserved. Ensure that all items in the array are
     * unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetMemoryFabricIds")
    private final java.util.List<String> targetMemoryFabricIds;

    /**
     * The list of target GPU memory fabric OCIDs to constrain placement.
     *
     * <p>If GMFs are passed in, the {@code hpcIslandId} must be set on the compute cluster, and the
     * provided GMFs must belong to that same HPC island.
     *
     * <p>The ordering of the array will be preserved. Ensure that all items in the array are
     * unique.
     *
     * @return the value
     */
    public java.util.List<String> getTargetMemoryFabricIds() {
        return targetMemoryFabricIds;
    }

    /**
     * The logical placement strategy to apply. Allowed values are {@code SINGLE_TIER}, {@code
     * SINGLE_BLOCK}, and {@code PACKED_DISTRIBUTION_MULTI_BLOCK}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logicalPlacementConstraint")
    private final ComputeClusterLogicalPlacementConstraint logicalPlacementConstraint;

    /**
     * The logical placement strategy to apply. Allowed values are {@code SINGLE_TIER}, {@code
     * SINGLE_BLOCK}, and {@code PACKED_DISTRIBUTION_MULTI_BLOCK}.
     *
     * @return the value
     */
    public ComputeClusterLogicalPlacementConstraint getLogicalPlacementConstraint() {
        return logicalPlacementConstraint;
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
        sb.append("ComputeClusterPlacementConstraintDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", hpcIslandId=").append(String.valueOf(this.hpcIslandId));
        sb.append(", targetNetworkBlockIds=").append(String.valueOf(this.targetNetworkBlockIds));
        sb.append(", targetMemoryFabricIds=").append(String.valueOf(this.targetMemoryFabricIds));
        sb.append(", logicalPlacementConstraint=")
                .append(String.valueOf(this.logicalPlacementConstraint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeClusterPlacementConstraintDetails)) {
            return false;
        }

        ComputeClusterPlacementConstraintDetails other =
                (ComputeClusterPlacementConstraintDetails) o;
        return java.util.Objects.equals(this.hpcIslandId, other.hpcIslandId)
                && java.util.Objects.equals(this.targetNetworkBlockIds, other.targetNetworkBlockIds)
                && java.util.Objects.equals(this.targetMemoryFabricIds, other.targetMemoryFabricIds)
                && java.util.Objects.equals(
                        this.logicalPlacementConstraint, other.logicalPlacementConstraint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.hpcIslandId == null ? 43 : this.hpcIslandId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetNetworkBlockIds == null
                                ? 43
                                : this.targetNetworkBlockIds.hashCode());
        result =
                (result * PRIME)
                        + (this.targetMemoryFabricIds == null
                                ? 43
                                : this.targetMemoryFabricIds.hashCode());
        result =
                (result * PRIME)
                        + (this.logicalPlacementConstraint == null
                                ? 43
                                : this.logicalPlacementConstraint.hashCode());
        return result;
    }
}
