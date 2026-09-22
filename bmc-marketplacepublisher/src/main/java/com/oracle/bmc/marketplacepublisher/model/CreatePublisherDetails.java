/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Details to create a publisher.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreatePublisherDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreatePublisherDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "email",
        "businessPhoneNumber",
        "companyName",
        "companyDescription",
        "employeeCount",
        "opnNumber",
        "yearFounded",
        "city",
        "state",
        "country",
        "website",
        "contactPhoneNumber",
        "contactEmail",
        "compartmentId",
        "solutionDescription"
    })
    public CreatePublisherDetails(
            String email,
            String businessPhoneNumber,
            String companyName,
            String companyDescription,
            Long employeeCount,
            String opnNumber,
            Long yearFounded,
            String city,
            String state,
            String country,
            String website,
            String contactPhoneNumber,
            String contactEmail,
            String compartmentId,
            String solutionDescription) {
        super();
        this.email = email;
        this.businessPhoneNumber = businessPhoneNumber;
        this.companyName = companyName;
        this.companyDescription = companyDescription;
        this.employeeCount = employeeCount;
        this.opnNumber = opnNumber;
        this.yearFounded = yearFounded;
        this.city = city;
        this.state = state;
        this.country = country;
        this.website = website;
        this.contactPhoneNumber = contactPhoneNumber;
        this.contactEmail = contactEmail;
        this.compartmentId = compartmentId;
        this.solutionDescription = solutionDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Email address of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * Email address of the publisher.
         * @param email the value to set
         * @return this builder
         **/
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /**
         * The business phone number of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("businessPhoneNumber")
        private String businessPhoneNumber;

        /**
         * The business phone number of the publisher.
         * @param businessPhoneNumber the value to set
         * @return this builder
         **/
        public Builder businessPhoneNumber(String businessPhoneNumber) {
            this.businessPhoneNumber = businessPhoneNumber;
            this.__explicitlySet__.add("businessPhoneNumber");
            return this;
        }
        /**
         * The company name of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("companyName")
        private String companyName;

        /**
         * The company name of the publisher.
         * @param companyName the value to set
         * @return this builder
         **/
        public Builder companyName(String companyName) {
            this.companyName = companyName;
            this.__explicitlySet__.add("companyName");
            return this;
        }
        /**
         * The company name of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("companyDescription")
        private String companyDescription;

        /**
         * The company name of the publisher.
         * @param companyDescription the value to set
         * @return this builder
         **/
        public Builder companyDescription(String companyDescription) {
            this.companyDescription = companyDescription;
            this.__explicitlySet__.add("companyDescription");
            return this;
        }
        /**
         * Count of employees in publisher's company
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("employeeCount")
        private Long employeeCount;

        /**
         * Count of employees in publisher's company
         * @param employeeCount the value to set
         * @return this builder
         **/
        public Builder employeeCount(Long employeeCount) {
            this.employeeCount = employeeCount;
            this.__explicitlySet__.add("employeeCount");
            return this;
        }
        /**
         * OPN membership number of the publisher
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opnNumber")
        private String opnNumber;

        /**
         * OPN membership number of the publisher
         * @param opnNumber the value to set
         * @return this builder
         **/
        public Builder opnNumber(String opnNumber) {
            this.opnNumber = opnNumber;
            this.__explicitlySet__.add("opnNumber");
            return this;
        }
        /**
         * The year the publisher's company or organization was founded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("yearFounded")
        private Long yearFounded;

        /**
         * The year the publisher's company or organization was founded.
         * @param yearFounded the value to set
         * @return this builder
         **/
        public Builder yearFounded(Long yearFounded) {
            this.yearFounded = yearFounded;
            this.__explicitlySet__.add("yearFounded");
            return this;
        }
        /**
         * City
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        /**
         * City
         * @param city the value to set
         * @return this builder
         **/
        public Builder city(String city) {
            this.city = city;
            this.__explicitlySet__.add("city");
            return this;
        }
        /**
         * State
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * State
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * Country
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country
         * @param country the value to set
         * @return this builder
         **/
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /**
         * The publisher's website.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("website")
        private String website;

        /**
         * The publisher's website.
         * @param website the value to set
         * @return this builder
         **/
        public Builder website(String website) {
            this.website = website;
            this.__explicitlySet__.add("website");
            return this;
        }
        /**
         * The contact phone number of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactPhoneNumber")
        private String contactPhoneNumber;

        /**
         * The contact phone number of the publisher.
         * @param contactPhoneNumber the value to set
         * @return this builder
         **/
        public Builder contactPhoneNumber(String contactPhoneNumber) {
            this.contactPhoneNumber = contactPhoneNumber;
            this.__explicitlySet__.add("contactPhoneNumber");
            return this;
        }
        /**
         * The contact email address of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
        private String contactEmail;

        /**
         * The contact email address of the publisher.
         * @param contactEmail the value to set
         * @return this builder
         **/
        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            this.__explicitlySet__.add("contactEmail");
            return this;
        }
        /**
         * The tenancy(compartment) OCID of the publisher.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The tenancy(compartment) OCID of the publisher.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A description of the publisher solutions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("solutionDescription")
        private String solutionDescription;

        /**
         * A description of the publisher solutions.
         * @param solutionDescription the value to set
         * @return this builder
         **/
        public Builder solutionDescription(String solutionDescription) {
            this.solutionDescription = solutionDescription;
            this.__explicitlySet__.add("solutionDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePublisherDetails build() {
            CreatePublisherDetails model =
                    new CreatePublisherDetails(
                            this.email,
                            this.businessPhoneNumber,
                            this.companyName,
                            this.companyDescription,
                            this.employeeCount,
                            this.opnNumber,
                            this.yearFounded,
                            this.city,
                            this.state,
                            this.country,
                            this.website,
                            this.contactPhoneNumber,
                            this.contactEmail,
                            this.compartmentId,
                            this.solutionDescription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePublisherDetails model) {
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("businessPhoneNumber")) {
                this.businessPhoneNumber(model.getBusinessPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("companyName")) {
                this.companyName(model.getCompanyName());
            }
            if (model.wasPropertyExplicitlySet("companyDescription")) {
                this.companyDescription(model.getCompanyDescription());
            }
            if (model.wasPropertyExplicitlySet("employeeCount")) {
                this.employeeCount(model.getEmployeeCount());
            }
            if (model.wasPropertyExplicitlySet("opnNumber")) {
                this.opnNumber(model.getOpnNumber());
            }
            if (model.wasPropertyExplicitlySet("yearFounded")) {
                this.yearFounded(model.getYearFounded());
            }
            if (model.wasPropertyExplicitlySet("city")) {
                this.city(model.getCity());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("website")) {
                this.website(model.getWebsite());
            }
            if (model.wasPropertyExplicitlySet("contactPhoneNumber")) {
                this.contactPhoneNumber(model.getContactPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("contactEmail")) {
                this.contactEmail(model.getContactEmail());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("solutionDescription")) {
                this.solutionDescription(model.getSolutionDescription());
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
     * Email address of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * Email address of the publisher.
     * @return the value
     **/
    public String getEmail() {
        return email;
    }

    /**
     * The business phone number of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("businessPhoneNumber")
    private final String businessPhoneNumber;

    /**
     * The business phone number of the publisher.
     * @return the value
     **/
    public String getBusinessPhoneNumber() {
        return businessPhoneNumber;
    }

    /**
     * The company name of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("companyName")
    private final String companyName;

    /**
     * The company name of the publisher.
     * @return the value
     **/
    public String getCompanyName() {
        return companyName;
    }

    /**
     * The company name of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("companyDescription")
    private final String companyDescription;

    /**
     * The company name of the publisher.
     * @return the value
     **/
    public String getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Count of employees in publisher's company
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("employeeCount")
    private final Long employeeCount;

    /**
     * Count of employees in publisher's company
     * @return the value
     **/
    public Long getEmployeeCount() {
        return employeeCount;
    }

    /**
     * OPN membership number of the publisher
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opnNumber")
    private final String opnNumber;

    /**
     * OPN membership number of the publisher
     * @return the value
     **/
    public String getOpnNumber() {
        return opnNumber;
    }

    /**
     * The year the publisher's company or organization was founded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("yearFounded")
    private final Long yearFounded;

    /**
     * The year the publisher's company or organization was founded.
     * @return the value
     **/
    public Long getYearFounded() {
        return yearFounded;
    }

    /**
     * City
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    /**
     * City
     * @return the value
     **/
    public String getCity() {
        return city;
    }

    /**
     * State
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * State
     * @return the value
     **/
    public String getState() {
        return state;
    }

    /**
     * Country
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country
     * @return the value
     **/
    public String getCountry() {
        return country;
    }

    /**
     * The publisher's website.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("website")
    private final String website;

    /**
     * The publisher's website.
     * @return the value
     **/
    public String getWebsite() {
        return website;
    }

    /**
     * The contact phone number of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactPhoneNumber")
    private final String contactPhoneNumber;

    /**
     * The contact phone number of the publisher.
     * @return the value
     **/
    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    /**
     * The contact email address of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    private final String contactEmail;

    /**
     * The contact email address of the publisher.
     * @return the value
     **/
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * The tenancy(compartment) OCID of the publisher.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The tenancy(compartment) OCID of the publisher.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A description of the publisher solutions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("solutionDescription")
    private final String solutionDescription;

    /**
     * A description of the publisher solutions.
     * @return the value
     **/
    public String getSolutionDescription() {
        return solutionDescription;
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
        sb.append("CreatePublisherDetails(");
        sb.append("super=").append(super.toString());
        sb.append("email=").append(String.valueOf(this.email));
        sb.append(", businessPhoneNumber=").append(String.valueOf(this.businessPhoneNumber));
        sb.append(", companyName=").append(String.valueOf(this.companyName));
        sb.append(", companyDescription=").append(String.valueOf(this.companyDescription));
        sb.append(", employeeCount=").append(String.valueOf(this.employeeCount));
        sb.append(", opnNumber=").append(String.valueOf(this.opnNumber));
        sb.append(", yearFounded=").append(String.valueOf(this.yearFounded));
        sb.append(", city=").append(String.valueOf(this.city));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", website=").append(String.valueOf(this.website));
        sb.append(", contactPhoneNumber=").append(String.valueOf(this.contactPhoneNumber));
        sb.append(", contactEmail=").append(String.valueOf(this.contactEmail));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", solutionDescription=").append(String.valueOf(this.solutionDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePublisherDetails)) {
            return false;
        }

        CreatePublisherDetails other = (CreatePublisherDetails) o;
        return java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.businessPhoneNumber, other.businessPhoneNumber)
                && java.util.Objects.equals(this.companyName, other.companyName)
                && java.util.Objects.equals(this.companyDescription, other.companyDescription)
                && java.util.Objects.equals(this.employeeCount, other.employeeCount)
                && java.util.Objects.equals(this.opnNumber, other.opnNumber)
                && java.util.Objects.equals(this.yearFounded, other.yearFounded)
                && java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.website, other.website)
                && java.util.Objects.equals(this.contactPhoneNumber, other.contactPhoneNumber)
                && java.util.Objects.equals(this.contactEmail, other.contactEmail)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.solutionDescription, other.solutionDescription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result =
                (result * PRIME)
                        + (this.businessPhoneNumber == null
                                ? 43
                                : this.businessPhoneNumber.hashCode());
        result = (result * PRIME) + (this.companyName == null ? 43 : this.companyName.hashCode());
        result =
                (result * PRIME)
                        + (this.companyDescription == null
                                ? 43
                                : this.companyDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.employeeCount == null ? 43 : this.employeeCount.hashCode());
        result = (result * PRIME) + (this.opnNumber == null ? 43 : this.opnNumber.hashCode());
        result = (result * PRIME) + (this.yearFounded == null ? 43 : this.yearFounded.hashCode());
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.website == null ? 43 : this.website.hashCode());
        result =
                (result * PRIME)
                        + (this.contactPhoneNumber == null
                                ? 43
                                : this.contactPhoneNumber.hashCode());
        result = (result * PRIME) + (this.contactEmail == null ? 43 : this.contactEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.solutionDescription == null
                                ? 43
                                : this.solutionDescription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
