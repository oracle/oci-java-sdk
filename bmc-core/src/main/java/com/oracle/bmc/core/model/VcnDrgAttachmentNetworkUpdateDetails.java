/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the update details for the VCN attachment. <br>
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
        builder = VcnDrgAttachmentNetworkUpdateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VcnDrgAttachmentNetworkUpdateDetails extends DrgAttachmentNetworkUpdateDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the route table that is used to route the traffic as it enters a VCN through this
         * attachment.
         *
         * <p>For information about why you would associate a route table with a DRG attachment,
         * see:
         *
         * <p>[Transit Routing: Access to Multiple VCNs in Same
         * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) * [Transit
         * Routing: Private Access to Oracle
         * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the route table that is used to route the traffic as it enters a VCN through this
         * attachment.
         *
         * <p>For information about why you would associate a route table with a DRG attachment,
         * see:
         *
         * <p>[Transit Routing: Access to Multiple VCNs in Same
         * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) * [Transit
         * Routing: Private Access to Oracle
         * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
         *
         * @param routeTableId the value to set
         * @return this builder
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * Indicates whether the VCN CIDRs or the individual subnet CIDRs are imported from the
         * attachment. Routes from the VCN ingress route table are always imported.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnRouteType")
        private VcnDrgAttachmentNetworkDetails.VcnRouteType vcnRouteType;

        /**
         * Indicates whether the VCN CIDRs or the individual subnet CIDRs are imported from the
         * attachment. Routes from the VCN ingress route table are always imported.
         *
         * @param vcnRouteType the value to set
         * @return this builder
         */
        public Builder vcnRouteType(VcnDrgAttachmentNetworkDetails.VcnRouteType vcnRouteType) {
            this.vcnRouteType = vcnRouteType;
            this.__explicitlySet__.add("vcnRouteType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VcnDrgAttachmentNetworkUpdateDetails build() {
            VcnDrgAttachmentNetworkUpdateDetails model =
                    new VcnDrgAttachmentNetworkUpdateDetails(this.routeTableId, this.vcnRouteType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VcnDrgAttachmentNetworkUpdateDetails model) {
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("vcnRouteType")) {
                this.vcnRouteType(model.getVcnRouteType());
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
    public VcnDrgAttachmentNetworkUpdateDetails(
            String routeTableId, VcnDrgAttachmentNetworkDetails.VcnRouteType vcnRouteType) {
        super();
        this.routeTableId = routeTableId;
        this.vcnRouteType = vcnRouteType;
    }

    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the route table that is used to route the traffic as it enters a VCN through this attachment.
     *
     * <p>For information about why you would associate a route table with a DRG attachment, see:
     *
     * <p>[Transit Routing: Access to Multiple VCNs in Same
     * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) * [Transit
     * Routing: Private Access to Oracle
     * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the route table that is used to route the traffic as it enters a VCN through this attachment.
     *
     * <p>For information about why you would associate a route table with a DRG attachment, see:
     *
     * <p>[Transit Routing: Access to Multiple VCNs in Same
     * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) * [Transit
     * Routing: Private Access to Oracle
     * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     *
     * @return the value
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * Indicates whether the VCN CIDRs or the individual subnet CIDRs are imported from the
     * attachment. Routes from the VCN ingress route table are always imported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnRouteType")
    private final VcnDrgAttachmentNetworkDetails.VcnRouteType vcnRouteType;

    /**
     * Indicates whether the VCN CIDRs or the individual subnet CIDRs are imported from the
     * attachment. Routes from the VCN ingress route table are always imported.
     *
     * @return the value
     */
    public VcnDrgAttachmentNetworkDetails.VcnRouteType getVcnRouteType() {
        return vcnRouteType;
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
        sb.append("VcnDrgAttachmentNetworkUpdateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", vcnRouteType=").append(String.valueOf(this.vcnRouteType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VcnDrgAttachmentNetworkUpdateDetails)) {
            return false;
        }

        VcnDrgAttachmentNetworkUpdateDetails other = (VcnDrgAttachmentNetworkUpdateDetails) o;
        return java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.vcnRouteType, other.vcnRouteType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + (this.vcnRouteType == null ? 43 : this.vcnRouteType.hashCode());
        return result;
    }
}
