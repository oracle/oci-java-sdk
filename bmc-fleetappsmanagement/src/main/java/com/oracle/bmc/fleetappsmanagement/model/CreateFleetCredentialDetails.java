/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The information about new FleetCredential. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateFleetCredentialDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateFleetCredentialDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "entitySpecifics", "user", "password"})
    public CreateFleetCredentialDetails(
            String displayName,
            CredentialEntitySpecificDetails entitySpecifics,
            CredentialDetails user,
            CredentialDetails password) {
        super();
        this.displayName = displayName;
        this.entitySpecifics = entitySpecifics;
        this.user = user;
        this.password = password;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entitySpecifics")
        private CredentialEntitySpecificDetails entitySpecifics;

        public Builder entitySpecifics(CredentialEntitySpecificDetails entitySpecifics) {
            this.entitySpecifics = entitySpecifics;
            this.__explicitlySet__.add("entitySpecifics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("user")
        private CredentialDetails user;

        public Builder user(CredentialDetails user) {
            this.user = user;
            this.__explicitlySet__.add("user");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private CredentialDetails password;

        public Builder password(CredentialDetails password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateFleetCredentialDetails build() {
            CreateFleetCredentialDetails model =
                    new CreateFleetCredentialDetails(
                            this.displayName, this.entitySpecifics, this.user, this.password);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateFleetCredentialDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("entitySpecifics")) {
                this.entitySpecifics(model.getEntitySpecifics());
            }
            if (model.wasPropertyExplicitlySet("user")) {
                this.user(model.getUser());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
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

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("entitySpecifics")
    private final CredentialEntitySpecificDetails entitySpecifics;

    public CredentialEntitySpecificDetails getEntitySpecifics() {
        return entitySpecifics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("user")
    private final CredentialDetails user;

    public CredentialDetails getUser() {
        return user;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final CredentialDetails password;

    public CredentialDetails getPassword() {
        return password;
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
        sb.append("CreateFleetCredentialDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", entitySpecifics=").append(String.valueOf(this.entitySpecifics));
        sb.append(", user=").append(String.valueOf(this.user));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFleetCredentialDetails)) {
            return false;
        }

        CreateFleetCredentialDetails other = (CreateFleetCredentialDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.entitySpecifics, other.entitySpecifics)
                && java.util.Objects.equals(this.user, other.user)
                && java.util.Objects.equals(this.password, other.password)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.entitySpecifics == null ? 43 : this.entitySpecifics.hashCode());
        result = (result * PRIME) + (this.user == null ? 43 : this.user.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
