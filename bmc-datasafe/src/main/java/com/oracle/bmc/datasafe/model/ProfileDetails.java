/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details of a particular profile
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProfileDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProfileDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("numUsers")
        private Integer numUsers;

        public Builder numUsers(Integer numUsers) {
            this.numUsers = numUsers;
            this.__explicitlySet__.add("numUsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectTime")
        private String connectTime;

        public Builder connectTime(String connectTime) {
            this.connectTime = connectTime;
            this.__explicitlySet__.add("connectTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failedLoginAttempts")
        private String failedLoginAttempts;

        public Builder failedLoginAttempts(String failedLoginAttempts) {
            this.failedLoginAttempts = failedLoginAttempts;
            this.__explicitlySet__.add("failedLoginAttempts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idleTime")
        private String idleTime;

        public Builder idleTime(String idleTime) {
            this.idleTime = idleTime;
            this.__explicitlySet__.add("idleTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inactiveAccountTime")
        private String inactiveAccountTime;

        public Builder inactiveAccountTime(String inactiveAccountTime) {
            this.inactiveAccountTime = inactiveAccountTime;
            this.__explicitlySet__.add("inactiveAccountTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordGraceTime")
        private String passwordGraceTime;

        public Builder passwordGraceTime(String passwordGraceTime) {
            this.passwordGraceTime = passwordGraceTime;
            this.__explicitlySet__.add("passwordGraceTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordLifeTime")
        private String passwordLifeTime;

        public Builder passwordLifeTime(String passwordLifeTime) {
            this.passwordLifeTime = passwordLifeTime;
            this.__explicitlySet__.add("passwordLifeTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordLockTime")
        private String passwordLockTime;

        public Builder passwordLockTime(String passwordLockTime) {
            this.passwordLockTime = passwordLockTime;
            this.__explicitlySet__.add("passwordLockTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseTime")
        private String passwordReuseTime;

        public Builder passwordReuseTime(String passwordReuseTime) {
            this.passwordReuseTime = passwordReuseTime;
            this.__explicitlySet__.add("passwordReuseTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseMax")
        private String passwordReuseMax;

        public Builder passwordReuseMax(String passwordReuseMax) {
            this.passwordReuseMax = passwordReuseMax;
            this.__explicitlySet__.add("passwordReuseMax");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordVerifyFunction")
        private String passwordVerifyFunction;

        public Builder passwordVerifyFunction(String passwordVerifyFunction) {
            this.passwordVerifyFunction = passwordVerifyFunction;
            this.__explicitlySet__.add("passwordVerifyFunction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProfileDetails build() {
            ProfileDetails __instance__ =
                    new ProfileDetails(
                            numUsers,
                            connectTime,
                            failedLoginAttempts,
                            idleTime,
                            inactiveAccountTime,
                            passwordGraceTime,
                            passwordLifeTime,
                            passwordLockTime,
                            passwordReuseTime,
                            passwordReuseMax,
                            passwordVerifyFunction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfileDetails o) {
            Builder copiedBuilder =
                    numUsers(o.getNumUsers())
                            .connectTime(o.getConnectTime())
                            .failedLoginAttempts(o.getFailedLoginAttempts())
                            .idleTime(o.getIdleTime())
                            .inactiveAccountTime(o.getInactiveAccountTime())
                            .passwordGraceTime(o.getPasswordGraceTime())
                            .passwordLifeTime(o.getPasswordLifeTime())
                            .passwordLockTime(o.getPasswordLockTime())
                            .passwordReuseTime(o.getPasswordReuseTime())
                            .passwordReuseMax(o.getPasswordReuseMax())
                            .passwordVerifyFunction(o.getPasswordVerifyFunction());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The number of users using this profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numUsers")
    Integer numUsers;

    /**
     * The value of the CONNECT_TIME resource parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectTime")
    String connectTime;

    /**
     * The value of the FAILED_LOGIN_ATTEMPTS password parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("failedLoginAttempts")
    String failedLoginAttempts;

    /**
     * The value of the IDLE_TIME resource parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idleTime")
    String idleTime;

    /**
     * The value of the INACTIVE_ACCOUNT_TIME password parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveAccountTime")
    String inactiveAccountTime;

    /**
     * The value of the PASSWORD_GRACE_TIME password parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordGraceTime")
    String passwordGraceTime;

    /**
     * The value of the PASSWORD_LIFE_TIME password parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordLifeTime")
    String passwordLifeTime;

    /**
     * The value of the PASSWORD_LOCK_TIME password parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordLockTime")
    String passwordLockTime;

    /**
     * The value of the PASSWORD_REUSE_TIME password parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseTime")
    String passwordReuseTime;

    /**
     * The value of the PASSWORD_REUSE_MAX resource parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseMax")
    String passwordReuseMax;

    /**
     * The value of the PASSWORD_VERIFY_FUNCTION resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVerifyFunction")
    String passwordVerifyFunction;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
