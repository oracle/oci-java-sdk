/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Rule for routing incoming ingress gateway traffic to a virtual service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = IngressGatewayTrafficRouteRuleDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TlsPassthroughIngressGatewayTrafficRouteRuleDetails.class,
            name = "TLS_PASSTHROUGH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TcpIngressGatewayTrafficRouteRuleDetails.class,
            name = "TCP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpIngressGatewayTrafficRouteRuleDetails.class,
            name = "HTTP")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class IngressGatewayTrafficRouteRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ingressGatewayHost", "destinations"})
    protected IngressGatewayTrafficRouteRuleDetails(
            IngressGatewayHostRef ingressGatewayHost,
            java.util.List<VirtualServiceTrafficRuleTargetDetails> destinations) {
        super();
        this.ingressGatewayHost = ingressGatewayHost;
        this.destinations = destinations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ingressGatewayHost")
    private final IngressGatewayHostRef ingressGatewayHost;

    public IngressGatewayHostRef getIngressGatewayHost() {
        return ingressGatewayHost;
    }

    /** The destination of the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinations")
    private final java.util.List<VirtualServiceTrafficRuleTargetDetails> destinations;

    /**
     * The destination of the request.
     *
     * @return the value
     */
    public java.util.List<VirtualServiceTrafficRuleTargetDetails> getDestinations() {
        return destinations;
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
        sb.append("IngressGatewayTrafficRouteRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ingressGatewayHost=").append(String.valueOf(this.ingressGatewayHost));
        sb.append(", destinations=").append(String.valueOf(this.destinations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngressGatewayTrafficRouteRuleDetails)) {
            return false;
        }

        IngressGatewayTrafficRouteRuleDetails other = (IngressGatewayTrafficRouteRuleDetails) o;
        return java.util.Objects.equals(this.ingressGatewayHost, other.ingressGatewayHost)
                && java.util.Objects.equals(this.destinations, other.destinations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ingressGatewayHost == null
                                ? 43
                                : this.ingressGatewayHost.hashCode());
        result = (result * PRIME) + (this.destinations == null ? 43 : this.destinations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of protocol. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Http("HTTP"),
        TlsPassthrough("TLS_PASSTHROUGH"),
        Tcp("TCP"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
}
