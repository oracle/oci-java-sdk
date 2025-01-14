/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the OCI Dataflow task. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateTaskFromOCIDataflowTask.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateTaskFromOCIDataflowTask extends UpdateTaskDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
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

        @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
        private ConfigProvider configProviderDelegate;

        public Builder configProviderDelegate(ConfigProvider configProviderDelegate) {
            this.configProviderDelegate = configProviderDelegate;
            this.__explicitlySet__.add("configProviderDelegate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isConcurrentAllowed")
        private Boolean isConcurrentAllowed;

        public Builder isConcurrentAllowed(Boolean isConcurrentAllowed) {
            this.isConcurrentAllowed = isConcurrentAllowed;
            this.__explicitlySet__.add("isConcurrentAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataflowApplication")
        private DataflowApplication dataflowApplication;

        public Builder dataflowApplication(DataflowApplication dataflowApplication) {
            this.dataflowApplication = dataflowApplication;
            this.__explicitlySet__.add("dataflowApplication");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("driverShapeDetails")
        private ShapeDetails driverShapeDetails;

        public Builder driverShapeDetails(ShapeDetails driverShapeDetails) {
            this.driverShapeDetails = driverShapeDetails;
            this.__explicitlySet__.add("driverShapeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executorShapeDetails")
        private ShapeDetails executorShapeDetails;

        public Builder executorShapeDetails(ShapeDetails executorShapeDetails) {
            this.executorShapeDetails = executorShapeDetails;
            this.__explicitlySet__.add("executorShapeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTaskFromOCIDataflowTask build() {
            UpdateTaskFromOCIDataflowTask model =
                    new UpdateTaskFromOCIDataflowTask(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.objectVersion,
                            this.identifier,
                            this.inputPorts,
                            this.outputPorts,
                            this.parameters,
                            this.opConfigValues,
                            this.configProviderDelegate,
                            this.isConcurrentAllowed,
                            this.registryMetadata,
                            this.dataflowApplication,
                            this.driverShapeDetails,
                            this.executorShapeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTaskFromOCIDataflowTask model) {
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
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
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
            if (model.wasPropertyExplicitlySet("isConcurrentAllowed")) {
                this.isConcurrentAllowed(model.getIsConcurrentAllowed());
            }
            if (model.wasPropertyExplicitlySet("registryMetadata")) {
                this.registryMetadata(model.getRegistryMetadata());
            }
            if (model.wasPropertyExplicitlySet("dataflowApplication")) {
                this.dataflowApplication(model.getDataflowApplication());
            }
            if (model.wasPropertyExplicitlySet("driverShapeDetails")) {
                this.driverShapeDetails(model.getDriverShapeDetails());
            }
            if (model.wasPropertyExplicitlySet("executorShapeDetails")) {
                this.executorShapeDetails(model.getExecutorShapeDetails());
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

    @Deprecated
    public UpdateTaskFromOCIDataflowTask(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            ConfigProvider configProviderDelegate,
            Boolean isConcurrentAllowed,
            RegistryMetadata registryMetadata,
            DataflowApplication dataflowApplication,
            ShapeDetails driverShapeDetails,
            ShapeDetails executorShapeDetails) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectStatus,
                objectVersion,
                identifier,
                inputPorts,
                outputPorts,
                parameters,
                opConfigValues,
                configProviderDelegate,
                isConcurrentAllowed,
                registryMetadata);
        this.dataflowApplication = dataflowApplication;
        this.driverShapeDetails = driverShapeDetails;
        this.executorShapeDetails = executorShapeDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataflowApplication")
    private final DataflowApplication dataflowApplication;

    public DataflowApplication getDataflowApplication() {
        return dataflowApplication;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("driverShapeDetails")
    private final ShapeDetails driverShapeDetails;

    public ShapeDetails getDriverShapeDetails() {
        return driverShapeDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executorShapeDetails")
    private final ShapeDetails executorShapeDetails;

    public ShapeDetails getExecutorShapeDetails() {
        return executorShapeDetails;
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
        sb.append("UpdateTaskFromOCIDataflowTask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dataflowApplication=").append(String.valueOf(this.dataflowApplication));
        sb.append(", driverShapeDetails=").append(String.valueOf(this.driverShapeDetails));
        sb.append(", executorShapeDetails=").append(String.valueOf(this.executorShapeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTaskFromOCIDataflowTask)) {
            return false;
        }

        UpdateTaskFromOCIDataflowTask other = (UpdateTaskFromOCIDataflowTask) o;
        return java.util.Objects.equals(this.dataflowApplication, other.dataflowApplication)
                && java.util.Objects.equals(this.driverShapeDetails, other.driverShapeDetails)
                && java.util.Objects.equals(this.executorShapeDetails, other.executorShapeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dataflowApplication == null
                                ? 43
                                : this.dataflowApplication.hashCode());
        result =
                (result * PRIME)
                        + (this.driverShapeDetails == null
                                ? 43
                                : this.driverShapeDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShapeDetails == null
                                ? 43
                                : this.executorShapeDetails.hashCode());
        return result;
    }
}
