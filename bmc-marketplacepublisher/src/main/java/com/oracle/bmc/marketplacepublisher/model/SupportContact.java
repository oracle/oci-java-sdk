/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Contact information to use to get support. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SupportContact.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SupportContact
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "phone", "email", "subject"})
    public SupportContact(String name, String phone, String email, String subject) {
        super();
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.subject = subject;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the contact. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the contact.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The phone number of the contact. */
        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        private String phone;

        /**
         * The phone number of the contact.
         *
         * @param phone the value to set
         * @return this builder
         */
        public Builder phone(String phone) {
            this.phone = phone;
            this.__explicitlySet__.add("phone");
            return this;
        }
        /** The email of the contact. */
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * The email of the contact.
         *
         * @param email the value to set
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /** The email subject line to use when contacting support. */
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private String subject;

        /**
         * The email subject line to use when contacting support.
         *
         * @param subject the value to set
         * @return this builder
         */
        public Builder subject(String subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SupportContact build() {
            SupportContact model =
                    new SupportContact(this.name, this.phone, this.email, this.subject);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SupportContact model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("phone")) {
                this.phone(model.getPhone());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
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

    /** The name of the contact. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the contact.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The phone number of the contact. */
    @com.fasterxml.jackson.annotation.JsonProperty("phone")
    private final String phone;

    /**
     * The phone number of the contact.
     *
     * @return the value
     */
    public String getPhone() {
        return phone;
    }

    /** The email of the contact. */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * The email of the contact.
     *
     * @return the value
     */
    public String getEmail() {
        return email;
    }

    /** The email subject line to use when contacting support. */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final String subject;

    /**
     * The email subject line to use when contacting support.
     *
     * @return the value
     */
    public String getSubject() {
        return subject;
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
        sb.append("SupportContact(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", phone=").append(String.valueOf(this.phone));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SupportContact)) {
            return false;
        }

        SupportContact other = (SupportContact) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.phone, other.phone)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.subject, other.subject)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.phone == null ? 43 : this.phone.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
