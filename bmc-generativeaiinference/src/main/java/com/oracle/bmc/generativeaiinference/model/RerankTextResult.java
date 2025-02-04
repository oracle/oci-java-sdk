/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The rerank response to return to the caller. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RerankTextResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RerankTextResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "modelId", "modelVersion", "documentRanks"})
    public RerankTextResult(
            String id,
            String modelId,
            String modelVersion,
            java.util.List<DocumentRank> documentRanks) {
        super();
        this.id = id;
        this.modelId = modelId;
        this.modelVersion = modelVersion;
        this.documentRanks = documentRanks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A unique identifier for this {@code RerankResult}. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier for this {@code RerankResult}.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the model used in the rerank request. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * The OCID of the model used in the rerank request.
         *
         * @param modelId the value to set
         * @return this builder
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }
        /** The version of the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The version of the model.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }
        /** Top n documents with their index and relevance score. */
        @com.fasterxml.jackson.annotation.JsonProperty("documentRanks")
        private java.util.List<DocumentRank> documentRanks;

        /**
         * Top n documents with their index and relevance score.
         *
         * @param documentRanks the value to set
         * @return this builder
         */
        public Builder documentRanks(java.util.List<DocumentRank> documentRanks) {
            this.documentRanks = documentRanks;
            this.__explicitlySet__.add("documentRanks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RerankTextResult build() {
            RerankTextResult model =
                    new RerankTextResult(
                            this.id, this.modelId, this.modelVersion, this.documentRanks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RerankTextResult model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("documentRanks")) {
                this.documentRanks(model.getDocumentRanks());
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

    /** A unique identifier for this {@code RerankResult}. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier for this {@code RerankResult}.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the model used in the rerank request. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * The OCID of the model used in the rerank request.
     *
     * @return the value
     */
    public String getModelId() {
        return modelId;
    }

    /** The version of the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The version of the model.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /** Top n documents with their index and relevance score. */
    @com.fasterxml.jackson.annotation.JsonProperty("documentRanks")
    private final java.util.List<DocumentRank> documentRanks;

    /**
     * Top n documents with their index and relevance score.
     *
     * @return the value
     */
    public java.util.List<DocumentRank> getDocumentRanks() {
        return documentRanks;
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
        sb.append("RerankTextResult(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", documentRanks=").append(String.valueOf(this.documentRanks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RerankTextResult)) {
            return false;
        }

        RerankTextResult other = (RerankTextResult) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.documentRanks, other.documentRanks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.documentRanks == null ? 43 : this.documentRanks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
