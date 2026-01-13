/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Specifies the virtual circuit attached to the DRG. <br>
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
        builder = VirtualCircuitDrgAttachmentNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualCircuitDrgAttachmentNetworkDetails extends DrgAttachmentNetworkDetails {
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
         * Whether the Fast Connect is an FFAB VirtualCircuit.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFFAB")
        private Boolean isFFAB;

        /**
         * Whether the Fast Connect is an FFAB VirtualCircuit.
         *
         * <p>Example: {@code true}
         *
         * @param isFFAB the value to set
         * @return this builder
         */
        public Builder isFFAB(Boolean isFFAB) {
            this.isFFAB = isFFAB;
            this.__explicitlySet__.add("isFFAB");
            return this;
        }
        /**
         * This indicates whether FastConnect extends through an edge POP region.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEdgePop")
        private Boolean isEdgePop;

        /**
         * This indicates whether FastConnect extends through an edge POP region.
         *
         * <p>Example: {@code true}
         *
         * @param isEdgePop the value to set
         * @return this builder
         */
        public Builder isEdgePop(Boolean isEdgePop) {
            this.isEdgePop = isEdgePop;
            this.__explicitlySet__.add("isEdgePop");
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
        /** The Oracle Cloud Infrastructure region name. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionName")
        private String regionName;

        /**
         * The Oracle Cloud Infrastructure region name.
         *
         * @param regionName the value to set
         * @return this builder
         */
        public Builder regionName(String regionName) {
            this.regionName = regionName;
            this.__explicitlySet__.add("regionName");
            return this;
        }
        /**
         * Common Export route target to use for the DRG Attachment instead of per-attachment route
         * target. This is applicable to DRG attachments that are assigned to a DRG route table
         * which is whitelisted for high throughput mode.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("commonExportRT")
        private String commonExportRT;

        /**
         * Common Export route target to use for the DRG Attachment instead of per-attachment route
         * target. This is applicable to DRG attachments that are assigned to a DRG route table
         * which is whitelisted for high throughput mode.
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
         * table which is whitelisted for high throughput mode.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("commonImportRT")
        private String commonImportRT;

        /**
         * Common Import route target to use for the DRG attachment instead of per-attachment import
         * route target. This is applicable to DRG attachments that are assigned to a DRG route
         * table which is whitelisted for high throughput mode.
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
         * whitelisted for High Throughput mode.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIngressDisintermediationEnabled")
        private Boolean isIngressDisintermediationEnabled;

        /**
         * This indicates whether the DRG route table associated with the DRG attachment is
         * whitelisted for High Throughput mode.
         *
         * <p>Example: {@code true}
         *
         * @param isIngressDisintermediationEnabled the value to set
         * @return this builder
         */
        public Builder isIngressDisintermediationEnabled(
                Boolean isIngressDisintermediationEnabled) {
            this.isIngressDisintermediationEnabled = isIngressDisintermediationEnabled;
            this.__explicitlySet__.add("isIngressDisintermediationEnabled");
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
         * Boolean flag that determines wether all traffic over the virtual circuits is encrypted.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportOnlyMode")
        private Boolean transportOnlyMode;

        /**
         * Boolean flag that determines wether all traffic over the virtual circuits is encrypted.
         *
         * <p>Example: {@code true}
         *
         * @param transportOnlyMode the value to set
         * @return this builder
         */
        public Builder transportOnlyMode(Boolean transportOnlyMode) {
            this.transportOnlyMode = transportOnlyMode;
            this.__explicitlySet__.add("transportOnlyMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuitDrgAttachmentNetworkDetails build() {
            VirtualCircuitDrgAttachmentNetworkDetails model =
                    new VirtualCircuitDrgAttachmentNetworkDetails(
                            this.id,
                            this.isFFAB,
                            this.isEdgePop,
                            this.importRouteTarget,
                            this.exportRouteTarget,
                            this.mplsLabel,
                            this.regionalOciAsn,
                            this.regionName,
                            this.commonExportRT,
                            this.commonImportRT,
                            this.isIngressDisintermediationEnabled,
                            this.isRouteUnificationEnabled,
                            this.transportOnlyMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitDrgAttachmentNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("isFFAB")) {
                this.isFFAB(model.getIsFFAB());
            }
            if (model.wasPropertyExplicitlySet("isEdgePop")) {
                this.isEdgePop(model.getIsEdgePop());
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
            if (model.wasPropertyExplicitlySet("regionName")) {
                this.regionName(model.getRegionName());
            }
            if (model.wasPropertyExplicitlySet("commonExportRT")) {
                this.commonExportRT(model.getCommonExportRT());
            }
            if (model.wasPropertyExplicitlySet("commonImportRT")) {
                this.commonImportRT(model.getCommonImportRT());
            }
            if (model.wasPropertyExplicitlySet("isIngressDisintermediationEnabled")) {
                this.isIngressDisintermediationEnabled(
                        model.getIsIngressDisintermediationEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRouteUnificationEnabled")) {
                this.isRouteUnificationEnabled(model.getIsRouteUnificationEnabled());
            }
            if (model.wasPropertyExplicitlySet("transportOnlyMode")) {
                this.transportOnlyMode(model.getTransportOnlyMode());
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
    public VirtualCircuitDrgAttachmentNetworkDetails(
            String id,
            Boolean isFFAB,
            Boolean isEdgePop,
            String importRouteTarget,
            String exportRouteTarget,
            Integer mplsLabel,
            String regionalOciAsn,
            String regionName,
            String commonExportRT,
            String commonImportRT,
            Boolean isIngressDisintermediationEnabled,
            Boolean isRouteUnificationEnabled,
            Boolean transportOnlyMode) {
        super(id);
        this.isFFAB = isFFAB;
        this.isEdgePop = isEdgePop;
        this.importRouteTarget = importRouteTarget;
        this.exportRouteTarget = exportRouteTarget;
        this.mplsLabel = mplsLabel;
        this.regionalOciAsn = regionalOciAsn;
        this.regionName = regionName;
        this.commonExportRT = commonExportRT;
        this.commonImportRT = commonImportRT;
        this.isIngressDisintermediationEnabled = isIngressDisintermediationEnabled;
        this.isRouteUnificationEnabled = isRouteUnificationEnabled;
        this.transportOnlyMode = transportOnlyMode;
    }

    /**
     * Whether the Fast Connect is an FFAB VirtualCircuit.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFFAB")
    private final Boolean isFFAB;

    /**
     * Whether the Fast Connect is an FFAB VirtualCircuit.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsFFAB() {
        return isFFAB;
    }

    /**
     * This indicates whether FastConnect extends through an edge POP region.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEdgePop")
    private final Boolean isEdgePop;

    /**
     * This indicates whether FastConnect extends through an edge POP region.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsEdgePop() {
        return isEdgePop;
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

    /** The Oracle Cloud Infrastructure region name. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionName")
    private final String regionName;

    /**
     * The Oracle Cloud Infrastructure region name.
     *
     * @return the value
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Common Export route target to use for the DRG Attachment instead of per-attachment route
     * target. This is applicable to DRG attachments that are assigned to a DRG route table which is
     * whitelisted for high throughput mode.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonExportRT")
    private final String commonExportRT;

    /**
     * Common Export route target to use for the DRG Attachment instead of per-attachment route
     * target. This is applicable to DRG attachments that are assigned to a DRG route table which is
     * whitelisted for high throughput mode.
     *
     * @return the value
     */
    public String getCommonExportRT() {
        return commonExportRT;
    }

    /**
     * Common Import route target to use for the DRG attachment instead of per-attachment import
     * route target. This is applicable to DRG attachments that are assigned to a DRG route table
     * which is whitelisted for high throughput mode.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("commonImportRT")
    private final String commonImportRT;

    /**
     * Common Import route target to use for the DRG attachment instead of per-attachment import
     * route target. This is applicable to DRG attachments that are assigned to a DRG route table
     * which is whitelisted for high throughput mode.
     *
     * @return the value
     */
    public String getCommonImportRT() {
        return commonImportRT;
    }

    /**
     * This indicates whether the DRG route table associated with the DRG attachment is whitelisted
     * for High Throughput mode.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIngressDisintermediationEnabled")
    private final Boolean isIngressDisintermediationEnabled;

    /**
     * This indicates whether the DRG route table associated with the DRG attachment is whitelisted
     * for High Throughput mode.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsIngressDisintermediationEnabled() {
        return isIngressDisintermediationEnabled;
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
     * Boolean flag that determines wether all traffic over the virtual circuits is encrypted.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportOnlyMode")
    private final Boolean transportOnlyMode;

    /**
     * Boolean flag that determines wether all traffic over the virtual circuits is encrypted.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getTransportOnlyMode() {
        return transportOnlyMode;
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
        sb.append("VirtualCircuitDrgAttachmentNetworkDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isFFAB=").append(String.valueOf(this.isFFAB));
        sb.append(", isEdgePop=").append(String.valueOf(this.isEdgePop));
        sb.append(", importRouteTarget=").append(String.valueOf(this.importRouteTarget));
        sb.append(", exportRouteTarget=").append(String.valueOf(this.exportRouteTarget));
        sb.append(", mplsLabel=").append(String.valueOf(this.mplsLabel));
        sb.append(", regionalOciAsn=").append(String.valueOf(this.regionalOciAsn));
        sb.append(", regionName=").append(String.valueOf(this.regionName));
        sb.append(", commonExportRT=").append(String.valueOf(this.commonExportRT));
        sb.append(", commonImportRT=").append(String.valueOf(this.commonImportRT));
        sb.append(", isIngressDisintermediationEnabled=")
                .append(String.valueOf(this.isIngressDisintermediationEnabled));
        sb.append(", isRouteUnificationEnabled=")
                .append(String.valueOf(this.isRouteUnificationEnabled));
        sb.append(", transportOnlyMode=").append(String.valueOf(this.transportOnlyMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCircuitDrgAttachmentNetworkDetails)) {
            return false;
        }

        VirtualCircuitDrgAttachmentNetworkDetails other =
                (VirtualCircuitDrgAttachmentNetworkDetails) o;
        return java.util.Objects.equals(this.isFFAB, other.isFFAB)
                && java.util.Objects.equals(this.isEdgePop, other.isEdgePop)
                && java.util.Objects.equals(this.importRouteTarget, other.importRouteTarget)
                && java.util.Objects.equals(this.exportRouteTarget, other.exportRouteTarget)
                && java.util.Objects.equals(this.mplsLabel, other.mplsLabel)
                && java.util.Objects.equals(this.regionalOciAsn, other.regionalOciAsn)
                && java.util.Objects.equals(this.regionName, other.regionName)
                && java.util.Objects.equals(this.commonExportRT, other.commonExportRT)
                && java.util.Objects.equals(this.commonImportRT, other.commonImportRT)
                && java.util.Objects.equals(
                        this.isIngressDisintermediationEnabled,
                        other.isIngressDisintermediationEnabled)
                && java.util.Objects.equals(
                        this.isRouteUnificationEnabled, other.isRouteUnificationEnabled)
                && java.util.Objects.equals(this.transportOnlyMode, other.transportOnlyMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.isFFAB == null ? 43 : this.isFFAB.hashCode());
        result = (result * PRIME) + (this.isEdgePop == null ? 43 : this.isEdgePop.hashCode());
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
        result = (result * PRIME) + (this.regionName == null ? 43 : this.regionName.hashCode());
        result =
                (result * PRIME)
                        + (this.commonExportRT == null ? 43 : this.commonExportRT.hashCode());
        result =
                (result * PRIME)
                        + (this.commonImportRT == null ? 43 : this.commonImportRT.hashCode());
        result =
                (result * PRIME)
                        + (this.isIngressDisintermediationEnabled == null
                                ? 43
                                : this.isIngressDisintermediationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRouteUnificationEnabled == null
                                ? 43
                                : this.isRouteUnificationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.transportOnlyMode == null ? 43 : this.transportOnlyMode.hashCode());
        return result;
    }
}
