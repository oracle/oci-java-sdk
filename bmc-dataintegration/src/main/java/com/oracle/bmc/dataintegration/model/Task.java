/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The task type contains the audit summary information and the definition of the task. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = Task.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TaskFromPipelineTaskDetails.class,
            name = "PIPELINE_TASK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TaskFromIntegrationTaskDetails.class,
            name = "INTEGRATION_TASK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TaskFromSQLTaskDetails.class,
            name = "SQL_TASK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TaskFromRestTaskDetails.class,
            name = "REST_TASK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TaskFromOCIDataflowTaskDetails.class,
            name = "OCI_DATAFLOW_TASK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TaskFromDataLoaderTaskDetails.class,
            name = "DATA_LOADER_TASK")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class Task extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "objectVersion",
        "objectStatus",
        "identifier",
        "inputPorts",
        "outputPorts",
        "parameters",
        "opConfigValues",
        "configProviderDelegate",
        "isConcurrentAllowed",
        "metadata",
        "keyMap",
        "registryMetadata"
    })
    protected Task(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            ConfigProvider configProviderDelegate,
            Boolean isConcurrentAllowed,
            ObjectMetadata metadata,
            java.util.Map<String, String> keyMap,
            RegistryMetadata registryMetadata) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.inputPorts = inputPorts;
        this.outputPorts = outputPorts;
        this.parameters = parameters;
        this.opConfigValues = opConfigValues;
        this.configProviderDelegate = configProviderDelegate;
        this.isConcurrentAllowed = isConcurrentAllowed;
        this.metadata = metadata;
        this.keyMap = keyMap;
        this.registryMetadata = registryMetadata;
    }

    /**
     * Generated key that can be used in API calls to identify task. On scenarios where reference to
     * the task is needed, a value can be passed in create.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify task. On scenarios where reference to
     * the task is needed, a value can be passed in create.
     *
     * @return the value
     */
    public String getKey() {
        return key;
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

    /** An array of input ports. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
    private final java.util.List<InputPort> inputPorts;

    /**
     * An array of input ports.
     *
     * @return the value
     */
    public java.util.List<InputPort> getInputPorts() {
        return inputPorts;
    }

    /** An array of output ports. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
    private final java.util.List<OutputPort> outputPorts;

    /**
     * An array of output ports.
     *
     * @return the value
     */
    public java.util.List<OutputPort> getOutputPorts() {
        return outputPorts;
    }

    /** An array of parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

    /**
     * An array of parameters.
     *
     * @return the value
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
    private final ConfigValues opConfigValues;

    public ConfigValues getOpConfigValues() {
        return opConfigValues;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
    private final ConfigProvider configProviderDelegate;

    public ConfigProvider getConfigProviderDelegate() {
        return configProviderDelegate;
    }

    /** Whether the same task can be executed concurrently. */
    @com.fasterxml.jackson.annotation.JsonProperty("isConcurrentAllowed")
    private final Boolean isConcurrentAllowed;

    /**
     * Whether the same task can be executed concurrently.
     *
     * @return the value
     */
    public Boolean getIsConcurrentAllowed() {
        return isConcurrentAllowed;
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

    @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
    private final RegistryMetadata registryMetadata;

    public RegistryMetadata getRegistryMetadata() {
        return registryMetadata;
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
        sb.append("Task(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", inputPorts=").append(String.valueOf(this.inputPorts));
        sb.append(", outputPorts=").append(String.valueOf(this.outputPorts));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", opConfigValues=").append(String.valueOf(this.opConfigValues));
        sb.append(", configProviderDelegate=").append(String.valueOf(this.configProviderDelegate));
        sb.append(", isConcurrentAllowed=").append(String.valueOf(this.isConcurrentAllowed));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", keyMap=").append(String.valueOf(this.keyMap));
        sb.append(", registryMetadata=").append(String.valueOf(this.registryMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Task)) {
            return false;
        }

        Task other = (Task) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.inputPorts, other.inputPorts)
                && java.util.Objects.equals(this.outputPorts, other.outputPorts)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.opConfigValues, other.opConfigValues)
                && java.util.Objects.equals(
                        this.configProviderDelegate, other.configProviderDelegate)
                && java.util.Objects.equals(this.isConcurrentAllowed, other.isConcurrentAllowed)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.keyMap, other.keyMap)
                && java.util.Objects.equals(this.registryMetadata, other.registryMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.inputPorts == null ? 43 : this.inputPorts.hashCode());
        result = (result * PRIME) + (this.outputPorts == null ? 43 : this.outputPorts.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result =
                (result * PRIME)
                        + (this.opConfigValues == null ? 43 : this.opConfigValues.hashCode());
        result =
                (result * PRIME)
                        + (this.configProviderDelegate == null
                                ? 43
                                : this.configProviderDelegate.hashCode());
        result =
                (result * PRIME)
                        + (this.isConcurrentAllowed == null
                                ? 43
                                : this.isConcurrentAllowed.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.keyMap == null ? 43 : this.keyMap.hashCode());
        result =
                (result * PRIME)
                        + (this.registryMetadata == null ? 43 : this.registryMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the task. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
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
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
