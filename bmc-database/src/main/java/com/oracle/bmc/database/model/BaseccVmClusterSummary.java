/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the Base Cloud@Customer VM Cluster. <br>
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
        builder = BaseccVmClusterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BaseccVmClusterSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "lastPatchHistoryEntryId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "lifecycleDetails",
        "availabilityDomain",
        "compartmentId",
        "databaseEdition",
        "nodeCount",
        "dbServers",
        "cpusEnabled",
        "baseInfrastructureId",
        "baseVmClusterNetworkId",
        "giVersion",
        "dataCollectionOptions",
        "description",
        "displayName",
        "sshPublicKeys",
        "timeZone",
        "clusterName",
        "bootStorageSizeInGBs",
        "additionalVmStorageSizeInGBs",
        "totalStorageSizeInGBs",
        "dataStorageSizeInGBs",
        "recoStorageSizeInGBs",
        "memorySizeInGBs",
        "licenseModel",
        "freeformTags",
        "definedTags",
        "systemTags",
        "systemVersion",
        "vmClusterType",
        "cloudAutomationUpdateDetails"
    })
    public BaseccVmClusterSummary(
            String id,
            String lastPatchHistoryEntryId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String lifecycleDetails,
            String availabilityDomain,
            String compartmentId,
            DatabaseEdition databaseEdition,
            Integer nodeCount,
            java.util.List<String> dbServers,
            Integer cpusEnabled,
            String baseInfrastructureId,
            String baseVmClusterNetworkId,
            String giVersion,
            DataCollectionOptions dataCollectionOptions,
            String description,
            String displayName,
            java.util.List<String> sshPublicKeys,
            String timeZone,
            String clusterName,
            Integer bootStorageSizeInGBs,
            Integer additionalVmStorageSizeInGBs,
            Integer totalStorageSizeInGBs,
            Integer dataStorageSizeInGBs,
            Integer recoStorageSizeInGBs,
            Integer memorySizeInGBs,
            LicenseModel licenseModel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String systemVersion,
            VmClusterType vmClusterType,
            CloudAutomationUpdateDetails cloudAutomationUpdateDetails) {
        super();
        this.id = id;
        this.lastPatchHistoryEntryId = lastPatchHistoryEntryId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleDetails = lifecycleDetails;
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.databaseEdition = databaseEdition;
        this.nodeCount = nodeCount;
        this.dbServers = dbServers;
        this.cpusEnabled = cpusEnabled;
        this.baseInfrastructureId = baseInfrastructureId;
        this.baseVmClusterNetworkId = baseVmClusterNetworkId;
        this.giVersion = giVersion;
        this.dataCollectionOptions = dataCollectionOptions;
        this.description = description;
        this.displayName = displayName;
        this.sshPublicKeys = sshPublicKeys;
        this.timeZone = timeZone;
        this.clusterName = clusterName;
        this.bootStorageSizeInGBs = bootStorageSizeInGBs;
        this.additionalVmStorageSizeInGBs = additionalVmStorageSizeInGBs;
        this.totalStorageSizeInGBs = totalStorageSizeInGBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.recoStorageSizeInGBs = recoStorageSizeInGBs;
        this.memorySizeInGBs = memorySizeInGBs;
        this.licenseModel = licenseModel;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.systemVersion = systemVersion;
        this.vmClusterType = vmClusterType;
        this.cloudAutomationUpdateDetails = cloudAutomationUpdateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * last patch history. This value is updated as soon as a patch operation starts.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastPatchHistoryEntryId")
        private String lastPatchHistoryEntryId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * last patch history. This value is updated as soon as a patch operation starts.
         *
         * @param lastPatchHistoryEntryId the value to set
         * @return this builder
         */
        public Builder lastPatchHistoryEntryId(String lastPatchHistoryEntryId) {
            this.lastPatchHistoryEntryId = lastPatchHistoryEntryId;
            this.__explicitlySet__.add("lastPatchHistoryEntryId");
            return this;
        }
        /** The current state of the VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the VM Cluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time that the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster was created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time that the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster was updated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time that the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Additional information about the current lifecycle state of the the Base Database Service
         * on Cloud@Customer (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state of the the Base Database Service
         * on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The name of the availability domain in which the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster is located.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain in which the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster is located.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The Oracle Database Edition that applies to all the databases on the DB system. Exadata
         * DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        /**
         * The Oracle Database Edition that applies to all the databases on the DB system. Exadata
         * DB systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
         *
         * @param databaseEdition the value to set
         * @return this builder
         */
        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }
        /**
         * The number of nodes in the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes in the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** List of Base server OCIDs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
        private java.util.List<String> dbServers;

        /**
         * List of Base server OCIDs.
         *
         * @param dbServers the value to set
         * @return this builder
         */
        public Builder dbServers(java.util.List<String> dbServers) {
            this.dbServers = dbServers;
            this.__explicitlySet__.add("dbServers");
            return this;
        }
        /** Total CPU cores for the BaseDB C@C VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
        private Integer cpusEnabled;

        /**
         * Total CPU cores for the BaseDB C@C VM cluster.
         *
         * @param cpusEnabled the value to set
         * @return this builder
         */
        public Builder cpusEnabled(Integer cpusEnabled) {
            this.cpusEnabled = cpusEnabled;
            this.__explicitlySet__.add("cpusEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * Oracle Data Cloud@Customer Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("baseInfrastructureId")
        private String baseInfrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * Oracle Data Cloud@Customer Infrastructure.
         *
         * @param baseInfrastructureId the value to set
         * @return this builder
         */
        public Builder baseInfrastructureId(String baseInfrastructureId) {
            this.baseInfrastructureId = baseInfrastructureId;
            this.__explicitlySet__.add("baseInfrastructureId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * BaseDB-C@C VM Cluster Network.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("baseVmClusterNetworkId")
        private String baseVmClusterNetworkId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * BaseDB-C@C VM Cluster Network.
         *
         * @param baseVmClusterNetworkId the value to set
         * @return this builder
         */
        public Builder baseVmClusterNetworkId(String baseVmClusterNetworkId) {
            this.baseVmClusterNetworkId = baseVmClusterNetworkId;
            this.__explicitlySet__.add("baseVmClusterNetworkId");
            return this;
        }
        /** A valid Oracle Grid Infrastructure (GI) software version. */
        @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
        private String giVersion;

        /**
         * A valid Oracle Grid Infrastructure (GI) software version.
         *
         * @param giVersion the value to set
         * @return this builder
         */
        public Builder giVersion(String giVersion) {
            this.giVersion = giVersion;
            this.__explicitlySet__.add("giVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
        private DataCollectionOptions dataCollectionOptions;

        public Builder dataCollectionOptions(DataCollectionOptions dataCollectionOptions) {
            this.dataCollectionOptions = dataCollectionOptions;
            this.__explicitlySet__.add("dataCollectionOptions");
            return this;
        }
        /** The description for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster. The name does not need to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster. The name does not need to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The public key portion of one or more key pairs used for SSH access to the VMs of Base
         * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * The public key portion of one or more key pairs used for SSH access to the VMs of Base
         * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param sshPublicKeys the value to set
         * @return this builder
         */
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }
        /**
         * The time zone to use for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster. For details, see [Time
         * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone to use for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
         * cluster. For details, see [Time
         * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /** The cluster name for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
        private String clusterName;

        /**
         * The cluster name for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param clusterName the value to set
         * @return this builder
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            this.__explicitlySet__.add("clusterName");
            return this;
        }
        /**
         * Total boot partition size (GB) for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bootStorageSizeInGBs")
        private Integer bootStorageSizeInGBs;

        /**
         * Total boot partition size (GB) for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         *
         * @param bootStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder bootStorageSizeInGBs(Integer bootStorageSizeInGBs) {
            this.bootStorageSizeInGBs = bootStorageSizeInGBs;
            this.__explicitlySet__.add("bootStorageSizeInGBs");
            return this;
        }
        /**
         * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalVmStorageSizeInGBs")
        private Integer additionalVmStorageSizeInGBs;

        /**
         * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         *
         * @param additionalVmStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder additionalVmStorageSizeInGBs(Integer additionalVmStorageSizeInGBs) {
            this.additionalVmStorageSizeInGBs = additionalVmStorageSizeInGBs;
            this.__explicitlySet__.add("additionalVmStorageSizeInGBs");
            return this;
        }
        /** The total storage allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalStorageSizeInGBs")
        private Integer totalStorageSizeInGBs;

        /**
         * The total storage allocated in GBs.
         *
         * @param totalStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder totalStorageSizeInGBs(Integer totalStorageSizeInGBs) {
            this.totalStorageSizeInGBs = totalStorageSizeInGBs;
            this.__explicitlySet__.add("totalStorageSizeInGBs");
            return this;
        }
        /**
         * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGBs")
        private Integer recoStorageSizeInGBs;

        /**
         * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster.
         *
         * @param recoStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder recoStorageSizeInGBs(Integer recoStorageSizeInGBs) {
            this.recoStorageSizeInGBs = recoStorageSizeInGBs;
            this.__explicitlySet__.add("recoStorageSizeInGBs");
            return this;
        }
        /**
         * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /**
         * The Oracle license model that applies to the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Base Database Service on Cloud@Customer
         * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
         *
         * @param licenseModel the value to set
         * @return this builder
         */
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Operating system version of the image. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
        private String systemVersion;

        /**
         * Operating system version of the image.
         *
         * @param systemVersion the value to set
         * @return this builder
         */
        public Builder systemVersion(String systemVersion) {
            this.systemVersion = systemVersion;
            this.__explicitlySet__.add("systemVersion");
            return this;
        }
        /**
         * The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterType")
        private VmClusterType vmClusterType;

        /**
         * The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
         *
         * @param vmClusterType the value to set
         * @return this builder
         */
        public Builder vmClusterType(VmClusterType vmClusterType) {
            this.vmClusterType = vmClusterType;
            this.__explicitlySet__.add("vmClusterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutomationUpdateDetails")
        private CloudAutomationUpdateDetails cloudAutomationUpdateDetails;

        public Builder cloudAutomationUpdateDetails(
                CloudAutomationUpdateDetails cloudAutomationUpdateDetails) {
            this.cloudAutomationUpdateDetails = cloudAutomationUpdateDetails;
            this.__explicitlySet__.add("cloudAutomationUpdateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BaseccVmClusterSummary build() {
            BaseccVmClusterSummary model =
                    new BaseccVmClusterSummary(
                            this.id,
                            this.lastPatchHistoryEntryId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleDetails,
                            this.availabilityDomain,
                            this.compartmentId,
                            this.databaseEdition,
                            this.nodeCount,
                            this.dbServers,
                            this.cpusEnabled,
                            this.baseInfrastructureId,
                            this.baseVmClusterNetworkId,
                            this.giVersion,
                            this.dataCollectionOptions,
                            this.description,
                            this.displayName,
                            this.sshPublicKeys,
                            this.timeZone,
                            this.clusterName,
                            this.bootStorageSizeInGBs,
                            this.additionalVmStorageSizeInGBs,
                            this.totalStorageSizeInGBs,
                            this.dataStorageSizeInGBs,
                            this.recoStorageSizeInGBs,
                            this.memorySizeInGBs,
                            this.licenseModel,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.systemVersion,
                            this.vmClusterType,
                            this.cloudAutomationUpdateDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BaseccVmClusterSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lastPatchHistoryEntryId")) {
                this.lastPatchHistoryEntryId(model.getLastPatchHistoryEntryId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("dbServers")) {
                this.dbServers(model.getDbServers());
            }
            if (model.wasPropertyExplicitlySet("cpusEnabled")) {
                this.cpusEnabled(model.getCpusEnabled());
            }
            if (model.wasPropertyExplicitlySet("baseInfrastructureId")) {
                this.baseInfrastructureId(model.getBaseInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("baseVmClusterNetworkId")) {
                this.baseVmClusterNetworkId(model.getBaseVmClusterNetworkId());
            }
            if (model.wasPropertyExplicitlySet("giVersion")) {
                this.giVersion(model.getGiVersion());
            }
            if (model.wasPropertyExplicitlySet("dataCollectionOptions")) {
                this.dataCollectionOptions(model.getDataCollectionOptions());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("clusterName")) {
                this.clusterName(model.getClusterName());
            }
            if (model.wasPropertyExplicitlySet("bootStorageSizeInGBs")) {
                this.bootStorageSizeInGBs(model.getBootStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("additionalVmStorageSizeInGBs")) {
                this.additionalVmStorageSizeInGBs(model.getAdditionalVmStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("totalStorageSizeInGBs")) {
                this.totalStorageSizeInGBs(model.getTotalStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("recoStorageSizeInGBs")) {
                this.recoStorageSizeInGBs(model.getRecoStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("systemVersion")) {
                this.systemVersion(model.getSystemVersion());
            }
            if (model.wasPropertyExplicitlySet("vmClusterType")) {
                this.vmClusterType(model.getVmClusterType());
            }
            if (model.wasPropertyExplicitlySet("cloudAutomationUpdateDetails")) {
                this.cloudAutomationUpdateDetails(model.getCloudAutomationUpdateDetails());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Base
     * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Base
     * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last
     * patch history. This value is updated as soon as a patch operation starts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastPatchHistoryEntryId")
    private final String lastPatchHistoryEntryId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the last
     * patch history. This value is updated as soon as a patch operation starts.
     *
     * @return the value
     */
    public String getLastPatchHistoryEntryId() {
        return lastPatchHistoryEntryId;
    }

    /** The current state of the VM Cluster. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of the VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the VM Cluster.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time that the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster
     * was created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster
     * was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time that the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster
     * was updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster
     * was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Additional information about the current lifecycle state of the the Base Database Service on
     * Cloud@Customer (BaseDB-C@C) VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state of the the Base Database Service on
     * Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The name of the availability domain in which the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster is located.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain in which the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster is located.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     */
    public enum DatabaseEdition implements com.oracle.bmc.http.internal.BmcEnum {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),
        EnterpriseEditionDeveloper("ENTERPRISE_EDITION_DEVELOPER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseEdition.class);

        private final String value;
        private static java.util.Map<String, DatabaseEdition> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseEdition v : DatabaseEdition.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseEdition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseEdition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseEdition', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to all the databases on the DB system. Exadata DB
     * systems and 2-node RAC DB systems require ENTERPRISE_EDITION_EXTREME_PERFORMANCE.
     *
     * @return the value
     */
    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /**
     * The number of nodes in the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes in the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** List of Base server OCIDs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbServers")
    private final java.util.List<String> dbServers;

    /**
     * List of Base server OCIDs.
     *
     * @return the value
     */
    public java.util.List<String> getDbServers() {
        return dbServers;
    }

    /** Total CPU cores for the BaseDB C@C VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
    private final Integer cpusEnabled;

    /**
     * Total CPU cores for the BaseDB C@C VM cluster.
     *
     * @return the value
     */
    public Integer getCpusEnabled() {
        return cpusEnabled;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Oracle
     * Data Cloud@Customer Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseInfrastructureId")
    private final String baseInfrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Oracle
     * Data Cloud@Customer Infrastructure.
     *
     * @return the value
     */
    public String getBaseInfrastructureId() {
        return baseInfrastructureId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * BaseDB-C@C VM Cluster Network.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseVmClusterNetworkId")
    private final String baseVmClusterNetworkId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * BaseDB-C@C VM Cluster Network.
     *
     * @return the value
     */
    public String getBaseVmClusterNetworkId() {
        return baseVmClusterNetworkId;
    }

    /** A valid Oracle Grid Infrastructure (GI) software version. */
    @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
    private final String giVersion;

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     *
     * @return the value
     */
    public String getGiVersion() {
        return giVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataCollectionOptions")
    private final DataCollectionOptions dataCollectionOptions;

    public DataCollectionOptions getDataCollectionOptions() {
        return dataCollectionOptions;
    }

    /** The description for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
     * cluster. The name does not need to be unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM
     * cluster. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The public key portion of one or more key pairs used for SSH access to the VMs of Base
     * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * The public key portion of one or more key pairs used for SSH access to the VMs of Base
     * Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     */
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /**
     * The time zone to use for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     * For details, see [Time
     * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     * For details, see [Time
     * Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /** The cluster name for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterName")
    private final String clusterName;

    /**
     * The cluster name for Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * Total boot partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootStorageSizeInGBs")
    private final Integer bootStorageSizeInGBs;

    /**
     * Total boot partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     *
     * @return the value
     */
    public Integer getBootStorageSizeInGBs() {
        return bootStorageSizeInGBs;
    }

    /**
     * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalVmStorageSizeInGBs")
    private final Integer additionalVmStorageSizeInGBs;

    /**
     * Total /u01 partition size (GB) for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     *
     * @return the value
     */
    public Integer getAdditionalVmStorageSizeInGBs() {
        return additionalVmStorageSizeInGBs;
    }

    /** The total storage allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalStorageSizeInGBs")
    private final Integer totalStorageSizeInGBs;

    /**
     * The total storage allocated in GBs.
     *
     * @return the value
     */
    public Integer getTotalStorageSizeInGBs() {
        return totalStorageSizeInGBs;
    }

    /**
     * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * The DATA Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recoStorageSizeInGBs")
    private final Integer recoStorageSizeInGBs;

    /**
     * The RECO Disk Group size in GB for the Base Database Service on Cloud@Customer (BaseDB-C@C)
     * VM cluster.
     *
     * @return the value
     */
    public Integer getRecoStorageSizeInGBs() {
        return recoStorageSizeInGBs;
    }

    /**
     * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The total memory to be allocated, in GBs, for the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The minimum is 11GB for every 4 ECPU.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     * The Oracle license model that applies to the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
     */
    public enum LicenseModel implements com.oracle.bmc.http.internal.BmcEnum {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LicenseModel.class);

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LicenseModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle license model that applies to the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Base Database Service on Cloud@Customer
     * (BaseDB-C@C) VM cluster. The default is LICENSE_INCLUDED.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** Operating system version of the image. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemVersion")
    private final String systemVersion;

    /**
     * Operating system version of the image.
     *
     * @return the value
     */
    public String getSystemVersion() {
        return systemVersion;
    }

    /** The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. */
    public enum VmClusterType implements com.oracle.bmc.http.internal.BmcEnum {
        Regular("REGULAR"),
        Developer("DEVELOPER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(VmClusterType.class);

        private final String value;
        private static java.util.Map<String, VmClusterType> map;

        static {
            map = new java.util.HashMap<>();
            for (VmClusterType v : VmClusterType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        VmClusterType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VmClusterType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'VmClusterType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterType")
    private final VmClusterType vmClusterType;

    /**
     * The cluster type for the Base Database Service on Cloud@Customer (BaseDB-C@C) VM cluster.
     *
     * @return the value
     */
    public VmClusterType getVmClusterType() {
        return vmClusterType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutomationUpdateDetails")
    private final CloudAutomationUpdateDetails cloudAutomationUpdateDetails;

    public CloudAutomationUpdateDetails getCloudAutomationUpdateDetails() {
        return cloudAutomationUpdateDetails;
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
        sb.append("BaseccVmClusterSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", lastPatchHistoryEntryId=")
                .append(String.valueOf(this.lastPatchHistoryEntryId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", dbServers=").append(String.valueOf(this.dbServers));
        sb.append(", cpusEnabled=").append(String.valueOf(this.cpusEnabled));
        sb.append(", baseInfrastructureId=").append(String.valueOf(this.baseInfrastructureId));
        sb.append(", baseVmClusterNetworkId=").append(String.valueOf(this.baseVmClusterNetworkId));
        sb.append(", giVersion=").append(String.valueOf(this.giVersion));
        sb.append(", dataCollectionOptions=").append(String.valueOf(this.dataCollectionOptions));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", clusterName=").append(String.valueOf(this.clusterName));
        sb.append(", bootStorageSizeInGBs=").append(String.valueOf(this.bootStorageSizeInGBs));
        sb.append(", additionalVmStorageSizeInGBs=")
                .append(String.valueOf(this.additionalVmStorageSizeInGBs));
        sb.append(", totalStorageSizeInGBs=").append(String.valueOf(this.totalStorageSizeInGBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", recoStorageSizeInGBs=").append(String.valueOf(this.recoStorageSizeInGBs));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", systemVersion=").append(String.valueOf(this.systemVersion));
        sb.append(", vmClusterType=").append(String.valueOf(this.vmClusterType));
        sb.append(", cloudAutomationUpdateDetails=")
                .append(String.valueOf(this.cloudAutomationUpdateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseccVmClusterSummary)) {
            return false;
        }

        BaseccVmClusterSummary other = (BaseccVmClusterSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.lastPatchHistoryEntryId, other.lastPatchHistoryEntryId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.dbServers, other.dbServers)
                && java.util.Objects.equals(this.cpusEnabled, other.cpusEnabled)
                && java.util.Objects.equals(this.baseInfrastructureId, other.baseInfrastructureId)
                && java.util.Objects.equals(
                        this.baseVmClusterNetworkId, other.baseVmClusterNetworkId)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && java.util.Objects.equals(this.dataCollectionOptions, other.dataCollectionOptions)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.clusterName, other.clusterName)
                && java.util.Objects.equals(this.bootStorageSizeInGBs, other.bootStorageSizeInGBs)
                && java.util.Objects.equals(
                        this.additionalVmStorageSizeInGBs, other.additionalVmStorageSizeInGBs)
                && java.util.Objects.equals(this.totalStorageSizeInGBs, other.totalStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.recoStorageSizeInGBs, other.recoStorageSizeInGBs)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.systemVersion, other.systemVersion)
                && java.util.Objects.equals(this.vmClusterType, other.vmClusterType)
                && java.util.Objects.equals(
                        this.cloudAutomationUpdateDetails, other.cloudAutomationUpdateDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lastPatchHistoryEntryId == null
                                ? 43
                                : this.lastPatchHistoryEntryId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.dbServers == null ? 43 : this.dbServers.hashCode());
        result = (result * PRIME) + (this.cpusEnabled == null ? 43 : this.cpusEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.baseInfrastructureId == null
                                ? 43
                                : this.baseInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.baseVmClusterNetworkId == null
                                ? 43
                                : this.baseVmClusterNetworkId.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCollectionOptions == null
                                ? 43
                                : this.dataCollectionOptions.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.clusterName == null ? 43 : this.clusterName.hashCode());
        result =
                (result * PRIME)
                        + (this.bootStorageSizeInGBs == null
                                ? 43
                                : this.bootStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalVmStorageSizeInGBs == null
                                ? 43
                                : this.additionalVmStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.totalStorageSizeInGBs == null
                                ? 43
                                : this.totalStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.recoStorageSizeInGBs == null
                                ? 43
                                : this.recoStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVersion == null ? 43 : this.systemVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.vmClusterType == null ? 43 : this.vmClusterType.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutomationUpdateDetails == null
                                ? 43
                                : this.cloudAutomationUpdateDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
