/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A step of a SQL execution plan.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningTaskSqlExecutionPlanStep.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningTaskSqlExecutionPlanStep {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
        private Long planHashValue;

        public Builder planHashValue(Long planHashValue) {
            this.planHashValue = planHashValue;
            this.__explicitlySet__.add("planHashValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepId")
        private Integer stepId;

        public Builder stepId(Integer stepId) {
            this.stepId = stepId;
            this.__explicitlySet__.add("stepId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentStepId")
        private Integer parentStepId;

        public Builder parentStepId(Integer parentStepId) {
            this.parentStepId = parentStepId;
            this.__explicitlySet__.add("parentStepId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Integer position;

        public Builder position(Integer position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private String operation;

        public Builder operation(String operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private String options;

        public Builder options(String options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("optimizerMode")
        private String optimizerMode;

        public Builder optimizerMode(String optimizerMode) {
            this.optimizerMode = optimizerMode;
            this.__explicitlySet__.add("optimizerMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cost")
        private Double cost;

        public Builder cost(Double cost) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCost")
        private Double cpuCost;

        public Builder cpuCost(Double cpuCost) {
            this.cpuCost = cpuCost;
            this.__explicitlySet__.add("cpuCost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ioCost")
        private Double ioCost;

        public Builder ioCost(Double ioCost) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("time")
        private Long time;

        public Builder time(Long time) {
            this.time = time;
            this.__explicitlySet__.add("time");
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectPosition")
        private Integer objectPosition;

        public Builder objectPosition(Integer objectPosition) {
            this.objectPosition = objectPosition;
            this.__explicitlySet__.add("objectPosition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("partitionId")
        private Integer partitionId;

        public Builder partitionId(Integer partitionId) {
            this.partitionId = partitionId;
            this.__explicitlySet__.add("partitionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remarks")
        private String remarks;

        public Builder remarks(String remarks) {
            this.remarks = remarks;
            this.__explicitlySet__.add("remarks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfSearchColumn")
        private Integer numberOfSearchColumn;

        public Builder numberOfSearchColumn(Integer numberOfSearchColumn) {
            this.numberOfSearchColumn = numberOfSearchColumn;
            this.__explicitlySet__.add("numberOfSearchColumn");
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

        @com.fasterxml.jackson.annotation.JsonProperty("attribute")
        private String attribute;

        public Builder attribute(String attribute) {
            this.attribute = attribute;
            this.__explicitlySet__.add("attribute");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningTaskSqlExecutionPlanStep build() {
            SqlTuningTaskSqlExecutionPlanStep __instance__ =
                    new SqlTuningTaskSqlExecutionPlanStep(
                            planHashValue,
                            stepId,
                            parentStepId,
                            position,
                            operation,
                            options,
                            optimizerMode,
                            cost,
                            cardinality,
                            bytes,
                            cpuCost,
                            ioCost,
                            tempSpace,
                            time,
                            objectNode,
                            objectOwner,
                            objectName,
                            objectPosition,
                            objectType,
                            partitionStart,
                            partitionStop,
                            partitionId,
                            remarks,
                            numberOfSearchColumn,
                            other,
                            otherTag,
                            attribute,
                            accessPredicates,
                            filterPredicates);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningTaskSqlExecutionPlanStep o) {
            Builder copiedBuilder =
                    planHashValue(o.getPlanHashValue())
                            .stepId(o.getStepId())
                            .parentStepId(o.getParentStepId())
                            .position(o.getPosition())
                            .operation(o.getOperation())
                            .options(o.getOptions())
                            .optimizerMode(o.getOptimizerMode())
                            .cost(o.getCost())
                            .cardinality(o.getCardinality())
                            .bytes(o.getBytes())
                            .cpuCost(o.getCpuCost())
                            .ioCost(o.getIoCost())
                            .tempSpace(o.getTempSpace())
                            .time(o.getTime())
                            .objectNode(o.getObjectNode())
                            .objectOwner(o.getObjectOwner())
                            .objectName(o.getObjectName())
                            .objectPosition(o.getObjectPosition())
                            .objectType(o.getObjectType())
                            .partitionStart(o.getPartitionStart())
                            .partitionStop(o.getPartitionStop())
                            .partitionId(o.getPartitionId())
                            .remarks(o.getRemarks())
                            .numberOfSearchColumn(o.getNumberOfSearchColumn())
                            .other(o.getOther())
                            .otherTag(o.getOtherTag())
                            .attribute(o.getAttribute())
                            .accessPredicates(o.getAccessPredicates())
                            .filterPredicates(o.getFilterPredicates());

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
     * Numerical representation of the execution plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
    Long planHashValue;

    /**
     * Identification number for this step in the execution plan. It is unique within the execution plan.
     * It is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepId")
    Integer stepId;

    /**
     * ID of the next step that operates on the results of this step.
     * It is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentStepId")
    Integer parentStepId;

    /**
     * Order of processing for steps with the same parent ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    Integer position;

    /**
     * Name of the operation performed at this step
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    String operation;

    /**
     * Options used for the operation performed at this step.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    String options;

    /**
     * Current mode of the optimizer, such as all_rows, first_rows_n (where n = 1, 10, 100, 1000 etc).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("optimizerMode")
    String optimizerMode;

    /**
     * Cost of the current operation estimated by the cost-based optimizer (CBO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    Double cost;

    /**
     * Number of rows returned by the current operation (estimated by the CBO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cardinality")
    Long cardinality;

    /**
     * Number of bytes returned by the current operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bytes")
    Long bytes;

    /**
     * The CPU cost of the current operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCost")
    Double cpuCost;

    /**
     * The I/O cost of the current operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCost")
    Double ioCost;

    /**
     * Temporary space usage (in bytes) of the operation (sort or hash-join) as estimated by the CBO.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tempSpace")
    Long tempSpace;

    /**
     * Elapsed time (in seconds) of the operation as estimated by the CBO.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    Long time;

    /**
     * Name of the database link used to reference the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectNode")
    String objectNode;

    /**
     * Owner of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
    String objectOwner;

    /**
     * Name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * Numbered position of the object name in the original SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectPosition")
    Integer objectPosition;

    /**
     * Descriptive modifier that further describes the type of object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    String objectType;

    /**
     * A step may get data from a range of partitions of a partitioned object, such table or index,
     * based on predicates and sorting order. The partionStart is the starting partition of the range.
     * The partitionStop is the ending partition of the range
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionStart")
    String partitionStart;

    /**
     * A step may get data from a range of partitions of a partitioned object, such table or index,
     * based on predicates and sorting order. The partionStart is the starting partition of the range.
     * The partitionStop is the ending partition of the range
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionStop")
    String partitionStop;

    /**
     * The id of the step in the execution plan that has computed the pair of values of the partitionStart and partitionStop
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionId")
    Integer partitionId;

    /**
     * Place for comments that can be added to the steps of the execution plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remarks")
    String remarks;

    /**
     * Number of index columns with start and stop keys (that is, the number of columns with matching predicates)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfSearchColumn")
    Integer numberOfSearchColumn;

    /**
     * Information about parallel execution servers and parallel queries
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("other")
    String other;

    /**
     * Describes the function of the SQL text in the OTHER column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("otherTag")
    String otherTag;

    /**
     * Text string identifying the type of the execution plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attribute")
    String attribute;

    /**
     * Predicates used to locate rows in an access structure. For example,
     * start or stop predicates for an index range scan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessPredicates")
    String accessPredicates;

    /**
     * Predicates used to filter rows before producing them.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterPredicates")
    String filterPredicates;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
