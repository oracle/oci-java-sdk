/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details needed to create secondary IPv6 addresses with a bulk operation.
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
    builder = BulkCreateIpv6sDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkCreateIpv6sDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vnicId", "subnetId", "bulkCreateIpv6sItem"})
    public BulkCreateIpv6sDetails(
            String vnicId,
            String subnetId,
            java.util.List<BulkCreateIpv6sItem> bulkCreateIpv6sItem) {
        super();
        this.vnicId = vnicId;
        this.subnetId = subnetId;
        this.bulkCreateIpv6sItem = bulkCreateIpv6sItem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the IPv6s to. The
         * IPv6s will be in the VNIC's subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the IPv6s to. The
         * IPv6s will be in the VNIC's subnet.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the IPv6s are to be drawn. The IP addresses,
         * *if supplied*, must be valid for the given subnet, only valid for reserved IPs currently.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the IPv6s are to be drawn. The IP addresses,
         * *if supplied*, must be valid for the given subnet, only valid for reserved IPs currently.
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
         * A secondary IPv6 address to assign.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bulkCreateIpv6sItem")
        private java.util.List<BulkCreateIpv6sItem> bulkCreateIpv6sItem;

        /**
         * A secondary IPv6 address to assign.
         *
         * @param bulkCreateIpv6sItem the value to set
         * @return this builder
         **/
        public Builder bulkCreateIpv6sItem(
                java.util.List<BulkCreateIpv6sItem> bulkCreateIpv6sItem) {
            this.bulkCreateIpv6sItem = bulkCreateIpv6sItem;
            this.__explicitlySet__.add("bulkCreateIpv6sItem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkCreateIpv6sDetails build() {
            BulkCreateIpv6sDetails model =
                    new BulkCreateIpv6sDetails(
                            this.vnicId, this.subnetId, this.bulkCreateIpv6sItem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkCreateIpv6sDetails model) {
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("bulkCreateIpv6sItem")) {
                this.bulkCreateIpv6sItem(model.getBulkCreateIpv6sItem());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the IPv6s to. The
     * IPv6s will be in the VNIC's subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to assign the IPv6s to. The
     * IPv6s will be in the VNIC's subnet.
     *
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the IPv6s are to be drawn. The IP addresses,
     * *if supplied*, must be valid for the given subnet, only valid for reserved IPs currently.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet from which the IPv6s are to be drawn. The IP addresses,
     * *if supplied*, must be valid for the given subnet, only valid for reserved IPs currently.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * A secondary IPv6 address to assign.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bulkCreateIpv6sItem")
    private final java.util.List<BulkCreateIpv6sItem> bulkCreateIpv6sItem;

    /**
     * A secondary IPv6 address to assign.
     *
     * @return the value
     **/
    public java.util.List<BulkCreateIpv6sItem> getBulkCreateIpv6sItem() {
        return bulkCreateIpv6sItem;
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
        sb.append("BulkCreateIpv6sDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", bulkCreateIpv6sItem=").append(String.valueOf(this.bulkCreateIpv6sItem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkCreateIpv6sDetails)) {
            return false;
        }

        BulkCreateIpv6sDetails other = (BulkCreateIpv6sDetails) o;
        return java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.bulkCreateIpv6sItem, other.bulkCreateIpv6sItem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkCreateIpv6sItem == null
                                ? 43
                                : this.bulkCreateIpv6sItem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
