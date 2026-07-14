/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Details of a maintenance executions. <br>
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
        builder = MaintenanceExecution.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaintenanceExecution
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "lifecycleState",
        "lifecycleDetails",
        "timeStarted",
        "timeEnded",
        "targetResourceType",
        "infrastructureId",
        "maintenanceRunId",
        "maintenanceType",
        "maintenanceSubtype",
        "patchingMode",
        "sourceVersion",
        "targetVersion",
        "isCustomActionTimeoutEnabled",
        "customActionTimeoutInMins",
        "workflowId",
        "systemTags",
        "definedTags",
        "freeformTags",
        "totalTimeTakenInMins"
    })
    public MaintenanceExecution(
            String id,
            String compartmentId,
            String displayName,
            String description,
            MaintenanceRunLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            TargetResourceTypeEnum targetResourceType,
            String infrastructureId,
            String maintenanceRunId,
            MaintenanceTypeEnum maintenanceType,
            MaintenanceSubtypeEnum maintenanceSubtype,
            PatchingModeEnum patchingMode,
            String sourceVersion,
            String targetVersion,
            Boolean isCustomActionTimeoutEnabled,
            Integer customActionTimeoutInMins,
            String workflowId,
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
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.targetResourceType = targetResourceType;
        this.infrastructureId = infrastructureId;
        this.maintenanceRunId = maintenanceRunId;
        this.maintenanceType = maintenanceType;
        this.maintenanceSubtype = maintenanceSubtype;
        this.patchingMode = patchingMode;
        this.sourceVersion = sourceVersion;
        this.targetVersion = targetVersion;
        this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
        this.customActionTimeoutInMins = customActionTimeoutInMins;
        this.workflowId = workflowId;
        this.systemTags = systemTags;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.totalTimeTakenInMins = totalTimeTakenInMins;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * maintenance run execution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * maintenance run execution.
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
        /** The user-friendly name for the maintenance run execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the maintenance run execution.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the maintenance run execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the maintenance run execution.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The state of the maintenance run execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MaintenanceRunLifecycleState lifecycleState;

        /**
         * The state of the maintenance run execution.
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
        /** The date and time the maintenance run execution started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the maintenance run execution started.
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
        /** The type of the target resource on which the maintenance run execution occurred. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
        private TargetResourceTypeEnum targetResourceType;

        /**
         * The type of the target resource on which the maintenance run execution occurred.
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
         * Database Infrastructure on which the maintenance run execution occurred.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
        private String infrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Infrastructure on which the maintenance run execution occurred.
         *
         * @param infrastructureId the value to set
         * @return this builder
         */
        public Builder infrastructureId(String infrastructureId) {
            this.infrastructureId = infrastructureId;
            this.__explicitlySet__.add("infrastructureId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * maintenance run to which this maintenance execution belongs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceRunId")
        private String maintenanceRunId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * maintenance run to which this maintenance execution belongs.
         *
         * @param maintenanceRunId the value to set
         * @return this builder
         */
        public Builder maintenanceRunId(String maintenanceRunId) {
            this.maintenanceRunId = maintenanceRunId;
            this.__explicitlySet__.add("maintenanceRunId");
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
        /** Maintenance run execution sub-type. */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSubtype")
        private MaintenanceSubtypeEnum maintenanceSubtype;

        /**
         * Maintenance run execution sub-type.
         *
         * @param maintenanceSubtype the value to set
         * @return this builder
         */
        public Builder maintenanceSubtype(MaintenanceSubtypeEnum maintenanceSubtype) {
            this.maintenanceSubtype = maintenanceSubtype;
            this.__explicitlySet__.add("maintenanceSubtype");
            return this;
        }
        /** The patching mode for the maintenance run that is being executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
        private PatchingModeEnum patchingMode;

        /**
         * The patching mode for the maintenance run that is being executed.
         *
         * @param patchingMode the value to set
         * @return this builder
         */
        public Builder patchingMode(PatchingModeEnum patchingMode) {
            this.patchingMode = patchingMode;
            this.__explicitlySet__.add("patchingMode");
            return this;
        }
        /** The source software version for the Oracle infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceVersion")
        private String sourceVersion;

        /**
         * The source software version for the Oracle infrastructure.
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
         * At the time of execution whether the custom action time out is enabled for the
         * maintenance run that is being executed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
        private Boolean isCustomActionTimeoutEnabled;

        /**
         * At the time of execution whether the custom action time out is enabled for the
         * maintenance run that is being executed.
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * work request executed by this execution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workflowId")
        private String workflowId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * work request executed by this execution.
         *
         * @param workflowId the value to set
         * @return this builder
         */
        public Builder workflowId(String workflowId) {
            this.workflowId = workflowId;
            this.__explicitlySet__.add("workflowId");
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
        /** The total time taken by this execution in minutes. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalTimeTakenInMins")
        private Integer totalTimeTakenInMins;

        /**
         * The total time taken by this execution in minutes.
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

        public MaintenanceExecution build() {
            MaintenanceExecution model =
                    new MaintenanceExecution(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeStarted,
                            this.timeEnded,
                            this.targetResourceType,
                            this.infrastructureId,
                            this.maintenanceRunId,
                            this.maintenanceType,
                            this.maintenanceSubtype,
                            this.patchingMode,
                            this.sourceVersion,
                            this.targetVersion,
                            this.isCustomActionTimeoutEnabled,
                            this.customActionTimeoutInMins,
                            this.workflowId,
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
        public Builder copy(MaintenanceExecution model) {
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
            if (model.wasPropertyExplicitlySet("maintenanceRunId")) {
                this.maintenanceRunId(model.getMaintenanceRunId());
            }
            if (model.wasPropertyExplicitlySet("maintenanceType")) {
                this.maintenanceType(model.getMaintenanceType());
            }
            if (model.wasPropertyExplicitlySet("maintenanceSubtype")) {
                this.maintenanceSubtype(model.getMaintenanceSubtype());
            }
            if (model.wasPropertyExplicitlySet("patchingMode")) {
                this.patchingMode(model.getPatchingMode());
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
            if (model.wasPropertyExplicitlySet("workflowId")) {
                this.workflowId(model.getWorkflowId());
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
     * maintenance run execution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * maintenance run execution.
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

    /** The user-friendly name for the maintenance run execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the maintenance run execution.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the maintenance run execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the maintenance run execution.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The state of the maintenance run execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MaintenanceRunLifecycleState lifecycleState;

    /**
     * The state of the maintenance run execution.
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

    /** The date and time the maintenance run execution started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the maintenance run execution started.
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

    /** The type of the target resource on which the maintenance run execution occurred. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
    private final TargetResourceTypeEnum targetResourceType;

    /**
     * The type of the target resource on which the maintenance run execution occurred.
     *
     * @return the value
     */
    public TargetResourceTypeEnum getTargetResourceType() {
        return targetResourceType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure on which the maintenance run execution occurred.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
    private final String infrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure on which the maintenance run execution occurred.
     *
     * @return the value
     */
    public String getInfrastructureId() {
        return infrastructureId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * maintenance run to which this maintenance execution belongs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceRunId")
    private final String maintenanceRunId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * maintenance run to which this maintenance execution belongs.
     *
     * @return the value
     */
    public String getMaintenanceRunId() {
        return maintenanceRunId;
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

    /** Maintenance run execution sub-type. */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSubtype")
    private final MaintenanceSubtypeEnum maintenanceSubtype;

    /**
     * Maintenance run execution sub-type.
     *
     * @return the value
     */
    public MaintenanceSubtypeEnum getMaintenanceSubtype() {
        return maintenanceSubtype;
    }

    /** The patching mode for the maintenance run that is being executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
    private final PatchingModeEnum patchingMode;

    /**
     * The patching mode for the maintenance run that is being executed.
     *
     * @return the value
     */
    public PatchingModeEnum getPatchingMode() {
        return patchingMode;
    }

    /** The source software version for the Oracle infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceVersion")
    private final String sourceVersion;

    /**
     * The source software version for the Oracle infrastructure.
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
     * At the time of execution whether the custom action time out is enabled for the maintenance
     * run that is being executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
    private final Boolean isCustomActionTimeoutEnabled;

    /**
     * At the time of execution whether the custom action time out is enabled for the maintenance
     * run that is being executed.
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the work
     * request executed by this execution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workflowId")
    private final String workflowId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the work
     * request executed by this execution.
     *
     * @return the value
     */
    public String getWorkflowId() {
        return workflowId;
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

    /** The total time taken by this execution in minutes. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalTimeTakenInMins")
    private final Integer totalTimeTakenInMins;

    /**
     * The total time taken by this execution in minutes.
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
        sb.append("MaintenanceExecution(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", targetResourceType=").append(String.valueOf(this.targetResourceType));
        sb.append(", infrastructureId=").append(String.valueOf(this.infrastructureId));
        sb.append(", maintenanceRunId=").append(String.valueOf(this.maintenanceRunId));
        sb.append(", maintenanceType=").append(String.valueOf(this.maintenanceType));
        sb.append(", maintenanceSubtype=").append(String.valueOf(this.maintenanceSubtype));
        sb.append(", patchingMode=").append(String.valueOf(this.patchingMode));
        sb.append(", sourceVersion=").append(String.valueOf(this.sourceVersion));
        sb.append(", targetVersion=").append(String.valueOf(this.targetVersion));
        sb.append(", isCustomActionTimeoutEnabled=")
                .append(String.valueOf(this.isCustomActionTimeoutEnabled));
        sb.append(", customActionTimeoutInMins=")
                .append(String.valueOf(this.customActionTimeoutInMins));
        sb.append(", workflowId=").append(String.valueOf(this.workflowId));
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
        if (!(o instanceof MaintenanceExecution)) {
            return false;
        }

        MaintenanceExecution other = (MaintenanceExecution) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.targetResourceType, other.targetResourceType)
                && java.util.Objects.equals(this.infrastructureId, other.infrastructureId)
                && java.util.Objects.equals(this.maintenanceRunId, other.maintenanceRunId)
                && java.util.Objects.equals(this.maintenanceType, other.maintenanceType)
                && java.util.Objects.equals(this.maintenanceSubtype, other.maintenanceSubtype)
                && java.util.Objects.equals(this.patchingMode, other.patchingMode)
                && java.util.Objects.equals(this.sourceVersion, other.sourceVersion)
                && java.util.Objects.equals(this.targetVersion, other.targetVersion)
                && java.util.Objects.equals(
                        this.isCustomActionTimeoutEnabled, other.isCustomActionTimeoutEnabled)
                && java.util.Objects.equals(
                        this.customActionTimeoutInMins, other.customActionTimeoutInMins)
                && java.util.Objects.equals(this.workflowId, other.workflowId)
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
                        + (this.maintenanceRunId == null ? 43 : this.maintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceType == null ? 43 : this.maintenanceType.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceSubtype == null
                                ? 43
                                : this.maintenanceSubtype.hashCode());
        result = (result * PRIME) + (this.patchingMode == null ? 43 : this.patchingMode.hashCode());
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
        result = (result * PRIME) + (this.workflowId == null ? 43 : this.workflowId.hashCode());
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
