/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A `DataType` object is a simple primitive type that describes the type of a single atomic unit of data.  For example, `INT`, `VARCHAR`, `NUMBER`, and so on.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataType.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DataType extends BaseType {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dtType")
        private DtType dtType;

        public Builder dtType(DtType dtType) {
            this.dtType = dtType;
            this.__explicitlySet__.add("dtType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("typeSystemName")
        private String typeSystemName;

        public Builder typeSystemName(String typeSystemName) {
            this.typeSystemName = typeSystemName;
            this.__explicitlySet__.add("typeSystemName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configDefinition")
        private ConfigDefinition configDefinition;

        public Builder configDefinition(ConfigDefinition configDefinition) {
            this.configDefinition = configDefinition;
            this.__explicitlySet__.add("configDefinition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataType build() {
            DataType __instance__ =
                    new DataType(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            objectStatus,
                            description,
                            dtType,
                            typeSystemName,
                            configDefinition);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataType o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .objectStatus(o.getObjectStatus())
                            .description(o.getDescription())
                            .dtType(o.getDtType())
                            .typeSystemName(o.getTypeSystemName())
                            .configDefinition(o.getConfigDefinition());

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

    @Deprecated
    public DataType(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectStatus,
            String description,
            DtType dtType,
            String typeSystemName,
            ConfigDefinition configDefinition) {
        super(key, modelVersion, parentRef, name, objectStatus, description);
        this.dtType = dtType;
        this.typeSystemName = typeSystemName;
        this.configDefinition = configDefinition;
    }

    /**
     * The data type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DtType {
        Primitive("PRIMITIVE"),
        Structured("STRUCTURED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DtType> map;

        static {
            map = new java.util.HashMap<>();
            for (DtType v : DtType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DtType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DtType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DtType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dtType")
    DtType dtType;

    /**
     * The data type system name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeSystemName")
    String typeSystemName;

    @com.fasterxml.jackson.annotation.JsonProperty("configDefinition")
    ConfigDefinition configDefinition;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
