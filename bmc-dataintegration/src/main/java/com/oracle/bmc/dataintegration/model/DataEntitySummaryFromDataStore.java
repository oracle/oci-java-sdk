/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The view entity data entity details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataEntitySummaryFromDataStore.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DataEntitySummaryFromDataStore extends DataEntitySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
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
        /** The external key for the object */
        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        /**
         * The external key for the object
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

        @com.fasterxml.jackson.annotation.JsonProperty("types")
        private TypeLibrary types;

        public Builder types(TypeLibrary types) {
            this.types = types;
            this.__explicitlySet__.add("types");
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
         * Value can only contain upper case letters, underscore and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore and numbers. It should begin with
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
        /** Query filter for the extract. It can be Null. */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private String filters;

        /**
         * Query filter for the extract. It can be Null.
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(String filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }
        /** It shows whether or not effective date is disabled */
        @com.fasterxml.jackson.annotation.JsonProperty("isEffectiveDateDisabled")
        private Boolean isEffectiveDateDisabled;

        /**
         * It shows whether or not effective date is disabled
         *
         * @param isEffectiveDateDisabled the value to set
         * @return this builder
         */
        public Builder isEffectiveDateDisabled(Boolean isEffectiveDateDisabled) {
            this.isEffectiveDateDisabled = isEffectiveDateDisabled;
            this.__explicitlySet__.add("isEffectiveDateDisabled");
            return this;
        }
        /** Is Flex data store. Metadata csv will be generated for flex data store */
        @com.fasterxml.jackson.annotation.JsonProperty("isFlexDataStore")
        private Boolean isFlexDataStore;

        /**
         * Is Flex data store. Metadata csv will be generated for flex data store
         *
         * @param isFlexDataStore the value to set
         * @return this builder
         */
        public Builder isFlexDataStore(Boolean isFlexDataStore) {
            this.isFlexDataStore = isFlexDataStore;
            this.__explicitlySet__.add("isFlexDataStore");
            return this;
        }
        /** Should the VO failure fail the whole batch? */
        @com.fasterxml.jackson.annotation.JsonProperty("isSilentError")
        private Boolean isSilentError;

        /**
         * Should the VO failure fail the whole batch?
         *
         * @param isSilentError the value to set
         * @return this builder
         */
        public Builder isSilentError(Boolean isSilentError) {
            this.isSilentError = isSilentError;
            this.__explicitlySet__.add("isSilentError");
            return this;
        }
        /** It shows whether the datastore supports Incremental Extract or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportsIncremental")
        private Boolean supportsIncremental;

        /**
         * It shows whether the datastore supports Incremental Extract or not.
         *
         * @param supportsIncremental the value to set
         * @return this builder
         */
        public Builder supportsIncremental(Boolean supportsIncremental) {
            this.supportsIncremental = supportsIncremental;
            this.__explicitlySet__.add("supportsIncremental");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataEntitySummaryFromDataStore build() {
            DataEntitySummaryFromDataStore model =
                    new DataEntitySummaryFromDataStore(
                            this.metadata,
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.externalKey,
                            this.shape,
                            this.shapeId,
                            this.types,
                            this.entityType,
                            this.otherTypeLabel,
                            this.uniqueKeys,
                            this.foreignKeys,
                            this.resourceName,
                            this.objectStatus,
                            this.identifier,
                            this.filters,
                            this.isEffectiveDateDisabled,
                            this.isFlexDataStore,
                            this.isSilentError,
                            this.supportsIncremental);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataEntitySummaryFromDataStore model) {
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
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
            if (model.wasPropertyExplicitlySet("types")) {
                this.types(model.getTypes());
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
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
            }
            if (model.wasPropertyExplicitlySet("isEffectiveDateDisabled")) {
                this.isEffectiveDateDisabled(model.getIsEffectiveDateDisabled());
            }
            if (model.wasPropertyExplicitlySet("isFlexDataStore")) {
                this.isFlexDataStore(model.getIsFlexDataStore());
            }
            if (model.wasPropertyExplicitlySet("isSilentError")) {
                this.isSilentError(model.getIsSilentError());
            }
            if (model.wasPropertyExplicitlySet("supportsIncremental")) {
                this.supportsIncremental(model.getSupportsIncremental());
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
    public DataEntitySummaryFromDataStore(
            ObjectMetadata metadata,
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            String externalKey,
            Shape shape,
            String shapeId,
            TypeLibrary types,
            EntityType entityType,
            String otherTypeLabel,
            java.util.List<UniqueKey> uniqueKeys,
            java.util.List<ForeignKey> foreignKeys,
            String resourceName,
            Integer objectStatus,
            String identifier,
            String filters,
            Boolean isEffectiveDateDisabled,
            Boolean isFlexDataStore,
            Boolean isSilentError,
            Boolean supportsIncremental) {
        super(metadata);
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.externalKey = externalKey;
        this.shape = shape;
        this.shapeId = shapeId;
        this.types = types;
        this.entityType = entityType;
        this.otherTypeLabel = otherTypeLabel;
        this.uniqueKeys = uniqueKeys;
        this.foreignKeys = foreignKeys;
        this.resourceName = resourceName;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.filters = filters;
        this.isEffectiveDateDisabled = isEffectiveDateDisabled;
        this.isFlexDataStore = isFlexDataStore;
        this.isSilentError = isSilentError;
        this.supportsIncremental = supportsIncremental;
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

    /** The external key for the object */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * The external key for the object
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

    @com.fasterxml.jackson.annotation.JsonProperty("types")
    private final TypeLibrary types;

    public TypeLibrary getTypes() {
        return types;
    }

    /** The entity type. */
    public enum EntityType implements com.oracle.bmc.http.internal.BmcEnum {
        Table("TABLE"),
        View("VIEW"),
        File("FILE"),
        Queue("QUEUE"),
        Stream("STREAM"),
        Other("OTHER"),
        DataStore("DATA_STORE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EntityType.class);

        private final String value;
        private static java.util.Map<String, EntityType> map;

        static {
            map = new java.util.HashMap<>();
            for (EntityType v : EntityType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'EntityType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
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
     * Value can only contain upper case letters, underscore and numbers. It should begin with upper
     * case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore and numbers. It should begin with upper
     * case letter or underscore. The value can be modified.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** Query filter for the extract. It can be Null. */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final String filters;

    /**
     * Query filter for the extract. It can be Null.
     *
     * @return the value
     */
    public String getFilters() {
        return filters;
    }

    /** It shows whether or not effective date is disabled */
    @com.fasterxml.jackson.annotation.JsonProperty("isEffectiveDateDisabled")
    private final Boolean isEffectiveDateDisabled;

    /**
     * It shows whether or not effective date is disabled
     *
     * @return the value
     */
    public Boolean getIsEffectiveDateDisabled() {
        return isEffectiveDateDisabled;
    }

    /** Is Flex data store. Metadata csv will be generated for flex data store */
    @com.fasterxml.jackson.annotation.JsonProperty("isFlexDataStore")
    private final Boolean isFlexDataStore;

    /**
     * Is Flex data store. Metadata csv will be generated for flex data store
     *
     * @return the value
     */
    public Boolean getIsFlexDataStore() {
        return isFlexDataStore;
    }

    /** Should the VO failure fail the whole batch? */
    @com.fasterxml.jackson.annotation.JsonProperty("isSilentError")
    private final Boolean isSilentError;

    /**
     * Should the VO failure fail the whole batch?
     *
     * @return the value
     */
    public Boolean getIsSilentError() {
        return isSilentError;
    }

    /** It shows whether the datastore supports Incremental Extract or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportsIncremental")
    private final Boolean supportsIncremental;

    /**
     * It shows whether the datastore supports Incremental Extract or not.
     *
     * @return the value
     */
    public Boolean getSupportsIncremental() {
        return supportsIncremental;
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
        sb.append("DataEntitySummaryFromDataStore(");
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
        sb.append(", types=").append(String.valueOf(this.types));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", otherTypeLabel=").append(String.valueOf(this.otherTypeLabel));
        sb.append(", uniqueKeys=").append(String.valueOf(this.uniqueKeys));
        sb.append(", foreignKeys=").append(String.valueOf(this.foreignKeys));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(", isEffectiveDateDisabled=")
                .append(String.valueOf(this.isEffectiveDateDisabled));
        sb.append(", isFlexDataStore=").append(String.valueOf(this.isFlexDataStore));
        sb.append(", isSilentError=").append(String.valueOf(this.isSilentError));
        sb.append(", supportsIncremental=").append(String.valueOf(this.supportsIncremental));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataEntitySummaryFromDataStore)) {
            return false;
        }

        DataEntitySummaryFromDataStore other = (DataEntitySummaryFromDataStore) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeId, other.shapeId)
                && java.util.Objects.equals(this.types, other.types)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.otherTypeLabel, other.otherTypeLabel)
                && java.util.Objects.equals(this.uniqueKeys, other.uniqueKeys)
                && java.util.Objects.equals(this.foreignKeys, other.foreignKeys)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.filters, other.filters)
                && java.util.Objects.equals(
                        this.isEffectiveDateDisabled, other.isEffectiveDateDisabled)
                && java.util.Objects.equals(this.isFlexDataStore, other.isFlexDataStore)
                && java.util.Objects.equals(this.isSilentError, other.isSilentError)
                && java.util.Objects.equals(this.supportsIncremental, other.supportsIncremental)
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
        result = (result * PRIME) + (this.types == null ? 43 : this.types.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.otherTypeLabel == null ? 43 : this.otherTypeLabel.hashCode());
        result = (result * PRIME) + (this.uniqueKeys == null ? 43 : this.uniqueKeys.hashCode());
        result = (result * PRIME) + (this.foreignKeys == null ? 43 : this.foreignKeys.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result =
                (result * PRIME)
                        + (this.isEffectiveDateDisabled == null
                                ? 43
                                : this.isEffectiveDateDisabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isFlexDataStore == null ? 43 : this.isFlexDataStore.hashCode());
        result =
                (result * PRIME)
                        + (this.isSilentError == null ? 43 : this.isSilentError.hashCode());
        result =
                (result * PRIME)
                        + (this.supportsIncremental == null
                                ? 43
                                : this.supportsIncremental.hashCode());
        return result;
    }
}
