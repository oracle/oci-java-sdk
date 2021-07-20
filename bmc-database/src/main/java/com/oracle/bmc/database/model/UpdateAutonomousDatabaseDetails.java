/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to update an Oracle Autonomous Database.
 * <p>
 **Notes**
 * - To specify OCPU core count, you must use either `ocpuCount` or `cpuCoreCount`. You cannot use both parameters at the same time.
 * - To specify a storage allocation, you must use  either `dataStorageSizeInGBs` or `dataStorageSizeInTBs`.
 * - See the individual parameter discriptions for more information on the OCPU and storage value parameters.
 * **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateAutonomousDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateAutonomousDatabaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        public Builder ocpuCount(Float ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Integer dataStorageSizeInTBs;

        public Builder dataStorageSizeInTBs(Integer dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
        private Boolean isFreeTier;

        public Builder isFreeTier(Boolean isFreeTier) {
            this.isFreeTier = isFreeTier;
            this.__explicitlySet__.add("isFreeTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlEnabled")
        private Boolean isAccessControlEnabled;

        public Builder isAccessControlEnabled(Boolean isAccessControlEnabled) {
            this.isAccessControlEnabled = isAccessControlEnabled;
            this.__explicitlySet__.add("isAccessControlEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
        private java.util.List<String> whitelistedIps;

        public Builder whitelistedIps(java.util.List<String> whitelistedIps) {
            this.whitelistedIps = whitelistedIps;
            this.__explicitlySet__.add("whitelistedIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
        private Boolean arePrimaryWhitelistedIpsUsed;

        public Builder arePrimaryWhitelistedIpsUsed(Boolean arePrimaryWhitelistedIpsUsed) {
            this.arePrimaryWhitelistedIpsUsed = arePrimaryWhitelistedIpsUsed;
            this.__explicitlySet__.add("arePrimaryWhitelistedIpsUsed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
        private java.util.List<String> standbyWhitelistedIps;

        public Builder standbyWhitelistedIps(java.util.List<String> standbyWhitelistedIps) {
            this.standbyWhitelistedIps = standbyWhitelistedIps;
            this.__explicitlySet__.add("standbyWhitelistedIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
        private Boolean isRefreshableClone;

        public Builder isRefreshableClone(Boolean isRefreshableClone) {
            this.isRefreshableClone = isRefreshableClone;
            this.__explicitlySet__.add("isRefreshableClone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refreshableMode")
        private RefreshableMode refreshableMode;

        public Builder refreshableMode(RefreshableMode refreshableMode) {
            this.refreshableMode = refreshableMode;
            this.__explicitlySet__.add("refreshableMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
        private Boolean isDataGuardEnabled;

        public Builder isDataGuardEnabled(Boolean isDataGuardEnabled) {
            this.isDataGuardEnabled = isDataGuardEnabled;
            this.__explicitlySet__.add("isDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private OpenMode openMode;

        public Builder openMode(OpenMode openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("permissionLevel")
        private PermissionLevel permissionLevel;

        public Builder permissionLevel(PermissionLevel permissionLevel) {
            this.permissionLevel = permissionLevel;
            this.__explicitlySet__.add("permissionLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
        private String privateEndpointLabel;

        public Builder privateEndpointLabel(String privateEndpointLabel) {
            this.privateEndpointLabel = privateEndpointLabel;
            this.__explicitlySet__.add("privateEndpointLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAutonomousDatabaseDetails build() {
            UpdateAutonomousDatabaseDetails __instance__ =
                    new UpdateAutonomousDatabaseDetails(
                            cpuCoreCount,
                            ocpuCount,
                            dataStorageSizeInTBs,
                            dataStorageSizeInGBs,
                            displayName,
                            isFreeTier,
                            adminPassword,
                            dbName,
                            freeformTags,
                            definedTags,
                            dbWorkload,
                            licenseModel,
                            isAccessControlEnabled,
                            whitelistedIps,
                            arePrimaryWhitelistedIpsUsed,
                            standbyWhitelistedIps,
                            isAutoScalingEnabled,
                            isRefreshableClone,
                            refreshableMode,
                            isDataGuardEnabled,
                            dbVersion,
                            openMode,
                            permissionLevel,
                            subnetId,
                            privateEndpointLabel,
                            nsgIds,
                            customerContacts);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAutonomousDatabaseDetails o) {
            Builder copiedBuilder =
                    cpuCoreCount(o.getCpuCoreCount())
                            .ocpuCount(o.getOcpuCount())
                            .dataStorageSizeInTBs(o.getDataStorageSizeInTBs())
                            .dataStorageSizeInGBs(o.getDataStorageSizeInGBs())
                            .displayName(o.getDisplayName())
                            .isFreeTier(o.getIsFreeTier())
                            .adminPassword(o.getAdminPassword())
                            .dbName(o.getDbName())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .dbWorkload(o.getDbWorkload())
                            .licenseModel(o.getLicenseModel())
                            .isAccessControlEnabled(o.getIsAccessControlEnabled())
                            .whitelistedIps(o.getWhitelistedIps())
                            .arePrimaryWhitelistedIpsUsed(o.getArePrimaryWhitelistedIpsUsed())
                            .standbyWhitelistedIps(o.getStandbyWhitelistedIps())
                            .isAutoScalingEnabled(o.getIsAutoScalingEnabled())
                            .isRefreshableClone(o.getIsRefreshableClone())
                            .refreshableMode(o.getRefreshableMode())
                            .isDataGuardEnabled(o.getIsDataGuardEnabled())
                            .dbVersion(o.getDbVersion())
                            .openMode(o.getOpenMode())
                            .permissionLevel(o.getPermissionLevel())
                            .subnetId(o.getSubnetId())
                            .privateEndpointLabel(o.getPrivateEndpointLabel())
                            .nsgIds(o.getNsgIds())
                            .customerContacts(o.getCustomerContacts());

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
     * The number of OCPU cores to be made available to the Autonomous Database.
     * <p>
     **Note:** This parameter cannot be used with the `ocpuCount` parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    Integer cpuCoreCount;

    /**
     * The number of OCPU cores to be made available to the Autonomous Database. To provision less than 1 core, enter a fractional value in an increment of 0.1. To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available to the infrastructure shape. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. Likewise, you can provision 2 cores or 3 cores, but not 2.5 cores. The maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the `cpuCoreCount` parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    Float ocpuCount;

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the `dataStorageSizeInGBs` parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    Integer dataStorageSizeInTBs;

    /**
     * Applies to dedicated Exadata infrastructure only.
     * <p>
     * The size, in gigabytes, of the data volume that will be created and attached to the database. The maximum storage value depends on the system shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the `dataStorageSizeInTBs` parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    Integer dataStorageSizeInGBs;

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique. The display name can only be updated for Autonomous Databases
     * using dedicated Exadata infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
    Boolean isFreeTier;

    /**
     * The password must be between 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (\") or the username \"admin\", regardless of casing. It must be different from the last four passwords and it must not be a password used within the last 24 hours.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    String adminPassword;

    /**
     * New name for this Autonomous Database.
     * For databases using dedicated Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of eight alphanumeric characters. Special characters are not permitted.
     * For databases using shared Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of 14 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    String dbName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;
    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     **/
    public enum DbWorkload {
        Oltp("OLTP"),
        Dw("DW"),
        Ajd("AJD"),
        Apex("APEX"),
        ;

        private final String value;
        private static java.util.Map<String, DbWorkload> map;

        static {
            map = new java.util.HashMap<>();
            for (DbWorkload v : DbWorkload.values()) {
                map.put(v.getValue(), v);
            }
        }

        DbWorkload(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbWorkload create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DbWorkload: " + key);
        }
    };
    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    DbWorkload dbWorkload;
    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adbddoverview.htm), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI), if a value is not specified, the system will supply the value of `BRING_YOUR_OWN_LICENSE`.
     *
     **/
    public enum LicenseModel {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),
        ;

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LicenseModel: " + key);
        }
    };
    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adbddoverview.htm), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI), if a value is not specified, the system will supply the value of `BRING_YOUR_OWN_LICENSE`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    LicenseModel licenseModel;

    /**
     * Indicates if the database-level access control is enabled.
     * If disabled, database access is defined by the network security rules.
     * If enabled, database access is restricted to the IP addresses defined by the rules specified with the `whitelistedIps` property. While specifying `whitelistedIps` rules is optional,
     *  if database-level access control is enabled and no rules are specified, the database will become inaccessible. The rules can be added later using the `UpdateAutonomousDatabase` API operation or edit option in console.
     * When creating a database clone, the desired access control setting should be specified. By default, database-level access control will be disabled for the clone.
     * <p>
     * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlEnabled")
    Boolean isAccessControlEnabled;

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: `[\"1.1.1.1\",\"1.1.1.0/24\",\"ocid1.vcn.oc1.sea.<unique_id>\",\"ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1\",\"ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16\"]`
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: `[\"1.1.1.1\",\"1.1.1.0/24\",\"1.1.2.25\"]`
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
    java.util.List<String> whitelistedIps;

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
     * It's value would be `TRUE` if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses primary IP access control list (ACL) for standby.
     * It's value would be `FALSE` if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses different IP access control list (ACL) for standby compared to primary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
    Boolean arePrimaryWhitelistedIpsUsed;

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: `[\"1.1.1.1\",\"1.1.1.0/24\",\"ocid1.vcn.oc1.sea.<unique_id>\",\"ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1\",\"ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16\"]`
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: `[\"1.1.1.1\",\"1.1.1.0/24\",\"1.1.2.25\"]`
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
    java.util.List<String> standbyWhitelistedIps;

    /**
     * Indicates whether to enable or disable auto scaling for the Autonomous Database OCPU core count. Setting to `true` enables auto scaling. Setting to `false` disables auto scaling. The default value is true. Auto scaling is available for databases on [shared Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adboverview.htm#AEI) only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    Boolean isAutoScalingEnabled;

    /**
     * Indicates whether the Autonomous Database is a refreshable clone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
    Boolean isRefreshableClone;
    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
     **/
    public enum RefreshableMode {
        Automatic("AUTOMATIC"),
        Manual("MANUAL"),
        ;

        private final String value;
        private static java.util.Map<String, RefreshableMode> map;

        static {
            map = new java.util.HashMap<>();
            for (RefreshableMode v : RefreshableMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        RefreshableMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RefreshableMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RefreshableMode: " + key);
        }
    };
    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refreshableMode")
    RefreshableMode refreshableMode;

    /**
     * Indicates whether the Autonomous Database has Data Guard enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
    Boolean isDataGuardEnabled;

    /**
     * A valid Oracle Database version for Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    String dbVersion;
    /**
     * The `DATABASE OPEN` mode. You can open the database in `READ_ONLY` or `READ_WRITE` mode.
     **/
    public enum OpenMode {
        ReadOnly("READ_ONLY"),
        ReadWrite("READ_WRITE"),
        ;

        private final String value;
        private static java.util.Map<String, OpenMode> map;

        static {
            map = new java.util.HashMap<>();
            for (OpenMode v : OpenMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        OpenMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OpenMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OpenMode: " + key);
        }
    };
    /**
     * The `DATABASE OPEN` mode. You can open the database in `READ_ONLY` or `READ_WRITE` mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    OpenMode openMode;
    /**
     * The Autonomous Database permission level. Restricted mode allows access only to admin users.
     **/
    public enum PermissionLevel {
        Restricted("RESTRICTED"),
        Unrestricted("UNRESTRICTED"),
        ;

        private final String value;
        private static java.util.Map<String, PermissionLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (PermissionLevel v : PermissionLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        PermissionLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PermissionLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PermissionLevel: " + key);
        }
    };
    /**
     * The Autonomous Database permission level. Restricted mode allows access only to admin users.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("permissionLevel")
    PermissionLevel permissionLevel;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet the resource is associated with.
     * <p>
     **Subnet Restrictions:**
     * - For bare metal DB systems and for single node virtual machine DB systems, do not use a subnet that overlaps with 192.168.16.16/28.
     * - For Exadata and virtual machine 2-node RAC systems, do not use a subnet that overlaps with 192.168.128.0/20.
     * - For Autonomous Database, setting this will disable public secure access to the database.
     * <p>
     * These subnets are used by the Oracle Clusterware private interconnect on the database instance.
     * Specifying an overlapping subnet will cause the private interconnect to malfunction.
     * This restriction applies to both the client subnet and the backup subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * The private endpoint label for the resource. Setting this to an empty string, after the private endpoint database gets created, will change the same private endpoint database to the public endpoint database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
    String privateEndpointLabel;

    /**
     * A list of the [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) that this resource belongs to. Setting this to an empty array after the list is created removes the resource from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - Autonomous Databases with private access require at least 1 Network Security Group (NSG). The nsgIds array cannot be empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    java.util.List<String> nsgIds;

    /**
     * Customer Contacts. Setting this to an empty list removes all customer contacts of an Oracle Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    java.util.List<CustomerContact> customerContacts;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
