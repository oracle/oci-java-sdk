/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The comprehensive information about the user profiles available on a given target. It includes
 * details such as profile name, failed login attempts, password reuse time, password verification
 * function, password verification function implementation code snippet, sessions per user, connect
 * time inactive account time, password lock time, cpu usage per session, target id, and compartment
 * id. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Profile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Profile extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "userAssessmentId",
        "compartmentId",
        "targetId",
        "profileName",
        "userCount",
        "failedLoginAttempts",
        "passwordVerificationFunction",
        "passwordVerificationFunctionDetails",
        "passwordLockTime",
        "passwordLifeTime",
        "passwordReuseMax",
        "passwordReuseTime",
        "passwordRolloverTime",
        "passwordGraceTime",
        "isUserCreated",
        "sessionsPerUser",
        "inactiveAccountTime",
        "connectTime",
        "idleTime",
        "compositeLimit",
        "cpuPerCall",
        "cpuPerSession",
        "logicalReadsPerCall",
        "logicalReadsPerSession",
        "privateSga",
        "freeformTags",
        "definedTags"
    })
    public Profile(
            String userAssessmentId,
            String compartmentId,
            String targetId,
            String profileName,
            Integer userCount,
            String failedLoginAttempts,
            String passwordVerificationFunction,
            String passwordVerificationFunctionDetails,
            String passwordLockTime,
            String passwordLifeTime,
            String passwordReuseMax,
            String passwordReuseTime,
            String passwordRolloverTime,
            String passwordGraceTime,
            Boolean isUserCreated,
            String sessionsPerUser,
            String inactiveAccountTime,
            String connectTime,
            String idleTime,
            String compositeLimit,
            String cpuPerCall,
            String cpuPerSession,
            String logicalReadsPerCall,
            String logicalReadsPerSession,
            String privateSga,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.userAssessmentId = userAssessmentId;
        this.compartmentId = compartmentId;
        this.targetId = targetId;
        this.profileName = profileName;
        this.userCount = userCount;
        this.failedLoginAttempts = failedLoginAttempts;
        this.passwordVerificationFunction = passwordVerificationFunction;
        this.passwordVerificationFunctionDetails = passwordVerificationFunctionDetails;
        this.passwordLockTime = passwordLockTime;
        this.passwordLifeTime = passwordLifeTime;
        this.passwordReuseMax = passwordReuseMax;
        this.passwordReuseTime = passwordReuseTime;
        this.passwordRolloverTime = passwordRolloverTime;
        this.passwordGraceTime = passwordGraceTime;
        this.isUserCreated = isUserCreated;
        this.sessionsPerUser = sessionsPerUser;
        this.inactiveAccountTime = inactiveAccountTime;
        this.connectTime = connectTime;
        this.idleTime = idleTime;
        this.compositeLimit = compositeLimit;
        this.cpuPerCall = cpuPerCall;
        this.cpuPerSession = cpuPerSession;
        this.logicalReadsPerCall = logicalReadsPerCall;
        this.logicalReadsPerSession = logicalReadsPerSession;
        this.privateSga = privateSga;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the user assessment corresponding to the target under consideration. */
        @com.fasterxml.jackson.annotation.JsonProperty("userAssessmentId")
        private String userAssessmentId;

        /**
         * The OCID of the user assessment corresponding to the target under consideration.
         *
         * @param userAssessmentId the value to set
         * @return this builder
         */
        public Builder userAssessmentId(String userAssessmentId) {
            this.userAssessmentId = userAssessmentId;
            this.__explicitlySet__.add("userAssessmentId");
            return this;
        }
        /** The OCID of the compartment that contains the user assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the user assessment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The name of the profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("profileName")
        private String profileName;

        /**
         * The name of the profile.
         *
         * @param profileName the value to set
         * @return this builder
         */
        public Builder profileName(String profileName) {
            this.profileName = profileName;
            this.__explicitlySet__.add("profileName");
            return this;
        }
        /** The number of users having a given profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("userCount")
        private Integer userCount;

        /**
         * The number of users having a given profile.
         *
         * @param userCount the value to set
         * @return this builder
         */
        public Builder userCount(Integer userCount) {
            this.userCount = userCount;
            this.__explicitlySet__.add("userCount");
            return this;
        }
        /** Maximum times the user is allowed in fail login before the user account is locked. */
        @com.fasterxml.jackson.annotation.JsonProperty("failedLoginAttempts")
        private String failedLoginAttempts;

        /**
         * Maximum times the user is allowed in fail login before the user account is locked.
         *
         * @param failedLoginAttempts the value to set
         * @return this builder
         */
        public Builder failedLoginAttempts(String failedLoginAttempts) {
            this.failedLoginAttempts = failedLoginAttempts;
            this.__explicitlySet__.add("failedLoginAttempts");
            return this;
        }
        /** Name of the PL/SQL that can be used for password verification. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordVerificationFunction")
        private String passwordVerificationFunction;

        /**
         * Name of the PL/SQL that can be used for password verification.
         *
         * @param passwordVerificationFunction the value to set
         * @return this builder
         */
        public Builder passwordVerificationFunction(String passwordVerificationFunction) {
            this.passwordVerificationFunction = passwordVerificationFunction;
            this.__explicitlySet__.add("passwordVerificationFunction");
            return this;
        }
        /** Details about the PL/SQL that can be used for password verification. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordVerificationFunctionDetails")
        private String passwordVerificationFunctionDetails;

        /**
         * Details about the PL/SQL that can be used for password verification.
         *
         * @param passwordVerificationFunctionDetails the value to set
         * @return this builder
         */
        public Builder passwordVerificationFunctionDetails(
                String passwordVerificationFunctionDetails) {
            this.passwordVerificationFunctionDetails = passwordVerificationFunctionDetails;
            this.__explicitlySet__.add("passwordVerificationFunctionDetails");
            return this;
        }
        /** Number of days the user account remains locked after failed login. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordLockTime")
        private String passwordLockTime;

        /**
         * Number of days the user account remains locked after failed login.
         *
         * @param passwordLockTime the value to set
         * @return this builder
         */
        public Builder passwordLockTime(String passwordLockTime) {
            this.passwordLockTime = passwordLockTime;
            this.__explicitlySet__.add("passwordLockTime");
            return this;
        }
        /** Number of days the password is valid before expiry. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordLifeTime")
        private String passwordLifeTime;

        /**
         * Number of days the password is valid before expiry.
         *
         * @param passwordLifeTime the value to set
         * @return this builder
         */
        public Builder passwordLifeTime(String passwordLifeTime) {
            this.passwordLifeTime = passwordLifeTime;
            this.__explicitlySet__.add("passwordLifeTime");
            return this;
        }
        /** Number of day after the user can use the already used password. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseMax")
        private String passwordReuseMax;

        /**
         * Number of day after the user can use the already used password.
         *
         * @param passwordReuseMax the value to set
         * @return this builder
         */
        public Builder passwordReuseMax(String passwordReuseMax) {
            this.passwordReuseMax = passwordReuseMax;
            this.__explicitlySet__.add("passwordReuseMax");
            return this;
        }
        /** Number of days before which a password cannot be reused. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseTime")
        private String passwordReuseTime;

        /**
         * Number of days before which a password cannot be reused.
         *
         * @param passwordReuseTime the value to set
         * @return this builder
         */
        public Builder passwordReuseTime(String passwordReuseTime) {
            this.passwordReuseTime = passwordReuseTime;
            this.__explicitlySet__.add("passwordReuseTime");
            return this;
        }
        /**
         * Number of days the password rollover is allowed. Minimum value can be 1/24 day (1 hour)
         * to 60 days.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordRolloverTime")
        private String passwordRolloverTime;

        /**
         * Number of days the password rollover is allowed. Minimum value can be 1/24 day (1 hour)
         * to 60 days.
         *
         * @param passwordRolloverTime the value to set
         * @return this builder
         */
        public Builder passwordRolloverTime(String passwordRolloverTime) {
            this.passwordRolloverTime = passwordRolloverTime;
            this.__explicitlySet__.add("passwordRolloverTime");
            return this;
        }
        /** Number of grace days for user to change password. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordGraceTime")
        private String passwordGraceTime;

        /**
         * Number of grace days for user to change password.
         *
         * @param passwordGraceTime the value to set
         * @return this builder
         */
        public Builder passwordGraceTime(String passwordGraceTime) {
            this.passwordGraceTime = passwordGraceTime;
            this.__explicitlySet__.add("passwordGraceTime");
            return this;
        }
        /** Represents if the profile is created by user. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUserCreated")
        private Boolean isUserCreated;

        /**
         * Represents if the profile is created by user.
         *
         * @param isUserCreated the value to set
         * @return this builder
         */
        public Builder isUserCreated(Boolean isUserCreated) {
            this.isUserCreated = isUserCreated;
            this.__explicitlySet__.add("isUserCreated");
            return this;
        }
        /** Specify the number of concurrent sessions to which you want to limit the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("sessionsPerUser")
        private String sessionsPerUser;

        /**
         * Specify the number of concurrent sessions to which you want to limit the user.
         *
         * @param sessionsPerUser the value to set
         * @return this builder
         */
        public Builder sessionsPerUser(String sessionsPerUser) {
            this.sessionsPerUser = sessionsPerUser;
            this.__explicitlySet__.add("sessionsPerUser");
            return this;
        }
        /**
         * The permitted periods of continuous inactive time during a session, expressed in minutes.
         * Long-running queries and other operations are not subject to this limit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inactiveAccountTime")
        private String inactiveAccountTime;

        /**
         * The permitted periods of continuous inactive time during a session, expressed in minutes.
         * Long-running queries and other operations are not subject to this limit.
         *
         * @param inactiveAccountTime the value to set
         * @return this builder
         */
        public Builder inactiveAccountTime(String inactiveAccountTime) {
            this.inactiveAccountTime = inactiveAccountTime;
            this.__explicitlySet__.add("inactiveAccountTime");
            return this;
        }
        /** Specify the total elapsed time limit for a session, expressed in minutes. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectTime")
        private String connectTime;

        /**
         * Specify the total elapsed time limit for a session, expressed in minutes.
         *
         * @param connectTime the value to set
         * @return this builder
         */
        public Builder connectTime(String connectTime) {
            this.connectTime = connectTime;
            this.__explicitlySet__.add("connectTime");
            return this;
        }
        /**
         * Specify the permitted periods of continuous inactive time during a session, expressed in
         * minutes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idleTime")
        private String idleTime;

        /**
         * Specify the permitted periods of continuous inactive time during a session, expressed in
         * minutes.
         *
         * @param idleTime the value to set
         * @return this builder
         */
        public Builder idleTime(String idleTime) {
            this.idleTime = idleTime;
            this.__explicitlySet__.add("idleTime");
            return this;
        }
        /**
         * Specify the total resource cost for a session, expressed in service units. Oracle
         * Database calculates the total service units as a weighted sum of CPU_PER_SESSION,
         * CONNECT_TIME, LOGICAL_READS_PER_SESSION, and PRIVATE_SGA.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compositeLimit")
        private String compositeLimit;

        /**
         * Specify the total resource cost for a session, expressed in service units. Oracle
         * Database calculates the total service units as a weighted sum of CPU_PER_SESSION,
         * CONNECT_TIME, LOGICAL_READS_PER_SESSION, and PRIVATE_SGA.
         *
         * @param compositeLimit the value to set
         * @return this builder
         */
        public Builder compositeLimit(String compositeLimit) {
            this.compositeLimit = compositeLimit;
            this.__explicitlySet__.add("compositeLimit");
            return this;
        }
        /**
         * Specify the CPU time limit for a call (a parse, execute, or fetch), expressed in
         * hundredths of seconds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuPerCall")
        private String cpuPerCall;

        /**
         * Specify the CPU time limit for a call (a parse, execute, or fetch), expressed in
         * hundredths of seconds.
         *
         * @param cpuPerCall the value to set
         * @return this builder
         */
        public Builder cpuPerCall(String cpuPerCall) {
            this.cpuPerCall = cpuPerCall;
            this.__explicitlySet__.add("cpuPerCall");
            return this;
        }
        /** Specify the CPU time limit for a session, expressed in hundredth of seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuPerSession")
        private String cpuPerSession;

        /**
         * Specify the CPU time limit for a session, expressed in hundredth of seconds.
         *
         * @param cpuPerSession the value to set
         * @return this builder
         */
        public Builder cpuPerSession(String cpuPerSession) {
            this.cpuPerSession = cpuPerSession;
            this.__explicitlySet__.add("cpuPerSession");
            return this;
        }
        /**
         * Specify the permitted the number of data blocks read for a call to process a SQL
         * statement (a parse, execute, or fetch).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logicalReadsPerCall")
        private String logicalReadsPerCall;

        /**
         * Specify the permitted the number of data blocks read for a call to process a SQL
         * statement (a parse, execute, or fetch).
         *
         * @param logicalReadsPerCall the value to set
         * @return this builder
         */
        public Builder logicalReadsPerCall(String logicalReadsPerCall) {
            this.logicalReadsPerCall = logicalReadsPerCall;
            this.__explicitlySet__.add("logicalReadsPerCall");
            return this;
        }
        /**
         * Specify the permitted number of data blocks read in a session, including blocks read from
         * memory and disk.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logicalReadsPerSession")
        private String logicalReadsPerSession;

        /**
         * Specify the permitted number of data blocks read in a session, including blocks read from
         * memory and disk.
         *
         * @param logicalReadsPerSession the value to set
         * @return this builder
         */
        public Builder logicalReadsPerSession(String logicalReadsPerSession) {
            this.logicalReadsPerSession = logicalReadsPerSession;
            this.__explicitlySet__.add("logicalReadsPerSession");
            return this;
        }
        /**
         * Specify the amount of private space a session can allocate in the shared pool of the
         * system global area (SGA), expressed in bytes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateSga")
        private String privateSga;

        /**
         * Specify the amount of private space a session can allocate in the shared pool of the
         * system global area (SGA), expressed in bytes.
         *
         * @param privateSga the value to set
         * @return this builder
         */
        public Builder privateSga(String privateSga) {
            this.privateSga = privateSga;
            this.__explicitlySet__.add("privateSga");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Profile build() {
            Profile model =
                    new Profile(
                            this.userAssessmentId,
                            this.compartmentId,
                            this.targetId,
                            this.profileName,
                            this.userCount,
                            this.failedLoginAttempts,
                            this.passwordVerificationFunction,
                            this.passwordVerificationFunctionDetails,
                            this.passwordLockTime,
                            this.passwordLifeTime,
                            this.passwordReuseMax,
                            this.passwordReuseTime,
                            this.passwordRolloverTime,
                            this.passwordGraceTime,
                            this.isUserCreated,
                            this.sessionsPerUser,
                            this.inactiveAccountTime,
                            this.connectTime,
                            this.idleTime,
                            this.compositeLimit,
                            this.cpuPerCall,
                            this.cpuPerSession,
                            this.logicalReadsPerCall,
                            this.logicalReadsPerSession,
                            this.privateSga,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Profile model) {
            if (model.wasPropertyExplicitlySet("userAssessmentId")) {
                this.userAssessmentId(model.getUserAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("profileName")) {
                this.profileName(model.getProfileName());
            }
            if (model.wasPropertyExplicitlySet("userCount")) {
                this.userCount(model.getUserCount());
            }
            if (model.wasPropertyExplicitlySet("failedLoginAttempts")) {
                this.failedLoginAttempts(model.getFailedLoginAttempts());
            }
            if (model.wasPropertyExplicitlySet("passwordVerificationFunction")) {
                this.passwordVerificationFunction(model.getPasswordVerificationFunction());
            }
            if (model.wasPropertyExplicitlySet("passwordVerificationFunctionDetails")) {
                this.passwordVerificationFunctionDetails(
                        model.getPasswordVerificationFunctionDetails());
            }
            if (model.wasPropertyExplicitlySet("passwordLockTime")) {
                this.passwordLockTime(model.getPasswordLockTime());
            }
            if (model.wasPropertyExplicitlySet("passwordLifeTime")) {
                this.passwordLifeTime(model.getPasswordLifeTime());
            }
            if (model.wasPropertyExplicitlySet("passwordReuseMax")) {
                this.passwordReuseMax(model.getPasswordReuseMax());
            }
            if (model.wasPropertyExplicitlySet("passwordReuseTime")) {
                this.passwordReuseTime(model.getPasswordReuseTime());
            }
            if (model.wasPropertyExplicitlySet("passwordRolloverTime")) {
                this.passwordRolloverTime(model.getPasswordRolloverTime());
            }
            if (model.wasPropertyExplicitlySet("passwordGraceTime")) {
                this.passwordGraceTime(model.getPasswordGraceTime());
            }
            if (model.wasPropertyExplicitlySet("isUserCreated")) {
                this.isUserCreated(model.getIsUserCreated());
            }
            if (model.wasPropertyExplicitlySet("sessionsPerUser")) {
                this.sessionsPerUser(model.getSessionsPerUser());
            }
            if (model.wasPropertyExplicitlySet("inactiveAccountTime")) {
                this.inactiveAccountTime(model.getInactiveAccountTime());
            }
            if (model.wasPropertyExplicitlySet("connectTime")) {
                this.connectTime(model.getConnectTime());
            }
            if (model.wasPropertyExplicitlySet("idleTime")) {
                this.idleTime(model.getIdleTime());
            }
            if (model.wasPropertyExplicitlySet("compositeLimit")) {
                this.compositeLimit(model.getCompositeLimit());
            }
            if (model.wasPropertyExplicitlySet("cpuPerCall")) {
                this.cpuPerCall(model.getCpuPerCall());
            }
            if (model.wasPropertyExplicitlySet("cpuPerSession")) {
                this.cpuPerSession(model.getCpuPerSession());
            }
            if (model.wasPropertyExplicitlySet("logicalReadsPerCall")) {
                this.logicalReadsPerCall(model.getLogicalReadsPerCall());
            }
            if (model.wasPropertyExplicitlySet("logicalReadsPerSession")) {
                this.logicalReadsPerSession(model.getLogicalReadsPerSession());
            }
            if (model.wasPropertyExplicitlySet("privateSga")) {
                this.privateSga(model.getPrivateSga());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The OCID of the user assessment corresponding to the target under consideration. */
    @com.fasterxml.jackson.annotation.JsonProperty("userAssessmentId")
    private final String userAssessmentId;

    /**
     * The OCID of the user assessment corresponding to the target under consideration.
     *
     * @return the value
     */
    public String getUserAssessmentId() {
        return userAssessmentId;
    }

    /** The OCID of the compartment that contains the user assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the user assessment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The name of the profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("profileName")
    private final String profileName;

    /**
     * The name of the profile.
     *
     * @return the value
     */
    public String getProfileName() {
        return profileName;
    }

    /** The number of users having a given profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("userCount")
    private final Integer userCount;

    /**
     * The number of users having a given profile.
     *
     * @return the value
     */
    public Integer getUserCount() {
        return userCount;
    }

    /** Maximum times the user is allowed in fail login before the user account is locked. */
    @com.fasterxml.jackson.annotation.JsonProperty("failedLoginAttempts")
    private final String failedLoginAttempts;

    /**
     * Maximum times the user is allowed in fail login before the user account is locked.
     *
     * @return the value
     */
    public String getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    /** Name of the PL/SQL that can be used for password verification. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVerificationFunction")
    private final String passwordVerificationFunction;

    /**
     * Name of the PL/SQL that can be used for password verification.
     *
     * @return the value
     */
    public String getPasswordVerificationFunction() {
        return passwordVerificationFunction;
    }

    /** Details about the PL/SQL that can be used for password verification. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVerificationFunctionDetails")
    private final String passwordVerificationFunctionDetails;

    /**
     * Details about the PL/SQL that can be used for password verification.
     *
     * @return the value
     */
    public String getPasswordVerificationFunctionDetails() {
        return passwordVerificationFunctionDetails;
    }

    /** Number of days the user account remains locked after failed login. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordLockTime")
    private final String passwordLockTime;

    /**
     * Number of days the user account remains locked after failed login.
     *
     * @return the value
     */
    public String getPasswordLockTime() {
        return passwordLockTime;
    }

    /** Number of days the password is valid before expiry. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordLifeTime")
    private final String passwordLifeTime;

    /**
     * Number of days the password is valid before expiry.
     *
     * @return the value
     */
    public String getPasswordLifeTime() {
        return passwordLifeTime;
    }

    /** Number of day after the user can use the already used password. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseMax")
    private final String passwordReuseMax;

    /**
     * Number of day after the user can use the already used password.
     *
     * @return the value
     */
    public String getPasswordReuseMax() {
        return passwordReuseMax;
    }

    /** Number of days before which a password cannot be reused. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordReuseTime")
    private final String passwordReuseTime;

    /**
     * Number of days before which a password cannot be reused.
     *
     * @return the value
     */
    public String getPasswordReuseTime() {
        return passwordReuseTime;
    }

    /**
     * Number of days the password rollover is allowed. Minimum value can be 1/24 day (1 hour) to 60
     * days.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordRolloverTime")
    private final String passwordRolloverTime;

    /**
     * Number of days the password rollover is allowed. Minimum value can be 1/24 day (1 hour) to 60
     * days.
     *
     * @return the value
     */
    public String getPasswordRolloverTime() {
        return passwordRolloverTime;
    }

    /** Number of grace days for user to change password. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordGraceTime")
    private final String passwordGraceTime;

    /**
     * Number of grace days for user to change password.
     *
     * @return the value
     */
    public String getPasswordGraceTime() {
        return passwordGraceTime;
    }

    /** Represents if the profile is created by user. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUserCreated")
    private final Boolean isUserCreated;

    /**
     * Represents if the profile is created by user.
     *
     * @return the value
     */
    public Boolean getIsUserCreated() {
        return isUserCreated;
    }

    /** Specify the number of concurrent sessions to which you want to limit the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("sessionsPerUser")
    private final String sessionsPerUser;

    /**
     * Specify the number of concurrent sessions to which you want to limit the user.
     *
     * @return the value
     */
    public String getSessionsPerUser() {
        return sessionsPerUser;
    }

    /**
     * The permitted periods of continuous inactive time during a session, expressed in minutes.
     * Long-running queries and other operations are not subject to this limit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveAccountTime")
    private final String inactiveAccountTime;

    /**
     * The permitted periods of continuous inactive time during a session, expressed in minutes.
     * Long-running queries and other operations are not subject to this limit.
     *
     * @return the value
     */
    public String getInactiveAccountTime() {
        return inactiveAccountTime;
    }

    /** Specify the total elapsed time limit for a session, expressed in minutes. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectTime")
    private final String connectTime;

    /**
     * Specify the total elapsed time limit for a session, expressed in minutes.
     *
     * @return the value
     */
    public String getConnectTime() {
        return connectTime;
    }

    /**
     * Specify the permitted periods of continuous inactive time during a session, expressed in
     * minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idleTime")
    private final String idleTime;

    /**
     * Specify the permitted periods of continuous inactive time during a session, expressed in
     * minutes.
     *
     * @return the value
     */
    public String getIdleTime() {
        return idleTime;
    }

    /**
     * Specify the total resource cost for a session, expressed in service units. Oracle Database
     * calculates the total service units as a weighted sum of CPU_PER_SESSION, CONNECT_TIME,
     * LOGICAL_READS_PER_SESSION, and PRIVATE_SGA.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compositeLimit")
    private final String compositeLimit;

    /**
     * Specify the total resource cost for a session, expressed in service units. Oracle Database
     * calculates the total service units as a weighted sum of CPU_PER_SESSION, CONNECT_TIME,
     * LOGICAL_READS_PER_SESSION, and PRIVATE_SGA.
     *
     * @return the value
     */
    public String getCompositeLimit() {
        return compositeLimit;
    }

    /**
     * Specify the CPU time limit for a call (a parse, execute, or fetch), expressed in hundredths
     * of seconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuPerCall")
    private final String cpuPerCall;

    /**
     * Specify the CPU time limit for a call (a parse, execute, or fetch), expressed in hundredths
     * of seconds.
     *
     * @return the value
     */
    public String getCpuPerCall() {
        return cpuPerCall;
    }

    /** Specify the CPU time limit for a session, expressed in hundredth of seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuPerSession")
    private final String cpuPerSession;

    /**
     * Specify the CPU time limit for a session, expressed in hundredth of seconds.
     *
     * @return the value
     */
    public String getCpuPerSession() {
        return cpuPerSession;
    }

    /**
     * Specify the permitted the number of data blocks read for a call to process a SQL statement (a
     * parse, execute, or fetch).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logicalReadsPerCall")
    private final String logicalReadsPerCall;

    /**
     * Specify the permitted the number of data blocks read for a call to process a SQL statement (a
     * parse, execute, or fetch).
     *
     * @return the value
     */
    public String getLogicalReadsPerCall() {
        return logicalReadsPerCall;
    }

    /**
     * Specify the permitted number of data blocks read in a session, including blocks read from
     * memory and disk.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logicalReadsPerSession")
    private final String logicalReadsPerSession;

    /**
     * Specify the permitted number of data blocks read in a session, including blocks read from
     * memory and disk.
     *
     * @return the value
     */
    public String getLogicalReadsPerSession() {
        return logicalReadsPerSession;
    }

    /**
     * Specify the amount of private space a session can allocate in the shared pool of the system
     * global area (SGA), expressed in bytes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateSga")
    private final String privateSga;

    /**
     * Specify the amount of private space a session can allocate in the shared pool of the system
     * global area (SGA), expressed in bytes.
     *
     * @return the value
     */
    public String getPrivateSga() {
        return privateSga;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("Profile(");
        sb.append("super=").append(super.toString());
        sb.append("userAssessmentId=").append(String.valueOf(this.userAssessmentId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", profileName=").append(String.valueOf(this.profileName));
        sb.append(", userCount=").append(String.valueOf(this.userCount));
        sb.append(", failedLoginAttempts=").append(String.valueOf(this.failedLoginAttempts));
        sb.append(", passwordVerificationFunction=")
                .append(String.valueOf(this.passwordVerificationFunction));
        sb.append(", passwordVerificationFunctionDetails=")
                .append(String.valueOf(this.passwordVerificationFunctionDetails));
        sb.append(", passwordLockTime=").append(String.valueOf(this.passwordLockTime));
        sb.append(", passwordLifeTime=").append(String.valueOf(this.passwordLifeTime));
        sb.append(", passwordReuseMax=").append(String.valueOf(this.passwordReuseMax));
        sb.append(", passwordReuseTime=").append(String.valueOf(this.passwordReuseTime));
        sb.append(", passwordRolloverTime=").append(String.valueOf(this.passwordRolloverTime));
        sb.append(", passwordGraceTime=").append(String.valueOf(this.passwordGraceTime));
        sb.append(", isUserCreated=").append(String.valueOf(this.isUserCreated));
        sb.append(", sessionsPerUser=").append(String.valueOf(this.sessionsPerUser));
        sb.append(", inactiveAccountTime=").append(String.valueOf(this.inactiveAccountTime));
        sb.append(", connectTime=").append(String.valueOf(this.connectTime));
        sb.append(", idleTime=").append(String.valueOf(this.idleTime));
        sb.append(", compositeLimit=").append(String.valueOf(this.compositeLimit));
        sb.append(", cpuPerCall=").append(String.valueOf(this.cpuPerCall));
        sb.append(", cpuPerSession=").append(String.valueOf(this.cpuPerSession));
        sb.append(", logicalReadsPerCall=").append(String.valueOf(this.logicalReadsPerCall));
        sb.append(", logicalReadsPerSession=").append(String.valueOf(this.logicalReadsPerSession));
        sb.append(", privateSga=").append(String.valueOf(this.privateSga));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Profile)) {
            return false;
        }

        Profile other = (Profile) o;
        return java.util.Objects.equals(this.userAssessmentId, other.userAssessmentId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.profileName, other.profileName)
                && java.util.Objects.equals(this.userCount, other.userCount)
                && java.util.Objects.equals(this.failedLoginAttempts, other.failedLoginAttempts)
                && java.util.Objects.equals(
                        this.passwordVerificationFunction, other.passwordVerificationFunction)
                && java.util.Objects.equals(
                        this.passwordVerificationFunctionDetails,
                        other.passwordVerificationFunctionDetails)
                && java.util.Objects.equals(this.passwordLockTime, other.passwordLockTime)
                && java.util.Objects.equals(this.passwordLifeTime, other.passwordLifeTime)
                && java.util.Objects.equals(this.passwordReuseMax, other.passwordReuseMax)
                && java.util.Objects.equals(this.passwordReuseTime, other.passwordReuseTime)
                && java.util.Objects.equals(this.passwordRolloverTime, other.passwordRolloverTime)
                && java.util.Objects.equals(this.passwordGraceTime, other.passwordGraceTime)
                && java.util.Objects.equals(this.isUserCreated, other.isUserCreated)
                && java.util.Objects.equals(this.sessionsPerUser, other.sessionsPerUser)
                && java.util.Objects.equals(this.inactiveAccountTime, other.inactiveAccountTime)
                && java.util.Objects.equals(this.connectTime, other.connectTime)
                && java.util.Objects.equals(this.idleTime, other.idleTime)
                && java.util.Objects.equals(this.compositeLimit, other.compositeLimit)
                && java.util.Objects.equals(this.cpuPerCall, other.cpuPerCall)
                && java.util.Objects.equals(this.cpuPerSession, other.cpuPerSession)
                && java.util.Objects.equals(this.logicalReadsPerCall, other.logicalReadsPerCall)
                && java.util.Objects.equals(
                        this.logicalReadsPerSession, other.logicalReadsPerSession)
                && java.util.Objects.equals(this.privateSga, other.privateSga)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.userAssessmentId == null ? 43 : this.userAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.profileName == null ? 43 : this.profileName.hashCode());
        result = (result * PRIME) + (this.userCount == null ? 43 : this.userCount.hashCode());
        result =
                (result * PRIME)
                        + (this.failedLoginAttempts == null
                                ? 43
                                : this.failedLoginAttempts.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordVerificationFunction == null
                                ? 43
                                : this.passwordVerificationFunction.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordVerificationFunctionDetails == null
                                ? 43
                                : this.passwordVerificationFunctionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordLockTime == null ? 43 : this.passwordLockTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordLifeTime == null ? 43 : this.passwordLifeTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordReuseMax == null ? 43 : this.passwordReuseMax.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordReuseTime == null ? 43 : this.passwordReuseTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordRolloverTime == null
                                ? 43
                                : this.passwordRolloverTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordGraceTime == null ? 43 : this.passwordGraceTime.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserCreated == null ? 43 : this.isUserCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionsPerUser == null ? 43 : this.sessionsPerUser.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveAccountTime == null
                                ? 43
                                : this.inactiveAccountTime.hashCode());
        result = (result * PRIME) + (this.connectTime == null ? 43 : this.connectTime.hashCode());
        result = (result * PRIME) + (this.idleTime == null ? 43 : this.idleTime.hashCode());
        result =
                (result * PRIME)
                        + (this.compositeLimit == null ? 43 : this.compositeLimit.hashCode());
        result = (result * PRIME) + (this.cpuPerCall == null ? 43 : this.cpuPerCall.hashCode());
        result =
                (result * PRIME)
                        + (this.cpuPerSession == null ? 43 : this.cpuPerSession.hashCode());
        result =
                (result * PRIME)
                        + (this.logicalReadsPerCall == null
                                ? 43
                                : this.logicalReadsPerCall.hashCode());
        result =
                (result * PRIME)
                        + (this.logicalReadsPerSession == null
                                ? 43
                                : this.logicalReadsPerSession.hashCode());
        result = (result * PRIME) + (this.privateSga == null ? 43 : this.privateSga.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
