/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Instance Group Blue-Green deployment load balancer traffic shift stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployStageType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress
        extends DeployStageExecutionProgress {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("deployStageDisplayName")
        private String deployStageDisplayName;

        public Builder deployStageDisplayName(String deployStageDisplayName) {
            this.deployStageDisplayName = deployStageDisplayName;
            this.__explicitlySet__.add("deployStageDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStageId")
        private String deployStageId;

        public Builder deployStageId(String deployStageId) {
            this.deployStageId = deployStageId;
            this.__explicitlySet__.add("deployStageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStagePredecessors")
        private DeployStagePredecessorCollection deployStagePredecessors;

        public Builder deployStagePredecessors(
                DeployStagePredecessorCollection deployStagePredecessors) {
            this.deployStagePredecessors = deployStagePredecessors;
            this.__explicitlySet__.add("deployStagePredecessors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deployStageExecutionProgressDetails")
        private java.util.List<DeployStageExecutionProgressDetails>
                deployStageExecutionProgressDetails;

        public Builder deployStageExecutionProgressDetails(
                java.util.List<DeployStageExecutionProgressDetails>
                        deployStageExecutionProgressDetails) {
            this.deployStageExecutionProgressDetails = deployStageExecutionProgressDetails;
            this.__explicitlySet__.add("deployStageExecutionProgressDetails");
            return this;
        }
        /**
         * The OCID of the environment where traffic is going.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("environmentId")
        private String environmentId;

        /**
         * The OCID of the environment where traffic is going.
         * @param environmentId the value to set
         * @return this builder
         **/
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            this.__explicitlySet__.add("environmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress build() {
            ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress model =
                    new ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress(
                            this.deployStageDisplayName,
                            this.deployStageId,
                            this.timeStarted,
                            this.timeFinished,
                            this.status,
                            this.deployStagePredecessors,
                            this.deployStageExecutionProgressDetails,
                            this.environmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress model) {
            if (model.wasPropertyExplicitlySet("deployStageDisplayName")) {
                this.deployStageDisplayName(model.getDeployStageDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deployStageId")) {
                this.deployStageId(model.getDeployStageId());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("deployStagePredecessors")) {
                this.deployStagePredecessors(model.getDeployStagePredecessors());
            }
            if (model.wasPropertyExplicitlySet("deployStageExecutionProgressDetails")) {
                this.deployStageExecutionProgressDetails(
                        model.getDeployStageExecutionProgressDetails());
            }
            if (model.wasPropertyExplicitlySet("environmentId")) {
                this.environmentId(model.getEnvironmentId());
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
    public ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress(
            String deployStageDisplayName,
            String deployStageId,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Status status,
            DeployStagePredecessorCollection deployStagePredecessors,
            java.util.List<DeployStageExecutionProgressDetails> deployStageExecutionProgressDetails,
            String environmentId) {
        super(
                deployStageDisplayName,
                deployStageId,
                timeStarted,
                timeFinished,
                status,
                deployStagePredecessors,
                deployStageExecutionProgressDetails);
        this.environmentId = environmentId;
    }

    /**
     * The OCID of the environment where traffic is going.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("environmentId")
    private final String environmentId;

    /**
     * The OCID of the environment where traffic is going.
     * @return the value
     **/
    public String getEnvironmentId() {
        return environmentId;
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
        sb.append("ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", environmentId=").append(String.valueOf(this.environmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress)) {
            return false;
        }

        ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress other =
                (ComputeInstanceGroupBlueGreenTrafficShiftDeployStageExecutionProgress) o;
        return java.util.Objects.equals(this.environmentId, other.environmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.environmentId == null ? 43 : this.environmentId.hashCode());
        return result;
    }
}
