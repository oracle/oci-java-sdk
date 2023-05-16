/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Parameters are created and assigned values that can be configured for each integration task. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Parameter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Parameter extends TypedObject {
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
        /** This can either be a string value referencing the type or a BaseType object. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Object type;

        /**
         * This can either be a string value referencing the type or a BaseType object.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Object type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The default value of the parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Object defaultValue;

        /**
         * The default value of the parameter.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /**
         * The default value of the parameter which can be an object in DIS, such as a data entity.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rootObjectDefaultValue")
        private Object rootObjectDefaultValue;

        /**
         * The default value of the parameter which can be an object in DIS, such as a data entity.
         *
         * @param rootObjectDefaultValue the value to set
         * @return this builder
         */
        public Builder rootObjectDefaultValue(Object rootObjectDefaultValue) {
            this.rootObjectDefaultValue = rootObjectDefaultValue;
            this.__explicitlySet__.add("rootObjectDefaultValue");
            return this;
        }
        /** Specifies whether the parameter is input value. */
        @com.fasterxml.jackson.annotation.JsonProperty("isInput")
        private Boolean isInput;

        /**
         * Specifies whether the parameter is input value.
         *
         * @param isInput the value to set
         * @return this builder
         */
        public Builder isInput(Boolean isInput) {
            this.isInput = isInput;
            this.__explicitlySet__.add("isInput");
            return this;
        }
        /** Specifies whether the parameter is output value. */
        @com.fasterxml.jackson.annotation.JsonProperty("isOutput")
        private Boolean isOutput;

        /**
         * Specifies whether the parameter is output value.
         *
         * @param isOutput the value to set
         * @return this builder
         */
        public Builder isOutput(Boolean isOutput) {
            this.isOutput = isOutput;
            this.__explicitlySet__.add("isOutput");
            return this;
        }
        /** The output aggregation type. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputAggregationType")
        private OutputAggregationType outputAggregationType;

        /**
         * The output aggregation type.
         *
         * @param outputAggregationType the value to set
         * @return this builder
         */
        public Builder outputAggregationType(OutputAggregationType outputAggregationType) {
            this.outputAggregationType = outputAggregationType;
            this.__explicitlySet__.add("outputAggregationType");
            return this;
        }
        /** The type of value the parameter was created for. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        /**
         * The type of value the parameter was created for.
         *
         * @param typeName the value to set
         * @return this builder
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }
        /**
         * The param name for which parameter is created for for eg. driver Shape, Operation etc.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("usedFor")
        private String usedFor;

        /**
         * The param name for which parameter is created for for eg. driver Shape, Operation etc.
         *
         * @param usedFor the value to set
         * @return this builder
         */
        public Builder usedFor(String usedFor) {
            this.usedFor = usedFor;
            this.__explicitlySet__.add("usedFor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Parameter build() {
            Parameter model =
                    new Parameter(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.configValues,
                            this.objectStatus,
                            this.name,
                            this.description,
                            this.type,
                            this.defaultValue,
                            this.rootObjectDefaultValue,
                            this.isInput,
                            this.isOutput,
                            this.outputAggregationType,
                            this.typeName,
                            this.usedFor);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Parameter model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("configValues")) {
                this.configValues(model.getConfigValues());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("rootObjectDefaultValue")) {
                this.rootObjectDefaultValue(model.getRootObjectDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("isInput")) {
                this.isInput(model.getIsInput());
            }
            if (model.wasPropertyExplicitlySet("isOutput")) {
                this.isOutput(model.getIsOutput());
            }
            if (model.wasPropertyExplicitlySet("outputAggregationType")) {
                this.outputAggregationType(model.getOutputAggregationType());
            }
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
            }
            if (model.wasPropertyExplicitlySet("usedFor")) {
                this.usedFor(model.getUsedFor());
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
    public Parameter(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description,
            Object type,
            Object defaultValue,
            Object rootObjectDefaultValue,
            Boolean isInput,
            Boolean isOutput,
            OutputAggregationType outputAggregationType,
            String typeName,
            String usedFor) {
        super(key, modelVersion, parentRef, configValues, objectStatus, name, description);
        this.type = type;
        this.defaultValue = defaultValue;
        this.rootObjectDefaultValue = rootObjectDefaultValue;
        this.isInput = isInput;
        this.isOutput = isOutput;
        this.outputAggregationType = outputAggregationType;
        this.typeName = typeName;
        this.usedFor = usedFor;
    }

    /** This can either be a string value referencing the type or a BaseType object. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Object type;

    /**
     * This can either be a string value referencing the type or a BaseType object.
     *
     * @return the value
     */
    public Object getType() {
        return type;
    }

    /** The default value of the parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final Object defaultValue;

    /**
     * The default value of the parameter.
     *
     * @return the value
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    /** The default value of the parameter which can be an object in DIS, such as a data entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("rootObjectDefaultValue")
    private final Object rootObjectDefaultValue;

    /**
     * The default value of the parameter which can be an object in DIS, such as a data entity.
     *
     * @return the value
     */
    public Object getRootObjectDefaultValue() {
        return rootObjectDefaultValue;
    }

    /** Specifies whether the parameter is input value. */
    @com.fasterxml.jackson.annotation.JsonProperty("isInput")
    private final Boolean isInput;

    /**
     * Specifies whether the parameter is input value.
     *
     * @return the value
     */
    public Boolean getIsInput() {
        return isInput;
    }

    /** Specifies whether the parameter is output value. */
    @com.fasterxml.jackson.annotation.JsonProperty("isOutput")
    private final Boolean isOutput;

    /**
     * Specifies whether the parameter is output value.
     *
     * @return the value
     */
    public Boolean getIsOutput() {
        return isOutput;
    }

    /** The output aggregation type. */
    public enum OutputAggregationType implements com.oracle.bmc.http.internal.BmcEnum {
        Min("MIN"),
        Max("MAX"),
        Count("COUNT"),
        Sum("SUM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OutputAggregationType.class);

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
    /** The output aggregation type. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputAggregationType")
    private final OutputAggregationType outputAggregationType;

    /**
     * The output aggregation type.
     *
     * @return the value
     */
    public OutputAggregationType getOutputAggregationType() {
        return outputAggregationType;
    }

    /** The type of value the parameter was created for. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    /**
     * The type of value the parameter was created for.
     *
     * @return the value
     */
    public String getTypeName() {
        return typeName;
    }

    /** The param name for which parameter is created for for eg. driver Shape, Operation etc. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedFor")
    private final String usedFor;

    /**
     * The param name for which parameter is created for for eg. driver Shape, Operation etc.
     *
     * @return the value
     */
    public String getUsedFor() {
        return usedFor;
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
        sb.append("Parameter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", rootObjectDefaultValue=").append(String.valueOf(this.rootObjectDefaultValue));
        sb.append(", isInput=").append(String.valueOf(this.isInput));
        sb.append(", isOutput=").append(String.valueOf(this.isOutput));
        sb.append(", outputAggregationType=").append(String.valueOf(this.outputAggregationType));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append(", usedFor=").append(String.valueOf(this.usedFor));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Parameter)) {
            return false;
        }

        Parameter other = (Parameter) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(
                        this.rootObjectDefaultValue, other.rootObjectDefaultValue)
                && java.util.Objects.equals(this.isInput, other.isInput)
                && java.util.Objects.equals(this.isOutput, other.isOutput)
                && java.util.Objects.equals(this.outputAggregationType, other.outputAggregationType)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.usedFor, other.usedFor)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result =
                (result * PRIME)
                        + (this.rootObjectDefaultValue == null
                                ? 43
                                : this.rootObjectDefaultValue.hashCode());
        result = (result * PRIME) + (this.isInput == null ? 43 : this.isInput.hashCode());
        result = (result * PRIME) + (this.isOutput == null ? 43 : this.isOutput.hashCode());
        result =
                (result * PRIME)
                        + (this.outputAggregationType == null
                                ? 43
                                : this.outputAggregationType.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result = (result * PRIME) + (this.usedFor == null ? 43 : this.usedFor.hashCode());
        return result;
    }
}
