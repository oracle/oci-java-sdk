/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Memory Configuration metric for the host
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
    builder = HostMemoryConfiguration.Builder.class
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
public class HostMemoryConfiguration extends HostConfigurationMetricGroup {
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

        @com.fasterxml.jackson.annotation.JsonProperty("pageSizeInKB")
        private Double pageSizeInKB;

        public Builder pageSizeInKB(Double pageSizeInKB) {
            this.pageSizeInKB = pageSizeInKB;
            this.__explicitlySet__.add("pageSizeInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pageTablesInKB")
        private Double pageTablesInKB;

        public Builder pageTablesInKB(Double pageTablesInKB) {
            this.pageTablesInKB = pageTablesInKB;
            this.__explicitlySet__.add("pageTablesInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("swapTotalInKB")
        private Double swapTotalInKB;

        public Builder swapTotalInKB(Double swapTotalInKB) {
            this.swapTotalInKB = swapTotalInKB;
            this.__explicitlySet__.add("swapTotalInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hugePageSizeInKB")
        private Double hugePageSizeInKB;

        public Builder hugePageSizeInKB(Double hugePageSizeInKB) {
            this.hugePageSizeInKB = hugePageSizeInKB;
            this.__explicitlySet__.add("hugePageSizeInKB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesTotal")
        private Integer hugePagesTotal;

        public Builder hugePagesTotal(Integer hugePagesTotal) {
            this.hugePagesTotal = hugePagesTotal;
            this.__explicitlySet__.add("hugePagesTotal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostMemoryConfiguration build() {
            HostMemoryConfiguration __instance__ =
                    new HostMemoryConfiguration(
                            timeCollected,
                            pageSizeInKB,
                            pageTablesInKB,
                            swapTotalInKB,
                            hugePageSizeInKB,
                            hugePagesTotal);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostMemoryConfiguration o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .pageSizeInKB(o.getPageSizeInKB())
                            .pageTablesInKB(o.getPageTablesInKB())
                            .swapTotalInKB(o.getSwapTotalInKB())
                            .hugePageSizeInKB(o.getHugePageSizeInKB())
                            .hugePagesTotal(o.getHugePagesTotal());

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
    public HostMemoryConfiguration(
            java.util.Date timeCollected,
            Double pageSizeInKB,
            Double pageTablesInKB,
            Double swapTotalInKB,
            Double hugePageSizeInKB,
            Integer hugePagesTotal) {
        super(timeCollected);
        this.pageSizeInKB = pageSizeInKB;
        this.pageTablesInKB = pageTablesInKB;
        this.swapTotalInKB = swapTotalInKB;
        this.hugePageSizeInKB = hugePageSizeInKB;
        this.hugePagesTotal = hugePagesTotal;
    }

    /**
     * Page size in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pageSizeInKB")
    Double pageSizeInKB;

    /**
     * Amount of memory used for page tables in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pageTablesInKB")
    Double pageTablesInKB;

    /**
     * Amount of total swap space in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("swapTotalInKB")
    Double swapTotalInKB;

    /**
     * Size of huge pages in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePageSizeInKB")
    Double hugePageSizeInKB;

    /**
     * Total number of huge pages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesTotal")
    Integer hugePagesTotal;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
