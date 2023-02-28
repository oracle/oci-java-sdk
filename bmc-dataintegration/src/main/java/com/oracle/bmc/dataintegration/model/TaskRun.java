/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about a task run. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaskRun.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TaskRun extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "objectVersion",
        "configProvider",
        "status",
        "startTimeMillis",
        "endTimeMillis",
        "lastUpdated",
        "recordsWritten",
        "bytesProcessed",
        "errorMessage",
        "expectedDuration",
        "expectedDurationUnit",
        "taskKey",
        "externalId",
        "retryAttempt",
        "taskSchedule",
        "metrics",
        "outputs",
        "executionErrors",
        "terminationErrors",
        "authMode",
        "opcRequestId",
        "objectStatus",
        "taskType",
        "isLogProcessingInProgress",
        "identifier",
        "metadata",
        "keyMap"
    })
    public TaskRun(
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            ConfigProvider configProvider,
            Status status,
            Long startTimeMillis,
            Long endTimeMillis,
            Long lastUpdated,
            Long recordsWritten,
            Long bytesProcessed,
            String errorMessage,
            Double expectedDuration,
            ExpectedDurationUnit expectedDurationUnit,
            String taskKey,
            String externalId,
            Integer retryAttempt,
            TaskSchedule taskSchedule,
            java.util.Map<String, Float> metrics,
            java.util.Map<String, ParameterValue> outputs,
            java.util.List<String> executionErrors,
            java.util.List<String> terminationErrors,
            AuthMode authMode,
            String opcRequestId,
            Integer objectStatus,
            TaskType taskType,
            Boolean isLogProcessingInProgress,
            String identifier,
            ObjectMetadata metadata,
            java.util.Map<String, String> keyMap) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.configProvider = configProvider;
        this.status = status;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.lastUpdated = lastUpdated;
        this.recordsWritten = recordsWritten;
        this.bytesProcessed = bytesProcessed;
        this.errorMessage = errorMessage;
        this.expectedDuration = expectedDuration;
        this.expectedDurationUnit = expectedDurationUnit;
        this.taskKey = taskKey;
        this.externalId = externalId;
        this.retryAttempt = retryAttempt;
        this.taskSchedule = taskSchedule;
        this.metrics = metrics;
        this.outputs = outputs;
        this.executionErrors = executionErrors;
        this.terminationErrors = terminationErrors;
        this.authMode = authMode;
        this.opcRequestId = opcRequestId;
        this.objectStatus = objectStatus;
        this.taskType = taskType;
        this.isLogProcessingInProgress = isLogProcessingInProgress;
        this.identifier = identifier;
        this.metadata = metadata;
        this.keyMap = keyMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The key of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key of the object.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The type of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the object.
         *
         * @param modelType the value to set
         * @return this builder
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /** The model version of an object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
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

        @com.fasterxml.jackson.annotation.JsonProperty("configProvider")
        private ConfigProvider configProvider;

        public Builder configProvider(ConfigProvider configProvider) {
            this.configProvider = configProvider;
            this.__explicitlySet__.add("configProvider");
            return this;
        }
        /** The status of the task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the task run.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The start time. */
        @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
        private Long startTimeMillis;

        /**
         * The start time.
         *
         * @param startTimeMillis the value to set
         * @return this builder
         */
        public Builder startTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            this.__explicitlySet__.add("startTimeMillis");
            return this;
        }
        /** The end time. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
        private Long endTimeMillis;

        /**
         * The end time.
         *
         * @param endTimeMillis the value to set
         * @return this builder
         */
        public Builder endTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            this.__explicitlySet__.add("endTimeMillis");
            return this;
        }
        /** The date and time the object was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
        private Long lastUpdated;

        /**
         * The date and time the object was last updated.
         *
         * @param lastUpdated the value to set
         * @return this builder
         */
        public Builder lastUpdated(Long lastUpdated) {
            this.lastUpdated = lastUpdated;
            this.__explicitlySet__.add("lastUpdated");
            return this;
        }
        /** The number of records processed in the task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("recordsWritten")
        private Long recordsWritten;

        /**
         * The number of records processed in the task run.
         *
         * @param recordsWritten the value to set
         * @return this builder
         */
        public Builder recordsWritten(Long recordsWritten) {
            this.recordsWritten = recordsWritten;
            this.__explicitlySet__.add("recordsWritten");
            return this;
        }
        /** The number of bytes processed in the task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("bytesProcessed")
        private Long bytesProcessed;

        /**
         * The number of bytes processed in the task run.
         *
         * @param bytesProcessed the value to set
         * @return this builder
         */
        public Builder bytesProcessed(Long bytesProcessed) {
            this.bytesProcessed = bytesProcessed;
            this.__explicitlySet__.add("bytesProcessed");
            return this;
        }
        /** Contains an error message if status is {@code ERROR}. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Contains an error message if status is {@code ERROR}.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /** The expected duration for the task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedDuration")
        private Double expectedDuration;

        /**
         * The expected duration for the task run.
         *
         * @param expectedDuration the value to set
         * @return this builder
         */
        public Builder expectedDuration(Double expectedDuration) {
            this.expectedDuration = expectedDuration;
            this.__explicitlySet__.add("expectedDuration");
            return this;
        }
        /** The expected duration unit of measure. */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedDurationUnit")
        private ExpectedDurationUnit expectedDurationUnit;

        /**
         * The expected duration unit of measure.
         *
         * @param expectedDurationUnit the value to set
         * @return this builder
         */
        public Builder expectedDurationUnit(ExpectedDurationUnit expectedDurationUnit) {
            this.expectedDurationUnit = expectedDurationUnit;
            this.__explicitlySet__.add("expectedDurationUnit");
            return this;
        }
        /**
         * Task Key of the task for which TaskRun is being created. If not specified, the
         * AggregatorKey in RegistryMetadata will be assumed to be the TaskKey
         */
        @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
        private String taskKey;

        /**
         * Task Key of the task for which TaskRun is being created. If not specified, the
         * AggregatorKey in RegistryMetadata will be assumed to be the TaskKey
         *
         * @param taskKey the value to set
         * @return this builder
         */
        public Builder taskKey(String taskKey) {
            this.taskKey = taskKey;
            this.__explicitlySet__.add("taskKey");
            return this;
        }
        /** The external identifier for the task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * The external identifier for the task run.
         *
         * @param externalId the value to set
         * @return this builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }
        /** Holds the particular attempt number. */
        @com.fasterxml.jackson.annotation.JsonProperty("retryAttempt")
        private Integer retryAttempt;

        /**
         * Holds the particular attempt number.
         *
         * @param retryAttempt the value to set
         * @return this builder
         */
        public Builder retryAttempt(Integer retryAttempt) {
            this.retryAttempt = retryAttempt;
            this.__explicitlySet__.add("retryAttempt");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskSchedule")
        private TaskSchedule taskSchedule;

        public Builder taskSchedule(TaskSchedule taskSchedule) {
            this.taskSchedule = taskSchedule;
            this.__explicitlySet__.add("taskSchedule");
            return this;
        }
        /** A map of metrics for the run. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.Map<String, Float> metrics;

        /**
         * A map of metrics for the run.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.Map<String, Float> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /** A map of the outputs of the run. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputs")
        private java.util.Map<String, ParameterValue> outputs;

        /**
         * A map of the outputs of the run.
         *
         * @param outputs the value to set
         * @return this builder
         */
        public Builder outputs(java.util.Map<String, ParameterValue> outputs) {
            this.outputs = outputs;
            this.__explicitlySet__.add("outputs");
            return this;
        }
        /** An array of execution errors from the run. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionErrors")
        private java.util.List<String> executionErrors;

        /**
         * An array of execution errors from the run.
         *
         * @param executionErrors the value to set
         * @return this builder
         */
        public Builder executionErrors(java.util.List<String> executionErrors) {
            this.executionErrors = executionErrors;
            this.__explicitlySet__.add("executionErrors");
            return this;
        }
        /** An array of termination errors from the run. */
        @com.fasterxml.jackson.annotation.JsonProperty("terminationErrors")
        private java.util.List<String> terminationErrors;

        /**
         * An array of termination errors from the run.
         *
         * @param terminationErrors the value to set
         * @return this builder
         */
        public Builder terminationErrors(java.util.List<String> terminationErrors) {
            this.terminationErrors = terminationErrors;
            this.__explicitlySet__.add("terminationErrors");
            return this;
        }
        /** The autorization mode for when the task was executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("authMode")
        private AuthMode authMode;

        /**
         * The autorization mode for when the task was executed.
         *
         * @param authMode the value to set
         * @return this builder
         */
        public Builder authMode(AuthMode authMode) {
            this.authMode = authMode;
            this.__explicitlySet__.add("authMode");
            return this;
        }
        /** The OPC request ID of execution of the task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
        private String opcRequestId;

        /**
         * The OPC request ID of execution of the task run.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            this.__explicitlySet__.add("opcRequestId");
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
        /** The type of task run. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        /**
         * The type of task run.
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
         * This field tells the user if there is any logs being fetched in backend for failure.
         * Applicable only for failed pipeline tasks.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isLogProcessingInProgress")
        private Boolean isLogProcessingInProgress;

        /**
         * This field tells the user if there is any logs being fetched in backend for failure.
         * Applicable only for failed pipeline tasks.
         *
         * @param isLogProcessingInProgress the value to set
         * @return this builder
         */
        public Builder isLogProcessingInProgress(Boolean isLogProcessingInProgress) {
            this.isLogProcessingInProgress = isLogProcessingInProgress;
            this.__explicitlySet__.add("isLogProcessingInProgress");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore and numbers. It should begin with
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

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * A key map. If provided, key is replaced with generated key. This structure provides
         * mapping between user provided key and generated key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
        private java.util.Map<String, String> keyMap;

        /**
         * A key map. If provided, key is replaced with generated key. This structure provides
         * mapping between user provided key and generated key.
         *
         * @param keyMap the value to set
         * @return this builder
         */
        public Builder keyMap(java.util.Map<String, String> keyMap) {
            this.keyMap = keyMap;
            this.__explicitlySet__.add("keyMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskRun build() {
            TaskRun model =
                    new TaskRun(
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.configProvider,
                            this.status,
                            this.startTimeMillis,
                            this.endTimeMillis,
                            this.lastUpdated,
                            this.recordsWritten,
                            this.bytesProcessed,
                            this.errorMessage,
                            this.expectedDuration,
                            this.expectedDurationUnit,
                            this.taskKey,
                            this.externalId,
                            this.retryAttempt,
                            this.taskSchedule,
                            this.metrics,
                            this.outputs,
                            this.executionErrors,
                            this.terminationErrors,
                            this.authMode,
                            this.opcRequestId,
                            this.objectStatus,
                            this.taskType,
                            this.isLogProcessingInProgress,
                            this.identifier,
                            this.metadata,
                            this.keyMap);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskRun model) {
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
            if (model.wasPropertyExplicitlySet("configProvider")) {
                this.configProvider(model.getConfigProvider());
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
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("expectedDuration")) {
                this.expectedDuration(model.getExpectedDuration());
            }
            if (model.wasPropertyExplicitlySet("expectedDurationUnit")) {
                this.expectedDurationUnit(model.getExpectedDurationUnit());
            }
            if (model.wasPropertyExplicitlySet("taskKey")) {
                this.taskKey(model.getTaskKey());
            }
            if (model.wasPropertyExplicitlySet("externalId")) {
                this.externalId(model.getExternalId());
            }
            if (model.wasPropertyExplicitlySet("retryAttempt")) {
                this.retryAttempt(model.getRetryAttempt());
            }
            if (model.wasPropertyExplicitlySet("taskSchedule")) {
                this.taskSchedule(model.getTaskSchedule());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            if (model.wasPropertyExplicitlySet("outputs")) {
                this.outputs(model.getOutputs());
            }
            if (model.wasPropertyExplicitlySet("executionErrors")) {
                this.executionErrors(model.getExecutionErrors());
            }
            if (model.wasPropertyExplicitlySet("terminationErrors")) {
                this.terminationErrors(model.getTerminationErrors());
            }
            if (model.wasPropertyExplicitlySet("authMode")) {
                this.authMode(model.getAuthMode());
            }
            if (model.wasPropertyExplicitlySet("opcRequestId")) {
                this.opcRequestId(model.getOpcRequestId());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("taskType")) {
                this.taskType(model.getTaskType());
            }
            if (model.wasPropertyExplicitlySet("isLogProcessingInProgress")) {
                this.isLogProcessingInProgress(model.getIsLogProcessingInProgress());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("keyMap")) {
                this.keyMap(model.getKeyMap());
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

    /** The key of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the object.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The type of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the object.
     *
     * @return the value
     */
    public String getModelType() {
        return modelType;
    }

    /** The model version of an object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
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

    @com.fasterxml.jackson.annotation.JsonProperty("configProvider")
    private final ConfigProvider configProvider;

    public ConfigProvider getConfigProvider() {
        return configProvider;
    }

    /** The status of the task run. */
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
    /** The status of the task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the task run.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** The start time. */
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
    private final Long startTimeMillis;

    /**
     * The start time.
     *
     * @return the value
     */
    public Long getStartTimeMillis() {
        return startTimeMillis;
    }

    /** The end time. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
    private final Long endTimeMillis;

    /**
     * The end time.
     *
     * @return the value
     */
    public Long getEndTimeMillis() {
        return endTimeMillis;
    }

    /** The date and time the object was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
    private final Long lastUpdated;

    /**
     * The date and time the object was last updated.
     *
     * @return the value
     */
    public Long getLastUpdated() {
        return lastUpdated;
    }

    /** The number of records processed in the task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("recordsWritten")
    private final Long recordsWritten;

    /**
     * The number of records processed in the task run.
     *
     * @return the value
     */
    public Long getRecordsWritten() {
        return recordsWritten;
    }

    /** The number of bytes processed in the task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("bytesProcessed")
    private final Long bytesProcessed;

    /**
     * The number of bytes processed in the task run.
     *
     * @return the value
     */
    public Long getBytesProcessed() {
        return bytesProcessed;
    }

    /** Contains an error message if status is {@code ERROR}. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Contains an error message if status is {@code ERROR}.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /** The expected duration for the task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedDuration")
    private final Double expectedDuration;

    /**
     * The expected duration for the task run.
     *
     * @return the value
     */
    public Double getExpectedDuration() {
        return expectedDuration;
    }

    /** The expected duration unit of measure. */
    public enum ExpectedDurationUnit implements com.oracle.bmc.http.internal.BmcEnum {
        Seconds("SECONDS"),
        Minutes("MINUTES"),
        Hours("HOURS"),
        Days("DAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExpectedDurationUnit.class);

        private final String value;
        private static java.util.Map<String, ExpectedDurationUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (ExpectedDurationUnit v : ExpectedDurationUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExpectedDurationUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExpectedDurationUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExpectedDurationUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The expected duration unit of measure. */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedDurationUnit")
    private final ExpectedDurationUnit expectedDurationUnit;

    /**
     * The expected duration unit of measure.
     *
     * @return the value
     */
    public ExpectedDurationUnit getExpectedDurationUnit() {
        return expectedDurationUnit;
    }

    /**
     * Task Key of the task for which TaskRun is being created. If not specified, the AggregatorKey
     * in RegistryMetadata will be assumed to be the TaskKey
     */
    @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
    private final String taskKey;

    /**
     * Task Key of the task for which TaskRun is being created. If not specified, the AggregatorKey
     * in RegistryMetadata will be assumed to be the TaskKey
     *
     * @return the value
     */
    public String getTaskKey() {
        return taskKey;
    }

    /** The external identifier for the task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * The external identifier for the task run.
     *
     * @return the value
     */
    public String getExternalId() {
        return externalId;
    }

    /** Holds the particular attempt number. */
    @com.fasterxml.jackson.annotation.JsonProperty("retryAttempt")
    private final Integer retryAttempt;

    /**
     * Holds the particular attempt number.
     *
     * @return the value
     */
    public Integer getRetryAttempt() {
        return retryAttempt;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("taskSchedule")
    private final TaskSchedule taskSchedule;

    public TaskSchedule getTaskSchedule() {
        return taskSchedule;
    }

    /** A map of metrics for the run. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.Map<String, Float> metrics;

    /**
     * A map of metrics for the run.
     *
     * @return the value
     */
    public java.util.Map<String, Float> getMetrics() {
        return metrics;
    }

    /** A map of the outputs of the run. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    private final java.util.Map<String, ParameterValue> outputs;

    /**
     * A map of the outputs of the run.
     *
     * @return the value
     */
    public java.util.Map<String, ParameterValue> getOutputs() {
        return outputs;
    }

    /** An array of execution errors from the run. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionErrors")
    private final java.util.List<String> executionErrors;

    /**
     * An array of execution errors from the run.
     *
     * @return the value
     */
    public java.util.List<String> getExecutionErrors() {
        return executionErrors;
    }

    /** An array of termination errors from the run. */
    @com.fasterxml.jackson.annotation.JsonProperty("terminationErrors")
    private final java.util.List<String> terminationErrors;

    /**
     * An array of termination errors from the run.
     *
     * @return the value
     */
    public java.util.List<String> getTerminationErrors() {
        return terminationErrors;
    }

    /** The autorization mode for when the task was executed. */
    public enum AuthMode implements com.oracle.bmc.http.internal.BmcEnum {
        Obo("OBO"),
        ResourcePrincipal("RESOURCE_PRINCIPAL"),
        UserCertificate("USER_CERTIFICATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthMode.class);

        private final String value;
        private static java.util.Map<String, AuthMode> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthMode v : AuthMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The autorization mode for when the task was executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("authMode")
    private final AuthMode authMode;

    /**
     * The autorization mode for when the task was executed.
     *
     * @return the value
     */
    public AuthMode getAuthMode() {
        return authMode;
    }

    /** The OPC request ID of execution of the task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    private final String opcRequestId;

    /**
     * The OPC request ID of execution of the task run.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /** The type of task run. */
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
    /** The type of task run. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    private final TaskType taskType;

    /**
     * The type of task run.
     *
     * @return the value
     */
    public TaskType getTaskType() {
        return taskType;
    }

    /**
     * This field tells the user if there is any logs being fetched in backend for failure.
     * Applicable only for failed pipeline tasks.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isLogProcessingInProgress")
    private final Boolean isLogProcessingInProgress;

    /**
     * This field tells the user if there is any logs being fetched in backend for failure.
     * Applicable only for failed pipeline tasks.
     *
     * @return the value
     */
    public Boolean getIsLogProcessingInProgress() {
        return isLogProcessingInProgress;
    }

    /**
     * Value can only contain upper case letters, underscore and numbers. It should begin with upper
     * case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore and numbers. It should begin with upper
     * case letter or underscore. The value can be modified.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping
     * between user provided key and generated key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
    private final java.util.Map<String, String> keyMap;

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping
     * between user provided key and generated key.
     *
     * @return the value
     */
    public java.util.Map<String, String> getKeyMap() {
        return keyMap;
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
        sb.append("TaskRun(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", configProvider=").append(String.valueOf(this.configProvider));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", startTimeMillis=").append(String.valueOf(this.startTimeMillis));
        sb.append(", endTimeMillis=").append(String.valueOf(this.endTimeMillis));
        sb.append(", lastUpdated=").append(String.valueOf(this.lastUpdated));
        sb.append(", recordsWritten=").append(String.valueOf(this.recordsWritten));
        sb.append(", bytesProcessed=").append(String.valueOf(this.bytesProcessed));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", expectedDuration=").append(String.valueOf(this.expectedDuration));
        sb.append(", expectedDurationUnit=").append(String.valueOf(this.expectedDurationUnit));
        sb.append(", taskKey=").append(String.valueOf(this.taskKey));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(", retryAttempt=").append(String.valueOf(this.retryAttempt));
        sb.append(", taskSchedule=").append(String.valueOf(this.taskSchedule));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", outputs=").append(String.valueOf(this.outputs));
        sb.append(", executionErrors=").append(String.valueOf(this.executionErrors));
        sb.append(", terminationErrors=").append(String.valueOf(this.terminationErrors));
        sb.append(", authMode=").append(String.valueOf(this.authMode));
        sb.append(", opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", isLogProcessingInProgress=")
                .append(String.valueOf(this.isLogProcessingInProgress));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", keyMap=").append(String.valueOf(this.keyMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskRun)) {
            return false;
        }

        TaskRun other = (TaskRun) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.configProvider, other.configProvider)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.startTimeMillis, other.startTimeMillis)
                && java.util.Objects.equals(this.endTimeMillis, other.endTimeMillis)
                && java.util.Objects.equals(this.lastUpdated, other.lastUpdated)
                && java.util.Objects.equals(this.recordsWritten, other.recordsWritten)
                && java.util.Objects.equals(this.bytesProcessed, other.bytesProcessed)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.expectedDuration, other.expectedDuration)
                && java.util.Objects.equals(this.expectedDurationUnit, other.expectedDurationUnit)
                && java.util.Objects.equals(this.taskKey, other.taskKey)
                && java.util.Objects.equals(this.externalId, other.externalId)
                && java.util.Objects.equals(this.retryAttempt, other.retryAttempt)
                && java.util.Objects.equals(this.taskSchedule, other.taskSchedule)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.outputs, other.outputs)
                && java.util.Objects.equals(this.executionErrors, other.executionErrors)
                && java.util.Objects.equals(this.terminationErrors, other.terminationErrors)
                && java.util.Objects.equals(this.authMode, other.authMode)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(
                        this.isLogProcessingInProgress, other.isLogProcessingInProgress)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.keyMap, other.keyMap)
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
        result =
                (result * PRIME)
                        + (this.configProvider == null ? 43 : this.configProvider.hashCode());
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
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedDuration == null ? 43 : this.expectedDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedDurationUnit == null
                                ? 43
                                : this.expectedDurationUnit.hashCode());
        result = (result * PRIME) + (this.taskKey == null ? 43 : this.taskKey.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        result = (result * PRIME) + (this.retryAttempt == null ? 43 : this.retryAttempt.hashCode());
        result = (result * PRIME) + (this.taskSchedule == null ? 43 : this.taskSchedule.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.outputs == null ? 43 : this.outputs.hashCode());
        result =
                (result * PRIME)
                        + (this.executionErrors == null ? 43 : this.executionErrors.hashCode());
        result =
                (result * PRIME)
                        + (this.terminationErrors == null ? 43 : this.terminationErrors.hashCode());
        result = (result * PRIME) + (this.authMode == null ? 43 : this.authMode.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result =
                (result * PRIME)
                        + (this.isLogProcessingInProgress == null
                                ? 43
                                : this.isLogProcessingInProgress.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.keyMap == null ? 43 : this.keyMap.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
