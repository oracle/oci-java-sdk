/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Contact details for the customer.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Contact.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Contact {
    @Deprecated
    @java.beans.ConstructorProperties({
        "contactName",
        "contactEmail",
        "contactPhone",
        "contactType"
    })
    public Contact(
            String contactName, String contactEmail, String contactPhone, ContactType contactType) {
        super();
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.contactType = contactType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactName")
        private String contactName;

        /**
         * The name of the contact person.
         * @param contactName the value to set
         * @return this builder
         **/
        public Builder contactName(String contactName) {
            this.contactName = contactName;
            this.__explicitlySet__.add("contactName");
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
         * The phone number of the contact person.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
        private String contactPhone;

        /**
         * The phone number of the contact person.
         * @param contactPhone the value to set
         * @return this builder
         **/
        public Builder contactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            this.__explicitlySet__.add("contactPhone");
            return this;
        }
        /**
         * The type of contact, such as primary or alternate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contactType")
        private ContactType contactType;

        /**
         * The type of contact, such as primary or alternate.
         * @param contactType the value to set
         * @return this builder
         **/
        public Builder contactType(ContactType contactType) {
            this.contactType = contactType;
            this.__explicitlySet__.add("contactType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Contact build() {
            Contact __instance__ =
                    new Contact(contactName, contactEmail, contactPhone, contactType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Contact o) {
            Builder copiedBuilder =
                    contactName(o.getContactName())
                            .contactEmail(o.getContactEmail())
                            .contactPhone(o.getContactPhone())
                            .contactType(o.getContactType());

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
     * The name of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactName")
    private final String contactName;

    /**
     * The name of the contact person.
     * @return the value
     **/
    public String getContactName() {
        return contactName;
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
     * The phone number of the contact person.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactPhone")
    private final String contactPhone;

    /**
     * The phone number of the contact person.
     * @return the value
     **/
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * The type of contact, such as primary or alternate.
     **/
    public enum ContactType {
        Primary("PRIMARY"),
        Alternate("ALTERNATE"),
        Secondary("SECONDARY"),
        Admin("ADMIN"),
        Manager("MANAGER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The type of contact, such as primary or alternate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contactType")
    private final ContactType contactType;

    /**
     * The type of contact, such as primary or alternate.
     * @return the value
     **/
    public ContactType getContactType() {
        return contactType;
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
        sb.append("Contact(");
        sb.append("contactName=").append(String.valueOf(this.contactName));
        sb.append(", contactEmail=").append(String.valueOf(this.contactEmail));
        sb.append(", contactPhone=").append(String.valueOf(this.contactPhone));
        sb.append(", contactType=").append(String.valueOf(this.contactType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.contactPhone, other.contactPhone)
                && java.util.Objects.equals(this.contactType, other.contactType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.contactName == null ? 43 : this.contactName.hashCode());
        result = (result * PRIME) + (this.contactEmail == null ? 43 : this.contactEmail.hashCode());
        result = (result * PRIME) + (this.contactPhone == null ? 43 : this.contactPhone.hashCode());
        result = (result * PRIME) + (this.contactType == null ? 43 : this.contactType.hashCode());
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
