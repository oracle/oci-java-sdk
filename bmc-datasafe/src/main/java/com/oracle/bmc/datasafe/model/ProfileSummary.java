/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The summary of information about the user profiles. It includes details such as profile name,
 * failed login attempts, sessions per user, inactive account time, password lock time, user
 * created, target id, and the compartment id. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProfileSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProfileSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "userAssessmentId",
        "compartmentId",
        "targetId",
        "profileName",
        "userCount",
        "failedLoginAttempts",
        "passwordVerificationFunction",
        "sessionsPerUser",
        "inactiveAccountTime",
        "passwordLockTime",
        "isUserCreated",
        "freeformTags",
        "definedTags"
    })
    public ProfileSummary(
            String userAssessmentId,
            String compartmentId,
            String targetId,
            String profileName,
            Integer userCount,
            String failedLoginAttempts,
            String passwordVerificationFunction,
            String sessionsPerUser,
            String inactiveAccountTime,
            String passwordLockTime,
            Boolean isUserCreated,
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
        this.sessionsPerUser = sessionsPerUser;
        this.inactiveAccountTime = inactiveAccountTime;
        this.passwordLockTime = passwordLockTime;
        this.isUserCreated = isUserCreated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the latest user assessment corresponding to the target under consideration. A
         * compartment type assessment can also be passed to profiles from all the targets from the
         * corresponding compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userAssessmentId")
        private String userAssessmentId;

        /**
         * The OCID of the latest user assessment corresponding to the target under consideration. A
         * compartment type assessment can also be passed to profiles from all the targets from the
         * corresponding compartment.
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
        /** Maximum times the user is allowed to fail login before the user account is locked. */
        @com.fasterxml.jackson.annotation.JsonProperty("failedLoginAttempts")
        private String failedLoginAttempts;

        /**
         * Maximum times the user is allowed to fail login before the user account is locked.
         *
         * @param failedLoginAttempts the value to set
         * @return this builder
         */
        public Builder failedLoginAttempts(String failedLoginAttempts) {
            this.failedLoginAttempts = failedLoginAttempts;
            this.__explicitlySet__.add("failedLoginAttempts");
            return this;
        }
        /** PL/SQL that can be used for password verification. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordVerificationFunction")
        private String passwordVerificationFunction;

        /**
         * PL/SQL that can be used for password verification.
         *
         * @param passwordVerificationFunction the value to set
         * @return this builder
         */
        public Builder passwordVerificationFunction(String passwordVerificationFunction) {
            this.passwordVerificationFunction = passwordVerificationFunction;
            this.__explicitlySet__.add("passwordVerificationFunction");
            return this;
        }
        /** The maximum number of sessions a user is allowed to create. */
        @com.fasterxml.jackson.annotation.JsonProperty("sessionsPerUser")
        private String sessionsPerUser;

        /**
         * The maximum number of sessions a user is allowed to create.
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
         * Long-running queries and other operations are not subjected to this limit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inactiveAccountTime")
        private String inactiveAccountTime;

        /**
         * The permitted periods of continuous inactive time during a session, expressed in minutes.
         * Long-running queries and other operations are not subjected to this limit.
         *
         * @param inactiveAccountTime the value to set
         * @return this builder
         */
        public Builder inactiveAccountTime(String inactiveAccountTime) {
            this.inactiveAccountTime = inactiveAccountTime;
            this.__explicitlySet__.add("inactiveAccountTime");
            return this;
        }
        /** Number of days the user account remains locked after failed login */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordLockTime")
        private String passwordLockTime;

        /**
         * Number of days the user account remains locked after failed login
         *
         * @param passwordLockTime the value to set
         * @return this builder
         */
        public Builder passwordLockTime(String passwordLockTime) {
            this.passwordLockTime = passwordLockTime;
            this.__explicitlySet__.add("passwordLockTime");
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

        public ProfileSummary build() {
            ProfileSummary model =
                    new ProfileSummary(
                            this.userAssessmentId,
                            this.compartmentId,
                            this.targetId,
                            this.profileName,
                            this.userCount,
                            this.failedLoginAttempts,
                            this.passwordVerificationFunction,
                            this.sessionsPerUser,
                            this.inactiveAccountTime,
                            this.passwordLockTime,
                            this.isUserCreated,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfileSummary model) {
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
            if (model.wasPropertyExplicitlySet("sessionsPerUser")) {
                this.sessionsPerUser(model.getSessionsPerUser());
            }
            if (model.wasPropertyExplicitlySet("inactiveAccountTime")) {
                this.inactiveAccountTime(model.getInactiveAccountTime());
            }
            if (model.wasPropertyExplicitlySet("passwordLockTime")) {
                this.passwordLockTime(model.getPasswordLockTime());
            }
            if (model.wasPropertyExplicitlySet("isUserCreated")) {
                this.isUserCreated(model.getIsUserCreated());
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

    /**
     * The OCID of the latest user assessment corresponding to the target under consideration. A
     * compartment type assessment can also be passed to profiles from all the targets from the
     * corresponding compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userAssessmentId")
    private final String userAssessmentId;

    /**
     * The OCID of the latest user assessment corresponding to the target under consideration. A
     * compartment type assessment can also be passed to profiles from all the targets from the
     * corresponding compartment.
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

    /** Maximum times the user is allowed to fail login before the user account is locked. */
    @com.fasterxml.jackson.annotation.JsonProperty("failedLoginAttempts")
    private final String failedLoginAttempts;

    /**
     * Maximum times the user is allowed to fail login before the user account is locked.
     *
     * @return the value
     */
    public String getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    /** PL/SQL that can be used for password verification. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVerificationFunction")
    private final String passwordVerificationFunction;

    /**
     * PL/SQL that can be used for password verification.
     *
     * @return the value
     */
    public String getPasswordVerificationFunction() {
        return passwordVerificationFunction;
    }

    /** The maximum number of sessions a user is allowed to create. */
    @com.fasterxml.jackson.annotation.JsonProperty("sessionsPerUser")
    private final String sessionsPerUser;

    /**
     * The maximum number of sessions a user is allowed to create.
     *
     * @return the value
     */
    public String getSessionsPerUser() {
        return sessionsPerUser;
    }

    /**
     * The permitted periods of continuous inactive time during a session, expressed in minutes.
     * Long-running queries and other operations are not subjected to this limit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveAccountTime")
    private final String inactiveAccountTime;

    /**
     * The permitted periods of continuous inactive time during a session, expressed in minutes.
     * Long-running queries and other operations are not subjected to this limit.
     *
     * @return the value
     */
    public String getInactiveAccountTime() {
        return inactiveAccountTime;
    }

    /** Number of days the user account remains locked after failed login */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordLockTime")
    private final String passwordLockTime;

    /**
     * Number of days the user account remains locked after failed login
     *
     * @return the value
     */
    public String getPasswordLockTime() {
        return passwordLockTime;
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
        sb.append("ProfileSummary(");
        sb.append("super=").append(super.toString());
        sb.append("userAssessmentId=").append(String.valueOf(this.userAssessmentId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", profileName=").append(String.valueOf(this.profileName));
        sb.append(", userCount=").append(String.valueOf(this.userCount));
        sb.append(", failedLoginAttempts=").append(String.valueOf(this.failedLoginAttempts));
        sb.append(", passwordVerificationFunction=")
                .append(String.valueOf(this.passwordVerificationFunction));
        sb.append(", sessionsPerUser=").append(String.valueOf(this.sessionsPerUser));
        sb.append(", inactiveAccountTime=").append(String.valueOf(this.inactiveAccountTime));
        sb.append(", passwordLockTime=").append(String.valueOf(this.passwordLockTime));
        sb.append(", isUserCreated=").append(String.valueOf(this.isUserCreated));
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
        if (!(o instanceof ProfileSummary)) {
            return false;
        }

        ProfileSummary other = (ProfileSummary) o;
        return java.util.Objects.equals(this.userAssessmentId, other.userAssessmentId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.profileName, other.profileName)
                && java.util.Objects.equals(this.userCount, other.userCount)
                && java.util.Objects.equals(this.failedLoginAttempts, other.failedLoginAttempts)
                && java.util.Objects.equals(
                        this.passwordVerificationFunction, other.passwordVerificationFunction)
                && java.util.Objects.equals(this.sessionsPerUser, other.sessionsPerUser)
                && java.util.Objects.equals(this.inactiveAccountTime, other.inactiveAccountTime)
                && java.util.Objects.equals(this.passwordLockTime, other.passwordLockTime)
                && java.util.Objects.equals(this.isUserCreated, other.isUserCreated)
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
                        + (this.sessionsPerUser == null ? 43 : this.sessionsPerUser.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveAccountTime == null
                                ? 43
                                : this.inactiveAccountTime.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordLockTime == null ? 43 : this.passwordLockTime.hashCode());
        result =
                (result * PRIME)
                        + (this.isUserCreated == null ? 43 : this.isUserCreated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
