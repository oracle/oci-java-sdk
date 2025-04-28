/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Contact details for the customer. Avoid entering confidential information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Contact.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Contact extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "contactName",
        "contactEmail",
        "email",
        "contactPhone",
        "contactType"
    })
    public Contact(
            String contactName,
            String contactEmail,
            String email,
            String contactPhone,
            ContactType contactType) {
        super();
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.email = email;
        this.contactPhone = contactPhone;
        this.contactType = contactType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the contact person. */
        @com.fasterxml.jackson.annotation.JsonProperty("contactName")
        private String contactName;

        /**
         * The name of the contact person.
         *
         * @param contactName the value to set
         * @return this builder
         */
        public Builder contactName(String contactName) {
            this.contactName = contactName;
            this.__explicitlySet__.add("contactName");
            return this;
        }
        /** The email of the contact person. */
        @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
        private String contactEmail;

        /**
         * The email of the contact person.
         *
         * @param contactEmail the value to set
         * @return this builder
         */
        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            this.__explicitlySet__.add("contactEmail");
            return this;
        }
        /** The email of the contact person. */
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * The email of the contact person.
         *
         * @param email the value to set
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /** The phone number of the contact person. */
        @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
        private String contactPhone;

        /**
         * The phone number of the contact person.
         *
         * @param contactPhone the value to set
         * @return this builder
         */
        public Builder contactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            this.__explicitlySet__.add("contactPhone");
            return this;
        }
        /** The type of contact, such as primary or alternate. */
        @com.fasterxml.jackson.annotation.JsonProperty("contactType")
        private ContactType contactType;

        /**
         * The type of contact, such as primary or alternate.
         *
         * @param contactType the value to set
         * @return this builder
         */
        public Builder contactType(ContactType contactType) {
            this.contactType = contactType;
            this.__explicitlySet__.add("contactType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Contact build() {
            Contact model =
                    new Contact(
                            this.contactName,
                            this.contactEmail,
                            this.email,
                            this.contactPhone,
                            this.contactType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Contact model) {
            if (model.wasPropertyExplicitlySet("contactName")) {
                this.contactName(model.getContactName());
            }
            if (model.wasPropertyExplicitlySet("contactEmail")) {
                this.contactEmail(model.getContactEmail());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("contactPhone")) {
                this.contactPhone(model.getContactPhone());
            }
            if (model.wasPropertyExplicitlySet("contactType")) {
                this.contactType(model.getContactType());
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

    /** The name of the contact person. */
    @com.fasterxml.jackson.annotation.JsonProperty("contactName")
    private final String contactName;

    /**
     * The name of the contact person.
     *
     * @return the value
     */
    public String getContactName() {
        return contactName;
    }

    /** The email of the contact person. */
    @com.fasterxml.jackson.annotation.JsonProperty("contactEmail")
    private final String contactEmail;

    /**
     * The email of the contact person.
     *
     * @return the value
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /** The email of the contact person. */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * The email of the contact person.
     *
     * @return the value
     */
    public String getEmail() {
        return email;
    }

    /** The phone number of the contact person. */
    @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
    private final String contactPhone;

    /**
     * The phone number of the contact person.
     *
     * @return the value
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /** The type of contact, such as primary or alternate. */
    public enum ContactType implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Alternate("ALTERNATE"),
        Secondary("SECONDARY"),
        Admin("ADMIN"),
        Manager("MANAGER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ContactType.class);

        private final String value;
        private static java.util.Map<String, ContactType> map;

        static {
            map = new java.util.HashMap<>();
            for (ContactType v : ContactType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ContactType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContactType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ContactType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of contact, such as primary or alternate. */
    @com.fasterxml.jackson.annotation.JsonProperty("contactType")
    private final ContactType contactType;

    /**
     * The type of contact, such as primary or alternate.
     *
     * @return the value
     */
    public ContactType getContactType() {
        return contactType;
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
        sb.append("Contact(");
        sb.append("super=").append(super.toString());
        sb.append("contactName=").append(String.valueOf(this.contactName));
        sb.append(", contactEmail=").append(String.valueOf(this.contactEmail));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(", contactPhone=").append(String.valueOf(this.contactPhone));
        sb.append(", contactType=").append(String.valueOf(this.contactType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Contact)) {
            return false;
        }

        Contact other = (Contact) o;
        return java.util.Objects.equals(this.contactName, other.contactName)
                && java.util.Objects.equals(this.contactEmail, other.contactEmail)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.contactPhone, other.contactPhone)
                && java.util.Objects.equals(this.contactType, other.contactType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.contactName == null ? 43 : this.contactName.hashCode());
        result = (result * PRIME) + (this.contactEmail == null ? 43 : this.contactEmail.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + (this.contactPhone == null ? 43 : this.contactPhone.hashCode());
        result = (result * PRIME) + (this.contactType == null ? 43 : this.contactType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
