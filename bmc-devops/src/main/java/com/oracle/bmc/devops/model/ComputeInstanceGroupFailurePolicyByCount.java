/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies a failure policy by count for a compute instance group rolling deployment stage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeInstanceGroupFailurePolicyByCount.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "policyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ComputeInstanceGroupFailurePolicyByCount
        extends ComputeInstanceGroupFailurePolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The threshold count of failed instances in the group, which when reached or exceeded sets
         * the stage as Failed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("failureCount")
        private Integer failureCount;

        /**
         * The threshold count of failed instances in the group, which when reached or exceeded sets
         * the stage as Failed.
         *
         * @param failureCount the value to set
         * @return this builder
         */
        public Builder failureCount(Integer failureCount) {
            this.failureCount = failureCount;
            this.__explicitlySet__.add("failureCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceGroupFailurePolicyByCount build() {
            ComputeInstanceGroupFailurePolicyByCount model =
                    new ComputeInstanceGroupFailurePolicyByCount(this.failureCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceGroupFailurePolicyByCount model) {
            if (model.wasPropertyExplicitlySet("failureCount")) {
                this.failureCount(model.getFailureCount());
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
    public ComputeInstanceGroupFailurePolicyByCount(Integer failureCount) {
        super();
        this.failureCount = failureCount;
    }

    /**
     * The threshold count of failed instances in the group, which when reached or exceeded sets the
     * stage as Failed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureCount")
    private final Integer failureCount;

    /**
     * The threshold count of failed instances in the group, which when reached or exceeded sets the
     * stage as Failed.
     *
     * @return the value
     */
    public Integer getFailureCount() {
        return failureCount;
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
        sb.append("ComputeInstanceGroupFailurePolicyByCount(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", failureCount=").append(String.valueOf(this.failureCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeInstanceGroupFailurePolicyByCount)) {
            return false;
        }

        ComputeInstanceGroupFailurePolicyByCount other =
                (ComputeInstanceGroupFailurePolicyByCount) o;
        return java.util.Objects.equals(this.failureCount, other.failureCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.failureCount == null ? 43 : this.failureCount.hashCode());
        return result;
    }
}
