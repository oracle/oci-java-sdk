/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the metadata of a Azure Data Lake Storage Connection.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AzureDataLakeStorageConnection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AzureDataLakeStorageConnection extends Connection {
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
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
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

        @com.fasterxml.jackson.annotation.JsonProperty("doesUseSecretIds")
        private Boolean doesUseSecretIds;

        public Builder doesUseSecretIds(Boolean doesUseSecretIds) {
            this.doesUseSecretIds = doesUseSecretIds;
            this.__explicitlySet__.add("doesUseSecretIds");
            return this;
        }
        /**
         * The Azure Data Lake Storage technology type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
        private TechnologyType technologyType;

        /**
         * The Azure Data Lake Storage technology type.
         * @param technologyType the value to set
         * @return this builder
         **/
        public Builder technologyType(TechnologyType technologyType) {
            this.technologyType = technologyType;
            this.__explicitlySet__.add("technologyType");
            return this;
        }
        /**
         * Used authentication mechanism to access Azure Data Lake Storage.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private AuthenticationType authenticationType;

        /**
         * Used authentication mechanism to access Azure Data Lake Storage.
         *
         * @param authenticationType the value to set
         * @return this builder
         **/
        public Builder authenticationType(AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * Sets the Azure storage account name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accountName")
        private String accountName;

        /**
         * Sets the Azure storage account name.
         *
         * @param accountName the value to set
         * @return this builder
         **/
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            this.__explicitlySet__.add("accountName");
            return this;
        }
        /**
         * Azure tenant ID of the application. This property is required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'.
         * e.g.: 14593954-d337-4a61-a364-9f758c64f97f
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("azureTenantId")
        private String azureTenantId;

        /**
         * Azure tenant ID of the application. This property is required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'.
         * e.g.: 14593954-d337-4a61-a364-9f758c64f97f
         *
         * @param azureTenantId the value to set
         * @return this builder
         **/
        public Builder azureTenantId(String azureTenantId) {
            this.azureTenantId = azureTenantId;
            this.__explicitlySet__.add("azureTenantId");
            return this;
        }
        /**
         * Azure client ID of the application. This property is required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'.
         * e.g.: 06ecaabf-8b80-4ec8-a0ec-20cbf463703d
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * Azure client ID of the application. This property is required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'.
         * e.g.: 06ecaabf-8b80-4ec8-a0ec-20cbf463703d
         *
         * @param clientId the value to set
         * @return this builder
         **/
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * Azure Storage service endpoint.
         * e.g: https://test.blob.core.windows.net
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * Azure Storage service endpoint.
         * e.g: https://test.blob.core.windows.net
         *
         * @param endpoint the value to set
         * @return this builder
         **/
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the account key is stored.
         * Note: When provided, 'accountKey' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
        private String accountKeySecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the account key is stored.
         * Note: When provided, 'accountKey' field must not be provided.
         *
         * @param accountKeySecretId the value to set
         * @return this builder
         **/
        public Builder accountKeySecretId(String accountKeySecretId) {
            this.accountKeySecretId = accountKeySecretId;
            this.__explicitlySet__.add("accountKeySecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the sas token is stored.
         * Note: When provided, 'sasToken' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sasTokenSecretId")
        private String sasTokenSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the sas token is stored.
         * Note: When provided, 'sasToken' field must not be provided.
         *
         * @param sasTokenSecretId the value to set
         * @return this builder
         **/
        public Builder sasTokenSecretId(String sasTokenSecretId) {
            this.sasTokenSecretId = sasTokenSecretId;
            this.__explicitlySet__.add("sasTokenSecretId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the client secret is stored.
         * Note: When provided, 'clientSecret' field must not be provided.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
        private String clientSecretSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the client secret is stored.
         * Note: When provided, 'clientSecret' field must not be provided.
         *
         * @param clientSecretSecretId the value to set
         * @return this builder
         **/
        public Builder clientSecretSecretId(String clientSecretSecretId) {
            this.clientSecretSecretId = clientSecretSecretId;
            this.__explicitlySet__.add("clientSecretSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AzureDataLakeStorageConnection build() {
            AzureDataLakeStorageConnection model =
                    new AzureDataLakeStorageConnection(
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
                            this.locks,
                            this.vaultId,
                            this.keyId,
                            this.ingressIps,
                            this.nsgIds,
                            this.subnetId,
                            this.routingMethod,
                            this.doesUseSecretIds,
                            this.technologyType,
                            this.authenticationType,
                            this.accountName,
                            this.azureTenantId,
                            this.clientId,
                            this.endpoint,
                            this.accountKeySecretId,
                            this.sasTokenSecretId,
                            this.clientSecretSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AzureDataLakeStorageConnection model) {
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
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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
            if (model.wasPropertyExplicitlySet("doesUseSecretIds")) {
                this.doesUseSecretIds(model.getDoesUseSecretIds());
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
            return this;
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
    public AzureDataLakeStorageConnection(
            String id,
            String displayName,
            String description,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<ResourceLock> locks,
            String vaultId,
            String keyId,
            java.util.List<IngressIpDetails> ingressIps,
            java.util.List<String> nsgIds,
            String subnetId,
            RoutingMethod routingMethod,
            Boolean doesUseSecretIds,
            TechnologyType technologyType,
            AuthenticationType authenticationType,
            String accountName,
            String azureTenantId,
            String clientId,
            String endpoint,
            String accountKeySecretId,
            String sasTokenSecretId,
            String clientSecretSecretId) {
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
                locks,
                vaultId,
                keyId,
                ingressIps,
                nsgIds,
                subnetId,
                routingMethod,
                doesUseSecretIds);
        this.technologyType = technologyType;
        this.authenticationType = authenticationType;
        this.accountName = accountName;
        this.azureTenantId = azureTenantId;
        this.clientId = clientId;
        this.endpoint = endpoint;
        this.accountKeySecretId = accountKeySecretId;
        this.sasTokenSecretId = sasTokenSecretId;
        this.clientSecretSecretId = clientSecretSecretId;
    }

    /**
     * The Azure Data Lake Storage technology type.
     **/
    public enum TechnologyType {
        AzureDataLakeStorage("AZURE_DATA_LAKE_STORAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TechnologyType.class);

        private final String value;
        private static java.util.Map<String, TechnologyType> map;

        static {
            map = new java.util.HashMap<>();
            for (TechnologyType v : TechnologyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TechnologyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TechnologyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TechnologyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Azure Data Lake Storage technology type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("technologyType")
    private final TechnologyType technologyType;

    /**
     * The Azure Data Lake Storage technology type.
     * @return the value
     **/
    public TechnologyType getTechnologyType() {
        return technologyType;
    }

    /**
     * Used authentication mechanism to access Azure Data Lake Storage.
     *
     **/
    public enum AuthenticationType {
        SharedKey("SHARED_KEY"),
        SharedAccessSignature("SHARED_ACCESS_SIGNATURE"),
        AzureActiveDirectory("AZURE_ACTIVE_DIRECTORY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthenticationType.class);

        private final String value;
        private static java.util.Map<String, AuthenticationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticationType v : AuthenticationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthenticationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthenticationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthenticationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Used authentication mechanism to access Azure Data Lake Storage.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final AuthenticationType authenticationType;

    /**
     * Used authentication mechanism to access Azure Data Lake Storage.
     *
     * @return the value
     **/
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the Azure storage account name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accountName")
    private final String accountName;

    /**
     * Sets the Azure storage account name.
     *
     * @return the value
     **/
    public String getAccountName() {
        return accountName;
    }

    /**
     * Azure tenant ID of the application. This property is required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'.
     * e.g.: 14593954-d337-4a61-a364-9f758c64f97f
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("azureTenantId")
    private final String azureTenantId;

    /**
     * Azure tenant ID of the application. This property is required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'.
     * e.g.: 14593954-d337-4a61-a364-9f758c64f97f
     *
     * @return the value
     **/
    public String getAzureTenantId() {
        return azureTenantId;
    }

    /**
     * Azure client ID of the application. This property is required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'.
     * e.g.: 06ecaabf-8b80-4ec8-a0ec-20cbf463703d
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * Azure client ID of the application. This property is required when 'authenticationType' is set to 'AZURE_ACTIVE_DIRECTORY'.
     * e.g.: 06ecaabf-8b80-4ec8-a0ec-20cbf463703d
     *
     * @return the value
     **/
    public String getClientId() {
        return clientId;
    }

    /**
     * Azure Storage service endpoint.
     * e.g: https://test.blob.core.windows.net
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * Azure Storage service endpoint.
     * e.g: https://test.blob.core.windows.net
     *
     * @return the value
     **/
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the account key is stored.
     * Note: When provided, 'accountKey' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
    private final String accountKeySecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the account key is stored.
     * Note: When provided, 'accountKey' field must not be provided.
     *
     * @return the value
     **/
    public String getAccountKeySecretId() {
        return accountKeySecretId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the sas token is stored.
     * Note: When provided, 'sasToken' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sasTokenSecretId")
    private final String sasTokenSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the sas token is stored.
     * Note: When provided, 'sasToken' field must not be provided.
     *
     * @return the value
     **/
    public String getSasTokenSecretId() {
        return sasTokenSecretId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the client secret is stored.
     * Note: When provided, 'clientSecret' field must not be provided.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecretSecretId")
    private final String clientSecretSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Secret where the client secret is stored.
     * Note: When provided, 'clientSecret' field must not be provided.
     *
     * @return the value
     **/
    public String getClientSecretSecretId() {
        return clientSecretSecretId;
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
        sb.append("AzureDataLakeStorageConnection(");
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
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AzureDataLakeStorageConnection)) {
            return false;
        }

        AzureDataLakeStorageConnection other = (AzureDataLakeStorageConnection) o;
        return java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.accountName, other.accountName)
                && java.util.Objects.equals(this.azureTenantId, other.azureTenantId)
                && java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.accountKeySecretId, other.accountKeySecretId)
                && java.util.Objects.equals(this.sasTokenSecretId, other.sasTokenSecretId)
                && java.util.Objects.equals(this.clientSecretSecretId, other.clientSecretSecretId)
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
        return result;
    }
}
