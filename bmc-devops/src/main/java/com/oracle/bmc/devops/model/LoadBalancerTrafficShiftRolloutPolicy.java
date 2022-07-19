/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LoadBalancerTrafficShiftRolloutPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LoadBalancerTrafficShiftRolloutPolicy {
    @Deprecated
    @java.beans.ConstructorProperties({"batchCount", "batchDelayInSeconds", "rampLimitPercent"})
    public LoadBalancerTrafficShiftRolloutPolicy(
            Integer batchCount, Integer batchDelayInSeconds, Float rampLimitPercent) {
        super();
        this.batchCount = batchCount;
        this.batchDelayInSeconds = batchDelayInSeconds;
        this.rampLimitPercent = rampLimitPercent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies number of batches for this stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("batchCount")
        private Integer batchCount;

        /**
         * Specifies number of batches for this stage.
         * @param batchCount the value to set
         * @return this builder
         **/
        public Builder batchCount(Integer batchCount) {
            this.batchCount = batchCount;
            this.__explicitlySet__.add("batchCount");
            return this;
        }
        /**
         * Specifies delay in seconds between batches. The default delay is 1 minute.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("batchDelayInSeconds")
        private Integer batchDelayInSeconds;

        /**
         * Specifies delay in seconds between batches. The default delay is 1 minute.
         * @param batchDelayInSeconds the value to set
         * @return this builder
         **/
        public Builder batchDelayInSeconds(Integer batchDelayInSeconds) {
            this.batchDelayInSeconds = batchDelayInSeconds;
            this.__explicitlySet__.add("batchDelayInSeconds");
            return this;
        }
        /**
         * Indicates the criteria to stop.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rampLimitPercent")
        private Float rampLimitPercent;

        /**
         * Indicates the criteria to stop.
         * @param rampLimitPercent the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Specifies number of batches for this stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchCount")
    private final Integer batchCount;

    /**
     * Specifies number of batches for this stage.
     * @return the value
     **/
    public Integer getBatchCount() {
        return batchCount;
    }

    /**
     * Specifies delay in seconds between batches. The default delay is 1 minute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchDelayInSeconds")
    private final Integer batchDelayInSeconds;

    /**
     * Specifies delay in seconds between batches. The default delay is 1 minute.
     * @return the value
     **/
    public Integer getBatchDelayInSeconds() {
        return batchDelayInSeconds;
    }

    /**
     * Indicates the criteria to stop.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rampLimitPercent")
    private final Float rampLimitPercent;

    /**
     * Indicates the criteria to stop.
     * @return the value
     **/
    public Float getRampLimitPercent() {
        return rampLimitPercent;
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
        sb.append("LoadBalancerTrafficShiftRolloutPolicy(");
        sb.append("batchCount=").append(String.valueOf(this.batchCount));
        sb.append(", batchDelayInSeconds=").append(String.valueOf(this.batchDelayInSeconds));
        sb.append(", rampLimitPercent=").append(String.valueOf(this.rampLimitPercent));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoadBalancerTrafficShiftRolloutPolicy)) {
            return false;
        }

        LoadBalancerTrafficShiftRolloutPolicy other = (LoadBalancerTrafficShiftRolloutPolicy) o;
        return java.util.Objects.equals(this.batchCount, other.batchCount)
                && java.util.Objects.equals(this.batchDelayInSeconds, other.batchDelayInSeconds)
                && java.util.Objects.equals(this.rampLimitPercent, other.rampLimitPercent)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.batchCount == null ? 43 : this.batchCount.hashCode());
        result =
                (result * PRIME)
                        + (this.batchDelayInSeconds == null
                                ? 43
                                : this.batchDelayInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.rampLimitPercent == null ? 43 : this.rampLimitPercent.hashCode());
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
