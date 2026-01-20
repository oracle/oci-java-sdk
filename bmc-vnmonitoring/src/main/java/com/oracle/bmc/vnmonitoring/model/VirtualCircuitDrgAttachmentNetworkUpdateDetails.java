/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Specifies the update details for the virtual circuit attachment. <br>
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
        builder = VirtualCircuitDrgAttachmentNetworkUpdateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualCircuitDrgAttachmentNetworkUpdateDetails
        extends DrgAttachmentNetworkUpdateDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The BGP ASN to use for the virtual circuit's route target. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
        private String regionalOciAsn;

        /**
         * The BGP ASN to use for the virtual circuit's route target.
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
         * Indicates whether FastConnect extends through an edge POP region.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEdgePop")
        private Boolean isEdgePop;

        /**
         * Indicates whether FastConnect extends through an edge POP region.
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
        /** The OCI region name */
        @com.fasterxml.jackson.annotation.JsonProperty("regionName")
        private String regionName;

        /**
         * The OCI region name
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
         * Boolean flag that determines wether all traffic over the VCs is encrypted.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportOnlyMode")
        private Boolean transportOnlyMode;

        /**
         * Boolean flag that determines wether all traffic over the VCs is encrypted.
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

        public VirtualCircuitDrgAttachmentNetworkUpdateDetails build() {
            VirtualCircuitDrgAttachmentNetworkUpdateDetails model =
                    new VirtualCircuitDrgAttachmentNetworkUpdateDetails(
                            this.isFFAB,
                            this.regionalOciAsn,
                            this.isEdgePop,
                            this.regionName,
                            this.transportOnlyMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitDrgAttachmentNetworkUpdateDetails model) {
            if (model.wasPropertyExplicitlySet("isFFAB")) {
                this.isFFAB(model.getIsFFAB());
            }
            if (model.wasPropertyExplicitlySet("regionalOciAsn")) {
                this.regionalOciAsn(model.getRegionalOciAsn());
            }
            if (model.wasPropertyExplicitlySet("isEdgePop")) {
                this.isEdgePop(model.getIsEdgePop());
            }
            if (model.wasPropertyExplicitlySet("regionName")) {
                this.regionName(model.getRegionName());
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
    public VirtualCircuitDrgAttachmentNetworkUpdateDetails(
            Boolean isFFAB,
            String regionalOciAsn,
            Boolean isEdgePop,
            String regionName,
            Boolean transportOnlyMode) {
        super();
        this.isFFAB = isFFAB;
        this.regionalOciAsn = regionalOciAsn;
        this.isEdgePop = isEdgePop;
        this.regionName = regionName;
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

    /** The BGP ASN to use for the virtual circuit's route target. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
    private final String regionalOciAsn;

    /**
     * The BGP ASN to use for the virtual circuit's route target.
     *
     * @return the value
     */
    public String getRegionalOciAsn() {
        return regionalOciAsn;
    }

    /**
     * Indicates whether FastConnect extends through an edge POP region.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEdgePop")
    private final Boolean isEdgePop;

    /**
     * Indicates whether FastConnect extends through an edge POP region.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsEdgePop() {
        return isEdgePop;
    }

    /** The OCI region name */
    @com.fasterxml.jackson.annotation.JsonProperty("regionName")
    private final String regionName;

    /**
     * The OCI region name
     *
     * @return the value
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Boolean flag that determines wether all traffic over the VCs is encrypted.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportOnlyMode")
    private final Boolean transportOnlyMode;

    /**
     * Boolean flag that determines wether all traffic over the VCs is encrypted.
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
        sb.append("VirtualCircuitDrgAttachmentNetworkUpdateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isFFAB=").append(String.valueOf(this.isFFAB));
        sb.append(", regionalOciAsn=").append(String.valueOf(this.regionalOciAsn));
        sb.append(", isEdgePop=").append(String.valueOf(this.isEdgePop));
        sb.append(", regionName=").append(String.valueOf(this.regionName));
        sb.append(", transportOnlyMode=").append(String.valueOf(this.transportOnlyMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCircuitDrgAttachmentNetworkUpdateDetails)) {
            return false;
        }

        VirtualCircuitDrgAttachmentNetworkUpdateDetails other =
                (VirtualCircuitDrgAttachmentNetworkUpdateDetails) o;
        return java.util.Objects.equals(this.isFFAB, other.isFFAB)
                && java.util.Objects.equals(this.regionalOciAsn, other.regionalOciAsn)
                && java.util.Objects.equals(this.isEdgePop, other.isEdgePop)
                && java.util.Objects.equals(this.regionName, other.regionName)
                && java.util.Objects.equals(this.transportOnlyMode, other.transportOnlyMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.isFFAB == null ? 43 : this.isFFAB.hashCode());
        result =
                (result * PRIME)
                        + (this.regionalOciAsn == null ? 43 : this.regionalOciAsn.hashCode());
        result = (result * PRIME) + (this.isEdgePop == null ? 43 : this.isEdgePop.hashCode());
        result = (result * PRIME) + (this.regionName == null ? 43 : this.regionName.hashCode());
        result =
                (result * PRIME)
                        + (this.transportOnlyMode == null ? 43 : this.transportOnlyMode.hashCode());
        return result;
    }
}
