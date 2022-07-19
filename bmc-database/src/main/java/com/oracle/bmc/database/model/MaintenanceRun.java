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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaintenanceRun.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MaintenanceRun {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "lifecycleState",
        "lifecycleDetails",
        "timeScheduled",
        "timeStarted",
        "timeEnded",
        "targetResourceType",
        "targetResourceId",
        "maintenanceType",
        "patchId",
        "maintenanceSubtype",
        "peerMaintenanceRunId",
        "patchingMode",
        "patchFailureCount",
        "targetDbServerVersion",
        "targetStorageServerVersion",
        "isCustomActionTimeoutEnabled",
        "customActionTimeoutInMins",
        "currentCustomActionTimeoutInMins",
        "patchingStatus",
        "patchingStartTime",
        "patchingEndTime",
        "estimatedPatchingTime",
        "currentPatchingComponent",
        "estimatedComponentPatchingStartTime"
    })
    public MaintenanceRun(
            String id,
            String compartmentId,
            String displayName,
            String description,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeScheduled,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            TargetResourceType targetResourceType,
            String targetResourceId,
            MaintenanceType maintenanceType,
            String patchId,
            MaintenanceSubtype maintenanceSubtype,
            String peerMaintenanceRunId,
            PatchingMode patchingMode,
            Integer patchFailureCount,
            String targetDbServerVersion,
            String targetStorageServerVersion,
            Boolean isCustomActionTimeoutEnabled,
            Integer customActionTimeoutInMins,
            Integer currentCustomActionTimeoutInMins,
            PatchingStatus patchingStatus,
            java.util.Date patchingStartTime,
            java.util.Date patchingEndTime,
            EstimatedPatchingTime estimatedPatchingTime,
            String currentPatchingComponent,
            java.util.Date estimatedComponentPatchingStartTime) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeScheduled = timeScheduled;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.targetResourceType = targetResourceType;
        this.targetResourceId = targetResourceId;
        this.maintenanceType = maintenanceType;
        this.patchId = patchId;
        this.maintenanceSubtype = maintenanceSubtype;
        this.peerMaintenanceRunId = peerMaintenanceRunId;
        this.patchingMode = patchingMode;
        this.patchFailureCount = patchFailureCount;
        this.targetDbServerVersion = targetDbServerVersion;
        this.targetStorageServerVersion = targetStorageServerVersion;
        this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
        this.customActionTimeoutInMins = customActionTimeoutInMins;
        this.currentCustomActionTimeoutInMins = currentCustomActionTimeoutInMins;
        this.patchingStatus = patchingStatus;
        this.patchingStartTime = patchingStartTime;
        this.patchingEndTime = patchingEndTime;
        this.estimatedPatchingTime = estimatedPatchingTime;
        this.currentPatchingComponent = currentPatchingComponent;
        this.estimatedComponentPatchingStartTime = estimatedComponentPatchingStartTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the maintenance run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the maintenance run.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The user-friendly name for the maintenance run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the maintenance run.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Description of the maintenance run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the maintenance run.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Additional information about the current lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the maintenance run is scheduled to occur.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The date and time the maintenance run is scheduled to occur.
         * @param timeScheduled the value to set
         * @return this builder
         **/
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /**
         * The date and time the maintenance run starts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the maintenance run starts.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the maintenance run was completed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time the maintenance run was completed.
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * The type of the target resource on which the maintenance run occurs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
        private TargetResourceType targetResourceType;

        /**
         * The type of the target resource on which the maintenance run occurs.
         * @param targetResourceType the value to set
         * @return this builder
         **/
        public Builder targetResourceType(TargetResourceType targetResourceType) {
            this.targetResourceType = targetResourceType;
            this.__explicitlySet__.add("targetResourceType");
            return this;
        }
        /**
         * The ID of the target resource on which the maintenance run occurs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        /**
         * The ID of the target resource on which the maintenance run occurs.
         * @param targetResourceId the value to set
         * @return this builder
         **/
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }
        /**
         * Maintenance type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
        private MaintenanceType maintenanceType;

        /**
         * Maintenance type.
         * @param maintenanceType the value to set
         * @return this builder
         **/
        public Builder maintenanceType(MaintenanceType maintenanceType) {
            this.maintenanceType = maintenanceType;
            this.__explicitlySet__.add("maintenanceType");
            return this;
        }
        /**
         * The unique identifier of the patch. The identifier string includes the patch type, the Oracle Database version, and the patch creation date (using the format YYMMDD). For example, the identifier {@code ru_patch_19.9.0.0_201030} is used for an RU patch for Oracle Database 19.9.0.0 that was released October 30, 2020.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        /**
         * The unique identifier of the patch. The identifier string includes the patch type, the Oracle Database version, and the patch creation date (using the format YYMMDD). For example, the identifier {@code ru_patch_19.9.0.0_201030} is used for an RU patch for Oracle Database 19.9.0.0 that was released October 30, 2020.
         * @param patchId the value to set
         * @return this builder
         **/
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }
        /**
         * Maintenance sub-type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSubtype")
        private MaintenanceSubtype maintenanceSubtype;

        /**
         * Maintenance sub-type.
         * @param maintenanceSubtype the value to set
         * @return this builder
         **/
        public Builder maintenanceSubtype(MaintenanceSubtype maintenanceSubtype) {
            this.maintenanceSubtype = maintenanceSubtype;
            this.__explicitlySet__.add("maintenanceSubtype");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association's peer container database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerMaintenanceRunId")
        private String peerMaintenanceRunId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association's peer container database.
         * @param peerMaintenanceRunId the value to set
         * @return this builder
         **/
        public Builder peerMaintenanceRunId(String peerMaintenanceRunId) {
            this.peerMaintenanceRunId = peerMaintenanceRunId;
            this.__explicitlySet__.add("peerMaintenanceRunId");
            return this;
        }
        /**
         * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default value is ROLLING.
         * <p>
         *IMPORTANT*: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
        private PatchingMode patchingMode;

        /**
         * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default value is ROLLING.
         * <p>
         *IMPORTANT*: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information.
         *
         * @param patchingMode the value to set
         * @return this builder
         **/
        public Builder patchingMode(PatchingMode patchingMode) {
            this.patchingMode = patchingMode;
            this.__explicitlySet__.add("patchingMode");
            return this;
        }
        /**
         * Contain the patch failure count.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchFailureCount")
        private Integer patchFailureCount;

        /**
         * Contain the patch failure count.
         * @param patchFailureCount the value to set
         * @return this builder
         **/
        public Builder patchFailureCount(Integer patchFailureCount) {
            this.patchFailureCount = patchFailureCount;
            this.__explicitlySet__.add("patchFailureCount");
            return this;
        }
        /**
         * The target software version for the database server patching operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetDbServerVersion")
        private String targetDbServerVersion;

        /**
         * The target software version for the database server patching operation.
         * @param targetDbServerVersion the value to set
         * @return this builder
         **/
        public Builder targetDbServerVersion(String targetDbServerVersion) {
            this.targetDbServerVersion = targetDbServerVersion;
            this.__explicitlySet__.add("targetDbServerVersion");
            return this;
        }
        /**
         * The target Cell version that is to be patched to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetStorageServerVersion")
        private String targetStorageServerVersion;

        /**
         * The target Cell version that is to be patched to.
         * @param targetStorageServerVersion the value to set
         * @return this builder
         **/
        public Builder targetStorageServerVersion(String targetStorageServerVersion) {
            this.targetStorageServerVersion = targetStorageServerVersion;
            this.__explicitlySet__.add("targetStorageServerVersion");
            return this;
        }
        /**
         * If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
        private Boolean isCustomActionTimeoutEnabled;

        /**
         * If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
         * @param isCustomActionTimeoutEnabled the value to set
         * @return this builder
         **/
        public Builder isCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
            this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
            this.__explicitlySet__.add("isCustomActionTimeoutEnabled");
            return this;
        }
        /**
         * Determines the amount of time the system will wait before the start of each database server patching operation.
         * Specify a number of minutes, from 15 to 120.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
        private Integer customActionTimeoutInMins;

        /**
         * Determines the amount of time the system will wait before the start of each database server patching operation.
         * Specify a number of minutes, from 15 to 120.
         *
         * @param customActionTimeoutInMins the value to set
         * @return this builder
         **/
        public Builder customActionTimeoutInMins(Integer customActionTimeoutInMins) {
            this.customActionTimeoutInMins = customActionTimeoutInMins;
            this.__explicitlySet__.add("customActionTimeoutInMins");
            return this;
        }
        /**
         * Extend current custom action timeout between the current database servers during waiting state, from 0 (zero) to 30 minutes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentCustomActionTimeoutInMins")
        private Integer currentCustomActionTimeoutInMins;

        /**
         * Extend current custom action timeout between the current database servers during waiting state, from 0 (zero) to 30 minutes.
         * @param currentCustomActionTimeoutInMins the value to set
         * @return this builder
         **/
        public Builder currentCustomActionTimeoutInMins(Integer currentCustomActionTimeoutInMins) {
            this.currentCustomActionTimeoutInMins = currentCustomActionTimeoutInMins;
            this.__explicitlySet__.add("currentCustomActionTimeoutInMins");
            return this;
        }
        /**
         * The status of the patching operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchingStatus")
        private PatchingStatus patchingStatus;

        /**
         * The status of the patching operation.
         * @param patchingStatus the value to set
         * @return this builder
         **/
        public Builder patchingStatus(PatchingStatus patchingStatus) {
            this.patchingStatus = patchingStatus;
            this.__explicitlySet__.add("patchingStatus");
            return this;
        }
        /**
         * The time when the patching operation started.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchingStartTime")
        private java.util.Date patchingStartTime;

        /**
         * The time when the patching operation started.
         * @param patchingStartTime the value to set
         * @return this builder
         **/
        public Builder patchingStartTime(java.util.Date patchingStartTime) {
            this.patchingStartTime = patchingStartTime;
            this.__explicitlySet__.add("patchingStartTime");
            return this;
        }
        /**
         * The time when the patching operation ended.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchingEndTime")
        private java.util.Date patchingEndTime;

        /**
         * The time when the patching operation ended.
         * @param patchingEndTime the value to set
         * @return this builder
         **/
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
        /**
         * The name of the current infrastruture component that is getting patched.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentPatchingComponent")
        private String currentPatchingComponent;

        /**
         * The name of the current infrastruture component that is getting patched.
         * @param currentPatchingComponent the value to set
         * @return this builder
         **/
        public Builder currentPatchingComponent(String currentPatchingComponent) {
            this.currentPatchingComponent = currentPatchingComponent;
            this.__explicitlySet__.add("currentPatchingComponent");
            return this;
        }
        /**
         * The estimated start time of the next infrastruture component patching operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedComponentPatchingStartTime")
        private java.util.Date estimatedComponentPatchingStartTime;

        /**
         * The estimated start time of the next infrastruture component patching operation.
         * @param estimatedComponentPatchingStartTime the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the maintenance run.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The user-friendly name for the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the maintenance run.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description of the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the maintenance run.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
     *
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
    private final LifecycleState lifecycleState;

    /**
     * The current state of the maintenance run. For Autonomous Database on shared Exadata infrastructure, valid states are IN_PROGRESS, SUCCEEDED and FAILED.
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the maintenance run is scheduled to occur.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The date and time the maintenance run is scheduled to occur.
     * @return the value
     **/
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * The date and time the maintenance run starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the maintenance run starts.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the maintenance run was completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time the maintenance run was completed.
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * The type of the target resource on which the maintenance run occurs.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TargetResourceType.class);

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
    private final TargetResourceType targetResourceType;

    /**
     * The type of the target resource on which the maintenance run occurs.
     * @return the value
     **/
    public TargetResourceType getTargetResourceType() {
        return targetResourceType;
    }

    /**
     * The ID of the target resource on which the maintenance run occurs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    private final String targetResourceId;

    /**
     * The ID of the target resource on which the maintenance run occurs.
     * @return the value
     **/
    public String getTargetResourceId() {
        return targetResourceId;
    }

    /**
     * Maintenance type.
     **/
    public enum MaintenanceType {
        Planned("PLANNED"),
        Unplanned("UNPLANNED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MaintenanceType.class);

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
    private final MaintenanceType maintenanceType;

    /**
     * Maintenance type.
     * @return the value
     **/
    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * The unique identifier of the patch. The identifier string includes the patch type, the Oracle Database version, and the patch creation date (using the format YYMMDD). For example, the identifier {@code ru_patch_19.9.0.0_201030} is used for an RU patch for Oracle Database 19.9.0.0 that was released October 30, 2020.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    private final String patchId;

    /**
     * The unique identifier of the patch. The identifier string includes the patch type, the Oracle Database version, and the patch creation date (using the format YYMMDD). For example, the identifier {@code ru_patch_19.9.0.0_201030} is used for an RU patch for Oracle Database 19.9.0.0 that was released October 30, 2020.
     * @return the value
     **/
    public String getPatchId() {
        return patchId;
    }

    /**
     * Maintenance sub-type.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MaintenanceSubtype.class);

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
    private final MaintenanceSubtype maintenanceSubtype;

    /**
     * Maintenance sub-type.
     * @return the value
     **/
    public MaintenanceSubtype getMaintenanceSubtype() {
        return maintenanceSubtype;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association's peer container database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerMaintenanceRunId")
    private final String peerMaintenanceRunId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance run for the Autonomous Data Guard association's peer container database.
     * @return the value
     **/
    public String getPeerMaintenanceRunId() {
        return peerMaintenanceRunId;
    }

    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default value is ROLLING.
     * <p>
     *IMPORTANT*: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information.
     *
     **/
    public enum PatchingMode {
        Rolling("ROLLING"),
        Nonrolling("NONROLLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchingMode.class);

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
    private final PatchingMode patchingMode;

    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default value is ROLLING.
     * <p>
     *IMPORTANT*: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information.
     *
     * @return the value
     **/
    public PatchingMode getPatchingMode() {
        return patchingMode;
    }

    /**
     * Contain the patch failure count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchFailureCount")
    private final Integer patchFailureCount;

    /**
     * Contain the patch failure count.
     * @return the value
     **/
    public Integer getPatchFailureCount() {
        return patchFailureCount;
    }

    /**
     * The target software version for the database server patching operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetDbServerVersion")
    private final String targetDbServerVersion;

    /**
     * The target software version for the database server patching operation.
     * @return the value
     **/
    public String getTargetDbServerVersion() {
        return targetDbServerVersion;
    }

    /**
     * The target Cell version that is to be patched to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetStorageServerVersion")
    private final String targetStorageServerVersion;

    /**
     * The target Cell version that is to be patched to.
     * @return the value
     **/
    public String getTargetStorageServerVersion() {
        return targetStorageServerVersion;
    }

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
    private final Boolean isCustomActionTimeoutEnabled;

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
     * @return the value
     **/
    public Boolean getIsCustomActionTimeoutEnabled() {
        return isCustomActionTimeoutEnabled;
    }

    /**
     * Determines the amount of time the system will wait before the start of each database server patching operation.
     * Specify a number of minutes, from 15 to 120.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
    private final Integer customActionTimeoutInMins;

    /**
     * Determines the amount of time the system will wait before the start of each database server patching operation.
     * Specify a number of minutes, from 15 to 120.
     *
     * @return the value
     **/
    public Integer getCustomActionTimeoutInMins() {
        return customActionTimeoutInMins;
    }

    /**
     * Extend current custom action timeout between the current database servers during waiting state, from 0 (zero) to 30 minutes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentCustomActionTimeoutInMins")
    private final Integer currentCustomActionTimeoutInMins;

    /**
     * Extend current custom action timeout between the current database servers during waiting state, from 0 (zero) to 30 minutes.
     * @return the value
     **/
    public Integer getCurrentCustomActionTimeoutInMins() {
        return currentCustomActionTimeoutInMins;
    }

    /**
     * The status of the patching operation.
     **/
    public enum PatchingStatus {
        Patching("PATCHING"),
        Waiting("WAITING"),
        Scheduled("SCHEDULED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchingStatus.class);

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
    private final PatchingStatus patchingStatus;

    /**
     * The status of the patching operation.
     * @return the value
     **/
    public PatchingStatus getPatchingStatus() {
        return patchingStatus;
    }

    /**
     * The time when the patching operation started.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchingStartTime")
    private final java.util.Date patchingStartTime;

    /**
     * The time when the patching operation started.
     * @return the value
     **/
    public java.util.Date getPatchingStartTime() {
        return patchingStartTime;
    }

    /**
     * The time when the patching operation ended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchingEndTime")
    private final java.util.Date patchingEndTime;

    /**
     * The time when the patching operation ended.
     * @return the value
     **/
    public java.util.Date getPatchingEndTime() {
        return patchingEndTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("estimatedPatchingTime")
    private final EstimatedPatchingTime estimatedPatchingTime;

    public EstimatedPatchingTime getEstimatedPatchingTime() {
        return estimatedPatchingTime;
    }

    /**
     * The name of the current infrastruture component that is getting patched.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentPatchingComponent")
    private final String currentPatchingComponent;

    /**
     * The name of the current infrastruture component that is getting patched.
     * @return the value
     **/
    public String getCurrentPatchingComponent() {
        return currentPatchingComponent;
    }

    /**
     * The estimated start time of the next infrastruture component patching operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedComponentPatchingStartTime")
    private final java.util.Date estimatedComponentPatchingStartTime;

    /**
     * The estimated start time of the next infrastruture component patching operation.
     * @return the value
     **/
    public java.util.Date getEstimatedComponentPatchingStartTime() {
        return estimatedComponentPatchingStartTime;
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
        sb.append("MaintenanceRun(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", targetResourceType=").append(String.valueOf(this.targetResourceType));
        sb.append(", targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(", maintenanceType=").append(String.valueOf(this.maintenanceType));
        sb.append(", patchId=").append(String.valueOf(this.patchId));
        sb.append(", maintenanceSubtype=").append(String.valueOf(this.maintenanceSubtype));
        sb.append(", peerMaintenanceRunId=").append(String.valueOf(this.peerMaintenanceRunId));
        sb.append(", patchingMode=").append(String.valueOf(this.patchingMode));
        sb.append(", patchFailureCount=").append(String.valueOf(this.patchFailureCount));
        sb.append(", targetDbServerVersion=").append(String.valueOf(this.targetDbServerVersion));
        sb.append(", targetStorageServerVersion=")
                .append(String.valueOf(this.targetStorageServerVersion));
        sb.append(", isCustomActionTimeoutEnabled=")
                .append(String.valueOf(this.isCustomActionTimeoutEnabled));
        sb.append(", customActionTimeoutInMins=")
                .append(String.valueOf(this.customActionTimeoutInMins));
        sb.append(", currentCustomActionTimeoutInMins=")
                .append(String.valueOf(this.currentCustomActionTimeoutInMins));
        sb.append(", patchingStatus=").append(String.valueOf(this.patchingStatus));
        sb.append(", patchingStartTime=").append(String.valueOf(this.patchingStartTime));
        sb.append(", patchingEndTime=").append(String.valueOf(this.patchingEndTime));
        sb.append(", estimatedPatchingTime=").append(String.valueOf(this.estimatedPatchingTime));
        sb.append(", currentPatchingComponent=")
                .append(String.valueOf(this.currentPatchingComponent));
        sb.append(", estimatedComponentPatchingStartTime=")
                .append(String.valueOf(this.estimatedComponentPatchingStartTime));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceRun)) {
            return false;
        }

        MaintenanceRun other = (MaintenanceRun) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.targetResourceType, other.targetResourceType)
                && java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(this.maintenanceType, other.maintenanceType)
                && java.util.Objects.equals(this.patchId, other.patchId)
                && java.util.Objects.equals(this.maintenanceSubtype, other.maintenanceSubtype)
                && java.util.Objects.equals(this.peerMaintenanceRunId, other.peerMaintenanceRunId)
                && java.util.Objects.equals(this.patchingMode, other.patchingMode)
                && java.util.Objects.equals(this.patchFailureCount, other.patchFailureCount)
                && java.util.Objects.equals(this.targetDbServerVersion, other.targetDbServerVersion)
                && java.util.Objects.equals(
                        this.targetStorageServerVersion, other.targetStorageServerVersion)
                && java.util.Objects.equals(
                        this.isCustomActionTimeoutEnabled, other.isCustomActionTimeoutEnabled)
                && java.util.Objects.equals(
                        this.customActionTimeoutInMins, other.customActionTimeoutInMins)
                && java.util.Objects.equals(
                        this.currentCustomActionTimeoutInMins,
                        other.currentCustomActionTimeoutInMins)
                && java.util.Objects.equals(this.patchingStatus, other.patchingStatus)
                && java.util.Objects.equals(this.patchingStartTime, other.patchingStartTime)
                && java.util.Objects.equals(this.patchingEndTime, other.patchingEndTime)
                && java.util.Objects.equals(this.estimatedPatchingTime, other.estimatedPatchingTime)
                && java.util.Objects.equals(
                        this.currentPatchingComponent, other.currentPatchingComponent)
                && java.util.Objects.equals(
                        this.estimatedComponentPatchingStartTime,
                        other.estimatedComponentPatchingStartTime)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceType == null
                                ? 43
                                : this.targetResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceId == null ? 43 : this.targetResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceType == null ? 43 : this.maintenanceType.hashCode());
        result = (result * PRIME) + (this.patchId == null ? 43 : this.patchId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceSubtype == null
                                ? 43
                                : this.maintenanceSubtype.hashCode());
        result =
                (result * PRIME)
                        + (this.peerMaintenanceRunId == null
                                ? 43
                                : this.peerMaintenanceRunId.hashCode());
        result = (result * PRIME) + (this.patchingMode == null ? 43 : this.patchingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.patchFailureCount == null ? 43 : this.patchFailureCount.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDbServerVersion == null
                                ? 43
                                : this.targetDbServerVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetStorageServerVersion == null
                                ? 43
                                : this.targetStorageServerVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isCustomActionTimeoutEnabled == null
                                ? 43
                                : this.isCustomActionTimeoutEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.customActionTimeoutInMins == null
                                ? 43
                                : this.customActionTimeoutInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.currentCustomActionTimeoutInMins == null
                                ? 43
                                : this.currentCustomActionTimeoutInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.patchingStatus == null ? 43 : this.patchingStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.patchingStartTime == null ? 43 : this.patchingStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.patchingEndTime == null ? 43 : this.patchingEndTime.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedPatchingTime == null
                                ? 43
                                : this.estimatedPatchingTime.hashCode());
        result =
                (result * PRIME)
                        + (this.currentPatchingComponent == null
                                ? 43
                                : this.currentPatchingComponent.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedComponentPatchingStartTime == null
                                ? 43
                                : this.estimatedComponentPatchingStartTime.hashCode());
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
