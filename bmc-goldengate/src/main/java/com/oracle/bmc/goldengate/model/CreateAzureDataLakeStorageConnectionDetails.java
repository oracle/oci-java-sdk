/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Azure Data Lake Storage Connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAzureDataLakeStorageConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAzureDataLakeStorageConnectionDetails extends CreateConnectionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /** The Azure Data Lake Storage technology type. */
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private AzureDataLakeStorageConnection.TechnologyType technologyType;

        /**
         * The Azure Data Lake Storage technology type.
         *
         * @param technologyType the value to set
         * @return this builder
         */
        public Builder technologyType(
                AzureDataLakeStorageConnection.TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /** Used authentication mechanism to access Azure Data Lake Storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private AzureDataLakeStorageConnection.AuthenticationType authenticationType;

        /**
         * Used authentication mechanism to access Azure Data Lake Storage.
         *
         * @param authenticationType the value to set
         * @return this builder
         */
        public Builder authenticationType(
                AzureDataLakeStorageConnection.AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /** Sets the Azure storage account name. */
        @com.fasterxml.jackson.annotation.JsonProperty("accountName")
        private String accountName;

        /**
         * Sets the Azure storage account name.
         *
         * @param accountName the value to set
         * @return this builder
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            this.__explicitlySet__.add("accountName");
            return this;
        }
        /**
         * Azure storage account key. This property is required when 'authenticationType' is set to
         * 'SHARED_KEY'. e.g.:
         * pa3WbhVATzj56xD4DH1VjOUhApRGEGHvOo58eQJVWIzX+j8j4CUVFcTjpIqDSRaSa1Wo2LbWY5at+AStEgLOIQ==
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountKey")
        private String accountKey;

        /**
         * Azure storage account key. This property is required when 'authenticationType' is set to
         * 'SHARED_KEY'. e.g.:
         * pa3WbhVATzj56xD4DH1VjOUhApRGEGHvOo58eQJVWIzX+j8j4CUVFcTjpIqDSRaSa1Wo2LbWY5at+AStEgLOIQ==
         *
         * @param accountKey the value to set
         * @return this builder
         */
        public Builder accountKey(String accountKey) {
            this.accountKey = accountKey;
            this.__explicitlySet__.add("accountKey");
            return this;
        }
        /**
         * Credential that uses a shared access signature (SAS) to authenticate to an Azure Service.
         * This property is required when 'authenticationType' is set to 'SHARED_ACCESS_SIGNATURE'.
         * e.g.:
         * ?sv=2020-06-08&ss=bfqt&srt=sco&sp=rwdlacupyx&se=2020-09-10T20:27:28Z&st=2022-08-05T12:27:28Z&spr=https&sig=C1IgHsiLBmTSStYkXXGLTP8it0xBrArcgCqOsZbXwIQ%3D
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sasToken")
        private String sasToken;

        /**
         * Credential that uses a shared access signature (SAS) to authenticate to an Azure Service.
         * This property is required when 'authenticationType' is set to 'SHARED_ACCESS_SIGNATURE'.
         * e.g.:
         * ?sv=2020-06-08&ss=bfqt&srt=sco&sp=rwdlacupyx&se=2020-09-10T20:27:28Z&st=2022-08-05T12:27:28Z&spr=https&sig=C1IgHsiLBmTSStYkXXGLTP8it0xBrArcgCqOsZbXwIQ%3D
         *
         * @param sasToken the value to set
         * @return this builder
         */
        public Builder sasToken(String sasToken) {
            this.sasToken = sasToken;
            this.__explicitlySet__.add("sasToken");
            return this;
        }
        /**
         * Azure tenant ID of the application. This property is required when 'authenticationType'
         * is set to 'AZURE_ACTIVE_DIRECTORY'. e.g.: 14593954-d337-4a61-a364-9f758c64f97f
         */
        @com.fasterxml.jackson.annotation.JsonProperty("azureTenantId")
        private String azureTenantId;

        /**
         * Azure tenant ID of the application. This property is required when 'authenticationType'
         * is set to 'AZURE_ACTIVE_DIRECTORY'. e.g.: 14593954-d337-4a61-a364-9f758c64f97f
         *
         * @param azureTenantId the value to set
         * @return this builder
         */
        public Builder azureTenantId(String azureTenantId) {
            this.azureTenantId = azureTenantId;
            this.__explicitlySet__.add("azureTenantId");
            return this;
        }
        /**
         * Azure client ID of the application. This property is required when 'authenticationType'
         * is set to 'AZURE_ACTIVE_DIRECTORY'. e.g.: 06ecaabf-8b80-4ec8-a0ec-20cbf463703d
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * Azure client ID of the application. This property is required when 'authenticationType'
         * is set to 'AZURE_ACTIVE_DIRECTORY'. e.g.: 06ecaabf-8b80-4ec8-a0ec-20cbf463703d
         *
         * @param clientId the value to set
         * @return this builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * Azure client secret (aka application password) for authentication. This property is
         * required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'. e.g.:
         * dO29Q~F5-VwnA.lZdd11xFF_t5NAXCaGwDl9NbT1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
        private String clientSecret;

        /**
         * Azure client secret (aka application password) for authentication. This property is
         * required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'. e.g.:
         * dO29Q~F5-VwnA.lZdd11xFF_t5NAXCaGwDl9NbT1
         *
         * @param clientSecret the value to set
         * @return this builder
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            this.__explicitlySet__.add("clientSecret");
            return this;
        }
        /** Azure Storage service endpoint. e.g: https://test.blob.core.windows.net */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * Azure Storage service endpoint. e.g: https://test.blob.core.windows.net
         *
         * @param endpoint the value to set
         * @return this builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAzureDataLakeStorageConnectionDetails build() {
            CreateAzureDataLakeStorageConnectionDetails model =
                    new CreateAzureDataLakeStorageConnectionDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.vaultId,
                            this.keyId,
                            this.subnetId,
                            this.nsgIds,
                            this.technologyType,
                            this.authenticationType,
                            this.accountName,
                            this.accountKey,
                            this.sasToken,
                            this.azureTenantId,
                            this.clientId,
                            this.clientSecret,
                            this.endpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAzureDataLakeStorageConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("technologyType")) {
                this.technologyType(model.getTechnologyType());
            }
            if (model.wasPropertyExplicitlySet("authenticationType")) {
                this.authenticationType(model.getAuthenticationType());
            }
            if (model.wasPropertyExplicitlySet("accountName")) {
                this.accountName(model.getAccountName());
            }
            if (model.wasPropertyExplicitlySet("accountKey")) {
                this.accountKey(model.getAccountKey());
            }
            if (model.wasPropertyExplicitlySet("sasToken")) {
                this.sasToken(model.getSasToken());
            }
            if (model.wasPropertyExplicitlySet("azureTenantId")) {
                this.azureTenantId(model.getAzureTenantId());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("clientSecret")) {
                this.clientSecret(model.getClientSecret());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
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
    public CreateAzureDataLakeStorageConnectionDetails(
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String vaultId,
            String keyId,
            String subnetId,
            java.util.List<String> nsgIds,
            AzureDataLakeStorageConnection.TechnologyType technologyType,
            AzureDataLakeStorageConnection.AuthenticationType authenticationType,
            String accountName,
            String accountKey,
            String sasToken,
            String azureTenantId,
            String clientId,
            String clientSecret,
            String endpoint) {
        super(
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                vaultId,
                keyId,
                subnetId,
                nsgIds);
        this.technologyType = technologyType;
        this.authenticationType = authenticationType;
        this.accountName = accountName;
        this.accountKey = accountKey;
        this.sasToken = sasToken;
        this.azureTenantId = azureTenantId;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.endpoint = endpoint;
    }

    /** The Azure Data Lake Storage technology type. */
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final AzureDataLakeStorageConnection.TechnologyType technologyType;

    /**
     * The Azure Data Lake Storage technology type.
     *
     * @return the value
     */
    public AzureDataLakeStorageConnection.TechnologyType getTechnologyType() {
        return technologyType;
    }

    /** Used authentication mechanism to access Azure Data Lake Storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final AzureDataLakeStorageConnection.AuthenticationType authenticationType;

    /**
     * Used authentication mechanism to access Azure Data Lake Storage.
     *
     * @return the value
     */
    public AzureDataLakeStorageConnection.AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /** Sets the Azure storage account name. */
    @com.fasterxml.jackson.annotation.JsonProperty("accountName")
    private final String accountName;

    /**
     * Sets the Azure storage account name.
     *
     * @return the value
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Azure storage account key. This property is required when 'authenticationType' is set to
     * 'SHARED_KEY'. e.g.:
     * pa3WbhVATzj56xD4DH1VjOUhApRGEGHvOo58eQJVWIzX+j8j4CUVFcTjpIqDSRaSa1Wo2LbWY5at+AStEgLOIQ==
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountKey")
    private final String accountKey;

    /**
     * Azure storage account key. This property is required when 'authenticationType' is set to
     * 'SHARED_KEY'. e.g.:
     * pa3WbhVATzj56xD4DH1VjOUhApRGEGHvOo58eQJVWIzX+j8j4CUVFcTjpIqDSRaSa1Wo2LbWY5at+AStEgLOIQ==
     *
     * @return the value
     */
    public String getAccountKey() {
        return accountKey;
    }

    /**
     * Credential that uses a shared access signature (SAS) to authenticate to an Azure Service.
     * This property is required when 'authenticationType' is set to 'SHARED_ACCESS_SIGNATURE'.
     * e.g.:
     * ?sv=2020-06-08&ss=bfqt&srt=sco&sp=rwdlacupyx&se=2020-09-10T20:27:28Z&st=2022-08-05T12:27:28Z&spr=https&sig=C1IgHsiLBmTSStYkXXGLTP8it0xBrArcgCqOsZbXwIQ%3D
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sasToken")
    private final String sasToken;

    /**
     * Credential that uses a shared access signature (SAS) to authenticate to an Azure Service.
     * This property is required when 'authenticationType' is set to 'SHARED_ACCESS_SIGNATURE'.
     * e.g.:
     * ?sv=2020-06-08&ss=bfqt&srt=sco&sp=rwdlacupyx&se=2020-09-10T20:27:28Z&st=2022-08-05T12:27:28Z&spr=https&sig=C1IgHsiLBmTSStYkXXGLTP8it0xBrArcgCqOsZbXwIQ%3D
     *
     * @return the value
     */
    public String getSasToken() {
        return sasToken;
    }

    /**
     * Azure tenant ID of the application. This property is required when 'authenticationType' is
     * set to 'AZURE_ACTIVE_DIRECTORY'. e.g.: 14593954-d337-4a61-a364-9f758c64f97f
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureTenantId")
    private final String azureTenantId;

    /**
     * Azure tenant ID of the application. This property is required when 'authenticationType' is
     * set to 'AZURE_ACTIVE_DIRECTORY'. e.g.: 14593954-d337-4a61-a364-9f758c64f97f
     *
     * @return the value
     */
    public String getAzureTenantId() {
        return azureTenantId;
    }

    /**
     * Azure client ID of the application. This property is required when 'authenticationType' is
     * set to 'AZURE_ACTIVE_DIRECTORY'. e.g.: 06ecaabf-8b80-4ec8-a0ec-20cbf463703d
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * Azure client ID of the application. This property is required when 'authenticationType' is
     * set to 'AZURE_ACTIVE_DIRECTORY'. e.g.: 06ecaabf-8b80-4ec8-a0ec-20cbf463703d
     *
     * @return the value
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Azure client secret (aka application password) for authentication. This property is required
     * when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'. e.g.:
     * dO29Q~F5-VwnA.lZdd11xFF_t5NAXCaGwDl9NbT1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecret")
    private final String clientSecret;

    /**
     * Azure client secret (aka application password) for authentication. This property is required
     * when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'. e.g.:
     * dO29Q~F5-VwnA.lZdd11xFF_t5NAXCaGwDl9NbT1
     *
     * @return the value
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /** Azure Storage service endpoint. e.g: https://test.blob.core.windows.net */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * Azure Storage service endpoint. e.g: https://test.blob.core.windows.net
     *
     * @return the value
     */
    public String getEndpoint() {
        return endpoint;
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
        sb.append("CreateAzureDataLakeStorageConnectionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", accountName=").append(String.valueOf(this.accountName));
        sb.append(", accountKey=").append("<redacted>");
        sb.append(", sasToken=").append("<redacted>");
        sb.append(", azureTenantId=").append(String.valueOf(this.azureTenantId));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", clientSecret=").append("<redacted>");
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAzureDataLakeStorageConnectionDetails)) {
            return false;
        }

        CreateAzureDataLakeStorageConnectionDetails other =
                (CreateAzureDataLakeStorageConnectionDetails) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.accountName, other.accountName)
                && java.util.Objects.equals(this.accountKey, other.accountKey)
                && java.util.Objects.equals(this.sasToken, other.sasToken)
                && java.util.Objects.equals(this.azureTenantId, other.azureTenantId)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.clientSecret, other.clientSecret)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + (this.accountName == null ? 43 : this.accountName.hashCode());
        result = (result * PRIME) + (this.accountKey == null ? 43 : this.accountKey.hashCode());
        result = (result * PRIME) + (this.sasToken == null ? 43 : this.sasToken.hashCode());
        result =
                (result * PRIME)
                        + (this.azureTenantId == null ? 43 : this.azureTenantId.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.clientSecret == null ? 43 : this.clientSecret.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        return result;
    }
}
