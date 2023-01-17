/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummaryStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummaryStatistics extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "minimum",
        "maximum",
        "average",
        "median",
        "lowerQuartile",
        "upperQuartile"
    })
    public SummaryStatistics(
            Double minimum,
            Double maximum,
            Double average,
            Double median,
            Double lowerQuartile,
            Double upperQuartile) {
        super();
        this.minimum = minimum;
        this.maximum = maximum;
        this.average = average;
        this.median = median;
        this.lowerQuartile = lowerQuartile;
        this.upperQuartile = upperQuartile;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The smallest number in the data set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minimum")
        private Double minimum;

        /**
         * The smallest number in the data set.
         * @param minimum the value to set
         * @return this builder
         **/
        public Builder minimum(Double minimum) {
            this.minimum = minimum;
            this.__explicitlySet__.add("minimum");
            return this;
        }
        /**
         * The largest number in the data set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maximum")
        private Double maximum;

        /**
         * The largest number in the data set.
         * @param maximum the value to set
         * @return this builder
         **/
        public Builder maximum(Double maximum) {
            this.maximum = maximum;
            this.__explicitlySet__.add("maximum");
            return this;
        }
        /**
         * The average number in the data set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("average")
        private Double average;

        /**
         * The average number in the data set.
         * @param average the value to set
         * @return this builder
         **/
        public Builder average(Double average) {
            this.average = average;
            this.__explicitlySet__.add("average");
            return this;
        }
        /**
         * The middle number in the data set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("median")
        private Double median;

        /**
         * The middle number in the data set.
         * @param median the value to set
         * @return this builder
         **/
        public Builder median(Double median) {
            this.median = median;
            this.__explicitlySet__.add("median");
            return this;
        }
        /**
         * The middle number between the smallest number and the median of the data set. It's also known as the 25th quartile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
        private Double lowerQuartile;

        /**
         * The middle number between the smallest number and the median of the data set. It's also known as the 25th quartile.
         * @param lowerQuartile the value to set
         * @return this builder
         **/
        public Builder lowerQuartile(Double lowerQuartile) {
            this.lowerQuartile = lowerQuartile;
            this.__explicitlySet__.add("lowerQuartile");
            return this;
        }
        /**
         * The middle number between the median and the largest number of the data set. It's also known as the 75th quartile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
        private Double upperQuartile;

        /**
         * The middle number between the median and the largest number of the data set. It's also known as the 75th quartile.
         * @param upperQuartile the value to set
         * @return this builder
         **/
        public Builder upperQuartile(Double upperQuartile) {
            this.upperQuartile = upperQuartile;
            this.__explicitlySet__.add("upperQuartile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummaryStatistics build() {
            SummaryStatistics model =
                    new SummaryStatistics(
                            this.minimum,
                            this.maximum,
                            this.average,
                            this.median,
                            this.lowerQuartile,
                            this.upperQuartile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummaryStatistics model) {
            if (model.wasPropertyExplicitlySet("minimum")) {
                this.minimum(model.getMinimum());
            }
            if (model.wasPropertyExplicitlySet("maximum")) {
                this.maximum(model.getMaximum());
            }
            if (model.wasPropertyExplicitlySet("average")) {
                this.average(model.getAverage());
            }
            if (model.wasPropertyExplicitlySet("median")) {
                this.median(model.getMedian());
            }
            if (model.wasPropertyExplicitlySet("lowerQuartile")) {
                this.lowerQuartile(model.getLowerQuartile());
            }
            if (model.wasPropertyExplicitlySet("upperQuartile")) {
                this.upperQuartile(model.getUpperQuartile());
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
     * The smallest number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimum")
    private final Double minimum;

    /**
     * The smallest number in the data set.
     * @return the value
     **/
    public Double getMinimum() {
        return minimum;
    }

    /**
     * The largest number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximum")
    private final Double maximum;

    /**
     * The largest number in the data set.
     * @return the value
     **/
    public Double getMaximum() {
        return maximum;
    }

    /**
     * The average number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("average")
    private final Double average;

    /**
     * The average number in the data set.
     * @return the value
     **/
    public Double getAverage() {
        return average;
    }

    /**
     * The middle number in the data set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("median")
    private final Double median;

    /**
     * The middle number in the data set.
     * @return the value
     **/
    public Double getMedian() {
        return median;
    }

    /**
     * The middle number between the smallest number and the median of the data set. It's also known as the 25th quartile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowerQuartile")
    private final Double lowerQuartile;

    /**
     * The middle number between the smallest number and the median of the data set. It's also known as the 25th quartile.
     * @return the value
     **/
    public Double getLowerQuartile() {
        return lowerQuartile;
    }

    /**
     * The middle number between the median and the largest number of the data set. It's also known as the 75th quartile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upperQuartile")
    private final Double upperQuartile;

    /**
     * The middle number between the median and the largest number of the data set. It's also known as the 75th quartile.
     * @return the value
     **/
    public Double getUpperQuartile() {
        return upperQuartile;
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
        sb.append("SummaryStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("minimum=").append(String.valueOf(this.minimum));
        sb.append(", maximum=").append(String.valueOf(this.maximum));
        sb.append(", average=").append(String.valueOf(this.average));
        sb.append(", median=").append(String.valueOf(this.median));
        sb.append(", lowerQuartile=").append(String.valueOf(this.lowerQuartile));
        sb.append(", upperQuartile=").append(String.valueOf(this.upperQuartile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummaryStatistics)) {
            return false;
        }

        SummaryStatistics other = (SummaryStatistics) o;
        return java.util.Objects.equals(this.minimum, other.minimum)
                && java.util.Objects.equals(this.maximum, other.maximum)
                && java.util.Objects.equals(this.average, other.average)
                && java.util.Objects.equals(this.median, other.median)
                && java.util.Objects.equals(this.lowerQuartile, other.lowerQuartile)
                && java.util.Objects.equals(this.upperQuartile, other.upperQuartile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minimum == null ? 43 : this.minimum.hashCode());
        result = (result * PRIME) + (this.maximum == null ? 43 : this.maximum.hashCode());
        result = (result * PRIME) + (this.average == null ? 43 : this.average.hashCode());
        result = (result * PRIME) + (this.median == null ? 43 : this.median.hashCode());
        result =
                (result * PRIME)
                        + (this.lowerQuartile == null ? 43 : this.lowerQuartile.hashCode());
        result =
                (result * PRIME)
                        + (this.upperQuartile == null ? 43 : this.upperQuartile.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
