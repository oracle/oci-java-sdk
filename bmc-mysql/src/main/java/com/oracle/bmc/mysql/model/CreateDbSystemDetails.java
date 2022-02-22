/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Details required to create a DB System.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDbSystemDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateDbSystemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
        private Boolean isHighlyAvailable;

        public Builder isHighlyAvailable(Boolean isHighlyAvailable) {
            this.isHighlyAvailable = isHighlyAvailable;
            this.__explicitlySet__.add("isHighlyAvailable");
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

        @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
        private String configurationId;

        public Builder configurationId(String configurationId) {
            this.configurationId = configurationId;
            this.__explicitlySet__.add("configurationId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
        private String adminUsername;

        public Builder adminUsername(String adminUsername) {
            this.adminUsername = adminUsername;
            this.__explicitlySet__.add("adminUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
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

        @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
        private CreateBackupPolicyDetails backupPolicy;

        public Builder backupPolicy(CreateBackupPolicyDetails backupPolicy) {
            this.backupPolicy = backupPolicy;
            this.__explicitlySet__.add("backupPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private CreateDbSystemSourceDetails source;

        public Builder source(CreateDbSystemSourceDetails source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenance")
        private CreateMaintenanceDetails maintenance;

        public Builder maintenance(CreateMaintenanceDetails maintenance) {
            this.maintenance = maintenance;
            this.__explicitlySet__.add("maintenance");
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

        public CreateDbSystemDetails build() {
            CreateDbSystemDetails __instance__ =
                    new CreateDbSystemDetails(
                            displayName,
                            description,
                            compartmentId,
                            isHighlyAvailable,
                            availabilityDomain,
                            faultDomain,
                            configurationId,
                            shapeName,
                            mysqlVersion,
                            subnetId,
                            adminUsername,
                            adminPassword,
                            dataStorageSizeInGBs,
                            hostnameLabel,
                            ipAddress,
                            port,
                            portX,
                            backupPolicy,
                            source,
                            maintenance,
                            freeformTags,
                            definedTags,
                            crashRecovery);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDbSystemDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .isHighlyAvailable(o.getIsHighlyAvailable())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .faultDomain(o.getFaultDomain())
                            .configurationId(o.getConfigurationId())
                            .shapeName(o.getShapeName())
                            .mysqlVersion(o.getMysqlVersion())
                            .subnetId(o.getSubnetId())
                            .adminUsername(o.getAdminUsername())
                            .adminPassword(o.getAdminPassword())
                            .dataStorageSizeInGBs(o.getDataStorageSizeInGBs())
                            .hostnameLabel(o.getHostnameLabel())
                            .ipAddress(o.getIpAddress())
                            .port(o.getPort())
                            .portX(o.getPortX())
                            .backupPolicy(o.getBackupPolicy())
                            .source(o.getSource())
                            .maintenance(o.getMaintenance())
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
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Specifies if the DB System is highly available.
     * <p>
     * When creating a DB System with High Availability, three instances
     * are created and placed according to your region- and
     * subnet-type. The secondaries are placed automatically in the other
     * two availability or fault domains.  You can choose the preferred
     * location of your primary instance, only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
    Boolean isHighlyAvailable;

    /**
     * The availability domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
     * <p>
     * In a failover scenario, the Read/Write endpoint is redirected to one of the other availability domains
     * and the MySQL instance in that domain is promoted to the primary instance.
     * This redirection does not affect the IP address of the DB System in any way.
     * <p>
     * For a standalone DB System, this defines the availability domain in which the DB System is placed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The fault domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
     * <p>
     * In a failover scenario, the Read/Write endpoint is redirected to one of the other fault domains
     * and the MySQL instance in that domain is promoted to the primary instance.
     * This redirection does not affect the IP address of the DB System in any way.
     * <p>
     * For a standalone DB System, this defines the fault domain in which the DB System is placed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    String faultDomain;

    /**
     * The OCID of the Configuration to be used for this DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
    String configurationId;

    /**
     * The name of the shape. The shape determines the resources allocated
     * - CPU cores and memory for VM shapes; CPU cores, memory and storage
     * for non-VM (or bare metal) shapes. To get a list of shapes, use the
     * {@link #listShapes(ListShapesRequest) listShapes} operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    String shapeName;

    /**
     * The specific MySQL version identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    String mysqlVersion;

    /**
     * The OCID of the subnet the DB System is associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * The username for the administrative user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminUsername")
    String adminUsername;

    /**
     * The password for the administrative user. The password must be
     * between 8 and 32 characters long, and must contain at least 1
     * numeric character, 1 lowercase character, 1 uppercase character, and
     * 1 special (nonalphanumeric) character.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    String adminPassword;

    /**
     * Initial size of the data volume in GBs that will be created and attached.
     * Keep in mind that this only specifies the size of the database data volume,
     * the log volume for the database will be scaled appropriately with its shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    Integer dataStorageSizeInGBs;

    /**
     * The hostname for the primary endpoint of the DB System. Used for DNS.
     * <p>
     * The value is the hostname portion of the primary private IP's fully qualified domain name (FQDN)
     * (for example, "dbsystem-1" in FQDN "dbsystem-1.subnet123.vcn1.oraclevcn.com").
     * <p>
     * Must be unique across all VNICs in the subnet and comply with RFC 952 and RFC 1123.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    String hostnameLabel;

    /**
     * The IP address the DB System is configured to listen on.
     * A private IP address of your choice to assign to the primary endpoint of the DB System.
     * Must be an available IP address within the subnet's CIDR. If you don't specify a value,
     * Oracle automatically assigns a private IP address from the subnet. This should be a
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
     * The TCP network port on which X Plugin listens for connections. This is the X Plugin equivalent of port.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portX")
    Integer portX;

    @com.fasterxml.jackson.annotation.JsonProperty("backupPolicy")
    CreateBackupPolicyDetails backupPolicy;

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    CreateDbSystemSourceDetails source;

    @com.fasterxml.jackson.annotation.JsonProperty("maintenance")
    CreateMaintenanceDetails maintenance;

    /**
     * Simple key-value pair applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
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
