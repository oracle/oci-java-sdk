/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.requests;

import com.oracle.bmc.vnmonitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/vnmonitoring/GetPathAnalysisExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetPathAnalysisRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetPathAnalysisRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.vnmonitoring.model.GetPathAnalysisDetails> {

    /** Details for the path analysis query. */
    private com.oracle.bmc.vnmonitoring.model.GetPathAnalysisDetails getPathAnalysisDetails;

    /** Details for the path analysis query. */
    public com.oracle.bmc.vnmonitoring.model.GetPathAnalysisDetails getGetPathAnalysisDetails() {
        return getPathAnalysisDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The Cache-Control HTTP header holds directives (instructions) for caching in both requests
     * and responses.
     */
    private String cacheControl;

    /**
     * The Cache-Control HTTP header holds directives (instructions) for caching in both requests
     * and responses.
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.vnmonitoring.model.GetPathAnalysisDetails getBody$() {
        return getPathAnalysisDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetPathAnalysisRequest,
                    com.oracle.bmc.vnmonitoring.model.GetPathAnalysisDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for the path analysis query. */
        private com.oracle.bmc.vnmonitoring.model.GetPathAnalysisDetails getPathAnalysisDetails =
                null;

        /**
         * Details for the path analysis query.
         *
         * @param getPathAnalysisDetails the value to set
         * @return this builder instance
         */
        public Builder getPathAnalysisDetails(
                com.oracle.bmc.vnmonitoring.model.GetPathAnalysisDetails getPathAnalysisDetails) {
            this.getPathAnalysisDetails = getPathAnalysisDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The Cache-Control HTTP header holds directives (instructions) for caching in both
         * requests and responses.
         */
        private String cacheControl = null;

        /**
         * The Cache-Control HTTP header holds directives (instructions) for caching in both
         * requests and responses.
         *
         * @param cacheControl the value to set
         * @return this builder instance
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
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
        public Builder copy(GetPathAnalysisRequest o) {
            getPathAnalysisDetails(o.getGetPathAnalysisDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            cacheControl(o.getCacheControl());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetPathAnalysisRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetPathAnalysisRequest
         */
        public GetPathAnalysisRequest build() {
            GetPathAnalysisRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.vnmonitoring.model.GetPathAnalysisDetails body) {
            getPathAnalysisDetails(body);
            return this;
        }

        /**
         * Build the instance of GetPathAnalysisRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetPathAnalysisRequest
         */
        public GetPathAnalysisRequest buildWithoutInvocationCallback() {
            GetPathAnalysisRequest request = new GetPathAnalysisRequest();
            request.getPathAnalysisDetails = getPathAnalysisDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.cacheControl = cacheControl;
            return request;
            // new GetPathAnalysisRequest(getPathAnalysisDetails, opcRetryToken, opcRequestId,
            // cacheControl);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .getPathAnalysisDetails(getPathAnalysisDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .cacheControl(cacheControl);
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
        sb.append(",getPathAnalysisDetails=").append(String.valueOf(this.getPathAnalysisDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",cacheControl=").append(String.valueOf(this.cacheControl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPathAnalysisRequest)) {
            return false;
        }

        GetPathAnalysisRequest other = (GetPathAnalysisRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.getPathAnalysisDetails, other.getPathAnalysisDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.cacheControl, other.cacheControl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.getPathAnalysisDetails == null
                                ? 43
                                : this.getPathAnalysisDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.cacheControl == null ? 43 : this.cacheControl.hashCode());
        return result;
    }
}
