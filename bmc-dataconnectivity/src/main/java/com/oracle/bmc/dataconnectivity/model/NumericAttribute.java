/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * A summary of profiling results of a specific attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NumericAttribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NumericAttribute extends AttributeProfileResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private ProfileStat min;

        public Builder min(ProfileStat min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private ProfileStat max;

        public Builder max(ProfileStat max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nullCount")
        private ProfileStat nullCount;

        public Builder nullCount(ProfileStat nullCount) {
            this.nullCount = nullCount;
            this.__explicitlySet__.add("nullCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("distinctCount")
        private ProfileStat distinctCount;

        public Builder distinctCount(ProfileStat distinctCount) {
            this.distinctCount = distinctCount;
            this.__explicitlySet__.add("distinctCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uniqueCount")
        private ProfileStat uniqueCount;

        public Builder uniqueCount(ProfileStat uniqueCount) {
            this.uniqueCount = uniqueCount;
            this.__explicitlySet__.add("uniqueCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("duplicateCount")
        private ProfileStat duplicateCount;

        public Builder duplicateCount(ProfileStat duplicateCount) {
            this.duplicateCount = duplicateCount;
            this.__explicitlySet__.add("duplicateCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueFrequencies")
        private java.util.List<ObjectFreqStat> valueFrequencies;

        public Builder valueFrequencies(java.util.List<ObjectFreqStat> valueFrequencies) {
            this.valueFrequencies = valueFrequencies;
            this.__explicitlySet__.add("valueFrequencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mean")
        private ProfileStat mean;

        public Builder mean(ProfileStat mean) {
            this.mean = mean;
            this.__explicitlySet__.add("mean");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("median")
        private ProfileStat median;

        public Builder median(ProfileStat median) {
            this.median = median;
            this.__explicitlySet__.add("median");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("standardDeviation")
        private ProfileStat standardDeviation;

        public Builder standardDeviation(ProfileStat standardDeviation) {
            this.standardDeviation = standardDeviation;
            this.__explicitlySet__.add("standardDeviation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("variance")
        private ProfileStat variance;

        public Builder variance(ProfileStat variance) {
            this.variance = variance;
            this.__explicitlySet__.add("variance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outlier")
        private Outlier outlier;

        public Builder outlier(Outlier outlier) {
            this.outlier = outlier;
            this.__explicitlySet__.add("outlier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("histogram")
        private Histogram histogram;

        public Builder histogram(Histogram histogram) {
            this.histogram = histogram;
            this.__explicitlySet__.add("histogram");
            return this;
        }
        /**
         * Pattern frequencies for the column as described already in profile config.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patternFrequencies")
        private java.util.List<ObjectFreqStat> patternFrequencies;

        /**
         * Pattern frequencies for the column as described already in profile config.
         * @param patternFrequencies the value to set
         * @return this builder
         **/
        public Builder patternFrequencies(java.util.List<ObjectFreqStat> patternFrequencies) {
            this.patternFrequencies = patternFrequencies;
            this.__explicitlySet__.add("patternFrequencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NumericAttribute build() {
            NumericAttribute model =
                    new NumericAttribute(
                            this.name,
                            this.min,
                            this.max,
                            this.nullCount,
                            this.distinctCount,
                            this.uniqueCount,
                            this.duplicateCount,
                            this.valueFrequencies,
                            this.mean,
                            this.median,
                            this.standardDeviation,
                            this.variance,
                            this.outlier,
                            this.histogram,
                            this.patternFrequencies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NumericAttribute model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("min")) {
                this.min(model.getMin());
            }
            if (model.wasPropertyExplicitlySet("max")) {
                this.max(model.getMax());
            }
            if (model.wasPropertyExplicitlySet("nullCount")) {
                this.nullCount(model.getNullCount());
            }
            if (model.wasPropertyExplicitlySet("distinctCount")) {
                this.distinctCount(model.getDistinctCount());
            }
            if (model.wasPropertyExplicitlySet("uniqueCount")) {
                this.uniqueCount(model.getUniqueCount());
            }
            if (model.wasPropertyExplicitlySet("duplicateCount")) {
                this.duplicateCount(model.getDuplicateCount());
            }
            if (model.wasPropertyExplicitlySet("valueFrequencies")) {
                this.valueFrequencies(model.getValueFrequencies());
            }
            if (model.wasPropertyExplicitlySet("mean")) {
                this.mean(model.getMean());
            }
            if (model.wasPropertyExplicitlySet("median")) {
                this.median(model.getMedian());
            }
            if (model.wasPropertyExplicitlySet("standardDeviation")) {
                this.standardDeviation(model.getStandardDeviation());
            }
            if (model.wasPropertyExplicitlySet("variance")) {
                this.variance(model.getVariance());
            }
            if (model.wasPropertyExplicitlySet("outlier")) {
                this.outlier(model.getOutlier());
            }
            if (model.wasPropertyExplicitlySet("histogram")) {
                this.histogram(model.getHistogram());
            }
            if (model.wasPropertyExplicitlySet("patternFrequencies")) {
                this.patternFrequencies(model.getPatternFrequencies());
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
    public NumericAttribute(
            String name,
            ProfileStat min,
            ProfileStat max,
            ProfileStat nullCount,
            ProfileStat distinctCount,
            ProfileStat uniqueCount,
            ProfileStat duplicateCount,
            java.util.List<ObjectFreqStat> valueFrequencies,
            ProfileStat mean,
            ProfileStat median,
            ProfileStat standardDeviation,
            ProfileStat variance,
            Outlier outlier,
            Histogram histogram,
            java.util.List<ObjectFreqStat> patternFrequencies) {
        super(
                name,
                min,
                max,
                nullCount,
                distinctCount,
                uniqueCount,
                duplicateCount,
                valueFrequencies);
        this.mean = mean;
        this.median = median;
        this.standardDeviation = standardDeviation;
        this.variance = variance;
        this.outlier = outlier;
        this.histogram = histogram;
        this.patternFrequencies = patternFrequencies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mean")
    private final ProfileStat mean;

    public ProfileStat getMean() {
        return mean;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("median")
    private final ProfileStat median;

    public ProfileStat getMedian() {
        return median;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("standardDeviation")
    private final ProfileStat standardDeviation;

    public ProfileStat getStandardDeviation() {
        return standardDeviation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("variance")
    private final ProfileStat variance;

    public ProfileStat getVariance() {
        return variance;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outlier")
    private final Outlier outlier;

    public Outlier getOutlier() {
        return outlier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("histogram")
    private final Histogram histogram;

    public Histogram getHistogram() {
        return histogram;
    }

    /**
     * Pattern frequencies for the column as described already in profile config.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternFrequencies")
    private final java.util.List<ObjectFreqStat> patternFrequencies;

    /**
     * Pattern frequencies for the column as described already in profile config.
     * @return the value
     **/
    public java.util.List<ObjectFreqStat> getPatternFrequencies() {
        return patternFrequencies;
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
        sb.append("NumericAttribute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", mean=").append(String.valueOf(this.mean));
        sb.append(", median=").append(String.valueOf(this.median));
        sb.append(", standardDeviation=").append(String.valueOf(this.standardDeviation));
        sb.append(", variance=").append(String.valueOf(this.variance));
        sb.append(", outlier=").append(String.valueOf(this.outlier));
        sb.append(", histogram=").append(String.valueOf(this.histogram));
        sb.append(", patternFrequencies=").append(String.valueOf(this.patternFrequencies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NumericAttribute)) {
            return false;
        }

        NumericAttribute other = (NumericAttribute) o;
        return java.util.Objects.equals(this.mean, other.mean)
                && java.util.Objects.equals(this.median, other.median)
                && java.util.Objects.equals(this.standardDeviation, other.standardDeviation)
                && java.util.Objects.equals(this.variance, other.variance)
                && java.util.Objects.equals(this.outlier, other.outlier)
                && java.util.Objects.equals(this.histogram, other.histogram)
                && java.util.Objects.equals(this.patternFrequencies, other.patternFrequencies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mean == null ? 43 : this.mean.hashCode());
        result = (result * PRIME) + (this.median == null ? 43 : this.median.hashCode());
        result =
                (result * PRIME)
                        + (this.standardDeviation == null ? 43 : this.standardDeviation.hashCode());
        result = (result * PRIME) + (this.variance == null ? 43 : this.variance.hashCode());
        result = (result * PRIME) + (this.outlier == null ? 43 : this.outlier.hashCode());
        result = (result * PRIME) + (this.histogram == null ? 43 : this.histogram.hashCode());
        result =
                (result * PRIME)
                        + (this.patternFrequencies == null
                                ? 43
                                : this.patternFrequencies.hashCode());
        return result;
    }
}
