/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The credentials for the Fusion Applications service administrator.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateFusionEnvironmentAdminUserDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateFusionEnvironmentAdminUserDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "username",
        "password",
        "emailAddress",
        "firstName",
        "lastName"
    })
    public CreateFusionEnvironmentAdminUserDetails(
            String username,
            String password,
            String emailAddress,
            String firstName,
            String lastName) {
        super();
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The username for the administrator.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * The username for the administrator.
         * @param username the value to set
         * @return this builder
         **/
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /**
         * The password for the administrator.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password for the administrator.
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * The email address for the administrator.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        /**
         * The email address for the administrator.
         * @param emailAddress the value to set
         * @return this builder
         **/
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }
        /**
         * The administrator's first name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        /**
         * The administrator's first name.
         * @param firstName the value to set
         * @return this builder
         **/
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }
        /**
         * The administrator's last name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        /**
         * The administrator's last name.
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

        public CreateFusionEnvironmentAdminUserDetails build() {
            CreateFusionEnvironmentAdminUserDetails __instance__ =
                    new CreateFusionEnvironmentAdminUserDetails(
                            username, password, emailAddress, firstName, lastName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFusionEnvironmentAdminUserDetails o) {
            Builder copiedBuilder =
                    username(o.getUsername())
                            .password(o.getPassword())
                            .emailAddress(o.getEmailAddress())
                            .firstName(o.getFirstName())
                            .lastName(o.getLastName());

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
     * The username for the administrator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * The username for the administrator.
     * @return the value
     **/
    public String getUsername() {
        return username;
    }

    /**
     * The password for the administrator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password for the administrator.
     * @return the value
     **/
    public String getPassword() {
        return password;
    }

    /**
     * The email address for the administrator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    private final String emailAddress;

    /**
     * The email address for the administrator.
     * @return the value
     **/
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * The administrator's first name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    private final String firstName;

    /**
     * The administrator's first name.
     * @return the value
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     * The administrator's last name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    private final String lastName;

    /**
     * The administrator's last name.
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
        sb.append("CreateFusionEnvironmentAdminUserDetails(");
        sb.append("username=").append(String.valueOf(this.username));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(", emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append(", firstName=").append(String.valueOf(this.firstName));
        sb.append(", lastName=").append(String.valueOf(this.lastName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFusionEnvironmentAdminUserDetails)) {
            return false;
        }

        CreateFusionEnvironmentAdminUserDetails other = (CreateFusionEnvironmentAdminUserDetails) o;
        return java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && java.util.Objects.equals(this.firstName, other.firstName)
                && java.util.Objects.equals(this.lastName, other.lastName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
        result = (result * PRIME) + (this.firstName == null ? 43 : this.firstName.hashCode());
        result = (result * PRIME) + (this.lastName == null ? 43 : this.lastName.hashCode());
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
