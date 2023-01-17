/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SearchCriteria.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SearchCriteria extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"query", "facetedQuery", "dimensions", "sort", "filters"})
    public SearchCriteria(
            String query,
            String facetedQuery,
            java.util.List<String> dimensions,
            java.util.List<FacetedSearchSortRequest> sort,
            FacetedSearchFilterRequest filters) {
        super();
        this.query = query;
        this.facetedQuery = facetedQuery;
        this.dimensions = dimensions;
        this.sort = sort;
        this.filters = filters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Search query dsl that defines the query components including fields and predicates.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * Search query dsl that defines the query components including fields and predicates.
         * @param query the value to set
         * @return this builder
         **/
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /**
         * Query string that a dataObject is to be searched with. Used in the faceted query request
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("facetedQuery")
        private String facetedQuery;

        /**
         * Query string that a dataObject is to be searched with. Used in the faceted query request
         * @param facetedQuery the value to set
         * @return this builder
         **/
        public Builder facetedQuery(String facetedQuery) {
            this.facetedQuery = facetedQuery;
            this.__explicitlySet__.add("facetedQuery");
            return this;
        }
        /**
         * List of properties of dataObjects that needs to aggregated on for facets.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private java.util.List<String> dimensions;

        /**
         * List of properties of dataObjects that needs to aggregated on for facets.
         * @param dimensions the value to set
         * @return this builder
         **/
        public Builder dimensions(java.util.List<String> dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * Array of objects having details about sort field and order.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sort")
        private java.util.List<FacetedSearchSortRequest> sort;

        /**
         * Array of objects having details about sort field and order.
         * @param sort the value to set
         * @return this builder
         **/
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
            SearchCriteria model =
                    new SearchCriteria(
                            this.query,
                            this.facetedQuery,
                            this.dimensions,
                            this.sort,
                            this.filters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchCriteria model) {
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("facetedQuery")) {
                this.facetedQuery(model.getFacetedQuery());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("sort")) {
                this.sort(model.getSort());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
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
     * Search query dsl that defines the query components including fields and predicates.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * Search query dsl that defines the query components including fields and predicates.
     * @return the value
     **/
    public String getQuery() {
        return query;
    }

    /**
     * Query string that a dataObject is to be searched with. Used in the faceted query request
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("facetedQuery")
    private final String facetedQuery;

    /**
     * Query string that a dataObject is to be searched with. Used in the faceted query request
     * @return the value
     **/
    public String getFacetedQuery() {
        return facetedQuery;
    }

    /**
     * List of properties of dataObjects that needs to aggregated on for facets.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final java.util.List<String> dimensions;

    /**
     * List of properties of dataObjects that needs to aggregated on for facets.
     * @return the value
     **/
    public java.util.List<String> getDimensions() {
        return dimensions;
    }

    /**
     * Array of objects having details about sort field and order.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sort")
    private final java.util.List<FacetedSearchSortRequest> sort;

    /**
     * Array of objects having details about sort field and order.
     * @return the value
     **/
    public java.util.List<FacetedSearchSortRequest> getSort() {
        return sort;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final FacetedSearchFilterRequest filters;

    public FacetedSearchFilterRequest getFilters() {
        return filters;
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
        sb.append("SearchCriteria(");
        sb.append("super=").append(super.toString());
        sb.append("query=").append(String.valueOf(this.query));
        sb.append(", facetedQuery=").append(String.valueOf(this.facetedQuery));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", sort=").append(String.valueOf(this.sort));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchCriteria)) {
            return false;
        }

        SearchCriteria other = (SearchCriteria) o;
        return java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.facetedQuery, other.facetedQuery)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.sort, other.sort)
                && java.util.Objects.equals(this.filters, other.filters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.facetedQuery == null ? 43 : this.facetedQuery.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.sort == null ? 43 : this.sort.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
