/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Rule for routing incoming virtual service traffic to a version.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = VirtualServiceTrafficRouteRule.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TcpVirtualServiceTrafficRouteRule.class,
        name = "TCP"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TlsPassthroughVirtualServiceTrafficRouteRule.class,
        name = "TLS_PASSTHROUGH"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HttpVirtualServiceTrafficRouteRule.class,
        name = "HTTP"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class VirtualServiceTrafficRouteRule {
    @Deprecated
    @java.beans.ConstructorProperties({"destinations"})
    protected VirtualServiceTrafficRouteRule(
            java.util.List<VirtualDeploymentTrafficRuleTarget> destinations) {
        super();
        this.destinations = destinations;
    }

    /**
     * The destination of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinations")
    private final java.util.List<VirtualDeploymentTrafficRuleTarget> destinations;

    public java.util.List<VirtualDeploymentTrafficRuleTarget> getDestinations() {
        return destinations;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VirtualServiceTrafficRouteRule(");
        sb.append("destinations=").append(String.valueOf(this.destinations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualServiceTrafficRouteRule)) {
            return false;
        }

        VirtualServiceTrafficRouteRule other = (VirtualServiceTrafficRouteRule) o;
        return java.util.Objects.equals(this.destinations, other.destinations);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.destinations == null ? 43 : this.destinations.hashCode());
        return result;
    }

    /**
     * Type of protocol.
     **/
    public enum Type {
        Http("HTTP"),
        TlsPassthrough("TLS_PASSTHROUGH"),
        Tcp("TCP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
