/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details of a guardrail version.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GuardrailVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GuardrailVersion extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "guardrailVersion",
        "state",
        "timePreviewed",
        "timeActivated",
        "timeDeprecated",
        "timeRetired",
        "description"
    })
    public GuardrailVersion(
            String guardrailVersion,
            State state,
            java.util.Date timePreviewed,
            java.util.Date timeActivated,
            java.util.Date timeDeprecated,
            java.util.Date timeRetired,
            String description) {
        super();
        this.guardrailVersion = guardrailVersion;
        this.state = state;
        this.timePreviewed = timePreviewed;
        this.timeActivated = timeActivated;
        this.timeDeprecated = timeDeprecated;
        this.timeRetired = timeRetired;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The guardrail system version string, e.g., "1.0.0"
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("guardrailVersion")
        private String guardrailVersion;

        /**
         * The guardrail system version string, e.g., "1.0.0"
         * @param guardrailVersion the value to set
         * @return this builder
         **/
        public Builder guardrailVersion(String guardrailVersion) {
            this.guardrailVersion = guardrailVersion;
            this.__explicitlySet__.add("guardrailVersion");
            return this;
        }
        /**
         * The state of the guardrail version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        /**
         * The state of the guardrail version.
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * The preview date of the guardrail version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePreviewed")
        private java.util.Date timePreviewed;

        /**
         * The preview date of the guardrail version.
         * @param timePreviewed the value to set
         * @return this builder
         **/
        public Builder timePreviewed(java.util.Date timePreviewed) {
            this.timePreviewed = timePreviewed;
            this.__explicitlySet__.add("timePreviewed");
            return this;
        }
        /**
         * The activation date of the guardrail version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeActivated")
        private java.util.Date timeActivated;

        /**
         * The activation date of the guardrail version.
         * @param timeActivated the value to set
         * @return this builder
         **/
        public Builder timeActivated(java.util.Date timeActivated) {
            this.timeActivated = timeActivated;
            this.__explicitlySet__.add("timeActivated");
            return this;
        }
        /**
         * The deprecated date of the guardrail version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeprecated")
        private java.util.Date timeDeprecated;

        /**
         * The deprecated date of the guardrail version.
         * @param timeDeprecated the value to set
         * @return this builder
         **/
        public Builder timeDeprecated(java.util.Date timeDeprecated) {
            this.timeDeprecated = timeDeprecated;
            this.__explicitlySet__.add("timeDeprecated");
            return this;
        }
        /**
         * The retired date of the guardrail version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRetired")
        private java.util.Date timeRetired;

        /**
         * The retired date of the guardrail version.
         * @param timeRetired the value to set
         * @return this builder
         **/
        public Builder timeRetired(java.util.Date timeRetired) {
            this.timeRetired = timeRetired;
            this.__explicitlySet__.add("timeRetired");
            return this;
        }
        /**
         * The description of the guardrail version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the guardrail version.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GuardrailVersion build() {
            GuardrailVersion model =
                    new GuardrailVersion(
                            this.guardrailVersion,
                            this.state,
                            this.timePreviewed,
                            this.timeActivated,
                            this.timeDeprecated,
                            this.timeRetired,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GuardrailVersion model) {
            if (model.wasPropertyExplicitlySet("guardrailVersion")) {
                this.guardrailVersion(model.getGuardrailVersion());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("timePreviewed")) {
                this.timePreviewed(model.getTimePreviewed());
            }
            if (model.wasPropertyExplicitlySet("timeActivated")) {
                this.timeActivated(model.getTimeActivated());
            }
            if (model.wasPropertyExplicitlySet("timeDeprecated")) {
                this.timeDeprecated(model.getTimeDeprecated());
            }
            if (model.wasPropertyExplicitlySet("timeRetired")) {
                this.timeRetired(model.getTimeRetired());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
     * The guardrail system version string, e.g., "1.0.0"
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("guardrailVersion")
    private final String guardrailVersion;

    /**
     * The guardrail system version string, e.g., "1.0.0"
     * @return the value
     **/
    public String getGuardrailVersion() {
        return guardrailVersion;
    }

    /**
     * The state of the guardrail version.
     **/
    public enum State {
        Active("ACTIVE"),
        Preview("PREVIEW"),
        Deprecated("DEPRECATED"),
        Retired("RETIRED"),
        ;

        private final String value;
        private static java.util.Map<String, State> map;

        static {
            map = new java.util.HashMap<>();
            for (State v : State.values()) {
                map.put(v.getValue(), v);
            }
        }

        State(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static State create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid State: " + key);
        }
    };
    /**
     * The state of the guardrail version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final State state;

    /**
     * The state of the guardrail version.
     * @return the value
     **/
    public State getState() {
        return state;
    }

    /**
     * The preview date of the guardrail version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePreviewed")
    private final java.util.Date timePreviewed;

    /**
     * The preview date of the guardrail version.
     * @return the value
     **/
    public java.util.Date getTimePreviewed() {
        return timePreviewed;
    }

    /**
     * The activation date of the guardrail version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeActivated")
    private final java.util.Date timeActivated;

    /**
     * The activation date of the guardrail version.
     * @return the value
     **/
    public java.util.Date getTimeActivated() {
        return timeActivated;
    }

    /**
     * The deprecated date of the guardrail version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeprecated")
    private final java.util.Date timeDeprecated;

    /**
     * The deprecated date of the guardrail version.
     * @return the value
     **/
    public java.util.Date getTimeDeprecated() {
        return timeDeprecated;
    }

    /**
     * The retired date of the guardrail version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRetired")
    private final java.util.Date timeRetired;

    /**
     * The retired date of the guardrail version.
     * @return the value
     **/
    public java.util.Date getTimeRetired() {
        return timeRetired;
    }

    /**
     * The description of the guardrail version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the guardrail version.
     * @return the value
     **/
    public String getDescription() {
        return description;
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
        sb.append("GuardrailVersion(");
        sb.append("super=").append(super.toString());
        sb.append("guardrailVersion=").append(String.valueOf(this.guardrailVersion));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", timePreviewed=").append(String.valueOf(this.timePreviewed));
        sb.append(", timeActivated=").append(String.valueOf(this.timeActivated));
        sb.append(", timeDeprecated=").append(String.valueOf(this.timeDeprecated));
        sb.append(", timeRetired=").append(String.valueOf(this.timeRetired));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GuardrailVersion)) {
            return false;
        }

        GuardrailVersion other = (GuardrailVersion) o;
        return java.util.Objects.equals(this.guardrailVersion, other.guardrailVersion)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.timePreviewed, other.timePreviewed)
                && java.util.Objects.equals(this.timeActivated, other.timeActivated)
                && java.util.Objects.equals(this.timeDeprecated, other.timeDeprecated)
                && java.util.Objects.equals(this.timeRetired, other.timeRetired)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.guardrailVersion == null ? 43 : this.guardrailVersion.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result =
                (result * PRIME)
                        + (this.timePreviewed == null ? 43 : this.timePreviewed.hashCode());
        result =
                (result * PRIME)
                        + (this.timeActivated == null ? 43 : this.timeActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDeprecated == null ? 43 : this.timeDeprecated.hashCode());
        result = (result * PRIME) + (this.timeRetired == null ? 43 : this.timeRetired.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
