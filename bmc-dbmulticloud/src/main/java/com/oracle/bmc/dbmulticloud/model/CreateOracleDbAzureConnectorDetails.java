/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Create Oracle DB Azure Connector resource object. <br>
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
        builder = CreateOracleDbAzureConnectorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOracleDbAzureConnectorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "dbClusterResourceId",
        "azureIdentityMechanism",
        "azureTenantId",
        "azureSubscriptionId",
        "azureResourceGroup",
        "accessToken",
        "privateEndpointIpAddress",
        "privateEndpointDnsAlias",
        "freeformTags",
        "definedTags"
    })
    public CreateOracleDbAzureConnectorDetails(
            String compartmentId,
            String displayName,
            String dbClusterResourceId,
            OracleDbAzureConnector.AzureIdentityMechanism azureIdentityMechanism,
            String azureTenantId,
            String azureSubscriptionId,
            String azureResourceGroup,
            String accessToken,
            String privateEndpointIpAddress,
            String privateEndpointDnsAlias,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.dbClusterResourceId = dbClusterResourceId;
        this.azureIdentityMechanism = azureIdentityMechanism;
        this.azureTenantId = azureTenantId;
        this.azureSubscriptionId = azureSubscriptionId;
        this.azureResourceGroup = azureResourceGroup;
        this.accessToken = accessToken;
        this.privateEndpointIpAddress = privateEndpointIpAddress;
        this.privateEndpointDnsAlias = privateEndpointDnsAlias;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** Azure bearer access token. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
        private String accessToken;

        /**
         * Azure bearer access token.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOracleDbAzureConnectorDetails build() {
            CreateOracleDbAzureConnectorDetails model =
                    new CreateOracleDbAzureConnectorDetails(
                            this.compartmentId,
                            this.displayName,
                            this.dbClusterResourceId,
                            this.azureIdentityMechanism,
                            this.azureTenantId,
                            this.azureSubscriptionId,
                            this.azureResourceGroup,
                            this.accessToken,
                            this.privateEndpointIpAddress,
                            this.privateEndpointDnsAlias,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOracleDbAzureConnectorDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dbClusterResourceId")) {
                this.dbClusterResourceId(model.getDbClusterResourceId());
            }
            if (model.wasPropertyExplicitlySet("azureIdentityMechanism")) {
                this.azureIdentityMechanism(model.getAzureIdentityMechanism());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** Azure bearer access token. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessToken")
    private final String accessToken;

    /**
     * Azure bearer access token.
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
        sb.append("CreateOracleDbAzureConnectorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dbClusterResourceId=").append(String.valueOf(this.dbClusterResourceId));
        sb.append(", azureIdentityMechanism=").append(String.valueOf(this.azureIdentityMechanism));
        sb.append(", azureTenantId=").append(String.valueOf(this.azureTenantId));
        sb.append(", azureSubscriptionId=").append(String.valueOf(this.azureSubscriptionId));
        sb.append(", azureResourceGroup=").append(String.valueOf(this.azureResourceGroup));
        sb.append(", accessToken=").append(String.valueOf(this.accessToken));
        sb.append(", privateEndpointIpAddress=")
                .append(String.valueOf(this.privateEndpointIpAddress));
        sb.append(", privateEndpointDnsAlias=")
                .append(String.valueOf(this.privateEndpointDnsAlias));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOracleDbAzureConnectorDetails)) {
            return false;
        }

        CreateOracleDbAzureConnectorDetails other = (CreateOracleDbAzureConnectorDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dbClusterResourceId, other.dbClusterResourceId)
                && java.util.Objects.equals(
                        this.azureIdentityMechanism, other.azureIdentityMechanism)
                && java.util.Objects.equals(this.azureTenantId, other.azureTenantId)
                && java.util.Objects.equals(this.azureSubscriptionId, other.azureSubscriptionId)
                && java.util.Objects.equals(this.azureResourceGroup, other.azureResourceGroup)
                && java.util.Objects.equals(this.accessToken, other.accessToken)
                && java.util.Objects.equals(
                        this.privateEndpointIpAddress, other.privateEndpointIpAddress)
                && java.util.Objects.equals(
                        this.privateEndpointDnsAlias, other.privateEndpointDnsAlias)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.dbClusterResourceId == null
                                ? 43
                                : this.dbClusterResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.azureIdentityMechanism == null
                                ? 43
                                : this.azureIdentityMechanism.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
