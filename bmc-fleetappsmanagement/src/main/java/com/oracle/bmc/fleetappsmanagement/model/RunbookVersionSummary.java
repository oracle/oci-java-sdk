/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Summary of the runbook version. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunbookVersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunbookVersionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "runbookId",
        "compartmentId",
        "tasks",
        "groups",
        "executionWorkflowDetails",
        "rollbackWorkflowDetails",
        "name",
        "isLatest",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public RunbookVersionSummary(
            String id,
            String runbookId,
            String compartmentId,
            java.util.List<Task> tasks,
            java.util.List<Group> groups,
            ExecutionWorkflowDetails executionWorkflowDetails,
            RollbackWorkflowDetails rollbackWorkflowDetails,
            String name,
            Boolean isLatest,
            RunbookVersion.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.runbookId = runbookId;
        this.compartmentId = compartmentId;
        this.tasks = tasks;
        this.groups = groups;
        this.executionWorkflowDetails = executionWorkflowDetails;
        this.rollbackWorkflowDetails = rollbackWorkflowDetails;
        this.name = name;
        this.isLatest = isLatest;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
        private String runbookId;

        /**
         * The OCID of the resource.
         *
         * @param runbookId the value to set
         * @return this builder
         */
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            this.__explicitlySet__.add("runbookId");
            return this;
        }
        /** OCID of the compartment to which the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment to which the resource belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A set of tasks to execute in the runbook. */
        @com.fasterxml.jackson.annotation.JsonProperty("tasks")
        private java.util.List<Task> tasks;

        /**
         * A set of tasks to execute in the runbook.
         *
         * @param tasks the value to set
         * @return this builder
         */
        public Builder tasks(java.util.List<Task> tasks) {
            this.tasks = tasks;
            this.__explicitlySet__.add("tasks");
            return this;
        }
        /** The groups of the runbook. */
        @com.fasterxml.jackson.annotation.JsonProperty("groups")
        private java.util.List<Group> groups;

        /**
         * The groups of the runbook.
         *
         * @param groups the value to set
         * @return this builder
         */
        public Builder groups(java.util.List<Group> groups) {
            this.groups = groups;
            this.__explicitlySet__.add("groups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionWorkflowDetails")
        private ExecutionWorkflowDetails executionWorkflowDetails;

        public Builder executionWorkflowDetails(ExecutionWorkflowDetails executionWorkflowDetails) {
            this.executionWorkflowDetails = executionWorkflowDetails;
            this.__explicitlySet__.add("executionWorkflowDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rollbackWorkflowDetails")
        private RollbackWorkflowDetails rollbackWorkflowDetails;

        public Builder rollbackWorkflowDetails(RollbackWorkflowDetails rollbackWorkflowDetails) {
            this.rollbackWorkflowDetails = rollbackWorkflowDetails;
            this.__explicitlySet__.add("rollbackWorkflowDetails");
            return this;
        }
        /** The version of the runbook. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The version of the runbook.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Is the latest version for the runbook? */
        @com.fasterxml.jackson.annotation.JsonProperty("isLatest")
        private Boolean isLatest;

        /**
         * Is the latest version for the runbook?
         *
         * @param isLatest the value to set
         * @return this builder
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            this.__explicitlySet__.add("isLatest");
            return this;
        }
        /** The current state of the Runbook version. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private RunbookVersion.LifecycleState lifecycleState;

        /**
         * The current state of the Runbook version.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(RunbookVersion.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The time this resource was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time this resource was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time this resource was last updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time this resource was last updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunbookVersionSummary build() {
            RunbookVersionSummary model =
                    new RunbookVersionSummary(
                            this.id,
                            this.runbookId,
                            this.compartmentId,
                            this.tasks,
                            this.groups,
                            this.executionWorkflowDetails,
                            this.rollbackWorkflowDetails,
                            this.name,
                            this.isLatest,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunbookVersionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("runbookId")) {
                this.runbookId(model.getRunbookId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("tasks")) {
                this.tasks(model.getTasks());
            }
            if (model.wasPropertyExplicitlySet("groups")) {
                this.groups(model.getGroups());
            }
            if (model.wasPropertyExplicitlySet("executionWorkflowDetails")) {
                this.executionWorkflowDetails(model.getExecutionWorkflowDetails());
            }
            if (model.wasPropertyExplicitlySet("rollbackWorkflowDetails")) {
                this.rollbackWorkflowDetails(model.getRollbackWorkflowDetails());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isLatest")) {
                this.isLatest(model.getIsLatest());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
    private final String runbookId;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getRunbookId() {
        return runbookId;
    }

    /** OCID of the compartment to which the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment to which the resource belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A set of tasks to execute in the runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("tasks")
    private final java.util.List<Task> tasks;

    /**
     * A set of tasks to execute in the runbook.
     *
     * @return the value
     */
    public java.util.List<Task> getTasks() {
        return tasks;
    }

    /** The groups of the runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    private final java.util.List<Group> groups;

    /**
     * The groups of the runbook.
     *
     * @return the value
     */
    public java.util.List<Group> getGroups() {
        return groups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executionWorkflowDetails")
    private final ExecutionWorkflowDetails executionWorkflowDetails;

    public ExecutionWorkflowDetails getExecutionWorkflowDetails() {
        return executionWorkflowDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rollbackWorkflowDetails")
    private final RollbackWorkflowDetails rollbackWorkflowDetails;

    public RollbackWorkflowDetails getRollbackWorkflowDetails() {
        return rollbackWorkflowDetails;
    }

    /** The version of the runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The version of the runbook.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Is the latest version for the runbook? */
    @com.fasterxml.jackson.annotation.JsonProperty("isLatest")
    private final Boolean isLatest;

    /**
     * Is the latest version for the runbook?
     *
     * @return the value
     */
    public Boolean getIsLatest() {
        return isLatest;
    }

    /** The current state of the Runbook version. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final RunbookVersion.LifecycleState lifecycleState;

    /**
     * The current state of the Runbook version.
     *
     * @return the value
     */
    public RunbookVersion.LifecycleState getLifecycleState() {
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

    /** The time this resource was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time this resource was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time this resource was last updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time this resource was last updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("RunbookVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", runbookId=").append(String.valueOf(this.runbookId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", tasks=").append(String.valueOf(this.tasks));
        sb.append(", groups=").append(String.valueOf(this.groups));
        sb.append(", executionWorkflowDetails=")
                .append(String.valueOf(this.executionWorkflowDetails));
        sb.append(", rollbackWorkflowDetails=")
                .append(String.valueOf(this.rollbackWorkflowDetails));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", isLatest=").append(String.valueOf(this.isLatest));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof RunbookVersionSummary)) {
            return false;
        }

        RunbookVersionSummary other = (RunbookVersionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.tasks, other.tasks)
                && java.util.Objects.equals(this.groups, other.groups)
                && java.util.Objects.equals(
                        this.executionWorkflowDetails, other.executionWorkflowDetails)
                && java.util.Objects.equals(
                        this.rollbackWorkflowDetails, other.rollbackWorkflowDetails)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isLatest, other.isLatest)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.tasks == null ? 43 : this.tasks.hashCode());
        result = (result * PRIME) + (this.groups == null ? 43 : this.groups.hashCode());
        result =
                (result * PRIME)
                        + (this.executionWorkflowDetails == null
                                ? 43
                                : this.executionWorkflowDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.rollbackWorkflowDetails == null
                                ? 43
                                : this.rollbackWorkflowDetails.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isLatest == null ? 43 : this.isLatest.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
