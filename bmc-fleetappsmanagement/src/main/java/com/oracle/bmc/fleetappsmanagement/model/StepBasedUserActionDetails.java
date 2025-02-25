/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details for a user action to be performed on a step.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StepBasedUserActionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "level"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StepBasedUserActionDetails extends UserActionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * Unique identifier for the action group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionGroupId")
        private String actionGroupId;

        /**
         * Unique identifier for the action group.
         * @param actionGroupId the value to set
         * @return this builder
         **/
        public Builder actionGroupId(String actionGroupId) {
            this.actionGroupId = actionGroupId;
            this.__explicitlySet__.add("actionGroupId");
            return this;
        }
        /**
         * Resource OCID
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * Resource OCID
         *
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * Target associated with the execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * Target associated with the execution.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Name of the step on which user action needs to be performed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * Name of the step on which user action needs to be performed.
         * @param stepName the value to set
         * @return this builder
         **/
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StepBasedUserActionDetails build() {
            StepBasedUserActionDetails model =
                    new StepBasedUserActionDetails(
                            this.action,
                            this.actionGroupId,
                            this.resourceId,
                            this.targetId,
                            this.stepName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StepBasedUserActionDetails model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("actionGroupId")) {
                this.actionGroupId(model.getActionGroupId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
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
    public StepBasedUserActionDetails(
            Action action,
            String actionGroupId,
            String resourceId,
            String targetId,
            String stepName) {
        super(action);
        this.actionGroupId = actionGroupId;
        this.resourceId = resourceId;
        this.targetId = targetId;
        this.stepName = stepName;
    }

    /**
     * Unique identifier for the action group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionGroupId")
    private final String actionGroupId;

    /**
     * Unique identifier for the action group.
     * @return the value
     **/
    public String getActionGroupId() {
        return actionGroupId;
    }

    /**
     * Resource OCID
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * Resource OCID
     *
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Target associated with the execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * Target associated with the execution.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * Name of the step on which user action needs to be performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * Name of the step on which user action needs to be performed.
     * @return the value
     **/
    public String getStepName() {
        return stepName;
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
        sb.append("StepBasedUserActionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", actionGroupId=").append(String.valueOf(this.actionGroupId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", stepName=").append(String.valueOf(this.stepName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StepBasedUserActionDetails)) {
            return false;
        }

        StepBasedUserActionDetails other = (StepBasedUserActionDetails) o;
        return java.util.Objects.equals(this.actionGroupId, other.actionGroupId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.stepName, other.stepName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.actionGroupId == null ? 43 : this.actionGroupId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        return result;
    }
}
