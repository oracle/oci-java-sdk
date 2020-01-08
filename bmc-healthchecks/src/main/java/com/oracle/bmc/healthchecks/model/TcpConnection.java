/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * TCP connection results.  All durations are in milliseconds.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TcpConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TcpConnection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectDuration")
        private Double connectDuration;

        public Builder connectDuration(Double connectDuration) {
            this.connectDuration = connectDuration;
            this.__explicitlySet__.add("connectDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secureConnectDuration")
        private Double secureConnectDuration;

        public Builder secureConnectDuration(Double secureConnectDuration) {
            this.secureConnectDuration = secureConnectDuration;
            this.__explicitlySet__.add("secureConnectDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TcpConnection build() {
            TcpConnection __instance__ =
                    new TcpConnection(address, port, connectDuration, secureConnectDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TcpConnection o) {
            Builder copiedBuilder =
                    address(o.getAddress())
                            .port(o.getPort())
                            .connectDuration(o.getConnectDuration())
                            .secureConnectDuration(o.getSecureConnectDuration());

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
     * The connection IP address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    String address;

    /**
     * The port.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * Total connect duration, calculated using `connectEnd` minus `connectStart`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectDuration")
    Double connectDuration;

    /**
     * The duration to secure the connection.  This value will be zero for
     * insecure connections.  Calculated using `connectEnd` minus `secureConnectionStart`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secureConnectDuration")
    Double secureConnectDuration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
