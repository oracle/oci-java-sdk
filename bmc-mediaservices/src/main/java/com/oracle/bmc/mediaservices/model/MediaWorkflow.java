/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * Configurable workflows that define the series of tasks that will be used to process video files.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MediaWorkflow.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MediaWorkflow {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "tasks",
        "mediaWorkflowConfigurationIds",
        "parameters",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecyleDetails",
        "version",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MediaWorkflow(
            String id,
            String displayName,
            String compartmentId,
            java.util.List<MediaWorkflowTask> tasks,
            java.util.List<String> mediaWorkflowConfigurationIds,
            java.util.Map<String, String> parameters,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecyleDetails,
            Long version,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.tasks = tasks;
        this.mediaWorkflowConfigurationIds = mediaWorkflowConfigurationIds;
        this.parameters = parameters;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecyleDetails = lifecyleDetails;
        this.version = version;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Name of the Media Workflow. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the Media Workflow. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array is unique
         * within the array.  The order of the items is preserved from the order of the tasks array in
         * CreateMediaWorkflowDetails or UpdateMediaWorkflowDetails.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tasks")
        private java.util.List<MediaWorkflowTask> tasks;

        /**
         * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array is unique
         * within the array.  The order of the items is preserved from the order of the tasks array in
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
        /**
         * Configurations to be applied to all the runs of this workflow. Parameters in these configurations are
         * overridden by parameters in the MediaWorkflowConfigurations of the MediaWorkflowJob and the
         * parameters of the MediaWorkflowJob. If the same parameter appears in multiple configurations, the values that
         * appear in the configuration at the highest index will be used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowConfigurationIds")
        private java.util.List<String> mediaWorkflowConfigurationIds;

        /**
         * Configurations to be applied to all the runs of this workflow. Parameters in these configurations are
         * overridden by parameters in the MediaWorkflowConfigurations of the MediaWorkflowJob and the
         * parameters of the MediaWorkflowJob. If the same parameter appears in multiple configurations, the values that
         * appear in the configuration at the highest index will be used.
         *
         * @param mediaWorkflowConfigurationIds the value to set
         * @return this builder
         **/
        public Builder mediaWorkflowConfigurationIds(
                java.util.List<String> mediaWorkflowConfigurationIds) {
            this.mediaWorkflowConfigurationIds = mediaWorkflowConfigurationIds;
            this.__explicitlySet__.add("mediaWorkflowConfigurationIds");
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
         * The time when the MediaWorkflow was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the MediaWorkflow was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time when the MediaWorkflow was updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the MediaWorkflow was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the MediaWorkflow.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the MediaWorkflow.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
        private String lifecyleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecyleDetails the value to set
         * @return this builder
         **/
        public Builder lifecyleDetails(String lifecyleDetails) {
            this.lifecyleDetails = lifecyleDetails;
            this.__explicitlySet__.add("lifecyleDetails");
            return this;
        }
        /**
         * The version of the MediaWorkflow.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Long version;

        /**
         * The version of the MediaWorkflow.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(Long version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public MediaWorkflow build() {
            MediaWorkflow __instance__ =
                    new MediaWorkflow(
                            id,
                            displayName,
                            compartmentId,
                            tasks,
                            mediaWorkflowConfigurationIds,
                            parameters,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecyleDetails,
                            version,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MediaWorkflow o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .tasks(o.getTasks())
                            .mediaWorkflowConfigurationIds(o.getMediaWorkflowConfigurationIds())
                            .parameters(o.getParameters())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecyleDetails(o.getLifecyleDetails())
                            .version(o.getVersion())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * Unique identifier that is immutable on creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Name of the Media Workflow. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the Media Workflow. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array is unique
     * within the array.  The order of the items is preserved from the order of the tasks array in
     * CreateMediaWorkflowDetails or UpdateMediaWorkflowDetails.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tasks")
    private final java.util.List<MediaWorkflowTask> tasks;

    /**
     * The processing to be done in this workflow. Each key of the MediaWorkflowTasks in this array is unique
     * within the array.  The order of the items is preserved from the order of the tasks array in
     * CreateMediaWorkflowDetails or UpdateMediaWorkflowDetails.
     *
     * @return the value
     **/
    public java.util.List<MediaWorkflowTask> getTasks() {
        return tasks;
    }

    /**
     * Configurations to be applied to all the runs of this workflow. Parameters in these configurations are
     * overridden by parameters in the MediaWorkflowConfigurations of the MediaWorkflowJob and the
     * parameters of the MediaWorkflowJob. If the same parameter appears in multiple configurations, the values that
     * appear in the configuration at the highest index will be used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowConfigurationIds")
    private final java.util.List<String> mediaWorkflowConfigurationIds;

    /**
     * Configurations to be applied to all the runs of this workflow. Parameters in these configurations are
     * overridden by parameters in the MediaWorkflowConfigurations of the MediaWorkflowJob and the
     * parameters of the MediaWorkflowJob. If the same parameter appears in multiple configurations, the values that
     * appear in the configuration at the highest index will be used.
     *
     * @return the value
     **/
    public java.util.List<String> getMediaWorkflowConfigurationIds() {
        return mediaWorkflowConfigurationIds;
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
     * The time when the MediaWorkflow was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the MediaWorkflow was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time when the MediaWorkflow was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the MediaWorkflow was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the MediaWorkflow.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        NeedsAttention("NEEDS_ATTENTION"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The current state of the MediaWorkflow.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the MediaWorkflow.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecyleDetails")
    private final String lifecyleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecyleDetails() {
        return lifecyleDetails;
    }

    /**
     * The version of the MediaWorkflow.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Long version;

    /**
     * The version of the MediaWorkflow.
     * @return the value
     **/
    public Long getVersion() {
        return version;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("MediaWorkflow(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", tasks=").append(String.valueOf(this.tasks));
        sb.append(", mediaWorkflowConfigurationIds=")
                .append(String.valueOf(this.mediaWorkflowConfigurationIds));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecyleDetails=").append(String.valueOf(this.lifecyleDetails));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaWorkflow)) {
            return false;
        }

        MediaWorkflow other = (MediaWorkflow) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.tasks, other.tasks)
                && java.util.Objects.equals(
                        this.mediaWorkflowConfigurationIds, other.mediaWorkflowConfigurationIds)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecyleDetails, other.lifecyleDetails)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result = (result * PRIME) + (this.tasks == null ? 43 : this.tasks.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaWorkflowConfigurationIds == null
                                ? 43
                                : this.mediaWorkflowConfigurationIds.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecyleDetails == null ? 43 : this.lifecyleDetails.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
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
