/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Base model configuration shared across GenAI Project memory. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelConfigType",
        defaultImpl = ModelConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CondenserConfig.class,
            name = "CONDENSER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExtractionConfig.class,
            name = "EXTRACTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = EmbeddingConfig.class,
            name = "EMBEDDING")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ModelConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"llmSelection"})
    protected ModelConfig(LlmSelection llmSelection) {
        super();
        this.llmSelection = llmSelection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("llmSelection")
    private final LlmSelection llmSelection;

    public LlmSelection getLlmSelection() {
        return llmSelection;
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
        sb.append("ModelConfig(");
        sb.append("super=").append(super.toString());
        sb.append("llmSelection=").append(String.valueOf(this.llmSelection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelConfig)) {
            return false;
        }

        ModelConfig other = (ModelConfig) o;
        return java.util.Objects.equals(this.llmSelection, other.llmSelection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.llmSelection == null ? 43 : this.llmSelection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The stage-specific config type. */
    public enum ModelConfigType implements com.oracle.bmc.http.internal.BmcEnum {
        Extraction("EXTRACTION"),
        Embedding("EMBEDDING"),
        Condenser("CONDENSER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelConfigType.class);

        private final String value;
        private static java.util.Map<String, ModelConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelConfigType v : ModelConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
