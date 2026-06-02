/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details needed to bulk detach secondary IPv6 addresses.
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
    builder = BulkDetachIpv6sDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkDetachIpv6sDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vnicId", "bulkDetachIpv6sItem"})
    public BulkDetachIpv6sDetails(
            String vnicId, java.util.List<BulkDetachIpv6sItem> bulkDetachIpv6sItem) {
        super();
        this.vnicId = vnicId;
        this.bulkDetachIpv6sItem = bulkDetachIpv6sItem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC from which multiple IPv6s should be detached. The VNIC and IPv6s must be in the same subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC from which multiple IPv6s should be detached. The VNIC and IPv6s must be in the same subnet.
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
         * A secondary IPv6 address to detach.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bulkDetachIpv6sItem")
        private java.util.List<BulkDetachIpv6sItem> bulkDetachIpv6sItem;

        /**
         * A secondary IPv6 address to detach.
         *
         * @param bulkDetachIpv6sItem the value to set
         * @return this builder
         **/
        public Builder bulkDetachIpv6sItem(
                java.util.List<BulkDetachIpv6sItem> bulkDetachIpv6sItem) {
            this.bulkDetachIpv6sItem = bulkDetachIpv6sItem;
            this.__explicitlySet__.add("bulkDetachIpv6sItem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkDetachIpv6sDetails build() {
            BulkDetachIpv6sDetails model =
                    new BulkDetachIpv6sDetails(this.vnicId, this.bulkDetachIpv6sItem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkDetachIpv6sDetails model) {
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("bulkDetachIpv6sItem")) {
                this.bulkDetachIpv6sItem(model.getBulkDetachIpv6sItem());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC from which multiple IPv6s should be detached. The VNIC and IPv6s must be in the same subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC from which multiple IPv6s should be detached. The VNIC and IPv6s must be in the same subnet.
     *
     * @return the value
     **/
    public String getVnicId() {
        return vnicId;
    }

    /**
     * A secondary IPv6 address to detach.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bulkDetachIpv6sItem")
    private final java.util.List<BulkDetachIpv6sItem> bulkDetachIpv6sItem;

    /**
     * A secondary IPv6 address to detach.
     *
     * @return the value
     **/
    public java.util.List<BulkDetachIpv6sItem> getBulkDetachIpv6sItem() {
        return bulkDetachIpv6sItem;
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
        sb.append("BulkDetachIpv6sDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", bulkDetachIpv6sItem=").append(String.valueOf(this.bulkDetachIpv6sItem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkDetachIpv6sDetails)) {
            return false;
        }

        BulkDetachIpv6sDetails other = (BulkDetachIpv6sDetails) o;
        return java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.bulkDetachIpv6sItem, other.bulkDetachIpv6sItem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkDetachIpv6sItem == null
                                ? 43
                                : this.bulkDetachIpv6sItem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
