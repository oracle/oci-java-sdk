/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the Oracle Object storage data asset type.
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
    builder = CreateDataAssetFromObjectStorage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDataAssetFromObjectStorage extends CreateDataAssetDetails {
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
         * The Oracle Object storage Region ie. us-ashburn-1
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ociRegion")
        private String ociRegion;

        /**
         * The Oracle Object storage Region ie. us-ashburn-1
         * @param ociRegion the value to set
         * @return this builder
         **/
        public Builder ociRegion(String ociRegion) {
            this.ociRegion = ociRegion;
            this.__explicitlySet__.add("ociRegion");
            return this;
        }
        /**
         * The Oracle Object storage URL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The Oracle Object storage URL.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * The OCI tenancy OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The OCI tenancy OCID.
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private CreateConnectionFromObjectStorage defaultConnection;

        public Builder defaultConnection(CreateConnectionFromObjectStorage defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataAssetFromObjectStorage build() {
            CreateDataAssetFromObjectStorage __instance__ =
                    new CreateDataAssetFromObjectStorage(
                            key,
                            modelVersion,
                            name,
                            description,
                            objectStatus,
                            identifier,
                            externalKey,
                            assetProperties,
                            registryMetadata,
                            ociRegion,
                            url,
                            tenancyId,
                            namespace,
                            defaultConnection);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataAssetFromObjectStorage o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .externalKey(o.getExternalKey())
                            .assetProperties(o.getAssetProperties())
                            .registryMetadata(o.getRegistryMetadata())
                            .ociRegion(o.getOciRegion())
                            .url(o.getUrl())
                            .tenancyId(o.getTenancyId())
                            .namespace(o.getNamespace())
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
    public CreateDataAssetFromObjectStorage(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            RegistryMetadata registryMetadata,
            String ociRegion,
            String url,
            String tenancyId,
            String namespace,
            CreateConnectionFromObjectStorage defaultConnection) {
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
        this.ociRegion = ociRegion;
        this.url = url;
        this.tenancyId = tenancyId;
        this.namespace = namespace;
        this.defaultConnection = defaultConnection;
    }

    /**
     * The Oracle Object storage Region ie. us-ashburn-1
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ociRegion")
    private final String ociRegion;

    /**
     * The Oracle Object storage Region ie. us-ashburn-1
     * @return the value
     **/
    public String getOciRegion() {
        return ociRegion;
    }

    /**
     * The Oracle Object storage URL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The Oracle Object storage URL.
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * The OCI tenancy OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The OCI tenancy OCID.
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final CreateConnectionFromObjectStorage defaultConnection;

    public CreateConnectionFromObjectStorage getDefaultConnection() {
        return defaultConnection;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDataAssetFromObjectStorage(");
        sb.append("super=").append(super.toString());
        sb.append(", ociRegion=").append(String.valueOf(this.ociRegion));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
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
        if (!(o instanceof CreateDataAssetFromObjectStorage)) {
            return false;
        }

        CreateDataAssetFromObjectStorage other = (CreateDataAssetFromObjectStorage) o;
        return java.util.Objects.equals(this.ociRegion, other.ociRegion)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.defaultConnection, other.defaultConnection)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ociRegion == null ? 43 : this.ociRegion.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
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
