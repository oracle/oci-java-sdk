/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The flow node can be connected to other nodes in a data flow with input and output links and is bound to an opertor which defines the semantics of the node.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FlowNode.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FlowNode extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "inputLinks",
        "outputLinks",
        "operator",
        "uiProperties",
        "configProviderDelegate",
        "objectStatus"
    })
    public FlowNode(
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            java.util.List<InputLink> inputLinks,
            java.util.List<OutputLink> outputLinks,
            Operator operator,
            UIProperties uiProperties,
            ConfigProvider configProviderDelegate,
            Integer objectStatus) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.inputLinks = inputLinks;
        this.outputLinks = outputLinks;
        this.operator = operator;
        this.uiProperties = uiProperties;
        this.configProviderDelegate = configProviderDelegate;
        this.objectStatus = objectStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key of the object.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
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
         * The model version of an object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
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
         * An array of input links.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inputLinks")
        private java.util.List<InputLink> inputLinks;

        /**
         * An array of input links.
         * @param inputLinks the value to set
         * @return this builder
         **/
        public Builder inputLinks(java.util.List<InputLink> inputLinks) {
            this.inputLinks = inputLinks;
            this.__explicitlySet__.add("inputLinks");
            return this;
        }
        /**
         * An array of output links.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("outputLinks")
        private java.util.List<OutputLink> outputLinks;

        /**
         * An array of output links.
         * @param outputLinks the value to set
         * @return this builder
         **/
        public Builder outputLinks(java.util.List<OutputLink> outputLinks) {
            this.outputLinks = outputLinks;
            this.__explicitlySet__.add("outputLinks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uiProperties")
        private UIProperties uiProperties;

        public Builder uiProperties(UIProperties uiProperties) {
            this.uiProperties = uiProperties;
            this.__explicitlySet__.add("uiProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
        private ConfigProvider configProviderDelegate;

        public Builder configProviderDelegate(ConfigProvider configProviderDelegate) {
            this.configProviderDelegate = configProviderDelegate;
            this.__explicitlySet__.add("configProviderDelegate");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FlowNode build() {
            FlowNode model =
                    new FlowNode(
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.inputLinks,
                            this.outputLinks,
                            this.operator,
                            this.uiProperties,
                            this.configProviderDelegate,
                            this.objectStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FlowNode model) {
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
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("inputLinks")) {
                this.inputLinks(model.getInputLinks());
            }
            if (model.wasPropertyExplicitlySet("outputLinks")) {
                this.outputLinks(model.getOutputLinks());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("uiProperties")) {
                this.uiProperties(model.getUiProperties());
            }
            if (model.wasPropertyExplicitlySet("configProviderDelegate")) {
                this.configProviderDelegate(model.getConfigProviderDelegate());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
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
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the object.
     * @return the value
     **/
    public String getKey() {
        return key;
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
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
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
     * An array of input links.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputLinks")
    private final java.util.List<InputLink> inputLinks;

    /**
     * An array of input links.
     * @return the value
     **/
    public java.util.List<InputLink> getInputLinks() {
        return inputLinks;
    }

    /**
     * An array of output links.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("outputLinks")
    private final java.util.List<OutputLink> outputLinks;

    /**
     * An array of output links.
     * @return the value
     **/
    public java.util.List<OutputLink> getOutputLinks() {
        return outputLinks;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final Operator operator;

    public Operator getOperator() {
        return operator;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("uiProperties")
    private final UIProperties uiProperties;

    public UIProperties getUiProperties() {
        return uiProperties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
    private final ConfigProvider configProviderDelegate;

    public ConfigProvider getConfigProviderDelegate() {
        return configProviderDelegate;
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
        sb.append("FlowNode(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", inputLinks=").append(String.valueOf(this.inputLinks));
        sb.append(", outputLinks=").append(String.valueOf(this.outputLinks));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", uiProperties=").append(String.valueOf(this.uiProperties));
        sb.append(", configProviderDelegate=").append(String.valueOf(this.configProviderDelegate));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlowNode)) {
            return false;
        }

        FlowNode other = (FlowNode) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.inputLinks, other.inputLinks)
                && java.util.Objects.equals(this.outputLinks, other.outputLinks)
                && java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.uiProperties, other.uiProperties)
                && java.util.Objects.equals(
                        this.configProviderDelegate, other.configProviderDelegate)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.inputLinks == null ? 43 : this.inputLinks.hashCode());
        result = (result * PRIME) + (this.outputLinks == null ? 43 : this.outputLinks.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.uiProperties == null ? 43 : this.uiProperties.hashCode());
        result =
                (result * PRIME)
                        + (this.configProviderDelegate == null
                                ? 43
                                : this.configProviderDelegate.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
