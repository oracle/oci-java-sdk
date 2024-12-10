/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the user.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class User extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "firstName",
        "lastName",
        "country",
        "csi",
        "phone",
        "timezone",
        "organizationName",
        "compartmentId",
        "contactEmail",
        "problemType"
    })
    public User(
            String key,
            String firstName,
            String lastName,
            String country,
            String csi,
            String phone,
            String timezone,
            String organizationName,
            String compartmentId,
            String contactEmail,
            ProblemType problemType) {
        super();
        this.key = key;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.csi = csi;
        this.phone = phone;
        this.timezone = timezone;
        this.organizationName = organizationName;
        this.compartmentId = compartmentId;
        this.contactEmail = contactEmail;
        this.problemType = problemType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique identifier for the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * A unique identifier for the user.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The user's first name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * The user's first name.
         * @param firstName the value to set
         * @return this builder
         **/
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /**
         * The user's last name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * The user's last name.
         * @param lastName the value to set
         * @return this builder
         **/
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }
        /**
         * The country of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * The country of the user.
         * @param country the value to set
         * @return this builder
         **/
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /**
         * The CSI associated with the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private String csi;

        /**
         * The CSI associated with the user.
         * @param csi the value to set
         * @return this builder
         **/
        public Builder csi(String csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }
        /**
         * The user's contact phone number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        private String phone;

        /**
         * The user's contact phone number.
         * @param phone the value to set
         * @return this builder
         **/
        public Builder phone(String phone) {
            this.phone = phone;
            this.__explicitlySet__.add("phone");
            return this;
        }
        /**
         * The timezone of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * The timezone of the user.
         * @param timezone the value to set
         * @return this builder
         **/
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }
        /**
         * The company that the user belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
        private String organizationName;

        /**
         * The company that the user belongs to.
         * @param organizationName the value to set
         * @return this builder
         **/
        public Builder organizationName(String organizationName) {
            this.organizationName = organizationName;
            this.__explicitlySet__.add("organizationName");
            return this;
        }
        /**
         * The OCID of the tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The email of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
        private String contactEmail;

        /**
         * The email of the contact person.
         * @param contactEmail the value to set
         * @return this builder
         **/
        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            this.__explicitlySet__.add("contactEmail");
            return this;
        }
        /**
         * The kind of support ticket (type of support request).
         * For information about {@code ACCOUNT} support tickets, see
         * [Creating a Billing Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
         * For information about {@code LIMIT} support tickets, see
         * [Creating a Service Limit Increase Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
         * For information about {@code TECH} support tickets, see
         * [Creating a Technical Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemType")
        private ProblemType problemType;

        /**
         * The kind of support ticket (type of support request).
         * For information about {@code ACCOUNT} support tickets, see
         * [Creating a Billing Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
         * For information about {@code LIMIT} support tickets, see
         * [Creating a Service Limit Increase Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
         * For information about {@code TECH} support tickets, see
         * [Creating a Technical Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
         *
         * @param problemType the value to set
         * @return this builder
         **/
        public Builder problemType(ProblemType problemType) {
            this.problemType = problemType;
            this.__explicitlySet__.add("problemType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public User build() {
            User model =
                    new User(
                            this.key,
                            this.firstName,
                            this.lastName,
                            this.country,
                            this.csi,
                            this.phone,
                            this.timezone,
                            this.organizationName,
                            this.compartmentId,
                            this.contactEmail,
                            this.problemType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(User model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("firstName")) {
                this.firstName(model.getFirstName());
            }
            if (model.wasPropertyExplicitlySet("lastName")) {
                this.lastName(model.getLastName());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("csi")) {
                this.csi(model.getCsi());
            }
            if (model.wasPropertyExplicitlySet("phone")) {
                this.phone(model.getPhone());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet("organizationName")) {
                this.organizationName(model.getOrganizationName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("contactEmail")) {
                this.contactEmail(model.getContactEmail());
            }
            if (model.wasPropertyExplicitlySet("problemType")) {
                this.problemType(model.getProblemType());
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
     * A unique identifier for the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A unique identifier for the user.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The user's first name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * The user's first name.
     * @return the value
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     * The user's last name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * The user's last name.
     * @return the value
     **/
    public String getLastName() {
        return lastName;
    }

    /**
     * The country of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * The country of the user.
     * @return the value
     **/
    public String getCountry() {
        return country;
    }

    /**
     * The CSI associated with the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    private final String csi;

    /**
     * The CSI associated with the user.
     * @return the value
     **/
    public String getCsi() {
        return csi;
    }

    /**
     * The user's contact phone number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phone")
    private final String phone;

    /**
     * The user's contact phone number.
     * @return the value
     **/
    public String getPhone() {
        return phone;
    }

    /**
     * The timezone of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * The timezone of the user.
     * @return the value
     **/
    public String getTimezone() {
        return timezone;
    }

    /**
     * The company that the user belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
    private final String organizationName;

    /**
     * The company that the user belongs to.
     * @return the value
     **/
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The email of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    private final String contactEmail;

    /**
     * The email of the contact person.
     * @return the value
     **/
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * The kind of support ticket (type of support request).
     * For information about {@code ACCOUNT} support tickets, see
     * [Creating a Billing Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
     * For information about {@code LIMIT} support tickets, see
     * [Creating a Service Limit Increase Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
     * For information about {@code TECH} support tickets, see
     * [Creating a Technical Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemType")
    private final ProblemType problemType;

    /**
     * The kind of support ticket (type of support request).
     * For information about {@code ACCOUNT} support tickets, see
     * [Creating a Billing Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-billing.htm).
     * For information about {@code LIMIT} support tickets, see
     * [Creating a Service Limit Increase Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm).
     * For information about {@code TECH} support tickets, see
     * [Creating a Technical Support Request](https://docs.cloud.oracle.com/iaas/Content/GSG/support/create-incident-technical.htm).
     *
     * @return the value
     **/
    public ProblemType getProblemType() {
        return problemType;
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
        sb.append("User(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", csi=").append(String.valueOf(this.csi));
        sb.append(", phone=").append(String.valueOf(this.phone));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", organizationName=").append(String.valueOf(this.organizationName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", contactEmail=").append(String.valueOf(this.contactEmail));
        sb.append(", problemType=").append(String.valueOf(this.problemType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User other = (User) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(this.phone, other.phone)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.organizationName, other.organizationName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.contactEmail, other.contactEmail)
                && java.util.Objects.equals(this.problemType, other.problemType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result = (result * PRIME) + (this.phone == null ? 43 : this.phone.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result =
                (result * PRIME)
                        + (this.organizationName == null ? 43 : this.organizationName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.contactEmail == null ? 43 : this.contactEmail.hashCode());
        result = (result * PRIME) + (this.problemType == null ? 43 : this.problemType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
