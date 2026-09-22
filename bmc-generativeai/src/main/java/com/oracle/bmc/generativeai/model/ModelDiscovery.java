/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Metadata describing a specific model <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ModelDiscovery.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModelDiscovery
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "modelId",
        "vendor",
        "capabilities",
        "apiCapability",
        "modalitySupport",
        "modelAccess",
        "parameters",
        "availability"
    })
    public ModelDiscovery(
            String modelId,
            String vendor,
            java.util.List<ModelCapability> capabilities,
            java.util.List<String> apiCapability,
            java.util.List<ModelModalitySupport> modalitySupport,
            ModelAccess modelAccess,
            java.util.List<Parameter> parameters,
            java.util.List<Availability> availability) {
        super();
        this.modelId = modelId;
        this.vendor = vendor;
        this.capabilities = capabilities;
        this.apiCapability = apiCapability;
        this.modalitySupport = modalitySupport;
        this.modelAccess = modelAccess;
        this.parameters = parameters;
        this.availability = availability;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A unique identifier for the model */
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * A unique identifier for the model
         *
         * @param modelId the value to set
         * @return this builder
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /** The vendor that offers the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("vendor")
        private String vendor;

        /**
         * The vendor that offers the model.
         *
         * @param vendor the value to set
         * @return this builder
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            this.__explicitlySet__.add("vendor");
            return this;
        }
        /** Describes what this model can be used for. */
        @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
        private java.util.List<ModelCapability> capabilities;

        /**
         * Describes what this model can be used for.
         *
         * @param capabilities the value to set
         * @return this builder
         */
        public Builder capabilities(java.util.List<ModelCapability> capabilities) {
            this.capabilities = capabilities;
            this.__explicitlySet__.add("capabilities");
            return this;
        }
        /**
         * The specific API endpoints that this model supports. For example, a chat model may
         * support OPENAI_V1_CHAT_COMPLETIONS and/or OPENAI_V1_RESPONSES. If empty, the model has
         * not yet been annotated with API capabilities.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("apiCapability")
        private java.util.List<String> apiCapability;

        /**
         * The specific API endpoints that this model supports. For example, a chat model may
         * support OPENAI_V1_CHAT_COMPLETIONS and/or OPENAI_V1_RESPONSES. If empty, the model has
         * not yet been annotated with API capabilities.
         *
         * @param apiCapability the value to set
         * @return this builder
         */
        public Builder apiCapability(java.util.List<String> apiCapability) {
            this.apiCapability = apiCapability;
            this.__explicitlySet__.add("apiCapability");
            return this;
        }
        /**
         * The supported input-to-output modality transformations for this model. For example, a
         * model can support TEXT to VIDEO or AUDIO to VIDEO.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modalitySupport")
        private java.util.List<ModelModalitySupport> modalitySupport;

        /**
         * The supported input-to-output modality transformations for this model. For example, a
         * model can support TEXT to VIDEO or AUDIO to VIDEO.
         *
         * @param modalitySupport the value to set
         * @return this builder
         */
        public Builder modalitySupport(java.util.List<ModelModalitySupport> modalitySupport) {
            this.modalitySupport = modalitySupport;
            this.__explicitlySet__.add("modalitySupport");
            return this;
        }
        /**
         * The access level required to use the model, which can be either HOSTED (the model is
         * hosted by the provider and can be accessed via API calls) or PROXY (the model is not
         * directly accessible and requires going through a proxy).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modelAccess")
        private ModelAccess modelAccess;

        /**
         * The access level required to use the model, which can be either HOSTED (the model is
         * hosted by the provider and can be accessed via API calls) or PROXY (the model is not
         * directly accessible and requires going through a proxy).
         *
         * @param modelAccess the value to set
         * @return this builder
         */
        public Builder modelAccess(ModelAccess modelAccess) {
            this.modelAccess = modelAccess;
            this.__explicitlySet__.add("modelAccess");
            return this;
        }
        /**
         * The list of configurable parameters supported by the model. For example, temperature and
         * max_tokens for a text generation model.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        /**
         * The list of configurable parameters supported by the model. For example, temperature and
         * max_tokens for a text generation model.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /**
         * The list of availability details for the model across different regions and deployment
         * modes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availability")
        private java.util.List<Availability> availability;

        /**
         * The list of availability details for the model across different regions and deployment
         * modes.
         *
         * @param availability the value to set
         * @return this builder
         */
        public Builder availability(java.util.List<Availability> availability) {
            this.availability = availability;
            this.__explicitlySet__.add("availability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelDiscovery build() {
            ModelDiscovery model =
                    new ModelDiscovery(
                            this.modelId,
                            this.vendor,
                            this.capabilities,
                            this.apiCapability,
                            this.modalitySupport,
                            this.modelAccess,
                            this.parameters,
                            this.availability);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDiscovery model) {
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("vendor")) {
                this.vendor(model.getVendor());
            }
            if (model.wasPropertyExplicitlySet("capabilities")) {
                this.capabilities(model.getCapabilities());
            }
            if (model.wasPropertyExplicitlySet("apiCapability")) {
                this.apiCapability(model.getApiCapability());
            }
            if (model.wasPropertyExplicitlySet("modalitySupport")) {
                this.modalitySupport(model.getModalitySupport());
            }
            if (model.wasPropertyExplicitlySet("modelAccess")) {
                this.modelAccess(model.getModelAccess());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("availability")) {
                this.availability(model.getAvailability());
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

    /** A unique identifier for the model */
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * A unique identifier for the model
     *
     * @return the value
     */
    public String getModelId() {
        return modelId;
    }

    /** The vendor that offers the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

    /**
     * The vendor that offers the model.
     *
     * @return the value
     */
    public String getVendor() {
        return vendor;
    }

    /** Describes what this model can be used for. */
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    private final java.util.List<ModelCapability> capabilities;

    /**
     * Describes what this model can be used for.
     *
     * @return the value
     */
    public java.util.List<ModelCapability> getCapabilities() {
        return capabilities;
    }

    /**
     * The specific API endpoints that this model supports. For example, a chat model may support
     * OPENAI_V1_CHAT_COMPLETIONS and/or OPENAI_V1_RESPONSES. If empty, the model has not yet been
     * annotated with API capabilities.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("apiCapability")
    private final java.util.List<String> apiCapability;

    /**
     * The specific API endpoints that this model supports. For example, a chat model may support
     * OPENAI_V1_CHAT_COMPLETIONS and/or OPENAI_V1_RESPONSES. If empty, the model has not yet been
     * annotated with API capabilities.
     *
     * @return the value
     */
    public java.util.List<String> getApiCapability() {
        return apiCapability;
    }

    /**
     * The supported input-to-output modality transformations for this model. For example, a model
     * can support TEXT to VIDEO or AUDIO to VIDEO.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modalitySupport")
    private final java.util.List<ModelModalitySupport> modalitySupport;

    /**
     * The supported input-to-output modality transformations for this model. For example, a model
     * can support TEXT to VIDEO or AUDIO to VIDEO.
     *
     * @return the value
     */
    public java.util.List<ModelModalitySupport> getModalitySupport() {
        return modalitySupport;
    }

    /**
     * The access level required to use the model, which can be either HOSTED (the model is hosted
     * by the provider and can be accessed via API calls) or PROXY (the model is not directly
     * accessible and requires going through a proxy).
     */
    public enum ModelAccess implements com.oracle.bmc.http.internal.BmcEnum {
        Hosted("HOSTED"),
        Proxy("PROXY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelAccess.class);

        private final String value;
        private static java.util.Map<String, ModelAccess> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelAccess v : ModelAccess.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelAccess(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelAccess create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelAccess', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The access level required to use the model, which can be either HOSTED (the model is hosted
     * by the provider and can be accessed via API calls) or PROXY (the model is not directly
     * accessible and requires going through a proxy).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modelAccess")
    private final ModelAccess modelAccess;

    /**
     * The access level required to use the model, which can be either HOSTED (the model is hosted
     * by the provider and can be accessed via API calls) or PROXY (the model is not directly
     * accessible and requires going through a proxy).
     *
     * @return the value
     */
    public ModelAccess getModelAccess() {
        return modelAccess;
    }

    /**
     * The list of configurable parameters supported by the model. For example, temperature and
     * max_tokens for a text generation model.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

    /**
     * The list of configurable parameters supported by the model. For example, temperature and
     * max_tokens for a text generation model.
     *
     * @return the value
     */
    public java.util.List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * The list of availability details for the model across different regions and deployment modes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availability")
    private final java.util.List<Availability> availability;

    /**
     * The list of availability details for the model across different regions and deployment modes.
     *
     * @return the value
     */
    public java.util.List<Availability> getAvailability() {
        return availability;
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
        sb.append("ModelDiscovery(");
        sb.append("super=").append(super.toString());
        sb.append("modelId=").append(String.valueOf(this.modelId));
        sb.append(", vendor=").append(String.valueOf(this.vendor));
        sb.append(", capabilities=").append(String.valueOf(this.capabilities));
        sb.append(", apiCapability=").append(String.valueOf(this.apiCapability));
        sb.append(", modalitySupport=").append(String.valueOf(this.modalitySupport));
        sb.append(", modelAccess=").append(String.valueOf(this.modelAccess));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", availability=").append(String.valueOf(this.availability));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDiscovery)) {
            return false;
        }

        ModelDiscovery other = (ModelDiscovery) o;
        return java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.vendor, other.vendor)
                && java.util.Objects.equals(this.capabilities, other.capabilities)
                && java.util.Objects.equals(this.apiCapability, other.apiCapability)
                && java.util.Objects.equals(this.modalitySupport, other.modalitySupport)
                && java.util.Objects.equals(this.modelAccess, other.modelAccess)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.availability, other.availability)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.vendor == null ? 43 : this.vendor.hashCode());
        result = (result * PRIME) + (this.capabilities == null ? 43 : this.capabilities.hashCode());
        result =
                (result * PRIME)
                        + (this.apiCapability == null ? 43 : this.apiCapability.hashCode());
        result =
                (result * PRIME)
                        + (this.modalitySupport == null ? 43 : this.modalitySupport.hashCode());
        result = (result * PRIME) + (this.modelAccess == null ? 43 : this.modelAccess.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.availability == null ? 43 : this.availability.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
