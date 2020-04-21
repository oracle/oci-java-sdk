/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The possible configurations for the amount of memory available to an instance of this shape.
 * If this field is null, then all instances of this shape have a fixed
 * amount of memory equivalent to `memoryInGBs`.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ShapeMemoryOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ShapeMemoryOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
        private Float minInGBs;

        public Builder minInGBs(Float minInGBs) {
            this.minInGBs = minInGBs;
            this.__explicitlySet__.add("minInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
        private Float maxInGBs;

        public Builder maxInGBs(Float maxInGBs) {
            this.maxInGBs = maxInGBs;
            this.__explicitlySet__.add("maxInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGBs")
        private Float defaultPerOcpuInGBs;

        public Builder defaultPerOcpuInGBs(Float defaultPerOcpuInGBs) {
            this.defaultPerOcpuInGBs = defaultPerOcpuInGBs;
            this.__explicitlySet__.add("defaultPerOcpuInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeMemoryOptions build() {
            ShapeMemoryOptions __instance__ =
                    new ShapeMemoryOptions(minInGBs, maxInGBs, defaultPerOcpuInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeMemoryOptions o) {
            Builder copiedBuilder =
                    minInGBs(o.getMinInGBs())
                            .maxInGBs(o.getMaxInGBs())
                            .defaultPerOcpuInGBs(o.getDefaultPerOcpuInGBs());

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
     * The minimum amount of memory, in gigabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minInGBs")
    Float minInGBs;

    /**
     * The maximum amount of memory, in gigabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxInGBs")
    Float maxInGBs;

    /**
     * The default amount of memory, in gigabytes, per OCPU available to an instance
     * of this shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpuInGBs")
    Float defaultPerOcpuInGBs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
