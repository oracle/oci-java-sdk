/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * An operator defines some data integration semantics in a data flow. It may be reading/writing
 * data or transforming the data. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = Operator.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Joiner.class,
            name = "JOINER_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TaskOperator.class,
            name = "TASK_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Flatten.class,
            name = "FLATTEN_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Aggregator.class,
            name = "AGGREGATOR_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SortOper.class,
            name = "SORT_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Projection.class,
            name = "PROJECTION_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = EndOperator.class,
            name = "END_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Source.class,
            name = "SOURCE_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Union.class,
            name = "UNION_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExpressionOperator.class,
            name = "EXPRESSION_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Function.class,
            name = "FUNCTION_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DecisionOperator.class,
            name = "DECISION_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Intersect.class,
            name = "INTERSECT_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Target.class,
            name = "TARGET_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Distinct.class,
            name = "DISTINCT_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Filter.class,
            name = "FILTER_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Lookup.class,
            name = "LOOKUP_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Pivot.class,
            name = "PIVOT_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StartOperator.class,
            name = "START_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MergeOperator.class,
            name = "MERGE_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Split.class,
            name = "SPLIT_OPERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Minus.class,
            name = "MINUS_OPERATOR")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class Operator extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "objectVersion",
        "inputPorts",
        "outputPorts",
        "objectStatus",
        "identifier",
        "parameters",
        "opConfigValues"
    })
    protected Operator(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            java.util.List<InputPort> inputPorts,
            java.util.List<TypedObject> outputPorts,
            Integer objectStatus,
            String identifier,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.inputPorts = inputPorts;
        this.outputPorts = outputPorts;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.parameters = parameters;
        this.opConfigValues = opConfigValues;
    }

    /** The key of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the object.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The model version of an object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Details about the operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Details about the operator.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The version of the object that is used to track changes in the object instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     *
     * @return the value
     */
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /** An array of input ports. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
    private final java.util.List<InputPort> inputPorts;

    /**
     * An array of input ports.
     *
     * @return the value
     */
    public java.util.List<InputPort> getInputPorts() {
        return inputPorts;
    }

    /** An array of output ports. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
    private final java.util.List<TypedObject> outputPorts;

    /**
     * An array of output ports.
     *
     * @return the value
     */
    public java.util.List<TypedObject> getOutputPorts() {
        return outputPorts;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     *
     * @return the value
     */
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** An array of parameters used in the data flow. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

    /**
     * An array of parameters used in the data flow.
     *
     * @return the value
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
    private final ConfigValues opConfigValues;

    public ConfigValues getOpConfigValues() {
        return opConfigValues;
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
        sb.append("Operator(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", inputPorts=").append(String.valueOf(this.inputPorts));
        sb.append(", outputPorts=").append(String.valueOf(this.outputPorts));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", opConfigValues=").append(String.valueOf(this.opConfigValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Operator)) {
            return false;
        }

        Operator other = (Operator) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.inputPorts, other.inputPorts)
                && java.util.Objects.equals(this.outputPorts, other.outputPorts)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.opConfigValues, other.opConfigValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.inputPorts == null ? 43 : this.inputPorts.hashCode());
        result = (result * PRIME) + (this.outputPorts == null ? 43 : this.outputPorts.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result =
                (result * PRIME)
                        + (this.opConfigValues == null ? 43 : this.opConfigValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The model type of the operator. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        SourceOperator("SOURCE_OPERATOR"),
        FilterOperator("FILTER_OPERATOR"),
        JoinerOperator("JOINER_OPERATOR"),
        AggregatorOperator("AGGREGATOR_OPERATOR"),
        ProjectionOperator("PROJECTION_OPERATOR"),
        TargetOperator("TARGET_OPERATOR"),
        FlattenOperator("FLATTEN_OPERATOR"),
        DistinctOperator("DISTINCT_OPERATOR"),
        SortOperator("SORT_OPERATOR"),
        UnionOperator("UNION_OPERATOR"),
        IntersectOperator("INTERSECT_OPERATOR"),
        MinusOperator("MINUS_OPERATOR"),
        MergeOperator("MERGE_OPERATOR"),
        FunctionOperator("FUNCTION_OPERATOR"),
        SplitOperator("SPLIT_OPERATOR"),
        StartOperator("START_OPERATOR"),
        EndOperator("END_OPERATOR"),
        PipelineOperator("PIPELINE_OPERATOR"),
        DecisionOperator("DECISION_OPERATOR"),
        TaskOperator("TASK_OPERATOR"),
        ExpressionOperator("EXPRESSION_OPERATOR"),
        LookupOperator("LOOKUP_OPERATOR"),
        PivotOperator("PIVOT_OPERATOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

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
