/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information needed to create a new workspace. <br>
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
        builder = CreateWorkspaceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateWorkspaceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vcnId",
        "subnetId",
        "dnsServerIp",
        "dnsServerZone",
        "freeformTags",
        "definedTags",
        "description",
        "displayName",
        "compartmentId",
        "isPrivateNetworkEnabled",
        "registryId",
        "endpointId",
        "registryName",
        "registryCompartmentId",
        "endpointName",
        "endpointCompartmentId"
    })
    public CreateWorkspaceDetails(
            String vcnId,
            String subnetId,
            String dnsServerIp,
            String dnsServerZone,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String description,
            String displayName,
            String compartmentId,
            Boolean isPrivateNetworkEnabled,
            String registryId,
            String endpointId,
            String registryName,
            String registryCompartmentId,
            String endpointName,
            String endpointCompartmentId) {
        super();
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.dnsServerIp = dnsServerIp;
        this.dnsServerZone = dnsServerZone;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.isPrivateNetworkEnabled = isPrivateNetworkEnabled;
        this.registryId = registryId;
        this.endpointId = endpointId;
        this.registryName = registryName;
        this.registryCompartmentId = registryCompartmentId;
        this.endpointName = endpointName;
        this.endpointCompartmentId = endpointCompartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the VCN the subnet is in. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The OCID of the VCN the subnet is in.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /** The OCID of the subnet for customer connected databases. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet for customer connected databases.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** The IP of the custom DNS. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsServerIp")
        private String dnsServerIp;

        /**
         * The IP of the custom DNS.
         *
         * @param dnsServerIp the value to set
         * @return this builder
         */
        public Builder dnsServerIp(String dnsServerIp) {
            this.dnsServerIp = dnsServerIp;
            this.__explicitlySet__.add("dnsServerIp");
            return this;
        }
        /** The DNS zone of the custom DNS to use to resolve names. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsServerZone")
        private String dnsServerZone;

        /**
         * The DNS zone of the custom DNS to use to resolve names.
         *
         * @param dnsServerZone the value to set
         * @return this builder
         */
        public Builder dnsServerZone(String dnsServerZone) {
            this.dnsServerZone = dnsServerZone;
            this.__explicitlySet__.add("dnsServerZone");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /** A user defined description for the workspace. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user defined description for the workspace.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A user-friendly display name for the workspace. Does not have to be unique, and can be
         * modified. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name for the workspace. Does not have to be unique, and can be
         * modified. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment containing the workspace. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the workspace.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Specifies whether the private network connection is enabled or disabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrivateNetworkEnabled")
        private Boolean isPrivateNetworkEnabled;

        /**
         * Specifies whether the private network connection is enabled or disabled.
         *
         * @param isPrivateNetworkEnabled the value to set
         * @return this builder
         */
        public Builder isPrivateNetworkEnabled(Boolean isPrivateNetworkEnabled) {
            this.isPrivateNetworkEnabled = isPrivateNetworkEnabled;
            this.__explicitlySet__.add("isPrivateNetworkEnabled");
            return this;
        }
        /** DCMS Data Asset Registry ID to which the workspace is associated */
        @com.fasterxml.jackson.annotation.JsonProperty("registryId")
        private String registryId;

        /**
         * DCMS Data Asset Registry ID to which the workspace is associated
         *
         * @param registryId the value to set
         * @return this builder
         */
        public Builder registryId(String registryId) {
            this.registryId = registryId;
            this.__explicitlySet__.add("registryId");
            return this;
        }
        /** DCMS Private Endpoint ID associated with workspace if the pvt networking is enabled */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
        private String endpointId;

        /**
         * DCMS Private Endpoint ID associated with workspace if the pvt networking is enabled
         *
         * @param endpointId the value to set
         * @return this builder
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            this.__explicitlySet__.add("endpointId");
            return this;
        }
        /** DCMS Data Asset Registry display name */
        @com.fasterxml.jackson.annotation.JsonProperty("registryName")
        private String registryName;

        /**
         * DCMS Data Asset Registry display name
         *
         * @param registryName the value to set
         * @return this builder
         */
        public Builder registryName(String registryName) {
            this.registryName = registryName;
            this.__explicitlySet__.add("registryName");
            return this;
        }
        /** DCMS Data Asset Registry Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("registryCompartmentId")
        private String registryCompartmentId;

        /**
         * DCMS Data Asset Registry Compartment Identifier
         *
         * @param registryCompartmentId the value to set
         * @return this builder
         */
        public Builder registryCompartmentId(String registryCompartmentId) {
            this.registryCompartmentId = registryCompartmentId;
            this.__explicitlySet__.add("registryCompartmentId");
            return this;
        }
        /** DCMS Private Endpoint Name */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointName")
        private String endpointName;

        /**
         * DCMS Private Endpoint Name
         *
         * @param endpointName the value to set
         * @return this builder
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            this.__explicitlySet__.add("endpointName");
            return this;
        }
        /** DCMS PRivate Endpoint Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointCompartmentId")
        private String endpointCompartmentId;

        /**
         * DCMS PRivate Endpoint Compartment Identifier
         *
         * @param endpointCompartmentId the value to set
         * @return this builder
         */
        public Builder endpointCompartmentId(String endpointCompartmentId) {
            this.endpointCompartmentId = endpointCompartmentId;
            this.__explicitlySet__.add("endpointCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateWorkspaceDetails build() {
            CreateWorkspaceDetails model =
                    new CreateWorkspaceDetails(
                            this.vcnId,
                            this.subnetId,
                            this.dnsServerIp,
                            this.dnsServerZone,
                            this.freeformTags,
                            this.definedTags,
                            this.description,
                            this.displayName,
                            this.compartmentId,
                            this.isPrivateNetworkEnabled,
                            this.registryId,
                            this.endpointId,
                            this.registryName,
                            this.registryCompartmentId,
                            this.endpointName,
                            this.endpointCompartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWorkspaceDetails model) {
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("dnsServerIp")) {
                this.dnsServerIp(model.getDnsServerIp());
            }
            if (model.wasPropertyExplicitlySet("dnsServerZone")) {
                this.dnsServerZone(model.getDnsServerZone());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isPrivateNetworkEnabled")) {
                this.isPrivateNetworkEnabled(model.getIsPrivateNetworkEnabled());
            }
            if (model.wasPropertyExplicitlySet("registryId")) {
                this.registryId(model.getRegistryId());
            }
            if (model.wasPropertyExplicitlySet("endpointId")) {
                this.endpointId(model.getEndpointId());
            }
            if (model.wasPropertyExplicitlySet("registryName")) {
                this.registryName(model.getRegistryName());
            }
            if (model.wasPropertyExplicitlySet("registryCompartmentId")) {
                this.registryCompartmentId(model.getRegistryCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("endpointName")) {
                this.endpointName(model.getEndpointName());
            }
            if (model.wasPropertyExplicitlySet("endpointCompartmentId")) {
                this.endpointCompartmentId(model.getEndpointCompartmentId());
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

    /** The OCID of the VCN the subnet is in. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The OCID of the VCN the subnet is in.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /** The OCID of the subnet for customer connected databases. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet for customer connected databases.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** The IP of the custom DNS. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServerIp")
    private final String dnsServerIp;

    /**
     * The IP of the custom DNS.
     *
     * @return the value
     */
    public String getDnsServerIp() {
        return dnsServerIp;
    }

    /** The DNS zone of the custom DNS to use to resolve names. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServerZone")
    private final String dnsServerZone;

    /**
     * The DNS zone of the custom DNS to use to resolve names.
     *
     * @return the value
     */
    public String getDnsServerZone() {
        return dnsServerZone;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** A user defined description for the workspace. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user defined description for the workspace.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * A user-friendly display name for the workspace. Does not have to be unique, and can be
     * modified. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name for the workspace. Does not have to be unique, and can be
     * modified. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment containing the workspace. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the workspace.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Specifies whether the private network connection is enabled or disabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivateNetworkEnabled")
    private final Boolean isPrivateNetworkEnabled;

    /**
     * Specifies whether the private network connection is enabled or disabled.
     *
     * @return the value
     */
    public Boolean getIsPrivateNetworkEnabled() {
        return isPrivateNetworkEnabled;
    }

    /** DCMS Data Asset Registry ID to which the workspace is associated */
    @com.fasterxml.jackson.annotation.JsonProperty("registryId")
    private final String registryId;

    /**
     * DCMS Data Asset Registry ID to which the workspace is associated
     *
     * @return the value
     */
    public String getRegistryId() {
        return registryId;
    }

    /** DCMS Private Endpoint ID associated with workspace if the pvt networking is enabled */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
    private final String endpointId;

    /**
     * DCMS Private Endpoint ID associated with workspace if the pvt networking is enabled
     *
     * @return the value
     */
    public String getEndpointId() {
        return endpointId;
    }

    /** DCMS Data Asset Registry display name */
    @com.fasterxml.jackson.annotation.JsonProperty("registryName")
    private final String registryName;

    /**
     * DCMS Data Asset Registry display name
     *
     * @return the value
     */
    public String getRegistryName() {
        return registryName;
    }

    /** DCMS Data Asset Registry Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("registryCompartmentId")
    private final String registryCompartmentId;

    /**
     * DCMS Data Asset Registry Compartment Identifier
     *
     * @return the value
     */
    public String getRegistryCompartmentId() {
        return registryCompartmentId;
    }

    /** DCMS Private Endpoint Name */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointName")
    private final String endpointName;

    /**
     * DCMS Private Endpoint Name
     *
     * @return the value
     */
    public String getEndpointName() {
        return endpointName;
    }

    /** DCMS PRivate Endpoint Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointCompartmentId")
    private final String endpointCompartmentId;

    /**
     * DCMS PRivate Endpoint Compartment Identifier
     *
     * @return the value
     */
    public String getEndpointCompartmentId() {
        return endpointCompartmentId;
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
        sb.append("CreateWorkspaceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", dnsServerIp=").append(String.valueOf(this.dnsServerIp));
        sb.append(", dnsServerZone=").append(String.valueOf(this.dnsServerZone));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isPrivateNetworkEnabled=")
                .append(String.valueOf(this.isPrivateNetworkEnabled));
        sb.append(", registryId=").append(String.valueOf(this.registryId));
        sb.append(", endpointId=").append(String.valueOf(this.endpointId));
        sb.append(", registryName=").append(String.valueOf(this.registryName));
        sb.append(", registryCompartmentId=").append(String.valueOf(this.registryCompartmentId));
        sb.append(", endpointName=").append(String.valueOf(this.endpointName));
        sb.append(", endpointCompartmentId=").append(String.valueOf(this.endpointCompartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWorkspaceDetails)) {
            return false;
        }

        CreateWorkspaceDetails other = (CreateWorkspaceDetails) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.dnsServerIp, other.dnsServerIp)
                && java.util.Objects.equals(this.dnsServerZone, other.dnsServerZone)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.isPrivateNetworkEnabled, other.isPrivateNetworkEnabled)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.endpointId, other.endpointId)
                && java.util.Objects.equals(this.registryName, other.registryName)
                && java.util.Objects.equals(this.registryCompartmentId, other.registryCompartmentId)
                && java.util.Objects.equals(this.endpointName, other.endpointName)
                && java.util.Objects.equals(this.endpointCompartmentId, other.endpointCompartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.dnsServerIp == null ? 43 : this.dnsServerIp.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsServerZone == null ? 43 : this.dnsServerZone.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isPrivateNetworkEnabled == null
                                ? 43
                                : this.isPrivateNetworkEnabled.hashCode());
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        result = (result * PRIME) + (this.registryName == null ? 43 : this.registryName.hashCode());
        result =
                (result * PRIME)
                        + (this.registryCompartmentId == null
                                ? 43
                                : this.registryCompartmentId.hashCode());
        result = (result * PRIME) + (this.endpointName == null ? 43 : this.endpointName.hashCode());
        result =
                (result * PRIME)
                        + (this.endpointCompartmentId == null
                                ? 43
                                : this.endpointCompartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
