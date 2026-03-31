/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Bulk Secondary IPv6 addresses update object.
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
    builder = BulkUpdateIpv6sDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkUpdateIpv6sDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vnicId", "bulkUpdateIpv6sItem"})
    public BulkUpdateIpv6sDetails(
            String vnicId, java.util.List<BulkUpdateIpv6sItem> bulkUpdateIpv6sItem) {
        super();
        this.vnicId = vnicId;
        this.bulkUpdateIpv6sItem = bulkUpdateIpv6sItem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to move the IPv6s to.
         * The VNIC and IPv6s must be in the same subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to move the IPv6s to.
         * The VNIC and IPv6s must be in the same subnet.
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
         * Secondary IPv6 addresses to updated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bulkUpdateIpv6sItem")
        private java.util.List<BulkUpdateIpv6sItem> bulkUpdateIpv6sItem;

        /**
         * Secondary IPv6 addresses to updated.
         *
         * @param bulkUpdateIpv6sItem the value to set
         * @return this builder
         **/
        public Builder bulkUpdateIpv6sItem(
                java.util.List<BulkUpdateIpv6sItem> bulkUpdateIpv6sItem) {
            this.bulkUpdateIpv6sItem = bulkUpdateIpv6sItem;
            this.__explicitlySet__.add("bulkUpdateIpv6sItem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkUpdateIpv6sDetails build() {
            BulkUpdateIpv6sDetails model =
                    new BulkUpdateIpv6sDetails(this.vnicId, this.bulkUpdateIpv6sItem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkUpdateIpv6sDetails model) {
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("bulkUpdateIpv6sItem")) {
                this.bulkUpdateIpv6sItem(model.getBulkUpdateIpv6sItem());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to move the IPv6s to.
     * The VNIC and IPv6s must be in the same subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC to move the IPv6s to.
     * The VNIC and IPv6s must be in the same subnet.
     *
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    /**
     * Secondary IPv6 addresses to updated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bulkUpdateIpv6sItem")
    private final java.util.List<BulkUpdateIpv6sItem> bulkUpdateIpv6sItem;

    /**
     * Secondary IPv6 addresses to updated.
     *
     * @return the value
     **/
    public java.util.List<BulkUpdateIpv6sItem> getBulkUpdateIpv6sItem() {
        return bulkUpdateIpv6sItem;
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
        sb.append("BulkUpdateIpv6sDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", bulkUpdateIpv6sItem=").append(String.valueOf(this.bulkUpdateIpv6sItem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUpdateIpv6sDetails)) {
            return false;
        }

        BulkUpdateIpv6sDetails other = (BulkUpdateIpv6sDetails) o;
        return java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.bulkUpdateIpv6sItem, other.bulkUpdateIpv6sItem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkUpdateIpv6sItem == null
                                ? 43
                                : this.bulkUpdateIpv6sItem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
