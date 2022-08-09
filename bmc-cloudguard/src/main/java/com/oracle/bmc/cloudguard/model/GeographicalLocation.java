/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Geographical Location of a problem
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GeographicalLocation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GeographicalLocation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"latitude", "longitude"})
    public GeographicalLocation(Double latitude, Double longitude) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Latitude
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("latitude")
        private Double latitude;

        /**
         * Latitude
         * @param latitude the value to set
         * @return this builder
         **/
        public Builder latitude(Double latitude) {
            this.latitude = latitude;
            this.__explicitlySet__.add("latitude");
            return this;
        }
        /**
         * Longitude
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("longitude")
        private Double longitude;

        /**
         * Longitude
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

        public GeographicalLocation build() {
            GeographicalLocation model = new GeographicalLocation(this.latitude, this.longitude);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GeographicalLocation model) {
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
     * Latitude
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    private final Double latitude;

    /**
     * Latitude
     * @return the value
     **/
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Longitude
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    private final Double longitude;

    /**
     * Longitude
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
        sb.append("GeographicalLocation(");
        sb.append("super=").append(super.toString());
        sb.append("latitude=").append(String.valueOf(this.latitude));
        sb.append(", longitude=").append(String.valueOf(this.longitude));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeographicalLocation)) {
            return false;
        }

        GeographicalLocation other = (GeographicalLocation) o;
        return java.util.Objects.equals(this.latitude, other.latitude)
                && java.util.Objects.equals(this.longitude, other.longitude)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.latitude == null ? 43 : this.latitude.hashCode());
        result = (result * PRIME) + (this.longitude == null ? 43 : this.longitude.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
