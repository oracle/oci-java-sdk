/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The standalone job infrastructure configuration with network egress settings preconfigured.
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
    builder = ManagedEgressStandaloneJobInfrastructureConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "jobInfrastructureType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedEgressStandaloneJobInfrastructureConfigurationDetails
        extends JobInfrastructureConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The shape used to launch the job run instances.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape used to launch the job run instances.
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * The size of the block storage volume to attach to the instance running the job
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBs")
        private Integer blockStorageSizeInGBs;

        /**
         * The size of the block storage volume to attach to the instance running the job
         *
         * @param blockStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder blockStorageSizeInGBs(Integer blockStorageSizeInGBs) {
            this.blockStorageSizeInGBs = blockStorageSizeInGBs;
            this.__explicitlySet__.add("blockStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobShapeConfigDetails")
        private JobShapeConfigDetails jobShapeConfigDetails;

        public Builder jobShapeConfigDetails(JobShapeConfigDetails jobShapeConfigDetails) {
            this.jobShapeConfigDetails = jobShapeConfigDetails;
            this.__explicitlySet__.add("jobShapeConfigDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedEgressStandaloneJobInfrastructureConfigurationDetails build() {
            ManagedEgressStandaloneJobInfrastructureConfigurationDetails model =
                    new ManagedEgressStandaloneJobInfrastructureConfigurationDetails(
                            this.shapeName, this.blockStorageSizeInGBs, this.jobShapeConfigDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedEgressStandaloneJobInfrastructureConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("blockStorageSizeInGBs")) {
                this.blockStorageSizeInGBs(model.getBlockStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("jobShapeConfigDetails")) {
                this.jobShapeConfigDetails(model.getJobShapeConfigDetails());
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
    public ManagedEgressStandaloneJobInfrastructureConfigurationDetails(
            String shapeName,
            Integer blockStorageSizeInGBs,
            JobShapeConfigDetails jobShapeConfigDetails) {
        super();
        this.shapeName = shapeName;
        this.blockStorageSizeInGBs = blockStorageSizeInGBs;
        this.jobShapeConfigDetails = jobShapeConfigDetails;
    }

    /**
     * The shape used to launch the job run instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape used to launch the job run instances.
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    /**
     * The size of the block storage volume to attach to the instance running the job
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBs")
    private final Integer blockStorageSizeInGBs;

    /**
     * The size of the block storage volume to attach to the instance running the job
     *
     * @return the value
     **/
    public Integer getBlockStorageSizeInGBs() {
        return blockStorageSizeInGBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobShapeConfigDetails")
    private final JobShapeConfigDetails jobShapeConfigDetails;

    public JobShapeConfigDetails getJobShapeConfigDetails() {
        return jobShapeConfigDetails;
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
        sb.append("ManagedEgressStandaloneJobInfrastructureConfigurationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", blockStorageSizeInGBs=").append(String.valueOf(this.blockStorageSizeInGBs));
        sb.append(", jobShapeConfigDetails=").append(String.valueOf(this.jobShapeConfigDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedEgressStandaloneJobInfrastructureConfigurationDetails)) {
            return false;
        }

        ManagedEgressStandaloneJobInfrastructureConfigurationDetails other =
                (ManagedEgressStandaloneJobInfrastructureConfigurationDetails) o;
        return java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.blockStorageSizeInGBs, other.blockStorageSizeInGBs)
                && java.util.Objects.equals(this.jobShapeConfigDetails, other.jobShapeConfigDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.blockStorageSizeInGBs == null
                                ? 43
                                : this.blockStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.jobShapeConfigDetails == null
                                ? 43
                                : this.jobShapeConfigDetails.hashCode());
        return result;
    }
}
