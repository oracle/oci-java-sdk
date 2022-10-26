/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Address details model <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BillToAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class BillToAddress extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Name of the contact person */
        @com.fasterxml.jackson.annotation.JsonProperty("contactName")
        private String contactName;

        /**
         * Name of the contact person
         *
         * @param contactName the value to set
         * @return this builder
         */
        public Builder contactName(String contactName) {
            this.contactName = contactName;
            this.__explicitlySet__.add("contactName");
            return this;
        }
        /** Name of the customer company */
        @com.fasterxml.jackson.annotation.JsonProperty("companyName")
        private String companyName;

        /**
         * Name of the customer company
         *
         * @param companyName the value to set
         * @return this builder
         */
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            this.__explicitlySet__.add("companyName");
            return this;
        }
        /** Address line 1 */
        @com.fasterxml.jackson.annotation.JsonProperty("addressLine1")
        private String addressLine1;

        /**
         * Address line 1
         *
         * @param addressLine1 the value to set
         * @return this builder
         */
        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            this.__explicitlySet__.add("addressLine1");
            return this;
        }
        /** Address line 2 */
        @com.fasterxml.jackson.annotation.JsonProperty("addressLine2")
        private String addressLine2;

        /**
         * Address line 2
         *
         * @param addressLine2 the value to set
         * @return this builder
         */
        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            this.__explicitlySet__.add("addressLine2");
            return this;
        }
        /** Address line 3 */
        @com.fasterxml.jackson.annotation.JsonProperty("addressLine3")
        private String addressLine3;

        /**
         * Address line 3
         *
         * @param addressLine3 the value to set
         * @return this builder
         */
        public Builder addressLine3(String addressLine3) {
            this.addressLine3 = addressLine3;
            this.__explicitlySet__.add("addressLine3");
            return this;
        }
        /** Address line 4 */
        @com.fasterxml.jackson.annotation.JsonProperty("addressLine4")
        private String addressLine4;

        /**
         * Address line 4
         *
         * @param addressLine4 the value to set
         * @return this builder
         */
        public Builder addressLine4(String addressLine4) {
            this.addressLine4 = addressLine4;
            this.__explicitlySet__.add("addressLine4");
            return this;
        }
        /** Street name */
        @com.fasterxml.jackson.annotation.JsonProperty("streetName")
        private String streetName;

        /**
         * Street name
         *
         * @param streetName the value to set
         * @return this builder
         */
        public Builder streetName(String streetName) {
            this.streetName = streetName;
            this.__explicitlySet__.add("streetName");
            return this;
        }
        /** House no */
        @com.fasterxml.jackson.annotation.JsonProperty("streetNumber")
        private String streetNumber;

        /**
         * House no
         *
         * @param streetNumber the value to set
         * @return this builder
         */
        public Builder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            this.__explicitlySet__.add("streetNumber");
            return this;
        }
        /** Name of the city */
        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        /**
         * Name of the city
         *
         * @param city the value to set
         * @return this builder
         */
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
        /** County name */
        @com.fasterxml.jackson.annotation.JsonProperty("county")
        private String county;

        /**
         * County name
         *
         * @param county the value to set
         * @return this builder
         */
        public Builder county(String county) {
            this.county = county;
            this.__explicitlySet__.add("county");
            return this;
        }
        /** Name of the state */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * Name of the state
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** ZIP no */
        @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
        private String postalCode;

        /**
         * ZIP no
         *
         * @param postalCode the value to set
         * @return this builder
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            this.__explicitlySet__.add("postalCode");
            return this;
        }
        /** Name of the province */
        @com.fasterxml.jackson.annotation.JsonProperty("province")
        private String province;

        /**
         * Name of the province
         *
         * @param province the value to set
         * @return this builder
         */
        public Builder province(String province) {
            this.province = province;
            this.__explicitlySet__.add("province");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BillToAddress build() {
            BillToAddress model =
                    new BillToAddress(
                            this.contactName,
                            this.companyName,
                            this.addressLine1,
                            this.addressLine2,
                            this.addressLine3,
                            this.addressLine4,
                            this.streetName,
                            this.streetNumber,
                            this.city,
                            this.country,
                            this.county,
                            this.state,
                            this.postalCode,
                            this.province);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BillToAddress model) {
            if (model.wasPropertyExplicitlySet("contactName")) {
                this.contactName(model.getContactName());
            }
            if (model.wasPropertyExplicitlySet("companyName")) {
                this.companyName(model.getCompanyName());
            }
            if (model.wasPropertyExplicitlySet("addressLine1")) {
                this.addressLine1(model.getAddressLine1());
            }
            if (model.wasPropertyExplicitlySet("addressLine2")) {
                this.addressLine2(model.getAddressLine2());
            }
            if (model.wasPropertyExplicitlySet("addressLine3")) {
                this.addressLine3(model.getAddressLine3());
            }
            if (model.wasPropertyExplicitlySet("addressLine4")) {
                this.addressLine4(model.getAddressLine4());
            }
            if (model.wasPropertyExplicitlySet("streetName")) {
                this.streetName(model.getStreetName());
            }
            if (model.wasPropertyExplicitlySet("streetNumber")) {
                this.streetNumber(model.getStreetNumber());
            }
            if (model.wasPropertyExplicitlySet("city")) {
                this.city(model.getCity());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("county")) {
                this.county(model.getCounty());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("postalCode")) {
                this.postalCode(model.getPostalCode());
            }
            if (model.wasPropertyExplicitlySet("province")) {
                this.province(model.getProvince());
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

    /** Name of the contact person */
    @com.fasterxml.jackson.annotation.JsonProperty("contactName")
    private final String contactName;

    /**
     * Name of the contact person
     *
     * @return the value
     */
    public String getContactName() {
        return contactName;
    }

    /** Name of the customer company */
    @com.fasterxml.jackson.annotation.JsonProperty("companyName")
    private final String companyName;

    /**
     * Name of the customer company
     *
     * @return the value
     */
    public String getCompanyName() {
        return companyName;
    }

    /** Address line 1 */
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine1")
    private final String addressLine1;

    /**
     * Address line 1
     *
     * @return the value
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /** Address line 2 */
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine2")
    private final String addressLine2;

    /**
     * Address line 2
     *
     * @return the value
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /** Address line 3 */
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine3")
    private final String addressLine3;

    /**
     * Address line 3
     *
     * @return the value
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /** Address line 4 */
    @com.fasterxml.jackson.annotation.JsonProperty("addressLine4")
    private final String addressLine4;

    /**
     * Address line 4
     *
     * @return the value
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /** Street name */
    @com.fasterxml.jackson.annotation.JsonProperty("streetName")
    private final String streetName;

    /**
     * Street name
     *
     * @return the value
     */
    public String getStreetName() {
        return streetName;
    }

    /** House no */
    @com.fasterxml.jackson.annotation.JsonProperty("streetNumber")
    private final String streetNumber;

    /**
     * House no
     *
     * @return the value
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /** Name of the city */
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    /**
     * Name of the city
     *
     * @return the value
     */
    public String getCity() {
        return city;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final Country country;

    public Country getCountry() {
        return country;
    }

    /** County name */
    @com.fasterxml.jackson.annotation.JsonProperty("county")
    private final String county;

    /**
     * County name
     *
     * @return the value
     */
    public String getCounty() {
        return county;
    }

    /** Name of the state */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * Name of the state
     *
     * @return the value
     */
    public String getState() {
        return state;
    }

    /** ZIP no */
    @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
    private final String postalCode;

    /**
     * ZIP no
     *
     * @return the value
     */
    public String getPostalCode() {
        return postalCode;
    }

    /** Name of the province */
    @com.fasterxml.jackson.annotation.JsonProperty("province")
    private final String province;

    /**
     * Name of the province
     *
     * @return the value
     */
    public String getProvince() {
        return province;
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
        sb.append("BillToAddress(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
