/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "method",
    defaultImpl = LoadBalancingMethod.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RoundRobinLoadBalancingMethod.class,
        name = "ROUND_ROBIN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StickyCookieLoadBalancingMethod.class,
        name = "STICKY_COOKIE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = IPHashLoadBalancingMethod.class,
        name = "IP_HASH"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LoadBalancingMethod extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected LoadBalancingMethod() {
        super();
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LoadBalancingMethod(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadBalancingMethod)) {
            return false;
        }

        LoadBalancingMethod other = (LoadBalancingMethod) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Load balancing methods are algorithms used to efficiently distribute traffic among origin servers.
     * <p>
     * - **[IP_HASH](https://docs.cloud.oracle.com/iaas/api/#/en/waas/latest/datatypes/IPHashLoadBalancingMethod):** All the incoming requests from the same client IP address should go to the same content origination server. IP_HASH load balancing method uses origin weights when choosing which origin should the hash be assigned to initially.
     * <p>
     * - **[ROUND_ROBIN](https://docs.cloud.oracle.com/iaas/api/#/en/waas/latest/datatypes/RoundRobinLoadBalancingMethod):** Forwards requests sequentially to the available origin servers. The first request - to the first origin server, the second request - to the next origin server, and so on. After it sends a request to the last origin server, it starts again with the first origin server. When using weights on origins, Weighted Round Robin assigns more requests to origins with a greater weight. Over a period of time, origins will receive a number of requests in proportion to their weight.
     * <p>
     * - **[STICKY_COOKIE](https://docs.cloud.oracle.com/iaas/api/#/en/waas/latest/datatypes/StickyCookieLoadBalancingMethod):** Adds a session cookie to the first response from the origin server and identifies the server that sent the response. The client's next request contains the cookie value, and nginx routes the request to the origin server that responded to the first request. STICKY_COOKIE load balancing method falls back to Round Robin for the first request.
     **/
    public enum Method {
        IpHash("IP_HASH"),
        RoundRobin("ROUND_ROBIN"),
        StickyCookie("STICKY_COOKIE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Method.class);

        private final String value;
        private static java.util.Map<String, Method> map;

        static {
            map = new java.util.HashMap<>();
            for (Method v : Method.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Method(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Method create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Method', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
