/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the scheduled action that is used in getRecommendedScheduledActions. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RecommendedScheduledActionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecommendedScheduledActionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "actionOrder",
        "actionType",
        "displayName",
        "schedulingWindowId",
        "estimatedTimeInMins",
        "actionMembers",
        "actionParams"
    })
    public RecommendedScheduledActionSummary(
            Integer actionOrder,
            ActionType actionType,
            String displayName,
            String schedulingWindowId,
            Integer estimatedTimeInMins,
            java.util.List<ActionMember> actionMembers,
            java.util.Map<String, String> actionParams) {
        super();
        this.actionOrder = actionOrder;
        this.actionType = actionType;
        this.displayName = displayName;
        this.schedulingWindowId = schedulingWindowId;
        this.estimatedTimeInMins = estimatedTimeInMins;
        this.actionMembers = actionMembers;
        this.actionParams = actionParams;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The order of the scheduled action. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionOrder")
        private Integer actionOrder;

        /**
         * The order of the scheduled action.
         *
         * @param actionOrder the value to set
         * @return this builder
         */
        public Builder actionOrder(Integer actionOrder) {
            this.actionOrder = actionOrder;
            this.__explicitlySet__.add("actionOrder");
            return this;
        }
        /** The type of the scheduled action being performed */
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        /**
         * The type of the scheduled action being performed
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
         * Description of the scheduled action being performed, i.e. apply full update to DB Servers
         * 1,2,3,4.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Description of the scheduled action being performed, i.e. apply full update to DB Servers
         * 1,2,3,4.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The id of the scheduling window this scheduled action belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("schedulingWindowId")
        private String schedulingWindowId;

        /**
         * The id of the scheduling window this scheduled action belongs to.
         *
         * @param schedulingWindowId the value to set
         * @return this builder
         */
        public Builder schedulingWindowId(String schedulingWindowId) {
            this.schedulingWindowId = schedulingWindowId;
            this.__explicitlySet__.add("schedulingWindowId");
            return this;
        }
        /** The estimated patching time in minutes for the entire scheduled action. */
        @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
        private Integer estimatedTimeInMins;

        /**
         * The estimated patching time in minutes for the entire scheduled action.
         *
         * @param estimatedTimeInMins the value to set
         * @return this builder
         */
        public Builder estimatedTimeInMins(Integer estimatedTimeInMins) {
            this.estimatedTimeInMins = estimatedTimeInMins;
            this.__explicitlySet__.add("estimatedTimeInMins");
            return this;
        }
        /** The list of action members in a scheduled action. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionMembers")
        private java.util.List<ActionMember> actionMembers;

        /**
         * The list of action members in a scheduled action.
         *
         * @param actionMembers the value to set
         * @return this builder
         */
        public Builder actionMembers(java.util.List<ActionMember> actionMembers) {
            this.actionMembers = actionMembers;
            this.__explicitlySet__.add("actionMembers");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecommendedScheduledActionSummary build() {
            RecommendedScheduledActionSummary model =
                    new RecommendedScheduledActionSummary(
                            this.actionOrder,
                            this.actionType,
                            this.displayName,
                            this.schedulingWindowId,
                            this.estimatedTimeInMins,
                            this.actionMembers,
                            this.actionParams);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecommendedScheduledActionSummary model) {
            if (model.wasPropertyExplicitlySet("actionOrder")) {
                this.actionOrder(model.getActionOrder());
            }
            if (model.wasPropertyExplicitlySet("actionType")) {
                this.actionType(model.getActionType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("schedulingWindowId")) {
                this.schedulingWindowId(model.getSchedulingWindowId());
            }
            if (model.wasPropertyExplicitlySet("estimatedTimeInMins")) {
                this.estimatedTimeInMins(model.getEstimatedTimeInMins());
            }
            if (model.wasPropertyExplicitlySet("actionMembers")) {
                this.actionMembers(model.getActionMembers());
            }
            if (model.wasPropertyExplicitlySet("actionParams")) {
                this.actionParams(model.getActionParams());
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

    /** The order of the scheduled action. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionOrder")
    private final Integer actionOrder;

    /**
     * The order of the scheduled action.
     *
     * @return the value
     */
    public Integer getActionOrder() {
        return actionOrder;
    }

    /** The type of the scheduled action being performed */
    public enum ActionType implements com.oracle.bmc.http.internal.BmcEnum {
        DbServerFullSoftwareUpdate("DB_SERVER_FULL_SOFTWARE_UPDATE"),
        StorageServerFullSoftwareUpdate("STORAGE_SERVER_FULL_SOFTWARE_UPDATE"),
        NetworkSwitchFullSoftwareUpdate("NETWORK_SWITCH_FULL_SOFTWARE_UPDATE"),
        FsuVmClusterOsSoftwareUpdate("FSU_VM_CLUSTER_OS_SOFTWARE_UPDATE"),
        FsuVmClusterGiSoftwareUpdate("FSU_VM_CLUSTER_GI_SOFTWARE_UPDATE"),
        FsuVmClusterGiOsSoftwareUpdate("FSU_VM_CLUSTER_GI_OS_SOFTWARE_UPDATE"),

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
    /** The type of the scheduled action being performed */
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final ActionType actionType;

    /**
     * The type of the scheduled action being performed
     *
     * @return the value
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * Description of the scheduled action being performed, i.e. apply full update to DB Servers
     * 1,2,3,4.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Description of the scheduled action being performed, i.e. apply full update to DB Servers
     * 1,2,3,4.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The id of the scheduling window this scheduled action belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulingWindowId")
    private final String schedulingWindowId;

    /**
     * The id of the scheduling window this scheduled action belongs to.
     *
     * @return the value
     */
    public String getSchedulingWindowId() {
        return schedulingWindowId;
    }

    /** The estimated patching time in minutes for the entire scheduled action. */
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedTimeInMins")
    private final Integer estimatedTimeInMins;

    /**
     * The estimated patching time in minutes for the entire scheduled action.
     *
     * @return the value
     */
    public Integer getEstimatedTimeInMins() {
        return estimatedTimeInMins;
    }

    /** The list of action members in a scheduled action. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionMembers")
    private final java.util.List<ActionMember> actionMembers;

    /**
     * The list of action members in a scheduled action.
     *
     * @return the value
     */
    public java.util.List<ActionMember> getActionMembers() {
        return actionMembers;
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
        sb.append("RecommendedScheduledActionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("actionOrder=").append(String.valueOf(this.actionOrder));
        sb.append(", actionType=").append(String.valueOf(this.actionType));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", schedulingWindowId=").append(String.valueOf(this.schedulingWindowId));
        sb.append(", estimatedTimeInMins=").append(String.valueOf(this.estimatedTimeInMins));
        sb.append(", actionMembers=").append(String.valueOf(this.actionMembers));
        sb.append(", actionParams=").append(String.valueOf(this.actionParams));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendedScheduledActionSummary)) {
            return false;
        }

        RecommendedScheduledActionSummary other = (RecommendedScheduledActionSummary) o;
        return java.util.Objects.equals(this.actionOrder, other.actionOrder)
                && java.util.Objects.equals(this.actionType, other.actionType)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.schedulingWindowId, other.schedulingWindowId)
                && java.util.Objects.equals(this.estimatedTimeInMins, other.estimatedTimeInMins)
                && java.util.Objects.equals(this.actionMembers, other.actionMembers)
                && java.util.Objects.equals(this.actionParams, other.actionParams)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.actionOrder == null ? 43 : this.actionOrder.hashCode());
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.schedulingWindowId == null
                                ? 43
                                : this.schedulingWindowId.hashCode());
        result =
                (result * PRIME)
                        + (this.estimatedTimeInMins == null
                                ? 43
                                : this.estimatedTimeInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.actionMembers == null ? 43 : this.actionMembers.hashCode());
        result = (result * PRIME) + (this.actionParams == null ? 43 : this.actionParams.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
