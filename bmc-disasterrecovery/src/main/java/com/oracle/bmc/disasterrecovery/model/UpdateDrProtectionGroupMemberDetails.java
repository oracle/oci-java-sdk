/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Update properties for a member in a DR protection group. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "memberType",
        defaultImpl = UpdateDrProtectionGroupMemberDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberComputeInstanceDetails.class,
            name = "COMPUTE_INSTANCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberNetworkLoadBalancerDetails.class,
            name = "NETWORK_LOAD_BALANCER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberOkeClusterDetails.class,
            name = "OKE_CLUSTER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberAutonomousDatabaseDetails.class,
            name = "AUTONOMOUS_DATABASE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberFileSystemDetails.class,
            name = "FILE_SYSTEM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberVolumeGroupDetails.class,
            name = "VOLUME_GROUP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberComputeInstanceNonMovableDetails.class,
            name = "COMPUTE_INSTANCE_NON_MOVABLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberAutonomousContainerDatabaseDetails.class,
            name = "AUTONOMOUS_CONTAINER_DATABASE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberLoadBalancerDetails.class,
            name = "LOAD_BALANCER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberObjectStorageBucketDetails.class,
            name = "OBJECT_STORAGE_BUCKET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberComputeInstanceMovableDetails.class,
            name = "COMPUTE_INSTANCE_MOVABLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDrProtectionGroupMemberDatabaseDetails.class,
            name = "DATABASE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class UpdateDrProtectionGroupMemberDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"memberId"})
    protected UpdateDrProtectionGroupMemberDetails(String memberId) {
        super();
        this.memberId = memberId;
    }

    /**
     * The OCID of the member.
     *
     * <p>Example: {@code ocid1.database.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memberId")
    private final String memberId;

    /**
     * The OCID of the member.
     *
     * <p>Example: {@code ocid1.database.oc1..uniqueID}
     *
     * @return the value
     */
    public String getMemberId() {
        return memberId;
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
        sb.append("UpdateDrProtectionGroupMemberDetails(");
        sb.append("super=").append(super.toString());
        sb.append("memberId=").append(String.valueOf(this.memberId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrProtectionGroupMemberDetails)) {
            return false;
        }

        UpdateDrProtectionGroupMemberDetails other = (UpdateDrProtectionGroupMemberDetails) o;
        return java.util.Objects.equals(this.memberId, other.memberId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.memberId == null ? 43 : this.memberId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
