/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * The create details for tunnel configuration. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "tunnelType",
        defaultImpl = CreateFlexTunnelConfigurationDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateGreFlexTunnelConfigurationDetails.class,
            name = "GRE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateFlexTunnelConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"customerTunnelIp", "oracleTunnelIp", "bgpSession"})
    protected CreateFlexTunnelConfigurationDetails(
            String customerTunnelIp,
            String oracleTunnelIp,
            CreateFlexTunnelBgpSessionDetails bgpSession) {
        super();
        this.customerTunnelIp = customerTunnelIp;
        this.oracleTunnelIp = oracleTunnelIp;
        this.bgpSession = bgpSession;
    }

    /** IP address of your end of the tunnel. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerTunnelIp")
    private final String customerTunnelIp;

    /**
     * IP address of your end of the tunnel.
     *
     * @return the value
     */
    public String getCustomerTunnelIp() {
        return customerTunnelIp;
    }

    /** IP address of the oracle end of the tunnel. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleTunnelIp")
    private final String oracleTunnelIp;

    /**
     * IP address of the oracle end of the tunnel.
     *
     * @return the value
     */
    public String getOracleTunnelIp() {
        return oracleTunnelIp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bgpSession")
    private final CreateFlexTunnelBgpSessionDetails bgpSession;

    public CreateFlexTunnelBgpSessionDetails getBgpSession() {
        return bgpSession;
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
        sb.append("CreateFlexTunnelConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("customerTunnelIp=").append(String.valueOf(this.customerTunnelIp));
        sb.append(", oracleTunnelIp=").append(String.valueOf(this.oracleTunnelIp));
        sb.append(", bgpSession=").append(String.valueOf(this.bgpSession));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFlexTunnelConfigurationDetails)) {
            return false;
        }

        CreateFlexTunnelConfigurationDetails other = (CreateFlexTunnelConfigurationDetails) o;
        return java.util.Objects.equals(this.customerTunnelIp, other.customerTunnelIp)
                && java.util.Objects.equals(this.oracleTunnelIp, other.oracleTunnelIp)
                && java.util.Objects.equals(this.bgpSession, other.bgpSession)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.customerTunnelIp == null ? 43 : this.customerTunnelIp.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleTunnelIp == null ? 43 : this.oracleTunnelIp.hashCode());
        result = (result * PRIME) + (this.bgpSession == null ? 43 : this.bgpSession.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The tunnel encapsulation protocol. */
    public enum TunnelType implements com.oracle.bmc.http.internal.BmcEnum {
        Gre("GRE"),
        ;

        private final String value;
        private static java.util.Map<String, TunnelType> map;

        static {
            map = new java.util.HashMap<>();
            for (TunnelType v : TunnelType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TunnelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TunnelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TunnelType: " + key);
        }
    };
}
