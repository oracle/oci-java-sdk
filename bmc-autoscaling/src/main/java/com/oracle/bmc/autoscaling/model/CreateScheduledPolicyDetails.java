/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.model;

/**
 * Creation details for a schedule-based autoscaling policy.
 *
 * <p>In a schedule-based autoscaling policy, an autoscaling action is triggered at the scheduled
 * execution time. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateScheduledPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "policyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateScheduledPolicyDetails extends CreateAutoScalingPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Capacity capacity;

        public Builder capacity(Capacity capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executionSchedule")
        private ExecutionSchedule executionSchedule;

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

        public CreateScheduledPolicyDetails build() {
            CreateScheduledPolicyDetails model =
                    new CreateScheduledPolicyDetails(
                            this.capacity,
                            this.displayName,
                            this.isEnabled,
                            this.executionSchedule,
                            this.resourceAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateScheduledPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
    public CreateScheduledPolicyDetails(
            Capacity capacity,
            String displayName,
            Boolean isEnabled,
            ExecutionSchedule executionSchedule,
            ResourceAction resourceAction) {
        super(capacity, displayName, isEnabled);
        this.executionSchedule = executionSchedule;
        this.resourceAction = resourceAction;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executionSchedule")
    private final ExecutionSchedule executionSchedule;

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
        sb.append("CreateScheduledPolicyDetails(");
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
        if (!(o instanceof CreateScheduledPolicyDetails)) {
            return false;
        }

        CreateScheduledPolicyDetails other = (CreateScheduledPolicyDetails) o;
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
