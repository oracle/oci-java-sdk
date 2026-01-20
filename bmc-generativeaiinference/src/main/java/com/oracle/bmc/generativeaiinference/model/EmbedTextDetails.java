/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details for the request to embed texts. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EmbedTextDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EmbedTextDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "inputs",
        "servingMode",
        "compartmentId",
        "isEcho",
        "embeddingTypes",
        "outputDimensions",
        "truncate",
        "inputType"
    })
    public EmbedTextDetails(
            java.util.List<String> inputs,
            ServingMode servingMode,
            String compartmentId,
            Boolean isEcho,
            java.util.List<EmbeddingTypes> embeddingTypes,
            Integer outputDimensions,
            Truncate truncate,
            InputType inputType) {
        super();
        this.inputs = inputs;
        this.servingMode = servingMode;
        this.compartmentId = compartmentId;
        this.isEcho = isEcho;
        this.embeddingTypes = embeddingTypes;
        this.outputDimensions = outputDimensions;
        this.truncate = truncate;
        this.inputType = inputType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Provide a list of strings or one base64 encoded image with {@code input_type} setting to
         * {@code IMAGE}. If text embedding, each string can be words, a phrase, or a paragraph. The
         * maximum length of each string entry in the list is 512 tokens.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inputs")
        private java.util.List<String> inputs;

        /**
         * Provide a list of strings or one base64 encoded image with {@code input_type} setting to
         * {@code IMAGE}. If text embedding, each string can be words, a phrase, or a paragraph. The
         * maximum length of each string entry in the list is 512 tokens.
         *
         * @param inputs the value to set
         * @return this builder
         */
        public Builder inputs(java.util.List<String> inputs) {
            this.inputs = inputs;
            this.__explicitlySet__.add("inputs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("servingMode")
        private ServingMode servingMode;

        public Builder servingMode(ServingMode servingMode) {
            this.servingMode = servingMode;
            this.__explicitlySet__.add("servingMode");
            return this;
        }
        /**
         * The OCID of compartment in which to call the Generative AI service to create text
         * embeddings.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of compartment in which to call the Generative AI service to create text
         * embeddings.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Whether or not to include the original inputs in the response. Results are index-based.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
        private Boolean isEcho;

        /**
         * Whether or not to include the original inputs in the response. Results are index-based.
         *
         * @param isEcho the value to set
         * @return this builder
         */
        public Builder isEcho(Boolean isEcho) {
            this.isEcho = isEcho;
            this.__explicitlySet__.add("isEcho");
            return this;
        }
        /**
         * Specifies the types of embeddings you want to get back. Supports list of enums. Supported
         * values :float, int8, uint8, binary, ubinary, base64. If nothing is passed default will be
         * considered as float.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("embeddingTypes")
        private java.util.List<EmbeddingTypes> embeddingTypes;

        /**
         * Specifies the types of embeddings you want to get back. Supports list of enums. Supported
         * values :float, int8, uint8, binary, ubinary, base64. If nothing is passed default will be
         * considered as float.
         *
         * @param embeddingTypes the value to set
         * @return this builder
         */
        public Builder embeddingTypes(java.util.List<EmbeddingTypes> embeddingTypes) {
            this.embeddingTypes = embeddingTypes;
            this.__explicitlySet__.add("embeddingTypes");
            return this;
        }
        /**
         * The number of dimensions of the output embedding. This is only available for embed-v4 and
         * newer models. Possible values are 256, 512, 1024, and 1536.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("outputDimensions")
        private Integer outputDimensions;

        /**
         * The number of dimensions of the output embedding. This is only available for embed-v4 and
         * newer models. Possible values are 256, 512, 1024, and 1536.
         *
         * @param outputDimensions the value to set
         * @return this builder
         */
        public Builder outputDimensions(Integer outputDimensions) {
            this.outputDimensions = outputDimensions;
            this.__explicitlySet__.add("outputDimensions");
            return this;
        }
        /**
         * For an input that's longer than the maximum token length, specifies which part of the
         * input text will be truncated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("truncate")
        private Truncate truncate;

        /**
         * For an input that's longer than the maximum token length, specifies which part of the
         * input text will be truncated.
         *
         * @param truncate the value to set
         * @return this builder
         */
        public Builder truncate(Truncate truncate) {
            this.truncate = truncate;
            this.__explicitlySet__.add("truncate");
            return this;
        }
        /** Specifies the input type. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputType")
        private InputType inputType;

        /**
         * Specifies the input type.
         *
         * @param inputType the value to set
         * @return this builder
         */
        public Builder inputType(InputType inputType) {
            this.inputType = inputType;
            this.__explicitlySet__.add("inputType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmbedTextDetails build() {
            EmbedTextDetails model =
                    new EmbedTextDetails(
                            this.inputs,
                            this.servingMode,
                            this.compartmentId,
                            this.isEcho,
                            this.embeddingTypes,
                            this.outputDimensions,
                            this.truncate,
                            this.inputType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmbedTextDetails model) {
            if (model.wasPropertyExplicitlySet("inputs")) {
                this.inputs(model.getInputs());
            }
            if (model.wasPropertyExplicitlySet("servingMode")) {
                this.servingMode(model.getServingMode());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isEcho")) {
                this.isEcho(model.getIsEcho());
            }
            if (model.wasPropertyExplicitlySet("embeddingTypes")) {
                this.embeddingTypes(model.getEmbeddingTypes());
            }
            if (model.wasPropertyExplicitlySet("outputDimensions")) {
                this.outputDimensions(model.getOutputDimensions());
            }
            if (model.wasPropertyExplicitlySet("truncate")) {
                this.truncate(model.getTruncate());
            }
            if (model.wasPropertyExplicitlySet("inputType")) {
                this.inputType(model.getInputType());
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
     * Provide a list of strings or one base64 encoded image with {@code input_type} setting to
     * {@code IMAGE}. If text embedding, each string can be words, a phrase, or a paragraph. The
     * maximum length of each string entry in the list is 512 tokens.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inputs")
    private final java.util.List<String> inputs;

    /**
     * Provide a list of strings or one base64 encoded image with {@code input_type} setting to
     * {@code IMAGE}. If text embedding, each string can be words, a phrase, or a paragraph. The
     * maximum length of each string entry in the list is 512 tokens.
     *
     * @return the value
     */
    public java.util.List<String> getInputs() {
        return inputs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("servingMode")
    private final ServingMode servingMode;

    public ServingMode getServingMode() {
        return servingMode;
    }

    /**
     * The OCID of compartment in which to call the Generative AI service to create text embeddings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of compartment in which to call the Generative AI service to create text embeddings.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Whether or not to include the original inputs in the response. Results are index-based. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
    private final Boolean isEcho;

    /**
     * Whether or not to include the original inputs in the response. Results are index-based.
     *
     * @return the value
     */
    public Boolean getIsEcho() {
        return isEcho;
    }

    /** */
    public enum EmbeddingTypes implements com.oracle.bmc.http.internal.BmcEnum {
        Float("float"),
        Int8("int8"),
        Uint8("uint8"),
        Binary("binary"),
        Ubinary("ubinary"),
        Base64("base64"),
        ;

        private final String value;
        private static java.util.Map<String, EmbeddingTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (EmbeddingTypes v : EmbeddingTypes.values()) {
                map.put(v.getValue(), v);
            }
        }

        EmbeddingTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EmbeddingTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid EmbeddingTypes: " + key);
        }
    };
    /**
     * Specifies the types of embeddings you want to get back. Supports list of enums. Supported
     * values :float, int8, uint8, binary, ubinary, base64. If nothing is passed default will be
     * considered as float.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("embeddingTypes")
    private final java.util.List<EmbeddingTypes> embeddingTypes;

    /**
     * Specifies the types of embeddings you want to get back. Supports list of enums. Supported
     * values :float, int8, uint8, binary, ubinary, base64. If nothing is passed default will be
     * considered as float.
     *
     * @return the value
     */
    public java.util.List<EmbeddingTypes> getEmbeddingTypes() {
        return embeddingTypes;
    }

    /**
     * The number of dimensions of the output embedding. This is only available for embed-v4 and
     * newer models. Possible values are 256, 512, 1024, and 1536.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outputDimensions")
    private final Integer outputDimensions;

    /**
     * The number of dimensions of the output embedding. This is only available for embed-v4 and
     * newer models. Possible values are 256, 512, 1024, and 1536.
     *
     * @return the value
     */
    public Integer getOutputDimensions() {
        return outputDimensions;
    }

    /**
     * For an input that's longer than the maximum token length, specifies which part of the input
     * text will be truncated.
     */
    public enum Truncate implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Start("START"),
        End("END"),
        ;

        private final String value;
        private static java.util.Map<String, Truncate> map;

        static {
            map = new java.util.HashMap<>();
            for (Truncate v : Truncate.values()) {
                map.put(v.getValue(), v);
            }
        }

        Truncate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Truncate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Truncate: " + key);
        }
    };
    /**
     * For an input that's longer than the maximum token length, specifies which part of the input
     * text will be truncated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("truncate")
    private final Truncate truncate;

    /**
     * For an input that's longer than the maximum token length, specifies which part of the input
     * text will be truncated.
     *
     * @return the value
     */
    public Truncate getTruncate() {
        return truncate;
    }

    /** Specifies the input type. */
    public enum InputType implements com.oracle.bmc.http.internal.BmcEnum {
        SearchDocument("SEARCH_DOCUMENT"),
        SearchQuery("SEARCH_QUERY"),
        Classification("CLASSIFICATION"),
        Clustering("CLUSTERING"),
        Image("IMAGE"),
        ;

        private final String value;
        private static java.util.Map<String, InputType> map;

        static {
            map = new java.util.HashMap<>();
            for (InputType v : InputType.values()) {
                map.put(v.getValue(), v);
            }
        }

        InputType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InputType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid InputType: " + key);
        }
    };
    /** Specifies the input type. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputType")
    private final InputType inputType;

    /**
     * Specifies the input type.
     *
     * @return the value
     */
    public InputType getInputType() {
        return inputType;
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
        sb.append("EmbedTextDetails(");
        sb.append("super=").append(super.toString());
        sb.append("inputs=").append(String.valueOf(this.inputs));
        sb.append(", servingMode=").append(String.valueOf(this.servingMode));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isEcho=").append(String.valueOf(this.isEcho));
        sb.append(", embeddingTypes=").append(String.valueOf(this.embeddingTypes));
        sb.append(", outputDimensions=").append(String.valueOf(this.outputDimensions));
        sb.append(", truncate=").append(String.valueOf(this.truncate));
        sb.append(", inputType=").append(String.valueOf(this.inputType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmbedTextDetails)) {
            return false;
        }

        EmbedTextDetails other = (EmbedTextDetails) o;
        return java.util.Objects.equals(this.inputs, other.inputs)
                && java.util.Objects.equals(this.servingMode, other.servingMode)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isEcho, other.isEcho)
                && java.util.Objects.equals(this.embeddingTypes, other.embeddingTypes)
                && java.util.Objects.equals(this.outputDimensions, other.outputDimensions)
                && java.util.Objects.equals(this.truncate, other.truncate)
                && java.util.Objects.equals(this.inputType, other.inputType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.inputs == null ? 43 : this.inputs.hashCode());
        result = (result * PRIME) + (this.servingMode == null ? 43 : this.servingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.isEcho == null ? 43 : this.isEcho.hashCode());
        result =
                (result * PRIME)
                        + (this.embeddingTypes == null ? 43 : this.embeddingTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.outputDimensions == null ? 43 : this.outputDimensions.hashCode());
        result = (result * PRIME) + (this.truncate == null ? 43 : this.truncate.hashCode());
        result = (result * PRIME) + (this.inputType == null ? 43 : this.inputType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
