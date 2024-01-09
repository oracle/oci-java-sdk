/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains CPU statistics. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HostCpuStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resourceName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HostCpuStatistics extends HostResourceStatistics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Double usage;

        public Builder usage(Double usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Double capacity;

        public Builder capacity(Double capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
        private Double utilizationPercent;

        public Builder utilizationPercent(Double utilizationPercent) {
            this.utilizationPercent = utilizationPercent;
            this.__explicitlySet__.add("utilizationPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
        private Double usageChangePercent;

        public Builder usageChangePercent(Double usageChangePercent) {
            this.usageChangePercent = usageChangePercent;
            this.__explicitlySet__.add("usageChangePercent");
            return this;
        }
        /**
         * The baseline utilization is a fraction of each CPU core expressed in percentages, either
         * 12.5% or 50%. The baseline provides the minimum CPUs that can be used constantly.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuBaseline")
        private Double cpuBaseline;

        /**
         * The baseline utilization is a fraction of each CPU core expressed in percentages, either
         * 12.5% or 50%. The baseline provides the minimum CPUs that can be used constantly.
         *
         * @param cpuBaseline the value to set
         * @return this builder
         */
        public Builder cpuBaseline(Double cpuBaseline) {
            this.cpuBaseline = cpuBaseline;
            this.__explicitlySet__.add("cpuBaseline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("load")
        private SummaryStatistics load;

        public Builder load(SummaryStatistics load) {
            this.load = load;
            this.__explicitlySet__.add("load");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostCpuStatistics build() {
            HostCpuStatistics model =
                    new HostCpuStatistics(
                            this.usage,
                            this.capacity,
                            this.utilizationPercent,
                            this.usageChangePercent,
                            this.cpuBaseline,
                            this.load);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostCpuStatistics model) {
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("utilizationPercent")) {
                this.utilizationPercent(model.getUtilizationPercent());
            }
            if (model.wasPropertyExplicitlySet("usageChangePercent")) {
                this.usageChangePercent(model.getUsageChangePercent());
            }
            if (model.wasPropertyExplicitlySet("cpuBaseline")) {
                this.cpuBaseline(model.getCpuBaseline());
            }
            if (model.wasPropertyExplicitlySet("load")) {
                this.load(model.getLoad());
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

    @Deprecated
    public HostCpuStatistics(
            Double usage,
            Double capacity,
            Double utilizationPercent,
            Double usageChangePercent,
            Double cpuBaseline,
            SummaryStatistics load) {
        super(usage, capacity, utilizationPercent, usageChangePercent);
        this.cpuBaseline = cpuBaseline;
        this.load = load;
    }

    /**
     * The baseline utilization is a fraction of each CPU core expressed in percentages, either
     * 12.5% or 50%. The baseline provides the minimum CPUs that can be used constantly.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuBaseline")
    private final Double cpuBaseline;

    /**
     * The baseline utilization is a fraction of each CPU core expressed in percentages, either
     * 12.5% or 50%. The baseline provides the minimum CPUs that can be used constantly.
     *
     * @return the value
     */
    public Double getCpuBaseline() {
        return cpuBaseline;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("load")
    private final SummaryStatistics load;

    public SummaryStatistics getLoad() {
        return load;
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
        sb.append("HostCpuStatistics(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", cpuBaseline=").append(String.valueOf(this.cpuBaseline));
        sb.append(", load=").append(String.valueOf(this.load));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostCpuStatistics)) {
            return false;
        }

        HostCpuStatistics other = (HostCpuStatistics) o;
        return java.util.Objects.equals(this.cpuBaseline, other.cpuBaseline)
                && java.util.Objects.equals(this.load, other.load)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.cpuBaseline == null ? 43 : this.cpuBaseline.hashCode());
        result = (result * PRIME) + (this.load == null ? 43 : this.load.hashCode());
        return result;
    }
}
