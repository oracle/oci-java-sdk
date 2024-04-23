/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Responder activity summary definition. <br>
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
        builder = ResponderActivitySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResponderActivitySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Unique ID for responder activity */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique ID for responder activity
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Unique ID of problem associated with responder activity */
        @com.fasterxml.jackson.annotation.JsonProperty("problemId")
        private String problemId;

        /**
         * Unique ID of problem associated with responder activity
         *
         * @param problemId the value to set
         * @return this builder
         */
        public Builder problemId(String problemId) {
            this.problemId = problemId;
            this.__explicitlySet__.add("problemId");
            return this;
        }
        /** Unique ID of the responder rule associated with the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
        private String responderRuleId;

        /**
         * Unique ID of the responder rule associated with the problem
         *
         * @param responderRuleId the value to set
         * @return this builder
         */
        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            this.__explicitlySet__.add("responderRuleId");
            return this;
        }
        /** Responder rule type for performing the operation */
        @com.fasterxml.jackson.annotation.JsonProperty("responderType")
        private ResponderType responderType;

        /**
         * Responder rule type for performing the operation
         *
         * @param responderType the value to set
         * @return this builder
         */
        public Builder responderType(ResponderType responderType) {
            this.responderType = responderType;
            this.__explicitlySet__.add("responderType");
            return this;
        }
        /** Responder rule name */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
        private String responderRuleName;

        /**
         * Responder rule name
         *
         * @param responderRuleName the value to set
         * @return this builder
         */
        public Builder responderRuleName(String responderRuleName) {
            this.responderRuleName = responderRuleName;
            this.__explicitlySet__.add("responderRuleName");
            return this;
        }
        /** Responder activity type */
        @com.fasterxml.jackson.annotation.JsonProperty("responderActivityType")
        private ResponderActivityType responderActivityType;

        /**
         * Responder activity type
         *
         * @param responderActivityType the value to set
         * @return this builder
         */
        public Builder responderActivityType(ResponderActivityType responderActivityType) {
            this.responderActivityType = responderActivityType;
            this.__explicitlySet__.add("responderActivityType");
            return this;
        }
        /** Responder execution status */
        @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
        private ResponderExecutionStates responderExecutionStatus;

        /**
         * Responder execution status
         *
         * @param responderExecutionStatus the value to set
         * @return this builder
         */
        public Builder responderExecutionStatus(ResponderExecutionStates responderExecutionStatus) {
            this.responderExecutionStatus = responderExecutionStatus;
            this.__explicitlySet__.add("responderExecutionStatus");
            return this;
        }
        /** Responder activity starting time */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Responder activity starting time
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Additional message related to this operation */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Additional message related to this operation
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResponderActivitySummary build() {
            ResponderActivitySummary model =
                    new ResponderActivitySummary(
                            this.id,
                            this.problemId,
                            this.responderRuleId,
                            this.responderType,
                            this.responderRuleName,
                            this.responderActivityType,
                            this.responderExecutionStatus,
                            this.timeCreated,
                            this.message);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponderActivitySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("problemId")) {
                this.problemId(model.getProblemId());
            }
            if (model.wasPropertyExplicitlySet("responderRuleId")) {
                this.responderRuleId(model.getResponderRuleId());
            }
            if (model.wasPropertyExplicitlySet("responderType")) {
                this.responderType(model.getResponderType());
            }
            if (model.wasPropertyExplicitlySet("responderRuleName")) {
                this.responderRuleName(model.getResponderRuleName());
            }
            if (model.wasPropertyExplicitlySet("responderActivityType")) {
                this.responderActivityType(model.getResponderActivityType());
            }
            if (model.wasPropertyExplicitlySet("responderExecutionStatus")) {
                this.responderExecutionStatus(model.getResponderExecutionStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
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

    /** Unique ID for responder activity */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique ID for responder activity
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Unique ID of problem associated with responder activity */
    @com.fasterxml.jackson.annotation.JsonProperty("problemId")
    private final String problemId;

    /**
     * Unique ID of problem associated with responder activity
     *
     * @return the value
     */
    public String getProblemId() {
        return problemId;
    }

    /** Unique ID of the responder rule associated with the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    private final String responderRuleId;

    /**
     * Unique ID of the responder rule associated with the problem
     *
     * @return the value
     */
    public String getResponderRuleId() {
        return responderRuleId;
    }

    /** Responder rule type for performing the operation */
    @com.fasterxml.jackson.annotation.JsonProperty("responderType")
    private final ResponderType responderType;

    /**
     * Responder rule type for performing the operation
     *
     * @return the value
     */
    public ResponderType getResponderType() {
        return responderType;
    }

    /** Responder rule name */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleName")
    private final String responderRuleName;

    /**
     * Responder rule name
     *
     * @return the value
     */
    public String getResponderRuleName() {
        return responderRuleName;
    }

    /** Responder activity type */
    @com.fasterxml.jackson.annotation.JsonProperty("responderActivityType")
    private final ResponderActivityType responderActivityType;

    /**
     * Responder activity type
     *
     * @return the value
     */
    public ResponderActivityType getResponderActivityType() {
        return responderActivityType;
    }

    /** Responder execution status */
    @com.fasterxml.jackson.annotation.JsonProperty("responderExecutionStatus")
    private final ResponderExecutionStates responderExecutionStatus;

    /**
     * Responder execution status
     *
     * @return the value
     */
    public ResponderExecutionStates getResponderExecutionStatus() {
        return responderExecutionStatus;
    }

    /** Responder activity starting time */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Responder activity starting time
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Additional message related to this operation */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Additional message related to this operation
     *
     * @return the value
     */
    public String getMessage() {
        return message;
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
        sb.append("ResponderActivitySummary(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
