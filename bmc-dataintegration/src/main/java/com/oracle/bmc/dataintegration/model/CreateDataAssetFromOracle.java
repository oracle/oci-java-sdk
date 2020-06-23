/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The Oracle data asset details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDataAssetFromOracle.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateDataAssetFromOracle extends CreateDataAssetDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
        private String driverClass;

        public Builder driverClass(String driverClass) {
            this.driverClass = driverClass;
            this.__explicitlySet__.add("driverClass");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sid")
        private String sid;

        public Builder sid(String sid) {
            this.sid = sid;
            this.__explicitlySet__.add("sid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
        private String credentialFileContent;

        public Builder credentialFileContent(String credentialFileContent) {
            this.credentialFileContent = credentialFileContent;
            this.__explicitlySet__.add("credentialFileContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private CreateConnectionFromOracle defaultConnection;

        public Builder defaultConnection(CreateConnectionFromOracle defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataAssetFromOracle build() {
            CreateDataAssetFromOracle __instance__ =
                    new CreateDataAssetFromOracle(
                            key,
                            modelVersion,
                            name,
                            description,
                            objectStatus,
                            identifier,
                            externalKey,
                            assetProperties,
                            registryMetadata,
                            host,
                            port,
                            serviceName,
                            driverClass,
                            sid,
                            credentialFileContent,
                            defaultConnection);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataAssetFromOracle o) {
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
                            .host(o.getHost())
                            .port(o.getPort())
                            .serviceName(o.getServiceName())
                            .driverClass(o.getDriverClass())
                            .sid(o.getSid())
                            .credentialFileContent(o.getCredentialFileContent())
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

    @Deprecated
    public CreateDataAssetFromOracle(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            RegistryMetadata registryMetadata,
            String host,
            String port,
            String serviceName,
            String driverClass,
            String sid,
            String credentialFileContent,
            CreateConnectionFromOracle defaultConnection) {
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
        this.host = host;
        this.port = port;
        this.serviceName = serviceName;
        this.driverClass = driverClass;
        this.sid = sid;
        this.credentialFileContent = credentialFileContent;
        this.defaultConnection = defaultConnection;
    }

    /**
     * The host details for the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * The port details for the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    String port;

    /**
     * The service name for the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    String serviceName;

    /**
     * The driver class for the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
    String driverClass;

    /**
     * sid
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sid")
    String sid;

    /**
     * The credential file content from a wallet for the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
    String credentialFileContent;

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    CreateConnectionFromOracle defaultConnection;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
