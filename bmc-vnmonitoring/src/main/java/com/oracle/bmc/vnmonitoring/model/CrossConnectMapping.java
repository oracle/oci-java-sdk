/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect. Each {@link VirtualCircuit} runs on one or
 * more cross-connects or cross-connect groups. A {@code CrossConnectMapping} contains the
 * properties for an individual cross-connect or cross-connect group associated with a given virtual
 * circuit.
 *
 * <p>The mapping includes information about the cross-connect or cross-connect group, the VLAN, and
 * the BGP peering session.
 *
 * <p>If you're a customer who is colocated with Oracle, that means you own both the virtual circuit
 * and the physical connection it runs on (cross-connect or cross-connect group), so you specify all
 * the information in the mapping. There's one exception: for a public virtual circuit, Oracle
 * specifies the BGP IPv4 addresses.
 *
 * <p>If you're a provider, then you own the physical connection that the customer's virtual circuit
 * runs on, so you contribute information about the cross-connect or cross-connect group and VLAN.
 *
 * <p>Who specifies the BGP peering information in the case of customer connection via provider? If
 * the BGP session goes from Oracle to the provider's edge router, then the provider also specifies
 * the BGP peering information. If the BGP session instead goes from Oracle to the customer's edge
 * router, then the customer specifies the BGP peering information. There's one exception: for a
 * public virtual circuit, Oracle specifies the BGP IPv4 addresses. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CrossConnectMapping.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CrossConnectMapping
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bgpMd5AuthKey",
        "crossConnectOrCrossConnectGroupId",
        "customerBgpPeeringIp",
        "oracleBgpPeeringIp",
        "vlan"
    })
    public CrossConnectMapping(
            String bgpMd5AuthKey,
            String crossConnectOrCrossConnectGroupId,
            String customerBgpPeeringIp,
            String oracleBgpPeeringIp,
            Integer vlan) {
        super();
        this.bgpMd5AuthKey = bgpMd5AuthKey;
        this.crossConnectOrCrossConnectGroupId = crossConnectOrCrossConnectGroupId;
        this.customerBgpPeeringIp = customerBgpPeeringIp;
        this.oracleBgpPeeringIp = oracleBgpPeeringIp;
        this.vlan = vlan;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key for BGP MD5 authentication. Only applicable if your system requires MD5
         * authentication. If empty or not set (null), that means you don't use BGP MD5
         * authentication.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bgpMd5AuthKey")
        private String bgpMd5AuthKey;

        /**
         * The key for BGP MD5 authentication. Only applicable if your system requires MD5
         * authentication. If empty or not set (null), that means you don't use BGP MD5
         * authentication.
         *
         * @param bgpMd5AuthKey the value to set
         * @return this builder
         */
        public Builder bgpMd5AuthKey(String bgpMd5AuthKey) {
            this.bgpMd5AuthKey = bgpMd5AuthKey;
            this.__explicitlySet__.add("bgpMd5AuthKey");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect or cross-connect group for this mapping. Specified by the owner of
         * the cross-connect or cross-connect group (the customer if the customer is colocated with
         * Oracle, or the provider if the customer is connecting via provider).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectOrCrossConnectGroupId")
        private String crossConnectOrCrossConnectGroupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect or cross-connect group for this mapping. Specified by the owner of
         * the cross-connect or cross-connect group (the customer if the customer is colocated with
         * Oracle, or the provider if the customer is connecting via provider).
         *
         * @param crossConnectOrCrossConnectGroupId the value to set
         * @return this builder
         */
        public Builder crossConnectOrCrossConnectGroupId(String crossConnectOrCrossConnectGroupId) {
            this.crossConnectOrCrossConnectGroupId = crossConnectOrCrossConnectGroupId;
            this.__explicitlySet__.add("crossConnectOrCrossConnectGroupId");
            return this;
        }
        /**
         * The BGP IPv4 address for the router on the other end of the BGP session from Oracle.
         * Specified by the owner of that router. If the session goes from Oracle to a customer,
         * this is the BGP IPv4 address of the customer's edge router. If the session goes from
         * Oracle to a provider, this is the BGP IPv4 address of the provider's edge router. Must
         * use a /30 or /31 subnet mask.
         *
         * <p>There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
         * addresses.
         *
         * <p>Example: {@code 10.0.0.18/31}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIp")
        private String customerBgpPeeringIp;

        /**
         * The BGP IPv4 address for the router on the other end of the BGP session from Oracle.
         * Specified by the owner of that router. If the session goes from Oracle to a customer,
         * this is the BGP IPv4 address of the customer's edge router. If the session goes from
         * Oracle to a provider, this is the BGP IPv4 address of the provider's edge router. Must
         * use a /30 or /31 subnet mask.
         *
         * <p>There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
         * addresses.
         *
         * <p>Example: {@code 10.0.0.18/31}
         *
         * @param customerBgpPeeringIp the value to set
         * @return this builder
         */
        public Builder customerBgpPeeringIp(String customerBgpPeeringIp) {
            this.customerBgpPeeringIp = customerBgpPeeringIp;
            this.__explicitlySet__.add("customerBgpPeeringIp");
            return this;
        }
        /**
         * The IPv4 address for Oracle's end of the BGP session. Must use a /30 or /31 subnet mask.
         * If the session goes from Oracle to a customer's edge router, the customer specifies this
         * information. If the session goes from Oracle to a provider's edge router, the provider
         * specifies this.
         *
         * <p>There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
         * addresses.
         *
         * <p>Example: {@code 10.0.0.19/31}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIp")
        private String oracleBgpPeeringIp;

        /**
         * The IPv4 address for Oracle's end of the BGP session. Must use a /30 or /31 subnet mask.
         * If the session goes from Oracle to a customer's edge router, the customer specifies this
         * information. If the session goes from Oracle to a provider's edge router, the provider
         * specifies this.
         *
         * <p>There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
         * addresses.
         *
         * <p>Example: {@code 10.0.0.19/31}
         *
         * @param oracleBgpPeeringIp the value to set
         * @return this builder
         */
        public Builder oracleBgpPeeringIp(String oracleBgpPeeringIp) {
            this.oracleBgpPeeringIp = oracleBgpPeeringIp;
            this.__explicitlySet__.add("oracleBgpPeeringIp");
            return this;
        }
        /**
         * The number of the specific VLAN (on the cross-connect or cross-connect group) that is
         * assigned to this virtual circuit. Specified by the owner of the cross-connect or
         * cross-connect group (the customer if the customer is colocated with Oracle, or the
         * provider if the customer is connecting via provider).
         *
         * <p>Example: {@code 200}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vlan")
        private Integer vlan;

        /**
         * The number of the specific VLAN (on the cross-connect or cross-connect group) that is
         * assigned to this virtual circuit. Specified by the owner of the cross-connect or
         * cross-connect group (the customer if the customer is colocated with Oracle, or the
         * provider if the customer is connecting via provider).
         *
         * <p>Example: {@code 200}
         *
         * @param vlan the value to set
         * @return this builder
         */
        public Builder vlan(Integer vlan) {
            this.vlan = vlan;
            this.__explicitlySet__.add("vlan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectMapping build() {
            CrossConnectMapping model =
                    new CrossConnectMapping(
                            this.bgpMd5AuthKey,
                            this.crossConnectOrCrossConnectGroupId,
                            this.customerBgpPeeringIp,
                            this.oracleBgpPeeringIp,
                            this.vlan);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectMapping model) {
            if (model.wasPropertyExplicitlySet("bgpMd5AuthKey")) {
                this.bgpMd5AuthKey(model.getBgpMd5AuthKey());
            }
            if (model.wasPropertyExplicitlySet("crossConnectOrCrossConnectGroupId")) {
                this.crossConnectOrCrossConnectGroupId(
                        model.getCrossConnectOrCrossConnectGroupId());
            }
            if (model.wasPropertyExplicitlySet("customerBgpPeeringIp")) {
                this.customerBgpPeeringIp(model.getCustomerBgpPeeringIp());
            }
            if (model.wasPropertyExplicitlySet("oracleBgpPeeringIp")) {
                this.oracleBgpPeeringIp(model.getOracleBgpPeeringIp());
            }
            if (model.wasPropertyExplicitlySet("vlan")) {
                this.vlan(model.getVlan());
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
     * The key for BGP MD5 authentication. Only applicable if your system requires MD5
     * authentication. If empty or not set (null), that means you don't use BGP MD5 authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bgpMd5AuthKey")
    private final String bgpMd5AuthKey;

    /**
     * The key for BGP MD5 authentication. Only applicable if your system requires MD5
     * authentication. If empty or not set (null), that means you don't use BGP MD5 authentication.
     *
     * @return the value
     */
    public String getBgpMd5AuthKey() {
        return bgpMd5AuthKey;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect or cross-connect group for this mapping. Specified by the owner of the
     * cross-connect or cross-connect group (the customer if the customer is colocated with Oracle,
     * or the provider if the customer is connecting via provider).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectOrCrossConnectGroupId")
    private final String crossConnectOrCrossConnectGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect or cross-connect group for this mapping. Specified by the owner of the
     * cross-connect or cross-connect group (the customer if the customer is colocated with Oracle,
     * or the provider if the customer is connecting via provider).
     *
     * @return the value
     */
    public String getCrossConnectOrCrossConnectGroupId() {
        return crossConnectOrCrossConnectGroupId;
    }

    /**
     * The BGP IPv4 address for the router on the other end of the BGP session from Oracle.
     * Specified by the owner of that router. If the session goes from Oracle to a customer, this is
     * the BGP IPv4 address of the customer's edge router. If the session goes from Oracle to a
     * provider, this is the BGP IPv4 address of the provider's edge router. Must use a /30 or /31
     * subnet mask.
     *
     * <p>There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
     * addresses.
     *
     * <p>Example: {@code 10.0.0.18/31}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIp")
    private final String customerBgpPeeringIp;

    /**
     * The BGP IPv4 address for the router on the other end of the BGP session from Oracle.
     * Specified by the owner of that router. If the session goes from Oracle to a customer, this is
     * the BGP IPv4 address of the customer's edge router. If the session goes from Oracle to a
     * provider, this is the BGP IPv4 address of the provider's edge router. Must use a /30 or /31
     * subnet mask.
     *
     * <p>There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
     * addresses.
     *
     * <p>Example: {@code 10.0.0.18/31}
     *
     * @return the value
     */
    public String getCustomerBgpPeeringIp() {
        return customerBgpPeeringIp;
    }

    /**
     * The IPv4 address for Oracle's end of the BGP session. Must use a /30 or /31 subnet mask. If
     * the session goes from Oracle to a customer's edge router, the customer specifies this
     * information. If the session goes from Oracle to a provider's edge router, the provider
     * specifies this.
     *
     * <p>There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
     * addresses.
     *
     * <p>Example: {@code 10.0.0.19/31}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIp")
    private final String oracleBgpPeeringIp;

    /**
     * The IPv4 address for Oracle's end of the BGP session. Must use a /30 or /31 subnet mask. If
     * the session goes from Oracle to a customer's edge router, the customer specifies this
     * information. If the session goes from Oracle to a provider's edge router, the provider
     * specifies this.
     *
     * <p>There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
     * addresses.
     *
     * <p>Example: {@code 10.0.0.19/31}
     *
     * @return the value
     */
    public String getOracleBgpPeeringIp() {
        return oracleBgpPeeringIp;
    }

    /**
     * The number of the specific VLAN (on the cross-connect or cross-connect group) that is
     * assigned to this virtual circuit. Specified by the owner of the cross-connect or
     * cross-connect group (the customer if the customer is colocated with Oracle, or the provider
     * if the customer is connecting via provider).
     *
     * <p>Example: {@code 200}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vlan")
    private final Integer vlan;

    /**
     * The number of the specific VLAN (on the cross-connect or cross-connect group) that is
     * assigned to this virtual circuit. Specified by the owner of the cross-connect or
     * cross-connect group (the customer if the customer is colocated with Oracle, or the provider
     * if the customer is connecting via provider).
     *
     * <p>Example: {@code 200}
     *
     * @return the value
     */
    public Integer getVlan() {
        return vlan;
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
        sb.append("CrossConnectMapping(");
        sb.append("super=").append(super.toString());
        sb.append("bgpMd5AuthKey=").append(String.valueOf(this.bgpMd5AuthKey));
        sb.append(", crossConnectOrCrossConnectGroupId=")
                .append(String.valueOf(this.crossConnectOrCrossConnectGroupId));
        sb.append(", customerBgpPeeringIp=").append(String.valueOf(this.customerBgpPeeringIp));
        sb.append(", oracleBgpPeeringIp=").append(String.valueOf(this.oracleBgpPeeringIp));
        sb.append(", vlan=").append(String.valueOf(this.vlan));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrossConnectMapping)) {
            return false;
        }

        CrossConnectMapping other = (CrossConnectMapping) o;
        return java.util.Objects.equals(this.bgpMd5AuthKey, other.bgpMd5AuthKey)
                && java.util.Objects.equals(
                        this.crossConnectOrCrossConnectGroupId,
                        other.crossConnectOrCrossConnectGroupId)
                && java.util.Objects.equals(this.customerBgpPeeringIp, other.customerBgpPeeringIp)
                && java.util.Objects.equals(this.oracleBgpPeeringIp, other.oracleBgpPeeringIp)
                && java.util.Objects.equals(this.vlan, other.vlan)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bgpMd5AuthKey == null ? 43 : this.bgpMd5AuthKey.hashCode());
        result =
                (result * PRIME)
                        + (this.crossConnectOrCrossConnectGroupId == null
                                ? 43
                                : this.crossConnectOrCrossConnectGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.customerBgpPeeringIp == null
                                ? 43
                                : this.customerBgpPeeringIp.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleBgpPeeringIp == null
                                ? 43
                                : this.oracleBgpPeeringIp.hashCode());
        result = (result * PRIME) + (this.vlan == null ? 43 : this.vlan.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
