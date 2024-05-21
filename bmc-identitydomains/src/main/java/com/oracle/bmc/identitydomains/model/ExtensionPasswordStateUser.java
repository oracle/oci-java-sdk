/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes used to manage account passwords within a Service Provider. The extension is typically applied to a User resource, but MAY be applied to other resources that use passwords.
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
    builder = ExtensionPasswordStateUser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtensionPasswordStateUser
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lastSuccessfulSetDate",
        "cantChange",
        "cantExpire",
        "mustChange",
        "expired",
        "lastSuccessfulValidationDate",
        "lastFailedValidationDate",
        "applicablePasswordPolicy"
    })
    public ExtensionPasswordStateUser(
            String lastSuccessfulSetDate,
            Boolean cantChange,
            Boolean cantExpire,
            Boolean mustChange,
            Boolean expired,
            String lastSuccessfulValidationDate,
            String lastFailedValidationDate,
            UserExtApplicablePasswordPolicy applicablePasswordPolicy) {
        super();
        this.lastSuccessfulSetDate = lastSuccessfulSetDate;
        this.cantChange = cantChange;
        this.cantExpire = cantExpire;
        this.mustChange = mustChange;
        this.expired = expired;
        this.lastSuccessfulValidationDate = lastSuccessfulValidationDate;
        this.lastFailedValidationDate = lastFailedValidationDate;
        this.applicablePasswordPolicy = applicablePasswordPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A DateTime that specifies the date and time when the current password was set
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastSuccessfulSetDate")
        private String lastSuccessfulSetDate;

        /**
         * A DateTime that specifies the date and time when the current password was set
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         * @param lastSuccessfulSetDate the value to set
         * @return this builder
         **/
        public Builder lastSuccessfulSetDate(String lastSuccessfulSetDate) {
            this.lastSuccessfulSetDate = lastSuccessfulSetDate;
            this.__explicitlySet__.add("lastSuccessfulSetDate");
            return this;
        }
        /**
         * Indicates that the current password MAY NOT be changed and all other password expiry settings SHALL be ignored
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cantChange")
        private Boolean cantChange;

        /**
         * Indicates that the current password MAY NOT be changed and all other password expiry settings SHALL be ignored
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param cantChange the value to set
         * @return this builder
         **/
        public Builder cantChange(Boolean cantChange) {
            this.cantChange = cantChange;
            this.__explicitlySet__.add("cantChange");
            return this;
        }
        /**
         * Indicates that the password expiry policy will not be applied for the current Resource
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cantExpire")
        private Boolean cantExpire;

        /**
         * Indicates that the password expiry policy will not be applied for the current Resource
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param cantExpire the value to set
         * @return this builder
         **/
        public Builder cantExpire(Boolean cantExpire) {
            this.cantExpire = cantExpire;
            this.__explicitlySet__.add("cantExpire");
            return this;
        }
        /**
         * Indicates that the subject password value MUST change on next login. If not changed, typically the account is locked. The value may be set indirectly when the subject's current password expires or directly set by an administrator.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mustChange")
        private Boolean mustChange;

        /**
         * Indicates that the subject password value MUST change on next login. If not changed, typically the account is locked. The value may be set indirectly when the subject's current password expires or directly set by an administrator.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param mustChange the value to set
         * @return this builder
         **/
        public Builder mustChange(Boolean mustChange) {
            this.mustChange = mustChange;
            this.__explicitlySet__.add("mustChange");
            return this;
        }
        /**
         * Indicates that the password has expired
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expired")
        private Boolean expired;

        /**
         * Indicates that the password has expired
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param expired the value to set
         * @return this builder
         **/
        public Builder expired(Boolean expired) {
            this.expired = expired;
            this.__explicitlySet__.add("expired");
            return this;
        }
        /**
         * A DateTime that specifies the date and time when last successful password validation was set
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastSuccessfulValidationDate")
        private String lastSuccessfulValidationDate;

        /**
         * A DateTime that specifies the date and time when last successful password validation was set
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         * @param lastSuccessfulValidationDate the value to set
         * @return this builder
         **/
        public Builder lastSuccessfulValidationDate(String lastSuccessfulValidationDate) {
            this.lastSuccessfulValidationDate = lastSuccessfulValidationDate;
            this.__explicitlySet__.add("lastSuccessfulValidationDate");
            return this;
        }
        /**
         * A DateTime that specifies the date and time when last failed password validation was set
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastFailedValidationDate")
        private String lastFailedValidationDate;

        /**
         * A DateTime that specifies the date and time when last failed password validation was set
         * <p>
         **Added In:** 2011192329
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         * @param lastFailedValidationDate the value to set
         * @return this builder
         **/
        public Builder lastFailedValidationDate(String lastFailedValidationDate) {
            this.lastFailedValidationDate = lastFailedValidationDate;
            this.__explicitlySet__.add("lastFailedValidationDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicablePasswordPolicy")
        private UserExtApplicablePasswordPolicy applicablePasswordPolicy;

        public Builder applicablePasswordPolicy(
                UserExtApplicablePasswordPolicy applicablePasswordPolicy) {
            this.applicablePasswordPolicy = applicablePasswordPolicy;
            this.__explicitlySet__.add("applicablePasswordPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionPasswordStateUser build() {
            ExtensionPasswordStateUser model =
                    new ExtensionPasswordStateUser(
                            this.lastSuccessfulSetDate,
                            this.cantChange,
                            this.cantExpire,
                            this.mustChange,
                            this.expired,
                            this.lastSuccessfulValidationDate,
                            this.lastFailedValidationDate,
                            this.applicablePasswordPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionPasswordStateUser model) {
            if (model.wasPropertyExplicitlySet("lastSuccessfulSetDate")) {
                this.lastSuccessfulSetDate(model.getLastSuccessfulSetDate());
            }
            if (model.wasPropertyExplicitlySet("cantChange")) {
                this.cantChange(model.getCantChange());
            }
            if (model.wasPropertyExplicitlySet("cantExpire")) {
                this.cantExpire(model.getCantExpire());
            }
            if (model.wasPropertyExplicitlySet("mustChange")) {
                this.mustChange(model.getMustChange());
            }
            if (model.wasPropertyExplicitlySet("expired")) {
                this.expired(model.getExpired());
            }
            if (model.wasPropertyExplicitlySet("lastSuccessfulValidationDate")) {
                this.lastSuccessfulValidationDate(model.getLastSuccessfulValidationDate());
            }
            if (model.wasPropertyExplicitlySet("lastFailedValidationDate")) {
                this.lastFailedValidationDate(model.getLastFailedValidationDate());
            }
            if (model.wasPropertyExplicitlySet("applicablePasswordPolicy")) {
                this.applicablePasswordPolicy(model.getApplicablePasswordPolicy());
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
     * A DateTime that specifies the date and time when the current password was set
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastSuccessfulSetDate")
    private final String lastSuccessfulSetDate;

    /**
     * A DateTime that specifies the date and time when the current password was set
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getLastSuccessfulSetDate() {
        return lastSuccessfulSetDate;
    }

    /**
     * Indicates that the current password MAY NOT be changed and all other password expiry settings SHALL be ignored
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cantChange")
    private final Boolean cantChange;

    /**
     * Indicates that the current password MAY NOT be changed and all other password expiry settings SHALL be ignored
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCantChange() {
        return cantChange;
    }

    /**
     * Indicates that the password expiry policy will not be applied for the current Resource
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cantExpire")
    private final Boolean cantExpire;

    /**
     * Indicates that the password expiry policy will not be applied for the current Resource
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getCantExpire() {
        return cantExpire;
    }

    /**
     * Indicates that the subject password value MUST change on next login. If not changed, typically the account is locked. The value may be set indirectly when the subject's current password expires or directly set by an administrator.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mustChange")
    private final Boolean mustChange;

    /**
     * Indicates that the subject password value MUST change on next login. If not changed, typically the account is locked. The value may be set indirectly when the subject's current password expires or directly set by an administrator.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getMustChange() {
        return mustChange;
    }

    /**
     * Indicates that the password has expired
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expired")
    private final Boolean expired;

    /**
     * Indicates that the password has expired
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getExpired() {
        return expired;
    }

    /**
     * A DateTime that specifies the date and time when last successful password validation was set
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastSuccessfulValidationDate")
    private final String lastSuccessfulValidationDate;

    /**
     * A DateTime that specifies the date and time when last successful password validation was set
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getLastSuccessfulValidationDate() {
        return lastSuccessfulValidationDate;
    }

    /**
     * A DateTime that specifies the date and time when last failed password validation was set
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastFailedValidationDate")
    private final String lastFailedValidationDate;

    /**
     * A DateTime that specifies the date and time when last failed password validation was set
     * <p>
     **Added In:** 2011192329
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getLastFailedValidationDate() {
        return lastFailedValidationDate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applicablePasswordPolicy")
    private final UserExtApplicablePasswordPolicy applicablePasswordPolicy;

    public UserExtApplicablePasswordPolicy getApplicablePasswordPolicy() {
        return applicablePasswordPolicy;
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
        sb.append("ExtensionPasswordStateUser(");
        sb.append("super=").append(super.toString());
        sb.append("lastSuccessfulSetDate=").append(String.valueOf(this.lastSuccessfulSetDate));
        sb.append(", cantChange=").append(String.valueOf(this.cantChange));
        sb.append(", cantExpire=").append(String.valueOf(this.cantExpire));
        sb.append(", mustChange=").append(String.valueOf(this.mustChange));
        sb.append(", expired=").append(String.valueOf(this.expired));
        sb.append(", lastSuccessfulValidationDate=")
                .append(String.valueOf(this.lastSuccessfulValidationDate));
        sb.append(", lastFailedValidationDate=")
                .append(String.valueOf(this.lastFailedValidationDate));
        sb.append(", applicablePasswordPolicy=")
                .append(String.valueOf(this.applicablePasswordPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionPasswordStateUser)) {
            return false;
        }

        ExtensionPasswordStateUser other = (ExtensionPasswordStateUser) o;
        return java.util.Objects.equals(this.lastSuccessfulSetDate, other.lastSuccessfulSetDate)
                && java.util.Objects.equals(this.cantChange, other.cantChange)
                && java.util.Objects.equals(this.cantExpire, other.cantExpire)
                && java.util.Objects.equals(this.mustChange, other.mustChange)
                && java.util.Objects.equals(this.expired, other.expired)
                && java.util.Objects.equals(
                        this.lastSuccessfulValidationDate, other.lastSuccessfulValidationDate)
                && java.util.Objects.equals(
                        this.lastFailedValidationDate, other.lastFailedValidationDate)
                && java.util.Objects.equals(
                        this.applicablePasswordPolicy, other.applicablePasswordPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lastSuccessfulSetDate == null
                                ? 43
                                : this.lastSuccessfulSetDate.hashCode());
        result = (result * PRIME) + (this.cantChange == null ? 43 : this.cantChange.hashCode());
        result = (result * PRIME) + (this.cantExpire == null ? 43 : this.cantExpire.hashCode());
        result = (result * PRIME) + (this.mustChange == null ? 43 : this.mustChange.hashCode());
        result = (result * PRIME) + (this.expired == null ? 43 : this.expired.hashCode());
        result =
                (result * PRIME)
                        + (this.lastSuccessfulValidationDate == null
                                ? 43
                                : this.lastSuccessfulValidationDate.hashCode());
        result =
                (result * PRIME)
                        + (this.lastFailedValidationDate == null
                                ? 43
                                : this.lastFailedValidationDate.hashCode());
        result =
                (result * PRIME)
                        + (this.applicablePasswordPolicy == null
                                ? 43
                                : this.applicablePasswordPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
