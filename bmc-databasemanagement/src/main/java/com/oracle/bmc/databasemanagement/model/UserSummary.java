/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UserSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UserSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "status",
        "timeExpiring",
        "defaultTablespace",
        "tempTablespace",
        "timeCreated",
        "timeLocked",
        "profile"
    })
    public UserSummary(
            String name,
            Status status,
            java.util.Date timeExpiring,
            String defaultTablespace,
            String tempTablespace,
            java.util.Date timeCreated,
            java.util.Date timeLocked,
            String profile) {
        super();
        this.name = name;
        this.status = status;
        this.timeExpiring = timeExpiring;
        this.defaultTablespace = defaultTablespace;
        this.tempTablespace = tempTablespace;
        this.timeCreated = timeCreated;
        this.timeLocked = timeLocked;
        this.profile = profile;
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserSummary build() {
            UserSummary model =
                    new UserSummary(
                            this.name,
                            this.status,
                            this.timeExpiring,
                            this.defaultTablespace,
                            this.tempTablespace,
                            this.timeCreated,
                            this.timeLocked,
                            this.profile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeExpiring")) {
                this.timeExpiring(model.getTimeExpiring());
            }
            if (model.wasPropertyExplicitlySet("defaultTablespace")) {
                this.defaultTablespace(model.getDefaultTablespace());
            }
            if (model.wasPropertyExplicitlySet("tempTablespace")) {
                this.tempTablespace(model.getTempTablespace());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLocked")) {
                this.timeLocked(model.getTimeLocked());
            }
            if (model.wasPropertyExplicitlySet("profile")) {
                this.profile(model.getProfile());
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
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeExpiring=").append(String.valueOf(this.timeExpiring));
        sb.append(", defaultTablespace=").append(String.valueOf(this.defaultTablespace));
        sb.append(", tempTablespace=").append(String.valueOf(this.tempTablespace));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLocked=").append(String.valueOf(this.timeLocked));
        sb.append(", profile=").append(String.valueOf(this.profile));
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
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeExpiring, other.timeExpiring)
                && java.util.Objects.equals(this.defaultTablespace, other.defaultTablespace)
                && java.util.Objects.equals(this.tempTablespace, other.tempTablespace)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLocked, other.timeLocked)
                && java.util.Objects.equals(this.profile, other.profile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeExpiring == null ? 43 : this.timeExpiring.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultTablespace == null ? 43 : this.defaultTablespace.hashCode());
        result =
                (result * PRIME)
                        + (this.tempTablespace == null ? 43 : this.tempTablespace.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeLocked == null ? 43 : this.timeLocked.hashCode());
        result = (result * PRIME) + (this.profile == null ? 43 : this.profile.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
