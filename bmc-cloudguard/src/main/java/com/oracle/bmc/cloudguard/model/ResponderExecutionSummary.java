/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Summary of the Responder Execution.
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
    builder = ResponderExecutionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ResponderExecutionSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
        private String responderRuleId;

        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            this.__explicitlySet__.add("responderRuleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleType")
        private ResponderType responderRuleType;

        public Builder responderRuleType(ResponderType responderRuleType) {
            this.responderRuleType = responderRuleType;
            this.__explicitlySet__.add("responderRuleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
        private String responderRuleName;

        public Builder responderRuleName(String responderRuleName) {
            this.responderRuleName = responderRuleName;
            this.__explicitlySet__.add("responderRuleName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("problemName")
        private String problemName;

        public Builder problemName(String problemName) {
            this.problemName = problemName;
            this.__explicitlySet__.add("problemName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
        private ResponderExecutionStates responderExecutionStatus;

        public Builder responderExecutionStatus(ResponderExecutionStates responderExecutionStatus) {
            this.responderExecutionStatus = responderExecutionStatus;
            this.__explicitlySet__.add("responderExecutionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionMode")
        private ResponderExecutionModes responderExecutionMode;

        public Builder responderExecutionMode(ResponderExecutionModes responderExecutionMode) {
            this.responderExecutionMode = responderExecutionMode;
            this.__explicitlySet__.add("responderExecutionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleExecutionDetails")
        private ResponderRuleExecutionDetails responderRuleExecutionDetails;

        public Builder responderRuleExecutionDetails(
                ResponderRuleExecutionDetails responderRuleExecutionDetails) {
            this.responderRuleExecutionDetails = responderRuleExecutionDetails;
            this.__explicitlySet__.add("responderRuleExecutionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResponderExecutionSummary build() {
            ResponderExecutionSummary __instance__ =
                    new ResponderExecutionSummary(
                            id,
                            responderRuleId,
                            responderRuleType,
                            responderRuleName,
                            problemId,
                            problemName,
                            region,
                            targetId,
                            compartmentId,
                            resourceType,
                            resourceName,
                            timeCreated,
                            timeCompleted,
                            responderExecutionStatus,
                            responderExecutionMode,
                            message,
                            responderRuleExecutionDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponderExecutionSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .responderRuleId(o.getResponderRuleId())
                            .responderRuleType(o.getResponderRuleType())
                            .responderRuleName(o.getResponderRuleName())
                            .problemId(o.getProblemId())
                            .problemName(o.getProblemName())
                            .region(o.getRegion())
                            .targetId(o.getTargetId())
                            .compartmentId(o.getCompartmentId())
                            .resourceType(o.getResourceType())
                            .resourceName(o.getResourceName())
                            .timeCreated(o.getTimeCreated())
                            .timeCompleted(o.getTimeCompleted())
                            .responderExecutionStatus(o.getResponderExecutionStatus())
                            .responderExecutionMode(o.getResponderExecutionMode())
                            .message(o.getMessage())
                            .responderRuleExecutionDetails(o.getResponderRuleExecutionDetails());

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
     * The unique identifier of the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Responder Rule id for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    String responderRuleId;

    /**
     * Rule Type for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleType")
    ResponderType responderRuleType;

    /**
     * Rule name for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
    String responderRuleName;

    /**
     * Problem id associated with the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    String problemId;

    /**
     * Problem name associated with the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemName")
    String problemName;

    /**
     * Region where the problem is found
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    String region;

    /**
     * Target Id of the problem for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * compartment id of the problem for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * resource type of the problem for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    String resourceType;

    /**
     * resource name of the problem for the responder execution. TODO-DOC link to resource definition doc
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * The date and time the responder execution was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the responder execution was updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    java.util.Date timeCompleted;

    /**
     * current execution status of the responder
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
    ResponderExecutionStates responderExecutionStatus;

    /**
     * possible type of responder execution modes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionMode")
    ResponderExecutionModes responderExecutionMode;

    /**
     * Message about the responder execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    String message;

    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleExecutionDetails")
    ResponderRuleExecutionDetails responderRuleExecutionDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
