/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateNetworkSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateNetworkSourceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "publicSourceList",
        "virtualSourceList",
        "services",
        "freeformTags",
        "definedTags"
    })
    public UpdateNetworkSourceDetails(
            String description,
            java.util.List<String> publicSourceList,
            java.util.List<NetworkSources_virtualSourceList> virtualSourceList,
            java.util.List<String> services,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.publicSourceList = publicSourceList;
        this.virtualSourceList = virtualSourceList;
        this.services = services;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The description you assign to the network source. Does not have to be unique, and it's
         * changeable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description you assign to the network source. Does not have to be unique, and it's
         * changeable.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** A list of allowed public IP addresses and CIDR ranges. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicSourceList")
        private java.util.List<String> publicSourceList;

        /**
         * A list of allowed public IP addresses and CIDR ranges.
         *
         * @param publicSourceList the value to set
         * @return this builder
         */
        public Builder publicSourceList(java.util.List<String> publicSourceList) {
            this.publicSourceList = publicSourceList;
            this.__explicitlySet__.add("publicSourceList");
            return this;
        }
        /**
         * A list of allowed VCN OCID and IP range pairs. Example:{@code "vcnId":
         * "ocid1.vcn.oc1.iad.aaaaaaaaexampleuniqueID", "ipRanges": [ "129.213.39.0/24" ]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("virtualSourceList")
        private java.util.List<NetworkSources_virtualSourceList> virtualSourceList;

        /**
         * A list of allowed VCN OCID and IP range pairs. Example:{@code "vcnId":
         * "ocid1.vcn.oc1.iad.aaaaaaaaexampleuniqueID", "ipRanges": [ "129.213.39.0/24" ]}
         *
         * @param virtualSourceList the value to set
         * @return this builder
         */
        public Builder virtualSourceList(
                java.util.List<NetworkSources_virtualSourceList> virtualSourceList) {
            this.virtualSourceList = virtualSourceList;
            this.__explicitlySet__.add("virtualSourceList");
            return this;
        }
        /** -- The services attribute has no effect and is reserved for use by Oracle. -- */
        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<String> services;

        /**
         * -- The services attribute has no effect and is reserved for use by Oracle. --
         *
         * @param services the value to set
         * @return this builder
         */
        public Builder services(java.util.List<String> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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

        public UpdateNetworkSourceDetails build() {
            UpdateNetworkSourceDetails model =
                    new UpdateNetworkSourceDetails(
                            this.description,
                            this.publicSourceList,
                            this.virtualSourceList,
                            this.services,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNetworkSourceDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("publicSourceList")) {
                this.publicSourceList(model.getPublicSourceList());
            }
            if (model.wasPropertyExplicitlySet("virtualSourceList")) {
                this.virtualSourceList(model.getVirtualSourceList());
            }
            if (model.wasPropertyExplicitlySet("services")) {
                this.services(model.getServices());
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
     * The description you assign to the network source. Does not have to be unique, and it's
     * changeable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description you assign to the network source. Does not have to be unique, and it's
     * changeable.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** A list of allowed public IP addresses and CIDR ranges. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicSourceList")
    private final java.util.List<String> publicSourceList;

    /**
     * A list of allowed public IP addresses and CIDR ranges.
     *
     * @return the value
     */
    public java.util.List<String> getPublicSourceList() {
        return publicSourceList;
    }

    /**
     * A list of allowed VCN OCID and IP range pairs. Example:{@code "vcnId":
     * "ocid1.vcn.oc1.iad.aaaaaaaaexampleuniqueID", "ipRanges": [ "129.213.39.0/24" ]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("virtualSourceList")
    private final java.util.List<NetworkSources_virtualSourceList> virtualSourceList;

    /**
     * A list of allowed VCN OCID and IP range pairs. Example:{@code "vcnId":
     * "ocid1.vcn.oc1.iad.aaaaaaaaexampleuniqueID", "ipRanges": [ "129.213.39.0/24" ]}
     *
     * @return the value
     */
    public java.util.List<NetworkSources_virtualSourceList> getVirtualSourceList() {
        return virtualSourceList;
    }

    /** -- The services attribute has no effect and is reserved for use by Oracle. -- */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    private final java.util.List<String> services;

    /**
     * -- The services attribute has no effect and is reserved for use by Oracle. --
     *
     * @return the value
     */
    public java.util.List<String> getServices() {
        return services;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("UpdateNetworkSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", publicSourceList=").append(String.valueOf(this.publicSourceList));
        sb.append(", virtualSourceList=").append(String.valueOf(this.virtualSourceList));
        sb.append(", services=").append(String.valueOf(this.services));
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
        if (!(o instanceof UpdateNetworkSourceDetails)) {
            return false;
        }

        UpdateNetworkSourceDetails other = (UpdateNetworkSourceDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.publicSourceList, other.publicSourceList)
                && java.util.Objects.equals(this.virtualSourceList, other.virtualSourceList)
                && java.util.Objects.equals(this.services, other.services)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.publicSourceList == null ? 43 : this.publicSourceList.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualSourceList == null ? 43 : this.virtualSourceList.hashCode());
        result = (result * PRIME) + (this.services == null ? 43 : this.services.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
