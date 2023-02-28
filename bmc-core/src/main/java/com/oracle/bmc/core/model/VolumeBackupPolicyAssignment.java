/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the volume that the volume backup policy is assigned to.
 *
 * <p>For more information about Oracle defined backup policies and custom backup policies, see
 * [Policy-Based
 * Backups](https://docs.cloud.oracle.com/iaas/Content/Block/Tasks/schedulingvolumebackups.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VolumeBackupPolicyAssignment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VolumeBackupPolicyAssignment
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"assetId", "id", "policyId", "timeCreated"})
    public VolumeBackupPolicyAssignment(
            String assetId, String id, String policyId, java.util.Date timeCreated) {
        super();
        this.assetId = assetId;
        this.id = id;
        this.policyId = policyId;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the volume the policy has been assigned to. */
        @com.fasterxml.jackson.annotation.JsonProperty("assetId")
        private String assetId;

        /**
         * The OCID of the volume the policy has been assigned to.
         *
         * @param assetId the value to set
         * @return this builder
         */
        public Builder assetId(String assetId) {
            this.assetId = assetId;
            this.__explicitlySet__.add("assetId");
            return this;
        }
        /** The OCID of the volume backup policy assignment. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the volume backup policy assignment.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the volume backup policy that has been assigned to the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("policyId")
        private String policyId;

        /**
         * The OCID of the volume backup policy that has been assigned to the volume.
         *
         * @param policyId the value to set
         * @return this builder
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
            this.__explicitlySet__.add("policyId");
            return this;
        }
        /**
         * The date and time the volume backup policy was assigned to the volume. The format is
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the volume backup policy was assigned to the volume. The format is
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeBackupPolicyAssignment build() {
            VolumeBackupPolicyAssignment model =
                    new VolumeBackupPolicyAssignment(
                            this.assetId, this.id, this.policyId, this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeBackupPolicyAssignment model) {
            if (model.wasPropertyExplicitlySet("assetId")) {
                this.assetId(model.getAssetId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("policyId")) {
                this.policyId(model.getPolicyId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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

    /** The OCID of the volume the policy has been assigned to. */
    @com.fasterxml.jackson.annotation.JsonProperty("assetId")
    private final String assetId;

    /**
     * The OCID of the volume the policy has been assigned to.
     *
     * @return the value
     */
    public String getAssetId() {
        return assetId;
    }

    /** The OCID of the volume backup policy assignment. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the volume backup policy assignment.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the volume backup policy that has been assigned to the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("policyId")
    private final String policyId;

    /**
     * The OCID of the volume backup policy that has been assigned to the volume.
     *
     * @return the value
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * The date and time the volume backup policy was assigned to the volume. The format is defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the volume backup policy was assigned to the volume. The format is defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("VolumeBackupPolicyAssignment(");
        sb.append("super=").append(super.toString());
        sb.append("assetId=").append(String.valueOf(this.assetId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", policyId=").append(String.valueOf(this.policyId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeBackupPolicyAssignment)) {
            return false;
        }

        VolumeBackupPolicyAssignment other = (VolumeBackupPolicyAssignment) o;
        return java.util.Objects.equals(this.assetId, other.assetId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.policyId, other.policyId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assetId == null ? 43 : this.assetId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.policyId == null ? 43 : this.policyId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
