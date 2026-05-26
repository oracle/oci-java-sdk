/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Infrastructure configuration details for model deploy on managed compute cluster type compute
 * target. <br>
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
        builder = ManagedComputeClusterModelDeployInfrastructureConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "infrastructureType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedComputeClusterModelDeployInfrastructureConfigDetails
        extends ModelDeployInfrastructureConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Compute Target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeTargetId")
        private String computeTargetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Compute Target.
         *
         * @param computeTargetId the value to set
         * @return this builder
         */
        public Builder computeTargetId(String computeTargetId) {
            this.computeTargetId = computeTargetId;
            this.__explicitlySet__.add("computeTargetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentResourceConfiguration")
        private ManagedComputeClusterModelDeploymentResourceConfiguration
                modelDeploymentResourceConfiguration;

        public Builder modelDeploymentResourceConfiguration(
                ManagedComputeClusterModelDeploymentResourceConfiguration
                        modelDeploymentResourceConfiguration) {
            this.modelDeploymentResourceConfiguration = modelDeploymentResourceConfiguration;
            this.__explicitlySet__.add("modelDeploymentResourceConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scalingPolicy")
        private ManagedComputeClusterWorkloadScalingPolicy scalingPolicy;

        public Builder scalingPolicy(ManagedComputeClusterWorkloadScalingPolicy scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            this.__explicitlySet__.add("scalingPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedComputeClusterModelDeployInfrastructureConfigDetails build() {
            ManagedComputeClusterModelDeployInfrastructureConfigDetails model =
                    new ManagedComputeClusterModelDeployInfrastructureConfigDetails(
                            this.computeTargetId,
                            this.modelDeploymentResourceConfiguration,
                            this.scalingPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedComputeClusterModelDeployInfrastructureConfigDetails model) {
            if (model.wasPropertyExplicitlySet("computeTargetId")) {
                this.computeTargetId(model.getComputeTargetId());
            }
            if (model.wasPropertyExplicitlySet("modelDeploymentResourceConfiguration")) {
                this.modelDeploymentResourceConfiguration(
                        model.getModelDeploymentResourceConfiguration());
            }
            if (model.wasPropertyExplicitlySet("scalingPolicy")) {
                this.scalingPolicy(model.getScalingPolicy());
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
    public ManagedComputeClusterModelDeployInfrastructureConfigDetails(
            String computeTargetId,
            ManagedComputeClusterModelDeploymentResourceConfiguration
                    modelDeploymentResourceConfiguration,
            ManagedComputeClusterWorkloadScalingPolicy scalingPolicy) {
        super();
        this.computeTargetId = computeTargetId;
        this.modelDeploymentResourceConfiguration = modelDeploymentResourceConfiguration;
        this.scalingPolicy = scalingPolicy;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Compute Target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeTargetId")
    private final String computeTargetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Compute Target.
     *
     * @return the value
     */
    public String getComputeTargetId() {
        return computeTargetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentResourceConfiguration")
    private final ManagedComputeClusterModelDeploymentResourceConfiguration
            modelDeploymentResourceConfiguration;

    public ManagedComputeClusterModelDeploymentResourceConfiguration
            getModelDeploymentResourceConfiguration() {
        return modelDeploymentResourceConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scalingPolicy")
    private final ManagedComputeClusterWorkloadScalingPolicy scalingPolicy;

    public ManagedComputeClusterWorkloadScalingPolicy getScalingPolicy() {
        return scalingPolicy;
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
        sb.append("ManagedComputeClusterModelDeployInfrastructureConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", computeTargetId=").append(String.valueOf(this.computeTargetId));
        sb.append(", modelDeploymentResourceConfiguration=")
                .append(String.valueOf(this.modelDeploymentResourceConfiguration));
        sb.append(", scalingPolicy=").append(String.valueOf(this.scalingPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedComputeClusterModelDeployInfrastructureConfigDetails)) {
            return false;
        }

        ManagedComputeClusterModelDeployInfrastructureConfigDetails other =
                (ManagedComputeClusterModelDeployInfrastructureConfigDetails) o;
        return java.util.Objects.equals(this.computeTargetId, other.computeTargetId)
                && java.util.Objects.equals(
                        this.modelDeploymentResourceConfiguration,
                        other.modelDeploymentResourceConfiguration)
                && java.util.Objects.equals(this.scalingPolicy, other.scalingPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeTargetId == null ? 43 : this.computeTargetId.hashCode());
        result =
                (result * PRIME)
                        + (this.modelDeploymentResourceConfiguration == null
                                ? 43
                                : this.modelDeploymentResourceConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.scalingPolicy == null ? 43 : this.scalingPolicy.hashCode());
        return result;
    }
}
