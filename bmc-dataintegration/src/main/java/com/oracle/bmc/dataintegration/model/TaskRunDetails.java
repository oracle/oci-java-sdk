/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The task run object provides information on the execution of a task. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaskRunDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TaskRunDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "objectVersion",
        "status",
        "startTimeMillis",
        "endTimeMillis",
        "lastUpdated",
        "recordsWritten",
        "bytesProcessed",
        "objectStatus",
        "taskType",
        "identifier",
        "refTaskRunId",
        "reRunType",
        "stepId",
        "inputs",
        "metadata"
    })
    public TaskRunDetails(
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Status status,
            Long startTimeMillis,
            Long endTimeMillis,
            Long lastUpdated,
            Long recordsWritten,
            Long bytesProcessed,
            Integer objectStatus,
            TaskType taskType,
            String identifier,
            String refTaskRunId,
            ReRunType reRunType,
            String stepId,
            java.util.Map<String, ParameterValue> inputs,
            ObjectMetadata metadata) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.status = status;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.lastUpdated = lastUpdated;
        this.recordsWritten = recordsWritten;
        this.bytesProcessed = bytesProcessed;
        this.objectStatus = objectStatus;
        this.taskType = taskType;
        this.identifier = identifier;
        this.refTaskRunId = refTaskRunId;
        this.reRunType = reRunType;
        this.stepId = stepId;
        this.inputs = inputs;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The object key. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The object key.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The object type. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The object type.
         *
         * @param modelType the value to set
         * @return this builder
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /** The object's model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
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
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Detailed description for the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description for the object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The version of the object that is used to track changes in the object instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * The version of the object that is used to track changes in the object instance.
         *
         * @param objectVersion the value to set
         * @return this builder
         */
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /** status */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * status
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The task run start time. */
        @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
        private Long startTimeMillis;

        /**
         * The task run start time.
         *
         * @param startTimeMillis the value to set
         * @return this builder
         */
        public Builder startTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            this.__explicitlySet__.add("startTimeMillis");
            return this;
        }
        /** The task run end time. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
        private Long endTimeMillis;

        /**
         * The task run end time.
         *
         * @param endTimeMillis the value to set
         * @return this builder
         */
        public Builder endTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            this.__explicitlySet__.add("endTimeMillis");
            return this;
        }
        /** The date and time the task run was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
        private Long lastUpdated;

        /**
         * The date and time the task run was last updated.
         *
         * @param lastUpdated the value to set
         * @return this builder
         */
        public Builder lastUpdated(Long lastUpdated) {
            this.lastUpdated = lastUpdated;
            this.__explicitlySet__.add("lastUpdated");
            return this;
        }
        /** Number of records processed in task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("recordsWritten")
        private Long recordsWritten;

        /**
         * Number of records processed in task run.
         *
         * @param recordsWritten the value to set
         * @return this builder
         */
        public Builder recordsWritten(Long recordsWritten) {
            this.recordsWritten = recordsWritten;
            this.__explicitlySet__.add("recordsWritten");
            return this;
        }
        /** Number of bytes processed in task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("bytesProcessed")
        private Long bytesProcessed;

        /**
         * Number of bytes processed in task run.
         *
         * @param bytesProcessed the value to set
         * @return this builder
         */
        public Builder bytesProcessed(Long bytesProcessed) {
            this.bytesProcessed = bytesProcessed;
            this.__explicitlySet__.add("bytesProcessed");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         *
         * @param objectStatus the value to set
         * @return this builder
         */
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }
        /** The type of the task for the run. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        /**
         * The type of the task for the run.
         *
         * @param taskType the value to set
         * @return this builder
         */
        public Builder taskType(TaskType taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** Reference Task Run Id to be used for re-run */
        @com.fasterxml.jackson.annotation.JsonProperty("refTaskRunId")
        private String refTaskRunId;

        /**
         * Reference Task Run Id to be used for re-run
         *
         * @param refTaskRunId the value to set
         * @return this builder
         */
        public Builder refTaskRunId(String refTaskRunId) {
            this.refTaskRunId = refTaskRunId;
            this.__explicitlySet__.add("refTaskRunId");
            return this;
        }
        /** Supported re-run types */
        @com.fasterxml.jackson.annotation.JsonProperty("reRunType")
        private ReRunType reRunType;

        /**
         * Supported re-run types
         *
         * @param reRunType the value to set
         * @return this builder
         */
        public Builder reRunType(ReRunType reRunType) {
            this.reRunType = reRunType;
            this.__explicitlySet__.add("reRunType");
            return this;
        }
        /** Step Id for running from a certain step. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepId")
        private String stepId;

        /**
         * Step Id for running from a certain step.
         *
         * @param stepId the value to set
         * @return this builder
         */
        public Builder stepId(String stepId) {
            this.stepId = stepId;
            this.__explicitlySet__.add("stepId");
            return this;
        }
        /** A map of the configuration provider input bindings of the run. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputs")
        private java.util.Map<String, ParameterValue> inputs;

        /**
         * A map of the configuration provider input bindings of the run.
         *
         * @param inputs the value to set
         * @return this builder
         */
        public Builder inputs(java.util.Map<String, ParameterValue> inputs) {
            this.inputs = inputs;
            this.__explicitlySet__.add("inputs");
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

        public TaskRunDetails build() {
            TaskRunDetails model =
                    new TaskRunDetails(
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.status,
                            this.startTimeMillis,
                            this.endTimeMillis,
                            this.lastUpdated,
                            this.recordsWritten,
                            this.bytesProcessed,
                            this.objectStatus,
                            this.taskType,
                            this.identifier,
                            this.refTaskRunId,
                            this.reRunType,
                            this.stepId,
                            this.inputs,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskRunDetails model) {
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
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("startTimeMillis")) {
                this.startTimeMillis(model.getStartTimeMillis());
            }
            if (model.wasPropertyExplicitlySet("endTimeMillis")) {
                this.endTimeMillis(model.getEndTimeMillis());
            }
            if (model.wasPropertyExplicitlySet("lastUpdated")) {
                this.lastUpdated(model.getLastUpdated());
            }
            if (model.wasPropertyExplicitlySet("recordsWritten")) {
                this.recordsWritten(model.getRecordsWritten());
            }
            if (model.wasPropertyExplicitlySet("bytesProcessed")) {
                this.bytesProcessed(model.getBytesProcessed());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("taskType")) {
                this.taskType(model.getTaskType());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("refTaskRunId")) {
                this.refTaskRunId(model.getRefTaskRunId());
            }
            if (model.wasPropertyExplicitlySet("reRunType")) {
                this.reRunType(model.getReRunType());
            }
            if (model.wasPropertyExplicitlySet("stepId")) {
                this.stepId(model.getStepId());
            }
            if (model.wasPropertyExplicitlySet("inputs")) {
                this.inputs(model.getInputs());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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

    /** The object key. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The object key.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The object type. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The object type.
     *
     * @return the value
     */
    public String getModelType() {
        return modelType;
    }

    /** The object's model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Detailed description for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description for the object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The version of the object that is used to track changes in the object instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     *
     * @return the value
     */
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /** status */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        NotStarted("NOT_STARTED"),
        Queued("QUEUED"),
        Running("RUNNING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Success("SUCCESS"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** status */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * status
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The task run start time. */
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
    private final Long startTimeMillis;

    /**
     * The task run start time.
     *
     * @return the value
     */
    public Long getStartTimeMillis() {
        return startTimeMillis;
    }

    /** The task run end time. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
    private final Long endTimeMillis;

    /**
     * The task run end time.
     *
     * @return the value
     */
    public Long getEndTimeMillis() {
        return endTimeMillis;
    }

    /** The date and time the task run was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
    private final Long lastUpdated;

    /**
     * The date and time the task run was last updated.
     *
     * @return the value
     */
    public Long getLastUpdated() {
        return lastUpdated;
    }

    /** Number of records processed in task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("recordsWritten")
    private final Long recordsWritten;

    /**
     * Number of records processed in task run.
     *
     * @return the value
     */
    public Long getRecordsWritten() {
        return recordsWritten;
    }

    /** Number of bytes processed in task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("bytesProcessed")
    private final Long bytesProcessed;

    /**
     * Number of bytes processed in task run.
     *
     * @return the value
     */
    public Long getBytesProcessed() {
        return bytesProcessed;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     *
     * @return the value
     */
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /** The type of the task for the run. */
    public enum TaskType implements com.oracle.bmc.http.internal.BmcEnum {
        IntegrationTask("INTEGRATION_TASK"),
        DataLoaderTask("DATA_LOADER_TASK"),
        PipelineTask("PIPELINE_TASK"),
        SqlTask("SQL_TASK"),
        OciDataflowTask("OCI_DATAFLOW_TASK"),
        RestTask("REST_TASK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TaskType.class);

        private final String value;
        private static java.util.Map<String, TaskType> map;

        static {
            map = new java.util.HashMap<>();
            for (TaskType v : TaskType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TaskType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TaskType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TaskType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of the task for the run. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    private final TaskType taskType;

    /**
     * The type of the task for the run.
     *
     * @return the value
     */
    public TaskType getTaskType() {
        return taskType;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** Reference Task Run Id to be used for re-run */
    @com.fasterxml.jackson.annotation.JsonProperty("refTaskRunId")
    private final String refTaskRunId;

    /**
     * Reference Task Run Id to be used for re-run
     *
     * @return the value
     */
    public String getRefTaskRunId() {
        return refTaskRunId;
    }

    /** Supported re-run types */
    public enum ReRunType implements com.oracle.bmc.http.internal.BmcEnum {
        Beginning("BEGINNING"),
        Failed("FAILED"),
        Step("STEP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReRunType.class);

        private final String value;
        private static java.util.Map<String, ReRunType> map;

        static {
            map = new java.util.HashMap<>();
            for (ReRunType v : ReRunType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReRunType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReRunType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReRunType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Supported re-run types */
    @com.fasterxml.jackson.annotation.JsonProperty("reRunType")
    private final ReRunType reRunType;

    /**
     * Supported re-run types
     *
     * @return the value
     */
    public ReRunType getReRunType() {
        return reRunType;
    }

    /** Step Id for running from a certain step. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepId")
    private final String stepId;

    /**
     * Step Id for running from a certain step.
     *
     * @return the value
     */
    public String getStepId() {
        return stepId;
    }

    /** A map of the configuration provider input bindings of the run. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputs")
    private final java.util.Map<String, ParameterValue> inputs;

    /**
     * A map of the configuration provider input bindings of the run.
     *
     * @return the value
     */
    public java.util.Map<String, ParameterValue> getInputs() {
        return inputs;
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TaskRunDetails(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", startTimeMillis=").append(String.valueOf(this.startTimeMillis));
        sb.append(", endTimeMillis=").append(String.valueOf(this.endTimeMillis));
        sb.append(", lastUpdated=").append(String.valueOf(this.lastUpdated));
        sb.append(", recordsWritten=").append(String.valueOf(this.recordsWritten));
        sb.append(", bytesProcessed=").append(String.valueOf(this.bytesProcessed));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", refTaskRunId=").append(String.valueOf(this.refTaskRunId));
        sb.append(", reRunType=").append(String.valueOf(this.reRunType));
        sb.append(", stepId=").append(String.valueOf(this.stepId));
        sb.append(", inputs=").append(String.valueOf(this.inputs));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskRunDetails)) {
            return false;
        }

        TaskRunDetails other = (TaskRunDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.startTimeMillis, other.startTimeMillis)
                && java.util.Objects.equals(this.endTimeMillis, other.endTimeMillis)
                && java.util.Objects.equals(this.lastUpdated, other.lastUpdated)
                && java.util.Objects.equals(this.recordsWritten, other.recordsWritten)
                && java.util.Objects.equals(this.bytesProcessed, other.bytesProcessed)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.refTaskRunId, other.refTaskRunId)
                && java.util.Objects.equals(this.reRunType, other.reRunType)
                && java.util.Objects.equals(this.stepId, other.stepId)
                && java.util.Objects.equals(this.inputs, other.inputs)
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
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeMillis == null ? 43 : this.startTimeMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.endTimeMillis == null ? 43 : this.endTimeMillis.hashCode());
        result = (result * PRIME) + (this.lastUpdated == null ? 43 : this.lastUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.recordsWritten == null ? 43 : this.recordsWritten.hashCode());
        result =
                (result * PRIME)
                        + (this.bytesProcessed == null ? 43 : this.bytesProcessed.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.refTaskRunId == null ? 43 : this.refTaskRunId.hashCode());
        result = (result * PRIME) + (this.reRunType == null ? 43 : this.reRunType.hashCode());
        result = (result * PRIME) + (this.stepId == null ? 43 : this.stepId.hashCode());
        result = (result * PRIME) + (this.inputs == null ? 43 : this.inputs.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
