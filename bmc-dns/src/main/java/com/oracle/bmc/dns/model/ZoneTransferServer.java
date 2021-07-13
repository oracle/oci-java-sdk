/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An OCI nameserver that transfers zone data with external nameservers.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ZoneTransferServer.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ZoneTransferServer {
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

        @com.fasterxml.jackson.annotation.JsonProperty("isTransferSource")
        private Boolean isTransferSource;

        public Builder isTransferSource(Boolean isTransferSource) {
            this.isTransferSource = isTransferSource;
            this.__explicitlySet__.add("isTransferSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTransferDestination")
        private Boolean isTransferDestination;

        public Builder isTransferDestination(Boolean isTransferDestination) {
            this.isTransferDestination = isTransferDestination;
            this.__explicitlySet__.add("isTransferDestination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ZoneTransferServer build() {
            ZoneTransferServer __instance__ =
                    new ZoneTransferServer(address, port, isTransferSource, isTransferDestination);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZoneTransferServer o) {
            Builder copiedBuilder =
                    address(o.getAddress())
                            .port(o.getPort())
                            .isTransferSource(o.getIsTransferSource())
                            .isTransferDestination(o.getIsTransferDestination());

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
     * The server's IP address (IPv4 or IPv6).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    String address;

    /**
     * The server's port.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * A Boolean flag indicating whether or not the server is a zone data transfer source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTransferSource")
    Boolean isTransferSource;

    /**
     * A Boolean flag indicating whether or not the server is a zone data transfer destination.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTransferDestination")
    Boolean isTransferDestination;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
