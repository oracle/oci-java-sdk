/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Patch Exadata Fleet Update Cycle resource details. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatchFsuCycle.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchFsuCycle extends FsuCycle {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
        private String fsuCollectionId;

        public Builder fsuCollectionId(String fsuCollectionId) {
            this.fsuCollectionId = fsuCollectionId;
            this.__explicitlySet__.add("fsuCollectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("collectionType")
        private CollectionTypes collectionType;

        public Builder collectionType(CollectionTypes collectionType) {
            this.collectionType = collectionType;
            this.__explicitlySet__.add("collectionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executingFsuActionId")
        private String executingFsuActionId;

        public Builder executingFsuActionId(String executingFsuActionId) {
            this.executingFsuActionId = executingFsuActionId;
            this.__explicitlySet__.add("executingFsuActionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextActionToExecute")
        private java.util.List<NextActionToExecuteDetails> nextActionToExecute;

        public Builder nextActionToExecute(
                java.util.List<NextActionToExecuteDetails> nextActionToExecute) {
            this.nextActionToExecute = nextActionToExecute;
            this.__explicitlySet__.add("nextActionToExecute");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedActionId")
        private String lastCompletedActionId;

        public Builder lastCompletedActionId(String lastCompletedActionId) {
            this.lastCompletedActionId = lastCompletedActionId;
            this.__explicitlySet__.add("lastCompletedActionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rollbackCycleState")
        private RollbackCycleStates rollbackCycleState;

        public Builder rollbackCycleState(RollbackCycleStates rollbackCycleState) {
            this.rollbackCycleState = rollbackCycleState;
            this.__explicitlySet__.add("rollbackCycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedAction")
        private DetailedActionTypes lastCompletedAction;

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

        @com.fasterxml.jackson.annotation.JsonProperty("batchingStrategy")
        private BatchingStrategyDetails batchingStrategy;

        public Builder batchingStrategy(BatchingStrategyDetails batchingStrategy) {
            this.batchingStrategy = batchingStrategy;
            this.__explicitlySet__.add("batchingStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stageActionSchedule")
        private ScheduleDetails stageActionSchedule;

        public Builder stageActionSchedule(ScheduleDetails stageActionSchedule) {
            this.stageActionSchedule = stageActionSchedule;
            this.__explicitlySet__.add("stageActionSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applyActionSchedule")
        private ScheduleDetails applyActionSchedule;

        public Builder applyActionSchedule(ScheduleDetails applyActionSchedule) {
            this.applyActionSchedule = applyActionSchedule;
            this.__explicitlySet__.add("applyActionSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diagnosticsCollection")
        private DiagnosticsCollectionDetails diagnosticsCollection;

        public Builder diagnosticsCollection(DiagnosticsCollectionDetails diagnosticsCollection) {
            this.diagnosticsCollection = diagnosticsCollection;
            this.__explicitlySet__.add("diagnosticsCollection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CycleLifecycleStates lifecycleState;

        public Builder lifecycleState(CycleLifecycleStates lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Ignore all patches between the source and target homes during patching. */
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnorePatches")
        private Boolean isIgnorePatches;

        /**
         * Ignore all patches between the source and target homes during patching.
         *
         * @param isIgnorePatches the value to set
         * @return this builder
         */
        public Builder isIgnorePatches(Boolean isIgnorePatches) {
            this.isIgnorePatches = isIgnorePatches;
            this.__explicitlySet__.add("isIgnorePatches");
            return this;
        }
        /** List of bug numbers to ignore. */
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreMissingPatches")
        private java.util.List<String> isIgnoreMissingPatches;

        /**
         * List of bug numbers to ignore.
         *
         * @param isIgnoreMissingPatches the value to set
         * @return this builder
         */
        public Builder isIgnoreMissingPatches(java.util.List<String> isIgnoreMissingPatches) {
            this.isIgnoreMissingPatches = isIgnoreMissingPatches;
            this.__explicitlySet__.add("isIgnoreMissingPatches");
            return this;
        }
        /** Service drain timeout specified in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxDrainTimeoutInSeconds")
        private Integer maxDrainTimeoutInSeconds;

        /**
         * Service drain timeout specified in seconds.
         *
         * @param maxDrainTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder maxDrainTimeoutInSeconds(Integer maxDrainTimeoutInSeconds) {
            this.maxDrainTimeoutInSeconds = maxDrainTimeoutInSeconds;
            this.__explicitlySet__.add("maxDrainTimeoutInSeconds");
            return this;
        }
        /**
         * Ensure that services of administrator-managed Oracle RAC or Oracle RAC One databases are
         * running on the same instances before and after the move operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isKeepPlacement")
        private Boolean isKeepPlacement;

        /**
         * Ensure that services of administrator-managed Oracle RAC or Oracle RAC One databases are
         * running on the same instances before and after the move operation.
         *
         * @param isKeepPlacement the value to set
         * @return this builder
         */
        public Builder isKeepPlacement(Boolean isKeepPlacement) {
            this.isKeepPlacement = isKeepPlacement;
            this.__explicitlySet__.add("isKeepPlacement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchFsuCycle build() {
            PatchFsuCycle model =
                    new PatchFsuCycle(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.fsuCollectionId,
                            this.collectionType,
                            this.executingFsuActionId,
                            this.nextActionToExecute,
                            this.lastCompletedActionId,
                            this.rollbackCycleState,
                            this.lastCompletedAction,
                            this.goalVersionDetails,
                            this.batchingStrategy,
                            this.stageActionSchedule,
                            this.applyActionSchedule,
                            this.diagnosticsCollection,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeFinished,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.isIgnorePatches,
                            this.isIgnoreMissingPatches,
                            this.maxDrainTimeoutInSeconds,
                            this.isKeepPlacement);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchFsuCycle model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("batchingStrategy")) {
                this.batchingStrategy(model.getBatchingStrategy());
            }
            if (model.wasPropertyExplicitlySet("stageActionSchedule")) {
                this.stageActionSchedule(model.getStageActionSchedule());
            }
            if (model.wasPropertyExplicitlySet("applyActionSchedule")) {
                this.applyActionSchedule(model.getApplyActionSchedule());
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
            if (model.wasPropertyExplicitlySet("isIgnorePatches")) {
                this.isIgnorePatches(model.getIsIgnorePatches());
            }
            if (model.wasPropertyExplicitlySet("isIgnoreMissingPatches")) {
                this.isIgnoreMissingPatches(model.getIsIgnoreMissingPatches());
            }
            if (model.wasPropertyExplicitlySet("maxDrainTimeoutInSeconds")) {
                this.maxDrainTimeoutInSeconds(model.getMaxDrainTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isKeepPlacement")) {
                this.isKeepPlacement(model.getIsKeepPlacement());
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
    public PatchFsuCycle(
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
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Boolean isIgnorePatches,
            java.util.List<String> isIgnoreMissingPatches,
            Integer maxDrainTimeoutInSeconds,
            Boolean isKeepPlacement) {
        super(
                id,
                displayName,
                compartmentId,
                fsuCollectionId,
                collectionType,
                executingFsuActionId,
                nextActionToExecute,
                lastCompletedActionId,
                rollbackCycleState,
                lastCompletedAction,
                goalVersionDetails,
                batchingStrategy,
                stageActionSchedule,
                applyActionSchedule,
                diagnosticsCollection,
                timeCreated,
                timeUpdated,
                timeFinished,
                lifecycleState,
                lifecycleDetails,
                freeformTags,
                definedTags,
                systemTags);
        this.isIgnorePatches = isIgnorePatches;
        this.isIgnoreMissingPatches = isIgnoreMissingPatches;
        this.maxDrainTimeoutInSeconds = maxDrainTimeoutInSeconds;
        this.isKeepPlacement = isKeepPlacement;
    }

    /** Ignore all patches between the source and target homes during patching. */
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnorePatches")
    private final Boolean isIgnorePatches;

    /**
     * Ignore all patches between the source and target homes during patching.
     *
     * @return the value
     */
    public Boolean getIsIgnorePatches() {
        return isIgnorePatches;
    }

    /** List of bug numbers to ignore. */
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreMissingPatches")
    private final java.util.List<String> isIgnoreMissingPatches;

    /**
     * List of bug numbers to ignore.
     *
     * @return the value
     */
    public java.util.List<String> getIsIgnoreMissingPatches() {
        return isIgnoreMissingPatches;
    }

    /** Service drain timeout specified in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxDrainTimeoutInSeconds")
    private final Integer maxDrainTimeoutInSeconds;

    /**
     * Service drain timeout specified in seconds.
     *
     * @return the value
     */
    public Integer getMaxDrainTimeoutInSeconds() {
        return maxDrainTimeoutInSeconds;
    }

    /**
     * Ensure that services of administrator-managed Oracle RAC or Oracle RAC One databases are
     * running on the same instances before and after the move operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isKeepPlacement")
    private final Boolean isKeepPlacement;

    /**
     * Ensure that services of administrator-managed Oracle RAC or Oracle RAC One databases are
     * running on the same instances before and after the move operation.
     *
     * @return the value
     */
    public Boolean getIsKeepPlacement() {
        return isKeepPlacement;
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
        sb.append("PatchFsuCycle(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isIgnorePatches=").append(String.valueOf(this.isIgnorePatches));
        sb.append(", isIgnoreMissingPatches=").append(String.valueOf(this.isIgnoreMissingPatches));
        sb.append(", maxDrainTimeoutInSeconds=")
                .append(String.valueOf(this.maxDrainTimeoutInSeconds));
        sb.append(", isKeepPlacement=").append(String.valueOf(this.isKeepPlacement));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchFsuCycle)) {
            return false;
        }

        PatchFsuCycle other = (PatchFsuCycle) o;
        return java.util.Objects.equals(this.isIgnorePatches, other.isIgnorePatches)
                && java.util.Objects.equals(
                        this.isIgnoreMissingPatches, other.isIgnoreMissingPatches)
                && java.util.Objects.equals(
                        this.maxDrainTimeoutInSeconds, other.maxDrainTimeoutInSeconds)
                && java.util.Objects.equals(this.isKeepPlacement, other.isKeepPlacement)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isIgnorePatches == null ? 43 : this.isIgnorePatches.hashCode());
        result =
                (result * PRIME)
                        + (this.isIgnoreMissingPatches == null
                                ? 43
                                : this.isIgnoreMissingPatches.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDrainTimeoutInSeconds == null
                                ? 43
                                : this.maxDrainTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.isKeepPlacement == null ? 43 : this.isKeepPlacement.hashCode());
        return result;
    }
}
