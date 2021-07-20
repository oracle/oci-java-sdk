/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the SQL task.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateTaskFromSQLTask.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateTaskFromSQLTask extends CreateTaskDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
        private CreateConfigProvider configProviderDelegate;

        public Builder configProviderDelegate(CreateConfigProvider configProviderDelegate) {
            this.configProviderDelegate = configProviderDelegate;
            this.__explicitlySet__.add("configProviderDelegate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("script")
        private Script script;

        public Builder script(Script script) {
            this.script = script;
            this.__explicitlySet__.add("script");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlScriptType")
        private SqlScriptType sqlScriptType;

        public Builder sqlScriptType(SqlScriptType sqlScriptType) {
            this.sqlScriptType = sqlScriptType;
            this.__explicitlySet__.add("sqlScriptType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Object operation;

        public Builder operation(Object operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTaskFromSQLTask build() {
            CreateTaskFromSQLTask __instance__ =
                    new CreateTaskFromSQLTask(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectStatus,
                            identifier,
                            inputPorts,
                            outputPorts,
                            parameters,
                            opConfigValues,
                            configProviderDelegate,
                            registryMetadata,
                            script,
                            sqlScriptType,
                            operation);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTaskFromSQLTask o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .inputPorts(o.getInputPorts())
                            .outputPorts(o.getOutputPorts())
                            .parameters(o.getParameters())
                            .opConfigValues(o.getOpConfigValues())
                            .configProviderDelegate(o.getConfigProviderDelegate())
                            .registryMetadata(o.getRegistryMetadata())
                            .script(o.getScript())
                            .sqlScriptType(o.getSqlScriptType())
                            .operation(o.getOperation());

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
    public CreateTaskFromSQLTask(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            CreateConfigProvider configProviderDelegate,
            RegistryMetadata registryMetadata,
            Script script,
            SqlScriptType sqlScriptType,
            Object operation) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectStatus,
                identifier,
                inputPorts,
                outputPorts,
                parameters,
                opConfigValues,
                configProviderDelegate,
                registryMetadata);
        this.script = script;
        this.sqlScriptType = sqlScriptType;
        this.operation = operation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("script")
    Script script;
    /**
     * Indicates whether the task is invoking a custom SQL script or stored procedure.
     **/
    public enum SqlScriptType {
        StoredProcedure("STORED_PROCEDURE"),
        SqlCode("SQL_CODE"),
        ;

        private final String value;
        private static java.util.Map<String, SqlScriptType> map;

        static {
            map = new java.util.HashMap<>();
            for (SqlScriptType v : SqlScriptType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SqlScriptType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SqlScriptType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SqlScriptType: " + key);
        }
    };
    /**
     * Indicates whether the task is invoking a custom SQL script or stored procedure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlScriptType")
    SqlScriptType sqlScriptType;

    /**
     * Describes the shape of the execution result
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    Object operation;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
