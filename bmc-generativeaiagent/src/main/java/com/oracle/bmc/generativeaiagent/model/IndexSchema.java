/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The index schema details.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IndexSchema.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IndexSchema extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bodyKey", "urlKey", "titleKey", "embeddingBodyKey"})
    public IndexSchema(String bodyKey, String urlKey, String titleKey, String embeddingBodyKey) {
        super();
        this.bodyKey = bodyKey;
        this.urlKey = urlKey;
        this.titleKey = titleKey;
        this.embeddingBodyKey = embeddingBodyKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Body key name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bodyKey")
        private String bodyKey;

        /**
         * Body key name.
         * @param bodyKey the value to set
         * @return this builder
         **/
        public Builder bodyKey(String bodyKey) {
            this.bodyKey = bodyKey;
            this.__explicitlySet__.add("bodyKey");
            return this;
        }
        /**
         * URL key that stores the URL of a document, if available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("urlKey")
        private String urlKey;

        /**
         * URL key that stores the URL of a document, if available.
         * @param urlKey the value to set
         * @return this builder
         **/
        public Builder urlKey(String urlKey) {
            this.urlKey = urlKey;
            this.__explicitlySet__.add("urlKey");
            return this;
        }
        /**
         * Title key that stores the Title of a document, if available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("titleKey")
        private String titleKey;

        /**
         * Title key that stores the Title of a document, if available.
         * @param titleKey the value to set
         * @return this builder
         **/
        public Builder titleKey(String titleKey) {
            this.titleKey = titleKey;
            this.__explicitlySet__.add("titleKey");
            return this;
        }
        /**
         * Field within customer managed OCI OpenSearch document containing the vector embedding for queries.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("embeddingBodyKey")
        private String embeddingBodyKey;

        /**
         * Field within customer managed OCI OpenSearch document containing the vector embedding for queries.
         * @param embeddingBodyKey the value to set
         * @return this builder
         **/
        public Builder embeddingBodyKey(String embeddingBodyKey) {
            this.embeddingBodyKey = embeddingBodyKey;
            this.__explicitlySet__.add("embeddingBodyKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IndexSchema build() {
            IndexSchema model =
                    new IndexSchema(
                            this.bodyKey, this.urlKey, this.titleKey, this.embeddingBodyKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IndexSchema model) {
            if (model.wasPropertyExplicitlySet("bodyKey")) {
                this.bodyKey(model.getBodyKey());
            }
            if (model.wasPropertyExplicitlySet("urlKey")) {
                this.urlKey(model.getUrlKey());
            }
            if (model.wasPropertyExplicitlySet("titleKey")) {
                this.titleKey(model.getTitleKey());
            }
            if (model.wasPropertyExplicitlySet("embeddingBodyKey")) {
                this.embeddingBodyKey(model.getEmbeddingBodyKey());
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
     * Body key name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bodyKey")
    private final String bodyKey;

    /**
     * Body key name.
     * @return the value
     **/
    public String getBodyKey() {
        return bodyKey;
    }

    /**
     * URL key that stores the URL of a document, if available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("urlKey")
    private final String urlKey;

    /**
     * URL key that stores the URL of a document, if available.
     * @return the value
     **/
    public String getUrlKey() {
        return urlKey;
    }

    /**
     * Title key that stores the Title of a document, if available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("titleKey")
    private final String titleKey;

    /**
     * Title key that stores the Title of a document, if available.
     * @return the value
     **/
    public String getTitleKey() {
        return titleKey;
    }

    /**
     * Field within customer managed OCI OpenSearch document containing the vector embedding for queries.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("embeddingBodyKey")
    private final String embeddingBodyKey;

    /**
     * Field within customer managed OCI OpenSearch document containing the vector embedding for queries.
     * @return the value
     **/
    public String getEmbeddingBodyKey() {
        return embeddingBodyKey;
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
        sb.append("IndexSchema(");
        sb.append("super=").append(super.toString());
        sb.append("bodyKey=").append(String.valueOf(this.bodyKey));
        sb.append(", urlKey=").append(String.valueOf(this.urlKey));
        sb.append(", titleKey=").append(String.valueOf(this.titleKey));
        sb.append(", embeddingBodyKey=").append(String.valueOf(this.embeddingBodyKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IndexSchema)) {
            return false;
        }

        IndexSchema other = (IndexSchema) o;
        return java.util.Objects.equals(this.bodyKey, other.bodyKey)
                && java.util.Objects.equals(this.urlKey, other.urlKey)
                && java.util.Objects.equals(this.titleKey, other.titleKey)
                && java.util.Objects.equals(this.embeddingBodyKey, other.embeddingBodyKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bodyKey == null ? 43 : this.bodyKey.hashCode());
        result = (result * PRIME) + (this.urlKey == null ? 43 : this.urlKey.hashCode());
        result = (result * PRIME) + (this.titleKey == null ? 43 : this.titleKey.hashCode());
        result =
                (result * PRIME)
                        + (this.embeddingBodyKey == null ? 43 : this.embeddingBodyKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
