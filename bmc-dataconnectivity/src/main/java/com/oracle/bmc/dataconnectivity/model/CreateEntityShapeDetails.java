/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The data entity shape object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = CreateEntityShapeDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateEntityShapeFromDataStore.class,
            name = "DATA_STORE_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateEntityShapeFromMessage.class,
            name = "MESSAGE_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateEntityShapeFromTable.class,
            name = "TABLE_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateEntityShapeFromSQL.class,
            name = "SQL_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateEntityShapeFromFile.class,
            name = "FILE_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateEntityShapeFromView.class,
            name = "VIEW_ENTITY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class CreateEntityShapeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "parentRef",
        "name",
        "objectVersion",
        "externalKey",
        "shape",
        "shapeId",
        "entityType",
        "otherTypeLabel",
        "uniqueKeys",
        "foreignKeys",
        "resourceName",
        "objectStatus",
        "identifier",
        "types",
        "entityProperties"
    })
    protected CreateEntityShapeDetails(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectVersion,
            String externalKey,
            Shape shape,
            String shapeId,
            EntityType entityType,
            String otherTypeLabel,
            java.util.List<UniqueKey> uniqueKeys,
            java.util.List<ForeignKey> foreignKeys,
            String resourceName,
            Integer objectStatus,
            String identifier,
            TypeLibrary types,
            java.util.Map<String, String> entityProperties) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.objectVersion = objectVersion;
        this.externalKey = externalKey;
        this.shape = shape;
        this.shapeId = shapeId;
        this.entityType = entityType;
        this.otherTypeLabel = otherTypeLabel;
        this.uniqueKeys = uniqueKeys;
        this.foreignKeys = foreignKeys;
        this.resourceName = resourceName;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.types = types;
        this.entityProperties = entityProperties;
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

    /** The model version of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of the object.
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
     * Free form text without any restriction on the permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on the permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
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

    /** The external key of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * The external key of the object.
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
        DataStore("DATA_STORE"),
        Message("MESSAGE"),
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
     * Value can only contain upper case letters, underscore, and numbers. It should begin with an
     * upper case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with an
     * upper case letter or underscore. The value can be modified.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("types")
    private final TypeLibrary types;

    public TypeLibrary getTypes() {
        return types;
    }

    /** Map<String, String> for entity properties */
    @com.fasterxml.jackson.annotation.JsonProperty("entityProperties")
    private final java.util.Map<String, String> entityProperties;

    /**
     * Map<String, String> for entity properties
     *
     * @return the value
     */
    public java.util.Map<String, String> getEntityProperties() {
        return entityProperties;
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
        sb.append("CreateEntityShapeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", shapeId=").append(String.valueOf(this.shapeId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", otherTypeLabel=").append(String.valueOf(this.otherTypeLabel));
        sb.append(", uniqueKeys=").append(String.valueOf(this.uniqueKeys));
        sb.append(", foreignKeys=").append(String.valueOf(this.foreignKeys));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", types=").append(String.valueOf(this.types));
        sb.append(", entityProperties=").append(String.valueOf(this.entityProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateEntityShapeDetails)) {
            return false;
        }

        CreateEntityShapeDetails other = (CreateEntityShapeDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeId, other.shapeId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.otherTypeLabel, other.otherTypeLabel)
                && java.util.Objects.equals(this.uniqueKeys, other.uniqueKeys)
                && java.util.Objects.equals(this.foreignKeys, other.foreignKeys)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.types, other.types)
                && java.util.Objects.equals(this.entityProperties, other.entityProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
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
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.types == null ? 43 : this.types.hashCode());
        result =
                (result * PRIME)
                        + (this.entityProperties == null ? 43 : this.entityProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The data entity type. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        ViewEntity("VIEW_ENTITY"),
        TableEntity("TABLE_ENTITY"),
        FileEntity("FILE_ENTITY"),
        DataStoreEntity("DATA_STORE_ENTITY"),
        SqlEntity("SQL_ENTITY"),
        MessageEntity("MESSAGE_ENTITY"),
        ;

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ModelType: " + key);
        }
    };
}
