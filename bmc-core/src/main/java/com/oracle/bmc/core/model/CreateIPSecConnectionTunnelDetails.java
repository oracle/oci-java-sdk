/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIPSecConnectionTunnelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateIPSecConnectionTunnelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routing")
        private Routing routing;

        public Builder routing(Routing routing) {
            this.routing = routing;
            this.__explicitlySet__.add("routing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ikeVersion")
        private IkeVersion ikeVersion;

        public Builder ikeVersion(IkeVersion ikeVersion) {
            this.ikeVersion = ikeVersion;
            this.__explicitlySet__.add("ikeVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
        private String sharedSecret;

        public Builder sharedSecret(String sharedSecret) {
            this.sharedSecret = sharedSecret;
            this.__explicitlySet__.add("sharedSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionConfig")
        private CreateIPSecTunnelBgpSessionDetails bgpSessionConfig;

        public Builder bgpSessionConfig(CreateIPSecTunnelBgpSessionDetails bgpSessionConfig) {
            this.bgpSessionConfig = bgpSessionConfig;
            this.__explicitlySet__.add("bgpSessionConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIPSecConnectionTunnelDetails build() {
            CreateIPSecConnectionTunnelDetails __instance__ =
                    new CreateIPSecConnectionTunnelDetails(
                            displayName, routing, ikeVersion, sharedSecret, bgpSessionConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIPSecConnectionTunnelDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .routing(o.getRouting())
                            .ikeVersion(o.getIkeVersion())
                            .sharedSecret(o.getSharedSecret())
                            .bgpSessionConfig(o.getBgpSessionConfig());

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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;
    /**
     * The type of routing to use for this tunnel (either BGP dynamic routing or static routing).
     *
     **/
    public enum Routing {
        Bgp("BGP"),
        Static("STATIC"),
        ;

        private final String value;
        private static java.util.Map<String, Routing> map;

        static {
            map = new java.util.HashMap<>();
            for (Routing v : Routing.values()) {
                map.put(v.getValue(), v);
            }
        }

        Routing(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Routing create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Routing: " + key);
        }
    };
    /**
     * The type of routing to use for this tunnel (either BGP dynamic routing or static routing).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routing")
    Routing routing;
    /**
     * Internet Key Exchange protocol version.
     *
     **/
    public enum IkeVersion {
        V1("V1"),
        V2("V2"),
        ;

        private final String value;
        private static java.util.Map<String, IkeVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (IkeVersion v : IkeVersion.values()) {
                map.put(v.getValue(), v);
            }
        }

        IkeVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IkeVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid IkeVersion: " + key);
        }
    };
    /**
     * Internet Key Exchange protocol version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ikeVersion")
    IkeVersion ikeVersion;

    /**
     * The shared secret (pre-shared key) to use for the IPSec tunnel. Only numbers, letters, and
     * spaces are allowed. If you don't provide a value,
     * Oracle generates a value for you. You can specify your own shared secret later if
     * you like with {@link #updateIPSecConnectionTunnelSharedSecret(UpdateIPSecConnectionTunnelSharedSecretRequest) updateIPSecConnectionTunnelSharedSecret}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
    String sharedSecret;

    /**
     * Information for establishing a BGP session for the IPSec tunnel. Required if the tunnel uses
     * BGP dynamic routing.
     * <p>
     * If the tunnel instead uses static routing, you may optionally provide
     * this object and set an IP address for one or both ends of the IPSec tunnel for the purposes
     * of troubleshooting or monitoring the tunnel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionConfig")
    CreateIPSecTunnelBgpSessionDetails bgpSessionConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
