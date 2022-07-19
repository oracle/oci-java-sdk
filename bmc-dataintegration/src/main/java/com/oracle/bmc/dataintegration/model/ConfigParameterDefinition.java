/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The configurable properties of an object type.
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
    builder = ConfigParameterDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfigParameterDefinition {
    @Deprecated
    @java.beans.ConstructorProperties({
        "parameterType",
        "parameterName",
        "description",
        "defaultValue",
        "classFieldName",
        "isStatic",
        "isClassFieldValue"
    })
    public ConfigParameterDefinition(
            BaseType parameterType,
            String parameterName,
            String description,
            Object defaultValue,
            String classFieldName,
            Boolean isStatic,
            Boolean isClassFieldValue) {
        super();
        this.parameterType = parameterType;
        this.parameterName = parameterName;
        this.description = description;
        this.defaultValue = defaultValue;
        this.classFieldName = classFieldName;
        this.isStatic = isStatic;
        this.isClassFieldValue = isClassFieldValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("parameterType")
        private BaseType parameterType;

        public Builder parameterType(BaseType parameterType) {
            this.parameterType = parameterType;
            this.__explicitlySet__.add("parameterType");
            return this;
        }
        /**
         * This object represents the configurable properties for an object type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
        private String parameterName;

        /**
         * This object represents the configurable properties for an object type.
         * @param parameterName the value to set
         * @return this builder
         **/
        public Builder parameterName(String parameterName) {
            this.parameterName = parameterName;
            this.__explicitlySet__.add("parameterName");
            return this;
        }
        /**
         * A user defined description for the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user defined description for the object.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The default value for the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Object defaultValue;

        /**
         * The default value for the parameter.
         * @param defaultValue the value to set
         * @return this builder
         **/
        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /**
         * The parameter class field name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classFieldName")
        private String classFieldName;

        /**
         * The parameter class field name.
         * @param classFieldName the value to set
         * @return this builder
         **/
        public Builder classFieldName(String classFieldName) {
            this.classFieldName = classFieldName;
            this.__explicitlySet__.add("classFieldName");
            return this;
        }
        /**
         * Specifies whether the parameter is static or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isStatic")
        private Boolean isStatic;

        /**
         * Specifies whether the parameter is static or not.
         * @param isStatic the value to set
         * @return this builder
         **/
        public Builder isStatic(Boolean isStatic) {
            this.isStatic = isStatic;
            this.__explicitlySet__.add("isStatic");
            return this;
        }
        /**
         * Specifies whether the parameter is a class field or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isClassFieldValue")
        private Boolean isClassFieldValue;

        /**
         * Specifies whether the parameter is a class field or not.
         * @param isClassFieldValue the value to set
         * @return this builder
         **/
        public Builder isClassFieldValue(Boolean isClassFieldValue) {
            this.isClassFieldValue = isClassFieldValue;
            this.__explicitlySet__.add("isClassFieldValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigParameterDefinition build() {
            ConfigParameterDefinition __instance__ =
                    new ConfigParameterDefinition(
                            parameterType,
                            parameterName,
                            description,
                            defaultValue,
                            classFieldName,
                            isStatic,
                            isClassFieldValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigParameterDefinition o) {
            Builder copiedBuilder =
                    parameterType(o.getParameterType())
                            .parameterName(o.getParameterName())
                            .description(o.getDescription())
                            .defaultValue(o.getDefaultValue())
                            .classFieldName(o.getClassFieldName())
                            .isStatic(o.getIsStatic())
                            .isClassFieldValue(o.getIsClassFieldValue());

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

    @com.fasterxml.jackson.annotation.JsonProperty("parameterType")
    private final BaseType parameterType;

    public BaseType getParameterType() {
        return parameterType;
    }

    /**
     * This object represents the configurable properties for an object type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameterName")
    private final String parameterName;

    /**
     * This object represents the configurable properties for an object type.
     * @return the value
     **/
    public String getParameterName() {
        return parameterName;
    }

    /**
     * A user defined description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user defined description for the object.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The default value for the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final Object defaultValue;

    /**
     * The default value for the parameter.
     * @return the value
     **/
    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * The parameter class field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classFieldName")
    private final String classFieldName;

    /**
     * The parameter class field name.
     * @return the value
     **/
    public String getClassFieldName() {
        return classFieldName;
    }

    /**
     * Specifies whether the parameter is static or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStatic")
    private final Boolean isStatic;

    /**
     * Specifies whether the parameter is static or not.
     * @return the value
     **/
    public Boolean getIsStatic() {
        return isStatic;
    }

    /**
     * Specifies whether the parameter is a class field or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isClassFieldValue")
    private final Boolean isClassFieldValue;

    /**
     * Specifies whether the parameter is a class field or not.
     * @return the value
     **/
    public Boolean getIsClassFieldValue() {
        return isClassFieldValue;
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
        sb.append("ConfigParameterDefinition(");
        sb.append("parameterType=").append(String.valueOf(this.parameterType));
        sb.append(", parameterName=").append(String.valueOf(this.parameterName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", classFieldName=").append(String.valueOf(this.classFieldName));
        sb.append(", isStatic=").append(String.valueOf(this.isStatic));
        sb.append(", isClassFieldValue=").append(String.valueOf(this.isClassFieldValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigParameterDefinition)) {
            return false;
        }

        ConfigParameterDefinition other = (ConfigParameterDefinition) o;
        return java.util.Objects.equals(this.parameterType, other.parameterType)
                && java.util.Objects.equals(this.parameterName, other.parameterName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.classFieldName, other.classFieldName)
                && java.util.Objects.equals(this.isStatic, other.isStatic)
                && java.util.Objects.equals(this.isClassFieldValue, other.isClassFieldValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.parameterType == null ? 43 : this.parameterType.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterName == null ? 43 : this.parameterName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result =
                (result * PRIME)
                        + (this.classFieldName == null ? 43 : this.classFieldName.hashCode());
        result = (result * PRIME) + (this.isStatic == null ? 43 : this.isStatic.hashCode());
        result =
                (result * PRIME)
                        + (this.isClassFieldValue == null ? 43 : this.isClassFieldValue.hashCode());
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
