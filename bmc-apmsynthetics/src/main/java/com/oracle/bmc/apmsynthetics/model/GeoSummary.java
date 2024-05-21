/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Geographic summary of a vantage point.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GeoSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GeoSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "adminDivCode",
        "cityName",
        "countryCode",
        "countryName",
        "latitude",
        "longitude"
    })
    public GeoSummary(
            String adminDivCode,
            String cityName,
            String countryCode,
            String countryName,
            Double latitude,
            Double longitude) {
        super();
        this.adminDivCode = adminDivCode;
        this.cityName = cityName;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ISO 3166-2 code for this location's first-level administrative division, either a US state or Canadian province.
         * Only included for locations in the US or Canada. For a list of codes, see Country Codes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminDivCode")
        private String adminDivCode;

        /**
         * The ISO 3166-2 code for this location's first-level administrative division, either a US state or Canadian province.
         * Only included for locations in the US or Canada. For a list of codes, see Country Codes.
         *
         * @param adminDivCode the value to set
         * @return this builder
         **/
        public Builder adminDivCode(String adminDivCode) {
            this.adminDivCode = adminDivCode;
            this.__explicitlySet__.add("adminDivCode");
            return this;
        }
        /**
         * Common English-language name for the city.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cityName")
        private String cityName;

        /**
         * Common English-language name for the city.
         * @param cityName the value to set
         * @return this builder
         **/
        public Builder cityName(String cityName) {
            this.cityName = cityName;
            this.__explicitlySet__.add("cityName");
            return this;
        }
        /**
         * The ISO 3166-1 alpha-2 country code. For a list of codes, see Country Codes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        /**
         * The ISO 3166-1 alpha-2 country code. For a list of codes, see Country Codes.
         * @param countryCode the value to set
         * @return this builder
         **/
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }
        /**
         * The common English-language name for the country.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countryName")
        private String countryName;

        /**
         * The common English-language name for the country.
         * @param countryName the value to set
         * @return this builder
         **/
        public Builder countryName(String countryName) {
            this.countryName = countryName;
            this.__explicitlySet__.add("countryName");
            return this;
        }
        /**
         * Degrees north of the equator.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latitude")
        private Double latitude;

        /**
         * Degrees north of the equator.
         * @param latitude the value to set
         * @return this builder
         **/
        public Builder latitude(Double latitude) {
            this.latitude = latitude;
            this.__explicitlySet__.add("latitude");
            return this;
        }
        /**
         * Degrees east of the prime meridian.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("longitude")
        private Double longitude;

        /**
         * Degrees east of the prime meridian.
         * @param longitude the value to set
         * @return this builder
         **/
        public Builder longitude(Double longitude) {
            this.longitude = longitude;
            this.__explicitlySet__.add("longitude");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GeoSummary build() {
            GeoSummary model =
                    new GeoSummary(
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
        public Builder copy(GeoSummary model) {
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
     * The ISO 3166-2 code for this location's first-level administrative division, either a US state or Canadian province.
     * Only included for locations in the US or Canada. For a list of codes, see Country Codes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminDivCode")
    private final String adminDivCode;

    /**
     * The ISO 3166-2 code for this location's first-level administrative division, either a US state or Canadian province.
     * Only included for locations in the US or Canada. For a list of codes, see Country Codes.
     *
     * @return the value
     **/
    public String getAdminDivCode() {
        return adminDivCode;
    }

    /**
     * Common English-language name for the city.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cityName")
    private final String cityName;

    /**
     * Common English-language name for the city.
     * @return the value
     **/
    public String getCityName() {
        return cityName;
    }

    /**
     * The ISO 3166-1 alpha-2 country code. For a list of codes, see Country Codes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    private final String countryCode;

    /**
     * The ISO 3166-1 alpha-2 country code. For a list of codes, see Country Codes.
     * @return the value
     **/
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * The common English-language name for the country.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryName")
    private final String countryName;

    /**
     * The common English-language name for the country.
     * @return the value
     **/
    public String getCountryName() {
        return countryName;
    }

    /**
     * Degrees north of the equator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    private final Double latitude;

    /**
     * Degrees north of the equator.
     * @return the value
     **/
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Degrees east of the prime meridian.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    private final Double longitude;

    /**
     * Degrees east of the prime meridian.
     * @return the value
     **/
    public Double getLongitude() {
        return longitude;
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
        sb.append("GeoSummary(");
        sb.append("super=").append(super.toString());
        sb.append("adminDivCode=").append(String.valueOf(this.adminDivCode));
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
        if (!(o instanceof GeoSummary)) {
            return false;
        }

        GeoSummary other = (GeoSummary) o;
        return java.util.Objects.equals(this.adminDivCode, other.adminDivCode)
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
