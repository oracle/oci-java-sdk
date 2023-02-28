/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/SearchMonitoredResourcesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SearchMonitoredResourcesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class SearchMonitoredResourcesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.stackmonitoring.model.SearchMonitoredResourcesDetails> {

    /** Property Search Criteria for the listing the monitored resources. */
    private com.oracle.bmc.stackmonitoring.model.SearchMonitoredResourcesDetails
            searchMonitoredResourcesDetails;

    /** Property Search Criteria for the listing the monitored resources. */
    public com.oracle.bmc.stackmonitoring.model.SearchMonitoredResourcesDetails
            getSearchMonitoredResourcesDetails() {
        return searchMonitoredResourcesDetails;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Partial response refers to an optimization technique offered by the RESTful web APIs, to
     * return only the information (fields) required by the client. In this mechanism, the client
     * sends the required field names as the query parameters for an API to the server, and the
     * server trims down the default response content by removing the fields that are not required
     * by the client. The parameter controls which fields to return and should be a query string
     * parameter called "fields" of an array type, provide the values as enums, and use
     * collectionFormat.
     */
    private java.util.List<String> fields;

    /**
     * Partial response refers to an optimization technique offered by the RESTful web APIs, to
     * return only the information (fields) required by the client. In this mechanism, the client
     * sends the required field names as the query parameters for an API to the server, and the
     * server trims down the default response content by removing the fields that are not required
     * by the client. The parameter controls which fields to return and should be a query string
     * parameter called "fields" of an array type, provide the values as enums, and use
     * collectionFormat.
     */
    public java.util.List<String> getFields() {
        return fields;
    }
    /**
     * Partial response refers to an optimization technique offered by the RESTful web APIs, to
     * return all the information except the fields requested to be excluded (excludeFields) by the
     * client. In this mechanism, the client sends the exclude field names as the query parameters
     * for an API to the server, and the server trims down the default response content by removing
     * the fields that are not required by the client. The parameter controls which fields to exlude
     * and to return and should be a query string parameter called "excludeFields" of an array type,
     * provide the values as enums, and use collectionFormat.
     */
    private java.util.List<String> excludeFields;

    /**
     * Partial response refers to an optimization technique offered by the RESTful web APIs, to
     * return all the information except the fields requested to be excluded (excludeFields) by the
     * client. In this mechanism, the client sends the exclude field names as the query parameters
     * for an API to the server, and the server trims down the default response content by removing
     * the fields that are not required by the client. The parameter controls which fields to exlude
     * and to return and should be a query string parameter called "excludeFields" of an array type,
     * provide the values as enums, and use collectionFormat.
     */
    public java.util.List<String> getExcludeFields() {
        return excludeFields;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.stackmonitoring.model.SearchMonitoredResourcesDetails getBody$() {
        return searchMonitoredResourcesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SearchMonitoredResourcesRequest,
                    com.oracle.bmc.stackmonitoring.model.SearchMonitoredResourcesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Property Search Criteria for the listing the monitored resources. */
        private com.oracle.bmc.stackmonitoring.model.SearchMonitoredResourcesDetails
                searchMonitoredResourcesDetails = null;

        /**
         * Property Search Criteria for the listing the monitored resources.
         *
         * @param searchMonitoredResourcesDetails the value to set
         * @return this builder instance
         */
        public Builder searchMonitoredResourcesDetails(
                com.oracle.bmc.stackmonitoring.model.SearchMonitoredResourcesDetails
                        searchMonitoredResourcesDetails) {
            this.searchMonitoredResourcesDetails = searchMonitoredResourcesDetails;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Partial response refers to an optimization technique offered by the RESTful web APIs, to
         * return only the information (fields) required by the client. In this mechanism, the
         * client sends the required field names as the query parameters for an API to the server,
         * and the server trims down the default response content by removing the fields that are
         * not required by the client. The parameter controls which fields to return and should be a
         * query string parameter called "fields" of an array type, provide the values as enums, and
         * use collectionFormat.
         */
        private java.util.List<String> fields = null;

        /**
         * Partial response refers to an optimization technique offered by the RESTful web APIs, to
         * return only the information (fields) required by the client. In this mechanism, the
         * client sends the required field names as the query parameters for an API to the server,
         * and the server trims down the default response content by removing the fields that are
         * not required by the client. The parameter controls which fields to return and should be a
         * query string parameter called "fields" of an array type, provide the values as enums, and
         * use collectionFormat.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Partial response refers to an optimization technique offered by the
         * RESTful web APIs, to return only the information (fields) required by the client. In this
         * mechanism, the client sends the required field names as the query parameters for an API
         * to the server, and the server trims down the default response content by removing the
         * fields that are not required by the client. The parameter controls which fields to return
         * and should be a query string parameter called "fields" of an array type, provide the
         * values as enums, and use collectionFormat.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(String singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * Partial response refers to an optimization technique offered by the RESTful web APIs, to
         * return all the information except the fields requested to be excluded (excludeFields) by
         * the client. In this mechanism, the client sends the exclude field names as the query
         * parameters for an API to the server, and the server trims down the default response
         * content by removing the fields that are not required by the client. The parameter
         * controls which fields to exlude and to return and should be a query string parameter
         * called "excludeFields" of an array type, provide the values as enums, and use
         * collectionFormat.
         */
        private java.util.List<String> excludeFields = null;

        /**
         * Partial response refers to an optimization technique offered by the RESTful web APIs, to
         * return all the information except the fields requested to be excluded (excludeFields) by
         * the client. In this mechanism, the client sends the exclude field names as the query
         * parameters for an API to the server, and the server trims down the default response
         * content by removing the fields that are not required by the client. The parameter
         * controls which fields to exlude and to return and should be a query string parameter
         * called "excludeFields" of an array type, provide the values as enums, and use
         * collectionFormat.
         *
         * @param excludeFields the value to set
         * @return this builder instance
         */
        public Builder excludeFields(java.util.List<String> excludeFields) {
            this.excludeFields = excludeFields;
            return this;
        }

        /**
         * Singular setter. Partial response refers to an optimization technique offered by the
         * RESTful web APIs, to return all the information except the fields requested to be
         * excluded (excludeFields) by the client. In this mechanism, the client sends the exclude
         * field names as the query parameters for an API to the server, and the server trims down
         * the default response content by removing the fields that are not required by the client.
         * The parameter controls which fields to exlude and to return and should be a query string
         * parameter called "excludeFields" of an array type, provide the values as enums, and use
         * collectionFormat.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder excludeFields(String singularValue) {
            return this.excludeFields(java.util.Arrays.asList(singularValue));
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(SearchMonitoredResourcesRequest o) {
            searchMonitoredResourcesDetails(o.getSearchMonitoredResourcesDetails());
            limit(o.getLimit());
            page(o.getPage());
            fields(o.getFields());
            excludeFields(o.getExcludeFields());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SearchMonitoredResourcesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SearchMonitoredResourcesRequest
         */
        public SearchMonitoredResourcesRequest build() {
            SearchMonitoredResourcesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.stackmonitoring.model.SearchMonitoredResourcesDetails body) {
            searchMonitoredResourcesDetails(body);
            return this;
        }

        /**
         * Build the instance of SearchMonitoredResourcesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SearchMonitoredResourcesRequest
         */
        public SearchMonitoredResourcesRequest buildWithoutInvocationCallback() {
            SearchMonitoredResourcesRequest request = new SearchMonitoredResourcesRequest();
            request.searchMonitoredResourcesDetails = searchMonitoredResourcesDetails;
            request.limit = limit;
            request.page = page;
            request.fields = fields;
            request.excludeFields = excludeFields;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new SearchMonitoredResourcesRequest(searchMonitoredResourcesDetails, limit, page,
            // fields, excludeFields, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .searchMonitoredResourcesDetails(searchMonitoredResourcesDetails)
                .limit(limit)
                .page(page)
                .fields(fields)
                .excludeFields(excludeFields)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",searchMonitoredResourcesDetails=")
                .append(String.valueOf(this.searchMonitoredResourcesDetails));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",excludeFields=").append(String.valueOf(this.excludeFields));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchMonitoredResourcesRequest)) {
            return false;
        }

        SearchMonitoredResourcesRequest other = (SearchMonitoredResourcesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.searchMonitoredResourcesDetails, other.searchMonitoredResourcesDetails)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.excludeFields, other.excludeFields)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.searchMonitoredResourcesDetails == null
                                ? 43
                                : this.searchMonitoredResourcesDetails.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeFields == null ? 43 : this.excludeFields.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
