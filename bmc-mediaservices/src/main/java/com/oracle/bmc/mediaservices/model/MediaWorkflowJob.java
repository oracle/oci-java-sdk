/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * A MediaWorkflowJob represents a run of a MediaWorkflow for a specific set of parameters and
 * configurations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MediaWorkflowJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MediaWorkflowJob
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mediaWorkflowConfigurationIds",
        "mediaWorkflowId",
        "id",
        "compartmentId",
        "displayName",
        "lifecycleState",
        "lifecycleDetails",
        "taskLifecycleState",
        "parameters",
        "timeCreated",
        "timeUpdated",
        "runnable",
        "outputs",
        "timeStarted",
        "timeEnded",
        "locks",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MediaWorkflowJob(
            java.util.List<String> mediaWorkflowConfigurationIds,
            String mediaWorkflowId,
            String id,
            String compartmentId,
            String displayName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.List<MediaWorkflowTaskState> taskLifecycleState,
            java.util.Map<String, Object> parameters,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, Object> runnable,
            java.util.List<JobOutput> outputs,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            java.util.List<ResourceLock> locks,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.mediaWorkflowConfigurationIds = mediaWorkflowConfigurationIds;
        this.mediaWorkflowId = mediaWorkflowId;
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.taskLifecycleState = taskLifecycleState;
        this.parameters = parameters;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.runnable = runnable;
        this.outputs = outputs;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.locks = locks;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Configurations to be applied to this run of the workflow. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowConfigurationIds")
        private java.util.List<String> mediaWorkflowConfigurationIds;

        /**
         * Configurations to be applied to this run of the workflow.
         *
         * @param mediaWorkflowConfigurationIds the value to set
         * @return this builder
         */
        public Builder mediaWorkflowConfigurationIds(
                java.util.List<String> mediaWorkflowConfigurationIds) {
            this.mediaWorkflowConfigurationIds = mediaWorkflowConfigurationIds;
            this.__explicitlySet__.add("mediaWorkflowConfigurationIds");
            return this;
        }
        /** The workflow to execute. */
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowId")
        private String mediaWorkflowId;

        /**
         * The workflow to execute.
         *
         * @param mediaWorkflowId the value to set
         * @return this builder
         */
        public Builder mediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            this.__explicitlySet__.add("mediaWorkflowId");
            return this;
        }
        /** Unique identifier for this run of the workflow. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier for this run of the workflow.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Compartment Identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Name of the Media Workflow Job. Does not have to be unique. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the Media Workflow Job. Does not have to be unique. Avoid entering confidential
         * information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The current state of the MediaWorkflowJob. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the MediaWorkflowJob.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The lifecyle details. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * The lifecyle details.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Status of each task. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskLifecycleState")
        private java.util.List<MediaWorkflowTaskState> taskLifecycleState;

        /**
         * Status of each task.
         *
         * @param taskLifecycleState the value to set
         * @return this builder
         */
        public Builder taskLifecycleState(
                java.util.List<MediaWorkflowTaskState> taskLifecycleState) {
            this.taskLifecycleState = taskLifecycleState;
            this.__explicitlySet__.add("taskLifecycleState");
            return this;
        }
        /**
         * Parameters that override parameters specified in MediaWorkflowTaskDeclarations, the
         * MediaWorkflow, the MediaWorkflow's MediaWorkflowConfigurations and the
         * MediaWorkflowConfigurations of this MediaWorkflowJob. The parameters are given as JSON.
         * The top level and 2nd level elements must be JSON objects (vs arrays, scalars, etc). The
         * top level keys refer to a task's key and the 2nd level keys refer to a parameter's name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, Object> parameters;

        /**
         * Parameters that override parameters specified in MediaWorkflowTaskDeclarations, the
         * MediaWorkflow, the MediaWorkflow's MediaWorkflowConfigurations and the
         * MediaWorkflowConfigurations of this MediaWorkflowJob. The parameters are given as JSON.
         * The top level and 2nd level elements must be JSON objects (vs arrays, scalars, etc). The
         * top level keys refer to a task's key and the 2nd level keys refer to a parameter's name.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.Map<String, Object> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /** Creation time of the job. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Creation time of the job. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Updated time of the job. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Updated time of the job. An RFC3339 formatted datetime string.
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
         * A JSON representation of the job as it will be run by the system. All the task
         * declarations, configurations and parameters are merged. Parameter values are all fully
         * resolved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("runnable")
        private java.util.Map<String, Object> runnable;

        /**
         * A JSON representation of the job as it will be run by the system. All the task
         * declarations, configurations and parameters are merged. Parameter values are all fully
         * resolved.
         *
         * @param runnable the value to set
         * @return this builder
         */
        public Builder runnable(java.util.Map<String, Object> runnable) {
            this.runnable = runnable;
            this.__explicitlySet__.add("runnable");
            return this;
        }
        /** A list of JobOutput for the workflowJob. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputs")
        private java.util.List<JobOutput> outputs;

        /**
         * A list of JobOutput for the workflowJob.
         *
         * @param outputs the value to set
         * @return this builder
         */
        public Builder outputs(java.util.List<JobOutput> outputs) {
            this.outputs = outputs;
            this.__explicitlySet__.add("outputs");
            return this;
        }
        /** Time when the job started to execute. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Time when the job started to execute. An RFC3339 formatted datetime string.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** Time when the job finished. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * Time when the job finished. An RFC3339 formatted datetime string.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public MediaWorkflowJob build() {
            MediaWorkflowJob model =
                    new MediaWorkflowJob(
                            this.mediaWorkflowConfigurationIds,
                            this.mediaWorkflowId,
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.taskLifecycleState,
                            this.parameters,
                            this.timeCreated,
                            this.timeUpdated,
                            this.runnable,
                            this.outputs,
                            this.timeStarted,
                            this.timeEnded,
                            this.locks,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MediaWorkflowJob model) {
            if (model.wasPropertyExplicitlySet("mediaWorkflowConfigurationIds")) {
                this.mediaWorkflowConfigurationIds(model.getMediaWorkflowConfigurationIds());
            }
            if (model.wasPropertyExplicitlySet("mediaWorkflowId")) {
                this.mediaWorkflowId(model.getMediaWorkflowId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("taskLifecycleState")) {
                this.taskLifecycleState(model.getTaskLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("runnable")) {
                this.runnable(model.getRunnable());
            }
            if (model.wasPropertyExplicitlySet("outputs")) {
                this.outputs(model.getOutputs());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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

    /** Configurations to be applied to this run of the workflow. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowConfigurationIds")
    private final java.util.List<String> mediaWorkflowConfigurationIds;

    /**
     * Configurations to be applied to this run of the workflow.
     *
     * @return the value
     */
    public java.util.List<String> getMediaWorkflowConfigurationIds() {
        return mediaWorkflowConfigurationIds;
    }

    /** The workflow to execute. */
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowId")
    private final String mediaWorkflowId;

    /**
     * The workflow to execute.
     *
     * @return the value
     */
    public String getMediaWorkflowId() {
        return mediaWorkflowId;
    }

    /** Unique identifier for this run of the workflow. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier for this run of the workflow.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Compartment Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Name of the Media Workflow Job. Does not have to be unique. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the Media Workflow Job. Does not have to be unique. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The current state of the MediaWorkflowJob. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Waiting("WAITING"),
        Rejected("REJECTED"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the MediaWorkflowJob. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the MediaWorkflowJob.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The lifecyle details. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * The lifecyle details.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Status of each task. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskLifecycleState")
    private final java.util.List<MediaWorkflowTaskState> taskLifecycleState;

    /**
     * Status of each task.
     *
     * @return the value
     */
    public java.util.List<MediaWorkflowTaskState> getTaskLifecycleState() {
        return taskLifecycleState;
    }

    /**
     * Parameters that override parameters specified in MediaWorkflowTaskDeclarations, the
     * MediaWorkflow, the MediaWorkflow's MediaWorkflowConfigurations and the
     * MediaWorkflowConfigurations of this MediaWorkflowJob. The parameters are given as JSON. The
     * top level and 2nd level elements must be JSON objects (vs arrays, scalars, etc). The top
     * level keys refer to a task's key and the 2nd level keys refer to a parameter's name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, Object> parameters;

    /**
     * Parameters that override parameters specified in MediaWorkflowTaskDeclarations, the
     * MediaWorkflow, the MediaWorkflow's MediaWorkflowConfigurations and the
     * MediaWorkflowConfigurations of this MediaWorkflowJob. The parameters are given as JSON. The
     * top level and 2nd level elements must be JSON objects (vs arrays, scalars, etc). The top
     * level keys refer to a task's key and the 2nd level keys refer to a parameter's name.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getParameters() {
        return parameters;
    }

    /** Creation time of the job. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Creation time of the job. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Updated time of the job. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Updated time of the job. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * A JSON representation of the job as it will be run by the system. All the task declarations,
     * configurations and parameters are merged. Parameter values are all fully resolved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runnable")
    private final java.util.Map<String, Object> runnable;

    /**
     * A JSON representation of the job as it will be run by the system. All the task declarations,
     * configurations and parameters are merged. Parameter values are all fully resolved.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getRunnable() {
        return runnable;
    }

    /** A list of JobOutput for the workflowJob. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    private final java.util.List<JobOutput> outputs;

    /**
     * A list of JobOutput for the workflowJob.
     *
     * @return the value
     */
    public java.util.List<JobOutput> getOutputs() {
        return outputs;
    }

    /** Time when the job started to execute. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Time when the job started to execute. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** Time when the job finished. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * Time when the job finished. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("MediaWorkflowJob(");
        sb.append("super=").append(super.toString());
        sb.append("mediaWorkflowConfigurationIds=")
                .append(String.valueOf(this.mediaWorkflowConfigurationIds));
        sb.append(", mediaWorkflowId=").append(String.valueOf(this.mediaWorkflowId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", taskLifecycleState=").append(String.valueOf(this.taskLifecycleState));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", runnable=").append(String.valueOf(this.runnable));
        sb.append(", outputs=").append(String.valueOf(this.outputs));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", locks=").append(String.valueOf(this.locks));
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
        if (!(o instanceof MediaWorkflowJob)) {
            return false;
        }

        MediaWorkflowJob other = (MediaWorkflowJob) o;
        return java.util.Objects.equals(
                        this.mediaWorkflowConfigurationIds, other.mediaWorkflowConfigurationIds)
                && java.util.Objects.equals(this.mediaWorkflowId, other.mediaWorkflowId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.taskLifecycleState, other.taskLifecycleState)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.runnable, other.runnable)
                && java.util.Objects.equals(this.outputs, other.outputs)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.locks, other.locks)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mediaWorkflowConfigurationIds == null
                                ? 43
                                : this.mediaWorkflowConfigurationIds.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaWorkflowId == null ? 43 : this.mediaWorkflowId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.taskLifecycleState == null
                                ? 43
                                : this.taskLifecycleState.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.runnable == null ? 43 : this.runnable.hashCode());
        result = (result * PRIME) + (this.outputs == null ? 43 : this.outputs.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
