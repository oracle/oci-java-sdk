/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to update an Oracle Autonomous Database.
 * <p>
 **Notes**
 * - To specify OCPU core count, you must use either {@code ocpuCount} or {@code cpuCoreCount}. You cannot use both parameters at the same time.
 * - To specify a storage allocation, you must use  either {@code dataStorageSizeInGBs} or {@code dataStorageSizeInTBs}.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateAutonomousDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAutonomousDatabaseDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cpuCoreCount",
        "computeCount",
        "ocpuCount",
        "dataStorageSizeInTBs",
        "dataStorageSizeInGBs",
        "displayName",
        "isFreeTier",
        "adminPassword",
        "dbName",
        "freeformTags",
        "definedTags",
        "dbWorkload",
        "licenseModel",
        "isAccessControlEnabled",
        "whitelistedIps",
        "arePrimaryWhitelistedIpsUsed",
        "standbyWhitelistedIps",
        "isAutoScalingEnabled",
        "isRefreshableClone",
        "refreshableMode",
        "isLocalDataGuardEnabled",
        "isDataGuardEnabled",
        "peerDbId",
        "dbVersion",
        "openMode",
        "permissionLevel",
        "subnetId",
        "privateEndpointLabel",
        "privateEndpointIp",
        "nsgIds",
        "customerContacts",
        "isMtlsConnectionRequired",
        "scheduledOperations",
        "isAutoScalingForStorageEnabled",
        "maxCpuCoreCount",
        "databaseEdition",
        "dbToolsDetails",
        "secretId",
        "secretVersionNumber"
    })
    public UpdateAutonomousDatabaseDetails(
            Integer cpuCoreCount,
            Float computeCount,
            Float ocpuCount,
            Integer dataStorageSizeInTBs,
            Integer dataStorageSizeInGBs,
            String displayName,
            Boolean isFreeTier,
            String adminPassword,
            String dbName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            DbWorkload dbWorkload,
            LicenseModel licenseModel,
            Boolean isAccessControlEnabled,
            java.util.List<String> whitelistedIps,
            Boolean arePrimaryWhitelistedIpsUsed,
            java.util.List<String> standbyWhitelistedIps,
            Boolean isAutoScalingEnabled,
            Boolean isRefreshableClone,
            RefreshableMode refreshableMode,
            Boolean isLocalDataGuardEnabled,
            Boolean isDataGuardEnabled,
            String peerDbId,
            String dbVersion,
            OpenMode openMode,
            PermissionLevel permissionLevel,
            String subnetId,
            String privateEndpointLabel,
            String privateEndpointIp,
            java.util.List<String> nsgIds,
            java.util.List<CustomerContact> customerContacts,
            Boolean isMtlsConnectionRequired,
            java.util.List<ScheduledOperationDetails> scheduledOperations,
            Boolean isAutoScalingForStorageEnabled,
            Integer maxCpuCoreCount,
            AutonomousDatabaseSummary.DatabaseEdition databaseEdition,
            java.util.List<DatabaseTool> dbToolsDetails,
            String secretId,
            Integer secretVersionNumber) {
        super();
        this.cpuCoreCount = cpuCoreCount;
        this.computeCount = computeCount;
        this.ocpuCount = ocpuCount;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.displayName = displayName;
        this.isFreeTier = isFreeTier;
        this.adminPassword = adminPassword;
        this.dbName = dbName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.dbWorkload = dbWorkload;
        this.licenseModel = licenseModel;
        this.isAccessControlEnabled = isAccessControlEnabled;
        this.whitelistedIps = whitelistedIps;
        this.arePrimaryWhitelistedIpsUsed = arePrimaryWhitelistedIpsUsed;
        this.standbyWhitelistedIps = standbyWhitelistedIps;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.isRefreshableClone = isRefreshableClone;
        this.refreshableMode = refreshableMode;
        this.isLocalDataGuardEnabled = isLocalDataGuardEnabled;
        this.isDataGuardEnabled = isDataGuardEnabled;
        this.peerDbId = peerDbId;
        this.dbVersion = dbVersion;
        this.openMode = openMode;
        this.permissionLevel = permissionLevel;
        this.subnetId = subnetId;
        this.privateEndpointLabel = privateEndpointLabel;
        this.privateEndpointIp = privateEndpointIp;
        this.nsgIds = nsgIds;
        this.customerContacts = customerContacts;
        this.isMtlsConnectionRequired = isMtlsConnectionRequired;
        this.scheduledOperations = scheduledOperations;
        this.isAutoScalingForStorageEnabled = isAutoScalingForStorageEnabled;
        this.maxCpuCoreCount = maxCpuCoreCount;
        this.databaseEdition = databaseEdition;
        this.dbToolsDetails = dbToolsDetails;
        this.secretId = secretId;
        this.secretVersionNumber = secretVersionNumber;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of CPUs to be made available to the Autonomous Database.
         * <p>
         **Note:** This parameter cannot be used with the {@code ocpuCount} or {@code computeCount} parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPUs to be made available to the Autonomous Database.
         * <p>
         **Note:** This parameter cannot be used with the {@code ocpuCount} or {@code computeCount} parameter.
         *
         * @param cpuCoreCount the value to set
         * @return this builder
         **/
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The compute amount available to the database. Minimum and maximum values depend on the compute model and whether the database is on Shared or Dedicated infrastructure. For an Autonomous Database on Shared infrastructure, the 'ECPU' compute model requires values in multiples of two. Required when using the {@code computeModel} parameter. When using {@code cpuCoreCount} parameter, it is an error to specify computeCount to a non-null value.@endif
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
        private Float computeCount;

        /**
         * The compute amount available to the database. Minimum and maximum values depend on the compute model and whether the database is on Shared or Dedicated infrastructure. For an Autonomous Database on Shared infrastructure, the 'ECPU' compute model requires values in multiples of two. Required when using the {@code computeModel} parameter. When using {@code cpuCoreCount} parameter, it is an error to specify computeCount to a non-null value.@endif
         * @param computeCount the value to set
         * @return this builder
         **/
        public Builder computeCount(Float computeCount) {
            this.computeCount = computeCount;
            this.__explicitlySet__.add("computeCount");
            return this;
        }
        /**
         * The number of OCPU cores to be made available to the Autonomous Database.
         * <p>
         * For databases on dedicated Exadata infrastructure, you can specify a fractional value for this parameter. Fractional values are not supported for Autonomous Database on shared Exadata infrastructure.
         * <p>
         * To provision less than 1 core, enter a fractional value in an increment of 0.1. To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available to the infrastructure shape. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. Likewise, you can provision 2 cores or 3 cores, but not 2.5 cores. The maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
         * <p>
         **Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Float ocpuCount;

        /**
         * The number of OCPU cores to be made available to the Autonomous Database.
         * <p>
         * For databases on dedicated Exadata infrastructure, you can specify a fractional value for this parameter. Fractional values are not supported for Autonomous Database on shared Exadata infrastructure.
         * <p>
         * To provision less than 1 core, enter a fractional value in an increment of 0.1. To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available to the infrastructure shape. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. Likewise, you can provision 2 cores or 3 cores, but not 2.5 cores. The maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
         * <p>
         **Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
         *
         * @param ocpuCount the value to set
         * @return this builder
         **/
        public Builder ocpuCount(Float ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }
        /**
         * The size, in terabytes, of the data volume that will be created and attached to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
         * <p>
         **Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Integer dataStorageSizeInTBs;

        /**
         * The size, in terabytes, of the data volume that will be created and attached to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
         * <p>
         **Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
         *
         * @param dataStorageSizeInTBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInTBs(Integer dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }
        /**
         * Applies to dedicated Exadata infrastructure only.
         * <p>
         * The size, in gigabytes, of the data volume that will be created and attached to the database. The maximum storage value depends on the system shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
         * <p>
         **Note:** This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * Applies to dedicated Exadata infrastructure only.
         * <p>
         * The size, in gigabytes, of the data volume that will be created and attached to the database. The maximum storage value depends on the system shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
         * <p>
         **Note:** This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * The user-friendly name for the Autonomous Database. The name does not have to be unique. The display name can only be updated for Autonomous Databases
         * using dedicated Exadata infrastructure.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Autonomous Database. The name does not have to be unique. The display name can only be updated for Autonomous Databases
         * using dedicated Exadata infrastructure.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
        private Boolean isFreeTier;

        /**
         * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
         *
         * @param isFreeTier the value to set
         * @return this builder
         **/
        public Builder isFreeTier(Boolean isFreeTier) {
            this.isFreeTier = isFreeTier;
            this.__explicitlySet__.add("isFreeTier");
            return this;
        }
        /**
         * The password must be between 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing. It must be different from the last four passwords and it must not be a password used within the last 24 hours.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private String adminPassword;

        /**
         * The password must be between 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing. It must be different from the last four passwords and it must not be a password used within the last 24 hours.
         * @param adminPassword the value to set
         * @return this builder
         **/
        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }
        /**
         * New name for this Autonomous Database.
         * For databases using dedicated Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of eight alphanumeric characters. Special characters are not permitted.
         * For databases using shared Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of 14 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * New name for this Autonomous Database.
         * For databases using dedicated Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of eight alphanumeric characters. Special characters are not permitted.
         * For databases using shared Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of 14 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
         *
         * @param dbName the value to set
         * @return this builder
         **/
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
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
         * The Autonomous Database workload type. The following values are valid:
         * <p>
         * - OLTP - indicates an Autonomous Transaction Processing database
         * - DW - indicates an Autonomous Data Warehouse database
         * - AJD - indicates an Autonomous JSON Database
         * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        /**
         * The Autonomous Database workload type. The following values are valid:
         * <p>
         * - OLTP - indicates an Autonomous Transaction Processing database
         * - DW - indicates an Autonomous Data Warehouse database
         * - AJD - indicates an Autonomous JSON Database
         * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
         *
         * @param dbWorkload the value to set
         * @return this builder
         **/
        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }
        /**
         * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
         * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
         * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
         * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
         * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
         * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
         * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
         *
         * @param licenseModel the value to set
         * @return this builder
         **/
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * Indicates if the database-level access control is enabled.
         * If disabled, database access is defined by the network security rules.
         * If enabled, database access is restricted to the IP addresses defined by the rules specified with the {@code whitelistedIps} property. While specifying {@code whitelistedIps} rules is optional,
         *  if database-level access control is enabled and no rules are specified, the database will become inaccessible. The rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit option in console.
         * When creating a database clone, the desired access control setting should be specified. By default, database-level access control will be disabled for the clone.
         * <p>
         * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlEnabled")
        private Boolean isAccessControlEnabled;

        /**
         * Indicates if the database-level access control is enabled.
         * If disabled, database access is defined by the network security rules.
         * If enabled, database access is restricted to the IP addresses defined by the rules specified with the {@code whitelistedIps} property. While specifying {@code whitelistedIps} rules is optional,
         *  if database-level access control is enabled and no rules are specified, the database will become inaccessible. The rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit option in console.
         * When creating a database clone, the desired access control setting should be specified. By default, database-level access control will be disabled for the clone.
         * <p>
         * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
         *
         * @param isAccessControlEnabled the value to set
         * @return this builder
         **/
        public Builder isAccessControlEnabled(Boolean isAccessControlEnabled) {
            this.isAccessControlEnabled = isAccessControlEnabled;
            this.__explicitlySet__.add("isAccessControlEnabled");
            return this;
        }
        /**
         * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
         * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
         * <p>
         * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
         * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
         * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
         * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
         * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
         * <p>
         * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
        private java.util.List<String> whitelistedIps;

        /**
         * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
         * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
         * <p>
         * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
         * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
         * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
         * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
         * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
         * <p>
         * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
         *
         * @param whitelistedIps the value to set
         * @return this builder
         **/
        public Builder whitelistedIps(java.util.List<String> whitelistedIps) {
            this.whitelistedIps = whitelistedIps;
            this.__explicitlySet__.add("whitelistedIps");
            return this;
        }
        /**
         * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
         * {@code TRUE} if the Autonomous Database has Data Guard and Access Control enabled, and the Autonomous Database uses the primary's IP access control list (ACL) for standby.
         * {@code FALSE} if the Autonomous Database has Data Guard and Access Control enabled, and the Autonomous Database uses a different IP access control list (ACL) for standby compared to primary.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
        private Boolean arePrimaryWhitelistedIpsUsed;

        /**
         * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
         * {@code TRUE} if the Autonomous Database has Data Guard and Access Control enabled, and the Autonomous Database uses the primary's IP access control list (ACL) for standby.
         * {@code FALSE} if the Autonomous Database has Data Guard and Access Control enabled, and the Autonomous Database uses a different IP access control list (ACL) for standby compared to primary.
         *
         * @param arePrimaryWhitelistedIpsUsed the value to set
         * @return this builder
         **/
        public Builder arePrimaryWhitelistedIpsUsed(Boolean arePrimaryWhitelistedIpsUsed) {
            this.arePrimaryWhitelistedIpsUsed = arePrimaryWhitelistedIpsUsed;
            this.__explicitlySet__.add("arePrimaryWhitelistedIpsUsed");
            return this;
        }
        /**
         * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
         * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
         * <p>
         * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
         * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
         * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
         * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
         * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
         * <p>
         * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
        private java.util.List<String> standbyWhitelistedIps;

        /**
         * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
         * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
         * <p>
         * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
         * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
         * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
         * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
         * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
         * <p>
         * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
         *
         * @param standbyWhitelistedIps the value to set
         * @return this builder
         **/
        public Builder standbyWhitelistedIps(java.util.List<String> standbyWhitelistedIps) {
            this.standbyWhitelistedIps = standbyWhitelistedIps;
            this.__explicitlySet__.add("standbyWhitelistedIps");
            return this;
        }
        /**
         * Indicates whether auto scaling is enabled for the Autonomous Database OCPU core count. Setting to {@code TRUE} enables auto scaling. Setting to {@code FALSE} disables auto scaling. The default value is true. Auto scaling is available for databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) only.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        /**
         * Indicates whether auto scaling is enabled for the Autonomous Database OCPU core count. Setting to {@code TRUE} enables auto scaling. Setting to {@code FALSE} disables auto scaling. The default value is true. Auto scaling is available for databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) only.
         *
         * @param isAutoScalingEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
            return this;
        }
        /**
         * Indicates whether the Autonomous Database is a refreshable clone.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
        private Boolean isRefreshableClone;

        /**
         * Indicates whether the Autonomous Database is a refreshable clone.
         * @param isRefreshableClone the value to set
         * @return this builder
         **/
        public Builder isRefreshableClone(Boolean isRefreshableClone) {
            this.isRefreshableClone = isRefreshableClone;
            this.__explicitlySet__.add("isRefreshableClone");
            return this;
        }
        /**
         * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("refreshableMode")
        private RefreshableMode refreshableMode;

        /**
         * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
         * @param refreshableMode the value to set
         * @return this builder
         **/
        public Builder refreshableMode(RefreshableMode refreshableMode) {
            this.refreshableMode = refreshableMode;
            this.__explicitlySet__.add("refreshableMode");
            return this;
        }
        /**
         * Indicates whether the Autonomous Database has a local (in-region) standby database. Not applicable when creating a cross-region Autonomous Data Guard associations, or to
         * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
         * <p>
         * To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code FALSE}. For more information on using Autonomous Data Guard on shared Exadata infrastructure (local and cross-region) , see [About Standby Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
         * <p>
         * To enable cross-region Autonomous Data Guard on shared Exadata infrastructure, see {@link #createCrossRegionAutonomousDatabaseDataGuardDetails(CreateCrossRegionAutonomousDatabaseDataGuardDetailsRequest) createCrossRegionAutonomousDatabaseDataGuardDetails}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLocalDataGuardEnabled")
        private Boolean isLocalDataGuardEnabled;

        /**
         * Indicates whether the Autonomous Database has a local (in-region) standby database. Not applicable when creating a cross-region Autonomous Data Guard associations, or to
         * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
         * <p>
         * To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code FALSE}. For more information on using Autonomous Data Guard on shared Exadata infrastructure (local and cross-region) , see [About Standby Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
         * <p>
         * To enable cross-region Autonomous Data Guard on shared Exadata infrastructure, see {@link #createCrossRegionAutonomousDatabaseDataGuardDetails(CreateCrossRegionAutonomousDatabaseDataGuardDetailsRequest) createCrossRegionAutonomousDatabaseDataGuardDetails}.
         *
         * @param isLocalDataGuardEnabled the value to set
         * @return this builder
         **/
        public Builder isLocalDataGuardEnabled(Boolean isLocalDataGuardEnabled) {
            this.isLocalDataGuardEnabled = isLocalDataGuardEnabled;
            this.__explicitlySet__.add("isLocalDataGuardEnabled");
            return this;
        }
        /**
         * ** Deprecated. ** Indicates whether the Autonomous Database has a local (in-region) standby database. Not applicable when creating a cross-region Autonomous Data Guard associations, or to
         * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
         * <p>
         * To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code FALSE}. For more information on using Autonomous Data Guard on shared Exadata infrastructure (local and cross-region) , see [About Standby Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
         * <p>
         * To enable cross-region Autonomous Data Guard on shared Exadata infrastructure, see {@link #createCrossRegionAutonomousDatabaseDataGuardDetails(CreateCrossRegionAutonomousDatabaseDataGuardDetailsRequest) createCrossRegionAutonomousDatabaseDataGuardDetails}.
         * <p>
         * To delete a cross-region standby database, provide the {@code peerDbId} for the standby database in a remote region, and set {@code isDataGuardEnabled} to {@code FALSE}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
        private Boolean isDataGuardEnabled;

        /**
         * ** Deprecated. ** Indicates whether the Autonomous Database has a local (in-region) standby database. Not applicable when creating a cross-region Autonomous Data Guard associations, or to
         * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
         * <p>
         * To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code FALSE}. For more information on using Autonomous Data Guard on shared Exadata infrastructure (local and cross-region) , see [About Standby Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
         * <p>
         * To enable cross-region Autonomous Data Guard on shared Exadata infrastructure, see {@link #createCrossRegionAutonomousDatabaseDataGuardDetails(CreateCrossRegionAutonomousDatabaseDataGuardDetailsRequest) createCrossRegionAutonomousDatabaseDataGuardDetails}.
         * <p>
         * To delete a cross-region standby database, provide the {@code peerDbId} for the standby database in a remote region, and set {@code isDataGuardEnabled} to {@code FALSE}.
         *
         * @param isDataGuardEnabled the value to set
         * @return this builder
         **/
        public Builder isDataGuardEnabled(Boolean isDataGuardEnabled) {
            this.isDataGuardEnabled = isDataGuardEnabled;
            this.__explicitlySet__.add("isDataGuardEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Data Guard standby database located in a different (remote) region from the source primary Autonomous Database.
         * <p>
         * To create or delete a local (in-region) standby, see the {@code isDataGuardEnabled} parameter.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbId")
        private String peerDbId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Data Guard standby database located in a different (remote) region from the source primary Autonomous Database.
         * <p>
         * To create or delete a local (in-region) standby, see the {@code isDataGuardEnabled} parameter.
         *
         * @param peerDbId the value to set
         * @return this builder
         **/
        public Builder peerDbId(String peerDbId) {
            this.peerDbId = peerDbId;
            this.__explicitlySet__.add("peerDbId");
            return this;
        }
        /**
         * A valid Oracle Database version for Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * A valid Oracle Database version for Autonomous Database.
         * @param dbVersion the value to set
         * @return this builder
         **/
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * The {@code DATABASE OPEN} mode. You can open the database in {@code READ_ONLY} or {@code READ_WRITE} mode.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private OpenMode openMode;

        /**
         * The {@code DATABASE OPEN} mode. You can open the database in {@code READ_ONLY} or {@code READ_WRITE} mode.
         * @param openMode the value to set
         * @return this builder
         **/
        public Builder openMode(OpenMode openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }
        /**
         * The Autonomous Database permission level. Restricted mode allows access only to admin users.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("permissionLevel")
        private PermissionLevel permissionLevel;

        /**
         * The Autonomous Database permission level. Restricted mode allows access only to admin users.
         * @param permissionLevel the value to set
         * @return this builder
         **/
        public Builder permissionLevel(PermissionLevel permissionLevel) {
            this.permissionLevel = permissionLevel;
            this.__explicitlySet__.add("permissionLevel");
            return this;
        }
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
        private String subnetId;

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
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The private endpoint label for the resource. Setting this to an empty string, after the private endpoint database gets created, will change the same private endpoint database to the public endpoint database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
        private String privateEndpointLabel;

        /**
         * The private endpoint label for the resource. Setting this to an empty string, after the private endpoint database gets created, will change the same private endpoint database to the public endpoint database.
         * @param privateEndpointLabel the value to set
         * @return this builder
         **/
        public Builder privateEndpointLabel(String privateEndpointLabel) {
            this.privateEndpointLabel = privateEndpointLabel;
            this.__explicitlySet__.add("privateEndpointLabel");
            return this;
        }
        /**
         * The private endpoint Ip address for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
        private String privateEndpointIp;

        /**
         * The private endpoint Ip address for the resource.
         * @param privateEndpointIp the value to set
         * @return this builder
         **/
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = privateEndpointIp;
            this.__explicitlySet__.add("privateEndpointIp");
            return this;
        }
        /**
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
         * **NsgIds restrictions:**
         * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
         * **NsgIds restrictions:**
         * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * Customer Contacts. Setting this to an empty list removes all customer contacts of an Oracle Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        /**
         * Customer Contacts. Setting this to an empty list removes all customer contacts of an Oracle Autonomous Database.
         * @param customerContacts the value to set
         * @return this builder
         **/
        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }
        /**
         * Indicates whether the Autonomous Database requires mTLS connections.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
        private Boolean isMtlsConnectionRequired;

        /**
         * Indicates whether the Autonomous Database requires mTLS connections.
         * @param isMtlsConnectionRequired the value to set
         * @return this builder
         **/
        public Builder isMtlsConnectionRequired(Boolean isMtlsConnectionRequired) {
            this.isMtlsConnectionRequired = isMtlsConnectionRequired;
            this.__explicitlySet__.add("isMtlsConnectionRequired");
            return this;
        }
        /**
         * list of scheduled operations
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledOperations")
        private java.util.List<ScheduledOperationDetails> scheduledOperations;

        /**
         * list of scheduled operations
         * @param scheduledOperations the value to set
         * @return this builder
         **/
        public Builder scheduledOperations(
                java.util.List<ScheduledOperationDetails> scheduledOperations) {
            this.scheduledOperations = scheduledOperations;
            this.__explicitlySet__.add("scheduledOperations");
            return this;
        }
        /**
         * Indicates if auto scaling is enabled for the Autonomous Database storage. The default value is {@code FALSE}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingForStorageEnabled")
        private Boolean isAutoScalingForStorageEnabled;

        /**
         * Indicates if auto scaling is enabled for the Autonomous Database storage. The default value is {@code FALSE}.
         *
         * @param isAutoScalingForStorageEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoScalingForStorageEnabled(Boolean isAutoScalingForStorageEnabled) {
            this.isAutoScalingForStorageEnabled = isAutoScalingForStorageEnabled;
            this.__explicitlySet__.add("isAutoScalingForStorageEnabled");
            return this;
        }
        /**
         * The number of Max OCPU cores to be made available to the autonomous database with auto scaling of cpu enabled.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCoreCount")
        private Integer maxCpuCoreCount;

        /**
         * The number of Max OCPU cores to be made available to the autonomous database with auto scaling of cpu enabled.
         *
         * @param maxCpuCoreCount the value to set
         * @return this builder
         **/
        public Builder maxCpuCoreCount(Integer maxCpuCoreCount) {
            this.maxCpuCoreCount = maxCpuCoreCount;
            this.__explicitlySet__.add("maxCpuCoreCount");
            return this;
        }
        /**
         * The Oracle Database Edition that applies to the Autonomous databases.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private AutonomousDatabaseSummary.DatabaseEdition databaseEdition;

        /**
         * The Oracle Database Edition that applies to the Autonomous databases.
         *
         * @param databaseEdition the value to set
         * @return this builder
         **/
        public Builder databaseEdition(AutonomousDatabaseSummary.DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }
        /**
         * List of database tools details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbToolsDetails")
        private java.util.List<DatabaseTool> dbToolsDetails;

        /**
         * List of database tools details.
         * @param dbToolsDetails the value to set
         * @return this builder
         **/
        public Builder dbToolsDetails(java.util.List<DatabaseTool> dbToolsDetails) {
            this.dbToolsDetails = dbToolsDetails;
            this.__explicitlySet__.add("dbToolsDetails");
            return this;
        }
        /**
         * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID.
         * @param secretId the value to set
         * @return this builder
         **/
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /**
         * The version of the vault secret. If no version is specified, the latest version will be used.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secretVersionNumber")
        private Integer secretVersionNumber;

        /**
         * The version of the vault secret. If no version is specified, the latest version will be used.
         * @param secretVersionNumber the value to set
         * @return this builder
         **/
        public Builder secretVersionNumber(Integer secretVersionNumber) {
            this.secretVersionNumber = secretVersionNumber;
            this.__explicitlySet__.add("secretVersionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAutonomousDatabaseDetails build() {
            UpdateAutonomousDatabaseDetails model =
                    new UpdateAutonomousDatabaseDetails(
                            this.cpuCoreCount,
                            this.computeCount,
                            this.ocpuCount,
                            this.dataStorageSizeInTBs,
                            this.dataStorageSizeInGBs,
                            this.displayName,
                            this.isFreeTier,
                            this.adminPassword,
                            this.dbName,
                            this.freeformTags,
                            this.definedTags,
                            this.dbWorkload,
                            this.licenseModel,
                            this.isAccessControlEnabled,
                            this.whitelistedIps,
                            this.arePrimaryWhitelistedIpsUsed,
                            this.standbyWhitelistedIps,
                            this.isAutoScalingEnabled,
                            this.isRefreshableClone,
                            this.refreshableMode,
                            this.isLocalDataGuardEnabled,
                            this.isDataGuardEnabled,
                            this.peerDbId,
                            this.dbVersion,
                            this.openMode,
                            this.permissionLevel,
                            this.subnetId,
                            this.privateEndpointLabel,
                            this.privateEndpointIp,
                            this.nsgIds,
                            this.customerContacts,
                            this.isMtlsConnectionRequired,
                            this.scheduledOperations,
                            this.isAutoScalingForStorageEnabled,
                            this.maxCpuCoreCount,
                            this.databaseEdition,
                            this.dbToolsDetails,
                            this.secretId,
                            this.secretVersionNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAutonomousDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("cpuCoreCount")) {
                this.cpuCoreCount(model.getCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("computeCount")) {
                this.computeCount(model.getComputeCount());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInTBs")) {
                this.dataStorageSizeInTBs(model.getDataStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isFreeTier")) {
                this.isFreeTier(model.getIsFreeTier());
            }
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("isAccessControlEnabled")) {
                this.isAccessControlEnabled(model.getIsAccessControlEnabled());
            }
            if (model.wasPropertyExplicitlySet("whitelistedIps")) {
                this.whitelistedIps(model.getWhitelistedIps());
            }
            if (model.wasPropertyExplicitlySet("arePrimaryWhitelistedIpsUsed")) {
                this.arePrimaryWhitelistedIpsUsed(model.getArePrimaryWhitelistedIpsUsed());
            }
            if (model.wasPropertyExplicitlySet("standbyWhitelistedIps")) {
                this.standbyWhitelistedIps(model.getStandbyWhitelistedIps());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRefreshableClone")) {
                this.isRefreshableClone(model.getIsRefreshableClone());
            }
            if (model.wasPropertyExplicitlySet("refreshableMode")) {
                this.refreshableMode(model.getRefreshableMode());
            }
            if (model.wasPropertyExplicitlySet("isLocalDataGuardEnabled")) {
                this.isLocalDataGuardEnabled(model.getIsLocalDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDataGuardEnabled")) {
                this.isDataGuardEnabled(model.getIsDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("peerDbId")) {
                this.peerDbId(model.getPeerDbId());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("openMode")) {
                this.openMode(model.getOpenMode());
            }
            if (model.wasPropertyExplicitlySet("permissionLevel")) {
                this.permissionLevel(model.getPermissionLevel());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointLabel")) {
                this.privateEndpointLabel(model.getPrivateEndpointLabel());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIp")) {
                this.privateEndpointIp(model.getPrivateEndpointIp());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("customerContacts")) {
                this.customerContacts(model.getCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("isMtlsConnectionRequired")) {
                this.isMtlsConnectionRequired(model.getIsMtlsConnectionRequired());
            }
            if (model.wasPropertyExplicitlySet("scheduledOperations")) {
                this.scheduledOperations(model.getScheduledOperations());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingForStorageEnabled")) {
                this.isAutoScalingForStorageEnabled(model.getIsAutoScalingForStorageEnabled());
            }
            if (model.wasPropertyExplicitlySet("maxCpuCoreCount")) {
                this.maxCpuCoreCount(model.getMaxCpuCoreCount());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            if (model.wasPropertyExplicitlySet("dbToolsDetails")) {
                this.dbToolsDetails(model.getDbToolsDetails());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("secretVersionNumber")) {
                this.secretVersionNumber(model.getSecretVersionNumber());
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
     * The number of CPUs to be made available to the Autonomous Database.
     * <p>
     **Note:** This parameter cannot be used with the {@code ocpuCount} or {@code computeCount} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPUs to be made available to the Autonomous Database.
     * <p>
     **Note:** This parameter cannot be used with the {@code ocpuCount} or {@code computeCount} parameter.
     *
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The compute amount available to the database. Minimum and maximum values depend on the compute model and whether the database is on Shared or Dedicated infrastructure. For an Autonomous Database on Shared infrastructure, the 'ECPU' compute model requires values in multiples of two. Required when using the {@code computeModel} parameter. When using {@code cpuCoreCount} parameter, it is an error to specify computeCount to a non-null value.@endif
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Float computeCount;

    /**
     * The compute amount available to the database. Minimum and maximum values depend on the compute model and whether the database is on Shared or Dedicated infrastructure. For an Autonomous Database on Shared infrastructure, the 'ECPU' compute model requires values in multiples of two. Required when using the {@code computeModel} parameter. When using {@code cpuCoreCount} parameter, it is an error to specify computeCount to a non-null value.@endif
     * @return the value
     **/
    public Float getComputeCount() {
        return computeCount;
    }

    /**
     * The number of OCPU cores to be made available to the Autonomous Database.
     * <p>
     * For databases on dedicated Exadata infrastructure, you can specify a fractional value for this parameter. Fractional values are not supported for Autonomous Database on shared Exadata infrastructure.
     * <p>
     * To provision less than 1 core, enter a fractional value in an increment of 0.1. To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available to the infrastructure shape. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. Likewise, you can provision 2 cores or 3 cores, but not 2.5 cores. The maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of OCPU cores to be made available to the Autonomous Database.
     * <p>
     * For databases on dedicated Exadata infrastructure, you can specify a fractional value for this parameter. Fractional values are not supported for Autonomous Database on shared Exadata infrastructure.
     * <p>
     * To provision less than 1 core, enter a fractional value in an increment of 0.1. To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available to the infrastructure shape. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. Likewise, you can provision 2 cores or 3 cores, but not 2.5 cores. The maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     *
     * @return the value
     **/
    public Float getOcpuCount() {
        return ocpuCount;
    }

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Integer dataStorageSizeInTBs;

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
     *
     * @return the value
     **/
    public Integer getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /**
     * Applies to dedicated Exadata infrastructure only.
     * <p>
     * The size, in gigabytes, of the data volume that will be created and attached to the database. The maximum storage value depends on the system shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * Applies to dedicated Exadata infrastructure only.
     * <p>
     * The size, in gigabytes, of the data volume that will be created and attached to the database. The maximum storage value depends on the system shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
     *
     * @return the value
     **/
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique. The display name can only be updated for Autonomous Databases
     * using dedicated Exadata infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique. The display name can only be updated for Autonomous Databases
     * using dedicated Exadata infrastructure.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
    private final Boolean isFreeTier;

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
     *
     * @return the value
     **/
    public Boolean getIsFreeTier() {
        return isFreeTier;
    }

    /**
     * The password must be between 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing. It must be different from the last four passwords and it must not be a password used within the last 24 hours.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * The password must be between 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing. It must be different from the last four passwords and it must not be a password used within the last 24 hours.
     * @return the value
     **/
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * New name for this Autonomous Database.
     * For databases using dedicated Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of eight alphanumeric characters. Special characters are not permitted.
     * For databases using shared Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of 14 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * New name for this Autonomous Database.
     * For databases using dedicated Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of eight alphanumeric characters. Special characters are not permitted.
     * For databases using shared Exadata infrastructure, the name must begin with an alphabetic character, and can contain a maximum of 14 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy.
     *
     * @return the value
     **/
    public String getDbName() {
        return dbName;
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
    private final DbWorkload dbWorkload;

    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     *
     * @return the value
     **/
    public DbWorkload getDbWorkload() {
        return dbWorkload;
    }

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
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
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle PaaS and IaaS services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Database service.
     * Note that when provisioning an Autonomous Database on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null because the attribute is already set at the
     * Autonomous Exadata Infrastructure level. When using [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), if a value is not specified, the system will supply the value of {@code BRING_YOUR_OWN_LICENSE}.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * Indicates if the database-level access control is enabled.
     * If disabled, database access is defined by the network security rules.
     * If enabled, database access is restricted to the IP addresses defined by the rules specified with the {@code whitelistedIps} property. While specifying {@code whitelistedIps} rules is optional,
     *  if database-level access control is enabled and no rules are specified, the database will become inaccessible. The rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit option in console.
     * When creating a database clone, the desired access control setting should be specified. By default, database-level access control will be disabled for the clone.
     * <p>
     * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessControlEnabled")
    private final Boolean isAccessControlEnabled;

    /**
     * Indicates if the database-level access control is enabled.
     * If disabled, database access is defined by the network security rules.
     * If enabled, database access is restricted to the IP addresses defined by the rules specified with the {@code whitelistedIps} property. While specifying {@code whitelistedIps} rules is optional,
     *  if database-level access control is enabled and no rules are specified, the database will become inaccessible. The rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit option in console.
     * When creating a database clone, the desired access control setting should be specified. By default, database-level access control will be disabled for the clone.
     * <p>
     * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
     *
     * @return the value
     **/
    public Boolean getIsAccessControlEnabled() {
        return isAccessControlEnabled;
    }

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
    private final java.util.List<String> whitelistedIps;

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     * @return the value
     **/
    public java.util.List<String> getWhitelistedIps() {
        return whitelistedIps;
    }

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
     * {@code TRUE} if the Autonomous Database has Data Guard and Access Control enabled, and the Autonomous Database uses the primary's IP access control list (ACL) for standby.
     * {@code FALSE} if the Autonomous Database has Data Guard and Access Control enabled, and the Autonomous Database uses a different IP access control list (ACL) for standby compared to primary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
    private final Boolean arePrimaryWhitelistedIpsUsed;

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
     * {@code TRUE} if the Autonomous Database has Data Guard and Access Control enabled, and the Autonomous Database uses the primary's IP access control list (ACL) for standby.
     * {@code FALSE} if the Autonomous Database has Data Guard and Access Control enabled, and the Autonomous Database uses a different IP access control list (ACL) for standby compared to primary.
     *
     * @return the value
     **/
    public Boolean getArePrimaryWhitelistedIpsUsed() {
        return arePrimaryWhitelistedIpsUsed;
    }

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
    private final java.util.List<String> standbyWhitelistedIps;

    /**
     * The client IP access control list (ACL). This feature is available for autonomous databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * <p>
     * For shared Exadata infrastructure, this is an array of CIDR (Classless Inter-Domain Routing) notations for a subnet or VCN OCID.
     * Use a semicolon (;) as a deliminator between the VCN-specific subnets or IPs.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR (Classless Inter-Domain Routing) notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     *
     * @return the value
     **/
    public java.util.List<String> getStandbyWhitelistedIps() {
        return standbyWhitelistedIps;
    }

    /**
     * Indicates whether auto scaling is enabled for the Autonomous Database OCPU core count. Setting to {@code TRUE} enables auto scaling. Setting to {@code FALSE} disables auto scaling. The default value is true. Auto scaling is available for databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) only.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Indicates whether auto scaling is enabled for the Autonomous Database OCPU core count. Setting to {@code TRUE} enables auto scaling. Setting to {@code FALSE} disables auto scaling. The default value is true. Auto scaling is available for databases on [shared Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) only.
     *
     * @return the value
     **/
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
    }

    /**
     * Indicates whether the Autonomous Database is a refreshable clone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
    private final Boolean isRefreshableClone;

    /**
     * Indicates whether the Autonomous Database is a refreshable clone.
     * @return the value
     **/
    public Boolean getIsRefreshableClone() {
        return isRefreshableClone;
    }

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
    private final RefreshableMode refreshableMode;

    /**
     * The refresh mode of the clone. AUTOMATIC indicates that the clone is automatically being refreshed with data from the source Autonomous Database.
     * @return the value
     **/
    public RefreshableMode getRefreshableMode() {
        return refreshableMode;
    }

    /**
     * Indicates whether the Autonomous Database has a local (in-region) standby database. Not applicable when creating a cross-region Autonomous Data Guard associations, or to
     * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     * <p>
     * To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code FALSE}. For more information on using Autonomous Data Guard on shared Exadata infrastructure (local and cross-region) , see [About Standby Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
     * <p>
     * To enable cross-region Autonomous Data Guard on shared Exadata infrastructure, see {@link #createCrossRegionAutonomousDatabaseDataGuardDetails(CreateCrossRegionAutonomousDatabaseDataGuardDetailsRequest) createCrossRegionAutonomousDatabaseDataGuardDetails}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalDataGuardEnabled")
    private final Boolean isLocalDataGuardEnabled;

    /**
     * Indicates whether the Autonomous Database has a local (in-region) standby database. Not applicable when creating a cross-region Autonomous Data Guard associations, or to
     * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     * <p>
     * To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code FALSE}. For more information on using Autonomous Data Guard on shared Exadata infrastructure (local and cross-region) , see [About Standby Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
     * <p>
     * To enable cross-region Autonomous Data Guard on shared Exadata infrastructure, see {@link #createCrossRegionAutonomousDatabaseDataGuardDetails(CreateCrossRegionAutonomousDatabaseDataGuardDetailsRequest) createCrossRegionAutonomousDatabaseDataGuardDetails}.
     *
     * @return the value
     **/
    public Boolean getIsLocalDataGuardEnabled() {
        return isLocalDataGuardEnabled;
    }

    /**
     * ** Deprecated. ** Indicates whether the Autonomous Database has a local (in-region) standby database. Not applicable when creating a cross-region Autonomous Data Guard associations, or to
     * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     * <p>
     * To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code FALSE}. For more information on using Autonomous Data Guard on shared Exadata infrastructure (local and cross-region) , see [About Standby Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
     * <p>
     * To enable cross-region Autonomous Data Guard on shared Exadata infrastructure, see {@link #createCrossRegionAutonomousDatabaseDataGuardDetails(CreateCrossRegionAutonomousDatabaseDataGuardDetailsRequest) createCrossRegionAutonomousDatabaseDataGuardDetails}.
     * <p>
     * To delete a cross-region standby database, provide the {@code peerDbId} for the standby database in a remote region, and set {@code isDataGuardEnabled} to {@code FALSE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
    private final Boolean isDataGuardEnabled;

    /**
     * ** Deprecated. ** Indicates whether the Autonomous Database has a local (in-region) standby database. Not applicable when creating a cross-region Autonomous Data Guard associations, or to
     * Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     * <p>
     * To create a local standby, set to {@code TRUE}. To delete a local standby, set to {@code FALSE}. For more information on using Autonomous Data Guard on shared Exadata infrastructure (local and cross-region) , see [About Standby Databases](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/autonomous-data-guard-about.html#GUID-045AD017-8120-4BDC-AF58-7430FFE28D2B)
     * <p>
     * To enable cross-region Autonomous Data Guard on shared Exadata infrastructure, see {@link #createCrossRegionAutonomousDatabaseDataGuardDetails(CreateCrossRegionAutonomousDatabaseDataGuardDetailsRequest) createCrossRegionAutonomousDatabaseDataGuardDetails}.
     * <p>
     * To delete a cross-region standby database, provide the {@code peerDbId} for the standby database in a remote region, and set {@code isDataGuardEnabled} to {@code FALSE}.
     *
     * @return the value
     **/
    public Boolean getIsDataGuardEnabled() {
        return isDataGuardEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Data Guard standby database located in a different (remote) region from the source primary Autonomous Database.
     * <p>
     * To create or delete a local (in-region) standby, see the {@code isDataGuardEnabled} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbId")
    private final String peerDbId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Data Guard standby database located in a different (remote) region from the source primary Autonomous Database.
     * <p>
     * To create or delete a local (in-region) standby, see the {@code isDataGuardEnabled} parameter.
     *
     * @return the value
     **/
    public String getPeerDbId() {
        return peerDbId;
    }

    /**
     * A valid Oracle Database version for Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * A valid Oracle Database version for Autonomous Database.
     * @return the value
     **/
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The {@code DATABASE OPEN} mode. You can open the database in {@code READ_ONLY} or {@code READ_WRITE} mode.
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
     * The {@code DATABASE OPEN} mode. You can open the database in {@code READ_ONLY} or {@code READ_WRITE} mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    private final OpenMode openMode;

    /**
     * The {@code DATABASE OPEN} mode. You can open the database in {@code READ_ONLY} or {@code READ_WRITE} mode.
     * @return the value
     **/
    public OpenMode getOpenMode() {
        return openMode;
    }

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
    private final PermissionLevel permissionLevel;

    /**
     * The Autonomous Database permission level. Restricted mode allows access only to admin users.
     * @return the value
     **/
    public PermissionLevel getPermissionLevel() {
        return permissionLevel;
    }

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
    private final String subnetId;

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
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The private endpoint label for the resource. Setting this to an empty string, after the private endpoint database gets created, will change the same private endpoint database to the public endpoint database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
    private final String privateEndpointLabel;

    /**
     * The private endpoint label for the resource. Setting this to an empty string, after the private endpoint database gets created, will change the same private endpoint database to the public endpoint database.
     * @return the value
     **/
    public String getPrivateEndpointLabel() {
        return privateEndpointLabel;
    }

    /**
     * The private endpoint Ip address for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIp")
    private final String privateEndpointIp;

    /**
     * The private endpoint Ip address for the resource.
     * @return the value
     **/
    public String getPrivateEndpointIp() {
        return privateEndpointIp;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) for the network security groups (NSGs) to which this resource belongs. Setting this to an empty list removes all resources from all NSGs. For more information about NSGs, see [Security Rules](https://docs.cloud.oracle.com/Content/Network/Concepts/securityrules.htm).
     * **NsgIds restrictions:**
     * - A network security group (NSG) is optional for Autonomous Databases with private access. The nsgIds list can be empty.
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * Customer Contacts. Setting this to an empty list removes all customer contacts of an Oracle Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * Customer Contacts. Setting this to an empty list removes all customer contacts of an Oracle Autonomous Database.
     * @return the value
     **/
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    /**
     * Indicates whether the Autonomous Database requires mTLS connections.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
    private final Boolean isMtlsConnectionRequired;

    /**
     * Indicates whether the Autonomous Database requires mTLS connections.
     * @return the value
     **/
    public Boolean getIsMtlsConnectionRequired() {
        return isMtlsConnectionRequired;
    }

    /**
     * list of scheduled operations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledOperations")
    private final java.util.List<ScheduledOperationDetails> scheduledOperations;

    /**
     * list of scheduled operations
     * @return the value
     **/
    public java.util.List<ScheduledOperationDetails> getScheduledOperations() {
        return scheduledOperations;
    }

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database storage. The default value is {@code FALSE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingForStorageEnabled")
    private final Boolean isAutoScalingForStorageEnabled;

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database storage. The default value is {@code FALSE}.
     *
     * @return the value
     **/
    public Boolean getIsAutoScalingForStorageEnabled() {
        return isAutoScalingForStorageEnabled;
    }

    /**
     * The number of Max OCPU cores to be made available to the autonomous database with auto scaling of cpu enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCoreCount")
    private final Integer maxCpuCoreCount;

    /**
     * The number of Max OCPU cores to be made available to the autonomous database with auto scaling of cpu enabled.
     *
     * @return the value
     **/
    public Integer getMaxCpuCoreCount() {
        return maxCpuCoreCount;
    }

    /**
     * The Oracle Database Edition that applies to the Autonomous databases.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final AutonomousDatabaseSummary.DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to the Autonomous databases.
     *
     * @return the value
     **/
    public AutonomousDatabaseSummary.DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /**
     * List of database tools details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbToolsDetails")
    private final java.util.List<DatabaseTool> dbToolsDetails;

    /**
     * List of database tools details.
     * @return the value
     **/
    public java.util.List<DatabaseTool> getDbToolsDetails() {
        return dbToolsDetails;
    }

    /**
     * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID.
     * @return the value
     **/
    public String getSecretId() {
        return secretId;
    }

    /**
     * The version of the vault secret. If no version is specified, the latest version will be used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretVersionNumber")
    private final Integer secretVersionNumber;

    /**
     * The version of the vault secret. If no version is specified, the latest version will be used.
     * @return the value
     **/
    public Integer getSecretVersionNumber() {
        return secretVersionNumber;
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
        sb.append("UpdateAutonomousDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isFreeTier=").append(String.valueOf(this.isFreeTier));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", isAccessControlEnabled=").append(String.valueOf(this.isAccessControlEnabled));
        sb.append(", whitelistedIps=").append(String.valueOf(this.whitelistedIps));
        sb.append(", arePrimaryWhitelistedIpsUsed=")
                .append(String.valueOf(this.arePrimaryWhitelistedIpsUsed));
        sb.append(", standbyWhitelistedIps=").append(String.valueOf(this.standbyWhitelistedIps));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", isRefreshableClone=").append(String.valueOf(this.isRefreshableClone));
        sb.append(", refreshableMode=").append(String.valueOf(this.refreshableMode));
        sb.append(", isLocalDataGuardEnabled=")
                .append(String.valueOf(this.isLocalDataGuardEnabled));
        sb.append(", isDataGuardEnabled=").append(String.valueOf(this.isDataGuardEnabled));
        sb.append(", peerDbId=").append(String.valueOf(this.peerDbId));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", openMode=").append(String.valueOf(this.openMode));
        sb.append(", permissionLevel=").append(String.valueOf(this.permissionLevel));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", privateEndpointLabel=").append(String.valueOf(this.privateEndpointLabel));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", isMtlsConnectionRequired=")
                .append(String.valueOf(this.isMtlsConnectionRequired));
        sb.append(", scheduledOperations=").append(String.valueOf(this.scheduledOperations));
        sb.append(", isAutoScalingForStorageEnabled=")
                .append(String.valueOf(this.isAutoScalingForStorageEnabled));
        sb.append(", maxCpuCoreCount=").append(String.valueOf(this.maxCpuCoreCount));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(", dbToolsDetails=").append(String.valueOf(this.dbToolsDetails));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", secretVersionNumber=").append(String.valueOf(this.secretVersionNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousDatabaseDetails)) {
            return false;
        }

        UpdateAutonomousDatabaseDetails other = (UpdateAutonomousDatabaseDetails) o;
        return java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isFreeTier, other.isFreeTier)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(
                        this.isAccessControlEnabled, other.isAccessControlEnabled)
                && java.util.Objects.equals(this.whitelistedIps, other.whitelistedIps)
                && java.util.Objects.equals(
                        this.arePrimaryWhitelistedIpsUsed, other.arePrimaryWhitelistedIpsUsed)
                && java.util.Objects.equals(this.standbyWhitelistedIps, other.standbyWhitelistedIps)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.isRefreshableClone, other.isRefreshableClone)
                && java.util.Objects.equals(this.refreshableMode, other.refreshableMode)
                && java.util.Objects.equals(
                        this.isLocalDataGuardEnabled, other.isLocalDataGuardEnabled)
                && java.util.Objects.equals(this.isDataGuardEnabled, other.isDataGuardEnabled)
                && java.util.Objects.equals(this.peerDbId, other.peerDbId)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.openMode, other.openMode)
                && java.util.Objects.equals(this.permissionLevel, other.permissionLevel)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.privateEndpointLabel, other.privateEndpointLabel)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(
                        this.isMtlsConnectionRequired, other.isMtlsConnectionRequired)
                && java.util.Objects.equals(this.scheduledOperations, other.scheduledOperations)
                && java.util.Objects.equals(
                        this.isAutoScalingForStorageEnabled, other.isAutoScalingForStorageEnabled)
                && java.util.Objects.equals(this.maxCpuCoreCount, other.maxCpuCoreCount)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && java.util.Objects.equals(this.dbToolsDetails, other.dbToolsDetails)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.secretVersionNumber, other.secretVersionNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInTBs == null
                                ? 43
                                : this.dataStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isFreeTier == null ? 43 : this.isFreeTier.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccessControlEnabled == null
                                ? 43
                                : this.isAccessControlEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.whitelistedIps == null ? 43 : this.whitelistedIps.hashCode());
        result =
                (result * PRIME)
                        + (this.arePrimaryWhitelistedIpsUsed == null
                                ? 43
                                : this.arePrimaryWhitelistedIpsUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyWhitelistedIps == null
                                ? 43
                                : this.standbyWhitelistedIps.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRefreshableClone == null
                                ? 43
                                : this.isRefreshableClone.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshableMode == null ? 43 : this.refreshableMode.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalDataGuardEnabled == null
                                ? 43
                                : this.isLocalDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataGuardEnabled == null
                                ? 43
                                : this.isDataGuardEnabled.hashCode());
        result = (result * PRIME) + (this.peerDbId == null ? 43 : this.peerDbId.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.openMode == null ? 43 : this.openMode.hashCode());
        result =
                (result * PRIME)
                        + (this.permissionLevel == null ? 43 : this.permissionLevel.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointLabel == null
                                ? 43
                                : this.privateEndpointLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsConnectionRequired == null
                                ? 43
                                : this.isMtlsConnectionRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledOperations == null
                                ? 43
                                : this.scheduledOperations.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingForStorageEnabled == null
                                ? 43
                                : this.isAutoScalingForStorageEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.maxCpuCoreCount == null ? 43 : this.maxCpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result =
                (result * PRIME)
                        + (this.dbToolsDetails == null ? 43 : this.dbToolsDetails.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretVersionNumber == null
                                ? 43
                                : this.secretVersionNumber.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
