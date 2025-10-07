/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the Azure Data Lake Storage Connection. <br>
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
        builder = AzureDataLakeStorageConnectionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AzureDataLakeStorageConnectionSummary extends ConnectionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Connection.LifecycleState lifecycleState;

        public Builder lifecycleState(Connection.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("ingressIps")
        private java.util.List<IngressIpDetails> ingressIps;

        public Builder ingressIps(java.util.List<IngressIpDetails> ingressIps) {
            this.ingressIps = ingressIps;
            this.__explicitlySet__.add("ingressIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routingMethod")
        private RoutingMethod routingMethod;

        public Builder routingMethod(RoutingMethod routingMethod) {
            this.routingMethod = routingMethod;
            this.__explicitlySet__.add("routingMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
        private Boolean doesUseSecretIds;

        public Builder doesUseSecretIds(Boolean doesUseSecretIds) {
            this.doesUseSecretIds = doesUseSecretIds;
            this.__explicitlySet__.add("doesUseSecretIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the account key is stored. Note: When provided, 'accountKey' field must not
         * be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
        private String accountKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the account key is stored. Note: When provided, 'accountKey' field must not
         * be provided.
         *
         * @param accountKeySecretId the value to set
         * @return this builder
         */
        public Builder accountKeySecretId(String accountKeySecretId) {
            this.accountKeySecretId = accountKeySecretId;
            this.__explicitlySet__.add("accountKeySecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the sas token is stored. Note: When provided, 'sasToken' field must not be
         * provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sasTokenSecretId")
        private String sasTokenSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the sas token is stored. Note: When provided, 'sasToken' field must not be
         * provided.
         *
         * @param sasTokenSecretId the value to set
         * @return this builder
         */
        public Builder sasTokenSecretId(String sasTokenSecretId) {
            this.sasTokenSecretId = sasTokenSecretId;
            this.__explicitlySet__.add("sasTokenSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the client secret is stored. Note: When provided, 'clientSecret' field must
         * not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
        private String clientSecretSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the client secret is stored. Note: When provided, 'clientSecret' field must
         * not be provided.
         *
         * @param clientSecretSecretId the value to set
         * @return this builder
         */
        public Builder clientSecretSecretId(String clientSecretSecretId) {
            this.clientSecretSecretId = clientSecretSecretId;
            this.__explicitlySet__.add("clientSecretSecretId");
            return this;
        }
        /**
         * The endpoint used for authentication with Microsoft Entra ID (formerly Azure Active
         * Directory). Default value: https://login.microsoftonline.com When connecting to a
         * non-public Azure Cloud, the endpoint must be provided, eg: * Azure China:
         * https://login.chinacloudapi.cn/ * Azure US Government: https://login.microsoftonline.us/
         */
        @com.fasterxml.jackson.annotation.JsonProperty("azureAuthorityHost")
        private String azureAuthorityHost;

        /**
         * The endpoint used for authentication with Microsoft Entra ID (formerly Azure Active
         * Directory). Default value: https://login.microsoftonline.com When connecting to a
         * non-public Azure Cloud, the endpoint must be provided, eg: * Azure China:
         * https://login.chinacloudapi.cn/ * Azure US Government: https://login.microsoftonline.us/
         *
         * @param azureAuthorityHost the value to set
         * @return this builder
         */
        public Builder azureAuthorityHost(String azureAuthorityHost) {
            this.azureAuthorityHost = azureAuthorityHost;
            this.__explicitlySet__.add("azureAuthorityHost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AzureDataLakeStorageConnectionSummary build() {
            AzureDataLakeStorageConnectionSummary model =
                    new AzureDataLakeStorageConnectionSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.vaultId,
                            this.keyId,
                            this.ingressIps,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.locks,
                            this.doesUseSecretIds,
                            this.subscriptionId,
                            this.clusterPlacementGroupId,
                            this.securityAttributes,
                            this.technologyType,
                            this.authenticationType,
                            this.accountName,
                            this.azureTenantId,
                            this.clientId,
                            this.endpoint,
                            this.accountKeySecretId,
                            this.sasTokenSecretId,
                            this.clientSecretSecretId,
                            this.azureAuthorityHost);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AzureDataLakeStorageConnectionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("ingressIps")) {
                this.ingressIps(model.getIngressIps());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("routingMethod")) {
                this.routingMethod(model.getRoutingMethod());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("doesUseSecretIds")) {
                this.doesUseSecretIds(model.getDoesUseSecretIds());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
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
            if (model.wasPropertyExplicitlySet("azureTenantId")) {
                this.azureTenantId(model.getAzureTenantId());
            }
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
            }
            if (model.wasPropertyExplicitlySet("accountKeySecretId")) {
                this.accountKeySecretId(model.getAccountKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("sasTokenSecretId")) {
                this.sasTokenSecretId(model.getSasTokenSecretId());
            }
            if (model.wasPropertyExplicitlySet("clientSecretSecretId")) {
                this.clientSecretSecretId(model.getClientSecretSecretId());
            }
            if (model.wasPropertyExplicitlySet("azureAuthorityHost")) {
                this.azureAuthorityHost(model.getAzureAuthorityHost());
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
    public AzureDataLakeStorageConnectionSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Connection.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String vaultId,
            String keyId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            java.util.List<ResourceLock> locks,
            Boolean doesUseSecretIds,
            String subscriptionId,
            String clusterPlacementGroupId,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            AzureDataLakeStorageConnection.TechnologyType technologyType,
            AzureDataLakeStorageConnection.AuthenticationType authenticationType,
            String accountName,
            String azureTenantId,
            String clientId,
            String endpoint,
            String accountKeySecretId,
            String sasTokenSecretId,
            String clientSecretSecretId,
            String azureAuthorityHost) {
        super(
                id,
                displayName,
                description,
                compartmentId,
                freeformTags,
                definedTags,
                systemTags,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                vaultId,
                keyId,
                ingressIps,
                nsgIds,
                subnetId,
                routingMethod,
                locks,
                doesUseSecretIds,
                subscriptionId,
                clusterPlacementGroupId,
                securityAttributes);
        this.technologyType = technologyType;
        this.authenticationType = authenticationType;
        this.accountName = accountName;
        this.azureTenantId = azureTenantId;
        this.clientId = clientId;
        this.endpoint = endpoint;
        this.accountKeySecretId = accountKeySecretId;
        this.sasTokenSecretId = sasTokenSecretId;
        this.clientSecretSecretId = clientSecretSecretId;
        this.azureAuthorityHost = azureAuthorityHost;
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the account key is stored. Note: When provided, 'accountKey' field must not be
     * provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
    private final String accountKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the account key is stored. Note: When provided, 'accountKey' field must not be
     * provided.
     *
     * @return the value
     */
    public String getAccountKeySecretId() {
        return accountKeySecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the sas token is stored. Note: When provided, 'sasToken' field must not be
     * provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sasTokenSecretId")
    private final String sasTokenSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the sas token is stored. Note: When provided, 'sasToken' field must not be
     * provided.
     *
     * @return the value
     */
    public String getSasTokenSecretId() {
        return sasTokenSecretId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the client secret is stored. Note: When provided, 'clientSecret' field must not
     * be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
    private final String clientSecretSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the client secret is stored. Note: When provided, 'clientSecret' field must not
     * be provided.
     *
     * @return the value
     */
    public String getClientSecretSecretId() {
        return clientSecretSecretId;
    }

    /**
     * The endpoint used for authentication with Microsoft Entra ID (formerly Azure Active
     * Directory). Default value: https://login.microsoftonline.com When connecting to a non-public
     * Azure Cloud, the endpoint must be provided, eg: * Azure China:
     * https://login.chinacloudapi.cn/ * Azure US Government: https://login.microsoftonline.us/
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureAuthorityHost")
    private final String azureAuthorityHost;

    /**
     * The endpoint used for authentication with Microsoft Entra ID (formerly Azure Active
     * Directory). Default value: https://login.microsoftonline.com When connecting to a non-public
     * Azure Cloud, the endpoint must be provided, eg: * Azure China:
     * https://login.chinacloudapi.cn/ * Azure US Government: https://login.microsoftonline.us/
     *
     * @return the value
     */
    public String getAzureAuthorityHost() {
        return azureAuthorityHost;
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
        sb.append("AzureDataLakeStorageConnectionSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", technologyType=").append(String.valueOf(this.technologyType));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", accountName=").append(String.valueOf(this.accountName));
        sb.append(", azureTenantId=").append(String.valueOf(this.azureTenantId));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", accountKeySecretId=").append(String.valueOf(this.accountKeySecretId));
        sb.append(", sasTokenSecretId=").append(String.valueOf(this.sasTokenSecretId));
        sb.append(", clientSecretSecretId=").append(String.valueOf(this.clientSecretSecretId));
        sb.append(", azureAuthorityHost=").append(String.valueOf(this.azureAuthorityHost));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AzureDataLakeStorageConnectionSummary)) {
            return false;
        }

        AzureDataLakeStorageConnectionSummary other = (AzureDataLakeStorageConnectionSummary) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.accountName, other.accountName)
                && java.util.Objects.equals(this.azureTenantId, other.azureTenantId)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.accountKeySecretId, other.accountKeySecretId)
                && java.util.Objects.equals(this.sasTokenSecretId, other.sasTokenSecretId)
                && java.util.Objects.equals(this.clientSecretSecretId, other.clientSecretSecretId)
                && java.util.Objects.equals(this.azureAuthorityHost, other.azureAuthorityHost)
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
        result =
                (result * PRIME)
                        + (this.azureTenantId == null ? 43 : this.azureTenantId.hashCode());
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.accountKeySecretId == null
                                ? 43
                                : this.accountKeySecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.sasTokenSecretId == null ? 43 : this.sasTokenSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.clientSecretSecretId == null
                                ? 43
                                : this.clientSecretSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.azureAuthorityHost == null
                                ? 43
                                : this.azureAuthorityHost.hashCode());
        return result;
    }
}
