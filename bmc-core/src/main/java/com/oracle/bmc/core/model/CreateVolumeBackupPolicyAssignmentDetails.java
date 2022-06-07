/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateVolumeBackupPolicyAssignmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateVolumeBackupPolicyAssignmentDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"assetId", "policyId"})
    public CreateVolumeBackupPolicyAssignmentDetails(String assetId, String policyId) {
        super();
        this.assetId = assetId;
        this.policyId = policyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("assetId")
        private String assetId;

        public Builder assetId(String assetId) {
            this.assetId = assetId;
            this.__explicitlySet__.add("assetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyId")
        private String policyId;

        public Builder policyId(String policyId) {
            this.policyId = policyId;
            this.__explicitlySet__.add("policyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVolumeBackupPolicyAssignmentDetails build() {
            CreateVolumeBackupPolicyAssignmentDetails __instance__ =
                    new CreateVolumeBackupPolicyAssignmentDetails(assetId, policyId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVolumeBackupPolicyAssignmentDetails o) {
            Builder copiedBuilder = assetId(o.getAssetId()).policyId(o.getPolicyId());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    /**
     * The OCID of the volume to assign the policy to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assetId")
    private final String assetId;

    public String getAssetId() {
        return assetId;
    }

    /**
     * The OCID of the volume backup policy to assign to the volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyId")
    private final String policyId;

    public String getPolicyId() {
        return policyId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateVolumeBackupPolicyAssignmentDetails(");
        sb.append("assetId=").append(String.valueOf(this.assetId));
        sb.append(", policyId=").append(String.valueOf(this.policyId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVolumeBackupPolicyAssignmentDetails)) {
            return false;
        }

        CreateVolumeBackupPolicyAssignmentDetails other =
                (CreateVolumeBackupPolicyAssignmentDetails) o;
        return java.util.Objects.equals(this.assetId, other.assetId)
                && java.util.Objects.equals(this.policyId, other.policyId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assetId == null ? 43 : this.assetId.hashCode());
        result = (result * PRIME) + (this.policyId == null ? 43 : this.policyId.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
