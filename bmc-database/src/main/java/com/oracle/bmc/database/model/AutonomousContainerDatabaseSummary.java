/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * An Autonomous Container Database is a container database service that enables the customer to host one or more databases within the container database. A basic container database runs on a single Autonomous Exadata Infrastructure from an availability domain without the Extreme Availability features enabled.
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
    builder = AutonomousContainerDatabaseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AutonomousContainerDatabaseSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
        private String autonomousVmClusterId;

        public Builder autonomousVmClusterId(String autonomousVmClusterId) {
            this.autonomousVmClusterId = autonomousVmClusterId;
            this.__explicitlySet__.add("autonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
        private InfrastructureType infrastructureType;

        public Builder infrastructureType(InfrastructureType infrastructureType) {
            this.infrastructureType = infrastructureType;
            this.__explicitlySet__.add("infrastructureType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
        private String cloudAutonomousVmClusterId;

        public Builder cloudAutonomousVmClusterId(String cloudAutonomousVmClusterId) {
            this.cloudAutonomousVmClusterId = cloudAutonomousVmClusterId;
            this.__explicitlySet__.add("cloudAutonomousVmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyHistoryEntry")
        private java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry;

        public Builder keyHistoryEntry(
                java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry) {
            this.keyHistoryEntry = keyHistoryEntry;
            this.__explicitlySet__.add("keyHistoryEntry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
        private PatchModel patchModel;

        public Builder patchModel(PatchModel patchModel) {
            this.patchModel = patchModel;
            this.__explicitlySet__.add("patchModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
        private String lastMaintenanceRunId;

        public Builder lastMaintenanceRunId(String lastMaintenanceRunId) {
            this.lastMaintenanceRunId = lastMaintenanceRunId;
            this.__explicitlySet__.add("lastMaintenanceRunId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
        private String nextMaintenanceRunId;

        public Builder nextMaintenanceRunId(String nextMaintenanceRunId) {
            this.nextMaintenanceRunId = nextMaintenanceRunId;
            this.__explicitlySet__.add("nextMaintenanceRunId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
        private MaintenanceWindow maintenanceWindow;

        public Builder maintenanceWindow(MaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            this.__explicitlySet__.add("maintenanceWindow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
        private Integer standbyMaintenanceBufferInDays;

        public Builder standbyMaintenanceBufferInDays(Integer standbyMaintenanceBufferInDays) {
            this.standbyMaintenanceBufferInDays = standbyMaintenanceBufferInDays;
            this.__explicitlySet__.add("standbyMaintenanceBufferInDays");
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

        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
        private AutonomousContainerDatabaseBackupConfig backupConfig;

        public Builder backupConfig(AutonomousContainerDatabaseBackupConfig backupConfig) {
            this.backupConfig = backupConfig;
            this.__explicitlySet__.add("backupConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
        private String keyStoreId;

        public Builder keyStoreId(String keyStoreId) {
            this.keyStoreId = keyStoreId;
            this.__explicitlySet__.add("keyStoreId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreWalletName")
        private String keyStoreWalletName;

        public Builder keyStoreWalletName(String keyStoreWalletName) {
            this.keyStoreWalletName = keyStoreWalletName;
            this.__explicitlySet__.add("keyStoreWalletName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousContainerDatabaseSummary build() {
            AutonomousContainerDatabaseSummary __instance__ =
                    new AutonomousContainerDatabaseSummary(
                            id,
                            compartmentId,
                            displayName,
                            dbUniqueName,
                            serviceLevelAgreementType,
                            autonomousExadataInfrastructureId,
                            autonomousVmClusterId,
                            infrastructureType,
                            cloudAutonomousVmClusterId,
                            kmsKeyId,
                            vaultId,
                            kmsKeyVersionId,
                            keyHistoryEntry,
                            lifecycleState,
                            lifecycleDetails,
                            timeCreated,
                            patchModel,
                            patchId,
                            lastMaintenanceRunId,
                            nextMaintenanceRunId,
                            maintenanceWindow,
                            standbyMaintenanceBufferInDays,
                            freeformTags,
                            definedTags,
                            role,
                            availabilityDomain,
                            dbVersion,
                            backupConfig,
                            keyStoreId,
                            keyStoreWalletName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousContainerDatabaseSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .dbUniqueName(o.getDbUniqueName())
                            .serviceLevelAgreementType(o.getServiceLevelAgreementType())
                            .autonomousExadataInfrastructureId(
                                    o.getAutonomousExadataInfrastructureId())
                            .autonomousVmClusterId(o.getAutonomousVmClusterId())
                            .infrastructureType(o.getInfrastructureType())
                            .cloudAutonomousVmClusterId(o.getCloudAutonomousVmClusterId())
                            .kmsKeyId(o.getKmsKeyId())
                            .vaultId(o.getVaultId())
                            .kmsKeyVersionId(o.getKmsKeyVersionId())
                            .keyHistoryEntry(o.getKeyHistoryEntry())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeCreated(o.getTimeCreated())
                            .patchModel(o.getPatchModel())
                            .patchId(o.getPatchId())
                            .lastMaintenanceRunId(o.getLastMaintenanceRunId())
                            .nextMaintenanceRunId(o.getNextMaintenanceRunId())
                            .maintenanceWindow(o.getMaintenanceWindow())
                            .standbyMaintenanceBufferInDays(o.getStandbyMaintenanceBufferInDays())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .role(o.getRole())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .dbVersion(o.getDbVersion())
                            .backupConfig(o.getBackupConfig())
                            .keyStoreId(o.getKeyStoreId())
                            .keyStoreWalletName(o.getKeyStoreWalletName());

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
     * The OCID of the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The user-provided name for the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * **Deprecated.** The {@code DB_UNIQUE_NAME} value is set by Oracle Cloud Infrastructure.  Do not specify a value for this parameter. Specifying a value for this field will cause Terraform operations to fail.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    String dbUniqueName;
    /**
     * The service level agreement type of the container database. The default is STANDARD.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ServiceLevelAgreementType {
        Standard("STANDARD"),
        MissionCritical("MISSION_CRITICAL"),
        AutonomousDataguard("AUTONOMOUS_DATAGUARD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ServiceLevelAgreementType> map;

        static {
            map = new java.util.HashMap<>();
            for (ServiceLevelAgreementType v : ServiceLevelAgreementType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServiceLevelAgreementType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The service level agreement type of the container database. The default is STANDARD.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceLevelAgreementType")
    ServiceLevelAgreementType serviceLevelAgreementType;

    /**
     * The OCID of the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousExadataInfrastructureId")
    String autonomousExadataInfrastructureId;

    /**
     * The OCID of the Autonomous VM Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterId")
    String autonomousVmClusterId;
    /**
     * The infrastructure type this resource belongs to.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum InfrastructureType {
        Cloud("CLOUD"),
        CloudAtCustomer("CLOUD_AT_CUSTOMER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, InfrastructureType> map;

        static {
            map = new java.util.HashMap<>();
            for (InfrastructureType v : InfrastructureType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InfrastructureType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InfrastructureType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InfrastructureType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The infrastructure type this resource belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureType")
    InfrastructureType infrastructureType;

    /**
     * The OCID of the cloud Autonomous VM Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAutonomousVmClusterId")
    String cloudAutonomousVmClusterId;

    /**
     * The OCID of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    String kmsKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    String vaultId;

    /**
     * The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    String kmsKeyVersionId;

    /**
     * Key History Entry.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyHistoryEntry")
    java.util.List<AutonomousDatabaseKeyHistoryEntry> keyHistoryEntry;
    /**
     * The current state of the Autonomous Container Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        Restoring("RESTORING"),
        RestoreFailed("RESTORE_FAILED"),
        Restarting("RESTARTING"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        RoleChangeInProgress("ROLE_CHANGE_IN_PROGRESS"),
        Unavailable("UNAVAILABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The current state of the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The date and time the Autonomous Container Database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * Database patch model preference.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PatchModel {
        ReleaseUpdates("RELEASE_UPDATES"),
        ReleaseUpdateRevisions("RELEASE_UPDATE_REVISIONS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PatchModel> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchModel v : PatchModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Database patch model preference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchModel")
    PatchModel patchModel;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last patch applied on the system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    String patchId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the last maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastMaintenanceRunId")
    String lastMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the next maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextMaintenanceRunId")
    String nextMaintenanceRunId;

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindow")
    MaintenanceWindow maintenanceWindow;

    /**
     * The scheduling detail for the quarterly maintenance window of the standby Autonomous Container Database.
     * This value represents the number of days before scheduled maintenance of the primary database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("standbyMaintenanceBufferInDays")
    Integer standbyMaintenanceBufferInDays;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
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
     * The role of the Autonomous Data Guard-enabled Autonomous Container Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Role {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Role', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The role of the Autonomous Data Guard-enabled Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    Role role;

    /**
     * The availability domain of the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * Oracle Database version of the Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    String dbVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("backupConfig")
    AutonomousContainerDatabaseBackupConfig backupConfig;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the key store.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreId")
    String keyStoreId;

    /**
     * The wallet name for Oracle Key Vault.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreWalletName")
    String keyStoreWalletName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
