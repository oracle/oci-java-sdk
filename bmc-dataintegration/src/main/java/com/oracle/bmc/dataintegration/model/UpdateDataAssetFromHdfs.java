/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the HDFS data asset type. <br>
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
        builder = UpdateDataAssetFromHdfs.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDataAssetFromHdfs extends UpdateDataAssetDetails {
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
        /** The HDFS hostname. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The HDFS hostname.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The HDFS port. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        /**
         * The HDFS port.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** The HDFS Protocol name. */
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        /**
         * The HDFS Protocol name.
         *
         * @param protocol the value to set
         * @return this builder
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /** Specifies whether certificate validation is needed */
        @com.fasterxml.jackson.annotation.JsonProperty("validateCertificate")
        private Boolean validateCertificate;

        /**
         * Specifies whether certificate validation is needed
         *
         * @param validateCertificate the value to set
         * @return this builder
         */
        public Builder validateCertificate(Boolean validateCertificate) {
            this.validateCertificate = validateCertificate;
            this.__explicitlySet__.add("validateCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
        private UpdateConnectionFromHdfs defaultConnection;

        public Builder defaultConnection(UpdateConnectionFromHdfs defaultConnection) {
            this.defaultConnection = defaultConnection;
            this.__explicitlySet__.add("defaultConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDataAssetFromHdfs build() {
            UpdateDataAssetFromHdfs model =
                    new UpdateDataAssetFromHdfs(
                            this.key,
                            this.modelVersion,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.objectVersion,
                            this.identifier,
                            this.externalKey,
                            this.assetProperties,
                            this.registryMetadata,
                            this.host,
                            this.port,
                            this.protocol,
                            this.validateCertificate,
                            this.defaultConnection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataAssetFromHdfs model) {
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
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
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
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("validateCertificate")) {
                this.validateCertificate(model.getValidateCertificate());
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
    public UpdateDataAssetFromHdfs(
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
            String host,
            String port,
            String protocol,
            Boolean validateCertificate,
            UpdateConnectionFromHdfs defaultConnection) {
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
        this.host = host;
        this.port = port;
        this.protocol = protocol;
        this.validateCertificate = validateCertificate;
        this.defaultConnection = defaultConnection;
    }

    /** The HDFS hostname. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The HDFS hostname.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The HDFS port. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final String port;

    /**
     * The HDFS port.
     *
     * @return the value
     */
    public String getPort() {
        return port;
    }

    /** The HDFS Protocol name. */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    /**
     * The HDFS Protocol name.
     *
     * @return the value
     */
    public String getProtocol() {
        return protocol;
    }

    /** Specifies whether certificate validation is needed */
    @com.fasterxml.jackson.annotation.JsonProperty("validateCertificate")
    private final Boolean validateCertificate;

    /**
     * Specifies whether certificate validation is needed
     *
     * @return the value
     */
    public Boolean getValidateCertificate() {
        return validateCertificate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final UpdateConnectionFromHdfs defaultConnection;

    public UpdateConnectionFromHdfs getDefaultConnection() {
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
        sb.append("UpdateDataAssetFromHdfs(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", validateCertificate=").append(String.valueOf(this.validateCertificate));
        sb.append(", defaultConnection=").append(String.valueOf(this.defaultConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDataAssetFromHdfs)) {
            return false;
        }

        UpdateDataAssetFromHdfs other = (UpdateDataAssetFromHdfs) o;
        return java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.validateCertificate, other.validateCertificate)
                && java.util.Objects.equals(this.defaultConnection, other.defaultConnection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result =
                (result * PRIME)
                        + (this.validateCertificate == null
                                ? 43
                                : this.validateCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultConnection == null ? 43 : this.defaultConnection.hashCode());
        return result;
    }
}
