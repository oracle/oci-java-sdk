/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * An operator defines some data integration semantics in a data flow. It may be reading/writing data or transforming the data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType",
    defaultImpl = Operator.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Joiner.class,
        name = "JOINER_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TaskOperator.class,
        name = "TASK_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Aggregator.class,
        name = "AGGREGATOR_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SortOper.class,
        name = "SORT_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Projection.class,
        name = "PROJECTION_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EndOperator.class,
        name = "END_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Source.class,
        name = "SOURCE_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Union.class,
        name = "UNION_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExpressionOperator.class,
        name = "EXPRESSION_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Intersect.class,
        name = "INTERSECT_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Target.class,
        name = "TARGET_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Distinct.class,
        name = "DISTINCT_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Filter.class,
        name = "FILTER_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Lookup.class,
        name = "LOOKUP_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = StartOperator.class,
        name = "START_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = MergeOperator.class,
        name = "MERGE_OPERATOR"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Minus.class,
        name = "MINUS_OPERATOR"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Operator {

    /**
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Details about the operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    Integer objectVersion;

    /**
     * An array of input ports.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
    java.util.List<InputPort> inputPorts;

    /**
     * An array of output ports.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
    java.util.List<OutputPort> outputPorts;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    /**
     * An array of parameters used in the data flow.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    java.util.List<Parameter> parameters;

    @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
    ConfigValues opConfigValues;

    /**
     * The model type of the operator.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ModelType {
        SourceOperator("SOURCE_OPERATOR"),
        FilterOperator("FILTER_OPERATOR"),
        JoinerOperator("JOINER_OPERATOR"),
        AggregatorOperator("AGGREGATOR_OPERATOR"),
        ProjectionOperator("PROJECTION_OPERATOR"),
        TargetOperator("TARGET_OPERATOR"),
        DistinctOperator("DISTINCT_OPERATOR"),
        SortOperator("SORT_OPERATOR"),
        UnionOperator("UNION_OPERATOR"),
        IntersectOperator("INTERSECT_OPERATOR"),
        MinusOperator("MINUS_OPERATOR"),
        MergeOperator("MERGE_OPERATOR"),
        StartOperator("START_OPERATOR"),
        EndOperator("END_OPERATOR"),
        PipelineOperator("PIPELINE_OPERATOR"),
        TaskOperator("TASK_OPERATOR"),
        ExpressionOperator("EXPRESSION_OPERATOR"),
        LookupOperator("LOOKUP_OPERATOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
