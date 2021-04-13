/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HostResourceAllocation.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HostResourceAllocation extends HostConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
        private Integer totalCpus;

        public Builder totalCpus(Integer totalCpus) {
            this.totalCpus = totalCpus;
            this.__explicitlySet__.add("totalCpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGB")
        private Double totalMemoryInGB;

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
    Integer totalCpus;

    /**
     * Total amount of usable physical memory in gibabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGB")
    Double totalMemoryInGB;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
