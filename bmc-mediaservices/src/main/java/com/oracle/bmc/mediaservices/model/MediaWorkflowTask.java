/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Defines the type of processing to be run at a given point in the workflow, parameters to
 * configure the processing, and any processing that must be completed before this processing
 * begins. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MediaWorkflowTask.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MediaWorkflowTask
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "version",
        "key",
        "prerequisites",
        "enableParameterReference",
        "enableWhenReferencedParameterEquals",
        "parameters"
    })
    public MediaWorkflowTask(
            String type,
            Long version,
            String key,
            java.util.List<String> prerequisites,
            String enableParameterReference,
            java.util.Map<String, Object> enableWhenReferencedParameterEquals,
            java.util.Map<String, Object> parameters) {
        super();
        this.type = type;
        this.version = version;
        this.key = key;
        this.prerequisites = prerequisites;
        this.enableParameterReference = enableParameterReference;
        this.enableWhenReferencedParameterEquals = enableWhenReferencedParameterEquals;
        this.parameters = parameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of process to run at this task. Refers to the name of a
         * MediaWorkflowTaskDeclaration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of process to run at this task. Refers to the name of a
         * MediaWorkflowTaskDeclaration.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The version of the MediaWorkflowTaskDeclaration. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Long version;

        /**
         * The version of the MediaWorkflowTaskDeclaration.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Long version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * A unique identifier for this task within its workflow. Keys are used to reference a task
         * within workflows and MediaWorkflowJobs. Tasks are referenced as prerequisites and to
         * track output and state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * A unique identifier for this task within its workflow. Keys are used to reference a task
         * within workflows and MediaWorkflowJobs. Tasks are referenced as prerequisites and to
         * track output and state.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Keys to the other tasks in this workflow that must be completed before execution of this
         * task can begin.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("prerequisites")
        private java.util.List<String> prerequisites;

        /**
         * Keys to the other tasks in this workflow that must be completed before execution of this
         * task can begin.
         *
         * @param prerequisites the value to set
         * @return this builder
         */
        public Builder prerequisites(java.util.List<String> prerequisites) {
            this.prerequisites = prerequisites;
            this.__explicitlySet__.add("prerequisites");
            return this;
        }
        /**
         * Allows this task to be conditionally enabled. If no value or a blank value is given, the
         * task is unconditionally enbled. Otherwise the given string specifies a parameter of the
         * job created for this task's workflow using the JSON pointer syntax. The JSON pointer is
         * validated when a job is created from the workflow of this task.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enableParameterReference")
        private String enableParameterReference;

        /**
         * Allows this task to be conditionally enabled. If no value or a blank value is given, the
         * task is unconditionally enbled. Otherwise the given string specifies a parameter of the
         * job created for this task's workflow using the JSON pointer syntax. The JSON pointer is
         * validated when a job is created from the workflow of this task.
         *
         * @param enableParameterReference the value to set
         * @return this builder
         */
        public Builder enableParameterReference(String enableParameterReference) {
            this.enableParameterReference = enableParameterReference;
            this.__explicitlySet__.add("enableParameterReference");
            return this;
        }
        /**
         * Used in conjunction with enableParameterReference to conditionally enable a task. When a
         * job is created from the workflow of this task, the task will only be enabled if the value
         * of the parameter specified by enableParameterReference is equal to the value of this
         * property. This property must be prenset if and only if a enableParameterReference is
         * given. The value is a JSON node.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("enableWhenReferencedParameterEquals")
        private java.util.Map<String, Object> enableWhenReferencedParameterEquals;

        /**
         * Used in conjunction with enableParameterReference to conditionally enable a task. When a
         * job is created from the workflow of this task, the task will only be enabled if the value
         * of the parameter specified by enableParameterReference is equal to the value of this
         * property. This property must be prenset if and only if a enableParameterReference is
         * given. The value is a JSON node.
         *
         * @param enableWhenReferencedParameterEquals the value to set
         * @return this builder
         */
        public Builder enableWhenReferencedParameterEquals(
                java.util.Map<String, Object> enableWhenReferencedParameterEquals) {
            this.enableWhenReferencedParameterEquals = enableWhenReferencedParameterEquals;
            this.__explicitlySet__.add("enableWhenReferencedParameterEquals");
            return this;
        }
        /**
         * Data specifiying how this task is to be run. The data is a JSON object that must conform
         * to the JSON Schema specified by the parameters of the MediaWorkflowTaskDeclaration this
         * task references. The parameters may contain values or references to other parameters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, Object> parameters;

        /**
         * Data specifiying how this task is to be run. The data is a JSON object that must conform
         * to the JSON Schema specified by the parameters of the MediaWorkflowTaskDeclaration this
         * task references. The parameters may contain values or references to other parameters.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.Map<String, Object> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MediaWorkflowTask build() {
            MediaWorkflowTask model =
                    new MediaWorkflowTask(
                            this.type,
                            this.version,
                            this.key,
                            this.prerequisites,
                            this.enableParameterReference,
                            this.enableWhenReferencedParameterEquals,
                            this.parameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MediaWorkflowTask model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("prerequisites")) {
                this.prerequisites(model.getPrerequisites());
            }
            if (model.wasPropertyExplicitlySet("enableParameterReference")) {
                this.enableParameterReference(model.getEnableParameterReference());
            }
            if (model.wasPropertyExplicitlySet("enableWhenReferencedParameterEquals")) {
                this.enableWhenReferencedParameterEquals(
                        model.getEnableWhenReferencedParameterEquals());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
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

    /**
     * The type of process to run at this task. Refers to the name of a
     * MediaWorkflowTaskDeclaration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of process to run at this task. Refers to the name of a
     * MediaWorkflowTaskDeclaration.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** The version of the MediaWorkflowTaskDeclaration. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Long version;

    /**
     * The version of the MediaWorkflowTaskDeclaration.
     *
     * @return the value
     */
    public Long getVersion() {
        return version;
    }

    /**
     * A unique identifier for this task within its workflow. Keys are used to reference a task
     * within workflows and MediaWorkflowJobs. Tasks are referenced as prerequisites and to track
     * output and state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A unique identifier for this task within its workflow. Keys are used to reference a task
     * within workflows and MediaWorkflowJobs. Tasks are referenced as prerequisites and to track
     * output and state.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * Keys to the other tasks in this workflow that must be completed before execution of this task
     * can begin.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("prerequisites")
    private final java.util.List<String> prerequisites;

    /**
     * Keys to the other tasks in this workflow that must be completed before execution of this task
     * can begin.
     *
     * @return the value
     */
    public java.util.List<String> getPrerequisites() {
        return prerequisites;
    }

    /**
     * Allows this task to be conditionally enabled. If no value or a blank value is given, the task
     * is unconditionally enbled. Otherwise the given string specifies a parameter of the job
     * created for this task's workflow using the JSON pointer syntax. The JSON pointer is validated
     * when a job is created from the workflow of this task.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableParameterReference")
    private final String enableParameterReference;

    /**
     * Allows this task to be conditionally enabled. If no value or a blank value is given, the task
     * is unconditionally enbled. Otherwise the given string specifies a parameter of the job
     * created for this task's workflow using the JSON pointer syntax. The JSON pointer is validated
     * when a job is created from the workflow of this task.
     *
     * @return the value
     */
    public String getEnableParameterReference() {
        return enableParameterReference;
    }

    /**
     * Used in conjunction with enableParameterReference to conditionally enable a task. When a job
     * is created from the workflow of this task, the task will only be enabled if the value of the
     * parameter specified by enableParameterReference is equal to the value of this property. This
     * property must be prenset if and only if a enableParameterReference is given. The value is a
     * JSON node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableWhenReferencedParameterEquals")
    private final java.util.Map<String, Object> enableWhenReferencedParameterEquals;

    /**
     * Used in conjunction with enableParameterReference to conditionally enable a task. When a job
     * is created from the workflow of this task, the task will only be enabled if the value of the
     * parameter specified by enableParameterReference is equal to the value of this property. This
     * property must be prenset if and only if a enableParameterReference is given. The value is a
     * JSON node.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getEnableWhenReferencedParameterEquals() {
        return enableWhenReferencedParameterEquals;
    }

    /**
     * Data specifiying how this task is to be run. The data is a JSON object that must conform to
     * the JSON Schema specified by the parameters of the MediaWorkflowTaskDeclaration this task
     * references. The parameters may contain values or references to other parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, Object> parameters;

    /**
     * Data specifiying how this task is to be run. The data is a JSON object that must conform to
     * the JSON Schema specified by the parameters of the MediaWorkflowTaskDeclaration this task
     * references. The parameters may contain values or references to other parameters.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getParameters() {
        return parameters;
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
        sb.append("MediaWorkflowTask(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", prerequisites=").append(String.valueOf(this.prerequisites));
        sb.append(", enableParameterReference=")
                .append(String.valueOf(this.enableParameterReference));
        sb.append(", enableWhenReferencedParameterEquals=")
                .append(String.valueOf(this.enableWhenReferencedParameterEquals));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaWorkflowTask)) {
            return false;
        }

        MediaWorkflowTask other = (MediaWorkflowTask) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.prerequisites, other.prerequisites)
                && java.util.Objects.equals(
                        this.enableParameterReference, other.enableParameterReference)
                && java.util.Objects.equals(
                        this.enableWhenReferencedParameterEquals,
                        other.enableWhenReferencedParameterEquals)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.prerequisites == null ? 43 : this.prerequisites.hashCode());
        result =
                (result * PRIME)
                        + (this.enableParameterReference == null
                                ? 43
                                : this.enableParameterReference.hashCode());
        result =
                (result * PRIME)
                        + (this.enableWhenReferencedParameterEquals == null
                                ? 43
                                : this.enableWhenReferencedParameterEquals.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
