/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * Information about a vantage point.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HealthChecksVantagePointSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class HealthChecksVantagePointSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("geo")
        private Geolocation geo;

        public Builder geo(Geolocation geo) {
            this.geo = geo;
            this.__explicitlySet__.add("geo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routing")
        private java.util.List<Routing> routing;

        public Builder routing(java.util.List<Routing> routing) {
            this.routing = routing;
            this.__explicitlySet__.add("routing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthChecksVantagePointSummary build() {
            HealthChecksVantagePointSummary __instance__ =
                    new HealthChecksVantagePointSummary(
                            displayName, providerName, name, geo, routing);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthChecksVantagePointSummary o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .providerName(o.getProviderName())
                            .name(o.getName())
                            .geo(o.getGeo())
                            .routing(o.getRouting());

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
     * The display name for the vantage point. Display names are determined by
     * the best information available and may change over time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The organization on whose infrastructure this vantage point resides.
     * Provider names are not unique, as Oracle Cloud Infrastructure maintains
     * many vantage points in each major provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    String providerName;

    /**
     * The unique, permanent name for the vantage point.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    @com.fasterxml.jackson.annotation.JsonProperty("geo")
    Geolocation geo;

    /**
     * An array of objects that describe how traffic to this vantage point is
     * routed, including which prefixes and ASNs connect it to the internet.
     * <p>
     * The addresses are sorted from the most-specific to least-specific
     * prefix (the smallest network to largest network). When a prefix has
     * multiple origin ASNs (MOAS routing), they are sorted by weight
     * (highest to lowest). Weight is determined by the total percentage of
     * peers observing the prefix originating from an ASN. Only present if
     * `fields` includes `routing`. The field will be null if the address's
     * routing information is unknown.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routing")
    java.util.List<Routing> routing;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
