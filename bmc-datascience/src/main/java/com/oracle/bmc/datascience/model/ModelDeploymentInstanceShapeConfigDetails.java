/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details for the model-deployment instance shape configuration.
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
    builder = ModelDeploymentInstanceShapeConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ModelDeploymentInstanceShapeConfigDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ocpus", "memoryInGBs", "cpuBaseline"})
    public ModelDeploymentInstanceShapeConfigDetails(
            Float ocpus, Float memoryInGBs, CpuBaseline cpuBaseline) {
        super();
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
        this.cpuBaseline = cpuBaseline;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A model-deployment instance of type VM.Standard.E3.Flex or VM.Standard.E4.Flex allows the ocpu count to be specified with in the range of 1 to 64 ocpu. VM.Standard3.Flex OCPU range is between 1 to 32 ocpu and for VM.Optimized3.Flex OCPU range is 1 to 18 ocpu.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        /**
         * A model-deployment instance of type VM.Standard.E3.Flex or VM.Standard.E4.Flex allows the ocpu count to be specified with in the range of 1 to 64 ocpu. VM.Standard3.Flex OCPU range is between 1 to 32 ocpu and for VM.Optimized3.Flex OCPU range is 1 to 18 ocpu.
         *
         * @param ocpus the value to set
         * @return this builder
         **/
        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /**
         * A model-deployment instance of type VM.Standard.E3.Flex or VM.Standard.E4.Flex allows the memory to be specified with in the range of 6 to 1024 GB. VM.Standard3.Flex memory range is between 6 to 512 GB and VM.Optimized3.Flex memory range is between 6 to 256 GB.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        /**
         * A model-deployment instance of type VM.Standard.E3.Flex or VM.Standard.E4.Flex allows the memory to be specified with in the range of 6 to 1024 GB. VM.Standard3.Flex memory range is between 6 to 512 GB and VM.Optimized3.Flex memory range is between 6 to 256 GB.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         **/
        public Builder memoryInGBs(Float memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /**
         * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is left blank, it will default to {@code BASELINE_1_1}.
         * The following values are supported:
         *   BASELINE_1_8 - baseline usage is 1/8 of an OCPU.
         *   BASELINE_1_2 - baseline usage is 1/2 of an OCPU.
         *   BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuBaseline")
        private CpuBaseline cpuBaseline;

        /**
         * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is left blank, it will default to {@code BASELINE_1_1}.
         * The following values are supported:
         *   BASELINE_1_8 - baseline usage is 1/8 of an OCPU.
         *   BASELINE_1_2 - baseline usage is 1/2 of an OCPU.
         *   BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable instance.
         *
         * @param cpuBaseline the value to set
         * @return this builder
         **/
        public Builder cpuBaseline(CpuBaseline cpuBaseline) {
            this.cpuBaseline = cpuBaseline;
            this.__explicitlySet__.add("cpuBaseline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelDeploymentInstanceShapeConfigDetails build() {
            ModelDeploymentInstanceShapeConfigDetails model =
                    new ModelDeploymentInstanceShapeConfigDetails(
                            this.ocpus, this.memoryInGBs, this.cpuBaseline);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDeploymentInstanceShapeConfigDetails model) {
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("cpuBaseline")) {
                this.cpuBaseline(model.getCpuBaseline());
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

    /**
     * A model-deployment instance of type VM.Standard.E3.Flex or VM.Standard.E4.Flex allows the ocpu count to be specified with in the range of 1 to 64 ocpu. VM.Standard3.Flex OCPU range is between 1 to 32 ocpu and for VM.Optimized3.Flex OCPU range is 1 to 18 ocpu.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Float ocpus;

    /**
     * A model-deployment instance of type VM.Standard.E3.Flex or VM.Standard.E4.Flex allows the ocpu count to be specified with in the range of 1 to 64 ocpu. VM.Standard3.Flex OCPU range is between 1 to 32 ocpu and for VM.Optimized3.Flex OCPU range is 1 to 18 ocpu.
     *
     * @return the value
     **/
    public Float getOcpus() {
        return ocpus;
    }

    /**
     * A model-deployment instance of type VM.Standard.E3.Flex or VM.Standard.E4.Flex allows the memory to be specified with in the range of 6 to 1024 GB. VM.Standard3.Flex memory range is between 6 to 512 GB and VM.Optimized3.Flex memory range is between 6 to 256 GB.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Float memoryInGBs;

    /**
     * A model-deployment instance of type VM.Standard.E3.Flex or VM.Standard.E4.Flex allows the memory to be specified with in the range of 6 to 1024 GB. VM.Standard3.Flex memory range is between 6 to 512 GB and VM.Optimized3.Flex memory range is between 6 to 256 GB.
     *
     * @return the value
     **/
    public Float getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is left blank, it will default to {@code BASELINE_1_1}.
     * The following values are supported:
     *   BASELINE_1_8 - baseline usage is 1/8 of an OCPU.
     *   BASELINE_1_2 - baseline usage is 1/2 of an OCPU.
     *   BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable instance.
     *
     **/
    public enum CpuBaseline {
        Baseline18("BASELINE_1_8"),
        Baseline12("BASELINE_1_2"),
        Baseline11("BASELINE_1_1"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CpuBaseline.class);

        private final String value;
        private static java.util.Map<String, CpuBaseline> map;

        static {
            map = new java.util.HashMap<>();
            for (CpuBaseline v : CpuBaseline.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CpuBaseline(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CpuBaseline create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CpuBaseline', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is left blank, it will default to {@code BASELINE_1_1}.
     * The following values are supported:
     *   BASELINE_1_8 - baseline usage is 1/8 of an OCPU.
     *   BASELINE_1_2 - baseline usage is 1/2 of an OCPU.
     *   BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuBaseline")
    private final CpuBaseline cpuBaseline;

    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is left blank, it will default to {@code BASELINE_1_1}.
     * The following values are supported:
     *   BASELINE_1_8 - baseline usage is 1/8 of an OCPU.
     *   BASELINE_1_2 - baseline usage is 1/2 of an OCPU.
     *   BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable instance.
     *
     * @return the value
     **/
    public CpuBaseline getCpuBaseline() {
        return cpuBaseline;
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
        sb.append("ModelDeploymentInstanceShapeConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", cpuBaseline=").append(String.valueOf(this.cpuBaseline));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDeploymentInstanceShapeConfigDetails)) {
            return false;
        }

        ModelDeploymentInstanceShapeConfigDetails other =
                (ModelDeploymentInstanceShapeConfigDetails) o;
        return java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.cpuBaseline, other.cpuBaseline)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result = (result * PRIME) + (this.cpuBaseline == null ? 43 : this.cpuBaseline.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
