/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * An operator for task
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaskOperator.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TaskOperator extends Operator {
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

        @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
        private java.util.List<InputPort> inputPorts;

        public Builder inputPorts(java.util.List<InputPort> inputPorts) {
            this.inputPorts = inputPorts;
            this.__explicitlySet__.add("inputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
        private java.util.List<OutputPort> outputPorts;

        public Builder outputPorts(java.util.List<OutputPort> outputPorts) {
            this.outputPorts = outputPorts;
            this.__explicitlySet__.add("outputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
        private ConfigValues opConfigValues;

        public Builder opConfigValues(ConfigValues opConfigValues) {
            this.opConfigValues = opConfigValues;
            this.__explicitlySet__.add("opConfigValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryAttempts")
        private Integer retryAttempts;

        public Builder retryAttempts(Integer retryAttempts) {
            this.retryAttempts = retryAttempts;
            this.__explicitlySet__.add("retryAttempts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryDelayUnit")
        private RetryDelayUnit retryDelayUnit;

        public Builder retryDelayUnit(RetryDelayUnit retryDelayUnit) {
            this.retryDelayUnit = retryDelayUnit;
            this.__explicitlySet__.add("retryDelayUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
        private Double retryDelay;

        public Builder retryDelay(Double retryDelay) {
            this.retryDelay = retryDelay;
            this.__explicitlySet__.add("retryDelay");
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

        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        public Builder taskType(TaskType taskType) {
            this.taskType = taskType;
            this.__explicitlySet__.add("taskType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("task")
        private Task task;

        public Builder task(Task task) {
            this.task = task;
            this.__explicitlySet__.add("task");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("triggerRule")
        private TriggerRule triggerRule;

        public Builder triggerRule(TriggerRule triggerRule) {
            this.triggerRule = triggerRule;
            this.__explicitlySet__.add("triggerRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
        private ConfigProvider configProviderDelegate;

        public Builder configProviderDelegate(ConfigProvider configProviderDelegate) {
            this.configProviderDelegate = configProviderDelegate;
            this.__explicitlySet__.add("configProviderDelegate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskOperator build() {
            TaskOperator __instance__ =
                    new TaskOperator(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            inputPorts,
                            outputPorts,
                            objectStatus,
                            identifier,
                            parameters,
                            opConfigValues,
                            retryAttempts,
                            retryDelayUnit,
                            retryDelay,
                            expectedDuration,
                            expectedDurationUnit,
                            taskType,
                            task,
                            triggerRule,
                            configProviderDelegate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskOperator o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .inputPorts(o.getInputPorts())
                            .outputPorts(o.getOutputPorts())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .parameters(o.getParameters())
                            .opConfigValues(o.getOpConfigValues())
                            .retryAttempts(o.getRetryAttempts())
                            .retryDelayUnit(o.getRetryDelayUnit())
                            .retryDelay(o.getRetryDelay())
                            .expectedDuration(o.getExpectedDuration())
                            .expectedDurationUnit(o.getExpectedDurationUnit())
                            .taskType(o.getTaskType())
                            .task(o.getTask())
                            .triggerRule(o.getTriggerRule())
                            .configProviderDelegate(o.getConfigProviderDelegate());

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

    @Deprecated
    public TaskOperator(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            Integer objectStatus,
            String identifier,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            Integer retryAttempts,
            RetryDelayUnit retryDelayUnit,
            Double retryDelay,
            Double expectedDuration,
            ExpectedDurationUnit expectedDurationUnit,
            TaskType taskType,
            Task task,
            TriggerRule triggerRule,
            ConfigProvider configProviderDelegate) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                inputPorts,
                outputPorts,
                objectStatus,
                identifier,
                parameters,
                opConfigValues);
        this.retryAttempts = retryAttempts;
        this.retryDelayUnit = retryDelayUnit;
        this.retryDelay = retryDelay;
        this.expectedDuration = expectedDuration;
        this.expectedDurationUnit = expectedDurationUnit;
        this.taskType = taskType;
        this.task = task;
        this.triggerRule = triggerRule;
        this.configProviderDelegate = configProviderDelegate;
    }

    /**
     * The number of retry attempts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryAttempts")
    Integer retryAttempts;
    /**
     * The unit for the retry delay.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RetryDelayUnit {
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
        private static java.util.Map<String, RetryDelayUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (RetryDelayUnit v : RetryDelayUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RetryDelayUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RetryDelayUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RetryDelayUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The unit for the retry delay.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryDelayUnit")
    RetryDelayUnit retryDelayUnit;

    /**
     * The retry delay, the unit for measurement is in the property retry delay unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
    Double retryDelay;

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
     * The type of the task referenced in the task property.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TaskType {
        PipelineTask("PIPELINE_TASK"),
        IntegrationTask("INTEGRATION_TASK"),
        DataLoaderTask("DATA_LOADER_TASK"),
        SqlTask("SQL_TASK"),
        OciDataflowTask("OCI_DATAFLOW_TASK"),
        RestTask("REST_TASK"),

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
     * The type of the task referenced in the task property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    TaskType taskType;

    @com.fasterxml.jackson.annotation.JsonProperty("task")
    Task task;
    /**
     * The merge condition. The conditions are
     * ALL_SUCCESS - All the preceeding operators need to be successful.
     * ALL_FAILED - All the preceeding operators should have failed.
     * ALL_COMPLETE - All the preceeding operators should have completed. It could have executed successfully or failed.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TriggerRule {
        AllSuccess("ALL_SUCCESS"),
        AllFailed("ALL_FAILED"),
        AllComplete("ALL_COMPLETE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TriggerRule> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggerRule v : TriggerRule.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggerRule(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggerRule create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggerRule', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The merge condition. The conditions are
     * ALL_SUCCESS - All the preceeding operators need to be successful.
     * ALL_FAILED - All the preceeding operators should have failed.
     * ALL_COMPLETE - All the preceeding operators should have completed. It could have executed successfully or failed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggerRule")
    TriggerRule triggerRule;

    @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
    ConfigProvider configProviderDelegate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
