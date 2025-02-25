/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The properties of a member in a DR protection group.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "memberType",
    defaultImpl = DrProtectionGroupMember.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberVolumeGroup.class,
        name = "VOLUME_GROUP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberNetworkLoadBalancer.class,
        name = "NETWORK_LOAD_BALANCER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberObjectStorageBucket.class,
        name = "OBJECT_STORAGE_BUCKET"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberFileSystem.class,
        name = "FILE_SYSTEM"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberComputeInstanceMovable.class,
        name = "COMPUTE_INSTANCE_MOVABLE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberAutonomousDatabase.class,
        name = "AUTONOMOUS_DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberLoadBalancer.class,
        name = "LOAD_BALANCER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberComputeInstance.class,
        name = "COMPUTE_INSTANCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberComputeInstanceNonMovable.class,
        name = "COMPUTE_INSTANCE_NON_MOVABLE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberAutonomousContainerDatabase.class,
        name = "AUTONOMOUS_CONTAINER_DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberDatabase.class,
        name = "DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrProtectionGroupMemberOkeCluster.class,
        name = "OKE_CLUSTER"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DrProtectionGroupMember extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"memberId"})
    protected DrProtectionGroupMember(String memberId) {
        super();
        this.memberId = memberId;
    }

    /**
     * The OCID of the member.
     * <p>
     * Example: {@code ocid1.instance.oc1..uniqueID}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memberId")
    private final String memberId;

    /**
     * The OCID of the member.
     * <p>
     * Example: {@code ocid1.instance.oc1..uniqueID}
     *
     * @return the value
     **/
    public String getMemberId() {
        return memberId;
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
        sb.append("DrProtectionGroupMember(");
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
        if (!(o instanceof DrProtectionGroupMember)) {
            return false;
        }

        DrProtectionGroupMember other = (DrProtectionGroupMember) o;
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
