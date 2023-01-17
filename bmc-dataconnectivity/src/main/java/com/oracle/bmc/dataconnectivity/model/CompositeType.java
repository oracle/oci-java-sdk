/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * A {@code CompositeType} represents a type that is composed of a list of sub-types, for example an {@code Address} type. The sub-types can be simple {@code DataType} or other {@code CompositeType} objects. Typically, a {@code CompositeType} may represent an arbitrarily deep hierarchy of types.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CompositeType.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CompositeType extends BaseType {
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

        @com.fasterxml.jackson.annotation.JsonProperty("parentType")
        private CompositeType parentType;

        public Builder parentType(CompositeType parentType) {
            this.parentType = parentType;
            this.__explicitlySet__.add("parentType");
            return this;
        }
        /**
         * An array of elements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("elements")
        private java.util.List<TypedObject> elements;

        /**
         * An array of elements.
         * @param elements the value to set
         * @return this builder
         **/
        public Builder elements(java.util.List<TypedObject> elements) {
            this.elements = elements;
            this.__explicitlySet__.add("elements");
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

        public CompositeType build() {
            CompositeType model =
                    new CompositeType(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.objectStatus,
                            this.description,
                            this.parentType,
                            this.elements,
                            this.configDefinition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompositeType model) {
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
            if (model.wasPropertyExplicitlySet("parentType")) {
                this.parentType(model.getParentType());
            }
            if (model.wasPropertyExplicitlySet("elements")) {
                this.elements(model.getElements());
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
    public CompositeType(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectStatus,
            String description,
            CompositeType parentType,
            java.util.List<TypedObject> elements,
            ConfigDefinition configDefinition) {
        super(key, modelVersion, parentRef, name, objectStatus, description);
        this.parentType = parentType;
        this.elements = elements;
        this.configDefinition = configDefinition;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentType")
    private final CompositeType parentType;

    public CompositeType getParentType() {
        return parentType;
    }

    /**
     * An array of elements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("elements")
    private final java.util.List<TypedObject> elements;

    /**
     * An array of elements.
     * @return the value
     **/
    public java.util.List<TypedObject> getElements() {
        return elements;
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
        sb.append("CompositeType(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", parentType=").append(String.valueOf(this.parentType));
        sb.append(", elements=").append(String.valueOf(this.elements));
        sb.append(", configDefinition=").append(String.valueOf(this.configDefinition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompositeType)) {
            return false;
        }

        CompositeType other = (CompositeType) o;
        return java.util.Objects.equals(this.parentType, other.parentType)
                && java.util.Objects.equals(this.elements, other.elements)
                && java.util.Objects.equals(this.configDefinition, other.configDefinition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.parentType == null ? 43 : this.parentType.hashCode());
        result = (result * PRIME) + (this.elements == null ? 43 : this.elements.hashCode());
        result =
                (result * PRIME)
                        + (this.configDefinition == null ? 43 : this.configDefinition.hashCode());
        return result;
    }
}
