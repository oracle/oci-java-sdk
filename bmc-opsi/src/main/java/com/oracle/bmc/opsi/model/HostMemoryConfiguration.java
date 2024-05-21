/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HostMemoryConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostMemoryConfiguration extends HostConfigurationMetricGroup {
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
         * Page size in kilobytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pageSizeInKB")
        private Double pageSizeInKB;

        /**
         * Page size in kilobytes
         * @param pageSizeInKB the value to set
         * @return this builder
         **/
        public Builder pageSizeInKB(Double pageSizeInKB) {
            this.pageSizeInKB = pageSizeInKB;
            this.__explicitlySet__.add("pageSizeInKB");
            return this;
        }
        /**
         * Amount of memory used for page tables in kilobytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pageTablesInKB")
        private Double pageTablesInKB;

        /**
         * Amount of memory used for page tables in kilobytes
         * @param pageTablesInKB the value to set
         * @return this builder
         **/
        public Builder pageTablesInKB(Double pageTablesInKB) {
            this.pageTablesInKB = pageTablesInKB;
            this.__explicitlySet__.add("pageTablesInKB");
            return this;
        }
        /**
         * Amount of total swap space in kilobytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("swapTotalInKB")
        private Double swapTotalInKB;

        /**
         * Amount of total swap space in kilobytes
         * @param swapTotalInKB the value to set
         * @return this builder
         **/
        public Builder swapTotalInKB(Double swapTotalInKB) {
            this.swapTotalInKB = swapTotalInKB;
            this.__explicitlySet__.add("swapTotalInKB");
            return this;
        }
        /**
         * Size of huge pages in kilobytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hugePageSizeInKB")
        private Double hugePageSizeInKB;

        /**
         * Size of huge pages in kilobytes
         * @param hugePageSizeInKB the value to set
         * @return this builder
         **/
        public Builder hugePageSizeInKB(Double hugePageSizeInKB) {
            this.hugePageSizeInKB = hugePageSizeInKB;
            this.__explicitlySet__.add("hugePageSizeInKB");
            return this;
        }
        /**
         * Total number of huge pages
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hugePagesTotal")
        private Integer hugePagesTotal;

        /**
         * Total number of huge pages
         * @param hugePagesTotal the value to set
         * @return this builder
         **/
        public Builder hugePagesTotal(Integer hugePagesTotal) {
            this.hugePagesTotal = hugePagesTotal;
            this.__explicitlySet__.add("hugePagesTotal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostMemoryConfiguration build() {
            HostMemoryConfiguration model =
                    new HostMemoryConfiguration(
                            this.timeCollected,
                            this.pageSizeInKB,
                            this.pageTablesInKB,
                            this.swapTotalInKB,
                            this.hugePageSizeInKB,
                            this.hugePagesTotal);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostMemoryConfiguration model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("pageSizeInKB")) {
                this.pageSizeInKB(model.getPageSizeInKB());
            }
            if (model.wasPropertyExplicitlySet("pageTablesInKB")) {
                this.pageTablesInKB(model.getPageTablesInKB());
            }
            if (model.wasPropertyExplicitlySet("swapTotalInKB")) {
                this.swapTotalInKB(model.getSwapTotalInKB());
            }
            if (model.wasPropertyExplicitlySet("hugePageSizeInKB")) {
                this.hugePageSizeInKB(model.getHugePageSizeInKB());
            }
            if (model.wasPropertyExplicitlySet("hugePagesTotal")) {
                this.hugePagesTotal(model.getHugePagesTotal());
            }
            return this;
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
    private final Double pageSizeInKB;

    /**
     * Page size in kilobytes
     * @return the value
     **/
    public Double getPageSizeInKB() {
        return pageSizeInKB;
    }

    /**
     * Amount of memory used for page tables in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pageTablesInKB")
    private final Double pageTablesInKB;

    /**
     * Amount of memory used for page tables in kilobytes
     * @return the value
     **/
    public Double getPageTablesInKB() {
        return pageTablesInKB;
    }

    /**
     * Amount of total swap space in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("swapTotalInKB")
    private final Double swapTotalInKB;

    /**
     * Amount of total swap space in kilobytes
     * @return the value
     **/
    public Double getSwapTotalInKB() {
        return swapTotalInKB;
    }

    /**
     * Size of huge pages in kilobytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePageSizeInKB")
    private final Double hugePageSizeInKB;

    /**
     * Size of huge pages in kilobytes
     * @return the value
     **/
    public Double getHugePageSizeInKB() {
        return hugePageSizeInKB;
    }

    /**
     * Total number of huge pages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hugePagesTotal")
    private final Integer hugePagesTotal;

    /**
     * Total number of huge pages
     * @return the value
     **/
    public Integer getHugePagesTotal() {
        return hugePagesTotal;
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
        sb.append("HostMemoryConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pageSizeInKB=").append(String.valueOf(this.pageSizeInKB));
        sb.append(", pageTablesInKB=").append(String.valueOf(this.pageTablesInKB));
        sb.append(", swapTotalInKB=").append(String.valueOf(this.swapTotalInKB));
        sb.append(", hugePageSizeInKB=").append(String.valueOf(this.hugePageSizeInKB));
        sb.append(", hugePagesTotal=").append(String.valueOf(this.hugePagesTotal));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostMemoryConfiguration)) {
            return false;
        }

        HostMemoryConfiguration other = (HostMemoryConfiguration) o;
        return java.util.Objects.equals(this.pageSizeInKB, other.pageSizeInKB)
                && java.util.Objects.equals(this.pageTablesInKB, other.pageTablesInKB)
                && java.util.Objects.equals(this.swapTotalInKB, other.swapTotalInKB)
                && java.util.Objects.equals(this.hugePageSizeInKB, other.hugePageSizeInKB)
                && java.util.Objects.equals(this.hugePagesTotal, other.hugePagesTotal)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pageSizeInKB == null ? 43 : this.pageSizeInKB.hashCode());
        result =
                (result * PRIME)
                        + (this.pageTablesInKB == null ? 43 : this.pageTablesInKB.hashCode());
        result =
                (result * PRIME)
                        + (this.swapTotalInKB == null ? 43 : this.swapTotalInKB.hashCode());
        result =
                (result * PRIME)
                        + (this.hugePageSizeInKB == null ? 43 : this.hugePageSizeInKB.hashCode());
        result =
                (result * PRIME)
                        + (this.hugePagesTotal == null ? 43 : this.hugePagesTotal.hashCode());
        return result;
    }
}
