/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of an execution action. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExecutionAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecutionAction
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "executionWindowId",
        "compartmentId",
        "displayName",
        "description",
        "lifecycleState",
        "lifecycleSubstate",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "estimatedTimeInMins",
        "totalTimeTakenInMins",
        "executionActionOrder",
        "actionType",
        "actionParams",
        "actionMembers",
        "freeformTags",
        "definedTags"
    })
    public ExecutionAction(
            String id,
            String executionWindowId,
            String compartmentId,
            String displayName,
            String description,
            LifecycleState lifecycleState,
            LifecycleSubstate lifecycleSubstate,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Integer estimatedTimeInMins,
            Integer totalTimeTakenInMins,
            Integer executionActionOrder,
            ActionType actionType,
            java.util.Map<String, String> actionParams,
            java.util.List<ExecutionActionMember> actionMembers,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.executionWindowId = executionWindowId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.lifecycleState = lifecycleState;
        this.lifecycleSubstate = lifecycleSubstate;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.estimatedTimeInMins = estimatedTimeInMins;
        this.totalTimeTakenInMins = totalTimeTakenInMins;
        this.executionActionOrder = executionActionOrder;
        this.actionType = actionType;
        this.actionParams = actionParams;
        this.actionMembers = actionMembers;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * execution action.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * execution action.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * execution window resource the execution action belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("executionWindowId")
        private String executionWindowId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * execution window resource the execution action belongs to.
         *
         * @param executionWindowId the value to set
         * @return this builder
         */
        public Builder executionWindowId(String executionWindowId) {
            this.executionWindowId = executionWindowId;
            this.__explicitlySet__.add("executionWindowId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The user-friendly name for the execution action. The name does not need to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the execution action. The name does not need to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the execution action. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the execution action.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The current state of the execution action. Valid states are SCHEDULED, IN_PROGRESS,
         * FAILED, CANCELED, UPDATING, DELETED, SUCCEEDED and PARTIAL_SUCCESS.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the execution action. Valid states are SCHEDULED, IN_PROGRESS,
         * FAILED, CANCELED, UPDATING, DELETED, SUCCEEDED and PARTIAL_SUCCESS.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The current sub-state of the execution action. Valid states are DURATION_EXCEEDED,
         * MAINTENANCE_IN_PROGRESS and WAITING.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
        private LifecycleSubstate lifecycleSubstate;

        /**
         * The current sub-state of the execution action. Valid states are DURATION_EXCEEDED,
         * MAINTENANCE_IN_PROGRESS and WAITING.
         *
         * @param lifecycleSubstate the value to set
         * @return this builder
         */
        public Builder lifecycleSubstate(LifecycleSubstate lifecycleSubstate) {
            this.lifecycleSubstate = lifecycleSubstate;
            this.__explicitlySet__.add("lifecycleSubstate");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The date and time the execution action was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the execution action was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The last date and time that the execution action was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last date and time that the execution action was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The estimated time of the execution action in minutes. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
        private Integer estimatedTimeInMins;

        /**
         * The estimated time of the execution action in minutes.
         *
         * @param estimatedTimeInMins the value to set
         * @return this builder
         */
        public Builder estimatedTimeInMins(Integer estimatedTimeInMins) {
            this.estimatedTimeInMins = estimatedTimeInMins;
            this.__explicitlySet__.add("estimatedTimeInMins");
            return this;
        }
        /** The total time taken by corresponding resource activity in minutes. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalTimeTakenInMins")
        private Integer totalTimeTakenInMins;

        /**
         * The total time taken by corresponding resource activity in minutes.
         *
         * @param totalTimeTakenInMins the value to set
         * @return this builder
         */
        public Builder totalTimeTakenInMins(Integer totalTimeTakenInMins) {
            this.totalTimeTakenInMins = totalTimeTakenInMins;
            this.__explicitlySet__.add("totalTimeTakenInMins");
            return this;
        }
        /** The priority order of the execution action. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionActionOrder")
        private Integer executionActionOrder;

        /**
         * The priority order of the execution action.
         *
         * @param executionActionOrder the value to set
         * @return this builder
         */
        public Builder executionActionOrder(Integer executionActionOrder) {
            this.executionActionOrder = executionActionOrder;
            this.__explicitlySet__.add("executionActionOrder");
            return this;
        }
        /** The action type of the execution action being performed */
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        /**
         * The action type of the execution action being performed
         *
         * @param actionType the value to set
         * @return this builder
         */
        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }
        /**
         * Map<ParamName, ParamValue> where a key value pair describes the specific action
         * parameter. Example: {@code {"count": "3"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actionParams")
        private java.util.Map<String, String> actionParams;

        /**
         * Map<ParamName, ParamValue> where a key value pair describes the specific action
         * parameter. Example: {@code {"count": "3"}}
         *
         * @param actionParams the value to set
         * @return this builder
         */
        public Builder actionParams(java.util.Map<String, String> actionParams) {
            this.actionParams = actionParams;
            this.__explicitlySet__.add("actionParams");
            return this;
        }
        /** List of action members of this execution action. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionMembers")
        private java.util.List<ExecutionActionMember> actionMembers;

        /**
         * List of action members of this execution action.
         *
         * @param actionMembers the value to set
         * @return this builder
         */
        public Builder actionMembers(java.util.List<ExecutionActionMember> actionMembers) {
            this.actionMembers = actionMembers;
            this.__explicitlySet__.add("actionMembers");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecutionAction build() {
            ExecutionAction model =
                    new ExecutionAction(
                            this.id,
                            this.executionWindowId,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.lifecycleState,
                            this.lifecycleSubstate,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.estimatedTimeInMins,
                            this.totalTimeTakenInMins,
                            this.executionActionOrder,
                            this.actionType,
                            this.actionParams,
                            this.actionMembers,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecutionAction model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("executionWindowId")) {
                this.executionWindowId(model.getExecutionWindowId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleSubstate")) {
                this.lifecycleSubstate(model.getLifecycleSubstate());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("estimatedTimeInMins")) {
                this.estimatedTimeInMins(model.getEstimatedTimeInMins());
            }
            if (model.wasPropertyExplicitlySet("totalTimeTakenInMins")) {
                this.totalTimeTakenInMins(model.getTotalTimeTakenInMins());
            }
            if (model.wasPropertyExplicitlySet("executionActionOrder")) {
                this.executionActionOrder(model.getExecutionActionOrder());
            }
            if (model.wasPropertyExplicitlySet("actionType")) {
                this.actionType(model.getActionType());
            }
            if (model.wasPropertyExplicitlySet("actionParams")) {
                this.actionParams(model.getActionParams());
            }
            if (model.wasPropertyExplicitlySet("actionMembers")) {
                this.actionMembers(model.getActionMembers());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * execution action.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * execution action.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * execution window resource the execution action belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executionWindowId")
    private final String executionWindowId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * execution window resource the execution action belongs to.
     *
     * @return the value
     */
    public String getExecutionWindowId() {
        return executionWindowId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The user-friendly name for the execution action. The name does not need to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the execution action. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the execution action. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the execution action.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The current state of the execution action. Valid states are SCHEDULED, IN_PROGRESS, FAILED,
     * CANCELED, UPDATING, DELETED, SUCCEEDED and PARTIAL_SUCCESS.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Canceled("CANCELED"),
        Updating("UPDATING"),
        Deleted("DELETED"),
        Succeeded("SUCCEEDED"),
        PartialSuccess("PARTIAL_SUCCESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The current state of the execution action. Valid states are SCHEDULED, IN_PROGRESS, FAILED,
     * CANCELED, UPDATING, DELETED, SUCCEEDED and PARTIAL_SUCCESS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the execution action. Valid states are SCHEDULED, IN_PROGRESS, FAILED,
     * CANCELED, UPDATING, DELETED, SUCCEEDED and PARTIAL_SUCCESS.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The current sub-state of the execution action. Valid states are DURATION_EXCEEDED,
     * MAINTENANCE_IN_PROGRESS and WAITING.
     */
    public enum LifecycleSubstate implements com.oracle.bmc.http.internal.BmcEnum {
        DurationExceeded("DURATION_EXCEEDED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        Waiting("WAITING"),
        Rescheduled("RESCHEDULED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleSubstate.class);

        private final String value;
        private static java.util.Map<String, LifecycleSubstate> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleSubstate v : LifecycleSubstate.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleSubstate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleSubstate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleSubstate', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current sub-state of the execution action. Valid states are DURATION_EXCEEDED,
     * MAINTENANCE_IN_PROGRESS and WAITING.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubstate")
    private final LifecycleSubstate lifecycleSubstate;

    /**
     * The current sub-state of the execution action. Valid states are DURATION_EXCEEDED,
     * MAINTENANCE_IN_PROGRESS and WAITING.
     *
     * @return the value
     */
    public LifecycleSubstate getLifecycleSubstate() {
        return lifecycleSubstate;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The date and time the execution action was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the execution action was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The last date and time that the execution action was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last date and time that the execution action was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The estimated time of the execution action in minutes. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
    private final Integer estimatedTimeInMins;

    /**
     * The estimated time of the execution action in minutes.
     *
     * @return the value
     */
    public Integer getEstimatedTimeInMins() {
        return estimatedTimeInMins;
    }

    /** The total time taken by corresponding resource activity in minutes. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalTimeTakenInMins")
    private final Integer totalTimeTakenInMins;

    /**
     * The total time taken by corresponding resource activity in minutes.
     *
     * @return the value
     */
    public Integer getTotalTimeTakenInMins() {
        return totalTimeTakenInMins;
    }

    /** The priority order of the execution action. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionActionOrder")
    private final Integer executionActionOrder;

    /**
     * The priority order of the execution action.
     *
     * @return the value
     */
    public Integer getExecutionActionOrder() {
        return executionActionOrder;
    }

    /** The action type of the execution action being performed */
    public enum ActionType implements com.oracle.bmc.http.internal.BmcEnum {
        DbServerFullSoftwareUpdate("DB_SERVER_FULL_SOFTWARE_UPDATE"),
        StorageServerFullSoftwareUpdate("STORAGE_SERVER_FULL_SOFTWARE_UPDATE"),
        NetworkSwitchFullSoftwareUpdate("NETWORK_SWITCH_FULL_SOFTWARE_UPDATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActionType.class);

        private final String value;
        private static java.util.Map<String, ActionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActionType v : ActionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The action type of the execution action being performed */
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final ActionType actionType;

    /**
     * The action type of the execution action being performed
     *
     * @return the value
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * Map<ParamName, ParamValue> where a key value pair describes the specific action parameter.
     * Example: {@code {"count": "3"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actionParams")
    private final java.util.Map<String, String> actionParams;

    /**
     * Map<ParamName, ParamValue> where a key value pair describes the specific action parameter.
     * Example: {@code {"count": "3"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getActionParams() {
        return actionParams;
    }

    /** List of action members of this execution action. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionMembers")
    private final java.util.List<ExecutionActionMember> actionMembers;

    /**
     * List of action members of this execution action.
     *
     * @return the value
     */
    public java.util.List<ExecutionActionMember> getActionMembers() {
        return actionMembers;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("ExecutionAction(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", executionWindowId=").append(String.valueOf(this.executionWindowId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleSubstate=").append(String.valueOf(this.lifecycleSubstate));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", estimatedTimeInMins=").append(String.valueOf(this.estimatedTimeInMins));
        sb.append(", totalTimeTakenInMins=").append(String.valueOf(this.totalTimeTakenInMins));
        sb.append(", executionActionOrder=").append(String.valueOf(this.executionActionOrder));
        sb.append(", actionType=").append(String.valueOf(this.actionType));
        sb.append(", actionParams=").append(String.valueOf(this.actionParams));
        sb.append(", actionMembers=").append(String.valueOf(this.actionMembers));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecutionAction)) {
            return false;
        }

        ExecutionAction other = (ExecutionAction) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.executionWindowId, other.executionWindowId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleSubstate, other.lifecycleSubstate)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.estimatedTimeInMins, other.estimatedTimeInMins)
                && java.util.Objects.equals(this.totalTimeTakenInMins, other.totalTimeTakenInMins)
                && java.util.Objects.equals(this.executionActionOrder, other.executionActionOrder)
                && java.util.Objects.equals(this.actionType, other.actionType)
                && java.util.Objects.equals(this.actionParams, other.actionParams)
                && java.util.Objects.equals(this.actionMembers, other.actionMembers)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.executionWindowId == null ? 43 : this.executionWindowId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleSubstate == null ? 43 : this.lifecycleSubstate.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedTimeInMins == null
                                ? 43
                                : this.estimatedTimeInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.totalTimeTakenInMins == null
                                ? 43
                                : this.totalTimeTakenInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.executionActionOrder == null
                                ? 43
                                : this.executionActionOrder.hashCode());
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result = (result * PRIME) + (this.actionParams == null ? 43 : this.actionParams.hashCode());
        result =
                (result * PRIME)
                        + (this.actionMembers == null ? 43 : this.actionMembers.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
