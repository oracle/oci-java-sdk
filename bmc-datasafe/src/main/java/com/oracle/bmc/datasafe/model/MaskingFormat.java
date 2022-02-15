/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A masking format defines the logic to mask data in a database column. The condition attribute
 * defines the condition that must be true for applying the masking format. It enables you to do
 * <a href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional masking</a>
 * so that you can mask the column data values differently using different masking formats and
 * the associated conditions. A masking format can have one or more format entries. A format entry
 * can be a basic masking format such as Random Number, or it can be a library masking format.The
 * combined output of all the format entries is used for masking. It provides the flexibility to
 * define a masking format that can generate different parts of a data value separately and then
 * combine them to get the final data value for masking.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaskingFormat.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MaskingFormat {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("formatEntries")
        private java.util.List<FormatEntry> formatEntries;

        public Builder formatEntries(java.util.List<FormatEntry> formatEntries) {
            this.formatEntries = formatEntries;
            this.__explicitlySet__.add("formatEntries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingFormat build() {
            MaskingFormat __instance__ = new MaskingFormat(condition, description, formatEntries);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingFormat o) {
            Builder copiedBuilder =
                    condition(o.getCondition())
                            .description(o.getDescription())
                            .formatEntries(o.getFormatEntries());

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
     * A condition that must be true for applying the masking format. It can be any valid
     * SQL construct that can be used in a SQL predicate. It enables you to do
     * <a href="https://docs.oracle.com/en/cloud/paas/data-safe/udscs/conditional-masking.html">conditional masking</a>
     * so that you can mask the column data values differently using different masking
     * formats and the associated conditions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    String condition;

    /**
     * The description of the masking format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * An array of format entries. The combined output of all the format entries is
     * used for masking the column data values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("formatEntries")
    java.util.List<FormatEntry> formatEntries;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
