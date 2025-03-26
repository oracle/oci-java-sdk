/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Address details model.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Address.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Address extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "addressKey",
        "line1",
        "line2",
        "line3",
        "line4",
        "streetName",
        "streetNumber",
        "city",
        "county",
        "country",
        "province",
        "postalCode",
        "state",
        "emailAddress",
        "companyName",
        "firstName",
        "middleName",
        "lastName",
        "phoneCountryCode",
        "phoneNumber",
        "jobTitle",
        "departmentName",
        "internalNumber",
        "contributorClass",
        "stateInscription",
        "municipalInscription"
    })
    public Address(
            String addressKey,
            String line1,
            String line2,
            String line3,
            String line4,
            String streetName,
            String streetNumber,
            String city,
            String county,
            String country,
            String province,
            String postalCode,
            String state,
            String emailAddress,
            String companyName,
            String firstName,
            String middleName,
            String lastName,
            String phoneCountryCode,
            String phoneNumber,
            String jobTitle,
            String departmentName,
            String internalNumber,
            String contributorClass,
            String stateInscription,
            String municipalInscription) {
        super();
        this.addressKey = addressKey;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.county = county;
        this.country = country;
        this.province = province;
        this.postalCode = postalCode;
        this.state = state;
        this.emailAddress = emailAddress;
        this.companyName = companyName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneCountryCode = phoneCountryCode;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
        this.departmentName = departmentName;
        this.internalNumber = internalNumber;
        this.contributorClass = contributorClass;
        this.stateInscription = stateInscription;
        this.municipalInscription = municipalInscription;
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
         * Address line 3.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("line3")
        private String line3;

        /**
         * Address line 3.
         * @param line3 the value to set
         * @return this builder
         **/
        public Builder line3(String line3) {
            this.line3 = line3;
            this.__explicitlySet__.add("line3");
            return this;
        }
        /**
         * Address line 4.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("line4")
        private String line4;

        /**
         * Address line 4.
         * @param line4 the value to set
         * @return this builder
         **/
        public Builder line4(String line4) {
            this.line4 = line4;
            this.__explicitlySet__.add("line4");
            return this;
        }
        /**
         * Street name of the address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("streetName")
        private String streetName;

        /**
         * Street name of the address.
         * @param streetName the value to set
         * @return this builder
         **/
        public Builder streetName(String streetName) {
            this.streetName = streetName;
            this.__explicitlySet__.add("streetName");
            return this;
        }
        /**
         * Street number of the address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("streetNumber")
        private String streetNumber;

        /**
         * Street number of the address.
         * @param streetNumber the value to set
         * @return this builder
         **/
        public Builder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            this.__explicitlySet__.add("streetNumber");
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
         * County of the address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("county")
        private String county;

        /**
         * County of the address.
         * @param county the value to set
         * @return this builder
         **/
        public Builder county(String county) {
            this.county = county;
            this.__explicitlySet__.add("county");
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
         * Province of the address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("province")
        private String province;

        /**
         * Province of the address.
         * @param province the value to set
         * @return this builder
         **/
        public Builder province(String province) {
            this.province = province;
            this.__explicitlySet__.add("province");
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
         * Middle name of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("middleName")
        private String middleName;

        /**
         * Middle name of the contact person.
         * @param middleName the value to set
         * @return this builder
         **/
        public Builder middleName(String middleName) {
            this.middleName = middleName;
            this.__explicitlySet__.add("middleName");
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
        /**
         * Phone country code of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phoneCountryCode")
        private String phoneCountryCode;

        /**
         * Phone country code of the contact person.
         * @param phoneCountryCode the value to set
         * @return this builder
         **/
        public Builder phoneCountryCode(String phoneCountryCode) {
            this.phoneCountryCode = phoneCountryCode;
            this.__explicitlySet__.add("phoneCountryCode");
            return this;
        }
        /**
         * Phone number of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
        private String phoneNumber;

        /**
         * Phone number of the contact person.
         * @param phoneNumber the value to set
         * @return this builder
         **/
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.__explicitlySet__.add("phoneNumber");
            return this;
        }
        /**
         * Job title of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobTitle")
        private String jobTitle;

        /**
         * Job title of the contact person.
         * @param jobTitle the value to set
         * @return this builder
         **/
        public Builder jobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            this.__explicitlySet__.add("jobTitle");
            return this;
        }
        /**
         * Department name of the customer company.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("departmentName")
        private String departmentName;

        /**
         * Department name of the customer company.
         * @param departmentName the value to set
         * @return this builder
         **/
        public Builder departmentName(String departmentName) {
            this.departmentName = departmentName;
            this.__explicitlySet__.add("departmentName");
            return this;
        }
        /**
         * Internal number of the customer company.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("internalNumber")
        private String internalNumber;

        /**
         * Internal number of the customer company.
         * @param internalNumber the value to set
         * @return this builder
         **/
        public Builder internalNumber(String internalNumber) {
            this.internalNumber = internalNumber;
            this.__explicitlySet__.add("internalNumber");
            return this;
        }
        /**
         * Contributor class of the customer company.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contributorClass")
        private String contributorClass;

        /**
         * Contributor class of the customer company.
         * @param contributorClass the value to set
         * @return this builder
         **/
        public Builder contributorClass(String contributorClass) {
            this.contributorClass = contributorClass;
            this.__explicitlySet__.add("contributorClass");
            return this;
        }
        /**
         * State Inscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stateInscription")
        private String stateInscription;

        /**
         * State Inscription.
         * @param stateInscription the value to set
         * @return this builder
         **/
        public Builder stateInscription(String stateInscription) {
            this.stateInscription = stateInscription;
            this.__explicitlySet__.add("stateInscription");
            return this;
        }
        /**
         * Municipal Inscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("municipalInscription")
        private String municipalInscription;

        /**
         * Municipal Inscription.
         * @param municipalInscription the value to set
         * @return this builder
         **/
        public Builder municipalInscription(String municipalInscription) {
            this.municipalInscription = municipalInscription;
            this.__explicitlySet__.add("municipalInscription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Address build() {
            Address model =
                    new Address(
                            this.addressKey,
                            this.line1,
                            this.line2,
                            this.line3,
                            this.line4,
                            this.streetName,
                            this.streetNumber,
                            this.city,
                            this.county,
                            this.country,
                            this.province,
                            this.postalCode,
                            this.state,
                            this.emailAddress,
                            this.companyName,
                            this.firstName,
                            this.middleName,
                            this.lastName,
                            this.phoneCountryCode,
                            this.phoneNumber,
                            this.jobTitle,
                            this.departmentName,
                            this.internalNumber,
                            this.contributorClass,
                            this.stateInscription,
                            this.municipalInscription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Address model) {
            if (model.wasPropertyExplicitlySet("addressKey")) {
                this.addressKey(model.getAddressKey());
            }
            if (model.wasPropertyExplicitlySet("line1")) {
                this.line1(model.getLine1());
            }
            if (model.wasPropertyExplicitlySet("line2")) {
                this.line2(model.getLine2());
            }
            if (model.wasPropertyExplicitlySet("line3")) {
                this.line3(model.getLine3());
            }
            if (model.wasPropertyExplicitlySet("line4")) {
                this.line4(model.getLine4());
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
            if (model.wasPropertyExplicitlySet("county")) {
                this.county(model.getCounty());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("province")) {
                this.province(model.getProvince());
            }
            if (model.wasPropertyExplicitlySet("postalCode")) {
                this.postalCode(model.getPostalCode());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("emailAddress")) {
                this.emailAddress(model.getEmailAddress());
            }
            if (model.wasPropertyExplicitlySet("companyName")) {
                this.companyName(model.getCompanyName());
            }
            if (model.wasPropertyExplicitlySet("firstName")) {
                this.firstName(model.getFirstName());
            }
            if (model.wasPropertyExplicitlySet("middleName")) {
                this.middleName(model.getMiddleName());
            }
            if (model.wasPropertyExplicitlySet("lastName")) {
                this.lastName(model.getLastName());
            }
            if (model.wasPropertyExplicitlySet("phoneCountryCode")) {
                this.phoneCountryCode(model.getPhoneCountryCode());
            }
            if (model.wasPropertyExplicitlySet("phoneNumber")) {
                this.phoneNumber(model.getPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("jobTitle")) {
                this.jobTitle(model.getJobTitle());
            }
            if (model.wasPropertyExplicitlySet("departmentName")) {
                this.departmentName(model.getDepartmentName());
            }
            if (model.wasPropertyExplicitlySet("internalNumber")) {
                this.internalNumber(model.getInternalNumber());
            }
            if (model.wasPropertyExplicitlySet("contributorClass")) {
                this.contributorClass(model.getContributorClass());
            }
            if (model.wasPropertyExplicitlySet("stateInscription")) {
                this.stateInscription(model.getStateInscription());
            }
            if (model.wasPropertyExplicitlySet("municipalInscription")) {
                this.municipalInscription(model.getMunicipalInscription());
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
     * Address line 3.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("line3")
    private final String line3;

    /**
     * Address line 3.
     * @return the value
     **/
    public String getLine3() {
        return line3;
    }

    /**
     * Address line 4.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("line4")
    private final String line4;

    /**
     * Address line 4.
     * @return the value
     **/
    public String getLine4() {
        return line4;
    }

    /**
     * Street name of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streetName")
    private final String streetName;

    /**
     * Street name of the address.
     * @return the value
     **/
    public String getStreetName() {
        return streetName;
    }

    /**
     * Street number of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("streetNumber")
    private final String streetNumber;

    /**
     * Street number of the address.
     * @return the value
     **/
    public String getStreetNumber() {
        return streetNumber;
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
     * County of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("county")
    private final String county;

    /**
     * County of the address.
     * @return the value
     **/
    public String getCounty() {
        return county;
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
     * Province of the address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("province")
    private final String province;

    /**
     * Province of the address.
     * @return the value
     **/
    public String getProvince() {
        return province;
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
     * Middle name of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("middleName")
    private final String middleName;

    /**
     * Middle name of the contact person.
     * @return the value
     **/
    public String getMiddleName() {
        return middleName;
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

    /**
     * Phone country code of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phoneCountryCode")
    private final String phoneCountryCode;

    /**
     * Phone country code of the contact person.
     * @return the value
     **/
    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    /**
     * Phone number of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
    private final String phoneNumber;

    /**
     * Phone number of the contact person.
     * @return the value
     **/
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Job title of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobTitle")
    private final String jobTitle;

    /**
     * Job title of the contact person.
     * @return the value
     **/
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Department name of the customer company.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("departmentName")
    private final String departmentName;

    /**
     * Department name of the customer company.
     * @return the value
     **/
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Internal number of the customer company.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalNumber")
    private final String internalNumber;

    /**
     * Internal number of the customer company.
     * @return the value
     **/
    public String getInternalNumber() {
        return internalNumber;
    }

    /**
     * Contributor class of the customer company.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contributorClass")
    private final String contributorClass;

    /**
     * Contributor class of the customer company.
     * @return the value
     **/
    public String getContributorClass() {
        return contributorClass;
    }

    /**
     * State Inscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stateInscription")
    private final String stateInscription;

    /**
     * State Inscription.
     * @return the value
     **/
    public String getStateInscription() {
        return stateInscription;
    }

    /**
     * Municipal Inscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("municipalInscription")
    private final String municipalInscription;

    /**
     * Municipal Inscription.
     * @return the value
     **/
    public String getMunicipalInscription() {
        return municipalInscription;
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
        sb.append("Address(");
        sb.append("super=").append(super.toString());
        sb.append("addressKey=").append(String.valueOf(this.addressKey));
        sb.append(", line1=").append(String.valueOf(this.line1));
        sb.append(", line2=").append(String.valueOf(this.line2));
        sb.append(", line3=").append(String.valueOf(this.line3));
        sb.append(", line4=").append(String.valueOf(this.line4));
        sb.append(", streetName=").append(String.valueOf(this.streetName));
        sb.append(", streetNumber=").append(String.valueOf(this.streetNumber));
        sb.append(", city=").append(String.valueOf(this.city));
        sb.append(", county=").append(String.valueOf(this.county));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", province=").append(String.valueOf(this.province));
        sb.append(", postalCode=").append(String.valueOf(this.postalCode));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append(", companyName=").append(String.valueOf(this.companyName));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", middleName=").append(String.valueOf(this.middleName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(", phoneCountryCode=").append(String.valueOf(this.phoneCountryCode));
        sb.append(", phoneNumber=").append(String.valueOf(this.phoneNumber));
        sb.append(", jobTitle=").append(String.valueOf(this.jobTitle));
        sb.append(", departmentName=").append(String.valueOf(this.departmentName));
        sb.append(", internalNumber=").append(String.valueOf(this.internalNumber));
        sb.append(", contributorClass=").append(String.valueOf(this.contributorClass));
        sb.append(", stateInscription=").append(String.valueOf(this.stateInscription));
        sb.append(", municipalInscription=").append(String.valueOf(this.municipalInscription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }

        Address other = (Address) o;
        return java.util.Objects.equals(this.addressKey, other.addressKey)
                && java.util.Objects.equals(this.line1, other.line1)
                && java.util.Objects.equals(this.line2, other.line2)
                && java.util.Objects.equals(this.line3, other.line3)
                && java.util.Objects.equals(this.line4, other.line4)
                && java.util.Objects.equals(this.streetName, other.streetName)
                && java.util.Objects.equals(this.streetNumber, other.streetNumber)
                && java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.county, other.county)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.province, other.province)
                && java.util.Objects.equals(this.postalCode, other.postalCode)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && java.util.Objects.equals(this.companyName, other.companyName)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.middleName, other.middleName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.phoneCountryCode, other.phoneCountryCode)
                && java.util.Objects.equals(this.phoneNumber, other.phoneNumber)
                && java.util.Objects.equals(this.jobTitle, other.jobTitle)
                && java.util.Objects.equals(this.departmentName, other.departmentName)
                && java.util.Objects.equals(this.internalNumber, other.internalNumber)
                && java.util.Objects.equals(this.contributorClass, other.contributorClass)
                && java.util.Objects.equals(this.stateInscription, other.stateInscription)
                && java.util.Objects.equals(this.municipalInscription, other.municipalInscription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.addressKey == null ? 43 : this.addressKey.hashCode());
        result = (result * PRIME) + (this.line1 == null ? 43 : this.line1.hashCode());
        result = (result * PRIME) + (this.line2 == null ? 43 : this.line2.hashCode());
        result = (result * PRIME) + (this.line3 == null ? 43 : this.line3.hashCode());
        result = (result * PRIME) + (this.line4 == null ? 43 : this.line4.hashCode());
        result = (result * PRIME) + (this.streetName == null ? 43 : this.streetName.hashCode());
        result = (result * PRIME) + (this.streetNumber == null ? 43 : this.streetNumber.hashCode());
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.county == null ? 43 : this.county.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.province == null ? 43 : this.province.hashCode());
        result = (result * PRIME) + (this.postalCode == null ? 43 : this.postalCode.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
        result = (result * PRIME) + (this.companyName == null ? 43 : this.companyName.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.middleName == null ? 43 : this.middleName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result =
                (result * PRIME)
                        + (this.phoneCountryCode == null ? 43 : this.phoneCountryCode.hashCode());
        result = (result * PRIME) + (this.phoneNumber == null ? 43 : this.phoneNumber.hashCode());
        result = (result * PRIME) + (this.jobTitle == null ? 43 : this.jobTitle.hashCode());
        result =
                (result * PRIME)
                        + (this.departmentName == null ? 43 : this.departmentName.hashCode());
        result =
                (result * PRIME)
                        + (this.internalNumber == null ? 43 : this.internalNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.contributorClass == null ? 43 : this.contributorClass.hashCode());
        result =
                (result * PRIME)
                        + (this.stateInscription == null ? 43 : this.stateInscription.hashCode());
        result =
                (result * PRIME)
                        + (this.municipalInscription == null
                                ? 43
                                : this.municipalInscription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
