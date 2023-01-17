/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains resource statistics with usage unit <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExadataInsightResourceStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExadataInsightResourceStatistics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "usage",
        "capacity",
        "totalHostCapacity",
        "utilizationPercent",
        "usageChangePercent",
        "instanceMetrics"
    })
    public ExadataInsightResourceStatistics(
            Double usage,
            Double capacity,
            Double totalHostCapacity,
            Double utilizationPercent,
            Double usageChangePercent,
            java.util.List<InstanceMetrics> instanceMetrics) {
        super();
        this.usage = usage;
        this.capacity = capacity;
        this.totalHostCapacity = totalHostCapacity;
        this.utilizationPercent = utilizationPercent;
        this.usageChangePercent = usageChangePercent;
        this.instanceMetrics = instanceMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total amount used of the resource metric type (CPU, STORAGE). */
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Double usage;

        /**
         * Total amount used of the resource metric type (CPU, STORAGE).
         *
         * @param usage the value to set
         * @return this builder
         */
        public Builder usage(Double usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }
        /**
         * The maximum allocated amount of the resource metric type (CPU, STORAGE) for a set of
         * databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Double capacity;

        /**
         * The maximum allocated amount of the resource metric type (CPU, STORAGE) for a set of
         * databases.
         *
         * @param capacity the value to set
         * @return this builder
         */
        public Builder capacity(Double capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }
        /**
         * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only
         * applies to CPU and does not not apply for Autonomous Databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalHostCapacity")
        private Double totalHostCapacity;

        /**
         * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only
         * applies to CPU and does not not apply for Autonomous Databases.
         *
         * @param totalHostCapacity the value to set
         * @return this builder
         */
        public Builder totalHostCapacity(Double totalHostCapacity) {
            this.totalHostCapacity = totalHostCapacity;
            this.__explicitlySet__.add("totalHostCapacity");
            return this;
        }
        /** Resource utilization in percentage */
        @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
        private Double utilizationPercent;

        /**
         * Resource utilization in percentage
         *
         * @param utilizationPercent the value to set
         * @return this builder
         */
        public Builder utilizationPercent(Double utilizationPercent) {
            this.utilizationPercent = utilizationPercent;
            this.__explicitlySet__.add("utilizationPercent");
            return this;
        }
        /** Change in resource utilization in percentage */
        @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
        private Double usageChangePercent;

        /**
         * Change in resource utilization in percentage
         *
         * @param usageChangePercent the value to set
         * @return this builder
         */
        public Builder usageChangePercent(Double usageChangePercent) {
            this.usageChangePercent = usageChangePercent;
            this.__explicitlySet__.add("usageChangePercent");
            return this;
        }
        /** Array of instance metrics */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceMetrics")
        private java.util.List<InstanceMetrics> instanceMetrics;

        /**
         * Array of instance metrics
         *
         * @param instanceMetrics the value to set
         * @return this builder
         */
        public Builder instanceMetrics(java.util.List<InstanceMetrics> instanceMetrics) {
            this.instanceMetrics = instanceMetrics;
            this.__explicitlySet__.add("instanceMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInsightResourceStatistics build() {
            ExadataInsightResourceStatistics model =
                    new ExadataInsightResourceStatistics(
                            this.usage,
                            this.capacity,
                            this.totalHostCapacity,
                            this.utilizationPercent,
                            this.usageChangePercent,
                            this.instanceMetrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInsightResourceStatistics model) {
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("totalHostCapacity")) {
                this.totalHostCapacity(model.getTotalHostCapacity());
            }
            if (model.wasPropertyExplicitlySet("utilizationPercent")) {
                this.utilizationPercent(model.getUtilizationPercent());
            }
            if (model.wasPropertyExplicitlySet("usageChangePercent")) {
                this.usageChangePercent(model.getUsageChangePercent());
            }
            if (model.wasPropertyExplicitlySet("instanceMetrics")) {
                this.instanceMetrics(model.getInstanceMetrics());
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

    /** Total amount used of the resource metric type (CPU, STORAGE). */
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final Double usage;

    /**
     * Total amount used of the resource metric type (CPU, STORAGE).
     *
     * @return the value
     */
    public Double getUsage() {
        return usage;
    }

    /**
     * The maximum allocated amount of the resource metric type (CPU, STORAGE) for a set of
     * databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final Double capacity;

    /**
     * The maximum allocated amount of the resource metric type (CPU, STORAGE) for a set of
     * databases.
     *
     * @return the value
     */
    public Double getCapacity() {
        return capacity;
    }

    /**
     * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only
     * applies to CPU and does not not apply for Autonomous Databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalHostCapacity")
    private final Double totalHostCapacity;

    /**
     * The maximum host CPUs (cores x threads/core) on the underlying infrastructure. This only
     * applies to CPU and does not not apply for Autonomous Databases.
     *
     * @return the value
     */
    public Double getTotalHostCapacity() {
        return totalHostCapacity;
    }

    /** Resource utilization in percentage */
    @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
    private final Double utilizationPercent;

    /**
     * Resource utilization in percentage
     *
     * @return the value
     */
    public Double getUtilizationPercent() {
        return utilizationPercent;
    }

    /** Change in resource utilization in percentage */
    @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
    private final Double usageChangePercent;

    /**
     * Change in resource utilization in percentage
     *
     * @return the value
     */
    public Double getUsageChangePercent() {
        return usageChangePercent;
    }

    /** Array of instance metrics */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceMetrics")
    private final java.util.List<InstanceMetrics> instanceMetrics;

    /**
     * Array of instance metrics
     *
     * @return the value
     */
    public java.util.List<InstanceMetrics> getInstanceMetrics() {
        return instanceMetrics;
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
        sb.append("ExadataInsightResourceStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("usage=").append(String.valueOf(this.usage));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(", totalHostCapacity=").append(String.valueOf(this.totalHostCapacity));
        sb.append(", utilizationPercent=").append(String.valueOf(this.utilizationPercent));
        sb.append(", usageChangePercent=").append(String.valueOf(this.usageChangePercent));
        sb.append(", instanceMetrics=").append(String.valueOf(this.instanceMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataInsightResourceStatistics)) {
            return false;
        }

        ExadataInsightResourceStatistics other = (ExadataInsightResourceStatistics) o;
        return java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && java.util.Objects.equals(this.totalHostCapacity, other.totalHostCapacity)
                && java.util.Objects.equals(this.utilizationPercent, other.utilizationPercent)
                && java.util.Objects.equals(this.usageChangePercent, other.usageChangePercent)
                && java.util.Objects.equals(this.instanceMetrics, other.instanceMetrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result =
                (result * PRIME)
                        + (this.totalHostCapacity == null ? 43 : this.totalHostCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.utilizationPercent == null
                                ? 43
                                : this.utilizationPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.usageChangePercent == null
                                ? 43
                                : this.usageChangePercent.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceMetrics == null ? 43 : this.instanceMetrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
