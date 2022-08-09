/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * IDM admin credentials without password
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AdminUserSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdminUserSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"username", "emailAddress", "firstName", "lastName"})
    public AdminUserSummary(
            String username, String emailAddress, String firstName, String lastName) {
        super();
        this.username = username;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Admin username
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * Admin username
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * Admin users email address
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        /**
         * Admin users email address
         * @param emailAddress the value to set
         * @return this builder
         **/
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }
        /**
         * Admin users first name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * Admin users first name
         * @param firstName the value to set
         * @return this builder
         **/
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /**
         * Admin users last name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * Admin users last name
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

        public AdminUserSummary build() {
            AdminUserSummary model =
                    new AdminUserSummary(
                            this.username, this.emailAddress, this.firstName, this.lastName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminUserSummary model) {
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("emailAddress")) {
                this.emailAddress(model.getEmailAddress());
            }
            if (model.wasPropertyExplicitlySet("firstName")) {
                this.firstName(model.getFirstName());
            }
            if (model.wasPropertyExplicitlySet("lastName")) {
                this.lastName(model.getLastName());
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
     * Admin username
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * Admin username
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * Admin users email address
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    private final String emailAddress;

    /**
     * Admin users email address
     * @return the value
     **/
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Admin users first name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * Admin users first name
     * @return the value
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     * Admin users last name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * Admin users last name
     * @return the value
     **/
    public String getLastName() {
        return lastName;
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
        sb.append("AdminUserSummary(");
        sb.append("super=").append(super.toString());
        sb.append("username=").append(String.valueOf(this.username));
        sb.append(", emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdminUserSummary)) {
            return false;
        }

        AdminUserSummary other = (AdminUserSummary) o;
        return java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
