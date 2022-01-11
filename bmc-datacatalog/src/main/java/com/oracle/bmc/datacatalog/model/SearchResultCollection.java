/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * The list of search result items matching the criteria returned from the search operation. Search errors and
 * messages, if any , will be part of the standard error response.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SearchResultCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SearchResultCollection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SearchResult> items;

        public Builder items(java.util.List<SearchResult> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("facetedSearchAggregation")
        private java.util.List<FacetedSearchAggregation> facetedSearchAggregation;

        public Builder facetedSearchAggregation(
                java.util.List<FacetedSearchAggregation> facetedSearchAggregation) {
            this.facetedSearchAggregation = facetedSearchAggregation;
            this.__explicitlySet__.add("facetedSearchAggregation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sortableFields")
        private java.util.List<String> sortableFields;

        public Builder sortableFields(java.util.List<String> sortableFields) {
            this.sortableFields = sortableFields;
            this.__explicitlySet__.add("sortableFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchResultCollection build() {
            SearchResultCollection __instance__ =
                    new SearchResultCollection(
                            count, items, query, facetedSearchAggregation, sortableFields);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchResultCollection o) {
            Builder copiedBuilder =
                    count(o.getCount())
                            .items(o.getItems())
                            .query(o.getQuery())
                            .facetedSearchAggregation(o.getFacetedSearchAggregation())
                            .sortableFields(o.getSortableFields());

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

    /**
     * Total number of items returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    Integer count;

    /**
     * Search result set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<SearchResult> items;

    /**
     * String that data objects are to be searched with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    String query;

    /**
     * Aggregations/facets on properties of data objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("facetedSearchAggregation")
    java.util.List<FacetedSearchAggregation> facetedSearchAggregation;

    /**
     * A list of fields or properties used in the sorting of a search result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortableFields")
    java.util.List<String> sortableFields;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
