/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Memory usage metric for the host <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HostMemoryUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class HostMemoryUsage extends HostPerformanceMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** Amount of physical memory used in gigabytes */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryUsedInGB")
        private Double memoryUsedInGB;

        /**
         * Amount of physical memory used in gigabytes
         *
         * @param memoryUsedInGB the value to set
         * @return this builder
         */
        public Builder memoryUsedInGB(Double memoryUsedInGB) {
            this.memoryUsedInGB = memoryUsedInGB;
            this.__explicitlySet__.add("memoryUsedInGB");
            return this;
        }
        /** Amount of physical memory used in percentage */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilizationInPercent")
        private Float memoryUtilizationInPercent;

        /**
         * Amount of physical memory used in percentage
         *
         * @param memoryUtilizationInPercent the value to set
         * @return this builder
         */
        public Builder memoryUtilizationInPercent(Float memoryUtilizationInPercent) {
            this.memoryUtilizationInPercent = memoryUtilizationInPercent;
            this.__explicitlySet__.add("memoryUtilizationInPercent");
            return this;
        }
        /** Load on memory in gigabytes */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryLoadInGB")
        private Double memoryLoadInGB;

        /**
         * Load on memory in gigabytes
         *
         * @param memoryLoadInGB the value to set
         * @return this builder
         */
        public Builder memoryLoadInGB(Double memoryLoadInGB) {
            this.memoryLoadInGB = memoryLoadInGB;
            this.__explicitlySet__.add("memoryLoadInGB");
            return this;
        }
        /** Amount of usable physical memory in kilobytes */
        @com.fasterxml.jackson.annotation.JsonProperty("realMemoryInKB")
        private Double realMemoryInKB;

        /**
         * Amount of usable physical memory in kilobytes
         *
         * @param realMemoryInKB the value to set
         * @return this builder
         */
        public Builder realMemoryInKB(Double realMemoryInKB) {
            this.realMemoryInKB = realMemoryInKB;
            this.__explicitlySet__.add("realMemoryInKB");
            return this;
        }
        /** Amount of available physical memory in kilobytes */
        @com.fasterxml.jackson.annotation.JsonProperty("freeMemoryInKB")
        private Double freeMemoryInKB;

        /**
         * Amount of available physical memory in kilobytes
         *
         * @param freeMemoryInKB the value to set
         * @return this builder
         */
        public Builder freeMemoryInKB(Double freeMemoryInKB) {
            this.freeMemoryInKB = freeMemoryInKB;
            this.__explicitlySet__.add("freeMemoryInKB");
            return this;
        }
        /** Memory used excluding buffers and cache in gigabytes */
        @com.fasterxml.jackson.annotation.JsonProperty("logicalMemoryUsedInGB")
        private Double logicalMemoryUsedInGB;

        /**
         * Memory used excluding buffers and cache in gigabytes
         *
         * @param logicalMemoryUsedInGB the value to set
         * @return this builder
         */
        public Builder logicalMemoryUsedInGB(Double logicalMemoryUsedInGB) {
            this.logicalMemoryUsedInGB = logicalMemoryUsedInGB;
            this.__explicitlySet__.add("logicalMemoryUsedInGB");
            return this;
        }
        /** Amount of logical memory used in percentage */
        @com.fasterxml.jackson.annotation.JsonProperty("logicalMemoryUtilizationInPercent")
        private Float logicalMemoryUtilizationInPercent;

        /**
         * Amount of logical memory used in percentage
         *
         * @param logicalMemoryUtilizationInPercent the value to set
         * @return this builder
         */
        public Builder logicalMemoryUtilizationInPercent(Float logicalMemoryUtilizationInPercent) {
            this.logicalMemoryUtilizationInPercent = logicalMemoryUtilizationInPercent;
            this.__explicitlySet__.add("logicalMemoryUtilizationInPercent");
            return this;
        }
        /** Amount of avaiable virtual memory in kilobytes */
        @com.fasterxml.jackson.annotation.JsonProperty("freeLogicalMemoryInKB")
        private Double freeLogicalMemoryInKB;

        /**
         * Amount of avaiable virtual memory in kilobytes
         *
         * @param freeLogicalMemoryInKB the value to set
         * @return this builder
         */
        public Builder freeLogicalMemoryInKB(Double freeLogicalMemoryInKB) {
            this.freeLogicalMemoryInKB = freeLogicalMemoryInKB;
            this.__explicitlySet__.add("freeLogicalMemoryInKB");
            return this;
        }
        /** Number of major page faults */
        @com.fasterxml.jackson.annotation.JsonProperty("majorPageFaults")
        private Integer majorPageFaults;

        /**
         * Number of major page faults
         *
         * @param majorPageFaults the value to set
         * @return this builder
         */
        public Builder majorPageFaults(Integer majorPageFaults) {
            this.majorPageFaults = majorPageFaults;
            this.__explicitlySet__.add("majorPageFaults");
            return this;
        }
        /** Amount of available swap space in kilobytes */
        @com.fasterxml.jackson.annotation.JsonProperty("swapFreeInKB")
        private Double swapFreeInKB;

        /**
         * Amount of available swap space in kilobytes
         *
         * @param swapFreeInKB the value to set
         * @return this builder
         */
        public Builder swapFreeInKB(Double swapFreeInKB) {
            this.swapFreeInKB = swapFreeInKB;
            this.__explicitlySet__.add("swapFreeInKB");
            return this;
        }
        /** Amount of memory used for anon huge pages in kilobytes */
        @com.fasterxml.jackson.annotation.JsonProperty("anonHugePagesInKB")
        private Double anonHugePagesInKB;

        /**
         * Amount of memory used for anon huge pages in kilobytes
         *
         * @param anonHugePagesInKB the value to set
         * @return this builder
         */
        public Builder anonHugePagesInKB(Double anonHugePagesInKB) {
            this.anonHugePagesInKB = anonHugePagesInKB;
            this.__explicitlySet__.add("anonHugePagesInKB");
            return this;
        }
        /** Number of available huge pages */
        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesFree")
        private Integer hugePagesFree;

        /**
         * Number of available huge pages
         *
         * @param hugePagesFree the value to set
         * @return this builder
         */
        public Builder hugePagesFree(Integer hugePagesFree) {
            this.hugePagesFree = hugePagesFree;
            this.__explicitlySet__.add("hugePagesFree");
            return this;
        }
        /** Number of reserved huge pages */
        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesReserved")
        private Integer hugePagesReserved;

        /**
         * Number of reserved huge pages
         *
         * @param hugePagesReserved the value to set
         * @return this builder
         */
        public Builder hugePagesReserved(Integer hugePagesReserved) {
            this.hugePagesReserved = hugePagesReserved;
            this.__explicitlySet__.add("hugePagesReserved");
            return this;
        }
        /** Number of surplus huge pages */
        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesSurplus")
        private Integer hugePagesSurplus;

        /**
         * Number of surplus huge pages
         *
         * @param hugePagesSurplus the value to set
         * @return this builder
         */
        public Builder hugePagesSurplus(Integer hugePagesSurplus) {
            this.hugePagesSurplus = hugePagesSurplus;
            this.__explicitlySet__.add("hugePagesSurplus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostMemoryUsage build() {
            HostMemoryUsage model =
                    new HostMemoryUsage(
                            this.timeCollected,
                            this.memoryUsedInGB,
                            this.memoryUtilizationInPercent,
                            this.memoryLoadInGB,
                            this.realMemoryInKB,
                            this.freeMemoryInKB,
                            this.logicalMemoryUsedInGB,
                            this.logicalMemoryUtilizationInPercent,
                            this.freeLogicalMemoryInKB,
                            this.majorPageFaults,
                            this.swapFreeInKB,
                            this.anonHugePagesInKB,
                            this.hugePagesFree,
                            this.hugePagesReserved,
                            this.hugePagesSurplus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostMemoryUsage model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("memoryUsedInGB")) {
                this.memoryUsedInGB(model.getMemoryUsedInGB());
            }
            if (model.wasPropertyExplicitlySet("memoryUtilizationInPercent")) {
                this.memoryUtilizationInPercent(model.getMemoryUtilizationInPercent());
            }
            if (model.wasPropertyExplicitlySet("memoryLoadInGB")) {
                this.memoryLoadInGB(model.getMemoryLoadInGB());
            }
            if (model.wasPropertyExplicitlySet("realMemoryInKB")) {
                this.realMemoryInKB(model.getRealMemoryInKB());
            }
            if (model.wasPropertyExplicitlySet("freeMemoryInKB")) {
                this.freeMemoryInKB(model.getFreeMemoryInKB());
            }
            if (model.wasPropertyExplicitlySet("logicalMemoryUsedInGB")) {
                this.logicalMemoryUsedInGB(model.getLogicalMemoryUsedInGB());
            }
            if (model.wasPropertyExplicitlySet("logicalMemoryUtilizationInPercent")) {
                this.logicalMemoryUtilizationInPercent(
                        model.getLogicalMemoryUtilizationInPercent());
            }
            if (model.wasPropertyExplicitlySet("freeLogicalMemoryInKB")) {
                this.freeLogicalMemoryInKB(model.getFreeLogicalMemoryInKB());
            }
            if (model.wasPropertyExplicitlySet("majorPageFaults")) {
                this.majorPageFaults(model.getMajorPageFaults());
            }
            if (model.wasPropertyExplicitlySet("swapFreeInKB")) {
                this.swapFreeInKB(model.getSwapFreeInKB());
            }
            if (model.wasPropertyExplicitlySet("anonHugePagesInKB")) {
                this.anonHugePagesInKB(model.getAnonHugePagesInKB());
            }
            if (model.wasPropertyExplicitlySet("hugePagesFree")) {
                this.hugePagesFree(model.getHugePagesFree());
            }
            if (model.wasPropertyExplicitlySet("hugePagesReserved")) {
                this.hugePagesReserved(model.getHugePagesReserved());
            }
            if (model.wasPropertyExplicitlySet("hugePagesSurplus")) {
                this.hugePagesSurplus(model.getHugePagesSurplus());
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

    /** Amount of physical memory used in gigabytes */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUsedInGB")
    private final Double memoryUsedInGB;

    /**
     * Amount of physical memory used in gigabytes
     *
     * @return the value
     */
    public Double getMemoryUsedInGB() {
        return memoryUsedInGB;
    }

    /** Amount of physical memory used in percentage */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryUtilizationInPercent")
    private final Float memoryUtilizationInPercent;

    /**
     * Amount of physical memory used in percentage
     *
     * @return the value
     */
    public Float getMemoryUtilizationInPercent() {
        return memoryUtilizationInPercent;
    }

    /** Load on memory in gigabytes */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryLoadInGB")
    private final Double memoryLoadInGB;

    /**
     * Load on memory in gigabytes
     *
     * @return the value
     */
    public Double getMemoryLoadInGB() {
        return memoryLoadInGB;
    }

    /** Amount of usable physical memory in kilobytes */
    @com.fasterxml.jackson.annotation.JsonProperty("realMemoryInKB")
    private final Double realMemoryInKB;

    /**
     * Amount of usable physical memory in kilobytes
     *
     * @return the value
     */
    public Double getRealMemoryInKB() {
        return realMemoryInKB;
    }

    /** Amount of available physical memory in kilobytes */
    @com.fasterxml.jackson.annotation.JsonProperty("freeMemoryInKB")
    private final Double freeMemoryInKB;

    /**
     * Amount of available physical memory in kilobytes
     *
     * @return the value
     */
    public Double getFreeMemoryInKB() {
        return freeMemoryInKB;
    }

    /** Memory used excluding buffers and cache in gigabytes */
    @com.fasterxml.jackson.annotation.JsonProperty("logicalMemoryUsedInGB")
    private final Double logicalMemoryUsedInGB;

    /**
     * Memory used excluding buffers and cache in gigabytes
     *
     * @return the value
     */
    public Double getLogicalMemoryUsedInGB() {
        return logicalMemoryUsedInGB;
    }

    /** Amount of logical memory used in percentage */
    @com.fasterxml.jackson.annotation.JsonProperty("logicalMemoryUtilizationInPercent")
    private final Float logicalMemoryUtilizationInPercent;

    /**
     * Amount of logical memory used in percentage
     *
     * @return the value
     */
    public Float getLogicalMemoryUtilizationInPercent() {
        return logicalMemoryUtilizationInPercent;
    }

    /** Amount of avaiable virtual memory in kilobytes */
    @com.fasterxml.jackson.annotation.JsonProperty("freeLogicalMemoryInKB")
    private final Double freeLogicalMemoryInKB;

    /**
     * Amount of avaiable virtual memory in kilobytes
     *
     * @return the value
     */
    public Double getFreeLogicalMemoryInKB() {
        return freeLogicalMemoryInKB;
    }

    /** Number of major page faults */
    @com.fasterxml.jackson.annotation.JsonProperty("majorPageFaults")
    private final Integer majorPageFaults;

    /**
     * Number of major page faults
     *
     * @return the value
     */
    public Integer getMajorPageFaults() {
        return majorPageFaults;
    }

    /** Amount of available swap space in kilobytes */
    @com.fasterxml.jackson.annotation.JsonProperty("swapFreeInKB")
    private final Double swapFreeInKB;

    /**
     * Amount of available swap space in kilobytes
     *
     * @return the value
     */
    public Double getSwapFreeInKB() {
        return swapFreeInKB;
    }

    /** Amount of memory used for anon huge pages in kilobytes */
    @com.fasterxml.jackson.annotation.JsonProperty("anonHugePagesInKB")
    private final Double anonHugePagesInKB;

    /**
     * Amount of memory used for anon huge pages in kilobytes
     *
     * @return the value
     */
    public Double getAnonHugePagesInKB() {
        return anonHugePagesInKB;
    }

    /** Number of available huge pages */
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesFree")
    private final Integer hugePagesFree;

    /**
     * Number of available huge pages
     *
     * @return the value
     */
    public Integer getHugePagesFree() {
        return hugePagesFree;
    }

    /** Number of reserved huge pages */
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesReserved")
    private final Integer hugePagesReserved;

    /**
     * Number of reserved huge pages
     *
     * @return the value
     */
    public Integer getHugePagesReserved() {
        return hugePagesReserved;
    }

    /** Number of surplus huge pages */
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesSurplus")
    private final Integer hugePagesSurplus;

    /**
     * Number of surplus huge pages
     *
     * @return the value
     */
    public Integer getHugePagesSurplus() {
        return hugePagesSurplus;
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
        sb.append("HostMemoryUsage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", memoryUsedInGB=").append(String.valueOf(this.memoryUsedInGB));
        sb.append(", memoryUtilizationInPercent=")
                .append(String.valueOf(this.memoryUtilizationInPercent));
        sb.append(", memoryLoadInGB=").append(String.valueOf(this.memoryLoadInGB));
        sb.append(", realMemoryInKB=").append(String.valueOf(this.realMemoryInKB));
        sb.append(", freeMemoryInKB=").append(String.valueOf(this.freeMemoryInKB));
        sb.append(", logicalMemoryUsedInGB=").append(String.valueOf(this.logicalMemoryUsedInGB));
        sb.append(", logicalMemoryUtilizationInPercent=")
                .append(String.valueOf(this.logicalMemoryUtilizationInPercent));
        sb.append(", freeLogicalMemoryInKB=").append(String.valueOf(this.freeLogicalMemoryInKB));
        sb.append(", majorPageFaults=").append(String.valueOf(this.majorPageFaults));
        sb.append(", swapFreeInKB=").append(String.valueOf(this.swapFreeInKB));
        sb.append(", anonHugePagesInKB=").append(String.valueOf(this.anonHugePagesInKB));
        sb.append(", hugePagesFree=").append(String.valueOf(this.hugePagesFree));
        sb.append(", hugePagesReserved=").append(String.valueOf(this.hugePagesReserved));
        sb.append(", hugePagesSurplus=").append(String.valueOf(this.hugePagesSurplus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostMemoryUsage)) {
            return false;
        }

        HostMemoryUsage other = (HostMemoryUsage) o;
        return java.util.Objects.equals(this.memoryUsedInGB, other.memoryUsedInGB)
                && java.util.Objects.equals(
                        this.memoryUtilizationInPercent, other.memoryUtilizationInPercent)
                && java.util.Objects.equals(this.memoryLoadInGB, other.memoryLoadInGB)
                && java.util.Objects.equals(this.realMemoryInKB, other.realMemoryInKB)
                && java.util.Objects.equals(this.freeMemoryInKB, other.freeMemoryInKB)
                && java.util.Objects.equals(this.logicalMemoryUsedInGB, other.logicalMemoryUsedInGB)
                && java.util.Objects.equals(
                        this.logicalMemoryUtilizationInPercent,
                        other.logicalMemoryUtilizationInPercent)
                && java.util.Objects.equals(this.freeLogicalMemoryInKB, other.freeLogicalMemoryInKB)
                && java.util.Objects.equals(this.majorPageFaults, other.majorPageFaults)
                && java.util.Objects.equals(this.swapFreeInKB, other.swapFreeInKB)
                && java.util.Objects.equals(this.anonHugePagesInKB, other.anonHugePagesInKB)
                && java.util.Objects.equals(this.hugePagesFree, other.hugePagesFree)
                && java.util.Objects.equals(this.hugePagesReserved, other.hugePagesReserved)
                && java.util.Objects.equals(this.hugePagesSurplus, other.hugePagesSurplus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.memoryUsedInGB == null ? 43 : this.memoryUsedInGB.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryUtilizationInPercent == null
                                ? 43
                                : this.memoryUtilizationInPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryLoadInGB == null ? 43 : this.memoryLoadInGB.hashCode());
        result =
                (result * PRIME)
                        + (this.realMemoryInKB == null ? 43 : this.realMemoryInKB.hashCode());
        result =
                (result * PRIME)
                        + (this.freeMemoryInKB == null ? 43 : this.freeMemoryInKB.hashCode());
        result =
                (result * PRIME)
                        + (this.logicalMemoryUsedInGB == null
                                ? 43
                                : this.logicalMemoryUsedInGB.hashCode());
        result =
                (result * PRIME)
                        + (this.logicalMemoryUtilizationInPercent == null
                                ? 43
                                : this.logicalMemoryUtilizationInPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.freeLogicalMemoryInKB == null
                                ? 43
                                : this.freeLogicalMemoryInKB.hashCode());
        result =
                (result * PRIME)
                        + (this.majorPageFaults == null ? 43 : this.majorPageFaults.hashCode());
        result = (result * PRIME) + (this.swapFreeInKB == null ? 43 : this.swapFreeInKB.hashCode());
        result =
                (result * PRIME)
                        + (this.anonHugePagesInKB == null ? 43 : this.anonHugePagesInKB.hashCode());
        result =
                (result * PRIME)
                        + (this.hugePagesFree == null ? 43 : this.hugePagesFree.hashCode());
        result =
                (result * PRIME)
                        + (this.hugePagesReserved == null ? 43 : this.hugePagesReserved.hashCode());
        result =
                (result * PRIME)
                        + (this.hugePagesSurplus == null ? 43 : this.hugePagesSurplus.hashCode());
        return result;
    }
}
