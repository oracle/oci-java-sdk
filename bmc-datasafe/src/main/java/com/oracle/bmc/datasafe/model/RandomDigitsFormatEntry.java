/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Random Digits masking format generates random digits of length within a range.
 * The length range is defined by the startLength and endLength attributes. The start
 * length must be less than or equal to the end length. When masking columns with
 * uniqueness constraint, ensure that the length range is sufficient enough to generate
 * unique values. This masking format pads to the appropriate length in a string, but
 * does not pad when used for a number column. It's a complementary type of Random Number,
 * which is not padded.
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
    builder = RandomDigitsFormatEntry.Builder.class
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
public class RandomDigitsFormatEntry extends FormatEntry {
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

        @com.fasterxml.jackson.annotation.JsonProperty("startLength")
        private Integer startLength;

        public Builder startLength(Integer startLength) {
            this.startLength = startLength;
            this.__explicitlySet__.add("startLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endLength")
        private Integer endLength;

        public Builder endLength(Integer endLength) {
            this.endLength = endLength;
            this.__explicitlySet__.add("endLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RandomDigitsFormatEntry build() {
            RandomDigitsFormatEntry __instance__ =
                    new RandomDigitsFormatEntry(description, startLength, endLength);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RandomDigitsFormatEntry o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .startLength(o.getStartLength())
                            .endLength(o.getEndLength());

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
    public RandomDigitsFormatEntry(String description, Integer startLength, Integer endLength) {
        super(description);
        this.startLength = startLength;
        this.endLength = endLength;
    }

    /**
     * The minimum number of digits the generated values should have. It can be
     * any integer greater than zero, but it must be less than or equal to the
     * end length.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startLength")
    Integer startLength;

    /**
     * The maximum number of digits the generated values should have. It can
     * be any integer greater than zero, but it must be greater than or equal
     * to the start length.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endLength")
    Integer endLength;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
