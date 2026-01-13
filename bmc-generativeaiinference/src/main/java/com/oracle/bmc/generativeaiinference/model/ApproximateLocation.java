/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * To refine search results based on geography, you can specify an approximate user location using
 * any of the following: - {@code city} and {@code region} are free-text strings, like "Minneapolis"
 * and "Minnesota". - {@code country} is a two-letter ISO country code, like "US". - {@code
 * timezone} is an IANA timezone string, like "America/Chicago". <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApproximateLocation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApproximateLocation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"city", "region", "country", "timezone"})
    public ApproximateLocation(String city, String region, String country, String timezone) {
        super();
        this.city = city;
        this.region = region;
        this.country = country;
        this.timezone = timezone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Approximate city name, like "Minneapolis". */
        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        /**
         * Approximate city name, like "Minneapolis".
         *
         * @param city the value to set
         * @return this builder
         */
        public Builder city(String city) {
            this.city = city;
            this.__explicitlySet__.add("city");
            return this;
        }
        /** Approximate region or state, like "Minnesota". */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Approximate region or state, like "Minnesota".
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** Two-letter ISO country code. */
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Two-letter ISO country code.
         *
         * @param country the value to set
         * @return this builder
         */
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /** IANA timezone string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * IANA timezone string.
         *
         * @param timezone the value to set
         * @return this builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApproximateLocation build() {
            ApproximateLocation model =
                    new ApproximateLocation(this.city, this.region, this.country, this.timezone);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApproximateLocation model) {
            if (model.wasPropertyExplicitlySet("city")) {
                this.city(model.getCity());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
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

    /** Approximate city name, like "Minneapolis". */
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    /**
     * Approximate city name, like "Minneapolis".
     *
     * @return the value
     */
    public String getCity() {
        return city;
    }

    /** Approximate region or state, like "Minnesota". */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Approximate region or state, like "Minnesota".
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** Two-letter ISO country code. */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Two-letter ISO country code.
     *
     * @return the value
     */
    public String getCountry() {
        return country;
    }

    /** IANA timezone string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * IANA timezone string.
     *
     * @return the value
     */
    public String getTimezone() {
        return timezone;
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
        sb.append("ApproximateLocation(");
        sb.append("super=").append(super.toString());
        sb.append("city=").append(String.valueOf(this.city));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApproximateLocation)) {
            return false;
        }

        ApproximateLocation other = (ApproximateLocation) o;
        return java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
