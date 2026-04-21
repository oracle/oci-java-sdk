/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A secondary IPv6 address bulk deletion object. <br>
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
        builder = BulkDeleteIpv6sDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkDeleteIpv6sDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vnicId", "subnetId", "bulkDeleteIpv6sItem"})
    public BulkDeleteIpv6sDetails(
            String vnicId,
            String subnetId,
            java.util.List<BulkDeleteIpv6sItem> bulkDeleteIpv6sItem) {
        super();
        this.vnicId = vnicId;
        this.subnetId = subnetId;
        this.bulkDeleteIpv6sItem = bulkDeleteIpv6sItem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VNIC to assign the IPv6s to. The IPv6 will be in the VNIC's subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VNIC to assign the IPv6s to. The IPv6 will be in the VNIC's subnet.
         *
         * @param vnicId the value to set
         * @return this builder
         */
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet from which the IPv6s addresses are deleted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet from which the IPv6s addresses are deleted.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** An IPv6 address to delete. */
        @com.fasterxml.jackson.annotation.JsonProperty("bulkDeleteIpv6sItem")
        private java.util.List<BulkDeleteIpv6sItem> bulkDeleteIpv6sItem;

        /**
         * An IPv6 address to delete.
         *
         * @param bulkDeleteIpv6sItem the value to set
         * @return this builder
         */
        public Builder bulkDeleteIpv6sItem(
                java.util.List<BulkDeleteIpv6sItem> bulkDeleteIpv6sItem) {
            this.bulkDeleteIpv6sItem = bulkDeleteIpv6sItem;
            this.__explicitlySet__.add("bulkDeleteIpv6sItem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkDeleteIpv6sDetails build() {
            BulkDeleteIpv6sDetails model =
                    new BulkDeleteIpv6sDetails(
                            this.vnicId, this.subnetId, this.bulkDeleteIpv6sItem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkDeleteIpv6sDetails model) {
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("bulkDeleteIpv6sItem")) {
                this.bulkDeleteIpv6sItem(model.getBulkDeleteIpv6sItem());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC
     * to assign the IPv6s to. The IPv6 will be in the VNIC's subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC
     * to assign the IPv6s to. The IPv6 will be in the VNIC's subnet.
     *
     * @return the value
     */
    public String getVnicId() {
        return vnicId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet from which the IPv6s addresses are deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet from which the IPv6s addresses are deleted.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** An IPv6 address to delete. */
    @com.fasterxml.jackson.annotation.JsonProperty("bulkDeleteIpv6sItem")
    private final java.util.List<BulkDeleteIpv6sItem> bulkDeleteIpv6sItem;

    /**
     * An IPv6 address to delete.
     *
     * @return the value
     */
    public java.util.List<BulkDeleteIpv6sItem> getBulkDeleteIpv6sItem() {
        return bulkDeleteIpv6sItem;
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
        sb.append("BulkDeleteIpv6sDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", bulkDeleteIpv6sItem=").append(String.valueOf(this.bulkDeleteIpv6sItem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkDeleteIpv6sDetails)) {
            return false;
        }

        BulkDeleteIpv6sDetails other = (BulkDeleteIpv6sDetails) o;
        return java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.bulkDeleteIpv6sItem, other.bulkDeleteIpv6sItem)
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
                        + (this.bulkDeleteIpv6sItem == null
                                ? 43
                                : this.bulkDeleteIpv6sItem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
