/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * The list of search result items matching the criteria returned from the search operation. Search
 * errors and messages, if any , will be part of the standard error response. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SearchResultCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SearchResultCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "count",
        "items",
        "query",
        "facetedSearchAggregation",
        "sortableFields"
    })
    public SearchResultCollection(
            Integer count,
            java.util.List<SearchResult> items,
            String query,
            java.util.List<FacetedSearchAggregation> facetedSearchAggregation,
            java.util.List<String> sortableFields) {
        super();
        this.count = count;
        this.items = items;
        this.query = query;
        this.facetedSearchAggregation = facetedSearchAggregation;
        this.sortableFields = sortableFields;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total number of items returned. */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * Total number of items returned.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /** Search result set. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SearchResult> items;

        /**
         * Search result set.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<SearchResult> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /** String that data objects are to be searched with. */
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * String that data objects are to be searched with.
         *
         * @param query the value to set
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /** Aggregations/facets on properties of data objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("facetedSearchAggregation")
        private java.util.List<FacetedSearchAggregation> facetedSearchAggregation;

        /**
         * Aggregations/facets on properties of data objects.
         *
         * @param facetedSearchAggregation the value to set
         * @return this builder
         */
        public Builder facetedSearchAggregation(
                java.util.List<FacetedSearchAggregation> facetedSearchAggregation) {
            this.facetedSearchAggregation = facetedSearchAggregation;
            this.__explicitlySet__.add("facetedSearchAggregation");
            return this;
        }
        /** A list of fields or properties used in the sorting of a search result. */
        @com.fasterxml.jackson.annotation.JsonProperty("sortableFields")
        private java.util.List<String> sortableFields;

        /**
         * A list of fields or properties used in the sorting of a search result.
         *
         * @param sortableFields the value to set
         * @return this builder
         */
        public Builder sortableFields(java.util.List<String> sortableFields) {
            this.sortableFields = sortableFields;
            this.__explicitlySet__.add("sortableFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchResultCollection build() {
            SearchResultCollection model =
                    new SearchResultCollection(
                            this.count,
                            this.items,
                            this.query,
                            this.facetedSearchAggregation,
                            this.sortableFields);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResultCollection model) {
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("facetedSearchAggregation")) {
                this.facetedSearchAggregation(model.getFacetedSearchAggregation());
            }
            if (model.wasPropertyExplicitlySet("sortableFields")) {
                this.sortableFields(model.getSortableFields());
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

    /** Total number of items returned. */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * Total number of items returned.
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
    }

    /** Search result set. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<SearchResult> items;

    /**
     * Search result set.
     *
     * @return the value
     */
    public java.util.List<SearchResult> getItems() {
        return items;
    }

    /** String that data objects are to be searched with. */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * String that data objects are to be searched with.
     *
     * @return the value
     */
    public String getQuery() {
        return query;
    }

    /** Aggregations/facets on properties of data objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("facetedSearchAggregation")
    private final java.util.List<FacetedSearchAggregation> facetedSearchAggregation;

    /**
     * Aggregations/facets on properties of data objects.
     *
     * @return the value
     */
    public java.util.List<FacetedSearchAggregation> getFacetedSearchAggregation() {
        return facetedSearchAggregation;
    }

    /** A list of fields or properties used in the sorting of a search result. */
    @com.fasterxml.jackson.annotation.JsonProperty("sortableFields")
    private final java.util.List<String> sortableFields;

    /**
     * A list of fields or properties used in the sorting of a search result.
     *
     * @return the value
     */
    public java.util.List<String> getSortableFields() {
        return sortableFields;
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
        sb.append("SearchResultCollection(");
        sb.append("super=").append(super.toString());
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", facetedSearchAggregation=")
                .append(String.valueOf(this.facetedSearchAggregation));
        sb.append(", sortableFields=").append(String.valueOf(this.sortableFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResultCollection)) {
            return false;
        }

        SearchResultCollection other = (SearchResultCollection) o;
        return java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(
                        this.facetedSearchAggregation, other.facetedSearchAggregation)
                && java.util.Objects.equals(this.sortableFields, other.sortableFields)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result =
                (result * PRIME)
                        + (this.facetedSearchAggregation == null
                                ? 43
                                : this.facetedSearchAggregation.hashCode());
        result =
                (result * PRIME)
                        + (this.sortableFields == null ? 43 : this.sortableFields.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
