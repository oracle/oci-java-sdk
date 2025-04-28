/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Information describing a source or destination in a {@code PathAnalyzerTest} resource. <br>
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
        property = "type",
        defaultImpl = Endpoint.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NetworkLoadBalancerListenerEndpoint.class,
            name = "NETWORK_LOAD_BALANCER_LISTENER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ComputeInstanceEndpoint.class,
            name = "COMPUTE_INSTANCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NetworkLoadBalancerEndpoint.class,
            name = "NETWORK_LOAD_BALANCER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OnPremEndpoint.class,
            name = "ON_PREM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LoadBalancerEndpoint.class,
            name = "LOAD_BALANCER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = VnicEndpoint.class, name = "VNIC"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = IpAddressEndpoint.class,
            name = "IP_ADDRESS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = VlanEndpoint.class, name = "VLAN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SubnetEndpoint.class,
            name = "SUBNET"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = LoadBalancerListenerEndpoint.class,
            name = "LOAD_BALANCER_LISTENER")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class Endpoint extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected Endpoint() {
        super();
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
        sb.append("Endpoint(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Endpoint)) {
            return false;
        }

        Endpoint other = (Endpoint) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the {@code Endpoint}. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        IpAddress("IP_ADDRESS"),
        Subnet("SUBNET"),
        ComputeInstance("COMPUTE_INSTANCE"),
        Vnic("VNIC"),
        LoadBalancer("LOAD_BALANCER"),
        LoadBalancerListener("LOAD_BALANCER_LISTENER"),
        NetworkLoadBalancer("NETWORK_LOAD_BALANCER"),
        NetworkLoadBalancerListener("NETWORK_LOAD_BALANCER_LISTENER"),
        Vlan("VLAN"),
        OnPrem("ON_PREM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
