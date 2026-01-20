/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Details of Oracle DB Azure Connector resource. <br>
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
        builder = OracleDbAzureConnectorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OracleDbAzureConnectorSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "dbClusterResourceId",
        "displayName",
        "arcAgentNodes",
        "azureTenantId",
        "azureSubscriptionId",
        "azureResourceGroup",
        "privateEndpointIpAddress",
        "privateEndpointDnsAlias",
        "lifecycleState",
        "lifecycleStateDetails",
        "azureIdentityMechanism",
        "azureIdentityConnectivityStatus",
        "timeCreated",
        "timeUpdated",
        "lastModification",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OracleDbAzureConnectorSummary(
            String id,
            String compartmentId,
            String dbClusterResourceId,
            String displayName,
            java.util.List<ArcAgentNodes> arcAgentNodes,
            String azureTenantId,
            String azureSubscriptionId,
            String azureResourceGroup,
            String privateEndpointIpAddress,
            String privateEndpointDnsAlias,
            OracleDbAzureConnector.LifecycleState lifecycleState,
            String lifecycleStateDetails,
            OracleDbAzureConnector.AzureIdentityMechanism azureIdentityMechanism,
            OracleDbAzureConnector.AzureIdentityConnectivityStatus azureIdentityConnectivityStatus,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String lastModification,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.dbClusterResourceId = dbClusterResourceId;
        this.displayName = displayName;
        this.arcAgentNodes = arcAgentNodes;
        this.azureTenantId = azureTenantId;
        this.azureSubscriptionId = azureSubscriptionId;
        this.azureResourceGroup = azureResourceGroup;
        this.privateEndpointIpAddress = privateEndpointIpAddress;
        this.privateEndpointDnsAlias = privateEndpointDnsAlias;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.azureIdentityMechanism = azureIdentityMechanism;
        this.azureIdentityConnectivityStatus = azureIdentityConnectivityStatus;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lastModification = lastModification;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Azure Connector resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Azure Connector resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains Oracle DB Azure Connector resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains Oracle DB Azure Connector resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Cloud VM Cluster resource where this Azure Arc Agent Identity to configure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbClusterResourceId")
        private String dbClusterResourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Cloud VM Cluster resource where this Azure Arc Agent Identity to configure.
         *
         * @param dbClusterResourceId the value to set
         * @return this builder
         */
        public Builder dbClusterResourceId(String dbClusterResourceId) {
            this.dbClusterResourceId = dbClusterResourceId;
            this.__explicitlySet__.add("dbClusterResourceId");
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
        /** List of all VMs where Arc Agent Identity is configure under Oracle Cloud VM Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("arcAgentNodes")
        private java.util.List<ArcAgentNodes> arcAgentNodes;

        /**
         * List of all VMs where Arc Agent Identity is configure under Oracle Cloud VM Cluster.
         *
         * @param arcAgentNodes the value to set
         * @return this builder
         */
        public Builder arcAgentNodes(java.util.List<ArcAgentNodes> arcAgentNodes) {
            this.arcAgentNodes = arcAgentNodes;
            this.__explicitlySet__.add("arcAgentNodes");
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
        /** Azure Resource group name. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureResourceGroup")
        private String azureResourceGroup;

        /**
         * Azure Resource group name.
         *
         * @param azureResourceGroup the value to set
         * @return this builder
         */
        public Builder azureResourceGroup(String azureResourceGroup) {
            this.azureResourceGroup = azureResourceGroup;
            this.__explicitlySet__.add("azureResourceGroup");
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
        /** Private endpoint's DNS alias. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDnsAlias")
        private String privateEndpointDnsAlias;

        /**
         * Private endpoint's DNS alias.
         *
         * @param privateEndpointDnsAlias the value to set
         * @return this builder
         */
        public Builder privateEndpointDnsAlias(String privateEndpointDnsAlias) {
            this.privateEndpointDnsAlias = privateEndpointDnsAlias;
            this.__explicitlySet__.add("privateEndpointDnsAlias");
            return this;
        }
        /** The current lifecycle state of the Oracle DB Azure Connector resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OracleDbAzureConnector.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the Oracle DB Azure Connector resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OracleDbAzureConnector.LifecycleState lifecycleState) {
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
        /** Azure Identity mechanism. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureIdentityMechanism")
        private OracleDbAzureConnector.AzureIdentityMechanism azureIdentityMechanism;

        /**
         * Azure Identity mechanism.
         *
         * @param azureIdentityMechanism the value to set
         * @return this builder
         */
        public Builder azureIdentityMechanism(
                OracleDbAzureConnector.AzureIdentityMechanism azureIdentityMechanism) {
            this.azureIdentityMechanism = azureIdentityMechanism;
            this.__explicitlySet__.add("azureIdentityMechanism");
            return this;
        }
        /** The current lifecycle state of the Oracle DB Azure Identity Connector resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureIdentityConnectivityStatus")
        private OracleDbAzureConnector.AzureIdentityConnectivityStatus
                azureIdentityConnectivityStatus;

        /**
         * The current lifecycle state of the Oracle DB Azure Identity Connector resource.
         *
         * @param azureIdentityConnectivityStatus the value to set
         * @return this builder
         */
        public Builder azureIdentityConnectivityStatus(
                OracleDbAzureConnector.AzureIdentityConnectivityStatus
                        azureIdentityConnectivityStatus) {
            this.azureIdentityConnectivityStatus = azureIdentityConnectivityStatus;
            this.__explicitlySet__.add("azureIdentityConnectivityStatus");
            return this;
        }
        /**
         * Time when the Oracle DB Azure Connector resource was created expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when the Oracle DB Azure Connector resource was created expressed in [RFC
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
         * Time when the Oracle DB Azure Connector resource was last modified expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the Oracle DB Azure Connector resource was last modified expressed in [RFC
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
        /** Description of the latest modification of the Oracle DB Azure Connector resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastModification")
        private String lastModification;

        /**
         * Description of the latest modification of the Oracle DB Azure Connector resource.
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

        public OracleDbAzureConnectorSummary build() {
            OracleDbAzureConnectorSummary model =
                    new OracleDbAzureConnectorSummary(
                            this.id,
                            this.compartmentId,
                            this.dbClusterResourceId,
                            this.displayName,
                            this.arcAgentNodes,
                            this.azureTenantId,
                            this.azureSubscriptionId,
                            this.azureResourceGroup,
                            this.privateEndpointIpAddress,
                            this.privateEndpointDnsAlias,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.azureIdentityMechanism,
                            this.azureIdentityConnectivityStatus,
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
        public Builder copy(OracleDbAzureConnectorSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbClusterResourceId")) {
                this.dbClusterResourceId(model.getDbClusterResourceId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("arcAgentNodes")) {
                this.arcAgentNodes(model.getArcAgentNodes());
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
            if (model.wasPropertyExplicitlySet("privateEndpointIpAddress")) {
                this.privateEndpointIpAddress(model.getPrivateEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointDnsAlias")) {
                this.privateEndpointDnsAlias(model.getPrivateEndpointDnsAlias());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("azureIdentityMechanism")) {
                this.azureIdentityMechanism(model.getAzureIdentityMechanism());
            }
            if (model.wasPropertyExplicitlySet("azureIdentityConnectivityStatus")) {
                this.azureIdentityConnectivityStatus(model.getAzureIdentityConnectivityStatus());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Azure Connector resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Azure Connector resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains Oracle DB Azure Connector resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains Oracle DB Azure Connector resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Cloud VM Cluster resource where this Azure Arc Agent Identity to configure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbClusterResourceId")
    private final String dbClusterResourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Cloud VM Cluster resource where this Azure Arc Agent Identity to configure.
     *
     * @return the value
     */
    public String getDbClusterResourceId() {
        return dbClusterResourceId;
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

    /** List of all VMs where Arc Agent Identity is configure under Oracle Cloud VM Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("arcAgentNodes")
    private final java.util.List<ArcAgentNodes> arcAgentNodes;

    /**
     * List of all VMs where Arc Agent Identity is configure under Oracle Cloud VM Cluster.
     *
     * @return the value
     */
    public java.util.List<ArcAgentNodes> getArcAgentNodes() {
        return arcAgentNodes;
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

    /** Azure Resource group name. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureResourceGroup")
    private final String azureResourceGroup;

    /**
     * Azure Resource group name.
     *
     * @return the value
     */
    public String getAzureResourceGroup() {
        return azureResourceGroup;
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

    /** Private endpoint's DNS alias. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDnsAlias")
    private final String privateEndpointDnsAlias;

    /**
     * Private endpoint's DNS alias.
     *
     * @return the value
     */
    public String getPrivateEndpointDnsAlias() {
        return privateEndpointDnsAlias;
    }

    /** The current lifecycle state of the Oracle DB Azure Connector resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OracleDbAzureConnector.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the Oracle DB Azure Connector resource.
     *
     * @return the value
     */
    public OracleDbAzureConnector.LifecycleState getLifecycleState() {
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

    /** Azure Identity mechanism. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureIdentityMechanism")
    private final OracleDbAzureConnector.AzureIdentityMechanism azureIdentityMechanism;

    /**
     * Azure Identity mechanism.
     *
     * @return the value
     */
    public OracleDbAzureConnector.AzureIdentityMechanism getAzureIdentityMechanism() {
        return azureIdentityMechanism;
    }

    /** The current lifecycle state of the Oracle DB Azure Identity Connector resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureIdentityConnectivityStatus")
    private final OracleDbAzureConnector.AzureIdentityConnectivityStatus
            azureIdentityConnectivityStatus;

    /**
     * The current lifecycle state of the Oracle DB Azure Identity Connector resource.
     *
     * @return the value
     */
    public OracleDbAzureConnector.AzureIdentityConnectivityStatus
            getAzureIdentityConnectivityStatus() {
        return azureIdentityConnectivityStatus;
    }

    /**
     * Time when the Oracle DB Azure Connector resource was created expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when the Oracle DB Azure Connector resource was created expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time when the Oracle DB Azure Connector resource was last modified expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the Oracle DB Azure Connector resource was last modified expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Description of the latest modification of the Oracle DB Azure Connector resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastModification")
    private final String lastModification;

    /**
     * Description of the latest modification of the Oracle DB Azure Connector resource.
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
        sb.append("OracleDbAzureConnectorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbClusterResourceId=").append(String.valueOf(this.dbClusterResourceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", arcAgentNodes=").append(String.valueOf(this.arcAgentNodes));
        sb.append(", azureTenantId=").append(String.valueOf(this.azureTenantId));
        sb.append(", azureSubscriptionId=").append(String.valueOf(this.azureSubscriptionId));
        sb.append(", azureResourceGroup=").append(String.valueOf(this.azureResourceGroup));
        sb.append(", privateEndpointIpAddress=")
                .append(String.valueOf(this.privateEndpointIpAddress));
        sb.append(", privateEndpointDnsAlias=")
                .append(String.valueOf(this.privateEndpointDnsAlias));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", azureIdentityMechanism=").append(String.valueOf(this.azureIdentityMechanism));
        sb.append(", azureIdentityConnectivityStatus=")
                .append(String.valueOf(this.azureIdentityConnectivityStatus));
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
        if (!(o instanceof OracleDbAzureConnectorSummary)) {
            return false;
        }

        OracleDbAzureConnectorSummary other = (OracleDbAzureConnectorSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbClusterResourceId, other.dbClusterResourceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.arcAgentNodes, other.arcAgentNodes)
                && java.util.Objects.equals(this.azureTenantId, other.azureTenantId)
                && java.util.Objects.equals(this.azureSubscriptionId, other.azureSubscriptionId)
                && java.util.Objects.equals(this.azureResourceGroup, other.azureResourceGroup)
                && java.util.Objects.equals(
                        this.privateEndpointIpAddress, other.privateEndpointIpAddress)
                && java.util.Objects.equals(
                        this.privateEndpointDnsAlias, other.privateEndpointDnsAlias)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(
                        this.azureIdentityMechanism, other.azureIdentityMechanism)
                && java.util.Objects.equals(
                        this.azureIdentityConnectivityStatus, other.azureIdentityConnectivityStatus)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dbClusterResourceId == null
                                ? 43
                                : this.dbClusterResourceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.arcAgentNodes == null ? 43 : this.arcAgentNodes.hashCode());
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.azureIdentityMechanism == null
                                ? 43
                                : this.azureIdentityMechanism.hashCode());
        result =
                (result * PRIME)
                        + (this.azureIdentityConnectivityStatus == null
                                ? 43
                                : this.azureIdentityConnectivityStatus.hashCode());
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
