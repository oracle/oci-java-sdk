/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The data entity shape object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType",
    defaultImpl = CreateEntityShapeDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateEntityShapeFromDataStore.class,
        name = "DATA_STORE_ENTITY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateEntityShapeFromTable.class,
        name = "TABLE_ENTITY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateEntityShapeFromSQL.class,
        name = "SQL_ENTITY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateEntityShapeFromFile.class,
        name = "FILE_ENTITY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateEntityShapeFromView.class,
        name = "VIEW_ENTITY"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateEntityShapeDetails {

    /**
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    Integer objectVersion;

    /**
     * The external key for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    String externalKey;

    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    Shape shape;

    /**
     * The shape ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeId")
    String shapeId;
    /**
     * The entity type.
     **/
    public enum EntityType {
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
    /**
     * The entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    EntityType entityType;

    /**
     * Specifies other type label.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("otherTypeLabel")
    String otherTypeLabel;

    /**
     * An array of unique keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uniqueKeys")
    java.util.List<UniqueKey> uniqueKeys;

    /**
     * An array of foreign keys.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("foreignKeys")
    java.util.List<ForeignKey> foreignKeys;

    /**
     * The resource name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    @com.fasterxml.jackson.annotation.JsonProperty("types")
    TypeLibrary types;

    /**
     * Map<String, String> for entity properties
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityProperties")
    java.util.Map<String, String> entityProperties;

    /**
     * The data entity type.
     **/
    public enum ModelType {
        ViewEntity("VIEW_ENTITY"),
        TableEntity("TABLE_ENTITY"),
        FileEntity("FILE_ENTITY"),
        DataStoreEntity("DATA_STORE_ENTITY"),
        SqlEntity("SQL_ENTITY"),
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
