/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of a particular profile <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProfileDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ProfileDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "numUsers",
        "connectTime",
        "failedLoginAttempts",
        "idleTime",
        "inactiveAccountTime",
        "passwordGraceTime",
        "passwordLifeTime",
        "passwordLockTime",
        "passwordReuseTime",
        "passwordReuseMax",
        "passwordVerifyFunction"
    })
    public ProfileDetails(
            Integer numUsers,
            String connectTime,
            String failedLoginAttempts,
            String idleTime,
            String inactiveAccountTime,
            String passwordGraceTime,
            String passwordLifeTime,
            String passwordLockTime,
            String passwordReuseTime,
            String passwordReuseMax,
            String passwordVerifyFunction) {
        super();
        this.numUsers = numUsers;
        this.connectTime = connectTime;
        this.failedLoginAttempts = failedLoginAttempts;
        this.idleTime = idleTime;
        this.inactiveAccountTime = inactiveAccountTime;
        this.passwordGraceTime = passwordGraceTime;
        this.passwordLifeTime = passwordLifeTime;
        this.passwordLockTime = passwordLockTime;
        this.passwordReuseTime = passwordReuseTime;
        this.passwordReuseMax = passwordReuseMax;
        this.passwordVerifyFunction = passwordVerifyFunction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of users using this profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("numUsers")
        private Integer numUsers;

        /**
         * The number of users using this profile.
         *
         * @param numUsers the value to set
         * @return this builder
         */
        public Builder numUsers(Integer numUsers) {
            this.numUsers = numUsers;
            this.__explicitlySet__.add("numUsers");
            return this;
        }
        /** The value of the CONNECT_TIME resource parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectTime")
        private String connectTime;

        /**
         * The value of the CONNECT_TIME resource parameter.
         *
         * @param connectTime the value to set
         * @return this builder
         */
        public Builder connectTime(String connectTime) {
            this.connectTime = connectTime;
            this.__explicitlySet__.add("connectTime");
            return this;
        }
        /** The value of the FAILED_LOGIN_ATTEMPTS password parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("failedLoginAttempts")
        private String failedLoginAttempts;

        /**
         * The value of the FAILED_LOGIN_ATTEMPTS password parameter.
         *
         * @param failedLoginAttempts the value to set
         * @return this builder
         */
        public Builder failedLoginAttempts(String failedLoginAttempts) {
            this.failedLoginAttempts = failedLoginAttempts;
            this.__explicitlySet__.add("failedLoginAttempts");
            return this;
        }
        /** The value of the IDLE_TIME resource parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("idleTime")
        private String idleTime;

        /**
         * The value of the IDLE_TIME resource parameter.
         *
         * @param idleTime the value to set
         * @return this builder
         */
        public Builder idleTime(String idleTime) {
            this.idleTime = idleTime;
            this.__explicitlySet__.add("idleTime");
            return this;
        }
        /** The value of the INACTIVE_ACCOUNT_TIME password parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("inactiveAccountTime")
        private String inactiveAccountTime;

        /**
         * The value of the INACTIVE_ACCOUNT_TIME password parameter.
         *
         * @param inactiveAccountTime the value to set
         * @return this builder
         */
        public Builder inactiveAccountTime(String inactiveAccountTime) {
            this.inactiveAccountTime = inactiveAccountTime;
            this.__explicitlySet__.add("inactiveAccountTime");
            return this;
        }
        /** The value of the PASSWORD_GRACE_TIME password parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordGraceTime")
        private String passwordGraceTime;

        /**
         * The value of the PASSWORD_GRACE_TIME password parameter.
         *
         * @param passwordGraceTime the value to set
         * @return this builder
         */
        public Builder passwordGraceTime(String passwordGraceTime) {
            this.passwordGraceTime = passwordGraceTime;
            this.__explicitlySet__.add("passwordGraceTime");
            return this;
        }
        /** The value of the PASSWORD_LIFE_TIME password parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordLifeTime")
        private String passwordLifeTime;

        /**
         * The value of the PASSWORD_LIFE_TIME password parameter.
         *
         * @param passwordLifeTime the value to set
         * @return this builder
         */
        public Builder passwordLifeTime(String passwordLifeTime) {
            this.passwordLifeTime = passwordLifeTime;
            this.__explicitlySet__.add("passwordLifeTime");
            return this;
        }
        /** The value of the PASSWORD_LOCK_TIME password parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordLockTime")
        private String passwordLockTime;

        /**
         * The value of the PASSWORD_LOCK_TIME password parameter.
         *
         * @param passwordLockTime the value to set
         * @return this builder
         */
        public Builder passwordLockTime(String passwordLockTime) {
            this.passwordLockTime = passwordLockTime;
            this.__explicitlySet__.add("passwordLockTime");
            return this;
        }
        /** The value of the PASSWORD_REUSE_TIME password parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseTime")
        private String passwordReuseTime;

        /**
         * The value of the PASSWORD_REUSE_TIME password parameter.
         *
         * @param passwordReuseTime the value to set
         * @return this builder
         */
        public Builder passwordReuseTime(String passwordReuseTime) {
            this.passwordReuseTime = passwordReuseTime;
            this.__explicitlySet__.add("passwordReuseTime");
            return this;
        }
        /** The value of the PASSWORD_REUSE_MAX resource parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseMax")
        private String passwordReuseMax;

        /**
         * The value of the PASSWORD_REUSE_MAX resource parameter.
         *
         * @param passwordReuseMax the value to set
         * @return this builder
         */
        public Builder passwordReuseMax(String passwordReuseMax) {
            this.passwordReuseMax = passwordReuseMax;
            this.__explicitlySet__.add("passwordReuseMax");
            return this;
        }
        /** The value of the PASSWORD_VERIFY_FUNCTION resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordVerifyFunction")
        private String passwordVerifyFunction;

        /**
         * The value of the PASSWORD_VERIFY_FUNCTION resource.
         *
         * @param passwordVerifyFunction the value to set
         * @return this builder
         */
        public Builder passwordVerifyFunction(String passwordVerifyFunction) {
            this.passwordVerifyFunction = passwordVerifyFunction;
            this.__explicitlySet__.add("passwordVerifyFunction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProfileDetails build() {
            ProfileDetails model =
                    new ProfileDetails(
                            this.numUsers,
                            this.connectTime,
                            this.failedLoginAttempts,
                            this.idleTime,
                            this.inactiveAccountTime,
                            this.passwordGraceTime,
                            this.passwordLifeTime,
                            this.passwordLockTime,
                            this.passwordReuseTime,
                            this.passwordReuseMax,
                            this.passwordVerifyFunction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfileDetails model) {
            if (model.wasPropertyExplicitlySet("numUsers")) {
                this.numUsers(model.getNumUsers());
            }
            if (model.wasPropertyExplicitlySet("connectTime")) {
                this.connectTime(model.getConnectTime());
            }
            if (model.wasPropertyExplicitlySet("failedLoginAttempts")) {
                this.failedLoginAttempts(model.getFailedLoginAttempts());
            }
            if (model.wasPropertyExplicitlySet("idleTime")) {
                this.idleTime(model.getIdleTime());
            }
            if (model.wasPropertyExplicitlySet("inactiveAccountTime")) {
                this.inactiveAccountTime(model.getInactiveAccountTime());
            }
            if (model.wasPropertyExplicitlySet("passwordGraceTime")) {
                this.passwordGraceTime(model.getPasswordGraceTime());
            }
            if (model.wasPropertyExplicitlySet("passwordLifeTime")) {
                this.passwordLifeTime(model.getPasswordLifeTime());
            }
            if (model.wasPropertyExplicitlySet("passwordLockTime")) {
                this.passwordLockTime(model.getPasswordLockTime());
            }
            if (model.wasPropertyExplicitlySet("passwordReuseTime")) {
                this.passwordReuseTime(model.getPasswordReuseTime());
            }
            if (model.wasPropertyExplicitlySet("passwordReuseMax")) {
                this.passwordReuseMax(model.getPasswordReuseMax());
            }
            if (model.wasPropertyExplicitlySet("passwordVerifyFunction")) {
                this.passwordVerifyFunction(model.getPasswordVerifyFunction());
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

    /** The number of users using this profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("numUsers")
    private final Integer numUsers;

    /**
     * The number of users using this profile.
     *
     * @return the value
     */
    public Integer getNumUsers() {
        return numUsers;
    }

    /** The value of the CONNECT_TIME resource parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectTime")
    private final String connectTime;

    /**
     * The value of the CONNECT_TIME resource parameter.
     *
     * @return the value
     */
    public String getConnectTime() {
        return connectTime;
    }

    /** The value of the FAILED_LOGIN_ATTEMPTS password parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("failedLoginAttempts")
    private final String failedLoginAttempts;

    /**
     * The value of the FAILED_LOGIN_ATTEMPTS password parameter.
     *
     * @return the value
     */
    public String getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    /** The value of the IDLE_TIME resource parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("idleTime")
    private final String idleTime;

    /**
     * The value of the IDLE_TIME resource parameter.
     *
     * @return the value
     */
    public String getIdleTime() {
        return idleTime;
    }

    /** The value of the INACTIVE_ACCOUNT_TIME password parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveAccountTime")
    private final String inactiveAccountTime;

    /**
     * The value of the INACTIVE_ACCOUNT_TIME password parameter.
     *
     * @return the value
     */
    public String getInactiveAccountTime() {
        return inactiveAccountTime;
    }

    /** The value of the PASSWORD_GRACE_TIME password parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordGraceTime")
    private final String passwordGraceTime;

    /**
     * The value of the PASSWORD_GRACE_TIME password parameter.
     *
     * @return the value
     */
    public String getPasswordGraceTime() {
        return passwordGraceTime;
    }

    /** The value of the PASSWORD_LIFE_TIME password parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordLifeTime")
    private final String passwordLifeTime;

    /**
     * The value of the PASSWORD_LIFE_TIME password parameter.
     *
     * @return the value
     */
    public String getPasswordLifeTime() {
        return passwordLifeTime;
    }

    /** The value of the PASSWORD_LOCK_TIME password parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordLockTime")
    private final String passwordLockTime;

    /**
     * The value of the PASSWORD_LOCK_TIME password parameter.
     *
     * @return the value
     */
    public String getPasswordLockTime() {
        return passwordLockTime;
    }

    /** The value of the PASSWORD_REUSE_TIME password parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseTime")
    private final String passwordReuseTime;

    /**
     * The value of the PASSWORD_REUSE_TIME password parameter.
     *
     * @return the value
     */
    public String getPasswordReuseTime() {
        return passwordReuseTime;
    }

    /** The value of the PASSWORD_REUSE_MAX resource parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseMax")
    private final String passwordReuseMax;

    /**
     * The value of the PASSWORD_REUSE_MAX resource parameter.
     *
     * @return the value
     */
    public String getPasswordReuseMax() {
        return passwordReuseMax;
    }

    /** The value of the PASSWORD_VERIFY_FUNCTION resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVerifyFunction")
    private final String passwordVerifyFunction;

    /**
     * The value of the PASSWORD_VERIFY_FUNCTION resource.
     *
     * @return the value
     */
    public String getPasswordVerifyFunction() {
        return passwordVerifyFunction;
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
        sb.append("ProfileDetails(");
        sb.append("super=").append(super.toString());
        sb.append("numUsers=").append(String.valueOf(this.numUsers));
        sb.append(", connectTime=").append(String.valueOf(this.connectTime));
        sb.append(", failedLoginAttempts=").append(String.valueOf(this.failedLoginAttempts));
        sb.append(", idleTime=").append(String.valueOf(this.idleTime));
        sb.append(", inactiveAccountTime=").append(String.valueOf(this.inactiveAccountTime));
        sb.append(", passwordGraceTime=").append(String.valueOf(this.passwordGraceTime));
        sb.append(", passwordLifeTime=").append(String.valueOf(this.passwordLifeTime));
        sb.append(", passwordLockTime=").append(String.valueOf(this.passwordLockTime));
        sb.append(", passwordReuseTime=").append(String.valueOf(this.passwordReuseTime));
        sb.append(", passwordReuseMax=").append(String.valueOf(this.passwordReuseMax));
        sb.append(", passwordVerifyFunction=").append(String.valueOf(this.passwordVerifyFunction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProfileDetails)) {
            return false;
        }

        ProfileDetails other = (ProfileDetails) o;
        return java.util.Objects.equals(this.numUsers, other.numUsers)
                && java.util.Objects.equals(this.connectTime, other.connectTime)
                && java.util.Objects.equals(this.failedLoginAttempts, other.failedLoginAttempts)
                && java.util.Objects.equals(this.idleTime, other.idleTime)
                && java.util.Objects.equals(this.inactiveAccountTime, other.inactiveAccountTime)
                && java.util.Objects.equals(this.passwordGraceTime, other.passwordGraceTime)
                && java.util.Objects.equals(this.passwordLifeTime, other.passwordLifeTime)
                && java.util.Objects.equals(this.passwordLockTime, other.passwordLockTime)
                && java.util.Objects.equals(this.passwordReuseTime, other.passwordReuseTime)
                && java.util.Objects.equals(this.passwordReuseMax, other.passwordReuseMax)
                && java.util.Objects.equals(
                        this.passwordVerifyFunction, other.passwordVerifyFunction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.numUsers == null ? 43 : this.numUsers.hashCode());
        result = (result * PRIME) + (this.connectTime == null ? 43 : this.connectTime.hashCode());
        result =
                (result * PRIME)
                        + (this.failedLoginAttempts == null
                                ? 43
                                : this.failedLoginAttempts.hashCode());
        result = (result * PRIME) + (this.idleTime == null ? 43 : this.idleTime.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveAccountTime == null
                                ? 43
                                : this.inactiveAccountTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordGraceTime == null ? 43 : this.passwordGraceTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordLifeTime == null ? 43 : this.passwordLifeTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordLockTime == null ? 43 : this.passwordLockTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordReuseTime == null ? 43 : this.passwordReuseTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordReuseMax == null ? 43 : this.passwordReuseMax.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordVerifyFunction == null
                                ? 43
                                : this.passwordVerifyFunction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
