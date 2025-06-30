/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * This object is about to provide input params to create DB Azure Vault. <br>
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
        builder = CreateOracleDbAzureVaultDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOracleDbAzureVaultDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "oracleDbConnectorId",
        "displayName",
        "oracleDbAzureResourceGroup",
        "azureVaultId",
        "type",
        "location",
        "properties",
        "freeformTags",
        "definedTags"
    })
    public CreateOracleDbAzureVaultDetails(
            String compartmentId,
            String oracleDbConnectorId,
            String displayName,
            String oracleDbAzureResourceGroup,
            String azureVaultId,
            String type,
            String location,
            java.util.Map<String, String> properties,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.oracleDbConnectorId = oracleDbConnectorId;
        this.displayName = displayName;
        this.oracleDbAzureResourceGroup = oracleDbAzureResourceGroup;
        this.azureVaultId = azureVaultId;
        this.type = type;
        this.location = location;
        this.properties = properties;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains DB Azure Vault Resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains DB Azure Vault Resource.
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
         * DB Connector Resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleDbConnectorId")
        private String oracleDbConnectorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DB Connector Resource.
         *
         * @param oracleDbConnectorId the value to set
         * @return this builder
         */
        public Builder oracleDbConnectorId(String oracleDbConnectorId) {
            this.oracleDbConnectorId = oracleDbConnectorId;
            this.__explicitlySet__.add("oracleDbConnectorId");
            return this;
        }
        /** Display name of DB Azure Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of DB Azure Vault.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Display name of Azure Resource Group. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleDbAzureResourceGroup")
        private String oracleDbAzureResourceGroup;

        /**
         * Display name of Azure Resource Group.
         *
         * @param oracleDbAzureResourceGroup the value to set
         * @return this builder
         */
        public Builder oracleDbAzureResourceGroup(String oracleDbAzureResourceGroup) {
            this.oracleDbAzureResourceGroup = oracleDbAzureResourceGroup;
            this.__explicitlySet__.add("oracleDbAzureResourceGroup");
            return this;
        }
        /** Azure Vault Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureVaultId")
        private String azureVaultId;

        /**
         * Azure Vault Id.
         *
         * @param azureVaultId the value to set
         * @return this builder
         */
        public Builder azureVaultId(String azureVaultId) {
            this.azureVaultId = azureVaultId;
            this.__explicitlySet__.add("azureVaultId");
            return this;
        }
        /** Vault Resource Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Vault Resource Type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Vault Resource Location. */
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private String location;

        /**
         * Vault Resource Location.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /** Resource's properties. */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, String> properties;

        /**
         * Resource's properties.
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
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

        public CreateOracleDbAzureVaultDetails build() {
            CreateOracleDbAzureVaultDetails model =
                    new CreateOracleDbAzureVaultDetails(
                            this.compartmentId,
                            this.oracleDbConnectorId,
                            this.displayName,
                            this.oracleDbAzureResourceGroup,
                            this.azureVaultId,
                            this.type,
                            this.location,
                            this.properties,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOracleDbAzureVaultDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("oracleDbConnectorId")) {
                this.oracleDbConnectorId(model.getOracleDbConnectorId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("oracleDbAzureResourceGroup")) {
                this.oracleDbAzureResourceGroup(model.getOracleDbAzureResourceGroup());
            }
            if (model.wasPropertyExplicitlySet("azureVaultId")) {
                this.azureVaultId(model.getAzureVaultId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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
     * compartment that contains DB Azure Vault Resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains DB Azure Vault Resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB
     * Connector Resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleDbConnectorId")
    private final String oracleDbConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB
     * Connector Resource.
     *
     * @return the value
     */
    public String getOracleDbConnectorId() {
        return oracleDbConnectorId;
    }

    /** Display name of DB Azure Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of DB Azure Vault.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Display name of Azure Resource Group. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleDbAzureResourceGroup")
    private final String oracleDbAzureResourceGroup;

    /**
     * Display name of Azure Resource Group.
     *
     * @return the value
     */
    public String getOracleDbAzureResourceGroup() {
        return oracleDbAzureResourceGroup;
    }

    /** Azure Vault Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureVaultId")
    private final String azureVaultId;

    /**
     * Azure Vault Id.
     *
     * @return the value
     */
    public String getAzureVaultId() {
        return azureVaultId;
    }

    /** Vault Resource Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Vault Resource Type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Vault Resource Location. */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

    /**
     * Vault Resource Location.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** Resource's properties. */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

    /**
     * Resource's properties.
     *
     * @return the value
     */
    public java.util.Map<String, String> getProperties() {
        return properties;
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
        sb.append("CreateOracleDbAzureVaultDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", oracleDbConnectorId=").append(String.valueOf(this.oracleDbConnectorId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", oracleDbAzureResourceGroup=")
                .append(String.valueOf(this.oracleDbAzureResourceGroup));
        sb.append(", azureVaultId=").append(String.valueOf(this.azureVaultId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", properties=").append(String.valueOf(this.properties));
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
        if (!(o instanceof CreateOracleDbAzureVaultDetails)) {
            return false;
        }

        CreateOracleDbAzureVaultDetails other = (CreateOracleDbAzureVaultDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.oracleDbConnectorId, other.oracleDbConnectorId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.oracleDbAzureResourceGroup, other.oracleDbAzureResourceGroup)
                && java.util.Objects.equals(this.azureVaultId, other.azureVaultId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.properties, other.properties)
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
        result =
                (result * PRIME)
                        + (this.oracleDbConnectorId == null
                                ? 43
                                : this.oracleDbConnectorId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleDbAzureResourceGroup == null
                                ? 43
                                : this.oracleDbAzureResourceGroup.hashCode());
        result = (result * PRIME) + (this.azureVaultId == null ? 43 : this.azureVaultId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
