/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The native shape field object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NativeShapeField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NativeShapeField {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "modelType",
        "type",
        "configValues",
        "position",
        "defaultValueString",
        "isMandatory"
    })
    public NativeShapeField(
            String name,
            String modelType,
            Object type,
            ConfigValues configValues,
            Integer position,
            String defaultValueString,
            Boolean isMandatory) {
        super();
        this.name = name;
        this.modelType = modelType;
        this.type = type;
        this.configValues = configValues;
        this.position = position;
        this.defaultValueString = defaultValueString;
        this.isMandatory = isMandatory;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The model type reference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The model type reference.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * The type reference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Object type;

        /**
         * The type reference.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Object type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }
        /**
         * The position of the attribute.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Integer position;

        /**
         * The position of the attribute.
         * @param position the value to set
         * @return this builder
         **/
        public Builder position(Integer position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }
        /**
         * The default value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValueString")
        private String defaultValueString;

        /**
         * The default value.
         * @param defaultValueString the value to set
         * @return this builder
         **/
        public Builder defaultValueString(String defaultValueString) {
            this.defaultValueString = defaultValueString;
            this.__explicitlySet__.add("defaultValueString");
            return this;
        }
        /**
         * Specifies whether the field is mandatory.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
        private Boolean isMandatory;

        /**
         * Specifies whether the field is mandatory.
         * @param isMandatory the value to set
         * @return this builder
         **/
        public Builder isMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            this.__explicitlySet__.add("isMandatory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NativeShapeField build() {
            NativeShapeField __instance__ =
                    new NativeShapeField(
                            name,
                            modelType,
                            type,
                            configValues,
                            position,
                            defaultValueString,
                            isMandatory);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NativeShapeField o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .modelType(o.getModelType())
                            .type(o.getType())
                            .configValues(o.getConfigValues())
                            .position(o.getPosition())
                            .defaultValueString(o.getDefaultValueString())
                            .isMandatory(o.getIsMandatory());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
     * The model type reference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The model type reference.
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * The type reference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Object type;

    /**
     * The type reference.
     * @return the value
     **/
    public Object getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    private final ConfigValues configValues;

    public ConfigValues getConfigValues() {
        return configValues;
    }

    /**
     * The position of the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Integer position;

    /**
     * The position of the attribute.
     * @return the value
     **/
    public Integer getPosition() {
        return position;
    }

    /**
     * The default value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValueString")
    private final String defaultValueString;

    /**
     * The default value.
     * @return the value
     **/
    public String getDefaultValueString() {
        return defaultValueString;
    }

    /**
     * Specifies whether the field is mandatory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
    private final Boolean isMandatory;

    /**
     * Specifies whether the field is mandatory.
     * @return the value
     **/
    public Boolean getIsMandatory() {
        return isMandatory;
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
        sb.append("NativeShapeField(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", configValues=").append(String.valueOf(this.configValues));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(", defaultValueString=").append(String.valueOf(this.defaultValueString));
        sb.append(", isMandatory=").append(String.valueOf(this.isMandatory));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NativeShapeField)) {
            return false;
        }

        NativeShapeField other = (NativeShapeField) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.configValues, other.configValues)
                && java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.defaultValueString, other.defaultValueString)
                && java.util.Objects.equals(this.isMandatory, other.isMandatory)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.configValues == null ? 43 : this.configValues.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultValueString == null
                                ? 43
                                : this.defaultValueString.hashCode());
        result = (result * PRIME) + (this.isMandatory == null ? 43 : this.isMandatory.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
