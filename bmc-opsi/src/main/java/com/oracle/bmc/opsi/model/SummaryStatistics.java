/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains common summary statistics.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummaryStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SummaryStatistics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("minimum")
        private Double minimum;

        public Builder minimum(Double minimum) {
            this.minimum = minimum;
            this.__explicitlySet__.add("minimum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maximum")
        private Double maximum;

        public Builder maximum(Double maximum) {
            this.maximum = maximum;
            this.__explicitlySet__.add("maximum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("average")
        private Double average;

        public Builder average(Double average) {
            this.average = average;
            this.__explicitlySet__.add("average");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("median")
        private Double median;

        public Builder median(Double median) {
            this.median = median;
            this.__explicitlySet__.add("median");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
        private Double lowerQuartile;

        public Builder lowerQuartile(Double lowerQuartile) {
            this.lowerQuartile = lowerQuartile;
            this.__explicitlySet__.add("lowerQuartile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
        private Double upperQuartile;

        public Builder upperQuartile(Double upperQuartile) {
            this.upperQuartile = upperQuartile;
            this.__explicitlySet__.add("upperQuartile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummaryStatistics build() {
            SummaryStatistics __instance__ =
                    new SummaryStatistics(
                            minimum, maximum, average, median, lowerQuartile, upperQuartile);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummaryStatistics o) {
            Builder copiedBuilder =
                    minimum(o.getMinimum())
                            .maximum(o.getMaximum())
                            .average(o.getAverage())
                            .median(o.getMedian())
                            .lowerQuartile(o.getLowerQuartile())
                            .upperQuartile(o.getUpperQuartile());

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

    /**
     * The smallest number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimum")
    Double minimum;

    /**
     * The largest number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximum")
    Double maximum;

    /**
     * The average number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("average")
    Double average;

    /**
     * The middle number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("median")
    Double median;

    /**
     * The middle number between the smallest number and the median of the data set. It's also known as the 25th quartile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
    Double lowerQuartile;

    /**
     * The middle number between the median and the largest number of the data set. It's also known as the 75th quartile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
    Double upperQuartile;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
