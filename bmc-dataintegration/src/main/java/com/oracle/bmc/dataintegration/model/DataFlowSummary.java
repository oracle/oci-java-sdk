/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The data flow summary type contains the audit summary information and the definition of the data
 * flow. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataFlowSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataFlowSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "name",
        "identifier",
        "objectVersion",
        "nodes",
        "parameters",
        "description",
        "flowConfigValues",
        "objectStatus",
        "metadata",
        "keyMap",
        "typedObjectMap",
        "targetFieldMapSummary"
    })
    public DataFlowSummary(
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String identifier,
            Integer objectVersion,
            java.util.List<FlowNode> nodes,
            java.util.List<Parameter> parameters,
            String description,
            ConfigValues flowConfigValues,
            Integer objectStatus,
            ObjectMetadata metadata,
            java.util.Map<String, String> keyMap,
            java.util.Map<String, TypedObjectWrapper> typedObjectMap,
            java.util.Map<String, FieldMapWrapper> targetFieldMapSummary) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.identifier = identifier;
        this.objectVersion = objectVersion;
        this.nodes = nodes;
        this.parameters = parameters;
        this.description = description;
        this.flowConfigValues = flowConfigValues;
        this.objectStatus = objectStatus;
        this.metadata = metadata;
        this.keyMap = keyMap;
        this.typedObjectMap = typedObjectMap;
        this.targetFieldMapSummary = targetFieldMapSummary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Generated key that can be used in API calls to identify data flow. On scenarios where
         * reference to the data flow is needed, a value can be passed in create.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Generated key that can be used in API calls to identify data flow. On scenarios where
         * reference to the data flow is needed, a value can be passed in create.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The type of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the object.
         *
         * @param modelType the value to set
         * @return this builder
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /** The model version of an object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
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
        /**
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** The version of the object that is used to track changes in the object instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * The version of the object that is used to track changes in the object instance.
         *
         * @param objectVersion the value to set
         * @return this builder
         */
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /** An array of nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private java.util.List<FlowNode> nodes;

        /**
         * An array of nodes.
         *
         * @param nodes the value to set
         * @return this builder
         */
        public Builder nodes(java.util.List<FlowNode> nodes) {
            this.nodes = nodes;
            this.__explicitlySet__.add("nodes");
            return this;
        }
        /** An array of parameters. */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        /**
         * An array of parameters.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /** Detailed description for the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description for the object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flowConfigValues")
        private ConfigValues flowConfigValues;

        public Builder flowConfigValues(ConfigValues flowConfigValues) {
            this.flowConfigValues = flowConfigValues;
            this.__explicitlySet__.add("flowConfigValues");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         *
         * @param objectStatus the value to set
         * @return this builder
         */
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * A key map. If provided, key is replaced with generated key. This structure provides
         * mapping between user provided key and generated key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
        private java.util.Map<String, String> keyMap;

        /**
         * A key map. If provided, key is replaced with generated key. This structure provides
         * mapping between user provided key and generated key.
         *
         * @param keyMap the value to set
         * @return this builder
         */
        public Builder keyMap(java.util.Map<String, String> keyMap) {
            this.keyMap = keyMap;
            this.__explicitlySet__.add("keyMap");
            return this;
        }
        /** A hash map that maps TypedObject keys to the object itself, for java sdk. */
        @com.fasterxml.jackson.annotation.JsonProperty("typedObjectMap")
        private java.util.Map<String, TypedObjectWrapper> typedObjectMap;

        /**
         * A hash map that maps TypedObject keys to the object itself, for java sdk.
         *
         * @param typedObjectMap the value to set
         * @return this builder
         */
        public Builder typedObjectMap(java.util.Map<String, TypedObjectWrapper> typedObjectMap) {
            this.typedObjectMap = typedObjectMap;
            this.__explicitlySet__.add("typedObjectMap");
            return this;
        }
        /**
         * A hash map that maps TypedObject keys to a field map that maps to the typed object as a
         * target, for java sdk.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetFieldMapSummary")
        private java.util.Map<String, FieldMapWrapper> targetFieldMapSummary;

        /**
         * A hash map that maps TypedObject keys to a field map that maps to the typed object as a
         * target, for java sdk.
         *
         * @param targetFieldMapSummary the value to set
         * @return this builder
         */
        public Builder targetFieldMapSummary(
                java.util.Map<String, FieldMapWrapper> targetFieldMapSummary) {
            this.targetFieldMapSummary = targetFieldMapSummary;
            this.__explicitlySet__.add("targetFieldMapSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataFlowSummary build() {
            DataFlowSummary model =
                    new DataFlowSummary(
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.identifier,
                            this.objectVersion,
                            this.nodes,
                            this.parameters,
                            this.description,
                            this.flowConfigValues,
                            this.objectStatus,
                            this.metadata,
                            this.keyMap,
                            this.typedObjectMap,
                            this.targetFieldMapSummary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataFlowSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
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
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("nodes")) {
                this.nodes(model.getNodes());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("flowConfigValues")) {
                this.flowConfigValues(model.getFlowConfigValues());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("keyMap")) {
                this.keyMap(model.getKeyMap());
            }
            if (model.wasPropertyExplicitlySet("typedObjectMap")) {
                this.typedObjectMap(model.getTypedObjectMap());
            }
            if (model.wasPropertyExplicitlySet("targetFieldMapSummary")) {
                this.targetFieldMapSummary(model.getTargetFieldMapSummary());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Generated key that can be used in API calls to identify data flow. On scenarios where
     * reference to the data flow is needed, a value can be passed in create.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify data flow. On scenarios where
     * reference to the data flow is needed, a value can be passed in create.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The type of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the object.
     *
     * @return the value
     */
    public String getModelType() {
        return modelType;
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

    /** An array of nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.List<FlowNode> nodes;

    /**
     * An array of nodes.
     *
     * @return the value
     */
    public java.util.List<FlowNode> getNodes() {
        return nodes;
    }

    /** An array of parameters. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

    /**
     * An array of parameters.
     *
     * @return the value
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
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

    @com.fasterxml.jackson.annotation.JsonProperty("flowConfigValues")
    private final ConfigValues flowConfigValues;

    public ConfigValues getFlowConfigValues() {
        return flowConfigValues;
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

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping
     * between user provided key and generated key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
    private final java.util.Map<String, String> keyMap;

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping
     * between user provided key and generated key.
     *
     * @return the value
     */
    public java.util.Map<String, String> getKeyMap() {
        return keyMap;
    }

    /** A hash map that maps TypedObject keys to the object itself, for java sdk. */
    @com.fasterxml.jackson.annotation.JsonProperty("typedObjectMap")
    private final java.util.Map<String, TypedObjectWrapper> typedObjectMap;

    /**
     * A hash map that maps TypedObject keys to the object itself, for java sdk.
     *
     * @return the value
     */
    public java.util.Map<String, TypedObjectWrapper> getTypedObjectMap() {
        return typedObjectMap;
    }

    /**
     * A hash map that maps TypedObject keys to a field map that maps to the typed object as a
     * target, for java sdk.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetFieldMapSummary")
    private final java.util.Map<String, FieldMapWrapper> targetFieldMapSummary;

    /**
     * A hash map that maps TypedObject keys to a field map that maps to the typed object as a
     * target, for java sdk.
     *
     * @return the value
     */
    public java.util.Map<String, FieldMapWrapper> getTargetFieldMapSummary() {
        return targetFieldMapSummary;
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
        sb.append("DataFlowSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", nodes=").append(String.valueOf(this.nodes));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", flowConfigValues=").append(String.valueOf(this.flowConfigValues));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", keyMap=").append(String.valueOf(this.keyMap));
        sb.append(", typedObjectMap=").append(String.valueOf(this.typedObjectMap));
        sb.append(", targetFieldMapSummary=").append(String.valueOf(this.targetFieldMapSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataFlowSummary)) {
            return false;
        }

        DataFlowSummary other = (DataFlowSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.nodes, other.nodes)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.flowConfigValues, other.flowConfigValues)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.keyMap, other.keyMap)
                && java.util.Objects.equals(this.typedObjectMap, other.typedObjectMap)
                && java.util.Objects.equals(this.targetFieldMapSummary, other.targetFieldMapSummary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.flowConfigValues == null ? 43 : this.flowConfigValues.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.keyMap == null ? 43 : this.keyMap.hashCode());
        result =
                (result * PRIME)
                        + (this.typedObjectMap == null ? 43 : this.typedObjectMap.hashCode());
        result =
                (result * PRIME)
                        + (this.targetFieldMapSummary == null
                                ? 43
                                : this.targetFieldMapSummary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
