/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The model configuration details. <br>
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
        builder = ModelConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModelConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "modelId",
        "instanceConfiguration",
        "scalingPolicy",
        "bandwidthMbps",
        "maximumBandwidthMbps"
    })
    public ModelConfigurationDetails(
            String modelId,
            InstanceConfiguration instanceConfiguration,
            ScalingPolicy scalingPolicy,
            Integer bandwidthMbps,
            Integer maximumBandwidthMbps) {
        super();
        this.modelId = modelId;
        this.instanceConfiguration = instanceConfiguration;
        this.scalingPolicy = scalingPolicy;
        this.bandwidthMbps = bandwidthMbps;
        this.maximumBandwidthMbps = maximumBandwidthMbps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the model you want to deploy. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * The OCID of the model you want to deploy.
         *
         * @param modelId the value to set
         * @return this builder
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceConfiguration")
        private InstanceConfiguration instanceConfiguration;

        public Builder instanceConfiguration(InstanceConfiguration instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            this.__explicitlySet__.add("instanceConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scalingPolicy")
        private ScalingPolicy scalingPolicy;

        public Builder scalingPolicy(ScalingPolicy scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            this.__explicitlySet__.add("scalingPolicy");
            return this;
        }
        /** The minimum network bandwidth for the model deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("bandwidthMbps")
        private Integer bandwidthMbps;

        /**
         * The minimum network bandwidth for the model deployment.
         *
         * @param bandwidthMbps the value to set
         * @return this builder
         */
        public Builder bandwidthMbps(Integer bandwidthMbps) {
            this.bandwidthMbps = bandwidthMbps;
            this.__explicitlySet__.add("bandwidthMbps");
            return this;
        }
        /** The maximum network bandwidth for the model deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumBandwidthMbps")
        private Integer maximumBandwidthMbps;

        /**
         * The maximum network bandwidth for the model deployment.
         *
         * @param maximumBandwidthMbps the value to set
         * @return this builder
         */
        public Builder maximumBandwidthMbps(Integer maximumBandwidthMbps) {
            this.maximumBandwidthMbps = maximumBandwidthMbps;
            this.__explicitlySet__.add("maximumBandwidthMbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelConfigurationDetails build() {
            ModelConfigurationDetails model =
                    new ModelConfigurationDetails(
                            this.modelId,
                            this.instanceConfiguration,
                            this.scalingPolicy,
                            this.bandwidthMbps,
                            this.maximumBandwidthMbps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("instanceConfiguration")) {
                this.instanceConfiguration(model.getInstanceConfiguration());
            }
            if (model.wasPropertyExplicitlySet("scalingPolicy")) {
                this.scalingPolicy(model.getScalingPolicy());
            }
            if (model.wasPropertyExplicitlySet("bandwidthMbps")) {
                this.bandwidthMbps(model.getBandwidthMbps());
            }
            if (model.wasPropertyExplicitlySet("maximumBandwidthMbps")) {
                this.maximumBandwidthMbps(model.getMaximumBandwidthMbps());
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

    /** The OCID of the model you want to deploy. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * The OCID of the model you want to deploy.
     *
     * @return the value
     */
    public String getModelId() {
        return modelId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceConfiguration")
    private final InstanceConfiguration instanceConfiguration;

    public InstanceConfiguration getInstanceConfiguration() {
        return instanceConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scalingPolicy")
    private final ScalingPolicy scalingPolicy;

    public ScalingPolicy getScalingPolicy() {
        return scalingPolicy;
    }

    /** The minimum network bandwidth for the model deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("bandwidthMbps")
    private final Integer bandwidthMbps;

    /**
     * The minimum network bandwidth for the model deployment.
     *
     * @return the value
     */
    public Integer getBandwidthMbps() {
        return bandwidthMbps;
    }

    /** The maximum network bandwidth for the model deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumBandwidthMbps")
    private final Integer maximumBandwidthMbps;

    /**
     * The maximum network bandwidth for the model deployment.
     *
     * @return the value
     */
    public Integer getMaximumBandwidthMbps() {
        return maximumBandwidthMbps;
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
        sb.append("ModelConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("modelId=").append(String.valueOf(this.modelId));
        sb.append(", instanceConfiguration=").append(String.valueOf(this.instanceConfiguration));
        sb.append(", scalingPolicy=").append(String.valueOf(this.scalingPolicy));
        sb.append(", bandwidthMbps=").append(String.valueOf(this.bandwidthMbps));
        sb.append(", maximumBandwidthMbps=").append(String.valueOf(this.maximumBandwidthMbps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelConfigurationDetails)) {
            return false;
        }

        ModelConfigurationDetails other = (ModelConfigurationDetails) o;
        return java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.instanceConfiguration, other.instanceConfiguration)
                && java.util.Objects.equals(this.scalingPolicy, other.scalingPolicy)
                && java.util.Objects.equals(this.bandwidthMbps, other.bandwidthMbps)
                && java.util.Objects.equals(this.maximumBandwidthMbps, other.maximumBandwidthMbps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceConfiguration == null
                                ? 43
                                : this.instanceConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.scalingPolicy == null ? 43 : this.scalingPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.bandwidthMbps == null ? 43 : this.bandwidthMbps.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumBandwidthMbps == null
                                ? 43
                                : this.maximumBandwidthMbps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
