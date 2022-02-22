/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The table entity data entity.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataEntityFromTableEntityDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DataEntityFromTableEntityDetails extends DataEntityDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

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

        @com.fasterxml.jackson.annotation.JsonProperty("shapeId")
        private String shapeId;

        public Builder shapeId(String shapeId) {
            this.shapeId = shapeId;
            this.__explicitlySet__.add("shapeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private EntityType entityType;

        public Builder entityType(EntityType entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("otherTypeLabel")
        private String otherTypeLabel;

        public Builder otherTypeLabel(String otherTypeLabel) {
            this.otherTypeLabel = otherTypeLabel;
            this.__explicitlySet__.add("otherTypeLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uniqueKeys")
        private java.util.List<UniqueKey> uniqueKeys;

        public Builder uniqueKeys(java.util.List<UniqueKey> uniqueKeys) {
            this.uniqueKeys = uniqueKeys;
            this.__explicitlySet__.add("uniqueKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("foreignKeys")
        private java.util.List<ForeignKey> foreignKeys;

        public Builder foreignKeys(java.util.List<ForeignKey> foreignKeys) {
            this.foreignKeys = foreignKeys;
            this.__explicitlySet__.add("foreignKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataEntityFromTableEntityDetails build() {
            DataEntityFromTableEntityDetails __instance__ =
                    new DataEntityFromTableEntityDetails(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            externalKey,
                            shape,
                            shapeId,
                            entityType,
                            otherTypeLabel,
                            uniqueKeys,
                            foreignKeys,
                            resourceName,
                            objectStatus,
                            identifier);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataEntityFromTableEntityDetails o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .externalKey(o.getExternalKey())
                            .shape(o.getShape())
                            .shapeId(o.getShapeId())
                            .entityType(o.getEntityType())
                            .otherTypeLabel(o.getOtherTypeLabel())
                            .uniqueKeys(o.getUniqueKeys())
                            .foreignKeys(o.getForeignKeys())
                            .resourceName(o.getResourceName())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public DataEntityFromTableEntityDetails(
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
            Integer objectStatus,
            String identifier) {
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
        this.objectStatus = objectStatus;
        this.identifier = identifier;
    }

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
     * Detailed description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

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
        DataStore("DATA_STORE"),
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
     * Value can only contain upper case letters, underscore and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
