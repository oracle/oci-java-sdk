/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A summary of the routes advertised to and received from the on-premises network.
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
    builder = TunnelRouteSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TunnelRouteSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("age")
        private Long age;

        public Builder age(Long age) {
            this.age = age;
            this.__explicitlySet__.add("age");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBestPath")
        private Boolean isBestPath;

        public Builder isBestPath(Boolean isBestPath) {
            this.isBestPath = isBestPath;
            this.__explicitlySet__.add("isBestPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("asPath")
        private java.util.List<Integer> asPath;

        public Builder asPath(java.util.List<Integer> asPath) {
            this.asPath = asPath;
            this.__explicitlySet__.add("asPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advertiser")
        private Advertiser advertiser;

        public Builder advertiser(Advertiser advertiser) {
            this.advertiser = advertiser;
            this.__explicitlySet__.add("advertiser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TunnelRouteSummary build() {
            TunnelRouteSummary __instance__ =
                    new TunnelRouteSummary(prefix, age, isBestPath, asPath, advertiser);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TunnelRouteSummary o) {
            Builder copiedBuilder =
                    prefix(o.getPrefix())
                            .age(o.getAge())
                            .isBestPath(o.getIsBestPath())
                            .asPath(o.getAsPath())
                            .advertiser(o.getAdvertiser());

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
     * The BGP network layer reachability information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    String prefix;

    /**
     * The age of the route.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("age")
    Long age;

    /**
     * Indicates this is the best route.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBestPath")
    Boolean isBestPath;

    /**
     * A list of ASNs in AS_Path.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asPath")
    java.util.List<Integer> asPath;
    /**
     * The source of the route advertisement.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Advertiser {
        Customer("CUSTOMER"),
        Oracle("ORACLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Advertiser> map;

        static {
            map = new java.util.HashMap<>();
            for (Advertiser v : Advertiser.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Advertiser(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Advertiser create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Advertiser', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The source of the route advertisement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advertiser")
    Advertiser advertiser;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
