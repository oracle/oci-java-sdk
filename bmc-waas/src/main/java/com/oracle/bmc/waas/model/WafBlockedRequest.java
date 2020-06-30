/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WafBlockedRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class WafBlockedRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
        private java.util.Date timeObserved;

        public Builder timeObserved(java.util.Date timeObserved) {
            this.timeObserved = timeObserved;
            this.__explicitlySet__.add("timeObserved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeRangeInSeconds")
        private Integer timeRangeInSeconds;

        public Builder timeRangeInSeconds(Integer timeRangeInSeconds) {
            this.timeRangeInSeconds = timeRangeInSeconds;
            this.__explicitlySet__.add("timeRangeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wafFeature")
        private WafFeature wafFeature;

        public Builder wafFeature(WafFeature wafFeature) {
            this.wafFeature = wafFeature;
            this.__explicitlySet__.add("wafFeature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafBlockedRequest build() {
            WafBlockedRequest __instance__ =
                    new WafBlockedRequest(timeObserved, timeRangeInSeconds, wafFeature, count);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafBlockedRequest o) {
            Builder copiedBuilder =
                    timeObserved(o.getTimeObserved())
                            .timeRangeInSeconds(o.getTimeRangeInSeconds())
                            .wafFeature(o.getWafFeature())
                            .count(o.getCount());

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
     * The date and time the blocked requests were observed, expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
    java.util.Date timeObserved;

    /**
     * The number of seconds the data covers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRangeInSeconds")
    Integer timeRangeInSeconds;
    /**
     * The specific Web Application Firewall feature that blocked the requests, such as JavaScript Challenge or Access Control.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum WafFeature {
        ProtectionRules("PROTECTION_RULES"),
        JsChallenge("JS_CHALLENGE"),
        AccessRules("ACCESS_RULES"),
        ThreatFeeds("THREAT_FEEDS"),
        HumanInteractionChallenge("HUMAN_INTERACTION_CHALLENGE"),
        DeviceFingerprintChallenge("DEVICE_FINGERPRINT_CHALLENGE"),
        Captcha("CAPTCHA"),
        AddressRateLimiting("ADDRESS_RATE_LIMITING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, WafFeature> map;

        static {
            map = new java.util.HashMap<>();
            for (WafFeature v : WafFeature.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        WafFeature(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WafFeature create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'WafFeature', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The specific Web Application Firewall feature that blocked the requests, such as JavaScript Challenge or Access Control.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wafFeature")
    WafFeature wafFeature;

    /**
     * The count of blocked requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    Integer count;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
