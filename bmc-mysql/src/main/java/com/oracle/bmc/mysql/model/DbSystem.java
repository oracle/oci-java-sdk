/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * A DB System is the core logical unit of MySQL Database Service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbSystem extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "subnetId",
        "nsgIds",
        "securityAttributes",
        "rest",
        "isHighlyAvailable",
        "currentPlacement",
        "isHeatWaveClusterAttached",
        "heatWaveCluster",
        "availabilityDomain",
        "faultDomain",
        "shapeName",
        "mysqlVersion",
        "backupPolicy",
        "source",
        "configurationId",
        "dataStorageSizeInGBs",
        "dataStorage",
        "hostnameLabel",
        "ipAddress",
        "port",
        "portX",
        "endpoints",
        "channels",
        "lifecycleState",
        "lifecycleDetails",
        "maintenance",
        "deletionPolicy",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "crashRecovery",
        "pointInTimeRecoveryDetails",
        "databaseManagement",
        "secureConnections",
        "encryptData",
        "databaseMode",
        "accessMode",
        "customerContacts",
        "readEndpoint"
    })
    public DbSystem(
            String id,
            String displayName,
            String description,
            String compartmentId,
            String subnetId,
            java.util.List<String> nsgIds,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            RestDetails rest,
            Boolean isHighlyAvailable,
            DbSystemPlacement currentPlacement,
            Boolean isHeatWaveClusterAttached,
            HeatWaveClusterSummary heatWaveCluster,
            String availabilityDomain,
            String faultDomain,
            String shapeName,
            String mysqlVersion,
            BackupPolicy backupPolicy,
            DbSystemSource source,
            String configurationId,
            Integer dataStorageSizeInGBs,
            DataStorage dataStorage,
            String hostnameLabel,
            String ipAddress,
            Integer port,
            Integer portX,
            java.util.List<DbSystemEndpoint> endpoints,
            java.util.List<ChannelSummary> channels,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            MaintenanceDetails maintenance,
            DeletionPolicyDetails deletionPolicy,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            CrashRecoveryStatus crashRecovery,
            PointInTimeRecoveryDetails pointInTimeRecoveryDetails,
            DatabaseManagementStatus databaseManagement,
            SecureConnectionDetails secureConnections,
            EncryptDataDetails encryptData,
            DatabaseMode databaseMode,
            AccessMode accessMode,
            java.util.List<CustomerContact> customerContacts,
            ReadEndpointDetails readEndpoint) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.securityAttributes = securityAttributes;
        this.rest = rest;
        this.isHighlyAvailable = isHighlyAvailable;
        this.currentPlacement = currentPlacement;
        this.isHeatWaveClusterAttached = isHeatWaveClusterAttached;
        this.heatWaveCluster = heatWaveCluster;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.shapeName = shapeName;
        this.mysqlVersion = mysqlVersion;
        this.backupPolicy = backupPolicy;
        this.source = source;
        this.configurationId = configurationId;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.dataStorage = dataStorage;
        this.hostnameLabel = hostnameLabel;
        this.ipAddress = ipAddress;
        this.port = port;
        this.portX = portX;
        this.endpoints = endpoints;
        this.channels = channels;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.maintenance = maintenance;
        this.deletionPolicy = deletionPolicy;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.crashRecovery = crashRecovery;
        this.pointInTimeRecoveryDetails = pointInTimeRecoveryDetails;
        this.databaseManagement = databaseManagement;
        this.secureConnections = secureConnections;
        this.encryptData = encryptData;
        this.databaseMode = databaseMode;
        this.accessMode = accessMode;
        this.customerContacts = customerContacts;
        this.readEndpoint = readEndpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the DB System.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The user-friendly name for the DB System. It does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the DB System. It does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** User-provided data about the DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-provided data about the DB System.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The OCID of the compartment the DB System belongs in. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment the DB System belongs in.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the subnet the DB System is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet the DB System is associated with.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** Network Security Group OCIDs used for the VNIC attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * Network Security Group OCIDs used for the VNIC attachment.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [ZPR
         * Artifacts](https://docs.oracle.com/en-us/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm).
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security Attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [ZPR
         * Artifacts](https://docs.oracle.com/en-us/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm).
         * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rest")
        private RestDetails rest;

        public Builder rest(RestDetails rest) {
            this.rest = rest;
            this.__explicitlySet__.add("rest");
            return this;
        }
        /** Specifies if the DB System is highly available. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
        private Boolean isHighlyAvailable;

        /**
         * Specifies if the DB System is highly available.
         *
         * @param isHighlyAvailable the value to set
         * @return this builder
         */
        public Builder isHighlyAvailable(Boolean isHighlyAvailable) {
            this.isHighlyAvailable = isHighlyAvailable;
            this.__explicitlySet__.add("isHighlyAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentPlacement")
        private DbSystemPlacement currentPlacement;

        public Builder currentPlacement(DbSystemPlacement currentPlacement) {
            this.currentPlacement = currentPlacement;
            this.__explicitlySet__.add("currentPlacement");
            return this;
        }
        /** If the DB System has a HeatWave Cluster attached. */
        @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveClusterAttached")
        private Boolean isHeatWaveClusterAttached;

        /**
         * If the DB System has a HeatWave Cluster attached.
         *
         * @param isHeatWaveClusterAttached the value to set
         * @return this builder
         */
        public Builder isHeatWaveClusterAttached(Boolean isHeatWaveClusterAttached) {
            this.isHeatWaveClusterAttached = isHeatWaveClusterAttached;
            this.__explicitlySet__.add("isHeatWaveClusterAttached");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("heatWaveCluster")
        private HeatWaveClusterSummary heatWaveCluster;

        public Builder heatWaveCluster(HeatWaveClusterSummary heatWaveCluster) {
            this.heatWaveCluster = heatWaveCluster;
            this.__explicitlySet__.add("heatWaveCluster");
            return this;
        }
        /**
         * The availability domain on which to deploy the Read/Write endpoint. This defines the
         * preferred primary instance.
         *
         * <p>In a failover scenario, the Read/Write endpoint is redirected to one of the other
         * availability domains and the MySQL instance in that domain is promoted to the primary
         * instance. This redirection does not affect the IP address of the DB System in any way.
         *
         * <p>For a standalone DB System, this defines the availability domain in which the DB
         * System is placed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain on which to deploy the Read/Write endpoint. This defines the
         * preferred primary instance.
         *
         * <p>In a failover scenario, the Read/Write endpoint is redirected to one of the other
         * availability domains and the MySQL instance in that domain is promoted to the primary
         * instance. This redirection does not affect the IP address of the DB System in any way.
         *
         * <p>For a standalone DB System, this defines the availability domain in which the DB
         * System is placed.
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
         * The fault domain on which to deploy the Read/Write endpoint. This defines the preferred
         * primary instance.
         *
         * <p>In a failover scenario, the Read/Write endpoint is redirected to one of the other
         * fault domains and the MySQL instance in that domain is promoted to the primary instance.
         * This redirection does not affect the IP address of the DB System in any way.
         *
         * <p>For a standalone DB System, this defines the fault domain in which the DB System is
         * placed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain on which to deploy the Read/Write endpoint. This defines the preferred
         * primary instance.
         *
         * <p>In a failover scenario, the Read/Write endpoint is redirected to one of the other
         * fault domains and the MySQL instance in that domain is promoted to the primary instance.
         * This redirection does not affect the IP address of the DB System in any way.
         *
         * <p>For a standalone DB System, this defines the fault domain in which the DB System is
         * placed.
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The shape of the primary instances of the DB System. The shape determines resources
         * allocated to a DB System - CPU cores and memory for VM shapes; CPU cores, memory and
         * storage for non-VM (or bare metal) shapes. To get a list of shapes, use (the {@link
         * #listShapes(ListShapesRequest) listShapes} operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape of the primary instances of the DB System. The shape determines resources
         * allocated to a DB System - CPU cores and memory for VM shapes; CPU cores, memory and
         * storage for non-VM (or bare metal) shapes. To get a list of shapes, use (the {@link
         * #listShapes(ListShapesRequest) listShapes} operation.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /** Name of the MySQL Version in use for the DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        /**
         * Name of the MySQL Version in use for the DB System.
         *
         * @param mysqlVersion the value to set
         * @return this builder
         */
        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
        private BackupPolicy backupPolicy;

        public Builder backupPolicy(BackupPolicy backupPolicy) {
            this.backupPolicy = backupPolicy;
            this.__explicitlySet__.add("backupPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private DbSystemSource source;

        public Builder source(DbSystemSource source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** The OCID of the Configuration to be used for Instances in this DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
        private String configurationId;

        /**
         * The OCID of the Configuration to be used for Instances in this DB System.
         *
         * @param configurationId the value to set
         * @return this builder
         */
        public Builder configurationId(String configurationId) {
            this.configurationId = configurationId;
            this.__explicitlySet__.add("configurationId");
            return this;
        }
        /**
         * DEPRECATED: User specified size of the data volume. May be less than current
         * allocatedStorageSizeInGBs. Replaced by dataStorage.dataStorageSizeInGBs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * DEPRECATED: User specified size of the data volume. May be less than current
         * allocatedStorageSizeInGBs. Replaced by dataStorage.dataStorageSizeInGBs.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorage")
        private DataStorage dataStorage;

        public Builder dataStorage(DataStorage dataStorage) {
            this.dataStorage = dataStorage;
            this.__explicitlySet__.add("dataStorage");
            return this;
        }
        /**
         * The hostname for the primary endpoint of the DB System. Used for DNS. The value is the
         * hostname portion of the primary private IP's fully qualified domain name (FQDN) (for
         * example, "dbsystem-1" in FQDN "dbsystem-1.subnet123.vcn1.oraclevcn.com"). Must be unique
         * across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * The hostname for the primary endpoint of the DB System. Used for DNS. The value is the
         * hostname portion of the primary private IP's fully qualified domain name (FQDN) (for
         * example, "dbsystem-1" in FQDN "dbsystem-1.subnet123.vcn1.oraclevcn.com"). Must be unique
         * across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
         *
         * @param hostnameLabel the value to set
         * @return this builder
         */
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }
        /**
         * The IP address the DB System is configured to listen on. A private IP address of the
         * primary endpoint of the DB System. Must be an available IP address within the subnet's
         * CIDR. This will be a "dotted-quad" style IPv4 address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address the DB System is configured to listen on. A private IP address of the
         * primary endpoint of the DB System. Must be an available IP address within the subnet's
         * CIDR. This will be a "dotted-quad" style IPv4 address.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** The port for primary endpoint of the DB System to listen on. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * The port for primary endpoint of the DB System to listen on.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /**
         * The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin
         * equivalent of port.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("portX")
        private Integer portX;

        /**
         * The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin
         * equivalent of port.
         *
         * @param portX the value to set
         * @return this builder
         */
        public Builder portX(Integer portX) {
            this.portX = portX;
            this.__explicitlySet__.add("portX");
            return this;
        }
        /** The network endpoints available for this DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private java.util.List<DbSystemEndpoint> endpoints;

        /**
         * The network endpoints available for this DB System.
         *
         * @param endpoints the value to set
         * @return this builder
         */
        public Builder endpoints(java.util.List<DbSystemEndpoint> endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
            return this;
        }
        /** A list with a summary of all the Channels attached to the DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("channels")
        private java.util.List<ChannelSummary> channels;

        /**
         * A list with a summary of all the Channels attached to the DB System.
         *
         * @param channels the value to set
         * @return this builder
         */
        public Builder channels(java.util.List<ChannelSummary> channels) {
            this.channels = channels;
            this.__explicitlySet__.add("channels");
            return this;
        }
        /** The current state of the DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the DB System.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current lifecycleState. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycleState.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenance")
        private MaintenanceDetails maintenance;

        public Builder maintenance(MaintenanceDetails maintenance) {
            this.maintenance = maintenance;
            this.__explicitlySet__.add("maintenance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deletionPolicy")
        private DeletionPolicyDetails deletionPolicy;

        public Builder deletionPolicy(DeletionPolicyDetails deletionPolicy) {
            this.deletionPolicy = deletionPolicy;
            this.__explicitlySet__.add("deletionPolicy");
            return this;
        }
        /** The date and time the DB System was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the DB System was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the DB System was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the DB System was last updated.
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or
         * disabled, and whether to enable or disable syncing of the Binary Logs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crashRecovery")
        private CrashRecoveryStatus crashRecovery;

        /**
         * Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or
         * disabled, and whether to enable or disable syncing of the Binary Logs.
         *
         * @param crashRecovery the value to set
         * @return this builder
         */
        public Builder crashRecovery(CrashRecoveryStatus crashRecovery) {
            this.crashRecovery = crashRecovery;
            this.__explicitlySet__.add("crashRecovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pointInTimeRecoveryDetails")
        private PointInTimeRecoveryDetails pointInTimeRecoveryDetails;

        public Builder pointInTimeRecoveryDetails(
                PointInTimeRecoveryDetails pointInTimeRecoveryDetails) {
            this.pointInTimeRecoveryDetails = pointInTimeRecoveryDetails;
            this.__explicitlySet__.add("pointInTimeRecoveryDetails");
            return this;
        }
        /** Whether to enable monitoring via the Database Management service. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagement")
        private DatabaseManagementStatus databaseManagement;

        /**
         * Whether to enable monitoring via the Database Management service.
         *
         * @param databaseManagement the value to set
         * @return this builder
         */
        public Builder databaseManagement(DatabaseManagementStatus databaseManagement) {
            this.databaseManagement = databaseManagement;
            this.__explicitlySet__.add("databaseManagement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secureConnections")
        private SecureConnectionDetails secureConnections;

        public Builder secureConnections(SecureConnectionDetails secureConnections) {
            this.secureConnections = secureConnections;
            this.__explicitlySet__.add("secureConnections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptData")
        private EncryptDataDetails encryptData;

        public Builder encryptData(EncryptDataDetails encryptData) {
            this.encryptData = encryptData;
            this.__explicitlySet__.add("encryptData");
            return this;
        }
        /**
         * The database mode indicating the types of statements that are allowed to run in the the
         * DB system. This mode applies only to statements run by user connections. Replicated write
         * statements continue to be allowed regardless of the DatabaseMode. - READ_WRITE: allow
         * running read and write statements on the DB system; - READ_ONLY: only allow running read
         * statements on the DB system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseMode")
        private DatabaseMode databaseMode;

        /**
         * The database mode indicating the types of statements that are allowed to run in the the
         * DB system. This mode applies only to statements run by user connections. Replicated write
         * statements continue to be allowed regardless of the DatabaseMode. - READ_WRITE: allow
         * running read and write statements on the DB system; - READ_ONLY: only allow running read
         * statements on the DB system.
         *
         * @param databaseMode the value to set
         * @return this builder
         */
        public Builder databaseMode(DatabaseMode databaseMode) {
            this.databaseMode = databaseMode;
            this.__explicitlySet__.add("databaseMode");
            return this;
        }
        /**
         * The access mode indicating if the database access is unrestricted (to all MySQL user
         * accounts), or restricted (to only certain users with specific privileges): -
         * UNRESTRICTED: the access to the database is not restricted; - RESTRICTED: access allowed
         * only to users with specific privileges; RESTRICTED will correspond to setting the MySQL
         * system variable
         * [offline_mode](https://dev.mysql.com/doc/en/server-system-variables.html#sysvar_offline_mode)
         * to ON.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessMode")
        private AccessMode accessMode;

        /**
         * The access mode indicating if the database access is unrestricted (to all MySQL user
         * accounts), or restricted (to only certain users with specific privileges): -
         * UNRESTRICTED: the access to the database is not restricted; - RESTRICTED: access allowed
         * only to users with specific privileges; RESTRICTED will correspond to setting the MySQL
         * system variable
         * [offline_mode](https://dev.mysql.com/doc/en/server-system-variables.html#sysvar_offline_mode)
         * to ON.
         *
         * @param accessMode the value to set
         * @return this builder
         */
        public Builder accessMode(AccessMode accessMode) {
            this.accessMode = accessMode;
            this.__explicitlySet__.add("accessMode");
            return this;
        }
        /**
         * The list of customer email addresses that receive information from Oracle about the
         * specified OCI DB System resource. Oracle uses these email addresses to send notifications
         * about planned and unplanned software maintenance updates, information about system
         * hardware, and other information needed by administrators. Up to 10 email addresses can be
         * added to the customer contacts for a DB System.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        /**
         * The list of customer email addresses that receive information from Oracle about the
         * specified OCI DB System resource. Oracle uses these email addresses to send notifications
         * about planned and unplanned software maintenance updates, information about system
         * hardware, and other information needed by administrators. Up to 10 email addresses can be
         * added to the customer contacts for a DB System.
         *
         * @param customerContacts the value to set
         * @return this builder
         */
        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readEndpoint")
        private ReadEndpointDetails readEndpoint;

        public Builder readEndpoint(ReadEndpointDetails readEndpoint) {
            this.readEndpoint = readEndpoint;
            this.__explicitlySet__.add("readEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystem build() {
            DbSystem model =
                    new DbSystem(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.subnetId,
                            this.nsgIds,
                            this.securityAttributes,
                            this.rest,
                            this.isHighlyAvailable,
                            this.currentPlacement,
                            this.isHeatWaveClusterAttached,
                            this.heatWaveCluster,
                            this.availabilityDomain,
                            this.faultDomain,
                            this.shapeName,
                            this.mysqlVersion,
                            this.backupPolicy,
                            this.source,
                            this.configurationId,
                            this.dataStorageSizeInGBs,
                            this.dataStorage,
                            this.hostnameLabel,
                            this.ipAddress,
                            this.port,
                            this.portX,
                            this.endpoints,
                            this.channels,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.maintenance,
                            this.deletionPolicy,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.crashRecovery,
                            this.pointInTimeRecoveryDetails,
                            this.databaseManagement,
                            this.secureConnections,
                            this.encryptData,
                            this.databaseMode,
                            this.accessMode,
                            this.customerContacts,
                            this.readEndpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystem model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("rest")) {
                this.rest(model.getRest());
            }
            if (model.wasPropertyExplicitlySet("isHighlyAvailable")) {
                this.isHighlyAvailable(model.getIsHighlyAvailable());
            }
            if (model.wasPropertyExplicitlySet("currentPlacement")) {
                this.currentPlacement(model.getCurrentPlacement());
            }
            if (model.wasPropertyExplicitlySet("isHeatWaveClusterAttached")) {
                this.isHeatWaveClusterAttached(model.getIsHeatWaveClusterAttached());
            }
            if (model.wasPropertyExplicitlySet("heatWaveCluster")) {
                this.heatWaveCluster(model.getHeatWaveCluster());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("mysqlVersion")) {
                this.mysqlVersion(model.getMysqlVersion());
            }
            if (model.wasPropertyExplicitlySet("backupPolicy")) {
                this.backupPolicy(model.getBackupPolicy());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("configurationId")) {
                this.configurationId(model.getConfigurationId());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorage")) {
                this.dataStorage(model.getDataStorage());
            }
            if (model.wasPropertyExplicitlySet("hostnameLabel")) {
                this.hostnameLabel(model.getHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("portX")) {
                this.portX(model.getPortX());
            }
            if (model.wasPropertyExplicitlySet("endpoints")) {
                this.endpoints(model.getEndpoints());
            }
            if (model.wasPropertyExplicitlySet("channels")) {
                this.channels(model.getChannels());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("maintenance")) {
                this.maintenance(model.getMaintenance());
            }
            if (model.wasPropertyExplicitlySet("deletionPolicy")) {
                this.deletionPolicy(model.getDeletionPolicy());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
            if (model.wasPropertyExplicitlySet("crashRecovery")) {
                this.crashRecovery(model.getCrashRecovery());
            }
            if (model.wasPropertyExplicitlySet("pointInTimeRecoveryDetails")) {
                this.pointInTimeRecoveryDetails(model.getPointInTimeRecoveryDetails());
            }
            if (model.wasPropertyExplicitlySet("databaseManagement")) {
                this.databaseManagement(model.getDatabaseManagement());
            }
            if (model.wasPropertyExplicitlySet("secureConnections")) {
                this.secureConnections(model.getSecureConnections());
            }
            if (model.wasPropertyExplicitlySet("encryptData")) {
                this.encryptData(model.getEncryptData());
            }
            if (model.wasPropertyExplicitlySet("databaseMode")) {
                this.databaseMode(model.getDatabaseMode());
            }
            if (model.wasPropertyExplicitlySet("accessMode")) {
                this.accessMode(model.getAccessMode());
            }
            if (model.wasPropertyExplicitlySet("customerContacts")) {
                this.customerContacts(model.getCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("readEndpoint")) {
                this.readEndpoint(model.getReadEndpoint());
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

    /** The OCID of the DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the DB System.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-friendly name for the DB System. It does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the DB System. It does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** User-provided data about the DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-provided data about the DB System.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The OCID of the compartment the DB System belongs in. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment the DB System belongs in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the subnet the DB System is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet the DB System is associated with.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** Network Security Group OCIDs used for the VNIC attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * Network Security Group OCIDs used for the VNIC attachment.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [ZPR
     * Artifacts](https://docs.oracle.com/en-us/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm).
     * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security Attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [ZPR
     * Artifacts](https://docs.oracle.com/en-us/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm).
     * Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rest")
    private final RestDetails rest;

    public RestDetails getRest() {
        return rest;
    }

    /** Specifies if the DB System is highly available. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
    private final Boolean isHighlyAvailable;

    /**
     * Specifies if the DB System is highly available.
     *
     * @return the value
     */
    public Boolean getIsHighlyAvailable() {
        return isHighlyAvailable;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currentPlacement")
    private final DbSystemPlacement currentPlacement;

    public DbSystemPlacement getCurrentPlacement() {
        return currentPlacement;
    }

    /** If the DB System has a HeatWave Cluster attached. */
    @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveClusterAttached")
    private final Boolean isHeatWaveClusterAttached;

    /**
     * If the DB System has a HeatWave Cluster attached.
     *
     * @return the value
     */
    public Boolean getIsHeatWaveClusterAttached() {
        return isHeatWaveClusterAttached;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveCluster")
    private final HeatWaveClusterSummary heatWaveCluster;

    public HeatWaveClusterSummary getHeatWaveCluster() {
        return heatWaveCluster;
    }

    /**
     * The availability domain on which to deploy the Read/Write endpoint. This defines the
     * preferred primary instance.
     *
     * <p>In a failover scenario, the Read/Write endpoint is redirected to one of the other
     * availability domains and the MySQL instance in that domain is promoted to the primary
     * instance. This redirection does not affect the IP address of the DB System in any way.
     *
     * <p>For a standalone DB System, this defines the availability domain in which the DB System is
     * placed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain on which to deploy the Read/Write endpoint. This defines the
     * preferred primary instance.
     *
     * <p>In a failover scenario, the Read/Write endpoint is redirected to one of the other
     * availability domains and the MySQL instance in that domain is promoted to the primary
     * instance. This redirection does not affect the IP address of the DB System in any way.
     *
     * <p>For a standalone DB System, this defines the availability domain in which the DB System is
     * placed.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The fault domain on which to deploy the Read/Write endpoint. This defines the preferred
     * primary instance.
     *
     * <p>In a failover scenario, the Read/Write endpoint is redirected to one of the other fault
     * domains and the MySQL instance in that domain is promoted to the primary instance. This
     * redirection does not affect the IP address of the DB System in any way.
     *
     * <p>For a standalone DB System, this defines the fault domain in which the DB System is
     * placed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain on which to deploy the Read/Write endpoint. This defines the preferred
     * primary instance.
     *
     * <p>In a failover scenario, the Read/Write endpoint is redirected to one of the other fault
     * domains and the MySQL instance in that domain is promoted to the primary instance. This
     * redirection does not affect the IP address of the DB System in any way.
     *
     * <p>For a standalone DB System, this defines the fault domain in which the DB System is
     * placed.
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The shape of the primary instances of the DB System. The shape determines resources allocated
     * to a DB System - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM
     * (or bare metal) shapes. To get a list of shapes, use (the {@link
     * #listShapes(ListShapesRequest) listShapes} operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape of the primary instances of the DB System. The shape determines resources allocated
     * to a DB System - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM
     * (or bare metal) shapes. To get a list of shapes, use (the {@link
     * #listShapes(ListShapesRequest) listShapes} operation.
     *
     * @return the value
     */
    public String getShapeName() {
        return shapeName;
    }

    /** Name of the MySQL Version in use for the DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    private final String mysqlVersion;

    /**
     * Name of the MySQL Version in use for the DB System.
     *
     * @return the value
     */
    public String getMysqlVersion() {
        return mysqlVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
    private final BackupPolicy backupPolicy;

    public BackupPolicy getBackupPolicy() {
        return backupPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final DbSystemSource source;

    public DbSystemSource getSource() {
        return source;
    }

    /** The OCID of the Configuration to be used for Instances in this DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
    private final String configurationId;

    /**
     * The OCID of the Configuration to be used for Instances in this DB System.
     *
     * @return the value
     */
    public String getConfigurationId() {
        return configurationId;
    }

    /**
     * DEPRECATED: User specified size of the data volume. May be less than current
     * allocatedStorageSizeInGBs. Replaced by dataStorage.dataStorageSizeInGBs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * DEPRECATED: User specified size of the data volume. May be less than current
     * allocatedStorageSizeInGBs. Replaced by dataStorage.dataStorageSizeInGBs.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataStorage")
    private final DataStorage dataStorage;

    public DataStorage getDataStorage() {
        return dataStorage;
    }

    /**
     * The hostname for the primary endpoint of the DB System. Used for DNS. The value is the
     * hostname portion of the primary private IP's fully qualified domain name (FQDN) (for example,
     * "dbsystem-1" in FQDN "dbsystem-1.subnet123.vcn1.oraclevcn.com"). Must be unique across all
     * VNICs in the subnet and comply with RFC 952 and RFC 1123.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * The hostname for the primary endpoint of the DB System. Used for DNS. The value is the
     * hostname portion of the primary private IP's fully qualified domain name (FQDN) (for example,
     * "dbsystem-1" in FQDN "dbsystem-1.subnet123.vcn1.oraclevcn.com"). Must be unique across all
     * VNICs in the subnet and comply with RFC 952 and RFC 1123.
     *
     * @return the value
     */
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * The IP address the DB System is configured to listen on. A private IP address of the primary
     * endpoint of the DB System. Must be an available IP address within the subnet's CIDR. This
     * will be a "dotted-quad" style IPv4 address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address the DB System is configured to listen on. A private IP address of the primary
     * endpoint of the DB System. Must be an available IP address within the subnet's CIDR. This
     * will be a "dotted-quad" style IPv4 address.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** The port for primary endpoint of the DB System to listen on. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * The port for primary endpoint of the DB System to listen on.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /**
     * The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin
     * equivalent of port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portX")
    private final Integer portX;

    /**
     * The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin
     * equivalent of port.
     *
     * @return the value
     */
    public Integer getPortX() {
        return portX;
    }

    /** The network endpoints available for this DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    private final java.util.List<DbSystemEndpoint> endpoints;

    /**
     * The network endpoints available for this DB System.
     *
     * @return the value
     */
    public java.util.List<DbSystemEndpoint> getEndpoints() {
        return endpoints;
    }

    /** A list with a summary of all the Channels attached to the DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("channels")
    private final java.util.List<ChannelSummary> channels;

    /**
     * A list with a summary of all the Channels attached to the DB System.
     *
     * @return the value
     */
    public java.util.List<ChannelSummary> getChannels() {
        return channels;
    }

    /** The current state of the DB System. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
    /** The current state of the DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the DB System.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current lifecycleState. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycleState.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenance")
    private final MaintenanceDetails maintenance;

    public MaintenanceDetails getMaintenance() {
        return maintenance;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deletionPolicy")
    private final DeletionPolicyDetails deletionPolicy;

    public DeletionPolicyDetails getDeletionPolicy() {
        return deletionPolicy;
    }

    /** The date and time the DB System was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the DB System was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the DB System was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the DB System was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or
     * disabled, and whether to enable or disable syncing of the Binary Logs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crashRecovery")
    private final CrashRecoveryStatus crashRecovery;

    /**
     * Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or
     * disabled, and whether to enable or disable syncing of the Binary Logs.
     *
     * @return the value
     */
    public CrashRecoveryStatus getCrashRecovery() {
        return crashRecovery;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pointInTimeRecoveryDetails")
    private final PointInTimeRecoveryDetails pointInTimeRecoveryDetails;

    public PointInTimeRecoveryDetails getPointInTimeRecoveryDetails() {
        return pointInTimeRecoveryDetails;
    }

    /** Whether to enable monitoring via the Database Management service. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagement")
    private final DatabaseManagementStatus databaseManagement;

    /**
     * Whether to enable monitoring via the Database Management service.
     *
     * @return the value
     */
    public DatabaseManagementStatus getDatabaseManagement() {
        return databaseManagement;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secureConnections")
    private final SecureConnectionDetails secureConnections;

    public SecureConnectionDetails getSecureConnections() {
        return secureConnections;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptData")
    private final EncryptDataDetails encryptData;

    public EncryptDataDetails getEncryptData() {
        return encryptData;
    }

    /**
     * The database mode indicating the types of statements that are allowed to run in the the DB
     * system. This mode applies only to statements run by user connections. Replicated write
     * statements continue to be allowed regardless of the DatabaseMode. - READ_WRITE: allow running
     * read and write statements on the DB system; - READ_ONLY: only allow running read statements
     * on the DB system.
     */
    public enum DatabaseMode implements com.oracle.bmc.http.internal.BmcEnum {
        ReadWrite("READ_WRITE"),
        ReadOnly("READ_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseMode.class);

        private final String value;
        private static java.util.Map<String, DatabaseMode> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseMode v : DatabaseMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The database mode indicating the types of statements that are allowed to run in the the DB
     * system. This mode applies only to statements run by user connections. Replicated write
     * statements continue to be allowed regardless of the DatabaseMode. - READ_WRITE: allow running
     * read and write statements on the DB system; - READ_ONLY: only allow running read statements
     * on the DB system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseMode")
    private final DatabaseMode databaseMode;

    /**
     * The database mode indicating the types of statements that are allowed to run in the the DB
     * system. This mode applies only to statements run by user connections. Replicated write
     * statements continue to be allowed regardless of the DatabaseMode. - READ_WRITE: allow running
     * read and write statements on the DB system; - READ_ONLY: only allow running read statements
     * on the DB system.
     *
     * @return the value
     */
    public DatabaseMode getDatabaseMode() {
        return databaseMode;
    }

    /**
     * The access mode indicating if the database access is unrestricted (to all MySQL user
     * accounts), or restricted (to only certain users with specific privileges): - UNRESTRICTED:
     * the access to the database is not restricted; - RESTRICTED: access allowed only to users with
     * specific privileges; RESTRICTED will correspond to setting the MySQL system variable
     * [offline_mode](https://dev.mysql.com/doc/en/server-system-variables.html#sysvar_offline_mode)
     * to ON.
     */
    public enum AccessMode implements com.oracle.bmc.http.internal.BmcEnum {
        Unrestricted("UNRESTRICTED"),
        Restricted("RESTRICTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AccessMode.class);

        private final String value;
        private static java.util.Map<String, AccessMode> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessMode v : AccessMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AccessMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AccessMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The access mode indicating if the database access is unrestricted (to all MySQL user
     * accounts), or restricted (to only certain users with specific privileges): - UNRESTRICTED:
     * the access to the database is not restricted; - RESTRICTED: access allowed only to users with
     * specific privileges; RESTRICTED will correspond to setting the MySQL system variable
     * [offline_mode](https://dev.mysql.com/doc/en/server-system-variables.html#sysvar_offline_mode)
     * to ON.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessMode")
    private final AccessMode accessMode;

    /**
     * The access mode indicating if the database access is unrestricted (to all MySQL user
     * accounts), or restricted (to only certain users with specific privileges): - UNRESTRICTED:
     * the access to the database is not restricted; - RESTRICTED: access allowed only to users with
     * specific privileges; RESTRICTED will correspond to setting the MySQL system variable
     * [offline_mode](https://dev.mysql.com/doc/en/server-system-variables.html#sysvar_offline_mode)
     * to ON.
     *
     * @return the value
     */
    public AccessMode getAccessMode() {
        return accessMode;
    }

    /**
     * The list of customer email addresses that receive information from Oracle about the specified
     * OCI DB System resource. Oracle uses these email addresses to send notifications about planned
     * and unplanned software maintenance updates, information about system hardware, and other
     * information needed by administrators. Up to 10 email addresses can be added to the customer
     * contacts for a DB System.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * The list of customer email addresses that receive information from Oracle about the specified
     * OCI DB System resource. Oracle uses these email addresses to send notifications about planned
     * and unplanned software maintenance updates, information about system hardware, and other
     * information needed by administrators. Up to 10 email addresses can be added to the customer
     * contacts for a DB System.
     *
     * @return the value
     */
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("readEndpoint")
    private final ReadEndpointDetails readEndpoint;

    public ReadEndpointDetails getReadEndpoint() {
        return readEndpoint;
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
        sb.append("DbSystem(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", rest=").append(String.valueOf(this.rest));
        sb.append(", isHighlyAvailable=").append(String.valueOf(this.isHighlyAvailable));
        sb.append(", currentPlacement=").append(String.valueOf(this.currentPlacement));
        sb.append(", isHeatWaveClusterAttached=")
                .append(String.valueOf(this.isHeatWaveClusterAttached));
        sb.append(", heatWaveCluster=").append(String.valueOf(this.heatWaveCluster));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", mysqlVersion=").append(String.valueOf(this.mysqlVersion));
        sb.append(", backupPolicy=").append(String.valueOf(this.backupPolicy));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", configurationId=").append(String.valueOf(this.configurationId));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", dataStorage=").append(String.valueOf(this.dataStorage));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", portX=").append(String.valueOf(this.portX));
        sb.append(", endpoints=").append(String.valueOf(this.endpoints));
        sb.append(", channels=").append(String.valueOf(this.channels));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", maintenance=").append(String.valueOf(this.maintenance));
        sb.append(", deletionPolicy=").append(String.valueOf(this.deletionPolicy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", crashRecovery=").append(String.valueOf(this.crashRecovery));
        sb.append(", pointInTimeRecoveryDetails=")
                .append(String.valueOf(this.pointInTimeRecoveryDetails));
        sb.append(", databaseManagement=").append(String.valueOf(this.databaseManagement));
        sb.append(", secureConnections=").append(String.valueOf(this.secureConnections));
        sb.append(", encryptData=").append(String.valueOf(this.encryptData));
        sb.append(", databaseMode=").append(String.valueOf(this.databaseMode));
        sb.append(", accessMode=").append(String.valueOf(this.accessMode));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", readEndpoint=").append(String.valueOf(this.readEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystem)) {
            return false;
        }

        DbSystem other = (DbSystem) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.rest, other.rest)
                && java.util.Objects.equals(this.isHighlyAvailable, other.isHighlyAvailable)
                && java.util.Objects.equals(this.currentPlacement, other.currentPlacement)
                && java.util.Objects.equals(
                        this.isHeatWaveClusterAttached, other.isHeatWaveClusterAttached)
                && java.util.Objects.equals(this.heatWaveCluster, other.heatWaveCluster)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.mysqlVersion, other.mysqlVersion)
                && java.util.Objects.equals(this.backupPolicy, other.backupPolicy)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.configurationId, other.configurationId)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorage, other.dataStorage)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.portX, other.portX)
                && java.util.Objects.equals(this.endpoints, other.endpoints)
                && java.util.Objects.equals(this.channels, other.channels)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.maintenance, other.maintenance)
                && java.util.Objects.equals(this.deletionPolicy, other.deletionPolicy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.crashRecovery, other.crashRecovery)
                && java.util.Objects.equals(
                        this.pointInTimeRecoveryDetails, other.pointInTimeRecoveryDetails)
                && java.util.Objects.equals(this.databaseManagement, other.databaseManagement)
                && java.util.Objects.equals(this.secureConnections, other.secureConnections)
                && java.util.Objects.equals(this.encryptData, other.encryptData)
                && java.util.Objects.equals(this.databaseMode, other.databaseMode)
                && java.util.Objects.equals(this.accessMode, other.accessMode)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(this.readEndpoint, other.readEndpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.rest == null ? 43 : this.rest.hashCode());
        result =
                (result * PRIME)
                        + (this.isHighlyAvailable == null ? 43 : this.isHighlyAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.currentPlacement == null ? 43 : this.currentPlacement.hashCode());
        result =
                (result * PRIME)
                        + (this.isHeatWaveClusterAttached == null
                                ? 43
                                : this.isHeatWaveClusterAttached.hashCode());
        result =
                (result * PRIME)
                        + (this.heatWaveCluster == null ? 43 : this.heatWaveCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.mysqlVersion == null ? 43 : this.mysqlVersion.hashCode());
        result = (result * PRIME) + (this.backupPolicy == null ? 43 : this.backupPolicy.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationId == null ? 43 : this.configurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.dataStorage == null ? 43 : this.dataStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.portX == null ? 43 : this.portX.hashCode());
        result = (result * PRIME) + (this.endpoints == null ? 43 : this.endpoints.hashCode());
        result = (result * PRIME) + (this.channels == null ? 43 : this.channels.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.maintenance == null ? 43 : this.maintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.deletionPolicy == null ? 43 : this.deletionPolicy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.crashRecovery == null ? 43 : this.crashRecovery.hashCode());
        result =
                (result * PRIME)
                        + (this.pointInTimeRecoveryDetails == null
                                ? 43
                                : this.pointInTimeRecoveryDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseManagement == null
                                ? 43
                                : this.databaseManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.secureConnections == null ? 43 : this.secureConnections.hashCode());
        result = (result * PRIME) + (this.encryptData == null ? 43 : this.encryptData.hashCode());
        result = (result * PRIME) + (this.databaseMode == null ? 43 : this.databaseMode.hashCode());
        result = (result * PRIME) + (this.accessMode == null ? 43 : this.accessMode.hashCode());
        result =
                (result * PRIME)
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result = (result * PRIME) + (this.readEndpoint == null ? 43 : this.readEndpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
