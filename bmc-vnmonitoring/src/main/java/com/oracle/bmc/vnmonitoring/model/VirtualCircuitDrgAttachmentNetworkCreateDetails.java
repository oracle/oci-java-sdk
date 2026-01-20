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
        builder = VirtualCircuitDrgAttachmentNetworkCreateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualCircuitDrgAttachmentNetworkCreateDetails
        extends DrgAttachmentNetworkCreateDetails {
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compartment that contains the Virtual Circuit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compartment that contains the Virtual Circuit.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The BGP ASN to use for the Virtual Circuit's route target */
        @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
        private String regionalOciAsn;

        /**
         * The BGP ASN to use for the Virtual Circuit's route target
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
         * Whether the Fast Connect exists through an edge pop region.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEdgePop")
        private Boolean isEdgePop;

        /**
         * Whether the Fast Connect exists through an edge pop region.
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
        /**
         * Determines Throughput capacity of Virtual Circuit.
         *
         * <p>Example: {@code 400G}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("throughput")
        private Throughput throughput;

        /**
         * Determines Throughput capacity of Virtual Circuit.
         *
         * <p>Example: {@code 400G}
         *
         * @param throughput the value to set
         * @return this builder
         */
        public Builder throughput(Throughput throughput) {
            this.throughput = throughput;
            this.__explicitlySet__.add("throughput");
            return this;
        }
        /**
         * Determines whether the ingress traffic/routes through this attachment are
         * disintermediated or not.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isWhitelistedForIngressDisintermediationC3")
        private Boolean isWhitelistedForIngressDisintermediationC3;

        /**
         * Determines whether the ingress traffic/routes through this attachment are
         * disintermediated or not.
         *
         * <p>Example: {@code true}
         *
         * @param isWhitelistedForIngressDisintermediationC3 the value to set
         * @return this builder
         */
        public Builder isWhitelistedForIngressDisintermediationC3(
                Boolean isWhitelistedForIngressDisintermediationC3) {
            this.isWhitelistedForIngressDisintermediationC3 =
                    isWhitelistedForIngressDisintermediationC3;
            this.__explicitlySet__.add("isWhitelistedForIngressDisintermediationC3");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuitDrgAttachmentNetworkCreateDetails build() {
            VirtualCircuitDrgAttachmentNetworkCreateDetails model =
                    new VirtualCircuitDrgAttachmentNetworkCreateDetails(
                            this.id,
                            this.compartmentId,
                            this.regionalOciAsn,
                            this.isEdgePop,
                            this.regionName,
                            this.transportOnlyMode,
                            this.throughput,
                            this.isWhitelistedForIngressDisintermediationC3);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitDrgAttachmentNetworkCreateDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("throughput")) {
                this.throughput(model.getThroughput());
            }
            if (model.wasPropertyExplicitlySet("isWhitelistedForIngressDisintermediationC3")) {
                this.isWhitelistedForIngressDisintermediationC3(
                        model.getIsWhitelistedForIngressDisintermediationC3());
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
    public VirtualCircuitDrgAttachmentNetworkCreateDetails(
            String id,
            String compartmentId,
            String regionalOciAsn,
            Boolean isEdgePop,
            String regionName,
            Boolean transportOnlyMode,
            Throughput throughput,
            Boolean isWhitelistedForIngressDisintermediationC3) {
        super(id);
        this.compartmentId = compartmentId;
        this.regionalOciAsn = regionalOciAsn;
        this.isEdgePop = isEdgePop;
        this.regionName = regionName;
        this.transportOnlyMode = transportOnlyMode;
        this.throughput = throughput;
        this.isWhitelistedForIngressDisintermediationC3 =
                isWhitelistedForIngressDisintermediationC3;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * compartment that contains the Virtual Circuit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * compartment that contains the Virtual Circuit.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The BGP ASN to use for the Virtual Circuit's route target */
    @com.fasterxml.jackson.annotation.JsonProperty("regionalOciAsn")
    private final String regionalOciAsn;

    /**
     * The BGP ASN to use for the Virtual Circuit's route target
     *
     * @return the value
     */
    public String getRegionalOciAsn() {
        return regionalOciAsn;
    }

    /**
     * Whether the Fast Connect exists through an edge pop region.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEdgePop")
    private final Boolean isEdgePop;

    /**
     * Whether the Fast Connect exists through an edge pop region.
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

    /**
     * Determines Throughput capacity of Virtual Circuit.
     *
     * <p>Example: {@code 400G}
     */
    public enum Throughput implements com.oracle.bmc.http.internal.BmcEnum {
        _100M("100M"),
        _200M("200M"),
        _500M("500M"),
        _1G("1G"),
        _2G("2G"),
        _3G("3G"),
        _4G("4G"),
        _5G("5G"),
        _10G("10G"),
        _20G("20G"),
        _30G("30G"),
        _40G("40G"),
        _50G("50G"),
        _100G("100G"),
        _200G("200G"),
        _400G("400G"),
        _500G("500G"),
        ;

        private final String value;
        private static java.util.Map<String, Throughput> map;

        static {
            map = new java.util.HashMap<>();
            for (Throughput v : Throughput.values()) {
                map.put(v.getValue(), v);
            }
        }

        Throughput(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Throughput create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Throughput: " + key);
        }
    };
    /**
     * Determines Throughput capacity of Virtual Circuit.
     *
     * <p>Example: {@code 400G}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("throughput")
    private final Throughput throughput;

    /**
     * Determines Throughput capacity of Virtual Circuit.
     *
     * <p>Example: {@code 400G}
     *
     * @return the value
     */
    public Throughput getThroughput() {
        return throughput;
    }

    /**
     * Determines whether the ingress traffic/routes through this attachment are disintermediated or
     * not.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isWhitelistedForIngressDisintermediationC3")
    private final Boolean isWhitelistedForIngressDisintermediationC3;

    /**
     * Determines whether the ingress traffic/routes through this attachment are disintermediated or
     * not.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsWhitelistedForIngressDisintermediationC3() {
        return isWhitelistedForIngressDisintermediationC3;
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
        sb.append("VirtualCircuitDrgAttachmentNetworkCreateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", regionalOciAsn=").append(String.valueOf(this.regionalOciAsn));
        sb.append(", isEdgePop=").append(String.valueOf(this.isEdgePop));
        sb.append(", regionName=").append(String.valueOf(this.regionName));
        sb.append(", transportOnlyMode=").append(String.valueOf(this.transportOnlyMode));
        sb.append(", throughput=").append(String.valueOf(this.throughput));
        sb.append(", isWhitelistedForIngressDisintermediationC3=")
                .append(String.valueOf(this.isWhitelistedForIngressDisintermediationC3));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCircuitDrgAttachmentNetworkCreateDetails)) {
            return false;
        }

        VirtualCircuitDrgAttachmentNetworkCreateDetails other =
                (VirtualCircuitDrgAttachmentNetworkCreateDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.regionalOciAsn, other.regionalOciAsn)
                && java.util.Objects.equals(this.isEdgePop, other.isEdgePop)
                && java.util.Objects.equals(this.regionName, other.regionName)
                && java.util.Objects.equals(this.transportOnlyMode, other.transportOnlyMode)
                && java.util.Objects.equals(this.throughput, other.throughput)
                && java.util.Objects.equals(
                        this.isWhitelistedForIngressDisintermediationC3,
                        other.isWhitelistedForIngressDisintermediationC3)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.regionalOciAsn == null ? 43 : this.regionalOciAsn.hashCode());
        result = (result * PRIME) + (this.isEdgePop == null ? 43 : this.isEdgePop.hashCode());
        result = (result * PRIME) + (this.regionName == null ? 43 : this.regionName.hashCode());
        result =
                (result * PRIME)
                        + (this.transportOnlyMode == null ? 43 : this.transportOnlyMode.hashCode());
        result = (result * PRIME) + (this.throughput == null ? 43 : this.throughput.hashCode());
        result =
                (result * PRIME)
                        + (this.isWhitelistedForIngressDisintermediationC3 == null
                                ? 43
                                : this.isWhitelistedForIngressDisintermediationC3.hashCode());
        return result;
    }
}
