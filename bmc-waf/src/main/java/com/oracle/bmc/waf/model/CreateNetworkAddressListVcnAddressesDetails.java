/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * The information about new NetworkAddressListVcnAddresses. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateNetworkAddressListVcnAddressesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateNetworkAddressListVcnAddressesDetails
        extends CreateNetworkAddressListDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /**
         * A list of private address prefixes, each associated with a particular VCN. To specify all
         * addresses in a VCN, use "0.0.0.0/0" for IPv4 and "::/0" for IPv6.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnAddresses")
        private java.util.List<PrivateAddresses> vcnAddresses;

        /**
         * A list of private address prefixes, each associated with a particular VCN. To specify all
         * addresses in a VCN, use "0.0.0.0/0" for IPv4 and "::/0" for IPv6.
         *
         * @param vcnAddresses the value to set
         * @return this builder
         */
        public Builder vcnAddresses(java.util.List<PrivateAddresses> vcnAddresses) {
            this.vcnAddresses = vcnAddresses;
            this.__explicitlySet__.add("vcnAddresses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNetworkAddressListVcnAddressesDetails build() {
            CreateNetworkAddressListVcnAddressesDetails model =
                    new CreateNetworkAddressListVcnAddressesDetails(
                            this.displayName,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.vcnAddresses);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNetworkAddressListVcnAddressesDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("vcnAddresses")) {
                this.vcnAddresses(model.getVcnAddresses());
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
    public CreateNetworkAddressListVcnAddressesDetails(
            String displayName,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<PrivateAddresses> vcnAddresses) {
        super(displayName, compartmentId, freeformTags, definedTags, systemTags);
        this.vcnAddresses = vcnAddresses;
    }

    /**
     * A list of private address prefixes, each associated with a particular VCN. To specify all
     * addresses in a VCN, use "0.0.0.0/0" for IPv4 and "::/0" for IPv6.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnAddresses")
    private final java.util.List<PrivateAddresses> vcnAddresses;

    /**
     * A list of private address prefixes, each associated with a particular VCN. To specify all
     * addresses in a VCN, use "0.0.0.0/0" for IPv4 and "::/0" for IPv6.
     *
     * @return the value
     */
    public java.util.List<PrivateAddresses> getVcnAddresses() {
        return vcnAddresses;
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
        sb.append("CreateNetworkAddressListVcnAddressesDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vcnAddresses=").append(String.valueOf(this.vcnAddresses));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNetworkAddressListVcnAddressesDetails)) {
            return false;
        }

        CreateNetworkAddressListVcnAddressesDetails other =
                (CreateNetworkAddressListVcnAddressesDetails) o;
        return java.util.Objects.equals(this.vcnAddresses, other.vcnAddresses)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vcnAddresses == null ? 43 : this.vcnAddresses.hashCode());
        return result;
    }
}
