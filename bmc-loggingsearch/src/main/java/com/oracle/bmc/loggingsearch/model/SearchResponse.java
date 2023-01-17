/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingsearch.model;

/**
 * Search response object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190909")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SearchResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SearchResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"results", "fields", "summary"})
    public SearchResponse(
            java.util.List<SearchResult> results,
            java.util.List<FieldInfo> fields,
            SearchResultSummary summary) {
        super();
        this.results = results;
        this.fields = fields;
        this.summary = summary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of search results */
        @com.fasterxml.jackson.annotation.JsonProperty("results")
        private java.util.List<SearchResult> results;

        /**
         * List of search results
         *
         * @param results the value to set
         * @return this builder
         */
        public Builder results(java.util.List<SearchResult> results) {
            this.results = results;
            this.__explicitlySet__.add("results");
            return this;
        }
        /** List of log field schema information. */
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<FieldInfo> fields;

        /**
         * List of log field schema information.
         *
         * @param fields the value to set
         * @return this builder
         */
        public Builder fields(java.util.List<FieldInfo> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private SearchResultSummary summary;

        public Builder summary(SearchResultSummary summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchResponse build() {
            SearchResponse model = new SearchResponse(this.results, this.fields, this.summary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResponse model) {
            if (model.wasPropertyExplicitlySet("results")) {
                this.results(model.getResults());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
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

    /** List of search results */
    @com.fasterxml.jackson.annotation.JsonProperty("results")
    private final java.util.List<SearchResult> results;

    /**
     * List of search results
     *
     * @return the value
     */
    public java.util.List<SearchResult> getResults() {
        return results;
    }

    /** List of log field schema information. */
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<FieldInfo> fields;

    /**
     * List of log field schema information.
     *
     * @return the value
     */
    public java.util.List<FieldInfo> getFields() {
        return fields;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final SearchResultSummary summary;

    public SearchResultSummary getSummary() {
        return summary;
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
        sb.append("SearchResponse(");
        sb.append("super=").append(super.toString());
        sb.append("results=").append(String.valueOf(this.results));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResponse)) {
            return false;
        }

        SearchResponse other = (SearchResponse) o;
        return java.util.Objects.equals(this.results, other.results)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.summary, other.summary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.results == null ? 43 : this.results.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
