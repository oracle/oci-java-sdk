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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BillingAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BillingAddress {
    @Deprecated
    @java.beans.ConstructorProperties({
        "addressKey",
        "line1",
        "line2",
        "city",
        "country",
        "postalCode",
        "state",
        "emailAddress",
        "companyName",
        "firstName",
        "lastName"
    })
    public BillingAddress(
            String addressKey,
            String line1,
            String line2,
            String city,
            String country,
            String postalCode,
            String state,
            String emailAddress,
            String companyName,
            String firstName,
            String lastName) {
        super();
        this.addressKey = addressKey;
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.state = state;
        this.emailAddress = emailAddress;
        this.companyName = companyName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Address identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("addressKey")
        private String addressKey;

        /**
         * Address identifier.
         * @param addressKey the value to set
         * @return this builder
         **/
        public Builder addressKey(String addressKey) {
            this.addressKey = addressKey;
            this.__explicitlySet__.add("addressKey");
            return this;
        }
        /**
         * Address line 1.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("line1")
        private String line1;

        /**
         * Address line 1.
         * @param line1 the value to set
         * @return this builder
         **/
        public Builder line1(String line1) {
            this.line1 = line1;
            this.__explicitlySet__.add("line1");
            return this;
        }
        /**
         * Address line 2.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("line2")
        private String line2;

        /**
         * Address line 2.
         * @param line2 the value to set
         * @return this builder
         **/
        public Builder line2(String line2) {
            this.line2 = line2;
            this.__explicitlySet__.add("line2");
            return this;
        }
        /**
         * Name of the city.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        /**
         * Name of the city.
         * @param city the value to set
         * @return this builder
         **/
        public Builder city(String city) {
            this.city = city;
            this.__explicitlySet__.add("city");
            return this;
        }
        /**
         * Country of the address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country of the address.
         * @param country the value to set
         * @return this builder
         **/
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /**
         * Post code of the address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
        private String postalCode;

        /**
         * Post code of the address.
         * @param postalCode the value to set
         * @return this builder
         **/
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            this.__explicitlySet__.add("postalCode");
            return this;
        }
        /**
         * State of the address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * State of the address.
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * Contact person email address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        /**
         * Contact person email address.
         * @param emailAddress the value to set
         * @return this builder
         **/
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }
        /**
         * Name of the customer company.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("companyName")
        private String companyName;

        /**
         * Name of the customer company.
         * @param companyName the value to set
         * @return this builder
         **/
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            this.__explicitlySet__.add("companyName");
            return this;
        }
        /**
         * First name of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * First name of the contact person.
         * @param firstName the value to set
         * @return this builder
         **/
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /**
         * Last name of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * Last name of the contact person.
         * @param lastName the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Address identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("addressKey")
    private final String addressKey;

    /**
     * Address identifier.
     * @return the value
     **/
    public String getAddressKey() {
        return addressKey;
    }

    /**
     * Address line 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("line1")
    private final String line1;

    /**
     * Address line 1.
     * @return the value
     **/
    public String getLine1() {
        return line1;
    }

    /**
     * Address line 2.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("line2")
    private final String line2;

    /**
     * Address line 2.
     * @return the value
     **/
    public String getLine2() {
        return line2;
    }

    /**
     * Name of the city.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    /**
     * Name of the city.
     * @return the value
     **/
    public String getCity() {
        return city;
    }

    /**
     * Country of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country of the address.
     * @return the value
     **/
    public String getCountry() {
        return country;
    }

    /**
     * Post code of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
    private final String postalCode;

    /**
     * Post code of the address.
     * @return the value
     **/
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * State of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * State of the address.
     * @return the value
     **/
    public String getState() {
        return state;
    }

    /**
     * Contact person email address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    private final String emailAddress;

    /**
     * Contact person email address.
     * @return the value
     **/
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Name of the customer company.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("companyName")
    private final String companyName;

    /**
     * Name of the customer company.
     * @return the value
     **/
    public String getCompanyName() {
        return companyName;
    }

    /**
     * First name of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * First name of the contact person.
     * @return the value
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     * Last name of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * Last name of the contact person.
     * @return the value
     **/
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BillingAddress(");
        sb.append("addressKey=").append(String.valueOf(this.addressKey));
        sb.append(", line1=").append(String.valueOf(this.line1));
        sb.append(", line2=").append(String.valueOf(this.line2));
        sb.append(", city=").append(String.valueOf(this.city));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", postalCode=").append(String.valueOf(this.postalCode));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append(", companyName=").append(String.valueOf(this.companyName));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BillingAddress)) {
            return false;
        }

        BillingAddress other = (BillingAddress) o;
        return java.util.Objects.equals(this.addressKey, other.addressKey)
                && java.util.Objects.equals(this.line1, other.line1)
                && java.util.Objects.equals(this.line2, other.line2)
                && java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.postalCode, other.postalCode)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && java.util.Objects.equals(this.companyName, other.companyName)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.addressKey == null ? 43 : this.addressKey.hashCode());
        result = (result * PRIME) + (this.line1 == null ? 43 : this.line1.hashCode());
        result = (result * PRIME) + (this.line2 == null ? 43 : this.line2.hashCode());
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.postalCode == null ? 43 : this.postalCode.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
        result = (result * PRIME) + (this.companyName == null ? 43 : this.companyName.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
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
