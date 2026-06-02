/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details used for a secondary IPv4 address bulk update.
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
    builder = BulkUpdatePrivateIpsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkUpdatePrivateIpsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vnicId", "bulkUpdatePrivateIpItem"})
    public BulkUpdatePrivateIpsDetails(
            String vnicId, java.util.List<BulkUpdatePrivateIpItem> bulkUpdatePrivateIpItem) {
        super();
        this.vnicId = vnicId;
        this.bulkUpdatePrivateIpItem = bulkUpdatePrivateIpItem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to reassign
         * the private IPs to. The VNIC and private IPs must be in the same subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to reassign
         * the private IPs to. The VNIC and private IPs must be in the same subnet.
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
         * A secondary IPv4 address to update.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bulkUpdatePrivateIpItem")
        private java.util.List<BulkUpdatePrivateIpItem> bulkUpdatePrivateIpItem;

        /**
         * A secondary IPv4 address to update.
         *
         * @param bulkUpdatePrivateIpItem the value to set
         * @return this builder
         **/
        public Builder bulkUpdatePrivateIpItem(
                java.util.List<BulkUpdatePrivateIpItem> bulkUpdatePrivateIpItem) {
            this.bulkUpdatePrivateIpItem = bulkUpdatePrivateIpItem;
            this.__explicitlySet__.add("bulkUpdatePrivateIpItem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUpdatePrivateIpsDetails build() {
            BulkUpdatePrivateIpsDetails model =
                    new BulkUpdatePrivateIpsDetails(this.vnicId, this.bulkUpdatePrivateIpItem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUpdatePrivateIpsDetails model) {
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("bulkUpdatePrivateIpItem")) {
                this.bulkUpdatePrivateIpItem(model.getBulkUpdatePrivateIpItem());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to reassign
     * the private IPs to. The VNIC and private IPs must be in the same subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to reassign
     * the private IPs to. The VNIC and private IPs must be in the same subnet.
     *
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    /**
     * A secondary IPv4 address to update.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bulkUpdatePrivateIpItem")
    private final java.util.List<BulkUpdatePrivateIpItem> bulkUpdatePrivateIpItem;

    /**
     * A secondary IPv4 address to update.
     *
     * @return the value
     **/
    public java.util.List<BulkUpdatePrivateIpItem> getBulkUpdatePrivateIpItem() {
        return bulkUpdatePrivateIpItem;
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
        sb.append("BulkUpdatePrivateIpsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", bulkUpdatePrivateIpItem=")
                .append(String.valueOf(this.bulkUpdatePrivateIpItem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUpdatePrivateIpsDetails)) {
            return false;
        }

        BulkUpdatePrivateIpsDetails other = (BulkUpdatePrivateIpsDetails) o;
        return java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(
                        this.bulkUpdatePrivateIpItem, other.bulkUpdatePrivateIpItem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkUpdatePrivateIpItem == null
                                ? 43
                                : this.bulkUpdatePrivateIpItem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
