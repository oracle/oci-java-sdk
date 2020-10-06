/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Summary details for the generic JDBC data asset type.
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
    builder = DataAssetSummaryFromJdbc.Builder.class
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
public class DataAssetSummaryFromJdbc extends DataAssetSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("nativeTypeSystem")
        private TypeSystem nativeTypeSystem;

        public Builder nativeTypeSystem(TypeSystem nativeTypeSystem) {
            this.nativeTypeSystem = nativeTypeSystem;
            this.__explicitlySet__.add("nativeTypeSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetType")
        private String dataAssetType;

        public Builder dataAssetType(String dataAssetType) {
            this.dataAssetType = dataAssetType;
            this.__explicitlySet__.add("dataAssetType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private ConnectionSummaryFromJdbc defaultConnection;

        public Builder defaultConnection(ConnectionSummaryFromJdbc defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataAssetSummaryFromJdbc build() {
            DataAssetSummaryFromJdbc __instance__ =
                    new DataAssetSummaryFromJdbc(
                            key,
                            modelVersion,
                            name,
                            description,
                            objectStatus,
                            identifier,
                            externalKey,
                            assetProperties,
                            nativeTypeSystem,
                            objectVersion,
                            parentRef,
                            metadata,
                            host,
                            port,
                            dataAssetType,
                            defaultConnection);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataAssetSummaryFromJdbc o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .externalKey(o.getExternalKey())
                            .assetProperties(o.getAssetProperties())
                            .nativeTypeSystem(o.getNativeTypeSystem())
                            .objectVersion(o.getObjectVersion())
                            .parentRef(o.getParentRef())
                            .metadata(o.getMetadata())
                            .host(o.getHost())
                            .port(o.getPort())
                            .dataAssetType(o.getDataAssetType())
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
    public DataAssetSummaryFromJdbc(
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            String externalKey,
            java.util.Map<String, String> assetProperties,
            TypeSystem nativeTypeSystem,
            Integer objectVersion,
            ParentReference parentRef,
            ObjectMetadata metadata,
            String host,
            String port,
            String dataAssetType,
            ConnectionSummaryFromJdbc defaultConnection) {
        super(
                key,
                modelVersion,
                name,
                description,
                objectStatus,
                identifier,
                externalKey,
                assetProperties,
                nativeTypeSystem,
                objectVersion,
                parentRef,
                metadata);
        this.host = host;
        this.port = port;
        this.dataAssetType = dataAssetType;
        this.defaultConnection = defaultConnection;
    }

    /**
     * The generic JDBC host name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * The generic JDBC port number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    String port;

    /**
     * The data asset type for the generic JDBC data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetType")
    String dataAssetType;

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    ConnectionSummaryFromJdbc defaultConnection;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
