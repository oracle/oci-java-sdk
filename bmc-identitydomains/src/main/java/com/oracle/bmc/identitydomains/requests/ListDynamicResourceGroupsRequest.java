/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.requests;

import com.oracle.bmc.identitydomains.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydomains/ListDynamicResourceGroupsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDynamicResourceGroupsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class ListDynamicResourceGroupsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * OPTIONAL. The filter string that is used to request a subset of resources. The filter string MUST be a valid filter expression. See the Filtering section of the SCIM specification for more information (Section 3.4.2.2). The string should contain at least one condition that each item must match in order to be returned in the search results. Each condition specifies an attribute, an operator, and a value. Conditions within a filter can be connected by logical operators (such as AND and OR). Sets of conditions can be grouped together using parentheses.
     */
    private String filter;

    /**
     * OPTIONAL. The filter string that is used to request a subset of resources. The filter string MUST be a valid filter expression. See the Filtering section of the SCIM specification for more information (Section 3.4.2.2). The string should contain at least one condition that each item must match in order to be returned in the search results. Each condition specifies an attribute, an operator, and a value. Conditions within a filter can be connected by logical operators (such as AND and OR). Sets of conditions can be grouped together using parentheses.
     */
    public String getFilter() {
        return filter;
    }
    /**
     * OPTIONAL. A string that indicates the attribute whose value SHALL be used to order the returned responses. The sortBy attribute MUST be in standard attribute notation form. See the Attribute Notation section of the SCIM specification for more information (Section 3.10). Also, see the Sorting section of the SCIM specification for more information (Section 3.4.2.3).
     */
    private String sortBy;

    /**
     * OPTIONAL. A string that indicates the attribute whose value SHALL be used to order the returned responses. The sortBy attribute MUST be in standard attribute notation form. See the Attribute Notation section of the SCIM specification for more information (Section 3.10). Also, see the Sorting section of the SCIM specification for more information (Section 3.4.2.3).
     */
    public String getSortBy() {
        return sortBy;
    }
    /**
     * A string that indicates the order in which the sortBy parameter is applied. Allowed values are 'ascending' and 'descending'. See ([Sorting Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3)). OPTIONAL.
     */
    private com.oracle.bmc.identitydomains.model.SortOrder sortOrder;

    /**
     * A string that indicates the order in which the sortBy parameter is applied. Allowed values are 'ascending' and 'descending'. See ([Sorting Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3)). OPTIONAL.
     */
    public com.oracle.bmc.identitydomains.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * OPTIONAL. An integer that indicates the 1-based index of the first query result. See the Pagination section of the SCIM specification for more information. (Section 3.4.2.4). The number of results pages to return. The first page is 1. Specify 2 to access the second page of results, and so on.
     */
    private Integer startIndex;

    /**
     * OPTIONAL. An integer that indicates the 1-based index of the first query result. See the Pagination section of the SCIM specification for more information. (Section 3.4.2.4). The number of results pages to return. The first page is 1. Specify 2 to access the second page of results, and so on.
     */
    public Integer getStartIndex() {
        return startIndex;
    }
    /**
     * OPTIONAL. An integer that indicates the desired maximum number of query results per page. 1000 is the largest value that you can use. See the Pagination section of the System for Cross-Domain Identity Management Protocol specification for more information. (Section 3.4.2.4).
     */
    private Integer count;

    /**
     * OPTIONAL. An integer that indicates the desired maximum number of query results per page. 1000 is the largest value that you can use. See the Pagination section of the System for Cross-Domain Identity Management Protocol specification for more information. (Section 3.4.2.4).
     */
    public Integer getCount() {
        return count;
    }
    /**
     * A comma-delimited string that specifies the names of resource attributes that should be returned in the response. By default, a response that contains resource attributes contains only attributes that are defined in the schema for that resource type as returned=always or returned=default. An attribute that is defined as returned=request is returned in a response only if the request specifies its name in the value of this query parameter. If a request specifies this query parameter, the response contains the attributes that this query parameter specifies, as well as any attribute that is defined as returned=always.
     */
    private String attributes;

    /**
     * A comma-delimited string that specifies the names of resource attributes that should be returned in the response. By default, a response that contains resource attributes contains only attributes that are defined in the schema for that resource type as returned=always or returned=default. An attribute that is defined as returned=request is returned in a response only if the request specifies its name in the value of this query parameter. If a request specifies this query parameter, the response contains the attributes that this query parameter specifies, as well as any attribute that is defined as returned=always.
     */
    public String getAttributes() {
        return attributes;
    }
    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
     */
    private java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> attributeSets;

    /**
     * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
     */
    public java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> getAttributeSets() {
        return attributeSets;
    }
    /**
     * The Authorization field value consists of credentials containing the authentication information of the user agent for the realm of the resource being requested.
     */
    private String authorization;

    /**
     * The Authorization field value consists of credentials containing the authentication information of the user agent for the realm of the resource being requested.
     */
    public String getAuthorization() {
        return authorization;
    }
    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are Earliest Version or Latest Version as specified in each REST API endpoint description, or any sequential number inbetween. All schema attributes/body parameters are a part of version 1. After version 1, any attributes added or deprecated will be tagged with the version that they were added to or deprecated in. If no version is provided, the latest schema version is returned.
     */
    private String resourceTypeSchemaVersion;

    /**
     * An endpoint-specific schema version number to use in the Request. Allowed version values are Earliest Version or Latest Version as specified in each REST API endpoint description, or any sequential number inbetween. All schema attributes/body parameters are a part of version 1. After version 1, any attributes added or deprecated will be tagged with the version that they were added to or deprecated in. If no version is provided, the latest schema version is returned.
     */
    public String getResourceTypeSchemaVersion() {
        return resourceTypeSchemaVersion;
    }
    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is retried. Idempotency tokens expire after 24 hours.
     */
    private String opcRetryToken;

    /**
     * A token you supply to uniquely identify the request and provide idempotency if the request is retried. Idempotency tokens expire after 24 hours.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous 'List' call.
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous 'List' call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The maximum number of items to return in a paginated 'List' call.
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated 'List' call.
     */
    public Integer getLimit() {
        return limit;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDynamicResourceGroupsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * OPTIONAL. The filter string that is used to request a subset of resources. The filter string MUST be a valid filter expression. See the Filtering section of the SCIM specification for more information (Section 3.4.2.2). The string should contain at least one condition that each item must match in order to be returned in the search results. Each condition specifies an attribute, an operator, and a value. Conditions within a filter can be connected by logical operators (such as AND and OR). Sets of conditions can be grouped together using parentheses.
         */
        private String filter = null;

        /**
         * OPTIONAL. The filter string that is used to request a subset of resources. The filter string MUST be a valid filter expression. See the Filtering section of the SCIM specification for more information (Section 3.4.2.2). The string should contain at least one condition that each item must match in order to be returned in the search results. Each condition specifies an attribute, an operator, and a value. Conditions within a filter can be connected by logical operators (such as AND and OR). Sets of conditions can be grouped together using parentheses.
         * @param filter the value to set
         * @return this builder instance
         */
        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * OPTIONAL. A string that indicates the attribute whose value SHALL be used to order the returned responses. The sortBy attribute MUST be in standard attribute notation form. See the Attribute Notation section of the SCIM specification for more information (Section 3.10). Also, see the Sorting section of the SCIM specification for more information (Section 3.4.2.3).
         */
        private String sortBy = null;

        /**
         * OPTIONAL. A string that indicates the attribute whose value SHALL be used to order the returned responses. The sortBy attribute MUST be in standard attribute notation form. See the Attribute Notation section of the SCIM specification for more information (Section 3.10). Also, see the Sorting section of the SCIM specification for more information (Section 3.4.2.3).
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(String sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A string that indicates the order in which the sortBy parameter is applied. Allowed values are 'ascending' and 'descending'. See ([Sorting Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3)). OPTIONAL.
         */
        private com.oracle.bmc.identitydomains.model.SortOrder sortOrder = null;

        /**
         * A string that indicates the order in which the sortBy parameter is applied. Allowed values are 'ascending' and 'descending'. See ([Sorting Section](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.4.2.3)). OPTIONAL.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.identitydomains.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * OPTIONAL. An integer that indicates the 1-based index of the first query result. See the Pagination section of the SCIM specification for more information. (Section 3.4.2.4). The number of results pages to return. The first page is 1. Specify 2 to access the second page of results, and so on.
         */
        private Integer startIndex = null;

        /**
         * OPTIONAL. An integer that indicates the 1-based index of the first query result. See the Pagination section of the SCIM specification for more information. (Section 3.4.2.4). The number of results pages to return. The first page is 1. Specify 2 to access the second page of results, and so on.
         * @param startIndex the value to set
         * @return this builder instance
         */
        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }

        /**
         * OPTIONAL. An integer that indicates the desired maximum number of query results per page. 1000 is the largest value that you can use. See the Pagination section of the System for Cross-Domain Identity Management Protocol specification for more information. (Section 3.4.2.4).
         */
        private Integer count = null;

        /**
         * OPTIONAL. An integer that indicates the desired maximum number of query results per page. 1000 is the largest value that you can use. See the Pagination section of the System for Cross-Domain Identity Management Protocol specification for more information. (Section 3.4.2.4).
         * @param count the value to set
         * @return this builder instance
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * A comma-delimited string that specifies the names of resource attributes that should be returned in the response. By default, a response that contains resource attributes contains only attributes that are defined in the schema for that resource type as returned=always or returned=default. An attribute that is defined as returned=request is returned in a response only if the request specifies its name in the value of this query parameter. If a request specifies this query parameter, the response contains the attributes that this query parameter specifies, as well as any attribute that is defined as returned=always.
         */
        private String attributes = null;

        /**
         * A comma-delimited string that specifies the names of resource attributes that should be returned in the response. By default, a response that contains resource attributes contains only attributes that are defined in the schema for that resource type as returned=always or returned=default. An attribute that is defined as returned=request is returned in a response only if the request specifies its name in the value of this query parameter. If a request specifies this query parameter, the response contains the attributes that this query parameter specifies, as well as any attribute that is defined as returned=always.
         * @param attributes the value to set
         * @return this builder instance
         */
        public Builder attributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
         */
        private java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> attributeSets =
                null;

        /**
         * A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
         * @param attributeSets the value to set
         * @return this builder instance
         */
        public Builder attributeSets(
                java.util.List<com.oracle.bmc.identitydomains.model.AttributeSets> attributeSets) {
            this.attributeSets = attributeSets;
            return this;
        }

        /**
         * Singular setter. A multi-valued list of strings indicating the return type of attribute definition. The specified set of attributes can be fetched by the return type of the attribute. One or more values can be given together to fetch more than one group of attributes. If 'attributes' query parameter is also available, union of the two is fetched. Valid values - all, always, never, request, default. Values are case-insensitive.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder attributeSets(AttributeSets singularValue) {
            return this.attributeSets(java.util.Arrays.asList(singularValue));
        }

        /**
         * The Authorization field value consists of credentials containing the authentication information of the user agent for the realm of the resource being requested.
         */
        private String authorization = null;

        /**
         * The Authorization field value consists of credentials containing the authentication information of the user agent for the realm of the resource being requested.
         * @param authorization the value to set
         * @return this builder instance
         */
        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values are Earliest Version or Latest Version as specified in each REST API endpoint description, or any sequential number inbetween. All schema attributes/body parameters are a part of version 1. After version 1, any attributes added or deprecated will be tagged with the version that they were added to or deprecated in. If no version is provided, the latest schema version is returned.
         */
        private String resourceTypeSchemaVersion = null;

        /**
         * An endpoint-specific schema version number to use in the Request. Allowed version values are Earliest Version or Latest Version as specified in each REST API endpoint description, or any sequential number inbetween. All schema attributes/body parameters are a part of version 1. After version 1, any attributes added or deprecated will be tagged with the version that they were added to or deprecated in. If no version is provided, the latest schema version is returned.
         * @param resourceTypeSchemaVersion the value to set
         * @return this builder instance
         */
        public Builder resourceTypeSchemaVersion(String resourceTypeSchemaVersion) {
            this.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            return this;
        }

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the request is retried. Idempotency tokens expire after 24 hours.
         */
        private String opcRetryToken = null;

        /**
         * A token you supply to uniquely identify the request and provide idempotency if the request is retried. Idempotency tokens expire after 24 hours.
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous 'List' call.
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous 'List' call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated 'List' call.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated 'List' call.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListDynamicResourceGroupsRequest o) {
            filter(o.getFilter());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            startIndex(o.getStartIndex());
            count(o.getCount());
            attributes(o.getAttributes());
            attributeSets(o.getAttributeSets());
            authorization(o.getAuthorization());
            resourceTypeSchemaVersion(o.getResourceTypeSchemaVersion());
            opcRetryToken(o.getOpcRetryToken());
            page(o.getPage());
            limit(o.getLimit());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDynamicResourceGroupsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDynamicResourceGroupsRequest
         */
        public ListDynamicResourceGroupsRequest build() {
            ListDynamicResourceGroupsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDynamicResourceGroupsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDynamicResourceGroupsRequest
         */
        public ListDynamicResourceGroupsRequest buildWithoutInvocationCallback() {
            ListDynamicResourceGroupsRequest request = new ListDynamicResourceGroupsRequest();
            request.filter = filter;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.startIndex = startIndex;
            request.count = count;
            request.attributes = attributes;
            request.attributeSets = attributeSets;
            request.authorization = authorization;
            request.resourceTypeSchemaVersion = resourceTypeSchemaVersion;
            request.opcRetryToken = opcRetryToken;
            request.page = page;
            request.limit = limit;
            return request;
            // new ListDynamicResourceGroupsRequest(filter, sortBy, sortOrder, startIndex, count, attributes, attributeSets, authorization, resourceTypeSchemaVersion, opcRetryToken, page, limit);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .filter(filter)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .startIndex(startIndex)
                .count(count)
                .attributes(attributes)
                .attributeSets(attributeSets)
                .authorization(authorization)
                .resourceTypeSchemaVersion(resourceTypeSchemaVersion)
                .opcRetryToken(opcRetryToken)
                .page(page)
                .limit(limit);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",filter=").append(String.valueOf(this.filter));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",startIndex=").append(String.valueOf(this.startIndex));
        sb.append(",count=").append(String.valueOf(this.count));
        sb.append(",attributes=").append(String.valueOf(this.attributes));
        sb.append(",attributeSets=").append(String.valueOf(this.attributeSets));
        sb.append(",authorization=").append(String.valueOf(this.authorization));
        sb.append(",resourceTypeSchemaVersion=")
                .append(String.valueOf(this.resourceTypeSchemaVersion));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDynamicResourceGroupsRequest)) {
            return false;
        }

        ListDynamicResourceGroupsRequest other = (ListDynamicResourceGroupsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.startIndex, other.startIndex)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.attributeSets, other.attributeSets)
                && java.util.Objects.equals(this.authorization, other.authorization)
                && java.util.Objects.equals(
                        this.resourceTypeSchemaVersion, other.resourceTypeSchemaVersion)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.startIndex == null ? 43 : this.startIndex.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeSets == null ? 43 : this.attributeSets.hashCode());
        result =
                (result * PRIME)
                        + (this.authorization == null ? 43 : this.authorization.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeSchemaVersion == null
                                ? 43
                                : this.resourceTypeSchemaVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        return result;
    }
}
