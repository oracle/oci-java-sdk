/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains memory statistics.
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
    builder = HostMemoryStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "resourceName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostMemoryStatistics extends HostResourceStatistics {
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeMemory")
        private Double freeMemory;

        public Builder freeMemory(Double freeMemory) {
            this.freeMemory = freeMemory;
            this.__explicitlySet__.add("freeMemory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableMemory")
        private Double availableMemory;

        public Builder availableMemory(Double availableMemory) {
            this.availableMemory = availableMemory;
            this.__explicitlySet__.add("availableMemory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesTotal")
        private Integer hugePagesTotal;

        public Builder hugePagesTotal(Integer hugePagesTotal) {
            this.hugePagesTotal = hugePagesTotal;
            this.__explicitlySet__.add("hugePagesTotal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hugePageSizeInMB")
        private Double hugePageSizeInMB;

        public Builder hugePageSizeInMB(Double hugePageSizeInMB) {
            this.hugePageSizeInMB = hugePageSizeInMB;
            this.__explicitlySet__.add("hugePageSizeInMB");
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

        @com.fasterxml.jackson.annotation.JsonProperty("load")
        private SummaryStatistics load;

        public Builder load(SummaryStatistics load) {
            this.load = load;
            this.__explicitlySet__.add("load");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostMemoryStatistics build() {
            HostMemoryStatistics __instance__ =
                    new HostMemoryStatistics(
                            usage,
                            capacity,
                            utilizationPercent,
                            usageChangePercent,
                            freeMemory,
                            availableMemory,
                            hugePagesTotal,
                            hugePageSizeInMB,
                            hugePagesFree,
                            hugePagesReserved,
                            load);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostMemoryStatistics o) {
            Builder copiedBuilder =
                    usage(o.getUsage())
                            .capacity(o.getCapacity())
                            .utilizationPercent(o.getUtilizationPercent())
                            .usageChangePercent(o.getUsageChangePercent())
                            .freeMemory(o.getFreeMemory())
                            .availableMemory(o.getAvailableMemory())
                            .hugePagesTotal(o.getHugePagesTotal())
                            .hugePageSizeInMB(o.getHugePageSizeInMB())
                            .hugePagesFree(o.getHugePagesFree())
                            .hugePagesReserved(o.getHugePagesReserved())
                            .load(o.getLoad());

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
    public HostMemoryStatistics(
            Double usage,
            Double capacity,
            Double utilizationPercent,
            Double usageChangePercent,
            Double freeMemory,
            Double availableMemory,
            Integer hugePagesTotal,
            Double hugePageSizeInMB,
            Integer hugePagesFree,
            Integer hugePagesReserved,
            SummaryStatistics load) {
        super(usage, capacity, utilizationPercent, usageChangePercent);
        this.freeMemory = freeMemory;
        this.availableMemory = availableMemory;
        this.hugePagesTotal = hugePagesTotal;
        this.hugePageSizeInMB = hugePageSizeInMB;
        this.hugePagesFree = hugePagesFree;
        this.hugePagesReserved = hugePagesReserved;
        this.load = load;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("freeMemory")
    private final Double freeMemory;

    public Double getFreeMemory() {
        return freeMemory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availableMemory")
    private final Double availableMemory;

    public Double getAvailableMemory() {
        return availableMemory;
    }

    /**
     * Total number of huge pages.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesTotal")
    private final Integer hugePagesTotal;

    public Integer getHugePagesTotal() {
        return hugePagesTotal;
    }

    /**
     * Size of huge pages in megabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePageSizeInMB")
    private final Double hugePageSizeInMB;

    public Double getHugePageSizeInMB() {
        return hugePageSizeInMB;
    }

    /**
     * Total number of available huge pages.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesFree")
    private final Integer hugePagesFree;

    public Integer getHugePagesFree() {
        return hugePagesFree;
    }

    /**
     * Total number of huge pages which are used or reserved.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesReserved")
    private final Integer hugePagesReserved;

    public Integer getHugePagesReserved() {
        return hugePagesReserved;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("load")
    private final SummaryStatistics load;

    public SummaryStatistics getLoad() {
        return load;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HostMemoryStatistics(");
        sb.append("super=").append(super.toString());
        sb.append(", freeMemory=").append(String.valueOf(this.freeMemory));
        sb.append(", availableMemory=").append(String.valueOf(this.availableMemory));
        sb.append(", hugePagesTotal=").append(String.valueOf(this.hugePagesTotal));
        sb.append(", hugePageSizeInMB=").append(String.valueOf(this.hugePageSizeInMB));
        sb.append(", hugePagesFree=").append(String.valueOf(this.hugePagesFree));
        sb.append(", hugePagesReserved=").append(String.valueOf(this.hugePagesReserved));
        sb.append(", load=").append(String.valueOf(this.load));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostMemoryStatistics)) {
            return false;
        }

        HostMemoryStatistics other = (HostMemoryStatistics) o;
        return java.util.Objects.equals(this.freeMemory, other.freeMemory)
                && java.util.Objects.equals(this.availableMemory, other.availableMemory)
                && java.util.Objects.equals(this.hugePagesTotal, other.hugePagesTotal)
                && java.util.Objects.equals(this.hugePageSizeInMB, other.hugePageSizeInMB)
                && java.util.Objects.equals(this.hugePagesFree, other.hugePagesFree)
                && java.util.Objects.equals(this.hugePagesReserved, other.hugePagesReserved)
                && java.util.Objects.equals(this.load, other.load)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.freeMemory == null ? 43 : this.freeMemory.hashCode());
        result =
                (result * PRIME)
                        + (this.availableMemory == null ? 43 : this.availableMemory.hashCode());
        result =
                (result * PRIME)
                        + (this.hugePagesTotal == null ? 43 : this.hugePagesTotal.hashCode());
        result =
                (result * PRIME)
                        + (this.hugePageSizeInMB == null ? 43 : this.hugePageSizeInMB.hashCode());
        result =
                (result * PRIME)
                        + (this.hugePagesFree == null ? 43 : this.hugePagesFree.hashCode());
        result =
                (result * PRIME)
                        + (this.hugePagesReserved == null ? 43 : this.hugePagesReserved.hashCode());
        result = (result * PRIME) + (this.load == null ? 43 : this.load.hashCode());
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
