/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains memory statistics. <br>
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
        builder = HostMemoryStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resourceName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
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
        /** Total number of huge pages. */
        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesTotal")
        private Integer hugePagesTotal;

        /**
         * Total number of huge pages.
         *
         * @param hugePagesTotal the value to set
         * @return this builder
         */
        public Builder hugePagesTotal(Integer hugePagesTotal) {
            this.hugePagesTotal = hugePagesTotal;
            this.__explicitlySet__.add("hugePagesTotal");
            return this;
        }
        /** Size of huge pages in megabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("hugePageSizeInMB")
        private Double hugePageSizeInMB;

        /**
         * Size of huge pages in megabytes.
         *
         * @param hugePageSizeInMB the value to set
         * @return this builder
         */
        public Builder hugePageSizeInMB(Double hugePageSizeInMB) {
            this.hugePageSizeInMB = hugePageSizeInMB;
            this.__explicitlySet__.add("hugePageSizeInMB");
            return this;
        }
        /** Total number of available huge pages. */
        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesFree")
        private Integer hugePagesFree;

        /**
         * Total number of available huge pages.
         *
         * @param hugePagesFree the value to set
         * @return this builder
         */
        public Builder hugePagesFree(Integer hugePagesFree) {
            this.hugePagesFree = hugePagesFree;
            this.__explicitlySet__.add("hugePagesFree");
            return this;
        }
        /** Total number of huge pages which are used or reserved. */
        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesReserved")
        private Integer hugePagesReserved;

        /**
         * Total number of huge pages which are used or reserved.
         *
         * @param hugePagesReserved the value to set
         * @return this builder
         */
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
            HostMemoryStatistics model =
                    new HostMemoryStatistics(
                            this.usage,
                            this.capacity,
                            this.utilizationPercent,
                            this.usageChangePercent,
                            this.freeMemory,
                            this.availableMemory,
                            this.hugePagesTotal,
                            this.hugePageSizeInMB,
                            this.hugePagesFree,
                            this.hugePagesReserved,
                            this.load);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostMemoryStatistics model) {
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
            if (model.wasPropertyExplicitlySet("freeMemory")) {
                this.freeMemory(model.getFreeMemory());
            }
            if (model.wasPropertyExplicitlySet("availableMemory")) {
                this.availableMemory(model.getAvailableMemory());
            }
            if (model.wasPropertyExplicitlySet("hugePagesTotal")) {
                this.hugePagesTotal(model.getHugePagesTotal());
            }
            if (model.wasPropertyExplicitlySet("hugePageSizeInMB")) {
                this.hugePageSizeInMB(model.getHugePageSizeInMB());
            }
            if (model.wasPropertyExplicitlySet("hugePagesFree")) {
                this.hugePagesFree(model.getHugePagesFree());
            }
            if (model.wasPropertyExplicitlySet("hugePagesReserved")) {
                this.hugePagesReserved(model.getHugePagesReserved());
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

    /** Total number of huge pages. */
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesTotal")
    private final Integer hugePagesTotal;

    /**
     * Total number of huge pages.
     *
     * @return the value
     */
    public Integer getHugePagesTotal() {
        return hugePagesTotal;
    }

    /** Size of huge pages in megabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("hugePageSizeInMB")
    private final Double hugePageSizeInMB;

    /**
     * Size of huge pages in megabytes.
     *
     * @return the value
     */
    public Double getHugePageSizeInMB() {
        return hugePageSizeInMB;
    }

    /** Total number of available huge pages. */
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesFree")
    private final Integer hugePagesFree;

    /**
     * Total number of available huge pages.
     *
     * @return the value
     */
    public Integer getHugePagesFree() {
        return hugePagesFree;
    }

    /** Total number of huge pages which are used or reserved. */
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesReserved")
    private final Integer hugePagesReserved;

    /**
     * Total number of huge pages which are used or reserved.
     *
     * @return the value
     */
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
        sb.append("HostMemoryStatistics(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", freeMemory=").append(String.valueOf(this.freeMemory));
        sb.append(", availableMemory=").append(String.valueOf(this.availableMemory));
        sb.append(", hugePagesTotal=").append(String.valueOf(this.hugePagesTotal));
        sb.append(", hugePageSizeInMB=").append(String.valueOf(this.hugePageSizeInMB));
        sb.append(", hugePagesFree=").append(String.valueOf(this.hugePagesFree));
        sb.append(", hugePagesReserved=").append(String.valueOf(this.hugePagesReserved));
        sb.append(", load=").append(String.valueOf(this.load));
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
                && super.equals(other);
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
        return result;
    }
}
