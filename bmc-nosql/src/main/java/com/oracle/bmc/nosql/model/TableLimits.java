/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.nosql.model;

/**
 * Throughput and storage limits configuration of a table.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TableLimits.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TableLimits {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("maxReadUnits")
        private Integer maxReadUnits;

        public Builder maxReadUnits(Integer maxReadUnits) {
            this.maxReadUnits = maxReadUnits;
            this.__explicitlySet__.add("maxReadUnits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxWriteUnits")
        private Integer maxWriteUnits;

        public Builder maxWriteUnits(Integer maxWriteUnits) {
            this.maxWriteUnits = maxWriteUnits;
            this.__explicitlySet__.add("maxWriteUnits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxStorageInGBs")
        private Integer maxStorageInGBs;

        public Builder maxStorageInGBs(Integer maxStorageInGBs) {
            this.maxStorageInGBs = maxStorageInGBs;
            this.__explicitlySet__.add("maxStorageInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableLimits build() {
            TableLimits __instance__ =
                    new TableLimits(maxReadUnits, maxWriteUnits, maxStorageInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableLimits o) {
            Builder copiedBuilder =
                    maxReadUnits(o.getMaxReadUnits())
                            .maxWriteUnits(o.getMaxWriteUnits())
                            .maxStorageInGBs(o.getMaxStorageInGBs());

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
     * Maximum sustained read throughput limit for the table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxReadUnits")
    Integer maxReadUnits;

    /**
     * Maximum sustained write throughput limit for the table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxWriteUnits")
    Integer maxWriteUnits;

    /**
     * Maximum size of storage used by the table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxStorageInGBs")
    Integer maxStorageInGBs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
