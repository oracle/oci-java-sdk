/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The properties of the component. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComponentProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComponentProperties
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "runOn",
        "preCondition",
        "actionOnFailure",
        "pauseDetails",
        "notificationPreferences"
    })
    public ComponentProperties(
            RunOnDetails runOn,
            String preCondition,
            ActionOnFailure actionOnFailure,
            PauseDetails pauseDetails,
            TaskNotificationPreferences notificationPreferences) {
        super();
        this.runOn = runOn;
        this.preCondition = preCondition;
        this.actionOnFailure = actionOnFailure;
        this.pauseDetails = pauseDetails;
        this.notificationPreferences = notificationPreferences;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("runOn")
        private RunOnDetails runOn;

        public Builder runOn(RunOnDetails runOn) {
            this.runOn = runOn;
            this.__explicitlySet__.add("runOn");
            return this;
        }
        /** Build control flow conditions that determine the relevance of the task execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("preCondition")
        private String preCondition;

        /**
         * Build control flow conditions that determine the relevance of the task execution.
         *
         * @param preCondition the value to set
         * @return this builder
         */
        public Builder preCondition(String preCondition) {
            this.preCondition = preCondition;
            this.__explicitlySet__.add("preCondition");
            return this;
        }
        /** The action to be taken in case of a failure. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionOnFailure")
        private ActionOnFailure actionOnFailure;

        /**
         * The action to be taken in case of a failure.
         *
         * @param actionOnFailure the value to set
         * @return this builder
         */
        public Builder actionOnFailure(ActionOnFailure actionOnFailure) {
            this.actionOnFailure = actionOnFailure;
            this.__explicitlySet__.add("actionOnFailure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pauseDetails")
        private PauseDetails pauseDetails;

        public Builder pauseDetails(PauseDetails pauseDetails) {
            this.pauseDetails = pauseDetails;
            this.__explicitlySet__.add("pauseDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notificationPreferences")
        private TaskNotificationPreferences notificationPreferences;

        public Builder notificationPreferences(
                TaskNotificationPreferences notificationPreferences) {
            this.notificationPreferences = notificationPreferences;
            this.__explicitlySet__.add("notificationPreferences");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComponentProperties build() {
            ComponentProperties model =
                    new ComponentProperties(
                            this.runOn,
                            this.preCondition,
                            this.actionOnFailure,
                            this.pauseDetails,
                            this.notificationPreferences);
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
            if (model.wasPropertyExplicitlySet("preCondition")) {
                this.preCondition(model.getPreCondition());
            }
            if (model.wasPropertyExplicitlySet("actionOnFailure")) {
                this.actionOnFailure(model.getActionOnFailure());
            }
            if (model.wasPropertyExplicitlySet("pauseDetails")) {
                this.pauseDetails(model.getPauseDetails());
            }
            if (model.wasPropertyExplicitlySet("notificationPreferences")) {
                this.notificationPreferences(model.getNotificationPreferences());
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

    @com.fasterxml.jackson.annotation.JsonProperty("runOn")
    private final RunOnDetails runOn;

    public RunOnDetails getRunOn() {
        return runOn;
    }

    /** Build control flow conditions that determine the relevance of the task execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("preCondition")
    private final String preCondition;

    /**
     * Build control flow conditions that determine the relevance of the task execution.
     *
     * @return the value
     */
    public String getPreCondition() {
        return preCondition;
    }

    /** The action to be taken in case of a failure. */
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
    /** The action to be taken in case of a failure. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionOnFailure")
    private final ActionOnFailure actionOnFailure;

    /**
     * The action to be taken in case of a failure.
     *
     * @return the value
     */
    public ActionOnFailure getActionOnFailure() {
        return actionOnFailure;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pauseDetails")
    private final PauseDetails pauseDetails;

    public PauseDetails getPauseDetails() {
        return pauseDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("notificationPreferences")
    private final TaskNotificationPreferences notificationPreferences;

    public TaskNotificationPreferences getNotificationPreferences() {
        return notificationPreferences;
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
        sb.append(", preCondition=").append(String.valueOf(this.preCondition));
        sb.append(", actionOnFailure=").append(String.valueOf(this.actionOnFailure));
        sb.append(", pauseDetails=").append(String.valueOf(this.pauseDetails));
        sb.append(", notificationPreferences=")
                .append(String.valueOf(this.notificationPreferences));
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
                && java.util.Objects.equals(this.preCondition, other.preCondition)
                && java.util.Objects.equals(this.actionOnFailure, other.actionOnFailure)
                && java.util.Objects.equals(this.pauseDetails, other.pauseDetails)
                && java.util.Objects.equals(
                        this.notificationPreferences, other.notificationPreferences)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.runOn == null ? 43 : this.runOn.hashCode());
        result = (result * PRIME) + (this.preCondition == null ? 43 : this.preCondition.hashCode());
        result =
                (result * PRIME)
                        + (this.actionOnFailure == null ? 43 : this.actionOnFailure.hashCode());
        result = (result * PRIME) + (this.pauseDetails == null ? 43 : this.pauseDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationPreferences == null
                                ? 43
                                : this.notificationPreferences.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
