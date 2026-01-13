/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details for the pipeline step run shape configuration. Specify only when a flex shape is
 * selected. <br>
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
        builder = PipelineShapeConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineShapeConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "ocpus",
        "memoryInGBs",
        "cpuBaseline",
        "ocpusParameterized",
        "memoryInGBsParameterized"
    })
    public PipelineShapeConfigDetails(
            Float ocpus,
            Float memoryInGBs,
            CpuBaseline cpuBaseline,
            String ocpusParameterized,
            String memoryInGBsParameterized) {
        super();
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
        this.cpuBaseline = cpuBaseline;
        this.ocpusParameterized = ocpusParameterized;
        this.memoryInGBsParameterized = memoryInGBsParameterized;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of OCPUs available to the pipeline step run instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        /**
         * The total number of OCPUs available to the pipeline step run instance.
         *
         * @param ocpus the value to set
         * @return this builder
         */
        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /** The total amount of memory available to the pipeline step run instance GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        /**
         * The total amount of memory available to the pipeline step run instance GBs.
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
         * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is
         * left blank, it will default to {@code BASELINE_1_1}. The following values are supported:
         * BASELINE_1_8 - baseline usage is 1/8 of an OCPU. BASELINE_1_2 - baseline usage is 1/2 of
         * an OCPU. BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable
         * instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuBaseline")
        private CpuBaseline cpuBaseline;

        /**
         * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is
         * left blank, it will default to {@code BASELINE_1_1}. The following values are supported:
         * BASELINE_1_8 - baseline usage is 1/8 of an OCPU. BASELINE_1_2 - baseline usage is 1/2 of
         * an OCPU. BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable
         * instance.
         *
         * @param cpuBaseline the value to set
         * @return this builder
         */
        public Builder cpuBaseline(CpuBaseline cpuBaseline) {
            this.cpuBaseline = cpuBaseline;
            this.__explicitlySet__.add("cpuBaseline");
            return this;
        }
        /**
         * The total number of OCPUs available to the pipeline step run instance specified as a
         * parameter. This overrides the ocpus value. The request will fail if the parameters used
         * are null or invalid.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpusParameterized")
        private String ocpusParameterized;

        /**
         * The total number of OCPUs available to the pipeline step run instance specified as a
         * parameter. This overrides the ocpus value. The request will fail if the parameters used
         * are null or invalid.
         *
         * @param ocpusParameterized the value to set
         * @return this builder
         */
        public Builder ocpusParameterized(String ocpusParameterized) {
            this.ocpusParameterized = ocpusParameterized;
            this.__explicitlySet__.add("ocpusParameterized");
            return this;
        }
        /**
         * The total amount of memory available to the pipeline step run instance in GBs specified
         * as a parameter. This overrides the memoryInGBs value. The request will fail if the
         * parameters used are null or invalid.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBsParameterized")
        private String memoryInGBsParameterized;

        /**
         * The total amount of memory available to the pipeline step run instance in GBs specified
         * as a parameter. This overrides the memoryInGBs value. The request will fail if the
         * parameters used are null or invalid.
         *
         * @param memoryInGBsParameterized the value to set
         * @return this builder
         */
        public Builder memoryInGBsParameterized(String memoryInGBsParameterized) {
            this.memoryInGBsParameterized = memoryInGBsParameterized;
            this.__explicitlySet__.add("memoryInGBsParameterized");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineShapeConfigDetails build() {
            PipelineShapeConfigDetails model =
                    new PipelineShapeConfigDetails(
                            this.ocpus,
                            this.memoryInGBs,
                            this.cpuBaseline,
                            this.ocpusParameterized,
                            this.memoryInGBsParameterized);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineShapeConfigDetails model) {
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("cpuBaseline")) {
                this.cpuBaseline(model.getCpuBaseline());
            }
            if (model.wasPropertyExplicitlySet("ocpusParameterized")) {
                this.ocpusParameterized(model.getOcpusParameterized());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBsParameterized")) {
                this.memoryInGBsParameterized(model.getMemoryInGBsParameterized());
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

    /** The total number of OCPUs available to the pipeline step run instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Float ocpus;

    /**
     * The total number of OCPUs available to the pipeline step run instance.
     *
     * @return the value
     */
    public Float getOcpus() {
        return ocpus;
    }

    /** The total amount of memory available to the pipeline step run instance GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Float memoryInGBs;

    /**
     * The total amount of memory available to the pipeline step run instance GBs.
     *
     * @return the value
     */
    public Float getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is left
     * blank, it will default to {@code BASELINE_1_1}. The following values are supported:
     * BASELINE_1_8 - baseline usage is 1/8 of an OCPU. BASELINE_1_2 - baseline usage is 1/2 of an
     * OCPU. BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable
     * instance.
     */
    public enum CpuBaseline implements com.oracle.bmc.http.internal.BmcEnum {
        Baseline18("BASELINE_1_8"),
        Baseline12("BASELINE_1_2"),
        Baseline11("BASELINE_1_1"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is left
     * blank, it will default to {@code BASELINE_1_1}. The following values are supported:
     * BASELINE_1_8 - baseline usage is 1/8 of an OCPU. BASELINE_1_2 - baseline usage is 1/2 of an
     * OCPU. BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable
     * instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuBaseline")
    private final CpuBaseline cpuBaseline;

    /**
     * The baseline OCPU utilization for a subcore burstable VM instance. If this attribute is left
     * blank, it will default to {@code BASELINE_1_1}. The following values are supported:
     * BASELINE_1_8 - baseline usage is 1/8 of an OCPU. BASELINE_1_2 - baseline usage is 1/2 of an
     * OCPU. BASELINE_1_1 - baseline usage is an entire OCPU. This represents a non-burstable
     * instance.
     *
     * @return the value
     */
    public CpuBaseline getCpuBaseline() {
        return cpuBaseline;
    }

    /**
     * The total number of OCPUs available to the pipeline step run instance specified as a
     * parameter. This overrides the ocpus value. The request will fail if the parameters used are
     * null or invalid.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpusParameterized")
    private final String ocpusParameterized;

    /**
     * The total number of OCPUs available to the pipeline step run instance specified as a
     * parameter. This overrides the ocpus value. The request will fail if the parameters used are
     * null or invalid.
     *
     * @return the value
     */
    public String getOcpusParameterized() {
        return ocpusParameterized;
    }

    /**
     * The total amount of memory available to the pipeline step run instance in GBs specified as a
     * parameter. This overrides the memoryInGBs value. The request will fail if the parameters used
     * are null or invalid.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBsParameterized")
    private final String memoryInGBsParameterized;

    /**
     * The total amount of memory available to the pipeline step run instance in GBs specified as a
     * parameter. This overrides the memoryInGBs value. The request will fail if the parameters used
     * are null or invalid.
     *
     * @return the value
     */
    public String getMemoryInGBsParameterized() {
        return memoryInGBsParameterized;
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
        sb.append("PipelineShapeConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", cpuBaseline=").append(String.valueOf(this.cpuBaseline));
        sb.append(", ocpusParameterized=").append(String.valueOf(this.ocpusParameterized));
        sb.append(", memoryInGBsParameterized=")
                .append(String.valueOf(this.memoryInGBsParameterized));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineShapeConfigDetails)) {
            return false;
        }

        PipelineShapeConfigDetails other = (PipelineShapeConfigDetails) o;
        return java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.cpuBaseline, other.cpuBaseline)
                && java.util.Objects.equals(this.ocpusParameterized, other.ocpusParameterized)
                && java.util.Objects.equals(
                        this.memoryInGBsParameterized, other.memoryInGBsParameterized)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result = (result * PRIME) + (this.cpuBaseline == null ? 43 : this.cpuBaseline.hashCode());
        result =
                (result * PRIME)
                        + (this.ocpusParameterized == null
                                ? 43
                                : this.ocpusParameterized.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryInGBsParameterized == null
                                ? 43
                                : this.memoryInGBsParameterized.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
