/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AccessRequestHistorySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AccessRequestHistorySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The current state of the AccessRequest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    AccessRequestLifecycleStates lifecycleState;

    /**
     * Approver who modified the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    String userId;

    /**
     * Reason or description about the cause of change.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Duration for approval of request or extension depending on the type of action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    Integer duration;

    /**
     * Whether the access request was automatically approved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoApproved")
    Boolean isAutoApproved;

    /**
     * List of operator actions for which approvals were requested by the operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionsList")
    java.util.List<String> actionsList;

    /**
     * Time when the respective action happened in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAction")
    java.util.Date timeOfAction;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
