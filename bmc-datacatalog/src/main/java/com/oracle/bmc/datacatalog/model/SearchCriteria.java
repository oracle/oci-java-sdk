/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Search Query object that allows complex search predicates that cannot be expressed through simple query params.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SearchCriteria.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SearchCriteria {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("facetedQuery")
        private String facetedQuery;

        public Builder facetedQuery(String facetedQuery) {
            this.facetedQuery = facetedQuery;
            this.__explicitlySet__.add("facetedQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<String> dimensions;

        public Builder dimensions(java.util.List<String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sort")
        private java.util.List<FacetedSearchSortRequest> sort;

        public Builder sort(java.util.List<FacetedSearchSortRequest> sort) {
            this.sort = sort;
            this.__explicitlySet__.add("sort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private FacetedSearchFilterRequest filters;

        public Builder filters(FacetedSearchFilterRequest filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchCriteria build() {
            SearchCriteria __instance__ =
                    new SearchCriteria(query, facetedQuery, dimensions, sort, filters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchCriteria o) {
            Builder copiedBuilder =
                    query(o.getQuery())
                            .facetedQuery(o.getFacetedQuery())
                            .dimensions(o.getDimensions())
                            .sort(o.getSort())
                            .filters(o.getFilters());

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
     * Search query dsl that defines the query components including fields and predicates.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    String query;

    /**
     * Query string that a dataObject is to be searched with. Used in the faceted query request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("facetedQuery")
    String facetedQuery;

    /**
     * List of properties of dataObjects that needs to aggregated on for facets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    java.util.List<String> dimensions;

    /**
     * Array of objects having details about sort field and order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sort")
    java.util.List<FacetedSearchSortRequest> sort;

    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    FacetedSearchFilterRequest filters;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
