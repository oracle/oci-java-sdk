/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A {@code DataType} object is a simple primitive type that describes the type of a single atomic unit of data.  For example, {@code INT}, {@code VARCHAR}, {@code NUMBER}, and so on.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataType.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataType extends BaseType {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        public DataType build() {
            DataType model =
                    new DataType(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.objectStatus,
                            this.description,
                            this.dtType,
                            this.typeSystemName,
                            this.configDefinition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataType model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dtType")) {
                this.dtType(model.getDtType());
            }
            if (model.wasPropertyExplicitlySet("typeSystemName")) {
                this.typeSystemName(model.getTypeSystemName());
            }
            if (model.wasPropertyExplicitlySet("configDefinition")) {
                this.configDefinition(model.getConfigDefinition());
            }
            return this;
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
    public enum DtType {
        Primitive("PRIMITIVE"),
        Structured("STRUCTURED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DtType.class);

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
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataType(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dtType=").append(String.valueOf(this.dtType));
        sb.append(", typeSystemName=").append(String.valueOf(this.typeSystemName));
        sb.append(", configDefinition=").append(String.valueOf(this.configDefinition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataType)) {
            return false;
        }

        DataType other = (DataType) o;
        return java.util.Objects.equals(this.dtType, other.dtType)
                && java.util.Objects.equals(this.typeSystemName, other.typeSystemName)
                && java.util.Objects.equals(this.configDefinition, other.configDefinition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dtType == null ? 43 : this.dtType.hashCode());
        result =
                (result * PRIME)
                        + (this.typeSystemName == null ? 43 : this.typeSystemName.hashCode());
        result =
                (result * PRIME)
                        + (this.configDefinition == null ? 43 : this.configDefinition.hashCode());
        return result;
    }
}
