/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * Dynamic routing information for the Compute Cloud@Customer infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CccInfrastructureRoutingDynamicDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CccInfrastructureRoutingDynamicDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"peerInformation", "oracleAsn", "bgpTopology"})
    public CccInfrastructureRoutingDynamicDetails(
            java.util.List<PeerInformation> peerInformation,
            Integer oracleAsn,
            BgpTopology bgpTopology) {
        super();
        this.peerInformation = peerInformation;
        this.oracleAsn = oracleAsn;
        this.bgpTopology = bgpTopology;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of peer devices in the dynamic routing configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("peerInformation")
        private java.util.List<PeerInformation> peerInformation;

        /**
         * The list of peer devices in the dynamic routing configuration.
         *
         * @param peerInformation the value to set
         * @return this builder
         */
        public Builder peerInformation(java.util.List<PeerInformation> peerInformation) {
            this.peerInformation = peerInformation;
            this.__explicitlySet__.add("peerInformation");
            return this;
        }
        /**
         * The Oracle Autonomous System Number (ASN) to control routing and exchange information
         * within the dynamic routing configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleAsn")
        private Integer oracleAsn;

        /**
         * The Oracle Autonomous System Number (ASN) to control routing and exchange information
         * within the dynamic routing configuration.
         *
         * @param oracleAsn the value to set
         * @return this builder
         */
        public Builder oracleAsn(Integer oracleAsn) {
            this.oracleAsn = oracleAsn;
            this.__explicitlySet__.add("oracleAsn");
            return this;
        }
        /** The topology in use for the Border Gateway Protocol (BGP) configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpTopology")
        private BgpTopology bgpTopology;

        /**
         * The topology in use for the Border Gateway Protocol (BGP) configuration.
         *
         * @param bgpTopology the value to set
         * @return this builder
         */
        public Builder bgpTopology(BgpTopology bgpTopology) {
            this.bgpTopology = bgpTopology;
            this.__explicitlySet__.add("bgpTopology");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CccInfrastructureRoutingDynamicDetails build() {
            CccInfrastructureRoutingDynamicDetails model =
                    new CccInfrastructureRoutingDynamicDetails(
                            this.peerInformation, this.oracleAsn, this.bgpTopology);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CccInfrastructureRoutingDynamicDetails model) {
            if (model.wasPropertyExplicitlySet("peerInformation")) {
                this.peerInformation(model.getPeerInformation());
            }
            if (model.wasPropertyExplicitlySet("oracleAsn")) {
                this.oracleAsn(model.getOracleAsn());
            }
            if (model.wasPropertyExplicitlySet("bgpTopology")) {
                this.bgpTopology(model.getBgpTopology());
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

    /** The list of peer devices in the dynamic routing configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("peerInformation")
    private final java.util.List<PeerInformation> peerInformation;

    /**
     * The list of peer devices in the dynamic routing configuration.
     *
     * @return the value
     */
    public java.util.List<PeerInformation> getPeerInformation() {
        return peerInformation;
    }

    /**
     * The Oracle Autonomous System Number (ASN) to control routing and exchange information within
     * the dynamic routing configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleAsn")
    private final Integer oracleAsn;

    /**
     * The Oracle Autonomous System Number (ASN) to control routing and exchange information within
     * the dynamic routing configuration.
     *
     * @return the value
     */
    public Integer getOracleAsn() {
        return oracleAsn;
    }

    /** The topology in use for the Border Gateway Protocol (BGP) configuration. */
    public enum BgpTopology implements com.oracle.bmc.http.internal.BmcEnum {
        Triangle("TRIANGLE"),
        Square("SQUARE"),
        Mesh("MESH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BgpTopology.class);

        private final String value;
        private static java.util.Map<String, BgpTopology> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpTopology v : BgpTopology.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BgpTopology(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpTopology create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BgpTopology', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The topology in use for the Border Gateway Protocol (BGP) configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpTopology")
    private final BgpTopology bgpTopology;

    /**
     * The topology in use for the Border Gateway Protocol (BGP) configuration.
     *
     * @return the value
     */
    public BgpTopology getBgpTopology() {
        return bgpTopology;
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
        sb.append("CccInfrastructureRoutingDynamicDetails(");
        sb.append("super=").append(super.toString());
        sb.append("peerInformation=").append(String.valueOf(this.peerInformation));
        sb.append(", oracleAsn=").append(String.valueOf(this.oracleAsn));
        sb.append(", bgpTopology=").append(String.valueOf(this.bgpTopology));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CccInfrastructureRoutingDynamicDetails)) {
            return false;
        }

        CccInfrastructureRoutingDynamicDetails other = (CccInfrastructureRoutingDynamicDetails) o;
        return java.util.Objects.equals(this.peerInformation, other.peerInformation)
                && java.util.Objects.equals(this.oracleAsn, other.oracleAsn)
                && java.util.Objects.equals(this.bgpTopology, other.bgpTopology)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.peerInformation == null ? 43 : this.peerInformation.hashCode());
        result = (result * PRIME) + (this.oracleAsn == null ? 43 : this.oracleAsn.hashCode());
        result = (result * PRIME) + (this.bgpTopology == null ? 43 : this.bgpTopology.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
