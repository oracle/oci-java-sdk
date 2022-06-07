/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Object with details about filter criteria.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FacetedSearchFilterRequest.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FacetedSearchFilterRequest {
    @Deprecated
    @java.beans.ConstructorProperties({"searchDateFilters", "searchStringFilters"})
    public FacetedSearchFilterRequest(
            java.util.List<FacetedSearchDateFilterRequest> searchDateFilters,
            java.util.List<FacetedSearchStringFilterRequest> searchStringFilters) {
        super();
        this.searchDateFilters = searchDateFilters;
        this.searchStringFilters = searchStringFilters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("searchDateFilters")
        private java.util.List<FacetedSearchDateFilterRequest> searchDateFilters;

        public Builder searchDateFilters(
                java.util.List<FacetedSearchDateFilterRequest> searchDateFilters) {
            this.searchDateFilters = searchDateFilters;
            this.__explicitlySet__.add("searchDateFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("searchStringFilters")
        private java.util.List<FacetedSearchStringFilterRequest> searchStringFilters;

        public Builder searchStringFilters(
                java.util.List<FacetedSearchStringFilterRequest> searchStringFilters) {
            this.searchStringFilters = searchStringFilters;
            this.__explicitlySet__.add("searchStringFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FacetedSearchFilterRequest build() {
            FacetedSearchFilterRequest __instance__ =
                    new FacetedSearchFilterRequest(searchDateFilters, searchStringFilters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FacetedSearchFilterRequest o) {
            Builder copiedBuilder =
                    searchDateFilters(o.getSearchDateFilters())
                            .searchStringFilters(o.getSearchStringFilters());

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
     * Object with date filter criteria
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchDateFilters")
    private final java.util.List<FacetedSearchDateFilterRequest> searchDateFilters;

    public java.util.List<FacetedSearchDateFilterRequest> getSearchDateFilters() {
        return searchDateFilters;
    }

    /**
     * Object with string filter criteria
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchStringFilters")
    private final java.util.List<FacetedSearchStringFilterRequest> searchStringFilters;

    public java.util.List<FacetedSearchStringFilterRequest> getSearchStringFilters() {
        return searchStringFilters;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FacetedSearchFilterRequest(");
        sb.append("searchDateFilters=").append(String.valueOf(this.searchDateFilters));
        sb.append(", searchStringFilters=").append(String.valueOf(this.searchStringFilters));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FacetedSearchFilterRequest)) {
            return false;
        }

        FacetedSearchFilterRequest other = (FacetedSearchFilterRequest) o;
        return java.util.Objects.equals(this.searchDateFilters, other.searchDateFilters)
                && java.util.Objects.equals(this.searchStringFilters, other.searchStringFilters)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.searchDateFilters == null ? 43 : this.searchDateFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.searchStringFilters == null
                                ? 43
                                : this.searchStringFilters.hashCode());
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
