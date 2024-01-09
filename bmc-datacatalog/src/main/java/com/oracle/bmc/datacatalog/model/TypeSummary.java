/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary data catalog type information. All types are statically defined in the system and are
 * immutable. It isn't possible to create new types or update existing types via the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TypeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TypeSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "name",
        "description",
        "catalogId",
        "typeCategory",
        "uri",
        "lifecycleState",
        "parentTypeKey",
        "parentTypeName"
    })
    public TypeSummary(
            String key,
            String name,
            String description,
            String catalogId,
            String typeCategory,
            String uri,
            LifecycleState lifecycleState,
            String parentTypeKey,
            String parentTypeName) {
        super();
        this.key = key;
        this.name = name;
        this.description = description;
        this.catalogId = catalogId;
        this.typeCategory = typeCategory;
        this.uri = uri;
        this.lifecycleState = lifecycleState;
        this.parentTypeKey = parentTypeKey;
        this.parentTypeName = parentTypeName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique type key that is immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique type key that is immutable.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The immutable name of the type. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The immutable name of the type.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Detailed description of the type. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the type.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The data catalog's OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        /**
         * The data catalog's OCID.
         *
         * @param catalogId the value to set
         * @return this builder
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }
        /** Indicates the category this type belongs to. For instance, data assets, connections. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeCategory")
        private String typeCategory;

        /**
         * Indicates the category this type belongs to. For instance, data assets, connections.
         *
         * @param typeCategory the value to set
         * @return this builder
         */
        public Builder typeCategory(String typeCategory) {
            this.typeCategory = typeCategory;
            this.__explicitlySet__.add("typeCategory");
            return this;
        }
        /** URI to the type instance in the API. */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the type instance in the API.
         *
         * @param uri the value to set
         * @return this builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /** State of the folder. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * State of the folder.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Unique key of the parent type. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentTypeKey")
        private String parentTypeKey;

        /**
         * Unique key of the parent type.
         *
         * @param parentTypeKey the value to set
         * @return this builder
         */
        public Builder parentTypeKey(String parentTypeKey) {
            this.parentTypeKey = parentTypeKey;
            this.__explicitlySet__.add("parentTypeKey");
            return this;
        }
        /** Name of the parent type. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentTypeName")
        private String parentTypeName;

        /**
         * Name of the parent type.
         *
         * @param parentTypeName the value to set
         * @return this builder
         */
        public Builder parentTypeName(String parentTypeName) {
            this.parentTypeName = parentTypeName;
            this.__explicitlySet__.add("parentTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TypeSummary build() {
            TypeSummary model =
                    new TypeSummary(
                            this.key,
                            this.name,
                            this.description,
                            this.catalogId,
                            this.typeCategory,
                            this.uri,
                            this.lifecycleState,
                            this.parentTypeKey,
                            this.parentTypeName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TypeSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("catalogId")) {
                this.catalogId(model.getCatalogId());
            }
            if (model.wasPropertyExplicitlySet("typeCategory")) {
                this.typeCategory(model.getTypeCategory());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("parentTypeKey")) {
                this.parentTypeKey(model.getParentTypeKey());
            }
            if (model.wasPropertyExplicitlySet("parentTypeName")) {
                this.parentTypeName(model.getParentTypeName());
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

    /** Unique type key that is immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique type key that is immutable.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The immutable name of the type. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The immutable name of the type.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Detailed description of the type. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the type.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The data catalog's OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    /**
     * The data catalog's OCID.
     *
     * @return the value
     */
    public String getCatalogId() {
        return catalogId;
    }

    /** Indicates the category this type belongs to. For instance, data assets, connections. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeCategory")
    private final String typeCategory;

    /**
     * Indicates the category this type belongs to. For instance, data assets, connections.
     *
     * @return the value
     */
    public String getTypeCategory() {
        return typeCategory;
    }

    /** URI to the type instance in the API. */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the type instance in the API.
     *
     * @return the value
     */
    public String getUri() {
        return uri;
    }

    /** State of the folder. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * State of the folder.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Unique key of the parent type. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentTypeKey")
    private final String parentTypeKey;

    /**
     * Unique key of the parent type.
     *
     * @return the value
     */
    public String getParentTypeKey() {
        return parentTypeKey;
    }

    /** Name of the parent type. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentTypeName")
    private final String parentTypeName;

    /**
     * Name of the parent type.
     *
     * @return the value
     */
    public String getParentTypeName() {
        return parentTypeName;
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
        sb.append("TypeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", typeCategory=").append(String.valueOf(this.typeCategory));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", parentTypeKey=").append(String.valueOf(this.parentTypeKey));
        sb.append(", parentTypeName=").append(String.valueOf(this.parentTypeName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TypeSummary)) {
            return false;
        }

        TypeSummary other = (TypeSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.typeCategory, other.typeCategory)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.parentTypeKey, other.parentTypeKey)
                && java.util.Objects.equals(this.parentTypeName, other.parentTypeName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.typeCategory == null ? 43 : this.typeCategory.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTypeKey == null ? 43 : this.parentTypeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.parentTypeName == null ? 43 : this.parentTypeName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
