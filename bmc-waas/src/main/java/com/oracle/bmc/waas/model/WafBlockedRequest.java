/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WafBlockedRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WafBlockedRequest extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeObserved", "timeRangeInSeconds", "wafFeature", "count"})
    public WafBlockedRequest(
            java.util.Date timeObserved,
            Integer timeRangeInSeconds,
            WafFeature wafFeature,
            Integer count) {
        super();
        this.timeObserved = timeObserved;
        this.timeRangeInSeconds = timeRangeInSeconds;
        this.wafFeature = wafFeature;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date and time the blocked requests were observed, expressed in RFC 3339 timestamp format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
        private java.util.Date timeObserved;

        /**
         * The date and time the blocked requests were observed, expressed in RFC 3339 timestamp format.
         * @param timeObserved the value to set
         * @return this builder
         **/
        public Builder timeObserved(java.util.Date timeObserved) {
            this.timeObserved = timeObserved;
            this.__explicitlySet__.add("timeObserved");
            return this;
        }
        /**
         * The number of seconds the data covers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRangeInSeconds")
        private Integer timeRangeInSeconds;

        /**
         * The number of seconds the data covers.
         * @param timeRangeInSeconds the value to set
         * @return this builder
         **/
        public Builder timeRangeInSeconds(Integer timeRangeInSeconds) {
            this.timeRangeInSeconds = timeRangeInSeconds;
            this.__explicitlySet__.add("timeRangeInSeconds");
            return this;
        }
        /**
         * The specific Web Application Firewall feature that blocked the requests, such as JavaScript Challenge or Access Control.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("wafFeature")
        private WafFeature wafFeature;

        /**
         * The specific Web Application Firewall feature that blocked the requests, such as JavaScript Challenge or Access Control.
         * @param wafFeature the value to set
         * @return this builder
         **/
        public Builder wafFeature(WafFeature wafFeature) {
            this.wafFeature = wafFeature;
            this.__explicitlySet__.add("wafFeature");
            return this;
        }
        /**
         * The count of blocked requests.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The count of blocked requests.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafBlockedRequest build() {
            WafBlockedRequest model =
                    new WafBlockedRequest(
                            this.timeObserved,
                            this.timeRangeInSeconds,
                            this.wafFeature,
                            this.count);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafBlockedRequest model) {
            if (model.wasPropertyExplicitlySet("timeObserved")) {
                this.timeObserved(model.getTimeObserved());
            }
            if (model.wasPropertyExplicitlySet("timeRangeInSeconds")) {
                this.timeRangeInSeconds(model.getTimeRangeInSeconds());
            }
            if (model.wasPropertyExplicitlySet("wafFeature")) {
                this.wafFeature(model.getWafFeature());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The date and time the blocked requests were observed, expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
    private final java.util.Date timeObserved;

    /**
     * The date and time the blocked requests were observed, expressed in RFC 3339 timestamp format.
     * @return the value
     **/
    public java.util.Date getTimeObserved() {
        return timeObserved;
    }

    /**
     * The number of seconds the data covers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRangeInSeconds")
    private final Integer timeRangeInSeconds;

    /**
     * The number of seconds the data covers.
     * @return the value
     **/
    public Integer getTimeRangeInSeconds() {
        return timeRangeInSeconds;
    }

    /**
     * The specific Web Application Firewall feature that blocked the requests, such as JavaScript Challenge or Access Control.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(WafFeature.class);

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
    private final WafFeature wafFeature;

    /**
     * The specific Web Application Firewall feature that blocked the requests, such as JavaScript Challenge or Access Control.
     * @return the value
     **/
    public WafFeature getWafFeature() {
        return wafFeature;
    }

    /**
     * The count of blocked requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The count of blocked requests.
     * @return the value
     **/
    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("WafBlockedRequest(");
        sb.append("super=").append(super.toString());
        sb.append("timeObserved=").append(String.valueOf(this.timeObserved));
        sb.append(", timeRangeInSeconds=").append(String.valueOf(this.timeRangeInSeconds));
        sb.append(", wafFeature=").append(String.valueOf(this.wafFeature));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WafBlockedRequest)) {
            return false;
        }

        WafBlockedRequest other = (WafBlockedRequest) o;
        return java.util.Objects.equals(this.timeObserved, other.timeObserved)
                && java.util.Objects.equals(this.timeRangeInSeconds, other.timeRangeInSeconds)
                && java.util.Objects.equals(this.wafFeature, other.wafFeature)
                && java.util.Objects.equals(this.count, other.count)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeObserved == null ? 43 : this.timeObserved.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRangeInSeconds == null
                                ? 43
                                : this.timeRangeInSeconds.hashCode());
        result = (result * PRIME) + (this.wafFeature == null ? 43 : this.wafFeature.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
