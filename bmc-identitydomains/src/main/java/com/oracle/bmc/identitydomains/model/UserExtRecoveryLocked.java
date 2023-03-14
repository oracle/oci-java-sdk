/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A complex attribute that indicates an password recovery is locked (blocking new sessions)
 * <p>
 **Added In:** 19.1.4
 * <p>
 **SCIM++ Properties:**
 *  - idcsSearchable: false
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UserExtRecoveryLocked.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserExtRecoveryLocked
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"on", "lockDate"})
    public UserExtRecoveryLocked(Boolean on, String lockDate) {
        super();
        this.on = on;
        this.lockDate = lockDate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates that the rev is locked
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("on")
        private Boolean on;

        /**
         * Indicates that the rev is locked
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
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
         * The date and time that the current resource was locked
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: dateTime
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lockDate")
        private String lockDate;

        /**
         * The date and time that the current resource was locked
         * <p>
         **Added In:** 19.1.4
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtRecoveryLocked build() {
            UserExtRecoveryLocked model = new UserExtRecoveryLocked(this.on, this.lockDate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtRecoveryLocked model) {
            if (model.wasPropertyExplicitlySet("on")) {
                this.on(model.getOn());
            }
            if (model.wasPropertyExplicitlySet("lockDate")) {
                this.lockDate(model.getLockDate());
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
     * Indicates that the rev is locked
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("on")
    private final Boolean on;

    /**
     * Indicates that the rev is locked
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
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
     * The date and time that the current resource was locked
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lockDate")
    private final String lockDate;

    /**
     * The date and time that the current resource was locked
     * <p>
     **Added In:** 19.1.4
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: dateTime
     *  - uniqueness: none
     * @return the value
     **/
    public String getLockDate() {
        return lockDate;
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
        sb.append("UserExtRecoveryLocked(");
        sb.append("super=").append(super.toString());
        sb.append("on=").append(String.valueOf(this.on));
        sb.append(", lockDate=").append(String.valueOf(this.lockDate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtRecoveryLocked)) {
            return false;
        }

        UserExtRecoveryLocked other = (UserExtRecoveryLocked) o;
        return java.util.Objects.equals(this.on, other.on)
                && java.util.Objects.equals(this.lockDate, other.lockDate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.on == null ? 43 : this.on.hashCode());
        result = (result * PRIME) + (this.lockDate == null ? 43 : this.lockDate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
