/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Workload scaling policy configuration for workloads on managed compute cluster type compute target
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagedComputeClusterWorkloadScalePolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedComputeClusterWorkloadScalePolicy
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pendingDuration",
        "instanceCountAdjustment",
        "coolDownInSeconds"
    })
    public ManagedComputeClusterWorkloadScalePolicy(
            String pendingDuration, Integer instanceCountAdjustment, Integer coolDownInSeconds) {
        super();
        this.pendingDuration = pendingDuration;
        this.instanceCountAdjustment = instanceCountAdjustment;
        this.coolDownInSeconds = coolDownInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The period of time that the condition defined in the alarm must persist before the alarm state changes from "OK" to "FIRING"
         * or vice versa. For example, a value of 5 minutes means that the alarm must persist in breaching the condition for five minutes
         * before the alarm updates its state to "FIRING"; likewise, the alarm must persist in not breaching the condition for five minutes
         * before the alarm updates its state to "OK." The duration is specified as a string in ISO 8601 format (PT10M for ten minutes).
         * Minimum: PT1M. Maximum: PT30M. Default: PT3M.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
        private String pendingDuration;

        /**
         * The period of time that the condition defined in the alarm must persist before the alarm state changes from "OK" to "FIRING"
         * or vice versa. For example, a value of 5 minutes means that the alarm must persist in breaching the condition for five minutes
         * before the alarm updates its state to "FIRING"; likewise, the alarm must persist in not breaching the condition for five minutes
         * before the alarm updates its state to "OK." The duration is specified as a string in ISO 8601 format (PT10M for ten minutes).
         * Minimum: PT1M. Maximum: PT30M. Default: PT3M.
         *
         * @param pendingDuration the value to set
         * @return this builder
         **/
        public Builder pendingDuration(String pendingDuration) {
            this.pendingDuration = pendingDuration;
            this.__explicitlySet__.add("pendingDuration");
            return this;
        }
        /**
         * The value is used for adjusting the count of instances by.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceCountAdjustment")
        private Integer instanceCountAdjustment;

        /**
         * The value is used for adjusting the count of instances by.
         * @param instanceCountAdjustment the value to set
         * @return this builder
         **/
        public Builder instanceCountAdjustment(Integer instanceCountAdjustment) {
            this.instanceCountAdjustment = instanceCountAdjustment;
            this.__explicitlySet__.add("instanceCountAdjustment");
            return this;
        }
        /**
         * This value is the duration of time window used to restrict the flapping of instance count when the metrics used for scaling keep fluctuating.
         * This window is used to infer a previous desired state and avoid unwanted changes to workload scale. Default value is 300 seconds.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coolDownInSeconds")
        private Integer coolDownInSeconds;

        /**
         * This value is the duration of time window used to restrict the flapping of instance count when the metrics used for scaling keep fluctuating.
         * This window is used to infer a previous desired state and avoid unwanted changes to workload scale. Default value is 300 seconds.
         *
         * @param coolDownInSeconds the value to set
         * @return this builder
         **/
        public Builder coolDownInSeconds(Integer coolDownInSeconds) {
            this.coolDownInSeconds = coolDownInSeconds;
            this.__explicitlySet__.add("coolDownInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedComputeClusterWorkloadScalePolicy build() {
            ManagedComputeClusterWorkloadScalePolicy model =
                    new ManagedComputeClusterWorkloadScalePolicy(
                            this.pendingDuration,
                            this.instanceCountAdjustment,
                            this.coolDownInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedComputeClusterWorkloadScalePolicy model) {
            if (model.wasPropertyExplicitlySet("pendingDuration")) {
                this.pendingDuration(model.getPendingDuration());
            }
            if (model.wasPropertyExplicitlySet("instanceCountAdjustment")) {
                this.instanceCountAdjustment(model.getInstanceCountAdjustment());
            }
            if (model.wasPropertyExplicitlySet("coolDownInSeconds")) {
                this.coolDownInSeconds(model.getCoolDownInSeconds());
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

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm state changes from "OK" to "FIRING"
     * or vice versa. For example, a value of 5 minutes means that the alarm must persist in breaching the condition for five minutes
     * before the alarm updates its state to "FIRING"; likewise, the alarm must persist in not breaching the condition for five minutes
     * before the alarm updates its state to "OK." The duration is specified as a string in ISO 8601 format (PT10M for ten minutes).
     * Minimum: PT1M. Maximum: PT30M. Default: PT3M.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
    private final String pendingDuration;

    /**
     * The period of time that the condition defined in the alarm must persist before the alarm state changes from "OK" to "FIRING"
     * or vice versa. For example, a value of 5 minutes means that the alarm must persist in breaching the condition for five minutes
     * before the alarm updates its state to "FIRING"; likewise, the alarm must persist in not breaching the condition for five minutes
     * before the alarm updates its state to "OK." The duration is specified as a string in ISO 8601 format (PT10M for ten minutes).
     * Minimum: PT1M. Maximum: PT30M. Default: PT3M.
     *
     * @return the value
     **/
    public String getPendingDuration() {
        return pendingDuration;
    }

    /**
     * The value is used for adjusting the count of instances by.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceCountAdjustment")
    private final Integer instanceCountAdjustment;

    /**
     * The value is used for adjusting the count of instances by.
     * @return the value
     **/
    public Integer getInstanceCountAdjustment() {
        return instanceCountAdjustment;
    }

    /**
     * This value is the duration of time window used to restrict the flapping of instance count when the metrics used for scaling keep fluctuating.
     * This window is used to infer a previous desired state and avoid unwanted changes to workload scale. Default value is 300 seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coolDownInSeconds")
    private final Integer coolDownInSeconds;

    /**
     * This value is the duration of time window used to restrict the flapping of instance count when the metrics used for scaling keep fluctuating.
     * This window is used to infer a previous desired state and avoid unwanted changes to workload scale. Default value is 300 seconds.
     *
     * @return the value
     **/
    public Integer getCoolDownInSeconds() {
        return coolDownInSeconds;
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
        sb.append("ManagedComputeClusterWorkloadScalePolicy(");
        sb.append("super=").append(super.toString());
        sb.append("pendingDuration=").append(String.valueOf(this.pendingDuration));
        sb.append(", instanceCountAdjustment=")
                .append(String.valueOf(this.instanceCountAdjustment));
        sb.append(", coolDownInSeconds=").append(String.valueOf(this.coolDownInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedComputeClusterWorkloadScalePolicy)) {
            return false;
        }

        ManagedComputeClusterWorkloadScalePolicy other =
                (ManagedComputeClusterWorkloadScalePolicy) o;
        return java.util.Objects.equals(this.pendingDuration, other.pendingDuration)
                && java.util.Objects.equals(
                        this.instanceCountAdjustment, other.instanceCountAdjustment)
                && java.util.Objects.equals(this.coolDownInSeconds, other.coolDownInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.pendingDuration == null ? 43 : this.pendingDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceCountAdjustment == null
                                ? 43
                                : this.instanceCountAdjustment.hashCode());
        result =
                (result * PRIME)
                        + (this.coolDownInSeconds == null ? 43 : this.coolDownInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
