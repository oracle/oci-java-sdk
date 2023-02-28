/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The data store entity details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateEntityShapeFromDataStore.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateEntityShapeFromDataStore extends CreateEntityShapeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("types")
        private TypeLibrary types;

        public Builder types(TypeLibrary types) {
            this.types = types;
            this.__explicitlySet__.add("types");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityProperties")
        private java.util.Map<String, String> entityProperties;

        public Builder entityProperties(java.util.Map<String, String> entityProperties) {
            this.entityProperties = entityProperties;
            this.__explicitlySet__.add("entityProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateEntityShapeFromDataStore build() {
            CreateEntityShapeFromDataStore model =
                    new CreateEntityShapeFromDataStore(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.objectVersion,
                            this.externalKey,
                            this.shape,
                            this.shapeId,
                            this.entityType,
                            this.otherTypeLabel,
                            this.uniqueKeys,
                            this.foreignKeys,
                            this.resourceName,
                            this.objectStatus,
                            this.identifier,
                            this.types,
                            this.entityProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateEntityShapeFromDataStore model) {
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
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("types")) {
                this.types(model.getTypes());
            }
            if (model.wasPropertyExplicitlySet("entityProperties")) {
                this.entityProperties(model.getEntityProperties());
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
    public CreateEntityShapeFromDataStore(
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
        super(
                key,
                modelVersion,
                parentRef,
                name,
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
                identifier,
                types,
                entityProperties);
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
        sb.append("CreateEntityShapeFromDataStore(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateEntityShapeFromDataStore)) {
            return false;
        }

        CreateEntityShapeFromDataStore other = (CreateEntityShapeFromDataStore) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
