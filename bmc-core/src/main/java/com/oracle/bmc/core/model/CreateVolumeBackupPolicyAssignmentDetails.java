/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
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
        builder = CreateVolumeBackupPolicyAssignmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVolumeBackupPolicyAssignmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"assetId", "policyId", "xrcKmsKeyId"})
    public CreateVolumeBackupPolicyAssignmentDetails(
            String assetId, String policyId, String xrcKmsKeyId) {
        super();
        this.assetId = assetId;
        this.policyId = policyId;
        this.xrcKmsKeyId = xrcKmsKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the volume to assign the policy to. */
        @com.fasterxml.jackson.annotation.JsonProperty("assetId")
        private String assetId;

        /**
         * The OCID of the volume to assign the policy to.
         *
         * @param assetId the value to set
         * @return this builder
         */
        public Builder assetId(String assetId) {
            this.assetId = assetId;
            this.__explicitlySet__.add("assetId");
            return this;
        }
        /** The OCID of the volume backup policy to assign to the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("policyId")
        private String policyId;

        /**
         * The OCID of the volume backup policy to assign to the volume.
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
         * The OCID of the Vault service key which is the master encryption key for the block / boot
         * volume cross region backups, which will be used in the destination region to encrypt the
         * backup's encryption keys. For more information about the Vault service and encryption
         * keys, see [Overview of Vault
         * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("xrcKmsKeyId")
        private String xrcKmsKeyId;

        /**
         * The OCID of the Vault service key which is the master encryption key for the block / boot
         * volume cross region backups, which will be used in the destination region to encrypt the
         * backup's encryption keys. For more information about the Vault service and encryption
         * keys, see [Overview of Vault
         * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
         * [Using Keys](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
         *
         * @param xrcKmsKeyId the value to set
         * @return this builder
         */
        public Builder xrcKmsKeyId(String xrcKmsKeyId) {
            this.xrcKmsKeyId = xrcKmsKeyId;
            this.__explicitlySet__.add("xrcKmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVolumeBackupPolicyAssignmentDetails build() {
            CreateVolumeBackupPolicyAssignmentDetails model =
                    new CreateVolumeBackupPolicyAssignmentDetails(
                            this.assetId, this.policyId, this.xrcKmsKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVolumeBackupPolicyAssignmentDetails model) {
            if (model.wasPropertyExplicitlySet("assetId")) {
                this.assetId(model.getAssetId());
            }
            if (model.wasPropertyExplicitlySet("policyId")) {
                this.policyId(model.getPolicyId());
            }
            if (model.wasPropertyExplicitlySet("xrcKmsKeyId")) {
                this.xrcKmsKeyId(model.getXrcKmsKeyId());
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

    /** The OCID of the volume to assign the policy to. */
    @com.fasterxml.jackson.annotation.JsonProperty("assetId")
    private final String assetId;

    /**
     * The OCID of the volume to assign the policy to.
     *
     * @return the value
     */
    public String getAssetId() {
        return assetId;
    }

    /** The OCID of the volume backup policy to assign to the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("policyId")
    private final String policyId;

    /**
     * The OCID of the volume backup policy to assign to the volume.
     *
     * @return the value
     */
    public String getPolicyId() {
        return policyId;
    }

    /**
     * The OCID of the Vault service key which is the master encryption key for the block / boot
     * volume cross region backups, which will be used in the destination region to encrypt the
     * backup's encryption keys. For more information about the Vault service and encryption keys,
     * see [Overview of Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("xrcKmsKeyId")
    private final String xrcKmsKeyId;

    /**
     * The OCID of the Vault service key which is the master encryption key for the block / boot
     * volume cross region backups, which will be used in the destination region to encrypt the
     * backup's encryption keys. For more information about the Vault service and encryption keys,
     * see [Overview of Vault
     * service](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm) and
     * [Using Keys](https://docs.oracle.com/iaas/Content/KeyManagement/Tasks/usingkeys.htm).
     *
     * @return the value
     */
    public String getXrcKmsKeyId() {
        return xrcKmsKeyId;
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
        sb.append("CreateVolumeBackupPolicyAssignmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("assetId=").append(String.valueOf(this.assetId));
        sb.append(", policyId=").append(String.valueOf(this.policyId));
        sb.append(", xrcKmsKeyId=").append(String.valueOf(this.xrcKmsKeyId));
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
                && java.util.Objects.equals(this.xrcKmsKeyId, other.xrcKmsKeyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assetId == null ? 43 : this.assetId.hashCode());
        result = (result * PRIME) + (this.policyId == null ? 43 : this.policyId.hashCode());
        result = (result * PRIME) + (this.xrcKmsKeyId == null ? 43 : this.xrcKmsKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
