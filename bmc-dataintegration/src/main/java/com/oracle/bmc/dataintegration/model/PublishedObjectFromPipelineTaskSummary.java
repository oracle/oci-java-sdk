/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The pipeline task published object summary.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PublishedObjectFromPipelineTaskSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PublishedObjectFromPipelineTaskSummary extends PublishedObjectSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * An array of input ports.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
        private java.util.List<InputPort> inputPorts;

        /**
         * An array of input ports.
         * @param inputPorts the value to set
         * @return this builder
         **/
        public Builder inputPorts(java.util.List<InputPort> inputPorts) {
            this.inputPorts = inputPorts;
            this.__explicitlySet__.add("inputPorts");
            return this;
        }
        /**
         * An array of output ports.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
        private java.util.List<OutputPort> outputPorts;

        /**
         * An array of output ports.
         * @param outputPorts the value to set
         * @return this builder
         **/
        public Builder outputPorts(java.util.List<OutputPort> outputPorts) {
            this.outputPorts = outputPorts;
            this.__explicitlySet__.add("outputPorts");
            return this;
        }
        /**
         * An array of parameters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        /**
         * An array of parameters.
         * @param parameters the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
        private ConfigProvider configProviderDelegate;

        public Builder configProviderDelegate(ConfigProvider configProviderDelegate) {
            this.configProviderDelegate = configProviderDelegate;
            this.__explicitlySet__.add("configProviderDelegate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pipeline")
        private Pipeline pipeline;

        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            this.__explicitlySet__.add("pipeline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PublishedObjectFromPipelineTaskSummary build() {
            PublishedObjectFromPipelineTaskSummary model =
                    new PublishedObjectFromPipelineTaskSummary(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.objectStatus,
                            this.identifier,
                            this.metadata,
                            this.inputPorts,
                            this.outputPorts,
                            this.parameters,
                            this.opConfigValues,
                            this.configProviderDelegate,
                            this.pipeline);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PublishedObjectFromPipelineTaskSummary model) {
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
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("inputPorts")) {
                this.inputPorts(model.getInputPorts());
            }
            if (model.wasPropertyExplicitlySet("outputPorts")) {
                this.outputPorts(model.getOutputPorts());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("opConfigValues")) {
                this.opConfigValues(model.getOpConfigValues());
            }
            if (model.wasPropertyExplicitlySet("configProviderDelegate")) {
                this.configProviderDelegate(model.getConfigProviderDelegate());
            }
            if (model.wasPropertyExplicitlySet("pipeline")) {
                this.pipeline(model.getPipeline());
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
    public PublishedObjectFromPipelineTaskSummary(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            ObjectMetadata metadata,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            ConfigProvider configProviderDelegate,
            Pipeline pipeline) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                objectStatus,
                identifier,
                metadata);
        this.inputPorts = inputPorts;
        this.outputPorts = outputPorts;
        this.parameters = parameters;
        this.opConfigValues = opConfigValues;
        this.configProviderDelegate = configProviderDelegate;
        this.pipeline = pipeline;
    }

    /**
     * An array of input ports.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
    private final java.util.List<InputPort> inputPorts;

    /**
     * An array of input ports.
     * @return the value
     **/
    public java.util.List<InputPort> getInputPorts() {
        return inputPorts;
    }

    /**
     * An array of output ports.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
    private final java.util.List<OutputPort> outputPorts;

    /**
     * An array of output ports.
     * @return the value
     **/
    public java.util.List<OutputPort> getOutputPorts() {
        return outputPorts;
    }

    /**
     * An array of parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

    /**
     * An array of parameters.
     * @return the value
     **/
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
    private final ConfigValues opConfigValues;

    public ConfigValues getOpConfigValues() {
        return opConfigValues;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
    private final ConfigProvider configProviderDelegate;

    public ConfigProvider getConfigProviderDelegate() {
        return configProviderDelegate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pipeline")
    private final Pipeline pipeline;

    public Pipeline getPipeline() {
        return pipeline;
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
        sb.append("PublishedObjectFromPipelineTaskSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", inputPorts=").append(String.valueOf(this.inputPorts));
        sb.append(", outputPorts=").append(String.valueOf(this.outputPorts));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", opConfigValues=").append(String.valueOf(this.opConfigValues));
        sb.append(", configProviderDelegate=").append(String.valueOf(this.configProviderDelegate));
        sb.append(", pipeline=").append(String.valueOf(this.pipeline));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublishedObjectFromPipelineTaskSummary)) {
            return false;
        }

        PublishedObjectFromPipelineTaskSummary other = (PublishedObjectFromPipelineTaskSummary) o;
        return java.util.Objects.equals(this.inputPorts, other.inputPorts)
                && java.util.Objects.equals(this.outputPorts, other.outputPorts)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.opConfigValues, other.opConfigValues)
                && java.util.Objects.equals(
                        this.configProviderDelegate, other.configProviderDelegate)
                && java.util.Objects.equals(this.pipeline, other.pipeline)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.inputPorts == null ? 43 : this.inputPorts.hashCode());
        result = (result * PRIME) + (this.outputPorts == null ? 43 : this.outputPorts.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result =
                (result * PRIME)
                        + (this.opConfigValues == null ? 43 : this.opConfigValues.hashCode());
        result =
                (result * PRIME)
                        + (this.configProviderDelegate == null
                                ? 43
                                : this.configProviderDelegate.hashCode());
        result = (result * PRIME) + (this.pipeline == null ? 43 : this.pipeline.hashCode());
        return result;
    }
}
