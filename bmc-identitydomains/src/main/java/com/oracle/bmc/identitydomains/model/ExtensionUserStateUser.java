/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines the attributes used to manage account passwords within a service provider. The extension is typically applied to a User resource, but MAY be applied to other resources that use passwords.
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
    builder = ExtensionUserStateUser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtensionUserStateUser
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lastSuccessfulLoginDate",
        "previousSuccessfulLoginDate",
        "lastFailedLoginDate",
        "loginAttempts",
        "recoveryAttempts",
        "recoveryEnrollAttempts",
        "maxConcurrentSessions",
        "recoveryLocked",
        "locked"
    })
    public ExtensionUserStateUser(
            String lastSuccessfulLoginDate,
            String previousSuccessfulLoginDate,
            String lastFailedLoginDate,
            Integer loginAttempts,
            Integer recoveryAttempts,
            Integer recoveryEnrollAttempts,
            Integer maxConcurrentSessions,
            UserExtRecoveryLocked recoveryLocked,
            UserExtLocked locked) {
        super();
        this.lastSuccessfulLoginDate = lastSuccessfulLoginDate;
        this.previousSuccessfulLoginDate = previousSuccessfulLoginDate;
        this.lastFailedLoginDate = lastFailedLoginDate;
        this.loginAttempts = loginAttempts;
        this.recoveryAttempts = recoveryAttempts;
        this.recoveryEnrollAttempts = recoveryEnrollAttempts;
        this.maxConcurrentSessions = maxConcurrentSessions;
        this.recoveryLocked = recoveryLocked;
        this.locked = locked;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The last successful login date.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - idcsAllowUpdatesInReadOnlyMode: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastSuccessfulLoginDate")
        private String lastSuccessfulLoginDate;

        /**
         * The last successful login date.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - idcsAllowUpdatesInReadOnlyMode: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         * @param lastSuccessfulLoginDate the value to set
         * @return this builder
         **/
        public Builder lastSuccessfulLoginDate(String lastSuccessfulLoginDate) {
            this.lastSuccessfulLoginDate = lastSuccessfulLoginDate;
            this.__explicitlySet__.add("lastSuccessfulLoginDate");
            return this;
        }
        /**
         * The previous successful login date.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("previousSuccessfulLoginDate")
        private String previousSuccessfulLoginDate;

        /**
         * The previous successful login date.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         * @param previousSuccessfulLoginDate the value to set
         * @return this builder
         **/
        public Builder previousSuccessfulLoginDate(String previousSuccessfulLoginDate) {
            this.previousSuccessfulLoginDate = previousSuccessfulLoginDate;
            this.__explicitlySet__.add("previousSuccessfulLoginDate");
            return this;
        }
        /**
         * The last failed login date.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsAllowUpdatesInReadOnlyMode: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastFailedLoginDate")
        private String lastFailedLoginDate;

        /**
         * The last failed login date.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsAllowUpdatesInReadOnlyMode: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: dateTime
         *  - uniqueness: none
         * @param lastFailedLoginDate the value to set
         * @return this builder
         **/
        public Builder lastFailedLoginDate(String lastFailedLoginDate) {
            this.lastFailedLoginDate = lastFailedLoginDate;
            this.__explicitlySet__.add("lastFailedLoginDate");
            return this;
        }
        /**
         * The number of failed login attempts. The value is reset to 0 after a successful login.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsAllowUpdatesInReadOnlyMode: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loginAttempts")
        private Integer loginAttempts;

        /**
         * The number of failed login attempts. The value is reset to 0 after a successful login.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - idcsAllowUpdatesInReadOnlyMode: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: integer
         *  - uniqueness: none
         * @param loginAttempts the value to set
         * @return this builder
         **/
        public Builder loginAttempts(Integer loginAttempts) {
            this.loginAttempts = loginAttempts;
            this.__explicitlySet__.add("loginAttempts");
            return this;
        }
        /**
         * The number of failed recovery attempts. The value is reset to 0 after a successful login.
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryAttempts")
        private Integer recoveryAttempts;

        /**
         * The number of failed recovery attempts. The value is reset to 0 after a successful login.
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: request
         *  - type: integer
         *  - uniqueness: none
         * @param recoveryAttempts the value to set
         * @return this builder
         **/
        public Builder recoveryAttempts(Integer recoveryAttempts) {
            this.recoveryAttempts = recoveryAttempts;
            this.__explicitlySet__.add("recoveryAttempts");
            return this;
        }
        /**
         * The number of failed account recovery enrollment attempts.
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryEnrollAttempts")
        private Integer recoveryEnrollAttempts;

        /**
         * The number of failed account recovery enrollment attempts.
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: integer
         *  - uniqueness: none
         * @param recoveryEnrollAttempts the value to set
         * @return this builder
         **/
        public Builder recoveryEnrollAttempts(Integer recoveryEnrollAttempts) {
            this.recoveryEnrollAttempts = recoveryEnrollAttempts;
            this.__explicitlySet__.add("recoveryEnrollAttempts");
            return this;
        }
        /**
         * The maximum number of concurrent sessions for a user.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsMaxValue: 999
         *  - idcsMinValue: 1
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxConcurrentSessions")
        private Integer maxConcurrentSessions;

        /**
         * The maximum number of concurrent sessions for a user.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsMaxValue: 999
         *  - idcsMinValue: 1
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param maxConcurrentSessions the value to set
         * @return this builder
         **/
        public Builder maxConcurrentSessions(Integer maxConcurrentSessions) {
            this.maxConcurrentSessions = maxConcurrentSessions;
            this.__explicitlySet__.add("maxConcurrentSessions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recoveryLocked")
        private UserExtRecoveryLocked recoveryLocked;

        public Builder recoveryLocked(UserExtRecoveryLocked recoveryLocked) {
            this.recoveryLocked = recoveryLocked;
            this.__explicitlySet__.add("recoveryLocked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locked")
        private UserExtLocked locked;

        public Builder locked(UserExtLocked locked) {
            this.locked = locked;
            this.__explicitlySet__.add("locked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionUserStateUser build() {
            ExtensionUserStateUser model =
                    new ExtensionUserStateUser(
                            this.lastSuccessfulLoginDate,
                            this.previousSuccessfulLoginDate,
                            this.lastFailedLoginDate,
                            this.loginAttempts,
                            this.recoveryAttempts,
                            this.recoveryEnrollAttempts,
                            this.maxConcurrentSessions,
                            this.recoveryLocked,
                            this.locked);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionUserStateUser model) {
            if (model.wasPropertyExplicitlySet("lastSuccessfulLoginDate")) {
                this.lastSuccessfulLoginDate(model.getLastSuccessfulLoginDate());
            }
            if (model.wasPropertyExplicitlySet("previousSuccessfulLoginDate")) {
                this.previousSuccessfulLoginDate(model.getPreviousSuccessfulLoginDate());
            }
            if (model.wasPropertyExplicitlySet("lastFailedLoginDate")) {
                this.lastFailedLoginDate(model.getLastFailedLoginDate());
            }
            if (model.wasPropertyExplicitlySet("loginAttempts")) {
                this.loginAttempts(model.getLoginAttempts());
            }
            if (model.wasPropertyExplicitlySet("recoveryAttempts")) {
                this.recoveryAttempts(model.getRecoveryAttempts());
            }
            if (model.wasPropertyExplicitlySet("recoveryEnrollAttempts")) {
                this.recoveryEnrollAttempts(model.getRecoveryEnrollAttempts());
            }
            if (model.wasPropertyExplicitlySet("maxConcurrentSessions")) {
                this.maxConcurrentSessions(model.getMaxConcurrentSessions());
            }
            if (model.wasPropertyExplicitlySet("recoveryLocked")) {
                this.recoveryLocked(model.getRecoveryLocked());
            }
            if (model.wasPropertyExplicitlySet("locked")) {
                this.locked(model.getLocked());
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
     * The last successful login date.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - idcsAllowUpdatesInReadOnlyMode: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastSuccessfulLoginDate")
    private final String lastSuccessfulLoginDate;

    /**
     * The last successful login date.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - idcsAllowUpdatesInReadOnlyMode: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getLastSuccessfulLoginDate() {
        return lastSuccessfulLoginDate;
    }

    /**
     * The previous successful login date.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("previousSuccessfulLoginDate")
    private final String previousSuccessfulLoginDate;

    /**
     * The previous successful login date.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getPreviousSuccessfulLoginDate() {
        return previousSuccessfulLoginDate;
    }

    /**
     * The last failed login date.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsAllowUpdatesInReadOnlyMode: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastFailedLoginDate")
    private final String lastFailedLoginDate;

    /**
     * The last failed login date.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsAllowUpdatesInReadOnlyMode: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getLastFailedLoginDate() {
        return lastFailedLoginDate;
    }

    /**
     * The number of failed login attempts. The value is reset to 0 after a successful login.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsAllowUpdatesInReadOnlyMode: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loginAttempts")
    private final Integer loginAttempts;

    /**
     * The number of failed login attempts. The value is reset to 0 after a successful login.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - idcsAllowUpdatesInReadOnlyMode: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getLoginAttempts() {
        return loginAttempts;
    }

    /**
     * The number of failed recovery attempts. The value is reset to 0 after a successful login.
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryAttempts")
    private final Integer recoveryAttempts;

    /**
     * The number of failed recovery attempts. The value is reset to 0 after a successful login.
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: request
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getRecoveryAttempts() {
        return recoveryAttempts;
    }

    /**
     * The number of failed account recovery enrollment attempts.
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryEnrollAttempts")
    private final Integer recoveryEnrollAttempts;

    /**
     * The number of failed account recovery enrollment attempts.
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getRecoveryEnrollAttempts() {
        return recoveryEnrollAttempts;
    }

    /**
     * The maximum number of concurrent sessions for a user.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsMaxValue: 999
     *  - idcsMinValue: 1
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxConcurrentSessions")
    private final Integer maxConcurrentSessions;

    /**
     * The maximum number of concurrent sessions for a user.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsMaxValue: 999
     *  - idcsMinValue: 1
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getMaxConcurrentSessions() {
        return maxConcurrentSessions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("recoveryLocked")
    private final UserExtRecoveryLocked recoveryLocked;

    public UserExtRecoveryLocked getRecoveryLocked() {
        return recoveryLocked;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("locked")
    private final UserExtLocked locked;

    public UserExtLocked getLocked() {
        return locked;
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
        sb.append("ExtensionUserStateUser(");
        sb.append("super=").append(super.toString());
        sb.append("lastSuccessfulLoginDate=").append(String.valueOf(this.lastSuccessfulLoginDate));
        sb.append(", previousSuccessfulLoginDate=")
                .append(String.valueOf(this.previousSuccessfulLoginDate));
        sb.append(", lastFailedLoginDate=").append(String.valueOf(this.lastFailedLoginDate));
        sb.append(", loginAttempts=").append(String.valueOf(this.loginAttempts));
        sb.append(", recoveryAttempts=").append(String.valueOf(this.recoveryAttempts));
        sb.append(", recoveryEnrollAttempts=").append(String.valueOf(this.recoveryEnrollAttempts));
        sb.append(", maxConcurrentSessions=").append(String.valueOf(this.maxConcurrentSessions));
        sb.append(", recoveryLocked=").append(String.valueOf(this.recoveryLocked));
        sb.append(", locked=").append(String.valueOf(this.locked));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionUserStateUser)) {
            return false;
        }

        ExtensionUserStateUser other = (ExtensionUserStateUser) o;
        return java.util.Objects.equals(this.lastSuccessfulLoginDate, other.lastSuccessfulLoginDate)
                && java.util.Objects.equals(
                        this.previousSuccessfulLoginDate, other.previousSuccessfulLoginDate)
                && java.util.Objects.equals(this.lastFailedLoginDate, other.lastFailedLoginDate)
                && java.util.Objects.equals(this.loginAttempts, other.loginAttempts)
                && java.util.Objects.equals(this.recoveryAttempts, other.recoveryAttempts)
                && java.util.Objects.equals(
                        this.recoveryEnrollAttempts, other.recoveryEnrollAttempts)
                && java.util.Objects.equals(this.maxConcurrentSessions, other.maxConcurrentSessions)
                && java.util.Objects.equals(this.recoveryLocked, other.recoveryLocked)
                && java.util.Objects.equals(this.locked, other.locked)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lastSuccessfulLoginDate == null
                                ? 43
                                : this.lastSuccessfulLoginDate.hashCode());
        result =
                (result * PRIME)
                        + (this.previousSuccessfulLoginDate == null
                                ? 43
                                : this.previousSuccessfulLoginDate.hashCode());
        result =
                (result * PRIME)
                        + (this.lastFailedLoginDate == null
                                ? 43
                                : this.lastFailedLoginDate.hashCode());
        result =
                (result * PRIME)
                        + (this.loginAttempts == null ? 43 : this.loginAttempts.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryAttempts == null ? 43 : this.recoveryAttempts.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryEnrollAttempts == null
                                ? 43
                                : this.recoveryEnrollAttempts.hashCode());
        result =
                (result * PRIME)
                        + (this.maxConcurrentSessions == null
                                ? 43
                                : this.maxConcurrentSessions.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryLocked == null ? 43 : this.recoveryLocked.hashCode());
        result = (result * PRIME) + (this.locked == null ? 43 : this.locked.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
