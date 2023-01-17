/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The shape of the DB system. The shape determines resources to allocate to the DB system - CPU
 * cores and memory for VM shapes; CPU cores, memory and storage for non-VM (or bare metal) shapes.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DbSystemShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DbSystemShapeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "shapeFamily",
        "shapeType",
        "shape",
        "availableCoreCount",
        "minimumCoreCount",
        "coreCountIncrement",
        "minStorageCount",
        "maxStorageCount",
        "availableDataStoragePerServerInTBs",
        "availableMemoryPerNodeInGBs",
        "availableDbNodePerNodeInGBs",
        "minCoreCountPerNode",
        "availableMemoryInGBs",
        "minMemoryPerNodeInGBs",
        "availableDbNodeStorageInGBs",
        "minDbNodeStoragePerNodeInGBs",
        "availableDataStorageInTBs",
        "minDataStorageInTBs",
        "minimumNodeCount",
        "maximumNodeCount",
        "availableCoreCountPerNode"
    })
    public DbSystemShapeSummary(
            String name,
            String shapeFamily,
            ShapeType shapeType,
            String shape,
            Integer availableCoreCount,
            Integer minimumCoreCount,
            Integer coreCountIncrement,
            Integer minStorageCount,
            Integer maxStorageCount,
            Double availableDataStoragePerServerInTBs,
            Integer availableMemoryPerNodeInGBs,
            Integer availableDbNodePerNodeInGBs,
            Integer minCoreCountPerNode,
            Integer availableMemoryInGBs,
            Integer minMemoryPerNodeInGBs,
            Integer availableDbNodeStorageInGBs,
            Integer minDbNodeStoragePerNodeInGBs,
            Integer availableDataStorageInTBs,
            Integer minDataStorageInTBs,
            Integer minimumNodeCount,
            Integer maximumNodeCount,
            Integer availableCoreCountPerNode) {
        super();
        this.name = name;
        this.shapeFamily = shapeFamily;
        this.shapeType = shapeType;
        this.shape = shape;
        this.availableCoreCount = availableCoreCount;
        this.minimumCoreCount = minimumCoreCount;
        this.coreCountIncrement = coreCountIncrement;
        this.minStorageCount = minStorageCount;
        this.maxStorageCount = maxStorageCount;
        this.availableDataStoragePerServerInTBs = availableDataStoragePerServerInTBs;
        this.availableMemoryPerNodeInGBs = availableMemoryPerNodeInGBs;
        this.availableDbNodePerNodeInGBs = availableDbNodePerNodeInGBs;
        this.minCoreCountPerNode = minCoreCountPerNode;
        this.availableMemoryInGBs = availableMemoryInGBs;
        this.minMemoryPerNodeInGBs = minMemoryPerNodeInGBs;
        this.availableDbNodeStorageInGBs = availableDbNodeStorageInGBs;
        this.minDbNodeStoragePerNodeInGBs = minDbNodeStoragePerNodeInGBs;
        this.availableDataStorageInTBs = availableDataStorageInTBs;
        this.minDataStorageInTBs = minDataStorageInTBs;
        this.minimumNodeCount = minimumNodeCount;
        this.maximumNodeCount = maximumNodeCount;
        this.availableCoreCountPerNode = availableCoreCountPerNode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the shape used for the DB system. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the shape used for the DB system.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The family of the shape used for the DB system. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeFamily")
        private String shapeFamily;

        /**
         * The family of the shape used for the DB system.
         *
         * @param shapeFamily the value to set
         * @return this builder
         */
        public Builder shapeFamily(String shapeFamily) {
            this.shapeFamily = shapeFamily;
            this.__explicitlySet__.add("shapeFamily");
            return this;
        }
        /**
         * The shape type for the virtual machine DB system. Shape type is determined by CPU
         * hardware. Valid values are {@code AMD} , {@code INTEL} or {@code INTEL_FLEX_X9}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeType")
        private ShapeType shapeType;

        /**
         * The shape type for the virtual machine DB system. Shape type is determined by CPU
         * hardware. Valid values are {@code AMD} , {@code INTEL} or {@code INTEL_FLEX_X9}.
         *
         * @param shapeType the value to set
         * @return this builder
         */
        public Builder shapeType(ShapeType shapeType) {
            this.shapeType = shapeType;
            this.__explicitlySet__.add("shapeType");
            return this;
        }
        /** Deprecated. Use {@code name} instead of {@code shape}. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Deprecated. Use {@code name} instead of {@code shape}.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The maximum number of CPU cores that can be enabled on the DB system for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
        private Integer availableCoreCount;

        /**
         * The maximum number of CPU cores that can be enabled on the DB system for this shape.
         *
         * @param availableCoreCount the value to set
         * @return this builder
         */
        public Builder availableCoreCount(Integer availableCoreCount) {
            this.availableCoreCount = availableCoreCount;
            this.__explicitlySet__.add("availableCoreCount");
            return this;
        }
        /** The minimum number of CPU cores that can be enabled on the DB system for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
        private Integer minimumCoreCount;

        /**
         * The minimum number of CPU cores that can be enabled on the DB system for this shape.
         *
         * @param minimumCoreCount the value to set
         * @return this builder
         */
        public Builder minimumCoreCount(Integer minimumCoreCount) {
            this.minimumCoreCount = minimumCoreCount;
            this.__explicitlySet__.add("minimumCoreCount");
            return this;
        }
        /**
         * The discrete number by which the CPU core count for this shape can be increased or
         * decreased.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("coreCountIncrement")
        private Integer coreCountIncrement;

        /**
         * The discrete number by which the CPU core count for this shape can be increased or
         * decreased.
         *
         * @param coreCountIncrement the value to set
         * @return this builder
         */
        public Builder coreCountIncrement(Integer coreCountIncrement) {
            this.coreCountIncrement = coreCountIncrement;
            this.__explicitlySet__.add("coreCountIncrement");
            return this;
        }
        /**
         * The minimum number of Exadata storage servers available for the Exadata infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minStorageCount")
        private Integer minStorageCount;

        /**
         * The minimum number of Exadata storage servers available for the Exadata infrastructure.
         *
         * @param minStorageCount the value to set
         * @return this builder
         */
        public Builder minStorageCount(Integer minStorageCount) {
            this.minStorageCount = minStorageCount;
            this.__explicitlySet__.add("minStorageCount");
            return this;
        }
        /**
         * The maximum number of Exadata storage servers available for the Exadata infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxStorageCount")
        private Integer maxStorageCount;

        /**
         * The maximum number of Exadata storage servers available for the Exadata infrastructure.
         *
         * @param maxStorageCount the value to set
         * @return this builder
         */
        public Builder maxStorageCount(Integer maxStorageCount) {
            this.maxStorageCount = maxStorageCount;
            this.__explicitlySet__.add("maxStorageCount");
            return this;
        }
        /**
         * The maximum data storage available per storage server for this shape. Only applicable to
         * ExaCC Elastic shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableDataStoragePerServerInTBs")
        private Double availableDataStoragePerServerInTBs;

        /**
         * The maximum data storage available per storage server for this shape. Only applicable to
         * ExaCC Elastic shapes.
         *
         * @param availableDataStoragePerServerInTBs the value to set
         * @return this builder
         */
        public Builder availableDataStoragePerServerInTBs(
                Double availableDataStoragePerServerInTBs) {
            this.availableDataStoragePerServerInTBs = availableDataStoragePerServerInTBs;
            this.__explicitlySet__.add("availableDataStoragePerServerInTBs");
            return this;
        }
        /**
         * The maximum memory available per database node for this shape. Only applicable to ExaCC
         * Elastic shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryPerNodeInGBs")
        private Integer availableMemoryPerNodeInGBs;

        /**
         * The maximum memory available per database node for this shape. Only applicable to ExaCC
         * Elastic shapes.
         *
         * @param availableMemoryPerNodeInGBs the value to set
         * @return this builder
         */
        public Builder availableMemoryPerNodeInGBs(Integer availableMemoryPerNodeInGBs) {
            this.availableMemoryPerNodeInGBs = availableMemoryPerNodeInGBs;
            this.__explicitlySet__.add("availableMemoryPerNodeInGBs");
            return this;
        }
        /**
         * The maximum Db Node storage available per database node for this shape. Only applicable
         * to ExaCC Elastic shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableDbNodePerNodeInGBs")
        private Integer availableDbNodePerNodeInGBs;

        /**
         * The maximum Db Node storage available per database node for this shape. Only applicable
         * to ExaCC Elastic shapes.
         *
         * @param availableDbNodePerNodeInGBs the value to set
         * @return this builder
         */
        public Builder availableDbNodePerNodeInGBs(Integer availableDbNodePerNodeInGBs) {
            this.availableDbNodePerNodeInGBs = availableDbNodePerNodeInGBs;
            this.__explicitlySet__.add("availableDbNodePerNodeInGBs");
            return this;
        }
        /** The minimum number of CPU cores that can be enabled per node for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("minCoreCountPerNode")
        private Integer minCoreCountPerNode;

        /**
         * The minimum number of CPU cores that can be enabled per node for this shape.
         *
         * @param minCoreCountPerNode the value to set
         * @return this builder
         */
        public Builder minCoreCountPerNode(Integer minCoreCountPerNode) {
            this.minCoreCountPerNode = minCoreCountPerNode;
            this.__explicitlySet__.add("minCoreCountPerNode");
            return this;
        }
        /** The maximum memory that can be enabled for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryInGBs")
        private Integer availableMemoryInGBs;

        /**
         * The maximum memory that can be enabled for this shape.
         *
         * @param availableMemoryInGBs the value to set
         * @return this builder
         */
        public Builder availableMemoryInGBs(Integer availableMemoryInGBs) {
            this.availableMemoryInGBs = availableMemoryInGBs;
            this.__explicitlySet__.add("availableMemoryInGBs");
            return this;
        }
        /** The minimum memory that need be allocated per node for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("minMemoryPerNodeInGBs")
        private Integer minMemoryPerNodeInGBs;

        /**
         * The minimum memory that need be allocated per node for this shape.
         *
         * @param minMemoryPerNodeInGBs the value to set
         * @return this builder
         */
        public Builder minMemoryPerNodeInGBs(Integer minMemoryPerNodeInGBs) {
            this.minMemoryPerNodeInGBs = minMemoryPerNodeInGBs;
            this.__explicitlySet__.add("minMemoryPerNodeInGBs");
            return this;
        }
        /** The maximum Db Node storage that can be enabled for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableDbNodeStorageInGBs")
        private Integer availableDbNodeStorageInGBs;

        /**
         * The maximum Db Node storage that can be enabled for this shape.
         *
         * @param availableDbNodeStorageInGBs the value to set
         * @return this builder
         */
        public Builder availableDbNodeStorageInGBs(Integer availableDbNodeStorageInGBs) {
            this.availableDbNodeStorageInGBs = availableDbNodeStorageInGBs;
            this.__explicitlySet__.add("availableDbNodeStorageInGBs");
            return this;
        }
        /** The minimum Db Node storage that need be allocated per node for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("minDbNodeStoragePerNodeInGBs")
        private Integer minDbNodeStoragePerNodeInGBs;

        /**
         * The minimum Db Node storage that need be allocated per node for this shape.
         *
         * @param minDbNodeStoragePerNodeInGBs the value to set
         * @return this builder
         */
        public Builder minDbNodeStoragePerNodeInGBs(Integer minDbNodeStoragePerNodeInGBs) {
            this.minDbNodeStoragePerNodeInGBs = minDbNodeStoragePerNodeInGBs;
            this.__explicitlySet__.add("minDbNodeStoragePerNodeInGBs");
            return this;
        }
        /** The maximum DATA storage that can be enabled for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableDataStorageInTBs")
        private Integer availableDataStorageInTBs;

        /**
         * The maximum DATA storage that can be enabled for this shape.
         *
         * @param availableDataStorageInTBs the value to set
         * @return this builder
         */
        public Builder availableDataStorageInTBs(Integer availableDataStorageInTBs) {
            this.availableDataStorageInTBs = availableDataStorageInTBs;
            this.__explicitlySet__.add("availableDataStorageInTBs");
            return this;
        }
        /** The minimum data storage that need be allocated for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("minDataStorageInTBs")
        private Integer minDataStorageInTBs;

        /**
         * The minimum data storage that need be allocated for this shape.
         *
         * @param minDataStorageInTBs the value to set
         * @return this builder
         */
        public Builder minDataStorageInTBs(Integer minDataStorageInTBs) {
            this.minDataStorageInTBs = minDataStorageInTBs;
            this.__explicitlySet__.add("minDataStorageInTBs");
            return this;
        }
        /** The minimum number of compute servers available for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumNodeCount")
        private Integer minimumNodeCount;

        /**
         * The minimum number of compute servers available for this shape.
         *
         * @param minimumNodeCount the value to set
         * @return this builder
         */
        public Builder minimumNodeCount(Integer minimumNodeCount) {
            this.minimumNodeCount = minimumNodeCount;
            this.__explicitlySet__.add("minimumNodeCount");
            return this;
        }
        /** The maximum number of compute servers available for this shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumNodeCount")
        private Integer maximumNodeCount;

        /**
         * The maximum number of compute servers available for this shape.
         *
         * @param maximumNodeCount the value to set
         * @return this builder
         */
        public Builder maximumNodeCount(Integer maximumNodeCount) {
            this.maximumNodeCount = maximumNodeCount;
            this.__explicitlySet__.add("maximumNodeCount");
            return this;
        }
        /**
         * The maximum number of CPU cores per database node that can be enabled for this shape.
         * Only applicable to the flex Exadata shape and ExaCC Elastic shapes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCountPerNode")
        private Integer availableCoreCountPerNode;

        /**
         * The maximum number of CPU cores per database node that can be enabled for this shape.
         * Only applicable to the flex Exadata shape and ExaCC Elastic shapes.
         *
         * @param availableCoreCountPerNode the value to set
         * @return this builder
         */
        public Builder availableCoreCountPerNode(Integer availableCoreCountPerNode) {
            this.availableCoreCountPerNode = availableCoreCountPerNode;
            this.__explicitlySet__.add("availableCoreCountPerNode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemShapeSummary build() {
            DbSystemShapeSummary model =
                    new DbSystemShapeSummary(
                            this.name,
                            this.shapeFamily,
                            this.shapeType,
                            this.shape,
                            this.availableCoreCount,
                            this.minimumCoreCount,
                            this.coreCountIncrement,
                            this.minStorageCount,
                            this.maxStorageCount,
                            this.availableDataStoragePerServerInTBs,
                            this.availableMemoryPerNodeInGBs,
                            this.availableDbNodePerNodeInGBs,
                            this.minCoreCountPerNode,
                            this.availableMemoryInGBs,
                            this.minMemoryPerNodeInGBs,
                            this.availableDbNodeStorageInGBs,
                            this.minDbNodeStoragePerNodeInGBs,
                            this.availableDataStorageInTBs,
                            this.minDataStorageInTBs,
                            this.minimumNodeCount,
                            this.maximumNodeCount,
                            this.availableCoreCountPerNode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemShapeSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("shapeFamily")) {
                this.shapeFamily(model.getShapeFamily());
            }
            if (model.wasPropertyExplicitlySet("shapeType")) {
                this.shapeType(model.getShapeType());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("availableCoreCount")) {
                this.availableCoreCount(model.getAvailableCoreCount());
            }
            if (model.wasPropertyExplicitlySet("minimumCoreCount")) {
                this.minimumCoreCount(model.getMinimumCoreCount());
            }
            if (model.wasPropertyExplicitlySet("coreCountIncrement")) {
                this.coreCountIncrement(model.getCoreCountIncrement());
            }
            if (model.wasPropertyExplicitlySet("minStorageCount")) {
                this.minStorageCount(model.getMinStorageCount());
            }
            if (model.wasPropertyExplicitlySet("maxStorageCount")) {
                this.maxStorageCount(model.getMaxStorageCount());
            }
            if (model.wasPropertyExplicitlySet("availableDataStoragePerServerInTBs")) {
                this.availableDataStoragePerServerInTBs(
                        model.getAvailableDataStoragePerServerInTBs());
            }
            if (model.wasPropertyExplicitlySet("availableMemoryPerNodeInGBs")) {
                this.availableMemoryPerNodeInGBs(model.getAvailableMemoryPerNodeInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableDbNodePerNodeInGBs")) {
                this.availableDbNodePerNodeInGBs(model.getAvailableDbNodePerNodeInGBs());
            }
            if (model.wasPropertyExplicitlySet("minCoreCountPerNode")) {
                this.minCoreCountPerNode(model.getMinCoreCountPerNode());
            }
            if (model.wasPropertyExplicitlySet("availableMemoryInGBs")) {
                this.availableMemoryInGBs(model.getAvailableMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("minMemoryPerNodeInGBs")) {
                this.minMemoryPerNodeInGBs(model.getMinMemoryPerNodeInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableDbNodeStorageInGBs")) {
                this.availableDbNodeStorageInGBs(model.getAvailableDbNodeStorageInGBs());
            }
            if (model.wasPropertyExplicitlySet("minDbNodeStoragePerNodeInGBs")) {
                this.minDbNodeStoragePerNodeInGBs(model.getMinDbNodeStoragePerNodeInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableDataStorageInTBs")) {
                this.availableDataStorageInTBs(model.getAvailableDataStorageInTBs());
            }
            if (model.wasPropertyExplicitlySet("minDataStorageInTBs")) {
                this.minDataStorageInTBs(model.getMinDataStorageInTBs());
            }
            if (model.wasPropertyExplicitlySet("minimumNodeCount")) {
                this.minimumNodeCount(model.getMinimumNodeCount());
            }
            if (model.wasPropertyExplicitlySet("maximumNodeCount")) {
                this.maximumNodeCount(model.getMaximumNodeCount());
            }
            if (model.wasPropertyExplicitlySet("availableCoreCountPerNode")) {
                this.availableCoreCountPerNode(model.getAvailableCoreCountPerNode());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The name of the shape used for the DB system. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the shape used for the DB system.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The family of the shape used for the DB system. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeFamily")
    private final String shapeFamily;

    /**
     * The family of the shape used for the DB system.
     *
     * @return the value
     */
    public String getShapeFamily() {
        return shapeFamily;
    }

    /**
     * The shape type for the virtual machine DB system. Shape type is determined by CPU hardware.
     * Valid values are {@code AMD} , {@code INTEL} or {@code INTEL_FLEX_X9}.
     */
    public enum ShapeType implements com.oracle.bmc.http.internal.BmcEnum {
        Amd("AMD"),
        Intel("INTEL"),
        IntelFlexX9("INTEL_FLEX_X9"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ShapeType.class);

        private final String value;
        private static java.util.Map<String, ShapeType> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeType v : ShapeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ShapeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShapeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The shape type for the virtual machine DB system. Shape type is determined by CPU hardware.
     * Valid values are {@code AMD} , {@code INTEL} or {@code INTEL_FLEX_X9}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeType")
    private final ShapeType shapeType;

    /**
     * The shape type for the virtual machine DB system. Shape type is determined by CPU hardware.
     * Valid values are {@code AMD} , {@code INTEL} or {@code INTEL_FLEX_X9}.
     *
     * @return the value
     */
    public ShapeType getShapeType() {
        return shapeType;
    }

    /** Deprecated. Use {@code name} instead of {@code shape}. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Deprecated. Use {@code name} instead of {@code shape}.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The maximum number of CPU cores that can be enabled on the DB system for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
    private final Integer availableCoreCount;

    /**
     * The maximum number of CPU cores that can be enabled on the DB system for this shape.
     *
     * @return the value
     */
    public Integer getAvailableCoreCount() {
        return availableCoreCount;
    }

    /** The minimum number of CPU cores that can be enabled on the DB system for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
    private final Integer minimumCoreCount;

    /**
     * The minimum number of CPU cores that can be enabled on the DB system for this shape.
     *
     * @return the value
     */
    public Integer getMinimumCoreCount() {
        return minimumCoreCount;
    }

    /**
     * The discrete number by which the CPU core count for this shape can be increased or decreased.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("coreCountIncrement")
    private final Integer coreCountIncrement;

    /**
     * The discrete number by which the CPU core count for this shape can be increased or decreased.
     *
     * @return the value
     */
    public Integer getCoreCountIncrement() {
        return coreCountIncrement;
    }

    /** The minimum number of Exadata storage servers available for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("minStorageCount")
    private final Integer minStorageCount;

    /**
     * The minimum number of Exadata storage servers available for the Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getMinStorageCount() {
        return minStorageCount;
    }

    /** The maximum number of Exadata storage servers available for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxStorageCount")
    private final Integer maxStorageCount;

    /**
     * The maximum number of Exadata storage servers available for the Exadata infrastructure.
     *
     * @return the value
     */
    public Integer getMaxStorageCount() {
        return maxStorageCount;
    }

    /**
     * The maximum data storage available per storage server for this shape. Only applicable to
     * ExaCC Elastic shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableDataStoragePerServerInTBs")
    private final Double availableDataStoragePerServerInTBs;

    /**
     * The maximum data storage available per storage server for this shape. Only applicable to
     * ExaCC Elastic shapes.
     *
     * @return the value
     */
    public Double getAvailableDataStoragePerServerInTBs() {
        return availableDataStoragePerServerInTBs;
    }

    /**
     * The maximum memory available per database node for this shape. Only applicable to ExaCC
     * Elastic shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryPerNodeInGBs")
    private final Integer availableMemoryPerNodeInGBs;

    /**
     * The maximum memory available per database node for this shape. Only applicable to ExaCC
     * Elastic shapes.
     *
     * @return the value
     */
    public Integer getAvailableMemoryPerNodeInGBs() {
        return availableMemoryPerNodeInGBs;
    }

    /**
     * The maximum Db Node storage available per database node for this shape. Only applicable to
     * ExaCC Elastic shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableDbNodePerNodeInGBs")
    private final Integer availableDbNodePerNodeInGBs;

    /**
     * The maximum Db Node storage available per database node for this shape. Only applicable to
     * ExaCC Elastic shapes.
     *
     * @return the value
     */
    public Integer getAvailableDbNodePerNodeInGBs() {
        return availableDbNodePerNodeInGBs;
    }

    /** The minimum number of CPU cores that can be enabled per node for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("minCoreCountPerNode")
    private final Integer minCoreCountPerNode;

    /**
     * The minimum number of CPU cores that can be enabled per node for this shape.
     *
     * @return the value
     */
    public Integer getMinCoreCountPerNode() {
        return minCoreCountPerNode;
    }

    /** The maximum memory that can be enabled for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryInGBs")
    private final Integer availableMemoryInGBs;

    /**
     * The maximum memory that can be enabled for this shape.
     *
     * @return the value
     */
    public Integer getAvailableMemoryInGBs() {
        return availableMemoryInGBs;
    }

    /** The minimum memory that need be allocated per node for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("minMemoryPerNodeInGBs")
    private final Integer minMemoryPerNodeInGBs;

    /**
     * The minimum memory that need be allocated per node for this shape.
     *
     * @return the value
     */
    public Integer getMinMemoryPerNodeInGBs() {
        return minMemoryPerNodeInGBs;
    }

    /** The maximum Db Node storage that can be enabled for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableDbNodeStorageInGBs")
    private final Integer availableDbNodeStorageInGBs;

    /**
     * The maximum Db Node storage that can be enabled for this shape.
     *
     * @return the value
     */
    public Integer getAvailableDbNodeStorageInGBs() {
        return availableDbNodeStorageInGBs;
    }

    /** The minimum Db Node storage that need be allocated per node for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("minDbNodeStoragePerNodeInGBs")
    private final Integer minDbNodeStoragePerNodeInGBs;

    /**
     * The minimum Db Node storage that need be allocated per node for this shape.
     *
     * @return the value
     */
    public Integer getMinDbNodeStoragePerNodeInGBs() {
        return minDbNodeStoragePerNodeInGBs;
    }

    /** The maximum DATA storage that can be enabled for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableDataStorageInTBs")
    private final Integer availableDataStorageInTBs;

    /**
     * The maximum DATA storage that can be enabled for this shape.
     *
     * @return the value
     */
    public Integer getAvailableDataStorageInTBs() {
        return availableDataStorageInTBs;
    }

    /** The minimum data storage that need be allocated for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("minDataStorageInTBs")
    private final Integer minDataStorageInTBs;

    /**
     * The minimum data storage that need be allocated for this shape.
     *
     * @return the value
     */
    public Integer getMinDataStorageInTBs() {
        return minDataStorageInTBs;
    }

    /** The minimum number of compute servers available for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumNodeCount")
    private final Integer minimumNodeCount;

    /**
     * The minimum number of compute servers available for this shape.
     *
     * @return the value
     */
    public Integer getMinimumNodeCount() {
        return minimumNodeCount;
    }

    /** The maximum number of compute servers available for this shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumNodeCount")
    private final Integer maximumNodeCount;

    /**
     * The maximum number of compute servers available for this shape.
     *
     * @return the value
     */
    public Integer getMaximumNodeCount() {
        return maximumNodeCount;
    }

    /**
     * The maximum number of CPU cores per database node that can be enabled for this shape. Only
     * applicable to the flex Exadata shape and ExaCC Elastic shapes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCountPerNode")
    private final Integer availableCoreCountPerNode;

    /**
     * The maximum number of CPU cores per database node that can be enabled for this shape. Only
     * applicable to the flex Exadata shape and ExaCC Elastic shapes.
     *
     * @return the value
     */
    public Integer getAvailableCoreCountPerNode() {
        return availableCoreCountPerNode;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbSystemShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", shapeFamily=").append(String.valueOf(this.shapeFamily));
        sb.append(", shapeType=").append(String.valueOf(this.shapeType));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", availableCoreCount=").append(String.valueOf(this.availableCoreCount));
        sb.append(", minimumCoreCount=").append(String.valueOf(this.minimumCoreCount));
        sb.append(", coreCountIncrement=").append(String.valueOf(this.coreCountIncrement));
        sb.append(", minStorageCount=").append(String.valueOf(this.minStorageCount));
        sb.append(", maxStorageCount=").append(String.valueOf(this.maxStorageCount));
        sb.append(", availableDataStoragePerServerInTBs=")
                .append(String.valueOf(this.availableDataStoragePerServerInTBs));
        sb.append(", availableMemoryPerNodeInGBs=")
                .append(String.valueOf(this.availableMemoryPerNodeInGBs));
        sb.append(", availableDbNodePerNodeInGBs=")
                .append(String.valueOf(this.availableDbNodePerNodeInGBs));
        sb.append(", minCoreCountPerNode=").append(String.valueOf(this.minCoreCountPerNode));
        sb.append(", availableMemoryInGBs=").append(String.valueOf(this.availableMemoryInGBs));
        sb.append(", minMemoryPerNodeInGBs=").append(String.valueOf(this.minMemoryPerNodeInGBs));
        sb.append(", availableDbNodeStorageInGBs=")
                .append(String.valueOf(this.availableDbNodeStorageInGBs));
        sb.append(", minDbNodeStoragePerNodeInGBs=")
                .append(String.valueOf(this.minDbNodeStoragePerNodeInGBs));
        sb.append(", availableDataStorageInTBs=")
                .append(String.valueOf(this.availableDataStorageInTBs));
        sb.append(", minDataStorageInTBs=").append(String.valueOf(this.minDataStorageInTBs));
        sb.append(", minimumNodeCount=").append(String.valueOf(this.minimumNodeCount));
        sb.append(", maximumNodeCount=").append(String.valueOf(this.maximumNodeCount));
        sb.append(", availableCoreCountPerNode=")
                .append(String.valueOf(this.availableCoreCountPerNode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemShapeSummary)) {
            return false;
        }

        DbSystemShapeSummary other = (DbSystemShapeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.shapeFamily, other.shapeFamily)
                && java.util.Objects.equals(this.shapeType, other.shapeType)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.availableCoreCount, other.availableCoreCount)
                && java.util.Objects.equals(this.minimumCoreCount, other.minimumCoreCount)
                && java.util.Objects.equals(this.coreCountIncrement, other.coreCountIncrement)
                && java.util.Objects.equals(this.minStorageCount, other.minStorageCount)
                && java.util.Objects.equals(this.maxStorageCount, other.maxStorageCount)
                && java.util.Objects.equals(
                        this.availableDataStoragePerServerInTBs,
                        other.availableDataStoragePerServerInTBs)
                && java.util.Objects.equals(
                        this.availableMemoryPerNodeInGBs, other.availableMemoryPerNodeInGBs)
                && java.util.Objects.equals(
                        this.availableDbNodePerNodeInGBs, other.availableDbNodePerNodeInGBs)
                && java.util.Objects.equals(this.minCoreCountPerNode, other.minCoreCountPerNode)
                && java.util.Objects.equals(this.availableMemoryInGBs, other.availableMemoryInGBs)
                && java.util.Objects.equals(this.minMemoryPerNodeInGBs, other.minMemoryPerNodeInGBs)
                && java.util.Objects.equals(
                        this.availableDbNodeStorageInGBs, other.availableDbNodeStorageInGBs)
                && java.util.Objects.equals(
                        this.minDbNodeStoragePerNodeInGBs, other.minDbNodeStoragePerNodeInGBs)
                && java.util.Objects.equals(
                        this.availableDataStorageInTBs, other.availableDataStorageInTBs)
                && java.util.Objects.equals(this.minDataStorageInTBs, other.minDataStorageInTBs)
                && java.util.Objects.equals(this.minimumNodeCount, other.minimumNodeCount)
                && java.util.Objects.equals(this.maximumNodeCount, other.maximumNodeCount)
                && java.util.Objects.equals(
                        this.availableCoreCountPerNode, other.availableCoreCountPerNode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.shapeFamily == null ? 43 : this.shapeFamily.hashCode());
        result = (result * PRIME) + (this.shapeType == null ? 43 : this.shapeType.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCoreCount == null
                                ? 43
                                : this.availableCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumCoreCount == null ? 43 : this.minimumCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.coreCountIncrement == null
                                ? 43
                                : this.coreCountIncrement.hashCode());
        result =
                (result * PRIME)
                        + (this.minStorageCount == null ? 43 : this.minStorageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maxStorageCount == null ? 43 : this.maxStorageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableDataStoragePerServerInTBs == null
                                ? 43
                                : this.availableDataStoragePerServerInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableMemoryPerNodeInGBs == null
                                ? 43
                                : this.availableMemoryPerNodeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableDbNodePerNodeInGBs == null
                                ? 43
                                : this.availableDbNodePerNodeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.minCoreCountPerNode == null
                                ? 43
                                : this.minCoreCountPerNode.hashCode());
        result =
                (result * PRIME)
                        + (this.availableMemoryInGBs == null
                                ? 43
                                : this.availableMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.minMemoryPerNodeInGBs == null
                                ? 43
                                : this.minMemoryPerNodeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableDbNodeStorageInGBs == null
                                ? 43
                                : this.availableDbNodeStorageInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.minDbNodeStoragePerNodeInGBs == null
                                ? 43
                                : this.minDbNodeStoragePerNodeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableDataStorageInTBs == null
                                ? 43
                                : this.availableDataStorageInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.minDataStorageInTBs == null
                                ? 43
                                : this.minDataStorageInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumNodeCount == null ? 43 : this.minimumNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumNodeCount == null ? 43 : this.maximumNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCoreCountPerNode == null
                                ? 43
                                : this.availableCoreCountPerNode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
