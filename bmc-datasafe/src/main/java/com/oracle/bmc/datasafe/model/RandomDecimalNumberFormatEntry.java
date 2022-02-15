/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Random Decimal Number masking format generates random and unique decimal
 * numbers within a range. The range is defined by the startValue and endValue
 * attributes. The start value must be less than or equal to the end value. To
 * learn more, check Random Decimal Number in the Data Safe documentation.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RandomDecimalNumberFormatEntry.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RandomDecimalNumberFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startValue")
        private Double startValue;

        public Builder startValue(Double startValue) {
            this.startValue = startValue;
            this.__explicitlySet__.add("startValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endValue")
        private Double endValue;

        public Builder endValue(Double endValue) {
            this.endValue = endValue;
            this.__explicitlySet__.add("endValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RandomDecimalNumberFormatEntry build() {
            RandomDecimalNumberFormatEntry __instance__ =
                    new RandomDecimalNumberFormatEntry(description, startValue, endValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RandomDecimalNumberFormatEntry o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .startValue(o.getStartValue())
                            .endValue(o.getEndValue());

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
    public RandomDecimalNumberFormatEntry(String description, Double startValue, Double endValue) {
        super(description);
        this.startValue = startValue;
        this.endValue = endValue;
    }

    /**
     * The lower bound of the range within which random decimal numbers should
     * be generated. It must be less than or equal to the end value. It supports
     * input of double type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startValue")
    Double startValue;

    /**
     * The upper bound of the range within which random decimal numbers should be
     * generated. It must be greater than or equal to the start value. It supports
     * input of double type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endValue")
    Double endValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
