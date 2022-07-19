/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * A named list of tasks to be used to run a job or as a template to create a MediaWorkflow.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SystemMediaWorkflow.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SystemMediaWorkflow {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "parameters", "tasks"})
    public SystemMediaWorkflow(
            String name,
            String description,
            java.util.Map<String, String> parameters,
            java.util.List<MediaWorkflowTask> tasks) {
        super();
        this.name = name;
        this.description = description;
        this.parameters = parameters;
        this.tasks = tasks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * System provided unique identifier for this static media workflow.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * System provided unique identifier for this static media workflow.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Description of this workflow's processing and how that processing can be customized by
         * specifying parameter values.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of this workflow's processing and how that processing can be customized by
         * specifying parameter values.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * JSON object representing named parameters and their default values that can be referenced throughout this workflow.
         * The values declared here can be overridden by the MediaWorkflowConfigurations or parameters supplied when creating
         * MediaWorkflowJobs from this MediaWorkflow.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, String> parameters;

        /**
         * JSON object representing named parameters and their default values that can be referenced throughout this workflow.
         * The values declared here can be overridden by the MediaWorkflowConfigurations or parameters supplied when creating
         * MediaWorkflowJobs from this MediaWorkflow.
         *
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /**
         * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array is unique
         * within the array. The order of the items is preserved from the order of the tasks array in
         * CreateMediaWorkflowDetails or UpdateMediaWorkflowDetails.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tasks")
        private java.util.List<MediaWorkflowTask> tasks;

        /**
         * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array is unique
         * within the array. The order of the items is preserved from the order of the tasks array in
         * CreateMediaWorkflowDetails or UpdateMediaWorkflowDetails.
         *
         * @param tasks the value to set
         * @return this builder
         **/
        public Builder tasks(java.util.List<MediaWorkflowTask> tasks) {
            this.tasks = tasks;
            this.__explicitlySet__.add("tasks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SystemMediaWorkflow build() {
            SystemMediaWorkflow __instance__ =
                    new SystemMediaWorkflow(name, description, parameters, tasks);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SystemMediaWorkflow o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .description(o.getDescription())
                            .parameters(o.getParameters())
                            .tasks(o.getTasks());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * System provided unique identifier for this static media workflow.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * System provided unique identifier for this static media workflow.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Description of this workflow's processing and how that processing can be customized by
     * specifying parameter values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of this workflow's processing and how that processing can be customized by
     * specifying parameter values.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * JSON object representing named parameters and their default values that can be referenced throughout this workflow.
     * The values declared here can be overridden by the MediaWorkflowConfigurations or parameters supplied when creating
     * MediaWorkflowJobs from this MediaWorkflow.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, String> parameters;

    /**
     * JSON object representing named parameters and their default values that can be referenced throughout this workflow.
     * The values declared here can be overridden by the MediaWorkflowConfigurations or parameters supplied when creating
     * MediaWorkflowJobs from this MediaWorkflow.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array is unique
     * within the array. The order of the items is preserved from the order of the tasks array in
     * CreateMediaWorkflowDetails or UpdateMediaWorkflowDetails.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tasks")
    private final java.util.List<MediaWorkflowTask> tasks;

    /**
     * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array is unique
     * within the array. The order of the items is preserved from the order of the tasks array in
     * CreateMediaWorkflowDetails or UpdateMediaWorkflowDetails.
     *
     * @return the value
     **/
    public java.util.List<MediaWorkflowTask> getTasks() {
        return tasks;
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
        sb.append("SystemMediaWorkflow(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", tasks=").append(String.valueOf(this.tasks));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SystemMediaWorkflow)) {
            return false;
        }

        SystemMediaWorkflow other = (SystemMediaWorkflow) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.tasks, other.tasks)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.tasks == null ? 43 : this.tasks.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
