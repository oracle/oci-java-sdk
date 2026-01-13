/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Object describing an individual element of object lineage. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LineageObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LineageObject extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "objectKey",
        "displayName",
        "description",
        "isIntraLineageAvailable",
        "parentKey",
        "parentPath",
        "timeCreated",
        "timeUpdated",
        "typeName",
        "typeKey",
        "properties"
    })
    public LineageObject(
            String objectKey,
            String displayName,
            String description,
            Boolean isIntraLineageAvailable,
            String parentKey,
            String parentPath,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String typeName,
            String typeKey,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.objectKey = objectKey;
        this.displayName = displayName;
        this.description = description;
        this.isIntraLineageAvailable = isIntraLineageAvailable;
        this.parentKey = parentKey;
        this.parentPath = parentPath;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.typeName = typeName;
        this.typeKey = typeKey;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Key of the object, such as an entity, about which this lineage applies. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectKey")
        private String objectKey;

        /**
         * Key of the object, such as an entity, about which this lineage applies.
         *
         * @param objectKey the value to set
         * @return this builder
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            this.__explicitlySet__.add("objectKey");
            return this;
        }
        /** Display name of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the object.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Detailed description of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Indicates if intra-lineage is available for this given object. If yes, drill-down can be
         * requested for this object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIntraLineageAvailable")
        private Boolean isIntraLineageAvailable;

        /**
         * Indicates if intra-lineage is available for this given object. If yes, drill-down can be
         * requested for this object.
         *
         * @param isIntraLineageAvailable the value to set
         * @return this builder
         */
        public Builder isIntraLineageAvailable(Boolean isIntraLineageAvailable) {
            this.isIntraLineageAvailable = isIntraLineageAvailable;
            this.__explicitlySet__.add("isIntraLineageAvailable");
            return this;
        }
        /** Key of the parent object for this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
        private String parentKey;

        /**
         * Key of the parent object for this object.
         *
         * @param parentKey the value to set
         * @return this builder
         */
        public Builder parentKey(String parentKey) {
            this.parentKey = parentKey;
            this.__explicitlySet__.add("parentKey");
            return this;
        }
        /** Full path of the parent object. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentPath")
        private String parentPath;

        /**
         * Full path of the parent object.
         *
         * @param parentPath the value to set
         * @return this builder
         */
        public Builder parentPath(String parentPath) {
            this.parentPath = parentPath;
            this.__explicitlySet__.add("parentPath");
            return this;
        }
        /**
         * The time that this object was created. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time that this object was created. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time that this object was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time that this object was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Type name of the object. Type keys can be found via the '/types' endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        /**
         * Type name of the object. Type keys can be found via the '/types' endpoint.
         *
         * @param typeName the value to set
         * @return this builder
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }
        /** Type key of the object. Type keys can be found via the '/types' endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
        private String typeKey;

        /**
         * Type key of the object. Type keys can be found via the '/types' endpoint.
         *
         * @param typeKey the value to set
         * @return this builder
         */
        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            this.__explicitlySet__.add("typeKey");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the entity type. Each
         * entity type definition defines it's set of required and optional properties. The map keys
         * are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most data entities have required properties
         * within the "default" category. Example: {@code {"properties": { "default": { "key1":
         * "value1"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the entity type. Each
         * entity type definition defines it's set of required and optional properties. The map keys
         * are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most data entities have required properties
         * within the "default" category. Example: {@code {"properties": { "default": { "key1":
         * "value1"}}}}
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LineageObject build() {
            LineageObject model =
                    new LineageObject(
                            this.objectKey,
                            this.displayName,
                            this.description,
                            this.isIntraLineageAvailable,
                            this.parentKey,
                            this.parentPath,
                            this.timeCreated,
                            this.timeUpdated,
                            this.typeName,
                            this.typeKey,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LineageObject model) {
            if (model.wasPropertyExplicitlySet("objectKey")) {
                this.objectKey(model.getObjectKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isIntraLineageAvailable")) {
                this.isIntraLineageAvailable(model.getIsIntraLineageAvailable());
            }
            if (model.wasPropertyExplicitlySet("parentKey")) {
                this.parentKey(model.getParentKey());
            }
            if (model.wasPropertyExplicitlySet("parentPath")) {
                this.parentPath(model.getParentPath());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
            }
            if (model.wasPropertyExplicitlySet("typeKey")) {
                this.typeKey(model.getTypeKey());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** Key of the object, such as an entity, about which this lineage applies. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectKey")
    private final String objectKey;

    /**
     * Key of the object, such as an entity, about which this lineage applies.
     *
     * @return the value
     */
    public String getObjectKey() {
        return objectKey;
    }

    /** Display name of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the object.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Detailed description of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Indicates if intra-lineage is available for this given object. If yes, drill-down can be
     * requested for this object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIntraLineageAvailable")
    private final Boolean isIntraLineageAvailable;

    /**
     * Indicates if intra-lineage is available for this given object. If yes, drill-down can be
     * requested for this object.
     *
     * @return the value
     */
    public Boolean getIsIntraLineageAvailable() {
        return isIntraLineageAvailable;
    }

    /** Key of the parent object for this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
    private final String parentKey;

    /**
     * Key of the parent object for this object.
     *
     * @return the value
     */
    public String getParentKey() {
        return parentKey;
    }

    /** Full path of the parent object. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentPath")
    private final String parentPath;

    /**
     * Full path of the parent object.
     *
     * @return the value
     */
    public String getParentPath() {
        return parentPath;
    }

    /**
     * The time that this object was created. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time that this object was created. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time that this object was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time that this object was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Type name of the object. Type keys can be found via the '/types' endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    /**
     * Type name of the object. Type keys can be found via the '/types' endpoint.
     *
     * @return the value
     */
    public String getTypeName() {
        return typeName;
    }

    /** Type key of the object. Type keys can be found via the '/types' endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeKey")
    private final String typeKey;

    /**
     * Type key of the object. Type keys can be found via the '/types' endpoint.
     *
     * @return the value
     */
    public String getTypeKey() {
        return typeKey;
    }

    /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity
     * type definition defines it's set of required and optional properties. The map keys are
     * category names and the values are maps of property name to property value. Every property is
     * contained inside of a category. Most data entities have required properties within the
     * "default" category. Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the entity type. Each entity
     * type definition defines it's set of required and optional properties. The map keys are
     * category names and the values are maps of property name to property value. Every property is
     * contained inside of a category. Most data entities have required properties within the
     * "default" category. Example: {@code {"properties": { "default": { "key1": "value1"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
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
        sb.append("LineageObject(");
        sb.append("super=").append(super.toString());
        sb.append("objectKey=").append(String.valueOf(this.objectKey));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isIntraLineageAvailable=")
                .append(String.valueOf(this.isIntraLineageAvailable));
        sb.append(", parentKey=").append(String.valueOf(this.parentKey));
        sb.append(", parentPath=").append(String.valueOf(this.parentPath));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append(", typeKey=").append(String.valueOf(this.typeKey));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LineageObject)) {
            return false;
        }

        LineageObject other = (LineageObject) o;
        return java.util.Objects.equals(this.objectKey, other.objectKey)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.isIntraLineageAvailable, other.isIntraLineageAvailable)
                && java.util.Objects.equals(this.parentKey, other.parentKey)
                && java.util.Objects.equals(this.parentPath, other.parentPath)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objectKey == null ? 43 : this.objectKey.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isIntraLineageAvailable == null
                                ? 43
                                : this.isIntraLineageAvailable.hashCode());
        result = (result * PRIME) + (this.parentKey == null ? 43 : this.parentKey.hashCode());
        result = (result * PRIME) + (this.parentPath == null ? 43 : this.parentPath.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
