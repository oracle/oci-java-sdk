/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Associations for the runbook.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Associations.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Associations extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tasks",
        "groups",
        "executionWorkflowDetails",
        "rollbackWorkflowDetails",
        "version"
    })
    public Associations(
            java.util.List<Task> tasks,
            java.util.List<Group> groups,
            ExecutionWorkflowDetails executionWorkflowDetails,
            RollbackWorkflowDetails rollbackWorkflowDetails,
            String version) {
        super();
        this.tasks = tasks;
        this.groups = groups;
        this.executionWorkflowDetails = executionWorkflowDetails;
        this.rollbackWorkflowDetails = rollbackWorkflowDetails;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A set of tasks to execute in the runbook.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tasks")
        private java.util.List<Task> tasks;

        /**
         * A set of tasks to execute in the runbook.
         * @param tasks the value to set
         * @return this builder
         **/
        public Builder tasks(java.util.List<Task> tasks) {
            this.tasks = tasks;
            this.__explicitlySet__.add("tasks");
            return this;
        }
        /**
         * The groups of the runbook.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groups")
        private java.util.List<Group> groups;

        /**
         * The groups of the runbook.
         *
         * @param groups the value to set
         * @return this builder
         **/
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
         * The version of the runbook.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the runbook.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Associations build() {
            Associations model =
                    new Associations(
                            this.tasks,
                            this.groups,
                            this.executionWorkflowDetails,
                            this.rollbackWorkflowDetails,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Associations model) {
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
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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
     * A set of tasks to execute in the runbook.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tasks")
    private final java.util.List<Task> tasks;

    /**
     * A set of tasks to execute in the runbook.
     * @return the value
     **/
    public java.util.List<Task> getTasks() {
        return tasks;
    }

    /**
     * The groups of the runbook.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    private final java.util.List<Group> groups;

    /**
     * The groups of the runbook.
     *
     * @return the value
     **/
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
     * The version of the runbook.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the runbook.
     * @return the value
     **/
    public String getVersion() {
        return version;
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
        sb.append("Associations(");
        sb.append("super=").append(super.toString());
        sb.append("tasks=").append(String.valueOf(this.tasks));
        sb.append(", groups=").append(String.valueOf(this.groups));
        sb.append(", executionWorkflowDetails=")
                .append(String.valueOf(this.executionWorkflowDetails));
        sb.append(", rollbackWorkflowDetails=")
                .append(String.valueOf(this.rollbackWorkflowDetails));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Associations)) {
            return false;
        }

        Associations other = (Associations) o;
        return java.util.Objects.equals(this.tasks, other.tasks)
                && java.util.Objects.equals(this.groups, other.groups)
                && java.util.Objects.equals(
                        this.executionWorkflowDetails, other.executionWorkflowDetails)
                && java.util.Objects.equals(
                        this.rollbackWorkflowDetails, other.rollbackWorkflowDetails)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
