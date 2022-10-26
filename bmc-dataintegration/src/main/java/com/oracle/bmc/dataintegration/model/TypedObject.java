/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The {@code TypedObject} class is a base class for any model object that has a type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = TypedObject.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OutputPort.class,
            name = "OUTPUT_PORT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DynamicInputField.class,
            name = "DYNAMIC_INPUT_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AbstractField.class,
            name = "FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InputField.class,
            name = "INPUT_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Shape.class, name = "SHAPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InputPort.class,
            name = "INPUT_PORT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ConditionalOutputPort.class,
            name = "CONDITIONAL_OUTPUT_PORT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DecisionOutputPort.class,
            name = "DECISION_OUTPUT_PORT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MaterializedDynamicField.class,
            name = "MATERIALIZED_DYNAMIC_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ProxyField.class,
            name = "PROXY_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DynamicProxyField.class,
            name = "DYNAMIC_PROXY_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ShapeField.class,
            name = "SHAPE_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InputProxyField.class,
            name = "INPUT_PROXY_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = Parameter.class,
            name = "PARAMETER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PivotField.class,
            name = "PIVOT_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OutputField.class,
            name = "OUTPUT_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MacroField.class,
            name = "MACRO_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DerivedField.class,
            name = "DERIVED_FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TypedExpression.class,
            name = "TYPED_EXPRESSION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = FlowPort.class, name = "FLOW_PORT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class TypedObject extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "parentRef",
        "configValues",
        "objectStatus",
        "name",
        "description"
    })
    protected TypedObject(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.configValues = configValues;
        this.objectStatus = objectStatus;
        this.name = name;
        this.description = description;
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

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    private final ConfigValues configValues;

    public ConfigValues getConfigValues() {
        return configValues;
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

    /** Detailed description for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description for the object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("TypedObject(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", configValues=").append(String.valueOf(this.configValues));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TypedObject)) {
            return false;
        }

        TypedObject other = (TypedObject) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.configValues, other.configValues)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.configValues == null ? 43 : this.configValues.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the types object. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        Shape("SHAPE"),
        InputPort("INPUT_PORT"),
        ShapeField("SHAPE_FIELD"),
        InputField("INPUT_FIELD"),
        DerivedField("DERIVED_FIELD"),
        MacroField("MACRO_FIELD"),
        OutputField("OUTPUT_FIELD"),
        DynamicProxyField("DYNAMIC_PROXY_FIELD"),
        OutputPort("OUTPUT_PORT"),
        DynamicInputField("DYNAMIC_INPUT_FIELD"),
        ProxyField("PROXY_FIELD"),
        Parameter("PARAMETER"),
        PivotField("PIVOT_FIELD"),
        MacroPivotField("MACRO_PIVOT_FIELD"),
        ConditionalOutputPort("CONDITIONAL_OUTPUT_PORT"),
        InputProxyField("INPUT_PROXY_FIELD"),
        MaterializedDynamicField("MATERIALIZED_DYNAMIC_FIELD"),
        DecisionOutputPort("DECISION_OUTPUT_PORT"),

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
