/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describes the required parameters for the creation of an Autonomous Container Database.
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
    builder = CreateAutonomousContainerDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAutonomousContainerDatabaseDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "dbUniqueName",
        "serviceLevelAgreementType",
        "autonomousExadataInfrastructureId",
        "peerAutonomousExadataInfrastructureId",
        "peerAutonomousContainerDatabaseDisplayName",
        "protectionMode",
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
        "freeformTags",
        "definedTags",
        "backupConfig",
        "kmsKeyId",
        "kmsKeyVersionId",
        "vaultId",
        "keyStoreId"
    })
    public CreateAutonomousContainerDatabaseDetails(
            String displayName,
            String dbUniqueName,
            ServiceLevelAgreementType serviceLevelAgreementType,
            String autonomousExadataInfrastructureId,
            String peerAutonomousExadataInfrastructureId,
            String peerAutonomousContainerDatabaseDisplayName,
            ProtectionMode protectionMode,
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
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            AutonomousContainerDatabaseBackupConfig backupConfig,
            String kmsKeyId,
            String kmsKeyVersionId,
            String vaultId,
            String keyStoreId) {
        super();
        this.displayName = displayName;
        this.dbUniqueName = dbUniqueName;
        this.serviceLevelAgreementType = serviceLevelAgreementType;
        this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
        this.peerAutonomousExadataInfrastructureId = peerAutonomousExadataInfrastructureId;
        this.peerAutonomousContainerDatabaseDisplayName =
                peerAutonomousContainerDatabaseDisplayName;
        this.protectionMode = protectionMode;
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
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.backupConfig = backupConfig;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.vaultId = vaultId;
        this.keyStoreId = keyStoreId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name for the Autonomous Container Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name for the Autonomous Container Database.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure.  Do not specify a value for this parameter. Specifying a value for this field will cause Terraform operations to fail.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure.  Do not specify a value for this parameter. Specifying a value for this field will cause Terraform operations to fail.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         **/
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }
        /**
         * The service level agreement type of the Autonomous Container Database. The default is STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceLevelAgreementType")
        private ServiceLevelAgreementType serviceLevelAgreementType;

        /**
         * The service level agreement type of the Autonomous Container Database. The default is STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
         * @param serviceLevelAgreementType the value to set
         * @return this builder
         **/
        public Builder serviceLevelAgreementType(
                ServiceLevelAgreementType serviceLevelAgreementType) {
            this.serviceLevelAgreementType = serviceLevelAgreementType;
            this.__explicitlySet__.add("serviceLevelAgreementType");
            return this;
        }
        /**
         * **No longer used.** This parameter is no longer used for Autonomous Database on dedicated Exadata infrasture. Specify a {@code cloudAutonomousVmClusterId} instead. Using this parameter will cause the operation to fail.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousExadataInfrastructureId")
        private String autonomousExadataInfrastructureId;

        /**
         * **No longer used.** This parameter is no longer used for Autonomous Database on dedicated Exadata infrasture. Specify a {@code cloudAutonomousVmClusterId} instead. Using this parameter will cause the operation to fail.
         *
         * @param autonomousExadataInfrastructureId the value to set
         * @return this builder
         **/
        public Builder autonomousExadataInfrastructureId(String autonomousExadataInfrastructureId) {
            this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            this.__explicitlySet__.add("autonomousExadataInfrastructureId");
            return this;
        }
        /**
         * *No longer used.* This parameter is no longer used for Autonomous Database on dedicated Exadata infrasture. Specify a {@code peerCloudAutonomousVmClusterId} instead. Using this parameter will cause the operation to fail.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousExadataInfrastructureId")
        private String peerAutonomousExadataInfrastructureId;

        /**
         * *No longer used.* This parameter is no longer used for Autonomous Database on dedicated Exadata infrasture. Specify a {@code peerCloudAutonomousVmClusterId} instead. Using this parameter will cause the operation to fail.
         *
         * @param peerAutonomousExadataInfrastructureId the value to set
         * @return this builder
         **/
        public Builder peerAutonomousExadataInfrastructureId(
                String peerAutonomousExadataInfrastructureId) {
            this.peerAutonomousExadataInfrastructureId = peerAutonomousExadataInfrastructureId;
            this.__explicitlySet__.add("peerAutonomousExadataInfrastructureId");
            return this;
        }
        /**
         * The display name for the peer Autonomous Container Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseDisplayName")
        private String peerAutonomousContainerDatabaseDisplayName;

        /**
         * The display name for the peer Autonomous Container Database.
         * @param peerAutonomousContainerDatabaseDisplayName the value to set
         * @return this builder
         **/
        public Builder peerAutonomousContainerDatabaseDisplayName(
                String peerAutonomousContainerDatabaseDisplayName) {
            this.peerAutonomousContainerDatabaseDisplayName =
                    peerAutonomousContainerDatabaseDisplayName;
            this.__explicitlySet__.add("peerAutonomousContainerDatabaseDisplayName");
            return this;
        }
        /**
         * The protection mode of this Autonomous Data Guard association. For more information, see
         * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The protection mode of this Autonomous Data Guard association. For more information, see
         * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         * @param protectionMode the value to set
         * @return this builder
         **/
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /**
         * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
        private Boolean isAutomaticFailoverEnabled;

        /**
         * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
         *
         * @param isAutomaticFailoverEnabled the value to set
         * @return this builder
         **/
        public Builder isAutomaticFailoverEnabled(Boolean isAutomaticFailoverEnabled) {
            this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
            this.__explicitlySet__.add("isAutomaticFailoverEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer cloud Autonomous Exadata VM Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterId")
        private String peerCloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer cloud Autonomous Exadata VM Cluster.
         * @param peerCloudAutonomousVmClusterId the value to set
         * @return this builder
         **/
        public Builder peerCloudAutonomousVmClusterId(String peerCloudAutonomousVmClusterId) {
            this.peerCloudAutonomousVmClusterId = peerCloudAutonomousVmClusterId;
            this.__explicitlySet__.add("peerCloudAutonomousVmClusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer Autonomous VM cluster for Autonomous Data Guard. Required to enable Data Guard.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousVmClusterId")
        private String peerAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer Autonomous VM cluster for Autonomous Data Guard. Required to enable Data Guard.
         *
         * @param peerAutonomousVmClusterId the value to set
         * @return this builder
         **/
        public Builder peerAutonomousVmClusterId(String peerAutonomousVmClusterId) {
            this.peerAutonomousVmClusterId = peerAutonomousVmClusterId;
            this.__explicitlySet__.add("peerAutonomousVmClusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment where the standby Autonomous Container Database
         * will be created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty(
                "peerAutonomousContainerDatabaseCompartmentId")
        private String peerAutonomousContainerDatabaseCompartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment where the standby Autonomous Container Database
         * will be created.
         *
         * @param peerAutonomousContainerDatabaseCompartmentId the value to set
         * @return this builder
         **/
        public Builder peerAutonomousContainerDatabaseCompartmentId(
                String peerAutonomousContainerDatabaseCompartmentId) {
            this.peerAutonomousContainerDatabaseCompartmentId =
                    peerAutonomousContainerDatabaseCompartmentId;
            this.__explicitlySet__.add("peerAutonomousContainerDatabaseCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "peerAutonomousContainerDatabaseBackupConfig")
        private PeerAutonomousContainerDatabaseBackupConfig
                peerAutonomousContainerDatabaseBackupConfig;

        public Builder peerAutonomousContainerDatabaseBackupConfig(
                PeerAutonomousContainerDatabaseBackupConfig
                        peerAutonomousContainerDatabaseBackupConfig) {
            this.peerAutonomousContainerDatabaseBackupConfig =
                    peerAutonomousContainerDatabaseBackupConfig;
            this.__explicitlySet__.add("peerAutonomousContainerDatabaseBackupConfig");
            return this;
        }
        /**
         * **Deprecated.** The {@code DB_UNIQUE_NAME} of the peer Autonomous Container Database in a Data Guard association is set by Oracle Cloud Infrastructure.  Do not specify a value for this parameter. Specifying a value for this field will cause Terraform operations to fail.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbUniqueName")
        private String peerDbUniqueName;

        /**
         * **Deprecated.** The {@code DB_UNIQUE_NAME} of the peer Autonomous Container Database in a Data Guard association is set by Oracle Cloud Infrastructure.  Do not specify a value for this parameter. Specifying a value for this field will cause Terraform operations to fail.
         *
         * @param peerDbUniqueName the value to set
         * @return this builder
         **/
        public Builder peerDbUniqueName(String peerDbUniqueName) {
            this.peerDbUniqueName = peerDbUniqueName;
            this.__explicitlySet__.add("peerDbUniqueName");
            return this;
        }
        /**
         * The OCID of the Autonomous VM Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
        private String autonomousVmClusterId;

        /**
         * The OCID of the Autonomous VM Cluster.
         * @param autonomousVmClusterId the value to set
         * @return this builder
         **/
        public Builder autonomousVmClusterId(String autonomousVmClusterId) {
            this.autonomousVmClusterId = autonomousVmClusterId;
            this.__explicitlySet__.add("autonomousVmClusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Autonomous Exadata VM Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
        private String cloudAutonomousVmClusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Autonomous Exadata VM Cluster.
         * @param cloudAutonomousVmClusterId the value to set
         * @return this builder
         **/
        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            this.__explicitlySet__.add("cloudAutonomousVmClusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the Autonomous Container Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the Autonomous Container Database.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Database Patch model preference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
        private PatchModel patchModel;

        /**
         * Database Patch model preference.
         * @param patchModel the value to set
         * @return this builder
         **/
        public Builder patchModel(PatchModel patchModel) {
            this.patchModel = patchModel;
            this.__explicitlySet__.add("patchModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
        private MaintenanceWindow maintenanceWindowDetails;

        public Builder maintenanceWindowDetails(MaintenanceWindow maintenanceWindowDetails) {
            this.maintenanceWindowDetails = maintenanceWindowDetails;
            this.__explicitlySet__.add("maintenanceWindowDetails");
            return this;
        }
        /**
         * The scheduling detail for the quarterly maintenance window of the standby Autonomous Container Database.
         * This value represents the number of days before scheduled maintenance of the primary database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
        private Integer standbyMaintenanceBufferInDays;

        /**
         * The scheduling detail for the quarterly maintenance window of the standby Autonomous Container Database.
         * This value represents the number of days before scheduled maintenance of the primary database.
         *
         * @param standbyMaintenanceBufferInDays the value to set
         * @return this builder
         **/
        public Builder standbyMaintenanceBufferInDays(Integer standbyMaintenanceBufferInDays) {
            this.standbyMaintenanceBufferInDays = standbyMaintenanceBufferInDays;
            this.__explicitlySet__.add("standbyMaintenanceBufferInDays");
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

        @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
        private AutonomousContainerDatabaseBackupConfig backupConfig;

        public Builder backupConfig(AutonomousContainerDatabaseBackupConfig backupConfig) {
            this.backupConfig = backupConfig;
            this.__explicitlySet__.add("backupConfig");
            return this;
        }
        /**
         * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        /**
         * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder
         **/
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the key store.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
        private String keyStoreId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the key store.
         * @param keyStoreId the value to set
         * @return this builder
         **/
        public Builder keyStoreId(String keyStoreId) {
            this.keyStoreId = keyStoreId;
            this.__explicitlySet__.add("keyStoreId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousContainerDatabaseDetails build() {
            CreateAutonomousContainerDatabaseDetails __instance__ =
                    new CreateAutonomousContainerDatabaseDetails(
                            displayName,
                            dbUniqueName,
                            serviceLevelAgreementType,
                            autonomousExadataInfrastructureId,
                            peerAutonomousExadataInfrastructureId,
                            peerAutonomousContainerDatabaseDisplayName,
                            protectionMode,
                            isAutomaticFailoverEnabled,
                            peerCloudAutonomousVmClusterId,
                            peerAutonomousVmClusterId,
                            peerAutonomousContainerDatabaseCompartmentId,
                            peerAutonomousContainerDatabaseBackupConfig,
                            peerDbUniqueName,
                            autonomousVmClusterId,
                            cloudAutonomousVmClusterId,
                            compartmentId,
                            patchModel,
                            maintenanceWindowDetails,
                            standbyMaintenanceBufferInDays,
                            freeformTags,
                            definedTags,
                            backupConfig,
                            kmsKeyId,
                            kmsKeyVersionId,
                            vaultId,
                            keyStoreId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousContainerDatabaseDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .dbUniqueName(o.getDbUniqueName())
                            .serviceLevelAgreementType(o.getServiceLevelAgreementType())
                            .autonomousExadataInfrastructureId(
                                    o.getAutonomousExadataInfrastructureId())
                            .peerAutonomousExadataInfrastructureId(
                                    o.getPeerAutonomousExadataInfrastructureId())
                            .peerAutonomousContainerDatabaseDisplayName(
                                    o.getPeerAutonomousContainerDatabaseDisplayName())
                            .protectionMode(o.getProtectionMode())
                            .isAutomaticFailoverEnabled(o.getIsAutomaticFailoverEnabled())
                            .peerCloudAutonomousVmClusterId(o.getPeerCloudAutonomousVmClusterId())
                            .peerAutonomousVmClusterId(o.getPeerAutonomousVmClusterId())
                            .peerAutonomousContainerDatabaseCompartmentId(
                                    o.getPeerAutonomousContainerDatabaseCompartmentId())
                            .peerAutonomousContainerDatabaseBackupConfig(
                                    o.getPeerAutonomousContainerDatabaseBackupConfig())
                            .peerDbUniqueName(o.getPeerDbUniqueName())
                            .autonomousVmClusterId(o.getAutonomousVmClusterId())
                            .cloudAutonomousVmClusterId(o.getCloudAutonomousVmClusterId())
                            .compartmentId(o.getCompartmentId())
                            .patchModel(o.getPatchModel())
                            .maintenanceWindowDetails(o.getMaintenanceWindowDetails())
                            .standbyMaintenanceBufferInDays(o.getStandbyMaintenanceBufferInDays())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .backupConfig(o.getBackupConfig())
                            .kmsKeyId(o.getKmsKeyId())
                            .kmsKeyVersionId(o.getKmsKeyVersionId())
                            .vaultId(o.getVaultId())
                            .keyStoreId(o.getKeyStoreId());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The display name for the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name for the Autonomous Container Database.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure.  Do not specify a value for this parameter. Specifying a value for this field will cause Terraform operations to fail.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure.  Do not specify a value for this parameter. Specifying a value for this field will cause Terraform operations to fail.
     *
     * @return the value
     **/
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * The service level agreement type of the Autonomous Container Database. The default is STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     **/
    public enum ServiceLevelAgreementType {
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
     * The service level agreement type of the Autonomous Container Database. The default is STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceLevelAgreementType")
    private final ServiceLevelAgreementType serviceLevelAgreementType;

    /**
     * The service level agreement type of the Autonomous Container Database. The default is STANDARD. For an autonomous dataguard Autonomous Container Database, the specified Autonomous Exadata Infrastructure must be associated with a remote Autonomous Exadata Infrastructure.
     * @return the value
     **/
    public ServiceLevelAgreementType getServiceLevelAgreementType() {
        return serviceLevelAgreementType;
    }

    /**
     * **No longer used.** This parameter is no longer used for Autonomous Database on dedicated Exadata infrasture. Specify a {@code cloudAutonomousVmClusterId} instead. Using this parameter will cause the operation to fail.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousExadataInfrastructureId")
    private final String autonomousExadataInfrastructureId;

    /**
     * **No longer used.** This parameter is no longer used for Autonomous Database on dedicated Exadata infrasture. Specify a {@code cloudAutonomousVmClusterId} instead. Using this parameter will cause the operation to fail.
     *
     * @return the value
     **/
    public String getAutonomousExadataInfrastructureId() {
        return autonomousExadataInfrastructureId;
    }

    /**
     * *No longer used.* This parameter is no longer used for Autonomous Database on dedicated Exadata infrasture. Specify a {@code peerCloudAutonomousVmClusterId} instead. Using this parameter will cause the operation to fail.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousExadataInfrastructureId")
    private final String peerAutonomousExadataInfrastructureId;

    /**
     * *No longer used.* This parameter is no longer used for Autonomous Database on dedicated Exadata infrasture. Specify a {@code peerCloudAutonomousVmClusterId} instead. Using this parameter will cause the operation to fail.
     *
     * @return the value
     **/
    public String getPeerAutonomousExadataInfrastructureId() {
        return peerAutonomousExadataInfrastructureId;
    }

    /**
     * The display name for the peer Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseDisplayName")
    private final String peerAutonomousContainerDatabaseDisplayName;

    /**
     * The display name for the peer Autonomous Container Database.
     * @return the value
     **/
    public String getPeerAutonomousContainerDatabaseDisplayName() {
        return peerAutonomousContainerDatabaseDisplayName;
    }

    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    public enum ProtectionMode {
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
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     **/
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
    private final Boolean isAutomaticFailoverEnabled;

    /**
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     *
     * @return the value
     **/
    public Boolean getIsAutomaticFailoverEnabled() {
        return isAutomaticFailoverEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer cloud Autonomous Exadata VM Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterId")
    private final String peerCloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer cloud Autonomous Exadata VM Cluster.
     * @return the value
     **/
    public String getPeerCloudAutonomousVmClusterId() {
        return peerCloudAutonomousVmClusterId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer Autonomous VM cluster for Autonomous Data Guard. Required to enable Data Guard.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousVmClusterId")
    private final String peerAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer Autonomous VM cluster for Autonomous Data Guard. Required to enable Data Guard.
     *
     * @return the value
     **/
    public String getPeerAutonomousVmClusterId() {
        return peerAutonomousVmClusterId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment where the standby Autonomous Container Database
     * will be created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseCompartmentId")
    private final String peerAutonomousContainerDatabaseCompartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment where the standby Autonomous Container Database
     * will be created.
     *
     * @return the value
     **/
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
     * **Deprecated.** The {@code DB_UNIQUE_NAME} of the peer Autonomous Container Database in a Data Guard association is set by Oracle Cloud Infrastructure.  Do not specify a value for this parameter. Specifying a value for this field will cause Terraform operations to fail.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbUniqueName")
    private final String peerDbUniqueName;

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} of the peer Autonomous Container Database in a Data Guard association is set by Oracle Cloud Infrastructure.  Do not specify a value for this parameter. Specifying a value for this field will cause Terraform operations to fail.
     *
     * @return the value
     **/
    public String getPeerDbUniqueName() {
        return peerDbUniqueName;
    }

    /**
     * The OCID of the Autonomous VM Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
    private final String autonomousVmClusterId;

    /**
     * The OCID of the Autonomous VM Cluster.
     * @return the value
     **/
    public String getAutonomousVmClusterId() {
        return autonomousVmClusterId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Autonomous Exadata VM Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
    private final String cloudAutonomousVmClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the cloud Autonomous Exadata VM Cluster.
     * @return the value
     **/
    public String getCloudAutonomousVmClusterId() {
        return cloudAutonomousVmClusterId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the Autonomous Container Database.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Database Patch model preference.
     **/
    public enum PatchModel {
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
    /**
     * Database Patch model preference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
    private final PatchModel patchModel;

    /**
     * Database Patch model preference.
     * @return the value
     **/
    public PatchModel getPatchModel() {
        return patchModel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowDetails")
    private final MaintenanceWindow maintenanceWindowDetails;

    public MaintenanceWindow getMaintenanceWindowDetails() {
        return maintenanceWindowDetails;
    }

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous Container Database.
     * This value represents the number of days before scheduled maintenance of the primary database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
    private final Integer standbyMaintenanceBufferInDays;

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous Container Database.
     * This value represents the number of days before scheduled maintenance of the primary database.
     *
     * @return the value
     **/
    public Integer getStandbyMaintenanceBufferInDays() {
        return standbyMaintenanceBufferInDays;
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

    @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
    private final AutonomousContainerDatabaseBackupConfig backupConfig;

    public AutonomousContainerDatabaseBackupConfig getBackupConfig() {
        return backupConfig;
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
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     *
     * @return the value
     **/
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the key store.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
    private final String keyStoreId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the key store.
     * @return the value
     **/
    public String getKeyStoreId() {
        return keyStoreId;
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
        sb.append("CreateAutonomousContainerDatabaseDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", serviceLevelAgreementType=")
                .append(String.valueOf(this.serviceLevelAgreementType));
        sb.append(", autonomousExadataInfrastructureId=")
                .append(String.valueOf(this.autonomousExadataInfrastructureId));
        sb.append(", peerAutonomousExadataInfrastructureId=")
                .append(String.valueOf(this.peerAutonomousExadataInfrastructureId));
        sb.append(", peerAutonomousContainerDatabaseDisplayName=")
                .append(String.valueOf(this.peerAutonomousContainerDatabaseDisplayName));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
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
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", backupConfig=").append(String.valueOf(this.backupConfig));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", keyStoreId=").append(String.valueOf(this.keyStoreId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousContainerDatabaseDetails)) {
            return false;
        }

        CreateAutonomousContainerDatabaseDetails other =
                (CreateAutonomousContainerDatabaseDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(
                        this.serviceLevelAgreementType, other.serviceLevelAgreementType)
                && java.util.Objects.equals(
                        this.autonomousExadataInfrastructureId,
                        other.autonomousExadataInfrastructureId)
                && java.util.Objects.equals(
                        this.peerAutonomousExadataInfrastructureId,
                        other.peerAutonomousExadataInfrastructureId)
                && java.util.Objects.equals(
                        this.peerAutonomousContainerDatabaseDisplayName,
                        other.peerAutonomousContainerDatabaseDisplayName)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
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
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.backupConfig, other.backupConfig)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.keyStoreId, other.keyStoreId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
