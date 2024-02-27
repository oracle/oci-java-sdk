/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Summary of assignment Validation status. <br>
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
        builder = AssignmentValidationStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssignmentValidationStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "executionId",
        "userId",
        "accessRequestId",
        "errorMessage",
        "executionStatus",
        "statusDetail",
        "timeOfValidationStart",
        "timeOfValidationFinish"
    })
    public AssignmentValidationStatus(
            String executionId,
            String userId,
            String accessRequestId,
            String errorMessage,
            AssignmentValidationLifecycleStates executionStatus,
            java.util.List<StatusDetail> statusDetail,
            java.util.Date timeOfValidationStart,
            java.util.Date timeOfValidationFinish) {
        super();
        this.executionId = executionId;
        this.userId = userId;
        this.accessRequestId = accessRequestId;
        this.errorMessage = errorMessage;
        this.executionStatus = executionStatus;
        this.statusDetail = statusDetail;
        this.timeOfValidationStart = timeOfValidationStart;
        this.timeOfValidationFinish = timeOfValidationFinish;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Id of the unique execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionId")
        private String executionId;

        /**
         * Id of the unique execution.
         *
         * @param executionId the value to set
         * @return this builder
         */
        public Builder executionId(String executionId) {
            this.executionId = executionId;
            this.__explicitlySet__.add("executionId");
            return this;
        }
        /** Id of the user who triggered the Assignment Validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * Id of the user who triggered the Assignment Validation.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /** Id of the accessRequest which got created as part of Assignment Validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessRequestId")
        private String accessRequestId;

        /**
         * Id of the accessRequest which got created as part of Assignment Validation.
         *
         * @param accessRequestId the value to set
         * @return this builder
         */
        public Builder accessRequestId(String accessRequestId) {
            this.accessRequestId = accessRequestId;
            this.__explicitlySet__.add("accessRequestId");
            return this;
        }
        /** any errorMessage during validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * any errorMessage during validation.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /** Status of the execution Success or Failure. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionStatus")
        private AssignmentValidationLifecycleStates executionStatus;

        /**
         * Status of the execution Success or Failure.
         *
         * @param executionStatus the value to set
         * @return this builder
         */
        public Builder executionStatus(AssignmentValidationLifecycleStates executionStatus) {
            this.executionStatus = executionStatus;
            this.__explicitlySet__.add("executionStatus");
            return this;
        }
        /** List of execution detail for the validate assignment. */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetail")
        private java.util.List<StatusDetail> statusDetail;

        /**
         * List of execution detail for the validate assignment.
         *
         * @param statusDetail the value to set
         * @return this builder
         */
        public Builder statusDetail(java.util.List<StatusDetail> statusDetail) {
            this.statusDetail = statusDetail;
            this.__explicitlySet__.add("statusDetail");
            return this;
        }
        /**
         * Time when the respective action happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidationStart")
        private java.util.Date timeOfValidationStart;

        /**
         * Time when the respective action happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'.
         *
         * @param timeOfValidationStart the value to set
         * @return this builder
         */
        public Builder timeOfValidationStart(java.util.Date timeOfValidationStart) {
            this.timeOfValidationStart = timeOfValidationStart;
            this.__explicitlySet__.add("timeOfValidationStart");
            return this;
        }
        /**
         * Time when the respective action happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidationFinish")
        private java.util.Date timeOfValidationFinish;

        /**
         * Time when the respective action happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'.
         *
         * @param timeOfValidationFinish the value to set
         * @return this builder
         */
        public Builder timeOfValidationFinish(java.util.Date timeOfValidationFinish) {
            this.timeOfValidationFinish = timeOfValidationFinish;
            this.__explicitlySet__.add("timeOfValidationFinish");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssignmentValidationStatus build() {
            AssignmentValidationStatus model =
                    new AssignmentValidationStatus(
                            this.executionId,
                            this.userId,
                            this.accessRequestId,
                            this.errorMessage,
                            this.executionStatus,
                            this.statusDetail,
                            this.timeOfValidationStart,
                            this.timeOfValidationFinish);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssignmentValidationStatus model) {
            if (model.wasPropertyExplicitlySet("executionId")) {
                this.executionId(model.getExecutionId());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("accessRequestId")) {
                this.accessRequestId(model.getAccessRequestId());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("executionStatus")) {
                this.executionStatus(model.getExecutionStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDetail")) {
                this.statusDetail(model.getStatusDetail());
            }
            if (model.wasPropertyExplicitlySet("timeOfValidationStart")) {
                this.timeOfValidationStart(model.getTimeOfValidationStart());
            }
            if (model.wasPropertyExplicitlySet("timeOfValidationFinish")) {
                this.timeOfValidationFinish(model.getTimeOfValidationFinish());
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

    /** Id of the unique execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionId")
    private final String executionId;

    /**
     * Id of the unique execution.
     *
     * @return the value
     */
    public String getExecutionId() {
        return executionId;
    }

    /** Id of the user who triggered the Assignment Validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * Id of the user who triggered the Assignment Validation.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /** Id of the accessRequest which got created as part of Assignment Validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessRequestId")
    private final String accessRequestId;

    /**
     * Id of the accessRequest which got created as part of Assignment Validation.
     *
     * @return the value
     */
    public String getAccessRequestId() {
        return accessRequestId;
    }

    /** any errorMessage during validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * any errorMessage during validation.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /** Status of the execution Success or Failure. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionStatus")
    private final AssignmentValidationLifecycleStates executionStatus;

    /**
     * Status of the execution Success or Failure.
     *
     * @return the value
     */
    public AssignmentValidationLifecycleStates getExecutionStatus() {
        return executionStatus;
    }

    /** List of execution detail for the validate assignment. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetail")
    private final java.util.List<StatusDetail> statusDetail;

    /**
     * List of execution detail for the validate assignment.
     *
     * @return the value
     */
    public java.util.List<StatusDetail> getStatusDetail() {
        return statusDetail;
    }

    /**
     * Time when the respective action happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidationStart")
    private final java.util.Date timeOfValidationStart;

    /**
     * Time when the respective action happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeOfValidationStart() {
        return timeOfValidationStart;
    }

    /**
     * Time when the respective action happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfValidationFinish")
    private final java.util.Date timeOfValidationFinish;

    /**
     * Time when the respective action happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeOfValidationFinish() {
        return timeOfValidationFinish;
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
        sb.append("AssignmentValidationStatus(");
        sb.append("super=").append(super.toString());
        sb.append("executionId=").append(String.valueOf(this.executionId));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", accessRequestId=").append(String.valueOf(this.accessRequestId));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", executionStatus=").append(String.valueOf(this.executionStatus));
        sb.append(", statusDetail=").append(String.valueOf(this.statusDetail));
        sb.append(", timeOfValidationStart=").append(String.valueOf(this.timeOfValidationStart));
        sb.append(", timeOfValidationFinish=").append(String.valueOf(this.timeOfValidationFinish));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssignmentValidationStatus)) {
            return false;
        }

        AssignmentValidationStatus other = (AssignmentValidationStatus) o;
        return java.util.Objects.equals(this.executionId, other.executionId)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.accessRequestId, other.accessRequestId)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.executionStatus, other.executionStatus)
                && java.util.Objects.equals(this.statusDetail, other.statusDetail)
                && java.util.Objects.equals(this.timeOfValidationStart, other.timeOfValidationStart)
                && java.util.Objects.equals(
                        this.timeOfValidationFinish, other.timeOfValidationFinish)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.executionId == null ? 43 : this.executionId.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.accessRequestId == null ? 43 : this.accessRequestId.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.executionStatus == null ? 43 : this.executionStatus.hashCode());
        result = (result * PRIME) + (this.statusDetail == null ? 43 : this.statusDetail.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfValidationStart == null
                                ? 43
                                : this.timeOfValidationStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfValidationFinish == null
                                ? 43
                                : this.timeOfValidationFinish.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
