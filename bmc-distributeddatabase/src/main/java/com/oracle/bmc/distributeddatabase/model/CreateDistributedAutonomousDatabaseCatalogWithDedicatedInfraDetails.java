/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Globally distributed autonomous database catalog based on Dedicated infrastructure. <br>
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
        builder = CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails
        extends CreateDistributedAutonomousDatabaseCatalogDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Admin password for catalog database. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * Admin password for catalog database.
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /** The compute count for the catalog database. It has to be in multiples of 2. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Float computeCount;

        /**
         * The compute count for the catalog database. It has to be in multiples of 2.
         *
         * @param computeCount the value to set
         * @return this builder
         */
        public Builder computeCount(Float computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /** The data disk group size to be allocated in GBs for the catalog database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGbs")
        private Double dataStorageSizeInGbs;

        /**
         * The data disk group size to be allocated in GBs for the catalog database.
         *
         * @param dataStorageSizeInGbs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGbs(Double dataStorageSizeInGbs) {
            this.dataStorageSizeInGbs = dataStorageSizeInGbs;
            this.__explicitlySet__.add("dataStorageSizeInGbs");
            return this;
        }
        /** Determines the auto-scaling mode for the catalog database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        /**
         * Determines the auto-scaling mode for the catalog database.
         *
         * @param isAutoScalingEnabled the value to set
         * @return this builder
         */
        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud Autonomous VM Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
        private String cloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud Autonomous VM Cluster.
         *
         * @param cloudAutonomousVmClusterId the value to set
         * @return this builder
         */
        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            this.__explicitlySet__.add("cloudAutonomousVmClusterId");
            return this;
        }
        /**
         * This field is deprecated. This should not be used while creation of new distributed
         * autonomous database. To set the peers on catalog of distributed autonomous database
         * please use peerDetails.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterIds")
        private java.util.List<String> peerCloudAutonomousVmClusterIds;

        /**
         * This field is deprecated. This should not be used while creation of new distributed
         * autonomous database. To set the peers on catalog of distributed autonomous database
         * please use peerDetails.
         *
         * @param peerCloudAutonomousVmClusterIds the value to set
         * @return this builder
         */
        public Builder peerCloudAutonomousVmClusterIds(
                java.util.List<String> peerCloudAutonomousVmClusterIds) {
            this.peerCloudAutonomousVmClusterIds = peerCloudAutonomousVmClusterIds;
            this.__explicitlySet__.add("peerCloudAutonomousVmClusterIds");
            return this;
        }
        /**
         * The details required for creation of the peer for the autonomous dedicated infrastructure
         * based catalog.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDetails")
        private java.util.List<CreateCatalogPeerWithDedicatedInfraDetails> peerDetails;

        /**
         * The details required for creation of the peer for the autonomous dedicated infrastructure
         * based catalog.
         *
         * @param peerDetails the value to set
         * @return this builder
         */
        public Builder peerDetails(
                java.util.List<CreateCatalogPeerWithDedicatedInfraDetails> peerDetails) {
            this.peerDetails = peerDetails;
            this.__explicitlySet__.add("peerDetails");
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

        public CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails build() {
            CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails model =
                    new CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails(
                            this.adminPassword,
                            this.computeCount,
                            this.dataStorageSizeInGbs,
                            this.isAutoScalingEnabled,
                            this.cloudAutonomousVmClusterId,
                            this.peerCloudAutonomousVmClusterIds,
                            this.peerDetails,
                            this.vaultId,
                            this.kmsKeyId,
                            this.kmsKeyVersionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails model) {
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGbs")) {
                this.dataStorageSizeInGbs(model.getDataStorageSizeInGbs());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("cloudAutonomousVmClusterId")) {
                this.cloudAutonomousVmClusterId(model.getCloudAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("peerCloudAutonomousVmClusterIds")) {
                this.peerCloudAutonomousVmClusterIds(model.getPeerCloudAutonomousVmClusterIds());
            }
            if (model.wasPropertyExplicitlySet("peerDetails")) {
                this.peerDetails(model.getPeerDetails());
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
    public CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails(
            String adminPassword,
            Float computeCount,
            Double dataStorageSizeInGbs,
            Boolean isAutoScalingEnabled,
            String cloudAutonomousVmClusterId,
            java.util.List<String> peerCloudAutonomousVmClusterIds,
            java.util.List<CreateCatalogPeerWithDedicatedInfraDetails> peerDetails,
            String vaultId,
            String kmsKeyId,
            String kmsKeyVersionId) {
        super();
        this.adminPassword = adminPassword;
        this.computeCount = computeCount;
        this.dataStorageSizeInGbs = dataStorageSizeInGbs;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
        this.peerCloudAutonomousVmClusterIds = peerCloudAutonomousVmClusterIds;
        this.peerDetails = peerDetails;
        this.vaultId = vaultId;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
    }

    /** Admin password for catalog database. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * Admin password for catalog database.
     *
     * @return the value
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /** The compute count for the catalog database. It has to be in multiples of 2. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Float computeCount;

    /**
     * The compute count for the catalog database. It has to be in multiples of 2.
     *
     * @return the value
     */
    public Float getComputeCount() {
        return computeCount;
    }

    /** The data disk group size to be allocated in GBs for the catalog database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGbs")
    private final Double dataStorageSizeInGbs;

    /**
     * The data disk group size to be allocated in GBs for the catalog database.
     *
     * @return the value
     */
    public Double getDataStorageSizeInGbs() {
        return dataStorageSizeInGbs;
    }

    /** Determines the auto-scaling mode for the catalog database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Determines the auto-scaling mode for the catalog database.
     *
     * @return the value
     */
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud Autonomous VM Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
    private final String cloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud Autonomous VM Cluster.
     *
     * @return the value
     */
    public String getCloudAutonomousVmClusterId() {
        return cloudAutonomousVmClusterId;
    }

    /**
     * This field is deprecated. This should not be used while creation of new distributed
     * autonomous database. To set the peers on catalog of distributed autonomous database please
     * use peerDetails.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterIds")
    private final java.util.List<String> peerCloudAutonomousVmClusterIds;

    /**
     * This field is deprecated. This should not be used while creation of new distributed
     * autonomous database. To set the peers on catalog of distributed autonomous database please
     * use peerDetails.
     *
     * @return the value
     */
    public java.util.List<String> getPeerCloudAutonomousVmClusterIds() {
        return peerCloudAutonomousVmClusterIds;
    }

    /**
     * The details required for creation of the peer for the autonomous dedicated infrastructure
     * based catalog.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDetails")
    private final java.util.List<CreateCatalogPeerWithDedicatedInfraDetails> peerDetails;

    /**
     * The details required for creation of the peer for the autonomous dedicated infrastructure
     * based catalog.
     *
     * @return the value
     */
    public java.util.List<CreateCatalogPeerWithDedicatedInfraDetails> getPeerDetails() {
        return peerDetails;
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
        sb.append("CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", dataStorageSizeInGbs=").append(String.valueOf(this.dataStorageSizeInGbs));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", cloudAutonomousVmClusterId=")
                .append(String.valueOf(this.cloudAutonomousVmClusterId));
        sb.append(", peerCloudAutonomousVmClusterIds=")
                .append(String.valueOf(this.peerCloudAutonomousVmClusterIds));
        sb.append(", peerDetails=").append(String.valueOf(this.peerDetails));
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
        if (!(o instanceof CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails)) {
            return false;
        }

        CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails other =
                (CreateDistributedAutonomousDatabaseCatalogWithDedicatedInfraDetails) o;
        return java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.dataStorageSizeInGbs, other.dataStorageSizeInGbs)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(
                        this.cloudAutonomousVmClusterId, other.cloudAutonomousVmClusterId)
                && java.util.Objects.equals(
                        this.peerCloudAutonomousVmClusterIds, other.peerCloudAutonomousVmClusterIds)
                && java.util.Objects.equals(this.peerDetails, other.peerDetails)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGbs == null
                                ? 43
                                : this.dataStorageSizeInGbs.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutonomousVmClusterId == null
                                ? 43
                                : this.cloudAutonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerCloudAutonomousVmClusterIds == null
                                ? 43
                                : this.peerCloudAutonomousVmClusterIds.hashCode());
        result = (result * PRIME) + (this.peerDetails == null ? 43 : this.peerDetails.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        return result;
    }
}
