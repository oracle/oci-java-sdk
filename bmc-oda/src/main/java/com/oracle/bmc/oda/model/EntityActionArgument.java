/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Argument of an entity action <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EntityActionArgument.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EntityActionArgument
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "type",
        "metaType",
        "naturalLanguageMapping",
        "isMultiValue",
        "entityName"
    })
    public EntityActionArgument(
            String name,
            EntityAttributeType type,
            String metaType,
            EntityActionArgumentNaturalLanguageMapping naturalLanguageMapping,
            Boolean isMultiValue,
            String entityName) {
        super();
        this.name = name;
        this.type = type;
        this.metaType = metaType;
        this.naturalLanguageMapping = naturalLanguageMapping;
        this.isMultiValue = isMultiValue;
        this.entityName = entityName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of an entity action argument */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of an entity action argument
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Type of an entity action argument */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private EntityAttributeType type;

        /**
         * Type of an entity action argument
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(EntityAttributeType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Metatype of an entity action argument */
        @com.fasterxml.jackson.annotation.JsonProperty("metaType")
        private String metaType;

        /**
         * Metatype of an entity action argument
         *
         * @param metaType the value to set
         * @return this builder
         */
        public Builder metaType(String metaType) {
            this.metaType = metaType;
            this.__explicitlySet__.add("metaType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
        private EntityActionArgumentNaturalLanguageMapping naturalLanguageMapping;

        public Builder naturalLanguageMapping(
                EntityActionArgumentNaturalLanguageMapping naturalLanguageMapping) {
            this.naturalLanguageMapping = naturalLanguageMapping;
            this.__explicitlySet__.add("naturalLanguageMapping");
            return this;
        }
        /** Is the entity action argument multi-value */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiValue")
        private Boolean isMultiValue;

        /**
         * Is the entity action argument multi-value
         *
         * @param isMultiValue the value to set
         * @return this builder
         */
        public Builder isMultiValue(Boolean isMultiValue) {
            this.isMultiValue = isMultiValue;
            this.__explicitlySet__.add("isMultiValue");
            return this;
        }
        /** Name of referenced entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * Name of referenced entity.
         *
         * @param entityName the value to set
         * @return this builder
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntityActionArgument build() {
            EntityActionArgument model =
                    new EntityActionArgument(
                            this.name,
                            this.type,
                            this.metaType,
                            this.naturalLanguageMapping,
                            this.isMultiValue,
                            this.entityName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityActionArgument model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("metaType")) {
                this.metaType(model.getMetaType());
            }
            if (model.wasPropertyExplicitlySet("naturalLanguageMapping")) {
                this.naturalLanguageMapping(model.getNaturalLanguageMapping());
            }
            if (model.wasPropertyExplicitlySet("isMultiValue")) {
                this.isMultiValue(model.getIsMultiValue());
            }
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
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

    /** Name of an entity action argument */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of an entity action argument
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Type of an entity action argument */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final EntityAttributeType type;

    /**
     * Type of an entity action argument
     *
     * @return the value
     */
    public EntityAttributeType getType() {
        return type;
    }

    /** Metatype of an entity action argument */
    @com.fasterxml.jackson.annotation.JsonProperty("metaType")
    private final String metaType;

    /**
     * Metatype of an entity action argument
     *
     * @return the value
     */
    public String getMetaType() {
        return metaType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("naturalLanguageMapping")
    private final EntityActionArgumentNaturalLanguageMapping naturalLanguageMapping;

    public EntityActionArgumentNaturalLanguageMapping getNaturalLanguageMapping() {
        return naturalLanguageMapping;
    }

    /** Is the entity action argument multi-value */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValue")
    private final Boolean isMultiValue;

    /**
     * Is the entity action argument multi-value
     *
     * @return the value
     */
    public Boolean getIsMultiValue() {
        return isMultiValue;
    }

    /** Name of referenced entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * Name of referenced entity.
     *
     * @return the value
     */
    public String getEntityName() {
        return entityName;
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
        sb.append("EntityActionArgument(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", metaType=").append(String.valueOf(this.metaType));
        sb.append(", naturalLanguageMapping=").append(String.valueOf(this.naturalLanguageMapping));
        sb.append(", isMultiValue=").append(String.valueOf(this.isMultiValue));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityActionArgument)) {
            return false;
        }

        EntityActionArgument other = (EntityActionArgument) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.metaType, other.metaType)
                && java.util.Objects.equals(
                        this.naturalLanguageMapping, other.naturalLanguageMapping)
                && java.util.Objects.equals(this.isMultiValue, other.isMultiValue)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.metaType == null ? 43 : this.metaType.hashCode());
        result =
                (result * PRIME)
                        + (this.naturalLanguageMapping == null
                                ? 43
                                : this.naturalLanguageMapping.hashCode());
        result = (result * PRIME) + (this.isMultiValue == null ? 43 : this.isMultiValue.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
