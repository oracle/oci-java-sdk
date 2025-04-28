/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The SQL entity details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateEntityShapeFromSQL.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateEntityShapeFromSQL extends CreateEntityShapeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The object key. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The object key.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The object's model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
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
        /**
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Detailed description for the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description for the object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The version of the object that is used to track changes in the object instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * The version of the object that is used to track changes in the object instance.
         *
         * @param objectVersion the value to set
         * @return this builder
         */
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /** The external key for the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        /**
         * The external key for the object.
         *
         * @param externalKey the value to set
         * @return this builder
         */
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private Shape shape;

        public Builder shape(Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The shape ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeId")
        private String shapeId;

        /**
         * The shape ID.
         *
         * @param shapeId the value to set
         * @return this builder
         */
        public Builder shapeId(String shapeId) {
            this.shapeId = shapeId;
            this.__explicitlySet__.add("shapeId");
            return this;
        }
        /** The entity type. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private EntityType entityType;

        /**
         * The entity type.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(EntityType entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /** Specifies other type label. */
        @com.fasterxml.jackson.annotation.JsonProperty("otherTypeLabel")
        private String otherTypeLabel;

        /**
         * Specifies other type label.
         *
         * @param otherTypeLabel the value to set
         * @return this builder
         */
        public Builder otherTypeLabel(String otherTypeLabel) {
            this.otherTypeLabel = otherTypeLabel;
            this.__explicitlySet__.add("otherTypeLabel");
            return this;
        }
        /** An array of unique keys. */
        @com.fasterxml.jackson.annotation.JsonProperty("uniqueKeys")
        private java.util.List<UniqueKey> uniqueKeys;

        /**
         * An array of unique keys.
         *
         * @param uniqueKeys the value to set
         * @return this builder
         */
        public Builder uniqueKeys(java.util.List<UniqueKey> uniqueKeys) {
            this.uniqueKeys = uniqueKeys;
            this.__explicitlySet__.add("uniqueKeys");
            return this;
        }
        /** An array of foreign keys. */
        @com.fasterxml.jackson.annotation.JsonProperty("foreignKeys")
        private java.util.List<ForeignKey> foreignKeys;

        /**
         * An array of foreign keys.
         *
         * @param foreignKeys the value to set
         * @return this builder
         */
        public Builder foreignKeys(java.util.List<ForeignKey> foreignKeys) {
            this.foreignKeys = foreignKeys;
            this.__explicitlySet__.add("foreignKeys");
            return this;
        }
        /** The resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The resource name.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataFormat")
        private DataFormat dataFormat;

        public Builder dataFormat(DataFormat dataFormat) {
            this.dataFormat = dataFormat;
            this.__explicitlySet__.add("dataFormat");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         *
         * @param objectStatus the value to set
         * @return this builder
         */
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** sqlQuery */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlQuery")
        private String sqlQuery;

        /**
         * sqlQuery
         *
         * @param sqlQuery the value to set
         * @return this builder
         */
        public Builder sqlQuery(String sqlQuery) {
            this.sqlQuery = sqlQuery;
            this.__explicitlySet__.add("sqlQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateEntityShapeFromSQL build() {
            CreateEntityShapeFromSQL model =
                    new CreateEntityShapeFromSQL(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.externalKey,
                            this.shape,
                            this.shapeId,
                            this.entityType,
                            this.otherTypeLabel,
                            this.uniqueKeys,
                            this.foreignKeys,
                            this.resourceName,
                            this.dataFormat,
                            this.objectStatus,
                            this.identifier,
                            this.sqlQuery);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateEntityShapeFromSQL model) {
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
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeId")) {
                this.shapeId(model.getShapeId());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("otherTypeLabel")) {
                this.otherTypeLabel(model.getOtherTypeLabel());
            }
            if (model.wasPropertyExplicitlySet("uniqueKeys")) {
                this.uniqueKeys(model.getUniqueKeys());
            }
            if (model.wasPropertyExplicitlySet("foreignKeys")) {
                this.foreignKeys(model.getForeignKeys());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("dataFormat")) {
                this.dataFormat(model.getDataFormat());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("sqlQuery")) {
                this.sqlQuery(model.getSqlQuery());
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

    @Deprecated
    public CreateEntityShapeFromSQL(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            String externalKey,
            Shape shape,
            String shapeId,
            EntityType entityType,
            String otherTypeLabel,
            java.util.List<UniqueKey> uniqueKeys,
            java.util.List<ForeignKey> foreignKeys,
            String resourceName,
            DataFormat dataFormat,
            Integer objectStatus,
            String identifier,
            String sqlQuery) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.externalKey = externalKey;
        this.shape = shape;
        this.shapeId = shapeId;
        this.entityType = entityType;
        this.otherTypeLabel = otherTypeLabel;
        this.uniqueKeys = uniqueKeys;
        this.foreignKeys = foreignKeys;
        this.resourceName = resourceName;
        this.dataFormat = dataFormat;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.sqlQuery = sqlQuery;
    }

    /** The object key. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The object key.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The object's model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Detailed description for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description for the object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The version of the object that is used to track changes in the object instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     *
     * @return the value
     */
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /** The external key for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * The external key for the object.
     *
     * @return the value
     */
    public String getExternalKey() {
        return externalKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final Shape shape;

    public Shape getShape() {
        return shape;
    }

    /** The shape ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeId")
    private final String shapeId;

    /**
     * The shape ID.
     *
     * @return the value
     */
    public String getShapeId() {
        return shapeId;
    }

    /** The entity type. */
    public enum EntityType implements com.oracle.bmc.http.internal.BmcEnum {
        Table("TABLE"),
        View("VIEW"),
        File("FILE"),
        Sql("SQL"),
        ;

        private final String value;
        private static java.util.Map<String, EntityType> map;

        static {
            map = new java.util.HashMap<>();
            for (EntityType v : EntityType.values()) {
                map.put(v.getValue(), v);
            }
        }

        EntityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EntityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid EntityType: " + key);
        }
    };
    /** The entity type. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final EntityType entityType;

    /**
     * The entity type.
     *
     * @return the value
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /** Specifies other type label. */
    @com.fasterxml.jackson.annotation.JsonProperty("otherTypeLabel")
    private final String otherTypeLabel;

    /**
     * Specifies other type label.
     *
     * @return the value
     */
    public String getOtherTypeLabel() {
        return otherTypeLabel;
    }

    /** An array of unique keys. */
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueKeys")
    private final java.util.List<UniqueKey> uniqueKeys;

    /**
     * An array of unique keys.
     *
     * @return the value
     */
    public java.util.List<UniqueKey> getUniqueKeys() {
        return uniqueKeys;
    }

    /** An array of foreign keys. */
    @com.fasterxml.jackson.annotation.JsonProperty("foreignKeys")
    private final java.util.List<ForeignKey> foreignKeys;

    /**
     * An array of foreign keys.
     *
     * @return the value
     */
    public java.util.List<ForeignKey> getForeignKeys() {
        return foreignKeys;
    }

    /** The resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The resource name.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataFormat")
    private final DataFormat dataFormat;

    public DataFormat getDataFormat() {
        return dataFormat;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     *
     * @return the value
     */
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** sqlQuery */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlQuery")
    private final String sqlQuery;

    /**
     * sqlQuery
     *
     * @return the value
     */
    public String getSqlQuery() {
        return sqlQuery;
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
        sb.append("CreateEntityShapeFromSQL(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeId=").append(String.valueOf(this.shapeId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", otherTypeLabel=").append(String.valueOf(this.otherTypeLabel));
        sb.append(", uniqueKeys=").append(String.valueOf(this.uniqueKeys));
        sb.append(", foreignKeys=").append(String.valueOf(this.foreignKeys));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", dataFormat=").append(String.valueOf(this.dataFormat));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", sqlQuery=").append(String.valueOf(this.sqlQuery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateEntityShapeFromSQL)) {
            return false;
        }

        CreateEntityShapeFromSQL other = (CreateEntityShapeFromSQL) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeId, other.shapeId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.otherTypeLabel, other.otherTypeLabel)
                && java.util.Objects.equals(this.uniqueKeys, other.uniqueKeys)
                && java.util.Objects.equals(this.foreignKeys, other.foreignKeys)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.dataFormat, other.dataFormat)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.sqlQuery, other.sqlQuery)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeId == null ? 43 : this.shapeId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.otherTypeLabel == null ? 43 : this.otherTypeLabel.hashCode());
        result = (result * PRIME) + (this.uniqueKeys == null ? 43 : this.uniqueKeys.hashCode());
        result = (result * PRIME) + (this.foreignKeys == null ? 43 : this.foreignKeys.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.dataFormat == null ? 43 : this.dataFormat.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.sqlQuery == null ? 43 : this.sqlQuery.hashCode());
        return result;
    }
}
