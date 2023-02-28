/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of preferred credentials. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PreferredCredentialSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class PreferredCredentialSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialName",
        "status",
        "isAccessible",
        "userName",
        "role",
        "passwordSecretId"
    })
    public PreferredCredentialSummary(
            String credentialName,
            PreferredCredentialStatus status,
            Boolean isAccessible,
            String userName,
            Role role,
            String passwordSecretId) {
        super();
        this.credentialName = credentialName;
        this.status = status;
        this.isAccessible = isAccessible;
        this.userName = userName;
        this.role = role;
        this.passwordSecretId = passwordSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the preferred credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
        private String credentialName;

        /**
         * The name of the preferred credential.
         *
         * @param credentialName the value to set
         * @return this builder
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
            this.__explicitlySet__.add("credentialName");
            return this;
        }
        /** The status of the preferred credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private PreferredCredentialStatus status;

        /**
         * The status of the preferred credential.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(PreferredCredentialStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Indicates whether the preferred credential is accessible. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccessible")
        private Boolean isAccessible;

        /**
         * Indicates whether the preferred credential is accessible.
         *
         * @param isAccessible the value to set
         * @return this builder
         */
        public Builder isAccessible(Boolean isAccessible) {
            this.isAccessible = isAccessible;
            this.__explicitlySet__.add("isAccessible");
            return this;
        }
        /** The user name used to connect to the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The user name used to connect to the database.
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** The role of the database user. */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The role of the database user.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Vault service secret that contains the database user password.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Vault service secret that contains the database user password.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         */
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PreferredCredentialSummary build() {
            PreferredCredentialSummary model =
                    new PreferredCredentialSummary(
                            this.credentialName,
                            this.status,
                            this.isAccessible,
                            this.userName,
                            this.role,
                            this.passwordSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PreferredCredentialSummary model) {
            if (model.wasPropertyExplicitlySet("credentialName")) {
                this.credentialName(model.getCredentialName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("isAccessible")) {
                this.isAccessible(model.getIsAccessible());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
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

    /** The name of the preferred credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialName")
    private final String credentialName;

    /**
     * The name of the preferred credential.
     *
     * @return the value
     */
    public String getCredentialName() {
        return credentialName;
    }

    /** The status of the preferred credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final PreferredCredentialStatus status;

    /**
     * The status of the preferred credential.
     *
     * @return the value
     */
    public PreferredCredentialStatus getStatus() {
        return status;
    }

    /** Indicates whether the preferred credential is accessible. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccessible")
    private final Boolean isAccessible;

    /**
     * Indicates whether the preferred credential is accessible.
     *
     * @return the value
     */
    public Boolean getIsAccessible() {
        return isAccessible;
    }

    /** The user name used to connect to the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The user name used to connect to the database.
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** The role of the database user. */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The role of the database user.
     *
     * @return the value
     */
    public Role getRole() {
        return role;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Vault service secret that contains the database user password.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Vault service secret that contains the database user password.
     *
     * @return the value
     */
    public String getPasswordSecretId() {
        return passwordSecretId;
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
        sb.append("PreferredCredentialSummary(");
        sb.append("super=").append(super.toString());
        sb.append("credentialName=").append(String.valueOf(this.credentialName));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", isAccessible=").append(String.valueOf(this.isAccessible));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreferredCredentialSummary)) {
            return false;
        }

        PreferredCredentialSummary other = (PreferredCredentialSummary) o;
        return java.util.Objects.equals(this.credentialName, other.credentialName)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.isAccessible, other.isAccessible)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialName == null ? 43 : this.credentialName.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.isAccessible == null ? 43 : this.isAccessible.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
