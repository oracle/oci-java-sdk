/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Workflow Group Component Details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkflowGroupComponent.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkflowGroupComponent extends WorkflowComponent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        /**
         * Name of the group.
         * @param groupName the value to set
         * @return this builder
         **/
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }
        /**
         * Tasks within the Group.
         * Provide the stepName for all applicable tasks.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("steps")
        private java.util.List<String> steps;

        /**
         * Tasks within the Group.
         * Provide the stepName for all applicable tasks.
         *
         * @param steps the value to set
         * @return this builder
         **/
        public Builder steps(java.util.List<String> steps) {
            this.steps = steps;
            this.__explicitlySet__.add("steps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkflowGroupComponent build() {
            WorkflowGroupComponent model = new WorkflowGroupComponent(this.groupName, this.steps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkflowGroupComponent model) {
            if (model.wasPropertyExplicitlySet("groupName")) {
                this.groupName(model.getGroupName());
            }
            if (model.wasPropertyExplicitlySet("steps")) {
                this.steps(model.getSteps());
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
    public WorkflowGroupComponent(String groupName, java.util.List<String> steps) {
        super();
        this.groupName = groupName;
        this.steps = steps;
    }

    /**
     * Name of the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

    /**
     * Name of the group.
     * @return the value
     **/
    public String getGroupName() {
        return groupName;
    }

    /**
     * Tasks within the Group.
     * Provide the stepName for all applicable tasks.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    private final java.util.List<String> steps;

    /**
     * Tasks within the Group.
     * Provide the stepName for all applicable tasks.
     *
     * @return the value
     **/
    public java.util.List<String> getSteps() {
        return steps;
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
        sb.append("WorkflowGroupComponent(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", groupName=").append(String.valueOf(this.groupName));
        sb.append(", steps=").append(String.valueOf(this.steps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkflowGroupComponent)) {
            return false;
        }

        WorkflowGroupComponent other = (WorkflowGroupComponent) o;
        return java.util.Objects.equals(this.groupName, other.groupName)
                && java.util.Objects.equals(this.steps, other.steps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result = (result * PRIME) + (this.steps == null ? 43 : this.steps.hashCode());
        return result;
    }
}
