/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains resource statistics with usage unit <br>
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
        builder = ResourceStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceStatistics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "usage",
        "capacity",
        "baseCapacity",
        "isAutoScalingEnabled",
        "utilizationPercent",
        "usageChangePercent",
        "instanceMetrics",
        "totalHostCapacity"
    })
    public ResourceStatistics(
            Double usage,
            Double capacity,
            Double baseCapacity,
            Boolean isAutoScalingEnabled,
            Double utilizationPercent,
            Double usageChangePercent,
            java.util.List<InstanceMetrics> instanceMetrics,
            Double totalHostCapacity) {
        super();
        this.usage = usage;
        this.capacity = capacity;
        this.baseCapacity = baseCapacity;
        this.isAutoScalingEnabled = isAutoScalingEnabled;
        this.utilizationPercent = utilizationPercent;
        this.usageChangePercent = usageChangePercent;
        this.instanceMetrics = instanceMetrics;
        this.totalHostCapacity = totalHostCapacity;
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
         * The base allocated amount of the resource metric type (CPU, STORAGE) for a set of
         * databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("baseCapacity")
        private Double baseCapacity;

        /**
         * The base allocated amount of the resource metric type (CPU, STORAGE) for a set of
         * databases.
         *
         * @param baseCapacity the value to set
         * @return this builder
         */
        public Builder baseCapacity(Double baseCapacity) {
            this.baseCapacity = baseCapacity;
            this.__explicitlySet__.add("baseCapacity");
            return this;
        }
        /**
         * Indicates if auto scaling feature is enabled or disabled on a database. It will be false
         * for all metrics other than CPU.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
        private Boolean isAutoScalingEnabled;

        /**
         * Indicates if auto scaling feature is enabled or disabled on a database. It will be false
         * for all metrics other than CPU.
         *
         * @param isAutoScalingEnabled the value to set
         * @return this builder
         */
        public Builder isAutoScalingEnabled(Boolean isAutoScalingEnabled) {
            this.isAutoScalingEnabled = isAutoScalingEnabled;
            this.__explicitlySet__.add("isAutoScalingEnabled");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceStatistics build() {
            ResourceStatistics model =
                    new ResourceStatistics(
                            this.usage,
                            this.capacity,
                            this.baseCapacity,
                            this.isAutoScalingEnabled,
                            this.utilizationPercent,
                            this.usageChangePercent,
                            this.instanceMetrics,
                            this.totalHostCapacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceStatistics model) {
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
            }
            if (model.wasPropertyExplicitlySet("capacity")) {
                this.capacity(model.getCapacity());
            }
            if (model.wasPropertyExplicitlySet("baseCapacity")) {
                this.baseCapacity(model.getBaseCapacity());
            }
            if (model.wasPropertyExplicitlySet("isAutoScalingEnabled")) {
                this.isAutoScalingEnabled(model.getIsAutoScalingEnabled());
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
            if (model.wasPropertyExplicitlySet("totalHostCapacity")) {
                this.totalHostCapacity(model.getTotalHostCapacity());
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
     * The base allocated amount of the resource metric type (CPU, STORAGE) for a set of databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("baseCapacity")
    private final Double baseCapacity;

    /**
     * The base allocated amount of the resource metric type (CPU, STORAGE) for a set of databases.
     *
     * @return the value
     */
    public Double getBaseCapacity() {
        return baseCapacity;
    }

    /**
     * Indicates if auto scaling feature is enabled or disabled on a database. It will be false for
     * all metrics other than CPU.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoScalingEnabled")
    private final Boolean isAutoScalingEnabled;

    /**
     * Indicates if auto scaling feature is enabled or disabled on a database. It will be false for
     * all metrics other than CPU.
     *
     * @return the value
     */
    public Boolean getIsAutoScalingEnabled() {
        return isAutoScalingEnabled;
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
        sb.append("ResourceStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("usage=").append(String.valueOf(this.usage));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(", baseCapacity=").append(String.valueOf(this.baseCapacity));
        sb.append(", isAutoScalingEnabled=").append(String.valueOf(this.isAutoScalingEnabled));
        sb.append(", utilizationPercent=").append(String.valueOf(this.utilizationPercent));
        sb.append(", usageChangePercent=").append(String.valueOf(this.usageChangePercent));
        sb.append(", instanceMetrics=").append(String.valueOf(this.instanceMetrics));
        sb.append(", totalHostCapacity=").append(String.valueOf(this.totalHostCapacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceStatistics)) {
            return false;
        }

        ResourceStatistics other = (ResourceStatistics) o;
        return java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && java.util.Objects.equals(this.baseCapacity, other.baseCapacity)
                && java.util.Objects.equals(this.isAutoScalingEnabled, other.isAutoScalingEnabled)
                && java.util.Objects.equals(this.utilizationPercent, other.utilizationPercent)
                && java.util.Objects.equals(this.usageChangePercent, other.usageChangePercent)
                && java.util.Objects.equals(this.instanceMetrics, other.instanceMetrics)
                && java.util.Objects.equals(this.totalHostCapacity, other.totalHostCapacity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result = (result * PRIME) + (this.baseCapacity == null ? 43 : this.baseCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoScalingEnabled == null
                                ? 43
                                : this.isAutoScalingEnabled.hashCode());
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
        result =
                (result * PRIME)
                        + (this.totalHostCapacity == null ? 43 : this.totalHostCapacity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
