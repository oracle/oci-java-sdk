/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Summary of Cleanup Exadata Fleet Update Job resource. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CleanupFsuJobSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CleanupFsuJobSummary extends FsuJobSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("fsuActionId")
        private String fsuActionId;

        public Builder fsuActionId(String fsuActionId) {
            this.fsuActionId = fsuActionId;
            this.__explicitlySet__.add("fsuActionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private JobProgress progress;

        public Builder progress(JobProgress progress) {
            this.progress = progress;
            this.__explicitlySet__.add("progress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
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
        private JobLifecycleStates lifecycleState;

        public Builder lifecycleState(JobLifecycleStates lifecycleState) {
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
        /** OCID of the Exadata Fleet Update Collection that the job is executing on. */
        @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
        private String fsuCollectionId;

        /**
         * OCID of the Exadata Fleet Update Collection that the job is executing on.
         *
         * @param fsuCollectionId the value to set
         * @return this builder
         */
        public Builder fsuCollectionId(String fsuCollectionId) {
            this.fsuCollectionId = fsuCollectionId;
            this.__explicitlySet__.add("fsuCollectionId");
            return this;
        }
        /** OCID of the Exadata Fleet Update Cycle that this job is part of. */
        @com.fasterxml.jackson.annotation.JsonProperty("fsuCycleId")
        private String fsuCycleId;

        /**
         * OCID of the Exadata Fleet Update Cycle that this job is part of.
         *
         * @param fsuCycleId the value to set
         * @return this builder
         */
        public Builder fsuCycleId(String fsuCycleId) {
            this.fsuCycleId = fsuCycleId;
            this.__explicitlySet__.add("fsuCycleId");
            return this;
        }
        /** OCID of Target resource on which the job is executing the action. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * OCID of Target resource on which the job is executing the action.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private ScheduleDetails schedule;

        public Builder schedule(ScheduleDetails schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CleanupFsuJobSummary build() {
            CleanupFsuJobSummary model =
                    new CleanupFsuJobSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.fsuActionId,
                            this.progress,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeUpdated,
                            this.timeFinished,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.fsuCollectionId,
                            this.fsuCycleId,
                            this.targetId,
                            this.schedule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CleanupFsuJobSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("fsuActionId")) {
                this.fsuActionId(model.getFsuActionId());
            }
            if (model.wasPropertyExplicitlySet("progress")) {
                this.progress(model.getProgress());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
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
            if (model.wasPropertyExplicitlySet("fsuCollectionId")) {
                this.fsuCollectionId(model.getFsuCollectionId());
            }
            if (model.wasPropertyExplicitlySet("fsuCycleId")) {
                this.fsuCycleId(model.getFsuCycleId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
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
    public CleanupFsuJobSummary(
            String id,
            String displayName,
            String compartmentId,
            String fsuActionId,
            JobProgress progress,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeUpdated,
            java.util.Date timeFinished,
            JobLifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String fsuCollectionId,
            String fsuCycleId,
            String targetId,
            ScheduleDetails schedule) {
        super(
                id,
                displayName,
                compartmentId,
                fsuActionId,
                progress,
                timeCreated,
                timeStarted,
                timeUpdated,
                timeFinished,
                lifecycleState,
                lifecycleDetails,
                freeformTags,
                definedTags,
                systemTags);
        this.fsuCollectionId = fsuCollectionId;
        this.fsuCycleId = fsuCycleId;
        this.targetId = targetId;
        this.schedule = schedule;
    }

    /** OCID of the Exadata Fleet Update Collection that the job is executing on. */
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
    private final String fsuCollectionId;

    /**
     * OCID of the Exadata Fleet Update Collection that the job is executing on.
     *
     * @return the value
     */
    public String getFsuCollectionId() {
        return fsuCollectionId;
    }

    /** OCID of the Exadata Fleet Update Cycle that this job is part of. */
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCycleId")
    private final String fsuCycleId;

    /**
     * OCID of the Exadata Fleet Update Cycle that this job is part of.
     *
     * @return the value
     */
    public String getFsuCycleId() {
        return fsuCycleId;
    }

    /** OCID of Target resource on which the job is executing the action. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * OCID of Target resource on which the job is executing the action.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final ScheduleDetails schedule;

    public ScheduleDetails getSchedule() {
        return schedule;
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
        sb.append("CleanupFsuJobSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", fsuCollectionId=").append(String.valueOf(this.fsuCollectionId));
        sb.append(", fsuCycleId=").append(String.valueOf(this.fsuCycleId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CleanupFsuJobSummary)) {
            return false;
        }

        CleanupFsuJobSummary other = (CleanupFsuJobSummary) o;
        return java.util.Objects.equals(this.fsuCollectionId, other.fsuCollectionId)
                && java.util.Objects.equals(this.fsuCycleId, other.fsuCycleId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fsuCollectionId == null ? 43 : this.fsuCollectionId.hashCode());
        result = (result * PRIME) + (this.fsuCycleId == null ? 43 : this.fsuCycleId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        return result;
    }
}
