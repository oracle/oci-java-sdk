/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Bulk Secondary IPv4 addresses creation object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkCreatePrivateIpsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkCreatePrivateIpsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vnicId", "vlanId", "subnetId", "bulkCreatePrivateIpItem"})
    public BulkCreatePrivateIpsDetails(
            String vnicId,
            String vlanId,
            String subnetId,
            java.util.List<BulkCreatePrivateIpItem> bulkCreatePrivateIpItem) {
        super();
        this.vnicId = vnicId;
        this.vlanId = vlanId;
        this.subnetId = subnetId;
        this.bulkCreatePrivateIpItem = bulkCreatePrivateIpItem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the private IPs to. The VNIC and private IPs must be in the same subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the private IPs to. The VNIC and private IPs must be in the same subnet.
         *
         * @param vnicId the value to set
         * @return this builder
         **/
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }
        /**
         * Use this attribute only with the Oracle Cloud VMware Solution. The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IPs is to be drawn. The IP addresses, *if supplied*, must be valid for the given VLAN. See {@link Vlan}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * Use this attribute only with the Oracle Cloud VMware Solution. The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IPs is to be drawn. The IP addresses, *if supplied*, must be valid for the given VLAN. See {@link Vlan}.
         *
         * @param vlanId the value to set
         * @return this builder
         **/
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IPs is to be drawn. The IP addresses,
         * *if supplied*, must be valid for the given subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IPs is to be drawn. The IP addresses,
         * *if supplied*, must be valid for the given subnet.
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
         * Secondary IPv4 addresses to assign.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bulkCreatePrivateIpItem")
        private java.util.List<BulkCreatePrivateIpItem> bulkCreatePrivateIpItem;

        /**
         * Secondary IPv4 addresses to assign.
         *
         * @param bulkCreatePrivateIpItem the value to set
         * @return this builder
         **/
        public Builder bulkCreatePrivateIpItem(
                java.util.List<BulkCreatePrivateIpItem> bulkCreatePrivateIpItem) {
            this.bulkCreatePrivateIpItem = bulkCreatePrivateIpItem;
            this.__explicitlySet__.add("bulkCreatePrivateIpItem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkCreatePrivateIpsDetails build() {
            BulkCreatePrivateIpsDetails model =
                    new BulkCreatePrivateIpsDetails(
                            this.vnicId, this.vlanId, this.subnetId, this.bulkCreatePrivateIpItem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkCreatePrivateIpsDetails model) {
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("bulkCreatePrivateIpItem")) {
                this.bulkCreatePrivateIpItem(model.getBulkCreatePrivateIpItem());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the private IPs to. The VNIC and private IPs must be in the same subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the private IPs to. The VNIC and private IPs must be in the same subnet.
     *
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    /**
     * Use this attribute only with the Oracle Cloud VMware Solution. The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IPs is to be drawn. The IP addresses, *if supplied*, must be valid for the given VLAN. See {@link Vlan}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * Use this attribute only with the Oracle Cloud VMware Solution. The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IPs is to be drawn. The IP addresses, *if supplied*, must be valid for the given VLAN. See {@link Vlan}.
     *
     * @return the value
     **/
    public String getVlanId() {
        return vlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IPs is to be drawn. The IP addresses,
     * *if supplied*, must be valid for the given subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IPs is to be drawn. The IP addresses,
     * *if supplied*, must be valid for the given subnet.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Secondary IPv4 addresses to assign.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bulkCreatePrivateIpItem")
    private final java.util.List<BulkCreatePrivateIpItem> bulkCreatePrivateIpItem;

    /**
     * Secondary IPv4 addresses to assign.
     *
     * @return the value
     **/
    public java.util.List<BulkCreatePrivateIpItem> getBulkCreatePrivateIpItem() {
        return bulkCreatePrivateIpItem;
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
        sb.append("BulkCreatePrivateIpsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", bulkCreatePrivateIpItem=")
                .append(String.valueOf(this.bulkCreatePrivateIpItem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkCreatePrivateIpsDetails)) {
            return false;
        }

        BulkCreatePrivateIpsDetails other = (BulkCreatePrivateIpsDetails) o;
        return java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.bulkCreatePrivateIpItem, other.bulkCreatePrivateIpItem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkCreatePrivateIpItem == null
                                ? 43
                                : this.bulkCreatePrivateIpItem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
