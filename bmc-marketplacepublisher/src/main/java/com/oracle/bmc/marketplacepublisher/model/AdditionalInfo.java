/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Additional information about the lead <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AdditionalInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdditionalInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "company",
        "companyAddress",
        "email",
        "firstName",
        "lastName",
        "phone",
        "notes"
    })
    public AdditionalInfo(
            String company,
            String companyAddress,
            String email,
            String firstName,
            String lastName,
            String phone,
            String notes) {
        super();
        this.company = company;
        this.companyAddress = companyAddress;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.notes = notes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The company name */
        @com.fasterxml.jackson.annotation.JsonProperty("company")
        private String company;

        /**
         * The company name
         *
         * @param company the value to set
         * @return this builder
         */
        public Builder company(String company) {
            this.company = company;
            this.__explicitlySet__.add("company");
            return this;
        }
        /** The company address */
        @com.fasterxml.jackson.annotation.JsonProperty("companyAddress")
        private String companyAddress;

        /**
         * The company address
         *
         * @param companyAddress the value to set
         * @return this builder
         */
        public Builder companyAddress(String companyAddress) {
            this.companyAddress = companyAddress;
            this.__explicitlySet__.add("companyAddress");
            return this;
        }
        /** The email address */
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * The email address
         *
         * @param email the value to set
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /** The first name */
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * The first name
         *
         * @param firstName the value to set
         * @return this builder
         */
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /** The last name */
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * The last name
         *
         * @param lastName the value to set
         * @return this builder
         */
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }
        /** The phone number */
        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        private String phone;

        /**
         * The phone number
         *
         * @param phone the value to set
         * @return this builder
         */
        public Builder phone(String phone) {
            this.phone = phone;
            this.__explicitlySet__.add("phone");
            return this;
        }
        /** Additional notes */
        @com.fasterxml.jackson.annotation.JsonProperty("notes")
        private String notes;

        /**
         * Additional notes
         *
         * @param notes the value to set
         * @return this builder
         */
        public Builder notes(String notes) {
            this.notes = notes;
            this.__explicitlySet__.add("notes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdditionalInfo build() {
            AdditionalInfo model =
                    new AdditionalInfo(
                            this.company,
                            this.companyAddress,
                            this.email,
                            this.firstName,
                            this.lastName,
                            this.phone,
                            this.notes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdditionalInfo model) {
            if (model.wasPropertyExplicitlySet("company")) {
                this.company(model.getCompany());
            }
            if (model.wasPropertyExplicitlySet("companyAddress")) {
                this.companyAddress(model.getCompanyAddress());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("firstName")) {
                this.firstName(model.getFirstName());
            }
            if (model.wasPropertyExplicitlySet("lastName")) {
                this.lastName(model.getLastName());
            }
            if (model.wasPropertyExplicitlySet("phone")) {
                this.phone(model.getPhone());
            }
            if (model.wasPropertyExplicitlySet("notes")) {
                this.notes(model.getNotes());
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

    /** The company name */
    @com.fasterxml.jackson.annotation.JsonProperty("company")
    private final String company;

    /**
     * The company name
     *
     * @return the value
     */
    public String getCompany() {
        return company;
    }

    /** The company address */
    @com.fasterxml.jackson.annotation.JsonProperty("companyAddress")
    private final String companyAddress;

    /**
     * The company address
     *
     * @return the value
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /** The email address */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * The email address
     *
     * @return the value
     */
    public String getEmail() {
        return email;
    }

    /** The first name */
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * The first name
     *
     * @return the value
     */
    public String getFirstName() {
        return firstName;
    }

    /** The last name */
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * The last name
     *
     * @return the value
     */
    public String getLastName() {
        return lastName;
    }

    /** The phone number */
    @com.fasterxml.jackson.annotation.JsonProperty("phone")
    private final String phone;

    /**
     * The phone number
     *
     * @return the value
     */
    public String getPhone() {
        return phone;
    }

    /** Additional notes */
    @com.fasterxml.jackson.annotation.JsonProperty("notes")
    private final String notes;

    /**
     * Additional notes
     *
     * @return the value
     */
    public String getNotes() {
        return notes;
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
        sb.append("AdditionalInfo(");
        sb.append("super=").append(super.toString());
        sb.append("company=").append(String.valueOf(this.company));
        sb.append(", companyAddress=").append(String.valueOf(this.companyAddress));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(", phone=").append(String.valueOf(this.phone));
        sb.append(", notes=").append(String.valueOf(this.notes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdditionalInfo)) {
            return false;
        }

        AdditionalInfo other = (AdditionalInfo) o;
        return java.util.Objects.equals(this.company, other.company)
                && java.util.Objects.equals(this.companyAddress, other.companyAddress)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.phone, other.phone)
                && java.util.Objects.equals(this.notes, other.notes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.company == null ? 43 : this.company.hashCode());
        result =
                (result * PRIME)
                        + (this.companyAddress == null ? 43 : this.companyAddress.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result = (result * PRIME) + (this.phone == null ? 43 : this.phone.hashCode());
        result = (result * PRIME) + (this.notes == null ? 43 : this.notes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
