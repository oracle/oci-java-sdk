/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.model;

/**
 * An external master name server used as the source of zone data.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExternalMaster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExternalMaster {
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

        @com.fasterxml.jackson.annotation.JsonProperty("tsig")
        private TSIG tsig;

        public Builder tsig(TSIG tsig) {
            this.tsig = tsig;
            this.__explicitlySet__.add("tsig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalMaster build() {
            ExternalMaster __instance__ = new ExternalMaster(address, port, tsig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalMaster o) {
            Builder copiedBuilder = address(o.getAddress()).port(o.getPort()).tsig(o.getTsig());

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
     * The server's port. Port value must be a value of 53, otherwise omit
     * the port value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    @com.fasterxml.jackson.annotation.JsonProperty("tsig")
    TSIG tsig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
