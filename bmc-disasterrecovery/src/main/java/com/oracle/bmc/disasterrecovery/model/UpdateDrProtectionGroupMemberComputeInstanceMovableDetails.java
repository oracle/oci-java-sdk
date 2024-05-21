/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Update properties for a movable compute instance member.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDrProtectionGroupMemberComputeInstanceMovableDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "memberType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDrProtectionGroupMemberComputeInstanceMovableDetails
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
         * A flag indicating if the compute instance should be moved to the same fault domain in the destination region.
         * The compute instance launch will fail if this flag is set to true and capacity is not available in the
         * specified fault domain in the destination region.
         * <p>
         * Example: {@code false}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRetainFaultDomain")
        private Boolean isRetainFaultDomain;

        /**
         * A flag indicating if the compute instance should be moved to the same fault domain in the destination region.
         * The compute instance launch will fail if this flag is set to true and capacity is not available in the
         * specified fault domain in the destination region.
         * <p>
         * Example: {@code false}
         *
         * @param isRetainFaultDomain the value to set
         * @return this builder
         **/
        public Builder isRetainFaultDomain(Boolean isRetainFaultDomain) {
            this.isRetainFaultDomain = isRetainFaultDomain;
            this.__explicitlySet__.add("isRetainFaultDomain");
            return this;
        }
        /**
         * The OCID of a capacity reservation in the destination region which will be used to launch
         * the compute instance.
         * <p>
         * Example: {@code ocid1.capacityreservation.oc1..uniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationCapacityReservationId")
        private String destinationCapacityReservationId;

        /**
         * The OCID of a capacity reservation in the destination region which will be used to launch
         * the compute instance.
         * <p>
         * Example: {@code ocid1.capacityreservation.oc1..uniqueID}
         *
         * @param destinationCapacityReservationId the value to set
         * @return this builder
         **/
        public Builder destinationCapacityReservationId(String destinationCapacityReservationId) {
            this.destinationCapacityReservationId = destinationCapacityReservationId;
            this.__explicitlySet__.add("destinationCapacityReservationId");
            return this;
        }
        /**
         * A list of compute instance VNIC mappings.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicMappings")
        private java.util.List<ComputeInstanceMovableVnicMappingDetails> vnicMappings;

        /**
         * A list of compute instance VNIC mappings.
         *
         * @param vnicMappings the value to set
         * @return this builder
         **/
        public Builder vnicMappings(
                java.util.List<ComputeInstanceMovableVnicMappingDetails> vnicMappings) {
            this.vnicMappings = vnicMappings;
            this.__explicitlySet__.add("vnicMappings");
            return this;
        }
        /**
         * The OCID of a compartment in the destination region in which the compute instance
         * should be launched.
         * <p>
         * Example: {@code ocid1.compartment.oc1..uniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationCompartmentId")
        private String destinationCompartmentId;

        /**
         * The OCID of a compartment in the destination region in which the compute instance
         * should be launched.
         * <p>
         * Example: {@code ocid1.compartment.oc1..uniqueID}
         *
         * @param destinationCompartmentId the value to set
         * @return this builder
         **/
        public Builder destinationCompartmentId(String destinationCompartmentId) {
            this.destinationCompartmentId = destinationCompartmentId;
            this.__explicitlySet__.add("destinationCompartmentId");
            return this;
        }
        /**
         * The OCID of a dedicated VM host in the destination region where the compute instance
         * should be launched.
         * <p>
         * Example: {@code ocid1.dedicatedvmhost.oc1..uniqueID}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationDedicatedVmHostId")
        private String destinationDedicatedVmHostId;

        /**
         * The OCID of a dedicated VM host in the destination region where the compute instance
         * should be launched.
         * <p>
         * Example: {@code ocid1.dedicatedvmhost.oc1..uniqueID}
         *
         * @param destinationDedicatedVmHostId the value to set
         * @return this builder
         **/
        public Builder destinationDedicatedVmHostId(String destinationDedicatedVmHostId) {
            this.destinationDedicatedVmHostId = destinationDedicatedVmHostId;
            this.__explicitlySet__.add("destinationDedicatedVmHostId");
            return this;
        }
        /**
         * A list of operations performed on file systems used by the compute instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemOperations")
        private java.util.List<UpdateComputeInstanceMovableFileSystemOperationDetails>
                fileSystemOperations;

        /**
         * A list of operations performed on file systems used by the compute instance.
         *
         * @param fileSystemOperations the value to set
         * @return this builder
         **/
        public Builder fileSystemOperations(
                java.util.List<UpdateComputeInstanceMovableFileSystemOperationDetails>
                        fileSystemOperations) {
            this.fileSystemOperations = fileSystemOperations;
            this.__explicitlySet__.add("fileSystemOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrProtectionGroupMemberComputeInstanceMovableDetails build() {
            UpdateDrProtectionGroupMemberComputeInstanceMovableDetails model =
                    new UpdateDrProtectionGroupMemberComputeInstanceMovableDetails(
                            this.memberId,
                            this.isRetainFaultDomain,
                            this.destinationCapacityReservationId,
                            this.vnicMappings,
                            this.destinationCompartmentId,
                            this.destinationDedicatedVmHostId,
                            this.fileSystemOperations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrProtectionGroupMemberComputeInstanceMovableDetails model) {
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
            }
            if (model.wasPropertyExplicitlySet("isRetainFaultDomain")) {
                this.isRetainFaultDomain(model.getIsRetainFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("destinationCapacityReservationId")) {
                this.destinationCapacityReservationId(model.getDestinationCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("vnicMappings")) {
                this.vnicMappings(model.getVnicMappings());
            }
            if (model.wasPropertyExplicitlySet("destinationCompartmentId")) {
                this.destinationCompartmentId(model.getDestinationCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("destinationDedicatedVmHostId")) {
                this.destinationDedicatedVmHostId(model.getDestinationDedicatedVmHostId());
            }
            if (model.wasPropertyExplicitlySet("fileSystemOperations")) {
                this.fileSystemOperations(model.getFileSystemOperations());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public UpdateDrProtectionGroupMemberComputeInstanceMovableDetails(
            String memberId,
            Boolean isRetainFaultDomain,
            String destinationCapacityReservationId,
            java.util.List<ComputeInstanceMovableVnicMappingDetails> vnicMappings,
            String destinationCompartmentId,
            String destinationDedicatedVmHostId,
            java.util.List<UpdateComputeInstanceMovableFileSystemOperationDetails>
                    fileSystemOperations) {
        super(memberId);
        this.isRetainFaultDomain = isRetainFaultDomain;
        this.destinationCapacityReservationId = destinationCapacityReservationId;
        this.vnicMappings = vnicMappings;
        this.destinationCompartmentId = destinationCompartmentId;
        this.destinationDedicatedVmHostId = destinationDedicatedVmHostId;
        this.fileSystemOperations = fileSystemOperations;
    }

    /**
     * A flag indicating if the compute instance should be moved to the same fault domain in the destination region.
     * The compute instance launch will fail if this flag is set to true and capacity is not available in the
     * specified fault domain in the destination region.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRetainFaultDomain")
    private final Boolean isRetainFaultDomain;

    /**
     * A flag indicating if the compute instance should be moved to the same fault domain in the destination region.
     * The compute instance launch will fail if this flag is set to true and capacity is not available in the
     * specified fault domain in the destination region.
     * <p>
     * Example: {@code false}
     *
     * @return the value
     **/
    public Boolean getIsRetainFaultDomain() {
        return isRetainFaultDomain;
    }

    /**
     * The OCID of a capacity reservation in the destination region which will be used to launch
     * the compute instance.
     * <p>
     * Example: {@code ocid1.capacityreservation.oc1..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationCapacityReservationId")
    private final String destinationCapacityReservationId;

    /**
     * The OCID of a capacity reservation in the destination region which will be used to launch
     * the compute instance.
     * <p>
     * Example: {@code ocid1.capacityreservation.oc1..uniqueID}
     *
     * @return the value
     **/
    public String getDestinationCapacityReservationId() {
        return destinationCapacityReservationId;
    }

    /**
     * A list of compute instance VNIC mappings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicMappings")
    private final java.util.List<ComputeInstanceMovableVnicMappingDetails> vnicMappings;

    /**
     * A list of compute instance VNIC mappings.
     *
     * @return the value
     **/
    public java.util.List<ComputeInstanceMovableVnicMappingDetails> getVnicMappings() {
        return vnicMappings;
    }

    /**
     * The OCID of a compartment in the destination region in which the compute instance
     * should be launched.
     * <p>
     * Example: {@code ocid1.compartment.oc1..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationCompartmentId")
    private final String destinationCompartmentId;

    /**
     * The OCID of a compartment in the destination region in which the compute instance
     * should be launched.
     * <p>
     * Example: {@code ocid1.compartment.oc1..uniqueID}
     *
     * @return the value
     **/
    public String getDestinationCompartmentId() {
        return destinationCompartmentId;
    }

    /**
     * The OCID of a dedicated VM host in the destination region where the compute instance
     * should be launched.
     * <p>
     * Example: {@code ocid1.dedicatedvmhost.oc1..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationDedicatedVmHostId")
    private final String destinationDedicatedVmHostId;

    /**
     * The OCID of a dedicated VM host in the destination region where the compute instance
     * should be launched.
     * <p>
     * Example: {@code ocid1.dedicatedvmhost.oc1..uniqueID}
     *
     * @return the value
     **/
    public String getDestinationDedicatedVmHostId() {
        return destinationDedicatedVmHostId;
    }

    /**
     * A list of operations performed on file systems used by the compute instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemOperations")
    private final java.util.List<UpdateComputeInstanceMovableFileSystemOperationDetails>
            fileSystemOperations;

    /**
     * A list of operations performed on file systems used by the compute instance.
     *
     * @return the value
     **/
    public java.util.List<UpdateComputeInstanceMovableFileSystemOperationDetails>
            getFileSystemOperations() {
        return fileSystemOperations;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateDrProtectionGroupMemberComputeInstanceMovableDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isRetainFaultDomain=").append(String.valueOf(this.isRetainFaultDomain));
        sb.append(", destinationCapacityReservationId=")
                .append(String.valueOf(this.destinationCapacityReservationId));
        sb.append(", vnicMappings=").append(String.valueOf(this.vnicMappings));
        sb.append(", destinationCompartmentId=")
                .append(String.valueOf(this.destinationCompartmentId));
        sb.append(", destinationDedicatedVmHostId=")
                .append(String.valueOf(this.destinationDedicatedVmHostId));
        sb.append(", fileSystemOperations=").append(String.valueOf(this.fileSystemOperations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrProtectionGroupMemberComputeInstanceMovableDetails)) {
            return false;
        }

        UpdateDrProtectionGroupMemberComputeInstanceMovableDetails other =
                (UpdateDrProtectionGroupMemberComputeInstanceMovableDetails) o;
        return java.util.Objects.equals(this.isRetainFaultDomain, other.isRetainFaultDomain)
                && java.util.Objects.equals(
                        this.destinationCapacityReservationId,
                        other.destinationCapacityReservationId)
                && java.util.Objects.equals(this.vnicMappings, other.vnicMappings)
                && java.util.Objects.equals(
                        this.destinationCompartmentId, other.destinationCompartmentId)
                && java.util.Objects.equals(
                        this.destinationDedicatedVmHostId, other.destinationDedicatedVmHostId)
                && java.util.Objects.equals(this.fileSystemOperations, other.fileSystemOperations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isRetainFaultDomain == null
                                ? 43
                                : this.isRetainFaultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationCapacityReservationId == null
                                ? 43
                                : this.destinationCapacityReservationId.hashCode());
        result = (result * PRIME) + (this.vnicMappings == null ? 43 : this.vnicMappings.hashCode());
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
        result =
                (result * PRIME)
                        + (this.fileSystemOperations == null
                                ? 43
                                : this.fileSystemOperations.hashCode());
        return result;
    }
}
