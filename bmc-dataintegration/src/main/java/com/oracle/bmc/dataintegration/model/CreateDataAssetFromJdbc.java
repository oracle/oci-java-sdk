/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the generic JDBC data asset type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDataAssetFromJdbc.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDataAssetFromJdbc extends CreateDataAssetDetails {
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
        /** The generic JDBC host name. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The generic JDBC host name.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The generic JDBC port number. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        /**
         * The generic JDBC port number.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** The data asset type for the generic JDBC data asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetType")
        private String dataAssetType;

        /**
         * The data asset type for the generic JDBC data asset.
         *
         * @param dataAssetType the value to set
         * @return this builder
         */
        public Builder dataAssetType(String dataAssetType) {
            this.dataAssetType = dataAssetType;
            this.__explicitlySet__.add("dataAssetType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private CreateConnectionFromJdbc defaultConnection;

        public Builder defaultConnection(CreateConnectionFromJdbc defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataAssetFromJdbc build() {
            CreateDataAssetFromJdbc model =
                    new CreateDataAssetFromJdbc(
                            this.key,
                            this.modelVersion,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.identifier,
                            this.externalKey,
                            this.assetProperties,
                            this.registryMetadata,
                            this.host,
                            this.port,
                            this.dataAssetType,
                            this.defaultConnection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataAssetFromJdbc model) {
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
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("dataAssetType")) {
                this.dataAssetType(model.getDataAssetType());
            }
            if (model.wasPropertyExplicitlySet("defaultConnection")) {
                this.defaultConnection(model.getDefaultConnection());
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
    public CreateDataAssetFromJdbc(
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
            String dataAssetType,
            CreateConnectionFromJdbc defaultConnection) {
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
        this.dataAssetType = dataAssetType;
        this.defaultConnection = defaultConnection;
    }

    /** The generic JDBC host name. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The generic JDBC host name.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The generic JDBC port number. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final String port;

    /**
     * The generic JDBC port number.
     *
     * @return the value
     */
    public String getPort() {
        return port;
    }

    /** The data asset type for the generic JDBC data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetType")
    private final String dataAssetType;

    /**
     * The data asset type for the generic JDBC data asset.
     *
     * @return the value
     */
    public String getDataAssetType() {
        return dataAssetType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final CreateConnectionFromJdbc defaultConnection;

    public CreateConnectionFromJdbc getDefaultConnection() {
        return defaultConnection;
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
        sb.append("CreateDataAssetFromJdbc(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", dataAssetType=").append(String.valueOf(this.dataAssetType));
        sb.append(", defaultConnection=").append(String.valueOf(this.defaultConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataAssetFromJdbc)) {
            return false;
        }

        CreateDataAssetFromJdbc other = (CreateDataAssetFromJdbc) o;
        return java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.dataAssetType, other.dataAssetType)
                && java.util.Objects.equals(this.defaultConnection, other.defaultConnection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result =
                (result * PRIME)
                        + (this.dataAssetType == null ? 43 : this.dataAssetType.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConnection == null ? 43 : this.defaultConnection.hashCode());
        return result;
    }
}
