/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Target.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Target extends Operator {
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
        private java.util.List<TypedObject> outputPorts;

        public Builder outputPorts(java.util.List<TypedObject> outputPorts) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("isReadAccess")
        private Boolean isReadAccess;

        public Builder isReadAccess(Boolean isReadAccess) {
            this.isReadAccess = isReadAccess;
            this.__explicitlySet__.add("isReadAccess");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCopyFields")
        private Boolean isCopyFields;

        public Builder isCopyFields(Boolean isCopyFields) {
            this.isCopyFields = isCopyFields;
            this.__explicitlySet__.add("isCopyFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPredefinedShape")
        private Boolean isPredefinedShape;

        public Builder isPredefinedShape(Boolean isPredefinedShape) {
            this.isPredefinedShape = isPredefinedShape;
            this.__explicitlySet__.add("isPredefinedShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUseSameSourceName")
        private Boolean isUseSameSourceName;

        public Builder isUseSameSourceName(Boolean isUseSameSourceName) {
            this.isUseSameSourceName = isUseSameSourceName;
            this.__explicitlySet__.add("isUseSameSourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetEntityNamePrefix")
        private String targetEntityNamePrefix;

        public Builder targetEntityNamePrefix(String targetEntityNamePrefix) {
            this.targetEntityNamePrefix = targetEntityNamePrefix;
            this.__explicitlySet__.add("targetEntityNamePrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetEntityNameSuffix")
        private String targetEntityNameSuffix;

        public Builder targetEntityNameSuffix(String targetEntityNameSuffix) {
            this.targetEntityNameSuffix = targetEntityNameSuffix;
            this.__explicitlySet__.add("targetEntityNameSuffix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataProperty")
        private DataProperty dataProperty;

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

        @com.fasterxml.jackson.annotation.JsonProperty("loadOrder")
        private Integer loadOrder;

        public Builder loadOrder(Integer loadOrder) {
            this.loadOrder = loadOrder;
            this.__explicitlySet__.add("loadOrder");
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
                            isUseSameSourceName,
                            targetEntityNamePrefix,
                            targetEntityNameSuffix,
                            dataProperty,
                            schemaDriftConfig,
                            fixedDataShape,
                            writeOperationConfig,
                            loadOrder);
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
                            .isUseSameSourceName(o.getIsUseSameSourceName())
                            .targetEntityNamePrefix(o.getTargetEntityNamePrefix())
                            .targetEntityNameSuffix(o.getTargetEntityNameSuffix())
                            .dataProperty(o.getDataProperty())
                            .schemaDriftConfig(o.getSchemaDriftConfig())
                            .fixedDataShape(o.getFixedDataShape())
                            .writeOperationConfig(o.getWriteOperationConfig())
                            .loadOrder(o.getLoadOrder());

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
    public Target(
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
            ConfigValues opConfigValues,
            DataEntity entity,
            Boolean isReadAccess,
            Boolean isCopyFields,
            Boolean isPredefinedShape,
            Boolean isUseSameSourceName,
            String targetEntityNamePrefix,
            String targetEntityNameSuffix,
            DataProperty dataProperty,
            SchemaDriftConfig schemaDriftConfig,
            Shape fixedDataShape,
            WriteOperationConfig writeOperationConfig,
            Integer loadOrder) {
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
        this.isUseSameSourceName = isUseSameSourceName;
        this.targetEntityNamePrefix = targetEntityNamePrefix;
        this.targetEntityNameSuffix = targetEntityNameSuffix;
        this.dataProperty = dataProperty;
        this.schemaDriftConfig = schemaDriftConfig;
        this.fixedDataShape = fixedDataShape;
        this.writeOperationConfig = writeOperationConfig;
        this.loadOrder = loadOrder;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("entity")
    DataEntity entity;

    /**
     * Specifies the read access.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadAccess")
    Boolean isReadAccess;

    /**
     * Specifies the copy fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCopyFields")
    Boolean isCopyFields;

    /**
     * Specifies if this uses a predefined shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPredefinedShape")
    Boolean isPredefinedShape;

    /**
     * Specifies if entity name is the same as source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUseSameSourceName")
    Boolean isUseSameSourceName;

    /**
     * Prefix for the entity Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetEntityNamePrefix")
    String targetEntityNamePrefix;

    /**
     * Suffix for the entity Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetEntityNameSuffix")
    String targetEntityNameSuffix;
    /**
     * Specifies the data property.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DataProperty {
        Truncate("TRUNCATE"),
        Merge("MERGE"),
        Backup("BACKUP"),
        Overwrite("OVERWRITE"),
        Append("APPEND"),
        Ignore("IGNORE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DataProperty> map;

        static {
            map = new java.util.HashMap<>();
            for (DataProperty v : DataProperty.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataProperty', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the data property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataProperty")
    DataProperty dataProperty;

    @com.fasterxml.jackson.annotation.JsonProperty("schemaDriftConfig")
    SchemaDriftConfig schemaDriftConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("fixedDataShape")
    Shape fixedDataShape;

    @com.fasterxml.jackson.annotation.JsonProperty("writeOperationConfig")
    WriteOperationConfig writeOperationConfig;

    /**
     * A numeric loading order number for the target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadOrder")
    Integer loadOrder;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
