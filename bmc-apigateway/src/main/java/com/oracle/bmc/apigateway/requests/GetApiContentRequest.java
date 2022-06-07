/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.requests;

import com.oracle.bmc.apigateway.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apigateway/GetApiContentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetApiContentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class GetApiContentRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ocid of the API.
     */
    private String apiId;

    public String getApiId() {
        return apiId;
    }
    /**
     * The client request id for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The Range HTTP request header indicates the part of a document that the
     * server should return. [RFC 7233](https://tools.ietf.org/html/rfc7233#section-3.1).
     * Note that only a single range of bytes is supported.
     *
     */
    private com.oracle.bmc.model.Range range;

    public com.oracle.bmc.model.Range getRange() {
        return range;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetApiContentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String apiId = null;

        /**
         * The ocid of the API.
         * @return this builder instance
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request id for tracing.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private com.oracle.bmc.model.Range range = null;

        /**
         * The Range HTTP request header indicates the part of a document that the
         * server should return. [RFC 7233](https://tools.ietf.org/html/rfc7233#section-3.1).
         * Note that only a single range of bytes is supported.
         *
         * @return this builder instance
         */
        public Builder range(com.oracle.bmc.model.Range range) {
            this.range = range;
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
        public Builder copy(GetApiContentRequest o) {
            apiId(o.getApiId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            range(o.getRange());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetApiContentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetApiContentRequest
         */
        public GetApiContentRequest build() {
            GetApiContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetApiContentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetApiContentRequest
         */
        public GetApiContentRequest buildWithoutInvocationCallback() {
            GetApiContentRequest request = new GetApiContentRequest();
            request.apiId = apiId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.range = range;
            return request;
            // new GetApiContentRequest(apiId, opcRequestId, ifMatch, range);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder().apiId(apiId).opcRequestId(opcRequestId).ifMatch(ifMatch).range(range);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",apiId=").append(String.valueOf(this.apiId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",range=").append(String.valueOf(this.range));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetApiContentRequest)) {
            return false;
        }

        GetApiContentRequest other = (GetApiContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apiId, other.apiId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.range, other.range);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apiId == null ? 43 : this.apiId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.range == null ? 43 : this.range.hashCode());
        return result;
    }
}
