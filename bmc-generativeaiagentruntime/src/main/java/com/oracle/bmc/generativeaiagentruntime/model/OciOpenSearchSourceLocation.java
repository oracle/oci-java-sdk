/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The location of the OCI Search with OpenSearch that the agent will use.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OciOpenSearchSourceLocation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceLocationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OciOpenSearchSourceLocation extends SourceLocation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the OCI OpenSearch cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the OCI OpenSearch cluster.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the index in OpenSearch that contains the source text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("indexName")
        private String indexName;

        /**
         * The name of the index in OpenSearch that contains the source text.
         * @param indexName the value to set
         * @return this builder
         **/
        public Builder indexName(String indexName) {
            this.indexName = indexName;
            this.__explicitlySet__.add("indexName");
            return this;
        }
        /**
         * The URL of the retrieved document, if available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The URL of the retrieved document, if available.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciOpenSearchSourceLocation build() {
            OciOpenSearchSourceLocation model =
                    new OciOpenSearchSourceLocation(this.id, this.indexName, this.url);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciOpenSearchSourceLocation model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("indexName")) {
                this.indexName(model.getIndexName());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
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
    public OciOpenSearchSourceLocation(String id, String indexName, String url) {
        super();
        this.id = id;
        this.indexName = indexName;
        this.url = url;
    }

    /**
     * The OCID of the OCI OpenSearch cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the OCI OpenSearch cluster.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the index in OpenSearch that contains the source text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexName")
    private final String indexName;

    /**
     * The name of the index in OpenSearch that contains the source text.
     * @return the value
     **/
    public String getIndexName() {
        return indexName;
    }

    /**
     * The URL of the retrieved document, if available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The URL of the retrieved document, if available.
     * @return the value
     **/
    public String getUrl() {
        return url;
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
        sb.append("OciOpenSearchSourceLocation(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", indexName=").append(String.valueOf(this.indexName));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciOpenSearchSourceLocation)) {
            return false;
        }

        OciOpenSearchSourceLocation other = (OciOpenSearchSourceLocation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.indexName, other.indexName)
                && java.util.Objects.equals(this.url, other.url)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.indexName == null ? 43 : this.indexName.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        return result;
    }
}
