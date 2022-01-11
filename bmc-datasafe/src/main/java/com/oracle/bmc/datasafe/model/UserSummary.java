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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UserSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userCategory")
        private UserCategory userCategory;

        public Builder userCategory(UserCategory userCategory) {
            this.userCategory = userCategory;
            this.__explicitlySet__.add("userCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accountStatus")
        private AccountStatus accountStatus;

        public Builder accountStatus(AccountStatus accountStatus) {
            this.accountStatus = accountStatus;
            this.__explicitlySet__.add("accountStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastLogin")
        private java.util.Date timeLastLogin;

        public Builder timeLastLogin(java.util.Date timeLastLogin) {
            this.timeLastLogin = timeLastLogin;
            this.__explicitlySet__.add("timeLastLogin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUserCreated")
        private java.util.Date timeUserCreated;

        public Builder timeUserCreated(java.util.Date timeUserCreated) {
            this.timeUserCreated = timeUserCreated;
            this.__explicitlySet__.add("timeUserCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationType")
        private AuthenticationType authenticationType;

        public Builder authenticationType(AuthenticationType authenticationType) {
            this.authenticationType = authenticationType;
            this.__explicitlySet__.add("authenticationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userProfile")
        private String userProfile;

        public Builder userProfile(String userProfile) {
            this.userProfile = userProfile;
            this.__explicitlySet__.add("userProfile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePasswordChanged")
        private java.util.Date timePasswordChanged;

        public Builder timePasswordChanged(java.util.Date timePasswordChanged) {
            this.timePasswordChanged = timePasswordChanged;
            this.__explicitlySet__.add("timePasswordChanged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userTypes")
        private java.util.List<UserTypes> userTypes;

        public Builder userTypes(java.util.List<UserTypes> userTypes) {
            this.userTypes = userTypes;
            this.__explicitlySet__.add("userTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminRoles")
        private java.util.List<AdminRoles> adminRoles;

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

    /**
     * The unique user key. This is a system-generated identifier. Use ListUsers to get the user key for a user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The database user name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    String userName;
    /**
     * The user category based on the privileges and other details of the user.
     **/
    @lombok.extern.slf4j.Slf4j
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
    UserCategory userCategory;
    /**
     * The user account status.
     **/
    @lombok.extern.slf4j.Slf4j
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
    AccountStatus accountStatus;

    /**
     * The OCID of the target database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * The date and time when the user last logged in, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastLogin")
    java.util.Date timeLastLogin;

    /**
     * The date and time when the user was created in the database, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUserCreated")
    java.util.Date timeUserCreated;
    /**
     * The user authentication method.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AuthenticationType {
        Password("PASSWORD"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    AuthenticationType authenticationType;

    /**
     * The user profile name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userProfile")
    String userProfile;

    /**
     * The date and time when the user password was last changed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePasswordChanged")
    java.util.Date timePasswordChanged;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
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
    java.util.List<UserTypes> userTypes;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
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
    java.util.List<AdminRoles> adminRoles;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
