/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the 'BASIC' named credential.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BasicNamedCredentialContent.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "credentialType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BasicNamedCredentialContent extends NamedCredentialContent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user name used to connect to the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The user name used to connect to the database.
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The role of the database user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The role of the database user.
         * @param role the value to set
         * @return this builder
         **/
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Vault service secret that contains the database user password.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Vault service secret that contains the database user password.
         * @param passwordSecretId the value to set
         * @return this builder
         **/
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }
        /**
         * The mechanism used to access the password plain text value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretAccessMode")
        private PasswordSecretAccessMode passwordSecretAccessMode;

        /**
         * The mechanism used to access the password plain text value.
         * @param passwordSecretAccessMode the value to set
         * @return this builder
         **/
        public Builder passwordSecretAccessMode(PasswordSecretAccessMode passwordSecretAccessMode) {
            this.passwordSecretAccessMode = passwordSecretAccessMode;
            this.__explicitlySet__.add("passwordSecretAccessMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BasicNamedCredentialContent build() {
            BasicNamedCredentialContent model =
                    new BasicNamedCredentialContent(
                            this.userName,
                            this.role,
                            this.passwordSecretId,
                            this.passwordSecretAccessMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BasicNamedCredentialContent model) {
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretAccessMode")) {
                this.passwordSecretAccessMode(model.getPasswordSecretAccessMode());
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

    @Deprecated
    public BasicNamedCredentialContent(
            String userName,
            Role role,
            String passwordSecretId,
            PasswordSecretAccessMode passwordSecretAccessMode) {
        super();
        this.userName = userName;
        this.role = role;
        this.passwordSecretId = passwordSecretId;
        this.passwordSecretAccessMode = passwordSecretAccessMode;
    }

    /**
     * The user name used to connect to the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The user name used to connect to the database.
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * The role of the database user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The role of the database user.
     * @return the value
     **/
    public Role getRole() {
        return role;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Vault service secret that contains the database user password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Vault service secret that contains the database user password.
     * @return the value
     **/
    public String getPasswordSecretId() {
        return passwordSecretId;
    }

    /**
     * The mechanism used to access the password plain text value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretAccessMode")
    private final PasswordSecretAccessMode passwordSecretAccessMode;

    /**
     * The mechanism used to access the password plain text value.
     * @return the value
     **/
    public PasswordSecretAccessMode getPasswordSecretAccessMode() {
        return passwordSecretAccessMode;
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
        sb.append("BasicNamedCredentialContent(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(", passwordSecretAccessMode=")
                .append(String.valueOf(this.passwordSecretAccessMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BasicNamedCredentialContent)) {
            return false;
        }

        BasicNamedCredentialContent other = (BasicNamedCredentialContent) o;
        return java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && java.util.Objects.equals(
                        this.passwordSecretAccessMode, other.passwordSecretAccessMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretAccessMode == null
                                ? 43
                                : this.passwordSecretAccessMode.hashCode());
        return result;
    }
}
