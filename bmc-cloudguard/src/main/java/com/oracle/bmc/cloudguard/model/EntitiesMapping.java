/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Parameters for entities mapping to data source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EntitiesMapping.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EntitiesMapping
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "queryField", "entityType"})
    public EntitiesMapping(String displayName, String queryField, EntityType entityType) {
        super();
        this.displayName = displayName;
        this.queryField = queryField;
        this.entityType = entityType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Display name of the entity */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the entity
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The entity value mapped to a data source query */
        @com.fasterxml.jackson.annotation.JsonProperty("queryField")
        private String queryField;

        /**
         * The entity value mapped to a data source query
         *
         * @param queryField the value to set
         * @return this builder
         */
        public Builder queryField(String queryField) {
            this.queryField = queryField;
            this.__explicitlySet__.add("queryField");
            return this;
        }
        /** Type of entity */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private EntityType entityType;

        /**
         * Type of entity
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(EntityType entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntitiesMapping build() {
            EntitiesMapping model =
                    new EntitiesMapping(this.displayName, this.queryField, this.entityType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntitiesMapping model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("queryField")) {
                this.queryField(model.getQueryField());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
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

    /** Display name of the entity */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the entity
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The entity value mapped to a data source query */
    @com.fasterxml.jackson.annotation.JsonProperty("queryField")
    private final String queryField;

    /**
     * The entity value mapped to a data source query
     *
     * @return the value
     */
    public String getQueryField() {
        return queryField;
    }

    /** Type of entity */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final EntityType entityType;

    /**
     * Type of entity
     *
     * @return the value
     */
    public EntityType getEntityType() {
        return entityType;
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
        sb.append("EntitiesMapping(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", queryField=").append(String.valueOf(this.queryField));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntitiesMapping)) {
            return false;
        }

        EntitiesMapping other = (EntitiesMapping) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.queryField, other.queryField)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.queryField == null ? 43 : this.queryField.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
