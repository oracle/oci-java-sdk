/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration for RAG Tool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RagToolConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "toolConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RagToolConfig extends ToolConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The KnowledgeBase configurations that this RAG Tool uses */
        @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseConfigs")
        private java.util.List<KnowledgeBaseConfig> knowledgeBaseConfigs;

        /**
         * The KnowledgeBase configurations that this RAG Tool uses
         *
         * @param knowledgeBaseConfigs the value to set
         * @return this builder
         */
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
        /** The runtimeVersion of the system prompt. */
        @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
        private String runtimeVersion;

        /**
         * The runtimeVersion of the system prompt.
         *
         * @param runtimeVersion the value to set
         * @return this builder
         */
        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            this.__explicitlySet__.add("runtimeVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("embeddingLlmCustomization")
        private LlmCustomization embeddingLlmCustomization;

        public Builder embeddingLlmCustomization(LlmCustomization embeddingLlmCustomization) {
            this.embeddingLlmCustomization = embeddingLlmCustomization;
            this.__explicitlySet__.add("embeddingLlmCustomization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rerankingLlmCustomization")
        private LlmCustomization rerankingLlmCustomization;

        public Builder rerankingLlmCustomization(LlmCustomization rerankingLlmCustomization) {
            this.rerankingLlmCustomization = rerankingLlmCustomization;
            this.__explicitlySet__.add("rerankingLlmCustomization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reasoningLlmCustomization")
        private LlmCustomization reasoningLlmCustomization;

        public Builder reasoningLlmCustomization(LlmCustomization reasoningLlmCustomization) {
            this.reasoningLlmCustomization = reasoningLlmCustomization;
            this.__explicitlySet__.add("reasoningLlmCustomization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RagToolConfig build() {
            RagToolConfig model =
                    new RagToolConfig(
                            this.knowledgeBaseConfigs,
                            this.generationLlmCustomization,
                            this.runtimeVersion,
                            this.embeddingLlmCustomization,
                            this.rerankingLlmCustomization,
                            this.reasoningLlmCustomization);
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
            if (model.wasPropertyExplicitlySet("runtimeVersion")) {
                this.runtimeVersion(model.getRuntimeVersion());
            }
            if (model.wasPropertyExplicitlySet("embeddingLlmCustomization")) {
                this.embeddingLlmCustomization(model.getEmbeddingLlmCustomization());
            }
            if (model.wasPropertyExplicitlySet("rerankingLlmCustomization")) {
                this.rerankingLlmCustomization(model.getRerankingLlmCustomization());
            }
            if (model.wasPropertyExplicitlySet("reasoningLlmCustomization")) {
                this.reasoningLlmCustomization(model.getReasoningLlmCustomization());
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
    public RagToolConfig(
            java.util.List<KnowledgeBaseConfig> knowledgeBaseConfigs,
            LlmCustomization generationLlmCustomization,
            String runtimeVersion,
            LlmCustomization embeddingLlmCustomization,
            LlmCustomization rerankingLlmCustomization,
            LlmCustomization reasoningLlmCustomization) {
        super();
        this.knowledgeBaseConfigs = knowledgeBaseConfigs;
        this.generationLlmCustomization = generationLlmCustomization;
        this.runtimeVersion = runtimeVersion;
        this.embeddingLlmCustomization = embeddingLlmCustomization;
        this.rerankingLlmCustomization = rerankingLlmCustomization;
        this.reasoningLlmCustomization = reasoningLlmCustomization;
    }

    /** The KnowledgeBase configurations that this RAG Tool uses */
    @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseConfigs")
    private final java.util.List<KnowledgeBaseConfig> knowledgeBaseConfigs;

    /**
     * The KnowledgeBase configurations that this RAG Tool uses
     *
     * @return the value
     */
    public java.util.List<KnowledgeBaseConfig> getKnowledgeBaseConfigs() {
        return knowledgeBaseConfigs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("generationLlmCustomization")
    private final LlmCustomization generationLlmCustomization;

    public LlmCustomization getGenerationLlmCustomization() {
        return generationLlmCustomization;
    }

    /** The runtimeVersion of the system prompt. */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeVersion")
    private final String runtimeVersion;

    /**
     * The runtimeVersion of the system prompt.
     *
     * @return the value
     */
    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("embeddingLlmCustomization")
    private final LlmCustomization embeddingLlmCustomization;

    public LlmCustomization getEmbeddingLlmCustomization() {
        return embeddingLlmCustomization;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rerankingLlmCustomization")
    private final LlmCustomization rerankingLlmCustomization;

    public LlmCustomization getRerankingLlmCustomization() {
        return rerankingLlmCustomization;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reasoningLlmCustomization")
    private final LlmCustomization reasoningLlmCustomization;

    public LlmCustomization getReasoningLlmCustomization() {
        return reasoningLlmCustomization;
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
        sb.append("RagToolConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", knowledgeBaseConfigs=").append(String.valueOf(this.knowledgeBaseConfigs));
        sb.append(", generationLlmCustomization=")
                .append(String.valueOf(this.generationLlmCustomization));
        sb.append(", runtimeVersion=").append(String.valueOf(this.runtimeVersion));
        sb.append(", embeddingLlmCustomization=")
                .append(String.valueOf(this.embeddingLlmCustomization));
        sb.append(", rerankingLlmCustomization=")
                .append(String.valueOf(this.rerankingLlmCustomization));
        sb.append(", reasoningLlmCustomization=")
                .append(String.valueOf(this.reasoningLlmCustomization));
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
                && java.util.Objects.equals(this.runtimeVersion, other.runtimeVersion)
                && java.util.Objects.equals(
                        this.embeddingLlmCustomization, other.embeddingLlmCustomization)
                && java.util.Objects.equals(
                        this.rerankingLlmCustomization, other.rerankingLlmCustomization)
                && java.util.Objects.equals(
                        this.reasoningLlmCustomization, other.reasoningLlmCustomization)
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
        result =
                (result * PRIME)
                        + (this.runtimeVersion == null ? 43 : this.runtimeVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.embeddingLlmCustomization == null
                                ? 43
                                : this.embeddingLlmCustomization.hashCode());
        result =
                (result * PRIME)
                        + (this.rerankingLlmCustomization == null
                                ? 43
                                : this.rerankingLlmCustomization.hashCode());
        result =
                (result * PRIME)
                        + (this.reasoningLlmCustomization == null
                                ? 43
                                : this.reasoningLlmCustomization.hashCode());
        return result;
    }
}
