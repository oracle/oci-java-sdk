/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Object with details about filter criteria. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FacetedSearchFilterRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FacetedSearchFilterRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Object with date filter criteria */
        @com.fasterxml.jackson.annotation.JsonProperty("searchDateFilters")
        private java.util.List<FacetedSearchDateFilterRequest> searchDateFilters;

        /**
         * Object with date filter criteria
         *
         * @param searchDateFilters the value to set
         * @return this builder
         */
        public Builder searchDateFilters(
                java.util.List<FacetedSearchDateFilterRequest> searchDateFilters) {
            this.searchDateFilters = searchDateFilters;
            this.__explicitlySet__.add("searchDateFilters");
            return this;
        }
        /** Object with string filter criteria */
        @com.fasterxml.jackson.annotation.JsonProperty("searchStringFilters")
        private java.util.List<FacetedSearchStringFilterRequest> searchStringFilters;

        /**
         * Object with string filter criteria
         *
         * @param searchStringFilters the value to set
         * @return this builder
         */
        public Builder searchStringFilters(
                java.util.List<FacetedSearchStringFilterRequest> searchStringFilters) {
            this.searchStringFilters = searchStringFilters;
            this.__explicitlySet__.add("searchStringFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FacetedSearchFilterRequest build() {
            FacetedSearchFilterRequest model =
                    new FacetedSearchFilterRequest(
                            this.searchDateFilters, this.searchStringFilters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FacetedSearchFilterRequest model) {
            if (model.wasPropertyExplicitlySet("searchDateFilters")) {
                this.searchDateFilters(model.getSearchDateFilters());
            }
            if (model.wasPropertyExplicitlySet("searchStringFilters")) {
                this.searchStringFilters(model.getSearchStringFilters());
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

    /** Object with date filter criteria */
    @com.fasterxml.jackson.annotation.JsonProperty("searchDateFilters")
    private final java.util.List<FacetedSearchDateFilterRequest> searchDateFilters;

    /**
     * Object with date filter criteria
     *
     * @return the value
     */
    public java.util.List<FacetedSearchDateFilterRequest> getSearchDateFilters() {
        return searchDateFilters;
    }

    /** Object with string filter criteria */
    @com.fasterxml.jackson.annotation.JsonProperty("searchStringFilters")
    private final java.util.List<FacetedSearchStringFilterRequest> searchStringFilters;

    /**
     * Object with string filter criteria
     *
     * @return the value
     */
    public java.util.List<FacetedSearchStringFilterRequest> getSearchStringFilters() {
        return searchStringFilters;
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
        sb.append("FacetedSearchFilterRequest(");
        sb.append("super=").append(super.toString());
        sb.append("searchDateFilters=").append(String.valueOf(this.searchDateFilters));
        sb.append(", searchStringFilters=").append(String.valueOf(this.searchStringFilters));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
