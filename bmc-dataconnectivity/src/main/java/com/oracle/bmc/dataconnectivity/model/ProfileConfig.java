/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Profiling configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProfileConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProfileConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<String> attributes;

        public Builder attributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("functions")
        private java.util.List<Functions> functions;

        public Builder functions(java.util.List<Functions> functions) {
            this.functions = functions;
            this.__explicitlySet__.add("functions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("topNValFreq")
        private Integer topNValFreq;

        public Builder topNValFreq(Integer topNValFreq) {
            this.topNValFreq = topNValFreq;
            this.__explicitlySet__.add("topNValFreq");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patternThreshold")
        private Integer patternThreshold;

        public Builder patternThreshold(Integer patternThreshold) {
            this.patternThreshold = patternThreshold;
            this.__explicitlySet__.add("patternThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataTypeThreshold")
        private Integer dataTypeThreshold;

        public Builder dataTypeThreshold(Integer dataTypeThreshold) {
            this.dataTypeThreshold = dataTypeThreshold;
            this.__explicitlySet__.add("dataTypeThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProfileConfig build() {
            ProfileConfig __instance__ =
                    new ProfileConfig(
                            attributes,
                            functions,
                            topNValFreq,
                            patternThreshold,
                            dataTypeThreshold);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfileConfig o) {
            Builder copiedBuilder =
                    attributes(o.getAttributes())
                            .functions(o.getFunctions())
                            .topNValFreq(o.getTopNValFreq())
                            .patternThreshold(o.getPatternThreshold())
                            .dataTypeThreshold(o.getDataTypeThreshold());

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
     * Array of column names to profile. If empty all columns in the entity are profiled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    java.util.List<String> attributes;
    /**
     **/
    public enum Functions {
        AttributeCount("ATTRIBUTE_COUNT"),
        RowCount("ROW_COUNT"),
        DataType("DATA_TYPE"),
        DistinctCount("DISTINCT_COUNT"),
        DuplicateCount("DUPLICATE_COUNT"),
        Histogram("HISTOGRAM"),
        Max("MAX"),
        MaxLength("MAX_LENGTH"),
        Mean("MEAN"),
        MeanLength("MEAN_LENGTH"),
        Median("MEDIAN"),
        Min("MIN"),
        MinLength("MIN_LENGTH"),
        NullCount("NULL_COUNT"),
        Outlier("OUTLIER"),
        Pattern("PATTERN"),
        StandardDeviation("STANDARD_DEVIATION"),
        UniqueCount("UNIQUE_COUNT"),
        Variance("VARIANCE"),
        ValueFrequency("VALUE_FREQUENCY"),
        ;

        private final String value;
        private static java.util.Map<String, Functions> map;

        static {
            map = new java.util.HashMap<>();
            for (Functions v : Functions.values()) {
                map.put(v.getValue(), v);
            }
        }

        Functions(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Functions create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Functions: " + key);
        }
    };
    /**
     * Array of enum Strings basically what all profile functions to run. If empty, all supported functions are run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functions")
    java.util.List<Functions> functions;

    /**
     * The maximum number of value frequencies to return per column. The VFs are sorted descending on frequency and ascending on value and then topN are returned and rest discarded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("topNValFreq")
    Integer topNValFreq;

    /**
     * A pattern has to qualify minumum this percentage threshold to be considered a legitimate pattern on its own. All patterns which does not qualify this will be clubbed together into a single 'Others' pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternThreshold")
    Integer patternThreshold;

    /**
     * A data type has to qualify minimum this percentage threshold to be considered an infrred data type for a column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataTypeThreshold")
    Integer dataTypeThreshold;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
