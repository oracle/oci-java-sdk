/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/SuggestMatchesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use SuggestMatchesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class SuggestMatchesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique catalog identifier. */
    private String catalogId;

    /** Unique catalog identifier. */
    public String getCatalogId() {
        return catalogId;
    }
    /** Text input string used for computing potential matching suggestions. */
    private String inputText;

    /** Text input string used for computing potential matching suggestions. */
    public String getInputText() {
        return inputText;
    }
    /**
     * A search timeout string (for example, timeout=4000ms), bounding the search request to be
     * executed within the specified time value and bail with the hits accumulated up to that point
     * when expired. Defaults to no timeout.
     */
    private String timeout;

    /**
     * A search timeout string (for example, timeout=4000ms), bounding the search request to be
     * executed within the specified time value and bail with the hits accumulated up to that point
     * when expired. Defaults to no timeout.
     */
    public String getTimeout() {
        return timeout;
    }
    /**
     * Limit for the list of potential matches returned from the Suggest API. If not specified, will
     * default to 10.
     */
    private Integer limit;

    /**
     * Limit for the list of potential matches returned from the Suggest API. If not specified, will
     * default to 10.
     */
    public Integer getLimit() {
        return limit;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SuggestMatchesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique catalog identifier. */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         *
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /** Text input string used for computing potential matching suggestions. */
        private String inputText = null;

        /**
         * Text input string used for computing potential matching suggestions.
         *
         * @param inputText the value to set
         * @return this builder instance
         */
        public Builder inputText(String inputText) {
            this.inputText = inputText;
            return this;
        }

        /**
         * A search timeout string (for example, timeout=4000ms), bounding the search request to be
         * executed within the specified time value and bail with the hits accumulated up to that
         * point when expired. Defaults to no timeout.
         */
        private String timeout = null;

        /**
         * A search timeout string (for example, timeout=4000ms), bounding the search request to be
         * executed within the specified time value and bail with the hits accumulated up to that
         * point when expired. Defaults to no timeout.
         *
         * @param timeout the value to set
         * @return this builder instance
         */
        public Builder timeout(String timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Limit for the list of potential matches returned from the Suggest API. If not specified,
         * will default to 10.
         */
        private Integer limit = null;

        /**
         * Limit for the list of potential matches returned from the Suggest API. If not specified,
         * will default to 10.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(SuggestMatchesRequest o) {
            catalogId(o.getCatalogId());
            inputText(o.getInputText());
            timeout(o.getTimeout());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SuggestMatchesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SuggestMatchesRequest
         */
        public SuggestMatchesRequest build() {
            SuggestMatchesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SuggestMatchesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SuggestMatchesRequest
         */
        public SuggestMatchesRequest buildWithoutInvocationCallback() {
            SuggestMatchesRequest request = new SuggestMatchesRequest();
            request.catalogId = catalogId;
            request.inputText = inputText;
            request.timeout = timeout;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            return request;
            // new SuggestMatchesRequest(catalogId, inputText, timeout, limit, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .inputText(inputText)
                .timeout(timeout)
                .limit(limit)
                .opcRequestId(opcRequestId);
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",inputText=").append(String.valueOf(this.inputText));
        sb.append(",timeout=").append(String.valueOf(this.timeout));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuggestMatchesRequest)) {
            return false;
        }

        SuggestMatchesRequest other = (SuggestMatchesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.inputText, other.inputText)
                && java.util.Objects.equals(this.timeout, other.timeout)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.inputText == null ? 43 : this.inputText.hashCode());
        result = (result * PRIME) + (this.timeout == null ? 43 : this.timeout.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
