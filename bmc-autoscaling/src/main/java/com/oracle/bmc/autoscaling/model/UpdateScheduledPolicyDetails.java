/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateScheduledPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "policyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateScheduledPolicyDetails extends UpdateAutoScalingPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Capacity capacity;

        public Builder capacity(Capacity capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The schedule for executing the autoscaling policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionSchedule")
        private ExecutionSchedule executionSchedule;

        /**
         * The schedule for executing the autoscaling policy.
         *
         * @param executionSchedule the value to set
         * @return this builder
         */
        public Builder executionSchedule(ExecutionSchedule executionSchedule) {
            this.executionSchedule = executionSchedule;
            this.__explicitlySet__.add("executionSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceAction")
        private ResourceAction resourceAction;

        public Builder resourceAction(ResourceAction resourceAction) {
            this.resourceAction = resourceAction;
            this.__explicitlySet__.add("resourceAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateScheduledPolicyDetails build() {
            UpdateScheduledPolicyDetails model =
                    new UpdateScheduledPolicyDetails(
                            this.displayName,
                            this.capacity,
                            this.isEnabled,
                            this.executionSchedule,
                            this.resourceAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateScheduledPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("executionSchedule")) {
                this.executionSchedule(model.getExecutionSchedule());
            }
            if (model.wasPropertyExplicitlySet("resourceAction")) {
                this.resourceAction(model.getResourceAction());
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

    @Deprecated
    public UpdateScheduledPolicyDetails(
            String displayName,
            Capacity capacity,
            Boolean isEnabled,
            ExecutionSchedule executionSchedule,
            ResourceAction resourceAction) {
        super(displayName, capacity, isEnabled);
        this.executionSchedule = executionSchedule;
        this.resourceAction = resourceAction;
    }

    /** The schedule for executing the autoscaling policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionSchedule")
    private final ExecutionSchedule executionSchedule;

    /**
     * The schedule for executing the autoscaling policy.
     *
     * @return the value
     */
    public ExecutionSchedule getExecutionSchedule() {
        return executionSchedule;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceAction")
    private final ResourceAction resourceAction;

    public ResourceAction getResourceAction() {
        return resourceAction;
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
        sb.append("UpdateScheduledPolicyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", executionSchedule=").append(String.valueOf(this.executionSchedule));
        sb.append(", resourceAction=").append(String.valueOf(this.resourceAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateScheduledPolicyDetails)) {
            return false;
        }

        UpdateScheduledPolicyDetails other = (UpdateScheduledPolicyDetails) o;
        return java.util.Objects.equals(this.executionSchedule, other.executionSchedule)
                && java.util.Objects.equals(this.resourceAction, other.resourceAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.executionSchedule == null ? 43 : this.executionSchedule.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceAction == null ? 43 : this.resourceAction.hashCode());
        return result;
    }
}
