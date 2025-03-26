/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Runtime operator model which holds the runtime metadata of the task operator executed.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RuntimeOperator.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RuntimeOperator extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "taskRunKey",
        "startTimeInMillis",
        "endTimeInMillis",
        "status",
        "modelType",
        "modelVersion",
        "parentRef",
        "name",
        "objectVersion",
        "identifier",
        "executionState",
        "parameters",
        "objectStatus",
        "metadata",
        "operator",
        "inputs",
        "outputs",
        "taskType",
        "configProvider",
        "operatorType",
        "metrics"
    })
    public RuntimeOperator(
            String key,
            String taskRunKey,
            Long startTimeInMillis,
            Long endTimeInMillis,
            Status status,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectVersion,
            String identifier,
            ExecutionState executionState,
            java.util.List<Parameter> parameters,
            Integer objectStatus,
            ObjectMetadata metadata,
            Operator operator,
            java.util.Map<String, ParameterValue> inputs,
            java.util.Map<String, ParameterValue> outputs,
            TaskType taskType,
            ConfigProvider configProvider,
            OperatorType operatorType,
            java.util.Map<String, Float> metrics) {
        super();
        this.key = key;
        this.taskRunKey = taskRunKey;
        this.startTimeInMillis = startTimeInMillis;
        this.endTimeInMillis = endTimeInMillis;
        this.status = status;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.objectVersion = objectVersion;
        this.identifier = identifier;
        this.executionState = executionState;
        this.parameters = parameters;
        this.objectStatus = objectStatus;
        this.metadata = metadata;
        this.operator = operator;
        this.inputs = inputs;
        this.outputs = outputs;
        this.taskType = taskType;
        this.configProvider = configProvider;
        this.operatorType = operatorType;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The RuntimeOperator key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The RuntimeOperator key.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The TaskRun key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskRunKey")
        private String taskRunKey;

        /**
         * The TaskRun key.
         * @param taskRunKey the value to set
         * @return this builder
         **/
        public Builder taskRunKey(String taskRunKey) {
            this.taskRunKey = taskRunKey;
            this.__explicitlySet__.add("taskRunKey");
            return this;
        }
        /**
         * The runtime operator start time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTimeInMillis")
        private Long startTimeInMillis;

        /**
         * The runtime operator start time.
         * @param startTimeInMillis the value to set
         * @return this builder
         **/
        public Builder startTimeInMillis(Long startTimeInMillis) {
            this.startTimeInMillis = startTimeInMillis;
            this.__explicitlySet__.add("startTimeInMillis");
            return this;
        }
        /**
         * The runtime operator end time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTimeInMillis")
        private Long endTimeInMillis;

        /**
         * The runtime operator end time.
         * @param endTimeInMillis the value to set
         * @return this builder
         **/
        public Builder endTimeInMillis(Long endTimeInMillis) {
            this.endTimeInMillis = endTimeInMillis;
            this.__explicitlySet__.add("endTimeInMillis");
            return this;
        }
        /**
         * Status of RuntimeOperator. This field is deprecated, use RuntimeOperator's executionState field instead.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of RuntimeOperator. This field is deprecated, use RuntimeOperator's executionState field instead.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The type of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the object.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * The model version of an object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
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
         * Value can only contain upper case letters, underscore and numbers. It should begin with upper case letter or underscore. The value can be modified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore and numbers. It should begin with upper case letter or underscore. The value can be modified.
         * @param identifier the value to set
         * @return this builder
         **/
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /**
         * status
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionState")
        private ExecutionState executionState;

        /**
         * status
         * @param executionState the value to set
         * @return this builder
         **/
        public Builder executionState(ExecutionState executionState) {
            this.executionState = executionState;
            this.__explicitlySet__.add("executionState");
            return this;
        }
        /**
         * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be configured when the pipeline is executed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        /**
         * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be configured when the pipeline is executed.
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * @param objectStatus the value to set
         * @return this builder
         **/
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }
        /**
         * The configuration provider bindings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inputs")
        private java.util.Map<String, ParameterValue> inputs;

        /**
         * The configuration provider bindings.
         * @param inputs the value to set
         * @return this builder
         **/
        public Builder inputs(java.util.Map<String, ParameterValue> inputs) {
            this.inputs = inputs;
            this.__explicitlySet__.add("inputs");
            return this;
        }
        /**
         * The configuration provider bindings.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outputs")
        private java.util.Map<String, ParameterValue> outputs;

        /**
         * The configuration provider bindings.
         * @param outputs the value to set
         * @return this builder
         **/
        public Builder outputs(java.util.Map<String, ParameterValue> outputs) {
            this.outputs = outputs;
            this.__explicitlySet__.add("outputs");
            return this;
        }
        /**
         * The type of task run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        /**
         * The type of task run.
         * @param taskType the value to set
         * @return this builder
         **/
        public Builder taskType(TaskType taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configProvider")
        private ConfigProvider configProvider;

        public Builder configProvider(ConfigProvider configProvider) {
            this.configProvider = configProvider;
            this.__explicitlySet__.add("configProvider");
            return this;
        }
        /**
         * The type of Runtime Operator
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatorType")
        private OperatorType operatorType;

        /**
         * The type of Runtime Operator
         * @param operatorType the value to set
         * @return this builder
         **/
        public Builder operatorType(OperatorType operatorType) {
            this.operatorType = operatorType;
            this.__explicitlySet__.add("operatorType");
            return this;
        }
        /**
         * A map metrics for the task run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.Map<String, Float> metrics;

        /**
         * A map metrics for the task run.
         * @param metrics the value to set
         * @return this builder
         **/
        public Builder metrics(java.util.Map<String, Float> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuntimeOperator build() {
            RuntimeOperator model =
                    new RuntimeOperator(
                            this.key,
                            this.taskRunKey,
                            this.startTimeInMillis,
                            this.endTimeInMillis,
                            this.status,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.objectVersion,
                            this.identifier,
                            this.executionState,
                            this.parameters,
                            this.objectStatus,
                            this.metadata,
                            this.operator,
                            this.inputs,
                            this.outputs,
                            this.taskType,
                            this.configProvider,
                            this.operatorType,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuntimeOperator model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("taskRunKey")) {
                this.taskRunKey(model.getTaskRunKey());
            }
            if (model.wasPropertyExplicitlySet("startTimeInMillis")) {
                this.startTimeInMillis(model.getStartTimeInMillis());
            }
            if (model.wasPropertyExplicitlySet("endTimeInMillis")) {
                this.endTimeInMillis(model.getEndTimeInMillis());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("executionState")) {
                this.executionState(model.getExecutionState());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("inputs")) {
                this.inputs(model.getInputs());
            }
            if (model.wasPropertyExplicitlySet("outputs")) {
                this.outputs(model.getOutputs());
            }
            if (model.wasPropertyExplicitlySet("taskType")) {
                this.taskType(model.getTaskType());
            }
            if (model.wasPropertyExplicitlySet("configProvider")) {
                this.configProvider(model.getConfigProvider());
            }
            if (model.wasPropertyExplicitlySet("operatorType")) {
                this.operatorType(model.getOperatorType());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
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
     * The RuntimeOperator key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The RuntimeOperator key.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The TaskRun key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskRunKey")
    private final String taskRunKey;

    /**
     * The TaskRun key.
     * @return the value
     **/
    public String getTaskRunKey() {
        return taskRunKey;
    }

    /**
     * The runtime operator start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeInMillis")
    private final Long startTimeInMillis;

    /**
     * The runtime operator start time.
     * @return the value
     **/
    public Long getStartTimeInMillis() {
        return startTimeInMillis;
    }

    /**
     * The runtime operator end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeInMillis")
    private final Long endTimeInMillis;

    /**
     * The runtime operator end time.
     * @return the value
     **/
    public Long getEndTimeInMillis() {
        return endTimeInMillis;
    }

    /**
     * Status of RuntimeOperator. This field is deprecated, use RuntimeOperator's executionState field instead.
     **/
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
    /**
     * Status of RuntimeOperator. This field is deprecated, use RuntimeOperator's executionState field instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of RuntimeOperator. This field is deprecated, use RuntimeOperator's executionState field instead.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the object.
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
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
     * Value can only contain upper case letters, underscore and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    /**
     * status
     **/
    public enum ExecutionState {
        NotStarted("NOT_STARTED"),
        Running("RUNNING"),
        Terminated("TERMINATED"),
        Success("SUCCESS"),
        Error("ERROR"),
        Skipped("SKIPPED"),
        Unknown("UNKNOWN"),
        Ignored("IGNORED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExecutionState.class);

        private final String value;
        private static java.util.Map<String, ExecutionState> map;

        static {
            map = new java.util.HashMap<>();
            for (ExecutionState v : ExecutionState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExecutionState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExecutionState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExecutionState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionState")
    private final ExecutionState executionState;

    /**
     * status
     * @return the value
     **/
    public ExecutionState getExecutionState() {
        return executionState;
    }

    /**
     * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be configured when the pipeline is executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

    /**
     * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be configured when the pipeline is executed.
     * @return the value
     **/
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * @return the value
     **/
    public Integer getObjectStatus() {
        return objectStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final Operator operator;

    public Operator getOperator() {
        return operator;
    }

    /**
     * The configuration provider bindings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputs")
    private final java.util.Map<String, ParameterValue> inputs;

    /**
     * The configuration provider bindings.
     * @return the value
     **/
    public java.util.Map<String, ParameterValue> getInputs() {
        return inputs;
    }

    /**
     * The configuration provider bindings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputs")
    private final java.util.Map<String, ParameterValue> outputs;

    /**
     * The configuration provider bindings.
     * @return the value
     **/
    public java.util.Map<String, ParameterValue> getOutputs() {
        return outputs;
    }

    /**
     * The type of task run.
     **/
    public enum TaskType {
        IntegrationTask("INTEGRATION_TASK"),
        DataLoaderTask("DATA_LOADER_TASK"),
        PipelineTask("PIPELINE_TASK"),
        SqlTask("SQL_TASK"),
        OciDataflowTask("OCI_DATAFLOW_TASK"),
        RestTask("REST_TASK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The type of task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    private final TaskType taskType;

    /**
     * The type of task run.
     * @return the value
     **/
    public TaskType getTaskType() {
        return taskType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configProvider")
    private final ConfigProvider configProvider;

    public ConfigProvider getConfigProvider() {
        return configProvider;
    }

    /**
     * The type of Runtime Operator
     **/
    public enum OperatorType {
        BashOperator("BASH_OPERATOR"),
        TaskOperator("TASK_OPERATOR"),
        RestOperator("REST_OPERATOR"),
        StartOperator("START_OPERATOR"),
        EndOperator("END_OPERATOR"),
        ExpressionOperator("EXPRESSION_OPERATOR"),
        MergeOperator("MERGE_OPERATOR"),
        DecisionOperator("DECISION_OPERATOR"),
        LoopOperator("LOOP_OPERATOR"),
        ActualEndOperator("ACTUAL_END_OPERATOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperatorType.class);

        private final String value;
        private static java.util.Map<String, OperatorType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperatorType v : OperatorType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperatorType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperatorType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperatorType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of Runtime Operator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatorType")
    private final OperatorType operatorType;

    /**
     * The type of Runtime Operator
     * @return the value
     **/
    public OperatorType getOperatorType() {
        return operatorType;
    }

    /**
     * A map metrics for the task run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.Map<String, Float> metrics;

    /**
     * A map metrics for the task run.
     * @return the value
     **/
    public java.util.Map<String, Float> getMetrics() {
        return metrics;
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
        sb.append("RuntimeOperator(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", taskRunKey=").append(String.valueOf(this.taskRunKey));
        sb.append(", startTimeInMillis=").append(String.valueOf(this.startTimeInMillis));
        sb.append(", endTimeInMillis=").append(String.valueOf(this.endTimeInMillis));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", executionState=").append(String.valueOf(this.executionState));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", inputs=").append(String.valueOf(this.inputs));
        sb.append(", outputs=").append(String.valueOf(this.outputs));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", configProvider=").append(String.valueOf(this.configProvider));
        sb.append(", operatorType=").append(String.valueOf(this.operatorType));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuntimeOperator)) {
            return false;
        }

        RuntimeOperator other = (RuntimeOperator) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.taskRunKey, other.taskRunKey)
                && java.util.Objects.equals(this.startTimeInMillis, other.startTimeInMillis)
                && java.util.Objects.equals(this.endTimeInMillis, other.endTimeInMillis)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.executionState, other.executionState)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.inputs, other.inputs)
                && java.util.Objects.equals(this.outputs, other.outputs)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.configProvider, other.configProvider)
                && java.util.Objects.equals(this.operatorType, other.operatorType)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.taskRunKey == null ? 43 : this.taskRunKey.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeInMillis == null ? 43 : this.startTimeInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.endTimeInMillis == null ? 43 : this.endTimeInMillis.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result =
                (result * PRIME)
                        + (this.executionState == null ? 43 : this.executionState.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.inputs == null ? 43 : this.inputs.hashCode());
        result = (result * PRIME) + (this.outputs == null ? 43 : this.outputs.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result =
                (result * PRIME)
                        + (this.configProvider == null ? 43 : this.configProvider.hashCode());
        result = (result * PRIME) + (this.operatorType == null ? 43 : this.operatorType.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
