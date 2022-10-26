/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL Plan Line type object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlPlanLine.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SqlPlanLine extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "version",
        "sqlIdentifier",
        "planHash",
        "timeCollected",
        "operation",
        "remark",
        "options",
        "objectNode",
        "objectOwner",
        "objectName",
        "objectAlias",
        "objectInstance",
        "objectType",
        "optimizer",
        "searchColumns",
        "identifier",
        "parentIdentifier",
        "depth",
        "position",
        "cost",
        "cardinality",
        "bytes",
        "other",
        "otherTag",
        "partitionStart",
        "partitionStop",
        "partitionIdentifier",
        "distribution",
        "cpuCost",
        "ioCost",
        "tempSpace",
        "accessPredicates",
        "filterPredicates",
        "projection",
        "qblockName",
        "elapsedTimeInSec",
        "otherXML"
    })
    public SqlPlanLine(
            Float version,
            String sqlIdentifier,
            Long planHash,
            java.util.Date timeCollected,
            String operation,
            String remark,
            String options,
            String objectNode,
            String objectOwner,
            String objectName,
            String objectAlias,
            Long objectInstance,
            String objectType,
            String optimizer,
            Long searchColumns,
            Long identifier,
            Long parentIdentifier,
            Long depth,
            Long position,
            Long cost,
            Long cardinality,
            Long bytes,
            String other,
            String otherTag,
            String partitionStart,
            String partitionStop,
            Long partitionIdentifier,
            String distribution,
            Long cpuCost,
            Long ioCost,
            Long tempSpace,
            String accessPredicates,
            String filterPredicates,
            String projection,
            String qblockName,
            Float elapsedTimeInSec,
            String otherXML) {
        super();
        this.version = version;
        this.sqlIdentifier = sqlIdentifier;
        this.planHash = planHash;
        this.timeCollected = timeCollected;
        this.operation = operation;
        this.remark = remark;
        this.options = options;
        this.objectNode = objectNode;
        this.objectOwner = objectOwner;
        this.objectName = objectName;
        this.objectAlias = objectAlias;
        this.objectInstance = objectInstance;
        this.objectType = objectType;
        this.optimizer = optimizer;
        this.searchColumns = searchColumns;
        this.identifier = identifier;
        this.parentIdentifier = parentIdentifier;
        this.depth = depth;
        this.position = position;
        this.cost = cost;
        this.cardinality = cardinality;
        this.bytes = bytes;
        this.other = other;
        this.otherTag = otherTag;
        this.partitionStart = partitionStart;
        this.partitionStop = partitionStop;
        this.partitionIdentifier = partitionIdentifier;
        this.distribution = distribution;
        this.cpuCost = cpuCost;
        this.ioCost = ioCost;
        this.tempSpace = tempSpace;
        this.accessPredicates = accessPredicates;
        this.filterPredicates = filterPredicates;
        this.projection = projection;
        this.qblockName = qblockName;
        this.elapsedTimeInSec = elapsedTimeInSec;
        this.otherXML = otherXML;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Version Example: {@code 1} */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Float version;

        /**
         * Version Example: {@code 1}
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Float version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Unique SQL_ID for a SQL Statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        /**
         * Unique SQL_ID for a SQL Statement.
         *
         * @param sqlIdentifier the value to set
         * @return this builder
         */
        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }
        /** Plan hash value for the SQL Execution Plan */
        @com.fasterxml.jackson.annotation.JsonProperty("planHash")
        private Long planHash;

        /**
         * Plan hash value for the SQL Execution Plan
         *
         * @param planHash the value to set
         * @return this builder
         */
        public Builder planHash(Long planHash) {
            this.planHash = planHash;
            this.__explicitlySet__.add("planHash");
            return this;
        }
        /** Collection time stamp Example: {@code "2020-05-06T00:00:00.000Z"} */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        /**
         * Collection time stamp Example: {@code "2020-05-06T00:00:00.000Z"}
         *
         * @param timeCollected the value to set
         * @return this builder
         */
        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** Operation Example: {@code "SELECT STATEMENT"} */
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        /**
         * Operation Example: {@code "SELECT STATEMENT"}
         *
         * @param operation the value to set
         * @return this builder
         */
        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }
        /** Remark Example: {@code ""} */
        @com.fasterxml.jackson.annotation.JsonProperty("remark")
        private String remark;

        /**
         * Remark Example: {@code ""}
         *
         * @param remark the value to set
         * @return this builder
         */
        public Builder remark(String remark) {
            this.remark = remark;
            this.__explicitlySet__.add("remark");
            return this;
        }
        /** Options Example: {@code "RANGE SCAN"} */
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private String options;

        /**
         * Options Example: {@code "RANGE SCAN"}
         *
         * @param options the value to set
         * @return this builder
         */
        public Builder options(String options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }
        /** Object Node Example: {@code "Q4000"} */
        @com.fasterxml.jackson.annotation.JsonProperty("objectNode")
        private String objectNode;

        /**
         * Object Node Example: {@code "Q4000"}
         *
         * @param objectNode the value to set
         * @return this builder
         */
        public Builder objectNode(String objectNode) {
            this.objectNode = objectNode;
            this.__explicitlySet__.add("objectNode");
            return this;
        }
        /** Object Owner Example: {@code "TENANT_A#SCHEMA"} */
        @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
        private String objectOwner;

        /**
         * Object Owner Example: {@code "TENANT_A#SCHEMA"}
         *
         * @param objectOwner the value to set
         * @return this builder
         */
        public Builder objectOwner(String objectOwner) {
            this.objectOwner = objectOwner;
            this.__explicitlySet__.add("objectOwner");
            return this;
        }
        /** Object Name Example: {@code "PLAN_LINES_PK"} */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * Object Name Example: {@code "PLAN_LINES_PK"}
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** Object Alias Example: {@code "PLAN_LINES@SEL$1"} */
        @com.fasterxml.jackson.annotation.JsonProperty("objectAlias")
        private String objectAlias;

        /**
         * Object Alias Example: {@code "PLAN_LINES@SEL$1"}
         *
         * @param objectAlias the value to set
         * @return this builder
         */
        public Builder objectAlias(String objectAlias) {
            this.objectAlias = objectAlias;
            this.__explicitlySet__.add("objectAlias");
            return this;
        }
        /** Object Instance Example: {@code 37472} */
        @com.fasterxml.jackson.annotation.JsonProperty("objectInstance")
        private Long objectInstance;

        /**
         * Object Instance Example: {@code 37472}
         *
         * @param objectInstance the value to set
         * @return this builder
         */
        public Builder objectInstance(Long objectInstance) {
            this.objectInstance = objectInstance;
            this.__explicitlySet__.add("objectInstance");
            return this;
        }
        /** Object Type Example: {@code "INDEX (UNIQUE)"} */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        /**
         * Object Type Example: {@code "INDEX (UNIQUE)"}
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** Optimizer Example: {@code "CLUSTER"} */
        @com.fasterxml.jackson.annotation.JsonProperty("optimizer")
        private String optimizer;

        /**
         * Optimizer Example: {@code "CLUSTER"}
         *
         * @param optimizer the value to set
         * @return this builder
         */
        public Builder optimizer(String optimizer) {
            this.optimizer = optimizer;
            this.__explicitlySet__.add("optimizer");
            return this;
        }
        /** Search Columns Example: {@code 3} */
        @com.fasterxml.jackson.annotation.JsonProperty("searchColumns")
        private Long searchColumns;

        /**
         * Search Columns Example: {@code 3}
         *
         * @param searchColumns the value to set
         * @return this builder
         */
        public Builder searchColumns(Long searchColumns) {
            this.searchColumns = searchColumns;
            this.__explicitlySet__.add("searchColumns");
            return this;
        }
        /** Identifier Example: {@code 3} */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private Long identifier;

        /**
         * Identifier Example: {@code 3}
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(Long identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** Parent Identifier Example: {@code 2} */
        @com.fasterxml.jackson.annotation.JsonProperty("parentIdentifier")
        private Long parentIdentifier;

        /**
         * Parent Identifier Example: {@code 2}
         *
         * @param parentIdentifier the value to set
         * @return this builder
         */
        public Builder parentIdentifier(Long parentIdentifier) {
            this.parentIdentifier = parentIdentifier;
            this.__explicitlySet__.add("parentIdentifier");
            return this;
        }
        /** Depth Example: {@code 3} */
        @com.fasterxml.jackson.annotation.JsonProperty("depth")
        private Long depth;

        /**
         * Depth Example: {@code 3}
         *
         * @param depth the value to set
         * @return this builder
         */
        public Builder depth(Long depth) {
            this.depth = depth;
            this.__explicitlySet__.add("depth");
            return this;
        }
        /** Position Example: {@code 1} */
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Long position;

        /**
         * Position Example: {@code 1}
         *
         * @param position the value to set
         * @return this builder
         */
        public Builder position(Long position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }
        /** Cost Example: {@code 1} */
        @com.fasterxml.jackson.annotation.JsonProperty("cost")
        private Long cost;

        /**
         * Cost Example: {@code 1}
         *
         * @param cost the value to set
         * @return this builder
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            this.__explicitlySet__.add("cost");
            return this;
        }
        /** Cardinality Example: {@code 1} */
        @com.fasterxml.jackson.annotation.JsonProperty("cardinality")
        private Long cardinality;

        /**
         * Cardinality Example: {@code 1}
         *
         * @param cardinality the value to set
         * @return this builder
         */
        public Builder cardinality(Long cardinality) {
            this.cardinality = cardinality;
            this.__explicitlySet__.add("cardinality");
            return this;
        }
        /** Bytes Example: {@code 150} */
        @com.fasterxml.jackson.annotation.JsonProperty("bytes")
        private Long bytes;

        /**
         * Bytes Example: {@code 150}
         *
         * @param bytes the value to set
         * @return this builder
         */
        public Builder bytes(Long bytes) {
            this.bytes = bytes;
            this.__explicitlySet__.add("bytes");
            return this;
        }
        /** Other Example: */
        @com.fasterxml.jackson.annotation.JsonProperty("other")
        private String other;

        /**
         * Other Example:
         *
         * @param other the value to set
         * @return this builder
         */
        public Builder other(String other) {
            this.other = other;
            this.__explicitlySet__.add("other");
            return this;
        }
        /** Other Tag Example: {@code "PARALLEL_COMBINED_WITH_PARENT"} */
        @com.fasterxml.jackson.annotation.JsonProperty("otherTag")
        private String otherTag;

        /**
         * Other Tag Example: {@code "PARALLEL_COMBINED_WITH_PARENT"}
         *
         * @param otherTag the value to set
         * @return this builder
         */
        public Builder otherTag(String otherTag) {
            this.otherTag = otherTag;
            this.__explicitlySet__.add("otherTag");
            return this;
        }
        /** Partition start Example: {@code 1} */
        @com.fasterxml.jackson.annotation.JsonProperty("partitionStart")
        private String partitionStart;

        /**
         * Partition start Example: {@code 1}
         *
         * @param partitionStart the value to set
         * @return this builder
         */
        public Builder partitionStart(String partitionStart) {
            this.partitionStart = partitionStart;
            this.__explicitlySet__.add("partitionStart");
            return this;
        }
        /** Partition stop Example: {@code 2} */
        @com.fasterxml.jackson.annotation.JsonProperty("partitionStop")
        private String partitionStop;

        /**
         * Partition stop Example: {@code 2}
         *
         * @param partitionStop the value to set
         * @return this builder
         */
        public Builder partitionStop(String partitionStop) {
            this.partitionStop = partitionStop;
            this.__explicitlySet__.add("partitionStop");
            return this;
        }
        /** Partition identifier Example: {@code 8} */
        @com.fasterxml.jackson.annotation.JsonProperty("partitionIdentifier")
        private Long partitionIdentifier;

        /**
         * Partition identifier Example: {@code 8}
         *
         * @param partitionIdentifier the value to set
         * @return this builder
         */
        public Builder partitionIdentifier(Long partitionIdentifier) {
            this.partitionIdentifier = partitionIdentifier;
            this.__explicitlySet__.add("partitionIdentifier");
            return this;
        }
        /** Distribution Example: {@code "QC (RANDOM)"} */
        @com.fasterxml.jackson.annotation.JsonProperty("distribution")
        private String distribution;

        /**
         * Distribution Example: {@code "QC (RANDOM)"}
         *
         * @param distribution the value to set
         * @return this builder
         */
        public Builder distribution(String distribution) {
            this.distribution = distribution;
            this.__explicitlySet__.add("distribution");
            return this;
        }
        /** CPU cost Example: {@code 7321} */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCost")
        private Long cpuCost;

        /**
         * CPU cost Example: {@code 7321}
         *
         * @param cpuCost the value to set
         * @return this builder
         */
        public Builder cpuCost(Long cpuCost) {
            this.cpuCost = cpuCost;
            this.__explicitlySet__.add("cpuCost");
            return this;
        }
        /** IO cost Example: {@code 1} */
        @com.fasterxml.jackson.annotation.JsonProperty("ioCost")
        private Long ioCost;

        /**
         * IO cost Example: {@code 1}
         *
         * @param ioCost the value to set
         * @return this builder
         */
        public Builder ioCost(Long ioCost) {
            this.ioCost = ioCost;
            this.__explicitlySet__.add("ioCost");
            return this;
        }
        /** Time space Example: {@code 15614000} */
        @com.fasterxml.jackson.annotation.JsonProperty("tempSpace")
        private Long tempSpace;

        /**
         * Time space Example: {@code 15614000}
         *
         * @param tempSpace the value to set
         * @return this builder
         */
        public Builder tempSpace(Long tempSpace) {
            this.tempSpace = tempSpace;
            this.__explicitlySet__.add("tempSpace");
            return this;
        }
        /** Access predicates Example: {@code "\\"RESOURCE_ID\\"=:1 AND \\"QUERY_ID\\"=:2"} */
        @com.fasterxml.jackson.annotation.JsonProperty("accessPredicates")
        private String accessPredicates;

        /**
         * Access predicates Example: {@code "\\"RESOURCE_ID\\"=:1 AND \\"QUERY_ID\\"=:2"}
         *
         * @param accessPredicates the value to set
         * @return this builder
         */
        public Builder accessPredicates(String accessPredicates) {
            this.accessPredicates = accessPredicates;
            this.__explicitlySet__.add("accessPredicates");
            return this;
        }
        /**
         * Filter predicates Example: {@code "(INTERNAL_FUNCTION(\\"J\\".\\"DATABASE_ROLE\\") OR
         * (\\"J\\".\\"DATABASE_ROLE\\" IS NULL AND
         * SYS_CONTEXT('userenv','database_role')='PRIMARY'))"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("filterPredicates")
        private String filterPredicates;

        /**
         * Filter predicates Example: {@code "(INTERNAL_FUNCTION(\\"J\\".\\"DATABASE_ROLE\\") OR
         * (\\"J\\".\\"DATABASE_ROLE\\" IS NULL AND
         * SYS_CONTEXT('userenv','database_role')='PRIMARY'))"}
         *
         * @param filterPredicates the value to set
         * @return this builder
         */
        public Builder filterPredicates(String filterPredicates) {
            this.filterPredicates = filterPredicates;
            this.__explicitlySet__.add("filterPredicates");
            return this;
        }
        /** Projection Example: {@code "COUNT(*)[22]"} */
        @com.fasterxml.jackson.annotation.JsonProperty("projection")
        private String projection;

        /**
         * Projection Example: {@code "COUNT(*)[22]"}
         *
         * @param projection the value to set
         * @return this builder
         */
        public Builder projection(String projection) {
            this.projection = projection;
            this.__explicitlySet__.add("projection");
            return this;
        }
        /** Qblock Name Example: {@code "SEL$1"} */
        @com.fasterxml.jackson.annotation.JsonProperty("qblockName")
        private String qblockName;

        /**
         * Qblock Name Example: {@code "SEL$1"}
         *
         * @param qblockName the value to set
         * @return this builder
         */
        public Builder qblockName(String qblockName) {
            this.qblockName = qblockName;
            this.__explicitlySet__.add("qblockName");
            return this;
        }
        /** Total elapsed time Example: {@code 1.2} */
        @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInSec")
        private Float elapsedTimeInSec;

        /**
         * Total elapsed time Example: {@code 1.2}
         *
         * @param elapsedTimeInSec the value to set
         * @return this builder
         */
        public Builder elapsedTimeInSec(Float elapsedTimeInSec) {
            this.elapsedTimeInSec = elapsedTimeInSec;
            this.__explicitlySet__.add("elapsedTimeInSec");
            return this;
        }
        /**
         * Other SQL Example: {@code "<other_xml><info type=\\"db_version\\">18.0.0.0</info><info
         * type=\\"parse_schema\\"><![CDATA[\\"SYS\\"]]></info><info
         * type=\\"plan_hash_full\\">483892784</info><info
         * type=\\"plan_hash\\">2709293936</info><info
         * type=\\"plan_hash_2\\">483892784</info><outline_data><hint><![CDATA[IGNORE_OPTIM_EMBEDDED_HINTS]]></hint><hint><![CDATA[OPTIMIZER_FEATURES_ENABLE('18.1.0')]]></hint><hint><![CDATA[DB_VERSION('18.1.0')]]></hint><hint><![CDATA[OPT_PARAM('_b_tree_bitmap_plans'
         * 'false')]]></hint><hint><![CDATA[OPT_PARAM('_optim_peek_user_binds'
         * 'false')]]></hint><hint><![CDATA[OPT_PARAM('result_cache_mode'
         * 'FORCE')]]></hint><hint><![CDATA[OPT_PARAM('_fix_control' '20648883:0 27745220:1
         * 30001331:1 30142527:1
         * 30539126:1')]]></hint><hint><![CDATA[OUTLINE_LEAF(@\\"SEL$1\\")]]></hint><hint><![CDATA[INDEX(@\\"SEL$1\\"
         * \\"USER$\\"@\\"SEL$1\\" \\"I_USER#\\")]]></hint></outline_data></other_xml>"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("otherXML")
        private String otherXML;

        /**
         * Other SQL Example: {@code "<other_xml><info type=\\"db_version\\">18.0.0.0</info><info
         * type=\\"parse_schema\\"><![CDATA[\\"SYS\\"]]></info><info
         * type=\\"plan_hash_full\\">483892784</info><info
         * type=\\"plan_hash\\">2709293936</info><info
         * type=\\"plan_hash_2\\">483892784</info><outline_data><hint><![CDATA[IGNORE_OPTIM_EMBEDDED_HINTS]]></hint><hint><![CDATA[OPTIMIZER_FEATURES_ENABLE('18.1.0')]]></hint><hint><![CDATA[DB_VERSION('18.1.0')]]></hint><hint><![CDATA[OPT_PARAM('_b_tree_bitmap_plans'
         * 'false')]]></hint><hint><![CDATA[OPT_PARAM('_optim_peek_user_binds'
         * 'false')]]></hint><hint><![CDATA[OPT_PARAM('result_cache_mode'
         * 'FORCE')]]></hint><hint><![CDATA[OPT_PARAM('_fix_control' '20648883:0 27745220:1
         * 30001331:1 30142527:1
         * 30539126:1')]]></hint><hint><![CDATA[OUTLINE_LEAF(@\\"SEL$1\\")]]></hint><hint><![CDATA[INDEX(@\\"SEL$1\\"
         * \\"USER$\\"@\\"SEL$1\\" \\"I_USER#\\")]]></hint></outline_data></other_xml>"}
         *
         * @param otherXML the value to set
         * @return this builder
         */
        public Builder otherXML(String otherXML) {
            this.otherXML = otherXML;
            this.__explicitlySet__.add("otherXML");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlPlanLine build() {
            SqlPlanLine model =
                    new SqlPlanLine(
                            this.version,
                            this.sqlIdentifier,
                            this.planHash,
                            this.timeCollected,
                            this.operation,
                            this.remark,
                            this.options,
                            this.objectNode,
                            this.objectOwner,
                            this.objectName,
                            this.objectAlias,
                            this.objectInstance,
                            this.objectType,
                            this.optimizer,
                            this.searchColumns,
                            this.identifier,
                            this.parentIdentifier,
                            this.depth,
                            this.position,
                            this.cost,
                            this.cardinality,
                            this.bytes,
                            this.other,
                            this.otherTag,
                            this.partitionStart,
                            this.partitionStop,
                            this.partitionIdentifier,
                            this.distribution,
                            this.cpuCost,
                            this.ioCost,
                            this.tempSpace,
                            this.accessPredicates,
                            this.filterPredicates,
                            this.projection,
                            this.qblockName,
                            this.elapsedTimeInSec,
                            this.otherXML);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanLine model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("sqlIdentifier")) {
                this.sqlIdentifier(model.getSqlIdentifier());
            }
            if (model.wasPropertyExplicitlySet("planHash")) {
                this.planHash(model.getPlanHash());
            }
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
            }
            if (model.wasPropertyExplicitlySet("remark")) {
                this.remark(model.getRemark());
            }
            if (model.wasPropertyExplicitlySet("options")) {
                this.options(model.getOptions());
            }
            if (model.wasPropertyExplicitlySet("objectNode")) {
                this.objectNode(model.getObjectNode());
            }
            if (model.wasPropertyExplicitlySet("objectOwner")) {
                this.objectOwner(model.getObjectOwner());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectAlias")) {
                this.objectAlias(model.getObjectAlias());
            }
            if (model.wasPropertyExplicitlySet("objectInstance")) {
                this.objectInstance(model.getObjectInstance());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("optimizer")) {
                this.optimizer(model.getOptimizer());
            }
            if (model.wasPropertyExplicitlySet("searchColumns")) {
                this.searchColumns(model.getSearchColumns());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("parentIdentifier")) {
                this.parentIdentifier(model.getParentIdentifier());
            }
            if (model.wasPropertyExplicitlySet("depth")) {
                this.depth(model.getDepth());
            }
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
            }
            if (model.wasPropertyExplicitlySet("cost")) {
                this.cost(model.getCost());
            }
            if (model.wasPropertyExplicitlySet("cardinality")) {
                this.cardinality(model.getCardinality());
            }
            if (model.wasPropertyExplicitlySet("bytes")) {
                this.bytes(model.getBytes());
            }
            if (model.wasPropertyExplicitlySet("other")) {
                this.other(model.getOther());
            }
            if (model.wasPropertyExplicitlySet("otherTag")) {
                this.otherTag(model.getOtherTag());
            }
            if (model.wasPropertyExplicitlySet("partitionStart")) {
                this.partitionStart(model.getPartitionStart());
            }
            if (model.wasPropertyExplicitlySet("partitionStop")) {
                this.partitionStop(model.getPartitionStop());
            }
            if (model.wasPropertyExplicitlySet("partitionIdentifier")) {
                this.partitionIdentifier(model.getPartitionIdentifier());
            }
            if (model.wasPropertyExplicitlySet("distribution")) {
                this.distribution(model.getDistribution());
            }
            if (model.wasPropertyExplicitlySet("cpuCost")) {
                this.cpuCost(model.getCpuCost());
            }
            if (model.wasPropertyExplicitlySet("ioCost")) {
                this.ioCost(model.getIoCost());
            }
            if (model.wasPropertyExplicitlySet("tempSpace")) {
                this.tempSpace(model.getTempSpace());
            }
            if (model.wasPropertyExplicitlySet("accessPredicates")) {
                this.accessPredicates(model.getAccessPredicates());
            }
            if (model.wasPropertyExplicitlySet("filterPredicates")) {
                this.filterPredicates(model.getFilterPredicates());
            }
            if (model.wasPropertyExplicitlySet("projection")) {
                this.projection(model.getProjection());
            }
            if (model.wasPropertyExplicitlySet("qblockName")) {
                this.qblockName(model.getQblockName());
            }
            if (model.wasPropertyExplicitlySet("elapsedTimeInSec")) {
                this.elapsedTimeInSec(model.getElapsedTimeInSec());
            }
            if (model.wasPropertyExplicitlySet("otherXML")) {
                this.otherXML(model.getOtherXML());
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

    /** Version Example: {@code 1} */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Float version;

    /**
     * Version Example: {@code 1}
     *
     * @return the value
     */
    public Float getVersion() {
        return version;
    }

    /** Unique SQL_ID for a SQL Statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    private final String sqlIdentifier;

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     * @return the value
     */
    public String getSqlIdentifier() {
        return sqlIdentifier;
    }

    /** Plan hash value for the SQL Execution Plan */
    @com.fasterxml.jackson.annotation.JsonProperty("planHash")
    private final Long planHash;

    /**
     * Plan hash value for the SQL Execution Plan
     *
     * @return the value
     */
    public Long getPlanHash() {
        return planHash;
    }

    /** Collection time stamp Example: {@code "2020-05-06T00:00:00.000Z"} */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * Collection time stamp Example: {@code "2020-05-06T00:00:00.000Z"}
     *
     * @return the value
     */
    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /** Operation Example: {@code "SELECT STATEMENT"} */
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final String operation;

    /**
     * Operation Example: {@code "SELECT STATEMENT"}
     *
     * @return the value
     */
    public String getOperation() {
        return operation;
    }

    /** Remark Example: {@code ""} */
    @com.fasterxml.jackson.annotation.JsonProperty("remark")
    private final String remark;

    /**
     * Remark Example: {@code ""}
     *
     * @return the value
     */
    public String getRemark() {
        return remark;
    }

    /** Options Example: {@code "RANGE SCAN"} */
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final String options;

    /**
     * Options Example: {@code "RANGE SCAN"}
     *
     * @return the value
     */
    public String getOptions() {
        return options;
    }

    /** Object Node Example: {@code "Q4000"} */
    @com.fasterxml.jackson.annotation.JsonProperty("objectNode")
    private final String objectNode;

    /**
     * Object Node Example: {@code "Q4000"}
     *
     * @return the value
     */
    public String getObjectNode() {
        return objectNode;
    }

    /** Object Owner Example: {@code "TENANT_A#SCHEMA"} */
    @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
    private final String objectOwner;

    /**
     * Object Owner Example: {@code "TENANT_A#SCHEMA"}
     *
     * @return the value
     */
    public String getObjectOwner() {
        return objectOwner;
    }

    /** Object Name Example: {@code "PLAN_LINES_PK"} */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * Object Name Example: {@code "PLAN_LINES_PK"}
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** Object Alias Example: {@code "PLAN_LINES@SEL$1"} */
    @com.fasterxml.jackson.annotation.JsonProperty("objectAlias")
    private final String objectAlias;

    /**
     * Object Alias Example: {@code "PLAN_LINES@SEL$1"}
     *
     * @return the value
     */
    public String getObjectAlias() {
        return objectAlias;
    }

    /** Object Instance Example: {@code 37472} */
    @com.fasterxml.jackson.annotation.JsonProperty("objectInstance")
    private final Long objectInstance;

    /**
     * Object Instance Example: {@code 37472}
     *
     * @return the value
     */
    public Long getObjectInstance() {
        return objectInstance;
    }

    /** Object Type Example: {@code "INDEX (UNIQUE)"} */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

    /**
     * Object Type Example: {@code "INDEX (UNIQUE)"}
     *
     * @return the value
     */
    public String getObjectType() {
        return objectType;
    }

    /** Optimizer Example: {@code "CLUSTER"} */
    @com.fasterxml.jackson.annotation.JsonProperty("optimizer")
    private final String optimizer;

    /**
     * Optimizer Example: {@code "CLUSTER"}
     *
     * @return the value
     */
    public String getOptimizer() {
        return optimizer;
    }

    /** Search Columns Example: {@code 3} */
    @com.fasterxml.jackson.annotation.JsonProperty("searchColumns")
    private final Long searchColumns;

    /**
     * Search Columns Example: {@code 3}
     *
     * @return the value
     */
    public Long getSearchColumns() {
        return searchColumns;
    }

    /** Identifier Example: {@code 3} */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final Long identifier;

    /**
     * Identifier Example: {@code 3}
     *
     * @return the value
     */
    public Long getIdentifier() {
        return identifier;
    }

    /** Parent Identifier Example: {@code 2} */
    @com.fasterxml.jackson.annotation.JsonProperty("parentIdentifier")
    private final Long parentIdentifier;

    /**
     * Parent Identifier Example: {@code 2}
     *
     * @return the value
     */
    public Long getParentIdentifier() {
        return parentIdentifier;
    }

    /** Depth Example: {@code 3} */
    @com.fasterxml.jackson.annotation.JsonProperty("depth")
    private final Long depth;

    /**
     * Depth Example: {@code 3}
     *
     * @return the value
     */
    public Long getDepth() {
        return depth;
    }

    /** Position Example: {@code 1} */
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Long position;

    /**
     * Position Example: {@code 1}
     *
     * @return the value
     */
    public Long getPosition() {
        return position;
    }

    /** Cost Example: {@code 1} */
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    private final Long cost;

    /**
     * Cost Example: {@code 1}
     *
     * @return the value
     */
    public Long getCost() {
        return cost;
    }

    /** Cardinality Example: {@code 1} */
    @com.fasterxml.jackson.annotation.JsonProperty("cardinality")
    private final Long cardinality;

    /**
     * Cardinality Example: {@code 1}
     *
     * @return the value
     */
    public Long getCardinality() {
        return cardinality;
    }

    /** Bytes Example: {@code 150} */
    @com.fasterxml.jackson.annotation.JsonProperty("bytes")
    private final Long bytes;

    /**
     * Bytes Example: {@code 150}
     *
     * @return the value
     */
    public Long getBytes() {
        return bytes;
    }

    /** Other Example: */
    @com.fasterxml.jackson.annotation.JsonProperty("other")
    private final String other;

    /**
     * Other Example:
     *
     * @return the value
     */
    public String getOther() {
        return other;
    }

    /** Other Tag Example: {@code "PARALLEL_COMBINED_WITH_PARENT"} */
    @com.fasterxml.jackson.annotation.JsonProperty("otherTag")
    private final String otherTag;

    /**
     * Other Tag Example: {@code "PARALLEL_COMBINED_WITH_PARENT"}
     *
     * @return the value
     */
    public String getOtherTag() {
        return otherTag;
    }

    /** Partition start Example: {@code 1} */
    @com.fasterxml.jackson.annotation.JsonProperty("partitionStart")
    private final String partitionStart;

    /**
     * Partition start Example: {@code 1}
     *
     * @return the value
     */
    public String getPartitionStart() {
        return partitionStart;
    }

    /** Partition stop Example: {@code 2} */
    @com.fasterxml.jackson.annotation.JsonProperty("partitionStop")
    private final String partitionStop;

    /**
     * Partition stop Example: {@code 2}
     *
     * @return the value
     */
    public String getPartitionStop() {
        return partitionStop;
    }

    /** Partition identifier Example: {@code 8} */
    @com.fasterxml.jackson.annotation.JsonProperty("partitionIdentifier")
    private final Long partitionIdentifier;

    /**
     * Partition identifier Example: {@code 8}
     *
     * @return the value
     */
    public Long getPartitionIdentifier() {
        return partitionIdentifier;
    }

    /** Distribution Example: {@code "QC (RANDOM)"} */
    @com.fasterxml.jackson.annotation.JsonProperty("distribution")
    private final String distribution;

    /**
     * Distribution Example: {@code "QC (RANDOM)"}
     *
     * @return the value
     */
    public String getDistribution() {
        return distribution;
    }

    /** CPU cost Example: {@code 7321} */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCost")
    private final Long cpuCost;

    /**
     * CPU cost Example: {@code 7321}
     *
     * @return the value
     */
    public Long getCpuCost() {
        return cpuCost;
    }

    /** IO cost Example: {@code 1} */
    @com.fasterxml.jackson.annotation.JsonProperty("ioCost")
    private final Long ioCost;

    /**
     * IO cost Example: {@code 1}
     *
     * @return the value
     */
    public Long getIoCost() {
        return ioCost;
    }

    /** Time space Example: {@code 15614000} */
    @com.fasterxml.jackson.annotation.JsonProperty("tempSpace")
    private final Long tempSpace;

    /**
     * Time space Example: {@code 15614000}
     *
     * @return the value
     */
    public Long getTempSpace() {
        return tempSpace;
    }

    /** Access predicates Example: {@code "\\"RESOURCE_ID\\"=:1 AND \\"QUERY_ID\\"=:2"} */
    @com.fasterxml.jackson.annotation.JsonProperty("accessPredicates")
    private final String accessPredicates;

    /**
     * Access predicates Example: {@code "\\"RESOURCE_ID\\"=:1 AND \\"QUERY_ID\\"=:2"}
     *
     * @return the value
     */
    public String getAccessPredicates() {
        return accessPredicates;
    }

    /**
     * Filter predicates Example: {@code "(INTERNAL_FUNCTION(\\"J\\".\\"DATABASE_ROLE\\") OR
     * (\\"J\\".\\"DATABASE_ROLE\\" IS NULL AND SYS_CONTEXT('userenv','database_role')='PRIMARY'))"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filterPredicates")
    private final String filterPredicates;

    /**
     * Filter predicates Example: {@code "(INTERNAL_FUNCTION(\\"J\\".\\"DATABASE_ROLE\\") OR
     * (\\"J\\".\\"DATABASE_ROLE\\" IS NULL AND SYS_CONTEXT('userenv','database_role')='PRIMARY'))"}
     *
     * @return the value
     */
    public String getFilterPredicates() {
        return filterPredicates;
    }

    /** Projection Example: {@code "COUNT(*)[22]"} */
    @com.fasterxml.jackson.annotation.JsonProperty("projection")
    private final String projection;

    /**
     * Projection Example: {@code "COUNT(*)[22]"}
     *
     * @return the value
     */
    public String getProjection() {
        return projection;
    }

    /** Qblock Name Example: {@code "SEL$1"} */
    @com.fasterxml.jackson.annotation.JsonProperty("qblockName")
    private final String qblockName;

    /**
     * Qblock Name Example: {@code "SEL$1"}
     *
     * @return the value
     */
    public String getQblockName() {
        return qblockName;
    }

    /** Total elapsed time Example: {@code 1.2} */
    @com.fasterxml.jackson.annotation.JsonProperty("elapsedTimeInSec")
    private final Float elapsedTimeInSec;

    /**
     * Total elapsed time Example: {@code 1.2}
     *
     * @return the value
     */
    public Float getElapsedTimeInSec() {
        return elapsedTimeInSec;
    }

    /**
     * Other SQL Example: {@code "<other_xml><info type=\\"db_version\\">18.0.0.0</info><info
     * type=\\"parse_schema\\"><![CDATA[\\"SYS\\"]]></info><info
     * type=\\"plan_hash_full\\">483892784</info><info type=\\"plan_hash\\">2709293936</info><info
     * type=\\"plan_hash_2\\">483892784</info><outline_data><hint><![CDATA[IGNORE_OPTIM_EMBEDDED_HINTS]]></hint><hint><![CDATA[OPTIMIZER_FEATURES_ENABLE('18.1.0')]]></hint><hint><![CDATA[DB_VERSION('18.1.0')]]></hint><hint><![CDATA[OPT_PARAM('_b_tree_bitmap_plans'
     * 'false')]]></hint><hint><![CDATA[OPT_PARAM('_optim_peek_user_binds'
     * 'false')]]></hint><hint><![CDATA[OPT_PARAM('result_cache_mode'
     * 'FORCE')]]></hint><hint><![CDATA[OPT_PARAM('_fix_control' '20648883:0 27745220:1 30001331:1
     * 30142527:1
     * 30539126:1')]]></hint><hint><![CDATA[OUTLINE_LEAF(@\\"SEL$1\\")]]></hint><hint><![CDATA[INDEX(@\\"SEL$1\\"
     * \\"USER$\\"@\\"SEL$1\\" \\"I_USER#\\")]]></hint></outline_data></other_xml>"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("otherXML")
    private final String otherXML;

    /**
     * Other SQL Example: {@code "<other_xml><info type=\\"db_version\\">18.0.0.0</info><info
     * type=\\"parse_schema\\"><![CDATA[\\"SYS\\"]]></info><info
     * type=\\"plan_hash_full\\">483892784</info><info type=\\"plan_hash\\">2709293936</info><info
     * type=\\"plan_hash_2\\">483892784</info><outline_data><hint><![CDATA[IGNORE_OPTIM_EMBEDDED_HINTS]]></hint><hint><![CDATA[OPTIMIZER_FEATURES_ENABLE('18.1.0')]]></hint><hint><![CDATA[DB_VERSION('18.1.0')]]></hint><hint><![CDATA[OPT_PARAM('_b_tree_bitmap_plans'
     * 'false')]]></hint><hint><![CDATA[OPT_PARAM('_optim_peek_user_binds'
     * 'false')]]></hint><hint><![CDATA[OPT_PARAM('result_cache_mode'
     * 'FORCE')]]></hint><hint><![CDATA[OPT_PARAM('_fix_control' '20648883:0 27745220:1 30001331:1
     * 30142527:1
     * 30539126:1')]]></hint><hint><![CDATA[OUTLINE_LEAF(@\\"SEL$1\\")]]></hint><hint><![CDATA[INDEX(@\\"SEL$1\\"
     * \\"USER$\\"@\\"SEL$1\\" \\"I_USER#\\")]]></hint></outline_data></other_xml>"}
     *
     * @return the value
     */
    public String getOtherXML() {
        return otherXML;
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
        sb.append("SqlPlanLine(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", sqlIdentifier=").append(String.valueOf(this.sqlIdentifier));
        sb.append(", planHash=").append(String.valueOf(this.planHash));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", remark=").append(String.valueOf(this.remark));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(", objectNode=").append(String.valueOf(this.objectNode));
        sb.append(", objectOwner=").append(String.valueOf(this.objectOwner));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectAlias=").append(String.valueOf(this.objectAlias));
        sb.append(", objectInstance=").append(String.valueOf(this.objectInstance));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", optimizer=").append(String.valueOf(this.optimizer));
        sb.append(", searchColumns=").append(String.valueOf(this.searchColumns));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", parentIdentifier=").append(String.valueOf(this.parentIdentifier));
        sb.append(", depth=").append(String.valueOf(this.depth));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(", cost=").append(String.valueOf(this.cost));
        sb.append(", cardinality=").append(String.valueOf(this.cardinality));
        sb.append(", bytes=").append(String.valueOf(this.bytes));
        sb.append(", other=").append(String.valueOf(this.other));
        sb.append(", otherTag=").append(String.valueOf(this.otherTag));
        sb.append(", partitionStart=").append(String.valueOf(this.partitionStart));
        sb.append(", partitionStop=").append(String.valueOf(this.partitionStop));
        sb.append(", partitionIdentifier=").append(String.valueOf(this.partitionIdentifier));
        sb.append(", distribution=").append(String.valueOf(this.distribution));
        sb.append(", cpuCost=").append(String.valueOf(this.cpuCost));
        sb.append(", ioCost=").append(String.valueOf(this.ioCost));
        sb.append(", tempSpace=").append(String.valueOf(this.tempSpace));
        sb.append(", accessPredicates=").append(String.valueOf(this.accessPredicates));
        sb.append(", filterPredicates=").append(String.valueOf(this.filterPredicates));
        sb.append(", projection=").append(String.valueOf(this.projection));
        sb.append(", qblockName=").append(String.valueOf(this.qblockName));
        sb.append(", elapsedTimeInSec=").append(String.valueOf(this.elapsedTimeInSec));
        sb.append(", otherXML=").append(String.valueOf(this.otherXML));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlPlanLine)) {
            return false;
        }

        SqlPlanLine other = (SqlPlanLine) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.sqlIdentifier, other.sqlIdentifier)
                && java.util.Objects.equals(this.planHash, other.planHash)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.remark, other.remark)
                && java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.objectNode, other.objectNode)
                && java.util.Objects.equals(this.objectOwner, other.objectOwner)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectAlias, other.objectAlias)
                && java.util.Objects.equals(this.objectInstance, other.objectInstance)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.optimizer, other.optimizer)
                && java.util.Objects.equals(this.searchColumns, other.searchColumns)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.parentIdentifier, other.parentIdentifier)
                && java.util.Objects.equals(this.depth, other.depth)
                && java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.cost, other.cost)
                && java.util.Objects.equals(this.cardinality, other.cardinality)
                && java.util.Objects.equals(this.bytes, other.bytes)
                && java.util.Objects.equals(this.other, other.other)
                && java.util.Objects.equals(this.otherTag, other.otherTag)
                && java.util.Objects.equals(this.partitionStart, other.partitionStart)
                && java.util.Objects.equals(this.partitionStop, other.partitionStop)
                && java.util.Objects.equals(this.partitionIdentifier, other.partitionIdentifier)
                && java.util.Objects.equals(this.distribution, other.distribution)
                && java.util.Objects.equals(this.cpuCost, other.cpuCost)
                && java.util.Objects.equals(this.ioCost, other.ioCost)
                && java.util.Objects.equals(this.tempSpace, other.tempSpace)
                && java.util.Objects.equals(this.accessPredicates, other.accessPredicates)
                && java.util.Objects.equals(this.filterPredicates, other.filterPredicates)
                && java.util.Objects.equals(this.projection, other.projection)
                && java.util.Objects.equals(this.qblockName, other.qblockName)
                && java.util.Objects.equals(this.elapsedTimeInSec, other.elapsedTimeInSec)
                && java.util.Objects.equals(this.otherXML, other.otherXML)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlIdentifier == null ? 43 : this.sqlIdentifier.hashCode());
        result = (result * PRIME) + (this.planHash == null ? 43 : this.planHash.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.remark == null ? 43 : this.remark.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + (this.objectNode == null ? 43 : this.objectNode.hashCode());
        result = (result * PRIME) + (this.objectOwner == null ? 43 : this.objectOwner.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.objectAlias == null ? 43 : this.objectAlias.hashCode());
        result =
                (result * PRIME)
                        + (this.objectInstance == null ? 43 : this.objectInstance.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.optimizer == null ? 43 : this.optimizer.hashCode());
        result =
                (result * PRIME)
                        + (this.searchColumns == null ? 43 : this.searchColumns.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result =
                (result * PRIME)
                        + (this.parentIdentifier == null ? 43 : this.parentIdentifier.hashCode());
        result = (result * PRIME) + (this.depth == null ? 43 : this.depth.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + (this.cost == null ? 43 : this.cost.hashCode());
        result = (result * PRIME) + (this.cardinality == null ? 43 : this.cardinality.hashCode());
        result = (result * PRIME) + (this.bytes == null ? 43 : this.bytes.hashCode());
        result = (result * PRIME) + (this.other == null ? 43 : this.other.hashCode());
        result = (result * PRIME) + (this.otherTag == null ? 43 : this.otherTag.hashCode());
        result =
                (result * PRIME)
                        + (this.partitionStart == null ? 43 : this.partitionStart.hashCode());
        result =
                (result * PRIME)
                        + (this.partitionStop == null ? 43 : this.partitionStop.hashCode());
        result =
                (result * PRIME)
                        + (this.partitionIdentifier == null
                                ? 43
                                : this.partitionIdentifier.hashCode());
        result = (result * PRIME) + (this.distribution == null ? 43 : this.distribution.hashCode());
        result = (result * PRIME) + (this.cpuCost == null ? 43 : this.cpuCost.hashCode());
        result = (result * PRIME) + (this.ioCost == null ? 43 : this.ioCost.hashCode());
        result = (result * PRIME) + (this.tempSpace == null ? 43 : this.tempSpace.hashCode());
        result =
                (result * PRIME)
                        + (this.accessPredicates == null ? 43 : this.accessPredicates.hashCode());
        result =
                (result * PRIME)
                        + (this.filterPredicates == null ? 43 : this.filterPredicates.hashCode());
        result = (result * PRIME) + (this.projection == null ? 43 : this.projection.hashCode());
        result = (result * PRIME) + (this.qblockName == null ? 43 : this.qblockName.hashCode());
        result =
                (result * PRIME)
                        + (this.elapsedTimeInSec == null ? 43 : this.elapsedTimeInSec.hashCode());
        result = (result * PRIME) + (this.otherXML == null ? 43 : this.otherXML.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
