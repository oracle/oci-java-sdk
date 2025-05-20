/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Globally distributed database catalog based on exadbxs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDistributedDatabaseCatalogWithExadbXsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDistributedDatabaseCatalogWithExadbXsDetails
        extends CreateDistributedDatabaseCatalogDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VmCluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VmCluster.
         *
         * @param vmClusterId the value to set
         * @return this builder
         */
        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }
        /** The admin password for the cataog associated with Globally distributed database. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * The admin password for the cataog associated with Globally distributed database.
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
         * VmClusterIds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerVmClusterIds")
        private java.util.List<String> peerVmClusterIds;

        /**
         * The collection of
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
         * VmClusterIds.
         *
         * @param peerVmClusterIds the value to set
         * @return this builder
         */
        public Builder peerVmClusterIds(java.util.List<String> peerVmClusterIds) {
            this.peerVmClusterIds = peerVmClusterIds;
            this.__explicitlySet__.add("peerVmClusterIds");
            return this;
        }
        /**
         * The shard space name for the Globally distributed database. Shard space for existing
         * shard cannot be changed, once shard is created. Shard space name shall be used while
         * creation of new shards.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shardSpace")
        private String shardSpace;

        /**
         * The shard space name for the Globally distributed database. Shard space for existing
         * shard cannot be changed, once shard is created. Shard space name shall be used while
         * creation of new shards.
         *
         * @param shardSpace the value to set
         * @return this builder
         */
        public Builder shardSpace(String shardSpace) {
            this.shardSpace = shardSpace;
            this.__explicitlySet__.add("shardSpace");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the key container that is used as the master encryption key in database
         * transparent data encryption (TDE) operations.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        /**
         * The OCID of the key container version that is used in database transparent data
         * encryption (TDE) operations KMS Key can have multiple key versions.
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder
         */
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDistributedDatabaseCatalogWithExadbXsDetails build() {
            CreateDistributedDatabaseCatalogWithExadbXsDetails model =
                    new CreateDistributedDatabaseCatalogWithExadbXsDetails(
                            this.vmClusterId,
                            this.adminPassword,
                            this.peerVmClusterIds,
                            this.shardSpace,
                            this.vaultId,
                            this.kmsKeyId,
                            this.kmsKeyVersionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDistributedDatabaseCatalogWithExadbXsDetails model) {
            if (model.wasPropertyExplicitlySet("vmClusterId")) {
                this.vmClusterId(model.getVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("peerVmClusterIds")) {
                this.peerVmClusterIds(model.getPeerVmClusterIds());
            }
            if (model.wasPropertyExplicitlySet("shardSpace")) {
                this.shardSpace(model.getShardSpace());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
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
    public CreateDistributedDatabaseCatalogWithExadbXsDetails(
            String vmClusterId,
            String adminPassword,
            java.util.List<String> peerVmClusterIds,
            String shardSpace,
            String vaultId,
            String kmsKeyId,
            String kmsKeyVersionId) {
        super();
        this.vmClusterId = vmClusterId;
        this.adminPassword = adminPassword;
        this.peerVmClusterIds = peerVmClusterIds;
        this.shardSpace = shardSpace;
        this.vaultId = vaultId;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VmCluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    private final String vmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VmCluster.
     *
     * @return the value
     */
    public String getVmClusterId() {
        return vmClusterId;
    }

    /** The admin password for the cataog associated with Globally distributed database. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * The admin password for the cataog associated with Globally distributed database.
     *
     * @return the value
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
     * VmClusterIds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerVmClusterIds")
    private final java.util.List<String> peerVmClusterIds;

    /**
     * The collection of
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
     * VmClusterIds.
     *
     * @return the value
     */
    public java.util.List<String> getPeerVmClusterIds() {
        return peerVmClusterIds;
    }

    /**
     * The shard space name for the Globally distributed database. Shard space for existing shard
     * cannot be changed, once shard is created. Shard space name shall be used while creation of
     * new shards.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shardSpace")
    private final String shardSpace;

    /**
     * The shard space name for the Globally distributed database. Shard space for existing shard
     * cannot be changed, once shard is created. Shard space name shall be used while creation of
     * new shards.
     *
     * @return the value
     */
    public String getShardSpace() {
        return shardSpace;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database
     * transparent data encryption (TDE) operations.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions.
     *
     * @return the value
     */
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
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
        sb.append("CreateDistributedDatabaseCatalogWithExadbXsDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", peerVmClusterIds=").append(String.valueOf(this.peerVmClusterIds));
        sb.append(", shardSpace=").append(String.valueOf(this.shardSpace));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDistributedDatabaseCatalogWithExadbXsDetails)) {
            return false;
        }

        CreateDistributedDatabaseCatalogWithExadbXsDetails other =
                (CreateDistributedDatabaseCatalogWithExadbXsDetails) o;
        return java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.peerVmClusterIds, other.peerVmClusterIds)
                && java.util.Objects.equals(this.shardSpace, other.shardSpace)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.peerVmClusterIds == null ? 43 : this.peerVmClusterIds.hashCode());
        result = (result * PRIME) + (this.shardSpace == null ? 43 : this.shardSpace.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        return result;
    }
}
