/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The pipeline summary type contains the audit summary information and the definition of the pipeline.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PipelineSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PipelineSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "modelType",
        "objectVersion",
        "objectStatus",
        "identifier",
        "nodes",
        "parameters",
        "flowConfigValues",
        "variables",
        "metadata"
    })
    public PipelineSummary(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            String modelType,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            java.util.List<FlowNode> nodes,
            java.util.List<Parameter> parameters,
            ConfigValues flowConfigValues,
            java.util.List<Variable> variables,
            ObjectMetadata metadata) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.modelType = modelType;
        this.objectVersion = objectVersion;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.nodes = nodes;
        this.parameters = parameters;
        this.flowConfigValues = flowConfigValues;
        this.variables = variables;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Generated key that can be used in API calls to identify pipeline. On scenarios where reference to the pipeline is needed, a value can be passed in create.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Generated key that can be used in API calls to identify pipeline. On scenarios where reference to the pipeline is needed, a value can be passed in create.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * This is a version number that is used by the service to upgrade objects if needed through releases of the service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * This is a version number that is used by the service to upgrade objects if needed through releases of the service.
         * @param modelVersion the value to set
         * @return this builder
         **/
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
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Detailed description for the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description for the object.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The type of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the object.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * This is used by the service for optimistic locking of the object, to prevent multiple users from simultaneously updating the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * This is used by the service for optimistic locking of the object, to prevent multiple users from simultaneously updating the object.
         * @param objectVersion the value to set
         * @return this builder
         **/
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * @param objectStatus the value to set
         * @return this builder
         **/
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         * @param identifier the value to set
         * @return this builder
         **/
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /**
         * A list of nodes attached to the pipeline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private java.util.List<FlowNode> nodes;

        /**
         * A list of nodes attached to the pipeline.
         * @param nodes the value to set
         * @return this builder
         **/
        public Builder nodes(java.util.List<FlowNode> nodes) {
            this.nodes = nodes;
            this.__explicitlySet__.add("nodes");
            return this;
        }
        /**
         * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be configured when the pipeline is executed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        /**
         * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be configured when the pipeline is executed.
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
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
         * The list of variables required in pipeline, variables can be used to store values that can be used as inputs to tasks in the pipeline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.List<Variable> variables;

        /**
         * The list of variables required in pipeline, variables can be used to store values that can be used as inputs to tasks in the pipeline.
         * @param variables the value to set
         * @return this builder
         **/
        public Builder variables(java.util.List<Variable> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineSummary build() {
            PipelineSummary model =
                    new PipelineSummary(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.modelType,
                            this.objectVersion,
                            this.objectStatus,
                            this.identifier,
                            this.nodes,
                            this.parameters,
                            this.flowConfigValues,
                            this.variables,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineSummary model) {
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
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("nodes")) {
                this.nodes(model.getNodes());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("flowConfigValues")) {
                this.flowConfigValues(model.getFlowConfigValues());
            }
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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

    /**
     * Generated key that can be used in API calls to identify pipeline. On scenarios where reference to the pipeline is needed, a value can be passed in create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify pipeline. On scenarios where reference to the pipeline is needed, a value can be passed in create.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * This is a version number that is used by the service to upgrade objects if needed through releases of the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * This is a version number that is used by the service to upgrade objects if needed through releases of the service.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Detailed description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description for the object.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the object.
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * This is used by the service for optimistic locking of the object, to prevent multiple users from simultaneously updating the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * This is used by the service for optimistic locking of the object, to prevent multiple users from simultaneously updating the object.
     * @return the value
     **/
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * @return the value
     **/
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    /**
     * A list of nodes attached to the pipeline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.List<FlowNode> nodes;

    /**
     * A list of nodes attached to the pipeline.
     * @return the value
     **/
    public java.util.List<FlowNode> getNodes() {
        return nodes;
    }

    /**
     * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be configured when the pipeline is executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

    /**
     * A list of parameters for the pipeline, this allows certain aspects of the pipeline to be configured when the pipeline is executed.
     * @return the value
     **/
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("flowConfigValues")
    private final ConfigValues flowConfigValues;

    public ConfigValues getFlowConfigValues() {
        return flowConfigValues;
    }

    /**
     * The list of variables required in pipeline, variables can be used to store values that can be used as inputs to tasks in the pipeline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.List<Variable> variables;

    /**
     * The list of variables required in pipeline, variables can be used to store values that can be used as inputs to tasks in the pipeline.
     * @return the value
     **/
    public java.util.List<Variable> getVariables() {
        return variables;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
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
        sb.append("PipelineSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", nodes=").append(String.valueOf(this.nodes));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", flowConfigValues=").append(String.valueOf(this.flowConfigValues));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineSummary)) {
            return false;
        }

        PipelineSummary other = (PipelineSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.nodes, other.nodes)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.flowConfigValues, other.flowConfigValues)
                && java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.metadata, other.metadata)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result =
                (result * PRIME)
                        + (this.flowConfigValues == null ? 43 : this.flowConfigValues.hashCode());
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
