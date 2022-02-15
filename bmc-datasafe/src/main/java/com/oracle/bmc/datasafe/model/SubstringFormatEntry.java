/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Substring masking format extracts a portion of the original column
 * value and uses it to replace the original value. It internally uses the
 * Oracle SUBSTR function. It takes the start position and length as input,
 * extracts substring from the original value using SUBSTR, and uses the
 * substring to replace the original value. To learn more, check Substring
 * in the Data Safe documentation.
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
    builder = SubstringFormatEntry.Builder.class
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
public class SubstringFormatEntry extends FormatEntry {
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

        @com.fasterxml.jackson.annotation.JsonProperty("startPosition")
        private Integer startPosition;

        public Builder startPosition(Integer startPosition) {
            this.startPosition = startPosition;
            this.__explicitlySet__.add("startPosition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubstringFormatEntry build() {
            SubstringFormatEntry __instance__ =
                    new SubstringFormatEntry(description, startPosition, length);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubstringFormatEntry o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .startPosition(o.getStartPosition())
                            .length(o.getLength());

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
    public SubstringFormatEntry(String description, Integer startPosition, Integer length) {
        super(description);
        this.startPosition = startPosition;
        this.length = length;
    }

    /**
     * The starting position in the original string from where the substring
     * should be extracted. It can be either a positive or a negative integer.
     * If It's negative, the counting starts from the end of the string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startPosition")
    Integer startPosition;

    /**
     * The number of characters that should be there in the substring. It should
     * be an integer and greater than zero.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    Integer length;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
