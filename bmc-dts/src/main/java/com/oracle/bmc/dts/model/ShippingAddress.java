/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.009")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShippingAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ShippingAddress {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("addressee")
        private String addressee;

        public Builder addressee(String addressee) {
            this.addressee = addressee;
            this.__explicitlySet__.add("addressee");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("careOf")
        private String careOf;

        public Builder careOf(String careOf) {
            this.careOf = careOf;
            this.__explicitlySet__.add("careOf");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address1")
        private String address1;

        public Builder address1(String address1) {
            this.address1 = address1;
            this.__explicitlySet__.add("address1");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address2")
        private String address2;

        public Builder address2(String address2) {
            this.address2 = address2;
            this.__explicitlySet__.add("address2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address3")
        private String address3;

        public Builder address3(String address3) {
            this.address3 = address3;
            this.__explicitlySet__.add("address3");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address4")
        private String address4;

        public Builder address4(String address4) {
            this.address4 = address4;
            this.__explicitlySet__.add("address4");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cityOrLocality")
        private String cityOrLocality;

        public Builder cityOrLocality(String cityOrLocality) {
            this.cityOrLocality = cityOrLocality;
            this.__explicitlySet__.add("cityOrLocality");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stateOrRegion")
        private String stateOrRegion;

        public Builder stateOrRegion(String stateOrRegion) {
            this.stateOrRegion = stateOrRegion;
            this.__explicitlySet__.add("stateOrRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("zipcode")
        private String zipcode;

        public Builder zipcode(String zipcode) {
            this.zipcode = zipcode;
            this.__explicitlySet__.add("zipcode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
        private String phoneNumber;

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.__explicitlySet__.add("phoneNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShippingAddress build() {
            ShippingAddress __instance__ =
                    new ShippingAddress(
                            addressee,
                            careOf,
                            address1,
                            address2,
                            address3,
                            address4,
                            cityOrLocality,
                            stateOrRegion,
                            zipcode,
                            country,
                            phoneNumber,
                            email);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShippingAddress o) {
            Builder copiedBuilder =
                    addressee(o.getAddressee())
                            .careOf(o.getCareOf())
                            .address1(o.getAddress1())
                            .address2(o.getAddress2())
                            .address3(o.getAddress3())
                            .address4(o.getAddress4())
                            .cityOrLocality(o.getCityOrLocality())
                            .stateOrRegion(o.getStateOrRegion())
                            .zipcode(o.getZipcode())
                            .country(o.getCountry())
                            .phoneNumber(o.getPhoneNumber())
                            .email(o.getEmail());

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

    @com.fasterxml.jackson.annotation.JsonProperty("addressee")
    String addressee;

    @com.fasterxml.jackson.annotation.JsonProperty("careOf")
    String careOf;

    @com.fasterxml.jackson.annotation.JsonProperty("address1")
    String address1;

    @com.fasterxml.jackson.annotation.JsonProperty("address2")
    String address2;

    @com.fasterxml.jackson.annotation.JsonProperty("address3")
    String address3;

    @com.fasterxml.jackson.annotation.JsonProperty("address4")
    String address4;

    @com.fasterxml.jackson.annotation.JsonProperty("cityOrLocality")
    String cityOrLocality;

    @com.fasterxml.jackson.annotation.JsonProperty("stateOrRegion")
    String stateOrRegion;

    @com.fasterxml.jackson.annotation.JsonProperty("zipcode")
    String zipcode;

    @com.fasterxml.jackson.annotation.JsonProperty("country")
    String country;

    @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
    String phoneNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("email")
    String email;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
