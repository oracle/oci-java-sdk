/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/QueryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use QueryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class QueryRequest extends com.oracle.bmc.requests.BmcRequest<QueryDetails> {

    /**
     * The APM Domain Id the request is intended for.
     *
     */
    private String apmDomainId;

    /**
     * Include spans that have a `spanStartTime` equal to or greater this value.
     *
     */
    private java.util.Date timeSpanStartedGreaterThanOrEqualTo;

    /**
     * Include spans that have a `spanStartTime`less than this value.
     *
     */
    private java.util.Date timeSpanStartedLessThan;

    /**
     * Request body containing the query to be run against our repository.
     *
     */
    private QueryDetails queryDetails;

    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The maximum number of items to return.
     *
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results.
     * This is usually retrieved from a previous response.
     *
     */
    private String page;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public QueryDetails getBody$() {
        return queryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<QueryRequest, QueryDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
        public Builder copy(QueryRequest o) {
            apmDomainId(o.getApmDomainId());
            timeSpanStartedGreaterThanOrEqualTo(o.getTimeSpanStartedGreaterThanOrEqualTo());
            timeSpanStartedLessThan(o.getTimeSpanStartedLessThan());
            queryDetails(o.getQueryDetails());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of QueryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of QueryRequest
         */
        public QueryRequest build() {
            QueryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(QueryDetails body) {
            queryDetails(body);
            return this;
        }
    }
}
