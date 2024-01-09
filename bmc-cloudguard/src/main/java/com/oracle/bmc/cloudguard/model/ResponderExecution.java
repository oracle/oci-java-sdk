/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Responder Execution Object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResponderExecution.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResponderExecution
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "responderRuleId",
        "responderRuleType",
        "responderRuleName",
        "problemId",
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
    public ResponderExecution(
            String id,
            String responderRuleId,
            ResponderType responderRuleType,
            String responderRuleName,
            String problemId,
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
        /** The unique identifier of the responder execution */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier of the responder execution
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Responder Rule id for the responder execution */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
        private String responderRuleId;

        /**
         * Responder Rule id for the responder execution
         *
         * @param responderRuleId the value to set
         * @return this builder
         */
        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            this.__explicitlySet__.add("responderRuleId");
            return this;
        }
        /** Rule Type for the responder execution */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleType")
        private ResponderType responderRuleType;

        /**
         * Rule Type for the responder execution
         *
         * @param responderRuleType the value to set
         * @return this builder
         */
        public Builder responderRuleType(ResponderType responderRuleType) {
            this.responderRuleType = responderRuleType;
            this.__explicitlySet__.add("responderRuleType");
            return this;
        }
        /** Rule name for the responder execution */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
        private String responderRuleName;

        /**
         * Rule name for the responder execution
         *
         * @param responderRuleName the value to set
         * @return this builder
         */
        public Builder responderRuleName(String responderRuleName) {
            this.responderRuleName = responderRuleName;
            this.__explicitlySet__.add("responderRuleName");
            return this;
        }
        /** Problem id associated with the responder execution */
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Problem id associated with the responder execution
         *
         * @param problemId the value to set
         * @return this builder
         */
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /** region where the problem is found */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * region where the problem is found
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** targetId of the problem for the responder execution */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * targetId of the problem for the responder execution
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** compartment id of the responder execution for the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * compartment id of the responder execution for the problem
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** resource type of the problem for the responder execution */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * resource type of the problem for the responder execution
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * resource name of the problem for the responder execution. TODO-DOC link to resource
         * definition doc
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * resource name of the problem for the responder execution. TODO-DOC link to resource
         * definition doc
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** The date and time the responder execution was created. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the responder execution was created. Format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the responder execution was updated. Format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * The date and time the responder execution was updated. Format defined by RFC3339.
         *
         * @param timeCompleted the value to set
         * @return this builder
         */
        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }
        /** current execution status of the responder */
        @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
        private ResponderExecutionStates responderExecutionStatus;

        /**
         * current execution status of the responder
         *
         * @param responderExecutionStatus the value to set
         * @return this builder
         */
        public Builder responderExecutionStatus(ResponderExecutionStates responderExecutionStatus) {
            this.responderExecutionStatus = responderExecutionStatus;
            this.__explicitlySet__.add("responderExecutionStatus");
            return this;
        }
        /** execution mode of the responder */
        @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionMode")
        private ResponderExecutionModes responderExecutionMode;

        /**
         * execution mode of the responder
         *
         * @param responderExecutionMode the value to set
         * @return this builder
         */
        public Builder responderExecutionMode(ResponderExecutionModes responderExecutionMode) {
            this.responderExecutionMode = responderExecutionMode;
            this.__explicitlySet__.add("responderExecutionMode");
            return this;
        }
        /** Message about the responder execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Message about the responder execution.
         *
         * @param message the value to set
         * @return this builder
         */
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

        public ResponderExecution build() {
            ResponderExecution model =
                    new ResponderExecution(
                            this.id,
                            this.responderRuleId,
                            this.responderRuleType,
                            this.responderRuleName,
                            this.problemId,
                            this.region,
                            this.targetId,
                            this.compartmentId,
                            this.resourceType,
                            this.resourceName,
                            this.timeCreated,
                            this.timeCompleted,
                            this.responderExecutionStatus,
                            this.responderExecutionMode,
                            this.message,
                            this.responderRuleExecutionDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponderExecution model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("responderRuleId")) {
                this.responderRuleId(model.getResponderRuleId());
            }
            if (model.wasPropertyExplicitlySet("responderRuleType")) {
                this.responderRuleType(model.getResponderRuleType());
            }
            if (model.wasPropertyExplicitlySet("responderRuleName")) {
                this.responderRuleName(model.getResponderRuleName());
            }
            if (model.wasPropertyExplicitlySet("problemId")) {
                this.problemId(model.getProblemId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
            }
            if (model.wasPropertyExplicitlySet("responderExecutionStatus")) {
                this.responderExecutionStatus(model.getResponderExecutionStatus());
            }
            if (model.wasPropertyExplicitlySet("responderExecutionMode")) {
                this.responderExecutionMode(model.getResponderExecutionMode());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("responderRuleExecutionDetails")) {
                this.responderRuleExecutionDetails(model.getResponderRuleExecutionDetails());
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

    /** The unique identifier of the responder execution */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier of the responder execution
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Responder Rule id for the responder execution */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    private final String responderRuleId;

    /**
     * Responder Rule id for the responder execution
     *
     * @return the value
     */
    public String getResponderRuleId() {
        return responderRuleId;
    }

    /** Rule Type for the responder execution */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleType")
    private final ResponderType responderRuleType;

    /**
     * Rule Type for the responder execution
     *
     * @return the value
     */
    public ResponderType getResponderRuleType() {
        return responderRuleType;
    }

    /** Rule name for the responder execution */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
    private final String responderRuleName;

    /**
     * Rule name for the responder execution
     *
     * @return the value
     */
    public String getResponderRuleName() {
        return responderRuleName;
    }

    /** Problem id associated with the responder execution */
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Problem id associated with the responder execution
     *
     * @return the value
     */
    public String getProblemId() {
        return problemId;
    }

    /** region where the problem is found */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * region where the problem is found
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** targetId of the problem for the responder execution */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * targetId of the problem for the responder execution
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** compartment id of the responder execution for the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * compartment id of the responder execution for the problem
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** resource type of the problem for the responder execution */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * resource type of the problem for the responder execution
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * resource name of the problem for the responder execution. TODO-DOC link to resource
     * definition doc
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * resource name of the problem for the responder execution. TODO-DOC link to resource
     * definition doc
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** The date and time the responder execution was created. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the responder execution was created. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the responder execution was updated. Format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * The date and time the responder execution was updated. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }

    /** current execution status of the responder */
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
    private final ResponderExecutionStates responderExecutionStatus;

    /**
     * current execution status of the responder
     *
     * @return the value
     */
    public ResponderExecutionStates getResponderExecutionStatus() {
        return responderExecutionStatus;
    }

    /** execution mode of the responder */
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionMode")
    private final ResponderExecutionModes responderExecutionMode;

    /**
     * execution mode of the responder
     *
     * @return the value
     */
    public ResponderExecutionModes getResponderExecutionMode() {
        return responderExecutionMode;
    }

    /** Message about the responder execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Message about the responder execution.
     *
     * @return the value
     */
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
        sb.append("ResponderExecution(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", responderRuleId=").append(String.valueOf(this.responderRuleId));
        sb.append(", responderRuleType=").append(String.valueOf(this.responderRuleType));
        sb.append(", responderRuleName=").append(String.valueOf(this.responderRuleName));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
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
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponderExecution)) {
            return false;
        }

        ResponderExecution other = (ResponderExecution) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.responderRuleId, other.responderRuleId)
                && java.util.Objects.equals(this.responderRuleType, other.responderRuleType)
                && java.util.Objects.equals(this.responderRuleName, other.responderRuleName)
                && java.util.Objects.equals(this.problemId, other.problemId)
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
