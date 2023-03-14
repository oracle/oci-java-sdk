/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * DB User extension
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExtensionDbUserUser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtensionDbUserUser extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isDbUser",
        "passwordVerifiers",
        "domainLevelSchema",
        "instanceLevelSchema",
        "dbGlobalRoles"
    })
    public ExtensionDbUserUser(
            Boolean isDbUser,
            java.util.List<UserExtPasswordVerifiers> passwordVerifiers,
            String domainLevelSchema,
            String instanceLevelSchema,
            java.util.List<String> dbGlobalRoles) {
        super();
        this.isDbUser = isDbUser;
        this.passwordVerifiers = passwordVerifiers;
        this.domainLevelSchema = domainLevelSchema;
        this.instanceLevelSchema = instanceLevelSchema;
        this.dbGlobalRoles = dbGlobalRoles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, indicates this is a database user.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDbUser")
        private Boolean isDbUser;

        /**
         * If true, indicates this is a database user.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param isDbUser the value to set
         * @return this builder
         **/
        public Builder isDbUser(Boolean isDbUser) {
            this.isDbUser = isDbUser;
            this.__explicitlySet__.add("isDbUser");
            return this;
        }
        /**
         * Password Verifiers for DB User.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [type]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordVerifiers")
        private java.util.List<UserExtPasswordVerifiers> passwordVerifiers;

        /**
         * Password Verifiers for DB User.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [type]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: complex
         *  - uniqueness: none
         * @param passwordVerifiers the value to set
         * @return this builder
         **/
        public Builder passwordVerifiers(
                java.util.List<UserExtPasswordVerifiers> passwordVerifiers) {
            this.passwordVerifiers = passwordVerifiers;
            this.__explicitlySet__.add("passwordVerifiers");
            return this;
        }
        /**
         * DB domain level schema to which the user is granted access.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainLevelSchema")
        private String domainLevelSchema;

        /**
         * DB domain level schema to which the user is granted access.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param domainLevelSchema the value to set
         * @return this builder
         **/
        public Builder domainLevelSchema(String domainLevelSchema) {
            this.domainLevelSchema = domainLevelSchema;
            this.__explicitlySet__.add("domainLevelSchema");
            return this;
        }
        /**
         * DB instance level schema to which the user is granted access.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceLevelSchema")
        private String instanceLevelSchema;

        /**
         * DB instance level schema to which the user is granted access.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param instanceLevelSchema the value to set
         * @return this builder
         **/
        public Builder instanceLevelSchema(String instanceLevelSchema) {
            this.instanceLevelSchema = instanceLevelSchema;
            this.__explicitlySet__.add("instanceLevelSchema");
            return this;
        }
        /**
         * DB global roles to which the user is granted access.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbGlobalRoles")
        private java.util.List<String> dbGlobalRoles;

        /**
         * DB global roles to which the user is granted access.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsSensitive: none
         *  - multiValued: true
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param dbGlobalRoles the value to set
         * @return this builder
         **/
        public Builder dbGlobalRoles(java.util.List<String> dbGlobalRoles) {
            this.dbGlobalRoles = dbGlobalRoles;
            this.__explicitlySet__.add("dbGlobalRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionDbUserUser build() {
            ExtensionDbUserUser model =
                    new ExtensionDbUserUser(
                            this.isDbUser,
                            this.passwordVerifiers,
                            this.domainLevelSchema,
                            this.instanceLevelSchema,
                            this.dbGlobalRoles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionDbUserUser model) {
            if (model.wasPropertyExplicitlySet("isDbUser")) {
                this.isDbUser(model.getIsDbUser());
            }
            if (model.wasPropertyExplicitlySet("passwordVerifiers")) {
                this.passwordVerifiers(model.getPasswordVerifiers());
            }
            if (model.wasPropertyExplicitlySet("domainLevelSchema")) {
                this.domainLevelSchema(model.getDomainLevelSchema());
            }
            if (model.wasPropertyExplicitlySet("instanceLevelSchema")) {
                this.instanceLevelSchema(model.getInstanceLevelSchema());
            }
            if (model.wasPropertyExplicitlySet("dbGlobalRoles")) {
                this.dbGlobalRoles(model.getDbGlobalRoles());
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
     * If true, indicates this is a database user.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDbUser")
    private final Boolean isDbUser;

    /**
     * If true, indicates this is a database user.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIsDbUser() {
        return isDbUser;
    }

    /**
     * Password Verifiers for DB User.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [type]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVerifiers")
    private final java.util.List<UserExtPasswordVerifiers> passwordVerifiers;

    /**
     * Password Verifiers for DB User.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [type]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserExtPasswordVerifiers> getPasswordVerifiers() {
        return passwordVerifiers;
    }

    /**
     * DB domain level schema to which the user is granted access.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainLevelSchema")
    private final String domainLevelSchema;

    /**
     * DB domain level schema to which the user is granted access.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDomainLevelSchema() {
        return domainLevelSchema;
    }

    /**
     * DB instance level schema to which the user is granted access.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceLevelSchema")
    private final String instanceLevelSchema;

    /**
     * DB instance level schema to which the user is granted access.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getInstanceLevelSchema() {
        return instanceLevelSchema;
    }

    /**
     * DB global roles to which the user is granted access.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbGlobalRoles")
    private final java.util.List<String> dbGlobalRoles;

    /**
     * DB global roles to which the user is granted access.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsSensitive: none
     *  - multiValued: true
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<String> getDbGlobalRoles() {
        return dbGlobalRoles;
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
        sb.append("ExtensionDbUserUser(");
        sb.append("super=").append(super.toString());
        sb.append("isDbUser=").append(String.valueOf(this.isDbUser));
        sb.append(", passwordVerifiers=").append(String.valueOf(this.passwordVerifiers));
        sb.append(", domainLevelSchema=").append(String.valueOf(this.domainLevelSchema));
        sb.append(", instanceLevelSchema=").append(String.valueOf(this.instanceLevelSchema));
        sb.append(", dbGlobalRoles=").append(String.valueOf(this.dbGlobalRoles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionDbUserUser)) {
            return false;
        }

        ExtensionDbUserUser other = (ExtensionDbUserUser) o;
        return java.util.Objects.equals(this.isDbUser, other.isDbUser)
                && java.util.Objects.equals(this.passwordVerifiers, other.passwordVerifiers)
                && java.util.Objects.equals(this.domainLevelSchema, other.domainLevelSchema)
                && java.util.Objects.equals(this.instanceLevelSchema, other.instanceLevelSchema)
                && java.util.Objects.equals(this.dbGlobalRoles, other.dbGlobalRoles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isDbUser == null ? 43 : this.isDbUser.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordVerifiers == null ? 43 : this.passwordVerifiers.hashCode());
        result =
                (result * PRIME)
                        + (this.domainLevelSchema == null ? 43 : this.domainLevelSchema.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceLevelSchema == null
                                ? 43
                                : this.instanceLevelSchema.hashCode());
        result =
                (result * PRIME)
                        + (this.dbGlobalRoles == null ? 43 : this.dbGlobalRoles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
