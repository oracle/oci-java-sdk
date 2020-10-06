/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * A maintenance update for a cloud VM cluster.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastAction")
        private LastAction lastAction;

        public Builder lastAction(LastAction lastAction) {
            this.lastAction = lastAction;
            this.__explicitlySet__.add("lastAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableActions")
        private java.util.List<AvailableActions> availableActions;

        public Builder availableActions(java.util.List<AvailableActions> availableActions) {
            this.availableActions = availableActions;
            this.__explicitlySet__.add("availableActions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private UpdateType updateType;

        public Builder updateType(UpdateType updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSummary build() {
            UpdateSummary __instance__ =
                    new UpdateSummary(
                            id,
                            description,
                            lastAction,
                            availableActions,
                            updateType,
                            lifecycleDetails,
                            lifecycleState,
                            timeReleased,
                            version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .description(o.getDescription())
                            .lastAction(o.getLastAction())
                            .availableActions(o.getAvailableActions())
                            .updateType(o.getUpdateType())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .lifecycleState(o.getLifecycleState())
                            .timeReleased(o.getTimeReleased())
                            .version(o.getVersion());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Details of the maintenance update package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
    /**
     * The update action.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LastAction {
        RollingApply("ROLLING_APPLY"),
        NonRollingApply("NON_ROLLING_APPLY"),
        Precheck("PRECHECK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The update action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastAction")
    LastAction lastAction;
    /**
     * The update action.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AvailableActions {
        RollingApply("ROLLING_APPLY"),
        NonRollingApply("NON_ROLLING_APPLY"),
        Precheck("PRECHECK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The possible actions performed by the update operation on the infrastructure components.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableActions")
    java.util.List<AvailableActions> availableActions;
    /**
     * The type of cloud VM cluster maintenance update.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum UpdateType {
        GiPatch("GI_PATCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, UpdateType> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateType v : UpdateType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpdateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpdateType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of cloud VM cluster maintenance update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    UpdateType updateType;

    /**
     * Descriptive text providing additional details about the lifecycle state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;
    /**
     * The current state of the maintenance update. Dependent on value of `lastAction`.
     **/
    @lombok.extern.slf4j.Slf4j
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
     * The current state of the maintenance update. Dependent on value of `lastAction`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the maintenance update was released.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    java.util.Date timeReleased;

    /**
     * The version of the maintenance update package.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
