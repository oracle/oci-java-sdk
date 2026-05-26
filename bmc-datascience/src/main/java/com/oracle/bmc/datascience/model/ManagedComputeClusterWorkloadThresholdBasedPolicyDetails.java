/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details for a threshold-based autoscaling policy to enable autoscaling of workload on the managed
 * compute cluster type compute target . In a threshold-based autoscaling policy, an autoscaling
 * action is triggered when a performance metric meets or exceeds a threshold. <br>
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
        builder = ManagedComputeClusterWorkloadThresholdBasedPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "autoScalingPolicyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedComputeClusterWorkloadThresholdBasedPolicyDetails
        extends ManagedComputeClusterWorkloadAutoScalingPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of autoscaling policy rules for workload scaling.. */
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<ManagedComputeClusterWorkloadMetricExpressionRule> rules;

        /**
         * The list of autoscaling policy rules for workload scaling..
         *
         * @param rules the value to set
         * @return this builder
         */
        public Builder rules(
                java.util.List<ManagedComputeClusterWorkloadMetricExpressionRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }
        /**
         * For a threshold-based autoscaling policy, this value is the maximum number of workload
         * instances allowed to increase to (scale out).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumInstanceCount")
        private Integer maximumInstanceCount;

        /**
         * For a threshold-based autoscaling policy, this value is the maximum number of workload
         * instances allowed to increase to (scale out).
         *
         * @param maximumInstanceCount the value to set
         * @return this builder
         */
        public Builder maximumInstanceCount(Integer maximumInstanceCount) {
            this.maximumInstanceCount = maximumInstanceCount;
            this.__explicitlySet__.add("maximumInstanceCount");
            return this;
        }
        /**
         * For a threshold-based autoscaling policy, this value is the minimum number of workload
         * instances allowed to decrease to (scale in). This should be zero for scale-to-zero.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumInstanceCount")
        private Integer minimumInstanceCount;

        /**
         * For a threshold-based autoscaling policy, this value is the minimum number of workload
         * instances allowed to decrease to (scale in). This should be zero for scale-to-zero.
         *
         * @param minimumInstanceCount the value to set
         * @return this builder
         */
        public Builder minimumInstanceCount(Integer minimumInstanceCount) {
            this.minimumInstanceCount = minimumInstanceCount;
            this.__explicitlySet__.add("minimumInstanceCount");
            return this;
        }
        /**
         * For a threshold-based autoscaling policy, this value is the initial number of workload
         * instances to launch immediately after autoscaling is enabled. Note that anytime this
         * value is updated, the number of instances will be reset to this value. After autoscaling
         * retrieves performance metrics, the number of instances is automatically adjusted from
         * this initial number to a number that is based on the limits that you set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("initialInstanceCount")
        private Integer initialInstanceCount;

        /**
         * For a threshold-based autoscaling policy, this value is the initial number of workload
         * instances to launch immediately after autoscaling is enabled. Note that anytime this
         * value is updated, the number of instances will be reset to this value. After autoscaling
         * retrieves performance metrics, the number of instances is automatically adjusted from
         * this initial number to a number that is based on the limits that you set.
         *
         * @param initialInstanceCount the value to set
         * @return this builder
         */
        public Builder initialInstanceCount(Integer initialInstanceCount) {
            this.initialInstanceCount = initialInstanceCount;
            this.__explicitlySet__.add("initialInstanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scaleInPolicy")
        private ManagedComputeClusterWorkloadScalePolicy scaleInPolicy;

        public Builder scaleInPolicy(ManagedComputeClusterWorkloadScalePolicy scaleInPolicy) {
            this.scaleInPolicy = scaleInPolicy;
            this.__explicitlySet__.add("scaleInPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scaleOutPolicy")
        private ManagedComputeClusterWorkloadScalePolicy scaleOutPolicy;

        public Builder scaleOutPolicy(ManagedComputeClusterWorkloadScalePolicy scaleOutPolicy) {
            this.scaleOutPolicy = scaleOutPolicy;
            this.__explicitlySet__.add("scaleOutPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedComputeClusterWorkloadThresholdBasedPolicyDetails build() {
            ManagedComputeClusterWorkloadThresholdBasedPolicyDetails model =
                    new ManagedComputeClusterWorkloadThresholdBasedPolicyDetails(
                            this.rules,
                            this.maximumInstanceCount,
                            this.minimumInstanceCount,
                            this.initialInstanceCount,
                            this.scaleInPolicy,
                            this.scaleOutPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedComputeClusterWorkloadThresholdBasedPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
            }
            if (model.wasPropertyExplicitlySet("maximumInstanceCount")) {
                this.maximumInstanceCount(model.getMaximumInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("minimumInstanceCount")) {
                this.minimumInstanceCount(model.getMinimumInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("initialInstanceCount")) {
                this.initialInstanceCount(model.getInitialInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("scaleInPolicy")) {
                this.scaleInPolicy(model.getScaleInPolicy());
            }
            if (model.wasPropertyExplicitlySet("scaleOutPolicy")) {
                this.scaleOutPolicy(model.getScaleOutPolicy());
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
    public ManagedComputeClusterWorkloadThresholdBasedPolicyDetails(
            java.util.List<ManagedComputeClusterWorkloadMetricExpressionRule> rules,
            Integer maximumInstanceCount,
            Integer minimumInstanceCount,
            Integer initialInstanceCount,
            ManagedComputeClusterWorkloadScalePolicy scaleInPolicy,
            ManagedComputeClusterWorkloadScalePolicy scaleOutPolicy) {
        super();
        this.rules = rules;
        this.maximumInstanceCount = maximumInstanceCount;
        this.minimumInstanceCount = minimumInstanceCount;
        this.initialInstanceCount = initialInstanceCount;
        this.scaleInPolicy = scaleInPolicy;
        this.scaleOutPolicy = scaleOutPolicy;
    }

    /** The list of autoscaling policy rules for workload scaling.. */
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<ManagedComputeClusterWorkloadMetricExpressionRule> rules;

    /**
     * The list of autoscaling policy rules for workload scaling..
     *
     * @return the value
     */
    public java.util.List<ManagedComputeClusterWorkloadMetricExpressionRule> getRules() {
        return rules;
    }

    /**
     * For a threshold-based autoscaling policy, this value is the maximum number of workload
     * instances allowed to increase to (scale out).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumInstanceCount")
    private final Integer maximumInstanceCount;

    /**
     * For a threshold-based autoscaling policy, this value is the maximum number of workload
     * instances allowed to increase to (scale out).
     *
     * @return the value
     */
    public Integer getMaximumInstanceCount() {
        return maximumInstanceCount;
    }

    /**
     * For a threshold-based autoscaling policy, this value is the minimum number of workload
     * instances allowed to decrease to (scale in). This should be zero for scale-to-zero.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumInstanceCount")
    private final Integer minimumInstanceCount;

    /**
     * For a threshold-based autoscaling policy, this value is the minimum number of workload
     * instances allowed to decrease to (scale in). This should be zero for scale-to-zero.
     *
     * @return the value
     */
    public Integer getMinimumInstanceCount() {
        return minimumInstanceCount;
    }

    /**
     * For a threshold-based autoscaling policy, this value is the initial number of workload
     * instances to launch immediately after autoscaling is enabled. Note that anytime this value is
     * updated, the number of instances will be reset to this value. After autoscaling retrieves
     * performance metrics, the number of instances is automatically adjusted from this initial
     * number to a number that is based on the limits that you set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialInstanceCount")
    private final Integer initialInstanceCount;

    /**
     * For a threshold-based autoscaling policy, this value is the initial number of workload
     * instances to launch immediately after autoscaling is enabled. Note that anytime this value is
     * updated, the number of instances will be reset to this value. After autoscaling retrieves
     * performance metrics, the number of instances is automatically adjusted from this initial
     * number to a number that is based on the limits that you set.
     *
     * @return the value
     */
    public Integer getInitialInstanceCount() {
        return initialInstanceCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleInPolicy")
    private final ManagedComputeClusterWorkloadScalePolicy scaleInPolicy;

    public ManagedComputeClusterWorkloadScalePolicy getScaleInPolicy() {
        return scaleInPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleOutPolicy")
    private final ManagedComputeClusterWorkloadScalePolicy scaleOutPolicy;

    public ManagedComputeClusterWorkloadScalePolicy getScaleOutPolicy() {
        return scaleOutPolicy;
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
        sb.append("ManagedComputeClusterWorkloadThresholdBasedPolicyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(", maximumInstanceCount=").append(String.valueOf(this.maximumInstanceCount));
        sb.append(", minimumInstanceCount=").append(String.valueOf(this.minimumInstanceCount));
        sb.append(", initialInstanceCount=").append(String.valueOf(this.initialInstanceCount));
        sb.append(", scaleInPolicy=").append(String.valueOf(this.scaleInPolicy));
        sb.append(", scaleOutPolicy=").append(String.valueOf(this.scaleOutPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedComputeClusterWorkloadThresholdBasedPolicyDetails)) {
            return false;
        }

        ManagedComputeClusterWorkloadThresholdBasedPolicyDetails other =
                (ManagedComputeClusterWorkloadThresholdBasedPolicyDetails) o;
        return java.util.Objects.equals(this.rules, other.rules)
                && java.util.Objects.equals(this.maximumInstanceCount, other.maximumInstanceCount)
                && java.util.Objects.equals(this.minimumInstanceCount, other.minimumInstanceCount)
                && java.util.Objects.equals(this.initialInstanceCount, other.initialInstanceCount)
                && java.util.Objects.equals(this.scaleInPolicy, other.scaleInPolicy)
                && java.util.Objects.equals(this.scaleOutPolicy, other.scaleOutPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumInstanceCount == null
                                ? 43
                                : this.maximumInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumInstanceCount == null
                                ? 43
                                : this.minimumInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.initialInstanceCount == null
                                ? 43
                                : this.initialInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.scaleInPolicy == null ? 43 : this.scaleInPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.scaleOutPolicy == null ? 43 : this.scaleOutPolicy.hashCode());
        return result;
    }
}
