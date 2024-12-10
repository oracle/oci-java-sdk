/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Entities referenced by top level customization.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CustomizationReferencedEntities.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomizationReferencedEntities
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"alias", "id", "entityType"})
    public CustomizationReferencedEntities(String alias, String id, String entityType) {
        super();
        this.alias = alias;
        this.id = id;
        this.entityType = entityType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Alias of default referenced Customization for given entityType
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * Alias of default referenced Customization for given entityType
         * @param alias the value to set
         * @return this builder
         **/
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }
        /**
         * Customization Id of default referenced Customization for given entityType
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Customization Id of default referenced Customization for given entityType
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Customization Entity Type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * Customization Entity Type
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomizationReferencedEntities build() {
            CustomizationReferencedEntities model =
                    new CustomizationReferencedEntities(this.alias, this.id, this.entityType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomizationReferencedEntities model) {
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
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

    /**
     * Alias of default referenced Customization for given entityType
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * Alias of default referenced Customization for given entityType
     * @return the value
     **/
    public String getAlias() {
        return alias;
    }

    /**
     * Customization Id of default referenced Customization for given entityType
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Customization Id of default referenced Customization for given entityType
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Customization Entity Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * Customization Entity Type
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
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
        sb.append("CustomizationReferencedEntities(");
        sb.append("super=").append(super.toString());
        sb.append("alias=").append(String.valueOf(this.alias));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomizationReferencedEntities)) {
            return false;
        }

        CustomizationReferencedEntities other = (CustomizationReferencedEntities) o;
        return java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
