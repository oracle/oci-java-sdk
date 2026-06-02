/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * Group task is a construct that represents a container of tasks for execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GroupTask.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GroupTask extends BatchTask {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hierarchicalName")
        private String hierarchicalName;

        public Builder hierarchicalName(String hierarchicalName) {
            this.hierarchicalName = hierarchicalName;
            this.__explicitlySet__.add("hierarchicalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupTaskName")
        private String groupTaskName;

        public Builder groupTaskName(String groupTaskName) {
            this.groupTaskName = groupTaskName;
            this.__explicitlySet__.add("groupTaskName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("entitlementClaims")
        private java.util.List<String> entitlementClaims;

        public Builder entitlementClaims(java.util.List<String> entitlementClaims) {
            this.entitlementClaims = entitlementClaims;
            this.__explicitlySet__.add("entitlementClaims");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dependencies")
        private java.util.List<String> dependencies;

        public Builder dependencies(java.util.List<String> dependencies) {
            this.dependencies = dependencies;
            this.__explicitlySet__.add("dependencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.List<EnvironmentVariable> environmentVariables;

        public Builder environmentVariables(
                java.util.List<EnvironmentVariable> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }
        /**
         * The names of tasks contained directly (non-recursively) within this group task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tasks")
        private java.util.List<String> tasks;

        /**
         * The names of tasks contained directly (non-recursively) within this group task.
         * @param tasks the value to set
         * @return this builder
         **/
        public Builder tasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            this.__explicitlySet__.add("tasks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GroupTask build() {
            GroupTask model =
                    new GroupTask(
                            this.id,
                            this.name,
                            this.hierarchicalName,
                            this.groupTaskName,
                            this.description,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.entitlementClaims,
                            this.dependencies,
                            this.environmentVariables,
                            this.tasks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GroupTask model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("hierarchicalName")) {
                this.hierarchicalName(model.getHierarchicalName());
            }
            if (model.wasPropertyExplicitlySet("groupTaskName")) {
                this.groupTaskName(model.getGroupTaskName());
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
            if (model.wasPropertyExplicitlySet("entitlementClaims")) {
                this.entitlementClaims(model.getEntitlementClaims());
            }
            if (model.wasPropertyExplicitlySet("dependencies")) {
                this.dependencies(model.getDependencies());
            }
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
            }
            if (model.wasPropertyExplicitlySet("tasks")) {
                this.tasks(model.getTasks());
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

    @Deprecated
    public GroupTask(
            String id,
            String name,
            String hierarchicalName,
            String groupTaskName,
            String description,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.List<String> entitlementClaims,
            java.util.List<String> dependencies,
            java.util.List<EnvironmentVariable> environmentVariables,
            java.util.List<String> tasks) {
        super(
                id,
                name,
                hierarchicalName,
                groupTaskName,
                description,
                lifecycleState,
                lifecycleDetails,
                entitlementClaims,
                dependencies,
                environmentVariables);
        this.tasks = tasks;
    }

    /**
     * The names of tasks contained directly (non-recursively) within this group task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tasks")
    private final java.util.List<String> tasks;

    /**
     * The names of tasks contained directly (non-recursively) within this group task.
     * @return the value
     **/
    public java.util.List<String> getTasks() {
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
        sb.append("GroupTask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", tasks=").append(String.valueOf(this.tasks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupTask)) {
            return false;
        }

        GroupTask other = (GroupTask) o;
        return java.util.Objects.equals(this.tasks, other.tasks) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.tasks == null ? 43 : this.tasks.hashCode());
        return result;
    }
}
