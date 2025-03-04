/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.model;

/**
 * Details required for creation of ATP-D based shard. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDedicatedShardDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDedicatedShardDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "encryptionKeyDetails",
        "adminPassword",
        "computeCount",
        "dataStorageSizeInGbs",
        "shardSpace",
        "isAutoScalingEnabled",
        "cloudAutonomousVmClusterId",
        "peerCloudAutonomousVmClusterId"
    })
    public CreateDedicatedShardDetail(
            DedicatedShardOrCatalogEncryptionKeyDetails encryptionKeyDetails,
            String adminPassword,
            Float computeCount,
            Double dataStorageSizeInGbs,
            String shardSpace,
            Boolean isAutoScalingEnabled,
            String cloudAutonomousVmClusterId,
            String peerCloudAutonomousVmClusterId) {
        super();
        this.encryptionKeyDetails = encryptionKeyDetails;
        this.adminPassword = adminPassword;
        this.computeCount = computeCount;
        this.dataStorageSizeInGbs = dataStorageSizeInGbs;
        this.shardSpace = shardSpace;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
        this.peerCloudAutonomousVmClusterId = peerCloudAutonomousVmClusterId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyDetails")
        private DedicatedShardOrCatalogEncryptionKeyDetails encryptionKeyDetails;

        public Builder encryptionKeyDetails(
                DedicatedShardOrCatalogEncryptionKeyDetails encryptionKeyDetails) {
            this.encryptionKeyDetails = encryptionKeyDetails;
            this.__explicitlySet__.add("encryptionKeyDetails");
            return this;
        }
        /** Admin password for shard database. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * Admin password for shard database.
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /** The compute count for the shard database. It has to be in multiples of 2. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Float computeCount;

        /**
         * The compute count for the shard database. It has to be in multiples of 2.
         *
         * @param computeCount the value to set
         * @return this builder
         */
        public Builder computeCount(Float computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /** The data disk group size to be allocated in GBs for the shard database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGbs")
        private Double dataStorageSizeInGbs;

        /**
         * The data disk group size to be allocated in GBs for the shard database.
         *
         * @param dataStorageSizeInGbs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGbs(Double dataStorageSizeInGbs) {
            this.dataStorageSizeInGbs = dataStorageSizeInGbs;
            this.__explicitlySet__.add("dataStorageSizeInGbs");
            return this;
        }
        /**
         * The shard space name for the shard database. Shard space for existing shard cannot be
         * changed, once shard is created. Shard space name shall be used while creation of new
         * shards. For User defined sharding, every shard must have a unique shard space name. For
         * system defined sharding, shard space name is not required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shardSpace")
        private String shardSpace;

        /**
         * The shard space name for the shard database. Shard space for existing shard cannot be
         * changed, once shard is created. Shard space name shall be used while creation of new
         * shards. For User defined sharding, every shard must have a unique shard space name. For
         * system defined sharding, shard space name is not required.
         *
         * @param shardSpace the value to set
         * @return this builder
         */
        public Builder shardSpace(String shardSpace) {
            this.shardSpace = shardSpace;
            this.__explicitlySet__.add("shardSpace");
            return this;
        }
        /** Determines the auto-scaling mode for the shard database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        /**
         * Determines the auto-scaling mode for the shard database.
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
         * cloud Autonomous Exadata VM Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
        private String cloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud Autonomous Exadata VM Cluster.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * peer cloud Autonomous Exadata VM Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterId")
        private String peerCloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * peer cloud Autonomous Exadata VM Cluster.
         *
         * @param peerCloudAutonomousVmClusterId the value to set
         * @return this builder
         */
        public Builder peerCloudAutonomousVmClusterId(String peerCloudAutonomousVmClusterId) {
            this.peerCloudAutonomousVmClusterId = peerCloudAutonomousVmClusterId;
            this.__explicitlySet__.add("peerCloudAutonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDedicatedShardDetail build() {
            CreateDedicatedShardDetail model =
                    new CreateDedicatedShardDetail(
                            this.encryptionKeyDetails,
                            this.adminPassword,
                            this.computeCount,
                            this.dataStorageSizeInGbs,
                            this.shardSpace,
                            this.isAutoScalingEnabled,
                            this.cloudAutonomousVmClusterId,
                            this.peerCloudAutonomousVmClusterId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDedicatedShardDetail model) {
            if (model.wasPropertyExplicitlySet("encryptionKeyDetails")) {
                this.encryptionKeyDetails(model.getEncryptionKeyDetails());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGbs")) {
                this.dataStorageSizeInGbs(model.getDataStorageSizeInGbs());
            }
            if (model.wasPropertyExplicitlySet("shardSpace")) {
                this.shardSpace(model.getShardSpace());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("cloudAutonomousVmClusterId")) {
                this.cloudAutonomousVmClusterId(model.getCloudAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("peerCloudAutonomousVmClusterId")) {
                this.peerCloudAutonomousVmClusterId(model.getPeerCloudAutonomousVmClusterId());
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

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyDetails")
    private final DedicatedShardOrCatalogEncryptionKeyDetails encryptionKeyDetails;

    public DedicatedShardOrCatalogEncryptionKeyDetails getEncryptionKeyDetails() {
        return encryptionKeyDetails;
    }

    /** Admin password for shard database. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * Admin password for shard database.
     *
     * @return the value
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /** The compute count for the shard database. It has to be in multiples of 2. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Float computeCount;

    /**
     * The compute count for the shard database. It has to be in multiples of 2.
     *
     * @return the value
     */
    public Float getComputeCount() {
        return computeCount;
    }

    /** The data disk group size to be allocated in GBs for the shard database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGbs")
    private final Double dataStorageSizeInGbs;

    /**
     * The data disk group size to be allocated in GBs for the shard database.
     *
     * @return the value
     */
    public Double getDataStorageSizeInGbs() {
        return dataStorageSizeInGbs;
    }

    /**
     * The shard space name for the shard database. Shard space for existing shard cannot be
     * changed, once shard is created. Shard space name shall be used while creation of new shards.
     * For User defined sharding, every shard must have a unique shard space name. For system
     * defined sharding, shard space name is not required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shardSpace")
    private final String shardSpace;

    /**
     * The shard space name for the shard database. Shard space for existing shard cannot be
     * changed, once shard is created. Shard space name shall be used while creation of new shards.
     * For User defined sharding, every shard must have a unique shard space name. For system
     * defined sharding, shard space name is not required.
     *
     * @return the value
     */
    public String getShardSpace() {
        return shardSpace;
    }

    /** Determines the auto-scaling mode for the shard database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Determines the auto-scaling mode for the shard database.
     *
     * @return the value
     */
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud Autonomous Exadata VM Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
    private final String cloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud Autonomous Exadata VM Cluster.
     *
     * @return the value
     */
    public String getCloudAutonomousVmClusterId() {
        return cloudAutonomousVmClusterId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
     * cloud Autonomous Exadata VM Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterId")
    private final String peerCloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
     * cloud Autonomous Exadata VM Cluster.
     *
     * @return the value
     */
    public String getPeerCloudAutonomousVmClusterId() {
        return peerCloudAutonomousVmClusterId;
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
        sb.append("CreateDedicatedShardDetail(");
        sb.append("super=").append(super.toString());
        sb.append("encryptionKeyDetails=").append(String.valueOf(this.encryptionKeyDetails));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", dataStorageSizeInGbs=").append(String.valueOf(this.dataStorageSizeInGbs));
        sb.append(", shardSpace=").append(String.valueOf(this.shardSpace));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", cloudAutonomousVmClusterId=")
                .append(String.valueOf(this.cloudAutonomousVmClusterId));
        sb.append(", peerCloudAutonomousVmClusterId=")
                .append(String.valueOf(this.peerCloudAutonomousVmClusterId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDedicatedShardDetail)) {
            return false;
        }

        CreateDedicatedShardDetail other = (CreateDedicatedShardDetail) o;
        return java.util.Objects.equals(this.encryptionKeyDetails, other.encryptionKeyDetails)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.dataStorageSizeInGbs, other.dataStorageSizeInGbs)
                && java.util.Objects.equals(this.shardSpace, other.shardSpace)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(
                        this.cloudAutonomousVmClusterId, other.cloudAutonomousVmClusterId)
                && java.util.Objects.equals(
                        this.peerCloudAutonomousVmClusterId, other.peerCloudAutonomousVmClusterId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.encryptionKeyDetails == null
                                ? 43
                                : this.encryptionKeyDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGbs == null
                                ? 43
                                : this.dataStorageSizeInGbs.hashCode());
        result = (result * PRIME) + (this.shardSpace == null ? 43 : this.shardSpace.hashCode());
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
                        + (this.peerCloudAutonomousVmClusterId == null
                                ? 43
                                : this.peerCloudAutonomousVmClusterId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
