/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The infrastructure configuration details of a pipeline or a step. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PipelineInfrastructureConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class PipelineInfrastructureConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shapeName", "blockStorageSizeInGBs", "shapeConfigDetails"})
    public PipelineInfrastructureConfigurationDetails(
            String shapeName,
            Integer blockStorageSizeInGBs,
            PipelineShapeConfigDetails shapeConfigDetails) {
        super();
        this.shapeName = shapeName;
        this.blockStorageSizeInGBs = blockStorageSizeInGBs;
        this.shapeConfigDetails = shapeConfigDetails;
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

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfigDetails")
        private PipelineShapeConfigDetails shapeConfigDetails;

        public Builder shapeConfigDetails(PipelineShapeConfigDetails shapeConfigDetails) {
            this.shapeConfigDetails = shapeConfigDetails;
            this.__explicitlySet__.add("shapeConfigDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineInfrastructureConfigurationDetails build() {
            PipelineInfrastructureConfigurationDetails model =
                    new PipelineInfrastructureConfigurationDetails(
                            this.shapeName, this.blockStorageSizeInGBs, this.shapeConfigDetails);
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
            if (model.wasPropertyExplicitlySet("shapeConfigDetails")) {
                this.shapeConfigDetails(model.getShapeConfigDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfigDetails")
    private final PipelineShapeConfigDetails shapeConfigDetails;

    public PipelineShapeConfigDetails getShapeConfigDetails() {
        return shapeConfigDetails;
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
        sb.append(", shapeConfigDetails=").append(String.valueOf(this.shapeConfigDetails));
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
                && java.util.Objects.equals(this.shapeConfigDetails, other.shapeConfigDetails)
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
        result =
                (result * PRIME)
                        + (this.shapeConfigDetails == null
                                ? 43
                                : this.shapeConfigDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
