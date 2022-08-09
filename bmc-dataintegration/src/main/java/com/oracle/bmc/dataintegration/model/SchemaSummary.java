/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The schema summary object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SchemaSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SchemaSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "name",
        "resourceName",
        "description",
        "objectVersion",
        "externalKey",
        "isHasContainers",
        "defaultConnection",
        "objectStatus",
        "identifier",
        "metadata"
    })
    public SchemaSummary(
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String resourceName,
            String description,
            Integer objectVersion,
            String externalKey,
            Boolean isHasContainers,
            String defaultConnection,
            Integer objectStatus,
            String identifier,
            ObjectMetadata metadata) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.resourceName = resourceName;
        this.description = description;
        this.objectVersion = objectVersion;
        this.externalKey = externalKey;
        this.isHasContainers = isHasContainers;
        this.defaultConnection = defaultConnection;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The object key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The object key.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The object's type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The object's type.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * The object's model version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
         * @param modelVersion the value to set
         * @return this builder
         **/
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
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A resource name can have letters, numbers, and special characters. The value is editable and is restricted to 4000 characters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * A resource name can have letters, numbers, and special characters. The value is editable and is restricted to 4000 characters.
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * User-defined description for the schema.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-defined description for the schema.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The version of the object that is used to track changes in the object instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * The version of the object that is used to track changes in the object instance.
         * @param objectVersion the value to set
         * @return this builder
         **/
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /**
         * The external key for the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        /**
         * The external key for the object.
         * @param externalKey the value to set
         * @return this builder
         **/
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }
        /**
         * Specifies whether the schema has containers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHasContainers")
        private Boolean isHasContainers;

        /**
         * Specifies whether the schema has containers.
         * @param isHasContainers the value to set
         * @return this builder
         **/
        public Builder isHasContainers(Boolean isHasContainers) {
            this.isHasContainers = isHasContainers;
            this.__explicitlySet__.add("isHasContainers");
            return this;
        }
        /**
         * The default connection key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private String defaultConnection;

        /**
         * The default connection key.
         * @param defaultConnection the value to set
         * @return this builder
         **/
        public Builder defaultConnection(String defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * @param objectStatus the value to set
         * @return this builder
         **/
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         * @param identifier the value to set
         * @return this builder
         **/
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SchemaSummary build() {
            SchemaSummary model =
                    new SchemaSummary(
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.resourceName,
                            this.description,
                            this.objectVersion,
                            this.externalKey,
                            this.isHasContainers,
                            this.defaultConnection,
                            this.objectStatus,
                            this.identifier,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SchemaSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
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
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
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
            if (model.wasPropertyExplicitlySet("isHasContainers")) {
                this.isHasContainers(model.getIsHasContainers());
            }
            if (model.wasPropertyExplicitlySet("defaultConnection")) {
                this.defaultConnection(model.getDefaultConnection());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The object key.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The object's type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The object's type.
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A resource name can have letters, numbers, and special characters. The value is editable and is restricted to 4000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * A resource name can have letters, numbers, and special characters. The value is editable and is restricted to 4000 characters.
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * User-defined description for the schema.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-defined description for the schema.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     * @return the value
     **/
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * The external key for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * The external key for the object.
     * @return the value
     **/
    public String getExternalKey() {
        return externalKey;
    }

    /**
     * Specifies whether the schema has containers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHasContainers")
    private final Boolean isHasContainers;

    /**
     * Specifies whether the schema has containers.
     * @return the value
     **/
    public Boolean getIsHasContainers() {
        return isHasContainers;
    }

    /**
     * The default connection key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final String defaultConnection;

    /**
     * The default connection key.
     * @return the value
     **/
    public String getDefaultConnection() {
        return defaultConnection;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * @return the value
     **/
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
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
        sb.append("SchemaSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", isHasContainers=").append(String.valueOf(this.isHasContainers));
        sb.append(", defaultConnection=").append(String.valueOf(this.defaultConnection));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaSummary)) {
            return false;
        }

        SchemaSummary other = (SchemaSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.isHasContainers, other.isHasContainers)
                && java.util.Objects.equals(this.defaultConnection, other.defaultConnection)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result =
                (result * PRIME)
                        + (this.isHasContainers == null ? 43 : this.isHasContainers.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConnection == null ? 43 : this.defaultConnection.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
