/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NativeShapeField.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NativeShapeField extends TypedObject {
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
                            key,
                            modelVersion,
                            parentRef,
                            configValues,
                            objectStatus,
                            name,
                            description,
                            type,
                            position,
                            defaultValueString,
                            isMandatory);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NativeShapeField o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .configValues(o.getConfigValues())
                            .objectStatus(o.getObjectStatus())
                            .name(o.getName())
                            .description(o.getDescription())
                            .type(o.getType())
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

    @Deprecated
    public NativeShapeField(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description,
            Object type,
            Integer position,
            String defaultValueString,
            Boolean isMandatory) {
        super(key, modelVersion, parentRef, configValues, objectStatus, name, description);
        this.type = type;
        this.position = position;
        this.defaultValueString = defaultValueString;
        this.isMandatory = isMandatory;
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
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", type=").append(String.valueOf(this.type));
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
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.defaultValueString, other.defaultValueString)
                && java.util.Objects.equals(this.isMandatory, other.isMandatory)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
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
