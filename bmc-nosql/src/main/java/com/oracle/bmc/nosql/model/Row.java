/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.nosql.model;

/**
 * The result of GetRow.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Row.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Row {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private java.util.Map<String, Object> value;

        public Builder value(java.util.Map<String, Object> value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiration")
        private java.util.Date timeOfExpiration;

        public Builder timeOfExpiration(java.util.Date timeOfExpiration) {
            this.timeOfExpiration = timeOfExpiration;
            this.__explicitlySet__.add("timeOfExpiration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private RequestUsage usage;

        public Builder usage(RequestUsage usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Row build() {
            Row __instance__ = new Row(value, timeOfExpiration, usage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Row o) {
            Builder copiedBuilder =
                    value(o.getValue())
                            .timeOfExpiration(o.getTimeOfExpiration())
                            .usage(o.getUsage());

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
     * The map of values from a row.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    java.util.Map<String, Object> value;

    /**
     * The expiration time of the row. A zero value indicates that
     * the row does not expire. An RFC3339 formatted datetime
     * string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiration")
    java.util.Date timeOfExpiration;

    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    RequestUsage usage;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
