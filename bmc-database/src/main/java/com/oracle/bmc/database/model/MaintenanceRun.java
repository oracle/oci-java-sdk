/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of a maintenance run.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaintenanceRun.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MaintenanceRun {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
        private TargetResourceType targetResourceType;

        public Builder targetResourceType(TargetResourceType targetResourceType) {
            this.targetResourceType = targetResourceType;
            this.__explicitlySet__.add("targetResourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
        private MaintenanceType maintenanceType;

        public Builder maintenanceType(MaintenanceType maintenanceType) {
            this.maintenanceType = maintenanceType;
            this.__explicitlySet__.add("maintenanceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSubtype")
        private MaintenanceSubtype maintenanceSubtype;

        public Builder maintenanceSubtype(MaintenanceSubtype maintenanceSubtype) {
            this.maintenanceSubtype = maintenanceSubtype;
            this.__explicitlySet__.add("maintenanceSubtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerMaintenanceRunId")
        private String peerMaintenanceRunId;

        public Builder peerMaintenanceRunId(String peerMaintenanceRunId) {
            this.peerMaintenanceRunId = peerMaintenanceRunId;
            this.__explicitlySet__.add("peerMaintenanceRunId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
        private PatchingMode patchingMode;

        public Builder patchingMode(PatchingMode patchingMode) {
            this.patchingMode = patchingMode;
            this.__explicitlySet__.add("patchingMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchFailureCount")
        private Integer patchFailureCount;

        public Builder patchFailureCount(Integer patchFailureCount) {
            this.patchFailureCount = patchFailureCount;
            this.__explicitlySet__.add("patchFailureCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDbServerVersion")
        private String targetDbServerVersion;

        public Builder targetDbServerVersion(String targetDbServerVersion) {
            this.targetDbServerVersion = targetDbServerVersion;
            this.__explicitlySet__.add("targetDbServerVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetStorageServerVersion")
        private String targetStorageServerVersion;

        public Builder targetStorageServerVersion(String targetStorageServerVersion) {
            this.targetStorageServerVersion = targetStorageServerVersion;
            this.__explicitlySet__.add("targetStorageServerVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
        private Boolean isCustomActionTimeoutEnabled;

        public Builder isCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
            this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
            this.__explicitlySet__.add("isCustomActionTimeoutEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
        private Integer customActionTimeoutInMins;

        public Builder customActionTimeoutInMins(Integer customActionTimeoutInMins) {
            this.customActionTimeoutInMins = customActionTimeoutInMins;
            this.__explicitlySet__.add("customActionTimeoutInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentCustomActionTimeoutInMins")
        private Integer currentCustomActionTimeoutInMins;

        public Builder currentCustomActionTimeoutInMins(Integer currentCustomActionTimeoutInMins) {
            this.currentCustomActionTimeoutInMins = currentCustomActionTimeoutInMins;
            this.__explicitlySet__.add("currentCustomActionTimeoutInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchingStatus")
        private PatchingStatus patchingStatus;

        public Builder patchingStatus(PatchingStatus patchingStatus) {
            this.patchingStatus = patchingStatus;
            this.__explicitlySet__.add("patchingStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchingStartTime")
        private java.util.Date patchingStartTime;

        public Builder patchingStartTime(java.util.Date patchingStartTime) {
            this.patchingStartTime = patchingStartTime;
            this.__explicitlySet__.add("patchingStartTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchingEndTime")
        private java.util.Date patchingEndTime;

        public Builder patchingEndTime(java.util.Date patchingEndTime) {
            this.patchingEndTime = patchingEndTime;
            this.__explicitlySet__.add("patchingEndTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedPatchingTime")
        private EstimatedPatchingTime estimatedPatchingTime;

        public Builder estimatedPatchingTime(EstimatedPatchingTime estimatedPatchingTime) {
            this.estimatedPatchingTime = estimatedPatchingTime;
            this.__explicitlySet__.add("estimatedPatchingTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentPatchingComponent")
        private String currentPatchingComponent;

        public Builder currentPatchingComponent(String currentPatchingComponent) {
            this.currentPatchingComponent = currentPatchingComponent;
            this.__explicitlySet__.add("currentPatchingComponent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedComponentPatchingStartTime")
        private java.util.Date estimatedComponentPatchingStartTime;

        public Builder estimatedComponentPatchingStartTime(
                java.util.Date estimatedComponentPatchingStartTime) {
            this.estimatedComponentPatchingStartTime = estimatedComponentPatchingStartTime;
            this.__explicitlySet__.add("estimatedComponentPatchingStartTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceRun build() {
            MaintenanceRun __instance__ =
                    new MaintenanceRun(
                            id,
                            compartmentId,
                            displayName,
                            description,
                            lifecycleState,
                            lifecycleDetails,
                            timeScheduled,
                            timeStarted,
                            timeEnded,
                            targetResourceType,
                            targetResourceId,
                            maintenanceType,
                            patchId,
                            maintenanceSubtype,
                            peerMaintenanceRunId,
                            patchingMode,
                            patchFailureCount,
                            targetDbServerVersion,
                            targetStorageServerVersion,
                            isCustomActionTimeoutEnabled,
                            customActionTimeoutInMins,
                            currentCustomActionTimeoutInMins,
                            patchingStatus,
                            patchingStartTime,
                            patchingEndTime,
                            estimatedPatchingTime,
                            currentPatchingComponent,
                            estimatedComponentPatchingStartTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceRun o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeScheduled(o.getTimeScheduled())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
                            .targetResourceType(o.getTargetResourceType())
                            .targetResourceId(o.getTargetResourceId())
                            .maintenanceType(o.getMaintenanceType())
                            .patchId(o.getPatchId())
                            .maintenanceSubtype(o.getMaintenanceSubtype())
                            .peerMaintenanceRunId(o.getPeerMaintenanceRunId())
                            .patchingMode(o.getPatchingMode())
                            .patchFailureCount(o.getPatchFailureCount())
                            .targetDbServerVersion(o.getTargetDbServerVersion())
                            .targetStorageServerVersion(o.getTargetStorageServerVersion())
                            .isCustomActionTimeoutEnabled(o.getIsCustomActionTimeoutEnabled())
                            .customActionTimeoutInMins(o.getCustomActionTimeoutInMins())
                            .currentCustomActionTimeoutInMins(
                                    o.getCurrentCustomActionTimeoutInMins())
                            .patchingStatus(o.getPatchingStatus())
                            .patchingStartTime(o.getPatchingStartTime())
                            .patchingEndTime(o.getPatchingEndTime())
                            .estimatedPatchingTime(o.getEstimatedPatchingTime())
                            .currentPatchingComponent(o.getCurrentPatchingComponent())
                            .estimatedComponentPatchingStartTime(
                                    o.getEstimatedComponentPatchingStartTime());

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
     * The OCID of the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The user-friendly name for the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Description of the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
    /**
     * The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Scheduled("SCHEDULED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Skipped("SKIPPED"),
        Failed("FAILED"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Canceled("CANCELED"),

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
     * The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The date and time the maintenance run is scheduled to occur.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    java.util.Date timeScheduled;

    /**
     * The date and time the maintenance run starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * The date and time the maintenance run was completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    java.util.Date timeEnded;
    /**
     * The type of the target resource on which the maintenance run occurs.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TargetResourceType {
        AutonomousExadataInfrastructure("AUTONOMOUS_EXADATA_INFRASTRUCTURE"),
        AutonomousContainerDatabase("AUTONOMOUS_CONTAINER_DATABASE"),
        ExadataDbSystem("EXADATA_DB_SYSTEM"),
        CloudExadataInfrastructure("CLOUD_EXADATA_INFRASTRUCTURE"),
        ExaccInfrastructure("EXACC_INFRASTRUCTURE"),
        AutonomousVmCluster("AUTONOMOUS_VM_CLUSTER"),
        AutonomousDatabase("AUTONOMOUS_DATABASE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TargetResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetResourceType v : TargetResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the target resource on which the maintenance run occurs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
    TargetResourceType targetResourceType;

    /**
     * The ID of the target resource on which the maintenance run occurs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    String targetResourceId;
    /**
     * Maintenance type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MaintenanceType {
        Planned("PLANNED"),
        Unplanned("UNPLANNED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MaintenanceType> map;

        static {
            map = new java.util.HashMap<>();
            for (MaintenanceType v : MaintenanceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaintenanceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaintenanceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaintenanceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Maintenance type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
    MaintenanceType maintenanceType;

    /**
     * The unique identifier of the patch. The identifier string includes the patch type, the Oracle Database version, and the patch creation date (using the format YYMMDD). For example, the identifier {@code ru_patch_19.9.0.0_201030} is used for an RU patch for Oracle Database 19.9.0.0 that was released October 30, 2020.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    String patchId;
    /**
     * Maintenance sub-type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MaintenanceSubtype {
        Quarterly("QUARTERLY"),
        Hardware("HARDWARE"),
        Critical("CRITICAL"),
        Infrastructure("INFRASTRUCTURE"),
        Database("DATABASE"),
        Oneoff("ONEOFF"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MaintenanceSubtype> map;

        static {
            map = new java.util.HashMap<>();
            for (MaintenanceSubtype v : MaintenanceSubtype.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaintenanceSubtype(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaintenanceSubtype create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaintenanceSubtype', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Maintenance sub-type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSubtype")
    MaintenanceSubtype maintenanceSubtype;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association's peer container database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerMaintenanceRunId")
    String peerMaintenanceRunId;
    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default value is ROLLING.
     * <p>
     *IMPORTANT*: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PatchingMode {
        Rolling("ROLLING"),
        Nonrolling("NONROLLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PatchingMode> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchingMode v : PatchingMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchingMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchingMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchingMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default value is ROLLING.
     * <p>
     *IMPORTANT*: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
    PatchingMode patchingMode;

    /**
     * Contain the patch failure count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchFailureCount")
    Integer patchFailureCount;

    /**
     * The target software version for the database server patching operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDbServerVersion")
    String targetDbServerVersion;

    /**
     * The target Cell version that is to be patched to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetStorageServerVersion")
    String targetStorageServerVersion;

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
    Boolean isCustomActionTimeoutEnabled;

    /**
     * Determines the amount of time the system will wait before the start of each database server patching operation.
     * Specify a number of minutes, from 15 to 120.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
    Integer customActionTimeoutInMins;

    /**
     * Extend current custom action timeout between the current database servers during waiting state, from 0 (zero) to 30 minutes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentCustomActionTimeoutInMins")
    Integer currentCustomActionTimeoutInMins;
    /**
     * The status of the patching operation.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PatchingStatus {
        Patching("PATCHING"),
        Waiting("WAITING"),
        Scheduled("SCHEDULED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PatchingStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchingStatus v : PatchingStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchingStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchingStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchingStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the patching operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchingStatus")
    PatchingStatus patchingStatus;

    /**
     * The time when the patching operation started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchingStartTime")
    java.util.Date patchingStartTime;

    /**
     * The time when the patching operation ended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchingEndTime")
    java.util.Date patchingEndTime;

    @com.fasterxml.jackson.annotation.JsonProperty("estimatedPatchingTime")
    EstimatedPatchingTime estimatedPatchingTime;

    /**
     * The name of the current infrastruture component that is getting patched.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentPatchingComponent")
    String currentPatchingComponent;

    /**
     * The estimated start time of the next infrastruture component patching operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedComponentPatchingStartTime")
    java.util.Date estimatedComponentPatchingStartTime;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
