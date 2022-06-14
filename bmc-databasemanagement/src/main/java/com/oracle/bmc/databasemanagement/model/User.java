/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of a specific user resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class User {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "status",
        "timeLocked",
        "timeExpiring",
        "defaultTablespace",
        "tempTablespace",
        "localTempTablespace",
        "timeCreated",
        "profile",
        "consumerGroup",
        "externalName",
        "passwordVersions",
        "editionsEnabled",
        "authentication",
        "proxyConnect",
        "common",
        "timeLastLogin",
        "oracleMaintained",
        "inherited",
        "defaultCollation",
        "implicit",
        "allShared",
        "externalShared",
        "timePasswordChanged"
    })
    public User(
            String name,
            Status status,
            java.util.Date timeLocked,
            java.util.Date timeExpiring,
            String defaultTablespace,
            String tempTablespace,
            String localTempTablespace,
            java.util.Date timeCreated,
            String profile,
            String consumerGroup,
            String externalName,
            String passwordVersions,
            EditionsEnabled editionsEnabled,
            Authentication authentication,
            ProxyConnect proxyConnect,
            Common common,
            java.util.Date timeLastLogin,
            OracleMaintained oracleMaintained,
            Inherited inherited,
            String defaultCollation,
            Implicit implicit,
            AllShared allShared,
            ExternalShared externalShared,
            java.util.Date timePasswordChanged) {
        super();
        this.name = name;
        this.status = status;
        this.timeLocked = timeLocked;
        this.timeExpiring = timeExpiring;
        this.defaultTablespace = defaultTablespace;
        this.tempTablespace = tempTablespace;
        this.localTempTablespace = localTempTablespace;
        this.timeCreated = timeCreated;
        this.profile = profile;
        this.consumerGroup = consumerGroup;
        this.externalName = externalName;
        this.passwordVersions = passwordVersions;
        this.editionsEnabled = editionsEnabled;
        this.authentication = authentication;
        this.proxyConnect = proxyConnect;
        this.common = common;
        this.timeLastLogin = timeLastLogin;
        this.oracleMaintained = oracleMaintained;
        this.inherited = inherited;
        this.defaultCollation = defaultCollation;
        this.implicit = implicit;
        this.allShared = allShared;
        this.externalShared = externalShared;
        this.timePasswordChanged = timePasswordChanged;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the User.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the User.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The status of the user account.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the user account.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The date the account was locked, if the status of the account is LOCKED.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLocked")
        private java.util.Date timeLocked;

        /**
         * The date the account was locked, if the status of the account is LOCKED.
         * @param timeLocked the value to set
         * @return this builder
         **/
        public Builder timeLocked(java.util.Date timeLocked) {
            this.timeLocked = timeLocked;
            this.__explicitlySet__.add("timeLocked");
            return this;
        }
        /**
         * The date and time of the expiration of the user account.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpiring")
        private java.util.Date timeExpiring;

        /**
         * The date and time of the expiration of the user account.
         * @param timeExpiring the value to set
         * @return this builder
         **/
        public Builder timeExpiring(java.util.Date timeExpiring) {
            this.timeExpiring = timeExpiring;
            this.__explicitlySet__.add("timeExpiring");
            return this;
        }
        /**
         * The default tablespace for data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultTablespace")
        private String defaultTablespace;

        /**
         * The default tablespace for data.
         * @param defaultTablespace the value to set
         * @return this builder
         **/
        public Builder defaultTablespace(String defaultTablespace) {
            this.defaultTablespace = defaultTablespace;
            this.__explicitlySet__.add("defaultTablespace");
            return this;
        }
        /**
         * The name of the default tablespace for temporary tables or the name of a tablespace group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tempTablespace")
        private String tempTablespace;

        /**
         * The name of the default tablespace for temporary tables or the name of a tablespace group.
         * @param tempTablespace the value to set
         * @return this builder
         **/
        public Builder tempTablespace(String tempTablespace) {
            this.tempTablespace = tempTablespace;
            this.__explicitlySet__.add("tempTablespace");
            return this;
        }
        /**
         * The default local temporary tablespace for the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("localTempTablespace")
        private String localTempTablespace;

        /**
         * The default local temporary tablespace for the user.
         * @param localTempTablespace the value to set
         * @return this builder
         **/
        public Builder localTempTablespace(String localTempTablespace) {
            this.localTempTablespace = localTempTablespace;
            this.__explicitlySet__.add("localTempTablespace");
            return this;
        }
        /**
         * The date and time the user was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the user was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The profile name of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("profile")
        private String profile;

        /**
         * The profile name of the user.
         * @param profile the value to set
         * @return this builder
         **/
        public Builder profile(String profile) {
            this.profile = profile;
            this.__explicitlySet__.add("profile");
            return this;
        }
        /**
         * The initial resource consumer group for the User.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consumerGroup")
        private String consumerGroup;

        /**
         * The initial resource consumer group for the User.
         * @param consumerGroup the value to set
         * @return this builder
         **/
        public Builder consumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            this.__explicitlySet__.add("consumerGroup");
            return this;
        }
        /**
         * The external name of the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalName")
        private String externalName;

        /**
         * The external name of the user.
         * @param externalName the value to set
         * @return this builder
         **/
        public Builder externalName(String externalName) {
            this.externalName = externalName;
            this.__explicitlySet__.add("externalName");
            return this;
        }
        /**
         * The list of existing versions of the password hashes (also known as "verifiers") for the account.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passwordVersions")
        private String passwordVersions;

        /**
         * The list of existing versions of the password hashes (also known as "verifiers") for the account.
         * @param passwordVersions the value to set
         * @return this builder
         **/
        public Builder passwordVersions(String passwordVersions) {
            this.passwordVersions = passwordVersions;
            this.__explicitlySet__.add("passwordVersions");
            return this;
        }
        /**
         * Indicates whether editions have been enabled for the corresponding user (Y) or not (N).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("editionsEnabled")
        private EditionsEnabled editionsEnabled;

        /**
         * Indicates whether editions have been enabled for the corresponding user (Y) or not (N).
         * @param editionsEnabled the value to set
         * @return this builder
         **/
        public Builder editionsEnabled(EditionsEnabled editionsEnabled) {
            this.editionsEnabled = editionsEnabled;
            this.__explicitlySet__.add("editionsEnabled");
            return this;
        }
        /**
         * The authentication mechanism for the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authentication")
        private Authentication authentication;

        /**
         * The authentication mechanism for the user.
         * @param authentication the value to set
         * @return this builder
         **/
        public Builder authentication(Authentication authentication) {
            this.authentication = authentication;
            this.__explicitlySet__.add("authentication");
            return this;
        }
        /**
         * Indicates whether a user can connect directly (N) or whether the account can only be proxied (Y) by users who have proxy privileges
         * for this account (that is, by users who have been granted the "connect through" privilege for this account).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("proxyConnect")
        private ProxyConnect proxyConnect;

        /**
         * Indicates whether a user can connect directly (N) or whether the account can only be proxied (Y) by users who have proxy privileges
         * for this account (that is, by users who have been granted the "connect through" privilege for this account).
         *
         * @param proxyConnect the value to set
         * @return this builder
         **/
        public Builder proxyConnect(ProxyConnect proxyConnect) {
            this.proxyConnect = proxyConnect;
            this.__explicitlySet__.add("proxyConnect");
            return this;
        }
        /**
         * Indicates whether a given user is common(Y) or local(N).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("common")
        private Common common;

        /**
         * Indicates whether a given user is common(Y) or local(N).
         * @param common the value to set
         * @return this builder
         **/
        public Builder common(Common common) {
            this.common = common;
            this.__explicitlySet__.add("common");
            return this;
        }
        /**
         * The date and time of the last user login.
         * This column is not populated when a user connects to the database with administrative privileges, that is, AS { SYSASM | SYSBACKUP | SYSDBA | SYSDG | SYSOPER | SYSRAC | SYSKM }.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastLogin")
        private java.util.Date timeLastLogin;

        /**
         * The date and time of the last user login.
         * This column is not populated when a user connects to the database with administrative privileges, that is, AS { SYSASM | SYSBACKUP | SYSDBA | SYSDG | SYSOPER | SYSRAC | SYSKM }.
         *
         * @param timeLastLogin the value to set
         * @return this builder
         **/
        public Builder timeLastLogin(java.util.Date timeLastLogin) {
            this.timeLastLogin = timeLastLogin;
            this.__explicitlySet__.add("timeLastLogin");
            return this;
        }
        /**
         * Indicates whether the user was created and is maintained by Oracle-supplied scripts (such as catalog.sql or catproc.sql).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("oracleMaintained")
        private OracleMaintained oracleMaintained;

        /**
         * Indicates whether the user was created and is maintained by Oracle-supplied scripts (such as catalog.sql or catproc.sql).
         * @param oracleMaintained the value to set
         * @return this builder
         **/
        public Builder oracleMaintained(OracleMaintained oracleMaintained) {
            this.oracleMaintained = oracleMaintained;
            this.__explicitlySet__.add("oracleMaintained");
            return this;
        }
        /**
         * Indicates whether the user definition is inherited from another container (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inherited")
        private Inherited inherited;

        /**
         * Indicates whether the user definition is inherited from another container (YES) or not (NO).
         * @param inherited the value to set
         * @return this builder
         **/
        public Builder inherited(Inherited inherited) {
            this.inherited = inherited;
            this.__explicitlySet__.add("inherited");
            return this;
        }
        /**
         * The default collation for the user schema.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultCollation")
        private String defaultCollation;

        /**
         * The default collation for the user schema.
         * @param defaultCollation the value to set
         * @return this builder
         **/
        public Builder defaultCollation(String defaultCollation) {
            this.defaultCollation = defaultCollation;
            this.__explicitlySet__.add("defaultCollation");
            return this;
        }
        /**
         * Indicates whether the user is a common user created by an implicit application (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("implicit")
        private Implicit implicit;

        /**
         * Indicates whether the user is a common user created by an implicit application (YES) or not (NO).
         * @param implicit the value to set
         * @return this builder
         **/
        public Builder implicit(Implicit implicit) {
            this.implicit = implicit;
            this.__explicitlySet__.add("implicit");
            return this;
        }
        /**
         * In a sharded database, indicates whether the user is created with shard DDL enabled (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allShared")
        private AllShared allShared;

        /**
         * In a sharded database, indicates whether the user is created with shard DDL enabled (YES) or not (NO).
         * @param allShared the value to set
         * @return this builder
         **/
        public Builder allShared(AllShared allShared) {
            this.allShared = allShared;
            this.__explicitlySet__.add("allShared");
            return this;
        }
        /**
         * In a federated sharded database, indicates whether the user is an external shard user (YES) or not (NO).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalShared")
        private ExternalShared externalShared;

        /**
         * In a federated sharded database, indicates whether the user is an external shard user (YES) or not (NO).
         * @param externalShared the value to set
         * @return this builder
         **/
        public Builder externalShared(ExternalShared externalShared) {
            this.externalShared = externalShared;
            this.__explicitlySet__.add("externalShared");
            return this;
        }
        /**
         * The date and time when the user password was last set.
         * This column is populated only when the value of the AUTHENTICATION_TYPE column is PASSWORD. Otherwise, this column is null.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePasswordChanged")
        private java.util.Date timePasswordChanged;

        /**
         * The date and time when the user password was last set.
         * This column is populated only when the value of the AUTHENTICATION_TYPE column is PASSWORD. Otherwise, this column is null.
         *
         * @param timePasswordChanged the value to set
         * @return this builder
         **/
        public Builder timePasswordChanged(java.util.Date timePasswordChanged) {
            this.timePasswordChanged = timePasswordChanged;
            this.__explicitlySet__.add("timePasswordChanged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public User build() {
            User __instance__ =
                    new User(
                            name,
                            status,
                            timeLocked,
                            timeExpiring,
                            defaultTablespace,
                            tempTablespace,
                            localTempTablespace,
                            timeCreated,
                            profile,
                            consumerGroup,
                            externalName,
                            passwordVersions,
                            editionsEnabled,
                            authentication,
                            proxyConnect,
                            common,
                            timeLastLogin,
                            oracleMaintained,
                            inherited,
                            defaultCollation,
                            implicit,
                            allShared,
                            externalShared,
                            timePasswordChanged);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(User o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .status(o.getStatus())
                            .timeLocked(o.getTimeLocked())
                            .timeExpiring(o.getTimeExpiring())
                            .defaultTablespace(o.getDefaultTablespace())
                            .tempTablespace(o.getTempTablespace())
                            .localTempTablespace(o.getLocalTempTablespace())
                            .timeCreated(o.getTimeCreated())
                            .profile(o.getProfile())
                            .consumerGroup(o.getConsumerGroup())
                            .externalName(o.getExternalName())
                            .passwordVersions(o.getPasswordVersions())
                            .editionsEnabled(o.getEditionsEnabled())
                            .authentication(o.getAuthentication())
                            .proxyConnect(o.getProxyConnect())
                            .common(o.getCommon())
                            .timeLastLogin(o.getTimeLastLogin())
                            .oracleMaintained(o.getOracleMaintained())
                            .inherited(o.getInherited())
                            .defaultCollation(o.getDefaultCollation())
                            .implicit(o.getImplicit())
                            .allShared(o.getAllShared())
                            .externalShared(o.getExternalShared())
                            .timePasswordChanged(o.getTimePasswordChanged());

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
     * The name of the User.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the User.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The status of the user account.
     **/
    public enum Status {
        Open("OPEN"),
        Expired("EXPIRED"),
        ExpiredGrace("EXPIRED_GRACE"),
        Locked("LOCKED"),
        LockedTimed("LOCKED_TIMED"),
        ExpiredAndLocked("EXPIRED_AND_LOCKED"),
        ExpiredGraceAndLocked("EXPIRED_GRACE_AND_LOCKED"),
        ExpiredAndLockedTimed("EXPIRED_AND_LOCKED_TIMED"),
        ExpiredGraceAndLockedTimed("EXPIRED_GRACE_AND_LOCKED_TIMED"),
        OpenAndInRollover("OPEN_AND_IN_ROLLOVER"),
        ExpiredAndInRollover("EXPIRED_AND_IN_ROLLOVER"),
        LockedAndInRollover("LOCKED_AND_IN_ROLLOVER"),
        ExpiredAndLockedAndInRollover("EXPIRED_AND_LOCKED_AND_IN_ROLLOVER"),
        LockedTimedAndInRollover("LOCKED_TIMED_AND_IN_ROLLOVER"),
        ExpiredAndLockedTimedAndInRol("EXPIRED_AND_LOCKED_TIMED_AND_IN_ROL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the user account.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the user account.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * The date the account was locked, if the status of the account is LOCKED.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLocked")
    private final java.util.Date timeLocked;

    /**
     * The date the account was locked, if the status of the account is LOCKED.
     * @return the value
     **/
    public java.util.Date getTimeLocked() {
        return timeLocked;
    }

    /**
     * The date and time of the expiration of the user account.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiring")
    private final java.util.Date timeExpiring;

    /**
     * The date and time of the expiration of the user account.
     * @return the value
     **/
    public java.util.Date getTimeExpiring() {
        return timeExpiring;
    }

    /**
     * The default tablespace for data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultTablespace")
    private final String defaultTablespace;

    /**
     * The default tablespace for data.
     * @return the value
     **/
    public String getDefaultTablespace() {
        return defaultTablespace;
    }

    /**
     * The name of the default tablespace for temporary tables or the name of a tablespace group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tempTablespace")
    private final String tempTablespace;

    /**
     * The name of the default tablespace for temporary tables or the name of a tablespace group.
     * @return the value
     **/
    public String getTempTablespace() {
        return tempTablespace;
    }

    /**
     * The default local temporary tablespace for the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localTempTablespace")
    private final String localTempTablespace;

    /**
     * The default local temporary tablespace for the user.
     * @return the value
     **/
    public String getLocalTempTablespace() {
        return localTempTablespace;
    }

    /**
     * The date and time the user was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the user was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The profile name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    private final String profile;

    /**
     * The profile name of the user.
     * @return the value
     **/
    public String getProfile() {
        return profile;
    }

    /**
     * The initial resource consumer group for the User.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumerGroup")
    private final String consumerGroup;

    /**
     * The initial resource consumer group for the User.
     * @return the value
     **/
    public String getConsumerGroup() {
        return consumerGroup;
    }

    /**
     * The external name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalName")
    private final String externalName;

    /**
     * The external name of the user.
     * @return the value
     **/
    public String getExternalName() {
        return externalName;
    }

    /**
     * The list of existing versions of the password hashes (also known as "verifiers") for the account.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVersions")
    private final String passwordVersions;

    /**
     * The list of existing versions of the password hashes (also known as "verifiers") for the account.
     * @return the value
     **/
    public String getPasswordVersions() {
        return passwordVersions;
    }

    /**
     * Indicates whether editions have been enabled for the corresponding user (Y) or not (N).
     **/
    public enum EditionsEnabled {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EditionsEnabled.class);

        private final String value;
        private static java.util.Map<String, EditionsEnabled> map;

        static {
            map = new java.util.HashMap<>();
            for (EditionsEnabled v : EditionsEnabled.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EditionsEnabled(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EditionsEnabled create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EditionsEnabled', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether editions have been enabled for the corresponding user (Y) or not (N).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editionsEnabled")
    private final EditionsEnabled editionsEnabled;

    /**
     * Indicates whether editions have been enabled for the corresponding user (Y) or not (N).
     * @return the value
     **/
    public EditionsEnabled getEditionsEnabled() {
        return editionsEnabled;
    }

    /**
     * The authentication mechanism for the user.
     **/
    public enum Authentication {
        None("NONE"),
        External("EXTERNAL"),
        Global("GLOBAL"),
        Password("PASSWORD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Authentication.class);

        private final String value;
        private static java.util.Map<String, Authentication> map;

        static {
            map = new java.util.HashMap<>();
            for (Authentication v : Authentication.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Authentication(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Authentication create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Authentication', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The authentication mechanism for the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    private final Authentication authentication;

    /**
     * The authentication mechanism for the user.
     * @return the value
     **/
    public Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Indicates whether a user can connect directly (N) or whether the account can only be proxied (Y) by users who have proxy privileges
     * for this account (that is, by users who have been granted the "connect through" privilege for this account).
     *
     **/
    public enum ProxyConnect {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ProxyConnect.class);

        private final String value;
        private static java.util.Map<String, ProxyConnect> map;

        static {
            map = new java.util.HashMap<>();
            for (ProxyConnect v : ProxyConnect.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ProxyConnect(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProxyConnect create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ProxyConnect', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether a user can connect directly (N) or whether the account can only be proxied (Y) by users who have proxy privileges
     * for this account (that is, by users who have been granted the "connect through" privilege for this account).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("proxyConnect")
    private final ProxyConnect proxyConnect;

    /**
     * Indicates whether a user can connect directly (N) or whether the account can only be proxied (Y) by users who have proxy privileges
     * for this account (that is, by users who have been granted the "connect through" privilege for this account).
     *
     * @return the value
     **/
    public ProxyConnect getProxyConnect() {
        return proxyConnect;
    }

    /**
     * Indicates whether a given user is common(Y) or local(N).
     **/
    public enum Common {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Common.class);

        private final String value;
        private static java.util.Map<String, Common> map;

        static {
            map = new java.util.HashMap<>();
            for (Common v : Common.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Common(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Common create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Common', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether a given user is common(Y) or local(N).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("common")
    private final Common common;

    /**
     * Indicates whether a given user is common(Y) or local(N).
     * @return the value
     **/
    public Common getCommon() {
        return common;
    }

    /**
     * The date and time of the last user login.
     * This column is not populated when a user connects to the database with administrative privileges, that is, AS { SYSASM | SYSBACKUP | SYSDBA | SYSDG | SYSOPER | SYSRAC | SYSKM }.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastLogin")
    private final java.util.Date timeLastLogin;

    /**
     * The date and time of the last user login.
     * This column is not populated when a user connects to the database with administrative privileges, that is, AS { SYSASM | SYSBACKUP | SYSDBA | SYSDG | SYSOPER | SYSRAC | SYSKM }.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastLogin() {
        return timeLastLogin;
    }

    /**
     * Indicates whether the user was created and is maintained by Oracle-supplied scripts (such as catalog.sql or catproc.sql).
     **/
    public enum OracleMaintained {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OracleMaintained.class);

        private final String value;
        private static java.util.Map<String, OracleMaintained> map;

        static {
            map = new java.util.HashMap<>();
            for (OracleMaintained v : OracleMaintained.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OracleMaintained(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OracleMaintained create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OracleMaintained', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the user was created and is maintained by Oracle-supplied scripts (such as catalog.sql or catproc.sql).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleMaintained")
    private final OracleMaintained oracleMaintained;

    /**
     * Indicates whether the user was created and is maintained by Oracle-supplied scripts (such as catalog.sql or catproc.sql).
     * @return the value
     **/
    public OracleMaintained getOracleMaintained() {
        return oracleMaintained;
    }

    /**
     * Indicates whether the user definition is inherited from another container (YES) or not (NO).
     **/
    public enum Inherited {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Inherited.class);

        private final String value;
        private static java.util.Map<String, Inherited> map;

        static {
            map = new java.util.HashMap<>();
            for (Inherited v : Inherited.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Inherited(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Inherited create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Inherited', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the user definition is inherited from another container (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inherited")
    private final Inherited inherited;

    /**
     * Indicates whether the user definition is inherited from another container (YES) or not (NO).
     * @return the value
     **/
    public Inherited getInherited() {
        return inherited;
    }

    /**
     * The default collation for the user schema.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCollation")
    private final String defaultCollation;

    /**
     * The default collation for the user schema.
     * @return the value
     **/
    public String getDefaultCollation() {
        return defaultCollation;
    }

    /**
     * Indicates whether the user is a common user created by an implicit application (YES) or not (NO).
     **/
    public enum Implicit {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Implicit.class);

        private final String value;
        private static java.util.Map<String, Implicit> map;

        static {
            map = new java.util.HashMap<>();
            for (Implicit v : Implicit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Implicit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Implicit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Implicit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the user is a common user created by an implicit application (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("implicit")
    private final Implicit implicit;

    /**
     * Indicates whether the user is a common user created by an implicit application (YES) or not (NO).
     * @return the value
     **/
    public Implicit getImplicit() {
        return implicit;
    }

    /**
     * In a sharded database, indicates whether the user is created with shard DDL enabled (YES) or not (NO).
     **/
    public enum AllShared {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AllShared.class);

        private final String value;
        private static java.util.Map<String, AllShared> map;

        static {
            map = new java.util.HashMap<>();
            for (AllShared v : AllShared.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AllShared(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AllShared create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AllShared', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * In a sharded database, indicates whether the user is created with shard DDL enabled (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allShared")
    private final AllShared allShared;

    /**
     * In a sharded database, indicates whether the user is created with shard DDL enabled (YES) or not (NO).
     * @return the value
     **/
    public AllShared getAllShared() {
        return allShared;
    }

    /**
     * In a federated sharded database, indicates whether the user is an external shard user (YES) or not (NO).
     **/
    public enum ExternalShared {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExternalShared.class);

        private final String value;
        private static java.util.Map<String, ExternalShared> map;

        static {
            map = new java.util.HashMap<>();
            for (ExternalShared v : ExternalShared.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExternalShared(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExternalShared create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExternalShared', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * In a federated sharded database, indicates whether the user is an external shard user (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalShared")
    private final ExternalShared externalShared;

    /**
     * In a federated sharded database, indicates whether the user is an external shard user (YES) or not (NO).
     * @return the value
     **/
    public ExternalShared getExternalShared() {
        return externalShared;
    }

    /**
     * The date and time when the user password was last set.
     * This column is populated only when the value of the AUTHENTICATION_TYPE column is PASSWORD. Otherwise, this column is null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePasswordChanged")
    private final java.util.Date timePasswordChanged;

    /**
     * The date and time when the user password was last set.
     * This column is populated only when the value of the AUTHENTICATION_TYPE column is PASSWORD. Otherwise, this column is null.
     *
     * @return the value
     **/
    public java.util.Date getTimePasswordChanged() {
        return timePasswordChanged;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("User(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeLocked=").append(String.valueOf(this.timeLocked));
        sb.append(", timeExpiring=").append(String.valueOf(this.timeExpiring));
        sb.append(", defaultTablespace=").append(String.valueOf(this.defaultTablespace));
        sb.append(", tempTablespace=").append(String.valueOf(this.tempTablespace));
        sb.append(", localTempTablespace=").append(String.valueOf(this.localTempTablespace));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", profile=").append(String.valueOf(this.profile));
        sb.append(", consumerGroup=").append(String.valueOf(this.consumerGroup));
        sb.append(", externalName=").append(String.valueOf(this.externalName));
        sb.append(", passwordVersions=").append(String.valueOf(this.passwordVersions));
        sb.append(", editionsEnabled=").append(String.valueOf(this.editionsEnabled));
        sb.append(", authentication=").append(String.valueOf(this.authentication));
        sb.append(", proxyConnect=").append(String.valueOf(this.proxyConnect));
        sb.append(", common=").append(String.valueOf(this.common));
        sb.append(", timeLastLogin=").append(String.valueOf(this.timeLastLogin));
        sb.append(", oracleMaintained=").append(String.valueOf(this.oracleMaintained));
        sb.append(", inherited=").append(String.valueOf(this.inherited));
        sb.append(", defaultCollation=").append(String.valueOf(this.defaultCollation));
        sb.append(", implicit=").append(String.valueOf(this.implicit));
        sb.append(", allShared=").append(String.valueOf(this.allShared));
        sb.append(", externalShared=").append(String.valueOf(this.externalShared));
        sb.append(", timePasswordChanged=").append(String.valueOf(this.timePasswordChanged));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User other = (User) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeLocked, other.timeLocked)
                && java.util.Objects.equals(this.timeExpiring, other.timeExpiring)
                && java.util.Objects.equals(this.defaultTablespace, other.defaultTablespace)
                && java.util.Objects.equals(this.tempTablespace, other.tempTablespace)
                && java.util.Objects.equals(this.localTempTablespace, other.localTempTablespace)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.profile, other.profile)
                && java.util.Objects.equals(this.consumerGroup, other.consumerGroup)
                && java.util.Objects.equals(this.externalName, other.externalName)
                && java.util.Objects.equals(this.passwordVersions, other.passwordVersions)
                && java.util.Objects.equals(this.editionsEnabled, other.editionsEnabled)
                && java.util.Objects.equals(this.authentication, other.authentication)
                && java.util.Objects.equals(this.proxyConnect, other.proxyConnect)
                && java.util.Objects.equals(this.common, other.common)
                && java.util.Objects.equals(this.timeLastLogin, other.timeLastLogin)
                && java.util.Objects.equals(this.oracleMaintained, other.oracleMaintained)
                && java.util.Objects.equals(this.inherited, other.inherited)
                && java.util.Objects.equals(this.defaultCollation, other.defaultCollation)
                && java.util.Objects.equals(this.implicit, other.implicit)
                && java.util.Objects.equals(this.allShared, other.allShared)
                && java.util.Objects.equals(this.externalShared, other.externalShared)
                && java.util.Objects.equals(this.timePasswordChanged, other.timePasswordChanged)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeLocked == null ? 43 : this.timeLocked.hashCode());
        result = (result * PRIME) + (this.timeExpiring == null ? 43 : this.timeExpiring.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultTablespace == null ? 43 : this.defaultTablespace.hashCode());
        result =
                (result * PRIME)
                        + (this.tempTablespace == null ? 43 : this.tempTablespace.hashCode());
        result =
                (result * PRIME)
                        + (this.localTempTablespace == null
                                ? 43
                                : this.localTempTablespace.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.profile == null ? 43 : this.profile.hashCode());
        result =
                (result * PRIME)
                        + (this.consumerGroup == null ? 43 : this.consumerGroup.hashCode());
        result = (result * PRIME) + (this.externalName == null ? 43 : this.externalName.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordVersions == null ? 43 : this.passwordVersions.hashCode());
        result =
                (result * PRIME)
                        + (this.editionsEnabled == null ? 43 : this.editionsEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.authentication == null ? 43 : this.authentication.hashCode());
        result = (result * PRIME) + (this.proxyConnect == null ? 43 : this.proxyConnect.hashCode());
        result = (result * PRIME) + (this.common == null ? 43 : this.common.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastLogin == null ? 43 : this.timeLastLogin.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleMaintained == null ? 43 : this.oracleMaintained.hashCode());
        result = (result * PRIME) + (this.inherited == null ? 43 : this.inherited.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultCollation == null ? 43 : this.defaultCollation.hashCode());
        result = (result * PRIME) + (this.implicit == null ? 43 : this.implicit.hashCode());
        result = (result * PRIME) + (this.allShared == null ? 43 : this.allShared.hashCode());
        result =
                (result * PRIME)
                        + (this.externalShared == null ? 43 : this.externalShared.hashCode());
        result =
                (result * PRIME)
                        + (this.timePasswordChanged == null
                                ? 43
                                : this.timePasswordChanged.hashCode());
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
