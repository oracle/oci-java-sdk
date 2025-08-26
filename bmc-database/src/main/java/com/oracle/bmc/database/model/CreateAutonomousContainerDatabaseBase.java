/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describes the required parameters for the creation of an Autonomous Container Database. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source",
        defaultImpl = CreateAutonomousContainerDatabaseBase.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateAutonomousContainerDatabaseDetails.class,
            name = "NONE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateAutonomousContainerDatabaseFromBackupDetails.class,
            name = "BACKUP_FROM_ID")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateAutonomousContainerDatabaseBase
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "customerContacts",
        "okvEndPointGroupName",
        "displayName",
        "dbUniqueName",
        "dbName",
        "serviceLevelAgreementType",
        "autonomousExadataInfrastructureId",
        "dbVersion",
        "databaseSoftwareImageId",
        "peerAutonomousExadataInfrastructureId",
        "peerAutonomousContainerDatabaseDisplayName",
        "protectionMode",
        "fastStartFailOverLagLimitInSeconds",
        "isAutomaticFailoverEnabled",
        "peerCloudAutonomousVmClusterId",
        "peerAutonomousVmClusterId",
        "peerAutonomousContainerDatabaseCompartmentId",
        "peerAutonomousContainerDatabaseBackupConfig",
        "peerDbUniqueName",
        "autonomousVmClusterId",
        "cloudAutonomousVmClusterId",
        "compartmentId",
        "patchModel",
        "maintenanceWindowDetails",
        "standbyMaintenanceBufferInDays",
        "versionPreference",
        "isDstFileUpdateEnabled",
        "freeformTags",
        "definedTags",
        "backupConfig",
        "kmsKeyId",
        "kmsKeyVersionId",
        "vaultId",
        "keyStoreId",
        "dbSplitThreshold",
        "vmFailoverReservation",
        "distributionAffinity",
        "netServicesArchitecture"
    })
    protected CreateAutonomousContainerDatabaseBase(
            java.util.List<CustomerContact> customerContacts,
            String okvEndPointGroupName,
            String displayName,
            String dbUniqueName,
            String dbName,
            ServiceLevelAgreementType serviceLevelAgreementType,
            String autonomousExadataInfrastructureId,
            String dbVersion,
            String databaseSoftwareImageId,
            String peerAutonomousExadataInfrastructureId,
            String peerAutonomousContainerDatabaseDisplayName,
            ProtectionMode protectionMode,
            Integer fastStartFailOverLagLimitInSeconds,
            Boolean isAutomaticFailoverEnabled,
            String peerCloudAutonomousVmClusterId,
            String peerAutonomousVmClusterId,
            String peerAutonomousContainerDatabaseCompartmentId,
            PeerAutonomousContainerDatabaseBackupConfig peerAutonomousContainerDatabaseBackupConfig,
            String peerDbUniqueName,
            String autonomousVmClusterId,
            String cloudAutonomousVmClusterId,
            String compartmentId,
            PatchModel patchModel,
            MaintenanceWindow maintenanceWindowDetails,
            Integer standbyMaintenanceBufferInDays,
            VersionPreference versionPreference,
            Boolean isDstFileUpdateEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            AutonomousContainerDatabaseBackupConfig backupConfig,
            String kmsKeyId,
            String kmsKeyVersionId,
            String vaultId,
            String keyStoreId,
            Integer dbSplitThreshold,
            Integer vmFailoverReservation,
            DistributionAffinity distributionAffinity,
            NetServicesArchitecture netServicesArchitecture) {
        super();
        this.customerContacts = customerContacts;
        this.okvEndPointGroupName = okvEndPointGroupName;
        this.displayName = displayName;
        this.dbUniqueName = dbUniqueName;
        this.dbName = dbName;
        this.serviceLevelAgreementType = serviceLevelAgreementType;
        this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
        this.dbVersion = dbVersion;
        this.databaseSoftwareImageId = databaseSoftwareImageId;
        this.peerAutonomousExadataInfrastructureId = peerAutonomousExadataInfrastructureId;
        this.peerAutonomousContainerDatabaseDisplayName =
                peerAutonomousContainerDatabaseDisplayName;
        this.protectionMode = protectionMode;
        this.fastStartFailOverLagLimitInSeconds = fastStartFailOverLagLimitInSeconds;
        this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
        this.peerCloudAutonomousVmClusterId = peerCloudAutonomousVmClusterId;
        this.peerAutonomousVmClusterId = peerAutonomousVmClusterId;
        this.peerAutonomousContainerDatabaseCompartmentId =
                peerAutonomousContainerDatabaseCompartmentId;
        this.peerAutonomousContainerDatabaseBackupConfig =
                peerAutonomousContainerDatabaseBackupConfig;
        this.peerDbUniqueName = peerDbUniqueName;
        this.autonomousVmClusterId = autonomousVmClusterId;
        this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
        this.compartmentId = compartmentId;
        this.patchModel = patchModel;
        this.maintenanceWindowDetails = maintenanceWindowDetails;
        this.standbyMaintenanceBufferInDays = standbyMaintenanceBufferInDays;
        this.versionPreference = versionPreference;
        this.isDstFileUpdateEnabled = isDstFileUpdateEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.backupConfig = backupConfig;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.vaultId = vaultId;
        this.keyStoreId = keyStoreId;
        this.dbSplitThreshold = dbSplitThreshold;
        this.vmFailoverReservation = vmFailoverReservation;
        this.distributionAffinity = distributionAffinity;
        this.netServicesArchitecture = netServicesArchitecture;
    }

    /** Customer Contacts. Setting this to an empty list removes all customer contacts. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * Customer Contacts. Setting this to an empty list removes all customer contacts.
     *
     * @return the value
     */
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    /** The OKV End Point Group name for the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("okvEndPointGroupName")
    private final String okvEndPointGroupName;

    /**
     * The OKV End Point Group name for the Autonomous Container Database.
     *
     * @return the value
     */
    public String getOkvEndPointGroupName() {
        return okvEndPointGroupName;
    }

    /** The display name for the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name for the Autonomous Container Database.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure. Do
     * not specify a value for this parameter. Specifying a value for this field will cause
     * Terraform operations to fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure. Do
     * not specify a value for this parameter. Specifying a value for this field will cause
     * Terraform operations to fail.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * The Database name for the Autonomous Container Database. The name must be unique within the
     * Cloud Autonomous VM Cluster, starting with an alphabetic character, followed by 1 to 7
     * alphanumeric characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The Database name for the Autonomous Container Database. The name must be unique within the
     * Cloud Autonomous VM Cluster, starting with an alphabetic character, followed by 1 to 7
     * alphanumeric characters.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * The service level agreement type of the Autonomous Container Database. The default is
     * STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous
     * Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     */
    public enum ServiceLevelAgreementType implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("STANDARD"),
        AutonomousDataguard("AUTONOMOUS_DATAGUARD"),
        ;

        private final String value;
        private static java.util.Map<String, ServiceLevelAgreementType> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceLevelAgreementType v : ServiceLevelAgreementType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ServiceLevelAgreementType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServiceLevelAgreementType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ServiceLevelAgreementType: " + key);
        }
    };
    /**
     * The service level agreement type of the Autonomous Container Database. The default is
     * STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous
     * Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceLevelAgreementType")
    private final ServiceLevelAgreementType serviceLevelAgreementType;

    /**
     * The service level agreement type of the Autonomous Container Database. The default is
     * STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous
     * Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     *
     * @return the value
     */
    public ServiceLevelAgreementType getServiceLevelAgreementType() {
        return serviceLevelAgreementType;
    }

    /**
     * **No longer used.** This parameter is no longer used for Autonomous Database on dedicated
     * Exadata infrasture. Specify a {@code cloudAutonomousVmClusterId} instead. Using this
     * parameter will cause the operation to fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousExadataInfrastructureId")
    private final String autonomousExadataInfrastructureId;

    /**
     * **No longer used.** This parameter is no longer used for Autonomous Database on dedicated
     * Exadata infrasture. Specify a {@code cloudAutonomousVmClusterId} instead. Using this
     * parameter will cause the operation to fail.
     *
     * @return the value
     */
    public String getAutonomousExadataInfrastructureId() {
        return autonomousExadataInfrastructureId;
    }

    /** The base version for the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * The base version for the Autonomous Container Database.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The Autonomous Database Software Image
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    private final String databaseSoftwareImageId;

    /**
     * The Autonomous Database Software Image
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
    }

    /**
     * *No longer used.* This parameter is no longer used for Autonomous Database on dedicated
     * Exadata infrasture. Specify a {@code peerCloudAutonomousVmClusterId} instead. Using this
     * parameter will cause the operation to fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousExadataInfrastructureId")
    private final String peerAutonomousExadataInfrastructureId;

    /**
     * *No longer used.* This parameter is no longer used for Autonomous Database on dedicated
     * Exadata infrasture. Specify a {@code peerCloudAutonomousVmClusterId} instead. Using this
     * parameter will cause the operation to fail.
     *
     * @return the value
     */
    public String getPeerAutonomousExadataInfrastructureId() {
        return peerAutonomousExadataInfrastructureId;
    }

    /** The display name for the peer Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseDisplayName")
    private final String peerAutonomousContainerDatabaseDisplayName;

    /**
     * The display name for the peer Autonomous Container Database.
     *
     * @return the value
     */
    public String getPeerAutonomousContainerDatabaseDisplayName() {
        return peerAutonomousContainerDatabaseDisplayName;
    }

    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    public enum ProtectionMode implements com.oracle.bmc.http.internal.BmcEnum {
        MaximumAvailability("MAXIMUM_AVAILABILITY"),
        MaximumPerformance("MAXIMUM_PERFORMANCE"),
        ;

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProtectionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProtectionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProtectionMode: " + key);
        }
    };
    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /** The lag time for my preference based on data loss tolerance in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("fastStartFailOverLagLimitInSeconds")
    private final Integer fastStartFailOverLagLimitInSeconds;

    /**
     * The lag time for my preference based on data loss tolerance in seconds.
     *
     * @return the value
     */
    public Integer getFastStartFailOverLagLimitInSeconds() {
        return fastStartFailOverLagLimitInSeconds;
    }

    /**
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard
     * Association
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
    private final Boolean isAutomaticFailoverEnabled;

    /**
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard
     * Association
     *
     * @return the value
     */
    public Boolean getIsAutomaticFailoverEnabled() {
        return isAutomaticFailoverEnabled;
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
     * Autonomous VM cluster for Autonomous Data Guard. Required to enable Data Guard.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousVmClusterId")
    private final String peerAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peer
     * Autonomous VM cluster for Autonomous Data Guard. Required to enable Data Guard.
     *
     * @return the value
     */
    public String getPeerAutonomousVmClusterId() {
        return peerAutonomousVmClusterId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where the standby Autonomous Container Database will be created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseCompartmentId")
    private final String peerAutonomousContainerDatabaseCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where the standby Autonomous Container Database will be created.
     *
     * @return the value
     */
    public String getPeerAutonomousContainerDatabaseCompartmentId() {
        return peerAutonomousContainerDatabaseCompartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseBackupConfig")
    private final PeerAutonomousContainerDatabaseBackupConfig
            peerAutonomousContainerDatabaseBackupConfig;

    public PeerAutonomousContainerDatabaseBackupConfig
            getPeerAutonomousContainerDatabaseBackupConfig() {
        return peerAutonomousContainerDatabaseBackupConfig;
    }

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} of the peer Autonomous Container Database in a
     * Data Guard association is set by Oracle Cloud Infrastructure. Do not specify a value for this
     * parameter. Specifying a value for this field will cause Terraform operations to fail.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbUniqueName")
    private final String peerDbUniqueName;

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} of the peer Autonomous Container Database in a
     * Data Guard association is set by Oracle Cloud Infrastructure. Do not specify a value for this
     * parameter. Specifying a value for this field will cause Terraform operations to fail.
     *
     * @return the value
     */
    public String getPeerDbUniqueName() {
        return peerDbUniqueName;
    }

    /** The OCID of the Autonomous VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
    private final String autonomousVmClusterId;

    /**
     * The OCID of the Autonomous VM Cluster.
     *
     * @return the value
     */
    public String getAutonomousVmClusterId() {
        return autonomousVmClusterId;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Autonomous Container Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Autonomous Container Database.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Database Patch model preference. */
    public enum PatchModel implements com.oracle.bmc.http.internal.BmcEnum {
        ReleaseUpdates("RELEASE_UPDATES"),
        ReleaseUpdateRevisions("RELEASE_UPDATE_REVISIONS"),
        ;

        private final String value;
        private static java.util.Map<String, PatchModel> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchModel v : PatchModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        PatchModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PatchModel: " + key);
        }
    };
    /** Database Patch model preference. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
    private final PatchModel patchModel;

    /**
     * Database Patch model preference.
     *
     * @return the value
     */
    public PatchModel getPatchModel() {
        return patchModel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
    private final MaintenanceWindow maintenanceWindowDetails;

    public MaintenanceWindow getMaintenanceWindowDetails() {
        return maintenanceWindowDetails;
    }

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous
     * Container Database. This value represents the number of days before scheduled maintenance of
     * the primary database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
    private final Integer standbyMaintenanceBufferInDays;

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous
     * Container Database. This value represents the number of days before scheduled maintenance of
     * the primary database.
     *
     * @return the value
     */
    public Integer getStandbyMaintenanceBufferInDays() {
        return standbyMaintenanceBufferInDays;
    }

    /** The next maintenance version preference. */
    public enum VersionPreference implements com.oracle.bmc.http.internal.BmcEnum {
        NextReleaseUpdate("NEXT_RELEASE_UPDATE"),
        LatestReleaseUpdate("LATEST_RELEASE_UPDATE"),
        ;

        private final String value;
        private static java.util.Map<String, VersionPreference> map;

        static {
            map = new java.util.HashMap<>();
            for (VersionPreference v : VersionPreference.values()) {
                map.put(v.getValue(), v);
            }
        }

        VersionPreference(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VersionPreference create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid VersionPreference: " + key);
        }
    };
    /** The next maintenance version preference. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionPreference")
    private final VersionPreference versionPreference;

    /**
     * The next maintenance version preference.
     *
     * @return the value
     */
    public VersionPreference getVersionPreference() {
        return versionPreference;
    }

    /**
     * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous Container
     * Database. If enabled along with Release Update, patching will be done in a Non-Rolling
     * manner.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDstFileUpdateEnabled")
    private final Boolean isDstFileUpdateEnabled;

    /**
     * Indicates if an automatic DST Time Zone file update is enabled for the Autonomous Container
     * Database. If enabled along with Release Update, patching will be done in a Non-Rolling
     * manner.
     *
     * @return the value
     */
    public Boolean getIsDstFileUpdateEnabled() {
        return isDstFileUpdateEnabled;
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

    @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
    private final AutonomousContainerDatabaseBackupConfig backupConfig;

    public AutonomousContainerDatabaseBackupConfig getBackupConfig() {
        return backupConfig;
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
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation. Autonomous Database Serverless
     * does not use key versions, hence is not applicable for Autonomous Database Serverless
     * instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption
     * (TDE) operations KMS Key can have multiple key versions. If none is specified, the current
     * key version (latest) of the Key Id is used for the operation. Autonomous Database Serverless
     * does not use key versions, hence is not applicable for Autonomous Database Serverless
     * instances.
     *
     * @return the value
     */
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code secretId} are required for Customer Managed Keys.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code secretId} are required for Customer Managed Keys.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key
     * store of Oracle Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
    private final String keyStoreId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key
     * store of Oracle Vault.
     *
     * @return the value
     */
    public String getKeyStoreId() {
        return keyStoreId;
    }

    /**
     * The CPU value beyond which an Autonomous Database will be opened across multiple nodes. The
     * default value of this attribute is 16 for OCPUs and 64 for ECPUs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSplitThreshold")
    private final Integer dbSplitThreshold;

    /**
     * The CPU value beyond which an Autonomous Database will be opened across multiple nodes. The
     * default value of this attribute is 16 for OCPUs and 64 for ECPUs.
     *
     * @return the value
     */
    public Integer getDbSplitThreshold() {
        return dbSplitThreshold;
    }

    /**
     * The percentage of CPUs reserved across nodes to support node failover. Allowed values are 0%,
     * 25%, and 50%, with 50% being the default option.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmFailoverReservation")
    private final Integer vmFailoverReservation;

    /**
     * The percentage of CPUs reserved across nodes to support node failover. Allowed values are 0%,
     * 25%, and 50%, with 50% being the default option.
     *
     * @return the value
     */
    public Integer getVmFailoverReservation() {
        return vmFailoverReservation;
    }

    /**
     * Determines whether an Autonomous Database must be opened across a minimum or maximum of
     * nodes. By default, Minimum nodes is selected.
     */
    public enum DistributionAffinity implements com.oracle.bmc.http.internal.BmcEnum {
        MinimumDistribution("MINIMUM_DISTRIBUTION"),
        MaximumDistribution("MAXIMUM_DISTRIBUTION"),
        ;

        private final String value;
        private static java.util.Map<String, DistributionAffinity> map;

        static {
            map = new java.util.HashMap<>();
            for (DistributionAffinity v : DistributionAffinity.values()) {
                map.put(v.getValue(), v);
            }
        }

        DistributionAffinity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DistributionAffinity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DistributionAffinity: " + key);
        }
    };
    /**
     * Determines whether an Autonomous Database must be opened across a minimum or maximum of
     * nodes. By default, Minimum nodes is selected.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distributionAffinity")
    private final DistributionAffinity distributionAffinity;

    /**
     * Determines whether an Autonomous Database must be opened across a minimum or maximum of
     * nodes. By default, Minimum nodes is selected.
     *
     * @return the value
     */
    public DistributionAffinity getDistributionAffinity() {
        return distributionAffinity;
    }

    /**
     * Enabling SHARED server architecture enables a database server to allow many client processes
     * to share very few server processes, thereby increasing the number of supported users.
     */
    public enum NetServicesArchitecture implements com.oracle.bmc.http.internal.BmcEnum {
        Dedicated("DEDICATED"),
        Shared("SHARED"),
        ;

        private final String value;
        private static java.util.Map<String, NetServicesArchitecture> map;

        static {
            map = new java.util.HashMap<>();
            for (NetServicesArchitecture v : NetServicesArchitecture.values()) {
                map.put(v.getValue(), v);
            }
        }

        NetServicesArchitecture(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetServicesArchitecture create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NetServicesArchitecture: " + key);
        }
    };
    /**
     * Enabling SHARED server architecture enables a database server to allow many client processes
     * to share very few server processes, thereby increasing the number of supported users.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("netServicesArchitecture")
    private final NetServicesArchitecture netServicesArchitecture;

    /**
     * Enabling SHARED server architecture enables a database server to allow many client processes
     * to share very few server processes, thereby increasing the number of supported users.
     *
     * @return the value
     */
    public NetServicesArchitecture getNetServicesArchitecture() {
        return netServicesArchitecture;
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
        sb.append("CreateAutonomousContainerDatabaseBase(");
        sb.append("super=").append(super.toString());
        sb.append("customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", okvEndPointGroupName=").append(String.valueOf(this.okvEndPointGroupName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", serviceLevelAgreementType=")
                .append(String.valueOf(this.serviceLevelAgreementType));
        sb.append(", autonomousExadataInfrastructureId=")
                .append(String.valueOf(this.autonomousExadataInfrastructureId));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", databaseSoftwareImageId=")
                .append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(", peerAutonomousExadataInfrastructureId=")
                .append(String.valueOf(this.peerAutonomousExadataInfrastructureId));
        sb.append(", peerAutonomousContainerDatabaseDisplayName=")
                .append(String.valueOf(this.peerAutonomousContainerDatabaseDisplayName));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", fastStartFailOverLagLimitInSeconds=")
                .append(String.valueOf(this.fastStartFailOverLagLimitInSeconds));
        sb.append(", isAutomaticFailoverEnabled=")
                .append(String.valueOf(this.isAutomaticFailoverEnabled));
        sb.append(", peerCloudAutonomousVmClusterId=")
                .append(String.valueOf(this.peerCloudAutonomousVmClusterId));
        sb.append(", peerAutonomousVmClusterId=")
                .append(String.valueOf(this.peerAutonomousVmClusterId));
        sb.append(", peerAutonomousContainerDatabaseCompartmentId=")
                .append(String.valueOf(this.peerAutonomousContainerDatabaseCompartmentId));
        sb.append(", peerAutonomousContainerDatabaseBackupConfig=")
                .append(String.valueOf(this.peerAutonomousContainerDatabaseBackupConfig));
        sb.append(", peerDbUniqueName=").append(String.valueOf(this.peerDbUniqueName));
        sb.append(", autonomousVmClusterId=").append(String.valueOf(this.autonomousVmClusterId));
        sb.append(", cloudAutonomousVmClusterId=")
                .append(String.valueOf(this.cloudAutonomousVmClusterId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", patchModel=").append(String.valueOf(this.patchModel));
        sb.append(", maintenanceWindowDetails=")
                .append(String.valueOf(this.maintenanceWindowDetails));
        sb.append(", standbyMaintenanceBufferInDays=")
                .append(String.valueOf(this.standbyMaintenanceBufferInDays));
        sb.append(", versionPreference=").append(String.valueOf(this.versionPreference));
        sb.append(", isDstFileUpdateEnabled=").append(String.valueOf(this.isDstFileUpdateEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", backupConfig=").append(String.valueOf(this.backupConfig));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", keyStoreId=").append(String.valueOf(this.keyStoreId));
        sb.append(", dbSplitThreshold=").append(String.valueOf(this.dbSplitThreshold));
        sb.append(", vmFailoverReservation=").append(String.valueOf(this.vmFailoverReservation));
        sb.append(", distributionAffinity=").append(String.valueOf(this.distributionAffinity));
        sb.append(", netServicesArchitecture=")
                .append(String.valueOf(this.netServicesArchitecture));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousContainerDatabaseBase)) {
            return false;
        }

        CreateAutonomousContainerDatabaseBase other = (CreateAutonomousContainerDatabaseBase) o;
        return java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(this.okvEndPointGroupName, other.okvEndPointGroupName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(
                        this.serviceLevelAgreementType, other.serviceLevelAgreementType)
                && java.util.Objects.equals(
                        this.autonomousExadataInfrastructureId,
                        other.autonomousExadataInfrastructureId)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(
                        this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && java.util.Objects.equals(
                        this.peerAutonomousExadataInfrastructureId,
                        other.peerAutonomousExadataInfrastructureId)
                && java.util.Objects.equals(
                        this.peerAutonomousContainerDatabaseDisplayName,
                        other.peerAutonomousContainerDatabaseDisplayName)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(
                        this.fastStartFailOverLagLimitInSeconds,
                        other.fastStartFailOverLagLimitInSeconds)
                && java.util.Objects.equals(
                        this.isAutomaticFailoverEnabled, other.isAutomaticFailoverEnabled)
                && java.util.Objects.equals(
                        this.peerCloudAutonomousVmClusterId, other.peerCloudAutonomousVmClusterId)
                && java.util.Objects.equals(
                        this.peerAutonomousVmClusterId, other.peerAutonomousVmClusterId)
                && java.util.Objects.equals(
                        this.peerAutonomousContainerDatabaseCompartmentId,
                        other.peerAutonomousContainerDatabaseCompartmentId)
                && java.util.Objects.equals(
                        this.peerAutonomousContainerDatabaseBackupConfig,
                        other.peerAutonomousContainerDatabaseBackupConfig)
                && java.util.Objects.equals(this.peerDbUniqueName, other.peerDbUniqueName)
                && java.util.Objects.equals(this.autonomousVmClusterId, other.autonomousVmClusterId)
                && java.util.Objects.equals(
                        this.cloudAutonomousVmClusterId, other.cloudAutonomousVmClusterId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.patchModel, other.patchModel)
                && java.util.Objects.equals(
                        this.maintenanceWindowDetails, other.maintenanceWindowDetails)
                && java.util.Objects.equals(
                        this.standbyMaintenanceBufferInDays, other.standbyMaintenanceBufferInDays)
                && java.util.Objects.equals(this.versionPreference, other.versionPreference)
                && java.util.Objects.equals(
                        this.isDstFileUpdateEnabled, other.isDstFileUpdateEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.backupConfig, other.backupConfig)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.keyStoreId, other.keyStoreId)
                && java.util.Objects.equals(this.dbSplitThreshold, other.dbSplitThreshold)
                && java.util.Objects.equals(this.vmFailoverReservation, other.vmFailoverReservation)
                && java.util.Objects.equals(this.distributionAffinity, other.distributionAffinity)
                && java.util.Objects.equals(
                        this.netServicesArchitecture, other.netServicesArchitecture)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.customerContacts == null ? 43 : this.customerContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.okvEndPointGroupName == null
                                ? 43
                                : this.okvEndPointGroupName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceLevelAgreementType == null
                                ? 43
                                : this.serviceLevelAgreementType.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousExadataInfrastructureId == null
                                ? 43
                                : this.autonomousExadataInfrastructureId.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAutonomousExadataInfrastructureId == null
                                ? 43
                                : this.peerAutonomousExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAutonomousContainerDatabaseDisplayName == null
                                ? 43
                                : this.peerAutonomousContainerDatabaseDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.fastStartFailOverLagLimitInSeconds == null
                                ? 43
                                : this.fastStartFailOverLagLimitInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutomaticFailoverEnabled == null
                                ? 43
                                : this.isAutomaticFailoverEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.peerCloudAutonomousVmClusterId == null
                                ? 43
                                : this.peerCloudAutonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAutonomousVmClusterId == null
                                ? 43
                                : this.peerAutonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAutonomousContainerDatabaseCompartmentId == null
                                ? 43
                                : this.peerAutonomousContainerDatabaseCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAutonomousContainerDatabaseBackupConfig == null
                                ? 43
                                : this.peerAutonomousContainerDatabaseBackupConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.peerDbUniqueName == null ? 43 : this.peerDbUniqueName.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousVmClusterId == null
                                ? 43
                                : this.autonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAutonomousVmClusterId == null
                                ? 43
                                : this.cloudAutonomousVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.patchModel == null ? 43 : this.patchModel.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindowDetails == null
                                ? 43
                                : this.maintenanceWindowDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.standbyMaintenanceBufferInDays == null
                                ? 43
                                : this.standbyMaintenanceBufferInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.versionPreference == null ? 43 : this.versionPreference.hashCode());
        result =
                (result * PRIME)
                        + (this.isDstFileUpdateEnabled == null
                                ? 43
                                : this.isDstFileUpdateEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.backupConfig == null ? 43 : this.backupConfig.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.keyStoreId == null ? 43 : this.keyStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSplitThreshold == null ? 43 : this.dbSplitThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.vmFailoverReservation == null
                                ? 43
                                : this.vmFailoverReservation.hashCode());
        result =
                (result * PRIME)
                        + (this.distributionAffinity == null
                                ? 43
                                : this.distributionAffinity.hashCode());
        result =
                (result * PRIME)
                        + (this.netServicesArchitecture == null
                                ? 43
                                : this.netServicesArchitecture.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The source of the database. Use {@code NONE} to create a new Autonomous Container Database
     * (ACD). Use {@code BACKUP_FROM_ID} to create a new ACD from a specified backup.
     */
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        BackupFromId("BACKUP_FROM_ID"),
        ;

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                map.put(v.getValue(), v);
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Source: " + key);
        }
    };
}
