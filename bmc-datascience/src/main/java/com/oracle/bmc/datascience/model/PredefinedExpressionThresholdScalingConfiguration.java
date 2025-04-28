/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The scaling configuration for the predefined metric expression rule. <br>
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
        builder = PredefinedExpressionThresholdScalingConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "scalingConfigurationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PredefinedExpressionThresholdScalingConfiguration extends ScalingConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("pendingDuration")
        private String pendingDuration;

        public Builder pendingDuration(String pendingDuration) {
            this.pendingDuration = pendingDuration;
            this.__explicitlySet__.add("pendingDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceCountAdjustment")
        private Integer instanceCountAdjustment;

        public Builder instanceCountAdjustment(Integer instanceCountAdjustment) {
            this.instanceCountAdjustment = instanceCountAdjustment;
            this.__explicitlySet__.add("instanceCountAdjustment");
            return this;
        }
        /** A metric value at which the scaling operation will be triggered. */
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private Integer threshold;

        /**
         * A metric value at which the scaling operation will be triggered.
         *
         * @param threshold the value to set
         * @return this builder
         */
        public Builder threshold(Integer threshold) {
            this.threshold = threshold;
            this.__explicitlySet__.add("threshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PredefinedExpressionThresholdScalingConfiguration build() {
            PredefinedExpressionThresholdScalingConfiguration model =
                    new PredefinedExpressionThresholdScalingConfiguration(
                            this.pendingDuration, this.instanceCountAdjustment, this.threshold);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PredefinedExpressionThresholdScalingConfiguration model) {
            if (model.wasPropertyExplicitlySet("pendingDuration")) {
                this.pendingDuration(model.getPendingDuration());
            }
            if (model.wasPropertyExplicitlySet("instanceCountAdjustment")) {
                this.instanceCountAdjustment(model.getInstanceCountAdjustment());
            }
            if (model.wasPropertyExplicitlySet("threshold")) {
                this.threshold(model.getThreshold());
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
    public PredefinedExpressionThresholdScalingConfiguration(
            String pendingDuration, Integer instanceCountAdjustment, Integer threshold) {
        super(pendingDuration, instanceCountAdjustment);
        this.threshold = threshold;
    }

    /** A metric value at which the scaling operation will be triggered. */
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final Integer threshold;

    /**
     * A metric value at which the scaling operation will be triggered.
     *
     * @return the value
     */
    public Integer getThreshold() {
        return threshold;
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
        sb.append("PredefinedExpressionThresholdScalingConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PredefinedExpressionThresholdScalingConfiguration)) {
            return false;
        }

        PredefinedExpressionThresholdScalingConfiguration other =
                (PredefinedExpressionThresholdScalingConfiguration) o;
        return java.util.Objects.equals(this.threshold, other.threshold) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        return result;
    }
}
