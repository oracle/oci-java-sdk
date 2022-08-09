/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HealthChecksVantagePointSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HealthChecksVantagePointSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "providerName", "name", "geo", "routing"})
    public HealthChecksVantagePointSummary(
            String displayName,
            String providerName,
            String name,
            Geolocation geo,
            java.util.List<Routing> routing) {
        super();
        this.displayName = displayName;
        this.providerName = providerName;
        this.name = name;
        this.geo = geo;
        this.routing = routing;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name for the vantage point. Display names are determined by
         * the best information available and may change over time.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name for the vantage point. Display names are determined by
         * the best information available and may change over time.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The organization on whose infrastructure this vantage point resides.
         * Provider names are not unique, as Oracle Cloud Infrastructure maintains
         * many vantage points in each major provider.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        /**
         * The organization on whose infrastructure this vantage point resides.
         * Provider names are not unique, as Oracle Cloud Infrastructure maintains
         * many vantage points in each major provider.
         *
         * @param providerName the value to set
         * @return this builder
         **/
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }
        /**
         * The unique, permanent name for the vantage point.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The unique, permanent name for the vantage point.
         * @param name the value to set
         * @return this builder
         **/
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
        /**
         * An array of objects that describe how traffic to this vantage point is
         * routed, including which prefixes and ASNs connect it to the internet.
         * <p>
         * The addresses are sorted from the most-specific to least-specific
         * prefix (the smallest network to largest network). When a prefix has
         * multiple origin ASNs (MOAS routing), they are sorted by weight
         * (highest to lowest). Weight is determined by the total percentage of
         * peers observing the prefix originating from an ASN. Only present if
         * {@code fields} includes {@code routing}. The field will be null if the address's
         * routing information is unknown.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routing")
        private java.util.List<Routing> routing;

        /**
         * An array of objects that describe how traffic to this vantage point is
         * routed, including which prefixes and ASNs connect it to the internet.
         * <p>
         * The addresses are sorted from the most-specific to least-specific
         * prefix (the smallest network to largest network). When a prefix has
         * multiple origin ASNs (MOAS routing), they are sorted by weight
         * (highest to lowest). Weight is determined by the total percentage of
         * peers observing the prefix originating from an ASN. Only present if
         * {@code fields} includes {@code routing}. The field will be null if the address's
         * routing information is unknown.
         *
         * @param routing the value to set
         * @return this builder
         **/
        public Builder routing(java.util.List<Routing> routing) {
            this.routing = routing;
            this.__explicitlySet__.add("routing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthChecksVantagePointSummary build() {
            HealthChecksVantagePointSummary model =
                    new HealthChecksVantagePointSummary(
                            this.displayName, this.providerName, this.name, this.geo, this.routing);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthChecksVantagePointSummary model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("providerName")) {
                this.providerName(model.getProviderName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("geo")) {
                this.geo(model.getGeo());
            }
            if (model.wasPropertyExplicitlySet("routing")) {
                this.routing(model.getRouting());
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
     * The display name for the vantage point. Display names are determined by
     * the best information available and may change over time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name for the vantage point. Display names are determined by
     * the best information available and may change over time.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The organization on whose infrastructure this vantage point resides.
     * Provider names are not unique, as Oracle Cloud Infrastructure maintains
     * many vantage points in each major provider.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    /**
     * The organization on whose infrastructure this vantage point resides.
     * Provider names are not unique, as Oracle Cloud Infrastructure maintains
     * many vantage points in each major provider.
     *
     * @return the value
     **/
    public String getProviderName() {
        return providerName;
    }

    /**
     * The unique, permanent name for the vantage point.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The unique, permanent name for the vantage point.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("geo")
    private final Geolocation geo;

    public Geolocation getGeo() {
        return geo;
    }

    /**
     * An array of objects that describe how traffic to this vantage point is
     * routed, including which prefixes and ASNs connect it to the internet.
     * <p>
     * The addresses are sorted from the most-specific to least-specific
     * prefix (the smallest network to largest network). When a prefix has
     * multiple origin ASNs (MOAS routing), they are sorted by weight
     * (highest to lowest). Weight is determined by the total percentage of
     * peers observing the prefix originating from an ASN. Only present if
     * {@code fields} includes {@code routing}. The field will be null if the address's
     * routing information is unknown.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routing")
    private final java.util.List<Routing> routing;

    /**
     * An array of objects that describe how traffic to this vantage point is
     * routed, including which prefixes and ASNs connect it to the internet.
     * <p>
     * The addresses are sorted from the most-specific to least-specific
     * prefix (the smallest network to largest network). When a prefix has
     * multiple origin ASNs (MOAS routing), they are sorted by weight
     * (highest to lowest). Weight is determined by the total percentage of
     * peers observing the prefix originating from an ASN. Only present if
     * {@code fields} includes {@code routing}. The field will be null if the address's
     * routing information is unknown.
     *
     * @return the value
     **/
    public java.util.List<Routing> getRouting() {
        return routing;
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
        sb.append("HealthChecksVantagePointSummary(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", geo=").append(String.valueOf(this.geo));
        sb.append(", routing=").append(String.valueOf(this.routing));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HealthChecksVantagePointSummary)) {
            return false;
        }

        HealthChecksVantagePointSummary other = (HealthChecksVantagePointSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.geo, other.geo)
                && java.util.Objects.equals(this.routing, other.routing)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.geo == null ? 43 : this.geo.hashCode());
        result = (result * PRIME) + (this.routing == null ? 43 : this.routing.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
