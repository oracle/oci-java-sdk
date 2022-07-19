/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The connection summary object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConnectionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConnectionSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "modelType",
        "name",
        "description",
        "objectVersion",
        "objectStatus",
        "identifier",
        "primarySchema",
        "connectionProperties",
        "properties",
        "type",
        "isDefault",
        "metadata",
        "registryMetadata"
    })
    public ConnectionSummary(
            String key,
            String modelVersion,
            String modelType,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            Schema primarySchema,
            java.util.List<ConnectionProperty> connectionProperties,
            java.util.Map<String, Object> properties,
            String type,
            Boolean isDefault,
            ObjectMetadata metadata,
            RegistryMetadata registryMetadata) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.modelType = modelType;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.primarySchema = primarySchema;
        this.connectionProperties = connectionProperties;
        this.properties = properties;
        this.type = type;
        this.isDefault = isDefault;
        this.metadata = metadata;
        this.registryMetadata = registryMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Generated key that can be used in API calls to identify connection. On scenarios where reference to the connection is needed, a value can be passed in create.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Generated key that can be used in API calls to identify connection. On scenarios where reference to the connection is needed, a value can be passed in create.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The model version of an object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
         * @param modelVersion the value to set
         * @return this builder
         **/
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }
        /**
         * The type of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the object.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
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
         * User-defined description for the connection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-defined description for the connection.
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

        @com.fasterxml.jackson.annotation.JsonProperty("primarySchema")
        private Schema primarySchema;

        public Builder primarySchema(Schema primarySchema) {
            this.primarySchema = primarySchema;
            this.__explicitlySet__.add("primarySchema");
            return this;
        }
        /**
         * The properties for the connection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
        private java.util.List<ConnectionProperty> connectionProperties;

        /**
         * The properties for the connection.
         * @param connectionProperties the value to set
         * @return this builder
         **/
        public Builder connectionProperties(
                java.util.List<ConnectionProperty> connectionProperties) {
            this.connectionProperties = connectionProperties;
            this.__explicitlySet__.add("connectionProperties");
            return this;
        }
        /**
         * All the properties for the connection in a key-value map format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, Object> properties;

        /**
         * All the properties for the connection in a key-value map format.
         * @param properties the value to set
         * @return this builder
         **/
        public Builder properties(java.util.Map<String, Object> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /**
         * Specific Connection Type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Specific Connection Type
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The default property for the connection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * The default property for the connection.
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionSummary build() {
            ConnectionSummary __instance__ =
                    new ConnectionSummary(
                            key,
                            modelVersion,
                            modelType,
                            name,
                            description,
                            objectVersion,
                            objectStatus,
                            identifier,
                            primarySchema,
                            connectionProperties,
                            properties,
                            type,
                            isDefault,
                            metadata,
                            registryMetadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .modelType(o.getModelType())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .primarySchema(o.getPrimarySchema())
                            .connectionProperties(o.getConnectionProperties())
                            .properties(o.getProperties())
                            .type(o.getType())
                            .isDefault(o.getIsDefault())
                            .metadata(o.getMetadata())
                            .registryMetadata(o.getRegistryMetadata());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Generated key that can be used in API calls to identify connection. On scenarios where reference to the connection is needed, a value can be passed in create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify connection. On scenarios where reference to the connection is needed, a value can be passed in create.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * The type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the object.
     * @return the value
     **/
    public String getModelType() {
        return modelType;
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
     * User-defined description for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-defined description for the connection.
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

    @com.fasterxml.jackson.annotation.JsonProperty("primarySchema")
    private final Schema primarySchema;

    public Schema getPrimarySchema() {
        return primarySchema;
    }

    /**
     * The properties for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
    private final java.util.List<ConnectionProperty> connectionProperties;

    /**
     * The properties for the connection.
     * @return the value
     **/
    public java.util.List<ConnectionProperty> getConnectionProperties() {
        return connectionProperties;
    }

    /**
     * All the properties for the connection in a key-value map format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, Object> properties;

    /**
     * All the properties for the connection in a key-value map format.
     * @return the value
     **/
    public java.util.Map<String, Object> getProperties() {
        return properties;
    }

    /**
     * Specific Connection Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Specific Connection Type
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * The default property for the connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * The default property for the connection.
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
    private final RegistryMetadata registryMetadata;

    public RegistryMetadata getRegistryMetadata() {
        return registryMetadata;
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
        sb.append("ConnectionSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", primarySchema=").append(String.valueOf(this.primarySchema));
        sb.append(", connectionProperties=").append(String.valueOf(this.connectionProperties));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", registryMetadata=").append(String.valueOf(this.registryMetadata));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionSummary)) {
            return false;
        }

        ConnectionSummary other = (ConnectionSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.primarySchema, other.primarySchema)
                && java.util.Objects.equals(this.connectionProperties, other.connectionProperties)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.registryMetadata, other.registryMetadata)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result =
                (result * PRIME)
                        + (this.primarySchema == null ? 43 : this.primarySchema.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionProperties == null
                                ? 43
                                : this.connectionProperties.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.registryMetadata == null ? 43 : this.registryMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
