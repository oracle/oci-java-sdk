/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WafMeterDatum.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WafMeterDatum {
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

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("waasPolicyId")
        private String waasPolicyId;

        public Builder waasPolicyId(String waasPolicyId) {
            this.waasPolicyId = waasPolicyId;
            this.__explicitlySet__.add("waasPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOciOrigin")
        private Boolean isOciOrigin;

        public Builder isOciOrigin(Boolean isOciOrigin) {
            this.isOciOrigin = isOciOrigin;
            this.__explicitlySet__.add("isOciOrigin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBotEnabled")
        private Boolean isBotEnabled;

        public Builder isBotEnabled(Boolean isBotEnabled) {
            this.isBotEnabled = isBotEnabled;
            this.__explicitlySet__.add("isBotEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestCount")
        private Integer requestCount;

        public Builder requestCount(Integer requestCount) {
            this.requestCount = requestCount;
            this.__explicitlySet__.add("requestCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trafficInBytes")
        private Integer trafficInBytes;

        public Builder trafficInBytes(Integer trafficInBytes) {
            this.trafficInBytes = trafficInBytes;
            this.__explicitlySet__.add("trafficInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tagSlug")
        private byte[] tagSlug;

        public Builder tagSlug(byte[] tagSlug) {
            this.tagSlug = tagSlug;
            this.__explicitlySet__.add("tagSlug");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafMeterDatum build() {
            WafMeterDatum __instance__ =
                    new WafMeterDatum(
                            timeObserved,
                            timeRangeInSeconds,
                            tenancyId,
                            compartmentId,
                            waasPolicyId,
                            isOciOrigin,
                            isBotEnabled,
                            requestCount,
                            trafficInBytes,
                            tagSlug);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafMeterDatum o) {
            Builder copiedBuilder =
                    timeObserved(o.getTimeObserved())
                            .timeRangeInSeconds(o.getTimeRangeInSeconds())
                            .tenancyId(o.getTenancyId())
                            .compartmentId(o.getCompartmentId())
                            .waasPolicyId(o.getWaasPolicyId())
                            .isOciOrigin(o.getIsOciOrigin())
                            .isBotEnabled(o.getIsBotEnabled())
                            .requestCount(o.getRequestCount())
                            .trafficInBytes(o.getTrafficInBytes())
                            .tagSlug(o.getTagSlug());

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
     * The date and time the traffic was observed, rounded down to the start of a range, and expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeObserved")
    java.util.Date timeObserved;

    /**
     * The number of seconds this data covers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRangeInSeconds")
    Integer timeRangeInSeconds;

    /**
     * The tenancy OCID of the data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    String tenancyId;

    /**
     * The compartment OCID of the data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The policy OCID of the data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("waasPolicyId")
    String waasPolicyId;

    /**
     * True if origin (endpoint) is an OCI resource. False if external.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOciOrigin")
    Boolean isOciOrigin;

    /**
     * True if bot manager is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBotEnabled")
    Boolean isBotEnabled;

    /**
     * The number of incoming requests.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestCount")
    Integer requestCount;

    /**
     * Traffic in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trafficInBytes")
    Integer trafficInBytes;

    /**
     * The tag slug for the specified `waasPolicyId`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagSlug")
    byte[] tagSlug;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
