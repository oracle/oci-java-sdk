/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create an Oracle Autonomous Database.
 * <p>
 **Notes:**
 * - To specify OCPU core count, you must use either {@code ocpuCount} or {@code cpuCoreCount}. You cannot use both parameters at the same time. For Autonomous Database Serverless instances, {@code ocpuCount} is not used.
 * - To specify a storage allocation, you must use  either {@code dataStorageSizeInGBs} or {@code dataStorageSizeInTBs}.
 * - See the individual parameter discriptions for more information on the OCPU and storage value parameters.
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source",
    defaultImpl = CreateAutonomousDatabaseBase.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateAutonomousDatabaseCloneDetails.class,
        name = "DATABASE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateRefreshableAutonomousDatabaseCloneDetails.class,
        name = "CLONE_TO_REFRESHABLE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateAutonomousDatabaseFromBackupDetails.class,
        name = "BACKUP_FROM_ID"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateCrossRegionDisasterRecoveryDetails.class,
        name = "CROSS_REGION_DISASTER_RECOVERY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateAutonomousDatabaseFromBackupTimestampDetails.class,
        name = "BACKUP_FROM_TIMESTAMP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateCrossRegionAutonomousDatabaseDataGuardDetails.class,
        name = "CROSS_REGION_DATAGUARD"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateAutonomousDatabaseDetails.class,
        name = "NONE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateAutonomousDatabaseBase
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "characterSet",
        "ncharacterSet",
        "dbName",
        "cpuCoreCount",
        "backupRetentionPeriodInDays",
        "computeModel",
        "computeCount",
        "ocpuCount",
        "dbWorkload",
        "dataStorageSizeInTBs",
        "dataStorageSizeInGBs",
        "isFreeTier",
        "kmsKeyId",
        "vaultId",
        "adminPassword",
        "displayName",
        "licenseModel",
        "isPreviewVersionWithServiceTermsAccepted",
        "isAutoScalingEnabled",
        "isDevTier",
        "isDedicated",
        "autonomousContainerDatabaseId",
        "inMemoryPercentage",
        "isAccessControlEnabled",
        "whitelistedIps",
        "arePrimaryWhitelistedIpsUsed",
        "standbyWhitelistedIps",
        "isDataGuardEnabled",
        "isLocalDataGuardEnabled",
        "subnetId",
        "nsgIds",
        "privateEndpointLabel",
        "freeformTags",
        "definedTags",
        "privateEndpointIp",
        "dbVersion",
        "customerContacts",
        "isMtlsConnectionRequired",
        "resourcePoolLeaderId",
        "resourcePoolSummary",
        "autonomousMaintenanceScheduleType",
        "scheduledOperations",
        "isAutoScalingForStorageEnabled",
        "databaseEdition",
        "dbToolsDetails",
        "secretId",
        "secretVersionNumber"
    })
    protected CreateAutonomousDatabaseBase(
            String compartmentId,
            String characterSet,
            String ncharacterSet,
            String dbName,
            Integer cpuCoreCount,
            Integer backupRetentionPeriodInDays,
            ComputeModel computeModel,
            Float computeCount,
            Float ocpuCount,
            DbWorkload dbWorkload,
            Integer dataStorageSizeInTBs,
            Integer dataStorageSizeInGBs,
            Boolean isFreeTier,
            String kmsKeyId,
            String vaultId,
            String adminPassword,
            String displayName,
            LicenseModel licenseModel,
            Boolean isPreviewVersionWithServiceTermsAccepted,
            Boolean isAutoScalingEnabled,
            Boolean isDevTier,
            Boolean isDedicated,
            String autonomousContainerDatabaseId,
            Integer inMemoryPercentage,
            Boolean isAccessControlEnabled,
            java.util.List<String> whitelistedIps,
            Boolean arePrimaryWhitelistedIpsUsed,
            java.util.List<String> standbyWhitelistedIps,
            Boolean isDataGuardEnabled,
            Boolean isLocalDataGuardEnabled,
            String subnetId,
            java.util.List<String> nsgIds,
            String privateEndpointLabel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String privateEndpointIp,
            String dbVersion,
            java.util.List<CustomerContact> customerContacts,
            Boolean isMtlsConnectionRequired,
            String resourcePoolLeaderId,
            ResourcePoolSummary resourcePoolSummary,
            AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType,
            java.util.List<ScheduledOperationDetails> scheduledOperations,
            Boolean isAutoScalingForStorageEnabled,
            AutonomousDatabaseSummary.DatabaseEdition databaseEdition,
            java.util.List<DatabaseTool> dbToolsDetails,
            String secretId,
            Integer secretVersionNumber) {
        super();
        this.compartmentId = compartmentId;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.dbName = dbName;
        this.cpuCoreCount = cpuCoreCount;
        this.backupRetentionPeriodInDays = backupRetentionPeriodInDays;
        this.computeModel = computeModel;
        this.computeCount = computeCount;
        this.ocpuCount = ocpuCount;
        this.dbWorkload = dbWorkload;
        this.dataStorageSizeInTBs = dataStorageSizeInTBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.isFreeTier = isFreeTier;
        this.kmsKeyId = kmsKeyId;
        this.vaultId = vaultId;
        this.adminPassword = adminPassword;
        this.displayName = displayName;
        this.licenseModel = licenseModel;
        this.isPreviewVersionWithServiceTermsAccepted = isPreviewVersionWithServiceTermsAccepted;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.isDevTier = isDevTier;
        this.isDedicated = isDedicated;
        this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
        this.inMemoryPercentage = inMemoryPercentage;
        this.isAccessControlEnabled = isAccessControlEnabled;
        this.whitelistedIps = whitelistedIps;
        this.arePrimaryWhitelistedIpsUsed = arePrimaryWhitelistedIpsUsed;
        this.standbyWhitelistedIps = standbyWhitelistedIps;
        this.isDataGuardEnabled = isDataGuardEnabled;
        this.isLocalDataGuardEnabled = isLocalDataGuardEnabled;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.privateEndpointLabel = privateEndpointLabel;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.privateEndpointIp = privateEndpointIp;
        this.dbVersion = dbVersion;
        this.customerContacts = customerContacts;
        this.isMtlsConnectionRequired = isMtlsConnectionRequired;
        this.resourcePoolLeaderId = resourcePoolLeaderId;
        this.resourcePoolSummary = resourcePoolSummary;
        this.autonomousMaintenanceScheduleType = autonomousMaintenanceScheduleType;
        this.scheduledOperations = scheduledOperations;
        this.isAutoScalingForStorageEnabled = isAutoScalingForStorageEnabled;
        this.databaseEdition = databaseEdition;
        this.dbToolsDetails = dbToolsDetails;
        this.secretId = secretId;
        this.secretVersionNumber = secretVersionNumber;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment of the Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment of the Autonomous Database.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The character set for the autonomous database. The default is AL32UTF8. Allowed values for an Autonomous Database Serverless instance as as returned by [List Autonomous Database Character Sets](https://docs.oracle.com/iaas/autonomous-database-serverless/doc/autonomous-character-set-selection.html)
     * <p>
     * For an Autonomous Database on dedicated infrastructure, the allowed values are:
     * <p>
     * AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6, AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707, AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775, BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U, CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250, EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851, EL8PC869, ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8, IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE, JA16VMS, KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921, LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10, NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII, TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258, VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S, WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8, ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950, ZHT32EUC, ZHT32SOPS, ZHT32TRIS
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the autonomous database. The default is AL32UTF8. Allowed values for an Autonomous Database Serverless instance as as returned by [List Autonomous Database Character Sets](https://docs.oracle.com/iaas/autonomous-database-serverless/doc/autonomous-character-set-selection.html)
     * <p>
     * For an Autonomous Database on dedicated infrastructure, the allowed values are:
     * <p>
     * AL32UTF8, AR8ADOS710, AR8ADOS720, AR8APTEC715, AR8ARABICMACS, AR8ASMO8X, AR8ISO8859P6, AR8MSWIN1256, AR8MUSSAD768, AR8NAFITHA711, AR8NAFITHA721, AR8SAKHR706, AR8SAKHR707, AZ8ISO8859P9E, BG8MSWIN, BG8PC437S, BLT8CP921, BLT8ISO8859P13, BLT8MSWIN1257, BLT8PC775, BN8BSCII, CDN8PC863, CEL8ISO8859P14, CL8ISO8859P5, CL8ISOIR111, CL8KOI8R, CL8KOI8U, CL8MACCYRILLICS, CL8MSWIN1251, EE8ISO8859P2, EE8MACCES, EE8MACCROATIANS, EE8MSWIN1250, EE8PC852, EL8DEC, EL8ISO8859P7, EL8MACGREEKS, EL8MSWIN1253, EL8PC437S, EL8PC851, EL8PC869, ET8MSWIN923, HU8ABMOD, HU8CWI2, IN8ISCII, IS8PC861, IW8ISO8859P8, IW8MACHEBREWS, IW8MSWIN1255, IW8PC1507, JA16EUC, JA16EUCTILDE, JA16SJIS, JA16SJISTILDE, JA16VMS, KO16KSC5601, KO16KSCCS, KO16MSWIN949, LA8ISO6937, LA8PASSPORT, LT8MSWIN921, LT8PC772, LT8PC774, LV8PC1117, LV8PC8LR, LV8RST104090, N8PC865, NE8ISO8859P10, NEE8ISO8859P4, RU8BESTA, RU8PC855, RU8PC866, SE8ISO8859P3, TH8MACTHAIS, TH8TISASCII, TR8DEC, TR8MACTURKISHS, TR8MSWIN1254, TR8PC857, US7ASCII, US8PC437, UTF8, VN8MSWIN1258, VN8VN3, WE8DEC, WE8DG, WE8ISO8859P1, WE8ISO8859P15, WE8ISO8859P9, WE8MACROMAN8S, WE8MSWIN1252, WE8NCR4970, WE8NEXTSTEP, WE8PC850, WE8PC858, WE8PC860, WE8ROMAN8, ZHS16CGB231280, ZHS16GBK, ZHT16BIG5, ZHT16CCDC, ZHT16DBT, ZHT16HKSCS, ZHT16MSWIN950, ZHT32EUC, ZHT32SOPS, ZHT32TRIS
     *
     * @return the value
     **/
    public String getCharacterSet() {
        return characterSet;
    }

    /**
     * The character set for the Autonomous Database. The default is AL32UTF8. Use [List Autonomous Database Character Sets](https://docs.oracle.com/iaas/autonomous-database-serverless/doc/autonomous-character-set-selection.html) to list the allowed values for an Autonomous Database Serverless instance.
     * For an Autonomous Database on dedicated Exadata infrastructure, the allowed values are:
     * AL16UTF16 or UTF8.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The character set for the Autonomous Database. The default is AL32UTF8. Use [List Autonomous Database Character Sets](https://docs.oracle.com/iaas/autonomous-database-serverless/doc/autonomous-character-set-selection.html) to list the allowed values for an Autonomous Database Serverless instance.
     * For an Autonomous Database on dedicated Exadata infrastructure, the allowed values are:
     * AL16UTF16 or UTF8.
     *
     * @return the value
     **/
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /**
     * The database name. The name must begin with an alphabetic character and can contain a maximum of 30 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy. It is required in all cases except when creating a cross-region Autonomous Data Guard standby instance or a cross-region disaster recovery standby instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The database name. The name must begin with an alphabetic character and can contain a maximum of 30 alphanumeric characters. Special characters are not permitted. The database name must be unique in the tenancy. It is required in all cases except when creating a cross-region Autonomous Data Guard standby instance or a cross-region disaster recovery standby instance.
     * @return the value
     **/
    public String getDbName() {
        return dbName;
    }

    /**
     * The number of CPU cores to be made available to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code ocpuCount} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU cores to be made available to the database. For Autonomous Databases on dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code ocpuCount} parameter.
     *
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * Retention period, in days, for long-term backups
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupRetentionPeriodInDays")
    private final Integer backupRetentionPeriodInDays;

    /**
     * Retention period, in days, for long-term backups
     * @return the value
     **/
    public Integer getBackupRetentionPeriodInDays() {
        return backupRetentionPeriodInDays;
    }

    /**
     * The compute model of the Autonomous Database. This is required if using the {@code computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code computeModel} to a non-null value. ECPU compute model is the recommended model and OCPU compute model is legacy.
     **/
    public enum ComputeModel {
        Ecpu("ECPU"),
        Ocpu("OCPU"),
        ;

        private final String value;
        private static java.util.Map<String, ComputeModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ComputeModel v : ComputeModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        ComputeModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ComputeModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ComputeModel: " + key);
        }
    };
    /**
     * The compute model of the Autonomous Database. This is required if using the {@code computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code computeModel} to a non-null value. ECPU compute model is the recommended model and OCPU compute model is legacy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final ComputeModel computeModel;

    /**
     * The compute model of the Autonomous Database. This is required if using the {@code computeCount} parameter. If using {@code cpuCoreCount} then it is an error to specify {@code computeModel} to a non-null value. ECPU compute model is the recommended model and OCPU compute model is legacy.
     * @return the value
     **/
    public ComputeModel getComputeModel() {
        return computeModel;
    }

    /**
     * The compute amount (CPUs) available to the database. Minimum and maximum values depend on the compute model and whether the database is an Autonomous Database Serverless instance or an Autonomous Database on Dedicated Exadata Infrastructure.
     * For an Autonomous Database Serverless instance, the 'ECPU' compute model requires a minimum value of one, for databases in the elastic resource pool and minimum value of two, otherwise. Required when using the {@code computeModel} parameter. When using {@code cpuCoreCount} parameter, it is an error to specify computeCount to a non-null value. Providing {@code computeModel} and {@code computeCount} is the preferred method for both OCPU and ECPU.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeCount")
    private final Float computeCount;

    /**
     * The compute amount (CPUs) available to the database. Minimum and maximum values depend on the compute model and whether the database is an Autonomous Database Serverless instance or an Autonomous Database on Dedicated Exadata Infrastructure.
     * For an Autonomous Database Serverless instance, the 'ECPU' compute model requires a minimum value of one, for databases in the elastic resource pool and minimum value of two, otherwise. Required when using the {@code computeModel} parameter. When using {@code cpuCoreCount} parameter, it is an error to specify computeCount to a non-null value. Providing {@code computeModel} and {@code computeCount} is the preferred method for both OCPU and ECPU.
     *
     * @return the value
     **/
    public Float getComputeCount() {
        return computeCount;
    }

    /**
     * The number of OCPU cores to be made available to the database.
     * <p>
     * The following points apply:
     * - For Autonomous Databases on Dedicated Exadata infrastructure, to provision less than 1 core, enter a fractional value in an increment of 0.1. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. (Note that fractional OCPU values are not supported for Autonomous Database Serverless instances.)
     * - To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available for the infrastructure shape. For example, you can provision 2 cores or 3 cores, but not 2.5 cores. This applies to an Autonomous Database Serverless instance or an Autonomous Database on Dedicated Exadata Infrastructure.
     * - For Autonomous Database Serverless instances, this parameter is not used.
     * <p>
     * For Autonomous Databases on Dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Float ocpuCount;

    /**
     * The number of OCPU cores to be made available to the database.
     * <p>
     * The following points apply:
     * - For Autonomous Databases on Dedicated Exadata infrastructure, to provision less than 1 core, enter a fractional value in an increment of 0.1. For example, you can provision 0.3 or 0.4 cores, but not 0.35 cores. (Note that fractional OCPU values are not supported for Autonomous Database Serverless instances.)
     * - To provision 1 or more cores, you must enter an integer between 1 and the maximum number of cores available for the infrastructure shape. For example, you can provision 2 cores or 3 cores, but not 2.5 cores. This applies to an Autonomous Database Serverless instance or an Autonomous Database on Dedicated Exadata Infrastructure.
     * - For Autonomous Database Serverless instances, this parameter is not used.
     * <p>
     * For Autonomous Databases on Dedicated Exadata infrastructure, the maximum number of cores is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Note:** This parameter cannot be used with the {@code cpuCoreCount} parameter.
     *
     * @return the value
     **/
    public Float getOcpuCount() {
        return ocpuCount;
    }

    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
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
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
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
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     **/
    public DbWorkload getDbWorkload() {
        return dbWorkload;
    }

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database. This storage can later be scaled up if needed. For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * A full Exadata service is allocated when the Autonomous Database size is set to the upper limit (384 TB).
     * <p>
     **Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    private final Integer dataStorageSizeInTBs;

    /**
     * The size, in terabytes, of the data volume that will be created and attached to the database. This storage can later be scaled up if needed. For Autonomous Databases on dedicated Exadata infrastructure, the maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * A full Exadata service is allocated when the Autonomous Database size is set to the upper limit (384 TB).
     * <p>
     **Note:** This parameter cannot be used with the {@code dataStorageSizeInGBs} parameter.
     *
     * @return the value
     **/
    public Integer getDataStorageSizeInTBs() {
        return dataStorageSizeInTBs;
    }

    /**
     * The size, in gigabytes, of the data volume that will be created and attached to the database. This storage can later be scaled up if needed. The maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Notes**
     * - This parameter is only supported for dedicated Exadata infrastructure.
     * - This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * The size, in gigabytes, of the data volume that will be created and attached to the database. This storage can later be scaled up if needed. The maximum storage value is determined by the infrastructure shape. See [Characteristics of Infrastructure Shapes](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/autonomous-database&id=ATPFG-GUID-B0F033C1-CC5A-42F0-B2E7-3CECFEDA1FD1) for shape details.
     * <p>
     **Notes**
     * - This parameter is only supported for dedicated Exadata infrastructure.
     * - This parameter cannot be used with the {@code dataStorageSizeInTBs} parameter.
     *
     * @return the value
     **/
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isLocalDataGuardEnabled
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFreeTier")
    private final Boolean isFreeTier;

    /**
     * Indicates if this is an Always Free resource. The default value is false. Note that Always Free Autonomous Databases have 1 CPU and 20GB of memory. For Always Free databases, memory and CPU cannot be scaled.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isLocalDataGuardEnabled
     *
     * @return the value
     **/
    public Boolean getIsFreeTier() {
        return isFreeTier;
    }

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts). This parameter and {@code secretId} are required for Customer Managed Keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts). This parameter and {@code secretId} are required for Customer Managed Keys.
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * **Important** The {@code adminPassword} or {@code secretId} must be specified for all Autonomous Databases except for refreshable clones. The password must be between 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing.
     * <p>
     * This cannot be used in conjunction with with OCI vault secrets (secretId).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final String adminPassword;

    /**
     * **Important** The {@code adminPassword} or {@code secretId} must be specified for all Autonomous Databases except for refreshable clones. The password must be between 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character. It cannot contain the double quote symbol (") or the username "admin", regardless of casing.
     * <p>
     * This cannot be used in conjunction with with OCI vault secrets (secretId).
     *
     * @return the value
     **/
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Autonomous Database. The name does not have to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Oracle Database service.
     * Note that when provisioning an [Autonomous Database on dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null. It is already set at the
     * Autonomous Exadata Infrastructure level. When provisioning an [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}. Bring your own license (BYOL) also allows you to select the DB edition using the optional parameter.
     * <p>
     * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
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
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Oracle Database service.
     * Note that when provisioning an [Autonomous Database on dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null. It is already set at the
     * Autonomous Exadata Infrastructure level. When provisioning an [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}. Bring your own license (BYOL) also allows you to select the DB edition using the optional parameter.
     * <p>
     * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the Oracle Autonomous Database. Bring your own license (BYOL) allows you to apply your current on-premises Oracle software licenses to equivalent, highly automated Oracle services in the cloud.
     * License Included allows you to subscribe to new Oracle Database software licenses and the Oracle Database service.
     * Note that when provisioning an [Autonomous Database on dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html), this attribute must be null. It is already set at the
     * Autonomous Exadata Infrastructure level. When provisioning an [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) database, if a value is not specified, the system defaults the value to {@code BRING_YOUR_OWN_LICENSE}. Bring your own license (BYOL) also allows you to select the DB edition using the optional parameter.
     * <p>
     * This cannot be updated in parallel with any of the following: cpuCoreCount, computeCount, dataStorageSizeInTBs, adminPassword, isMTLSConnectionRequired, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     * @return the value
     **/
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * If set to {@code TRUE}, indicates that an Autonomous Database preview version is being provisioned, and that the preview version's terms of service have been accepted. Note that preview version software is only available for Autonomous Database Serverless instances (https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreviewVersionWithServiceTermsAccepted")
    private final Boolean isPreviewVersionWithServiceTermsAccepted;

    /**
     * If set to {@code TRUE}, indicates that an Autonomous Database preview version is being provisioned, and that the preview version's terms of service have been accepted. Note that preview version software is only available for Autonomous Database Serverless instances (https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/).
     *
     * @return the value
     **/
    public Boolean getIsPreviewVersionWithServiceTermsAccepted() {
        return isPreviewVersionWithServiceTermsAccepted;
    }

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database CPU core count. The default value is {@code TRUE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Indicates if auto scaling is enabled for the Autonomous Database CPU core count. The default value is {@code TRUE}.
     *
     * @return the value
     **/
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
    }

    /**
     * Autonomous Database for Developers are free Autonomous Databases that developers can use to build and test new applications.With Autonomous these database instancess instances, you can try new Autonomous Database features for free and apply them to ongoing or new development projects. Developer database comes with limited resources and is, therefore, not suitable for large-scale testing and production deployments. When you need more compute or storage resources, you can transition to a paid database licensing by cloning your developer database into a regular Autonomous Database. See [Autonomous Database documentation](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/eddjo/index.html) for more details.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDevTier")
    private final Boolean isDevTier;

    /**
     * Autonomous Database for Developers are free Autonomous Databases that developers can use to build and test new applications.With Autonomous these database instancess instances, you can try new Autonomous Database features for free and apply them to ongoing or new development projects. Developer database comes with limited resources and is, therefore, not suitable for large-scale testing and production deployments. When you need more compute or storage resources, you can transition to a paid database licensing by cloning your developer database into a regular Autonomous Database. See [Autonomous Database documentation](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/eddjo/index.html) for more details.
     *
     * @return the value
     **/
    public Boolean getIsDevTier() {
        return isDevTier;
    }

    /**
     * True if the database is on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
    private final Boolean isDedicated;

    /**
     * True if the database is on [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     *
     * @return the value
     **/
    public Boolean getIsDedicated() {
        return isDedicated;
    }

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). Used only by Autonomous Database on Dedicated Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
    private final String autonomousContainerDatabaseId;

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). Used only by Autonomous Database on Dedicated Exadata Infrastructure.
     * @return the value
     **/
    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
    }

    /**
     * The percentage of the System Global Area(SGA) assigned to In-Memory tables in Autonomous Database. This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inMemoryPercentage")
    private final Integer inMemoryPercentage;

    /**
     * The percentage of the System Global Area(SGA) assigned to In-Memory tables in Autonomous Database. This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform.
     * @return the value
     **/
    public Integer getInMemoryPercentage() {
        return inMemoryPercentage;
    }

    /**
     * Indicates if the database-level access control is enabled.
     * If disabled, database access is defined by the network security rules.
     * If enabled, database access is restricted to the IP addresses defined by the rules specified with the {@code whitelistedIps} property. While specifying {@code whitelistedIps} rules is optional,
     *  if database-level access control is enabled and no rules are specified, the database will become inaccessible. The rules can be added later using the {@code UpdateAutonomousDatabase} API operation or edit option in console.
     * When creating a database clone, the desired access control setting should be specified. By default, database-level access control will be disabled for the clone.
     * <p>
     * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform. For Autonomous Database Serverless instances, {@code whitelistedIps} is used.
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
     * This property is applicable only to Autonomous Databases on the Exadata Cloud@Customer platform. For Autonomous Database Serverless instances, {@code whitelistedIps} is used.
     *
     * @return the value
     **/
    public Boolean getIsAccessControlEnabled() {
        return isAccessControlEnabled;
    }

    /**
     * The client IP access control list (ACL). This feature is available for [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE' then Autonomous Database uses this primary's IP access control list (ACL) for the disaster recovery peer called {@code standbywhitelistedips}.
     * <p>
     * For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID).
     * Multiple IPs and VCN OCIDs should be separate strings separated by commas, but if it\u2019s other configurations that need multiple pieces of information then its each piece is connected with semicolon (;) as a delimiter.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("whitelistedIps")
    private final java.util.List<String> whitelistedIps;

    /**
     * The client IP access control list (ACL). This feature is available for [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE' then Autonomous Database uses this primary's IP access control list (ACL) for the disaster recovery peer called {@code standbywhitelistedips}.
     * <p>
     * For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID).
     * Multiple IPs and VCN OCIDs should be separate strings separated by commas, but if it\u2019s other configurations that need multiple pieces of information then its each piece is connected with semicolon (;) as a delimiter.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     **/
    public java.util.List<String> getWhitelistedIps() {
        return whitelistedIps;
    }

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
     * It's value would be {@code TRUE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses primary IP access control list (ACL) for standby.
     * It's value would be {@code FALSE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses different IP access control list (ACL) for standby compared to primary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arePrimaryWhitelistedIpsUsed")
    private final Boolean arePrimaryWhitelistedIpsUsed;

    /**
     * This field will be null if the Autonomous Database is not Data Guard enabled or Access Control is disabled.
     * It's value would be {@code TRUE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses primary IP access control list (ACL) for standby.
     * It's value would be {@code FALSE} if Autonomous Database is Data Guard enabled and Access Control is enabled and if the Autonomous Database uses different IP access control list (ACL) for standby compared to primary.
     *
     * @return the value
     **/
    public Boolean getArePrimaryWhitelistedIpsUsed() {
        return arePrimaryWhitelistedIpsUsed;
    }

    /**
     * The client IP access control list (ACL). This feature is available for [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE' then Autonomous Database uses this primary's IP access control list (ACL) for the disaster recovery peer called {@code standbywhitelistedips}.
     * <p>
     * For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID).
     * Multiple IPs and VCN OCIDs should be separate strings separated by commas, but if it\u2019s other configurations that need multiple pieces of information then its each piece is connected with semicolon (;) as a delimiter.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standbyWhitelistedIps")
    private final java.util.List<String> standbyWhitelistedIps;

    /**
     * The client IP access control list (ACL). This feature is available for [Autonomous Database Serverless] (https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html) and on Exadata Cloud@Customer.
     * Only clients connecting from an IP address included in the ACL may access the Autonomous Database instance.
     * If {@code arePrimaryWhitelistedIpsUsed} is 'TRUE' then Autonomous Database uses this primary's IP access control list (ACL) for the disaster recovery peer called {@code standbywhitelistedips}.
     * <p>
     * For Autonomous Database Serverless, this is an array of CIDR (classless inter-domain routing) notations for a subnet or VCN OCID (virtual cloud network Oracle Cloud ID).
     * Multiple IPs and VCN OCIDs should be separate strings separated by commas, but if it\u2019s other configurations that need multiple pieces of information then its each piece is connected with semicolon (;) as a delimiter.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","ocid1.vcn.oc1.sea.<unique_id>","ocid1.vcn.oc1.sea.<unique_id1>;1.1.1.1","ocid1.vcn.oc1.sea.<unique_id2>;1.1.0.0/16"]}
     * For Exadata Cloud@Customer, this is an array of IP addresses or CIDR notations.
     * Example: {@code ["1.1.1.1","1.1.1.0/24","1.1.2.25"]}
     * <p>
     * For an update operation, if you want to delete all the IPs in the ACL, use an array with a single empty string entry.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     **/
    public java.util.List<String> getStandbyWhitelistedIps() {
        return standbyWhitelistedIps;
    }

    /**
     * **Deprecated.** Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDataGuardEnabled")
    private final Boolean isDataGuardEnabled;

    /**
     * **Deprecated.** Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     *
     * @return the value
     **/
    public Boolean getIsDataGuardEnabled() {
        return isDataGuardEnabled;
    }

    /**
     * Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalDataGuardEnabled")
    private final Boolean isLocalDataGuardEnabled;

    /**
     * Indicates whether the Autonomous Database has local (in-region) Data Guard enabled. Not applicable to cross-region Autonomous Data Guard associations, or to Autonomous Databases using dedicated Exadata infrastructure or Exadata Cloud@Customer infrastructure.
     * @return the value
     **/
    public Boolean getIsLocalDataGuardEnabled() {
        return isLocalDataGuardEnabled;
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
     * The resource's private endpoint label.
     * - Setting the endpoint label to a non-empty string creates a private endpoint database.
     * - Resetting the endpoint label to an empty string, after the creation of the private endpoint database, changes the private endpoint database to a public endpoint database.
     * - Setting the endpoint label to a non-empty string value, updates to a new private endpoint database, when the database is disabled and re-enabled.
     * <p>
     * This setting cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointLabel")
    private final String privateEndpointLabel;

    /**
     * The resource's private endpoint label.
     * - Setting the endpoint label to a non-empty string creates a private endpoint database.
     * - Resetting the endpoint label to an empty string, after the creation of the private endpoint database, changes the private endpoint database to a public endpoint database.
     * - Setting the endpoint label to a non-empty string value, updates to a new private endpoint database, when the database is disabled and re-enabled.
     * <p>
     * This setting cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, dbWorkload, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, or isFreeTier.
     *
     * @return the value
     **/
    public String getPrivateEndpointLabel() {
        return privateEndpointLabel;
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
     * Customer Contacts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
    private final java.util.List<CustomerContact> customerContacts;

    /**
     * Customer Contacts.
     * @return the value
     **/
    public java.util.List<CustomerContact> getCustomerContacts() {
        return customerContacts;
    }

    /**
     * Specifies if the Autonomous Database requires mTLS connections.
     * <p>
     * This may not be updated in parallel with any of the following: licenseModel, databaseEdition, cpuCoreCount, computeCount, dataStorageSizeInTBs, whitelistedIps, openMode, permissionLevel, db-workload, privateEndpointLabel, nsgIds, customerContacts, dbVersion, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     * <p>
     * Service Change: The default value of the isMTLSConnectionRequired attribute will change from true to false on July 1, 2023 in the following APIs:
     * - CreateAutonomousDatabase
     * - GetAutonomousDatabase
     * - UpdateAutonomousDatabase
     * Details: Prior to the July 1, 2023 change, the isMTLSConnectionRequired attribute default value was true. This applies to Autonomous Database Serverless.
     * Does this impact me? If you use or maintain custom scripts or Terraform scripts referencing the CreateAutonomousDatabase, GetAutonomousDatabase, or UpdateAutonomousDatabase APIs, you want to check, and possibly modify, the scripts for the changed default value of the attribute. Should you choose not to leave your scripts unchanged, the API calls containing this attribute will continue to work, but the default value will switch from true to false.
     * How do I make this change? Using either OCI SDKs or command line tools, update your custom scripts to explicitly set the isMTLSConnectionRequired attribute to true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConnectionRequired")
    private final Boolean isMtlsConnectionRequired;

    /**
     * Specifies if the Autonomous Database requires mTLS connections.
     * <p>
     * This may not be updated in parallel with any of the following: licenseModel, databaseEdition, cpuCoreCount, computeCount, dataStorageSizeInTBs, whitelistedIps, openMode, permissionLevel, db-workload, privateEndpointLabel, nsgIds, customerContacts, dbVersion, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     * <p>
     * Service Change: The default value of the isMTLSConnectionRequired attribute will change from true to false on July 1, 2023 in the following APIs:
     * - CreateAutonomousDatabase
     * - GetAutonomousDatabase
     * - UpdateAutonomousDatabase
     * Details: Prior to the July 1, 2023 change, the isMTLSConnectionRequired attribute default value was true. This applies to Autonomous Database Serverless.
     * Does this impact me? If you use or maintain custom scripts or Terraform scripts referencing the CreateAutonomousDatabase, GetAutonomousDatabase, or UpdateAutonomousDatabase APIs, you want to check, and possibly modify, the scripts for the changed default value of the attribute. Should you choose not to leave your scripts unchanged, the API calls containing this attribute will continue to work, but the default value will switch from true to false.
     * How do I make this change? Using either OCI SDKs or command line tools, update your custom scripts to explicitly set the isMTLSConnectionRequired attribute to true.
     *
     * @return the value
     **/
    public Boolean getIsMtlsConnectionRequired() {
        return isMtlsConnectionRequired;
    }

    /**
     * The unique identifier for leader autonomous database OCID [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourcePoolLeaderId")
    private final String resourcePoolLeaderId;

    /**
     * The unique identifier for leader autonomous database OCID [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getResourcePoolLeaderId() {
        return resourcePoolLeaderId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourcePoolSummary")
    private final ResourcePoolSummary resourcePoolSummary;

    public ResourcePoolSummary getResourcePoolSummary() {
        return resourcePoolSummary;
    }

    /**
     * The maintenance schedule type of the Autonomous Database Serverless. An EARLY maintenance schedule
     * follows a schedule applying patches prior to the REGULAR schedule. A REGULAR maintenance schedule follows the normal cycle
     *
     **/
    public enum AutonomousMaintenanceScheduleType {
        Early("EARLY"),
        Regular("REGULAR"),
        ;

        private final String value;
        private static java.util.Map<String, AutonomousMaintenanceScheduleType> map;

        static {
            map = new java.util.HashMap<>();
            for (AutonomousMaintenanceScheduleType v : AutonomousMaintenanceScheduleType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AutonomousMaintenanceScheduleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutonomousMaintenanceScheduleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AutonomousMaintenanceScheduleType: " + key);
        }
    };
    /**
     * The maintenance schedule type of the Autonomous Database Serverless. An EARLY maintenance schedule
     * follows a schedule applying patches prior to the REGULAR schedule. A REGULAR maintenance schedule follows the normal cycle
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousMaintenanceScheduleType")
    private final AutonomousMaintenanceScheduleType autonomousMaintenanceScheduleType;

    /**
     * The maintenance schedule type of the Autonomous Database Serverless. An EARLY maintenance schedule
     * follows a schedule applying patches prior to the REGULAR schedule. A REGULAR maintenance schedule follows the normal cycle
     *
     * @return the value
     **/
    public AutonomousMaintenanceScheduleType getAutonomousMaintenanceScheduleType() {
        return autonomousMaintenanceScheduleType;
    }

    /**
     * The list of scheduled operations. Consists of values such as dayOfWeek, scheduledStartTime, scheduledStopTime.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledOperations")
    private final java.util.List<ScheduledOperationDetails> scheduledOperations;

    /**
     * The list of scheduled operations. Consists of values such as dayOfWeek, scheduledStartTime, scheduledStopTime.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
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
     * The Oracle Database Edition that applies to the Autonomous databases. This parameter accepts options {@code STANDARD_EDITION} and {@code ENTERPRISE_EDITION}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final AutonomousDatabaseSummary.DatabaseEdition databaseEdition;

    /**
     * The Oracle Database Edition that applies to the Autonomous databases. This parameter accepts options {@code STANDARD_EDITION} and {@code ENTERPRISE_EDITION}.
     *
     * @return the value
     **/
    public AutonomousDatabaseSummary.DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    /**
     * The list of database tools details.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, isLocalDataGuardEnabled, or isFreeTier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbToolsDetails")
    private final java.util.List<DatabaseTool> dbToolsDetails;

    /**
     * The list of database tools details.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, whitelistedIps, isMTLSConnectionRequired, openMode, permissionLevel, dbWorkload, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     **/
    public java.util.List<DatabaseTool> getDbToolsDetails() {
        return dbToolsDetails;
    }

    /**
     * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID.
     * <p>
     * This cannot be used in conjunction with adminPassword.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The OCI vault secret [/Content/General/Concepts/identifiers.htm]OCID.
     * <p>
     * This cannot be used in conjunction with adminPassword.
     *
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
        sb.append("CreateAutonomousDatabaseBase(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", backupRetentionPeriodInDays=")
                .append(String.valueOf(this.backupRetentionPeriodInDays));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", computeCount=").append(String.valueOf(this.computeCount));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", dataStorageSizeInTBs=").append(String.valueOf(this.dataStorageSizeInTBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", isFreeTier=").append(String.valueOf(this.isFreeTier));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", adminPassword=").append(String.valueOf(this.adminPassword));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", isPreviewVersionWithServiceTermsAccepted=")
                .append(String.valueOf(this.isPreviewVersionWithServiceTermsAccepted));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", isDevTier=").append(String.valueOf(this.isDevTier));
        sb.append(", isDedicated=").append(String.valueOf(this.isDedicated));
        sb.append(", autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(", inMemoryPercentage=").append(String.valueOf(this.inMemoryPercentage));
        sb.append(", isAccessControlEnabled=").append(String.valueOf(this.isAccessControlEnabled));
        sb.append(", whitelistedIps=").append(String.valueOf(this.whitelistedIps));
        sb.append(", arePrimaryWhitelistedIpsUsed=")
                .append(String.valueOf(this.arePrimaryWhitelistedIpsUsed));
        sb.append(", standbyWhitelistedIps=").append(String.valueOf(this.standbyWhitelistedIps));
        sb.append(", isDataGuardEnabled=").append(String.valueOf(this.isDataGuardEnabled));
        sb.append(", isLocalDataGuardEnabled=")
                .append(String.valueOf(this.isLocalDataGuardEnabled));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", privateEndpointLabel=").append(String.valueOf(this.privateEndpointLabel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", privateEndpointIp=").append(String.valueOf(this.privateEndpointIp));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", customerContacts=").append(String.valueOf(this.customerContacts));
        sb.append(", isMtlsConnectionRequired=")
                .append(String.valueOf(this.isMtlsConnectionRequired));
        sb.append(", resourcePoolLeaderId=").append(String.valueOf(this.resourcePoolLeaderId));
        sb.append(", resourcePoolSummary=").append(String.valueOf(this.resourcePoolSummary));
        sb.append(", autonomousMaintenanceScheduleType=")
                .append(String.valueOf(this.autonomousMaintenanceScheduleType));
        sb.append(", scheduledOperations=").append(String.valueOf(this.scheduledOperations));
        sb.append(", isAutoScalingForStorageEnabled=")
                .append(String.valueOf(this.isAutoScalingForStorageEnabled));
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
        if (!(o instanceof CreateAutonomousDatabaseBase)) {
            return false;
        }

        CreateAutonomousDatabaseBase other = (CreateAutonomousDatabaseBase) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(
                        this.backupRetentionPeriodInDays, other.backupRetentionPeriodInDays)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(this.computeCount, other.computeCount)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.dataStorageSizeInTBs, other.dataStorageSizeInTBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.isFreeTier, other.isFreeTier)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(
                        this.isPreviewVersionWithServiceTermsAccepted,
                        other.isPreviewVersionWithServiceTermsAccepted)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.isDevTier, other.isDevTier)
                && java.util.Objects.equals(this.isDedicated, other.isDedicated)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(this.inMemoryPercentage, other.inMemoryPercentage)
                && java.util.Objects.equals(
                        this.isAccessControlEnabled, other.isAccessControlEnabled)
                && java.util.Objects.equals(this.whitelistedIps, other.whitelistedIps)
                && java.util.Objects.equals(
                        this.arePrimaryWhitelistedIpsUsed, other.arePrimaryWhitelistedIpsUsed)
                && java.util.Objects.equals(this.standbyWhitelistedIps, other.standbyWhitelistedIps)
                && java.util.Objects.equals(this.isDataGuardEnabled, other.isDataGuardEnabled)
                && java.util.Objects.equals(
                        this.isLocalDataGuardEnabled, other.isLocalDataGuardEnabled)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.privateEndpointLabel, other.privateEndpointLabel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.privateEndpointIp, other.privateEndpointIp)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.customerContacts, other.customerContacts)
                && java.util.Objects.equals(
                        this.isMtlsConnectionRequired, other.isMtlsConnectionRequired)
                && java.util.Objects.equals(this.resourcePoolLeaderId, other.resourcePoolLeaderId)
                && java.util.Objects.equals(this.resourcePoolSummary, other.resourcePoolSummary)
                && java.util.Objects.equals(
                        this.autonomousMaintenanceScheduleType,
                        other.autonomousMaintenanceScheduleType)
                && java.util.Objects.equals(this.scheduledOperations, other.scheduledOperations)
                && java.util.Objects.equals(
                        this.isAutoScalingForStorageEnabled, other.isAutoScalingForStorageEnabled)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.backupRetentionPeriodInDays == null
                                ? 43
                                : this.backupRetentionPeriodInDays.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result = (result * PRIME) + (this.computeCount == null ? 43 : this.computeCount.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
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
        result = (result * PRIME) + (this.isFreeTier == null ? 43 : this.isFreeTier.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreviewVersionWithServiceTermsAccepted == null
                                ? 43
                                : this.isPreviewVersionWithServiceTermsAccepted.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
        result = (result * PRIME) + (this.isDevTier == null ? 43 : this.isDevTier.hashCode());
        result = (result * PRIME) + (this.isDedicated == null ? 43 : this.isDedicated.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseId == null
                                ? 43
                                : this.autonomousContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.inMemoryPercentage == null
                                ? 43
                                : this.inMemoryPercentage.hashCode());
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
                        + (this.isDataGuardEnabled == null
                                ? 43
                                : this.isDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isLocalDataGuardEnabled == null
                                ? 43
                                : this.isLocalDataGuardEnabled.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointLabel == null
                                ? 43
                                : this.privateEndpointLabel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIp == null ? 43 : this.privateEndpointIp.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
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
                        + (this.resourcePoolLeaderId == null
                                ? 43
                                : this.resourcePoolLeaderId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourcePoolSummary == null
                                ? 43
                                : this.resourcePoolSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousMaintenanceScheduleType == null
                                ? 43
                                : this.autonomousMaintenanceScheduleType.hashCode());
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

    /**
     * The source of the database: Use {@code NONE} for creating a new Autonomous Database. Use {@code DATABASE} for creating a new Autonomous Database by cloning an existing Autonomous Database. Use {@code CROSS_REGION_DATAGUARD} to create a standby Data Guard database in another region.
     * <p>
     * For [Autonomous Database Serverless instances](https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/), the following cloning options are available: Use {@code BACKUP_FROM_ID} for creating a new Autonomous Database from a specified backup. Use {@code BACKUP_FROM_TIMESTAMP} for creating a point-in-time Autonomous Database clone using backups. For more information, see [Cloning and Moving an Autonomous Database](https://docs.oracle.com/en/cloud/paas/autonomous-database/adbsa/clone-autonomous-database.html#GUID-D771796F-5081-4CFB-A7FF-0F893EABD7BC).
     *
     **/
    public enum Source {
        None("NONE"),
        Database("DATABASE"),
        BackupFromId("BACKUP_FROM_ID"),
        BackupFromTimestamp("BACKUP_FROM_TIMESTAMP"),
        CloneToRefreshable("CLONE_TO_REFRESHABLE"),
        CrossRegionDataguard("CROSS_REGION_DATAGUARD"),
        CrossRegionDisasterRecovery("CROSS_REGION_DISASTER_RECOVERY"),
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
