/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Exadata Fleet Update Cycle Summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FsuCycleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FsuCycleSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "type",
        "fsuCollectionId",
        "collectionType",
        "executingFsuActionId",
        "nextActionToExecute",
        "lastCompletedActionId",
        "rollbackCycleState",
        "lastCompletedAction",
        "goalVersionDetails",
        "diagnosticsCollection",
        "timeCreated",
        "timeUpdated",
        "timeFinished",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public FsuCycleSummary(
            String id,
            String displayName,
            String compartmentId,
            CycleTypes type,
            String fsuCollectionId,
            CollectionTypes collectionType,
            String executingFsuActionId,
            java.util.List<NextActionToExecuteDetails> nextActionToExecute,
            String lastCompletedActionId,
            RollbackCycleStates rollbackCycleState,
            DetailedActionTypes lastCompletedAction,
            FsuGoalVersionDetails goalVersionDetails,
            DiagnosticsCollectionDetails diagnosticsCollection,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeFinished,
            CycleLifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.type = type;
        this.fsuCollectionId = fsuCollectionId;
        this.collectionType = collectionType;
        this.executingFsuActionId = executingFsuActionId;
        this.nextActionToExecute = nextActionToExecute;
        this.lastCompletedActionId = lastCompletedActionId;
        this.rollbackCycleState = rollbackCycleState;
        this.lastCompletedAction = lastCompletedAction;
        this.goalVersionDetails = goalVersionDetails;
        this.diagnosticsCollection = diagnosticsCollection;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeFinished = timeFinished;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID identifier for the Exadata Fleet Update Cycle.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID identifier for the Exadata Fleet Update Cycle.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Exadata Fleet Update Cycle display name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Exadata Fleet Update Cycle display name.
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
         * Compartment Identifier.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Type of Exadata Fleet Update Cycle.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private CycleTypes type;

        /**
         * Type of Exadata Fleet Update Cycle.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(CycleTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * OCID identifier for the Collection ID the Exadata Fleet Update Cycle is assigned to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
        private String fsuCollectionId;

        /**
         * OCID identifier for the Collection ID the Exadata Fleet Update Cycle is assigned to.
         *
         * @param fsuCollectionId the value to set
         * @return this builder
         **/
        public Builder fsuCollectionId(String fsuCollectionId) {
            this.fsuCollectionId = fsuCollectionId;
            this.__explicitlySet__.add("fsuCollectionId");
            return this;
        }
        /**
         * Type of Collection this Exadata Fleet Update Cycle belongs to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
        private CollectionTypes collectionType;

        /**
         * Type of Collection this Exadata Fleet Update Cycle belongs to.
         *
         * @param collectionType the value to set
         * @return this builder
         **/
        public Builder collectionType(CollectionTypes collectionType) {
            this.collectionType = collectionType;
            this.__explicitlySet__.add("collectionType");
            return this;
        }
        /**
         * OCID identifier for the Action that is currently in execution, if applicable.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executingFsuActionId")
        private String executingFsuActionId;

        /**
         * OCID identifier for the Action that is currently in execution, if applicable.
         *
         * @param executingFsuActionId the value to set
         * @return this builder
         **/
        public Builder executingFsuActionId(String executingFsuActionId) {
            this.executingFsuActionId = executingFsuActionId;
            this.__explicitlySet__.add("executingFsuActionId");
            return this;
        }
        /**
         * In this array all the possible actions will be listed. The first element is the suggested Action.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nextActionToExecute")
        private java.util.List<NextActionToExecuteDetails> nextActionToExecute;

        /**
         * In this array all the possible actions will be listed. The first element is the suggested Action.
         *
         * @param nextActionToExecute the value to set
         * @return this builder
         **/
        public Builder nextActionToExecute(
                java.util.List<NextActionToExecuteDetails> nextActionToExecute) {
            this.nextActionToExecute = nextActionToExecute;
            this.__explicitlySet__.add("nextActionToExecute");
            return this;
        }
        /**
         * OCID identifier for the latest Action the Exadata Fleet Update Cycle.
         * No value would indicate that the Cycle has not completed any Action yet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedActionId")
        private String lastCompletedActionId;

        /**
         * OCID identifier for the latest Action the Exadata Fleet Update Cycle.
         * No value would indicate that the Cycle has not completed any Action yet.
         *
         * @param lastCompletedActionId the value to set
         * @return this builder
         **/
        public Builder lastCompletedActionId(String lastCompletedActionId) {
            this.lastCompletedActionId = lastCompletedActionId;
            this.__explicitlySet__.add("lastCompletedActionId");
            return this;
        }
        /**
         * Current rollback cycle state if rollback maintenance cycle action has been attempted.
         * No value would indicate that the Cycle has not run a rollback maintenance cycle action before.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rollbackCycleState")
        private RollbackCycleStates rollbackCycleState;

        /**
         * Current rollback cycle state if rollback maintenance cycle action has been attempted.
         * No value would indicate that the Cycle has not run a rollback maintenance cycle action before.
         *
         * @param rollbackCycleState the value to set
         * @return this builder
         **/
        public Builder rollbackCycleState(RollbackCycleStates rollbackCycleState) {
            this.rollbackCycleState = rollbackCycleState;
            this.__explicitlySet__.add("rollbackCycleState");
            return this;
        }
        /**
         * The latest Action type that was completed in the Exadata Fleet Update Cycle.
         * No value would indicate that the Cycle has not completed any Action yet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedAction")
        private DetailedActionTypes lastCompletedAction;

        /**
         * The latest Action type that was completed in the Exadata Fleet Update Cycle.
         * No value would indicate that the Cycle has not completed any Action yet.
         *
         * @param lastCompletedAction the value to set
         * @return this builder
         **/
        public Builder lastCompletedAction(DetailedActionTypes lastCompletedAction) {
            this.lastCompletedAction = lastCompletedAction;
            this.__explicitlySet__.add("lastCompletedAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("goalVersionDetails")
        private FsuGoalVersionDetails goalVersionDetails;

        public Builder goalVersionDetails(FsuGoalVersionDetails goalVersionDetails) {
            this.goalVersionDetails = goalVersionDetails;
            this.__explicitlySet__.add("goalVersionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diagnosticsCollection")
        private DiagnosticsCollectionDetails diagnosticsCollection;

        public Builder diagnosticsCollection(DiagnosticsCollectionDetails diagnosticsCollection) {
            this.diagnosticsCollection = diagnosticsCollection;
            this.__explicitlySet__.add("diagnosticsCollection");
            return this;
        }
        /**
         * The date and time the Exadata Fleet Update Cycle was created, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Exadata Fleet Update Cycle was created, as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the Exadata Fleet Update Cycle was updated,
         * as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
         * section 14.29.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the Exadata Fleet Update Cycle was updated,
         * as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
         * section 14.29.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The date and time the Exadata Fleet Update Cycle was finished,
         * as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the Exadata Fleet Update Cycle was finished,
         * as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * The current state of the Exadata Fleet Update Cycle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CycleLifecycleStates lifecycleState;

        /**
         * The current state of the Exadata Fleet Update Cycle.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(CycleLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail.
         * For example, can be used to provide actionable information for a resource in Failed state.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail.
         * For example, can be used to provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FsuCycleSummary build() {
            FsuCycleSummary model =
                    new FsuCycleSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.type,
                            this.fsuCollectionId,
                            this.collectionType,
                            this.executingFsuActionId,
                            this.nextActionToExecute,
                            this.lastCompletedActionId,
                            this.rollbackCycleState,
                            this.lastCompletedAction,
                            this.goalVersionDetails,
                            this.diagnosticsCollection,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeFinished,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FsuCycleSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("fsuCollectionId")) {
                this.fsuCollectionId(model.getFsuCollectionId());
            }
            if (model.wasPropertyExplicitlySet("collectionType")) {
                this.collectionType(model.getCollectionType());
            }
            if (model.wasPropertyExplicitlySet("executingFsuActionId")) {
                this.executingFsuActionId(model.getExecutingFsuActionId());
            }
            if (model.wasPropertyExplicitlySet("nextActionToExecute")) {
                this.nextActionToExecute(model.getNextActionToExecute());
            }
            if (model.wasPropertyExplicitlySet("lastCompletedActionId")) {
                this.lastCompletedActionId(model.getLastCompletedActionId());
            }
            if (model.wasPropertyExplicitlySet("rollbackCycleState")) {
                this.rollbackCycleState(model.getRollbackCycleState());
            }
            if (model.wasPropertyExplicitlySet("lastCompletedAction")) {
                this.lastCompletedAction(model.getLastCompletedAction());
            }
            if (model.wasPropertyExplicitlySet("goalVersionDetails")) {
                this.goalVersionDetails(model.getGoalVersionDetails());
            }
            if (model.wasPropertyExplicitlySet("diagnosticsCollection")) {
                this.diagnosticsCollection(model.getDiagnosticsCollection());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * OCID identifier for the Exadata Fleet Update Cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID identifier for the Exadata Fleet Update Cycle.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Exadata Fleet Update Cycle display name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Exadata Fleet Update Cycle display name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Type of Exadata Fleet Update Cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final CycleTypes type;

    /**
     * Type of Exadata Fleet Update Cycle.
     *
     * @return the value
     **/
    public CycleTypes getType() {
        return type;
    }

    /**
     * OCID identifier for the Collection ID the Exadata Fleet Update Cycle is assigned to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
    private final String fsuCollectionId;

    /**
     * OCID identifier for the Collection ID the Exadata Fleet Update Cycle is assigned to.
     *
     * @return the value
     **/
    public String getFsuCollectionId() {
        return fsuCollectionId;
    }

    /**
     * Type of Collection this Exadata Fleet Update Cycle belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
    private final CollectionTypes collectionType;

    /**
     * Type of Collection this Exadata Fleet Update Cycle belongs to.
     *
     * @return the value
     **/
    public CollectionTypes getCollectionType() {
        return collectionType;
    }

    /**
     * OCID identifier for the Action that is currently in execution, if applicable.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executingFsuActionId")
    private final String executingFsuActionId;

    /**
     * OCID identifier for the Action that is currently in execution, if applicable.
     *
     * @return the value
     **/
    public String getExecutingFsuActionId() {
        return executingFsuActionId;
    }

    /**
     * In this array all the possible actions will be listed. The first element is the suggested Action.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextActionToExecute")
    private final java.util.List<NextActionToExecuteDetails> nextActionToExecute;

    /**
     * In this array all the possible actions will be listed. The first element is the suggested Action.
     *
     * @return the value
     **/
    public java.util.List<NextActionToExecuteDetails> getNextActionToExecute() {
        return nextActionToExecute;
    }

    /**
     * OCID identifier for the latest Action the Exadata Fleet Update Cycle.
     * No value would indicate that the Cycle has not completed any Action yet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedActionId")
    private final String lastCompletedActionId;

    /**
     * OCID identifier for the latest Action the Exadata Fleet Update Cycle.
     * No value would indicate that the Cycle has not completed any Action yet.
     *
     * @return the value
     **/
    public String getLastCompletedActionId() {
        return lastCompletedActionId;
    }

    /**
     * Current rollback cycle state if rollback maintenance cycle action has been attempted.
     * No value would indicate that the Cycle has not run a rollback maintenance cycle action before.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rollbackCycleState")
    private final RollbackCycleStates rollbackCycleState;

    /**
     * Current rollback cycle state if rollback maintenance cycle action has been attempted.
     * No value would indicate that the Cycle has not run a rollback maintenance cycle action before.
     *
     * @return the value
     **/
    public RollbackCycleStates getRollbackCycleState() {
        return rollbackCycleState;
    }

    /**
     * The latest Action type that was completed in the Exadata Fleet Update Cycle.
     * No value would indicate that the Cycle has not completed any Action yet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedAction")
    private final DetailedActionTypes lastCompletedAction;

    /**
     * The latest Action type that was completed in the Exadata Fleet Update Cycle.
     * No value would indicate that the Cycle has not completed any Action yet.
     *
     * @return the value
     **/
    public DetailedActionTypes getLastCompletedAction() {
        return lastCompletedAction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("goalVersionDetails")
    private final FsuGoalVersionDetails goalVersionDetails;

    public FsuGoalVersionDetails getGoalVersionDetails() {
        return goalVersionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("diagnosticsCollection")
    private final DiagnosticsCollectionDetails diagnosticsCollection;

    public DiagnosticsCollectionDetails getDiagnosticsCollection() {
        return diagnosticsCollection;
    }

    /**
     * The date and time the Exadata Fleet Update Cycle was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Exadata Fleet Update Cycle was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Exadata Fleet Update Cycle was updated,
     * as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
     * section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the Exadata Fleet Update Cycle was updated,
     * as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339),
     * section 14.29.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time the Exadata Fleet Update Cycle was finished,
     * as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the Exadata Fleet Update Cycle was finished,
     * as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * The current state of the Exadata Fleet Update Cycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CycleLifecycleStates lifecycleState;

    /**
     * The current state of the Exadata Fleet Update Cycle.
     * @return the value
     **/
    public CycleLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail.
     * For example, can be used to provide actionable information for a resource in Failed state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail.
     * For example, can be used to provide actionable information for a resource in Failed state.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("FsuCycleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", fsuCollectionId=").append(String.valueOf(this.fsuCollectionId));
        sb.append(", collectionType=").append(String.valueOf(this.collectionType));
        sb.append(", executingFsuActionId=").append(String.valueOf(this.executingFsuActionId));
        sb.append(", nextActionToExecute=").append(String.valueOf(this.nextActionToExecute));
        sb.append(", lastCompletedActionId=").append(String.valueOf(this.lastCompletedActionId));
        sb.append(", rollbackCycleState=").append(String.valueOf(this.rollbackCycleState));
        sb.append(", lastCompletedAction=").append(String.valueOf(this.lastCompletedAction));
        sb.append(", goalVersionDetails=").append(String.valueOf(this.goalVersionDetails));
        sb.append(", diagnosticsCollection=").append(String.valueOf(this.diagnosticsCollection));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FsuCycleSummary)) {
            return false;
        }

        FsuCycleSummary other = (FsuCycleSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.fsuCollectionId, other.fsuCollectionId)
                && java.util.Objects.equals(this.collectionType, other.collectionType)
                && java.util.Objects.equals(this.executingFsuActionId, other.executingFsuActionId)
                && java.util.Objects.equals(this.nextActionToExecute, other.nextActionToExecute)
                && java.util.Objects.equals(this.lastCompletedActionId, other.lastCompletedActionId)
                && java.util.Objects.equals(this.rollbackCycleState, other.rollbackCycleState)
                && java.util.Objects.equals(this.lastCompletedAction, other.lastCompletedAction)
                && java.util.Objects.equals(this.goalVersionDetails, other.goalVersionDetails)
                && java.util.Objects.equals(this.diagnosticsCollection, other.diagnosticsCollection)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.fsuCollectionId == null ? 43 : this.fsuCollectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.collectionType == null ? 43 : this.collectionType.hashCode());
        result =
                (result * PRIME)
                        + (this.executingFsuActionId == null
                                ? 43
                                : this.executingFsuActionId.hashCode());
        result =
                (result * PRIME)
                        + (this.nextActionToExecute == null
                                ? 43
                                : this.nextActionToExecute.hashCode());
        result =
                (result * PRIME)
                        + (this.lastCompletedActionId == null
                                ? 43
                                : this.lastCompletedActionId.hashCode());
        result =
                (result * PRIME)
                        + (this.rollbackCycleState == null
                                ? 43
                                : this.rollbackCycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lastCompletedAction == null
                                ? 43
                                : this.lastCompletedAction.hashCode());
        result =
                (result * PRIME)
                        + (this.goalVersionDetails == null
                                ? 43
                                : this.goalVersionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.diagnosticsCollection == null
                                ? 43
                                : this.diagnosticsCollection.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
