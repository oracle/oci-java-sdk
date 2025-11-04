/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Specifies the flex tunnel attached to the DRG. <br>
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
        builder = FlexTunnelDrgAttachmentNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FlexTunnelDrgAttachmentNetworkDetails extends DrgAttachmentNetworkDetails {
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * transport drg attachment of the flex tunnel.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportAttachmentId")
        private String transportAttachmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * transport drg attachment of the flex tunnel.
         *
         * @param transportAttachmentId the value to set
         * @return this builder
         */
        public Builder transportAttachmentId(String transportAttachmentId) {
            this.transportAttachmentId = transportAttachmentId;
            this.__explicitlySet__.add("transportAttachmentId");
            return this;
        }
        /** The BGP ASN to use for the Flex Tunnel connection's route target */
        @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
        private String regionalOciAsn;

        /**
         * The BGP ASN to use for the Flex Tunnel connection's route target
         *
         * @param regionalOciAsn the value to set
         * @return this builder
         */
        public Builder regionalOciAsn(String regionalOciAsn) {
            this.regionalOciAsn = regionalOciAsn;
            this.__explicitlySet__.add("regionalOciAsn");
            return this;
        }
        /**
         * Routes which may be imported from the attachment (subject to import policy) appear in the
         * route reflectors tagged with the attachment's import route target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("importRouteTarget")
        private String importRouteTarget;

        /**
         * Routes which may be imported from the attachment (subject to import policy) appear in the
         * route reflectors tagged with the attachment's import route target.
         *
         * @param importRouteTarget the value to set
         * @return this builder
         */
        public Builder importRouteTarget(String importRouteTarget) {
            this.importRouteTarget = importRouteTarget;
            this.__explicitlySet__.add("importRouteTarget");
            return this;
        }
        /**
         * Routes which are exported to the attachment are exported to the route reflectors with the
         * route target set to the value of the attachment's export route target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportRouteTarget")
        private String exportRouteTarget;

        /**
         * Routes which are exported to the attachment are exported to the route reflectors with the
         * route target set to the value of the attachment's export route target.
         *
         * @param exportRouteTarget the value to set
         * @return this builder
         */
        public Builder exportRouteTarget(String exportRouteTarget) {
            this.exportRouteTarget = exportRouteTarget;
            this.__explicitlySet__.add("exportRouteTarget");
            return this;
        }
        /** The MPLS label of the DRG attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("mplsLabel")
        private Integer mplsLabel;

        /**
         * The MPLS label of the DRG attachment.
         *
         * @param mplsLabel the value to set
         * @return this builder
         */
        public Builder mplsLabel(Integer mplsLabel) {
            this.mplsLabel = mplsLabel;
            this.__explicitlySet__.add("mplsLabel");
            return this;
        }
        /** IPv4 address used to encapsulate ingress traffic to the DRG through this attachment */
        @com.fasterxml.jackson.annotation.JsonProperty("ingressVip")
        private String ingressVip;

        /**
         * IPv4 address used to encapsulate ingress traffic to the DRG through this attachment
         *
         * @param ingressVip the value to set
         * @return this builder
         */
        public Builder ingressVip(String ingressVip) {
            this.ingressVip = ingressVip;
            this.__explicitlySet__.add("ingressVip");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FlexTunnelDrgAttachmentNetworkDetails build() {
            FlexTunnelDrgAttachmentNetworkDetails model =
                    new FlexTunnelDrgAttachmentNetworkDetails(
                            this.id,
                            this.transportAttachmentId,
                            this.regionalOciAsn,
                            this.importRouteTarget,
                            this.exportRouteTarget,
                            this.mplsLabel,
                            this.ingressVip);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FlexTunnelDrgAttachmentNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("transportAttachmentId")) {
                this.transportAttachmentId(model.getTransportAttachmentId());
            }
            if (model.wasPropertyExplicitlySet("regionalOciAsn")) {
                this.regionalOciAsn(model.getRegionalOciAsn());
            }
            if (model.wasPropertyExplicitlySet("importRouteTarget")) {
                this.importRouteTarget(model.getImportRouteTarget());
            }
            if (model.wasPropertyExplicitlySet("exportRouteTarget")) {
                this.exportRouteTarget(model.getExportRouteTarget());
            }
            if (model.wasPropertyExplicitlySet("mplsLabel")) {
                this.mplsLabel(model.getMplsLabel());
            }
            if (model.wasPropertyExplicitlySet("ingressVip")) {
                this.ingressVip(model.getIngressVip());
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
    public FlexTunnelDrgAttachmentNetworkDetails(
            String id,
            String transportAttachmentId,
            String regionalOciAsn,
            String importRouteTarget,
            String exportRouteTarget,
            Integer mplsLabel,
            String ingressVip) {
        super(id);
        this.transportAttachmentId = transportAttachmentId;
        this.regionalOciAsn = regionalOciAsn;
        this.importRouteTarget = importRouteTarget;
        this.exportRouteTarget = exportRouteTarget;
        this.mplsLabel = mplsLabel;
        this.ingressVip = ingressVip;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * transport drg attachment of the flex tunnel.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportAttachmentId")
    private final String transportAttachmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * transport drg attachment of the flex tunnel.
     *
     * @return the value
     */
    public String getTransportAttachmentId() {
        return transportAttachmentId;
    }

    /** The BGP ASN to use for the Flex Tunnel connection's route target */
    @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
    private final String regionalOciAsn;

    /**
     * The BGP ASN to use for the Flex Tunnel connection's route target
     *
     * @return the value
     */
    public String getRegionalOciAsn() {
        return regionalOciAsn;
    }

    /**
     * Routes which may be imported from the attachment (subject to import policy) appear in the
     * route reflectors tagged with the attachment's import route target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("importRouteTarget")
    private final String importRouteTarget;

    /**
     * Routes which may be imported from the attachment (subject to import policy) appear in the
     * route reflectors tagged with the attachment's import route target.
     *
     * @return the value
     */
    public String getImportRouteTarget() {
        return importRouteTarget;
    }

    /**
     * Routes which are exported to the attachment are exported to the route reflectors with the
     * route target set to the value of the attachment's export route target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportRouteTarget")
    private final String exportRouteTarget;

    /**
     * Routes which are exported to the attachment are exported to the route reflectors with the
     * route target set to the value of the attachment's export route target.
     *
     * @return the value
     */
    public String getExportRouteTarget() {
        return exportRouteTarget;
    }

    /** The MPLS label of the DRG attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("mplsLabel")
    private final Integer mplsLabel;

    /**
     * The MPLS label of the DRG attachment.
     *
     * @return the value
     */
    public Integer getMplsLabel() {
        return mplsLabel;
    }

    /** IPv4 address used to encapsulate ingress traffic to the DRG through this attachment */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressVip")
    private final String ingressVip;

    /**
     * IPv4 address used to encapsulate ingress traffic to the DRG through this attachment
     *
     * @return the value
     */
    public String getIngressVip() {
        return ingressVip;
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
        sb.append("FlexTunnelDrgAttachmentNetworkDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", transportAttachmentId=").append(String.valueOf(this.transportAttachmentId));
        sb.append(", regionalOciAsn=").append(String.valueOf(this.regionalOciAsn));
        sb.append(", importRouteTarget=").append(String.valueOf(this.importRouteTarget));
        sb.append(", exportRouteTarget=").append(String.valueOf(this.exportRouteTarget));
        sb.append(", mplsLabel=").append(String.valueOf(this.mplsLabel));
        sb.append(", ingressVip=").append(String.valueOf(this.ingressVip));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlexTunnelDrgAttachmentNetworkDetails)) {
            return false;
        }

        FlexTunnelDrgAttachmentNetworkDetails other = (FlexTunnelDrgAttachmentNetworkDetails) o;
        return java.util.Objects.equals(this.transportAttachmentId, other.transportAttachmentId)
                && java.util.Objects.equals(this.regionalOciAsn, other.regionalOciAsn)
                && java.util.Objects.equals(this.importRouteTarget, other.importRouteTarget)
                && java.util.Objects.equals(this.exportRouteTarget, other.exportRouteTarget)
                && java.util.Objects.equals(this.mplsLabel, other.mplsLabel)
                && java.util.Objects.equals(this.ingressVip, other.ingressVip)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.transportAttachmentId == null
                                ? 43
                                : this.transportAttachmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.regionalOciAsn == null ? 43 : this.regionalOciAsn.hashCode());
        result =
                (result * PRIME)
                        + (this.importRouteTarget == null ? 43 : this.importRouteTarget.hashCode());
        result =
                (result * PRIME)
                        + (this.exportRouteTarget == null ? 43 : this.exportRouteTarget.hashCode());
        result = (result * PRIME) + (this.mplsLabel == null ? 43 : this.mplsLabel.hashCode());
        result = (result * PRIME) + (this.ingressVip == null ? 43 : this.ingressVip.hashCode());
        return result;
    }
}
