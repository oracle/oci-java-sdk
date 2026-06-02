/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The configuration details for the managed compute cluster type compute target.
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
    builder = ManagedComputeClusterComputeConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "computeType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedComputeClusterComputeConfigurationDetails
        extends ComputeConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("instanceConfiguration")
        private ManagedComputeClusterInstanceConfigurationDetails instanceConfiguration;

        public Builder instanceConfiguration(
                ManagedComputeClusterInstanceConfigurationDetails instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            this.__explicitlySet__.add("instanceConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scalingPolicy")
        private ManagedComputeClusterScalingPolicy scalingPolicy;

        public Builder scalingPolicy(ManagedComputeClusterScalingPolicy scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            this.__explicitlySet__.add("scalingPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedComputeClusterComputeConfigurationDetails build() {
            ManagedComputeClusterComputeConfigurationDetails model =
                    new ManagedComputeClusterComputeConfigurationDetails(
                            this.instanceConfiguration, this.scalingPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedComputeClusterComputeConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("instanceConfiguration")) {
                this.instanceConfiguration(model.getInstanceConfiguration());
            }
            if (model.wasPropertyExplicitlySet("scalingPolicy")) {
                this.scalingPolicy(model.getScalingPolicy());
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
    public ManagedComputeClusterComputeConfigurationDetails(
            ManagedComputeClusterInstanceConfigurationDetails instanceConfiguration,
            ManagedComputeClusterScalingPolicy scalingPolicy) {
        super();
        this.instanceConfiguration = instanceConfiguration;
        this.scalingPolicy = scalingPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceConfiguration")
    private final ManagedComputeClusterInstanceConfigurationDetails instanceConfiguration;

    public ManagedComputeClusterInstanceConfigurationDetails getInstanceConfiguration() {
        return instanceConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scalingPolicy")
    private final ManagedComputeClusterScalingPolicy scalingPolicy;

    public ManagedComputeClusterScalingPolicy getScalingPolicy() {
        return scalingPolicy;
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
        sb.append("ManagedComputeClusterComputeConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", instanceConfiguration=").append(String.valueOf(this.instanceConfiguration));
        sb.append(", scalingPolicy=").append(String.valueOf(this.scalingPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedComputeClusterComputeConfigurationDetails)) {
            return false;
        }

        ManagedComputeClusterComputeConfigurationDetails other =
                (ManagedComputeClusterComputeConfigurationDetails) o;
        return java.util.Objects.equals(this.instanceConfiguration, other.instanceConfiguration)
                && java.util.Objects.equals(this.scalingPolicy, other.scalingPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.instanceConfiguration == null
                                ? 43
                                : this.instanceConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.scalingPolicy == null ? 43 : this.scalingPolicy.hashCode());
        return result;
    }
}
