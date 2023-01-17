/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the Autonomous Data Warehouse data asset type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDataAssetFromAdwc.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateDataAssetFromAdwc extends CreateDataAssetDetails {
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
        /** The Autonomous Data Warehouse instance service name. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The Autonomous Data Warehouse instance service name.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** The Autonomous Data Warehouse driver class. */
        @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
        private String driverClass;

        /**
         * The Autonomous Data Warehouse driver class.
         *
         * @param driverClass the value to set
         * @return this builder
         */
        public Builder driverClass(String driverClass) {
            this.driverClass = driverClass;
            this.__explicitlySet__.add("driverClass");
            return this;
        }
        /** The credential file content from a Autonomous Data Warehouse wallet. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
        private String credentialFileContent;

        /**
         * The credential file content from a Autonomous Data Warehouse wallet.
         *
         * @param credentialFileContent the value to set
         * @return this builder
         */
        public Builder credentialFileContent(String credentialFileContent) {
            this.credentialFileContent = credentialFileContent;
            this.__explicitlySet__.add("credentialFileContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("walletSecret")
        private SensitiveAttribute walletSecret;

        public Builder walletSecret(SensitiveAttribute walletSecret) {
            this.walletSecret = walletSecret;
            this.__explicitlySet__.add("walletSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("walletPasswordSecret")
        private SensitiveAttribute walletPasswordSecret;

        public Builder walletPasswordSecret(SensitiveAttribute walletPasswordSecret) {
            this.walletPasswordSecret = walletPasswordSecret;
            this.__explicitlySet__.add("walletPasswordSecret");
            return this;
        }
        /** The Autonomous Data Warehouse instance region Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionId")
        private String regionId;

        /**
         * The Autonomous Data Warehouse instance region Id.
         *
         * @param regionId the value to set
         * @return this builder
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            this.__explicitlySet__.add("regionId");
            return this;
        }
        /** The Autonomous Data Warehouse instance tenancy Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The Autonomous Data Warehouse instance tenancy Id.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /** The Autonomous Data Warehouse instance compartment Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The Autonomous Data Warehouse instance compartment Id.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Tha Autonomous Database Id */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDbId")
        private String autonomousDbId;

        /**
         * Tha Autonomous Database Id
         *
         * @param autonomousDbId the value to set
         * @return this builder
         */
        public Builder autonomousDbId(String autonomousDbId) {
            this.autonomousDbId = autonomousDbId;
            this.__explicitlySet__.add("autonomousDbId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private CreateConnectionFromAdwc defaultConnection;

        public Builder defaultConnection(CreateConnectionFromAdwc defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
        private DataAsset stagingDataAsset;

        public Builder stagingDataAsset(DataAsset stagingDataAsset) {
            this.stagingDataAsset = stagingDataAsset;
            this.__explicitlySet__.add("stagingDataAsset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
        private Connection stagingConnection;

        public Builder stagingConnection(Connection stagingConnection) {
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

        public CreateDataAssetFromAdwc build() {
            CreateDataAssetFromAdwc model =
                    new CreateDataAssetFromAdwc(
                            this.key,
                            this.modelVersion,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.identifier,
                            this.externalKey,
                            this.assetProperties,
                            this.registryMetadata,
                            this.serviceName,
                            this.driverClass,
                            this.credentialFileContent,
                            this.walletSecret,
                            this.walletPasswordSecret,
                            this.regionId,
                            this.tenancyId,
                            this.compartmentId,
                            this.autonomousDbId,
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
        public Builder copy(CreateDataAssetFromAdwc model) {
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
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("driverClass")) {
                this.driverClass(model.getDriverClass());
            }
            if (model.wasPropertyExplicitlySet("credentialFileContent")) {
                this.credentialFileContent(model.getCredentialFileContent());
            }
            if (model.wasPropertyExplicitlySet("walletSecret")) {
                this.walletSecret(model.getWalletSecret());
            }
            if (model.wasPropertyExplicitlySet("walletPasswordSecret")) {
                this.walletPasswordSecret(model.getWalletPasswordSecret());
            }
            if (model.wasPropertyExplicitlySet("regionId")) {
                this.regionId(model.getRegionId());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("autonomousDbId")) {
                this.autonomousDbId(model.getAutonomousDbId());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateDataAssetFromAdwc(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            RegistryMetadata registryMetadata,
            String serviceName,
            String driverClass,
            String credentialFileContent,
            SensitiveAttribute walletSecret,
            SensitiveAttribute walletPasswordSecret,
            String regionId,
            String tenancyId,
            String compartmentId,
            String autonomousDbId,
            CreateConnectionFromAdwc defaultConnection,
            DataAsset stagingDataAsset,
            Connection stagingConnection,
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
        this.serviceName = serviceName;
        this.driverClass = driverClass;
        this.credentialFileContent = credentialFileContent;
        this.walletSecret = walletSecret;
        this.walletPasswordSecret = walletPasswordSecret;
        this.regionId = regionId;
        this.tenancyId = tenancyId;
        this.compartmentId = compartmentId;
        this.autonomousDbId = autonomousDbId;
        this.defaultConnection = defaultConnection;
        this.stagingDataAsset = stagingDataAsset;
        this.stagingConnection = stagingConnection;
        this.bucketSchema = bucketSchema;
    }

    /** The Autonomous Data Warehouse instance service name. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The Autonomous Data Warehouse instance service name.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** The Autonomous Data Warehouse driver class. */
    @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
    private final String driverClass;

    /**
     * The Autonomous Data Warehouse driver class.
     *
     * @return the value
     */
    public String getDriverClass() {
        return driverClass;
    }

    /** The credential file content from a Autonomous Data Warehouse wallet. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
    private final String credentialFileContent;

    /**
     * The credential file content from a Autonomous Data Warehouse wallet.
     *
     * @return the value
     */
    public String getCredentialFileContent() {
        return credentialFileContent;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("walletSecret")
    private final SensitiveAttribute walletSecret;

    public SensitiveAttribute getWalletSecret() {
        return walletSecret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("walletPasswordSecret")
    private final SensitiveAttribute walletPasswordSecret;

    public SensitiveAttribute getWalletPasswordSecret() {
        return walletPasswordSecret;
    }

    /** The Autonomous Data Warehouse instance region Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionId")
    private final String regionId;

    /**
     * The Autonomous Data Warehouse instance region Id.
     *
     * @return the value
     */
    public String getRegionId() {
        return regionId;
    }

    /** The Autonomous Data Warehouse instance tenancy Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The Autonomous Data Warehouse instance tenancy Id.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /** The Autonomous Data Warehouse instance compartment Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The Autonomous Data Warehouse instance compartment Id.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Tha Autonomous Database Id */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDbId")
    private final String autonomousDbId;

    /**
     * Tha Autonomous Database Id
     *
     * @return the value
     */
    public String getAutonomousDbId() {
        return autonomousDbId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final CreateConnectionFromAdwc defaultConnection;

    public CreateConnectionFromAdwc getDefaultConnection() {
        return defaultConnection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
    private final DataAsset stagingDataAsset;

    public DataAsset getStagingDataAsset() {
        return stagingDataAsset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
    private final Connection stagingConnection;

    public Connection getStagingConnection() {
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDataAssetFromAdwc(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", driverClass=").append(String.valueOf(this.driverClass));
        sb.append(", credentialFileContent=").append(String.valueOf(this.credentialFileContent));
        sb.append(", walletSecret=").append(String.valueOf(this.walletSecret));
        sb.append(", walletPasswordSecret=").append(String.valueOf(this.walletPasswordSecret));
        sb.append(", regionId=").append(String.valueOf(this.regionId));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", autonomousDbId=").append(String.valueOf(this.autonomousDbId));
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
        if (!(o instanceof CreateDataAssetFromAdwc)) {
            return false;
        }

        CreateDataAssetFromAdwc other = (CreateDataAssetFromAdwc) o;
        return java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.driverClass, other.driverClass)
                && java.util.Objects.equals(this.credentialFileContent, other.credentialFileContent)
                && java.util.Objects.equals(this.walletSecret, other.walletSecret)
                && java.util.Objects.equals(this.walletPasswordSecret, other.walletPasswordSecret)
                && java.util.Objects.equals(this.regionId, other.regionId)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.autonomousDbId, other.autonomousDbId)
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
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.driverClass == null ? 43 : this.driverClass.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialFileContent == null
                                ? 43
                                : this.credentialFileContent.hashCode());
        result = (result * PRIME) + (this.walletSecret == null ? 43 : this.walletSecret.hashCode());
        result =
                (result * PRIME)
                        + (this.walletPasswordSecret == null
                                ? 43
                                : this.walletPasswordSecret.hashCode());
        result = (result * PRIME) + (this.regionId == null ? 43 : this.regionId.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDbId == null ? 43 : this.autonomousDbId.hashCode());
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
