/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.model;

/**
 * An autoscaling policy that defines execution schedules for an autoscaling configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScheduledPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduledPolicy extends AutoScalingPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Capacity capacity;

        public Builder capacity(Capacity capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The schedule for executing the autoscaling policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionSchedule")
        private ExecutionSchedule executionSchedule;

        /**
         * The schedule for executing the autoscaling policy.
         * @param executionSchedule the value to set
         * @return this builder
         **/
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

        public ScheduledPolicy build() {
            ScheduledPolicy __instance__ =
                    new ScheduledPolicy(
                            capacity,
                            id,
                            displayName,
                            timeCreated,
                            isEnabled,
                            executionSchedule,
                            resourceAction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledPolicy o) {
            Builder copiedBuilder =
                    capacity(o.getCapacity())
                            .id(o.getId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .isEnabled(o.getIsEnabled())
                            .executionSchedule(o.getExecutionSchedule())
                            .resourceAction(o.getResourceAction());

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

    @Deprecated
    public ScheduledPolicy(
            Capacity capacity,
            String id,
            String displayName,
            java.util.Date timeCreated,
            Boolean isEnabled,
            ExecutionSchedule executionSchedule,
            ResourceAction resourceAction) {
        super(capacity, id, displayName, timeCreated, isEnabled);
        this.executionSchedule = executionSchedule;
        this.resourceAction = resourceAction;
    }

    /**
     * The schedule for executing the autoscaling policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionSchedule")
    private final ExecutionSchedule executionSchedule;

    /**
     * The schedule for executing the autoscaling policy.
     * @return the value
     **/
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
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ScheduledPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", executionSchedule=").append(String.valueOf(this.executionSchedule));
        sb.append(", resourceAction=").append(String.valueOf(this.resourceAction));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledPolicy)) {
            return false;
        }

        ScheduledPolicy other = (ScheduledPolicy) o;
        return java.util.Objects.equals(this.executionSchedule, other.executionSchedule)
                && java.util.Objects.equals(this.resourceAction, other.resourceAction)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
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
