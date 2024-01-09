/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * An operator for task <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaskOperator.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TaskOperator extends Operator {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        private java.util.List<TypedObject> outputPorts;

        public Builder outputPorts(java.util.List<TypedObject> outputPorts) {
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
        /** The number of retry attempts. */
        @com.fasterxml.jackson.annotation.JsonProperty("retryAttempts")
        private Integer retryAttempts;

        /**
         * The number of retry attempts.
         *
         * @param retryAttempts the value to set
         * @return this builder
         */
        public Builder retryAttempts(Integer retryAttempts) {
            this.retryAttempts = retryAttempts;
            this.__explicitlySet__.add("retryAttempts");
            return this;
        }
        /** The unit for the retry delay. */
        @com.fasterxml.jackson.annotation.JsonProperty("retryDelayUnit")
        private RetryDelayUnit retryDelayUnit;

        /**
         * The unit for the retry delay.
         *
         * @param retryDelayUnit the value to set
         * @return this builder
         */
        public Builder retryDelayUnit(RetryDelayUnit retryDelayUnit) {
            this.retryDelayUnit = retryDelayUnit;
            this.__explicitlySet__.add("retryDelayUnit");
            return this;
        }
        /** The retry delay, the unit for measurement is in the property retry delay unit. */
        @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
        private Double retryDelay;

        /**
         * The retry delay, the unit for measurement is in the property retry delay unit.
         *
         * @param retryDelay the value to set
         * @return this builder
         */
        public Builder retryDelay(Double retryDelay) {
            this.retryDelay = retryDelay;
            this.__explicitlySet__.add("retryDelay");
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
        /** The type of the task referenced in the task property. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskType")
        private TaskType taskType;

        /**
         * The type of the task referenced in the task property.
         *
         * @param taskType the value to set
         * @return this builder
         */
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
        /**
         * The merge condition. The conditions are ALL_SUCCESS - All the preceeding operators need
         * to be successful. ALL_FAILED - All the preceeding operators should have failed.
         * ALL_COMPLETE - All the preceeding operators should have completed. It could have executed
         * successfully or failed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("triggerRule")
        private TriggerRule triggerRule;

        /**
         * The merge condition. The conditions are ALL_SUCCESS - All the preceeding operators need
         * to be successful. ALL_FAILED - All the preceeding operators should have failed.
         * ALL_COMPLETE - All the preceeding operators should have completed. It could have executed
         * successfully or failed.
         *
         * @param triggerRule the value to set
         * @return this builder
         */
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
            TaskOperator model =
                    new TaskOperator(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.inputPorts,
                            this.outputPorts,
                            this.objectStatus,
                            this.identifier,
                            this.parameters,
                            this.opConfigValues,
                            this.retryAttempts,
                            this.retryDelayUnit,
                            this.retryDelay,
                            this.expectedDuration,
                            this.expectedDurationUnit,
                            this.taskType,
                            this.task,
                            this.triggerRule,
                            this.configProviderDelegate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskOperator model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
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
            if (model.wasPropertyExplicitlySet("inputPorts")) {
                this.inputPorts(model.getInputPorts());
            }
            if (model.wasPropertyExplicitlySet("outputPorts")) {
                this.outputPorts(model.getOutputPorts());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("opConfigValues")) {
                this.opConfigValues(model.getOpConfigValues());
            }
            if (model.wasPropertyExplicitlySet("retryAttempts")) {
                this.retryAttempts(model.getRetryAttempts());
            }
            if (model.wasPropertyExplicitlySet("retryDelayUnit")) {
                this.retryDelayUnit(model.getRetryDelayUnit());
            }
            if (model.wasPropertyExplicitlySet("retryDelay")) {
                this.retryDelay(model.getRetryDelay());
            }
            if (model.wasPropertyExplicitlySet("expectedDuration")) {
                this.expectedDuration(model.getExpectedDuration());
            }
            if (model.wasPropertyExplicitlySet("expectedDurationUnit")) {
                this.expectedDurationUnit(model.getExpectedDurationUnit());
            }
            if (model.wasPropertyExplicitlySet("taskType")) {
                this.taskType(model.getTaskType());
            }
            if (model.wasPropertyExplicitlySet("task")) {
                this.task(model.getTask());
            }
            if (model.wasPropertyExplicitlySet("triggerRule")) {
                this.triggerRule(model.getTriggerRule());
            }
            if (model.wasPropertyExplicitlySet("configProviderDelegate")) {
                this.configProviderDelegate(model.getConfigProviderDelegate());
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

    @Deprecated
    public TaskOperator(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            java.util.List<InputPort> inputPorts,
            java.util.List<TypedObject> outputPorts,
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

    /** The number of retry attempts. */
    @com.fasterxml.jackson.annotation.JsonProperty("retryAttempts")
    private final Integer retryAttempts;

    /**
     * The number of retry attempts.
     *
     * @return the value
     */
    public Integer getRetryAttempts() {
        return retryAttempts;
    }

    /** The unit for the retry delay. */
    public enum RetryDelayUnit implements com.oracle.bmc.http.internal.BmcEnum {
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
                org.slf4j.LoggerFactory.getLogger(RetryDelayUnit.class);

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
    /** The unit for the retry delay. */
    @com.fasterxml.jackson.annotation.JsonProperty("retryDelayUnit")
    private final RetryDelayUnit retryDelayUnit;

    /**
     * The unit for the retry delay.
     *
     * @return the value
     */
    public RetryDelayUnit getRetryDelayUnit() {
        return retryDelayUnit;
    }

    /** The retry delay, the unit for measurement is in the property retry delay unit. */
    @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
    private final Double retryDelay;

    /**
     * The retry delay, the unit for measurement is in the property retry delay unit.
     *
     * @return the value
     */
    public Double getRetryDelay() {
        return retryDelay;
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

    /** The type of the task referenced in the task property. */
    public enum TaskType implements com.oracle.bmc.http.internal.BmcEnum {
        PipelineTask("PIPELINE_TASK"),
        IntegrationTask("INTEGRATION_TASK"),
        DataLoaderTask("DATA_LOADER_TASK"),
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
    /** The type of the task referenced in the task property. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskType")
    private final TaskType taskType;

    /**
     * The type of the task referenced in the task property.
     *
     * @return the value
     */
    public TaskType getTaskType() {
        return taskType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("task")
    private final Task task;

    public Task getTask() {
        return task;
    }

    /**
     * The merge condition. The conditions are ALL_SUCCESS - All the preceeding operators need to be
     * successful. ALL_FAILED - All the preceeding operators should have failed. ALL_COMPLETE - All
     * the preceeding operators should have completed. It could have executed successfully or
     * failed.
     */
    public enum TriggerRule implements com.oracle.bmc.http.internal.BmcEnum {
        AllSuccess("ALL_SUCCESS"),
        AllFailed("ALL_FAILED"),
        AllComplete("ALL_COMPLETE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TriggerRule.class);

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
     * The merge condition. The conditions are ALL_SUCCESS - All the preceeding operators need to be
     * successful. ALL_FAILED - All the preceeding operators should have failed. ALL_COMPLETE - All
     * the preceeding operators should have completed. It could have executed successfully or
     * failed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("triggerRule")
    private final TriggerRule triggerRule;

    /**
     * The merge condition. The conditions are ALL_SUCCESS - All the preceeding operators need to be
     * successful. ALL_FAILED - All the preceeding operators should have failed. ALL_COMPLETE - All
     * the preceeding operators should have completed. It could have executed successfully or
     * failed.
     *
     * @return the value
     */
    public TriggerRule getTriggerRule() {
        return triggerRule;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
    private final ConfigProvider configProviderDelegate;

    public ConfigProvider getConfigProviderDelegate() {
        return configProviderDelegate;
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
        sb.append("TaskOperator(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", retryAttempts=").append(String.valueOf(this.retryAttempts));
        sb.append(", retryDelayUnit=").append(String.valueOf(this.retryDelayUnit));
        sb.append(", retryDelay=").append(String.valueOf(this.retryDelay));
        sb.append(", expectedDuration=").append(String.valueOf(this.expectedDuration));
        sb.append(", expectedDurationUnit=").append(String.valueOf(this.expectedDurationUnit));
        sb.append(", taskType=").append(String.valueOf(this.taskType));
        sb.append(", task=").append(String.valueOf(this.task));
        sb.append(", triggerRule=").append(String.valueOf(this.triggerRule));
        sb.append(", configProviderDelegate=").append(String.valueOf(this.configProviderDelegate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskOperator)) {
            return false;
        }

        TaskOperator other = (TaskOperator) o;
        return java.util.Objects.equals(this.retryAttempts, other.retryAttempts)
                && java.util.Objects.equals(this.retryDelayUnit, other.retryDelayUnit)
                && java.util.Objects.equals(this.retryDelay, other.retryDelay)
                && java.util.Objects.equals(this.expectedDuration, other.expectedDuration)
                && java.util.Objects.equals(this.expectedDurationUnit, other.expectedDurationUnit)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.task, other.task)
                && java.util.Objects.equals(this.triggerRule, other.triggerRule)
                && java.util.Objects.equals(
                        this.configProviderDelegate, other.configProviderDelegate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.retryAttempts == null ? 43 : this.retryAttempts.hashCode());
        result =
                (result * PRIME)
                        + (this.retryDelayUnit == null ? 43 : this.retryDelayUnit.hashCode());
        result = (result * PRIME) + (this.retryDelay == null ? 43 : this.retryDelay.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedDuration == null ? 43 : this.expectedDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedDurationUnit == null
                                ? 43
                                : this.expectedDurationUnit.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result = (result * PRIME) + (this.task == null ? 43 : this.task.hashCode());
        result = (result * PRIME) + (this.triggerRule == null ? 43 : this.triggerRule.hashCode());
        result =
                (result * PRIME)
                        + (this.configProviderDelegate == null
                                ? 43
                                : this.configProviderDelegate.hashCode());
        return result;
    }
}
