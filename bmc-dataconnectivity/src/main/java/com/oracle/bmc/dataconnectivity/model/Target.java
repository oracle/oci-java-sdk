/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The information about the target operator. The target operator lets you specify the data entity to store the transformed data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Target.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Target extends CreateConnectivityValidationDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
        private java.util.List<InputPort> inputPorts;

        public Builder inputPorts(java.util.List<InputPort> inputPorts) {
            this.inputPorts = inputPorts;
            this.__explicitlySet__.add("inputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
        private java.util.List<OutputPort> outputPorts;

        public Builder outputPorts(java.util.List<OutputPort> outputPorts) {
            this.outputPorts = outputPorts;
            this.__explicitlySet__.add("outputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
        private ConfigValues opConfigValues;

        public Builder opConfigValues(ConfigValues opConfigValues) {
            this.opConfigValues = opConfigValues;
            this.__explicitlySet__.add("opConfigValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entity")
        private DataEntity entity;

        public Builder entity(DataEntity entity) {
            this.entity = entity;
            this.__explicitlySet__.add("entity");
            return this;
        }
        /**
         * Specifies the read access.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReadAccess")
        private Boolean isReadAccess;

        /**
         * Specifies the read access.
         * @param isReadAccess the value to set
         * @return this builder
         **/
        public Builder isReadAccess(Boolean isReadAccess) {
            this.isReadAccess = isReadAccess;
            this.__explicitlySet__.add("isReadAccess");
            return this;
        }
        /**
         * Specifies the copy fields.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCopyFields")
        private Boolean isCopyFields;

        /**
         * Specifies the copy fields.
         * @param isCopyFields the value to set
         * @return this builder
         **/
        public Builder isCopyFields(Boolean isCopyFields) {
            this.isCopyFields = isCopyFields;
            this.__explicitlySet__.add("isCopyFields");
            return this;
        }
        /**
         * Specifies if this uses a predefined shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPredefinedShape")
        private Boolean isPredefinedShape;

        /**
         * Specifies if this uses a predefined shape.
         * @param isPredefinedShape the value to set
         * @return this builder
         **/
        public Builder isPredefinedShape(Boolean isPredefinedShape) {
            this.isPredefinedShape = isPredefinedShape;
            this.__explicitlySet__.add("isPredefinedShape");
            return this;
        }
        /**
         * Specifies the data property.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataProperty")
        private DataProperty dataProperty;

        /**
         * Specifies the data property.
         * @param dataProperty the value to set
         * @return this builder
         **/
        public Builder dataProperty(DataProperty dataProperty) {
            this.dataProperty = dataProperty;
            this.__explicitlySet__.add("dataProperty");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaDriftConfig")
        private SchemaDriftConfig schemaDriftConfig;

        public Builder schemaDriftConfig(SchemaDriftConfig schemaDriftConfig) {
            this.schemaDriftConfig = schemaDriftConfig;
            this.__explicitlySet__.add("schemaDriftConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fixedDataShape")
        private Shape fixedDataShape;

        public Builder fixedDataShape(Shape fixedDataShape) {
            this.fixedDataShape = fixedDataShape;
            this.__explicitlySet__.add("fixedDataShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("writeOperationConfig")
        private WriteOperationConfig writeOperationConfig;

        public Builder writeOperationConfig(WriteOperationConfig writeOperationConfig) {
            this.writeOperationConfig = writeOperationConfig;
            this.__explicitlySet__.add("writeOperationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Target build() {
            Target __instance__ =
                    new Target(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            inputPorts,
                            outputPorts,
                            objectStatus,
                            identifier,
                            parameters,
                            opConfigValues,
                            entity,
                            isReadAccess,
                            isCopyFields,
                            isPredefinedShape,
                            dataProperty,
                            schemaDriftConfig,
                            fixedDataShape,
                            writeOperationConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Target o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .inputPorts(o.getInputPorts())
                            .outputPorts(o.getOutputPorts())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .parameters(o.getParameters())
                            .opConfigValues(o.getOpConfigValues())
                            .entity(o.getEntity())
                            .isReadAccess(o.getIsReadAccess())
                            .isCopyFields(o.getIsCopyFields())
                            .isPredefinedShape(o.getIsPredefinedShape())
                            .dataProperty(o.getDataProperty())
                            .schemaDriftConfig(o.getSchemaDriftConfig())
                            .fixedDataShape(o.getFixedDataShape())
                            .writeOperationConfig(o.getWriteOperationConfig());

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

    @Deprecated
    public Target(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            Integer objectStatus,
            String identifier,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            DataEntity entity,
            Boolean isReadAccess,
            Boolean isCopyFields,
            Boolean isPredefinedShape,
            DataProperty dataProperty,
            SchemaDriftConfig schemaDriftConfig,
            Shape fixedDataShape,
            WriteOperationConfig writeOperationConfig) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                inputPorts,
                outputPorts,
                objectStatus,
                identifier,
                parameters,
                opConfigValues);
        this.entity = entity;
        this.isReadAccess = isReadAccess;
        this.isCopyFields = isCopyFields;
        this.isPredefinedShape = isPredefinedShape;
        this.dataProperty = dataProperty;
        this.schemaDriftConfig = schemaDriftConfig;
        this.fixedDataShape = fixedDataShape;
        this.writeOperationConfig = writeOperationConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("entity")
    private final DataEntity entity;

    public DataEntity getEntity() {
        return entity;
    }

    /**
     * Specifies the read access.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadAccess")
    private final Boolean isReadAccess;

    /**
     * Specifies the read access.
     * @return the value
     **/
    public Boolean getIsReadAccess() {
        return isReadAccess;
    }

    /**
     * Specifies the copy fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCopyFields")
    private final Boolean isCopyFields;

    /**
     * Specifies the copy fields.
     * @return the value
     **/
    public Boolean getIsCopyFields() {
        return isCopyFields;
    }

    /**
     * Specifies if this uses a predefined shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPredefinedShape")
    private final Boolean isPredefinedShape;

    /**
     * Specifies if this uses a predefined shape.
     * @return the value
     **/
    public Boolean getIsPredefinedShape() {
        return isPredefinedShape;
    }

    /**
     * Specifies the data property.
     **/
    public enum DataProperty {
        Truncate("TRUNCATE"),
        Merge("MERGE"),
        Backup("BACKUP"),
        Overwrite("OVERWRITE"),
        Append("APPEND"),
        Ignore("IGNORE"),
        ;

        private final String value;
        private static java.util.Map<String, DataProperty> map;

        static {
            map = new java.util.HashMap<>();
            for (DataProperty v : DataProperty.values()) {
                map.put(v.getValue(), v);
            }
        }

        DataProperty(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataProperty create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DataProperty: " + key);
        }
    };
    /**
     * Specifies the data property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataProperty")
    private final DataProperty dataProperty;

    /**
     * Specifies the data property.
     * @return the value
     **/
    public DataProperty getDataProperty() {
        return dataProperty;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schemaDriftConfig")
    private final SchemaDriftConfig schemaDriftConfig;

    public SchemaDriftConfig getSchemaDriftConfig() {
        return schemaDriftConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fixedDataShape")
    private final Shape fixedDataShape;

    public Shape getFixedDataShape() {
        return fixedDataShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("writeOperationConfig")
    private final WriteOperationConfig writeOperationConfig;

    public WriteOperationConfig getWriteOperationConfig() {
        return writeOperationConfig;
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
        sb.append("Target(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", entity=").append(String.valueOf(this.entity));
        sb.append(", isReadAccess=").append(String.valueOf(this.isReadAccess));
        sb.append(", isCopyFields=").append(String.valueOf(this.isCopyFields));
        sb.append(", isPredefinedShape=").append(String.valueOf(this.isPredefinedShape));
        sb.append(", dataProperty=").append(String.valueOf(this.dataProperty));
        sb.append(", schemaDriftConfig=").append(String.valueOf(this.schemaDriftConfig));
        sb.append(", fixedDataShape=").append(String.valueOf(this.fixedDataShape));
        sb.append(", writeOperationConfig=").append(String.valueOf(this.writeOperationConfig));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Target)) {
            return false;
        }

        Target other = (Target) o;
        return java.util.Objects.equals(this.entity, other.entity)
                && java.util.Objects.equals(this.isReadAccess, other.isReadAccess)
                && java.util.Objects.equals(this.isCopyFields, other.isCopyFields)
                && java.util.Objects.equals(this.isPredefinedShape, other.isPredefinedShape)
                && java.util.Objects.equals(this.dataProperty, other.dataProperty)
                && java.util.Objects.equals(this.schemaDriftConfig, other.schemaDriftConfig)
                && java.util.Objects.equals(this.fixedDataShape, other.fixedDataShape)
                && java.util.Objects.equals(this.writeOperationConfig, other.writeOperationConfig)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.entity == null ? 43 : this.entity.hashCode());
        result = (result * PRIME) + (this.isReadAccess == null ? 43 : this.isReadAccess.hashCode());
        result = (result * PRIME) + (this.isCopyFields == null ? 43 : this.isCopyFields.hashCode());
        result =
                (result * PRIME)
                        + (this.isPredefinedShape == null ? 43 : this.isPredefinedShape.hashCode());
        result = (result * PRIME) + (this.dataProperty == null ? 43 : this.dataProperty.hashCode());
        result =
                (result * PRIME)
                        + (this.schemaDriftConfig == null ? 43 : this.schemaDriftConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.fixedDataShape == null ? 43 : this.fixedDataShape.hashCode());
        result =
                (result * PRIME)
                        + (this.writeOperationConfig == null
                                ? 43
                                : this.writeOperationConfig.hashCode());
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