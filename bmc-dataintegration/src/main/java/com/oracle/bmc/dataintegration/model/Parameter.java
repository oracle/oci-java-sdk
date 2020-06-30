/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Parameters are created and assigned values that can be deferred to execution/runtime.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Parameter.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Parameter extends TypedObject {
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

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
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

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private BaseType type;

        public Builder type(BaseType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Object defaultValue;

        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rootObjectDefaultValue")
        private Object rootObjectDefaultValue;

        public Builder rootObjectDefaultValue(Object rootObjectDefaultValue) {
            this.rootObjectDefaultValue = rootObjectDefaultValue;
            this.__explicitlySet__.add("rootObjectDefaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInput")
        private Boolean isInput;

        public Builder isInput(Boolean isInput) {
            this.isInput = isInput;
            this.__explicitlySet__.add("isInput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOutput")
        private Boolean isOutput;

        public Builder isOutput(Boolean isOutput) {
            this.isOutput = isOutput;
            this.__explicitlySet__.add("isOutput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputAggregationType")
        private OutputAggregationType outputAggregationType;

        public Builder outputAggregationType(OutputAggregationType outputAggregationType) {
            this.outputAggregationType = outputAggregationType;
            this.__explicitlySet__.add("outputAggregationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Parameter build() {
            Parameter __instance__ =
                    new Parameter(
                            key,
                            modelVersion,
                            parentRef,
                            configValues,
                            objectStatus,
                            name,
                            description,
                            type,
                            defaultValue,
                            rootObjectDefaultValue,
                            isInput,
                            isOutput,
                            outputAggregationType,
                            typeName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Parameter o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .configValues(o.getConfigValues())
                            .objectStatus(o.getObjectStatus())
                            .name(o.getName())
                            .description(o.getDescription())
                            .type(o.getType())
                            .defaultValue(o.getDefaultValue())
                            .rootObjectDefaultValue(o.getRootObjectDefaultValue())
                            .isInput(o.getIsInput())
                            .isOutput(o.getIsOutput())
                            .outputAggregationType(o.getOutputAggregationType())
                            .typeName(o.getTypeName());

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
    public Parameter(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description,
            BaseType type,
            Object defaultValue,
            Object rootObjectDefaultValue,
            Boolean isInput,
            Boolean isOutput,
            OutputAggregationType outputAggregationType,
            String typeName) {
        super(key, modelVersion, parentRef, configValues, objectStatus, name, description);
        this.type = type;
        this.defaultValue = defaultValue;
        this.rootObjectDefaultValue = rootObjectDefaultValue;
        this.isInput = isInput;
        this.isOutput = isOutput;
        this.outputAggregationType = outputAggregationType;
        this.typeName = typeName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    BaseType type;

    /**
     * The default value of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    Object defaultValue;

    /**
     * The default value of the parameter which can be an object in DIS, such as a data entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootObjectDefaultValue")
    Object rootObjectDefaultValue;

    /**
     * Whether the parameter is input value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInput")
    Boolean isInput;

    /**
     * Whether the parameter is output value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOutput")
    Boolean isOutput;
    /**
     * The output aggregation type
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OutputAggregationType {
        Min("MIN"),
        Max("MAX"),
        Count("COUNT"),
        Sum("SUM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, OutputAggregationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OutputAggregationType v : OutputAggregationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OutputAggregationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutputAggregationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OutputAggregationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The output aggregation type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputAggregationType")
    OutputAggregationType outputAggregationType;

    /**
     * The name of the object type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    String typeName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
