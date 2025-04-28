/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Summary information for a compute bare metal host. <br>
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
        builder = ComputeBareMetalHostSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeBareMetalHostSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "computeCapacityTopologyId",
        "computeHpcIslandId",
        "computeLocalBlockId",
        "computeNetworkBlockId",
        "id",
        "instanceId",
        "instanceShape",
        "lifecycleDetails",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public ComputeBareMetalHostSummary(
            String computeCapacityTopologyId,
            String computeHpcIslandId,
            String computeLocalBlockId,
            String computeNetworkBlockId,
            String id,
            String instanceId,
            String instanceShape,
            ComputeBareMetalHost.LifecycleDetails lifecycleDetails,
            ComputeBareMetalHost.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.computeCapacityTopologyId = computeCapacityTopologyId;
        this.computeHpcIslandId = computeHpcIslandId;
        this.computeLocalBlockId = computeLocalBlockId;
        this.computeNetworkBlockId = computeNetworkBlockId;
        this.id = id;
        this.instanceId = instanceId;
        this.instanceShape = instanceShape;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
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
        @com.fasterxml.jackson.annotation.JsonProperty("computeLocalBlockId")
        private String computeLocalBlockId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute network block.
         *
         * @param computeLocalBlockId the value to set
         * @return this builder
         */
        public Builder computeLocalBlockId(String computeLocalBlockId) {
            this.computeLocalBlockId = computeLocalBlockId;
            this.__explicitlySet__.add("computeLocalBlockId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute local block.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeNetworkBlockId")
        private String computeNetworkBlockId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute local block.
         *
         * @param computeNetworkBlockId the value to set
         * @return this builder
         */
        public Builder computeNetworkBlockId(String computeNetworkBlockId) {
            this.computeNetworkBlockId = computeNetworkBlockId;
            this.__explicitlySet__.add("computeNetworkBlockId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute bare metal host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute bare metal host.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute instance that runs on the compute bare metal host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute instance that runs on the compute bare metal host.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The shape of the compute instance that runs on the compute bare metal host. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
        private String instanceShape;

        /**
         * The shape of the compute instance that runs on the compute bare metal host.
         *
         * @param instanceShape the value to set
         * @return this builder
         */
        public Builder instanceShape(String instanceShape) {
            this.instanceShape = instanceShape;
            this.__explicitlySet__.add("instanceShape");
            return this;
        }
        /** The lifecycle state details of the compute bare metal host. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private ComputeBareMetalHost.LifecycleDetails lifecycleDetails;

        /**
         * The lifecycle state details of the compute bare metal host.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(ComputeBareMetalHost.LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The current state of the compute bare metal host. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ComputeBareMetalHost.LifecycleState lifecycleState;

        /**
         * The current state of the compute bare metal host.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ComputeBareMetalHost.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time that the compute bare metal host was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the compute bare metal host was created, in the format defined by
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
         * The date and time that the compute bare metal host was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time that the compute bare metal host was updated, in the format defined by
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeBareMetalHostSummary build() {
            ComputeBareMetalHostSummary model =
                    new ComputeBareMetalHostSummary(
                            this.computeCapacityTopologyId,
                            this.computeHpcIslandId,
                            this.computeLocalBlockId,
                            this.computeNetworkBlockId,
                            this.id,
                            this.instanceId,
                            this.instanceShape,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeBareMetalHostSummary model) {
            if (model.wasPropertyExplicitlySet("computeCapacityTopologyId")) {
                this.computeCapacityTopologyId(model.getComputeCapacityTopologyId());
            }
            if (model.wasPropertyExplicitlySet("computeHpcIslandId")) {
                this.computeHpcIslandId(model.getComputeHpcIslandId());
            }
            if (model.wasPropertyExplicitlySet("computeLocalBlockId")) {
                this.computeLocalBlockId(model.getComputeLocalBlockId());
            }
            if (model.wasPropertyExplicitlySet("computeNetworkBlockId")) {
                this.computeNetworkBlockId(model.getComputeNetworkBlockId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("instanceShape")) {
                this.instanceShape(model.getInstanceShape());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
    @com.fasterxml.jackson.annotation.JsonProperty("computeLocalBlockId")
    private final String computeLocalBlockId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute network block.
     *
     * @return the value
     */
    public String getComputeLocalBlockId() {
        return computeLocalBlockId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute local block.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeNetworkBlockId")
    private final String computeNetworkBlockId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute local block.
     *
     * @return the value
     */
    public String getComputeNetworkBlockId() {
        return computeNetworkBlockId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute bare metal host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute bare metal host.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute instance that runs on the compute bare metal host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute instance that runs on the compute bare metal host.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** The shape of the compute instance that runs on the compute bare metal host. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
    private final String instanceShape;

    /**
     * The shape of the compute instance that runs on the compute bare metal host.
     *
     * @return the value
     */
    public String getInstanceShape() {
        return instanceShape;
    }

    /** The lifecycle state details of the compute bare metal host. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final ComputeBareMetalHost.LifecycleDetails lifecycleDetails;

    /**
     * The lifecycle state details of the compute bare metal host.
     *
     * @return the value
     */
    public ComputeBareMetalHost.LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The current state of the compute bare metal host. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ComputeBareMetalHost.LifecycleState lifecycleState;

    /**
     * The current state of the compute bare metal host.
     *
     * @return the value
     */
    public ComputeBareMetalHost.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time that the compute bare metal host was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the compute bare metal host was created, in the format defined by
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
     * The date and time that the compute bare metal host was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that the compute bare metal host was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ComputeBareMetalHostSummary(");
        sb.append("super=").append(super.toString());
        sb.append("computeCapacityTopologyId=")
                .append(String.valueOf(this.computeCapacityTopologyId));
        sb.append(", computeHpcIslandId=").append(String.valueOf(this.computeHpcIslandId));
        sb.append(", computeLocalBlockId=").append(String.valueOf(this.computeLocalBlockId));
        sb.append(", computeNetworkBlockId=").append(String.valueOf(this.computeNetworkBlockId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", instanceShape=").append(String.valueOf(this.instanceShape));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeBareMetalHostSummary)) {
            return false;
        }

        ComputeBareMetalHostSummary other = (ComputeBareMetalHostSummary) o;
        return java.util.Objects.equals(
                        this.computeCapacityTopologyId, other.computeCapacityTopologyId)
                && java.util.Objects.equals(this.computeHpcIslandId, other.computeHpcIslandId)
                && java.util.Objects.equals(this.computeLocalBlockId, other.computeLocalBlockId)
                && java.util.Objects.equals(this.computeNetworkBlockId, other.computeNetworkBlockId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.instanceShape, other.instanceShape)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result =
                (result * PRIME)
                        + (this.computeLocalBlockId == null
                                ? 43
                                : this.computeLocalBlockId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeNetworkBlockId == null
                                ? 43
                                : this.computeNetworkBlockId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShape == null ? 43 : this.instanceShape.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
