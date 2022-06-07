/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Summary of access request status.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AccessRequestHistorySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AccessRequestHistorySummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lifecycleState",
        "userId",
        "description",
        "duration",
        "isAutoApproved",
        "actionsList",
        "timeOfAction"
    })
    public AccessRequestHistorySummary(
            AccessRequestLifecycleStates lifecycleState,
            String userId,
            String description,
            Integer duration,
            Boolean isAutoApproved,
            java.util.List<String> actionsList,
            java.util.Date timeOfAction) {
        super();
        this.lifecycleState = lifecycleState;
        this.userId = userId;
        this.description = description;
        this.duration = duration;
        this.isAutoApproved = isAutoApproved;
        this.actionsList = actionsList;
        this.timeOfAction = timeOfAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AccessRequestLifecycleStates lifecycleState;

        public Builder lifecycleState(AccessRequestLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Integer duration;

        public Builder duration(Integer duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
        private Boolean isAutoApproved;

        public Builder isAutoApproved(Boolean isAutoApproved) {
            this.isAutoApproved = isAutoApproved;
            this.__explicitlySet__.add("isAutoApproved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionsList")
        private java.util.List<String> actionsList;

        public Builder actionsList(java.util.List<String> actionsList) {
            this.actionsList = actionsList;
            this.__explicitlySet__.add("actionsList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAction")
        private java.util.Date timeOfAction;

        public Builder timeOfAction(java.util.Date timeOfAction) {
            this.timeOfAction = timeOfAction;
            this.__explicitlySet__.add("timeOfAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessRequestHistorySummary build() {
            AccessRequestHistorySummary __instance__ =
                    new AccessRequestHistorySummary(
                            lifecycleState,
                            userId,
                            description,
                            duration,
                            isAutoApproved,
                            actionsList,
                            timeOfAction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRequestHistorySummary o) {
            Builder copiedBuilder =
                    lifecycleState(o.getLifecycleState())
                            .userId(o.getUserId())
                            .description(o.getDescription())
                            .duration(o.getDuration())
                            .isAutoApproved(o.getIsAutoApproved())
                            .actionsList(o.getActionsList())
                            .timeOfAction(o.getTimeOfAction());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The current state of the AccessRequest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AccessRequestLifecycleStates lifecycleState;

    public AccessRequestLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Approver who modified the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    public String getUserId() {
        return userId;
    }

    /**
     * Reason or description about the cause of change.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Duration for approval of request or extension depending on the type of action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Integer duration;

    public Integer getDuration() {
        return duration;
    }

    /**
     * Whether the access request was automatically approved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    private final Boolean isAutoApproved;

    public Boolean getIsAutoApproved() {
        return isAutoApproved;
    }

    /**
     * List of operator actions for which approvals were requested by the operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionsList")
    private final java.util.List<String> actionsList;

    public java.util.List<String> getActionsList() {
        return actionsList;
    }

    /**
     * Time when the respective action happened in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAction")
    private final java.util.Date timeOfAction;

    public java.util.Date getTimeOfAction() {
        return timeOfAction;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AccessRequestHistorySummary(");
        sb.append("lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", isAutoApproved=").append(String.valueOf(this.isAutoApproved));
        sb.append(", actionsList=").append(String.valueOf(this.actionsList));
        sb.append(", timeOfAction=").append(String.valueOf(this.timeOfAction));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessRequestHistorySummary)) {
            return false;
        }

        AccessRequestHistorySummary other = (AccessRequestHistorySummary) o;
        return java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.isAutoApproved, other.isAutoApproved)
                && java.util.Objects.equals(this.actionsList, other.actionsList)
                && java.util.Objects.equals(this.timeOfAction, other.timeOfAction)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoApproved == null ? 43 : this.isAutoApproved.hashCode());
        result = (result * PRIME) + (this.actionsList == null ? 43 : this.actionsList.hashCode());
        result = (result * PRIME) + (this.timeOfAction == null ? 43 : this.timeOfAction.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
