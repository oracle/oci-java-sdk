/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * List of entities of a given type, to be used to train a customization. Note: If multiple
 * EntityLists are provided, a separate Customization resource will be created for each EntityList.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EntityList.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EntityList extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"alias", "id", "entityType", "entities"})
    public EntityList(String alias, String id, String entityType, java.util.List<Entity> entities) {
        super();
        this.alias = alias;
        this.id = id;
        this.entityType = entityType;
        this.entities = entities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Alias of existing customization or to associate with new customization created from
         * entityList.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * Alias of existing customization or to associate with new customization created from
         * entityList.
         *
         * @param alias the value to set
         * @return this builder
         */
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }
        /** Entity type OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Entity type OCID
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Entity Type */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * Entity Type
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * List of entities such as names, words or phrases matching the given entityType to add
         * recognition support for
         */
        @com.fasterxml.jackson.annotation.JsonProperty("entities")
        private java.util.List<Entity> entities;

        /**
         * List of entities such as names, words or phrases matching the given entityType to add
         * recognition support for
         *
         * @param entities the value to set
         * @return this builder
         */
        public Builder entities(java.util.List<Entity> entities) {
            this.entities = entities;
            this.__explicitlySet__.add("entities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntityList build() {
            EntityList model = new EntityList(this.alias, this.id, this.entityType, this.entities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntityList model) {
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("entities")) {
                this.entities(model.getEntities());
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

    /**
     * Alias of existing customization or to associate with new customization created from
     * entityList.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * Alias of existing customization or to associate with new customization created from
     * entityList.
     *
     * @return the value
     */
    public String getAlias() {
        return alias;
    }

    /** Entity type OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Entity type OCID
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Entity Type */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * Entity Type
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * List of entities such as names, words or phrases matching the given entityType to add
     * recognition support for
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entities")
    private final java.util.List<Entity> entities;

    /**
     * List of entities such as names, words or phrases matching the given entityType to add
     * recognition support for
     *
     * @return the value
     */
    public java.util.List<Entity> getEntities() {
        return entities;
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
        sb.append("EntityList(");
        sb.append("super=").append(super.toString());
        sb.append("alias=").append(String.valueOf(this.alias));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", entities=").append(String.valueOf(this.entities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntityList)) {
            return false;
        }

        EntityList other = (EntityList) o;
        return java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.entities, other.entities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.entities == null ? 43 : this.entities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
