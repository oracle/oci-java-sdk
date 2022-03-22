/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Snapshot of the DbSystem details at the time of the backup
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystemSnapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DbSystemSnapshot {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
        private String adminUsername;

        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            this.__explicitlySet__.add("adminUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
        private BackupPolicy backupPolicy;

        public Builder backupPolicy(BackupPolicy backupPolicy) {
            this.backupPolicy = backupPolicy;
            this.__explicitlySet__.add("backupPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
        private String configurationId;

        public Builder configurationId(String configurationId) {
            this.configurationId = configurationId;
            this.__explicitlySet__.add("configurationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("portX")
        private Integer portX;

        public Builder portX(Integer portX) {
            this.portX = portX;
            this.__explicitlySet__.add("portX");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
        private Boolean isHighlyAvailable;

        public Builder isHighlyAvailable(Boolean isHighlyAvailable) {
            this.isHighlyAvailable = isHighlyAvailable;
            this.__explicitlySet__.add("isHighlyAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private java.util.List<DbSystemEndpoint> endpoints;

        public Builder endpoints(java.util.List<DbSystemEndpoint> endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("crashRecovery")
        private CrashRecoveryStatus crashRecovery;

        public Builder crashRecovery(CrashRecoveryStatus crashRecovery) {
            this.crashRecovery = crashRecovery;
            this.__explicitlySet__.add("crashRecovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemSnapshot build() {
            DbSystemSnapshot __instance__ =
                    new DbSystemSnapshot(
                            id,
                            displayName,
                            description,
                            compartmentId,
                            subnetId,
                            availabilityDomain,
                            faultDomain,
                            shapeName,
                            mysqlVersion,
                            adminUsername,
                            backupPolicy,
                            configurationId,
                            dataStorageSizeInGBs,
                            hostnameLabel,
                            ipAddress,
                            port,
                            portX,
                            isHighlyAvailable,
                            endpoints,
                            maintenance,
                            deletionPolicy,
                            freeformTags,
                            definedTags,
                            crashRecovery);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemSnapshot o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .subnetId(o.getSubnetId())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .faultDomain(o.getFaultDomain())
                            .shapeName(o.getShapeName())
                            .mysqlVersion(o.getMysqlVersion())
                            .adminUsername(o.getAdminUsername())
                            .backupPolicy(o.getBackupPolicy())
                            .configurationId(o.getConfigurationId())
                            .dataStorageSizeInGBs(o.getDataStorageSizeInGBs())
                            .hostnameLabel(o.getHostnameLabel())
                            .ipAddress(o.getIpAddress())
                            .port(o.getPort())
                            .portX(o.getPortX())
                            .isHighlyAvailable(o.getIsHighlyAvailable())
                            .endpoints(o.getEndpoints())
                            .maintenance(o.getMaintenance())
                            .deletionPolicy(o.getDeletionPolicy())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .crashRecovery(o.getCrashRecovery());

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

    /**
     * The OCID of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The user-friendly name for the DB System. It does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * User-provided data about the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The OCID of the compartment the DB System belongs in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the subnet the DB System is associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * The Availability Domain where the primary DB System should be located.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The name of the Fault Domain the DB System is located in.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    String faultDomain;

    /**
     * The shape of the primary instances of the DB System. The shape
     * determines resources allocated to a DB System - CPU cores
     * and memory for VM shapes; CPU cores, memory and storage for non-VM
     * (or bare metal) shapes. To get a list of shapes, use (the
     * {@link #listShapes(ListShapesRequest) listShapes} operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    String shapeName;

    /**
     * Name of the MySQL Version in use for the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    String mysqlVersion;

    /**
     * The username for the administrative user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
    String adminUsername;

    @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
    BackupPolicy backupPolicy;

    /**
     * The OCID of the Configuration to be used for Instances in this DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
    String configurationId;

    /**
     * Initial size of the data volume in GiBs that will be created and attached.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    Integer dataStorageSizeInGBs;

    /**
     * The hostname for the primary endpoint of the DB System. Used for DNS.
     * The value is the hostname portion of the primary private IP's fully qualified domain name (FQDN)
     * (for example, "dbsystem-1" in FQDN "dbsystem-1.subnet123.vcn1.oraclevcn.com").
     * Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    String hostnameLabel;

    /**
     * The IP address the DB System is configured to listen on. A private
     * IP address of the primary endpoint of the DB System. Must be an
     * available IP address within the subnet's CIDR. This will be a
     * "dotted-quad" style IPv4 address.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    String ipAddress;

    /**
     * The port for primary endpoint of the DB System to listen on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin equivalent of port.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portX")
    Integer portX;

    /**
     * If the policy is to enable high availability of the instance, by
     * maintaining secondary/failover capacity as necessary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
    Boolean isHighlyAvailable;

    /**
     * The network endpoints available for this DB System.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    java.util.List<DbSystemEndpoint> endpoints;

    @com.fasterxml.jackson.annotation.JsonProperty("maintenance")
    MaintenanceDetails maintenance;

    @com.fasterxml.jackson.annotation.JsonProperty("deletionPolicy")
    DeletionPolicyDetails deletionPolicy;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or disabled,
     * and whether to enable or disable syncing of the Binary Logs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crashRecovery")
    CrashRecoveryStatus crashRecovery;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
