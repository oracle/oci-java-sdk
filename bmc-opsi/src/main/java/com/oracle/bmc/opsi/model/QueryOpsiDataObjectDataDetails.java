/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Information required to form and execute query on an OPSI data object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QueryOpsiDataObjectDataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryOpsiDataObjectDataDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"dataObjectIdentifier", "query", "resourceFilters"})
    public QueryOpsiDataObjectDataDetails(
            String dataObjectIdentifier, DataObjectQuery query, ResourceFilters resourceFilters) {
        super();
        this.dataObjectIdentifier = dataObjectIdentifier;
        this.query = query;
        this.resourceFilters = resourceFilters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dataObjectIdentifier")
        private String dataObjectIdentifier;

        public Builder dataObjectIdentifier(String dataObjectIdentifier) {
            this.dataObjectIdentifier = dataObjectIdentifier;
            this.__explicitlySet__.add("dataObjectIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private DataObjectQuery query;

        public Builder query(DataObjectQuery query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceFilters")
        private ResourceFilters resourceFilters;

        public Builder resourceFilters(ResourceFilters resourceFilters) {
            this.resourceFilters = resourceFilters;
            this.__explicitlySet__.add("resourceFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryOpsiDataObjectDataDetails build() {
            QueryOpsiDataObjectDataDetails __instance__ =
                    new QueryOpsiDataObjectDataDetails(
                            dataObjectIdentifier, query, resourceFilters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryOpsiDataObjectDataDetails o) {
            Builder copiedBuilder =
                    dataObjectIdentifier(o.getDataObjectIdentifier())
                            .query(o.getQuery())
                            .resourceFilters(o.getResourceFilters());

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
     * Unique OPSI data object identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataObjectIdentifier")
    private final String dataObjectIdentifier;

    public String getDataObjectIdentifier() {
        return dataObjectIdentifier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final DataObjectQuery query;

    public DataObjectQuery getQuery() {
        return query;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceFilters")
    private final ResourceFilters resourceFilters;

    public ResourceFilters getResourceFilters() {
        return resourceFilters;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryOpsiDataObjectDataDetails(");
        sb.append("dataObjectIdentifier=").append(String.valueOf(this.dataObjectIdentifier));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", resourceFilters=").append(String.valueOf(this.resourceFilters));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryOpsiDataObjectDataDetails)) {
            return false;
        }

        QueryOpsiDataObjectDataDetails other = (QueryOpsiDataObjectDataDetails) o;
        return java.util.Objects.equals(this.dataObjectIdentifier, other.dataObjectIdentifier)
                && java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.resourceFilters, other.resourceFilters)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dataObjectIdentifier == null
                                ? 43
                                : this.dataObjectIdentifier.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceFilters == null ? 43 : this.resourceFilters.hashCode());
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
