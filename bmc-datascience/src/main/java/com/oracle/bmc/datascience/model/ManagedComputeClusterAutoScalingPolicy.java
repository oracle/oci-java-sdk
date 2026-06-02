/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The scaling policy to enable autoscaling on the managed compute cluster type compute target .
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
    builder = ManagedComputeClusterAutoScalingPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedComputeClusterAutoScalingPolicy
        extends ManagedComputeClusterScalingPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * For threshold-based autoscaling policies, this value is the minimum period of time to wait between scaling actions.
         * The cooldown period gives the system time to stabilize before rescaling. The minimum value is 300 seconds, which
         * is also the default. The cooldown period starts when the managed compute cluster type compute target  becomes ACTIVE after the scaling operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coolDownInSeconds")
        private Integer coolDownInSeconds;

        /**
         * For threshold-based autoscaling policies, this value is the minimum period of time to wait between scaling actions.
         * The cooldown period gives the system time to stabilize before rescaling. The minimum value is 300 seconds, which
         * is also the default. The cooldown period starts when the managed compute cluster type compute target  becomes ACTIVE after the scaling operation.
         *
         * @param coolDownInSeconds the value to set
         * @return this builder
         **/
        public Builder coolDownInSeconds(Integer coolDownInSeconds) {
            this.coolDownInSeconds = coolDownInSeconds;
            this.__explicitlySet__.add("coolDownInSeconds");
            return this;
        }
        /**
         * Whether the autoscaling policy is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether the autoscaling policy is enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The list of autoscaling policy details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoScalingPolicies")
        private java.util.List<ManagedComputeClusterAutoScalingPolicyDetails> autoScalingPolicies;

        /**
         * The list of autoscaling policy details.
         * @param autoScalingPolicies the value to set
         * @return this builder
         **/
        public Builder autoScalingPolicies(
                java.util.List<ManagedComputeClusterAutoScalingPolicyDetails> autoScalingPolicies) {
            this.autoScalingPolicies = autoScalingPolicies;
            this.__explicitlySet__.add("autoScalingPolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedComputeClusterAutoScalingPolicy build() {
            ManagedComputeClusterAutoScalingPolicy model =
                    new ManagedComputeClusterAutoScalingPolicy(
                            this.coolDownInSeconds, this.isEnabled, this.autoScalingPolicies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedComputeClusterAutoScalingPolicy model) {
            if (model.wasPropertyExplicitlySet("coolDownInSeconds")) {
                this.coolDownInSeconds(model.getCoolDownInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("autoScalingPolicies")) {
                this.autoScalingPolicies(model.getAutoScalingPolicies());
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
    public ManagedComputeClusterAutoScalingPolicy(
            Integer coolDownInSeconds,
            Boolean isEnabled,
            java.util.List<ManagedComputeClusterAutoScalingPolicyDetails> autoScalingPolicies) {
        super();
        this.coolDownInSeconds = coolDownInSeconds;
        this.isEnabled = isEnabled;
        this.autoScalingPolicies = autoScalingPolicies;
    }

    /**
     * For threshold-based autoscaling policies, this value is the minimum period of time to wait between scaling actions.
     * The cooldown period gives the system time to stabilize before rescaling. The minimum value is 300 seconds, which
     * is also the default. The cooldown period starts when the managed compute cluster type compute target  becomes ACTIVE after the scaling operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coolDownInSeconds")
    private final Integer coolDownInSeconds;

    /**
     * For threshold-based autoscaling policies, this value is the minimum period of time to wait between scaling actions.
     * The cooldown period gives the system time to stabilize before rescaling. The minimum value is 300 seconds, which
     * is also the default. The cooldown period starts when the managed compute cluster type compute target  becomes ACTIVE after the scaling operation.
     *
     * @return the value
     **/
    public Integer getCoolDownInSeconds() {
        return coolDownInSeconds;
    }

    /**
     * Whether the autoscaling policy is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether the autoscaling policy is enabled.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The list of autoscaling policy details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoScalingPolicies")
    private final java.util.List<ManagedComputeClusterAutoScalingPolicyDetails> autoScalingPolicies;

    /**
     * The list of autoscaling policy details.
     * @return the value
     **/
    public java.util.List<ManagedComputeClusterAutoScalingPolicyDetails> getAutoScalingPolicies() {
        return autoScalingPolicies;
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
        sb.append("ManagedComputeClusterAutoScalingPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", coolDownInSeconds=").append(String.valueOf(this.coolDownInSeconds));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", autoScalingPolicies=").append(String.valueOf(this.autoScalingPolicies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedComputeClusterAutoScalingPolicy)) {
            return false;
        }

        ManagedComputeClusterAutoScalingPolicy other = (ManagedComputeClusterAutoScalingPolicy) o;
        return java.util.Objects.equals(this.coolDownInSeconds, other.coolDownInSeconds)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.autoScalingPolicies, other.autoScalingPolicies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.coolDownInSeconds == null ? 43 : this.coolDownInSeconds.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.autoScalingPolicies == null
                                ? 43
                                : this.autoScalingPolicies.hashCode());
        return result;
    }
}
