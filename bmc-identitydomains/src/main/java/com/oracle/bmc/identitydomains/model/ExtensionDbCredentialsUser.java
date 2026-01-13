/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The database credentials user extension. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtensionDbCredentialsUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionDbCredentialsUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbUserName", "dbLoginAttempts"})
    public ExtensionDbCredentialsUser(String dbUserName, Integer dbLoginAttempts) {
        super();
        this.dbUserName = dbUserName;
        this.dbLoginAttempts = dbLoginAttempts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The database username.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * type: string - returned: request - caseExact: false - uniqueness: none - idcsSearchable:
         * true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private String dbUserName;

        /**
         * The database username.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
         * type: string - returned: request - caseExact: false - uniqueness: none - idcsSearchable:
         * true
         *
         * @param dbUserName the value to set
         * @return this builder
         */
        public Builder dbUserName(String dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }
        /**
         * The number of failed login attempts. The value is reset to 0 after a successful login.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbLoginAttempts")
        private Integer dbLoginAttempts;

        /**
         * The number of failed login attempts. The value is reset to 0 after a successful login.
         *
         * <p>*Added In:** 2102181953
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: integer - uniqueness: none
         *
         * @param dbLoginAttempts the value to set
         * @return this builder
         */
        public Builder dbLoginAttempts(Integer dbLoginAttempts) {
            this.dbLoginAttempts = dbLoginAttempts;
            this.__explicitlySet__.add("dbLoginAttempts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionDbCredentialsUser build() {
            ExtensionDbCredentialsUser model =
                    new ExtensionDbCredentialsUser(this.dbUserName, this.dbLoginAttempts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionDbCredentialsUser model) {
            if (model.wasPropertyExplicitlySet("dbUserName")) {
                this.dbUserName(model.getDbUserName());
            }
            if (model.wasPropertyExplicitlySet("dbLoginAttempts")) {
                this.dbLoginAttempts(model.getDbLoginAttempts());
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
     * The database username.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * type: string - returned: request - caseExact: false - uniqueness: none - idcsSearchable: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    private final String dbUserName;

    /**
     * The database username.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - multiValued: false - mutability: readWrite - required: false -
     * type: string - returned: request - caseExact: false - uniqueness: none - idcsSearchable: true
     *
     * @return the value
     */
    public String getDbUserName() {
        return dbUserName;
    }

    /**
     * The number of failed login attempts. The value is reset to 0 after a successful login.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: request - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbLoginAttempts")
    private final Integer dbLoginAttempts;

    /**
     * The number of failed login attempts. The value is reset to 0 after a successful login.
     *
     * <p>*Added In:** 2102181953
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: request - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getDbLoginAttempts() {
        return dbLoginAttempts;
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
        sb.append("ExtensionDbCredentialsUser(");
        sb.append("super=").append(super.toString());
        sb.append("dbUserName=").append(String.valueOf(this.dbUserName));
        sb.append(", dbLoginAttempts=").append(String.valueOf(this.dbLoginAttempts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionDbCredentialsUser)) {
            return false;
        }

        ExtensionDbCredentialsUser other = (ExtensionDbCredentialsUser) o;
        return java.util.Objects.equals(this.dbUserName, other.dbUserName)
                && java.util.Objects.equals(this.dbLoginAttempts, other.dbLoginAttempts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbUserName == null ? 43 : this.dbUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.dbLoginAttempts == null ? 43 : this.dbLoginAttempts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
