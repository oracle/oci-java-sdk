/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies a linear rollout strategy for a compute instance group rolling deployment stage.
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
    builder = ComputeInstanceGroupLinearRolloutPolicyByCount.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputeInstanceGroupLinearRolloutPolicyByCount
        extends ComputeInstanceGroupRolloutPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("batchDelayInSeconds")
        private Integer batchDelayInSeconds;

        public Builder batchDelayInSeconds(Integer batchDelayInSeconds) {
            this.batchDelayInSeconds = batchDelayInSeconds;
            this.__explicitlySet__.add("batchDelayInSeconds");
            return this;
        }
        /**
         * The number that will be used to determine how many instances will be deployed concurrently.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("batchCount")
        private Integer batchCount;

        /**
         * The number that will be used to determine how many instances will be deployed concurrently.
         * @param batchCount the value to set
         * @return this builder
         **/
        public Builder batchCount(Integer batchCount) {
            this.batchCount = batchCount;
            this.__explicitlySet__.add("batchCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceGroupLinearRolloutPolicyByCount build() {
            ComputeInstanceGroupLinearRolloutPolicyByCount model =
                    new ComputeInstanceGroupLinearRolloutPolicyByCount(
                            this.batchDelayInSeconds, this.batchCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceGroupLinearRolloutPolicyByCount model) {
            if (model.wasPropertyExplicitlySet("batchDelayInSeconds")) {
                this.batchDelayInSeconds(model.getBatchDelayInSeconds());
            }
            if (model.wasPropertyExplicitlySet("batchCount")) {
                this.batchCount(model.getBatchCount());
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
    public ComputeInstanceGroupLinearRolloutPolicyByCount(
            Integer batchDelayInSeconds, Integer batchCount) {
        super(batchDelayInSeconds);
        this.batchCount = batchCount;
    }

    /**
     * The number that will be used to determine how many instances will be deployed concurrently.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchCount")
    private final Integer batchCount;

    /**
     * The number that will be used to determine how many instances will be deployed concurrently.
     * @return the value
     **/
    public Integer getBatchCount() {
        return batchCount;
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
        sb.append("ComputeInstanceGroupLinearRolloutPolicyByCount(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", batchCount=").append(String.valueOf(this.batchCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeInstanceGroupLinearRolloutPolicyByCount)) {
            return false;
        }

        ComputeInstanceGroupLinearRolloutPolicyByCount other =
                (ComputeInstanceGroupLinearRolloutPolicyByCount) o;
        return java.util.Objects.equals(this.batchCount, other.batchCount) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.batchCount == null ? 43 : this.batchCount.hashCode());
        return result;
    }
}
