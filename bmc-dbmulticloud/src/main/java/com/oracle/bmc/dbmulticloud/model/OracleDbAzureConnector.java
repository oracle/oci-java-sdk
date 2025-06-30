/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Oracle DB Azure Connector Details, this resource is for to create Azure Identity on Database
 * Resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OracleDbAzureConnector.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OracleDbAzureConnector
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "arcAgentNodes",
        "dbClusterResourceId",
        "azureTenantId",
        "azureSubscriptionId",
        "azureResourceGroup",
        "accessToken",
        "privateEndpointIpAddress",
        "privateEndpointDnsAlias",
        "azureIdentityMechanism",
        "lifecycleState",
        "lifecycleStateDetails",
        "timeCreated",
        "timeUpdated",
        "lastModification",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OracleDbAzureConnector(
            String id,
            String displayName,
            String compartmentId,
            java.util.List<ArcAgentNodes> arcAgentNodes,
            String dbClusterResourceId,
            String azureTenantId,
            String azureSubscriptionId,
            String azureResourceGroup,
            String accessToken,
            String privateEndpointIpAddress,
            String privateEndpointDnsAlias,
            AzureIdentityMechanism azureIdentityMechanism,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String lastModification,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.arcAgentNodes = arcAgentNodes;
        this.dbClusterResourceId = dbClusterResourceId;
        this.azureTenantId = azureTenantId;
        this.azureSubscriptionId = azureSubscriptionId;
        this.azureResourceGroup = azureResourceGroup;
        this.accessToken = accessToken;
        this.privateEndpointIpAddress = privateEndpointIpAddress;
        this.privateEndpointDnsAlias = privateEndpointDnsAlias;
        this.azureIdentityMechanism = azureIdentityMechanism;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lastModification = lastModification;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID of the Oracle DB Azure Connector resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID of the Oracle DB Azure Connector resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Oracle DB Azure Connector resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Oracle DB Azure Connector resource name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The ID of the compartment that contains Oracle DB Azure Connector resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The ID of the compartment that contains Oracle DB Azure Connector resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** List of All VMs where Arc Agent is Install under VMCluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("arcAgentNodes")
        private java.util.List<ArcAgentNodes> arcAgentNodes;

        /**
         * List of All VMs where Arc Agent is Install under VMCluster.
         *
         * @param arcAgentNodes the value to set
         * @return this builder
         */
        public Builder arcAgentNodes(java.util.List<ArcAgentNodes> arcAgentNodes) {
            this.arcAgentNodes = arcAgentNodes;
            this.__explicitlySet__.add("arcAgentNodes");
            return this;
        }
        /** The ID of the DB Cluster Resource where this Azure Arc Agent identity to configure. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbClusterResourceId")
        private String dbClusterResourceId;

        /**
         * The ID of the DB Cluster Resource where this Azure Arc Agent identity to configure.
         *
         * @param dbClusterResourceId the value to set
         * @return this builder
         */
        public Builder dbClusterResourceId(String dbClusterResourceId) {
            this.dbClusterResourceId = dbClusterResourceId;
            this.__explicitlySet__.add("dbClusterResourceId");
            return this;
        }
        /** Azure Tenant ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureTenantId")
        private String azureTenantId;

        /**
         * Azure Tenant ID.
         *
         * @param azureTenantId the value to set
         * @return this builder
         */
        public Builder azureTenantId(String azureTenantId) {
            this.azureTenantId = azureTenantId;
            this.__explicitlySet__.add("azureTenantId");
            return this;
        }
        /** Azure Subscription ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureSubscriptionId")
        private String azureSubscriptionId;

        /**
         * Azure Subscription ID.
         *
         * @param azureSubscriptionId the value to set
         * @return this builder
         */
        public Builder azureSubscriptionId(String azureSubscriptionId) {
            this.azureSubscriptionId = azureSubscriptionId;
            this.__explicitlySet__.add("azureSubscriptionId");
            return this;
        }
        /** Azure Resource Group Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureResourceGroup")
        private String azureResourceGroup;

        /**
         * Azure Resource Group Name.
         *
         * @param azureResourceGroup the value to set
         * @return this builder
         */
        public Builder azureResourceGroup(String azureResourceGroup) {
            this.azureResourceGroup = azureResourceGroup;
            this.__explicitlySet__.add("azureResourceGroup");
            return this;
        }
        /**
         * Azure bearer access token. If bearer access token is provided then Service Principal
         * detail is not required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * Azure bearer access token. If bearer access token is provided then Service Principal
         * detail is not required.
         *
         * @param accessToken the value to set
         * @return this builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            this.__explicitlySet__.add("accessToken");
            return this;
        }
        /** Private endpoint IP. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIpAddress")
        private String privateEndpointIpAddress;

        /**
         * Private endpoint IP.
         *
         * @param privateEndpointIpAddress the value to set
         * @return this builder
         */
        public Builder privateEndpointIpAddress(String privateEndpointIpAddress) {
            this.privateEndpointIpAddress = privateEndpointIpAddress;
            this.__explicitlySet__.add("privateEndpointIpAddress");
            return this;
        }
        /** Private endpoint DNS Alias. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDnsAlias")
        private String privateEndpointDnsAlias;

        /**
         * Private endpoint DNS Alias.
         *
         * @param privateEndpointDnsAlias the value to set
         * @return this builder
         */
        public Builder privateEndpointDnsAlias(String privateEndpointDnsAlias) {
            this.privateEndpointDnsAlias = privateEndpointDnsAlias;
            this.__explicitlySet__.add("privateEndpointDnsAlias");
            return this;
        }
        /** Azure Identity Mechanism. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureIdentityMechanism")
        private AzureIdentityMechanism azureIdentityMechanism;

        /**
         * Azure Identity Mechanism.
         *
         * @param azureIdentityMechanism the value to set
         * @return this builder
         */
        public Builder azureIdentityMechanism(AzureIdentityMechanism azureIdentityMechanism) {
            this.azureIdentityMechanism = azureIdentityMechanism;
            this.__explicitlySet__.add("azureIdentityMechanism");
            return this;
        }
        /** The current lifecycle state of the Azure Arc Agent Resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the Azure Arc Agent Resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Description of the current lifecycle state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * Description of the current lifecycle state in more detail.
         *
         * @param lifecycleStateDetails the value to set
         * @return this builder
         */
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /**
         * Time when the Oracle DB Azure Connector Resource was created expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when the Oracle DB Azure Connector Resource was created expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Time when the Oracle DB Azure Connector Resource was last modified expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the Oracle DB Azure Connector Resource was last modified expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Description of the latest modification of the Oracle DB Azure Connector Resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastModification")
        private String lastModification;

        /**
         * Description of the latest modification of the Oracle DB Azure Connector Resource.
         *
         * @param lastModification the value to set
         * @return this builder
         */
        public Builder lastModification(String lastModification) {
            this.lastModification = lastModification;
            this.__explicitlySet__.add("lastModification");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleDbAzureConnector build() {
            OracleDbAzureConnector model =
                    new OracleDbAzureConnector(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.arcAgentNodes,
                            this.dbClusterResourceId,
                            this.azureTenantId,
                            this.azureSubscriptionId,
                            this.azureResourceGroup,
                            this.accessToken,
                            this.privateEndpointIpAddress,
                            this.privateEndpointDnsAlias,
                            this.azureIdentityMechanism,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lastModification,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleDbAzureConnector model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("arcAgentNodes")) {
                this.arcAgentNodes(model.getArcAgentNodes());
            }
            if (model.wasPropertyExplicitlySet("dbClusterResourceId")) {
                this.dbClusterResourceId(model.getDbClusterResourceId());
            }
            if (model.wasPropertyExplicitlySet("azureTenantId")) {
                this.azureTenantId(model.getAzureTenantId());
            }
            if (model.wasPropertyExplicitlySet("azureSubscriptionId")) {
                this.azureSubscriptionId(model.getAzureSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("azureResourceGroup")) {
                this.azureResourceGroup(model.getAzureResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("accessToken")) {
                this.accessToken(model.getAccessToken());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIpAddress")) {
                this.privateEndpointIpAddress(model.getPrivateEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointDnsAlias")) {
                this.privateEndpointDnsAlias(model.getPrivateEndpointDnsAlias());
            }
            if (model.wasPropertyExplicitlySet("azureIdentityMechanism")) {
                this.azureIdentityMechanism(model.getAzureIdentityMechanism());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lastModification")) {
                this.lastModification(model.getLastModification());
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

    /** The ID of the Oracle DB Azure Connector resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID of the Oracle DB Azure Connector resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Oracle DB Azure Connector resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Oracle DB Azure Connector resource name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The ID of the compartment that contains Oracle DB Azure Connector resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The ID of the compartment that contains Oracle DB Azure Connector resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** List of All VMs where Arc Agent is Install under VMCluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("arcAgentNodes")
    private final java.util.List<ArcAgentNodes> arcAgentNodes;

    /**
     * List of All VMs where Arc Agent is Install under VMCluster.
     *
     * @return the value
     */
    public java.util.List<ArcAgentNodes> getArcAgentNodes() {
        return arcAgentNodes;
    }

    /** The ID of the DB Cluster Resource where this Azure Arc Agent identity to configure. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbClusterResourceId")
    private final String dbClusterResourceId;

    /**
     * The ID of the DB Cluster Resource where this Azure Arc Agent identity to configure.
     *
     * @return the value
     */
    public String getDbClusterResourceId() {
        return dbClusterResourceId;
    }

    /** Azure Tenant ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureTenantId")
    private final String azureTenantId;

    /**
     * Azure Tenant ID.
     *
     * @return the value
     */
    public String getAzureTenantId() {
        return azureTenantId;
    }

    /** Azure Subscription ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureSubscriptionId")
    private final String azureSubscriptionId;

    /**
     * Azure Subscription ID.
     *
     * @return the value
     */
    public String getAzureSubscriptionId() {
        return azureSubscriptionId;
    }

    /** Azure Resource Group Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureResourceGroup")
    private final String azureResourceGroup;

    /**
     * Azure Resource Group Name.
     *
     * @return the value
     */
    public String getAzureResourceGroup() {
        return azureResourceGroup;
    }

    /**
     * Azure bearer access token. If bearer access token is provided then Service Principal detail
     * is not required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * Azure bearer access token. If bearer access token is provided then Service Principal detail
     * is not required.
     *
     * @return the value
     */
    public String getAccessToken() {
        return accessToken;
    }

    /** Private endpoint IP. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointIpAddress")
    private final String privateEndpointIpAddress;

    /**
     * Private endpoint IP.
     *
     * @return the value
     */
    public String getPrivateEndpointIpAddress() {
        return privateEndpointIpAddress;
    }

    /** Private endpoint DNS Alias. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDnsAlias")
    private final String privateEndpointDnsAlias;

    /**
     * Private endpoint DNS Alias.
     *
     * @return the value
     */
    public String getPrivateEndpointDnsAlias() {
        return privateEndpointDnsAlias;
    }

    /** Azure Identity Mechanism. */
    public enum AzureIdentityMechanism implements com.oracle.bmc.http.internal.BmcEnum {
        ArcAgent("ARC_AGENT"),
        ServicePrincipal("SERVICE_PRINCIPAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AzureIdentityMechanism.class);

        private final String value;
        private static java.util.Map<String, AzureIdentityMechanism> map;

        static {
            map = new java.util.HashMap<>();
            for (AzureIdentityMechanism v : AzureIdentityMechanism.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AzureIdentityMechanism(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AzureIdentityMechanism create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AzureIdentityMechanism', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Azure Identity Mechanism. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureIdentityMechanism")
    private final AzureIdentityMechanism azureIdentityMechanism;

    /**
     * Azure Identity Mechanism.
     *
     * @return the value
     */
    public AzureIdentityMechanism getAzureIdentityMechanism() {
        return azureIdentityMechanism;
    }

    /** The current lifecycle state of the Azure Arc Agent Resource. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current lifecycle state of the Azure Arc Agent Resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the Azure Arc Agent Resource.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Description of the current lifecycle state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * Description of the current lifecycle state in more detail.
     *
     * @return the value
     */
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /**
     * Time when the Oracle DB Azure Connector Resource was created expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when the Oracle DB Azure Connector Resource was created expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time when the Oracle DB Azure Connector Resource was last modified expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the Oracle DB Azure Connector Resource was last modified expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Description of the latest modification of the Oracle DB Azure Connector Resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastModification")
    private final String lastModification;

    /**
     * Description of the latest modification of the Oracle DB Azure Connector Resource.
     *
     * @return the value
     */
    public String getLastModification() {
        return lastModification;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OracleDbAzureConnector(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", arcAgentNodes=").append(String.valueOf(this.arcAgentNodes));
        sb.append(", dbClusterResourceId=").append(String.valueOf(this.dbClusterResourceId));
        sb.append(", azureTenantId=").append(String.valueOf(this.azureTenantId));
        sb.append(", azureSubscriptionId=").append(String.valueOf(this.azureSubscriptionId));
        sb.append(", azureResourceGroup=").append(String.valueOf(this.azureResourceGroup));
        sb.append(", accessToken=").append(String.valueOf(this.accessToken));
        sb.append(", privateEndpointIpAddress=")
                .append(String.valueOf(this.privateEndpointIpAddress));
        sb.append(", privateEndpointDnsAlias=")
                .append(String.valueOf(this.privateEndpointDnsAlias));
        sb.append(", azureIdentityMechanism=").append(String.valueOf(this.azureIdentityMechanism));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lastModification=").append(String.valueOf(this.lastModification));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleDbAzureConnector)) {
            return false;
        }

        OracleDbAzureConnector other = (OracleDbAzureConnector) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.arcAgentNodes, other.arcAgentNodes)
                && java.util.Objects.equals(this.dbClusterResourceId, other.dbClusterResourceId)
                && java.util.Objects.equals(this.azureTenantId, other.azureTenantId)
                && java.util.Objects.equals(this.azureSubscriptionId, other.azureSubscriptionId)
                && java.util.Objects.equals(this.azureResourceGroup, other.azureResourceGroup)
                && java.util.Objects.equals(this.accessToken, other.accessToken)
                && java.util.Objects.equals(
                        this.privateEndpointIpAddress, other.privateEndpointIpAddress)
                && java.util.Objects.equals(
                        this.privateEndpointDnsAlias, other.privateEndpointDnsAlias)
                && java.util.Objects.equals(
                        this.azureIdentityMechanism, other.azureIdentityMechanism)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lastModification, other.lastModification)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.arcAgentNodes == null ? 43 : this.arcAgentNodes.hashCode());
        result =
                (result * PRIME)
                        + (this.dbClusterResourceId == null
                                ? 43
                                : this.dbClusterResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.azureTenantId == null ? 43 : this.azureTenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.azureSubscriptionId == null
                                ? 43
                                : this.azureSubscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.azureResourceGroup == null
                                ? 43
                                : this.azureResourceGroup.hashCode());
        result = (result * PRIME) + (this.accessToken == null ? 43 : this.accessToken.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointIpAddress == null
                                ? 43
                                : this.privateEndpointIpAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointDnsAlias == null
                                ? 43
                                : this.privateEndpointDnsAlias.hashCode());
        result =
                (result * PRIME)
                        + (this.azureIdentityMechanism == null
                                ? 43
                                : this.azureIdentityMechanism.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lastModification == null ? 43 : this.lastModification.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
