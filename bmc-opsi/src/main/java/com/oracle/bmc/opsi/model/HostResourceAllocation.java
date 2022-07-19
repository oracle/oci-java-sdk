/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Resource Allocation metric for the host
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HostResourceAllocation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostResourceAllocation extends HostConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * Total number of CPUs available
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
        private Integer totalCpus;

        /**
         * Total number of CPUs available
         * @param totalCpus the value to set
         * @return this builder
         **/
        public Builder totalCpus(Integer totalCpus) {
            this.totalCpus = totalCpus;
            this.__explicitlySet__.add("totalCpus");
            return this;
        }
        /**
         * Total amount of usable physical memory in gibabytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGB")
        private Double totalMemoryInGB;

        /**
         * Total amount of usable physical memory in gibabytes
         * @param totalMemoryInGB the value to set
         * @return this builder
         **/
        public Builder totalMemoryInGB(Double totalMemoryInGB) {
            this.totalMemoryInGB = totalMemoryInGB;
            this.__explicitlySet__.add("totalMemoryInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostResourceAllocation build() {
            HostResourceAllocation __instance__ =
                    new HostResourceAllocation(timeCollected, totalCpus, totalMemoryInGB);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostResourceAllocation o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .totalCpus(o.getTotalCpus())
                            .totalMemoryInGB(o.getTotalMemoryInGB());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public HostResourceAllocation(
            java.util.Date timeCollected, Integer totalCpus, Double totalMemoryInGB) {
        super(timeCollected);
        this.totalCpus = totalCpus;
        this.totalMemoryInGB = totalMemoryInGB;
    }

    /**
     * Total number of CPUs available
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
    private final Integer totalCpus;

    /**
     * Total number of CPUs available
     * @return the value
     **/
    public Integer getTotalCpus() {
        return totalCpus;
    }

    /**
     * Total amount of usable physical memory in gibabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGB")
    private final Double totalMemoryInGB;

    /**
     * Total amount of usable physical memory in gibabytes
     * @return the value
     **/
    public Double getTotalMemoryInGB() {
        return totalMemoryInGB;
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
        sb.append("HostResourceAllocation(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", totalCpus=").append(String.valueOf(this.totalCpus));
        sb.append(", totalMemoryInGB=").append(String.valueOf(this.totalMemoryInGB));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostResourceAllocation)) {
            return false;
        }

        HostResourceAllocation other = (HostResourceAllocation) o;
        return java.util.Objects.equals(this.totalCpus, other.totalCpus)
                && java.util.Objects.equals(this.totalMemoryInGB, other.totalMemoryInGB)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.totalCpus == null ? 43 : this.totalCpus.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMemoryInGB == null ? 43 : this.totalMemoryInGB.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
