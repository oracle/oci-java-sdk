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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResponderActivitySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResponderActivitySummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "problemId",
        "responderRuleId",
        "responderType",
        "responderRuleName",
        "responderActivityType",
        "responderExecutionStatus",
        "timeCreated",
        "message"
    })
    public ResponderActivitySummary(
            String id,
            String problemId,
            String responderRuleId,
            ResponderType responderType,
            String responderRuleName,
            ResponderActivityType responderActivityType,
            ResponderExecutionStates responderExecutionStatus,
            java.util.Date timeCreated,
            String message) {
        super();
        this.id = id;
        this.problemId = problemId;
        this.responderRuleId = responderRuleId;
        this.responderType = responderType;
        this.responderRuleName = responderRuleName;
        this.responderActivityType = responderActivityType;
        this.responderExecutionStatus = responderExecutionStatus;
        this.timeCreated = timeCreated;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique id for Responder activity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique id for Responder activity.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * problemId for which Responder activity is associated to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * problemId for which Responder activity is associated to.
         * @param problemId the value to set
         * @return this builder
         **/
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /**
         * Id of the responder rule for the problem
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
        private String responderRuleId;

        /**
         * Id of the responder rule for the problem
         * @param responderRuleId the value to set
         * @return this builder
         **/
        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            this.__explicitlySet__.add("responderRuleId");
            return this;
        }
        /**
         * responder rule type for performing the operation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responderType")
        private ResponderType responderType;

        /**
         * responder rule type for performing the operation
         * @param responderType the value to set
         * @return this builder
         **/
        public Builder responderType(ResponderType responderType) {
            this.responderType = responderType;
            this.__explicitlySet__.add("responderType");
            return this;
        }
        /**
         * responder rule name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
        private String responderRuleName;

        /**
         * responder rule name
         * @param responderRuleName the value to set
         * @return this builder
         **/
        public Builder responderRuleName(String responderRuleName) {
            this.responderRuleName = responderRuleName;
            this.__explicitlySet__.add("responderRuleName");
            return this;
        }
        /**
         * Responder activity types
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responderActivityType")
        private ResponderActivityType responderActivityType;

        /**
         * Responder activity types
         * @param responderActivityType the value to set
         * @return this builder
         **/
        public Builder responderActivityType(ResponderActivityType responderActivityType) {
            this.responderActivityType = responderActivityType;
            this.__explicitlySet__.add("responderActivityType");
            return this;
        }
        /**
         * the responder execution status
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
        private ResponderExecutionStates responderExecutionStatus;

        /**
         * the responder execution status
         * @param responderExecutionStatus the value to set
         * @return this builder
         **/
        public Builder responderExecutionStatus(ResponderExecutionStates responderExecutionStatus) {
            this.responderExecutionStatus = responderExecutionStatus;
            this.__explicitlySet__.add("responderExecutionStatus");
            return this;
        }
        /**
         * responder activity starting time
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * responder activity starting time
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * additional message related to this operation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * additional message related to this operation
         * @param message the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique id for Responder activity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique id for Responder activity.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * problemId for which Responder activity is associated to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * problemId for which Responder activity is associated to.
     * @return the value
     **/
    public String getProblemId() {
        return problemId;
    }

    /**
     * Id of the responder rule for the problem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    private final String responderRuleId;

    /**
     * Id of the responder rule for the problem
     * @return the value
     **/
    public String getResponderRuleId() {
        return responderRuleId;
    }

    /**
     * responder rule type for performing the operation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderType")
    private final ResponderType responderType;

    /**
     * responder rule type for performing the operation
     * @return the value
     **/
    public ResponderType getResponderType() {
        return responderType;
    }

    /**
     * responder rule name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
    private final String responderRuleName;

    /**
     * responder rule name
     * @return the value
     **/
    public String getResponderRuleName() {
        return responderRuleName;
    }

    /**
     * Responder activity types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderActivityType")
    private final ResponderActivityType responderActivityType;

    /**
     * Responder activity types
     * @return the value
     **/
    public ResponderActivityType getResponderActivityType() {
        return responderActivityType;
    }

    /**
     * the responder execution status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
    private final ResponderExecutionStates responderExecutionStatus;

    /**
     * the responder execution status
     * @return the value
     **/
    public ResponderExecutionStates getResponderExecutionStatus() {
        return responderExecutionStatus;
    }

    /**
     * responder activity starting time
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * responder activity starting time
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * additional message related to this operation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * additional message related to this operation
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ResponderActivitySummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", problemId=").append(String.valueOf(this.problemId));
        sb.append(", responderRuleId=").append(String.valueOf(this.responderRuleId));
        sb.append(", responderType=").append(String.valueOf(this.responderType));
        sb.append(", responderRuleName=").append(String.valueOf(this.responderRuleName));
        sb.append(", responderActivityType=").append(String.valueOf(this.responderActivityType));
        sb.append(", responderExecutionStatus=")
                .append(String.valueOf(this.responderExecutionStatus));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponderActivitySummary)) {
            return false;
        }

        ResponderActivitySummary other = (ResponderActivitySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.problemId, other.problemId)
                && java.util.Objects.equals(this.responderRuleId, other.responderRuleId)
                && java.util.Objects.equals(this.responderType, other.responderType)
                && java.util.Objects.equals(this.responderRuleName, other.responderRuleName)
                && java.util.Objects.equals(this.responderActivityType, other.responderActivityType)
                && java.util.Objects.equals(
                        this.responderExecutionStatus, other.responderExecutionStatus)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.problemId == null ? 43 : this.problemId.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRuleId == null ? 43 : this.responderRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.responderType == null ? 43 : this.responderType.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRuleName == null ? 43 : this.responderRuleName.hashCode());
        result =
                (result * PRIME)
                        + (this.responderActivityType == null
                                ? 43
                                : this.responderActivityType.hashCode());
        result =
                (result * PRIME)
                        + (this.responderExecutionStatus == null
                                ? 43
                                : this.responderExecutionStatus.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
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
