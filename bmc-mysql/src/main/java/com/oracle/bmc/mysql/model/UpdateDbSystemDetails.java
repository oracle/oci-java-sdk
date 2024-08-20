/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Details required to update a DB System. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "subnetId",
        "isHighlyAvailable",
        "availabilityDomain",
        "faultDomain",
        "shapeName",
        "mysqlVersion",
        "configurationId",
        "adminUsername",
        "adminPassword",
        "dataStorageSizeInGBs",
        "dataStorage",
        "hostnameLabel",
        "ipAddress",
        "port",
        "portX",
        "backupPolicy",
        "maintenance",
        "freeformTags",
        "definedTags",
        "deletionPolicy",
        "crashRecovery",
        "databaseManagement",
        "secureConnections"
    })
    public UpdateDbSystemDetails(
            String displayName,
            String description,
            String subnetId,
            Boolean isHighlyAvailable,
            String availabilityDomain,
            String faultDomain,
            String shapeName,
            String mysqlVersion,
            String configurationId,
            String adminUsername,
            String adminPassword,
            Integer dataStorageSizeInGBs,
            DataStorageDetails dataStorage,
            String hostnameLabel,
            String ipAddress,
            Integer port,
            Integer portX,
            UpdateBackupPolicyDetails backupPolicy,
            UpdateMaintenanceDetails maintenance,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            UpdateDeletionPolicyDetails deletionPolicy,
            CrashRecoveryStatus crashRecovery,
            DatabaseManagementStatus databaseManagement,
            SecureConnectionDetails secureConnections) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.subnetId = subnetId;
        this.isHighlyAvailable = isHighlyAvailable;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.shapeName = shapeName;
        this.mysqlVersion = mysqlVersion;
        this.configurationId = configurationId;
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.dataStorage = dataStorage;
        this.hostnameLabel = hostnameLabel;
        this.ipAddress = ipAddress;
        this.port = port;
        this.portX = portX;
        this.backupPolicy = backupPolicy;
        this.maintenance = maintenance;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.deletionPolicy = deletionPolicy;
        this.crashRecovery = crashRecovery;
        this.databaseManagement = databaseManagement;
        this.secureConnections = secureConnections;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * Specifies if the DB System is highly available.
         *
         * <p>Set to true to enable high availability. Two secondary MySQL instances are created and
         * placed in the unused availability or fault domains, depending on your region and subnet
         * type. Set to false to disable high availability. The secondary MySQL instances are
         * removed and the MySQL instance in the preferred location is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
        private Boolean isHighlyAvailable;

        /**
         * Specifies if the DB System is highly available.
         *
         * <p>Set to true to enable high availability. Two secondary MySQL instances are created and
         * placed in the unused availability or fault domains, depending on your region and subnet
         * type. Set to false to disable high availability. The secondary MySQL instances are
         * removed and the MySQL instance in the preferred location is used.
         *
         * @param isHighlyAvailable the value to set
         * @return this builder
         */
        public Builder isHighlyAvailable(Boolean isHighlyAvailable) {
            this.isHighlyAvailable = isHighlyAvailable;
            this.__explicitlySet__.add("isHighlyAvailable");
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
         * The shape of the DB System. The shape determines resources allocated to the DB System -
         * CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare
         * metal) shapes. To get a list of shapes, use the {@link #listShapes(ListShapesRequest)
         * listShapes} operation.
         *
         * <p>Changes in Shape will result in a downtime as the MySQL DB System is migrated to the
         * new Compute instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape of the DB System. The shape determines resources allocated to the DB System -
         * CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare
         * metal) shapes. To get a list of shapes, use the {@link #listShapes(ListShapesRequest)
         * listShapes} operation.
         *
         * <p>Changes in Shape will result in a downtime as the MySQL DB System is migrated to the
         * new Compute instance.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /** The specific MySQL version identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        /**
         * The specific MySQL version identifier.
         *
         * @param mysqlVersion the value to set
         * @return this builder
         */
        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
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
        /** The username for the administrative user for the MySQL Instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
        private String adminUsername;

        /**
         * The username for the administrative user for the MySQL Instance.
         *
         * @param adminUsername the value to set
         * @return this builder
         */
        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            this.__explicitlySet__.add("adminUsername");
            return this;
        }
        /**
         * The password for the administrative user. The password must be between 8 and 32
         * characters long, and must contain at least 1 numeric character, 1 lowercase character, 1
         * uppercase character, and 1 special (nonalphanumeric) character.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * The password for the administrative user. The password must be between 8 and 32
         * characters long, and must contain at least 1 numeric character, 1 lowercase character, 1
         * uppercase character, and 1 special (nonalphanumeric) character.
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
         * Expands the DB System's storage to the specified value. Only supports values larger than
         * the current DB System's storage size.
         *
         * <p>DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
         * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
         * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
         * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
         *
         * <p>It is not possible to decrease data storage size.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * Expands the DB System's storage to the specified value. Only supports values larger than
         * the current DB System's storage size.
         *
         * <p>DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB.
         * DB Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB.
         * DB Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB.
         * DB Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
         *
         * <p>It is not possible to decrease data storage size.
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
        private DataStorageDetails dataStorage;

        public Builder dataStorage(DataStorageDetails dataStorage) {
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
         * The IP address the DB System should be configured to listen on the provided subnet. It
         * must be a free private IP address within the subnet's CIDR. If you don't specify a value,
         * Oracle automatically assigns a private IP address from the subnet. This should be a
         * "dotted-quad" style IPv4 address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address the DB System should be configured to listen on the provided subnet. It
         * must be a free private IP address within the subnet's CIDR. If you don't specify a value,
         * Oracle automatically assigns a private IP address from the subnet. This should be a
         * "dotted-quad" style IPv4 address.
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
         * The TCP network port on which X Plugin listens for connections. This is the X Plugin
         * equivalent of port.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("portX")
        private Integer portX;

        /**
         * The TCP network port on which X Plugin listens for connections. This is the X Plugin
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

        @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
        private UpdateBackupPolicyDetails backupPolicy;

        public Builder backupPolicy(UpdateBackupPolicyDetails backupPolicy) {
            this.backupPolicy = backupPolicy;
            this.__explicitlySet__.add("backupPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenance")
        private UpdateMaintenanceDetails maintenance;

        public Builder maintenance(UpdateMaintenanceDetails maintenance) {
            this.maintenance = maintenance;
            this.__explicitlySet__.add("maintenance");
            return this;
        }
        /**
         * Simple key-value pair applied without any predefined name, type or scope. Exists for
         * cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair applied without any predefined name, type or scope. Exists for
         * cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
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

        @com.fasterxml.jackson.annotation.JsonProperty("deletionPolicy")
        private UpdateDeletionPolicyDetails deletionPolicy;

        public Builder deletionPolicy(UpdateDeletionPolicyDetails deletionPolicy) {
            this.deletionPolicy = deletionPolicy;
            this.__explicitlySet__.add("deletionPolicy");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDbSystemDetails build() {
            UpdateDbSystemDetails model =
                    new UpdateDbSystemDetails(
                            this.displayName,
                            this.description,
                            this.subnetId,
                            this.isHighlyAvailable,
                            this.availabilityDomain,
                            this.faultDomain,
                            this.shapeName,
                            this.mysqlVersion,
                            this.configurationId,
                            this.adminUsername,
                            this.adminPassword,
                            this.dataStorageSizeInGBs,
                            this.dataStorage,
                            this.hostnameLabel,
                            this.ipAddress,
                            this.port,
                            this.portX,
                            this.backupPolicy,
                            this.maintenance,
                            this.freeformTags,
                            this.definedTags,
                            this.deletionPolicy,
                            this.crashRecovery,
                            this.databaseManagement,
                            this.secureConnections);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("isHighlyAvailable")) {
                this.isHighlyAvailable(model.getIsHighlyAvailable());
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
            if (model.wasPropertyExplicitlySet("configurationId")) {
                this.configurationId(model.getConfigurationId());
            }
            if (model.wasPropertyExplicitlySet("adminUsername")) {
                this.adminUsername(model.getAdminUsername());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
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
            if (model.wasPropertyExplicitlySet("backupPolicy")) {
                this.backupPolicy(model.getBackupPolicy());
            }
            if (model.wasPropertyExplicitlySet("maintenance")) {
                this.maintenance(model.getMaintenance());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("deletionPolicy")) {
                this.deletionPolicy(model.getDeletionPolicy());
            }
            if (model.wasPropertyExplicitlySet("crashRecovery")) {
                this.crashRecovery(model.getCrashRecovery());
            }
            if (model.wasPropertyExplicitlySet("databaseManagement")) {
                this.databaseManagement(model.getDatabaseManagement());
            }
            if (model.wasPropertyExplicitlySet("secureConnections")) {
                this.secureConnections(model.getSecureConnections());
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

    /**
     * Specifies if the DB System is highly available.
     *
     * <p>Set to true to enable high availability. Two secondary MySQL instances are created and
     * placed in the unused availability or fault domains, depending on your region and subnet type.
     * Set to false to disable high availability. The secondary MySQL instances are removed and the
     * MySQL instance in the preferred location is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
    private final Boolean isHighlyAvailable;

    /**
     * Specifies if the DB System is highly available.
     *
     * <p>Set to true to enable high availability. Two secondary MySQL instances are created and
     * placed in the unused availability or fault domains, depending on your region and subnet type.
     * Set to false to disable high availability. The secondary MySQL instances are removed and the
     * MySQL instance in the preferred location is used.
     *
     * @return the value
     */
    public Boolean getIsHighlyAvailable() {
        return isHighlyAvailable;
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
     * The shape of the DB System. The shape determines resources allocated to the DB System - CPU
     * cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal)
     * shapes. To get a list of shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
     * operation.
     *
     * <p>Changes in Shape will result in a downtime as the MySQL DB System is migrated to the new
     * Compute instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape of the DB System. The shape determines resources allocated to the DB System - CPU
     * cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal)
     * shapes. To get a list of shapes, use the {@link #listShapes(ListShapesRequest) listShapes}
     * operation.
     *
     * <p>Changes in Shape will result in a downtime as the MySQL DB System is migrated to the new
     * Compute instance.
     *
     * @return the value
     */
    public String getShapeName() {
        return shapeName;
    }

    /** The specific MySQL version identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    private final String mysqlVersion;

    /**
     * The specific MySQL version identifier.
     *
     * @return the value
     */
    public String getMysqlVersion() {
        return mysqlVersion;
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

    /** The username for the administrative user for the MySQL Instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
    private final String adminUsername;

    /**
     * The username for the administrative user for the MySQL Instance.
     *
     * @return the value
     */
    public String getAdminUsername() {
        return adminUsername;
    }

    /**
     * The password for the administrative user. The password must be between 8 and 32 characters
     * long, and must contain at least 1 numeric character, 1 lowercase character, 1 uppercase
     * character, and 1 special (nonalphanumeric) character.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * The password for the administrative user. The password must be between 8 and 32 characters
     * long, and must contain at least 1 numeric character, 1 lowercase character, 1 uppercase
     * character, and 1 special (nonalphanumeric) character.
     *
     * @return the value
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * Expands the DB System's storage to the specified value. Only supports values larger than the
     * current DB System's storage size.
     *
     * <p>DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB. DB
     * Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB. DB
     * Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB. DB
     * Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
     *
     * <p>It is not possible to decrease data storage size.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * Expands the DB System's storage to the specified value. Only supports values larger than the
     * current DB System's storage size.
     *
     * <p>DB Systems with an initial storage size of 400 GB or less can be expanded up to 32 TB. DB
     * Systems with an initial storage size between 401-800 GB can be expanded up to 64 TB. DB
     * Systems with an initial storage size between 801-1200 GB can be expanded up to 96 TB. DB
     * Systems with an initial storage size of 1201 GB or more can be expanded up to 128 TB.
     *
     * <p>It is not possible to decrease data storage size.
     *
     * @return the value
     */
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataStorage")
    private final DataStorageDetails dataStorage;

    public DataStorageDetails getDataStorage() {
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
     * The IP address the DB System should be configured to listen on the provided subnet. It must
     * be a free private IP address within the subnet's CIDR. If you don't specify a value, Oracle
     * automatically assigns a private IP address from the subnet. This should be a "dotted-quad"
     * style IPv4 address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address the DB System should be configured to listen on the provided subnet. It must
     * be a free private IP address within the subnet's CIDR. If you don't specify a value, Oracle
     * automatically assigns a private IP address from the subnet. This should be a "dotted-quad"
     * style IPv4 address.
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
     * The TCP network port on which X Plugin listens for connections. This is the X Plugin
     * equivalent of port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portX")
    private final Integer portX;

    /**
     * The TCP network port on which X Plugin listens for connections. This is the X Plugin
     * equivalent of port.
     *
     * @return the value
     */
    public Integer getPortX() {
        return portX;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
    private final UpdateBackupPolicyDetails backupPolicy;

    public UpdateBackupPolicyDetails getBackupPolicy() {
        return backupPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenance")
    private final UpdateMaintenanceDetails maintenance;

    public UpdateMaintenanceDetails getMaintenance() {
        return maintenance;
    }

    /**
     * Simple key-value pair applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deletionPolicy")
    private final UpdateDeletionPolicyDetails deletionPolicy;

    public UpdateDeletionPolicyDetails getDeletionPolicy() {
        return deletionPolicy;
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
        sb.append("UpdateDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", isHighlyAvailable=").append(String.valueOf(this.isHighlyAvailable));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", mysqlVersion=").append(String.valueOf(this.mysqlVersion));
        sb.append(", configurationId=").append(String.valueOf(this.configurationId));
        sb.append(", adminUsername=").append(String.valueOf(this.adminUsername));
        sb.append(", adminPassword=").append("<redacted>");
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", dataStorage=").append(String.valueOf(this.dataStorage));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", portX=").append(String.valueOf(this.portX));
        sb.append(", backupPolicy=").append(String.valueOf(this.backupPolicy));
        sb.append(", maintenance=").append(String.valueOf(this.maintenance));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", deletionPolicy=").append(String.valueOf(this.deletionPolicy));
        sb.append(", crashRecovery=").append(String.valueOf(this.crashRecovery));
        sb.append(", databaseManagement=").append(String.valueOf(this.databaseManagement));
        sb.append(", secureConnections=").append(String.valueOf(this.secureConnections));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDbSystemDetails)) {
            return false;
        }

        UpdateDbSystemDetails other = (UpdateDbSystemDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.isHighlyAvailable, other.isHighlyAvailable)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.mysqlVersion, other.mysqlVersion)
                && java.util.Objects.equals(this.configurationId, other.configurationId)
                && java.util.Objects.equals(this.adminUsername, other.adminUsername)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorage, other.dataStorage)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.portX, other.portX)
                && java.util.Objects.equals(this.backupPolicy, other.backupPolicy)
                && java.util.Objects.equals(this.maintenance, other.maintenance)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.deletionPolicy, other.deletionPolicy)
                && java.util.Objects.equals(this.crashRecovery, other.crashRecovery)
                && java.util.Objects.equals(this.databaseManagement, other.databaseManagement)
                && java.util.Objects.equals(this.secureConnections, other.secureConnections)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.isHighlyAvailable == null ? 43 : this.isHighlyAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.mysqlVersion == null ? 43 : this.mysqlVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationId == null ? 43 : this.configurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.adminUsername == null ? 43 : this.adminUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
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
        result = (result * PRIME) + (this.backupPolicy == null ? 43 : this.backupPolicy.hashCode());
        result = (result * PRIME) + (this.maintenance == null ? 43 : this.maintenance.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.deletionPolicy == null ? 43 : this.deletionPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.crashRecovery == null ? 43 : this.crashRecovery.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseManagement == null
                                ? 43
                                : this.databaseManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.secureConnections == null ? 43 : this.secureConnections.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
