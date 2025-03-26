/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * A Patch for a DB system or DB Home.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatchSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "description",
        "lastAction",
        "availableActions",
        "lifecycleDetails",
        "lifecycleState",
        "timeReleased",
        "version"
    })
    public PatchSummary(
            String id,
            String description,
            LastAction lastAction,
            java.util.List<AvailableActions> availableActions,
            String lifecycleDetails,
            LifecycleState lifecycleState,
            java.util.Date timeReleased,
            String version) {
        super();
        this.id = id;
        this.description = description;
        this.lastAction = lastAction;
        this.availableActions = availableActions;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.timeReleased = timeReleased;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The text describing this patch package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The text describing this patch package.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Action that is currently being performed or was completed last.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastAction")
        private LastAction lastAction;

        /**
         * Action that is currently being performed or was completed last.
         * @param lastAction the value to set
         * @return this builder
         **/
        public Builder lastAction(LastAction lastAction) {
            this.lastAction = lastAction;
            this.__explicitlySet__.add("lastAction");
            return this;
        }
        /**
         * Actions that can possibly be performed using this patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableActions")
        private java.util.List<AvailableActions> availableActions;

        /**
         * Actions that can possibly be performed using this patch.
         * @param availableActions the value to set
         * @return this builder
         **/
        public Builder availableActions(java.util.List<AvailableActions> availableActions) {
            this.availableActions = availableActions;
            this.__explicitlySet__.add("availableActions");
            return this;
        }
        /**
         * A descriptive text associated with the lifecycleState.
         * Typically can contain additional displayable text.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A descriptive text associated with the lifecycleState.
         * Typically can contain additional displayable text.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The current state of the patch as a result of lastAction.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the patch as a result of lastAction.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time that the patch was released.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The date and time that the patch was released.
         * @param timeReleased the value to set
         * @return this builder
         **/
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /**
         * The version of this patch package.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of this patch package.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchSummary build() {
            PatchSummary model =
                    new PatchSummary(
                            this.id,
                            this.description,
                            this.lastAction,
                            this.availableActions,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.timeReleased,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("lastAction")) {
                this.lastAction(model.getLastAction());
            }
            if (model.wasPropertyExplicitlySet("availableActions")) {
                this.availableActions(model.getAvailableActions());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The text describing this patch package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The text describing this patch package.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Action that is currently being performed or was completed last.
     **/
    public enum LastAction {
        Apply("APPLY"),
        Precheck("PRECHECK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LastAction.class);

        private final String value;
        private static java.util.Map<String, LastAction> map;

        static {
            map = new java.util.HashMap<>();
            for (LastAction v : LastAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LastAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LastAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LastAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Action that is currently being performed or was completed last.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastAction")
    private final LastAction lastAction;

    /**
     * Action that is currently being performed or was completed last.
     * @return the value
     **/
    public LastAction getLastAction() {
        return lastAction;
    }

    /**
     **/
    public enum AvailableActions {
        Apply("APPLY"),
        Precheck("PRECHECK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AvailableActions.class);

        private final String value;
        private static java.util.Map<String, AvailableActions> map;

        static {
            map = new java.util.HashMap<>();
            for (AvailableActions v : AvailableActions.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AvailableActions(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AvailableActions create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AvailableActions', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Actions that can possibly be performed using this patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableActions")
    private final java.util.List<AvailableActions> availableActions;

    /**
     * Actions that can possibly be performed using this patch.
     * @return the value
     **/
    public java.util.List<AvailableActions> getAvailableActions() {
        return availableActions;
    }

    /**
     * A descriptive text associated with the lifecycleState.
     * Typically can contain additional displayable text.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A descriptive text associated with the lifecycleState.
     * Typically can contain additional displayable text.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The current state of the patch as a result of lastAction.
     **/
    public enum LifecycleState {
        Available("AVAILABLE"),
        Success("SUCCESS"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the patch as a result of lastAction.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the patch as a result of lastAction.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time that the patch was released.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The date and time that the patch was released.
     * @return the value
     **/
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /**
     * The version of this patch package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of this patch package.
     * @return the value
     **/
    public String getVersion() {
        return version;
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
        sb.append("PatchSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lastAction=").append(String.valueOf(this.lastAction));
        sb.append(", availableActions=").append(String.valueOf(this.availableActions));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchSummary)) {
            return false;
        }

        PatchSummary other = (PatchSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lastAction, other.lastAction)
                && java.util.Objects.equals(this.availableActions, other.availableActions)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.lastAction == null ? 43 : this.lastAction.hashCode());
        result =
                (result * PRIME)
                        + (this.availableActions == null ? 43 : this.availableActions.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
