/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * One specific element. Its meaning changes in the context i.e. For ValueFrequency, the value represents a column value. For Patterns the value represents a pattern. For DataType the value represents a data type. For DataType formats (pertaining to date time) the value represent a format.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ObjectFreqStat.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectFreqStat {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "confidence", "freq", "freqPercentage"})
    public ObjectFreqStat(String value, Integer confidence, Long freq, Double freqPercentage) {
        super();
        this.value = value;
        this.confidence = confidence;
        this.freq = freq;
        this.freqPercentage = freqPercentage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Value of the confidence of the profile result
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Value of the confidence of the profile result
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Placeholder for now, in future we will return the confidence of the profile result (because we are using sampled data and not whole data)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Integer confidence;

        /**
         * Placeholder for now, in future we will return the confidence of the profile result (because we are using sampled data and not whole data)
         * @param confidence the value to set
         * @return this builder
         **/
        public Builder confidence(Integer confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }
        /**
         * How many times that value occurred.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freq")
        private Long freq;

        /**
         * How many times that value occurred.
         * @param freq the value to set
         * @return this builder
         **/
        public Builder freq(Long freq) {
            this.freq = freq;
            this.__explicitlySet__.add("freq");
            return this;
        }
        /**
         * Frequency percentage across the sampled row counts (excluding nulls).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freqPercentage")
        private Double freqPercentage;

        /**
         * Frequency percentage across the sampled row counts (excluding nulls).
         * @param freqPercentage the value to set
         * @return this builder
         **/
        public Builder freqPercentage(Double freqPercentage) {
            this.freqPercentage = freqPercentage;
            this.__explicitlySet__.add("freqPercentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectFreqStat build() {
            ObjectFreqStat __instance__ =
                    new ObjectFreqStat(value, confidence, freq, freqPercentage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectFreqStat o) {
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Value of the confidence of the profile result
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Value of the confidence of the profile result
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Placeholder for now, in future we will return the confidence of the profile result (because we are using sampled data and not whole data)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Integer confidence;

    /**
     * Placeholder for now, in future we will return the confidence of the profile result (because we are using sampled data and not whole data)
     * @return the value
     **/
    public Integer getConfidence() {
        return confidence;
    }

    /**
     * How many times that value occurred.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freq")
    private final Long freq;

    /**
     * How many times that value occurred.
     * @return the value
     **/
    public Long getFreq() {
        return freq;
    }

    /**
     * Frequency percentage across the sampled row counts (excluding nulls).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freqPercentage")
    private final Double freqPercentage;

    /**
     * Frequency percentage across the sampled row counts (excluding nulls).
     * @return the value
     **/
    public Double getFreqPercentage() {
        return freqPercentage;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ObjectFreqStat(");
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", freq=").append(String.valueOf(this.freq));
        sb.append(", freqPercentage=").append(String.valueOf(this.freqPercentage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectFreqStat)) {
            return false;
        }

        ObjectFreqStat other = (ObjectFreqStat) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.freq, other.freq)
                && java.util.Objects.equals(this.freqPercentage, other.freqPercentage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result = (result * PRIME) + (this.freq == null ? 43 : this.freq.hashCode());
        result =
                (result * PRIME)
                        + (this.freqPercentage == null ? 43 : this.freqPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
