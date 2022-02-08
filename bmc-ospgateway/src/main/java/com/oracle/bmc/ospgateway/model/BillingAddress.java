/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Billing address details model.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BillingAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BillingAddress {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("addressKey")
        private String addressKey;

        public Builder addressKey(String addressKey) {
            this.addressKey = addressKey;
            this.__explicitlySet__.add("addressKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("line1")
        private String line1;

        public Builder line1(String line1) {
            this.line1 = line1;
            this.__explicitlySet__.add("line1");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("line2")
        private String line2;

        public Builder line2(String line2) {
            this.line2 = line2;
            this.__explicitlySet__.add("line2");
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
        private String country;

        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
        private String postalCode;

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            this.__explicitlySet__.add("postalCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("companyName")
        private String companyName;

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            this.__explicitlySet__.add("companyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BillingAddress build() {
            BillingAddress __instance__ =
                    new BillingAddress(
                            addressKey,
                            line1,
                            line2,
                            city,
                            country,
                            postalCode,
                            state,
                            emailAddress,
                            companyName,
                            firstName,
                            lastName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BillingAddress o) {
            Builder copiedBuilder =
                    addressKey(o.getAddressKey())
                            .line1(o.getLine1())
                            .line2(o.getLine2())
                            .city(o.getCity())
                            .country(o.getCountry())
                            .postalCode(o.getPostalCode())
                            .state(o.getState())
                            .emailAddress(o.getEmailAddress())
                            .companyName(o.getCompanyName())
                            .firstName(o.getFirstName())
                            .lastName(o.getLastName());

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
     * Address identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressKey")
    String addressKey;

    /**
     * Address line 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("line1")
    String line1;

    /**
     * Address line 2.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("line2")
    String line2;

    /**
     * Name of the city.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    String city;

    /**
     * Country of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    String country;

    /**
     * Post code of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
    String postalCode;

    /**
     * State of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    String state;

    /**
     * Contact person email address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    String emailAddress;

    /**
     * Name of the customer company.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("companyName")
    String companyName;

    /**
     * First name of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    String firstName;

    /**
     * Last name of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    String lastName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
