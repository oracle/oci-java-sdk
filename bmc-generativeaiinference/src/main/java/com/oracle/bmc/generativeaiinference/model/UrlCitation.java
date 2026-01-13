/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Contains metadata for a cited URL included in the assistant\u2019s response. Includes the cited
 * URL and title, and the character range (start and end indices) in the response {@code content}
 * where the citation applies. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UrlCitation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UrlCitation extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"startIndex", "endIndex", "title", "url"})
    public UrlCitation(Integer startIndex, Integer endIndex, String title, String url) {
        super();
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.title = title;
        this.url = url;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Start character index in the response where the citation begins. */
        @com.fasterxml.jackson.annotation.JsonProperty("startIndex")
        private Integer startIndex;

        /**
         * Start character index in the response where the citation begins.
         *
         * @param startIndex the value to set
         * @return this builder
         */
        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            this.__explicitlySet__.add("startIndex");
            return this;
        }
        /** End character index in the response where the citation ends. */
        @com.fasterxml.jackson.annotation.JsonProperty("endIndex")
        private Integer endIndex;

        /**
         * End character index in the response where the citation ends.
         *
         * @param endIndex the value to set
         * @return this builder
         */
        public Builder endIndex(Integer endIndex) {
            this.endIndex = endIndex;
            this.__explicitlySet__.add("endIndex");
            return this;
        }
        /** Title of the cited source. */
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * Title of the cited source.
         *
         * @param title the value to set
         * @return this builder
         */
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /** URL of the cited source. */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * URL of the cited source.
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UrlCitation build() {
            UrlCitation model =
                    new UrlCitation(this.startIndex, this.endIndex, this.title, this.url);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UrlCitation model) {
            if (model.wasPropertyExplicitlySet("startIndex")) {
                this.startIndex(model.getStartIndex());
            }
            if (model.wasPropertyExplicitlySet("endIndex")) {
                this.endIndex(model.getEndIndex());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
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

    /** Start character index in the response where the citation begins. */
    @com.fasterxml.jackson.annotation.JsonProperty("startIndex")
    private final Integer startIndex;

    /**
     * Start character index in the response where the citation begins.
     *
     * @return the value
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /** End character index in the response where the citation ends. */
    @com.fasterxml.jackson.annotation.JsonProperty("endIndex")
    private final Integer endIndex;

    /**
     * End character index in the response where the citation ends.
     *
     * @return the value
     */
    public Integer getEndIndex() {
        return endIndex;
    }

    /** Title of the cited source. */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * Title of the cited source.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /** URL of the cited source. */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * URL of the cited source.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
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
        sb.append("UrlCitation(");
        sb.append("super=").append(super.toString());
        sb.append("startIndex=").append(String.valueOf(this.startIndex));
        sb.append(", endIndex=").append(String.valueOf(this.endIndex));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UrlCitation)) {
            return false;
        }

        UrlCitation other = (UrlCitation) o;
        return java.util.Objects.equals(this.startIndex, other.startIndex)
                && java.util.Objects.equals(this.endIndex, other.endIndex)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.url, other.url)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.startIndex == null ? 43 : this.startIndex.hashCode());
        result = (result * PRIME) + (this.endIndex == null ? 43 : this.endIndex.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
