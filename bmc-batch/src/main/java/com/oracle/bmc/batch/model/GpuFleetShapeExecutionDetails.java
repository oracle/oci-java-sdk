/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * Details about the GPU shape which was used for the task execution.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GpuFleetShapeExecutionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GpuFleetShapeExecutionDetails extends FleetShapeExecutionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * Name of the shape.
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * Number of OCPUs provided by the shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Integer ocpus;

        /**
         * Number of OCPUs provided by the shape.
         * @param ocpus the value to set
         * @return this builder
         **/
        public Builder ocpus(Integer ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /**
         * Amount of memory in GBs provided by the shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Integer memoryInGBs;

        /**
         * Amount of memory in GBs provided by the shape.
         * @param memoryInGBs the value to set
         * @return this builder
         **/
        public Builder memoryInGBs(Integer memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /**
         * Amount of disk space provided by the shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskSizeInGBs")
        private Integer diskSizeInGBs;

        /**
         * Amount of disk space provided by the shape.
         * @param diskSizeInGBs the value to set
         * @return this builder
         **/
        public Builder diskSizeInGBs(Integer diskSizeInGBs) {
            this.diskSizeInGBs = diskSizeInGBs;
            this.__explicitlySet__.add("diskSizeInGBs");
            return this;
        }
        /**
         * The number of GPUs provided by the shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gpus")
        private Integer gpus;

        /**
         * The number of GPUs provided by the shape.
         * @param gpus the value to set
         * @return this builder
         **/
        public Builder gpus(Integer gpus) {
            this.gpus = gpus;
            this.__explicitlySet__.add("gpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GpuFleetShapeExecutionDetails build() {
            GpuFleetShapeExecutionDetails model =
                    new GpuFleetShapeExecutionDetails(
                            this.shapeName,
                            this.ocpus,
                            this.memoryInGBs,
                            this.diskSizeInGBs,
                            this.gpus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GpuFleetShapeExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("diskSizeInGBs")) {
                this.diskSizeInGBs(model.getDiskSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("gpus")) {
                this.gpus(model.getGpus());
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
    public GpuFleetShapeExecutionDetails(
            String shapeName,
            Integer ocpus,
            Integer memoryInGBs,
            Integer diskSizeInGBs,
            Integer gpus) {
        super();
        this.shapeName = shapeName;
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
        this.diskSizeInGBs = diskSizeInGBs;
        this.gpus = gpus;
    }

    /**
     * Name of the shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * Name of the shape.
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    /**
     * Number of OCPUs provided by the shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Integer ocpus;

    /**
     * Number of OCPUs provided by the shape.
     * @return the value
     **/
    public Integer getOcpus() {
        return ocpus;
    }

    /**
     * Amount of memory in GBs provided by the shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Integer memoryInGBs;

    /**
     * Amount of memory in GBs provided by the shape.
     * @return the value
     **/
    public Integer getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * Amount of disk space provided by the shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskSizeInGBs")
    private final Integer diskSizeInGBs;

    /**
     * Amount of disk space provided by the shape.
     * @return the value
     **/
    public Integer getDiskSizeInGBs() {
        return diskSizeInGBs;
    }

    /**
     * The number of GPUs provided by the shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    private final Integer gpus;

    /**
     * The number of GPUs provided by the shape.
     * @return the value
     **/
    public Integer getGpus() {
        return gpus;
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
        sb.append("GpuFleetShapeExecutionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", diskSizeInGBs=").append(String.valueOf(this.diskSizeInGBs));
        sb.append(", gpus=").append(String.valueOf(this.gpus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GpuFleetShapeExecutionDetails)) {
            return false;
        }

        GpuFleetShapeExecutionDetails other = (GpuFleetShapeExecutionDetails) o;
        return java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.diskSizeInGBs, other.diskSizeInGBs)
                && java.util.Objects.equals(this.gpus, other.gpus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.diskSizeInGBs == null ? 43 : this.diskSizeInGBs.hashCode());
        result = (result * PRIME) + (this.gpus == null ? 43 : this.gpus.hashCode());
        return result;
    }
}
