/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A complex attribute that indicates an account is locked (blocking any new sessions).
 * <p>
 **SCIM++ Properties:**
 *  - idcsCsvAttributeNameMappings: [[columnHeaderName:Locked, mapsTo:locked.on], [columnHeaderName:Locked Reason, mapsTo:locked.reason], [columnHeaderName:Locked Date, mapsTo:locked.lockDate]]
 *  - idcsSearchable: false
 *  - idcsAllowUpdatesInReadOnlyMode: true
 *  - multiValued: false
 *  - mutability: readWrite
 *  - required: false
 *  - returned: default
 *  - type: complex
 *  - uniqueness: none
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserExtLocked.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserExtLocked extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reason", "on", "lockDate", "expired"})
    public UserExtLocked(Integer reason, Boolean on, String lockDate, Boolean expired) {
        super();
        this.reason = reason;
        this.on = on;
        this.lockDate = lockDate;
        this.expired = expired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates the reason for locking the account. Valid values are: 0 - failed password login attempts, 1 - admin lock, 2 - failed reset password attempts, 3 - failed MFA login attempts, 4 - failed MFA login attempts for federated user, 5 - failed Database login attempts
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private Integer reason;

        /**
         * Indicates the reason for locking the account. Valid values are: 0 - failed password login attempts, 1 - admin lock, 2 - failed reset password attempts, 3 - failed MFA login attempts, 4 - failed MFA login attempts for federated user, 5 - failed Database login attempts
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param reason the value to set
         * @return this builder
         **/
        public Builder reason(Integer reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }
        /**
         * Indicates that the account is locked.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("on")
        private Boolean on;

        /**
         * Indicates that the account is locked.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param on the value to set
         * @return this builder
         **/
        public Builder on(Boolean on) {
            this.on = on;
            this.__explicitlySet__.add("on");
            return this;
        }
        /**
         * The date and time that the current resource was locked.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: default
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lockDate")
        private String lockDate;

        /**
         * The date and time that the current resource was locked.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - idcsRequiresWriteForAccessFlows: true
         *  - required: false
         *  - returned: default
         *  - type: dateTime
         *  - uniqueness: none
         * @param lockDate the value to set
         * @return this builder
         **/
        public Builder lockDate(String lockDate) {
            this.lockDate = lockDate;
            this.__explicitlySet__.add("lockDate");
            return this;
        }
        /**
         * Indicates whether the user password is expired. If this value is false, password expiry is still evaluated during user login.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expired")
        private Boolean expired;

        /**
         * Indicates whether the user password is expired. If this value is false, password expiry is still evaluated during user login.
         * <p>
         **Added In:** 20.1.3
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtLocked build() {
            UserExtLocked model =
                    new UserExtLocked(this.reason, this.on, this.lockDate, this.expired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtLocked model) {
            if (model.wasPropertyExplicitlySet("reason")) {
                this.reason(model.getReason());
            }
            if (model.wasPropertyExplicitlySet("on")) {
                this.on(model.getOn());
            }
            if (model.wasPropertyExplicitlySet("lockDate")) {
                this.lockDate(model.getLockDate());
            }
            if (model.wasPropertyExplicitlySet("expired")) {
                this.expired(model.getExpired());
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
     * Indicates the reason for locking the account. Valid values are: 0 - failed password login attempts, 1 - admin lock, 2 - failed reset password attempts, 3 - failed MFA login attempts, 4 - failed MFA login attempts for federated user, 5 - failed Database login attempts
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final Integer reason;

    /**
     * Indicates the reason for locking the account. Valid values are: 0 - failed password login attempts, 1 - admin lock, 2 - failed reset password attempts, 3 - failed MFA login attempts, 4 - failed MFA login attempts for federated user, 5 - failed Database login attempts
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getReason() {
        return reason;
    }

    /**
     * Indicates that the account is locked.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("on")
    private final Boolean on;

    /**
     * Indicates that the account is locked.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getOn() {
        return on;
    }

    /**
     * The date and time that the current resource was locked.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lockDate")
    private final String lockDate;

    /**
     * The date and time that the current resource was locked.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - idcsRequiresWriteForAccessFlows: true
     *  - required: false
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getLockDate() {
        return lockDate;
    }

    /**
     * Indicates whether the user password is expired. If this value is false, password expiry is still evaluated during user login.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expired")
    private final Boolean expired;

    /**
     * Indicates whether the user password is expired. If this value is false, password expiry is still evaluated during user login.
     * <p>
     **Added In:** 20.1.3
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getExpired() {
        return expired;
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
        sb.append("UserExtLocked(");
        sb.append("super=").append(super.toString());
        sb.append("reason=").append(String.valueOf(this.reason));
        sb.append(", on=").append(String.valueOf(this.on));
        sb.append(", lockDate=").append(String.valueOf(this.lockDate));
        sb.append(", expired=").append(String.valueOf(this.expired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtLocked)) {
            return false;
        }

        UserExtLocked other = (UserExtLocked) o;
        return java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.on, other.on)
                && java.util.Objects.equals(this.lockDate, other.lockDate)
                && java.util.Objects.equals(this.expired, other.expired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result = (result * PRIME) + (this.on == null ? 43 : this.on.hashCode());
        result = (result * PRIME) + (this.lockDate == null ? 43 : this.lockDate.hashCode());
        result = (result * PRIME) + (this.expired == null ? 43 : this.expired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
