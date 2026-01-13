/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * POSIX User extension <br>
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
        builder = ExtensionPosixUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionPosixUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "uidNumber",
        "gidNumber",
        "gecos",
        "homeDirectory",
        "loginShell"
    })
    public ExtensionPosixUser(
            Integer uidNumber,
            Integer gidNumber,
            String gecos,
            String homeDirectory,
            String loginShell) {
        super();
        this.uidNumber = uidNumber;
        this.gidNumber = gidNumber;
        this.gecos = gecos;
        this.homeDirectory = homeDirectory;
        this.loginShell = loginShell;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Integer uniquely identifying a user in a POSIX administrative domain
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: server
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uidNumber")
        private Integer uidNumber;

        /**
         * Integer uniquely identifying a user in a POSIX administrative domain
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: server
         *
         * @param uidNumber the value to set
         * @return this builder
         */
        public Builder uidNumber(Integer uidNumber) {
            this.uidNumber = uidNumber;
            this.__explicitlySet__.add("uidNumber");
            return this;
        }
        /**
         * Primary Group identifier of the POSIX user
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gidNumber")
        private Integer gidNumber;

        /**
         * Primary Group identifier of the POSIX user
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: integer - uniqueness: none
         *
         * @param gidNumber the value to set
         * @return this builder
         */
        public Builder gidNumber(Integer gidNumber) {
            this.gidNumber = gidNumber;
            this.__explicitlySet__.add("gidNumber");
            return this;
        }
        /**
         * General information about the POSIX account such as their real name and phone number
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gecos")
        private String gecos;

        /**
         * General information about the POSIX account such as their real name and phone number
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: request - type: string - uniqueness: none
         *
         * @param gecos the value to set
         * @return this builder
         */
        public Builder gecos(String gecos) {
            this.gecos = gecos;
            this.__explicitlySet__.add("gecos");
            return this;
        }
        /**
         * The absolute path to the home directory of the POSIX account
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("homeDirectory")
        private String homeDirectory;

        /**
         * The absolute path to the home directory of the POSIX account
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: request - type: string - uniqueness: none
         *
         * @param homeDirectory the value to set
         * @return this builder
         */
        public Builder homeDirectory(String homeDirectory) {
            this.homeDirectory = homeDirectory;
            this.__explicitlySet__.add("homeDirectory");
            return this;
        }
        /**
         * The path to the login shell of the POSIX account
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loginShell")
        private String loginShell;

        /**
         * The path to the login shell of the POSIX account
         *
         * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
         * required: false - returned: request - type: string - uniqueness: none
         *
         * @param loginShell the value to set
         * @return this builder
         */
        public Builder loginShell(String loginShell) {
            this.loginShell = loginShell;
            this.__explicitlySet__.add("loginShell");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionPosixUser build() {
            ExtensionPosixUser model =
                    new ExtensionPosixUser(
                            this.uidNumber,
                            this.gidNumber,
                            this.gecos,
                            this.homeDirectory,
                            this.loginShell);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionPosixUser model) {
            if (model.wasPropertyExplicitlySet("uidNumber")) {
                this.uidNumber(model.getUidNumber());
            }
            if (model.wasPropertyExplicitlySet("gidNumber")) {
                this.gidNumber(model.getGidNumber());
            }
            if (model.wasPropertyExplicitlySet("gecos")) {
                this.gecos(model.getGecos());
            }
            if (model.wasPropertyExplicitlySet("homeDirectory")) {
                this.homeDirectory(model.getHomeDirectory());
            }
            if (model.wasPropertyExplicitlySet("loginShell")) {
                this.loginShell(model.getLoginShell());
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
     * Integer uniquely identifying a user in a POSIX administrative domain
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: server
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uidNumber")
    private final Integer uidNumber;

    /**
     * Integer uniquely identifying a user in a POSIX administrative domain
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: server
     *
     * @return the value
     */
    public Integer getUidNumber() {
        return uidNumber;
    }

    /**
     * Primary Group identifier of the POSIX user
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gidNumber")
    private final Integer gidNumber;

    /**
     * Primary Group identifier of the POSIX user
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: integer - uniqueness: none
     *
     * @return the value
     */
    public Integer getGidNumber() {
        return gidNumber;
    }

    /**
     * General information about the POSIX account such as their real name and phone number
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gecos")
    private final String gecos;

    /**
     * General information about the POSIX account such as their real name and phone number
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getGecos() {
        return gecos;
    }

    /**
     * The absolute path to the home directory of the POSIX account
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("homeDirectory")
    private final String homeDirectory;

    /**
     * The absolute path to the home directory of the POSIX account
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getHomeDirectory() {
        return homeDirectory;
    }

    /**
     * The path to the login shell of the POSIX account
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loginShell")
    private final String loginShell;

    /**
     * The path to the login shell of the POSIX account
     *
     * <p>*SCIM++ Properties:** - caseExact: true - multiValued: false - mutability: readWrite -
     * required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLoginShell() {
        return loginShell;
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
        sb.append("ExtensionPosixUser(");
        sb.append("super=").append(super.toString());
        sb.append("uidNumber=").append(String.valueOf(this.uidNumber));
        sb.append(", gidNumber=").append(String.valueOf(this.gidNumber));
        sb.append(", gecos=").append(String.valueOf(this.gecos));
        sb.append(", homeDirectory=").append(String.valueOf(this.homeDirectory));
        sb.append(", loginShell=").append(String.valueOf(this.loginShell));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionPosixUser)) {
            return false;
        }

        ExtensionPosixUser other = (ExtensionPosixUser) o;
        return java.util.Objects.equals(this.uidNumber, other.uidNumber)
                && java.util.Objects.equals(this.gidNumber, other.gidNumber)
                && java.util.Objects.equals(this.gecos, other.gecos)
                && java.util.Objects.equals(this.homeDirectory, other.homeDirectory)
                && java.util.Objects.equals(this.loginShell, other.loginShell)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.uidNumber == null ? 43 : this.uidNumber.hashCode());
        result = (result * PRIME) + (this.gidNumber == null ? 43 : this.gidNumber.hashCode());
        result = (result * PRIME) + (this.gecos == null ? 43 : this.gecos.hashCode());
        result =
                (result * PRIME)
                        + (this.homeDirectory == null ? 43 : this.homeDirectory.hashCode());
        result = (result * PRIME) + (this.loginShell == null ? 43 : this.loginShell.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
