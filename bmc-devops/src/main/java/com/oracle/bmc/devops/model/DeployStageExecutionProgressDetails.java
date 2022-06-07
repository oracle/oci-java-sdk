/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details about stage execution for each target environment.
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
    builder = DeployStageExecutionProgressDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeployStageExecutionProgressDetails {
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
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetGroup")
        private String targetGroup;

        public Builder targetGroup(String targetGroup) {
            this.targetGroup = targetGroup;
            this.__explicitlySet__.add("targetGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("steps")
        private java.util.List<DeployStageExecutionStep> steps;

        public Builder steps(java.util.List<DeployStageExecutionStep> steps) {
            this.steps = steps;
            this.__explicitlySet__.add("steps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rollbackSteps")
        private java.util.List<DeployStageExecutionStep> rollbackSteps;

        public Builder rollbackSteps(java.util.List<DeployStageExecutionStep> rollbackSteps) {
            this.rollbackSteps = rollbackSteps;
            this.__explicitlySet__.add("rollbackSteps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeployStageExecutionProgressDetails build() {
            DeployStageExecutionProgressDetails __instance__ =
                    new DeployStageExecutionProgressDetails(
                            targetId, targetGroup, steps, rollbackSteps);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeployStageExecutionProgressDetails o) {
            Builder copiedBuilder =
                    targetId(o.getTargetId())
                            .targetGroup(o.getTargetGroup())
                            .steps(o.getSteps())
                            .rollbackSteps(o.getRollbackSteps());

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
     * The function ID, instance ID or the cluster ID. For Wait stage it will be the stage ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    public String getTargetId() {
        return targetId;
    }

    /**
     * Group for the target environment for example, the batch number for an Instance Group deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetGroup")
    private final String targetGroup;

    public String getTargetGroup() {
        return targetGroup;
    }

    /**
     * Details about all the steps for one target environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    private final java.util.List<DeployStageExecutionStep> steps;

    public java.util.List<DeployStageExecutionStep> getSteps() {
        return steps;
    }

    /**
     * Details about all the rollback steps for one target environment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rollbackSteps")
    private final java.util.List<DeployStageExecutionStep> rollbackSteps;

    public java.util.List<DeployStageExecutionStep> getRollbackSteps() {
        return rollbackSteps;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DeployStageExecutionProgressDetails(");
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetGroup=").append(String.valueOf(this.targetGroup));
        sb.append(", steps=").append(String.valueOf(this.steps));
        sb.append(", rollbackSteps=").append(String.valueOf(this.rollbackSteps));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
