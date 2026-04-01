/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Provides information about actions performed on a desktop, including type and time.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DesktopAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DesktopAction extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "timeApplied"})
    public DesktopAction(Action action, java.util.Date timeApplied) {
        super();
        this.action = action;
        this.timeApplied = timeApplied;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An action performed on a desktop.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * An action performed on a desktop.
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The time of an action performed on a desktop.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeApplied")
        private java.util.Date timeApplied;

        /**
         * The time of an action performed on a desktop.
         * @param timeApplied the value to set
         * @return this builder
         **/
        public Builder timeApplied(java.util.Date timeApplied) {
            this.timeApplied = timeApplied;
            this.__explicitlySet__.add("timeApplied");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DesktopAction build() {
            DesktopAction model = new DesktopAction(this.action, this.timeApplied);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DesktopAction model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("timeApplied")) {
                this.timeApplied(model.getTimeApplied());
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
     * An action performed on a desktop.
     **/
    public enum Action {
        ApiStart("API_START"),
        ApiStop("API_STOP"),
        AvailabilityStart("AVAILABILITY_START"),
        AvailabilityStop("AVAILABILITY_STOP"),
        DisconnectedStop("DISCONNECTED_STOP"),
        DisconnectedDelete("DISCONNECTED_DELETE"),
        ScheduledStart("SCHEDULED_START"),
        ScheduledStop("SCHEDULED_STOP"),
        Synchronize("SYNCHRONIZE"),
        Connected("CONNECTED"),
        Disconnected("DISCONNECTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * An action performed on a desktop.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * An action performed on a desktop.
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * The time of an action performed on a desktop.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeApplied")
    private final java.util.Date timeApplied;

    /**
     * The time of an action performed on a desktop.
     * @return the value
     **/
    public java.util.Date getTimeApplied() {
        return timeApplied;
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
        sb.append("DesktopAction(");
        sb.append("super=").append(super.toString());
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", timeApplied=").append(String.valueOf(this.timeApplied));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DesktopAction)) {
            return false;
        }

        DesktopAction other = (DesktopAction) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.timeApplied, other.timeApplied)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.timeApplied == null ? 43 : this.timeApplied.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
