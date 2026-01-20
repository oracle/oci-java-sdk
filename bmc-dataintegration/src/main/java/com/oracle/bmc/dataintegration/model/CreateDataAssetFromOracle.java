/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details for the Oracle Database data asset type. <br>
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
        builder = CreateDataAssetFromOracle.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDataAssetFromOracle extends CreateDataAssetDetails {
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
        /** The Oracle Database hostname. */
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * The Oracle Database hostname.
         *
         * @param host the value to set
         * @return this builder
         */
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /** The Oracle Database port. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        /**
         * The Oracle Database port.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** The service name for the data asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The service name for the data asset.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** The Oracle Database driver class. */
        @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
        private String driverClass;

        /**
         * The Oracle Database driver class.
         *
         * @param driverClass the value to set
         * @return this builder
         */
        public Builder driverClass(String driverClass) {
            this.driverClass = driverClass;
            this.__explicitlySet__.add("driverClass");
            return this;
        }
        /** The Oracle Database SID. */
        @com.fasterxml.jackson.annotation.JsonProperty("sid")
        private String sid;

        /**
         * The Oracle Database SID.
         *
         * @param sid the value to set
         * @return this builder
         */
        public Builder sid(String sid) {
            this.sid = sid;
            this.__explicitlySet__.add("sid");
            return this;
        }
        /** The credential file content from a wallet for the data asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
        private String credentialFileContent;

        /**
         * The credential file content from a wallet for the data asset.
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
            CreateDataAssetFromOracle model =
                    new CreateDataAssetFromOracle(
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
                            this.serviceName,
                            this.driverClass,
                            this.sid,
                            this.credentialFileContent,
                            this.walletSecret,
                            this.walletPasswordSecret,
                            this.defaultConnection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataAssetFromOracle model) {
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
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("driverClass")) {
                this.driverClass(model.getDriverClass());
            }
            if (model.wasPropertyExplicitlySet("sid")) {
                this.sid(model.getSid());
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
            SensitiveAttribute walletSecret,
            SensitiveAttribute walletPasswordSecret,
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
        this.walletSecret = walletSecret;
        this.walletPasswordSecret = walletPasswordSecret;
        this.defaultConnection = defaultConnection;
    }

    /** The Oracle Database hostname. */
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * The Oracle Database hostname.
     *
     * @return the value
     */
    public String getHost() {
        return host;
    }

    /** The Oracle Database port. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final String port;

    /**
     * The Oracle Database port.
     *
     * @return the value
     */
    public String getPort() {
        return port;
    }

    /** The service name for the data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The service name for the data asset.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** The Oracle Database driver class. */
    @com.fasterxml.jackson.annotation.JsonProperty("driverClass")
    private final String driverClass;

    /**
     * The Oracle Database driver class.
     *
     * @return the value
     */
    public String getDriverClass() {
        return driverClass;
    }

    /** The Oracle Database SID. */
    @com.fasterxml.jackson.annotation.JsonProperty("sid")
    private final String sid;

    /**
     * The Oracle Database SID.
     *
     * @return the value
     */
    public String getSid() {
        return sid;
    }

    /** The credential file content from a wallet for the data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialFileContent")
    private final String credentialFileContent;

    /**
     * The credential file content from a wallet for the data asset.
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

    @com.fasterxml.jackson.annotation.JsonProperty("defaultConnection")
    private final CreateConnectionFromOracle defaultConnection;

    public CreateConnectionFromOracle getDefaultConnection() {
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
        sb.append("CreateDataAssetFromOracle(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", driverClass=").append(String.valueOf(this.driverClass));
        sb.append(", sid=").append(String.valueOf(this.sid));
        sb.append(", credentialFileContent=").append(String.valueOf(this.credentialFileContent));
        sb.append(", walletSecret=").append(String.valueOf(this.walletSecret));
        sb.append(", walletPasswordSecret=").append(String.valueOf(this.walletPasswordSecret));
        sb.append(", defaultConnection=").append(String.valueOf(this.defaultConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataAssetFromOracle)) {
            return false;
        }

        CreateDataAssetFromOracle other = (CreateDataAssetFromOracle) o;
        return java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.driverClass, other.driverClass)
                && java.util.Objects.equals(this.sid, other.sid)
                && java.util.Objects.equals(this.credentialFileContent, other.credentialFileContent)
                && java.util.Objects.equals(this.walletSecret, other.walletSecret)
                && java.util.Objects.equals(this.walletPasswordSecret, other.walletPasswordSecret)
                && java.util.Objects.equals(this.defaultConnection, other.defaultConnection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.driverClass == null ? 43 : this.driverClass.hashCode());
        result = (result * PRIME) + (this.sid == null ? 43 : this.sid.hashCode());
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
        result =
                (result * PRIME)
                        + (this.defaultConnection == null ? 43 : this.defaultConnection.hashCode());
        return result;
    }
}
