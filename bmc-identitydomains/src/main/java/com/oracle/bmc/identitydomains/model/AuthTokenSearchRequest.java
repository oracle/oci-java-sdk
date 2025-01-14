/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Clients MAY execute queries without passing parameters on the URL by using the HTTP POST verb
 * combined with the **.search** path extension. The inclusion of **.search** on the end of a valid
 * SCIM endpoint SHALL be used to indicate the HTTP POST verb is intended to be a query operation.
 * To create a new query result set, a SCIM client sends an HTTP POST request to the desired SCIM
 * resource endpoint (ending in **.search**). The body of the POST request MAY include any of the
 * parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuthTokenSearchRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuthTokenSearchRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemas",
        "attributes",
        "attributeSets",
        "filter",
        "sortBy",
        "sortOrder",
        "startIndex",
        "count"
    })
    public AuthTokenSearchRequest(
            java.util.List<String> schemas,
            java.util.List<String> attributes,
            java.util.List<AttributeSets> attributeSets,
            String filter,
            String sortBy,
            SortOrder sortOrder,
            Integer startIndex,
            Integer count) {
        super();
        this.schemas = schemas;
        this.attributes = attributes;
        this.attributeSets = attributeSets;
        this.filter = filter;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.startIndex = startIndex;
        this.count = count;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The schemas attribute is an array of Strings which allows introspection of the supported
         * schema version for a SCIM representation as well any schema extensions supported by that
         * representation. Each String value must be a unique URI. Query requests MUST be identified
         * using the following URI: "urn:ietf:params:scim:api:messages:2.0:SearchRequest" REQUIRED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schemas")
        private java.util.List<String> schemas;

        /**
         * The schemas attribute is an array of Strings which allows introspection of the supported
         * schema version for a SCIM representation as well any schema extensions supported by that
         * representation. Each String value must be a unique URI. Query requests MUST be identified
         * using the following URI: "urn:ietf:params:scim:api:messages:2.0:SearchRequest" REQUIRED.
         *
         * @param schemas the value to set
         * @return this builder
         */
        public Builder schemas(java.util.List<String> schemas) {
            this.schemas = schemas;
            this.__explicitlySet__.add("schemas");
            return this;
        }
        /**
         * A multi-valued list of strings indicating the names of resource attributes to return in
         * the response overriding the set of attributes that would be returned by default.
         * Attribute names MUST be in standard attribute notation ([Section
         * 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See
         * ([additional retrieval query
         * parameters](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.9)). OPTIONAL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<String> attributes;

        /**
         * A multi-valued list of strings indicating the names of resource attributes to return in
         * the response overriding the set of attributes that would be returned by default.
         * Attribute names MUST be in standard attribute notation ([Section
         * 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See
         * ([additional retrieval query
         * parameters](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.9)). OPTIONAL.
         *
         * @param attributes the value to set
         * @return this builder
         */
        public Builder attributes(java.util.List<String> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }
        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The
         * specified set of attributes can be fetched by the return type of the attribute. One or
         * more values can be given together to fetch more than one group of attributes. If
         * "attributes" query parameter is also available, union of the two is fetched. Valid values
         * : all, always, never, request, default. Values are case-insensitive. OPTIONAL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeSets")
        private java.util.List<AttributeSets> attributeSets;

        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The
         * specified set of attributes can be fetched by the return type of the attribute. One or
         * more values can be given together to fetch more than one group of attributes. If
         * "attributes" query parameter is also available, union of the two is fetched. Valid values
         * : all, always, never, request, default. Values are case-insensitive. OPTIONAL.
         *
         * @param attributeSets the value to set
         * @return this builder
         */
        public Builder attributeSets(java.util.List<AttributeSets> attributeSets) {
            this.attributeSets = attributeSets;
            this.__explicitlySet__.add("attributeSets");
            return this;
        }
        /**
         * The filter string that is used to request a subset of resources. The filter string MUST
         * be a valid filter expression. See [Section
         * 3.4.2.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.2). OPTIONAL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private String filter;

        /**
         * The filter string that is used to request a subset of resources. The filter string MUST
         * be a valid filter expression. See [Section
         * 3.4.2.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.2). OPTIONAL.
         *
         * @param filter the value to set
         * @return this builder
         */
        public Builder filter(String filter) {
            this.filter = filter;
            this.__explicitlySet__.add("filter");
            return this;
        }
        /**
         * A string that indicates the attribute whose value SHALL be used to order the returned
         * responses. The sortBy attribute MUST be in standard attribute notation ([Section
         * 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See
         * [Sorting section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3).
         * OPTIONAL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private String sortBy;

        /**
         * A string that indicates the attribute whose value SHALL be used to order the returned
         * responses. The sortBy attribute MUST be in standard attribute notation ([Section
         * 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See
         * [Sorting section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3).
         * OPTIONAL.
         *
         * @param sortBy the value to set
         * @return this builder
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }
        /**
         * A string that indicates the order in which the sortBy parameter is applied. Allowed
         * values are "ascending" and "descending". See ([Sorting
         * Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3)). OPTIONAL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        /**
         * A string that indicates the order in which the sortBy parameter is applied. Allowed
         * values are "ascending" and "descending". See ([Sorting
         * Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3)). OPTIONAL.
         *
         * @param sortOrder the value to set
         * @return this builder
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }
        /**
         * An integer that indicates the 1-based index of the first query result. See [Pagination
         * Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.4). OPTIONAL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("startIndex")
        private Integer startIndex;

        /**
         * An integer that indicates the 1-based index of the first query result. See [Pagination
         * Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.4). OPTIONAL.
         *
         * @param startIndex the value to set
         * @return this builder
         */
        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            this.__explicitlySet__.add("startIndex");
            return this;
        }
        /**
         * An integer that indicates the desired maximum number of query results per page. 1000 is
         * the largest value that you can use. See the Pagination section of the System for
         * Cross-Domain Identity Management Protocol specification for more information. ([Section
         * 3.4.2.4](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.4)). OPTIONAL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * An integer that indicates the desired maximum number of query results per page. 1000 is
         * the largest value that you can use. See the Pagination section of the System for
         * Cross-Domain Identity Management Protocol specification for more information. ([Section
         * 3.4.2.4](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.4)). OPTIONAL.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuthTokenSearchRequest build() {
            AuthTokenSearchRequest model =
                    new AuthTokenSearchRequest(
                            this.schemas,
                            this.attributes,
                            this.attributeSets,
                            this.filter,
                            this.sortBy,
                            this.sortOrder,
                            this.startIndex,
                            this.count);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuthTokenSearchRequest model) {
            if (model.wasPropertyExplicitlySet("schemas")) {
                this.schemas(model.getSchemas());
            }
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
            }
            if (model.wasPropertyExplicitlySet("attributeSets")) {
                this.attributeSets(model.getAttributeSets());
            }
            if (model.wasPropertyExplicitlySet("filter")) {
                this.filter(model.getFilter());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
            }
            if (model.wasPropertyExplicitlySet("startIndex")) {
                this.startIndex(model.getStartIndex());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
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

    /**
     * The schemas attribute is an array of Strings which allows introspection of the supported
     * schema version for a SCIM representation as well any schema extensions supported by that
     * representation. Each String value must be a unique URI. Query requests MUST be identified
     * using the following URI: "urn:ietf:params:scim:api:messages:2.0:SearchRequest" REQUIRED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemas")
    private final java.util.List<String> schemas;

    /**
     * The schemas attribute is an array of Strings which allows introspection of the supported
     * schema version for a SCIM representation as well any schema extensions supported by that
     * representation. Each String value must be a unique URI. Query requests MUST be identified
     * using the following URI: "urn:ietf:params:scim:api:messages:2.0:SearchRequest" REQUIRED.
     *
     * @return the value
     */
    public java.util.List<String> getSchemas() {
        return schemas;
    }

    /**
     * A multi-valued list of strings indicating the names of resource attributes to return in the
     * response overriding the set of attributes that would be returned by default. Attribute names
     * MUST be in standard attribute notation ([Section
     * 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See
     * ([additional retrieval query
     * parameters](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.9)). OPTIONAL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.List<String> attributes;

    /**
     * A multi-valued list of strings indicating the names of resource attributes to return in the
     * response overriding the set of attributes that would be returned by default. Attribute names
     * MUST be in standard attribute notation ([Section
     * 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See
     * ([additional retrieval query
     * parameters](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.9)). OPTIONAL.
     *
     * @return the value
     */
    public java.util.List<String> getAttributes() {
        return attributes;
    }

    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The
     * specified set of attributes can be fetched by the return type of the attribute. One or more
     * values can be given together to fetch more than one group of attributes. If "attributes"
     * query parameter is also available, union of the two is fetched. Valid values : all, always,
     * never, request, default. Values are case-insensitive. OPTIONAL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeSets")
    private final java.util.List<AttributeSets> attributeSets;

    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The
     * specified set of attributes can be fetched by the return type of the attribute. One or more
     * values can be given together to fetch more than one group of attributes. If "attributes"
     * query parameter is also available, union of the two is fetched. Valid values : all, always,
     * never, request, default. Values are case-insensitive. OPTIONAL.
     *
     * @return the value
     */
    public java.util.List<AttributeSets> getAttributeSets() {
        return attributeSets;
    }

    /**
     * The filter string that is used to request a subset of resources. The filter string MUST be a
     * valid filter expression. See [Section
     * 3.4.2.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.2). OPTIONAL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final String filter;

    /**
     * The filter string that is used to request a subset of resources. The filter string MUST be a
     * valid filter expression. See [Section
     * 3.4.2.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.2). OPTIONAL.
     *
     * @return the value
     */
    public String getFilter() {
        return filter;
    }

    /**
     * A string that indicates the attribute whose value SHALL be used to order the returned
     * responses. The sortBy attribute MUST be in standard attribute notation ([Section
     * 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See [Sorting
     * section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3). OPTIONAL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final String sortBy;

    /**
     * A string that indicates the attribute whose value SHALL be used to order the returned
     * responses. The sortBy attribute MUST be in standard attribute notation ([Section
     * 3.10](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.10)) form. See [Sorting
     * section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3). OPTIONAL.
     *
     * @return the value
     */
    public String getSortBy() {
        return sortBy;
    }

    /**
     * A string that indicates the order in which the sortBy parameter is applied. Allowed values
     * are "ascending" and "descending". See ([Sorting
     * Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3)). OPTIONAL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    /**
     * A string that indicates the order in which the sortBy parameter is applied. Allowed values
     * are "ascending" and "descending". See ([Sorting
     * Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3)). OPTIONAL.
     *
     * @return the value
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * An integer that indicates the 1-based index of the first query result. See [Pagination
     * Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.4). OPTIONAL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startIndex")
    private final Integer startIndex;

    /**
     * An integer that indicates the 1-based index of the first query result. See [Pagination
     * Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.4). OPTIONAL.
     *
     * @return the value
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * An integer that indicates the desired maximum number of query results per page. 1000 is the
     * largest value that you can use. See the Pagination section of the System for Cross-Domain
     * Identity Management Protocol specification for more information. ([Section
     * 3.4.2.4](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.4)). OPTIONAL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * An integer that indicates the desired maximum number of query results per page. 1000 is the
     * largest value that you can use. See the Pagination section of the System for Cross-Domain
     * Identity Management Protocol specification for more information. ([Section
     * 3.4.2.4](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.4)). OPTIONAL.
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
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
        sb.append("AuthTokenSearchRequest(");
        sb.append("super=").append(super.toString());
        sb.append("schemas=").append(String.valueOf(this.schemas));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(", attributeSets=").append(String.valueOf(this.attributeSets));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", startIndex=").append(String.valueOf(this.startIndex));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuthTokenSearchRequest)) {
            return false;
        }

        AuthTokenSearchRequest other = (AuthTokenSearchRequest) o;
        return java.util.Objects.equals(this.schemas, other.schemas)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.attributeSets, other.attributeSets)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.startIndex, other.startIndex)
                && java.util.Objects.equals(this.count, other.count)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemas == null ? 43 : this.schemas.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeSets == null ? 43 : this.attributeSets.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.startIndex == null ? 43 : this.startIndex.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
