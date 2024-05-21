/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emaildataplane.model;

/**
 * Email address Object that holds display name and email address.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220926")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EmailAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmailAddress extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"email", "name"})
    public EmailAddress(String email, String name) {
        super();
        this.email = email;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ASCII only email address.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * ASCII only email address.
         * @param email the value to set
         * @return this builder
         **/
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /**
         * Display name for the email address. UTF-8 is supported for display name [RFC 2047](https://www.rfc-editor.org/rfc/rfc2047).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Display name for the email address. UTF-8 is supported for display name [RFC 2047](https://www.rfc-editor.org/rfc/rfc2047).
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmailAddress build() {
            EmailAddress model = new EmailAddress(this.email, this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmailAddress model) {
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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
     * ASCII only email address.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * ASCII only email address.
     * @return the value
     **/
    public String getEmail() {
        return email;
    }

    /**
     * Display name for the email address. UTF-8 is supported for display name [RFC 2047](https://www.rfc-editor.org/rfc/rfc2047).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Display name for the email address. UTF-8 is supported for display name [RFC 2047](https://www.rfc-editor.org/rfc/rfc2047).
     * @return the value
     **/
    public String getName() {
        return name;
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
        sb.append("EmailAddress(");
        sb.append("super=").append(super.toString());
        sb.append("email=").append(String.valueOf(this.email));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmailAddress)) {
            return false;
        }

        EmailAddress other = (EmailAddress) o;
        return java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
