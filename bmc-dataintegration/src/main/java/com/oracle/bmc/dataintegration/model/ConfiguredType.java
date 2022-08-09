/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A {@code ConfiguredType} represents a type that has built-in configuration to the type itself. An example is a {@code SSN} type whose basic type is {@code VARCHAR}, but the type itself also has a built-in configuration like length=10.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ConfiguredType.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConfiguredType extends BaseType {
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
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
         * A wrapped type, may be a string or a BaseType.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("wrappedType")
        private Object wrappedType;

        /**
         * A wrapped type, may be a string or a BaseType.
         * @param wrappedType the value to set
         * @return this builder
         **/
        public Builder wrappedType(Object wrappedType) {
            this.wrappedType = wrappedType;
            this.__explicitlySet__.add("wrappedType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configDefinition")
        private ConfigDefinition configDefinition;

        public Builder configDefinition(ConfigDefinition configDefinition) {
            this.configDefinition = configDefinition;
            this.__explicitlySet__.add("configDefinition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfiguredType build() {
            ConfiguredType model =
                    new ConfiguredType(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.objectStatus,
                            this.description,
                            this.wrappedType,
                            this.configValues,
                            this.configDefinition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfiguredType model) {
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
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("wrappedType")) {
                this.wrappedType(model.getWrappedType());
            }
            if (model.wasPropertyExplicitlySet("configValues")) {
                this.configValues(model.getConfigValues());
            }
            if (model.wasPropertyExplicitlySet("configDefinition")) {
                this.configDefinition(model.getConfigDefinition());
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
    public ConfiguredType(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectStatus,
            String description,
            Object wrappedType,
            ConfigValues configValues,
            ConfigDefinition configDefinition) {
        super(key, modelVersion, parentRef, name, objectStatus, description);
        this.wrappedType = wrappedType;
        this.configValues = configValues;
        this.configDefinition = configDefinition;
    }

    /**
     * A wrapped type, may be a string or a BaseType.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wrappedType")
    private final Object wrappedType;

    /**
     * A wrapped type, may be a string or a BaseType.
     * @return the value
     **/
    public Object getWrappedType() {
        return wrappedType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    private final ConfigValues configValues;

    public ConfigValues getConfigValues() {
        return configValues;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configDefinition")
    private final ConfigDefinition configDefinition;

    public ConfigDefinition getConfigDefinition() {
        return configDefinition;
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
        sb.append("ConfiguredType(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", wrappedType=").append(String.valueOf(this.wrappedType));
        sb.append(", configValues=").append(String.valueOf(this.configValues));
        sb.append(", configDefinition=").append(String.valueOf(this.configDefinition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfiguredType)) {
            return false;
        }

        ConfiguredType other = (ConfiguredType) o;
        return java.util.Objects.equals(this.wrappedType, other.wrappedType)
                && java.util.Objects.equals(this.configValues, other.configValues)
                && java.util.Objects.equals(this.configDefinition, other.configDefinition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.wrappedType == null ? 43 : this.wrappedType.hashCode());
        result = (result * PRIME) + (this.configValues == null ? 43 : this.configValues.hashCode());
        result =
                (result * PRIME)
                        + (this.configDefinition == null ? 43 : this.configDefinition.hashCode());
        return result;
    }
}
