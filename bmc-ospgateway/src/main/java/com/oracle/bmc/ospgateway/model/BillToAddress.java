/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Address details model
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BillToAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BillToAddress {
    @Deprecated
    @java.beans.ConstructorProperties({
        "contactName",
        "companyName",
        "addressLine1",
        "addressLine2",
        "addressLine3",
        "addressLine4",
        "streetName",
        "streetNumber",
        "city",
        "country",
        "county",
        "state",
        "postalCode",
        "province"
    })
    public BillToAddress(
            String contactName,
            String companyName,
            String addressLine1,
            String addressLine2,
            String addressLine3,
            String addressLine4,
            String streetName,
            String streetNumber,
            String city,
            Country country,
            String county,
            String state,
            String postalCode,
            String province) {
        super();
        this.contactName = contactName;
        this.companyName = companyName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.addressLine4 = addressLine4;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.county = county;
        this.state = state;
        this.postalCode = postalCode;
        this.province = province;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("contactName")
        private String contactName;

        public Builder contactName(String contactName) {
            this.contactName = contactName;
            this.__explicitlySet__.add("contactName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("companyName")
        private String companyName;

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            this.__explicitlySet__.add("companyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addressLine1")
        private String addressLine1;

        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            this.__explicitlySet__.add("addressLine1");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addressLine2")
        private String addressLine2;

        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            this.__explicitlySet__.add("addressLine2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addressLine3")
        private String addressLine3;

        public Builder addressLine3(String addressLine3) {
            this.addressLine3 = addressLine3;
            this.__explicitlySet__.add("addressLine3");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("addressLine4")
        private String addressLine4;

        public Builder addressLine4(String addressLine4) {
            this.addressLine4 = addressLine4;
            this.__explicitlySet__.add("addressLine4");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("streetName")
        private String streetName;

        public Builder streetName(String streetName) {
            this.streetName = streetName;
            this.__explicitlySet__.add("streetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("streetNumber")
        private String streetNumber;

        public Builder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            this.__explicitlySet__.add("streetNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        public Builder city(String city) {
            this.city = city;
            this.__explicitlySet__.add("city");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private Country country;

        public Builder country(Country country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("county")
        private String county;

        public Builder county(String county) {
            this.county = county;
            this.__explicitlySet__.add("county");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
        private String postalCode;

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            this.__explicitlySet__.add("postalCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("province")
        private String province;

        public Builder province(String province) {
            this.province = province;
            this.__explicitlySet__.add("province");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BillToAddress build() {
            BillToAddress __instance__ =
                    new BillToAddress(
                            contactName,
                            companyName,
                            addressLine1,
                            addressLine2,
                            addressLine3,
                            addressLine4,
                            streetName,
                            streetNumber,
                            city,
                            country,
                            county,
                            state,
                            postalCode,
                            province);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BillToAddress o) {
            Builder copiedBuilder =
                    contactName(o.getContactName())
                            .companyName(o.getCompanyName())
                            .addressLine1(o.getAddressLine1())
                            .addressLine2(o.getAddressLine2())
                            .addressLine3(o.getAddressLine3())
                            .addressLine4(o.getAddressLine4())
                            .streetName(o.getStreetName())
                            .streetNumber(o.getStreetNumber())
                            .city(o.getCity())
                            .country(o.getCountry())
                            .county(o.getCounty())
                            .state(o.getState())
                            .postalCode(o.getPostalCode())
                            .province(o.getProvince());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name of the contact person
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactName")
    private final String contactName;

    public String getContactName() {
        return contactName;
    }

    /**
     * Name of the customer company
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("companyName")
    private final String companyName;

    public String getCompanyName() {
        return companyName;
    }

    /**
     * Address line 1
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine1")
    private final String addressLine1;

    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Address line 2
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine2")
    private final String addressLine2;

    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Address line 3
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine3")
    private final String addressLine3;

    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Address line 4
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine4")
    private final String addressLine4;

    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Street name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streetName")
    private final String streetName;

    public String getStreetName() {
        return streetName;
    }

    /**
     * House no
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streetNumber")
    private final String streetNumber;

    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Name of the city
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    public String getCity() {
        return city;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final Country country;

    public Country getCountry() {
        return country;
    }

    /**
     * County name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("county")
    private final String county;

    public String getCounty() {
        return county;
    }

    /**
     * Name of the state
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    public String getState() {
        return state;
    }

    /**
     * ZIP no
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
    private final String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Name of the province
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("province")
    private final String province;

    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BillToAddress(");
        sb.append("contactName=").append(String.valueOf(this.contactName));
        sb.append(", companyName=").append(String.valueOf(this.companyName));
        sb.append(", addressLine1=").append(String.valueOf(this.addressLine1));
        sb.append(", addressLine2=").append(String.valueOf(this.addressLine2));
        sb.append(", addressLine3=").append(String.valueOf(this.addressLine3));
        sb.append(", addressLine4=").append(String.valueOf(this.addressLine4));
        sb.append(", streetName=").append(String.valueOf(this.streetName));
        sb.append(", streetNumber=").append(String.valueOf(this.streetNumber));
        sb.append(", city=").append(String.valueOf(this.city));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", county=").append(String.valueOf(this.county));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", postalCode=").append(String.valueOf(this.postalCode));
        sb.append(", province=").append(String.valueOf(this.province));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BillToAddress)) {
            return false;
        }

        BillToAddress other = (BillToAddress) o;
        return java.util.Objects.equals(this.contactName, other.contactName)
                && java.util.Objects.equals(this.companyName, other.companyName)
                && java.util.Objects.equals(this.addressLine1, other.addressLine1)
                && java.util.Objects.equals(this.addressLine2, other.addressLine2)
                && java.util.Objects.equals(this.addressLine3, other.addressLine3)
                && java.util.Objects.equals(this.addressLine4, other.addressLine4)
                && java.util.Objects.equals(this.streetName, other.streetName)
                && java.util.Objects.equals(this.streetNumber, other.streetNumber)
                && java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.county, other.county)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.postalCode, other.postalCode)
                && java.util.Objects.equals(this.province, other.province)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.contactName == null ? 43 : this.contactName.hashCode());
        result = (result * PRIME) + (this.companyName == null ? 43 : this.companyName.hashCode());
        result = (result * PRIME) + (this.addressLine1 == null ? 43 : this.addressLine1.hashCode());
        result = (result * PRIME) + (this.addressLine2 == null ? 43 : this.addressLine2.hashCode());
        result = (result * PRIME) + (this.addressLine3 == null ? 43 : this.addressLine3.hashCode());
        result = (result * PRIME) + (this.addressLine4 == null ? 43 : this.addressLine4.hashCode());
        result = (result * PRIME) + (this.streetName == null ? 43 : this.streetName.hashCode());
        result = (result * PRIME) + (this.streetNumber == null ? 43 : this.streetNumber.hashCode());
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.county == null ? 43 : this.county.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.postalCode == null ? 43 : this.postalCode.hashCode());
        result = (result * PRIME) + (this.province == null ? 43 : this.province.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
