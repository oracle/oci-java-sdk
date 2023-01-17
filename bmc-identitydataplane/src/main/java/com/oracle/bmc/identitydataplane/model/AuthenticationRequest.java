/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuthenticationRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AuthenticationRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"userName", "password", "tenantName"})
    public AuthenticationRequest(String userName, String password, String tenantName) {
        super();
        this.userName = userName;
        this.password = password;
        this.tenantName = tenantName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The user name */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The user name
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** The password */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * The password
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /** The name of the tenancy */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
        private String tenantName;

        /**
         * The name of the tenancy
         *
         * @param tenantName the value to set
         * @return this builder
         */
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            this.__explicitlySet__.add("tenantName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthenticationRequest build() {
            AuthenticationRequest model =
                    new AuthenticationRequest(this.userName, this.password, this.tenantName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthenticationRequest model) {
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("tenantName")) {
                this.tenantName(model.getTenantName());
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

    /** The user name */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The user name
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** The password */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * The password
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /** The name of the tenancy */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
    private final String tenantName;

    /**
     * The name of the tenancy
     *
     * @return the value
     */
    public String getTenantName() {
        return tenantName;
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
        sb.append("AuthenticationRequest(");
        sb.append("super=").append(super.toString());
        sb.append("userName=").append(String.valueOf(this.userName));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(", tenantName=").append(String.valueOf(this.tenantName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthenticationRequest)) {
            return false;
        }

        AuthenticationRequest other = (AuthenticationRequest) o;
        return java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.tenantName, other.tenantName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.tenantName == null ? 43 : this.tenantName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
