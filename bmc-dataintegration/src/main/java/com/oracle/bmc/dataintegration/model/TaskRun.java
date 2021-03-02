/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about a task run.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaskRun.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TaskRun {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

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

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
        private Long startTimeMillis;

        public Builder startTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            this.__explicitlySet__.add("startTimeMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
        private Long endTimeMillis;

        public Builder endTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            this.__explicitlySet__.add("endTimeMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
        private Long lastUpdated;

        public Builder lastUpdated(Long lastUpdated) {
            this.lastUpdated = lastUpdated;
            this.__explicitlySet__.add("lastUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recordsWritten")
        private Long recordsWritten;

        public Builder recordsWritten(Long recordsWritten) {
            this.recordsWritten = recordsWritten;
            this.__explicitlySet__.add("recordsWritten");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bytesProcessed")
        private Long bytesProcessed;

        public Builder bytesProcessed(Long bytesProcessed) {
            this.bytesProcessed = bytesProcessed;
            this.__explicitlySet__.add("bytesProcessed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expectedDuration")
        private Double expectedDuration;

        public Builder expectedDuration(Double expectedDuration) {
            this.expectedDuration = expectedDuration;
            this.__explicitlySet__.add("expectedDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expectedDurationUnit")
        private ExpectedDurationUnit expectedDurationUnit;

        public Builder expectedDurationUnit(ExpectedDurationUnit expectedDurationUnit) {
            this.expectedDurationUnit = expectedDurationUnit;
            this.__explicitlySet__.add("expectedDurationUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
        private String taskKey;

        public Builder taskKey(String taskKey) {
            this.taskKey = taskKey;
            this.__explicitlySet__.add("taskKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryAttempt")
        private Integer retryAttempt;

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

        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.Map<String, Float> metrics;

        public Builder metrics(java.util.Map<String, Float> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionErrors")
        private java.util.List<String> executionErrors;

        public Builder executionErrors(java.util.List<String> executionErrors) {
            this.executionErrors = executionErrors;
            this.__explicitlySet__.add("executionErrors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("terminationErrors")
        private java.util.List<String> terminationErrors;

        public Builder terminationErrors(java.util.List<String> terminationErrors) {
            this.terminationErrors = terminationErrors;
            this.__explicitlySet__.add("terminationErrors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            this.__explicitlySet__.add("opcRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        public Builder taskType(TaskType taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

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

        @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
        private java.util.Map<String, String> keyMap;

        public Builder keyMap(java.util.Map<String, String> keyMap) {
            this.keyMap = keyMap;
            this.__explicitlySet__.add("keyMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskRun build() {
            TaskRun __instance__ =
                    new TaskRun(
                            key,
                            modelType,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            configProvider,
                            status,
                            startTimeMillis,
                            endTimeMillis,
                            lastUpdated,
                            recordsWritten,
                            bytesProcessed,
                            errorMessage,
                            expectedDuration,
                            expectedDurationUnit,
                            taskKey,
                            retryAttempt,
                            taskSchedule,
                            metrics,
                            executionErrors,
                            terminationErrors,
                            opcRequestId,
                            objectStatus,
                            taskType,
                            identifier,
                            metadata,
                            keyMap);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskRun o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelType(o.getModelType())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .configProvider(o.getConfigProvider())
                            .status(o.getStatus())
                            .startTimeMillis(o.getStartTimeMillis())
                            .endTimeMillis(o.getEndTimeMillis())
                            .lastUpdated(o.getLastUpdated())
                            .recordsWritten(o.getRecordsWritten())
                            .bytesProcessed(o.getBytesProcessed())
                            .errorMessage(o.getErrorMessage())
                            .expectedDuration(o.getExpectedDuration())
                            .expectedDurationUnit(o.getExpectedDurationUnit())
                            .taskKey(o.getTaskKey())
                            .retryAttempt(o.getRetryAttempt())
                            .taskSchedule(o.getTaskSchedule())
                            .metrics(o.getMetrics())
                            .executionErrors(o.getExecutionErrors())
                            .terminationErrors(o.getTerminationErrors())
                            .opcRequestId(o.getOpcRequestId())
                            .objectStatus(o.getObjectStatus())
                            .taskType(o.getTaskType())
                            .identifier(o.getIdentifier())
                            .metadata(o.getMetadata())
                            .keyMap(o.getKeyMap());

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

    /**
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    String modelType;

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Detailed description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    Integer objectVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("configProvider")
    ConfigProvider configProvider;
    /**
     * The status of the task run.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        NotStarted("NOT_STARTED"),
        Queued("QUEUED"),
        Running("RUNNING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Success("SUCCESS"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The status of the task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
    Long startTimeMillis;

    /**
     * The end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
    Long endTimeMillis;

    /**
     * The date and time the object was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdated")
    Long lastUpdated;

    /**
     * The number of records processed in the task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordsWritten")
    Long recordsWritten;

    /**
     * The number of bytes processed in the task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bytesProcessed")
    Long bytesProcessed;

    /**
     * Contains an error message if status is `ERROR`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    String errorMessage;

    /**
     * The expected duration for the task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedDuration")
    Double expectedDuration;
    /**
     * The expected duration unit of measure.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ExpectedDurationUnit {
        Seconds("SECONDS"),
        Minutes("MINUTES"),
        Hours("HOURS"),
        Days("DAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The expected duration unit of measure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedDurationUnit")
    ExpectedDurationUnit expectedDurationUnit;

    /**
     * Task Key of the task for which TaskRun is being created. If not specified, the AggregatorKey in RegistryMetadata will be assumed to be the TaskKey
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
    String taskKey;

    /**
     * Holds the particular attempt number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryAttempt")
    Integer retryAttempt;

    @com.fasterxml.jackson.annotation.JsonProperty("taskSchedule")
    TaskSchedule taskSchedule;

    /**
     * A map of metrics for the run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    java.util.Map<String, Float> metrics;

    /**
     * An array of execution errors from the run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionErrors")
    java.util.List<String> executionErrors;

    /**
     * An array of termination errors from the run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("terminationErrors")
    java.util.List<String> terminationErrors;

    /**
     * The OPC request ID of execution of the task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    String opcRequestId;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;
    /**
     * The type of task run.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TaskType {
        IntegrationTask("INTEGRATION_TASK"),
        DataLoaderTask("DATA_LOADER_TASK"),
        PipelineTask("PIPELINE_TASK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The type of task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    TaskType taskType;

    /**
     * Value can only contain upper case letters, underscore and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    ObjectMetadata metadata;

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping between user provided key and generated key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
    java.util.Map<String, String> keyMap;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
