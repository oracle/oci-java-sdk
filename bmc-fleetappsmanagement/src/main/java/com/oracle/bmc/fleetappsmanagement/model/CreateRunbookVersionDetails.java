/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The information about new runbook version. Versioning runbooks in Fleet Application Management
 * involve assigning unique identifiers or version numbers to different iterations of the runbook to
 * track changes, improvements, and updates over time. <br>
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
        builder = CreateRunbookVersionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateRunbookVersionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "runbookId",
        "tasks",
        "groups",
        "executionWorkflowDetails",
        "rollbackWorkflowDetails",
        "freeformTags",
        "definedTags"
    })
    public CreateRunbookVersionDetails(
            String runbookId,
            java.util.List<Task> tasks,
            java.util.List<Group> groups,
            ExecutionWorkflowDetails executionWorkflowDetails,
            RollbackWorkflowDetails rollbackWorkflowDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.runbookId = runbookId;
        this.tasks = tasks;
        this.groups = groups;
        this.executionWorkflowDetails = executionWorkflowDetails;
        this.rollbackWorkflowDetails = rollbackWorkflowDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The groups of the runbook version. */
        @com.fasterxml.jackson.annotation.JsonProperty("groups")
        private java.util.List<Group> groups;

        /**
         * The groups of the runbook version.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateRunbookVersionDetails build() {
            CreateRunbookVersionDetails model =
                    new CreateRunbookVersionDetails(
                            this.runbookId,
                            this.tasks,
                            this.groups,
                            this.executionWorkflowDetails,
                            this.rollbackWorkflowDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRunbookVersionDetails model) {
            if (model.wasPropertyExplicitlySet("runbookId")) {
                this.runbookId(model.getRunbookId());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The groups of the runbook version. */
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    private final java.util.List<Group> groups;

    /**
     * The groups of the runbook version.
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
        sb.append("CreateRunbookVersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("runbookId=").append(String.valueOf(this.runbookId));
        sb.append(", tasks=").append(String.valueOf(this.tasks));
        sb.append(", groups=").append(String.valueOf(this.groups));
        sb.append(", executionWorkflowDetails=")
                .append(String.valueOf(this.executionWorkflowDetails));
        sb.append(", rollbackWorkflowDetails=")
                .append(String.valueOf(this.rollbackWorkflowDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRunbookVersionDetails)) {
            return false;
        }

        CreateRunbookVersionDetails other = (CreateRunbookVersionDetails) o;
        return java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.tasks, other.tasks)
                && java.util.Objects.equals(this.groups, other.groups)
                && java.util.Objects.equals(
                        this.executionWorkflowDetails, other.executionWorkflowDetails)
                && java.util.Objects.equals(
                        this.rollbackWorkflowDetails, other.rollbackWorkflowDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
