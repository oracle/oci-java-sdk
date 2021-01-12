/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The task type contains the audit summary information and the definition of the task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType",
    defaultImpl = CreateTaskValidationDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateTaskValidationFromDataLoaderTask.class,
        name = "DATA_LOADER_TASK"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateTaskValidationFromIntegrationTask.class,
        name = "INTEGRATION_TASK"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateTaskValidationDetails {

    /**
     * Generated key that can be used in API calls to identify task. On scenarios where reference to the task is needed, a value can be passed in the create operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

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

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    /**
     * Value can only contain upper case letters, underscore and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    /**
     * An array of input ports.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
    java.util.List<InputPort> inputPorts;

    /**
     * An array of output ports.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
    java.util.List<OutputPort> outputPorts;

    /**
     * An array of parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    java.util.List<Parameter> parameters;

    @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
    ConfigValues opConfigValues;

    @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
    ConfigProvider configProviderDelegate;

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    ObjectMetadata metadata;

    /**
     * The type of the task.
     **/
    public enum ModelType {
        IntegrationTask("INTEGRATION_TASK"),
        DataLoaderTask("DATA_LOADER_TASK"),
        ;

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ModelType: " + key);
        }
    };
}
