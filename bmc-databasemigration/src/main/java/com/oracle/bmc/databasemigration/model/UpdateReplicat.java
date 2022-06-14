/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Parameters for Replicat processes.
 * If an empty object is specified, the stored Replicat details will be removed.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateReplicat.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateReplicat {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mapParallelism",
        "minApplyParallelism",
        "maxApplyParallelism"
    })
    public UpdateReplicat(
            Integer mapParallelism, Integer minApplyParallelism, Integer maxApplyParallelism) {
        super();
        this.mapParallelism = mapParallelism;
        this.minApplyParallelism = minApplyParallelism;
        this.maxApplyParallelism = maxApplyParallelism;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Number of threads used to read trail files (valid for Parallel Replicat)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mapParallelism")
        private Integer mapParallelism;

        /**
         * Number of threads used to read trail files (valid for Parallel Replicat)
         *
         * @param mapParallelism the value to set
         * @return this builder
         **/
        public Builder mapParallelism(Integer mapParallelism) {
            this.mapParallelism = mapParallelism;
            this.__explicitlySet__.add("mapParallelism");
            return this;
        }
        /**
         * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minApplyParallelism")
        private Integer minApplyParallelism;

        /**
         * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
         *
         * @param minApplyParallelism the value to set
         * @return this builder
         **/
        public Builder minApplyParallelism(Integer minApplyParallelism) {
            this.minApplyParallelism = minApplyParallelism;
            this.__explicitlySet__.add("minApplyParallelism");
            return this;
        }
        /**
         * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxApplyParallelism")
        private Integer maxApplyParallelism;

        /**
         * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
         *
         * @param maxApplyParallelism the value to set
         * @return this builder
         **/
        public Builder maxApplyParallelism(Integer maxApplyParallelism) {
            this.maxApplyParallelism = maxApplyParallelism;
            this.__explicitlySet__.add("maxApplyParallelism");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateReplicat build() {
            UpdateReplicat __instance__ =
                    new UpdateReplicat(mapParallelism, minApplyParallelism, maxApplyParallelism);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateReplicat o) {
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Number of threads used to read trail files (valid for Parallel Replicat)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mapParallelism")
    private final Integer mapParallelism;

    /**
     * Number of threads used to read trail files (valid for Parallel Replicat)
     *
     * @return the value
     **/
    public Integer getMapParallelism() {
        return mapParallelism;
    }

    /**
     * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minApplyParallelism")
    private final Integer minApplyParallelism;

    /**
     * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     *
     * @return the value
     **/
    public Integer getMinApplyParallelism() {
        return minApplyParallelism;
    }

    /**
     * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxApplyParallelism")
    private final Integer maxApplyParallelism;

    /**
     * Defines the range in which Replicat automatically adjusts its apply parallelism (valid for Parallel Replicat)
     *
     * @return the value
     **/
    public Integer getMaxApplyParallelism() {
        return maxApplyParallelism;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateReplicat(");
        sb.append("mapParallelism=").append(String.valueOf(this.mapParallelism));
        sb.append(", minApplyParallelism=").append(String.valueOf(this.minApplyParallelism));
        sb.append(", maxApplyParallelism=").append(String.valueOf(this.maxApplyParallelism));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateReplicat)) {
            return false;
        }

        UpdateReplicat other = (UpdateReplicat) o;
        return java.util.Objects.equals(this.mapParallelism, other.mapParallelism)
                && java.util.Objects.equals(this.minApplyParallelism, other.minApplyParallelism)
                && java.util.Objects.equals(this.maxApplyParallelism, other.maxApplyParallelism)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mapParallelism == null ? 43 : this.mapParallelism.hashCode());
        result =
                (result * PRIME)
                        + (this.minApplyParallelism == null
                                ? 43
                                : this.minApplyParallelism.hashCode());
        result =
                (result * PRIME)
                        + (this.maxApplyParallelism == null
                                ? 43
                                : this.maxApplyParallelism.hashCode());
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
