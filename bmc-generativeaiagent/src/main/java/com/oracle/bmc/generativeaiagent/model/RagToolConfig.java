/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration for RAG Tool.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RagToolConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "toolConfigType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RagToolConfig extends ToolConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The KnowledgeBase configurations that this RAG Tool uses
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseConfigs")
        private java.util.List<KnowledgeBaseConfig> knowledgeBaseConfigs;

        /**
         * The KnowledgeBase configurations that this RAG Tool uses
         * @param knowledgeBaseConfigs the value to set
         * @return this builder
         **/
        public Builder knowledgeBaseConfigs(
                java.util.List<KnowledgeBaseConfig> knowledgeBaseConfigs) {
            this.knowledgeBaseConfigs = knowledgeBaseConfigs;
            this.__explicitlySet__.add("knowledgeBaseConfigs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("generationLlmCustomization")
        private LlmCustomization generationLlmCustomization;

        public Builder generationLlmCustomization(LlmCustomization generationLlmCustomization) {
            this.generationLlmCustomization = generationLlmCustomization;
            this.__explicitlySet__.add("generationLlmCustomization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RagToolConfig build() {
            RagToolConfig model =
                    new RagToolConfig(this.knowledgeBaseConfigs, this.generationLlmCustomization);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RagToolConfig model) {
            if (model.wasPropertyExplicitlySet("knowledgeBaseConfigs")) {
                this.knowledgeBaseConfigs(model.getKnowledgeBaseConfigs());
            }
            if (model.wasPropertyExplicitlySet("generationLlmCustomization")) {
                this.generationLlmCustomization(model.getGenerationLlmCustomization());
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
    public RagToolConfig(
            java.util.List<KnowledgeBaseConfig> knowledgeBaseConfigs,
            LlmCustomization generationLlmCustomization) {
        super();
        this.knowledgeBaseConfigs = knowledgeBaseConfigs;
        this.generationLlmCustomization = generationLlmCustomization;
    }

    /**
     * The KnowledgeBase configurations that this RAG Tool uses
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseConfigs")
    private final java.util.List<KnowledgeBaseConfig> knowledgeBaseConfigs;

    /**
     * The KnowledgeBase configurations that this RAG Tool uses
     * @return the value
     **/
    public java.util.List<KnowledgeBaseConfig> getKnowledgeBaseConfigs() {
        return knowledgeBaseConfigs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("generationLlmCustomization")
    private final LlmCustomization generationLlmCustomization;

    public LlmCustomization getGenerationLlmCustomization() {
        return generationLlmCustomization;
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
        sb.append("RagToolConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", knowledgeBaseConfigs=").append(String.valueOf(this.knowledgeBaseConfigs));
        sb.append(", generationLlmCustomization=")
                .append(String.valueOf(this.generationLlmCustomization));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RagToolConfig)) {
            return false;
        }

        RagToolConfig other = (RagToolConfig) o;
        return java.util.Objects.equals(this.knowledgeBaseConfigs, other.knowledgeBaseConfigs)
                && java.util.Objects.equals(
                        this.generationLlmCustomization, other.generationLlmCustomization)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.knowledgeBaseConfigs == null
                                ? 43
                                : this.knowledgeBaseConfigs.hashCode());
        result =
                (result * PRIME)
                        + (this.generationLlmCustomization == null
                                ? 43
                                : this.generationLlmCustomization.hashCode());
        return result;
    }
}
