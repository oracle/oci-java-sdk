/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of a specific User.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class User {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLocked")
        private java.util.Date timeLocked;

        public Builder timeLocked(java.util.Date timeLocked) {
            this.timeLocked = timeLocked;
            this.__explicitlySet__.add("timeLocked");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeExpiring")
        private java.util.Date timeExpiring;

        public Builder timeExpiring(java.util.Date timeExpiring) {
            this.timeExpiring = timeExpiring;
            this.__explicitlySet__.add("timeExpiring");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultTablespace")
        private String defaultTablespace;

        public Builder defaultTablespace(String defaultTablespace) {
            this.defaultTablespace = defaultTablespace;
            this.__explicitlySet__.add("defaultTablespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tempTablespace")
        private String tempTablespace;

        public Builder tempTablespace(String tempTablespace) {
            this.tempTablespace = tempTablespace;
            this.__explicitlySet__.add("tempTablespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("localTempTablespace")
        private String localTempTablespace;

        public Builder localTempTablespace(String localTempTablespace) {
            this.localTempTablespace = localTempTablespace;
            this.__explicitlySet__.add("localTempTablespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("profile")
        private String profile;

        public Builder profile(String profile) {
            this.profile = profile;
            this.__explicitlySet__.add("profile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("consumerGroup")
        private String consumerGroup;

        public Builder consumerGroup(String consumerGroup) {
            this.consumerGroup = consumerGroup;
            this.__explicitlySet__.add("consumerGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalName")
        private String externalName;

        public Builder externalName(String externalName) {
            this.externalName = externalName;
            this.__explicitlySet__.add("externalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("passwordVersions")
        private String passwordVersions;

        public Builder passwordVersions(String passwordVersions) {
            this.passwordVersions = passwordVersions;
            this.__explicitlySet__.add("passwordVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("editionsEnabled")
        private EditionsEnabled editionsEnabled;

        public Builder editionsEnabled(EditionsEnabled editionsEnabled) {
            this.editionsEnabled = editionsEnabled;
            this.__explicitlySet__.add("editionsEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authentication")
        private Authentication authentication;

        public Builder authentication(Authentication authentication) {
            this.authentication = authentication;
            this.__explicitlySet__.add("authentication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("proxyConnect")
        private ProxyConnect proxyConnect;

        public Builder proxyConnect(ProxyConnect proxyConnect) {
            this.proxyConnect = proxyConnect;
            this.__explicitlySet__.add("proxyConnect");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("common")
        private Common common;

        public Builder common(Common common) {
            this.common = common;
            this.__explicitlySet__.add("common");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastLogin")
        private java.util.Date timeLastLogin;

        public Builder timeLastLogin(java.util.Date timeLastLogin) {
            this.timeLastLogin = timeLastLogin;
            this.__explicitlySet__.add("timeLastLogin");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleMaintained")
        private OracleMaintained oracleMaintained;

        public Builder oracleMaintained(OracleMaintained oracleMaintained) {
            this.oracleMaintained = oracleMaintained;
            this.__explicitlySet__.add("oracleMaintained");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inherited")
        private Inherited inherited;

        public Builder inherited(Inherited inherited) {
            this.inherited = inherited;
            this.__explicitlySet__.add("inherited");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultCollation")
        private String defaultCollation;

        public Builder defaultCollation(String defaultCollation) {
            this.defaultCollation = defaultCollation;
            this.__explicitlySet__.add("defaultCollation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("implicit")
        private Implicit implicit;

        public Builder implicit(Implicit implicit) {
            this.implicit = implicit;
            this.__explicitlySet__.add("implicit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allShared")
        private AllShared allShared;

        public Builder allShared(AllShared allShared) {
            this.allShared = allShared;
            this.__explicitlySet__.add("allShared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalShared")
        private ExternalShared externalShared;

        public Builder externalShared(ExternalShared externalShared) {
            this.externalShared = externalShared;
            this.__explicitlySet__.add("externalShared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePasswordChanged")
        private java.util.Date timePasswordChanged;

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

    /**
     * The name of the User.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The account status of the User
     **/
    @lombok.extern.slf4j.Slf4j
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
     * The account status of the User
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The date the account was locked if account status was LOCKED.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLocked")
    java.util.Date timeLocked;

    /**
     * The date of expiration of the account
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiring")
    java.util.Date timeExpiring;

    /**
     * The default tablespace for data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultTablespace")
    String defaultTablespace;

    /**
     * The name of the default tablespace for temporary tables or the name of a tablespace group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tempTablespace")
    String tempTablespace;

    /**
     * The default local temporary tablespace for the User.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localTempTablespace")
    String localTempTablespace;

    /**
     * The User creation date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The User resource profile name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    String profile;

    /**
     * The initial resource consumer group for the User.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumerGroup")
    String consumerGroup;

    /**
     * The external name of User.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalName")
    String externalName;

    /**
     * The list of versions of the password hashes (also known as "verifiers") existing for the account.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passwordVersions")
    String passwordVersions;
    /**
     * Indicates whether editions have been enabled for the corresponding user (Y) or not (N)
     **/
    @lombok.extern.slf4j.Slf4j
    public enum EditionsEnabled {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Indicates whether editions have been enabled for the corresponding user (Y) or not (N)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("editionsEnabled")
    EditionsEnabled editionsEnabled;
    /**
     * The authentication mechanism for the user
     **/
    @lombok.extern.slf4j.Slf4j
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
     * The authentication mechanism for the user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    Authentication authentication;
    /**
     * Indicates whether a user can connect directly (N) or whether the account can only be proxied (Y) by users who have proxy privileges
     * for this account (that is, by users who have been granted the "connect through" privilege for this account).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ProxyConnect {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    ProxyConnect proxyConnect;
    /**
     * Indicates whether a given user is common(Y) or local(N).
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Common {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    Common common;

    /**
     * The time of the last user login.
     * This column is not populated when a user connects to the database with administrative privileges, that is, AS { SYSASM | SYSBACKUP | SYSDBA | SYSDG | SYSOPER | SYSRAC | SYSKM }.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastLogin")
    java.util.Date timeLastLogin;
    /**
     * Indicates whether the user was created, and is maintained, by Oracle-supplied scripts (such as catalog.sql or catproc.sql).
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OracleMaintained {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Indicates whether the user was created, and is maintained, by Oracle-supplied scripts (such as catalog.sql or catproc.sql).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleMaintained")
    OracleMaintained oracleMaintained;
    /**
     * Indicates whether the user definition was inherited from another container (YES) or not (NO)
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Inherited {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Indicates whether the user definition was inherited from another container (YES) or not (NO)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inherited")
    Inherited inherited;

    /**
     * The default collation for the user\u2019s schema.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCollation")
    String defaultCollation;
    /**
     * Indicates whether this user is a common user created by an implicit application (YES) or not (NO)
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Implicit {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Indicates whether this user is a common user created by an implicit application (YES) or not (NO)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("implicit")
    Implicit implicit;
    /**
     * In a sharded database, the value in this column indicates whether the user was created with shard DDL enabled.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AllShared {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * In a sharded database, the value in this column indicates whether the user was created with shard DDL enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allShared")
    AllShared allShared;
    /**
     * In a federated sharded database, indicates whether the user is an external shard user (YES) or not (NO).
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ExternalShared {
        Yes("YES"),
        No("NO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    ExternalShared externalShared;

    /**
     * The date on which the user's password was last set.
     * This column is populated only when the value of the AUTHENTICATION_TYPE column is PASSWORD. Otherwise, this column is null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePasswordChanged")
    java.util.Date timePasswordChanged;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
