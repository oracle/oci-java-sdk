/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * TableUsageSummary represents a single usage record, or slice, that includes
 * information about read and write throughput consumed during that period
 * as well as the current information regarding storage capacity. In
 * addition the count of throttling exceptions for the period is reported.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TableUsageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TableUsageSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "secondsInPeriod",
        "readUnits",
        "writeUnits",
        "storageInGBs",
        "readThrottleCount",
        "writeThrottleCount",
        "storageThrottleCount",
        "maxShardSizeUsageInPercent"
    })
    public TableUsageSummary(
            Integer secondsInPeriod,
            Integer readUnits,
            Integer writeUnits,
            Integer storageInGBs,
            Integer readThrottleCount,
            Integer writeThrottleCount,
            Integer storageThrottleCount,
            Integer maxShardSizeUsageInPercent) {
        super();
        this.secondsInPeriod = secondsInPeriod;
        this.readUnits = readUnits;
        this.writeUnits = writeUnits;
        this.storageInGBs = storageInGBs;
        this.readThrottleCount = readThrottleCount;
        this.writeThrottleCount = writeThrottleCount;
        this.storageThrottleCount = storageThrottleCount;
        this.maxShardSizeUsageInPercent = maxShardSizeUsageInPercent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The length of the sampling period.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secondsInPeriod")
        private Integer secondsInPeriod;

        /**
         * The length of the sampling period.
         * @param secondsInPeriod the value to set
         * @return this builder
         **/
        public Builder secondsInPeriod(Integer secondsInPeriod) {
            this.secondsInPeriod = secondsInPeriod;
            this.__explicitlySet__.add("secondsInPeriod");
            return this;
        }
        /**
         * Read throughput during the sampling period.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("readUnits")
        private Integer readUnits;

        /**
         * Read throughput during the sampling period.
         * @param readUnits the value to set
         * @return this builder
         **/
        public Builder readUnits(Integer readUnits) {
            this.readUnits = readUnits;
            this.__explicitlySet__.add("readUnits");
            return this;
        }
        /**
         * Write throughput during the sampling period.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("writeUnits")
        private Integer writeUnits;

        /**
         * Write throughput during the sampling period.
         * @param writeUnits the value to set
         * @return this builder
         **/
        public Builder writeUnits(Integer writeUnits) {
            this.writeUnits = writeUnits;
            this.__explicitlySet__.add("writeUnits");
            return this;
        }
        /**
         * The size of the table, in GB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageInGBs")
        private Integer storageInGBs;

        /**
         * The size of the table, in GB.
         * @param storageInGBs the value to set
         * @return this builder
         **/
        public Builder storageInGBs(Integer storageInGBs) {
            this.storageInGBs = storageInGBs;
            this.__explicitlySet__.add("storageInGBs");
            return this;
        }
        /**
         * The number of times reads were throttled due to exceeding
         * the read throughput limit.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("readThrottleCount")
        private Integer readThrottleCount;

        /**
         * The number of times reads were throttled due to exceeding
         * the read throughput limit.
         *
         * @param readThrottleCount the value to set
         * @return this builder
         **/
        public Builder readThrottleCount(Integer readThrottleCount) {
            this.readThrottleCount = readThrottleCount;
            this.__explicitlySet__.add("readThrottleCount");
            return this;
        }
        /**
         * The number of times writes were throttled due to exceeding
         * the write throughput limit.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("writeThrottleCount")
        private Integer writeThrottleCount;

        /**
         * The number of times writes were throttled due to exceeding
         * the write throughput limit.
         *
         * @param writeThrottleCount the value to set
         * @return this builder
         **/
        public Builder writeThrottleCount(Integer writeThrottleCount) {
            this.writeThrottleCount = writeThrottleCount;
            this.__explicitlySet__.add("writeThrottleCount");
            return this;
        }
        /**
         * The number of times writes were throttled because the table
         * exceeded its size limit.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageThrottleCount")
        private Integer storageThrottleCount;

        /**
         * The number of times writes were throttled because the table
         * exceeded its size limit.
         *
         * @param storageThrottleCount the value to set
         * @return this builder
         **/
        public Builder storageThrottleCount(Integer storageThrottleCount) {
            this.storageThrottleCount = storageThrottleCount;
            this.__explicitlySet__.add("storageThrottleCount");
            return this;
        }
        /**
         * The percentage of allowed per-shard usage for the table shard with the highest usage.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxShardSizeUsageInPercent")
        private Integer maxShardSizeUsageInPercent;

        /**
         * The percentage of allowed per-shard usage for the table shard with the highest usage.
         *
         * @param maxShardSizeUsageInPercent the value to set
         * @return this builder
         **/
        public Builder maxShardSizeUsageInPercent(Integer maxShardSizeUsageInPercent) {
            this.maxShardSizeUsageInPercent = maxShardSizeUsageInPercent;
            this.__explicitlySet__.add("maxShardSizeUsageInPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableUsageSummary build() {
            TableUsageSummary model =
                    new TableUsageSummary(
                            this.secondsInPeriod,
                            this.readUnits,
                            this.writeUnits,
                            this.storageInGBs,
                            this.readThrottleCount,
                            this.writeThrottleCount,
                            this.storageThrottleCount,
                            this.maxShardSizeUsageInPercent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableUsageSummary model) {
            if (model.wasPropertyExplicitlySet("secondsInPeriod")) {
                this.secondsInPeriod(model.getSecondsInPeriod());
            }
            if (model.wasPropertyExplicitlySet("readUnits")) {
                this.readUnits(model.getReadUnits());
            }
            if (model.wasPropertyExplicitlySet("writeUnits")) {
                this.writeUnits(model.getWriteUnits());
            }
            if (model.wasPropertyExplicitlySet("storageInGBs")) {
                this.storageInGBs(model.getStorageInGBs());
            }
            if (model.wasPropertyExplicitlySet("readThrottleCount")) {
                this.readThrottleCount(model.getReadThrottleCount());
            }
            if (model.wasPropertyExplicitlySet("writeThrottleCount")) {
                this.writeThrottleCount(model.getWriteThrottleCount());
            }
            if (model.wasPropertyExplicitlySet("storageThrottleCount")) {
                this.storageThrottleCount(model.getStorageThrottleCount());
            }
            if (model.wasPropertyExplicitlySet("maxShardSizeUsageInPercent")) {
                this.maxShardSizeUsageInPercent(model.getMaxShardSizeUsageInPercent());
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

    /**
     * The length of the sampling period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secondsInPeriod")
    private final Integer secondsInPeriod;

    /**
     * The length of the sampling period.
     * @return the value
     **/
    public Integer getSecondsInPeriod() {
        return secondsInPeriod;
    }

    /**
     * Read throughput during the sampling period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readUnits")
    private final Integer readUnits;

    /**
     * Read throughput during the sampling period.
     * @return the value
     **/
    public Integer getReadUnits() {
        return readUnits;
    }

    /**
     * Write throughput during the sampling period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("writeUnits")
    private final Integer writeUnits;

    /**
     * Write throughput during the sampling period.
     * @return the value
     **/
    public Integer getWriteUnits() {
        return writeUnits;
    }

    /**
     * The size of the table, in GB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageInGBs")
    private final Integer storageInGBs;

    /**
     * The size of the table, in GB.
     * @return the value
     **/
    public Integer getStorageInGBs() {
        return storageInGBs;
    }

    /**
     * The number of times reads were throttled due to exceeding
     * the read throughput limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readThrottleCount")
    private final Integer readThrottleCount;

    /**
     * The number of times reads were throttled due to exceeding
     * the read throughput limit.
     *
     * @return the value
     **/
    public Integer getReadThrottleCount() {
        return readThrottleCount;
    }

    /**
     * The number of times writes were throttled due to exceeding
     * the write throughput limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("writeThrottleCount")
    private final Integer writeThrottleCount;

    /**
     * The number of times writes were throttled due to exceeding
     * the write throughput limit.
     *
     * @return the value
     **/
    public Integer getWriteThrottleCount() {
        return writeThrottleCount;
    }

    /**
     * The number of times writes were throttled because the table
     * exceeded its size limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageThrottleCount")
    private final Integer storageThrottleCount;

    /**
     * The number of times writes were throttled because the table
     * exceeded its size limit.
     *
     * @return the value
     **/
    public Integer getStorageThrottleCount() {
        return storageThrottleCount;
    }

    /**
     * The percentage of allowed per-shard usage for the table shard with the highest usage.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxShardSizeUsageInPercent")
    private final Integer maxShardSizeUsageInPercent;

    /**
     * The percentage of allowed per-shard usage for the table shard with the highest usage.
     *
     * @return the value
     **/
    public Integer getMaxShardSizeUsageInPercent() {
        return maxShardSizeUsageInPercent;
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
        sb.append("TableUsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("secondsInPeriod=").append(String.valueOf(this.secondsInPeriod));
        sb.append(", readUnits=").append(String.valueOf(this.readUnits));
        sb.append(", writeUnits=").append(String.valueOf(this.writeUnits));
        sb.append(", storageInGBs=").append(String.valueOf(this.storageInGBs));
        sb.append(", readThrottleCount=").append(String.valueOf(this.readThrottleCount));
        sb.append(", writeThrottleCount=").append(String.valueOf(this.writeThrottleCount));
        sb.append(", storageThrottleCount=").append(String.valueOf(this.storageThrottleCount));
        sb.append(", maxShardSizeUsageInPercent=")
                .append(String.valueOf(this.maxShardSizeUsageInPercent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableUsageSummary)) {
            return false;
        }

        TableUsageSummary other = (TableUsageSummary) o;
        return java.util.Objects.equals(this.secondsInPeriod, other.secondsInPeriod)
                && java.util.Objects.equals(this.readUnits, other.readUnits)
                && java.util.Objects.equals(this.writeUnits, other.writeUnits)
                && java.util.Objects.equals(this.storageInGBs, other.storageInGBs)
                && java.util.Objects.equals(this.readThrottleCount, other.readThrottleCount)
                && java.util.Objects.equals(this.writeThrottleCount, other.writeThrottleCount)
                && java.util.Objects.equals(this.storageThrottleCount, other.storageThrottleCount)
                && java.util.Objects.equals(
                        this.maxShardSizeUsageInPercent, other.maxShardSizeUsageInPercent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.secondsInPeriod == null ? 43 : this.secondsInPeriod.hashCode());
        result = (result * PRIME) + (this.readUnits == null ? 43 : this.readUnits.hashCode());
        result = (result * PRIME) + (this.writeUnits == null ? 43 : this.writeUnits.hashCode());
        result = (result * PRIME) + (this.storageInGBs == null ? 43 : this.storageInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.readThrottleCount == null ? 43 : this.readThrottleCount.hashCode());
        result =
                (result * PRIME)
                        + (this.writeThrottleCount == null
                                ? 43
                                : this.writeThrottleCount.hashCode());
        result =
                (result * PRIME)
                        + (this.storageThrottleCount == null
                                ? 43
                                : this.storageThrottleCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maxShardSizeUsageInPercent == null
                                ? 43
                                : this.maxShardSizeUsageInPercent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
