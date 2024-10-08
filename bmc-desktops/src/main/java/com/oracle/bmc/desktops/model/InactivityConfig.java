/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Action and grace period for inactivity <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InactivityConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InactivityConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "gracePeriodInMinutes"})
    public InactivityConfig(Action action, Integer gracePeriodInMinutes) {
        super();
        this.action = action;
        this.gracePeriodInMinutes = gracePeriodInMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** an inactivity action to be triggered */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * an inactivity action to be triggered
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The period of time (in minutes) during which the session must remain inactive before any
         * action occurs. If the value is not provided, a default value is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gracePeriodInMinutes")
        private Integer gracePeriodInMinutes;

        /**
         * The period of time (in minutes) during which the session must remain inactive before any
         * action occurs. If the value is not provided, a default value is used.
         *
         * @param gracePeriodInMinutes the value to set
         * @return this builder
         */
        public Builder gracePeriodInMinutes(Integer gracePeriodInMinutes) {
            this.gracePeriodInMinutes = gracePeriodInMinutes;
            this.__explicitlySet__.add("gracePeriodInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InactivityConfig build() {
            InactivityConfig model = new InactivityConfig(this.action, this.gracePeriodInMinutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InactivityConfig model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("gracePeriodInMinutes")) {
                this.gracePeriodInMinutes(model.getGracePeriodInMinutes());
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

    /** an inactivity action to be triggered */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Disconnect("DISCONNECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** an inactivity action to be triggered */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * an inactivity action to be triggered
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * The period of time (in minutes) during which the session must remain inactive before any
     * action occurs. If the value is not provided, a default value is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gracePeriodInMinutes")
    private final Integer gracePeriodInMinutes;

    /**
     * The period of time (in minutes) during which the session must remain inactive before any
     * action occurs. If the value is not provided, a default value is used.
     *
     * @return the value
     */
    public Integer getGracePeriodInMinutes() {
        return gracePeriodInMinutes;
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
        sb.append("InactivityConfig(");
        sb.append("super=").append(super.toString());
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", gracePeriodInMinutes=").append(String.valueOf(this.gracePeriodInMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InactivityConfig)) {
            return false;
        }

        InactivityConfig other = (InactivityConfig) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.gracePeriodInMinutes, other.gracePeriodInMinutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.gracePeriodInMinutes == null
                                ? 43
                                : this.gracePeriodInMinutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
