/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information of the VM Cluster which contains databases. <br>
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
        builder = CreateMacsManagedCloudExadataVmclusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "vmClusterType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMacsManagedCloudExadataVmclusterDetails
        extends CreateMacsManagedCloudExadataClusterDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("vmclusterId")
        private String vmclusterId;

        public Builder vmclusterId(String vmclusterId) {
            this.vmclusterId = vmclusterId;
            this.__explicitlySet__.add("vmclusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The databases that belong to the VM Cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("memberDatabaseDetails")
        private java.util.List<CreateMacsManagedCloudDatabaseInsightDetails> memberDatabaseDetails;

        /**
         * The databases that belong to the VM Cluster
         *
         * @param memberDatabaseDetails the value to set
         * @return this builder
         */
        public Builder memberDatabaseDetails(
                java.util.List<CreateMacsManagedCloudDatabaseInsightDetails>
                        memberDatabaseDetails) {
            this.memberDatabaseDetails = memberDatabaseDetails;
            this.__explicitlySet__.add("memberDatabaseDetails");
            return this;
        }
        /** The autonomous databases that belong to the Autonmous VM Cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("memberAutonomousDetails")
        private java.util.List<CreateMacsManagedAutonomousDatabaseInsightDetails>
                memberAutonomousDetails;

        /**
         * The autonomous databases that belong to the Autonmous VM Cluster
         *
         * @param memberAutonomousDetails the value to set
         * @return this builder
         */
        public Builder memberAutonomousDetails(
                java.util.List<CreateMacsManagedAutonomousDatabaseInsightDetails>
                        memberAutonomousDetails) {
            this.memberAutonomousDetails = memberAutonomousDetails;
            this.__explicitlySet__.add("memberAutonomousDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMacsManagedCloudExadataVmclusterDetails build() {
            CreateMacsManagedCloudExadataVmclusterDetails model =
                    new CreateMacsManagedCloudExadataVmclusterDetails(
                            this.vmclusterId,
                            this.compartmentId,
                            this.memberDatabaseDetails,
                            this.memberAutonomousDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMacsManagedCloudExadataVmclusterDetails model) {
            if (model.wasPropertyExplicitlySet("vmclusterId")) {
                this.vmclusterId(model.getVmclusterId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("memberDatabaseDetails")) {
                this.memberDatabaseDetails(model.getMemberDatabaseDetails());
            }
            if (model.wasPropertyExplicitlySet("memberAutonomousDetails")) {
                this.memberAutonomousDetails(model.getMemberAutonomousDetails());
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
    public CreateMacsManagedCloudExadataVmclusterDetails(
            String vmclusterId,
            String compartmentId,
            java.util.List<CreateMacsManagedCloudDatabaseInsightDetails> memberDatabaseDetails,
            java.util.List<CreateMacsManagedAutonomousDatabaseInsightDetails>
                    memberAutonomousDetails) {
        super(vmclusterId, compartmentId);
        this.memberDatabaseDetails = memberDatabaseDetails;
        this.memberAutonomousDetails = memberAutonomousDetails;
    }

    /** The databases that belong to the VM Cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("memberDatabaseDetails")
    private final java.util.List<CreateMacsManagedCloudDatabaseInsightDetails>
            memberDatabaseDetails;

    /**
     * The databases that belong to the VM Cluster
     *
     * @return the value
     */
    public java.util.List<CreateMacsManagedCloudDatabaseInsightDetails> getMemberDatabaseDetails() {
        return memberDatabaseDetails;
    }

    /** The autonomous databases that belong to the Autonmous VM Cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("memberAutonomousDetails")
    private final java.util.List<CreateMacsManagedAutonomousDatabaseInsightDetails>
            memberAutonomousDetails;

    /**
     * The autonomous databases that belong to the Autonmous VM Cluster
     *
     * @return the value
     */
    public java.util.List<CreateMacsManagedAutonomousDatabaseInsightDetails>
            getMemberAutonomousDetails() {
        return memberAutonomousDetails;
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
        sb.append("CreateMacsManagedCloudExadataVmclusterDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", memberDatabaseDetails=").append(String.valueOf(this.memberDatabaseDetails));
        sb.append(", memberAutonomousDetails=")
                .append(String.valueOf(this.memberAutonomousDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMacsManagedCloudExadataVmclusterDetails)) {
            return false;
        }

        CreateMacsManagedCloudExadataVmclusterDetails other =
                (CreateMacsManagedCloudExadataVmclusterDetails) o;
        return java.util.Objects.equals(this.memberDatabaseDetails, other.memberDatabaseDetails)
                && java.util.Objects.equals(
                        this.memberAutonomousDetails, other.memberAutonomousDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.memberDatabaseDetails == null
                                ? 43
                                : this.memberDatabaseDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.memberAutonomousDetails == null
                                ? 43
                                : this.memberAutonomousDetails.hashCode());
        return result;
    }
}
