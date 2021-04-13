/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The shape configuration requested for the instance.
 * <p>
 * If the parameter is provided, the instance is created with the resources that you specify. If some
 * properties are missing or the entire parameter is not provided, the instance is created
 * with the default configuration values for the `shape` that you specify.
 * <p>
 * Each shape only supports certain configurable values. If the values that you provide are not valid for the
 * specified `shape`, an error is returned.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LaunchInstanceShapeConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LaunchInstanceShapeConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        public Builder memoryInGBs(Float memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("baselineOcpuUtilization")
        private BaselineOcpuUtilization baselineOcpuUtilization;

        public Builder baselineOcpuUtilization(BaselineOcpuUtilization baselineOcpuUtilization) {
            this.baselineOcpuUtilization = baselineOcpuUtilization;
            this.__explicitlySet__.add("baselineOcpuUtilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchInstanceShapeConfigDetails build() {
            LaunchInstanceShapeConfigDetails __instance__ =
                    new LaunchInstanceShapeConfigDetails(
                            ocpus, memoryInGBs, baselineOcpuUtilization);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchInstanceShapeConfigDetails o) {
            Builder copiedBuilder =
                    ocpus(o.getOcpus())
                            .memoryInGBs(o.getMemoryInGBs())
                            .baselineOcpuUtilization(o.getBaselineOcpuUtilization());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The total number of OCPUs available to the instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    Float ocpus;

    /**
     * The total amount of memory available to the instance, in gigabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    Float memoryInGBs;
    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank for a
     * non-burstable instance, or explicitly specify non-burstable with `BASELINE_1_1`.
     * <p>
     * The following values are supported:
     * - `BASELINE_1_8` - baseline usage is 1/8 of an OCPU.
     * - `BASELINE_1_2` - baseline usage is 1/2 of an OCPU.
     * - `BASELINE_1_1` - baseline usage is an entire OCPU. This represents a non-burstable instance.
     *
     **/
    public enum BaselineOcpuUtilization {
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
     * The baseline OCPU utilization for a subcore burstable VM instance. Leave this attribute blank for a
     * non-burstable instance, or explicitly specify non-burstable with `BASELINE_1_1`.
     * <p>
     * The following values are supported:
     * - `BASELINE_1_8` - baseline usage is 1/8 of an OCPU.
     * - `BASELINE_1_2` - baseline usage is 1/2 of an OCPU.
     * - `BASELINE_1_1` - baseline usage is an entire OCPU. This represents a non-burstable instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineOcpuUtilization")
    BaselineOcpuUtilization baselineOcpuUtilization;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
