/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oce.model;

/**
 * The workflow monitor for this work request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkflowMonitor.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WorkflowMonitor
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"workflowName", "resourceName", "workflowSteps"})
    public WorkflowMonitor(
            String workflowName, String resourceName, java.util.List<WorkflowStep> workflowSteps) {
        super();
        this.workflowName = workflowName;
        this.resourceName = resourceName;
        this.workflowSteps = workflowSteps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** workflow name for this work request */
        @com.fasterxml.jackson.annotation.JsonProperty("workflowName")
        private String workflowName;

        /**
         * workflow name for this work request
         *
         * @param workflowName the value to set
         * @return this builder
         */
        public Builder workflowName(String workflowName) {
            this.workflowName = workflowName;
            this.__explicitlySet__.add("workflowName");
            return this;
        }
        /** resource name for this work request */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * resource name for this work request
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** Workflow step of workflow monitor. */
        @com.fasterxml.jackson.annotation.JsonProperty("workflowSteps")
        private java.util.List<WorkflowStep> workflowSteps;

        /**
         * Workflow step of workflow monitor.
         *
         * @param workflowSteps the value to set
         * @return this builder
         */
        public Builder workflowSteps(java.util.List<WorkflowStep> workflowSteps) {
            this.workflowSteps = workflowSteps;
            this.__explicitlySet__.add("workflowSteps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkflowMonitor build() {
            WorkflowMonitor model =
                    new WorkflowMonitor(this.workflowName, this.resourceName, this.workflowSteps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkflowMonitor model) {
            if (model.wasPropertyExplicitlySet("workflowName")) {
                this.workflowName(model.getWorkflowName());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("workflowSteps")) {
                this.workflowSteps(model.getWorkflowSteps());
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

    /** workflow name for this work request */
    @com.fasterxml.jackson.annotation.JsonProperty("workflowName")
    private final String workflowName;

    /**
     * workflow name for this work request
     *
     * @return the value
     */
    public String getWorkflowName() {
        return workflowName;
    }

    /** resource name for this work request */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * resource name for this work request
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** Workflow step of workflow monitor. */
    @com.fasterxml.jackson.annotation.JsonProperty("workflowSteps")
    private final java.util.List<WorkflowStep> workflowSteps;

    /**
     * Workflow step of workflow monitor.
     *
     * @return the value
     */
    public java.util.List<WorkflowStep> getWorkflowSteps() {
        return workflowSteps;
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
        sb.append("WorkflowMonitor(");
        sb.append("super=").append(super.toString());
        sb.append("workflowName=").append(String.valueOf(this.workflowName));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", workflowSteps=").append(String.valueOf(this.workflowSteps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkflowMonitor)) {
            return false;
        }

        WorkflowMonitor other = (WorkflowMonitor) o;
        return java.util.Objects.equals(this.workflowName, other.workflowName)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.workflowSteps, other.workflowSteps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.workflowName == null ? 43 : this.workflowName.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.workflowSteps == null ? 43 : this.workflowSteps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
