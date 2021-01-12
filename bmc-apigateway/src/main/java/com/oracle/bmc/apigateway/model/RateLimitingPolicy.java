/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Limit the number of requests that should be handled for the specified window using a specfic key.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RateLimitingPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RateLimitingPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("rateInRequestsPerSecond")
        private Integer rateInRequestsPerSecond;

        public Builder rateInRequestsPerSecond(Integer rateInRequestsPerSecond) {
            this.rateInRequestsPerSecond = rateInRequestsPerSecond;
            this.__explicitlySet__.add("rateInRequestsPerSecond");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateKey")
        private RateKey rateKey;

        public Builder rateKey(RateKey rateKey) {
            this.rateKey = rateKey;
            this.__explicitlySet__.add("rateKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RateLimitingPolicy build() {
            RateLimitingPolicy __instance__ =
                    new RateLimitingPolicy(rateInRequestsPerSecond, rateKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RateLimitingPolicy o) {
            Builder copiedBuilder =
                    rateInRequestsPerSecond(o.getRateInRequestsPerSecond()).rateKey(o.getRateKey());

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
     * The maximum number of requests per second to allow.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateInRequestsPerSecond")
    Integer rateInRequestsPerSecond;
    /**
     * The key used to group requests together.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RateKey {
        ClientIp("CLIENT_IP"),
        Total("TOTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RateKey> map;

        static {
            map = new java.util.HashMap<>();
            for (RateKey v : RateKey.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RateKey(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RateKey create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RateKey', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The key used to group requests together.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateKey")
    RateKey rateKey;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
