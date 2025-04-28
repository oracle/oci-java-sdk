/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Summary information for a compute network block. <br>
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
        builder = ComputeNetworkBlockSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeNetworkBlockSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "computeCapacityTopologyId",
        "computeHpcIslandId",
        "id",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "totalComputeBareMetalHostCount"
    })
    public ComputeNetworkBlockSummary(
            String computeCapacityTopologyId,
            String computeHpcIslandId,
            String id,
            ComputeNetworkBlock.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Long totalComputeBareMetalHostCount) {
        super();
        this.computeCapacityTopologyId = computeCapacityTopologyId;
        this.computeHpcIslandId = computeHpcIslandId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.totalComputeBareMetalHostCount = totalComputeBareMetalHostCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute capacity topology.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCapacityTopologyId")
        private String computeCapacityTopologyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute capacity topology.
         *
         * @param computeCapacityTopologyId the value to set
         * @return this builder
         */
        public Builder computeCapacityTopologyId(String computeCapacityTopologyId) {
            this.computeCapacityTopologyId = computeCapacityTopologyId;
            this.__explicitlySet__.add("computeCapacityTopologyId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute HPC island.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeHpcIslandId")
        private String computeHpcIslandId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute HPC island.
         *
         * @param computeHpcIslandId the value to set
         * @return this builder
         */
        public Builder computeHpcIslandId(String computeHpcIslandId) {
            this.computeHpcIslandId = computeHpcIslandId;
            this.__explicitlySet__.add("computeHpcIslandId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute network block.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute network block.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The current state of the compute network block. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ComputeNetworkBlock.LifecycleState lifecycleState;

        /**
         * The current state of the compute network block.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ComputeNetworkBlock.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time that the compute network block was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the compute network block was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time that the compute network block was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time that the compute network block was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The total number of compute bare metal hosts located in the compute network block. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalComputeBareMetalHostCount")
        private Long totalComputeBareMetalHostCount;

        /**
         * The total number of compute bare metal hosts located in the compute network block.
         *
         * @param totalComputeBareMetalHostCount the value to set
         * @return this builder
         */
        public Builder totalComputeBareMetalHostCount(Long totalComputeBareMetalHostCount) {
            this.totalComputeBareMetalHostCount = totalComputeBareMetalHostCount;
            this.__explicitlySet__.add("totalComputeBareMetalHostCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeNetworkBlockSummary build() {
            ComputeNetworkBlockSummary model =
                    new ComputeNetworkBlockSummary(
                            this.computeCapacityTopologyId,
                            this.computeHpcIslandId,
                            this.id,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.totalComputeBareMetalHostCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeNetworkBlockSummary model) {
            if (model.wasPropertyExplicitlySet("computeCapacityTopologyId")) {
                this.computeCapacityTopologyId(model.getComputeCapacityTopologyId());
            }
            if (model.wasPropertyExplicitlySet("computeHpcIslandId")) {
                this.computeHpcIslandId(model.getComputeHpcIslandId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("totalComputeBareMetalHostCount")) {
                this.totalComputeBareMetalHostCount(model.getTotalComputeBareMetalHostCount());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute capacity topology.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCapacityTopologyId")
    private final String computeCapacityTopologyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute capacity topology.
     *
     * @return the value
     */
    public String getComputeCapacityTopologyId() {
        return computeCapacityTopologyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute HPC island.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeHpcIslandId")
    private final String computeHpcIslandId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute HPC island.
     *
     * @return the value
     */
    public String getComputeHpcIslandId() {
        return computeHpcIslandId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute network block.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute network block.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current state of the compute network block. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ComputeNetworkBlock.LifecycleState lifecycleState;

    /**
     * The current state of the compute network block.
     *
     * @return the value
     */
    public ComputeNetworkBlock.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time that the compute network block was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the compute network block was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time that the compute network block was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that the compute network block was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The total number of compute bare metal hosts located in the compute network block. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalComputeBareMetalHostCount")
    private final Long totalComputeBareMetalHostCount;

    /**
     * The total number of compute bare metal hosts located in the compute network block.
     *
     * @return the value
     */
    public Long getTotalComputeBareMetalHostCount() {
        return totalComputeBareMetalHostCount;
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
        sb.append("ComputeNetworkBlockSummary(");
        sb.append("super=").append(super.toString());
        sb.append("computeCapacityTopologyId=")
                .append(String.valueOf(this.computeCapacityTopologyId));
        sb.append(", computeHpcIslandId=").append(String.valueOf(this.computeHpcIslandId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", totalComputeBareMetalHostCount=")
                .append(String.valueOf(this.totalComputeBareMetalHostCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeNetworkBlockSummary)) {
            return false;
        }

        ComputeNetworkBlockSummary other = (ComputeNetworkBlockSummary) o;
        return java.util.Objects.equals(
                        this.computeCapacityTopologyId, other.computeCapacityTopologyId)
                && java.util.Objects.equals(this.computeHpcIslandId, other.computeHpcIslandId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.totalComputeBareMetalHostCount, other.totalComputeBareMetalHostCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.computeCapacityTopologyId == null
                                ? 43
                                : this.computeCapacityTopologyId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeHpcIslandId == null
                                ? 43
                                : this.computeHpcIslandId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.totalComputeBareMetalHostCount == null
                                ? 43
                                : this.totalComputeBareMetalHostCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
