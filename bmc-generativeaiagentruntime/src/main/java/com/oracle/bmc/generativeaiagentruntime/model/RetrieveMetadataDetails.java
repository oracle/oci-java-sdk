/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Details to retrieve metadata <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RetrieveMetadataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RetrieveMetadataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"filters"})
    public RetrieveMetadataDetails(java.util.List<MetadataFilter> filters) {
        super();
        this.filters = filters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of metadata filters to narrow down the retrieved metadata */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<MetadataFilter> filters;

        /**
         * List of metadata filters to narrow down the retrieved metadata
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(java.util.List<MetadataFilter> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RetrieveMetadataDetails build() {
            RetrieveMetadataDetails model = new RetrieveMetadataDetails(this.filters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RetrieveMetadataDetails model) {
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

    /** List of metadata filters to narrow down the retrieved metadata */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<MetadataFilter> filters;

    /**
     * List of metadata filters to narrow down the retrieved metadata
     *
     * @return the value
     */
    public java.util.List<MetadataFilter> getFilters() {
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
        sb.append("RetrieveMetadataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("filters=").append(String.valueOf(this.filters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetrieveMetadataDetails)) {
            return false;
        }

        RetrieveMetadataDetails other = (RetrieveMetadataDetails) o;
        return java.util.Objects.equals(this.filters, other.filters) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
