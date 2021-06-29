/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Description of rollout policy for load balancer traffic shift stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LoadBalancerTrafficShiftRolloutPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LoadBalancerTrafficShiftRolloutPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("batchCount")
        private Integer batchCount;

        public Builder batchCount(Integer batchCount) {
            this.batchCount = batchCount;
            this.__explicitlySet__.add("batchCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchDelayInSeconds")
        private Integer batchDelayInSeconds;

        public Builder batchDelayInSeconds(Integer batchDelayInSeconds) {
            this.batchDelayInSeconds = batchDelayInSeconds;
            this.__explicitlySet__.add("batchDelayInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rampLimitPercent")
        private Float rampLimitPercent;

        public Builder rampLimitPercent(Float rampLimitPercent) {
            this.rampLimitPercent = rampLimitPercent;
            this.__explicitlySet__.add("rampLimitPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoadBalancerTrafficShiftRolloutPolicy build() {
            LoadBalancerTrafficShiftRolloutPolicy __instance__ =
                    new LoadBalancerTrafficShiftRolloutPolicy(
                            batchCount, batchDelayInSeconds, rampLimitPercent);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancerTrafficShiftRolloutPolicy o) {
            Builder copiedBuilder =
                    batchCount(o.getBatchCount())
                            .batchDelayInSeconds(o.getBatchDelayInSeconds())
                            .rampLimitPercent(o.getRampLimitPercent());

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

    /**
     * Specifies number of batches for this stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchCount")
    Integer batchCount;

    /**
     * Specifies delay in seconds between batches. The default delay is 1 minute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchDelayInSeconds")
    Integer batchDelayInSeconds;

    /**
     * Indicates the criteria to stop.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rampLimitPercent")
    Float rampLimitPercent;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
