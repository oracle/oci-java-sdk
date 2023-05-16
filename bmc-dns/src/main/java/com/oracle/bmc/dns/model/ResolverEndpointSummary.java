/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An OCI DNS resolver endpoint.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "endpointType",
        defaultImpl = ResolverEndpointSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ResolverVnicEndpointSummary.class,
            name = "VNIC")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ResolverEndpointSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "forwardingAddress",
        "isForwarding",
        "isListening",
        "listeningAddress",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "self"
    })
    protected ResolverEndpointSummary(
            String name,
            String forwardingAddress,
            Boolean isForwarding,
            Boolean isListening,
            String listeningAddress,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String self) {
        super();
        this.name = name;
        this.forwardingAddress = forwardingAddress;
        this.isForwarding = isForwarding;
        this.isListening = isListening;
        this.listeningAddress = listeningAddress;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.self = self;
    }

    /** The name of the resolver endpoint. Must be unique, case-insensitive, within the resolver. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the resolver endpoint. Must be unique, case-insensitive, within the resolver.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * An IP address from which forwarded queries may be sent. For VNIC endpoints, this IP address
     * must be part of the subnet and will be assigned by the system if unspecified when
     * isForwarding is true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("forwardingAddress")
    private final String forwardingAddress;

    /**
     * An IP address from which forwarded queries may be sent. For VNIC endpoints, this IP address
     * must be part of the subnet and will be assigned by the system if unspecified when
     * isForwarding is true.
     *
     * @return the value
     */
    public String getForwardingAddress() {
        return forwardingAddress;
    }

    /** A Boolean flag indicating whether or not the resolver endpoint is for forwarding. */
    @com.fasterxml.jackson.annotation.JsonProperty("isForwarding")
    private final Boolean isForwarding;

    /**
     * A Boolean flag indicating whether or not the resolver endpoint is for forwarding.
     *
     * @return the value
     */
    public Boolean getIsForwarding() {
        return isForwarding;
    }

    /** A Boolean flag indicating whether or not the resolver endpoint is for listening. */
    @com.fasterxml.jackson.annotation.JsonProperty("isListening")
    private final Boolean isListening;

    /**
     * A Boolean flag indicating whether or not the resolver endpoint is for listening.
     *
     * @return the value
     */
    public Boolean getIsListening() {
        return isListening;
    }

    /**
     * An IP address to listen to queries on. For VNIC endpoints this IP address must be part of the
     * subnet and will be assigned by the system if unspecified when isListening is true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listeningAddress")
    private final String listeningAddress;

    /**
     * An IP address to listen to queries on. For VNIC endpoints this IP address must be part of the
     * subnet and will be assigned by the system if unspecified when isListening is true.
     *
     * @return the value
     */
    public String getListeningAddress() {
        return listeningAddress;
    }

    /**
     * The OCID of the owning compartment. This will match the resolver that the resolver endpoint
     * is under and will be updated if the resolver's compartment is changed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the owning compartment. This will match the resolver that the resolver endpoint
     * is under and will be updated if the resolver's compartment is changed.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format with a Z offset,
     * as defined by RFC 3339.
     *
     * <p>*Example:** {@code 2016-07-22T17:23:59:60Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created in "YYYY-MM-ddThh:mm:ssZ" format with a Z offset,
     * as defined by RFC 3339.
     *
     * <p>*Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the resource was last updated in "YYYY-MM-ddThh:mm:ssZ" format with a Z
     * offset, as defined by RFC 3339.
     *
     * <p>*Example:** {@code 2016-07-22T17:23:59:60Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was last updated in "YYYY-MM-ddThh:mm:ssZ" format with a Z
     * offset, as defined by RFC 3339.
     *
     * <p>*Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the resource. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),
        Failed("FAILED"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the resource.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The canonical absolute URL of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("self")
    private final String self;

    /**
     * The canonical absolute URL of the resource.
     *
     * @return the value
     */
    public String getSelf() {
        return self;
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
        sb.append("ResolverEndpointSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", forwardingAddress=").append(String.valueOf(this.forwardingAddress));
        sb.append(", isForwarding=").append(String.valueOf(this.isForwarding));
        sb.append(", isListening=").append(String.valueOf(this.isListening));
        sb.append(", listeningAddress=").append(String.valueOf(this.listeningAddress));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", self=").append(String.valueOf(this.self));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResolverEndpointSummary)) {
            return false;
        }

        ResolverEndpointSummary other = (ResolverEndpointSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.forwardingAddress, other.forwardingAddress)
                && java.util.Objects.equals(this.isForwarding, other.isForwarding)
                && java.util.Objects.equals(this.isListening, other.isListening)
                && java.util.Objects.equals(this.listeningAddress, other.listeningAddress)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.self, other.self)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.forwardingAddress == null ? 43 : this.forwardingAddress.hashCode());
        result = (result * PRIME) + (this.isForwarding == null ? 43 : this.isForwarding.hashCode());
        result = (result * PRIME) + (this.isListening == null ? 43 : this.isListening.hashCode());
        result =
                (result * PRIME)
                        + (this.listeningAddress == null ? 43 : this.listeningAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.self == null ? 43 : this.self.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of resolver endpoint. VNIC is currently the only supported type. */
    public enum EndpointType implements com.oracle.bmc.http.internal.BmcEnum {
        Vnic("VNIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EndpointType.class);

        private final String value;
        private static java.util.Map<String, EndpointType> map;

        static {
            map = new java.util.HashMap<>();
            for (EndpointType v : EndpointType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EndpointType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EndpointType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EndpointType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
