/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Summary of access request status. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AccessRequestHistorySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AccessRequestHistorySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The current state of the AccessRequest. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AccessRequestLifecycleStates lifecycleState;

        /**
         * The current state of the AccessRequest.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(AccessRequestLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Approver who modified the access request. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * Approver who modified the access request.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /** Reason or description about the cause of change. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Reason or description about the cause of change.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Duration for approval of request or extension depending on the type of action. */
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Integer duration;

        /**
         * Duration for approval of request or extension depending on the type of action.
         *
         * @param duration the value to set
         * @return this builder
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }
        /** Whether the access request was automatically approved. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
        private Boolean isAutoApproved;

        /**
         * Whether the access request was automatically approved.
         *
         * @param isAutoApproved the value to set
         * @return this builder
         */
        public Builder isAutoApproved(Boolean isAutoApproved) {
            this.isAutoApproved = isAutoApproved;
            this.__explicitlySet__.add("isAutoApproved");
            return this;
        }
        /** List of operator actions for which approvals were requested by the operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionsList")
        private java.util.List<String> actionsList;

        /**
         * List of operator actions for which approvals were requested by the operator.
         *
         * @param actionsList the value to set
         * @return this builder
         */
        public Builder actionsList(java.util.List<String> actionsList) {
            this.actionsList = actionsList;
            this.__explicitlySet__.add("actionsList");
            return this;
        }
        /**
         * Time when the respective action happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAction")
        private java.util.Date timeOfAction;

        /**
         * Time when the respective action happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfAction the value to set
         * @return this builder
         */
        public Builder timeOfAction(java.util.Date timeOfAction) {
            this.timeOfAction = timeOfAction;
            this.__explicitlySet__.add("timeOfAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessRequestHistorySummary build() {
            AccessRequestHistorySummary model =
                    new AccessRequestHistorySummary(
                            this.lifecycleState,
                            this.userId,
                            this.description,
                            this.duration,
                            this.isAutoApproved,
                            this.actionsList,
                            this.timeOfAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRequestHistorySummary model) {
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
            }
            if (model.wasPropertyExplicitlySet("isAutoApproved")) {
                this.isAutoApproved(model.getIsAutoApproved());
            }
            if (model.wasPropertyExplicitlySet("actionsList")) {
                this.actionsList(model.getActionsList());
            }
            if (model.wasPropertyExplicitlySet("timeOfAction")) {
                this.timeOfAction(model.getTimeOfAction());
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

    /** The current state of the AccessRequest. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AccessRequestLifecycleStates lifecycleState;

    /**
     * The current state of the AccessRequest.
     *
     * @return the value
     */
    public AccessRequestLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** Approver who modified the access request. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * Approver who modified the access request.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /** Reason or description about the cause of change. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Reason or description about the cause of change.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Duration for approval of request or extension depending on the type of action. */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Integer duration;

    /**
     * Duration for approval of request or extension depending on the type of action.
     *
     * @return the value
     */
    public Integer getDuration() {
        return duration;
    }

    /** Whether the access request was automatically approved. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    private final Boolean isAutoApproved;

    /**
     * Whether the access request was automatically approved.
     *
     * @return the value
     */
    public Boolean getIsAutoApproved() {
        return isAutoApproved;
    }

    /** List of operator actions for which approvals were requested by the operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionsList")
    private final java.util.List<String> actionsList;

    /**
     * List of operator actions for which approvals were requested by the operator.
     *
     * @return the value
     */
    public java.util.List<String> getActionsList() {
        return actionsList;
    }

    /**
     * Time when the respective action happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAction")
    private final java.util.Date timeOfAction;

    /**
     * Time when the respective action happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeOfAction() {
        return timeOfAction;
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
        sb.append("AccessRequestHistorySummary(");
        sb.append("super=").append(super.toString());
        sb.append("lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", isAutoApproved=").append(String.valueOf(this.isAutoApproved));
        sb.append(", actionsList=").append(String.valueOf(this.actionsList));
        sb.append(", timeOfAction=").append(String.valueOf(this.timeOfAction));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
