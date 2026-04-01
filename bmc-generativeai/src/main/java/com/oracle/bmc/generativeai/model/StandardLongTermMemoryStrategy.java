/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Standard strategy settings for long-term memory.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StandardLongTermMemoryStrategy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StandardLongTermMemoryStrategy
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "extractionConfig", "embeddingConfig"})
    public StandardLongTermMemoryStrategy(
            Boolean isEnabled, ExtractionConfig extractionConfig, EmbeddingConfig embeddingConfig) {
        super();
        this.isEnabled = isEnabled;
        this.extractionConfig = extractionConfig;
        this.embeddingConfig = embeddingConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether long-term memory is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether long-term memory is enabled.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("extractionConfig")
        private ExtractionConfig extractionConfig;

        public Builder extractionConfig(ExtractionConfig extractionConfig) {
            this.extractionConfig = extractionConfig;
            this.__explicitlySet__.add("extractionConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("embeddingConfig")
        private EmbeddingConfig embeddingConfig;

        public Builder embeddingConfig(EmbeddingConfig embeddingConfig) {
            this.embeddingConfig = embeddingConfig;
            this.__explicitlySet__.add("embeddingConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StandardLongTermMemoryStrategy build() {
            StandardLongTermMemoryStrategy model =
                    new StandardLongTermMemoryStrategy(
                            this.isEnabled, this.extractionConfig, this.embeddingConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StandardLongTermMemoryStrategy model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("extractionConfig")) {
                this.extractionConfig(model.getExtractionConfig());
            }
            if (model.wasPropertyExplicitlySet("embeddingConfig")) {
                this.embeddingConfig(model.getEmbeddingConfig());
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
     * Indicates whether long-term memory is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether long-term memory is enabled.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("extractionConfig")
    private final ExtractionConfig extractionConfig;

    public ExtractionConfig getExtractionConfig() {
        return extractionConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("embeddingConfig")
    private final EmbeddingConfig embeddingConfig;

    public EmbeddingConfig getEmbeddingConfig() {
        return embeddingConfig;
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
        sb.append("StandardLongTermMemoryStrategy(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", extractionConfig=").append(String.valueOf(this.extractionConfig));
        sb.append(", embeddingConfig=").append(String.valueOf(this.embeddingConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StandardLongTermMemoryStrategy)) {
            return false;
        }

        StandardLongTermMemoryStrategy other = (StandardLongTermMemoryStrategy) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.extractionConfig, other.extractionConfig)
                && java.util.Objects.equals(this.embeddingConfig, other.embeddingConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.extractionConfig == null ? 43 : this.extractionConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.embeddingConfig == null ? 43 : this.embeddingConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
