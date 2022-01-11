/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Responder Activity summary Definition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResponderActivitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResponderActivitySummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
        private String responderRuleId;

        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            this.__explicitlySet__.add("responderRuleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderType")
        private ResponderType responderType;

        public Builder responderType(ResponderType responderType) {
            this.responderType = responderType;
            this.__explicitlySet__.add("responderType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
        private String responderRuleName;

        public Builder responderRuleName(String responderRuleName) {
            this.responderRuleName = responderRuleName;
            this.__explicitlySet__.add("responderRuleName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderActivityType")
        private ResponderActivityType responderActivityType;

        public Builder responderActivityType(ResponderActivityType responderActivityType) {
            this.responderActivityType = responderActivityType;
            this.__explicitlySet__.add("responderActivityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
        private ResponderExecutionStates responderExecutionStatus;

        public Builder responderExecutionStatus(ResponderExecutionStates responderExecutionStatus) {
            this.responderExecutionStatus = responderExecutionStatus;
            this.__explicitlySet__.add("responderExecutionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResponderActivitySummary build() {
            ResponderActivitySummary __instance__ =
                    new ResponderActivitySummary(
                            id,
                            problemId,
                            responderRuleId,
                            responderType,
                            responderRuleName,
                            responderActivityType,
                            responderExecutionStatus,
                            timeCreated,
                            message);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponderActivitySummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .problemId(o.getProblemId())
                            .responderRuleId(o.getResponderRuleId())
                            .responderType(o.getResponderType())
                            .responderRuleName(o.getResponderRuleName())
                            .responderActivityType(o.getResponderActivityType())
                            .responderExecutionStatus(o.getResponderExecutionStatus())
                            .timeCreated(o.getTimeCreated())
                            .message(o.getMessage());

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
     * Unique id for Responder activity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * problemId for which Responder activity is associated to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    String problemId;

    /**
     * Id of the responder rule for the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    String responderRuleId;

    /**
     * responder rule type for performing the operation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderType")
    ResponderType responderType;

    /**
     * responder rule name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
    String responderRuleName;

    /**
     * Responder activity types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderActivityType")
    ResponderActivityType responderActivityType;

    /**
     * the responder execution status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
    ResponderExecutionStates responderExecutionStatus;

    /**
     * responder activity starting time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * additional message related to this operation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    String message;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
