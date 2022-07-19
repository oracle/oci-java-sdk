/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the Autonomous Transaction Processing data asset type.
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
    builder = UpdateDataAssetFromAtp.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDataAssetFromAtp extends UpdateDataAssetDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
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
         * The Autonomous Transaction Processing instance service name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The Autonomous Transaction Processing instance service name.
         * @param serviceName the value to set
         * @return this builder
         **/
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /**
         * The Autonomous Transaction Processing driver class
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
        private String driverClass;

        /**
         * The Autonomous Transaction Processing driver class
         * @param driverClass the value to set
         * @return this builder
         **/
        public Builder driverClass(String driverClass) {
            this.driverClass = driverClass;
            this.__explicitlySet__.add("driverClass");
            return this;
        }
        /**
         * The credential file content from an Autonomous Transaction Processing wallet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
        private String credentialFileContent;

        /**
         * The credential file content from an Autonomous Transaction Processing wallet.
         * @param credentialFileContent the value to set
         * @return this builder
         **/
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
        /**
         * The Autonomous Data Warehouse instance region Id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regionId")
        private String regionId;

        /**
         * The Autonomous Data Warehouse instance region Id.
         * @param regionId the value to set
         * @return this builder
         **/
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            this.__explicitlySet__.add("regionId");
            return this;
        }
        /**
         * The Autonomous Data Warehouse instance tenancy Id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The Autonomous Data Warehouse instance tenancy Id.
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * The Autonomous Data Warehouse instance compartment Id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The Autonomous Data Warehouse instance compartment Id.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Tha Autonomous Database Id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDbId")
        private String autonomousDbId;

        /**
         * Tha Autonomous Database Id
         * @param autonomousDbId the value to set
         * @return this builder
         **/
        public Builder autonomousDbId(String autonomousDbId) {
            this.autonomousDbId = autonomousDbId;
            this.__explicitlySet__.add("autonomousDbId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private UpdateConnectionFromAtp defaultConnection;

        public Builder defaultConnection(UpdateConnectionFromAtp defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDataAssetFromAtp build() {
            UpdateDataAssetFromAtp __instance__ =
                    new UpdateDataAssetFromAtp(
                            key,
                            modelVersion,
                            name,
                            description,
                            objectStatus,
                            objectVersion,
                            identifier,
                            externalKey,
                            assetProperties,
                            registryMetadata,
                            serviceName,
                            driverClass,
                            credentialFileContent,
                            walletSecret,
                            walletPasswordSecret,
                            regionId,
                            tenancyId,
                            compartmentId,
                            autonomousDbId,
                            defaultConnection);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataAssetFromAtp o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectStatus(o.getObjectStatus())
                            .objectVersion(o.getObjectVersion())
                            .identifier(o.getIdentifier())
                            .externalKey(o.getExternalKey())
                            .assetProperties(o.getAssetProperties())
                            .registryMetadata(o.getRegistryMetadata())
                            .serviceName(o.getServiceName())
                            .driverClass(o.getDriverClass())
                            .credentialFileContent(o.getCredentialFileContent())
                            .walletSecret(o.getWalletSecret())
                            .walletPasswordSecret(o.getWalletPasswordSecret())
                            .regionId(o.getRegionId())
                            .tenancyId(o.getTenancyId())
                            .compartmentId(o.getCompartmentId())
                            .autonomousDbId(o.getAutonomousDbId())
                            .defaultConnection(o.getDefaultConnection());

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

    @Deprecated
    public UpdateDataAssetFromAtp(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
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
            UpdateConnectionFromAtp defaultConnection) {
        super(
                key,
                modelVersion,
                name,
                description,
                objectStatus,
                objectVersion,
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
    }

    /**
     * The Autonomous Transaction Processing instance service name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The Autonomous Transaction Processing instance service name.
     * @return the value
     **/
    public String getServiceName() {
        return serviceName;
    }

    /**
     * The Autonomous Transaction Processing driver class
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
    private final String driverClass;

    /**
     * The Autonomous Transaction Processing driver class
     * @return the value
     **/
    public String getDriverClass() {
        return driverClass;
    }

    /**
     * The credential file content from an Autonomous Transaction Processing wallet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
    private final String credentialFileContent;

    /**
     * The credential file content from an Autonomous Transaction Processing wallet.
     * @return the value
     **/
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

    /**
     * The Autonomous Data Warehouse instance region Id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionId")
    private final String regionId;

    /**
     * The Autonomous Data Warehouse instance region Id.
     * @return the value
     **/
    public String getRegionId() {
        return regionId;
    }

    /**
     * The Autonomous Data Warehouse instance tenancy Id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The Autonomous Data Warehouse instance tenancy Id.
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * The Autonomous Data Warehouse instance compartment Id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The Autonomous Data Warehouse instance compartment Id.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Tha Autonomous Database Id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDbId")
    private final String autonomousDbId;

    /**
     * Tha Autonomous Database Id
     * @return the value
     **/
    public String getAutonomousDbId() {
        return autonomousDbId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final UpdateConnectionFromAtp defaultConnection;

    public UpdateConnectionFromAtp getDefaultConnection() {
        return defaultConnection;
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
        sb.append("UpdateDataAssetFromAtp(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDataAssetFromAtp)) {
            return false;
        }

        UpdateDataAssetFromAtp other = (UpdateDataAssetFromAtp) o;
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
