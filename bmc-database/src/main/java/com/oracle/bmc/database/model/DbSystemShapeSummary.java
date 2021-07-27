/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The shape of the DB system. The shape determines resources to allocate to the DB system - CPU cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
 * <p>
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
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("minStorageCount")
        private Integer minStorageCount;

        public Builder minStorageCount(Integer minStorageCount) {
            this.minStorageCount = minStorageCount;
            this.__explicitlySet__.add("minStorageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxStorageCount")
        private Integer maxStorageCount;

        public Builder maxStorageCount(Integer maxStorageCount) {
            this.maxStorageCount = maxStorageCount;
            this.__explicitlySet__.add("maxStorageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableDataStoragePerServerInTBs")
        private Double availableDataStoragePerServerInTBs;

        public Builder availableDataStoragePerServerInTBs(
                Double availableDataStoragePerServerInTBs) {
            this.availableDataStoragePerServerInTBs = availableDataStoragePerServerInTBs;
            this.__explicitlySet__.add("availableDataStoragePerServerInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryPerNodeInGBs")
        private Integer availableMemoryPerNodeInGBs;

        public Builder availableMemoryPerNodeInGBs(Integer availableMemoryPerNodeInGBs) {
            this.availableMemoryPerNodeInGBs = availableMemoryPerNodeInGBs;
            this.__explicitlySet__.add("availableMemoryPerNodeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableDbNodePerNodeInGBs")
        private Integer availableDbNodePerNodeInGBs;

        public Builder availableDbNodePerNodeInGBs(Integer availableDbNodePerNodeInGBs) {
            this.availableDbNodePerNodeInGBs = availableDbNodePerNodeInGBs;
            this.__explicitlySet__.add("availableDbNodePerNodeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minCoreCountPerNode")
        private Integer minCoreCountPerNode;

        public Builder minCoreCountPerNode(Integer minCoreCountPerNode) {
            this.minCoreCountPerNode = minCoreCountPerNode;
            this.__explicitlySet__.add("minCoreCountPerNode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryInGBs")
        private Integer availableMemoryInGBs;

        public Builder availableMemoryInGBs(Integer availableMemoryInGBs) {
            this.availableMemoryInGBs = availableMemoryInGBs;
            this.__explicitlySet__.add("availableMemoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minMemoryPerNodeInGBs")
        private Integer minMemoryPerNodeInGBs;

        public Builder minMemoryPerNodeInGBs(Integer minMemoryPerNodeInGBs) {
            this.minMemoryPerNodeInGBs = minMemoryPerNodeInGBs;
            this.__explicitlySet__.add("minMemoryPerNodeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableDbNodeStorageInGBs")
        private Integer availableDbNodeStorageInGBs;

        public Builder availableDbNodeStorageInGBs(Integer availableDbNodeStorageInGBs) {
            this.availableDbNodeStorageInGBs = availableDbNodeStorageInGBs;
            this.__explicitlySet__.add("availableDbNodeStorageInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minDbNodeStoragePerNodeInGBs")
        private Integer minDbNodeStoragePerNodeInGBs;

        public Builder minDbNodeStoragePerNodeInGBs(Integer minDbNodeStoragePerNodeInGBs) {
            this.minDbNodeStoragePerNodeInGBs = minDbNodeStoragePerNodeInGBs;
            this.__explicitlySet__.add("minDbNodeStoragePerNodeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableDataStorageInTBs")
        private Integer availableDataStorageInTBs;

        public Builder availableDataStorageInTBs(Integer availableDataStorageInTBs) {
            this.availableDataStorageInTBs = availableDataStorageInTBs;
            this.__explicitlySet__.add("availableDataStorageInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minDataStorageInTBs")
        private Integer minDataStorageInTBs;

        public Builder minDataStorageInTBs(Integer minDataStorageInTBs) {
            this.minDataStorageInTBs = minDataStorageInTBs;
            this.__explicitlySet__.add("minDataStorageInTBs");
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

        @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCountPerNode")
        private Integer availableCoreCountPerNode;

        public Builder availableCoreCountPerNode(Integer availableCoreCountPerNode) {
            this.availableCoreCountPerNode = availableCoreCountPerNode;
            this.__explicitlySet__.add("availableCoreCountPerNode");
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
                            minStorageCount,
                            maxStorageCount,
                            availableDataStoragePerServerInTBs,
                            availableMemoryPerNodeInGBs,
                            availableDbNodePerNodeInGBs,
                            minCoreCountPerNode,
                            availableMemoryInGBs,
                            minMemoryPerNodeInGBs,
                            availableDbNodeStorageInGBs,
                            minDbNodeStoragePerNodeInGBs,
                            availableDataStorageInTBs,
                            minDataStorageInTBs,
                            minimumNodeCount,
                            maximumNodeCount,
                            availableCoreCountPerNode);
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
                            .minStorageCount(o.getMinStorageCount())
                            .maxStorageCount(o.getMaxStorageCount())
                            .availableDataStoragePerServerInTBs(
                                    o.getAvailableDataStoragePerServerInTBs())
                            .availableMemoryPerNodeInGBs(o.getAvailableMemoryPerNodeInGBs())
                            .availableDbNodePerNodeInGBs(o.getAvailableDbNodePerNodeInGBs())
                            .minCoreCountPerNode(o.getMinCoreCountPerNode())
                            .availableMemoryInGBs(o.getAvailableMemoryInGBs())
                            .minMemoryPerNodeInGBs(o.getMinMemoryPerNodeInGBs())
                            .availableDbNodeStorageInGBs(o.getAvailableDbNodeStorageInGBs())
                            .minDbNodeStoragePerNodeInGBs(o.getMinDbNodeStoragePerNodeInGBs())
                            .availableDataStorageInTBs(o.getAvailableDataStorageInTBs())
                            .minDataStorageInTBs(o.getMinDataStorageInTBs())
                            .minimumNodeCount(o.getMinimumNodeCount())
                            .maximumNodeCount(o.getMaximumNodeCount())
                            .availableCoreCountPerNode(o.getAvailableCoreCountPerNode());

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
     * Deprecated. Use {@code name} instead of {@code shape}.
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
     * The minimum number of Exadata storage servers available for the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minStorageCount")
    Integer minStorageCount;

    /**
     * The maximum number of Exadata storage servers available for the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxStorageCount")
    Integer maxStorageCount;

    /**
     * The maximum data storage available per storage server for this shape. Only applicable to ExaCC Elastic shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableDataStoragePerServerInTBs")
    Double availableDataStoragePerServerInTBs;

    /**
     * The maximum memory available per database node for this shape. Only applicable to ExaCC Elastic shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryPerNodeInGBs")
    Integer availableMemoryPerNodeInGBs;

    /**
     * The maximum Db Node storage available per database node for this shape. Only applicable to ExaCC Elastic shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableDbNodePerNodeInGBs")
    Integer availableDbNodePerNodeInGBs;

    /**
     * The minimum number of CPU cores that can be enabled per node for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minCoreCountPerNode")
    Integer minCoreCountPerNode;

    /**
     * The maximum memory that can be enabled for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryInGBs")
    Integer availableMemoryInGBs;

    /**
     * The minimum memory that need be allocated per node for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minMemoryPerNodeInGBs")
    Integer minMemoryPerNodeInGBs;

    /**
     * The maximum Db Node storage that can be enabled for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableDbNodeStorageInGBs")
    Integer availableDbNodeStorageInGBs;

    /**
     * The minimum Db Node storage that need be allocated per node for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minDbNodeStoragePerNodeInGBs")
    Integer minDbNodeStoragePerNodeInGBs;

    /**
     * The maximum DATA storage that can be enabled for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableDataStorageInTBs")
    Integer availableDataStorageInTBs;

    /**
     * The minimum data storage that need be allocated for this shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minDataStorageInTBs")
    Integer minDataStorageInTBs;

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

    /**
     * The maximum number of CPU cores per database node that can be enabled for this shape. Only applicable to the flex Exadata shape and ExaCC Elastic shapes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCountPerNode")
    Integer availableCoreCountPerNode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
