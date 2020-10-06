/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Base type for the type system.
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
    defaultImpl = BaseType.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ConfiguredType.class,
        name = "CONFIGURED_TYPE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = JavaType.class, name = "JAVA_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DynamicType.class,
        name = "DYNAMIC_TYPE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DerivedType.class,
        name = "DERIVED_TYPE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = DataType.class, name = "DATA_TYPE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CompositeType.class,
        name = "COMPOSITE_TYPE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BaseType {

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
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    /**
     * A user defined description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The property which disciminates the subtypes.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ModelType {
        DynamicType("DYNAMIC_TYPE"),
        StructuredType("STRUCTURED_TYPE"),
        DataType("DATA_TYPE"),
        JavaType("JAVA_TYPE"),
        ConfiguredType("CONFIGURED_TYPE"),
        CompositeType("COMPOSITE_TYPE"),

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
