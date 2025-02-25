/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Address location.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InvoicingLocation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InvoicingLocation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "address1",
        "address2",
        "postalCode",
        "city",
        "country",
        "region",
        "tcaLocationId"
    })
    public InvoicingLocation(
            String address1,
            String address2,
            String postalCode,
            String city,
            String country,
            String region,
            Long tcaLocationId) {
        super();
        this.address1 = address1;
        this.address2 = address2;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.region = region;
        this.tcaLocationId = tcaLocationId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Address first line.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("address1")
        private String address1;

        /**
         * Address first line.
         *
         * @param address1 the value to set
         * @return this builder
         **/
        public Builder address1(String address1) {
            this.address1 = address1;
            this.__explicitlySet__.add("address1");
            return this;
        }
        /**
         * Address second line.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("address2")
        private String address2;

        /**
         * Address second line.
         *
         * @param address2 the value to set
         * @return this builder
         **/
        public Builder address2(String address2) {
            this.address2 = address2;
            this.__explicitlySet__.add("address2");
            return this;
        }
        /**
         * Postal code.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
        private String postalCode;

        /**
         * Postal code.
         *
         * @param postalCode the value to set
         * @return this builder
         **/
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            this.__explicitlySet__.add("postalCode");
            return this;
        }
        /**
         * City.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        /**
         * City.
         *
         * @param city the value to set
         * @return this builder
         **/
        public Builder city(String city) {
            this.city = city;
            this.__explicitlySet__.add("city");
            return this;
        }
        /**
         * Country.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country.
         *
         * @param country the value to set
         * @return this builder
         **/
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /**
         * Region.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * Region.
         *
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * TCA Location identifier.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tcaLocationId")
        private Long tcaLocationId;

        /**
         * TCA Location identifier.
         *
         * @param tcaLocationId the value to set
         * @return this builder
         **/
        public Builder tcaLocationId(Long tcaLocationId) {
            this.tcaLocationId = tcaLocationId;
            this.__explicitlySet__.add("tcaLocationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoicingLocation build() {
            InvoicingLocation model =
                    new InvoicingLocation(
                            this.address1,
                            this.address2,
                            this.postalCode,
                            this.city,
                            this.country,
                            this.region,
                            this.tcaLocationId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoicingLocation model) {
            if (model.wasPropertyExplicitlySet("address1")) {
                this.address1(model.getAddress1());
            }
            if (model.wasPropertyExplicitlySet("address2")) {
                this.address2(model.getAddress2());
            }
            if (model.wasPropertyExplicitlySet("postalCode")) {
                this.postalCode(model.getPostalCode());
            }
            if (model.wasPropertyExplicitlySet("city")) {
                this.city(model.getCity());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("tcaLocationId")) {
                this.tcaLocationId(model.getTcaLocationId());
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
     * Address first line.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("address1")
    private final String address1;

    /**
     * Address first line.
     *
     * @return the value
     **/
    public String getAddress1() {
        return address1;
    }

    /**
     * Address second line.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("address2")
    private final String address2;

    /**
     * Address second line.
     *
     * @return the value
     **/
    public String getAddress2() {
        return address2;
    }

    /**
     * Postal code.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
    private final String postalCode;

    /**
     * Postal code.
     *
     * @return the value
     **/
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * City.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    /**
     * City.
     *
     * @return the value
     **/
    public String getCity() {
        return city;
    }

    /**
     * Country.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country.
     *
     * @return the value
     **/
    public String getCountry() {
        return country;
    }

    /**
     * Region.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * Region.
     *
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * TCA Location identifier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tcaLocationId")
    private final Long tcaLocationId;

    /**
     * TCA Location identifier.
     *
     * @return the value
     **/
    public Long getTcaLocationId() {
        return tcaLocationId;
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
        sb.append("InvoicingLocation(");
        sb.append("super=").append(super.toString());
        sb.append("address1=").append(String.valueOf(this.address1));
        sb.append(", address2=").append(String.valueOf(this.address2));
        sb.append(", postalCode=").append(String.valueOf(this.postalCode));
        sb.append(", city=").append(String.valueOf(this.city));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", tcaLocationId=").append(String.valueOf(this.tcaLocationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoicingLocation)) {
            return false;
        }

        InvoicingLocation other = (InvoicingLocation) o;
        return java.util.Objects.equals(this.address1, other.address1)
                && java.util.Objects.equals(this.address2, other.address2)
                && java.util.Objects.equals(this.postalCode, other.postalCode)
                && java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.tcaLocationId, other.tcaLocationId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address1 == null ? 43 : this.address1.hashCode());
        result = (result * PRIME) + (this.address2 == null ? 43 : this.address2.hashCode());
        result = (result * PRIME) + (this.postalCode == null ? 43 : this.postalCode.hashCode());
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.tcaLocationId == null ? 43 : this.tcaLocationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
