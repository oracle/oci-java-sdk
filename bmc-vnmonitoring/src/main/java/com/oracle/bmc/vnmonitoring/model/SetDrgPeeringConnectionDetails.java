/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * <br>
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
        builder = SetDrgPeeringConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SetDrgPeeringConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "drgId",
        "peerRpcRouteTarget",
        "peerRegionName",
        "peerIngressVIP"
    })
    public SetDrgPeeringConnectionDetails(
            String drgId, String peerRpcRouteTarget, String peerRegionName, String peerIngressVIP) {
        super();
        this.drgId = drgId;
        this.peerRpcRouteTarget = peerRpcRouteTarget;
        this.peerRegionName = peerRegionName;
        this.peerIngressVIP = peerIngressVIP;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DRG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DRG.
         *
         * @param drgId the value to set
         * @return this builder
         */
        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }
        /** The string in the form ASN:rpc_attachment_mplsLabel. */
        @com.fasterxml.jackson.annotation.JsonProperty("peerRpcRouteTarget")
        private String peerRpcRouteTarget;

        /**
         * The string in the form ASN:rpc_attachment_mplsLabel.
         *
         * @param peerRpcRouteTarget the value to set
         * @return this builder
         */
        public Builder peerRpcRouteTarget(String peerRpcRouteTarget) {
            this.peerRpcRouteTarget = peerRpcRouteTarget;
            this.__explicitlySet__.add("peerRpcRouteTarget");
            return this;
        }
        /** OCI region name to include in the routeData */
        @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
        private String peerRegionName;

        /**
         * OCI region name to include in the routeData
         *
         * @param peerRegionName the value to set
         * @return this builder
         */
        public Builder peerRegionName(String peerRegionName) {
            this.peerRegionName = peerRegionName;
            this.__explicitlySet__.add("peerRegionName");
            return this;
        }
        /** ingress VIP of the peered DRG */
        @com.fasterxml.jackson.annotation.JsonProperty("peerIngressVIP")
        private String peerIngressVIP;

        /**
         * ingress VIP of the peered DRG
         *
         * @param peerIngressVIP the value to set
         * @return this builder
         */
        public Builder peerIngressVIP(String peerIngressVIP) {
            this.peerIngressVIP = peerIngressVIP;
            this.__explicitlySet__.add("peerIngressVIP");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SetDrgPeeringConnectionDetails build() {
            SetDrgPeeringConnectionDetails model =
                    new SetDrgPeeringConnectionDetails(
                            this.drgId,
                            this.peerRpcRouteTarget,
                            this.peerRegionName,
                            this.peerIngressVIP);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SetDrgPeeringConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("drgId")) {
                this.drgId(model.getDrgId());
            }
            if (model.wasPropertyExplicitlySet("peerRpcRouteTarget")) {
                this.peerRpcRouteTarget(model.getPeerRpcRouteTarget());
            }
            if (model.wasPropertyExplicitlySet("peerRegionName")) {
                this.peerRegionName(model.getPeerRegionName());
            }
            if (model.wasPropertyExplicitlySet("peerIngressVIP")) {
                this.peerIngressVIP(model.getPeerIngressVIP());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    private final String drgId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     *
     * @return the value
     */
    public String getDrgId() {
        return drgId;
    }

    /** The string in the form ASN:rpc_attachment_mplsLabel. */
    @com.fasterxml.jackson.annotation.JsonProperty("peerRpcRouteTarget")
    private final String peerRpcRouteTarget;

    /**
     * The string in the form ASN:rpc_attachment_mplsLabel.
     *
     * @return the value
     */
    public String getPeerRpcRouteTarget() {
        return peerRpcRouteTarget;
    }

    /** OCI region name to include in the routeData */
    @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
    private final String peerRegionName;

    /**
     * OCI region name to include in the routeData
     *
     * @return the value
     */
    public String getPeerRegionName() {
        return peerRegionName;
    }

    /** ingress VIP of the peered DRG */
    @com.fasterxml.jackson.annotation.JsonProperty("peerIngressVIP")
    private final String peerIngressVIP;

    /**
     * ingress VIP of the peered DRG
     *
     * @return the value
     */
    public String getPeerIngressVIP() {
        return peerIngressVIP;
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
        sb.append("SetDrgPeeringConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("drgId=").append(String.valueOf(this.drgId));
        sb.append(", peerRpcRouteTarget=").append(String.valueOf(this.peerRpcRouteTarget));
        sb.append(", peerRegionName=").append(String.valueOf(this.peerRegionName));
        sb.append(", peerIngressVIP=").append(String.valueOf(this.peerIngressVIP));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetDrgPeeringConnectionDetails)) {
            return false;
        }

        SetDrgPeeringConnectionDetails other = (SetDrgPeeringConnectionDetails) o;
        return java.util.Objects.equals(this.drgId, other.drgId)
                && java.util.Objects.equals(this.peerRpcRouteTarget, other.peerRpcRouteTarget)
                && java.util.Objects.equals(this.peerRegionName, other.peerRegionName)
                && java.util.Objects.equals(this.peerIngressVIP, other.peerIngressVIP)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.drgId == null ? 43 : this.drgId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerRpcRouteTarget == null
                                ? 43
                                : this.peerRpcRouteTarget.hashCode());
        result =
                (result * PRIME)
                        + (this.peerRegionName == null ? 43 : this.peerRegionName.hashCode());
        result =
                (result * PRIME)
                        + (this.peerIngressVIP == null ? 43 : this.peerIngressVIP.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
