/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * A summary of profiling results of a specefic attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NumericAttribute.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class NumericAttribute extends AttributeProfileResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("patternFrequencies")
        private java.util.List<ObjectFreqStat> patternFrequencies;

        public Builder patternFrequencies(java.util.List<ObjectFreqStat> patternFrequencies) {
            this.patternFrequencies = patternFrequencies;
            this.__explicitlySet__.add("patternFrequencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NumericAttribute build() {
            NumericAttribute __instance__ =
                    new NumericAttribute(
                            name,
                            min,
                            max,
                            nullCount,
                            distinctCount,
                            uniqueCount,
                            duplicateCount,
                            valueFrequencies,
                            mean,
                            median,
                            standardDeviation,
                            variance,
                            outlier,
                            histogram,
                            patternFrequencies);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NumericAttribute o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .min(o.getMin())
                            .max(o.getMax())
                            .nullCount(o.getNullCount())
                            .distinctCount(o.getDistinctCount())
                            .uniqueCount(o.getUniqueCount())
                            .duplicateCount(o.getDuplicateCount())
                            .valueFrequencies(o.getValueFrequencies())
                            .mean(o.getMean())
                            .median(o.getMedian())
                            .standardDeviation(o.getStandardDeviation())
                            .variance(o.getVariance())
                            .outlier(o.getOutlier())
                            .histogram(o.getHistogram())
                            .patternFrequencies(o.getPatternFrequencies());

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
    ProfileStat mean;

    @com.fasterxml.jackson.annotation.JsonProperty("median")
    ProfileStat median;

    @com.fasterxml.jackson.annotation.JsonProperty("standardDeviation")
    ProfileStat standardDeviation;

    @com.fasterxml.jackson.annotation.JsonProperty("variance")
    ProfileStat variance;

    @com.fasterxml.jackson.annotation.JsonProperty("outlier")
    Outlier outlier;

    @com.fasterxml.jackson.annotation.JsonProperty("histogram")
    Histogram histogram;

    /**
     * Pattern frequencies for the column as described already in profile config.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternFrequencies")
    java.util.List<ObjectFreqStat> patternFrequencies;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
