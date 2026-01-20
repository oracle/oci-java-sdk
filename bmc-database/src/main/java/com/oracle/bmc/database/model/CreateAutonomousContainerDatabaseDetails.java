/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create an Autonomous Container Database (ACD). <br>
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
        builder = CreateAutonomousContainerDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "source")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAutonomousContainerDatabaseDetails
        extends CreateAutonomousContainerDatabaseBase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("customerContacts")
        private java.util.List<CustomerContact> customerContacts;

        public Builder customerContacts(java.util.List<CustomerContact> customerContacts) {
            this.customerContacts = customerContacts;
            this.__explicitlySet__.add("customerContacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("okvEndPointGroupName")
        private String okvEndPointGroupName;

        public Builder okvEndPointGroupName(String okvEndPointGroupName) {
            this.okvEndPointGroupName = okvEndPointGroupName;
            this.__explicitlySet__.add("okvEndPointGroupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceLevelAgreementType")
        private ServiceLevelAgreementType serviceLevelAgreementType;

        public Builder serviceLevelAgreementType(
                ServiceLevelAgreementType serviceLevelAgreementType) {
            this.serviceLevelAgreementType = serviceLevelAgreementType;
            this.__explicitlySet__.add("serviceLevelAgreementType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousExadataInfrastructureId")
        private String autonomousExadataInfrastructureId;

        public Builder autonomousExadataInfrastructureId(String autonomousExadataInfrastructureId) {
            this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            this.__explicitlySet__.add("autonomousExadataInfrastructureId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousExadataInfrastructureId")
        private String peerAutonomousExadataInfrastructureId;

        public Builder peerAutonomousExadataInfrastructureId(
                String peerAutonomousExadataInfrastructureId) {
            this.peerAutonomousExadataInfrastructureId = peerAutonomousExadataInfrastructureId;
            this.__explicitlySet__.add("peerAutonomousExadataInfrastructureId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseDisplayName")
        private String peerAutonomousContainerDatabaseDisplayName;

        public Builder peerAutonomousContainerDatabaseDisplayName(
                String peerAutonomousContainerDatabaseDisplayName) {
            this.peerAutonomousContainerDatabaseDisplayName =
                    peerAutonomousContainerDatabaseDisplayName;
            this.__explicitlySet__.add("peerAutonomousContainerDatabaseDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fastStartFailOverLagLimitInSeconds")
        private Integer fastStartFailOverLagLimitInSeconds;

        public Builder fastStartFailOverLagLimitInSeconds(
                Integer fastStartFailOverLagLimitInSeconds) {
            this.fastStartFailOverLagLimitInSeconds = fastStartFailOverLagLimitInSeconds;
            this.__explicitlySet__.add("fastStartFailOverLagLimitInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
        private Boolean isAutomaticFailoverEnabled;

        public Builder isAutomaticFailoverEnabled(Boolean isAutomaticFailoverEnabled) {
            this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
            this.__explicitlySet__.add("isAutomaticFailoverEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerCloudAutonomousVmClusterId")
        private String peerCloudAutonomousVmClusterId;

        public Builder peerCloudAutonomousVmClusterId(String peerCloudAutonomousVmClusterId) {
            this.peerCloudAutonomousVmClusterId = peerCloudAutonomousVmClusterId;
            this.__explicitlySet__.add("peerCloudAutonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousVmClusterId")
        private String peerAutonomousVmClusterId;

        public Builder peerAutonomousVmClusterId(String peerAutonomousVmClusterId) {
            this.peerAutonomousVmClusterId = peerAutonomousVmClusterId;
            this.__explicitlySet__.add("peerAutonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "peerAutonomousContainerDatabaseCompartmentId")
        private String peerAutonomousContainerDatabaseCompartmentId;

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

        @com.fasterxml.jackson.annotation.JsonProperty("peerDbUniqueName")
        private String peerDbUniqueName;

        public Builder peerDbUniqueName(String peerDbUniqueName) {
            this.peerDbUniqueName = peerDbUniqueName;
            this.__explicitlySet__.add("peerDbUniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
        private String autonomousVmClusterId;

        public Builder autonomousVmClusterId(String autonomousVmClusterId) {
            this.autonomousVmClusterId = autonomousVmClusterId;
            this.__explicitlySet__.add("autonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
        private String cloudAutonomousVmClusterId;

        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            this.__explicitlySet__.add("cloudAutonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
        private PatchModel patchModel;

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

        @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
        private Integer standbyMaintenanceBufferInDays;

        public Builder standbyMaintenanceBufferInDays(Integer standbyMaintenanceBufferInDays) {
            this.standbyMaintenanceBufferInDays = standbyMaintenanceBufferInDays;
            this.__explicitlySet__.add("standbyMaintenanceBufferInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionPreference")
        private VersionPreference versionPreference;

        public Builder versionPreference(VersionPreference versionPreference) {
            this.versionPreference = versionPreference;
            this.__explicitlySet__.add("versionPreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDstFileUpdateEnabled")
        private Boolean isDstFileUpdateEnabled;

        public Builder isDstFileUpdateEnabled(Boolean isDstFileUpdateEnabled) {
            this.isDstFileUpdateEnabled = isDstFileUpdateEnabled;
            this.__explicitlySet__.add("isDstFileUpdateEnabled");
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

        @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
        private AutonomousContainerDatabaseBackupConfig backupConfig;

        public Builder backupConfig(AutonomousContainerDatabaseBackupConfig backupConfig) {
            this.backupConfig = backupConfig;
            this.__explicitlySet__.add("backupConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
        private String keyStoreId;

        public Builder keyStoreId(String keyStoreId) {
            this.keyStoreId = keyStoreId;
            this.__explicitlySet__.add("keyStoreId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKeyLocationDetails")
        private EncryptionKeyLocationDetails encryptionKeyLocationDetails;

        public Builder encryptionKeyLocationDetails(
                EncryptionKeyLocationDetails encryptionKeyLocationDetails) {
            this.encryptionKeyLocationDetails = encryptionKeyLocationDetails;
            this.__explicitlySet__.add("encryptionKeyLocationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSplitThreshold")
        private Integer dbSplitThreshold;

        public Builder dbSplitThreshold(Integer dbSplitThreshold) {
            this.dbSplitThreshold = dbSplitThreshold;
            this.__explicitlySet__.add("dbSplitThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmFailoverReservation")
        private Integer vmFailoverReservation;

        public Builder vmFailoverReservation(Integer vmFailoverReservation) {
            this.vmFailoverReservation = vmFailoverReservation;
            this.__explicitlySet__.add("vmFailoverReservation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("distributionAffinity")
        private DistributionAffinity distributionAffinity;

        public Builder distributionAffinity(DistributionAffinity distributionAffinity) {
            this.distributionAffinity = distributionAffinity;
            this.__explicitlySet__.add("distributionAffinity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("netServicesArchitecture")
        private NetServicesArchitecture netServicesArchitecture;

        public Builder netServicesArchitecture(NetServicesArchitecture netServicesArchitecture) {
            this.netServicesArchitecture = netServicesArchitecture;
            this.__explicitlySet__.add("netServicesArchitecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousContainerDatabaseDetails build() {
            CreateAutonomousContainerDatabaseDetails model =
                    new CreateAutonomousContainerDatabaseDetails(
                            this.customerContacts,
                            this.okvEndPointGroupName,
                            this.displayName,
                            this.dbUniqueName,
                            this.dbName,
                            this.serviceLevelAgreementType,
                            this.autonomousExadataInfrastructureId,
                            this.dbVersion,
                            this.databaseSoftwareImageId,
                            this.peerAutonomousExadataInfrastructureId,
                            this.peerAutonomousContainerDatabaseDisplayName,
                            this.protectionMode,
                            this.fastStartFailOverLagLimitInSeconds,
                            this.isAutomaticFailoverEnabled,
                            this.peerCloudAutonomousVmClusterId,
                            this.peerAutonomousVmClusterId,
                            this.peerAutonomousContainerDatabaseCompartmentId,
                            this.peerAutonomousContainerDatabaseBackupConfig,
                            this.peerDbUniqueName,
                            this.autonomousVmClusterId,
                            this.cloudAutonomousVmClusterId,
                            this.compartmentId,
                            this.patchModel,
                            this.maintenanceWindowDetails,
                            this.standbyMaintenanceBufferInDays,
                            this.versionPreference,
                            this.isDstFileUpdateEnabled,
                            this.freeformTags,
                            this.definedTags,
                            this.backupConfig,
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.vaultId,
                            this.keyStoreId,
                            this.encryptionKeyLocationDetails,
                            this.dbSplitThreshold,
                            this.vmFailoverReservation,
                            this.distributionAffinity,
                            this.netServicesArchitecture);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousContainerDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("customerContacts")) {
                this.customerContacts(model.getCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("okvEndPointGroupName")) {
                this.okvEndPointGroupName(model.getOkvEndPointGroupName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("serviceLevelAgreementType")) {
                this.serviceLevelAgreementType(model.getServiceLevelAgreementType());
            }
            if (model.wasPropertyExplicitlySet("autonomousExadataInfrastructureId")) {
                this.autonomousExadataInfrastructureId(
                        model.getAutonomousExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageId")) {
                this.databaseSoftwareImageId(model.getDatabaseSoftwareImageId());
            }
            if (model.wasPropertyExplicitlySet("peerAutonomousExadataInfrastructureId")) {
                this.peerAutonomousExadataInfrastructureId(
                        model.getPeerAutonomousExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("peerAutonomousContainerDatabaseDisplayName")) {
                this.peerAutonomousContainerDatabaseDisplayName(
                        model.getPeerAutonomousContainerDatabaseDisplayName());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("fastStartFailOverLagLimitInSeconds")) {
                this.fastStartFailOverLagLimitInSeconds(
                        model.getFastStartFailOverLagLimitInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isAutomaticFailoverEnabled")) {
                this.isAutomaticFailoverEnabled(model.getIsAutomaticFailoverEnabled());
            }
            if (model.wasPropertyExplicitlySet("peerCloudAutonomousVmClusterId")) {
                this.peerCloudAutonomousVmClusterId(model.getPeerCloudAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("peerAutonomousVmClusterId")) {
                this.peerAutonomousVmClusterId(model.getPeerAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("peerAutonomousContainerDatabaseCompartmentId")) {
                this.peerAutonomousContainerDatabaseCompartmentId(
                        model.getPeerAutonomousContainerDatabaseCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("peerAutonomousContainerDatabaseBackupConfig")) {
                this.peerAutonomousContainerDatabaseBackupConfig(
                        model.getPeerAutonomousContainerDatabaseBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("peerDbUniqueName")) {
                this.peerDbUniqueName(model.getPeerDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("autonomousVmClusterId")) {
                this.autonomousVmClusterId(model.getAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("cloudAutonomousVmClusterId")) {
                this.cloudAutonomousVmClusterId(model.getCloudAutonomousVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("patchModel")) {
                this.patchModel(model.getPatchModel());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowDetails")) {
                this.maintenanceWindowDetails(model.getMaintenanceWindowDetails());
            }
            if (model.wasPropertyExplicitlySet("standbyMaintenanceBufferInDays")) {
                this.standbyMaintenanceBufferInDays(model.getStandbyMaintenanceBufferInDays());
            }
            if (model.wasPropertyExplicitlySet("versionPreference")) {
                this.versionPreference(model.getVersionPreference());
            }
            if (model.wasPropertyExplicitlySet("isDstFileUpdateEnabled")) {
                this.isDstFileUpdateEnabled(model.getIsDstFileUpdateEnabled());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("backupConfig")) {
                this.backupConfig(model.getBackupConfig());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyStoreId")) {
                this.keyStoreId(model.getKeyStoreId());
            }
            if (model.wasPropertyExplicitlySet("encryptionKeyLocationDetails")) {
                this.encryptionKeyLocationDetails(model.getEncryptionKeyLocationDetails());
            }
            if (model.wasPropertyExplicitlySet("dbSplitThreshold")) {
                this.dbSplitThreshold(model.getDbSplitThreshold());
            }
            if (model.wasPropertyExplicitlySet("vmFailoverReservation")) {
                this.vmFailoverReservation(model.getVmFailoverReservation());
            }
            if (model.wasPropertyExplicitlySet("distributionAffinity")) {
                this.distributionAffinity(model.getDistributionAffinity());
            }
            if (model.wasPropertyExplicitlySet("netServicesArchitecture")) {
                this.netServicesArchitecture(model.getNetServicesArchitecture());
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

    @Deprecated
    public CreateAutonomousContainerDatabaseDetails(
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
            EncryptionKeyLocationDetails encryptionKeyLocationDetails,
            Integer dbSplitThreshold,
            Integer vmFailoverReservation,
            DistributionAffinity distributionAffinity,
            NetServicesArchitecture netServicesArchitecture) {
        super(
                customerContacts,
                okvEndPointGroupName,
                displayName,
                dbUniqueName,
                dbName,
                serviceLevelAgreementType,
                autonomousExadataInfrastructureId,
                dbVersion,
                databaseSoftwareImageId,
                peerAutonomousExadataInfrastructureId,
                peerAutonomousContainerDatabaseDisplayName,
                protectionMode,
                fastStartFailOverLagLimitInSeconds,
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
                versionPreference,
                isDstFileUpdateEnabled,
                freeformTags,
                definedTags,
                backupConfig,
                kmsKeyId,
                kmsKeyVersionId,
                vaultId,
                keyStoreId,
                encryptionKeyLocationDetails,
                dbSplitThreshold,
                vmFailoverReservation,
                distributionAffinity,
                netServicesArchitecture);
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
        sb.append("CreateAutonomousContainerDatabaseDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
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
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
