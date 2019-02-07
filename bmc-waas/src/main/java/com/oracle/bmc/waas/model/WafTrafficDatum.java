/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * A time series of traffic data for the  Web Application Firewall configured for a policy.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WafTrafficDatum.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WafTrafficDatum {
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

        @com.fasterxml.jackson.annotation.JsonProperty("trafficInBytes")
        private Integer trafficInBytes;

        public Builder trafficInBytes(Integer trafficInBytes) {
            this.trafficInBytes = trafficInBytes;
            this.__explicitlySet__.add("trafficInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WafTrafficDatum build() {
            WafTrafficDatum __instance__ =
                    new WafTrafficDatum(
                            timeObserved,
                            timeRangeInSeconds,
                            tenancyId,
                            compartmentId,
                            waasPolicyId,
                            trafficInBytes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WafTrafficDatum o) {
            Builder copiedBuilder =
                    timeObserved(o.getTimeObserved())
                            .timeRangeInSeconds(o.getTimeRangeInSeconds())
                            .tenancyId(o.getTenancyId())
                            .compartmentId(o.getCompartmentId())
                            .waasPolicyId(o.getWaasPolicyId())
                            .trafficInBytes(o.getTrafficInBytes());

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
     * The date and time the traffic was observed, rounded down to the start of the range, and expressed in RFC 3339 timestamp format.
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
     * Traffic in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trafficInBytes")
    Integer trafficInBytes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
