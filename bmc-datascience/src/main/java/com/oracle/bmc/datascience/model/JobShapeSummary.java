/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The compute shape used to launch a job compute instance. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobShapeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "coreCount", "memoryInGBs", "shapeSeries"})
    public JobShapeSummary(
            String name, Integer coreCount, Integer memoryInGBs, ShapeSeries shapeSeries) {
        super();
        this.name = name;
        this.coreCount = coreCount;
        this.memoryInGBs = memoryInGBs;
        this.shapeSeries = shapeSeries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the job shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the job shape.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The number of cores associated with this job run shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("coreCount")
        private Integer coreCount;

        /**
         * The number of cores associated with this job run shape.
         *
         * @param coreCount the value to set
         * @return this builder
         */
        public Builder coreCount(Integer coreCount) {
            this.coreCount = coreCount;
            this.__explicitlySet__.add("coreCount");
            return this;
        }
        /** The number of cores associated with this job shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Integer memoryInGBs;

        /**
         * The number of cores associated with this job shape.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         */
        public Builder memoryInGBs(Integer memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /** The family that the compute shape belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeSeries")
        private ShapeSeries shapeSeries;

        /**
         * The family that the compute shape belongs to.
         *
         * @param shapeSeries the value to set
         * @return this builder
         */
        public Builder shapeSeries(ShapeSeries shapeSeries) {
            this.shapeSeries = shapeSeries;
            this.__explicitlySet__.add("shapeSeries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobShapeSummary build() {
            JobShapeSummary model =
                    new JobShapeSummary(
                            this.name, this.coreCount, this.memoryInGBs, this.shapeSeries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobShapeSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("coreCount")) {
                this.coreCount(model.getCoreCount());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("shapeSeries")) {
                this.shapeSeries(model.getShapeSeries());
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

    /** The name of the job shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the job shape.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The number of cores associated with this job run shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("coreCount")
    private final Integer coreCount;

    /**
     * The number of cores associated with this job run shape.
     *
     * @return the value
     */
    public Integer getCoreCount() {
        return coreCount;
    }

    /** The number of cores associated with this job shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Integer memoryInGBs;

    /**
     * The number of cores associated with this job shape.
     *
     * @return the value
     */
    public Integer getMemoryInGBs() {
        return memoryInGBs;
    }

    /** The family that the compute shape belongs to. */
    public enum ShapeSeries implements com.oracle.bmc.http.internal.BmcEnum {
        AmdRome("AMD_ROME"),
        IntelSkylake("INTEL_SKYLAKE"),
        NvidiaGpu("NVIDIA_GPU"),
        Generic("GENERIC"),
        Legacy("LEGACY"),
        Arm("ARM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ShapeSeries.class);

        private final String value;
        private static java.util.Map<String, ShapeSeries> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeSeries v : ShapeSeries.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ShapeSeries(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeSeries create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShapeSeries', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The family that the compute shape belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeSeries")
    private final ShapeSeries shapeSeries;

    /**
     * The family that the compute shape belongs to.
     *
     * @return the value
     */
    public ShapeSeries getShapeSeries() {
        return shapeSeries;
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
        sb.append("JobShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", coreCount=").append(String.valueOf(this.coreCount));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", shapeSeries=").append(String.valueOf(this.shapeSeries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobShapeSummary)) {
            return false;
        }

        JobShapeSummary other = (JobShapeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.coreCount, other.coreCount)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.shapeSeries, other.shapeSeries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.coreCount == null ? 43 : this.coreCount.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result = (result * PRIME) + (this.shapeSeries == null ? 43 : this.shapeSeries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
