/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * Geographic information about a vantage point.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Geolocation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Geolocation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("geoKey")
        private String geoKey;

        public Builder geoKey(String geoKey) {
            this.geoKey = geoKey;
            this.__explicitlySet__.add("geoKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminDivCode")
        private String adminDivCode;

        public Builder adminDivCode(String adminDivCode) {
            this.adminDivCode = adminDivCode;
            this.__explicitlySet__.add("adminDivCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cityName")
        private String cityName;

        public Builder cityName(String cityName) {
            this.cityName = cityName;
            this.__explicitlySet__.add("cityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countryName")
        private String countryName;

        public Builder countryName(String countryName) {
            this.countryName = countryName;
            this.__explicitlySet__.add("countryName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latitude")
        private Float latitude;

        public Builder latitude(Float latitude) {
            this.latitude = latitude;
            this.__explicitlySet__.add("latitude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("longitude")
        private Float longitude;

        public Builder longitude(Float longitude) {
            this.longitude = longitude;
            this.__explicitlySet__.add("longitude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Geolocation build() {
            Geolocation __instance__ =
                    new Geolocation(
                            geoKey,
                            adminDivCode,
                            cityName,
                            countryCode,
                            countryName,
                            latitude,
                            longitude);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Geolocation o) {
            Builder copiedBuilder =
                    geoKey(o.getGeoKey())
                            .adminDivCode(o.getAdminDivCode())
                            .cityName(o.getCityName())
                            .countryCode(o.getCountryCode())
                            .countryName(o.getCountryName())
                            .latitude(o.getLatitude())
                            .longitude(o.getLongitude());

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
     * An opaque identifier for the geographic location of the vantage point.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("geoKey")
    String geoKey;

    /**
     * The ISO 3166-2 code for this location's first-level administrative
     * division, either a US state or Canadian province. Only included for locations
     * in the US or Canada. For a list of codes, see
     * [Country Codes](https://www.iso.org/obp/ui/#search).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminDivCode")
    String adminDivCode;

    /**
     * Common English-language name for the city.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cityName")
    String cityName;

    /**
     * The ISO 3166-1 alpha-2 country code. For a list of codes,
     * see [Country Codes](https://www.iso.org/obp/ui/#search).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    String countryCode;

    /**
     * The common English-language name for the country.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryName")
    String countryName;

    /**
     * Degrees north of the Equator.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    Float latitude;

    /**
     * Degrees east of the prime meridian.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    Float longitude;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
