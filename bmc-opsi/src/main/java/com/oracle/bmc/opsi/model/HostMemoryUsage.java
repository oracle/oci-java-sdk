/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Memory usage metric for the host
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostMemoryUsage.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HostMemoryUsage extends HostPerformanceMetricGroup {
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

        @com.fasterxml.jackson.annotation.JsonProperty("memoryUsedInGB")
        private Double memoryUsedInGB;

        public Builder memoryUsedInGB(Double memoryUsedInGB) {
            this.memoryUsedInGB = memoryUsedInGB;
            this.__explicitlySet__.add("memoryUsedInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilizationInPercent")
        private Float memoryUtilizationInPercent;

        public Builder memoryUtilizationInPercent(Float memoryUtilizationInPercent) {
            this.memoryUtilizationInPercent = memoryUtilizationInPercent;
            this.__explicitlySet__.add("memoryUtilizationInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryLoadInGB")
        private Double memoryLoadInGB;

        public Builder memoryLoadInGB(Double memoryLoadInGB) {
            this.memoryLoadInGB = memoryLoadInGB;
            this.__explicitlySet__.add("memoryLoadInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("realMemoryInKB")
        private Double realMemoryInKB;

        public Builder realMemoryInKB(Double realMemoryInKB) {
            this.realMemoryInKB = realMemoryInKB;
            this.__explicitlySet__.add("realMemoryInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeMemoryInKB")
        private Double freeMemoryInKB;

        public Builder freeMemoryInKB(Double freeMemoryInKB) {
            this.freeMemoryInKB = freeMemoryInKB;
            this.__explicitlySet__.add("freeMemoryInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logicalMemoryUsedInGB")
        private Double logicalMemoryUsedInGB;

        public Builder logicalMemoryUsedInGB(Double logicalMemoryUsedInGB) {
            this.logicalMemoryUsedInGB = logicalMemoryUsedInGB;
            this.__explicitlySet__.add("logicalMemoryUsedInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logicalMemoryUtilizationInPercent")
        private Float logicalMemoryUtilizationInPercent;

        public Builder logicalMemoryUtilizationInPercent(Float logicalMemoryUtilizationInPercent) {
            this.logicalMemoryUtilizationInPercent = logicalMemoryUtilizationInPercent;
            this.__explicitlySet__.add("logicalMemoryUtilizationInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeLogicalMemoryInKB")
        private Double freeLogicalMemoryInKB;

        public Builder freeLogicalMemoryInKB(Double freeLogicalMemoryInKB) {
            this.freeLogicalMemoryInKB = freeLogicalMemoryInKB;
            this.__explicitlySet__.add("freeLogicalMemoryInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("majorPageFaults")
        private Integer majorPageFaults;

        public Builder majorPageFaults(Integer majorPageFaults) {
            this.majorPageFaults = majorPageFaults;
            this.__explicitlySet__.add("majorPageFaults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("swapFreeInKB")
        private Double swapFreeInKB;

        public Builder swapFreeInKB(Double swapFreeInKB) {
            this.swapFreeInKB = swapFreeInKB;
            this.__explicitlySet__.add("swapFreeInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("anonHugePagesInKB")
        private Double anonHugePagesInKB;

        public Builder anonHugePagesInKB(Double anonHugePagesInKB) {
            this.anonHugePagesInKB = anonHugePagesInKB;
            this.__explicitlySet__.add("anonHugePagesInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesFree")
        private Integer hugePagesFree;

        public Builder hugePagesFree(Integer hugePagesFree) {
            this.hugePagesFree = hugePagesFree;
            this.__explicitlySet__.add("hugePagesFree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesReserved")
        private Integer hugePagesReserved;

        public Builder hugePagesReserved(Integer hugePagesReserved) {
            this.hugePagesReserved = hugePagesReserved;
            this.__explicitlySet__.add("hugePagesReserved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesSurplus")
        private Integer hugePagesSurplus;

        public Builder hugePagesSurplus(Integer hugePagesSurplus) {
            this.hugePagesSurplus = hugePagesSurplus;
            this.__explicitlySet__.add("hugePagesSurplus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostMemoryUsage build() {
            HostMemoryUsage __instance__ =
                    new HostMemoryUsage(
                            timeCollected,
                            memoryUsedInGB,
                            memoryUtilizationInPercent,
                            memoryLoadInGB,
                            realMemoryInKB,
                            freeMemoryInKB,
                            logicalMemoryUsedInGB,
                            logicalMemoryUtilizationInPercent,
                            freeLogicalMemoryInKB,
                            majorPageFaults,
                            swapFreeInKB,
                            anonHugePagesInKB,
                            hugePagesFree,
                            hugePagesReserved,
                            hugePagesSurplus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostMemoryUsage o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .memoryUsedInGB(o.getMemoryUsedInGB())
                            .memoryUtilizationInPercent(o.getMemoryUtilizationInPercent())
                            .memoryLoadInGB(o.getMemoryLoadInGB())
                            .realMemoryInKB(o.getRealMemoryInKB())
                            .freeMemoryInKB(o.getFreeMemoryInKB())
                            .logicalMemoryUsedInGB(o.getLogicalMemoryUsedInGB())
                            .logicalMemoryUtilizationInPercent(
                                    o.getLogicalMemoryUtilizationInPercent())
                            .freeLogicalMemoryInKB(o.getFreeLogicalMemoryInKB())
                            .majorPageFaults(o.getMajorPageFaults())
                            .swapFreeInKB(o.getSwapFreeInKB())
                            .anonHugePagesInKB(o.getAnonHugePagesInKB())
                            .hugePagesFree(o.getHugePagesFree())
                            .hugePagesReserved(o.getHugePagesReserved())
                            .hugePagesSurplus(o.getHugePagesSurplus());

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
    public HostMemoryUsage(
            java.util.Date timeCollected,
            Double memoryUsedInGB,
            Float memoryUtilizationInPercent,
            Double memoryLoadInGB,
            Double realMemoryInKB,
            Double freeMemoryInKB,
            Double logicalMemoryUsedInGB,
            Float logicalMemoryUtilizationInPercent,
            Double freeLogicalMemoryInKB,
            Integer majorPageFaults,
            Double swapFreeInKB,
            Double anonHugePagesInKB,
            Integer hugePagesFree,
            Integer hugePagesReserved,
            Integer hugePagesSurplus) {
        super(timeCollected);
        this.memoryUsedInGB = memoryUsedInGB;
        this.memoryUtilizationInPercent = memoryUtilizationInPercent;
        this.memoryLoadInGB = memoryLoadInGB;
        this.realMemoryInKB = realMemoryInKB;
        this.freeMemoryInKB = freeMemoryInKB;
        this.logicalMemoryUsedInGB = logicalMemoryUsedInGB;
        this.logicalMemoryUtilizationInPercent = logicalMemoryUtilizationInPercent;
        this.freeLogicalMemoryInKB = freeLogicalMemoryInKB;
        this.majorPageFaults = majorPageFaults;
        this.swapFreeInKB = swapFreeInKB;
        this.anonHugePagesInKB = anonHugePagesInKB;
        this.hugePagesFree = hugePagesFree;
        this.hugePagesReserved = hugePagesReserved;
        this.hugePagesSurplus = hugePagesSurplus;
    }

    /**
     * Amount of physical memory used in gigabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUsedInGB")
    Double memoryUsedInGB;

    /**
     * Amount of physical memory used in percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilizationInPercent")
    Float memoryUtilizationInPercent;

    /**
     * Load on memory in gigabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryLoadInGB")
    Double memoryLoadInGB;

    /**
     * Amount of usable physical memory in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("realMemoryInKB")
    Double realMemoryInKB;

    /**
     * Amount of available physical memory in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeMemoryInKB")
    Double freeMemoryInKB;

    /**
     * Memory used excluding buffers and cache in gigabytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logicalMemoryUsedInGB")
    Double logicalMemoryUsedInGB;

    /**
     * Amount of logical memory used in percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logicalMemoryUtilizationInPercent")
    Float logicalMemoryUtilizationInPercent;

    /**
     * Amount of avaiable virtual memory in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeLogicalMemoryInKB")
    Double freeLogicalMemoryInKB;

    /**
     * Number of major page faults
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("majorPageFaults")
    Integer majorPageFaults;

    /**
     * Amount of available swap space in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("swapFreeInKB")
    Double swapFreeInKB;

    /**
     * Amount of memory used for anon huge pages in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("anonHugePagesInKB")
    Double anonHugePagesInKB;

    /**
     * Number of available huge pages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesFree")
    Integer hugePagesFree;

    /**
     * Number of reserved huge pages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesReserved")
    Integer hugePagesReserved;

    /**
     * Number of surplus huge pages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesSurplus")
    Integer hugePagesSurplus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
