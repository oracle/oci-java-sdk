/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UserSummary {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserSummary build() {
            UserSummary __instance__ =
                    new UserSummary(
                            name,
                            status,
                            timeExpiring,
                            defaultTablespace,
                            tempTablespace,
                            timeCreated,
                            profile);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .status(o.getStatus())
                            .timeExpiring(o.getTimeExpiring())
                            .defaultTablespace(o.getDefaultTablespace())
                            .tempTablespace(o.getTempTablespace())
                            .timeCreated(o.getTimeCreated())
                            .profile(o.getProfile());

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
     * The User creation date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The User resource profile name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    String profile;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
