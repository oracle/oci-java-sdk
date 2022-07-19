/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The summary of information about the database user. It includes details such as user type, account status,
 * last login time, user creation time, authentication type, user profile, and time and date of the last password change.
 * It also contains the user category derived from these user details, as well as granted privileges.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "userName",
        "userCategory",
        "accountStatus",
        "targetId",
        "timeLastLogin",
        "timeUserCreated",
        "authenticationType",
        "userProfile",
        "timePasswordChanged",
        "userTypes",
        "adminRoles"
    })
    public UserSummary(
            String key,
            String userName,
            UserCategory userCategory,
            AccountStatus accountStatus,
            String targetId,
            java.util.Date timeLastLogin,
            java.util.Date timeUserCreated,
            AuthenticationType authenticationType,
            String userProfile,
            java.util.Date timePasswordChanged,
            java.util.List<UserTypes> userTypes,
            java.util.List<AdminRoles> adminRoles) {
        super();
        this.key = key;
        this.userName = userName;
        this.userCategory = userCategory;
        this.accountStatus = accountStatus;
        this.targetId = targetId;
        this.timeLastLogin = timeLastLogin;
        this.timeUserCreated = timeUserCreated;
        this.authenticationType = authenticationType;
        this.userProfile = userProfile;
        this.timePasswordChanged = timePasswordChanged;
        this.userTypes = userTypes;
        this.adminRoles = adminRoles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique user key. This is a system-generated identifier. Use ListUsers to get the user key for a user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique user key. This is a system-generated identifier. Use ListUsers to get the user key for a user.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The database user name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The database user name.
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The user category based on the privileges and other details of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userCategory")
        private UserCategory userCategory;

        /**
         * The user category based on the privileges and other details of the user.
         * @param userCategory the value to set
         * @return this builder
         **/
        public Builder userCategory(UserCategory userCategory) {
            this.userCategory = userCategory;
            this.__explicitlySet__.add("userCategory");
            return this;
        }
        /**
         * The user account status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accountStatus")
        private AccountStatus accountStatus;

        /**
         * The user account status.
         * @param accountStatus the value to set
         * @return this builder
         **/
        public Builder accountStatus(AccountStatus accountStatus) {
            this.accountStatus = accountStatus;
            this.__explicitlySet__.add("accountStatus");
            return this;
        }
        /**
         * The OCID of the target database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The date and time when the user last logged in, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastLogin")
        private java.util.Date timeLastLogin;

        /**
         * The date and time when the user last logged in, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeLastLogin the value to set
         * @return this builder
         **/
        public Builder timeLastLogin(java.util.Date timeLastLogin) {
            this.timeLastLogin = timeLastLogin;
            this.__explicitlySet__.add("timeLastLogin");
            return this;
        }
        /**
         * The date and time when the user was created in the database, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUserCreated")
        private java.util.Date timeUserCreated;

        /**
         * The date and time when the user was created in the database, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeUserCreated the value to set
         * @return this builder
         **/
        public Builder timeUserCreated(java.util.Date timeUserCreated) {
            this.timeUserCreated = timeUserCreated;
            this.__explicitlySet__.add("timeUserCreated");
            return this;
        }
        /**
         * The user authentication method.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private AuthenticationType authenticationType;

        /**
         * The user authentication method.
         * @param authenticationType the value to set
         * @return this builder
         **/
        public Builder authenticationType(AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }
        /**
         * The user profile name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userProfile")
        private String userProfile;

        /**
         * The user profile name.
         * @param userProfile the value to set
         * @return this builder
         **/
        public Builder userProfile(String userProfile) {
            this.userProfile = userProfile;
            this.__explicitlySet__.add("userProfile");
            return this;
        }
        /**
         * The date and time when the user password was last changed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePasswordChanged")
        private java.util.Date timePasswordChanged;

        /**
         * The date and time when the user password was last changed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timePasswordChanged the value to set
         * @return this builder
         **/
        public Builder timePasswordChanged(java.util.Date timePasswordChanged) {
            this.timePasswordChanged = timePasswordChanged;
            this.__explicitlySet__.add("timePasswordChanged");
            return this;
        }
        /**
         * The user type, which can be a combination of the following:
         * <p>
         * 'Admin Privileged': The user has administrative privileges.
         * 'Application': The user is an Oracle E-Business Suite Applications (EBS) or Fusion Applications (FA) user.
         * 'Privileged': The user is a privileged user.
         * 'Schema': The user is EXPIRED & LOCKED / EXPIRED / LOCKED, or a schema-only account (authentication type is NONE).
         * 'Non-privileged': The user is a non-privileged user.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userTypes")
        private java.util.List<UserTypes> userTypes;

        /**
         * The user type, which can be a combination of the following:
         * <p>
         * 'Admin Privileged': The user has administrative privileges.
         * 'Application': The user is an Oracle E-Business Suite Applications (EBS) or Fusion Applications (FA) user.
         * 'Privileged': The user is a privileged user.
         * 'Schema': The user is EXPIRED & LOCKED / EXPIRED / LOCKED, or a schema-only account (authentication type is NONE).
         * 'Non-privileged': The user is a non-privileged user.
         *
         * @param userTypes the value to set
         * @return this builder
         **/
        public Builder userTypes(java.util.List<UserTypes> userTypes) {
            this.userTypes = userTypes;
            this.__explicitlySet__.add("userTypes");
            return this;
        }
        /**
         * The admin roles granted to the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminRoles")
        private java.util.List<AdminRoles> adminRoles;

        /**
         * The admin roles granted to the user.
         * @param adminRoles the value to set
         * @return this builder
         **/
        public Builder adminRoles(java.util.List<AdminRoles> adminRoles) {
            this.adminRoles = adminRoles;
            this.__explicitlySet__.add("adminRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserSummary build() {
            UserSummary __instance__ =
                    new UserSummary(
                            key,
                            userName,
                            userCategory,
                            accountStatus,
                            targetId,
                            timeLastLogin,
                            timeUserCreated,
                            authenticationType,
                            userProfile,
                            timePasswordChanged,
                            userTypes,
                            adminRoles);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .userName(o.getUserName())
                            .userCategory(o.getUserCategory())
                            .accountStatus(o.getAccountStatus())
                            .targetId(o.getTargetId())
                            .timeLastLogin(o.getTimeLastLogin())
                            .timeUserCreated(o.getTimeUserCreated())
                            .authenticationType(o.getAuthenticationType())
                            .userProfile(o.getUserProfile())
                            .timePasswordChanged(o.getTimePasswordChanged())
                            .userTypes(o.getUserTypes())
                            .adminRoles(o.getAdminRoles());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The unique user key. This is a system-generated identifier. Use ListUsers to get the user key for a user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique user key. This is a system-generated identifier. Use ListUsers to get the user key for a user.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The database user name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The database user name.
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * The user category based on the privileges and other details of the user.
     **/
    public enum UserCategory {
        Critical("CRITICAL"),
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UserCategory.class);

        private final String value;
        private static java.util.Map<String, UserCategory> map;

        static {
            map = new java.util.HashMap<>();
            for (UserCategory v : UserCategory.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UserCategory(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UserCategory create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UserCategory', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The user category based on the privileges and other details of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userCategory")
    private final UserCategory userCategory;

    /**
     * The user category based on the privileges and other details of the user.
     * @return the value
     **/
    public UserCategory getUserCategory() {
        return userCategory;
    }

    /**
     * The user account status.
     **/
    public enum AccountStatus {
        Open("OPEN"),
        Locked("LOCKED"),
        Expired("EXPIRED"),
        ExpiredAndLocked("EXPIRED_AND_LOCKED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AccountStatus.class);

        private final String value;
        private static java.util.Map<String, AccountStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (AccountStatus v : AccountStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AccountStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccountStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AccountStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The user account status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accountStatus")
    private final AccountStatus accountStatus;

    /**
     * The user account status.
     * @return the value
     **/
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * The OCID of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * The date and time when the user last logged in, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastLogin")
    private final java.util.Date timeLastLogin;

    /**
     * The date and time when the user last logged in, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeLastLogin() {
        return timeLastLogin;
    }

    /**
     * The date and time when the user was created in the database, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUserCreated")
    private final java.util.Date timeUserCreated;

    /**
     * The date and time when the user was created in the database, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeUserCreated() {
        return timeUserCreated;
    }

    /**
     * The user authentication method.
     **/
    public enum AuthenticationType {
        Password("PASSWORD"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthenticationType.class);

        private final String value;
        private static java.util.Map<String, AuthenticationType> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthenticationType v : AuthenticationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthenticationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthenticationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthenticationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The user authentication method.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
    private final AuthenticationType authenticationType;

    /**
     * The user authentication method.
     * @return the value
     **/
    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * The user profile name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userProfile")
    private final String userProfile;

    /**
     * The user profile name.
     * @return the value
     **/
    public String getUserProfile() {
        return userProfile;
    }

    /**
     * The date and time when the user password was last changed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePasswordChanged")
    private final java.util.Date timePasswordChanged;

    /**
     * The date and time when the user password was last changed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimePasswordChanged() {
        return timePasswordChanged;
    }

    /**
     **/
    public enum UserTypes {
        AdminPrivileged("ADMIN_PRIVILEGED"),
        Application("APPLICATION"),
        Privileged("PRIVILEGED"),
        Schema("SCHEMA"),
        NonPrivileged("NON_PRIVILEGED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UserTypes.class);

        private final String value;
        private static java.util.Map<String, UserTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (UserTypes v : UserTypes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UserTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UserTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UserTypes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The user type, which can be a combination of the following:
     * <p>
     * 'Admin Privileged': The user has administrative privileges.
     * 'Application': The user is an Oracle E-Business Suite Applications (EBS) or Fusion Applications (FA) user.
     * 'Privileged': The user is a privileged user.
     * 'Schema': The user is EXPIRED & LOCKED / EXPIRED / LOCKED, or a schema-only account (authentication type is NONE).
     * 'Non-privileged': The user is a non-privileged user.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userTypes")
    private final java.util.List<UserTypes> userTypes;

    /**
     * The user type, which can be a combination of the following:
     * <p>
     * 'Admin Privileged': The user has administrative privileges.
     * 'Application': The user is an Oracle E-Business Suite Applications (EBS) or Fusion Applications (FA) user.
     * 'Privileged': The user is a privileged user.
     * 'Schema': The user is EXPIRED & LOCKED / EXPIRED / LOCKED, or a schema-only account (authentication type is NONE).
     * 'Non-privileged': The user is a non-privileged user.
     *
     * @return the value
     **/
    public java.util.List<UserTypes> getUserTypes() {
        return userTypes;
    }

    /**
     **/
    public enum AdminRoles {
        PdbDba("PDB_DBA"),
        Dba("DBA"),
        DvAdmin("DV_ADMIN"),
        AuditAdmin("AUDIT_ADMIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AdminRoles.class);

        private final String value;
        private static java.util.Map<String, AdminRoles> map;

        static {
            map = new java.util.HashMap<>();
            for (AdminRoles v : AdminRoles.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AdminRoles(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AdminRoles create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AdminRoles', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The admin roles granted to the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminRoles")
    private final java.util.List<AdminRoles> adminRoles;

    /**
     * The admin roles granted to the user.
     * @return the value
     **/
    public java.util.List<AdminRoles> getAdminRoles() {
        return adminRoles;
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
        sb.append("UserSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", userCategory=").append(String.valueOf(this.userCategory));
        sb.append(", accountStatus=").append(String.valueOf(this.accountStatus));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", timeLastLogin=").append(String.valueOf(this.timeLastLogin));
        sb.append(", timeUserCreated=").append(String.valueOf(this.timeUserCreated));
        sb.append(", authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(", userProfile=").append(String.valueOf(this.userProfile));
        sb.append(", timePasswordChanged=").append(String.valueOf(this.timePasswordChanged));
        sb.append(", userTypes=").append(String.valueOf(this.userTypes));
        sb.append(", adminRoles=").append(String.valueOf(this.adminRoles));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserSummary)) {
            return false;
        }

        UserSummary other = (UserSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.userCategory, other.userCategory)
                && java.util.Objects.equals(this.accountStatus, other.accountStatus)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.timeLastLogin, other.timeLastLogin)
                && java.util.Objects.equals(this.timeUserCreated, other.timeUserCreated)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.userProfile, other.userProfile)
                && java.util.Objects.equals(this.timePasswordChanged, other.timePasswordChanged)
                && java.util.Objects.equals(this.userTypes, other.userTypes)
                && java.util.Objects.equals(this.adminRoles, other.adminRoles)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.userCategory == null ? 43 : this.userCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.accountStatus == null ? 43 : this.accountStatus.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastLogin == null ? 43 : this.timeLastLogin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUserCreated == null ? 43 : this.timeUserCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + (this.userProfile == null ? 43 : this.userProfile.hashCode());
        result =
                (result * PRIME)
                        + (this.timePasswordChanged == null
                                ? 43
                                : this.timePasswordChanged.hashCode());
        result = (result * PRIME) + (this.userTypes == null ? 43 : this.userTypes.hashCode());
        result = (result * PRIME) + (this.adminRoles == null ? 43 : this.adminRoles.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
