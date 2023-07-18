/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The shape configuration requested for the instance.
 *
 * <p>If the parameter is provided, the instance is created with the resources that you specify. If
 * some properties are missing or the entire parameter is not provided, the instance is created with
 * the default configuration values for the {@code shape} that you specify.
 *
 * <p>Each shape only supports certain configurable values. If the values that you provide are not
 * valid for the specified {@code shape}, an error is returned. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LaunchInstanceShapeConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LaunchInstanceShapeConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ocpus",
        "vcpus",
        "memoryInGBs",
        "baselineOcpuUtilization",
        "nvmes"
    })
    public LaunchInstanceShapeConfigDetails(
            Float ocpus,
            Integer vcpus,
            Float memoryInGBs,
            BaselineOcpuUtilization baselineOcpuUtilization,
            Integer nvmes) {
        super();
        this.ocpus = ocpus;
        this.vcpus = vcpus;
        this.memoryInGBs = memoryInGBs;
        this.baselineOcpuUtilization = baselineOcpuUtilization;
        this.nvmes = nvmes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of OCPUs available to the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        /**
         * The total number of OCPUs available to the instance.
         *
         * @param ocpus the value to set
         * @return this builder
         */
        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /**
         * The total number of VCPUs available to the instance. This can be used instead of OCPUs,
         * in which case the actual number of OCPUs will be calculated based on this value and the
         * actual hardware. This must be a multiple of 2.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcpus")
        private Integer vcpus;

        /**
         * The total number of VCPUs available to the instance. This can be used instead of OCPUs,
         * in which case the actual number of OCPUs will be calculated based on this value and the
         * actual hardware. This must be a multiple of 2.
         *
         * @param vcpus the value to set
         * @return this builder
         */
        public Builder vcpus(Integer vcpus) {
            this.vcpus = vcpus;
            this.__explicitlySet__.add("vcpus");
            return this;
        }
        /** The total amount of memory available to the instance, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        /**
         * The total amount of memory available to the instance, in gigabytes.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         */
        public Builder memoryInGBs(Float memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /**
         * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute
         * blank for a non-burstable instance, or explicitly specify non-burstable with {@code
         * BASELINE_1_1}.
         *
         * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of
         * an OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code
         * BASELINE_1_1} - baseline usage is an entire OCPU. This represents a non-burstable
         * instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("baselineOcpuUtilization")
        private BaselineOcpuUtilization baselineOcpuUtilization;

        /**
         * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute
         * blank for a non-burstable instance, or explicitly specify non-burstable with {@code
         * BASELINE_1_1}.
         *
         * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of
         * an OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code
         * BASELINE_1_1} - baseline usage is an entire OCPU. This represents a non-burstable
         * instance.
         *
         * @param baselineOcpuUtilization the value to set
         * @return this builder
         */
        public Builder baselineOcpuUtilization(BaselineOcpuUtilization baselineOcpuUtilization) {
            this.baselineOcpuUtilization = baselineOcpuUtilization;
            this.__explicitlySet__.add("baselineOcpuUtilization");
            return this;
        }
        /**
         * The number of NVMe drives to be used for storage. A single drive has 6.8 TB available.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nvmes")
        private Integer nvmes;

        /**
         * The number of NVMe drives to be used for storage. A single drive has 6.8 TB available.
         *
         * @param nvmes the value to set
         * @return this builder
         */
        public Builder nvmes(Integer nvmes) {
            this.nvmes = nvmes;
            this.__explicitlySet__.add("nvmes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchInstanceShapeConfigDetails build() {
            LaunchInstanceShapeConfigDetails model =
                    new LaunchInstanceShapeConfigDetails(
                            this.ocpus,
                            this.vcpus,
                            this.memoryInGBs,
                            this.baselineOcpuUtilization,
                            this.nvmes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchInstanceShapeConfigDetails model) {
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("vcpus")) {
                this.vcpus(model.getVcpus());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("baselineOcpuUtilization")) {
                this.baselineOcpuUtilization(model.getBaselineOcpuUtilization());
            }
            if (model.wasPropertyExplicitlySet("nvmes")) {
                this.nvmes(model.getNvmes());
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

    /** The total number of OCPUs available to the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Float ocpus;

    /**
     * The total number of OCPUs available to the instance.
     *
     * @return the value
     */
    public Float getOcpus() {
        return ocpus;
    }

    /**
     * The total number of VCPUs available to the instance. This can be used instead of OCPUs, in
     * which case the actual number of OCPUs will be calculated based on this value and the actual
     * hardware. This must be a multiple of 2.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcpus")
    private final Integer vcpus;

    /**
     * The total number of VCPUs available to the instance. This can be used instead of OCPUs, in
     * which case the actual number of OCPUs will be calculated based on this value and the actual
     * hardware. This must be a multiple of 2.
     *
     * @return the value
     */
    public Integer getVcpus() {
        return vcpus;
    }

    /** The total amount of memory available to the instance, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Float memoryInGBs;

    /**
     * The total amount of memory available to the instance, in gigabytes.
     *
     * @return the value
     */
    public Float getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank
     * for a non-burstable instance, or explicitly specify non-burstable with {@code BASELINE_1_1}.
     *
     * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of an
     * OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code BASELINE_1_1} -
     * baseline usage is an entire OCPU. This represents a non-burstable instance.
     */
    public enum BaselineOcpuUtilization implements com.oracle.bmc.http.internal.BmcEnum {
        Baseline18("BASELINE_1_8"),
        Baseline12("BASELINE_1_2"),
        Baseline11("BASELINE_1_1"),
        ;

        private final String value;
        private static java.util.Map<String, BaselineOcpuUtilization> map;

        static {
            map = new java.util.HashMap<>();
            for (BaselineOcpuUtilization v : BaselineOcpuUtilization.values()) {
                map.put(v.getValue(), v);
            }
        }

        BaselineOcpuUtilization(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BaselineOcpuUtilization create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid BaselineOcpuUtilization: " + key);
        }
    };
    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank
     * for a non-burstable instance, or explicitly specify non-burstable with {@code BASELINE_1_1}.
     *
     * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of an
     * OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code BASELINE_1_1} -
     * baseline usage is an entire OCPU. This represents a non-burstable instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baselineOcpuUtilization")
    private final BaselineOcpuUtilization baselineOcpuUtilization;

    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank
     * for a non-burstable instance, or explicitly specify non-burstable with {@code BASELINE_1_1}.
     *
     * <p>The following values are supported: - {@code BASELINE_1_8} - baseline usage is 1/8 of an
     * OCPU. - {@code BASELINE_1_2} - baseline usage is 1/2 of an OCPU. - {@code BASELINE_1_1} -
     * baseline usage is an entire OCPU. This represents a non-burstable instance.
     *
     * @return the value
     */
    public BaselineOcpuUtilization getBaselineOcpuUtilization() {
        return baselineOcpuUtilization;
    }

    /** The number of NVMe drives to be used for storage. A single drive has 6.8 TB available. */
    @com.fasterxml.jackson.annotation.JsonProperty("nvmes")
    private final Integer nvmes;

    /**
     * The number of NVMe drives to be used for storage. A single drive has 6.8 TB available.
     *
     * @return the value
     */
    public Integer getNvmes() {
        return nvmes;
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
        sb.append("LaunchInstanceShapeConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", vcpus=").append(String.valueOf(this.vcpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", baselineOcpuUtilization=")
                .append(String.valueOf(this.baselineOcpuUtilization));
        sb.append(", nvmes=").append(String.valueOf(this.nvmes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchInstanceShapeConfigDetails)) {
            return false;
        }

        LaunchInstanceShapeConfigDetails other = (LaunchInstanceShapeConfigDetails) o;
        return java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.vcpus, other.vcpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(
                        this.baselineOcpuUtilization, other.baselineOcpuUtilization)
                && java.util.Objects.equals(this.nvmes, other.nvmes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.vcpus == null ? 43 : this.vcpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.baselineOcpuUtilization == null
                                ? 43
                                : this.baselineOcpuUtilization.hashCode());
        result = (result * PRIME) + (this.nvmes == null ? 43 : this.nvmes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
