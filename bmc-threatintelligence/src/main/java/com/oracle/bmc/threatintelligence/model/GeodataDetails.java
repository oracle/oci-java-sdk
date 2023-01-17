/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * Geodata information for a given IP address
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GeodataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GeodataDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "routedPrefix",
        "origin",
        "geoId",
        "countryCode",
        "adminDiv",
        "city",
        "latitude",
        "longitude",
        "label"
    })
    public GeodataDetails(
            String routedPrefix,
            String origin,
            String geoId,
            String countryCode,
            String adminDiv,
            String city,
            String latitude,
            String longitude,
            String label) {
        super();
        this.routedPrefix = routedPrefix;
        this.origin = origin;
        this.geoId = geoId;
        this.countryCode = countryCode;
        this.adminDiv = adminDiv;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.label = label;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Encompassing assigned prefix for the IP
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routedPrefix")
        private String routedPrefix;

        /**
         * Encompassing assigned prefix for the IP
         * @param routedPrefix the value to set
         * @return this builder
         **/
        public Builder routedPrefix(String routedPrefix) {
            this.routedPrefix = routedPrefix;
            this.__explicitlySet__.add("routedPrefix");
            return this;
        }
        /**
         * ASN entry
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("origin")
        private String origin;

        /**
         * ASN entry
         * @param origin the value to set
         * @return this builder
         **/
        public Builder origin(String origin) {
            this.origin = origin;
            this.__explicitlySet__.add("origin");
            return this;
        }
        /**
         * Unique Identifier (optional)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("geoId")
        private String geoId;

        /**
         * Unique Identifier (optional)
         * @param geoId the value to set
         * @return this builder
         **/
        public Builder geoId(String geoId) {
            this.geoId = geoId;
            this.__explicitlySet__.add("geoId");
            return this;
        }
        /**
         * Two-letter abbreviation for country of origin
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        /**
         * Two-letter abbreviation for country of origin
         * @param countryCode the value to set
         * @return this builder
         **/
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }
        /**
         * State/Province/subdivision within the country
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminDiv")
        private String adminDiv;

        /**
         * State/Province/subdivision within the country
         * @param adminDiv the value to set
         * @return this builder
         **/
        public Builder adminDiv(String adminDiv) {
            this.adminDiv = adminDiv;
            this.__explicitlySet__.add("adminDiv");
            return this;
        }
        /**
         * City of origin
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        /**
         * City of origin
         * @param city the value to set
         * @return this builder
         **/
        public Builder city(String city) {
            this.city = city;
            this.__explicitlySet__.add("city");
            return this;
        }
        /**
         * Latitude
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latitude")
        private String latitude;

        /**
         * Latitude
         * @param latitude the value to set
         * @return this builder
         **/
        public Builder latitude(String latitude) {
            this.latitude = latitude;
            this.__explicitlySet__.add("latitude");
            return this;
        }
        /**
         * Longitude
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("longitude")
        private String longitude;

        /**
         * Longitude
         * @param longitude the value to set
         * @return this builder
         **/
        public Builder longitude(String longitude) {
            this.longitude = longitude;
            this.__explicitlySet__.add("longitude");
            return this;
        }
        /**
         * Information on source providing the information
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Information on source providing the information
         * @param label the value to set
         * @return this builder
         **/
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GeodataDetails build() {
            GeodataDetails model =
                    new GeodataDetails(
                            this.routedPrefix,
                            this.origin,
                            this.geoId,
                            this.countryCode,
                            this.adminDiv,
                            this.city,
                            this.latitude,
                            this.longitude,
                            this.label);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GeodataDetails model) {
            if (model.wasPropertyExplicitlySet("routedPrefix")) {
                this.routedPrefix(model.getRoutedPrefix());
            }
            if (model.wasPropertyExplicitlySet("origin")) {
                this.origin(model.getOrigin());
            }
            if (model.wasPropertyExplicitlySet("geoId")) {
                this.geoId(model.getGeoId());
            }
            if (model.wasPropertyExplicitlySet("countryCode")) {
                this.countryCode(model.getCountryCode());
            }
            if (model.wasPropertyExplicitlySet("adminDiv")) {
                this.adminDiv(model.getAdminDiv());
            }
            if (model.wasPropertyExplicitlySet("city")) {
                this.city(model.getCity());
            }
            if (model.wasPropertyExplicitlySet("latitude")) {
                this.latitude(model.getLatitude());
            }
            if (model.wasPropertyExplicitlySet("longitude")) {
                this.longitude(model.getLongitude());
            }
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
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
     * Encompassing assigned prefix for the IP
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routedPrefix")
    private final String routedPrefix;

    /**
     * Encompassing assigned prefix for the IP
     * @return the value
     **/
    public String getRoutedPrefix() {
        return routedPrefix;
    }

    /**
     * ASN entry
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    private final String origin;

    /**
     * ASN entry
     * @return the value
     **/
    public String getOrigin() {
        return origin;
    }

    /**
     * Unique Identifier (optional)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("geoId")
    private final String geoId;

    /**
     * Unique Identifier (optional)
     * @return the value
     **/
    public String getGeoId() {
        return geoId;
    }

    /**
     * Two-letter abbreviation for country of origin
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    private final String countryCode;

    /**
     * Two-letter abbreviation for country of origin
     * @return the value
     **/
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * State/Province/subdivision within the country
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminDiv")
    private final String adminDiv;

    /**
     * State/Province/subdivision within the country
     * @return the value
     **/
    public String getAdminDiv() {
        return adminDiv;
    }

    /**
     * City of origin
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    /**
     * City of origin
     * @return the value
     **/
    public String getCity() {
        return city;
    }

    /**
     * Latitude
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    private final String latitude;

    /**
     * Latitude
     * @return the value
     **/
    public String getLatitude() {
        return latitude;
    }

    /**
     * Longitude
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    private final String longitude;

    /**
     * Longitude
     * @return the value
     **/
    public String getLongitude() {
        return longitude;
    }

    /**
     * Information on source providing the information
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Information on source providing the information
     * @return the value
     **/
    public String getLabel() {
        return label;
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
        sb.append("GeodataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("routedPrefix=").append(String.valueOf(this.routedPrefix));
        sb.append(", origin=").append(String.valueOf(this.origin));
        sb.append(", geoId=").append(String.valueOf(this.geoId));
        sb.append(", countryCode=").append(String.valueOf(this.countryCode));
        sb.append(", adminDiv=").append(String.valueOf(this.adminDiv));
        sb.append(", city=").append(String.valueOf(this.city));
        sb.append(", latitude=").append(String.valueOf(this.latitude));
        sb.append(", longitude=").append(String.valueOf(this.longitude));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeodataDetails)) {
            return false;
        }

        GeodataDetails other = (GeodataDetails) o;
        return java.util.Objects.equals(this.routedPrefix, other.routedPrefix)
                && java.util.Objects.equals(this.origin, other.origin)
                && java.util.Objects.equals(this.geoId, other.geoId)
                && java.util.Objects.equals(this.countryCode, other.countryCode)
                && java.util.Objects.equals(this.adminDiv, other.adminDiv)
                && java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.latitude, other.latitude)
                && java.util.Objects.equals(this.longitude, other.longitude)
                && java.util.Objects.equals(this.label, other.label)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.routedPrefix == null ? 43 : this.routedPrefix.hashCode());
        result = (result * PRIME) + (this.origin == null ? 43 : this.origin.hashCode());
        result = (result * PRIME) + (this.geoId == null ? 43 : this.geoId.hashCode());
        result = (result * PRIME) + (this.countryCode == null ? 43 : this.countryCode.hashCode());
        result = (result * PRIME) + (this.adminDiv == null ? 43 : this.adminDiv.hashCode());
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.latitude == null ? 43 : this.latitude.hashCode());
        result = (result * PRIME) + (this.longitude == null ? 43 : this.longitude.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
