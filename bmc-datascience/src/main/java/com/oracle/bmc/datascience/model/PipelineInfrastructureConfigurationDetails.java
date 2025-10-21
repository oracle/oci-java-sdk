/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The infrastructure configuration details of a pipeline or a step. <br>
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
        builder = PipelineInfrastructureConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineInfrastructureConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "shapeName",
        "blockStorageSizeInGBs",
        "subnetId",
        "shapeConfigDetails",
        "blockStorageSizeInGBsParameterized"
    })
    public PipelineInfrastructureConfigurationDetails(
            String shapeName,
            Integer blockStorageSizeInGBs,
            String subnetId,
            PipelineShapeConfigDetails shapeConfigDetails,
            String blockStorageSizeInGBsParameterized) {
        super();
        this.shapeName = shapeName;
        this.blockStorageSizeInGBs = blockStorageSizeInGBs;
        this.subnetId = subnetId;
        this.shapeConfigDetails = shapeConfigDetails;
        this.blockStorageSizeInGBsParameterized = blockStorageSizeInGBsParameterized;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The shape used to launch the instance for all step runs in the pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape used to launch the instance for all step runs in the pipeline.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /** The size of the block storage volume to attach to the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBs")
        private Integer blockStorageSizeInGBs;

        /**
         * The size of the block storage volume to attach to the instance.
         *
         * @param blockStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder blockStorageSizeInGBs(Integer blockStorageSizeInGBs) {
            this.blockStorageSizeInGBs = blockStorageSizeInGBs;
            this.__explicitlySet__.add("blockStorageSizeInGBs");
            return this;
        }
        /**
         * The subnet to create a secondary vnic in to attach to the instance running the pipeline
         * step.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The subnet to create a secondary vnic in to attach to the instance running the pipeline
         * step.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfigDetails")
        private PipelineShapeConfigDetails shapeConfigDetails;

        public Builder shapeConfigDetails(PipelineShapeConfigDetails shapeConfigDetails) {
            this.shapeConfigDetails = shapeConfigDetails;
            this.__explicitlySet__.add("shapeConfigDetails");
            return this;
        }
        /**
         * The size of the block storage volume to attach to the pipeline step run instance
         * specified as a parameter. This overrides the blockStorageSizeInGBs value. The request
         * will fail if the parameters used are null or invalid.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBsParameterized")
        private String blockStorageSizeInGBsParameterized;

        /**
         * The size of the block storage volume to attach to the pipeline step run instance
         * specified as a parameter. This overrides the blockStorageSizeInGBs value. The request
         * will fail if the parameters used are null or invalid.
         *
         * @param blockStorageSizeInGBsParameterized the value to set
         * @return this builder
         */
        public Builder blockStorageSizeInGBsParameterized(
                String blockStorageSizeInGBsParameterized) {
            this.blockStorageSizeInGBsParameterized = blockStorageSizeInGBsParameterized;
            this.__explicitlySet__.add("blockStorageSizeInGBsParameterized");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineInfrastructureConfigurationDetails build() {
            PipelineInfrastructureConfigurationDetails model =
                    new PipelineInfrastructureConfigurationDetails(
                            this.shapeName,
                            this.blockStorageSizeInGBs,
                            this.subnetId,
                            this.shapeConfigDetails,
                            this.blockStorageSizeInGBsParameterized);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineInfrastructureConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("blockStorageSizeInGBs")) {
                this.blockStorageSizeInGBs(model.getBlockStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("shapeConfigDetails")) {
                this.shapeConfigDetails(model.getShapeConfigDetails());
            }
            if (model.wasPropertyExplicitlySet("blockStorageSizeInGBsParameterized")) {
                this.blockStorageSizeInGBsParameterized(
                        model.getBlockStorageSizeInGBsParameterized());
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

    /** The shape used to launch the instance for all step runs in the pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape used to launch the instance for all step runs in the pipeline.
     *
     * @return the value
     */
    public String getShapeName() {
        return shapeName;
    }

    /** The size of the block storage volume to attach to the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBs")
    private final Integer blockStorageSizeInGBs;

    /**
     * The size of the block storage volume to attach to the instance.
     *
     * @return the value
     */
    public Integer getBlockStorageSizeInGBs() {
        return blockStorageSizeInGBs;
    }

    /**
     * The subnet to create a secondary vnic in to attach to the instance running the pipeline step.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The subnet to create a secondary vnic in to attach to the instance running the pipeline step.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfigDetails")
    private final PipelineShapeConfigDetails shapeConfigDetails;

    public PipelineShapeConfigDetails getShapeConfigDetails() {
        return shapeConfigDetails;
    }

    /**
     * The size of the block storage volume to attach to the pipeline step run instance specified as
     * a parameter. This overrides the blockStorageSizeInGBs value. The request will fail if the
     * parameters used are null or invalid.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBsParameterized")
    private final String blockStorageSizeInGBsParameterized;

    /**
     * The size of the block storage volume to attach to the pipeline step run instance specified as
     * a parameter. This overrides the blockStorageSizeInGBs value. The request will fail if the
     * parameters used are null or invalid.
     *
     * @return the value
     */
    public String getBlockStorageSizeInGBsParameterized() {
        return blockStorageSizeInGBsParameterized;
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
        sb.append("PipelineInfrastructureConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", blockStorageSizeInGBs=").append(String.valueOf(this.blockStorageSizeInGBs));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", shapeConfigDetails=").append(String.valueOf(this.shapeConfigDetails));
        sb.append(", blockStorageSizeInGBsParameterized=")
                .append(String.valueOf(this.blockStorageSizeInGBsParameterized));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineInfrastructureConfigurationDetails)) {
            return false;
        }

        PipelineInfrastructureConfigurationDetails other =
                (PipelineInfrastructureConfigurationDetails) o;
        return java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.blockStorageSizeInGBs, other.blockStorageSizeInGBs)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.shapeConfigDetails, other.shapeConfigDetails)
                && java.util.Objects.equals(
                        this.blockStorageSizeInGBsParameterized,
                        other.blockStorageSizeInGBsParameterized)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.blockStorageSizeInGBs == null
                                ? 43
                                : this.blockStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.shapeConfigDetails == null
                                ? 43
                                : this.shapeConfigDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.blockStorageSizeInGBsParameterized == null
                                ? 43
                                : this.blockStorageSizeInGBsParameterized.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
