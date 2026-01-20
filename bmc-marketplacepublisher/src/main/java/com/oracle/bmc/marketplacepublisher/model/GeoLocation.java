/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Support details based on geographic location <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GeoLocation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GeoLocation extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"geographicRegion", "details"})
    public GeoLocation(GeographicRegion geographicRegion, String details) {
        super();
        this.geographicRegion = geographicRegion;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Region for geographic location */
        @com.fasterxml.jackson.annotation.JsonProperty("geographicRegion")
        private GeographicRegion geographicRegion;

        /**
         * Region for geographic location
         *
         * @param geographicRegion the value to set
         * @return this builder
         */
        public Builder geographicRegion(GeographicRegion geographicRegion) {
            this.geographicRegion = geographicRegion;
            this.__explicitlySet__.add("geographicRegion");
            return this;
        }
        /** Support details for specific region */
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private String details;

        /**
         * Support details for specific region
         *
         * @param details the value to set
         * @return this builder
         */
        public Builder details(String details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GeoLocation build() {
            GeoLocation model = new GeoLocation(this.geographicRegion, this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GeoLocation model) {
            if (model.wasPropertyExplicitlySet("geographicRegion")) {
                this.geographicRegion(model.getGeographicRegion());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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

    /** Region for geographic location */
    public enum GeographicRegion implements com.oracle.bmc.http.internal.BmcEnum {
        Africa("AFRICA"),
        AsiaPacific("ASIA_PACIFIC"),
        Europe("EUROPE"),
        Japan("JAPAN"),
        LatinAmerica("LATIN_AMERICA"),
        MiddleEast("MIDDLE_EAST"),
        NorthAmerica("NORTH_AMERICA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GeographicRegion.class);

        private final String value;
        private static java.util.Map<String, GeographicRegion> map;

        static {
            map = new java.util.HashMap<>();
            for (GeographicRegion v : GeographicRegion.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GeographicRegion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GeographicRegion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GeographicRegion', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Region for geographic location */
    @com.fasterxml.jackson.annotation.JsonProperty("geographicRegion")
    private final GeographicRegion geographicRegion;

    /**
     * Region for geographic location
     *
     * @return the value
     */
    public GeographicRegion getGeographicRegion() {
        return geographicRegion;
    }

    /** Support details for specific region */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final String details;

    /**
     * Support details for specific region
     *
     * @return the value
     */
    public String getDetails() {
        return details;
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
        sb.append("GeoLocation(");
        sb.append("super=").append(super.toString());
        sb.append("geographicRegion=").append(String.valueOf(this.geographicRegion));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeoLocation)) {
            return false;
        }

        GeoLocation other = (GeoLocation) o;
        return java.util.Objects.equals(this.geographicRegion, other.geographicRegion)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.geographicRegion == null ? 43 : this.geographicRegion.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
