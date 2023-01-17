/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The task lineage object provides information on the lineage information of a task after execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TaskRunLineageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TaskRunLineageDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "objectVersion",
        "taskName",
        "taskType",
        "taskKey",
        "isLineageGenCompleted",
        "taskExecutionStatus",
        "flow",
        "metadata"
    })
    public TaskRunLineageDetails(
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            String taskName,
            String taskType,
            String taskKey,
            Boolean isLineageGenCompleted,
            TaskExecutionStatus taskExecutionStatus,
            DataFlow flow,
            ObjectMetadata metadata) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.taskName = taskName;
        this.taskType = taskType;
        this.taskKey = taskKey;
        this.isLineageGenCompleted = isLineageGenCompleted;
        this.taskExecutionStatus = taskExecutionStatus;
        this.flow = flow;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The object key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The object key.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The object type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The object type.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * The object's model version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
         * @param modelVersion the value to set
         * @return this builder
         **/
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }
        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Detailed description for the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description for the object.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The version of the object that is used to track changes in the object instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * The version of the object that is used to track changes in the object instance.
         * @param objectVersion the value to set
         * @return this builder
         **/
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /**
         * Task name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskName")
        private String taskName;

        /**
         * Task name
         * @param taskName the value to set
         * @return this builder
         **/
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            this.__explicitlySet__.add("taskName");
            return this;
        }
        /**
         * Task name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private String taskType;

        /**
         * Task name
         * @param taskType the value to set
         * @return this builder
         **/
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }
        /**
         * The object key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
        private String taskKey;

        /**
         * The object key.
         * @param taskKey the value to set
         * @return this builder
         **/
        public Builder taskKey(String taskKey) {
            this.taskKey = taskKey;
            this.__explicitlySet__.add("taskKey");
            return this;
        }
        /**
         * This value is used to track if lineage generation for a task is completed or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLineageGenCompleted")
        private Boolean isLineageGenCompleted;

        /**
         * This value is used to track if lineage generation for a task is completed or not.
         * @param isLineageGenCompleted the value to set
         * @return this builder
         **/
        public Builder isLineageGenCompleted(Boolean isLineageGenCompleted) {
            this.isLineageGenCompleted = isLineageGenCompleted;
            this.__explicitlySet__.add("isLineageGenCompleted");
            return this;
        }
        /**
         * The status of the task run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskExecutionStatus")
        private TaskExecutionStatus taskExecutionStatus;

        /**
         * The status of the task run.
         * @param taskExecutionStatus the value to set
         * @return this builder
         **/
        public Builder taskExecutionStatus(TaskExecutionStatus taskExecutionStatus) {
            this.taskExecutionStatus = taskExecutionStatus;
            this.__explicitlySet__.add("taskExecutionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flow")
        private DataFlow flow;

        public Builder flow(DataFlow flow) {
            this.flow = flow;
            this.__explicitlySet__.add("flow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskRunLineageDetails build() {
            TaskRunLineageDetails model =
                    new TaskRunLineageDetails(
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.taskName,
                            this.taskType,
                            this.taskKey,
                            this.isLineageGenCompleted,
                            this.taskExecutionStatus,
                            this.flow,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskRunLineageDetails model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("taskName")) {
                this.taskName(model.getTaskName());
            }
            if (model.wasPropertyExplicitlySet("taskType")) {
                this.taskType(model.getTaskType());
            }
            if (model.wasPropertyExplicitlySet("taskKey")) {
                this.taskKey(model.getTaskKey());
            }
            if (model.wasPropertyExplicitlySet("isLineageGenCompleted")) {
                this.isLineageGenCompleted(model.getIsLineageGenCompleted());
            }
            if (model.wasPropertyExplicitlySet("taskExecutionStatus")) {
                this.taskExecutionStatus(model.getTaskExecutionStatus());
            }
            if (model.wasPropertyExplicitlySet("flow")) {
                this.flow(model.getFlow());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The object key.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The object type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The object type.
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Detailed description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description for the object.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     * @return the value
     **/
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * Task name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskName")
    private final String taskName;

    /**
     * Task name
     * @return the value
     **/
    public String getTaskName() {
        return taskName;
    }

    /**
     * Task name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    private final String taskType;

    /**
     * Task name
     * @return the value
     **/
    public String getTaskType() {
        return taskType;
    }

    /**
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
    private final String taskKey;

    /**
     * The object key.
     * @return the value
     **/
    public String getTaskKey() {
        return taskKey;
    }

    /**
     * This value is used to track if lineage generation for a task is completed or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLineageGenCompleted")
    private final Boolean isLineageGenCompleted;

    /**
     * This value is used to track if lineage generation for a task is completed or not.
     * @return the value
     **/
    public Boolean getIsLineageGenCompleted() {
        return isLineageGenCompleted;
    }

    /**
     * The status of the task run.
     **/
    public enum TaskExecutionStatus {
        Success("SUCCESS"),
        Error("ERROR"),
        Terminated("TERMINATED"),
        ;

        private final String value;
        private static java.util.Map<String, TaskExecutionStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (TaskExecutionStatus v : TaskExecutionStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        TaskExecutionStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TaskExecutionStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TaskExecutionStatus: " + key);
        }
    };
    /**
     * The status of the task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskExecutionStatus")
    private final TaskExecutionStatus taskExecutionStatus;

    /**
     * The status of the task run.
     * @return the value
     **/
    public TaskExecutionStatus getTaskExecutionStatus() {
        return taskExecutionStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("flow")
    private final DataFlow flow;

    public DataFlow getFlow() {
        return flow;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
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
        sb.append("TaskRunLineageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", taskName=").append(String.valueOf(this.taskName));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", taskKey=").append(String.valueOf(this.taskKey));
        sb.append(", isLineageGenCompleted=").append(String.valueOf(this.isLineageGenCompleted));
        sb.append(", taskExecutionStatus=").append(String.valueOf(this.taskExecutionStatus));
        sb.append(", flow=").append(String.valueOf(this.flow));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskRunLineageDetails)) {
            return false;
        }

        TaskRunLineageDetails other = (TaskRunLineageDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.taskName, other.taskName)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.taskKey, other.taskKey)
                && java.util.Objects.equals(this.isLineageGenCompleted, other.isLineageGenCompleted)
                && java.util.Objects.equals(this.taskExecutionStatus, other.taskExecutionStatus)
                && java.util.Objects.equals(this.flow, other.flow)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.taskName == null ? 43 : this.taskName.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result = (result * PRIME) + (this.taskKey == null ? 43 : this.taskKey.hashCode());
        result =
                (result * PRIME)
                        + (this.isLineageGenCompleted == null
                                ? 43
                                : this.isLineageGenCompleted.hashCode());
        result =
                (result * PRIME)
                        + (this.taskExecutionStatus == null
                                ? 43
                                : this.taskExecutionStatus.hashCode());
        result = (result * PRIME) + (this.flow == null ? 43 : this.flow.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
