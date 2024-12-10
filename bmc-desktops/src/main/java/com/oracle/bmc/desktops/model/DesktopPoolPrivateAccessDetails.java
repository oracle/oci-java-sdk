/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * The details of the desktop's private access network connectivity that were used to create the pool.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DesktopPoolPrivateAccessDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DesktopPoolPrivateAccessDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vcnId", "endpointFqdn", "subnetId", "nsgIds", "privateIp"})
    public DesktopPoolPrivateAccessDetails(
            String vcnId,
            String endpointFqdn,
            String subnetId,
            java.util.List<String> nsgIds,
            String privateIp) {
        super();
        this.vcnId = vcnId;
        this.endpointFqdn = endpointFqdn;
        this.subnetId = subnetId;
        this.nsgIds = nsgIds;
        this.privateIp = privateIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the customer VCN.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the customer VCN.
         *
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The three-label FQDN to use for the private endpoint. The customer VCN's DNS records are
         * updated with this FQDN. This enables the customer to use the FQDN instead of the private endpoint's
         * private IP address to access the service (for example,\u00A0xyz.oraclecloud.com).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointFqdn")
        private String endpointFqdn;

        /**
         * The three-label FQDN to use for the private endpoint. The customer VCN's DNS records are
         * updated with this FQDN. This enables the customer to use the FQDN instead of the private endpoint's
         * private IP address to access the service (for example,\u00A0xyz.oraclecloud.com).
         *
         * @param endpointFqdn the value to set
         * @return this builder
         **/
        public Builder endpointFqdn(String endpointFqdn) {
            this.endpointFqdn = endpointFqdn;
            this.__explicitlySet__.add("endpointFqdn");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet in the customer VCN where the
         * connectivity will be established.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet in the customer VCN where the
         * connectivity will be established.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * A list of network security groups for the private access.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of network security groups for the private access.
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * The IPv4 address from the provided OCI subnet which needs to be assigned to the VNIC. If not provided, it will
         * be auto-assigned with an available IPv4 address from the subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * The IPv4 address from the provided OCI subnet which needs to be assigned to the VNIC. If not provided, it will
         * be auto-assigned with an available IPv4 address from the subnet.
         *
         * @param privateIp the value to set
         * @return this builder
         **/
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DesktopPoolPrivateAccessDetails build() {
            DesktopPoolPrivateAccessDetails model =
                    new DesktopPoolPrivateAccessDetails(
                            this.vcnId,
                            this.endpointFqdn,
                            this.subnetId,
                            this.nsgIds,
                            this.privateIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DesktopPoolPrivateAccessDetails model) {
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("endpointFqdn")) {
                this.endpointFqdn(model.getEndpointFqdn());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the customer VCN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the customer VCN.
     *
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The three-label FQDN to use for the private endpoint. The customer VCN's DNS records are
     * updated with this FQDN. This enables the customer to use the FQDN instead of the private endpoint's
     * private IP address to access the service (for example,\u00A0xyz.oraclecloud.com).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointFqdn")
    private final String endpointFqdn;

    /**
     * The three-label FQDN to use for the private endpoint. The customer VCN's DNS records are
     * updated with this FQDN. This enables the customer to use the FQDN instead of the private endpoint's
     * private IP address to access the service (for example,\u00A0xyz.oraclecloud.com).
     *
     * @return the value
     **/
    public String getEndpointFqdn() {
        return endpointFqdn;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet in the customer VCN where the
     * connectivity will be established.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet in the customer VCN where the
     * connectivity will be established.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * A list of network security groups for the private access.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of network security groups for the private access.
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The IPv4 address from the provided OCI subnet which needs to be assigned to the VNIC. If not provided, it will
     * be auto-assigned with an available IPv4 address from the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * The IPv4 address from the provided OCI subnet which needs to be assigned to the VNIC. If not provided, it will
     * be auto-assigned with an available IPv4 address from the subnet.
     *
     * @return the value
     **/
    public String getPrivateIp() {
        return privateIp;
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
        sb.append("DesktopPoolPrivateAccessDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", endpointFqdn=").append(String.valueOf(this.endpointFqdn));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DesktopPoolPrivateAccessDetails)) {
            return false;
        }

        DesktopPoolPrivateAccessDetails other = (DesktopPoolPrivateAccessDetails) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.endpointFqdn, other.endpointFqdn)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.endpointFqdn == null ? 43 : this.endpointFqdn.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
