/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A {@code StructuredType} object represents a data type that exists in a physical data asset object such as a table column, but is more complex. For example, an Oracle database {@code OBJECT} type. It can be composed of multiple {@code DataType} objects.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StructuredType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StructuredType {
    @Deprecated
    @java.beans.ConstructorProperties({"schema", "dtType", "typeSystemName", "configDefinition"})
    public StructuredType(
            BaseType schema,
            DtType dtType,
            String typeSystemName,
            ConfigDefinition configDefinition) {
        super();
        this.schema = schema;
        this.dtType = dtType;
        this.typeSystemName = typeSystemName;
        this.configDefinition = configDefinition;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private BaseType schema;

        public Builder schema(BaseType schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /**
         * The data type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dtType")
        private DtType dtType;

        /**
         * The data type.
         * @param dtType the value to set
         * @return this builder
         **/
        public Builder dtType(DtType dtType) {
            this.dtType = dtType;
            this.__explicitlySet__.add("dtType");
            return this;
        }
        /**
         * The data type system name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("typeSystemName")
        private String typeSystemName;

        /**
         * The data type system name.
         * @param typeSystemName the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final BaseType schema;

    public BaseType getSchema() {
        return schema;
    }

    /**
     * The data type.
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
     * The data type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dtType")
    private final DtType dtType;

    /**
     * The data type.
     * @return the value
     **/
    public DtType getDtType() {
        return dtType;
    }

    /**
     * The data type system name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeSystemName")
    private final String typeSystemName;

    /**
     * The data type system name.
     * @return the value
     **/
    public String getTypeSystemName() {
        return typeSystemName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configDefinition")
    private final ConfigDefinition configDefinition;

    public ConfigDefinition getConfigDefinition() {
        return configDefinition;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StructuredType(");
        sb.append("schema=").append(String.valueOf(this.schema));
        sb.append(", dtType=").append(String.valueOf(this.dtType));
        sb.append(", typeSystemName=").append(String.valueOf(this.typeSystemName));
        sb.append(", configDefinition=").append(String.valueOf(this.configDefinition));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StructuredType)) {
            return false;
        }

        StructuredType other = (StructuredType) o;
        return java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.dtType, other.dtType)
                && java.util.Objects.equals(this.typeSystemName, other.typeSystemName)
                && java.util.Objects.equals(this.configDefinition, other.configDefinition)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.dtType == null ? 43 : this.dtType.hashCode());
        result =
                (result * PRIME)
                        + (this.typeSystemName == null ? 43 : this.typeSystemName.hashCode());
        result =
                (result * PRIME)
                        + (this.configDefinition == null ? 43 : this.configDefinition.hashCode());
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
