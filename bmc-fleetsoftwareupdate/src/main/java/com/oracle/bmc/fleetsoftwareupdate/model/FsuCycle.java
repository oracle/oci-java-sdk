/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Exadata Fleet Update Cycle resource details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = FsuCycle.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PatchFsuCycle.class,
            name = "PATCH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpgradeFsuCycle.class,
            name = "UPGRADE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class FsuCycle extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "fsuCollectionId",
        "collectionType",
        "executingFsuActionId",
        "nextActionToExecute",
        "lastCompletedActionId",
        "rollbackCycleState",
        "lastCompletedAction",
        "goalVersionDetails",
        "batchingStrategy",
        "stageActionSchedule",
        "applyActionSchedule",
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
    protected FsuCycle(
            String id,
            String displayName,
            String compartmentId,
            String fsuCollectionId,
            CollectionTypes collectionType,
            String executingFsuActionId,
            java.util.List<NextActionToExecuteDetails> nextActionToExecute,
            String lastCompletedActionId,
            RollbackCycleStates rollbackCycleState,
            DetailedActionTypes lastCompletedAction,
            FsuGoalVersionDetails goalVersionDetails,
            BatchingStrategyDetails batchingStrategy,
            ScheduleDetails stageActionSchedule,
            ScheduleDetails applyActionSchedule,
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
        this.fsuCollectionId = fsuCollectionId;
        this.collectionType = collectionType;
        this.executingFsuActionId = executingFsuActionId;
        this.nextActionToExecute = nextActionToExecute;
        this.lastCompletedActionId = lastCompletedActionId;
        this.rollbackCycleState = rollbackCycleState;
        this.lastCompletedAction = lastCompletedAction;
        this.goalVersionDetails = goalVersionDetails;
        this.batchingStrategy = batchingStrategy;
        this.stageActionSchedule = stageActionSchedule;
        this.applyActionSchedule = applyActionSchedule;
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Fleet Update Cycle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Fleet Update Cycle.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-friendly name for the Exadata Fleet Update Cycle. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Exadata Fleet Update Cycle.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Fleet Update Collection being updated by this Exadata Fleet Update Cycle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
    private final String fsuCollectionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Fleet Update Collection being updated by this Exadata Fleet Update Cycle.
     *
     * @return the value
     */
    public String getFsuCollectionId() {
        return fsuCollectionId;
    }

    /**
     * Type of the Exadata Fleet Update Collection being updated by this Exadata Fleet Update Cycle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
    private final CollectionTypes collectionType;

    /**
     * Type of the Exadata Fleet Update Collection being updated by this Exadata Fleet Update Cycle.
     *
     * @return the value
     */
    public CollectionTypes getCollectionType() {
        return collectionType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Fleet Update Action that is currently in progress, if applicable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executingFsuActionId")
    private final String executingFsuActionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Fleet Update Action that is currently in progress, if applicable.
     *
     * @return the value
     */
    public String getExecutingFsuActionId() {
        return executingFsuActionId;
    }

    /**
     * All possible Exadata Fleet Update Actions will be listed. The first element is the suggested
     * Exadata Fleet Update Action.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextActionToExecute")
    private final java.util.List<NextActionToExecuteDetails> nextActionToExecute;

    /**
     * All possible Exadata Fleet Update Actions will be listed. The first element is the suggested
     * Exadata Fleet Update Action.
     *
     * @return the value
     */
    public java.util.List<NextActionToExecuteDetails> getNextActionToExecute() {
        return nextActionToExecute;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * latest Action in the Exadata Fleet Update Cycle.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedActionId")
    private final String lastCompletedActionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * latest Action in the Exadata Fleet Update Cycle.
     *
     * @return the value
     */
    public String getLastCompletedActionId() {
        return lastCompletedActionId;
    }

    /**
     * Current rollback cycle state if rollback maintenance cycle action has been attempted. No
     * value would indicate that the Cycle has not run a rollback maintenance cycle action before.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rollbackCycleState")
    private final RollbackCycleStates rollbackCycleState;

    /**
     * Current rollback cycle state if rollback maintenance cycle action has been attempted. No
     * value would indicate that the Cycle has not run a rollback maintenance cycle action before.
     *
     * @return the value
     */
    public RollbackCycleStates getRollbackCycleState() {
        return rollbackCycleState;
    }

    /**
     * The latest Action type that was completed in the Exadata Fleet Update Cycle. No value would
     * indicate that the Cycle has not completed any Action yet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedAction")
    private final DetailedActionTypes lastCompletedAction;

    /**
     * The latest Action type that was completed in the Exadata Fleet Update Cycle. No value would
     * indicate that the Cycle has not completed any Action yet.
     *
     * @return the value
     */
    public DetailedActionTypes getLastCompletedAction() {
        return lastCompletedAction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("goalVersionDetails")
    private final FsuGoalVersionDetails goalVersionDetails;

    public FsuGoalVersionDetails getGoalVersionDetails() {
        return goalVersionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("batchingStrategy")
    private final BatchingStrategyDetails batchingStrategy;

    public BatchingStrategyDetails getBatchingStrategy() {
        return batchingStrategy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stageActionSchedule")
    private final ScheduleDetails stageActionSchedule;

    public ScheduleDetails getStageActionSchedule() {
        return stageActionSchedule;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applyActionSchedule")
    private final ScheduleDetails applyActionSchedule;

    public ScheduleDetails getApplyActionSchedule() {
        return applyActionSchedule;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("diagnosticsCollection")
    private final DiagnosticsCollectionDetails diagnosticsCollection;

    public DiagnosticsCollectionDetails getDiagnosticsCollection() {
        return diagnosticsCollection;
    }

    /**
     * The date and time the Exadata Fleet Update Cycle was created, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Exadata Fleet Update Cycle was created, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Exadata Fleet Update Cycle was updated, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the Exadata Fleet Update Cycle was updated, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time the Exadata Fleet Update Cycle was finished, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the Exadata Fleet Update Cycle was finished, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** The current state of the Exadata Fleet Update Cycle. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CycleLifecycleStates lifecycleState;

    /**
     * The current state of the Exadata Fleet Update Cycle.
     *
     * @return the value
     */
    public CycleLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("FsuCycle(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", fsuCollectionId=").append(String.valueOf(this.fsuCollectionId));
        sb.append(", collectionType=").append(String.valueOf(this.collectionType));
        sb.append(", executingFsuActionId=").append(String.valueOf(this.executingFsuActionId));
        sb.append(", nextActionToExecute=").append(String.valueOf(this.nextActionToExecute));
        sb.append(", lastCompletedActionId=").append(String.valueOf(this.lastCompletedActionId));
        sb.append(", rollbackCycleState=").append(String.valueOf(this.rollbackCycleState));
        sb.append(", lastCompletedAction=").append(String.valueOf(this.lastCompletedAction));
        sb.append(", goalVersionDetails=").append(String.valueOf(this.goalVersionDetails));
        sb.append(", batchingStrategy=").append(String.valueOf(this.batchingStrategy));
        sb.append(", stageActionSchedule=").append(String.valueOf(this.stageActionSchedule));
        sb.append(", applyActionSchedule=").append(String.valueOf(this.applyActionSchedule));
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
        if (!(o instanceof FsuCycle)) {
            return false;
        }

        FsuCycle other = (FsuCycle) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fsuCollectionId, other.fsuCollectionId)
                && java.util.Objects.equals(this.collectionType, other.collectionType)
                && java.util.Objects.equals(this.executingFsuActionId, other.executingFsuActionId)
                && java.util.Objects.equals(this.nextActionToExecute, other.nextActionToExecute)
                && java.util.Objects.equals(this.lastCompletedActionId, other.lastCompletedActionId)
                && java.util.Objects.equals(this.rollbackCycleState, other.rollbackCycleState)
                && java.util.Objects.equals(this.lastCompletedAction, other.lastCompletedAction)
                && java.util.Objects.equals(this.goalVersionDetails, other.goalVersionDetails)
                && java.util.Objects.equals(this.batchingStrategy, other.batchingStrategy)
                && java.util.Objects.equals(this.stageActionSchedule, other.stageActionSchedule)
                && java.util.Objects.equals(this.applyActionSchedule, other.applyActionSchedule)
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
                        + (this.batchingStrategy == null ? 43 : this.batchingStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.stageActionSchedule == null
                                ? 43
                                : this.stageActionSchedule.hashCode());
        result =
                (result * PRIME)
                        + (this.applyActionSchedule == null
                                ? 43
                                : this.applyActionSchedule.hashCode());
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
