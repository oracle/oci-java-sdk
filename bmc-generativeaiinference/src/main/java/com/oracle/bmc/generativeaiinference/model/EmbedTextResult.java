/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The generated embedded result to return.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EmbedTextResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EmbedTextResult extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "inputs", "embeddings", "modelId", "modelVersion"})
    public EmbedTextResult(
            String id,
            java.util.List<String> inputs,
            java.util.List<java.util.List<Float>> embeddings,
            String modelId,
            String modelVersion) {
        super();
        this.id = id;
        this.inputs = inputs;
        this.embeddings = embeddings;
        this.modelId = modelId;
        this.modelVersion = modelVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique identifier for the generated result.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier for the generated result.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The original inputs. Only present if "isEcho" is set to true.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inputs")
        private java.util.List<String> inputs;

        /**
         * The original inputs. Only present if "isEcho" is set to true.
         * @param inputs the value to set
         * @return this builder
         **/
        public Builder inputs(java.util.List<String> inputs) {
            this.inputs = inputs;
            this.__explicitlySet__.add("inputs");
            return this;
        }
        /**
         * The embeddings corresponding to inputs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("embeddings")
        private java.util.List<java.util.List<Float>> embeddings;

        /**
         * The embeddings corresponding to inputs.
         * @param embeddings the value to set
         * @return this builder
         **/
        public Builder embeddings(java.util.List<java.util.List<Float>> embeddings) {
            this.embeddings = embeddings;
            this.__explicitlySet__.add("embeddings");
            return this;
        }
        /**
         * The OCID of the model used in this inference request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * The OCID of the model used in this inference request.
         * @param modelId the value to set
         * @return this builder
         **/
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /**
         * The version of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The version of the model.
         * @param modelVersion the value to set
         * @return this builder
         **/
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmbedTextResult build() {
            EmbedTextResult model =
                    new EmbedTextResult(
                            this.id, this.inputs, this.embeddings, this.modelId, this.modelVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmbedTextResult model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("inputs")) {
                this.inputs(model.getInputs());
            }
            if (model.wasPropertyExplicitlySet("embeddings")) {
                this.embeddings(model.getEmbeddings());
            }
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
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
     * A unique identifier for the generated result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier for the generated result.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The original inputs. Only present if "isEcho" is set to true.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputs")
    private final java.util.List<String> inputs;

    /**
     * The original inputs. Only present if "isEcho" is set to true.
     * @return the value
     **/
    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * The embeddings corresponding to inputs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("embeddings")
    private final java.util.List<java.util.List<Float>> embeddings;

    /**
     * The embeddings corresponding to inputs.
     * @return the value
     **/
    public java.util.List<java.util.List<Float>> getEmbeddings() {
        return embeddings;
    }

    /**
     * The OCID of the model used in this inference request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * The OCID of the model used in this inference request.
     * @return the value
     **/
    public String getModelId() {
        return modelId;
    }

    /**
     * The version of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The version of the model.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
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
        sb.append("EmbedTextResult(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", inputs=").append(String.valueOf(this.inputs));
        sb.append(", embeddings=").append(String.valueOf(this.embeddings));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmbedTextResult)) {
            return false;
        }

        EmbedTextResult other = (EmbedTextResult) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.inputs, other.inputs)
                && java.util.Objects.equals(this.embeddings, other.embeddings)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.inputs == null ? 43 : this.inputs.hashCode());
        result = (result * PRIME) + (this.embeddings == null ? 43 : this.embeddings.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
