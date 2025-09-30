/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Discover Exadata VM Cluster targets for a 'GUEST_OS' collection by querying [OCI Search
 * Service](https://docs.oracle.com/iaas/Content/Search/Concepts/queryoverview.htm) using specified
 * filters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GuestOsFiltersDiscovery.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "strategy")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GuestOsFiltersDiscovery extends GuestOsFleetDiscoveryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Filters to use for search. */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<GuestOsFleetDiscoveryFilter> filters;

        /**
         * Filters to use for search.
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(java.util.List<GuestOsFleetDiscoveryFilter> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GuestOsFiltersDiscovery build() {
            GuestOsFiltersDiscovery model = new GuestOsFiltersDiscovery(this.filters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GuestOsFiltersDiscovery model) {
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
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

    @Deprecated
    public GuestOsFiltersDiscovery(java.util.List<GuestOsFleetDiscoveryFilter> filters) {
        super();
        this.filters = filters;
    }

    /** Filters to use for search. */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<GuestOsFleetDiscoveryFilter> filters;

    /**
     * Filters to use for search.
     *
     * @return the value
     */
    public java.util.List<GuestOsFleetDiscoveryFilter> getFilters() {
        return filters;
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
        sb.append("GuestOsFiltersDiscovery(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GuestOsFiltersDiscovery)) {
            return false;
        }

        GuestOsFiltersDiscovery other = (GuestOsFiltersDiscovery) o;
        return java.util.Objects.equals(this.filters, other.filters) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        return result;
    }
}
