/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details used tp delete Secondary IPv4 objects in a bulk operation.
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
    builder = BulkDeletePrivateIpsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkDeletePrivateIpsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vnicId", "vlanId", "subnetId", "bulkDeletePrivateIpItem"})
    public BulkDeletePrivateIpsDetails(
            String vnicId,
            String vlanId,
            String subnetId,
            java.util.List<BulkDeletePrivateIpItem> bulkDeletePrivateIpItem) {
        super();
        this.vnicId = vnicId;
        this.vlanId = vlanId;
        this.subnetId = subnetId;
        this.bulkDeletePrivateIpItem = bulkDeletePrivateIpItem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC of which
         * private IPs should be deleted. The VNIC and private IPs must be in the same subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC of which
         * private IPs should be deleted. The VNIC and private IPs must be in the same subnet.
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
         * Use this attribute only with the Oracle Cloud VMware Solution.
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IP is to be deleted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * Use this attribute only with the Oracle Cloud VMware Solution.
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IP is to be deleted.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IPs is to be deleted.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IPs is to be deleted.
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
         * A secondary IPv4 address to delete.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bulkDeletePrivateIpItem")
        private java.util.List<BulkDeletePrivateIpItem> bulkDeletePrivateIpItem;

        /**
         * A secondary IPv4 address to delete.
         *
         * @param bulkDeletePrivateIpItem the value to set
         * @return this builder
         **/
        public Builder bulkDeletePrivateIpItem(
                java.util.List<BulkDeletePrivateIpItem> bulkDeletePrivateIpItem) {
            this.bulkDeletePrivateIpItem = bulkDeletePrivateIpItem;
            this.__explicitlySet__.add("bulkDeletePrivateIpItem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkDeletePrivateIpsDetails build() {
            BulkDeletePrivateIpsDetails model =
                    new BulkDeletePrivateIpsDetails(
                            this.vnicId, this.vlanId, this.subnetId, this.bulkDeletePrivateIpItem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkDeletePrivateIpsDetails model) {
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("bulkDeletePrivateIpItem")) {
                this.bulkDeletePrivateIpItem(model.getBulkDeletePrivateIpItem());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC of which
     * private IPs should be deleted. The VNIC and private IPs must be in the same subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC of which
     * private IPs should be deleted. The VNIC and private IPs must be in the same subnet.
     *
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    /**
     * Use this attribute only with the Oracle Cloud VMware Solution.
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IP is to be deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * Use this attribute only with the Oracle Cloud VMware Solution.
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN from which the private IP is to be deleted.
     *
     * @return the value
     **/
    public String getVlanId() {
        return vlanId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IPs is to be deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the private IPs is to be deleted.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * A secondary IPv4 address to delete.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bulkDeletePrivateIpItem")
    private final java.util.List<BulkDeletePrivateIpItem> bulkDeletePrivateIpItem;

    /**
     * A secondary IPv4 address to delete.
     *
     * @return the value
     **/
    public java.util.List<BulkDeletePrivateIpItem> getBulkDeletePrivateIpItem() {
        return bulkDeletePrivateIpItem;
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
        sb.append("BulkDeletePrivateIpsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", bulkDeletePrivateIpItem=")
                .append(String.valueOf(this.bulkDeletePrivateIpItem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkDeletePrivateIpsDetails)) {
            return false;
        }

        BulkDeletePrivateIpsDetails other = (BulkDeletePrivateIpsDetails) o;
        return java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.bulkDeletePrivateIpItem, other.bulkDeletePrivateIpItem)
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
                        + (this.bulkDeletePrivateIpItem == null
                                ? 43
                                : this.bulkDeletePrivateIpItem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
