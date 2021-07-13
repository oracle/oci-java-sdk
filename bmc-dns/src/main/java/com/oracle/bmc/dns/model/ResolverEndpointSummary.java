/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An OCI DNS resolver endpoint.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "endpointType",
    defaultImpl = ResolverEndpointSummary.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ResolverVnicEndpointSummary.class,
        name = "VNIC"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ResolverEndpointSummary {

    /**
     * The name of the resolver endpoint. Must be unique, case-insensitive, within the resolver.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * An IP address from which forwarded queries may be sent. For VNIC endpoints, this IP address must be part
     * of the subnet and will be assigned by the system if unspecified when isForwarding is true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forwardingAddress")
    String forwardingAddress;

    /**
     * A Boolean flag indicating whether or not the resolver endpoint is for forwarding.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForwarding")
    Boolean isForwarding;

    /**
     * A Boolean flag indicating whether or not the resolver endpoint is for listening.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isListening")
    Boolean isListening;

    /**
     * An IP address to listen to queries on. For VNIC endpoints this IP address must be part of the
     * subnet and will be assigned by the system if unspecified when isListening is true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listeningAddress")
    String listeningAddress;

    /**
     * The OCID of the owning compartment. This will match the resolver that the resolver endpoint is under
     * and will be updated if the resolver's compartment is changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The date and time the resource was created in \"YYYY-MM-ddThh:mm:ssZ\" format
     * with a Z offset, as defined by RFC 3339.
     * <p>
     **Example:** `2016-07-22T17:23:59:60Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the resource was last updated in \"YYYY-MM-ddThh:mm:ssZ\"
     * format with a Z offset, as defined by RFC 3339.
     * <p>
     **Example:** `2016-07-22T17:23:59:60Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;
    /**
     * The current state of the resource.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),
        Failed("FAILED"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The current state of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The canonical absolute URL of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("self")
    String self;

    /**
     * The type of resolver endpoint. VNIC is currently the only supported type.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum EndpointType {
        Vnic("VNIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
