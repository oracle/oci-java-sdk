/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Summary of a maintenance run. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaintenanceRunSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaintenanceRunSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "lifecycleState",
        "lifecycleDetails",
        "initialScheduledTime",
        "timeScheduled",
        "timeStarted",
        "timeEnded",
        "targetResourceType",
        "infrastructureId",
        "maintenanceType",
        "patchIdentifier",
        "maintenanceSubtype",
        "patchingMode",
        "patchFailureCount",
        "sourceVersion",
        "targetVersion",
        "isCustomActionTimeoutEnabled",
        "customActionTimeoutInMins",
        "patchingStatus",
        "patchingStartTime",
        "patchingEndTime",
        "estimatedPatchingTime",
        "currentPatchingComponent",
        "estimatedComponentPatchingStartTime",
        "systemTags",
        "definedTags",
        "freeformTags",
        "totalTimeTakenInMins"
    })
    public MaintenanceRunSummary(
            String id,
            String compartmentId,
            String displayName,
            String description,
            MaintenanceRunLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date initialScheduledTime,
            java.util.Date timeScheduled,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            TargetResourceTypeEnum targetResourceType,
            String infrastructureId,
            MaintenanceTypeEnum maintenanceType,
            String patchIdentifier,
            MaintenanceSubtypeEnum maintenanceSubtype,
            PatchingModeEnum patchingMode,
            Integer patchFailureCount,
            String sourceVersion,
            String targetVersion,
            Boolean isCustomActionTimeoutEnabled,
            Integer customActionTimeoutInMins,
            PatchingStatusEnum patchingStatus,
            java.util.Date patchingStartTime,
            java.util.Date patchingEndTime,
            Integer estimatedPatchingTime,
            String currentPatchingComponent,
            java.util.Date estimatedComponentPatchingStartTime,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            Integer totalTimeTakenInMins) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.initialScheduledTime = initialScheduledTime;
        this.timeScheduled = timeScheduled;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.targetResourceType = targetResourceType;
        this.infrastructureId = infrastructureId;
        this.maintenanceType = maintenanceType;
        this.patchIdentifier = patchIdentifier;
        this.maintenanceSubtype = maintenanceSubtype;
        this.patchingMode = patchingMode;
        this.patchFailureCount = patchFailureCount;
        this.sourceVersion = sourceVersion;
        this.targetVersion = targetVersion;
        this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
        this.customActionTimeoutInMins = customActionTimeoutInMins;
        this.patchingStatus = patchingStatus;
        this.patchingStartTime = patchingStartTime;
        this.patchingEndTime = patchingEndTime;
        this.estimatedPatchingTime = estimatedPatchingTime;
        this.currentPatchingComponent = currentPatchingComponent;
        this.estimatedComponentPatchingStartTime = estimatedComponentPatchingStartTime;
        this.systemTags = systemTags;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.totalTimeTakenInMins = totalTimeTakenInMins;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * maintenance run.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The user-friendly name for the maintenance run. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the maintenance run.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the maintenance run. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the maintenance run.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The current state of the maintenance run. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MaintenanceRunLifecycleState lifecycleState;

        /**
         * The current state of the maintenance run.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(MaintenanceRunLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The date and time the maintenance run was originally scheduled. */
        @com.fasterxml.jackson.annotation.JsonProperty("initialScheduledTime")
        private java.util.Date initialScheduledTime;

        /**
         * The date and time the maintenance run was originally scheduled.
         *
         * @param initialScheduledTime the value to set
         * @return this builder
         */
        public Builder initialScheduledTime(java.util.Date initialScheduledTime) {
            this.initialScheduledTime = initialScheduledTime;
            this.__explicitlySet__.add("initialScheduledTime");
            return this;
        }
        /** The date and time the maintenance run is scheduled to occur. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The date and time the maintenance run is scheduled to occur.
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /** The date and time the maintenance run starts. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the maintenance run starts.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The date and time the maintenance run was completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time the maintenance run was completed.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** The type of the target resource on which the maintenance run occurs. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
        private TargetResourceTypeEnum targetResourceType;

        /**
         * The type of the target resource on which the maintenance run occurs.
         *
         * @param targetResourceType the value to set
         * @return this builder
         */
        public Builder targetResourceType(TargetResourceTypeEnum targetResourceType) {
            this.targetResourceType = targetResourceType;
            this.__explicitlySet__.add("targetResourceType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Infrastructure on which the maintenance run execution occurs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
        private String infrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Infrastructure on which the maintenance run execution occurs.
         *
         * @param infrastructureId the value to set
         * @return this builder
         */
        public Builder infrastructureId(String infrastructureId) {
            this.infrastructureId = infrastructureId;
            this.__explicitlySet__.add("infrastructureId");
            return this;
        }
        /** Maintenance type. */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
        private MaintenanceTypeEnum maintenanceType;

        /**
         * Maintenance type.
         *
         * @param maintenanceType the value to set
         * @return this builder
         */
        public Builder maintenanceType(MaintenanceTypeEnum maintenanceType) {
            this.maintenanceType = maintenanceType;
            this.__explicitlySet__.add("maintenanceType");
            return this;
        }
        /**
         * The unique identifier of the patch. The identifier string includes the patch type and the
         * version of the Database Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchIdentifier")
        private String patchIdentifier;

        /**
         * The unique identifier of the patch. The identifier string includes the patch type and the
         * version of the Database Infrastructure.
         *
         * @param patchIdentifier the value to set
         * @return this builder
         */
        public Builder patchIdentifier(String patchIdentifier) {
            this.patchIdentifier = patchIdentifier;
            this.__explicitlySet__.add("patchIdentifier");
            return this;
        }
        /** Maintenance run sub-type. */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSubtype")
        private MaintenanceSubtypeEnum maintenanceSubtype;

        /**
         * Maintenance run sub-type.
         *
         * @param maintenanceSubtype the value to set
         * @return this builder
         */
        public Builder maintenanceSubtype(MaintenanceSubtypeEnum maintenanceSubtype) {
            this.maintenanceSubtype = maintenanceSubtype;
            this.__explicitlySet__.add("maintenanceSubtype");
            return this;
        }
        /**
         * Database Infrastructure patching mode, either "ROLLING" or "NONROLLING". Default value is
         * ROLLING.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
        private PatchingModeEnum patchingMode;

        /**
         * Database Infrastructure patching mode, either "ROLLING" or "NONROLLING". Default value is
         * ROLLING.
         *
         * @param patchingMode the value to set
         * @return this builder
         */
        public Builder patchingMode(PatchingModeEnum patchingMode) {
            this.patchingMode = patchingMode;
            this.__explicitlySet__.add("patchingMode");
            return this;
        }
        /** Contain the patch failure count. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchFailureCount")
        private Integer patchFailureCount;

        /**
         * Contain the patch failure count.
         *
         * @param patchFailureCount the value to set
         * @return this builder
         */
        public Builder patchFailureCount(Integer patchFailureCount) {
            this.patchFailureCount = patchFailureCount;
            this.__explicitlySet__.add("patchFailureCount");
            return this;
        }
        /** The source software version for the Database Infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceVersion")
        private String sourceVersion;

        /**
         * The source software version for the Database Infrastructure.
         *
         * @param sourceVersion the value to set
         * @return this builder
         */
        public Builder sourceVersion(String sourceVersion) {
            this.sourceVersion = sourceVersion;
            this.__explicitlySet__.add("sourceVersion");
            return this;
        }
        /** The target software version for the Database Infrastructure patching operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
        private String targetVersion;

        /**
         * The target software version for the Database Infrastructure patching operation.
         *
         * @param targetVersion the value to set
         * @return this builder
         */
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            this.__explicitlySet__.add("targetVersion");
            return this;
        }
        /**
         * If true, enables the configuration of a custom action timeout (waiting period) between
         * compute servers patching operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
        private Boolean isCustomActionTimeoutEnabled;

        /**
         * If true, enables the configuration of a custom action timeout (waiting period) between
         * compute servers patching operations.
         *
         * @param isCustomActionTimeoutEnabled the value to set
         * @return this builder
         */
        public Builder isCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
            this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
            this.__explicitlySet__.add("isCustomActionTimeoutEnabled");
            return this;
        }
        /**
         * Determines the amount of time the system will wait before the start of each compute
         * server patching operation. Supported values are 15 to 120 minutes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
        private Integer customActionTimeoutInMins;

        /**
         * Determines the amount of time the system will wait before the start of each compute
         * server patching operation. Supported values are 15 to 120 minutes.
         *
         * @param customActionTimeoutInMins the value to set
         * @return this builder
         */
        public Builder customActionTimeoutInMins(Integer customActionTimeoutInMins) {
            this.customActionTimeoutInMins = customActionTimeoutInMins;
            this.__explicitlySet__.add("customActionTimeoutInMins");
            return this;
        }
        /** The status of the patching operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchingStatus")
        private PatchingStatusEnum patchingStatus;

        /**
         * The status of the patching operation.
         *
         * @param patchingStatus the value to set
         * @return this builder
         */
        public Builder patchingStatus(PatchingStatusEnum patchingStatus) {
            this.patchingStatus = patchingStatus;
            this.__explicitlySet__.add("patchingStatus");
            return this;
        }
        /** The time when the patching operation started. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchingStartTime")
        private java.util.Date patchingStartTime;

        /**
         * The time when the patching operation started.
         *
         * @param patchingStartTime the value to set
         * @return this builder
         */
        public Builder patchingStartTime(java.util.Date patchingStartTime) {
            this.patchingStartTime = patchingStartTime;
            this.__explicitlySet__.add("patchingStartTime");
            return this;
        }
        /** The time when the patching operation ended. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchingEndTime")
        private java.util.Date patchingEndTime;

        /**
         * The time when the patching operation ended.
         *
         * @param patchingEndTime the value to set
         * @return this builder
         */
        public Builder patchingEndTime(java.util.Date patchingEndTime) {
            this.patchingEndTime = patchingEndTime;
            this.__explicitlySet__.add("patchingEndTime");
            return this;
        }
        /**
         * The estimated total time required in minutes for all patching operations (compute
         * servers, storage).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedPatchingTime")
        private Integer estimatedPatchingTime;

        /**
         * The estimated total time required in minutes for all patching operations (compute
         * servers, storage).
         *
         * @param estimatedPatchingTime the value to set
         * @return this builder
         */
        public Builder estimatedPatchingTime(Integer estimatedPatchingTime) {
            this.estimatedPatchingTime = estimatedPatchingTime;
            this.__explicitlySet__.add("estimatedPatchingTime");
            return this;
        }
        /** The name of the current infrastructure component that is getting patched. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentPatchingComponent")
        private String currentPatchingComponent;

        /**
         * The name of the current infrastructure component that is getting patched.
         *
         * @param currentPatchingComponent the value to set
         * @return this builder
         */
        public Builder currentPatchingComponent(String currentPatchingComponent) {
            this.currentPatchingComponent = currentPatchingComponent;
            this.__explicitlySet__.add("currentPatchingComponent");
            return this;
        }
        /** The estimated start time of the next infrastructure component patching operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedComponentPatchingStartTime")
        private java.util.Date estimatedComponentPatchingStartTime;

        /**
         * The estimated start time of the next infrastructure component patching operation.
         *
         * @param estimatedComponentPatchingStartTime the value to set
         * @return this builder
         */
        public Builder estimatedComponentPatchingStartTime(
                java.util.Date estimatedComponentPatchingStartTime) {
            this.estimatedComponentPatchingStartTime = estimatedComponentPatchingStartTime;
            this.__explicitlySet__.add("estimatedComponentPatchingStartTime");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * { "orcl-cloud": { "free-tier-retained": "true" } }}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * { "orcl-cloud": { "free-tier-retained": "true" } }}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. This
         * tag option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. This
         * tag option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /** The total time taken by corresponding resource activity in minutes. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalTimeTakenInMins")
        private Integer totalTimeTakenInMins;

        /**
         * The total time taken by corresponding resource activity in minutes.
         *
         * @param totalTimeTakenInMins the value to set
         * @return this builder
         */
        public Builder totalTimeTakenInMins(Integer totalTimeTakenInMins) {
            this.totalTimeTakenInMins = totalTimeTakenInMins;
            this.__explicitlySet__.add("totalTimeTakenInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceRunSummary build() {
            MaintenanceRunSummary model =
                    new MaintenanceRunSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.initialScheduledTime,
                            this.timeScheduled,
                            this.timeStarted,
                            this.timeEnded,
                            this.targetResourceType,
                            this.infrastructureId,
                            this.maintenanceType,
                            this.patchIdentifier,
                            this.maintenanceSubtype,
                            this.patchingMode,
                            this.patchFailureCount,
                            this.sourceVersion,
                            this.targetVersion,
                            this.isCustomActionTimeoutEnabled,
                            this.customActionTimeoutInMins,
                            this.patchingStatus,
                            this.patchingStartTime,
                            this.patchingEndTime,
                            this.estimatedPatchingTime,
                            this.currentPatchingComponent,
                            this.estimatedComponentPatchingStartTime,
                            this.systemTags,
                            this.definedTags,
                            this.freeformTags,
                            this.totalTimeTakenInMins);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceRunSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("initialScheduledTime")) {
                this.initialScheduledTime(model.getInitialScheduledTime());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("targetResourceType")) {
                this.targetResourceType(model.getTargetResourceType());
            }
            if (model.wasPropertyExplicitlySet("infrastructureId")) {
                this.infrastructureId(model.getInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("maintenanceType")) {
                this.maintenanceType(model.getMaintenanceType());
            }
            if (model.wasPropertyExplicitlySet("patchIdentifier")) {
                this.patchIdentifier(model.getPatchIdentifier());
            }
            if (model.wasPropertyExplicitlySet("maintenanceSubtype")) {
                this.maintenanceSubtype(model.getMaintenanceSubtype());
            }
            if (model.wasPropertyExplicitlySet("patchingMode")) {
                this.patchingMode(model.getPatchingMode());
            }
            if (model.wasPropertyExplicitlySet("patchFailureCount")) {
                this.patchFailureCount(model.getPatchFailureCount());
            }
            if (model.wasPropertyExplicitlySet("sourceVersion")) {
                this.sourceVersion(model.getSourceVersion());
            }
            if (model.wasPropertyExplicitlySet("targetVersion")) {
                this.targetVersion(model.getTargetVersion());
            }
            if (model.wasPropertyExplicitlySet("isCustomActionTimeoutEnabled")) {
                this.isCustomActionTimeoutEnabled(model.getIsCustomActionTimeoutEnabled());
            }
            if (model.wasPropertyExplicitlySet("customActionTimeoutInMins")) {
                this.customActionTimeoutInMins(model.getCustomActionTimeoutInMins());
            }
            if (model.wasPropertyExplicitlySet("patchingStatus")) {
                this.patchingStatus(model.getPatchingStatus());
            }
            if (model.wasPropertyExplicitlySet("patchingStartTime")) {
                this.patchingStartTime(model.getPatchingStartTime());
            }
            if (model.wasPropertyExplicitlySet("patchingEndTime")) {
                this.patchingEndTime(model.getPatchingEndTime());
            }
            if (model.wasPropertyExplicitlySet("estimatedPatchingTime")) {
                this.estimatedPatchingTime(model.getEstimatedPatchingTime());
            }
            if (model.wasPropertyExplicitlySet("currentPatchingComponent")) {
                this.currentPatchingComponent(model.getCurrentPatchingComponent());
            }
            if (model.wasPropertyExplicitlySet("estimatedComponentPatchingStartTime")) {
                this.estimatedComponentPatchingStartTime(
                        model.getEstimatedComponentPatchingStartTime());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("totalTimeTakenInMins")) {
                this.totalTimeTakenInMins(model.getTotalTimeTakenInMins());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * maintenance run.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The user-friendly name for the maintenance run. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the maintenance run.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the maintenance run. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the maintenance run.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The current state of the maintenance run. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MaintenanceRunLifecycleState lifecycleState;

    /**
     * The current state of the maintenance run.
     *
     * @return the value
     */
    public MaintenanceRunLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The date and time the maintenance run was originally scheduled. */
    @com.fasterxml.jackson.annotation.JsonProperty("initialScheduledTime")
    private final java.util.Date initialScheduledTime;

    /**
     * The date and time the maintenance run was originally scheduled.
     *
     * @return the value
     */
    public java.util.Date getInitialScheduledTime() {
        return initialScheduledTime;
    }

    /** The date and time the maintenance run is scheduled to occur. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The date and time the maintenance run is scheduled to occur.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /** The date and time the maintenance run starts. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the maintenance run starts.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The date and time the maintenance run was completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time the maintenance run was completed.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** The type of the target resource on which the maintenance run occurs. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
    private final TargetResourceTypeEnum targetResourceType;

    /**
     * The type of the target resource on which the maintenance run occurs.
     *
     * @return the value
     */
    public TargetResourceTypeEnum getTargetResourceType() {
        return targetResourceType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure on which the maintenance run execution occurs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
    private final String infrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure on which the maintenance run execution occurs.
     *
     * @return the value
     */
    public String getInfrastructureId() {
        return infrastructureId;
    }

    /** Maintenance type. */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
    private final MaintenanceTypeEnum maintenanceType;

    /**
     * Maintenance type.
     *
     * @return the value
     */
    public MaintenanceTypeEnum getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * The unique identifier of the patch. The identifier string includes the patch type and the
     * version of the Database Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchIdentifier")
    private final String patchIdentifier;

    /**
     * The unique identifier of the patch. The identifier string includes the patch type and the
     * version of the Database Infrastructure.
     *
     * @return the value
     */
    public String getPatchIdentifier() {
        return patchIdentifier;
    }

    /** Maintenance run sub-type. */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSubtype")
    private final MaintenanceSubtypeEnum maintenanceSubtype;

    /**
     * Maintenance run sub-type.
     *
     * @return the value
     */
    public MaintenanceSubtypeEnum getMaintenanceSubtype() {
        return maintenanceSubtype;
    }

    /**
     * Database Infrastructure patching mode, either "ROLLING" or "NONROLLING". Default value is
     * ROLLING.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
    private final PatchingModeEnum patchingMode;

    /**
     * Database Infrastructure patching mode, either "ROLLING" or "NONROLLING". Default value is
     * ROLLING.
     *
     * @return the value
     */
    public PatchingModeEnum getPatchingMode() {
        return patchingMode;
    }

    /** Contain the patch failure count. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchFailureCount")
    private final Integer patchFailureCount;

    /**
     * Contain the patch failure count.
     *
     * @return the value
     */
    public Integer getPatchFailureCount() {
        return patchFailureCount;
    }

    /** The source software version for the Database Infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVersion")
    private final String sourceVersion;

    /**
     * The source software version for the Database Infrastructure.
     *
     * @return the value
     */
    public String getSourceVersion() {
        return sourceVersion;
    }

    /** The target software version for the Database Infrastructure patching operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetVersion")
    private final String targetVersion;

    /**
     * The target software version for the Database Infrastructure patching operation.
     *
     * @return the value
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between
     * compute servers patching operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
    private final Boolean isCustomActionTimeoutEnabled;

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between
     * compute servers patching operations.
     *
     * @return the value
     */
    public Boolean getIsCustomActionTimeoutEnabled() {
        return isCustomActionTimeoutEnabled;
    }

    /**
     * Determines the amount of time the system will wait before the start of each compute server
     * patching operation. Supported values are 15 to 120 minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
    private final Integer customActionTimeoutInMins;

    /**
     * Determines the amount of time the system will wait before the start of each compute server
     * patching operation. Supported values are 15 to 120 minutes.
     *
     * @return the value
     */
    public Integer getCustomActionTimeoutInMins() {
        return customActionTimeoutInMins;
    }

    /** The status of the patching operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchingStatus")
    private final PatchingStatusEnum patchingStatus;

    /**
     * The status of the patching operation.
     *
     * @return the value
     */
    public PatchingStatusEnum getPatchingStatus() {
        return patchingStatus;
    }

    /** The time when the patching operation started. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchingStartTime")
    private final java.util.Date patchingStartTime;

    /**
     * The time when the patching operation started.
     *
     * @return the value
     */
    public java.util.Date getPatchingStartTime() {
        return patchingStartTime;
    }

    /** The time when the patching operation ended. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchingEndTime")
    private final java.util.Date patchingEndTime;

    /**
     * The time when the patching operation ended.
     *
     * @return the value
     */
    public java.util.Date getPatchingEndTime() {
        return patchingEndTime;
    }

    /**
     * The estimated total time required in minutes for all patching operations (compute servers,
     * storage).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedPatchingTime")
    private final Integer estimatedPatchingTime;

    /**
     * The estimated total time required in minutes for all patching operations (compute servers,
     * storage).
     *
     * @return the value
     */
    public Integer getEstimatedPatchingTime() {
        return estimatedPatchingTime;
    }

    /** The name of the current infrastructure component that is getting patched. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentPatchingComponent")
    private final String currentPatchingComponent;

    /**
     * The name of the current infrastructure component that is getting patched.
     *
     * @return the value
     */
    public String getCurrentPatchingComponent() {
        return currentPatchingComponent;
    }

    /** The estimated start time of the next infrastructure component patching operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedComponentPatchingStartTime")
    private final java.util.Date estimatedComponentPatchingStartTime;

    /**
     * The estimated start time of the next infrastructure component patching operation.
     *
     * @return the value
     */
    public java.util.Date getEstimatedComponentPatchingStartTime() {
        return estimatedComponentPatchingStartTime;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code {
     * "orcl-cloud": { "free-tier-retained": "true" } }}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code {
     * "orcl-cloud": { "free-tier-retained": "true" } }}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. This tag
     * option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. This tag
     * option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /** The total time taken by corresponding resource activity in minutes. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalTimeTakenInMins")
    private final Integer totalTimeTakenInMins;

    /**
     * The total time taken by corresponding resource activity in minutes.
     *
     * @return the value
     */
    public Integer getTotalTimeTakenInMins() {
        return totalTimeTakenInMins;
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
        sb.append("MaintenanceRunSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", initialScheduledTime=").append(String.valueOf(this.initialScheduledTime));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", targetResourceType=").append(String.valueOf(this.targetResourceType));
        sb.append(", infrastructureId=").append(String.valueOf(this.infrastructureId));
        sb.append(", maintenanceType=").append(String.valueOf(this.maintenanceType));
        sb.append(", patchIdentifier=").append(String.valueOf(this.patchIdentifier));
        sb.append(", maintenanceSubtype=").append(String.valueOf(this.maintenanceSubtype));
        sb.append(", patchingMode=").append(String.valueOf(this.patchingMode));
        sb.append(", patchFailureCount=").append(String.valueOf(this.patchFailureCount));
        sb.append(", sourceVersion=").append(String.valueOf(this.sourceVersion));
        sb.append(", targetVersion=").append(String.valueOf(this.targetVersion));
        sb.append(", isCustomActionTimeoutEnabled=")
                .append(String.valueOf(this.isCustomActionTimeoutEnabled));
        sb.append(", customActionTimeoutInMins=")
                .append(String.valueOf(this.customActionTimeoutInMins));
        sb.append(", patchingStatus=").append(String.valueOf(this.patchingStatus));
        sb.append(", patchingStartTime=").append(String.valueOf(this.patchingStartTime));
        sb.append(", patchingEndTime=").append(String.valueOf(this.patchingEndTime));
        sb.append(", estimatedPatchingTime=").append(String.valueOf(this.estimatedPatchingTime));
        sb.append(", currentPatchingComponent=")
                .append(String.valueOf(this.currentPatchingComponent));
        sb.append(", estimatedComponentPatchingStartTime=")
                .append(String.valueOf(this.estimatedComponentPatchingStartTime));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", totalTimeTakenInMins=").append(String.valueOf(this.totalTimeTakenInMins));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceRunSummary)) {
            return false;
        }

        MaintenanceRunSummary other = (MaintenanceRunSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.initialScheduledTime, other.initialScheduledTime)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.targetResourceType, other.targetResourceType)
                && java.util.Objects.equals(this.infrastructureId, other.infrastructureId)
                && java.util.Objects.equals(this.maintenanceType, other.maintenanceType)
                && java.util.Objects.equals(this.patchIdentifier, other.patchIdentifier)
                && java.util.Objects.equals(this.maintenanceSubtype, other.maintenanceSubtype)
                && java.util.Objects.equals(this.patchingMode, other.patchingMode)
                && java.util.Objects.equals(this.patchFailureCount, other.patchFailureCount)
                && java.util.Objects.equals(this.sourceVersion, other.sourceVersion)
                && java.util.Objects.equals(this.targetVersion, other.targetVersion)
                && java.util.Objects.equals(
                        this.isCustomActionTimeoutEnabled, other.isCustomActionTimeoutEnabled)
                && java.util.Objects.equals(
                        this.customActionTimeoutInMins, other.customActionTimeoutInMins)
                && java.util.Objects.equals(this.patchingStatus, other.patchingStatus)
                && java.util.Objects.equals(this.patchingStartTime, other.patchingStartTime)
                && java.util.Objects.equals(this.patchingEndTime, other.patchingEndTime)
                && java.util.Objects.equals(this.estimatedPatchingTime, other.estimatedPatchingTime)
                && java.util.Objects.equals(
                        this.currentPatchingComponent, other.currentPatchingComponent)
                && java.util.Objects.equals(
                        this.estimatedComponentPatchingStartTime,
                        other.estimatedComponentPatchingStartTime)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.totalTimeTakenInMins, other.totalTimeTakenInMins)
                && super.equals(other);
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
                        + (this.initialScheduledTime == null
                                ? 43
                                : this.initialScheduledTime.hashCode());
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
                        + (this.infrastructureId == null ? 43 : this.infrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceType == null ? 43 : this.maintenanceType.hashCode());
        result =
                (result * PRIME)
                        + (this.patchIdentifier == null ? 43 : this.patchIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceSubtype == null
                                ? 43
                                : this.maintenanceSubtype.hashCode());
        result = (result * PRIME) + (this.patchingMode == null ? 43 : this.patchingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.patchFailureCount == null ? 43 : this.patchFailureCount.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceVersion == null ? 43 : this.sourceVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetVersion == null ? 43 : this.targetVersion.hashCode());
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
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.totalTimeTakenInMins == null
                                ? 43
                                : this.totalTimeTakenInMins.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
