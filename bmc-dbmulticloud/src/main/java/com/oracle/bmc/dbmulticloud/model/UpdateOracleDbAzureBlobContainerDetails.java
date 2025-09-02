/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Oracle DB Azure Blob Container resource's update object. <br>
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
        builder = UpdateOracleDbAzureBlobContainerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOracleDbAzureBlobContainerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "privateEndpointIpAddress",
        "privateEndpointDnsAlias",
        "azureStorageAccountName",
        "azureStorageContainerName",
        "freeformTags",
        "definedTags"
    })
    public UpdateOracleDbAzureBlobContainerDetails(
            String compartmentId,
            String displayName,
            String privateEndpointIpAddress,
            String privateEndpointDnsAlias,
            String azureStorageAccountName,
            String azureStorageContainerName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.privateEndpointIpAddress = privateEndpointIpAddress;
        this.privateEndpointDnsAlias = privateEndpointDnsAlias;
        this.azureStorageAccountName = azureStorageAccountName;
        this.azureStorageContainerName = azureStorageContainerName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Azure Blob Container resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Azure Blob Container resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Oracle DB Azure Blob Container resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Oracle DB Azure Blob Container resource name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /** Azure Storage account name. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureStorageAccountName")
        private String azureStorageAccountName;

        /**
         * Azure Storage account name.
         *
         * @param azureStorageAccountName the value to set
         * @return this builder
         */
        public Builder azureStorageAccountName(String azureStorageAccountName) {
            this.azureStorageAccountName = azureStorageAccountName;
            this.__explicitlySet__.add("azureStorageAccountName");
            return this;
        }
        /** Azure Storage container name. */
        @com.fasterxml.jackson.annotation.JsonProperty("azureStorageContainerName")
        private String azureStorageContainerName;

        /**
         * Azure Storage container name.
         *
         * @param azureStorageContainerName the value to set
         * @return this builder
         */
        public Builder azureStorageContainerName(String azureStorageContainerName) {
            this.azureStorageContainerName = azureStorageContainerName;
            this.__explicitlySet__.add("azureStorageContainerName");
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

        public UpdateOracleDbAzureBlobContainerDetails build() {
            UpdateOracleDbAzureBlobContainerDetails model =
                    new UpdateOracleDbAzureBlobContainerDetails(
                            this.compartmentId,
                            this.displayName,
                            this.privateEndpointIpAddress,
                            this.privateEndpointDnsAlias,
                            this.azureStorageAccountName,
                            this.azureStorageContainerName,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOracleDbAzureBlobContainerDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointIpAddress")) {
                this.privateEndpointIpAddress(model.getPrivateEndpointIpAddress());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointDnsAlias")) {
                this.privateEndpointDnsAlias(model.getPrivateEndpointDnsAlias());
            }
            if (model.wasPropertyExplicitlySet("azureStorageAccountName")) {
                this.azureStorageAccountName(model.getAzureStorageAccountName());
            }
            if (model.wasPropertyExplicitlySet("azureStorageContainerName")) {
                this.azureStorageContainerName(model.getAzureStorageContainerName());
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
     * Oracle DB Azure Blob Container resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Azure Blob Container resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Oracle DB Azure Blob Container resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Oracle DB Azure Blob Container resource name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
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

    /** Azure Storage account name. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureStorageAccountName")
    private final String azureStorageAccountName;

    /**
     * Azure Storage account name.
     *
     * @return the value
     */
    public String getAzureStorageAccountName() {
        return azureStorageAccountName;
    }

    /** Azure Storage container name. */
    @com.fasterxml.jackson.annotation.JsonProperty("azureStorageContainerName")
    private final String azureStorageContainerName;

    /**
     * Azure Storage container name.
     *
     * @return the value
     */
    public String getAzureStorageContainerName() {
        return azureStorageContainerName;
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
        sb.append("UpdateOracleDbAzureBlobContainerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", privateEndpointIpAddress=")
                .append(String.valueOf(this.privateEndpointIpAddress));
        sb.append(", privateEndpointDnsAlias=")
                .append(String.valueOf(this.privateEndpointDnsAlias));
        sb.append(", azureStorageAccountName=")
                .append(String.valueOf(this.azureStorageAccountName));
        sb.append(", azureStorageContainerName=")
                .append(String.valueOf(this.azureStorageContainerName));
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
        if (!(o instanceof UpdateOracleDbAzureBlobContainerDetails)) {
            return false;
        }

        UpdateOracleDbAzureBlobContainerDetails other = (UpdateOracleDbAzureBlobContainerDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.privateEndpointIpAddress, other.privateEndpointIpAddress)
                && java.util.Objects.equals(
                        this.privateEndpointDnsAlias, other.privateEndpointDnsAlias)
                && java.util.Objects.equals(
                        this.azureStorageAccountName, other.azureStorageAccountName)
                && java.util.Objects.equals(
                        this.azureStorageContainerName, other.azureStorageContainerName)
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
                        + (this.azureStorageAccountName == null
                                ? 43
                                : this.azureStorageAccountName.hashCode());
        result =
                (result * PRIME)
                        + (this.azureStorageContainerName == null
                                ? 43
                                : this.azureStorageContainerName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
