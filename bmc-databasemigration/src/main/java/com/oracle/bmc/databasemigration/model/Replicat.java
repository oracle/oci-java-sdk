/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Parameters for Replicat processes.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200720")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Replicat.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Replicat {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("mapParallelism")
        private Integer mapParallelism;

        public Builder mapParallelism(Integer mapParallelism) {
            this.mapParallelism = mapParallelism;
            this.__explicitlySet__.add("mapParallelism");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minApplyParallelism")
        private Integer minApplyParallelism;

        public Builder minApplyParallelism(Integer minApplyParallelism) {
            this.minApplyParallelism = minApplyParallelism;
            this.__explicitlySet__.add("minApplyParallelism");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxApplyParallelism")
        private Integer maxApplyParallelism;

        public Builder maxApplyParallelism(Integer maxApplyParallelism) {
            this.maxApplyParallelism = maxApplyParallelism;
            this.__explicitlySet__.add("maxApplyParallelism");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Replicat build() {
            Replicat __instance__ =
                    new Replicat(mapParallelism, minApplyParallelism, maxApplyParallelism);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Replicat o) {
            Builder copiedBuilder =
                    mapParallelism(o.getMapParallelism())
                            .minApplyParallelism(o.getMinApplyParallelism())
                            .maxApplyParallelism(o.getMaxApplyParallelism());

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
     * Number of threads used to read trail files (valid for Parallel Replicat)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mapParallelism")
    Integer mapParallelism;

    /**
     * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minApplyParallelism")
    Integer minApplyParallelism;

    /**
     * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxApplyParallelism")
    Integer maxApplyParallelism;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
