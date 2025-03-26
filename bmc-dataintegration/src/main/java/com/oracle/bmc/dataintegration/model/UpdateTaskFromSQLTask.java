/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateTaskFromSQLTask.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateTaskFromSQLTask extends UpdateTaskDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
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
        private ConfigProvider configProviderDelegate;

        public Builder configProviderDelegate(ConfigProvider configProviderDelegate) {
            this.configProviderDelegate = configProviderDelegate;
            this.__explicitlySet__.add("configProviderDelegate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isConcurrentAllowed")
        private Boolean isConcurrentAllowed;

        public Builder isConcurrentAllowed(Boolean isConcurrentAllowed) {
            this.isConcurrentAllowed = isConcurrentAllowed;
            this.__explicitlySet__.add("isConcurrentAllowed");
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
        /**
         * Indicates whether the task is invoking a custom SQL script or stored procedure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlScriptType")
        private SqlScriptType sqlScriptType;

        /**
         * Indicates whether the task is invoking a custom SQL script or stored procedure.
         * @param sqlScriptType the value to set
         * @return this builder
         **/
        public Builder sqlScriptType(SqlScriptType sqlScriptType) {
            this.sqlScriptType = sqlScriptType;
            this.__explicitlySet__.add("sqlScriptType");
            return this;
        }
        /**
         * Describes the shape of the execution result
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Object operation;

        /**
         * Describes the shape of the execution result
         * @param operation the value to set
         * @return this builder
         **/
        public Builder operation(Object operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTaskFromSQLTask build() {
            UpdateTaskFromSQLTask model =
                    new UpdateTaskFromSQLTask(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.objectVersion,
                            this.identifier,
                            this.inputPorts,
                            this.outputPorts,
                            this.parameters,
                            this.opConfigValues,
                            this.configProviderDelegate,
                            this.isConcurrentAllowed,
                            this.registryMetadata,
                            this.script,
                            this.sqlScriptType,
                            this.operation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTaskFromSQLTask model) {
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
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("inputPorts")) {
                this.inputPorts(model.getInputPorts());
            }
            if (model.wasPropertyExplicitlySet("outputPorts")) {
                this.outputPorts(model.getOutputPorts());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("opConfigValues")) {
                this.opConfigValues(model.getOpConfigValues());
            }
            if (model.wasPropertyExplicitlySet("configProviderDelegate")) {
                this.configProviderDelegate(model.getConfigProviderDelegate());
            }
            if (model.wasPropertyExplicitlySet("isConcurrentAllowed")) {
                this.isConcurrentAllowed(model.getIsConcurrentAllowed());
            }
            if (model.wasPropertyExplicitlySet("registryMetadata")) {
                this.registryMetadata(model.getRegistryMetadata());
            }
            if (model.wasPropertyExplicitlySet("script")) {
                this.script(model.getScript());
            }
            if (model.wasPropertyExplicitlySet("sqlScriptType")) {
                this.sqlScriptType(model.getSqlScriptType());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
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

    @Deprecated
    public UpdateTaskFromSQLTask(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            ConfigProvider configProviderDelegate,
            Boolean isConcurrentAllowed,
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
                objectVersion,
                identifier,
                inputPorts,
                outputPorts,
                parameters,
                opConfigValues,
                configProviderDelegate,
                isConcurrentAllowed,
                registryMetadata);
        this.script = script;
        this.sqlScriptType = sqlScriptType;
        this.operation = operation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("script")
    private final Script script;

    public Script getScript() {
        return script;
    }

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
    private final SqlScriptType sqlScriptType;

    /**
     * Indicates whether the task is invoking a custom SQL script or stored procedure.
     * @return the value
     **/
    public SqlScriptType getSqlScriptType() {
        return sqlScriptType;
    }

    /**
     * Describes the shape of the execution result
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Object operation;

    /**
     * Describes the shape of the execution result
     * @return the value
     **/
    public Object getOperation() {
        return operation;
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
        sb.append("UpdateTaskFromSQLTask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", script=").append(String.valueOf(this.script));
        sb.append(", sqlScriptType=").append(String.valueOf(this.sqlScriptType));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTaskFromSQLTask)) {
            return false;
        }

        UpdateTaskFromSQLTask other = (UpdateTaskFromSQLTask) o;
        return java.util.Objects.equals(this.script, other.script)
                && java.util.Objects.equals(this.sqlScriptType, other.sqlScriptType)
                && java.util.Objects.equals(this.operation, other.operation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.script == null ? 43 : this.script.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlScriptType == null ? 43 : this.sqlScriptType.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        return result;
    }
}
