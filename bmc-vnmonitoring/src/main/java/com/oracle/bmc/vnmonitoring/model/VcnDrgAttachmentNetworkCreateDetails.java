/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Specifies the VCN Attachment <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VcnDrgAttachmentNetworkCreateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class VcnDrgAttachmentNetworkCreateDetails extends DrgAttachmentNetworkCreateDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * This is the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the route table that is used to route the traffic as it enters a VCN through this
         * attachment.
         *
         * <p>For information about why you would associate a route table with a DRG attachment, see
         * [Advanced Scenario: Transit
         * Routing](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm).
         * For information about why you would associate a route table with a DRG attachment, see:
         *
         * <p>[Transit Routing: Access to Multiple VCNs in Same
         * Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) *
         * [Transit Routing: Private Access to Oracle
         * Services](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * This is the
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the route table that is used to route the traffic as it enters a VCN through this
         * attachment.
         *
         * <p>For information about why you would associate a route table with a DRG attachment, see
         * [Advanced Scenario: Transit
         * Routing](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm).
         * For information about why you would associate a route table with a DRG attachment, see:
         *
         * <p>[Transit Routing: Access to Multiple VCNs in Same
         * Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) *
         * [Transit Routing: Private Access to Oracle
         * Services](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
         *
         * @param routeTableId the value to set
         * @return this builder
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VcnDrgAttachmentNetworkCreateDetails build() {
            VcnDrgAttachmentNetworkCreateDetails model =
                    new VcnDrgAttachmentNetworkCreateDetails(this.id, this.routeTableId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VcnDrgAttachmentNetworkCreateDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
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
    public VcnDrgAttachmentNetworkCreateDetails(String id, String routeTableId) {
        super(id);
        this.routeTableId = routeTableId;
    }

    /**
     * This is the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table that is used to route the traffic as it enters a VCN through this attachment.
     *
     * <p>For information about why you would associate a route table with a DRG attachment, see
     * [Advanced Scenario: Transit
     * Routing](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm). For
     * information about why you would associate a route table with a DRG attachment, see:
     *
     * <p>[Transit Routing: Access to Multiple VCNs in Same
     * Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) *
     * [Transit Routing: Private Access to Oracle
     * Services](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * This is the
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table that is used to route the traffic as it enters a VCN through this attachment.
     *
     * <p>For information about why you would associate a route table with a DRG attachment, see
     * [Advanced Scenario: Transit
     * Routing](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm). For
     * information about why you would associate a route table with a DRG attachment, see:
     *
     * <p>[Transit Routing: Access to Multiple VCNs in Same
     * Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) *
     * [Transit Routing: Private Access to Oracle
     * Services](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     *
     * @return the value
     */
    public String getRouteTableId() {
        return routeTableId;
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
        sb.append("VcnDrgAttachmentNetworkCreateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VcnDrgAttachmentNetworkCreateDetails)) {
            return false;
        }

        VcnDrgAttachmentNetworkCreateDetails other = (VcnDrgAttachmentNetworkCreateDetails) o;
        return java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        return result;
    }
}
