/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The fixed size scaling policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FixedSizeScalingPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "policyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FixedSizeScalingPolicy extends ScalingPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of instances for the model deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceCount")
        private Integer instanceCount;

        /**
         * The number of instances for the model deployment.
         *
         * @param instanceCount the value to set
         * @return this builder
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            this.__explicitlySet__.add("instanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FixedSizeScalingPolicy build() {
            FixedSizeScalingPolicy model = new FixedSizeScalingPolicy(this.instanceCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FixedSizeScalingPolicy model) {
            if (model.wasPropertyExplicitlySet("instanceCount")) {
                this.instanceCount(model.getInstanceCount());
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
    public FixedSizeScalingPolicy(Integer instanceCount) {
        super();
        this.instanceCount = instanceCount;
    }

    /** The number of instances for the model deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceCount")
    private final Integer instanceCount;

    /**
     * The number of instances for the model deployment.
     *
     * @return the value
     */
    public Integer getInstanceCount() {
        return instanceCount;
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
        sb.append("FixedSizeScalingPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", instanceCount=").append(String.valueOf(this.instanceCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FixedSizeScalingPolicy)) {
            return false;
        }

        FixedSizeScalingPolicy other = (FixedSizeScalingPolicy) o;
        return java.util.Objects.equals(this.instanceCount, other.instanceCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.instanceCount == null ? 43 : this.instanceCount.hashCode());
        return result;
    }
}
