/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * A link to a documentation resource on the internet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DocumentationLink.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DocumentationLink {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "url", "documentCategory"})
    public DocumentationLink(String name, String url, String documentCategory) {
        super();
        this.name = name;
        this.url = url;
        this.documentCategory = documentCategory;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Text that describes the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Text that describes the resource.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The URL of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The URL of the resource.
         * @param url the value to set
         * @return this builder
         **/
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /**
         * The category that the document belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documentCategory")
        private String documentCategory;

        /**
         * The category that the document belongs to.
         * @param documentCategory the value to set
         * @return this builder
         **/
        public Builder documentCategory(String documentCategory) {
            this.documentCategory = documentCategory;
            this.__explicitlySet__.add("documentCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentationLink build() {
            DocumentationLink __instance__ = new DocumentationLink(name, url, documentCategory);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DocumentationLink o) {
            Builder copiedBuilder =
                    name(o.getName()).url(o.getUrl()).documentCategory(o.getDocumentCategory());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Text that describes the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Text that describes the resource.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The URL of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The URL of the resource.
     * @return the value
     **/
    public String getUrl() {
        return url;
    }

    /**
     * The category that the document belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentCategory")
    private final String documentCategory;

    /**
     * The category that the document belongs to.
     * @return the value
     **/
    public String getDocumentCategory() {
        return documentCategory;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentationLink(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", documentCategory=").append(String.valueOf(this.documentCategory));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DocumentationLink)) {
            return false;
        }

        DocumentationLink other = (DocumentationLink) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.documentCategory, other.documentCategory)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result =
                (result * PRIME)
                        + (this.documentCategory == null ? 43 : this.documentCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
