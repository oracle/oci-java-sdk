/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Statistical data in profiling results
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataTypeStat.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DataTypeStat {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Integer confidence;

        public Builder confidence(Integer confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freq")
        private Long freq;

        public Builder freq(Long freq) {
            this.freq = freq;
            this.__explicitlySet__.add("freq");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freqPercentage")
        private Double freqPercentage;

        public Builder freqPercentage(Double freqPercentage) {
            this.freqPercentage = freqPercentage;
            this.__explicitlySet__.add("freqPercentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataTypeStat build() {
            DataTypeStat __instance__ = new DataTypeStat(value, confidence, freq, freqPercentage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataTypeStat o) {
            Builder copiedBuilder =
                    value(o.getValue())
                            .confidence(o.getConfidence())
                            .freq(o.getFreq())
                            .freqPercentage(o.getFreqPercentage());

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
     * Value of the confidence of the profile result
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * Placeholder for now, in future we will return the confidence of the profile result (because we are using sampled data and not whole data)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    Integer confidence;

    /**
     * How many times that value occurred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freq")
    Long freq;

    /**
     * Frequency percentage across the sampled row counts (excluding nulls).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freqPercentage")
    Double freqPercentage;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
