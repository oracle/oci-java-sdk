/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Specifies the IPSec tunnel attached to the DRG. <br>
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
        builder = IpsecTunnelDrgAttachmentNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IpsecTunnelDrgAttachmentNetworkDetails extends DrgAttachmentNetworkDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The IPSec connection that contains the attached IPSec tunnel. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnectionId")
        private String ipsecConnectionId;

        /**
         * The IPSec connection that contains the attached IPSec tunnel.
         *
         * @param ipsecConnectionId the value to set
         * @return this builder
         */
        public Builder ipsecConnectionId(String ipsecConnectionId) {
            this.ipsecConnectionId = ipsecConnectionId;
            this.__explicitlySet__.add("ipsecConnectionId");
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
        /** The BGP ASN to use for the IPSec connection's route target. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
        private String regionalOciAsn;

        /**
         * The BGP ASN to use for the IPSec connection's route target.
         *
         * @param regionalOciAsn the value to set
         * @return this builder
         */
        public Builder regionalOciAsn(String regionalOciAsn) {
            this.regionalOciAsn = regionalOciAsn;
            this.__explicitlySet__.add("regionalOciAsn");
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
        /** Whether traffic from this network is forwarded to the El Paso Gamma VIPs (or not) */
        @com.fasterxml.jackson.annotation.JsonProperty("isGammaDrg")
        private Boolean isGammaDrg;

        /**
         * Whether traffic from this network is forwarded to the El Paso Gamma VIPs (or not)
         *
         * @param isGammaDrg the value to set
         * @return this builder
         */
        public Builder isGammaDrg(Boolean isGammaDrg) {
            this.isGammaDrg = isGammaDrg;
            this.__explicitlySet__.add("isGammaDrg");
            return this;
        }
        /**
         * Common Export route target to use for the DRG Attachment instead of per-attachment route
         * target. This is applicable to DRG attachments that are assigned to a DRG route table
         * which is whitelisted for route unification.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("commonExportRT")
        private String commonExportRT;

        /**
         * Common Export route target to use for the DRG Attachment instead of per-attachment route
         * target. This is applicable to DRG attachments that are assigned to a DRG route table
         * which is whitelisted for route unification.
         *
         * @param commonExportRT the value to set
         * @return this builder
         */
        public Builder commonExportRT(String commonExportRT) {
            this.commonExportRT = commonExportRT;
            this.__explicitlySet__.add("commonExportRT");
            return this;
        }
        /**
         * Common Import route target to use for the DRG attachment instead of per-attachment import
         * route target. This is applicable to DRG attachments that are assigned to a DRG route
         * table which is whitelisted for route unification.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("commonImportRT")
        private String commonImportRT;

        /**
         * Common Import route target to use for the DRG attachment instead of per-attachment import
         * route target. This is applicable to DRG attachments that are assigned to a DRG route
         * table which is whitelisted for route unification.
         *
         * @param commonImportRT the value to set
         * @return this builder
         */
        public Builder commonImportRT(String commonImportRT) {
            this.commonImportRT = commonImportRT;
            this.__explicitlySet__.add("commonImportRT");
            return this;
        }
        /**
         * This indicates whether the DRG route table associated with the DRG attachment is
         * whitelisted for route unification.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRouteUnificationEnabled")
        private Boolean isRouteUnificationEnabled;

        /**
         * This indicates whether the DRG route table associated with the DRG attachment is
         * whitelisted for route unification.
         *
         * <p>Example: {@code true}
         *
         * @param isRouteUnificationEnabled the value to set
         * @return this builder
         */
        public Builder isRouteUnificationEnabled(Boolean isRouteUnificationEnabled) {
            this.isRouteUnificationEnabled = isRouteUnificationEnabled;
            this.__explicitlySet__.add("isRouteUnificationEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * virtual circuit's DRG attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportAttachmentId")
        private String transportAttachmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * virtual circuit's DRG attachment.
         *
         * @param transportAttachmentId the value to set
         * @return this builder
         */
        public Builder transportAttachmentId(String transportAttachmentId) {
            this.transportAttachmentId = transportAttachmentId;
            this.__explicitlySet__.add("transportAttachmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IpsecTunnelDrgAttachmentNetworkDetails build() {
            IpsecTunnelDrgAttachmentNetworkDetails model =
                    new IpsecTunnelDrgAttachmentNetworkDetails(
                            this.id,
                            this.ipsecConnectionId,
                            this.importRouteTarget,
                            this.exportRouteTarget,
                            this.mplsLabel,
                            this.regionalOciAsn,
                            this.ingressVip,
                            this.isGammaDrg,
                            this.commonExportRT,
                            this.commonImportRT,
                            this.isRouteUnificationEnabled,
                            this.transportAttachmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IpsecTunnelDrgAttachmentNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("ipsecConnectionId")) {
                this.ipsecConnectionId(model.getIpsecConnectionId());
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
            if (model.wasPropertyExplicitlySet("regionalOciAsn")) {
                this.regionalOciAsn(model.getRegionalOciAsn());
            }
            if (model.wasPropertyExplicitlySet("ingressVip")) {
                this.ingressVip(model.getIngressVip());
            }
            if (model.wasPropertyExplicitlySet("isGammaDrg")) {
                this.isGammaDrg(model.getIsGammaDrg());
            }
            if (model.wasPropertyExplicitlySet("commonExportRT")) {
                this.commonExportRT(model.getCommonExportRT());
            }
            if (model.wasPropertyExplicitlySet("commonImportRT")) {
                this.commonImportRT(model.getCommonImportRT());
            }
            if (model.wasPropertyExplicitlySet("isRouteUnificationEnabled")) {
                this.isRouteUnificationEnabled(model.getIsRouteUnificationEnabled());
            }
            if (model.wasPropertyExplicitlySet("transportAttachmentId")) {
                this.transportAttachmentId(model.getTransportAttachmentId());
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
    public IpsecTunnelDrgAttachmentNetworkDetails(
            String id,
            String ipsecConnectionId,
            String importRouteTarget,
            String exportRouteTarget,
            Integer mplsLabel,
            String regionalOciAsn,
            String ingressVip,
            Boolean isGammaDrg,
            String commonExportRT,
            String commonImportRT,
            Boolean isRouteUnificationEnabled,
            String transportAttachmentId) {
        super(id);
        this.ipsecConnectionId = ipsecConnectionId;
        this.importRouteTarget = importRouteTarget;
        this.exportRouteTarget = exportRouteTarget;
        this.mplsLabel = mplsLabel;
        this.regionalOciAsn = regionalOciAsn;
        this.ingressVip = ingressVip;
        this.isGammaDrg = isGammaDrg;
        this.commonExportRT = commonExportRT;
        this.commonImportRT = commonImportRT;
        this.isRouteUnificationEnabled = isRouteUnificationEnabled;
        this.transportAttachmentId = transportAttachmentId;
    }

    /** The IPSec connection that contains the attached IPSec tunnel. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipsecConnectionId")
    private final String ipsecConnectionId;

    /**
     * The IPSec connection that contains the attached IPSec tunnel.
     *
     * @return the value
     */
    public String getIpsecConnectionId() {
        return ipsecConnectionId;
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

    /** The BGP ASN to use for the IPSec connection's route target. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
    private final String regionalOciAsn;

    /**
     * The BGP ASN to use for the IPSec connection's route target.
     *
     * @return the value
     */
    public String getRegionalOciAsn() {
        return regionalOciAsn;
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

    /** Whether traffic from this network is forwarded to the El Paso Gamma VIPs (or not) */
    @com.fasterxml.jackson.annotation.JsonProperty("isGammaDrg")
    private final Boolean isGammaDrg;

    /**
     * Whether traffic from this network is forwarded to the El Paso Gamma VIPs (or not)
     *
     * @return the value
     */
    public Boolean getIsGammaDrg() {
        return isGammaDrg;
    }

    /**
     * Common Export route target to use for the DRG Attachment instead of per-attachment route
     * target. This is applicable to DRG attachments that are assigned to a DRG route table which is
     * whitelisted for route unification.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonExportRT")
    private final String commonExportRT;

    /**
     * Common Export route target to use for the DRG Attachment instead of per-attachment route
     * target. This is applicable to DRG attachments that are assigned to a DRG route table which is
     * whitelisted for route unification.
     *
     * @return the value
     */
    public String getCommonExportRT() {
        return commonExportRT;
    }

    /**
     * Common Import route target to use for the DRG attachment instead of per-attachment import
     * route target. This is applicable to DRG attachments that are assigned to a DRG route table
     * which is whitelisted for route unification.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonImportRT")
    private final String commonImportRT;

    /**
     * Common Import route target to use for the DRG attachment instead of per-attachment import
     * route target. This is applicable to DRG attachments that are assigned to a DRG route table
     * which is whitelisted for route unification.
     *
     * @return the value
     */
    public String getCommonImportRT() {
        return commonImportRT;
    }

    /**
     * This indicates whether the DRG route table associated with the DRG attachment is whitelisted
     * for route unification.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRouteUnificationEnabled")
    private final Boolean isRouteUnificationEnabled;

    /**
     * This indicates whether the DRG route table associated with the DRG attachment is whitelisted
     * for route unification.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsRouteUnificationEnabled() {
        return isRouteUnificationEnabled;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * virtual circuit's DRG attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportAttachmentId")
    private final String transportAttachmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * virtual circuit's DRG attachment.
     *
     * @return the value
     */
    public String getTransportAttachmentId() {
        return transportAttachmentId;
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
        sb.append("IpsecTunnelDrgAttachmentNetworkDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", ipsecConnectionId=").append(String.valueOf(this.ipsecConnectionId));
        sb.append(", importRouteTarget=").append(String.valueOf(this.importRouteTarget));
        sb.append(", exportRouteTarget=").append(String.valueOf(this.exportRouteTarget));
        sb.append(", mplsLabel=").append(String.valueOf(this.mplsLabel));
        sb.append(", regionalOciAsn=").append(String.valueOf(this.regionalOciAsn));
        sb.append(", ingressVip=").append(String.valueOf(this.ingressVip));
        sb.append(", isGammaDrg=").append(String.valueOf(this.isGammaDrg));
        sb.append(", commonExportRT=").append(String.valueOf(this.commonExportRT));
        sb.append(", commonImportRT=").append(String.valueOf(this.commonImportRT));
        sb.append(", isRouteUnificationEnabled=")
                .append(String.valueOf(this.isRouteUnificationEnabled));
        sb.append(", transportAttachmentId=").append(String.valueOf(this.transportAttachmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IpsecTunnelDrgAttachmentNetworkDetails)) {
            return false;
        }

        IpsecTunnelDrgAttachmentNetworkDetails other = (IpsecTunnelDrgAttachmentNetworkDetails) o;
        return java.util.Objects.equals(this.ipsecConnectionId, other.ipsecConnectionId)
                && java.util.Objects.equals(this.importRouteTarget, other.importRouteTarget)
                && java.util.Objects.equals(this.exportRouteTarget, other.exportRouteTarget)
                && java.util.Objects.equals(this.mplsLabel, other.mplsLabel)
                && java.util.Objects.equals(this.regionalOciAsn, other.regionalOciAsn)
                && java.util.Objects.equals(this.ingressVip, other.ingressVip)
                && java.util.Objects.equals(this.isGammaDrg, other.isGammaDrg)
                && java.util.Objects.equals(this.commonExportRT, other.commonExportRT)
                && java.util.Objects.equals(this.commonImportRT, other.commonImportRT)
                && java.util.Objects.equals(
                        this.isRouteUnificationEnabled, other.isRouteUnificationEnabled)
                && java.util.Objects.equals(this.transportAttachmentId, other.transportAttachmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.ipsecConnectionId == null ? 43 : this.ipsecConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.importRouteTarget == null ? 43 : this.importRouteTarget.hashCode());
        result =
                (result * PRIME)
                        + (this.exportRouteTarget == null ? 43 : this.exportRouteTarget.hashCode());
        result = (result * PRIME) + (this.mplsLabel == null ? 43 : this.mplsLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.regionalOciAsn == null ? 43 : this.regionalOciAsn.hashCode());
        result = (result * PRIME) + (this.ingressVip == null ? 43 : this.ingressVip.hashCode());
        result = (result * PRIME) + (this.isGammaDrg == null ? 43 : this.isGammaDrg.hashCode());
        result =
                (result * PRIME)
                        + (this.commonExportRT == null ? 43 : this.commonExportRT.hashCode());
        result =
                (result * PRIME)
                        + (this.commonImportRT == null ? 43 : this.commonImportRT.hashCode());
        result =
                (result * PRIME)
                        + (this.isRouteUnificationEnabled == null
                                ? 43
                                : this.isRouteUnificationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.transportAttachmentId == null
                                ? 43
                                : this.transportAttachmentId.hashCode());
        return result;
    }
}
