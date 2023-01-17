/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Base type for the type system. <br>
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
        defaultImpl = BaseType.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ArrayType.class,
            name = "ARRAY_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ConfiguredType.class,
            name = "CONFIGURED_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = JavaType.class, name = "JAVA_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DynamicType.class,
            name = "DYNAMIC_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DerivedType.class,
            name = "DERIVED_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DataType.class, name = "DATA_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MaterializedCompositeType.class,
            name = "MATERIALIZED_COMPOSITE_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = MapType.class, name = "MAP_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CompositeType.class,
            name = "COMPOSITE_TYPE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class BaseType extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "parentRef",
        "name",
        "objectStatus",
        "description"
    })
    protected BaseType(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectStatus,
            String description) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.objectStatus = objectStatus;
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

    /** A user defined description for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user defined description for the object.
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
        sb.append("BaseType(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseType)) {
            return false;
        }

        BaseType other = (BaseType) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The property which disciminates the subtypes. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        DynamicType("DYNAMIC_TYPE"),
        StructuredType("STRUCTURED_TYPE"),
        DataType("DATA_TYPE"),
        JavaType("JAVA_TYPE"),
        ConfiguredType("CONFIGURED_TYPE"),
        CompositeType("COMPOSITE_TYPE"),
        DerivedType("DERIVED_TYPE"),
        ArrayType("ARRAY_TYPE"),
        MapType("MAP_TYPE"),
        MaterializedCompositeType("MATERIALIZED_COMPOSITE_TYPE"),

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
