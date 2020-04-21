/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Configuration details for the connection between the client and backend servers.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
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

        @com.fasterxml.jackson.annotation.JsonProperty("backendTcpProxyProtocolVersion")
        private Integer backendTcpProxyProtocolVersion;

        public Builder backendTcpProxyProtocolVersion(Integer backendTcpProxyProtocolVersion) {
            this.backendTcpProxyProtocolVersion = backendTcpProxyProtocolVersion;
            this.__explicitlySet__.add("backendTcpProxyProtocolVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionConfiguration build() {
            ConnectionConfiguration __instance__ =
                    new ConnectionConfiguration(idleTimeout, backendTcpProxyProtocolVersion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionConfiguration o) {
            Builder copiedBuilder =
                    idleTimeout(o.getIdleTimeout())
                            .backendTcpProxyProtocolVersion(o.getBackendTcpProxyProtocolVersion());

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
     * For more information, see [Connection Configuration](https://docs.cloud.oracle.com/Content/Balance/Reference/connectionreuse.htm#ConnectionConfiguration).
     * <p>
     * Example: `1200`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idleTimeout")
    Long idleTimeout;

    /**
     * The backend TCP Proxy Protocol version.
     * <p>
     * Example: `1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendTcpProxyProtocolVersion")
    Integer backendTcpProxyProtocolVersion;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
