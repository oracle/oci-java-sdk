/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for ignoring a failed group or step. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IgnoreDrPlanExecutionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IgnoreDrPlanExecutionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"groupId", "stepId"})
    public IgnoreDrPlanExecutionDetails(String groupId, String stepId) {
        super();
        this.groupId = groupId;
        this.stepId = stepId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique id of the group to ignore as a whole, or the group containing the step to
         * ignore.
         *
         * <p>Example: {@code sgid1.group..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        /**
         * The unique id of the group to ignore as a whole, or the group containing the step to
         * ignore.
         *
         * <p>Example: {@code sgid1.group..uniqueID}
         *
         * @param groupId the value to set
         * @return this builder
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            this.__explicitlySet__.add("groupId");
            return this;
        }
        /**
         * The unique id of the step to ignore (optional). Only needed when ignoring a step.
         *
         * <p>Example: {@code sgid1.step..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stepId")
        private String stepId;

        /**
         * The unique id of the step to ignore (optional). Only needed when ignoring a step.
         *
         * <p>Example: {@code sgid1.step..uniqueID}
         *
         * @param stepId the value to set
         * @return this builder
         */
        public Builder stepId(String stepId) {
            this.stepId = stepId;
            this.__explicitlySet__.add("stepId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IgnoreDrPlanExecutionDetails build() {
            IgnoreDrPlanExecutionDetails model =
                    new IgnoreDrPlanExecutionDetails(this.groupId, this.stepId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IgnoreDrPlanExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("groupId")) {
                this.groupId(model.getGroupId());
            }
            if (model.wasPropertyExplicitlySet("stepId")) {
                this.stepId(model.getStepId());
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

    /**
     * The unique id of the group to ignore as a whole, or the group containing the step to ignore.
     *
     * <p>Example: {@code sgid1.group..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    private final String groupId;

    /**
     * The unique id of the group to ignore as a whole, or the group containing the step to ignore.
     *
     * <p>Example: {@code sgid1.group..uniqueID}
     *
     * @return the value
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * The unique id of the step to ignore (optional). Only needed when ignoring a step.
     *
     * <p>Example: {@code sgid1.step..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stepId")
    private final String stepId;

    /**
     * The unique id of the step to ignore (optional). Only needed when ignoring a step.
     *
     * <p>Example: {@code sgid1.step..uniqueID}
     *
     * @return the value
     */
    public String getStepId() {
        return stepId;
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
        sb.append("IgnoreDrPlanExecutionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("groupId=").append(String.valueOf(this.groupId));
        sb.append(", stepId=").append(String.valueOf(this.stepId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IgnoreDrPlanExecutionDetails)) {
            return false;
        }

        IgnoreDrPlanExecutionDetails other = (IgnoreDrPlanExecutionDetails) o;
        return java.util.Objects.equals(this.groupId, other.groupId)
                && java.util.Objects.equals(this.stepId, other.stepId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupId == null ? 43 : this.groupId.hashCode());
        result = (result * PRIME) + (this.stepId == null ? 43 : this.stepId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
