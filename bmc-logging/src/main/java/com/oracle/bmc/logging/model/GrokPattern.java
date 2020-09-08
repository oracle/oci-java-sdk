/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * grok pattern object
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GrokPattern.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GrokPattern {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        public Builder pattern(String pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeKey")
        private String fieldTimeKey;

        public Builder fieldTimeKey(String fieldTimeKey) {
            this.fieldTimeKey = fieldTimeKey;
            this.__explicitlySet__.add("fieldTimeKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeFormat")
        private String fieldTimeFormat;

        public Builder fieldTimeFormat(String fieldTimeFormat) {
            this.fieldTimeFormat = fieldTimeFormat;
            this.__explicitlySet__.add("fieldTimeFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeZone")
        private String fieldTimeZone;

        public Builder fieldTimeZone(String fieldTimeZone) {
            this.fieldTimeZone = fieldTimeZone;
            this.__explicitlySet__.add("fieldTimeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GrokPattern build() {
            GrokPattern __instance__ =
                    new GrokPattern(pattern, name, fieldTimeKey, fieldTimeFormat, fieldTimeZone);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GrokPattern o) {
            Builder copiedBuilder =
                    pattern(o.getPattern())
                            .name(o.getName())
                            .fieldTimeKey(o.getFieldTimeKey())
                            .fieldTimeFormat(o.getFieldTimeFormat())
                            .fieldTimeZone(o.getFieldTimeZone());

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
     * The grok pattern
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    String pattern;

    /**
     * The name key to tag this grok pattern
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Specify time field for event time. If the event doesn't have this field, current time is used.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeKey")
    String fieldTimeKey;

    /**
     * Process value using specified format. This is available only when time_type is string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeFormat")
    String fieldTimeFormat;

    /**
     * Use specified timezone. One can parse/format the time value in the specified timezone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldTimeZone")
    String fieldTimeZone;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
