/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * Execution details for a compute task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputeTaskExecutionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputeTaskExecutionDetails extends BatchTaskExecutionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique identifier for the task execution. Created as "taskId:taskVersion:runNumber".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionId")
        private String executionId;

        /**
         * A unique identifier for the task execution. Created as "taskId:taskVersion:runNumber".
         * @param executionId the value to set
         * @return this builder
         **/
        public Builder executionId(String executionId) {
            this.executionId = executionId;
            this.__explicitlySet__.add("executionId");
            return this;
        }
        /**
         * The date and time when the lifecycleState was changed to Waiting, and it is waiting for its dependencies to run, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTransitionedToWaitingDependencies")
        private java.util.Date timeTransitionedToWaitingDependencies;

        /**
         * The date and time when the lifecycleState was changed to Waiting, and it is waiting for its dependencies to run, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         * @param timeTransitionedToWaitingDependencies the value to set
         * @return this builder
         **/
        public Builder timeTransitionedToWaitingDependencies(
                java.util.Date timeTransitionedToWaitingDependencies) {
            this.timeTransitionedToWaitingDependencies = timeTransitionedToWaitingDependencies;
            this.__explicitlySet__.add("timeTransitionedToWaitingDependencies");
            return this;
        }
        /**
         * The date and time when the lifecycleState was changed to Waiting, and it is queued to be executed, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeTransitionedToWaitingQueued")
        private java.util.Date timeTransitionedToWaitingQueued;

        /**
         * The date and time when the lifecycleState was changed to Waiting, and it is queued to be executed, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         * @param timeTransitionedToWaitingQueued the value to set
         * @return this builder
         **/
        public Builder timeTransitionedToWaitingQueued(
                java.util.Date timeTransitionedToWaitingQueued) {
            this.timeTransitionedToWaitingQueued = timeTransitionedToWaitingQueued;
            this.__explicitlySet__.add("timeTransitionedToWaitingQueued");
            return this;
        }
        /**
         * The date and time when the lifecycleState was changed to In_Progress, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time when the lifecycleState was changed to In_Progress, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time when the lifecycleState changed to Succeeded, or Failed, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * The date and time when the lifecycleState changed to Succeeded, or Failed, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         * @param timeCompleted the value to set
         * @return this builder
         **/
        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fleetShape")
        private FleetShapeExecutionDetails fleetShape;

        public Builder fleetShape(FleetShapeExecutionDetails fleetShape) {
            this.fleetShape = fleetShape;
            this.__explicitlySet__.add("fleetShape");
            return this;
        }
        /**
         * The terminal lifecycle state of the task for this execution. Valid values are: SUCCEEDED, NEEDS_ATTENTION, CANCELED, or FAILED.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("completionLifecycleState")
        private BatchTask.LifecycleState completionLifecycleState;

        /**
         * The terminal lifecycle state of the task for this execution. Valid values are: SUCCEEDED, NEEDS_ATTENTION, CANCELED, or FAILED.
         * @param completionLifecycleState the value to set
         * @return this builder
         **/
        public Builder completionLifecycleState(BatchTask.LifecycleState completionLifecycleState) {
            this.completionLifecycleState = completionLifecycleState;
            this.__explicitlySet__.add("completionLifecycleState");
            return this;
        }
        /**
         * List of error messages related to this task execution. Be aware that the maximum number of items returned may change in the future.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<String> errors;

        /**
         * List of error messages related to this task execution. Be aware that the maximum number of items returned may change in the future.
         * @param errors the value to set
         * @return this builder
         **/
        public Builder errors(java.util.List<String> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeTaskExecutionDetails build() {
            ComputeTaskExecutionDetails model =
                    new ComputeTaskExecutionDetails(
                            this.executionId,
                            this.timeTransitionedToWaitingDependencies,
                            this.timeTransitionedToWaitingQueued,
                            this.timeStarted,
                            this.timeCompleted,
                            this.fleetShape,
                            this.completionLifecycleState,
                            this.errors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeTaskExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("executionId")) {
                this.executionId(model.getExecutionId());
            }
            if (model.wasPropertyExplicitlySet("timeTransitionedToWaitingDependencies")) {
                this.timeTransitionedToWaitingDependencies(
                        model.getTimeTransitionedToWaitingDependencies());
            }
            if (model.wasPropertyExplicitlySet("timeTransitionedToWaitingQueued")) {
                this.timeTransitionedToWaitingQueued(model.getTimeTransitionedToWaitingQueued());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
            }
            if (model.wasPropertyExplicitlySet("fleetShape")) {
                this.fleetShape(model.getFleetShape());
            }
            if (model.wasPropertyExplicitlySet("completionLifecycleState")) {
                this.completionLifecycleState(model.getCompletionLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("errors")) {
                this.errors(model.getErrors());
            }
            return this;
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

    @Deprecated
    public ComputeTaskExecutionDetails(
            String executionId,
            java.util.Date timeTransitionedToWaitingDependencies,
            java.util.Date timeTransitionedToWaitingQueued,
            java.util.Date timeStarted,
            java.util.Date timeCompleted,
            FleetShapeExecutionDetails fleetShape,
            BatchTask.LifecycleState completionLifecycleState,
            java.util.List<String> errors) {
        super();
        this.executionId = executionId;
        this.timeTransitionedToWaitingDependencies = timeTransitionedToWaitingDependencies;
        this.timeTransitionedToWaitingQueued = timeTransitionedToWaitingQueued;
        this.timeStarted = timeStarted;
        this.timeCompleted = timeCompleted;
        this.fleetShape = fleetShape;
        this.completionLifecycleState = completionLifecycleState;
        this.errors = errors;
    }

    /**
     * A unique identifier for the task execution. Created as "taskId:taskVersion:runNumber".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionId")
    private final String executionId;

    /**
     * A unique identifier for the task execution. Created as "taskId:taskVersion:runNumber".
     * @return the value
     **/
    public String getExecutionId() {
        return executionId;
    }

    /**
     * The date and time when the lifecycleState was changed to Waiting, and it is waiting for its dependencies to run, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTransitionedToWaitingDependencies")
    private final java.util.Date timeTransitionedToWaitingDependencies;

    /**
     * The date and time when the lifecycleState was changed to Waiting, and it is waiting for its dependencies to run, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     * @return the value
     **/
    public java.util.Date getTimeTransitionedToWaitingDependencies() {
        return timeTransitionedToWaitingDependencies;
    }

    /**
     * The date and time when the lifecycleState was changed to Waiting, and it is queued to be executed, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeTransitionedToWaitingQueued")
    private final java.util.Date timeTransitionedToWaitingQueued;

    /**
     * The date and time when the lifecycleState was changed to Waiting, and it is queued to be executed, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     * @return the value
     **/
    public java.util.Date getTimeTransitionedToWaitingQueued() {
        return timeTransitionedToWaitingQueued;
    }

    /**
     * The date and time when the lifecycleState was changed to In_Progress, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time when the lifecycleState was changed to In_Progress, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time when the lifecycleState changed to Succeeded, or Failed, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * The date and time when the lifecycleState changed to Succeeded, or Failed, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     * @return the value
     **/
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fleetShape")
    private final FleetShapeExecutionDetails fleetShape;

    public FleetShapeExecutionDetails getFleetShape() {
        return fleetShape;
    }

    /**
     * The terminal lifecycle state of the task for this execution. Valid values are: SUCCEEDED, NEEDS_ATTENTION, CANCELED, or FAILED.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("completionLifecycleState")
    private final BatchTask.LifecycleState completionLifecycleState;

    /**
     * The terminal lifecycle state of the task for this execution. Valid values are: SUCCEEDED, NEEDS_ATTENTION, CANCELED, or FAILED.
     * @return the value
     **/
    public BatchTask.LifecycleState getCompletionLifecycleState() {
        return completionLifecycleState;
    }

    /**
     * List of error messages related to this task execution. Be aware that the maximum number of items returned may change in the future.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<String> errors;

    /**
     * List of error messages related to this task execution. Be aware that the maximum number of items returned may change in the future.
     * @return the value
     **/
    public java.util.List<String> getErrors() {
        return errors;
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
        sb.append("ComputeTaskExecutionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", executionId=").append(String.valueOf(this.executionId));
        sb.append(", timeTransitionedToWaitingDependencies=")
                .append(String.valueOf(this.timeTransitionedToWaitingDependencies));
        sb.append(", timeTransitionedToWaitingQueued=")
                .append(String.valueOf(this.timeTransitionedToWaitingQueued));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(", fleetShape=").append(String.valueOf(this.fleetShape));
        sb.append(", completionLifecycleState=")
                .append(String.valueOf(this.completionLifecycleState));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeTaskExecutionDetails)) {
            return false;
        }

        ComputeTaskExecutionDetails other = (ComputeTaskExecutionDetails) o;
        return java.util.Objects.equals(this.executionId, other.executionId)
                && java.util.Objects.equals(
                        this.timeTransitionedToWaitingDependencies,
                        other.timeTransitionedToWaitingDependencies)
                && java.util.Objects.equals(
                        this.timeTransitionedToWaitingQueued, other.timeTransitionedToWaitingQueued)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && java.util.Objects.equals(this.fleetShape, other.fleetShape)
                && java.util.Objects.equals(
                        this.completionLifecycleState, other.completionLifecycleState)
                && java.util.Objects.equals(this.errors, other.errors)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.executionId == null ? 43 : this.executionId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTransitionedToWaitingDependencies == null
                                ? 43
                                : this.timeTransitionedToWaitingDependencies.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTransitionedToWaitingQueued == null
                                ? 43
                                : this.timeTransitionedToWaitingQueued.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + (this.fleetShape == null ? 43 : this.fleetShape.hashCode());
        result =
                (result * PRIME)
                        + (this.completionLifecycleState == null
                                ? 43
                                : this.completionLifecycleState.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        return result;
    }
}
