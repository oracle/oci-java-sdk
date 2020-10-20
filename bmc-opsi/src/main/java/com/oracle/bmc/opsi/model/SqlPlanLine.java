/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL Plan Line type object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlPlanLine.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlPlanLine {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Float version;

        public Builder version(Float version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planHash")
        private Long planHash;

        public Builder planHash(Long planHash) {
            this.planHash = planHash;
            this.__explicitlySet__.add("planHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remark")
        private String remark;

        public Builder remark(String remark) {
            this.remark = remark;
            this.__explicitlySet__.add("remark");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private String options;

        public Builder options(String options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectNode")
        private String objectNode;

        public Builder objectNode(String objectNode) {
            this.objectNode = objectNode;
            this.__explicitlySet__.add("objectNode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
        private String objectOwner;

        public Builder objectOwner(String objectOwner) {
            this.objectOwner = objectOwner;
            this.__explicitlySet__.add("objectOwner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectAlias")
        private String objectAlias;

        public Builder objectAlias(String objectAlias) {
            this.objectAlias = objectAlias;
            this.__explicitlySet__.add("objectAlias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectInstance")
        private Long objectInstance;

        public Builder objectInstance(Long objectInstance) {
            this.objectInstance = objectInstance;
            this.__explicitlySet__.add("objectInstance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("optimizer")
        private String optimizer;

        public Builder optimizer(String optimizer) {
            this.optimizer = optimizer;
            this.__explicitlySet__.add("optimizer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("searchColumns")
        private Long searchColumns;

        public Builder searchColumns(Long searchColumns) {
            this.searchColumns = searchColumns;
            this.__explicitlySet__.add("searchColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private Long identifier;

        public Builder identifier(Long identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentIdentifier")
        private Long parentIdentifier;

        public Builder parentIdentifier(Long parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            this.__explicitlySet__.add("parentIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("depth")
        private Long depth;

        public Builder depth(Long depth) {
            this.depth = depth;
            this.__explicitlySet__.add("depth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Long position;

        public Builder position(Long position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cost")
        private Long cost;

        public Builder cost(Long cost) {
            this.cost = cost;
            this.__explicitlySet__.add("cost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cardinality")
        private Long cardinality;

        public Builder cardinality(Long cardinality) {
            this.cardinality = cardinality;
            this.__explicitlySet__.add("cardinality");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bytes")
        private Long bytes;

        public Builder bytes(Long bytes) {
            this.bytes = bytes;
            this.__explicitlySet__.add("bytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("other")
        private String other;

        public Builder other(String other) {
            this.other = other;
            this.__explicitlySet__.add("other");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("otherTag")
        private String otherTag;

        public Builder otherTag(String otherTag) {
            this.otherTag = otherTag;
            this.__explicitlySet__.add("otherTag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partitionStart")
        private String partitionStart;

        public Builder partitionStart(String partitionStart) {
            this.partitionStart = partitionStart;
            this.__explicitlySet__.add("partitionStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partitionStop")
        private String partitionStop;

        public Builder partitionStop(String partitionStop) {
            this.partitionStop = partitionStop;
            this.__explicitlySet__.add("partitionStop");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partitionIdentifier")
        private Long partitionIdentifier;

        public Builder partitionIdentifier(Long partitionIdentifier) {
            this.partitionIdentifier = partitionIdentifier;
            this.__explicitlySet__.add("partitionIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("distribution")
        private String distribution;

        public Builder distribution(String distribution) {
            this.distribution = distribution;
            this.__explicitlySet__.add("distribution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCost")
        private Long cpuCost;

        public Builder cpuCost(Long cpuCost) {
            this.cpuCost = cpuCost;
            this.__explicitlySet__.add("cpuCost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioCost")
        private Long ioCost;

        public Builder ioCost(Long ioCost) {
            this.ioCost = ioCost;
            this.__explicitlySet__.add("ioCost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tempSpace")
        private Long tempSpace;

        public Builder tempSpace(Long tempSpace) {
            this.tempSpace = tempSpace;
            this.__explicitlySet__.add("tempSpace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessPredicates")
        private String accessPredicates;

        public Builder accessPredicates(String accessPredicates) {
            this.accessPredicates = accessPredicates;
            this.__explicitlySet__.add("accessPredicates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterPredicates")
        private String filterPredicates;

        public Builder filterPredicates(String filterPredicates) {
            this.filterPredicates = filterPredicates;
            this.__explicitlySet__.add("filterPredicates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projection")
        private String projection;

        public Builder projection(String projection) {
            this.projection = projection;
            this.__explicitlySet__.add("projection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("qblockName")
        private String qblockName;

        public Builder qblockName(String qblockName) {
            this.qblockName = qblockName;
            this.__explicitlySet__.add("qblockName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInSec")
        private Float elapsedTimeInSec;

        public Builder elapsedTimeInSec(Float elapsedTimeInSec) {
            this.elapsedTimeInSec = elapsedTimeInSec;
            this.__explicitlySet__.add("elapsedTimeInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("otherXML")
        private String otherXML;

        public Builder otherXML(String otherXML) {
            this.otherXML = otherXML;
            this.__explicitlySet__.add("otherXML");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlPlanLine build() {
            SqlPlanLine __instance__ =
                    new SqlPlanLine(
                            version,
                            sqlIdentifier,
                            planHash,
                            timeCollected,
                            operation,
                            remark,
                            options,
                            objectNode,
                            objectOwner,
                            objectName,
                            objectAlias,
                            objectInstance,
                            objectType,
                            optimizer,
                            searchColumns,
                            identifier,
                            parentIdentifier,
                            depth,
                            position,
                            cost,
                            cardinality,
                            bytes,
                            other,
                            otherTag,
                            partitionStart,
                            partitionStop,
                            partitionIdentifier,
                            distribution,
                            cpuCost,
                            ioCost,
                            tempSpace,
                            accessPredicates,
                            filterPredicates,
                            projection,
                            qblockName,
                            elapsedTimeInSec,
                            otherXML);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanLine o) {
            Builder copiedBuilder =
                    version(o.getVersion())
                            .sqlIdentifier(o.getSqlIdentifier())
                            .planHash(o.getPlanHash())
                            .timeCollected(o.getTimeCollected())
                            .operation(o.getOperation())
                            .remark(o.getRemark())
                            .options(o.getOptions())
                            .objectNode(o.getObjectNode())
                            .objectOwner(o.getObjectOwner())
                            .objectName(o.getObjectName())
                            .objectAlias(o.getObjectAlias())
                            .objectInstance(o.getObjectInstance())
                            .objectType(o.getObjectType())
                            .optimizer(o.getOptimizer())
                            .searchColumns(o.getSearchColumns())
                            .identifier(o.getIdentifier())
                            .parentIdentifier(o.getParentIdentifier())
                            .depth(o.getDepth())
                            .position(o.getPosition())
                            .cost(o.getCost())
                            .cardinality(o.getCardinality())
                            .bytes(o.getBytes())
                            .other(o.getOther())
                            .otherTag(o.getOtherTag())
                            .partitionStart(o.getPartitionStart())
                            .partitionStop(o.getPartitionStop())
                            .partitionIdentifier(o.getPartitionIdentifier())
                            .distribution(o.getDistribution())
                            .cpuCost(o.getCpuCost())
                            .ioCost(o.getIoCost())
                            .tempSpace(o.getTempSpace())
                            .accessPredicates(o.getAccessPredicates())
                            .filterPredicates(o.getFilterPredicates())
                            .projection(o.getProjection())
                            .qblockName(o.getQblockName())
                            .elapsedTimeInSec(o.getElapsedTimeInSec())
                            .otherXML(o.getOtherXML());

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
     * Version
     * Example: `1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    Float version;

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    String sqlIdentifier;

    /**
     * Plan hash value for the SQL Execution Plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHash")
    Long planHash;

    /**
     * Collection time stamp
     * Example: `\"2020-05-06T00:00:00.000Z\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    java.util.Date timeCollected;

    /**
     * Operation
     * Example: `\"SELECT STATEMENT\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    String operation;

    /**
     * Remark
     * Example: `\"\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remark")
    String remark;

    /**
     * Options
     * Example: `\"RANGE SCAN\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    String options;

    /**
     * Object Node
     * Example: `\"Q4000\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectNode")
    String objectNode;

    /**
     * Object Owner
     * Example: `\"TENANT_A#SCHEMA\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
    String objectOwner;

    /**
     * Object Name
     * Example: `\"PLAN_LINES_PK\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * Object Alias
     * Example: `\"PLAN_LINES@SEL$1\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectAlias")
    String objectAlias;

    /**
     * Object Instance
     * Example: `37472`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectInstance")
    Long objectInstance;

    /**
     * Object Type
     * Example: `\"INDEX (UNIQUE)\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    String objectType;

    /**
     * Optimizer
     * Example: `\"CLUSTER\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("optimizer")
    String optimizer;

    /**
     * Search Columns
     * Example: `3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchColumns")
    Long searchColumns;

    /**
     * Identifier
     * Example: `3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    Long identifier;

    /**
     * Parent Identifier
     * Example: `2`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentIdentifier")
    Long parentIdentifier;

    /**
     * Depth
     * Example: `3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("depth")
    Long depth;

    /**
     * Position
     * Example: `1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    Long position;

    /**
     * Cost
     * Example: `1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    Long cost;

    /**
     * Cardinality
     * Example: `1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cardinality")
    Long cardinality;

    /**
     * Bytes
     * Example: `150`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bytes")
    Long bytes;

    /**
     * Other
     * Example: ``
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("other")
    String other;

    /**
     * Other Tag
     * Example: `\"PARALLEL_COMBINED_WITH_PARENT\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("otherTag")
    String otherTag;

    /**
     * Partition start
     * Example: `1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionStart")
    String partitionStart;

    /**
     * Partition stop
     * Example: `2`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionStop")
    String partitionStop;

    /**
     * Partition identifier
     * Example: `8`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionIdentifier")
    Long partitionIdentifier;

    /**
     * Distribution
     * Example: `\"QC (RANDOM)\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("distribution")
    String distribution;

    /**
     * CPU cost
     * Example: `7321`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCost")
    Long cpuCost;

    /**
     * IO cost
     * Example: `1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCost")
    Long ioCost;

    /**
     * Time space
     * Example: `15614000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tempSpace")
    Long tempSpace;

    /**
     * Access predicates
     * Example: `\"\\\"RESOURCE_ID\\\"=:1 AND \\\"QUERY_ID\\\"=:2\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessPredicates")
    String accessPredicates;

    /**
     * Filter predicates
     * Example: `\"(INTERNAL_FUNCTION(\\\"J\\\".\\\"DATABASE_ROLE\\\") OR (\\\"J\\\".\\\"DATABASE_ROLE\\\" IS NULL AND SYS_CONTEXT('userenv','database_role')='PRIMARY'))\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterPredicates")
    String filterPredicates;

    /**
     * Projection
     * Example: `\"COUNT(*)[22]\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projection")
    String projection;

    /**
     * Qblock Name
     * Example: `\"SEL$1\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("qblockName")
    String qblockName;

    /**
     * Total elapsed time
     * Example: `1.2`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInSec")
    Float elapsedTimeInSec;

    /**
     * Other SQL
     * Example: `\"<other_xml><info type=\\\"db_version\\\">18.0.0.0</info><info type=\\\"parse_schema\\\"><![CDATA[\\\"SYS\\\"]]></info><info type=\\\"plan_hash_full\\\">483892784</info><info type=\\\"plan_hash\\\">2709293936</info><info type=\\\"plan_hash_2\\\">483892784</info><outline_data><hint><![CDATA[IGNORE_OPTIM_EMBEDDED_HINTS]]></hint><hint><![CDATA[OPTIMIZER_FEATURES_ENABLE('18.1.0')]]></hint><hint><![CDATA[DB_VERSION('18.1.0')]]></hint><hint><![CDATA[OPT_PARAM('_b_tree_bitmap_plans' 'false')]]></hint><hint><![CDATA[OPT_PARAM('_optim_peek_user_binds' 'false')]]></hint><hint><![CDATA[OPT_PARAM('result_cache_mode' 'FORCE')]]></hint><hint><![CDATA[OPT_PARAM('_fix_control' '20648883:0 27745220:1 30001331:1 30142527:1 30539126:1')]]></hint><hint><![CDATA[OUTLINE_LEAF(@\\\"SEL$1\\\")]]></hint><hint><![CDATA[INDEX(@\\\"SEL$1\\\" \\\"USER$\\\"@\\\"SEL$1\\\" \\\"I_USER#\\\")]]></hint></outline_data></other_xml>\"`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("otherXML")
    String otherXML;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
