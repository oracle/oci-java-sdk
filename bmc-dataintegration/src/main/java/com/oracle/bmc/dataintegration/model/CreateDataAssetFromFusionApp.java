/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the FUSION_APP data asset type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDataAssetFromFusionApp.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDataAssetFromFusionApp extends CreateDataAssetDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assetProperties")
        private java.util.Map<String, String> assetProperties;

        public Builder assetProperties(java.util.Map<String, String> assetProperties) {
            this.assetProperties = assetProperties;
            this.__explicitlySet__.add("assetProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }
        /**
         * The generic JDBC host name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
        private String serviceUrl;

        /**
         * The generic JDBC host name.
         * @param serviceUrl the value to set
         * @return this builder
         **/
        public Builder serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            this.__explicitlySet__.add("serviceUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private CreateConnectionDetails defaultConnection;

        public Builder defaultConnection(CreateConnectionDetails defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
        private DataAssetSummaryFromObjectStorage stagingDataAsset;

        public Builder stagingDataAsset(DataAssetSummaryFromObjectStorage stagingDataAsset) {
            this.stagingDataAsset = stagingDataAsset;
            this.__explicitlySet__.add("stagingDataAsset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
        private ConnectionSummaryFromObjectStorage stagingConnection;

        public Builder stagingConnection(ConnectionSummaryFromObjectStorage stagingConnection) {
            this.stagingConnection = stagingConnection;
            this.__explicitlySet__.add("stagingConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketSchema")
        private Schema bucketSchema;

        public Builder bucketSchema(Schema bucketSchema) {
            this.bucketSchema = bucketSchema;
            this.__explicitlySet__.add("bucketSchema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataAssetFromFusionApp build() {
            CreateDataAssetFromFusionApp model =
                    new CreateDataAssetFromFusionApp(
                            this.key,
                            this.modelVersion,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.identifier,
                            this.externalKey,
                            this.assetProperties,
                            this.registryMetadata,
                            this.serviceUrl,
                            this.defaultConnection,
                            this.stagingDataAsset,
                            this.stagingConnection,
                            this.bucketSchema);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataAssetFromFusionApp model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
            }
            if (model.wasPropertyExplicitlySet("assetProperties")) {
                this.assetProperties(model.getAssetProperties());
            }
            if (model.wasPropertyExplicitlySet("registryMetadata")) {
                this.registryMetadata(model.getRegistryMetadata());
            }
            if (model.wasPropertyExplicitlySet("serviceUrl")) {
                this.serviceUrl(model.getServiceUrl());
            }
            if (model.wasPropertyExplicitlySet("defaultConnection")) {
                this.defaultConnection(model.getDefaultConnection());
            }
            if (model.wasPropertyExplicitlySet("stagingDataAsset")) {
                this.stagingDataAsset(model.getStagingDataAsset());
            }
            if (model.wasPropertyExplicitlySet("stagingConnection")) {
                this.stagingConnection(model.getStagingConnection());
            }
            if (model.wasPropertyExplicitlySet("bucketSchema")) {
                this.bucketSchema(model.getBucketSchema());
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

    @Deprecated
    public CreateDataAssetFromFusionApp(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            RegistryMetadata registryMetadata,
            String serviceUrl,
            CreateConnectionDetails defaultConnection,
            DataAssetSummaryFromObjectStorage stagingDataAsset,
            ConnectionSummaryFromObjectStorage stagingConnection,
            Schema bucketSchema) {
        super(
                key,
                modelVersion,
                name,
                description,
                objectStatus,
                identifier,
                externalKey,
                assetProperties,
                registryMetadata);
        this.serviceUrl = serviceUrl;
        this.defaultConnection = defaultConnection;
        this.stagingDataAsset = stagingDataAsset;
        this.stagingConnection = stagingConnection;
        this.bucketSchema = bucketSchema;
    }

    /**
     * The generic JDBC host name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceUrl")
    private final String serviceUrl;

    /**
     * The generic JDBC host name.
     * @return the value
     **/
    public String getServiceUrl() {
        return serviceUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final CreateConnectionDetails defaultConnection;

    public CreateConnectionDetails getDefaultConnection() {
        return defaultConnection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
    private final DataAssetSummaryFromObjectStorage stagingDataAsset;

    public DataAssetSummaryFromObjectStorage getStagingDataAsset() {
        return stagingDataAsset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
    private final ConnectionSummaryFromObjectStorage stagingConnection;

    public ConnectionSummaryFromObjectStorage getStagingConnection() {
        return stagingConnection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bucketSchema")
    private final Schema bucketSchema;

    public Schema getBucketSchema() {
        return bucketSchema;
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
        sb.append("CreateDataAssetFromFusionApp(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", serviceUrl=").append(String.valueOf(this.serviceUrl));
        sb.append(", defaultConnection=").append(String.valueOf(this.defaultConnection));
        sb.append(", stagingDataAsset=").append(String.valueOf(this.stagingDataAsset));
        sb.append(", stagingConnection=").append(String.valueOf(this.stagingConnection));
        sb.append(", bucketSchema=").append(String.valueOf(this.bucketSchema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataAssetFromFusionApp)) {
            return false;
        }

        CreateDataAssetFromFusionApp other = (CreateDataAssetFromFusionApp) o;
        return java.util.Objects.equals(this.serviceUrl, other.serviceUrl)
                && java.util.Objects.equals(this.defaultConnection, other.defaultConnection)
                && java.util.Objects.equals(this.stagingDataAsset, other.stagingDataAsset)
                && java.util.Objects.equals(this.stagingConnection, other.stagingConnection)
                && java.util.Objects.equals(this.bucketSchema, other.bucketSchema)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.serviceUrl == null ? 43 : this.serviceUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConnection == null ? 43 : this.defaultConnection.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingDataAsset == null ? 43 : this.stagingDataAsset.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingConnection == null ? 43 : this.stagingConnection.hashCode());
        result = (result * PRIME) + (this.bucketSchema == null ? 43 : this.bucketSchema.hashCode());
        return result;
    }
}
