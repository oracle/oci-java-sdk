/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details about stage execution for each target environment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeployStageExecutionProgressDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeployStageExecutionProgressDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetId", "targetGroup", "steps", "rollbackSteps"})
    public DeployStageExecutionProgressDetails(
            String targetId,
            String targetGroup,
            java.util.List<DeployStageExecutionStep> steps,
            java.util.List<DeployStageExecutionStep> rollbackSteps) {
        super();
        this.targetId = targetId;
        this.targetGroup = targetGroup;
        this.steps = steps;
        this.rollbackSteps = rollbackSteps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The function ID, instance ID or the cluster ID. For Wait stage it will be the stage ID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The function ID, instance ID or the cluster ID. For Wait stage it will be the stage ID.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Group for the target environment for example, the batch number for an Instance Group
         * deployment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetGroup")
        private String targetGroup;

        /**
         * Group for the target environment for example, the batch number for an Instance Group
         * deployment.
         *
         * @param targetGroup the value to set
         * @return this builder
         */
        public Builder targetGroup(String targetGroup) {
            this.targetGroup = targetGroup;
            this.__explicitlySet__.add("targetGroup");
            return this;
        }
        /** Details about all the steps for one target environment. */
        @com.fasterxml.jackson.annotation.JsonProperty("steps")
        private java.util.List<DeployStageExecutionStep> steps;

        /**
         * Details about all the steps for one target environment.
         *
         * @param steps the value to set
         * @return this builder
         */
        public Builder steps(java.util.List<DeployStageExecutionStep> steps) {
            this.steps = steps;
            this.__explicitlySet__.add("steps");
            return this;
        }
        /** Details about all the rollback steps for one target environment. */
        @com.fasterxml.jackson.annotation.JsonProperty("rollbackSteps")
        private java.util.List<DeployStageExecutionStep> rollbackSteps;

        /**
         * Details about all the rollback steps for one target environment.
         *
         * @param rollbackSteps the value to set
         * @return this builder
         */
        public Builder rollbackSteps(java.util.List<DeployStageExecutionStep> rollbackSteps) {
            this.rollbackSteps = rollbackSteps;
            this.__explicitlySet__.add("rollbackSteps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeployStageExecutionProgressDetails build() {
            DeployStageExecutionProgressDetails model =
                    new DeployStageExecutionProgressDetails(
                            this.targetId, this.targetGroup, this.steps, this.rollbackSteps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeployStageExecutionProgressDetails model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetGroup")) {
                this.targetGroup(model.getTargetGroup());
            }
            if (model.wasPropertyExplicitlySet("steps")) {
                this.steps(model.getSteps());
            }
            if (model.wasPropertyExplicitlySet("rollbackSteps")) {
                this.rollbackSteps(model.getRollbackSteps());
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

    /** The function ID, instance ID or the cluster ID. For Wait stage it will be the stage ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The function ID, instance ID or the cluster ID. For Wait stage it will be the stage ID.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * Group for the target environment for example, the batch number for an Instance Group
     * deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetGroup")
    private final String targetGroup;

    /**
     * Group for the target environment for example, the batch number for an Instance Group
     * deployment.
     *
     * @return the value
     */
    public String getTargetGroup() {
        return targetGroup;
    }

    /** Details about all the steps for one target environment. */
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    private final java.util.List<DeployStageExecutionStep> steps;

    /**
     * Details about all the steps for one target environment.
     *
     * @return the value
     */
    public java.util.List<DeployStageExecutionStep> getSteps() {
        return steps;
    }

    /** Details about all the rollback steps for one target environment. */
    @com.fasterxml.jackson.annotation.JsonProperty("rollbackSteps")
    private final java.util.List<DeployStageExecutionStep> rollbackSteps;

    /**
     * Details about all the rollback steps for one target environment.
     *
     * @return the value
     */
    public java.util.List<DeployStageExecutionStep> getRollbackSteps() {
        return rollbackSteps;
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
        sb.append("DeployStageExecutionProgressDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetGroup=").append(String.valueOf(this.targetGroup));
        sb.append(", steps=").append(String.valueOf(this.steps));
        sb.append(", rollbackSteps=").append(String.valueOf(this.rollbackSteps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeployStageExecutionProgressDetails)) {
            return false;
        }

        DeployStageExecutionProgressDetails other = (DeployStageExecutionProgressDetails) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetGroup, other.targetGroup)
                && java.util.Objects.equals(this.steps, other.steps)
                && java.util.Objects.equals(this.rollbackSteps, other.rollbackSteps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetGroup == null ? 43 : this.targetGroup.hashCode());
        result = (result * PRIME) + (this.steps == null ? 43 : this.steps.hashCode());
        result =
                (result * PRIME)
                        + (this.rollbackSteps == null ? 43 : this.rollbackSteps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
