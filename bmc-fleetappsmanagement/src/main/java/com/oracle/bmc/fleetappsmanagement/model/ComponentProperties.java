/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The properties of the task. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComponentProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComponentProperties
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"runOn", "condition", "actionOnFailure"})
    public ComponentProperties(String runOn, String condition, ActionOnFailure actionOnFailure) {
        super();
        this.runOn = runOn;
        this.condition = condition;
        this.actionOnFailure = actionOnFailure;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The hosts to execute on. */
        @com.fasterxml.jackson.annotation.JsonProperty("runOn")
        private String runOn;

        /**
         * The hosts to execute on.
         *
         * @param runOn the value to set
         * @return this builder
         */
        public Builder runOn(String runOn) {
            this.runOn = runOn;
            this.__explicitlySet__.add("runOn");
            return this;
        }
        /** The condition in which the task is to be executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        /**
         * The condition in which the task is to be executed.
         *
         * @param condition the value to set
         * @return this builder
         */
        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /** The action to be taken in case of task failure. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionOnFailure")
        private ActionOnFailure actionOnFailure;

        /**
         * The action to be taken in case of task failure.
         *
         * @param actionOnFailure the value to set
         * @return this builder
         */
        public Builder actionOnFailure(ActionOnFailure actionOnFailure) {
            this.actionOnFailure = actionOnFailure;
            this.__explicitlySet__.add("actionOnFailure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComponentProperties build() {
            ComponentProperties model =
                    new ComponentProperties(this.runOn, this.condition, this.actionOnFailure);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComponentProperties model) {
            if (model.wasPropertyExplicitlySet("runOn")) {
                this.runOn(model.getRunOn());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("actionOnFailure")) {
                this.actionOnFailure(model.getActionOnFailure());
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

    /** The hosts to execute on. */
    @com.fasterxml.jackson.annotation.JsonProperty("runOn")
    private final String runOn;

    /**
     * The hosts to execute on.
     *
     * @return the value
     */
    public String getRunOn() {
        return runOn;
    }

    /** The condition in which the task is to be executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final String condition;

    /**
     * The condition in which the task is to be executed.
     *
     * @return the value
     */
    public String getCondition() {
        return condition;
    }

    /** The action to be taken in case of task failure. */
    public enum ActionOnFailure implements com.oracle.bmc.http.internal.BmcEnum {
        Abort("ABORT"),
        Continue("CONTINUE"),
        Rollback("ROLLBACK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActionOnFailure.class);

        private final String value;
        private static java.util.Map<String, ActionOnFailure> map;

        static {
            map = new java.util.HashMap<>();
            for (ActionOnFailure v : ActionOnFailure.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActionOnFailure(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActionOnFailure create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActionOnFailure', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The action to be taken in case of task failure. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionOnFailure")
    private final ActionOnFailure actionOnFailure;

    /**
     * The action to be taken in case of task failure.
     *
     * @return the value
     */
    public ActionOnFailure getActionOnFailure() {
        return actionOnFailure;
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
        sb.append("ComponentProperties(");
        sb.append("super=").append(super.toString());
        sb.append("runOn=").append(String.valueOf(this.runOn));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", actionOnFailure=").append(String.valueOf(this.actionOnFailure));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComponentProperties)) {
            return false;
        }

        ComponentProperties other = (ComponentProperties) o;
        return java.util.Objects.equals(this.runOn, other.runOn)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.actionOnFailure, other.actionOnFailure)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runOn == null ? 43 : this.runOn.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result =
                (result * PRIME)
                        + (this.actionOnFailure == null ? 43 : this.actionOnFailure.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
