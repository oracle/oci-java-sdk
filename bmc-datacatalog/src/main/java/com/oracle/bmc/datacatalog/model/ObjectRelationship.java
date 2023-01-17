/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details regarding a specific object and its relationship to the referencing object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ObjectRelationship.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectRelationship extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "relationshipType",
        "key",
        "name",
        "typeName",
        "typeKey",
        "timeCreated",
        "timeUpdated",
        "path",
        "parentKey",
        "parentPath"
    })
    public ObjectRelationship(
            String relationshipType,
            String key,
            String name,
            String typeName,
            String typeKey,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String path,
            String parentKey,
            String parentPath) {
        super();
        this.relationshipType = relationshipType;
        this.key = key;
        this.name = name;
        this.typeName = typeName;
        this.typeKey = typeKey;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.path = path;
        this.parentKey = parentKey;
        this.parentPath = parentPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of relationship with the referencing object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relationshipType")
        private String relationshipType;

        /**
         * Type of relationship with the referencing object.
         * @param relationshipType the value to set
         * @return this builder
         **/
        public Builder relationshipType(String relationshipType) {
            this.relationshipType = relationshipType;
            this.__explicitlySet__.add("relationshipType");
            return this;
        }
        /**
         * Unique id of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique id of the object.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Name of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the object.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Type name of the object. Type names can be found via the '/types' endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        /**
         * Type name of the object. Type names can be found via the '/types' endpoint.
         * @param typeName the value to set
         * @return this builder
         **/
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }
        /**
         * Type key of the object. Type keys can be found via the '/types' endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        /**
         * Type key of the object. Type keys can be found via the '/types' endpoint.
         * @param typeKey the value to set
         * @return this builder
         **/
        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            this.__explicitlySet__.add("typeKey");
            return this;
        }
        /**
         * The date and time the relationship was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the relationship was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The last time a change was made to this reference. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time a change was made to this reference. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Full path of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Full path of the object.
         * @param path the value to set
         * @return this builder
         **/
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * Key of the parent object for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
        private String parentKey;

        /**
         * Key of the parent object for the resource.
         * @param parentKey the value to set
         * @return this builder
         **/
        public Builder parentKey(String parentKey) {
            this.parentKey = parentKey;
            this.__explicitlySet__.add("parentKey");
            return this;
        }
        /**
         * Full path of the parent object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentPath")
        private String parentPath;

        /**
         * Full path of the parent object.
         * @param parentPath the value to set
         * @return this builder
         **/
        public Builder parentPath(String parentPath) {
            this.parentPath = parentPath;
            this.__explicitlySet__.add("parentPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectRelationship build() {
            ObjectRelationship model =
                    new ObjectRelationship(
                            this.relationshipType,
                            this.key,
                            this.name,
                            this.typeName,
                            this.typeKey,
                            this.timeCreated,
                            this.timeUpdated,
                            this.path,
                            this.parentKey,
                            this.parentPath);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectRelationship model) {
            if (model.wasPropertyExplicitlySet("relationshipType")) {
                this.relationshipType(model.getRelationshipType());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
            }
            if (model.wasPropertyExplicitlySet("typeKey")) {
                this.typeKey(model.getTypeKey());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("parentKey")) {
                this.parentKey(model.getParentKey());
            }
            if (model.wasPropertyExplicitlySet("parentPath")) {
                this.parentPath(model.getParentPath());
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
     * Type of relationship with the referencing object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relationshipType")
    private final String relationshipType;

    /**
     * Type of relationship with the referencing object.
     * @return the value
     **/
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Unique id of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique id of the object.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the object.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Type name of the object. Type names can be found via the '/types' endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    /**
     * Type name of the object. Type names can be found via the '/types' endpoint.
     * @return the value
     **/
    public String getTypeName() {
        return typeName;
    }

    /**
     * Type key of the object. Type keys can be found via the '/types' endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    /**
     * Type key of the object. Type keys can be found via the '/types' endpoint.
     * @return the value
     **/
    public String getTypeKey() {
        return typeKey;
    }

    /**
     * The date and time the relationship was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the relationship was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time a change was made to this reference. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time a change was made to this reference. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Full path of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Full path of the object.
     * @return the value
     **/
    public String getPath() {
        return path;
    }

    /**
     * Key of the parent object for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
    private final String parentKey;

    /**
     * Key of the parent object for the resource.
     * @return the value
     **/
    public String getParentKey() {
        return parentKey;
    }

    /**
     * Full path of the parent object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentPath")
    private final String parentPath;

    /**
     * Full path of the parent object.
     * @return the value
     **/
    public String getParentPath() {
        return parentPath;
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
        sb.append("ObjectRelationship(");
        sb.append("super=").append(super.toString());
        sb.append("relationshipType=").append(String.valueOf(this.relationshipType));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", parentKey=").append(String.valueOf(this.parentKey));
        sb.append(", parentPath=").append(String.valueOf(this.parentPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectRelationship)) {
            return false;
        }

        ObjectRelationship other = (ObjectRelationship) o;
        return java.util.Objects.equals(this.relationshipType, other.relationshipType)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.parentKey, other.parentKey)
                && java.util.Objects.equals(this.parentPath, other.parentPath)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.relationshipType == null ? 43 : this.relationshipType.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.parentKey == null ? 43 : this.parentKey.hashCode());
        result = (result * PRIME) + (this.parentPath == null ? 43 : this.parentPath.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
