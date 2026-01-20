/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.model;

/**
 * Geographic information about a vantage point. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Geolocation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Geolocation extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "geoKey",
        "adminDivCode",
        "cityName",
        "countryCode",
        "countryName",
        "latitude",
        "longitude"
    })
    public Geolocation(
            String geoKey,
            String adminDivCode,
            String cityName,
            String countryCode,
            String countryName,
            Float latitude,
            Float longitude) {
        super();
        this.geoKey = geoKey;
        this.adminDivCode = adminDivCode;
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An opaque identifier for the geographic location of the vantage point. */
        @com.fasterxml.jackson.annotation.JsonProperty("geoKey")
        private String geoKey;

        /**
         * An opaque identifier for the geographic location of the vantage point.
         *
         * @param geoKey the value to set
         * @return this builder
         */
        public Builder geoKey(String geoKey) {
            this.geoKey = geoKey;
            this.__explicitlySet__.add("geoKey");
            return this;
        }
        /**
         * The ISO 3166-2 code for this location's first-level administrative division, either a US
         * state or Canadian province. Only included for locations in the US or Canada. For a list
         * of codes, see [Country Codes](https://www.iso.org/obp/ui/#search).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminDivCode")
        private String adminDivCode;

        /**
         * The ISO 3166-2 code for this location's first-level administrative division, either a US
         * state or Canadian province. Only included for locations in the US or Canada. For a list
         * of codes, see [Country Codes](https://www.iso.org/obp/ui/#search).
         *
         * @param adminDivCode the value to set
         * @return this builder
         */
        public Builder adminDivCode(String adminDivCode) {
            this.adminDivCode = adminDivCode;
            this.__explicitlySet__.add("adminDivCode");
            return this;
        }
        /** Common English-language name for the city. */
        @com.fasterxml.jackson.annotation.JsonProperty("cityName")
        private String cityName;

        /**
         * Common English-language name for the city.
         *
         * @param cityName the value to set
         * @return this builder
         */
        public Builder cityName(String cityName) {
            this.cityName = cityName;
            this.__explicitlySet__.add("cityName");
            return this;
        }
        /**
         * The ISO 3166-1 alpha-2 country code. For a list of codes, see [Country
         * Codes](https://www.iso.org/obp/ui/#search).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        /**
         * The ISO 3166-1 alpha-2 country code. For a list of codes, see [Country
         * Codes](https://www.iso.org/obp/ui/#search).
         *
         * @param countryCode the value to set
         * @return this builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }
        /** The common English-language name for the country. */
        @com.fasterxml.jackson.annotation.JsonProperty("countryName")
        private String countryName;

        /**
         * The common English-language name for the country.
         *
         * @param countryName the value to set
         * @return this builder
         */
        public Builder countryName(String countryName) {
            this.countryName = countryName;
            this.__explicitlySet__.add("countryName");
            return this;
        }
        /** Degrees north of the Equator. */
        @com.fasterxml.jackson.annotation.JsonProperty("latitude")
        private Float latitude;

        /**
         * Degrees north of the Equator.
         *
         * @param latitude the value to set
         * @return this builder
         */
        public Builder latitude(Float latitude) {
            this.latitude = latitude;
            this.__explicitlySet__.add("latitude");
            return this;
        }
        /** Degrees east of the prime meridian. */
        @com.fasterxml.jackson.annotation.JsonProperty("longitude")
        private Float longitude;

        /**
         * Degrees east of the prime meridian.
         *
         * @param longitude the value to set
         * @return this builder
         */
        public Builder longitude(Float longitude) {
            this.longitude = longitude;
            this.__explicitlySet__.add("longitude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Geolocation build() {
            Geolocation model =
                    new Geolocation(
                            this.geoKey,
                            this.adminDivCode,
                            this.cityName,
                            this.countryCode,
                            this.countryName,
                            this.latitude,
                            this.longitude);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Geolocation model) {
            if (model.wasPropertyExplicitlySet("geoKey")) {
                this.geoKey(model.getGeoKey());
            }
            if (model.wasPropertyExplicitlySet("adminDivCode")) {
                this.adminDivCode(model.getAdminDivCode());
            }
            if (model.wasPropertyExplicitlySet("cityName")) {
                this.cityName(model.getCityName());
            }
            if (model.wasPropertyExplicitlySet("countryCode")) {
                this.countryCode(model.getCountryCode());
            }
            if (model.wasPropertyExplicitlySet("countryName")) {
                this.countryName(model.getCountryName());
            }
            if (model.wasPropertyExplicitlySet("latitude")) {
                this.latitude(model.getLatitude());
            }
            if (model.wasPropertyExplicitlySet("longitude")) {
                this.longitude(model.getLongitude());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** An opaque identifier for the geographic location of the vantage point. */
    @com.fasterxml.jackson.annotation.JsonProperty("geoKey")
    private final String geoKey;

    /**
     * An opaque identifier for the geographic location of the vantage point.
     *
     * @return the value
     */
    public String getGeoKey() {
        return geoKey;
    }

    /**
     * The ISO 3166-2 code for this location's first-level administrative division, either a US
     * state or Canadian province. Only included for locations in the US or Canada. For a list of
     * codes, see [Country Codes](https://www.iso.org/obp/ui/#search).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminDivCode")
    private final String adminDivCode;

    /**
     * The ISO 3166-2 code for this location's first-level administrative division, either a US
     * state or Canadian province. Only included for locations in the US or Canada. For a list of
     * codes, see [Country Codes](https://www.iso.org/obp/ui/#search).
     *
     * @return the value
     */
    public String getAdminDivCode() {
        return adminDivCode;
    }

    /** Common English-language name for the city. */
    @com.fasterxml.jackson.annotation.JsonProperty("cityName")
    private final String cityName;

    /**
     * Common English-language name for the city.
     *
     * @return the value
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * The ISO 3166-1 alpha-2 country code. For a list of codes, see [Country
     * Codes](https://www.iso.org/obp/ui/#search).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    private final String countryCode;

    /**
     * The ISO 3166-1 alpha-2 country code. For a list of codes, see [Country
     * Codes](https://www.iso.org/obp/ui/#search).
     *
     * @return the value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** The common English-language name for the country. */
    @com.fasterxml.jackson.annotation.JsonProperty("countryName")
    private final String countryName;

    /**
     * The common English-language name for the country.
     *
     * @return the value
     */
    public String getCountryName() {
        return countryName;
    }

    /** Degrees north of the Equator. */
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    private final Float latitude;

    /**
     * Degrees north of the Equator.
     *
     * @return the value
     */
    public Float getLatitude() {
        return latitude;
    }

    /** Degrees east of the prime meridian. */
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    private final Float longitude;

    /**
     * Degrees east of the prime meridian.
     *
     * @return the value
     */
    public Float getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Geolocation(");
        sb.append("super=").append(super.toString());
        sb.append("geoKey=").append(String.valueOf(this.geoKey));
        sb.append(", adminDivCode=").append(String.valueOf(this.adminDivCode));
        sb.append(", cityName=").append(String.valueOf(this.cityName));
        sb.append(", countryCode=").append(String.valueOf(this.countryCode));
        sb.append(", countryName=").append(String.valueOf(this.countryName));
        sb.append(", latitude=").append(String.valueOf(this.latitude));
        sb.append(", longitude=").append(String.valueOf(this.longitude));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Geolocation)) {
            return false;
        }

        Geolocation other = (Geolocation) o;
        return java.util.Objects.equals(this.geoKey, other.geoKey)
                && java.util.Objects.equals(this.adminDivCode, other.adminDivCode)
                && java.util.Objects.equals(this.cityName, other.cityName)
                && java.util.Objects.equals(this.countryCode, other.countryCode)
                && java.util.Objects.equals(this.countryName, other.countryName)
                && java.util.Objects.equals(this.latitude, other.latitude)
                && java.util.Objects.equals(this.longitude, other.longitude)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.geoKey == null ? 43 : this.geoKey.hashCode());
        result = (result * PRIME) + (this.adminDivCode == null ? 43 : this.adminDivCode.hashCode());
        result = (result * PRIME) + (this.cityName == null ? 43 : this.cityName.hashCode());
        result = (result * PRIME) + (this.countryCode == null ? 43 : this.countryCode.hashCode());
        result = (result * PRIME) + (this.countryName == null ? 43 : this.countryName.hashCode());
        result = (result * PRIME) + (this.latitude == null ? 43 : this.latitude.hashCode());
        result = (result * PRIME) + (this.longitude == null ? 43 : this.longitude.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
