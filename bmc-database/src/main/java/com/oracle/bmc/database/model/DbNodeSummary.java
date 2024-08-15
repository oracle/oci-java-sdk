/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * A server where Oracle Database software is running.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator. If you're an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbNodeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbNodeSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "dbSystemId",
        "vnicId",
        "backupVnicId",
        "hostIpId",
        "backupIpId",
        "vnic2Id",
        "backupVnic2Id",
        "lifecycleState",
        "hostname",
        "faultDomain",
        "timeCreated",
        "softwareStorageSizeInGB",
        "maintenanceType",
        "timeMaintenanceWindowStart",
        "timeMaintenanceWindowEnd",
        "additionalDetails",
        "freeformTags",
        "definedTags",
        "lifecycleDetails",
        "cpuCoreCount",
        "memorySizeInGBs",
        "dbNodeStorageSizeInGBs",
        "totalCpuCoreCount",
        "dbServerId"
    })
    public DbNodeSummary(
            String id,
            String dbSystemId,
            String vnicId,
            String backupVnicId,
            String hostIpId,
            String backupIpId,
            String vnic2Id,
            String backupVnic2Id,
            LifecycleState lifecycleState,
            String hostname,
            String faultDomain,
            java.util.Date timeCreated,
            Integer softwareStorageSizeInGB,
            MaintenanceType maintenanceType,
            java.util.Date timeMaintenanceWindowStart,
            java.util.Date timeMaintenanceWindowEnd,
            String additionalDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String lifecycleDetails,
            Integer cpuCoreCount,
            Integer memorySizeInGBs,
            Integer dbNodeStorageSizeInGBs,
            Integer totalCpuCoreCount,
            String dbServerId) {
        super();
        this.id = id;
        this.dbSystemId = dbSystemId;
        this.vnicId = vnicId;
        this.backupVnicId = backupVnicId;
        this.hostIpId = hostIpId;
        this.backupIpId = backupIpId;
        this.vnic2Id = vnic2Id;
        this.backupVnic2Id = backupVnic2Id;
        this.lifecycleState = lifecycleState;
        this.hostname = hostname;
        this.faultDomain = faultDomain;
        this.timeCreated = timeCreated;
        this.softwareStorageSizeInGB = softwareStorageSizeInGB;
        this.maintenanceType = maintenanceType;
        this.timeMaintenanceWindowStart = timeMaintenanceWindowStart;
        this.timeMaintenanceWindowEnd = timeMaintenanceWindowEnd;
        this.additionalDetails = additionalDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.lifecycleDetails = lifecycleDetails;
        this.cpuCoreCount = cpuCoreCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.totalCpuCoreCount = totalCpuCoreCount;
        this.dbServerId = dbServerId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database node.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
         * @param dbSystemId the value to set
         * @return this builder
         **/
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VNIC.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VNIC.
         * @param vnicId the value to set
         * @return this builder
         **/
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup VNIC.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupVnicId")
        private String backupVnicId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup VNIC.
         * @param backupVnicId the value to set
         * @return this builder
         **/
        public Builder backupVnicId(String backupVnicId) {
            this.backupVnicId = backupVnicId;
            this.__explicitlySet__.add("backupVnicId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the host IP address associated with the database node. Use this OCID with either the
         * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
         * needed to make a database connection.
         * <p>
         **Note:** Applies only to Exadata Cloud Service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostIpId")
        private String hostIpId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the host IP address associated with the database node. Use this OCID with either the
         * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
         * needed to make a database connection.
         * <p>
         **Note:** Applies only to Exadata Cloud Service.
         *
         * @param hostIpId the value to set
         * @return this builder
         **/
        public Builder hostIpId(String hostIpId) {
            this.hostIpId = hostIpId;
            this.__explicitlySet__.add("hostIpId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup IP address associated with the database node. Use this OCID with either the
         * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
         * needed to make a database connection.
         * <p>
         **Note:** Applies only to Exadata Cloud Service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupIpId")
        private String backupIpId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup IP address associated with the database node. Use this OCID with either the
         * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
         * needed to make a database connection.
         * <p>
         **Note:** Applies only to Exadata Cloud Service.
         *
         * @param backupIpId the value to set
         * @return this builder
         **/
        public Builder backupIpId(String backupIpId) {
            this.backupIpId = backupIpId;
            this.__explicitlySet__.add("backupIpId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second VNIC.
         * <p>
         **Note:** Applies only to Exadata Cloud Service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnic2Id")
        private String vnic2Id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second VNIC.
         * <p>
         **Note:** Applies only to Exadata Cloud Service.
         *
         * @param vnic2Id the value to set
         * @return this builder
         **/
        public Builder vnic2Id(String vnic2Id) {
            this.vnic2Id = vnic2Id;
            this.__explicitlySet__.add("vnic2Id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second backup VNIC.
         * <p>
         **Note:** Applies only to Exadata Cloud Service.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupVnic2Id")
        private String backupVnic2Id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second backup VNIC.
         * <p>
         **Note:** Applies only to Exadata Cloud Service.
         *
         * @param backupVnic2Id the value to set
         * @return this builder
         **/
        public Builder backupVnic2Id(String backupVnic2Id) {
            this.backupVnic2Id = backupVnic2Id;
            this.__explicitlySet__.add("backupVnic2Id");
            return this;
        }
        /**
         * The current state of the database node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the database node.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The host name for the database node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The host name for the database node.
         * @param hostname the value to set
         * @return this builder
         **/
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /**
         * The name of the Fault Domain the instance is contained in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The name of the Fault Domain the instance is contained in.
         * @param faultDomain the value to set
         * @return this builder
         **/
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The date and time that the database node was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the database node was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The size (in GB) of the block storage volume allocation for the DB system. This attribute applies only for virtual machine DB systems.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareStorageSizeInGB")
        private Integer softwareStorageSizeInGB;

        /**
         * The size (in GB) of the block storage volume allocation for the DB system. This attribute applies only for virtual machine DB systems.
         *
         * @param softwareStorageSizeInGB the value to set
         * @return this builder
         **/
        public Builder softwareStorageSizeInGB(Integer softwareStorageSizeInGB) {
            this.softwareStorageSizeInGB = softwareStorageSizeInGB;
            this.__explicitlySet__.add("softwareStorageSizeInGB");
            return this;
        }
        /**
         * The type of database node maintenance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
        private MaintenanceType maintenanceType;

        /**
         * The type of database node maintenance.
         * @param maintenanceType the value to set
         * @return this builder
         **/
        public Builder maintenanceType(MaintenanceType maintenanceType) {
            this.maintenanceType = maintenanceType;
            this.__explicitlySet__.add("maintenanceType");
            return this;
        }
        /**
         * Start date and time of maintenance window.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowStart")
        private java.util.Date timeMaintenanceWindowStart;

        /**
         * Start date and time of maintenance window.
         * @param timeMaintenanceWindowStart the value to set
         * @return this builder
         **/
        public Builder timeMaintenanceWindowStart(java.util.Date timeMaintenanceWindowStart) {
            this.timeMaintenanceWindowStart = timeMaintenanceWindowStart;
            this.__explicitlySet__.add("timeMaintenanceWindowStart");
            return this;
        }
        /**
         * End date and time of maintenance window.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowEnd")
        private java.util.Date timeMaintenanceWindowEnd;

        /**
         * End date and time of maintenance window.
         * @param timeMaintenanceWindowEnd the value to set
         * @return this builder
         **/
        public Builder timeMaintenanceWindowEnd(java.util.Date timeMaintenanceWindowEnd) {
            this.timeMaintenanceWindowEnd = timeMaintenanceWindowEnd;
            this.__explicitlySet__.add("timeMaintenanceWindowEnd");
            return this;
        }
        /**
         * Additional information about the planned maintenance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private String additionalDetails;

        /**
         * Additional information about the planned maintenance.
         * @param additionalDetails the value to set
         * @return this builder
         **/
        public Builder additionalDetails(String additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Information about the current lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Information about the current lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The number of CPU cores enabled on the Db node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU cores enabled on the Db node.
         * @param cpuCoreCount the value to set
         * @return this builder
         **/
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The allocated memory in GBs on the Db node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The allocated memory in GBs on the Db node.
         * @param memorySizeInGBs the value to set
         * @return this builder
         **/
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /**
         * The allocated local node storage in GBs on the Db node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        /**
         * The allocated local node storage in GBs on the Db node.
         * @param dbNodeStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }
        /**
         * The total number of CPU cores reserved on the Db node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalCpuCoreCount")
        private Integer totalCpuCoreCount;

        /**
         * The total number of CPU cores reserved on the Db node.
         * @param totalCpuCoreCount the value to set
         * @return this builder
         **/
        public Builder totalCpuCoreCount(Integer totalCpuCoreCount) {
            this.totalCpuCoreCount = totalCpuCoreCount;
            this.__explicitlySet__.add("totalCpuCoreCount");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exacc Db server associated with the database node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
        private String dbServerId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exacc Db server associated with the database node.
         * @param dbServerId the value to set
         * @return this builder
         **/
        public Builder dbServerId(String dbServerId) {
            this.dbServerId = dbServerId;
            this.__explicitlySet__.add("dbServerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbNodeSummary build() {
            DbNodeSummary model =
                    new DbNodeSummary(
                            this.id,
                            this.dbSystemId,
                            this.vnicId,
                            this.backupVnicId,
                            this.hostIpId,
                            this.backupIpId,
                            this.vnic2Id,
                            this.backupVnic2Id,
                            this.lifecycleState,
                            this.hostname,
                            this.faultDomain,
                            this.timeCreated,
                            this.softwareStorageSizeInGB,
                            this.maintenanceType,
                            this.timeMaintenanceWindowStart,
                            this.timeMaintenanceWindowEnd,
                            this.additionalDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.lifecycleDetails,
                            this.cpuCoreCount,
                            this.memorySizeInGBs,
                            this.dbNodeStorageSizeInGBs,
                            this.totalCpuCoreCount,
                            this.dbServerId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbNodeSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("backupVnicId")) {
                this.backupVnicId(model.getBackupVnicId());
            }
            if (model.wasPropertyExplicitlySet("hostIpId")) {
                this.hostIpId(model.getHostIpId());
            }
            if (model.wasPropertyExplicitlySet("backupIpId")) {
                this.backupIpId(model.getBackupIpId());
            }
            if (model.wasPropertyExplicitlySet("vnic2Id")) {
                this.vnic2Id(model.getVnic2Id());
            }
            if (model.wasPropertyExplicitlySet("backupVnic2Id")) {
                this.backupVnic2Id(model.getBackupVnic2Id());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("softwareStorageSizeInGB")) {
                this.softwareStorageSizeInGB(model.getSoftwareStorageSizeInGB());
            }
            if (model.wasPropertyExplicitlySet("maintenanceType")) {
                this.maintenanceType(model.getMaintenanceType());
            }
            if (model.wasPropertyExplicitlySet("timeMaintenanceWindowStart")) {
                this.timeMaintenanceWindowStart(model.getTimeMaintenanceWindowStart());
            }
            if (model.wasPropertyExplicitlySet("timeMaintenanceWindowEnd")) {
                this.timeMaintenanceWindowEnd(model.getTimeMaintenanceWindowEnd());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dbNodeStorageSizeInGBs")) {
                this.dbNodeStorageSizeInGBs(model.getDbNodeStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("totalCpuCoreCount")) {
                this.totalCpuCoreCount(model.getTotalCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("dbServerId")) {
                this.dbServerId(model.getDbServerId());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database node.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
     * @return the value
     **/
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VNIC.
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupVnicId")
    private final String backupVnicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup VNIC.
     * @return the value
     **/
    public String getBackupVnicId() {
        return backupVnicId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the host IP address associated with the database node. Use this OCID with either the
     * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
     * needed to make a database connection.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostIpId")
    private final String hostIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the host IP address associated with the database node. Use this OCID with either the
     * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
     * needed to make a database connection.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     * @return the value
     **/
    public String getHostIpId() {
        return hostIpId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup IP address associated with the database node. Use this OCID with either the
     * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
     * needed to make a database connection.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupIpId")
    private final String backupIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup IP address associated with the database node. Use this OCID with either the
     * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
     * needed to make a database connection.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     * @return the value
     **/
    public String getBackupIpId() {
        return backupIpId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second VNIC.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnic2Id")
    private final String vnic2Id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second VNIC.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     * @return the value
     **/
    public String getVnic2Id() {
        return vnic2Id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second backup VNIC.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupVnic2Id")
    private final String backupVnic2Id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second backup VNIC.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     * @return the value
     **/
    public String getBackupVnic2Id() {
        return backupVnic2Id;
    }

    /**
     * The current state of the database node.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),
        Starting("STARTING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the database node.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The host name for the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The host name for the database node.
     * @return the value
     **/
    public String getHostname() {
        return hostname;
    }

    /**
     * The name of the Fault Domain the instance is contained in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The name of the Fault Domain the instance is contained in.
     * @return the value
     **/
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The date and time that the database node was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the database node was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The size (in GB) of the block storage volume allocation for the DB system. This attribute applies only for virtual machine DB systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareStorageSizeInGB")
    private final Integer softwareStorageSizeInGB;

    /**
     * The size (in GB) of the block storage volume allocation for the DB system. This attribute applies only for virtual machine DB systems.
     *
     * @return the value
     **/
    public Integer getSoftwareStorageSizeInGB() {
        return softwareStorageSizeInGB;
    }

    /**
     * The type of database node maintenance.
     **/
    public enum MaintenanceType {
        VmdbRebootMigration("VMDB_REBOOT_MIGRATION"),
        ExadbxsRebootMigration("EXADBXS_REBOOT_MIGRATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MaintenanceType.class);

        private final String value;
        private static java.util.Map<String, MaintenanceType> map;

        static {
            map = new java.util.HashMap<>();
            for (MaintenanceType v : MaintenanceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaintenanceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaintenanceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaintenanceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of database node maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
    private final MaintenanceType maintenanceType;

    /**
     * The type of database node maintenance.
     * @return the value
     **/
    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * Start date and time of maintenance window.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowStart")
    private final java.util.Date timeMaintenanceWindowStart;

    /**
     * Start date and time of maintenance window.
     * @return the value
     **/
    public java.util.Date getTimeMaintenanceWindowStart() {
        return timeMaintenanceWindowStart;
    }

    /**
     * End date and time of maintenance window.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowEnd")
    private final java.util.Date timeMaintenanceWindowEnd;

    /**
     * End date and time of maintenance window.
     * @return the value
     **/
    public java.util.Date getTimeMaintenanceWindowEnd() {
        return timeMaintenanceWindowEnd;
    }

    /**
     * Additional information about the planned maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final String additionalDetails;

    /**
     * Additional information about the planned maintenance.
     * @return the value
     **/
    public String getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Information about the current lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The number of CPU cores enabled on the Db node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores enabled on the Db node.
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The allocated memory in GBs on the Db node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The allocated memory in GBs on the Db node.
     * @return the value
     **/
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     * The allocated local node storage in GBs on the Db node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    /**
     * The allocated local node storage in GBs on the Db node.
     * @return the value
     **/
    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /**
     * The total number of CPU cores reserved on the Db node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpuCoreCount")
    private final Integer totalCpuCoreCount;

    /**
     * The total number of CPU cores reserved on the Db node.
     * @return the value
     **/
    public Integer getTotalCpuCoreCount() {
        return totalCpuCoreCount;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exacc Db server associated with the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
    private final String dbServerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exacc Db server associated with the database node.
     * @return the value
     **/
    public String getDbServerId() {
        return dbServerId;
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
        sb.append("DbNodeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", backupVnicId=").append(String.valueOf(this.backupVnicId));
        sb.append(", hostIpId=").append(String.valueOf(this.hostIpId));
        sb.append(", backupIpId=").append(String.valueOf(this.backupIpId));
        sb.append(", vnic2Id=").append(String.valueOf(this.vnic2Id));
        sb.append(", backupVnic2Id=").append(String.valueOf(this.backupVnic2Id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", softwareStorageSizeInGB=")
                .append(String.valueOf(this.softwareStorageSizeInGB));
        sb.append(", maintenanceType=").append(String.valueOf(this.maintenanceType));
        sb.append(", timeMaintenanceWindowStart=")
                .append(String.valueOf(this.timeMaintenanceWindowStart));
        sb.append(", timeMaintenanceWindowEnd=")
                .append(String.valueOf(this.timeMaintenanceWindowEnd));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", totalCpuCoreCount=").append(String.valueOf(this.totalCpuCoreCount));
        sb.append(", dbServerId=").append(String.valueOf(this.dbServerId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbNodeSummary)) {
            return false;
        }

        DbNodeSummary other = (DbNodeSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.backupVnicId, other.backupVnicId)
                && java.util.Objects.equals(this.hostIpId, other.hostIpId)
                && java.util.Objects.equals(this.backupIpId, other.backupIpId)
                && java.util.Objects.equals(this.vnic2Id, other.vnic2Id)
                && java.util.Objects.equals(this.backupVnic2Id, other.backupVnic2Id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.softwareStorageSizeInGB, other.softwareStorageSizeInGB)
                && java.util.Objects.equals(this.maintenanceType, other.maintenanceType)
                && java.util.Objects.equals(
                        this.timeMaintenanceWindowStart, other.timeMaintenanceWindowStart)
                && java.util.Objects.equals(
                        this.timeMaintenanceWindowEnd, other.timeMaintenanceWindowEnd)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.totalCpuCoreCount, other.totalCpuCoreCount)
                && java.util.Objects.equals(this.dbServerId, other.dbServerId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + (this.backupVnicId == null ? 43 : this.backupVnicId.hashCode());
        result = (result * PRIME) + (this.hostIpId == null ? 43 : this.hostIpId.hashCode());
        result = (result * PRIME) + (this.backupIpId == null ? 43 : this.backupIpId.hashCode());
        result = (result * PRIME) + (this.vnic2Id == null ? 43 : this.vnic2Id.hashCode());
        result =
                (result * PRIME)
                        + (this.backupVnic2Id == null ? 43 : this.backupVnic2Id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareStorageSizeInGB == null
                                ? 43
                                : this.softwareStorageSizeInGB.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceType == null ? 43 : this.maintenanceType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceWindowStart == null
                                ? 43
                                : this.timeMaintenanceWindowStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceWindowEnd == null
                                ? 43
                                : this.timeMaintenanceWindowEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dbNodeStorageSizeInGBs == null
                                ? 43
                                : this.dbNodeStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.totalCpuCoreCount == null ? 43 : this.totalCpuCoreCount.hashCode());
        result = (result * PRIME) + (this.dbServerId == null ? 43 : this.dbServerId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
