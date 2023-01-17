/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The body for defining a new resolver endpoint.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "endpointType",
        defaultImpl = CreateResolverEndpointDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateResolverVnicEndpointDetails.class,
            name = "VNIC")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class CreateResolverEndpointDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "forwardingAddress",
        "isForwarding",
        "isListening",
        "listeningAddress"
    })
    protected CreateResolverEndpointDetails(
            String name,
            String forwardingAddress,
            Boolean isForwarding,
            Boolean isListening,
            String listeningAddress) {
        super();
        this.name = name;
        this.forwardingAddress = forwardingAddress;
        this.isForwarding = isForwarding;
        this.isListening = isListening;
        this.listeningAddress = listeningAddress;
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
        sb.append("CreateResolverEndpointDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", forwardingAddress=").append(String.valueOf(this.forwardingAddress));
        sb.append(", isForwarding=").append(String.valueOf(this.isForwarding));
        sb.append(", isListening=").append(String.valueOf(this.isListening));
        sb.append(", listeningAddress=").append(String.valueOf(this.listeningAddress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateResolverEndpointDetails)) {
            return false;
        }

        CreateResolverEndpointDetails other = (CreateResolverEndpointDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.forwardingAddress, other.forwardingAddress)
                && java.util.Objects.equals(this.isForwarding, other.isForwarding)
                && java.util.Objects.equals(this.isListening, other.isListening)
                && java.util.Objects.equals(this.listeningAddress, other.listeningAddress)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of resolver endpoint. VNIC is currently the only supported type. */
    public enum EndpointType implements com.oracle.bmc.http.internal.BmcEnum {
        Vnic("VNIC"),
        ;

        private final String value;
        private static java.util.Map<String, EndpointType> map;

        static {
            map = new java.util.HashMap<>();
            for (EndpointType v : EndpointType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid EndpointType: " + key);
        }
    };
}
