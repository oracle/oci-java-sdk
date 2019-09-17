/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * The shape of the DB system. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
 * For a description of shapes, see [DB System Launch Options](https://docs.cloud.oracle.com/Content/Database/References/launchoptions.htm).
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator.
 * If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
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
    builder = DbSystemShapeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DbSystemShapeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeFamily")
        private String shapeFamily;

        public Builder shapeFamily(String shapeFamily) {
            this.shapeFamily = shapeFamily;
            this.__explicitlySet__.add("shapeFamily");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
        private Integer availableCoreCount;

        public Builder availableCoreCount(Integer availableCoreCount) {
            this.availableCoreCount = availableCoreCount;
            this.__explicitlySet__.add("availableCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
        private Integer minimumCoreCount;

        public Builder minimumCoreCount(Integer minimumCoreCount) {
            this.minimumCoreCount = minimumCoreCount;
            this.__explicitlySet__.add("minimumCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("coreCountIncrement")
        private Integer coreCountIncrement;

        public Builder coreCountIncrement(Integer coreCountIncrement) {
            this.coreCountIncrement = coreCountIncrement;
            this.__explicitlySet__.add("coreCountIncrement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minimumNodeCount")
        private Integer minimumNodeCount;

        public Builder minimumNodeCount(Integer minimumNodeCount) {
            this.minimumNodeCount = minimumNodeCount;
            this.__explicitlySet__.add("minimumNodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maximumNodeCount")
        private Integer maximumNodeCount;

        public Builder maximumNodeCount(Integer maximumNodeCount) {
            this.maximumNodeCount = maximumNodeCount;
            this.__explicitlySet__.add("maximumNodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemShapeSummary build() {
            DbSystemShapeSummary __instance__ =
                    new DbSystemShapeSummary(
                            name,
                            shapeFamily,
                            shape,
                            availableCoreCount,
                            minimumCoreCount,
                            coreCountIncrement,
                            minimumNodeCount,
                            maximumNodeCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemShapeSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .shapeFamily(o.getShapeFamily())
                            .shape(o.getShape())
                            .availableCoreCount(o.getAvailableCoreCount())
                            .minimumCoreCount(o.getMinimumCoreCount())
                            .coreCountIncrement(o.getCoreCountIncrement())
                            .minimumNodeCount(o.getMinimumNodeCount())
                            .maximumNodeCount(o.getMaximumNodeCount());

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
     * The name of the shape used for the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The family of the shape used for the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeFamily")
    String shapeFamily;

    /**
     * Deprecated. Use `name` instead of `shape`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * The maximum number of CPU cores that can be enabled on the DB system for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
    Integer availableCoreCount;

    /**
     * The minimum number of CPU cores that can be enabled on the DB system for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
    Integer minimumCoreCount;

    /**
     * The discrete number by which the CPU core count for this shape can be increased or decreased.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coreCountIncrement")
    Integer coreCountIncrement;

    /**
     * The minimum number of database nodes available for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumNodeCount")
    Integer minimumNodeCount;

    /**
     * The maximum number of database nodes available for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumNodeCount")
    Integer maximumNodeCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
