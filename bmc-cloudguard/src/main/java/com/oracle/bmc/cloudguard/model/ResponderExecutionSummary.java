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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResponderExecutionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResponderExecutionSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "responderRuleId",
        "responderRuleType",
        "responderRuleName",
        "problemId",
        "problemName",
        "region",
        "targetId",
        "compartmentId",
        "resourceType",
        "resourceName",
        "timeCreated",
        "timeCompleted",
        "responderExecutionStatus",
        "responderExecutionMode",
        "message",
        "responderRuleExecutionDetails"
    })
    public ResponderExecutionSummary(
            String id,
            String responderRuleId,
            ResponderType responderRuleType,
            String responderRuleName,
            String problemId,
            String problemName,
            String region,
            String targetId,
            String compartmentId,
            String resourceType,
            String resourceName,
            java.util.Date timeCreated,
            java.util.Date timeCompleted,
            ResponderExecutionStates responderExecutionStatus,
            ResponderExecutionModes responderExecutionMode,
            String message,
            ResponderRuleExecutionDetails responderRuleExecutionDetails) {
        super();
        this.id = id;
        this.responderRuleId = responderRuleId;
        this.responderRuleType = responderRuleType;
        this.responderRuleName = responderRuleName;
        this.problemId = problemId;
        this.problemName = problemName;
        this.region = region;
        this.targetId = targetId;
        this.compartmentId = compartmentId;
        this.resourceType = resourceType;
        this.resourceName = resourceName;
        this.timeCreated = timeCreated;
        this.timeCompleted = timeCompleted;
        this.responderExecutionStatus = responderExecutionStatus;
        this.responderExecutionMode = responderExecutionMode;
        this.message = message;
        this.responderRuleExecutionDetails = responderRuleExecutionDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The unique identifier of the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * Responder Rule id for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    private final String responderRuleId;

    public String getResponderRuleId() {
        return responderRuleId;
    }

    /**
     * Rule Type for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleType")
    private final ResponderType responderRuleType;

    public ResponderType getResponderRuleType() {
        return responderRuleType;
    }

    /**
     * Rule name for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
    private final String responderRuleName;

    public String getResponderRuleName() {
        return responderRuleName;
    }

    /**
     * Problem id associated with the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    public String getProblemId() {
        return problemId;
    }

    /**
     * Problem name associated with the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemName")
    private final String problemName;

    public String getProblemName() {
        return problemName;
    }

    /**
     * Region where the problem is found
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    public String getRegion() {
        return region;
    }

    /**
     * Target Id of the problem for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    public String getTargetId() {
        return targetId;
    }

    /**
     * compartment id of the problem for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * resource type of the problem for the responder execution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    public String getResourceType() {
        return resourceType;
    }

    /**
     * resource name of the problem for the responder execution. TODO-DOC link to resource definition doc
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    public String getResourceName() {
        return resourceName;
    }

    /**
     * The date and time the responder execution was created. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the responder execution was updated. Format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }

    /**
     * current execution status of the responder
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
    private final ResponderExecutionStates responderExecutionStatus;

    public ResponderExecutionStates getResponderExecutionStatus() {
        return responderExecutionStatus;
    }

    /**
     * possible type of responder execution modes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionMode")
    private final ResponderExecutionModes responderExecutionMode;

    public ResponderExecutionModes getResponderExecutionMode() {
        return responderExecutionMode;
    }

    /**
     * Message about the responder execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    public String getMessage() {
        return message;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleExecutionDetails")
    private final ResponderRuleExecutionDetails responderRuleExecutionDetails;

    public ResponderRuleExecutionDetails getResponderRuleExecutionDetails() {
        return responderRuleExecutionDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResponderExecutionSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", responderRuleId=").append(String.valueOf(this.responderRuleId));
        sb.append(", responderRuleType=").append(String.valueOf(this.responderRuleType));
        sb.append(", responderRuleName=").append(String.valueOf(this.responderRuleName));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
        sb.append(", problemName=").append(String.valueOf(this.problemName));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(", responderExecutionStatus=")
                .append(String.valueOf(this.responderExecutionStatus));
        sb.append(", responderExecutionMode=").append(String.valueOf(this.responderExecutionMode));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", responderRuleExecutionDetails=")
                .append(String.valueOf(this.responderRuleExecutionDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponderExecutionSummary)) {
            return false;
        }

        ResponderExecutionSummary other = (ResponderExecutionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.responderRuleId, other.responderRuleId)
                && java.util.Objects.equals(this.responderRuleType, other.responderRuleType)
                && java.util.Objects.equals(this.responderRuleName, other.responderRuleName)
                && java.util.Objects.equals(this.problemId, other.problemId)
                && java.util.Objects.equals(this.problemName, other.problemName)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && java.util.Objects.equals(
                        this.responderExecutionStatus, other.responderExecutionStatus)
                && java.util.Objects.equals(
                        this.responderExecutionMode, other.responderExecutionMode)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(
                        this.responderRuleExecutionDetails, other.responderRuleExecutionDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRuleId == null ? 43 : this.responderRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRuleType == null ? 43 : this.responderRuleType.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRuleName == null ? 43 : this.responderRuleName.hashCode());
        result = (result * PRIME) + (this.problemId == null ? 43 : this.problemId.hashCode());
        result = (result * PRIME) + (this.problemName == null ? 43 : this.problemName.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result =
                (result * PRIME)
                        + (this.responderExecutionStatus == null
                                ? 43
                                : this.responderExecutionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.responderExecutionMode == null
                                ? 43
                                : this.responderExecutionMode.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRuleExecutionDetails == null
                                ? 43
                                : this.responderRuleExecutionDetails.hashCode());
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
