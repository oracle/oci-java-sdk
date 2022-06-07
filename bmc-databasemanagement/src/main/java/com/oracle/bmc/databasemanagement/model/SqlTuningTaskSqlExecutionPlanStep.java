/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A step in the SQL execution plan.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningTaskSqlExecutionPlanStep.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningTaskSqlExecutionPlanStep {
    @Deprecated
    @java.beans.ConstructorProperties({
        "planHashValue",
        "stepId",
        "parentStepId",
        "position",
        "operation",
        "options",
        "optimizerMode",
        "cost",
        "cardinality",
        "bytes",
        "cpuCost",
        "ioCost",
        "tempSpace",
        "time",
        "objectNode",
        "objectOwner",
        "objectName",
        "objectPosition",
        "objectType",
        "partitionStart",
        "partitionStop",
        "partitionId",
        "remarks",
        "numberOfSearchColumn",
        "other",
        "otherTag",
        "attribute",
        "accessPredicates",
        "filterPredicates"
    })
    public SqlTuningTaskSqlExecutionPlanStep(
            Long planHashValue,
            Integer stepId,
            Integer parentStepId,
            Integer position,
            String operation,
            String options,
            String optimizerMode,
            Double cost,
            Long cardinality,
            Long bytes,
            Double cpuCost,
            Double ioCost,
            Long tempSpace,
            Long time,
            String objectNode,
            String objectOwner,
            String objectName,
            Integer objectPosition,
            String objectType,
            String partitionStart,
            String partitionStop,
            Integer partitionId,
            String remarks,
            Integer numberOfSearchColumn,
            String other,
            String otherTag,
            String attribute,
            String accessPredicates,
            String filterPredicates) {
        super();
        this.planHashValue = planHashValue;
        this.stepId = stepId;
        this.parentStepId = parentStepId;
        this.position = position;
        this.operation = operation;
        this.options = options;
        this.optimizerMode = optimizerMode;
        this.cost = cost;
        this.cardinality = cardinality;
        this.bytes = bytes;
        this.cpuCost = cpuCost;
        this.ioCost = ioCost;
        this.tempSpace = tempSpace;
        this.time = time;
        this.objectNode = objectNode;
        this.objectOwner = objectOwner;
        this.objectName = objectName;
        this.objectPosition = objectPosition;
        this.objectType = objectType;
        this.partitionStart = partitionStart;
        this.partitionStop = partitionStop;
        this.partitionId = partitionId;
        this.remarks = remarks;
        this.numberOfSearchColumn = numberOfSearchColumn;
        this.other = other;
        this.otherTag = otherTag;
        this.attribute = attribute;
        this.accessPredicates = accessPredicates;
        this.filterPredicates = filterPredicates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The numerical representation of the SQL execution plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHashValue")
    private final Long planHashValue;

    public Long getPlanHashValue() {
        return planHashValue;
    }

    /**
     * The identification number of a step in the SQL execution plan. This is unique within the SQL execution plan.
     * This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepId")
    private final Integer stepId;

    public Integer getStepId() {
        return stepId;
    }

    /**
     * The ID of the next step that operates on the results of this step.
     * This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentStepId")
    private final Integer parentStepId;

    public Integer getParentStepId() {
        return parentStepId;
    }

    /**
     * The order of processing for steps with the same parent ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Integer position;

    public Integer getPosition() {
        return position;
    }

    /**
     * The name of the operation performed at this step.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final String operation;

    public String getOperation() {
        return operation;
    }

    /**
     * The options used for the operation performed at this step.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final String options;

    public String getOptions() {
        return options;
    }

    /**
     * The current mode of the optimizer, such as all_rows, first_rows_n (where n = 1, 10, 100, 1000, and so on).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("optimizerMode")
    private final String optimizerMode;

    public String getOptimizerMode() {
        return optimizerMode;
    }

    /**
     * The cost of the current operation estimated by the cost-based optimizer (CBO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    private final Double cost;

    public Double getCost() {
        return cost;
    }

    /**
     * The number of rows returned by the current operation (estimated by the CBO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cardinality")
    private final Long cardinality;

    public Long getCardinality() {
        return cardinality;
    }

    /**
     * The number of bytes returned by the current operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bytes")
    private final Long bytes;

    public Long getBytes() {
        return bytes;
    }

    /**
     * The CPU cost of the current operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCost")
    private final Double cpuCost;

    public Double getCpuCost() {
        return cpuCost;
    }

    /**
     * The I/O cost of the current operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ioCost")
    private final Double ioCost;

    public Double getIoCost() {
        return ioCost;
    }

    /**
     * The temporary space usage (in bytes) of the operation (sort or hash-join) as estimated by the CBO.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tempSpace")
    private final Long tempSpace;

    public Long getTempSpace() {
        return tempSpace;
    }

    /**
     * The elapsed time (in seconds) of the operation as estimated by the CBO.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("time")
    private final Long time;

    public Long getTime() {
        return time;
    }

    /**
     * The name of the database link used to reference the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectNode")
    private final String objectNode;

    public String getObjectNode() {
        return objectNode;
    }

    /**
     * The owner of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectOwner")
    private final String objectOwner;

    public String getObjectOwner() {
        return objectOwner;
    }

    /**
     * The name of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    public String getObjectName() {
        return objectName;
    }

    /**
     * The numbered position of the object name in the original SQL statement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectPosition")
    private final Integer objectPosition;

    public Integer getObjectPosition() {
        return objectPosition;
    }

    /**
     * The descriptive modifier that further describes the type of object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

    public String getObjectType() {
        return objectType;
    }

    /**
     * A step may get data from a range of partitions of a partitioned object, such as table or index,
     * based on predicates and sorting order. The partionStart is the starting partition of the range.
     * The partitionStop is the ending partition of the range.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionStart")
    private final String partitionStart;

    public String getPartitionStart() {
        return partitionStart;
    }

    /**
     * A step may get data from a range of partitions of a partitioned object, such as table or index,
     * based on predicates and sorting order. The partionStart is the starting partition of the range.
     * The partitionStop is the ending partition of the range.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionStop")
    private final String partitionStop;

    public String getPartitionStop() {
        return partitionStop;
    }

    /**
     * The ID of the step in the execution plan that has computed the pair of values of partitionStart and partitionStop.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partitionId")
    private final Integer partitionId;

    public Integer getPartitionId() {
        return partitionId;
    }

    /**
     * The place for comments that can be added to the steps of the execution plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remarks")
    private final String remarks;

    public String getRemarks() {
        return remarks;
    }

    /**
     * Number of index columns with start and stop keys (that is, the number of columns with matching predicates).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfSearchColumn")
    private final Integer numberOfSearchColumn;

    public Integer getNumberOfSearchColumn() {
        return numberOfSearchColumn;
    }

    /**
     * Information about parallel execution servers and parallel queries
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("other")
    private final String other;

    public String getOther() {
        return other;
    }

    /**
     * Describes the function of the SQL text in the OTHER column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("otherTag")
    private final String otherTag;

    public String getOtherTag() {
        return otherTag;
    }

    /**
     * The text string identifying the type of execution plan.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attribute")
    private final String attribute;

    public String getAttribute() {
        return attribute;
    }

    /**
     * The predicates used to locate rows in an access structure. For example,
     * start or stop predicates for an index range scan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessPredicates")
    private final String accessPredicates;

    public String getAccessPredicates() {
        return accessPredicates;
    }

    /**
     * The predicates used to filter rows before producing them.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterPredicates")
    private final String filterPredicates;

    public String getFilterPredicates() {
        return filterPredicates;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlTuningTaskSqlExecutionPlanStep(");
        sb.append("planHashValue=").append(String.valueOf(this.planHashValue));
        sb.append(", stepId=").append(String.valueOf(this.stepId));
        sb.append(", parentStepId=").append(String.valueOf(this.parentStepId));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(", optimizerMode=").append(String.valueOf(this.optimizerMode));
        sb.append(", cost=").append(String.valueOf(this.cost));
        sb.append(", cardinality=").append(String.valueOf(this.cardinality));
        sb.append(", bytes=").append(String.valueOf(this.bytes));
        sb.append(", cpuCost=").append(String.valueOf(this.cpuCost));
        sb.append(", ioCost=").append(String.valueOf(this.ioCost));
        sb.append(", tempSpace=").append(String.valueOf(this.tempSpace));
        sb.append(", time=").append(String.valueOf(this.time));
        sb.append(", objectNode=").append(String.valueOf(this.objectNode));
        sb.append(", objectOwner=").append(String.valueOf(this.objectOwner));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectPosition=").append(String.valueOf(this.objectPosition));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", partitionStart=").append(String.valueOf(this.partitionStart));
        sb.append(", partitionStop=").append(String.valueOf(this.partitionStop));
        sb.append(", partitionId=").append(String.valueOf(this.partitionId));
        sb.append(", remarks=").append(String.valueOf(this.remarks));
        sb.append(", numberOfSearchColumn=").append(String.valueOf(this.numberOfSearchColumn));
        sb.append(", other=").append(String.valueOf(this.other));
        sb.append(", otherTag=").append(String.valueOf(this.otherTag));
        sb.append(", attribute=").append(String.valueOf(this.attribute));
        sb.append(", accessPredicates=").append(String.valueOf(this.accessPredicates));
        sb.append(", filterPredicates=").append(String.valueOf(this.filterPredicates));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningTaskSqlExecutionPlanStep)) {
            return false;
        }

        SqlTuningTaskSqlExecutionPlanStep other = (SqlTuningTaskSqlExecutionPlanStep) o;
        return java.util.Objects.equals(this.planHashValue, other.planHashValue)
                && java.util.Objects.equals(this.stepId, other.stepId)
                && java.util.Objects.equals(this.parentStepId, other.parentStepId)
                && java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.optimizerMode, other.optimizerMode)
                && java.util.Objects.equals(this.cost, other.cost)
                && java.util.Objects.equals(this.cardinality, other.cardinality)
                && java.util.Objects.equals(this.bytes, other.bytes)
                && java.util.Objects.equals(this.cpuCost, other.cpuCost)
                && java.util.Objects.equals(this.ioCost, other.ioCost)
                && java.util.Objects.equals(this.tempSpace, other.tempSpace)
                && java.util.Objects.equals(this.time, other.time)
                && java.util.Objects.equals(this.objectNode, other.objectNode)
                && java.util.Objects.equals(this.objectOwner, other.objectOwner)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectPosition, other.objectPosition)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.partitionStart, other.partitionStart)
                && java.util.Objects.equals(this.partitionStop, other.partitionStop)
                && java.util.Objects.equals(this.partitionId, other.partitionId)
                && java.util.Objects.equals(this.remarks, other.remarks)
                && java.util.Objects.equals(this.numberOfSearchColumn, other.numberOfSearchColumn)
                && java.util.Objects.equals(this.other, other.other)
                && java.util.Objects.equals(this.otherTag, other.otherTag)
                && java.util.Objects.equals(this.attribute, other.attribute)
                && java.util.Objects.equals(this.accessPredicates, other.accessPredicates)
                && java.util.Objects.equals(this.filterPredicates, other.filterPredicates)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.planHashValue == null ? 43 : this.planHashValue.hashCode());
        result = (result * PRIME) + (this.stepId == null ? 43 : this.stepId.hashCode());
        result = (result * PRIME) + (this.parentStepId == null ? 43 : this.parentStepId.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result =
                (result * PRIME)
                        + (this.optimizerMode == null ? 43 : this.optimizerMode.hashCode());
        result = (result * PRIME) + (this.cost == null ? 43 : this.cost.hashCode());
        result = (result * PRIME) + (this.cardinality == null ? 43 : this.cardinality.hashCode());
        result = (result * PRIME) + (this.bytes == null ? 43 : this.bytes.hashCode());
        result = (result * PRIME) + (this.cpuCost == null ? 43 : this.cpuCost.hashCode());
        result = (result * PRIME) + (this.ioCost == null ? 43 : this.ioCost.hashCode());
        result = (result * PRIME) + (this.tempSpace == null ? 43 : this.tempSpace.hashCode());
        result = (result * PRIME) + (this.time == null ? 43 : this.time.hashCode());
        result = (result * PRIME) + (this.objectNode == null ? 43 : this.objectNode.hashCode());
        result = (result * PRIME) + (this.objectOwner == null ? 43 : this.objectOwner.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.objectPosition == null ? 43 : this.objectPosition.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result =
                (result * PRIME)
                        + (this.partitionStart == null ? 43 : this.partitionStart.hashCode());
        result =
                (result * PRIME)
                        + (this.partitionStop == null ? 43 : this.partitionStop.hashCode());
        result = (result * PRIME) + (this.partitionId == null ? 43 : this.partitionId.hashCode());
        result = (result * PRIME) + (this.remarks == null ? 43 : this.remarks.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfSearchColumn == null
                                ? 43
                                : this.numberOfSearchColumn.hashCode());
        result = (result * PRIME) + (this.other == null ? 43 : this.other.hashCode());
        result = (result * PRIME) + (this.otherTag == null ? 43 : this.otherTag.hashCode());
        result = (result * PRIME) + (this.attribute == null ? 43 : this.attribute.hashCode());
        result =
                (result * PRIME)
                        + (this.accessPredicates == null ? 43 : this.accessPredicates.hashCode());
        result =
                (result * PRIME)
                        + (this.filterPredicates == null ? 43 : this.filterPredicates.hashCode());
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
