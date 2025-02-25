/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details required for a rerank request.
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
    builder = RerankTextDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RerankTextDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "input",
        "compartmentId",
        "servingMode",
        "documents",
        "topN",
        "isEcho",
        "maxChunksPerDocument"
    })
    public RerankTextDetails(
            String input,
            String compartmentId,
            ServingMode servingMode,
            java.util.List<String> documents,
            Integer topN,
            Boolean isEcho,
            Integer maxChunksPerDocument) {
        super();
        this.input = input;
        this.compartmentId = compartmentId;
        this.servingMode = servingMode;
        this.documents = documents;
        this.topN = topN;
        this.isEcho = isEcho;
        this.maxChunksPerDocument = maxChunksPerDocument;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Input query for search in the documents.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("input")
        private String input;

        /**
         * Input query for search in the documents.
         * @param input the value to set
         * @return this builder
         **/
        public Builder input(String input) {
            this.input = input;
            this.__explicitlySet__.add("input");
            return this;
        }
        /**
         * The OCID of the compartment to call into the Generative AI service LLMs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment to call into the Generative AI service LLMs.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
         * A list of document strings to rerank based on the query asked.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documents")
        private java.util.List<String> documents;

        /**
         * A list of document strings to rerank based on the query asked.
         * @param documents the value to set
         * @return this builder
         **/
        public Builder documents(java.util.List<String> documents) {
            this.documents = documents;
            this.__explicitlySet__.add("documents");
            return this;
        }
        /**
         * The number of most relevant documents or indices to return. Defaults to the length of the documents.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("topN")
        private Integer topN;

        /**
         * The number of most relevant documents or indices to return. Defaults to the length of the documents.
         * @param topN the value to set
         * @return this builder
         **/
        public Builder topN(Integer topN) {
            this.topN = topN;
            this.__explicitlySet__.add("topN");
            return this;
        }
        /**
         * Whether or not to return the documents in the response.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
        private Boolean isEcho;

        /**
         * Whether or not to return the documents in the response.
         * @param isEcho the value to set
         * @return this builder
         **/
        public Builder isEcho(Boolean isEcho) {
            this.isEcho = isEcho;
            this.__explicitlySet__.add("isEcho");
            return this;
        }
        /**
         * The maximum number of chunks to produce internally from a document.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxChunksPerDocument")
        private Integer maxChunksPerDocument;

        /**
         * The maximum number of chunks to produce internally from a document.
         * @param maxChunksPerDocument the value to set
         * @return this builder
         **/
        public Builder maxChunksPerDocument(Integer maxChunksPerDocument) {
            this.maxChunksPerDocument = maxChunksPerDocument;
            this.__explicitlySet__.add("maxChunksPerDocument");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RerankTextDetails build() {
            RerankTextDetails model =
                    new RerankTextDetails(
                            this.input,
                            this.compartmentId,
                            this.servingMode,
                            this.documents,
                            this.topN,
                            this.isEcho,
                            this.maxChunksPerDocument);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RerankTextDetails model) {
            if (model.wasPropertyExplicitlySet("input")) {
                this.input(model.getInput());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("servingMode")) {
                this.servingMode(model.getServingMode());
            }
            if (model.wasPropertyExplicitlySet("documents")) {
                this.documents(model.getDocuments());
            }
            if (model.wasPropertyExplicitlySet("topN")) {
                this.topN(model.getTopN());
            }
            if (model.wasPropertyExplicitlySet("isEcho")) {
                this.isEcho(model.getIsEcho());
            }
            if (model.wasPropertyExplicitlySet("maxChunksPerDocument")) {
                this.maxChunksPerDocument(model.getMaxChunksPerDocument());
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
     * Input query for search in the documents.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    private final String input;

    /**
     * Input query for search in the documents.
     * @return the value
     **/
    public String getInput() {
        return input;
    }

    /**
     * The OCID of the compartment to call into the Generative AI service LLMs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment to call into the Generative AI service LLMs.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("servingMode")
    private final ServingMode servingMode;

    public ServingMode getServingMode() {
        return servingMode;
    }

    /**
     * A list of document strings to rerank based on the query asked.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documents")
    private final java.util.List<String> documents;

    /**
     * A list of document strings to rerank based on the query asked.
     * @return the value
     **/
    public java.util.List<String> getDocuments() {
        return documents;
    }

    /**
     * The number of most relevant documents or indices to return. Defaults to the length of the documents.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("topN")
    private final Integer topN;

    /**
     * The number of most relevant documents or indices to return. Defaults to the length of the documents.
     * @return the value
     **/
    public Integer getTopN() {
        return topN;
    }

    /**
     * Whether or not to return the documents in the response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
    private final Boolean isEcho;

    /**
     * Whether or not to return the documents in the response.
     * @return the value
     **/
    public Boolean getIsEcho() {
        return isEcho;
    }

    /**
     * The maximum number of chunks to produce internally from a document.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxChunksPerDocument")
    private final Integer maxChunksPerDocument;

    /**
     * The maximum number of chunks to produce internally from a document.
     * @return the value
     **/
    public Integer getMaxChunksPerDocument() {
        return maxChunksPerDocument;
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
        sb.append("RerankTextDetails(");
        sb.append("super=").append(super.toString());
        sb.append("input=").append(String.valueOf(this.input));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", servingMode=").append(String.valueOf(this.servingMode));
        sb.append(", documents=").append(String.valueOf(this.documents));
        sb.append(", topN=").append(String.valueOf(this.topN));
        sb.append(", isEcho=").append(String.valueOf(this.isEcho));
        sb.append(", maxChunksPerDocument=").append(String.valueOf(this.maxChunksPerDocument));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RerankTextDetails)) {
            return false;
        }

        RerankTextDetails other = (RerankTextDetails) o;
        return java.util.Objects.equals(this.input, other.input)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.servingMode, other.servingMode)
                && java.util.Objects.equals(this.documents, other.documents)
                && java.util.Objects.equals(this.topN, other.topN)
                && java.util.Objects.equals(this.isEcho, other.isEcho)
                && java.util.Objects.equals(this.maxChunksPerDocument, other.maxChunksPerDocument)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.input == null ? 43 : this.input.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.servingMode == null ? 43 : this.servingMode.hashCode());
        result = (result * PRIME) + (this.documents == null ? 43 : this.documents.hashCode());
        result = (result * PRIME) + (this.topN == null ? 43 : this.topN.hashCode());
        result = (result * PRIME) + (this.isEcho == null ? 43 : this.isEcho.hashCode());
        result =
                (result * PRIME)
                        + (this.maxChunksPerDocument == null
                                ? 43
                                : this.maxChunksPerDocument.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
