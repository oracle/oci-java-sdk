/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Address.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Address {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        public Address build() {
            Address __instance__ =
                    new Address(
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
        public Builder copy(Address o) {
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

    /**
     * Name of the contact person
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactName")
    String contactName;

    /**
     * Name of the customer company
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("companyName")
    String companyName;

    /**
     * Address line 1
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine1")
    String addressLine1;

    /**
     * Address line 2
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine2")
    String addressLine2;

    /**
     * Address line 3
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine3")
    String addressLine3;

    /**
     * Address line 4
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine4")
    String addressLine4;

    /**
     * Street name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streetName")
    String streetName;

    /**
     * House no
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streetNumber")
    String streetNumber;

    /**
     * Name of the city
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    String city;

    @com.fasterxml.jackson.annotation.JsonProperty("country")
    Country country;

    /**
     * County name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("county")
    String county;

    /**
     * Name of the state
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    String state;

    /**
     * ZIP no
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
    String postalCode;

    /**
     * Name of the province
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("province")
    String province;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
