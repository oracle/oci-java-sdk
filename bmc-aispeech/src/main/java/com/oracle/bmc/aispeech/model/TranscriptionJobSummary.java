/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Summary of the Transcription Job.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TranscriptionJobSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TranscriptionJobSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "createdBy",
        "percentComplete",
        "timeAccepted",
        "timeStarted",
        "timeFinished",
        "totalTasks",
        "outstandingTasks",
        "successfulTasks",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public TranscriptionJobSummary(
            String id,
            String displayName,
            String compartmentId,
            String createdBy,
            Integer percentComplete,
            java.util.Date timeAccepted,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Integer totalTasks,
            Integer outstandingTasks,
            Integer successfulTasks,
            TranscriptionJob.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.createdBy = createdBy;
        this.percentComplete = percentComplete;
        this.timeAccepted = timeAccepted;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.totalTasks = totalTasks;
        this.outstandingTasks = outstandingTasks;
        this.successfulTasks = successfulTasks;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly display name for the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the job.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job.
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * How much progress the operation has made, vs the total amount of work that must be performed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        /**
         * How much progress the operation has made, vs the total amount of work that must be performed.
         * @param percentComplete the value to set
         * @return this builder
         **/
        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /**
         * Job accepted time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        /**
         * Job accepted time.
         * @param timeAccepted the value to set
         * @return this builder
         **/
        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }
        /**
         * Job started time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Job started time.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * Job finished time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * Job finished time.
         * @param timeFinished the value to set
         * @return this builder
         **/
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * Total number of tasks in a job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalTasks")
        private Integer totalTasks;

        /**
         * Total number of tasks in a job.
         * @param totalTasks the value to set
         * @return this builder
         **/
        public Builder totalTasks(Integer totalTasks) {
            this.totalTasks = totalTasks;
            this.__explicitlySet__.add("totalTasks");
            return this;
        }
        /**
         * Total outstanding tasks in a job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outstandingTasks")
        private Integer outstandingTasks;

        /**
         * Total outstanding tasks in a job.
         * @param outstandingTasks the value to set
         * @return this builder
         **/
        public Builder outstandingTasks(Integer outstandingTasks) {
            this.outstandingTasks = outstandingTasks;
            this.__explicitlySet__.add("outstandingTasks");
            return this;
        }
        /**
         * Total successful tasks in a job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("successfulTasks")
        private Integer successfulTasks;

        /**
         * Total successful tasks in a job.
         * @param successfulTasks the value to set
         * @return this builder
         **/
        public Builder successfulTasks(Integer successfulTasks) {
            this.successfulTasks = successfulTasks;
            this.__explicitlySet__.add("successfulTasks");
            return this;
        }
        /**
         * The current state of the Speech Job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private TranscriptionJob.LifecycleState lifecycleState;

        /**
         * The current state of the Speech Job.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(TranscriptionJob.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
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
         * Example: {@code {"bar-key": "value"}}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}.
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
         * Example: {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"}, "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"}, "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
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
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
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

        public TranscriptionJobSummary build() {
            TranscriptionJobSummary model =
                    new TranscriptionJobSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.createdBy,
                            this.percentComplete,
                            this.timeAccepted,
                            this.timeStarted,
                            this.timeFinished,
                            this.totalTasks,
                            this.outstandingTasks,
                            this.successfulTasks,
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
        public Builder copy(TranscriptionJobSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("timeAccepted")) {
                this.timeAccepted(model.getTimeAccepted());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("totalTasks")) {
                this.totalTasks(model.getTotalTasks());
            }
            if (model.wasPropertyExplicitlySet("outstandingTasks")) {
                this.outstandingTasks(model.getOutstandingTasks());
            }
            if (model.wasPropertyExplicitlySet("successfulTasks")) {
                this.successfulTasks(model.getSuccessfulTasks());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly display name for the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the job.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job.
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * How much progress the operation has made, vs the total amount of work that must be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    /**
     * How much progress the operation has made, vs the total amount of work that must be performed.
     * @return the value
     **/
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /**
     * Job accepted time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    private final java.util.Date timeAccepted;

    /**
     * Job accepted time.
     * @return the value
     **/
    public java.util.Date getTimeAccepted() {
        return timeAccepted;
    }

    /**
     * Job started time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Job started time.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * Job finished time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * Job finished time.
     * @return the value
     **/
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * Total number of tasks in a job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalTasks")
    private final Integer totalTasks;

    /**
     * Total number of tasks in a job.
     * @return the value
     **/
    public Integer getTotalTasks() {
        return totalTasks;
    }

    /**
     * Total outstanding tasks in a job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outstandingTasks")
    private final Integer outstandingTasks;

    /**
     * Total outstanding tasks in a job.
     * @return the value
     **/
    public Integer getOutstandingTasks() {
        return outstandingTasks;
    }

    /**
     * Total successful tasks in a job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("successfulTasks")
    private final Integer successfulTasks;

    /**
     * Total successful tasks in a job.
     * @return the value
     **/
    public Integer getSuccessfulTasks() {
        return successfulTasks;
    }

    /**
     * The current state of the Speech Job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final TranscriptionJob.LifecycleState lifecycleState;

    /**
     * The current state of the Speech Job.
     * @return the value
     **/
    public TranscriptionJob.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"}, "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace-1": {"bar-key-1": "value-1", "bar-key-2": "value-2"}, "foo-namespace-2": {"bar-key-1": "value-1", "bar-key-2": "value-2"}}}.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}.
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
        sb.append("TranscriptionJobSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", timeAccepted=").append(String.valueOf(this.timeAccepted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", totalTasks=").append(String.valueOf(this.totalTasks));
        sb.append(", outstandingTasks=").append(String.valueOf(this.outstandingTasks));
        sb.append(", successfulTasks=").append(String.valueOf(this.successfulTasks));
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
        if (!(o instanceof TranscriptionJobSummary)) {
            return false;
        }

        TranscriptionJobSummary other = (TranscriptionJobSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.timeAccepted, other.timeAccepted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.totalTasks, other.totalTasks)
                && java.util.Objects.equals(this.outstandingTasks, other.outstandingTasks)
                && java.util.Objects.equals(this.successfulTasks, other.successfulTasks)
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
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result = (result * PRIME) + (this.timeAccepted == null ? 43 : this.timeAccepted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.totalTasks == null ? 43 : this.totalTasks.hashCode());
        result =
                (result * PRIME)
                        + (this.outstandingTasks == null ? 43 : this.outstandingTasks.hashCode());
        result =
                (result * PRIME)
                        + (this.successfulTasks == null ? 43 : this.successfulTasks.hashCode());
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
