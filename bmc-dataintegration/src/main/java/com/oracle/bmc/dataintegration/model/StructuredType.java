/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A StructuredType object represents a data type that exists in a physical data asset object such as a table column, but is more complex, for example an Oracle database OBJECT type.   It can be composed of multiple DataType objects.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StructuredType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StructuredType {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private BaseType schema;

        public Builder schema(BaseType schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
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

        public StructuredType build() {
            StructuredType __instance__ =
                    new StructuredType(schema, dtType, typeSystemName, configDefinition);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StructuredType o) {
            Builder copiedBuilder =
                    schema(o.getSchema())
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

    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    BaseType schema;
    /**
     * dtType
     **/
    public enum DtType {
        Primitive("PRIMITIVE"),
        Structured("STRUCTURED"),
        ;

        private final String value;
        private static java.util.Map<String, DtType> map;

        static {
            map = new java.util.HashMap<>();
            for (DtType v : DtType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DtType: " + key);
        }
    };
    /**
     * dtType
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dtType")
    DtType dtType;

    /**
     * typeSystemName
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeSystemName")
    String typeSystemName;

    @com.fasterxml.jackson.annotation.JsonProperty("configDefinition")
    ConfigDefinition configDefinition;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
