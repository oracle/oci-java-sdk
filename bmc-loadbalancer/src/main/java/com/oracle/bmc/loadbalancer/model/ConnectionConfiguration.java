/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Configuration details for the connection between the client and backend servers.
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConnectionConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ConnectionConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("idleTimeout")
        private Long idleTimeout;

        public Builder idleTimeout(Long idleTimeout) {
            this.idleTimeout = idleTimeout;
            this.__explicitlySet__.add("idleTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionConfiguration build() {
            ConnectionConfiguration __instance__ = new ConnectionConfiguration(idleTimeout);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionConfiguration o) {
            Builder copiedBuilder = idleTimeout(o.getIdleTimeout());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The maximum idle time, in seconds, allowed between two successive receive or two successive send operations
     * between the client and backend servers. A send operation does not reset the timer for receive operations. A
     * receive operation does not reset the timer for send operations.
     * <p>
     * The default values are:
     * <p>
     *  300 seconds for TCP
     * <p>
     *  60 seconds for HTTP and WebSocket protocols.
     * <p>
     * Note: The protocol is set at the listener.
     * <p>
     * Modify this parameter if the client or backend server stops transmitting data for more than the default time.
     * Some examples include:
     * <p>
     *  The client sends a database query to the backend server and the database takes over 300 seconds to execute.
     *    Therefore, the backend server does not transmit any data within 300 seconds.
     * <p>
     *  The client uploads data using the HTTP protocol. During the upload, the backend does not transmit any data
     *    to the client for more than 60 seconds.
     * <p>
     *  The client downloads data using the HTTP protocol.  After the initial request, it stops transmitting data to
     *    the backend server for more than 60 seconds.
     * <p>
     *  The client starts transmitting data after establishing a WebSocket connection, but the backend server does
     *    not transmit data for more than 60 seconds.
     * <p>
     *  The backend server starts transmitting data after establishing a WebSocket connection, but the client does
     *    not transmit data for more than 60 seconds.
     * <p>
     * The maximum value is 7200 seconds. Contact My Oracle Support to file a service request if you want to increase
     * this limit for your tenancy. For more information, see [Service Limits](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/servicelimits.htm).
     * <p>
     * Example: `1200`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeout")
    Long idleTimeout;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
