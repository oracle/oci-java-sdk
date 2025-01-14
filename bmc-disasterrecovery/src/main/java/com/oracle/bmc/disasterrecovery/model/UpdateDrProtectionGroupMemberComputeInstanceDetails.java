/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Deprecated. Update properties for a compute instance member. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDrProtectionGroupMemberComputeInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDrProtectionGroupMemberComputeInstanceDetails
        extends UpdateDrProtectionGroupMemberDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }
        /**
         * A flag indicating if the compute instance should be moved during DR operations.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMovable")
        private Boolean isMovable;

        /**
         * A flag indicating if the compute instance should be moved during DR operations.
         *
         * <p>Example: {@code false}
         *
         * @param isMovable the value to set
         * @return this builder
         */
        public Builder isMovable(Boolean isMovable) {
            this.isMovable = isMovable;
            this.__explicitlySet__.add("isMovable");
            return this;
        }
        /** A list of compute instance VNIC mappings. */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicMapping")
        private java.util.List<ComputeInstanceVnicMappingDetails> vnicMapping;

        /**
         * A list of compute instance VNIC mappings.
         *
         * @param vnicMapping the value to set
         * @return this builder
         */
        public Builder vnicMapping(java.util.List<ComputeInstanceVnicMappingDetails> vnicMapping) {
            this.vnicMapping = vnicMapping;
            this.__explicitlySet__.add("vnicMapping");
            return this;
        }
        /**
         * The OCID of a compartment in the destination region in which the compute instance should
         * be launched.
         *
         * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationCompartmentId")
        private String destinationCompartmentId;

        /**
         * The OCID of a compartment in the destination region in which the compute instance should
         * be launched.
         *
         * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
         *
         * @param destinationCompartmentId the value to set
         * @return this builder
         */
        public Builder destinationCompartmentId(String destinationCompartmentId) {
            this.destinationCompartmentId = destinationCompartmentId;
            this.__explicitlySet__.add("destinationCompartmentId");
            return this;
        }
        /**
         * The OCID of a dedicated VM host in the destination region on which the compute instance
         * should be launched.
         *
         * <p>Example: {@code ocid1.dedicatedvmhost.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationDedicatedVmHostId")
        private String destinationDedicatedVmHostId;

        /**
         * The OCID of a dedicated VM host in the destination region on which the compute instance
         * should be launched.
         *
         * <p>Example: {@code ocid1.dedicatedvmhost.oc1..uniqueID}
         *
         * @param destinationDedicatedVmHostId the value to set
         * @return this builder
         */
        public Builder destinationDedicatedVmHostId(String destinationDedicatedVmHostId) {
            this.destinationDedicatedVmHostId = destinationDedicatedVmHostId;
            this.__explicitlySet__.add("destinationDedicatedVmHostId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrProtectionGroupMemberComputeInstanceDetails build() {
            UpdateDrProtectionGroupMemberComputeInstanceDetails model =
                    new UpdateDrProtectionGroupMemberComputeInstanceDetails(
                            this.memberId,
                            this.isMovable,
                            this.vnicMapping,
                            this.destinationCompartmentId,
                            this.destinationDedicatedVmHostId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrProtectionGroupMemberComputeInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("isMovable")) {
                this.isMovable(model.getIsMovable());
            }
            if (model.wasPropertyExplicitlySet("vnicMapping")) {
                this.vnicMapping(model.getVnicMapping());
            }
            if (model.wasPropertyExplicitlySet("destinationCompartmentId")) {
                this.destinationCompartmentId(model.getDestinationCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("destinationDedicatedVmHostId")) {
                this.destinationDedicatedVmHostId(model.getDestinationDedicatedVmHostId());
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
    public UpdateDrProtectionGroupMemberComputeInstanceDetails(
            String memberId,
            Boolean isMovable,
            java.util.List<ComputeInstanceVnicMappingDetails> vnicMapping,
            String destinationCompartmentId,
            String destinationDedicatedVmHostId) {
        super(memberId);
        this.isMovable = isMovable;
        this.vnicMapping = vnicMapping;
        this.destinationCompartmentId = destinationCompartmentId;
        this.destinationDedicatedVmHostId = destinationDedicatedVmHostId;
    }

    /**
     * A flag indicating if the compute instance should be moved during DR operations.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMovable")
    private final Boolean isMovable;

    /**
     * A flag indicating if the compute instance should be moved during DR operations.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsMovable() {
        return isMovable;
    }

    /** A list of compute instance VNIC mappings. */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicMapping")
    private final java.util.List<ComputeInstanceVnicMappingDetails> vnicMapping;

    /**
     * A list of compute instance VNIC mappings.
     *
     * @return the value
     */
    public java.util.List<ComputeInstanceVnicMappingDetails> getVnicMapping() {
        return vnicMapping;
    }

    /**
     * The OCID of a compartment in the destination region in which the compute instance should be
     * launched.
     *
     * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationCompartmentId")
    private final String destinationCompartmentId;

    /**
     * The OCID of a compartment in the destination region in which the compute instance should be
     * launched.
     *
     * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDestinationCompartmentId() {
        return destinationCompartmentId;
    }

    /**
     * The OCID of a dedicated VM host in the destination region on which the compute instance
     * should be launched.
     *
     * <p>Example: {@code ocid1.dedicatedvmhost.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationDedicatedVmHostId")
    private final String destinationDedicatedVmHostId;

    /**
     * The OCID of a dedicated VM host in the destination region on which the compute instance
     * should be launched.
     *
     * <p>Example: {@code ocid1.dedicatedvmhost.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDestinationDedicatedVmHostId() {
        return destinationDedicatedVmHostId;
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
        sb.append("UpdateDrProtectionGroupMemberComputeInstanceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isMovable=").append(String.valueOf(this.isMovable));
        sb.append(", vnicMapping=").append(String.valueOf(this.vnicMapping));
        sb.append(", destinationCompartmentId=")
                .append(String.valueOf(this.destinationCompartmentId));
        sb.append(", destinationDedicatedVmHostId=")
                .append(String.valueOf(this.destinationDedicatedVmHostId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrProtectionGroupMemberComputeInstanceDetails)) {
            return false;
        }

        UpdateDrProtectionGroupMemberComputeInstanceDetails other =
                (UpdateDrProtectionGroupMemberComputeInstanceDetails) o;
        return java.util.Objects.equals(this.isMovable, other.isMovable)
                && java.util.Objects.equals(this.vnicMapping, other.vnicMapping)
                && java.util.Objects.equals(
                        this.destinationCompartmentId, other.destinationCompartmentId)
                && java.util.Objects.equals(
                        this.destinationDedicatedVmHostId, other.destinationDedicatedVmHostId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.isMovable == null ? 43 : this.isMovable.hashCode());
        result = (result * PRIME) + (this.vnicMapping == null ? 43 : this.vnicMapping.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationCompartmentId == null
                                ? 43
                                : this.destinationCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationDedicatedVmHostId == null
                                ? 43
                                : this.destinationDedicatedVmHostId.hashCode());
        return result;
    }
}
