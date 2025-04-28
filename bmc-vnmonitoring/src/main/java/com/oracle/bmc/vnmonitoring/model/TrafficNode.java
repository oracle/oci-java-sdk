/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the configuration of the OCI entity that represents a traffic node in {@code
 * PathAnalysisResult}. <br>
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
        defaultImpl = TrafficNode.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VisibleTrafficNode.class,
            name = "VISIBLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AccessDeniedTrafficNode.class,
            name = "ACCESS_DENIED")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class TrafficNode extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "egressTraffic",
        "nextHopRoutingAction",
        "egressSecurityAction",
        "ingressSecurityAction"
    })
    protected TrafficNode(
            EgressTrafficSpec egressTraffic,
            RoutingAction nextHopRoutingAction,
            SecurityAction egressSecurityAction,
            SecurityAction ingressSecurityAction) {
        super();
        this.egressTraffic = egressTraffic;
        this.nextHopRoutingAction = nextHopRoutingAction;
        this.egressSecurityAction = egressSecurityAction;
        this.ingressSecurityAction = ingressSecurityAction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("egressTraffic")
    private final EgressTrafficSpec egressTraffic;

    public EgressTrafficSpec getEgressTraffic() {
        return egressTraffic;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nextHopRoutingAction")
    private final RoutingAction nextHopRoutingAction;

    public RoutingAction getNextHopRoutingAction() {
        return nextHopRoutingAction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("egressSecurityAction")
    private final SecurityAction egressSecurityAction;

    public SecurityAction getEgressSecurityAction() {
        return egressSecurityAction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ingressSecurityAction")
    private final SecurityAction ingressSecurityAction;

    public SecurityAction getIngressSecurityAction() {
        return ingressSecurityAction;
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
        sb.append("TrafficNode(");
        sb.append("super=").append(super.toString());
        sb.append("egressTraffic=").append(String.valueOf(this.egressTraffic));
        sb.append(", nextHopRoutingAction=").append(String.valueOf(this.nextHopRoutingAction));
        sb.append(", egressSecurityAction=").append(String.valueOf(this.egressSecurityAction));
        sb.append(", ingressSecurityAction=").append(String.valueOf(this.ingressSecurityAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrafficNode)) {
            return false;
        }

        TrafficNode other = (TrafficNode) o;
        return java.util.Objects.equals(this.egressTraffic, other.egressTraffic)
                && java.util.Objects.equals(this.nextHopRoutingAction, other.nextHopRoutingAction)
                && java.util.Objects.equals(this.egressSecurityAction, other.egressSecurityAction)
                && java.util.Objects.equals(this.ingressSecurityAction, other.ingressSecurityAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.egressTraffic == null ? 43 : this.egressTraffic.hashCode());
        result =
                (result * PRIME)
                        + (this.nextHopRoutingAction == null
                                ? 43
                                : this.nextHopRoutingAction.hashCode());
        result =
                (result * PRIME)
                        + (this.egressSecurityAction == null
                                ? 43
                                : this.egressSecurityAction.hashCode());
        result =
                (result * PRIME)
                        + (this.ingressSecurityAction == null
                                ? 43
                                : this.ingressSecurityAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of the {@code TrafficNode}. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Visible("VISIBLE"),
        AccessDenied("ACCESS_DENIED"),

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
