/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.requests;

import com.oracle.bmc.analytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/ChangeAnalyticsInstanceNetworkEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeAnalyticsInstanceNetworkEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public class ChangeAnalyticsInstanceNetworkEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.analytics.model.ChangeAnalyticsInstanceNetworkEndpointDetails> {

    /** The OCID of the AnalyticsInstance. */
    private String analyticsInstanceId;

    /** The OCID of the AnalyticsInstance. */
    public String getAnalyticsInstanceId() {
        return analyticsInstanceId;
    }
    /** Input payload for changing an Analytics instance network endpoint. */
    private com.oracle.bmc.analytics.model.ChangeAnalyticsInstanceNetworkEndpointDetails
            changeAnalyticsInstanceNetworkEndpointDetails;

    /** Input payload for changing an Analytics instance network endpoint. */
    public com.oracle.bmc.analytics.model.ChangeAnalyticsInstanceNetworkEndpointDetails
            getChangeAnalyticsInstanceNetworkEndpointDetails() {
        return changeAnalyticsInstanceNetworkEndpointDetails;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.analytics.model.ChangeAnalyticsInstanceNetworkEndpointDetails getBody$() {
        return changeAnalyticsInstanceNetworkEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeAnalyticsInstanceNetworkEndpointRequest,
                    com.oracle.bmc.analytics.model.ChangeAnalyticsInstanceNetworkEndpointDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the AnalyticsInstance. */
        private String analyticsInstanceId = null;

        /**
         * The OCID of the AnalyticsInstance.
         *
         * @param analyticsInstanceId the value to set
         * @return this builder instance
         */
        public Builder analyticsInstanceId(String analyticsInstanceId) {
            this.analyticsInstanceId = analyticsInstanceId;
            return this;
        }

        /** Input payload for changing an Analytics instance network endpoint. */
        private com.oracle.bmc.analytics.model.ChangeAnalyticsInstanceNetworkEndpointDetails
                changeAnalyticsInstanceNetworkEndpointDetails = null;

        /**
         * Input payload for changing an Analytics instance network endpoint.
         *
         * @param changeAnalyticsInstanceNetworkEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder changeAnalyticsInstanceNetworkEndpointDetails(
                com.oracle.bmc.analytics.model.ChangeAnalyticsInstanceNetworkEndpointDetails
                        changeAnalyticsInstanceNetworkEndpointDetails) {
            this.changeAnalyticsInstanceNetworkEndpointDetails =
                    changeAnalyticsInstanceNetworkEndpointDetails;
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
        public Builder copy(ChangeAnalyticsInstanceNetworkEndpointRequest o) {
            analyticsInstanceId(o.getAnalyticsInstanceId());
            changeAnalyticsInstanceNetworkEndpointDetails(
                    o.getChangeAnalyticsInstanceNetworkEndpointDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeAnalyticsInstanceNetworkEndpointRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeAnalyticsInstanceNetworkEndpointRequest
         */
        public ChangeAnalyticsInstanceNetworkEndpointRequest build() {
            ChangeAnalyticsInstanceNetworkEndpointRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.analytics.model.ChangeAnalyticsInstanceNetworkEndpointDetails body) {
            changeAnalyticsInstanceNetworkEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeAnalyticsInstanceNetworkEndpointRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeAnalyticsInstanceNetworkEndpointRequest
         */
        public ChangeAnalyticsInstanceNetworkEndpointRequest buildWithoutInvocationCallback() {
            ChangeAnalyticsInstanceNetworkEndpointRequest request =
                    new ChangeAnalyticsInstanceNetworkEndpointRequest();
            request.analyticsInstanceId = analyticsInstanceId;
            request.changeAnalyticsInstanceNetworkEndpointDetails =
                    changeAnalyticsInstanceNetworkEndpointDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeAnalyticsInstanceNetworkEndpointRequest(analyticsInstanceId,
            // changeAnalyticsInstanceNetworkEndpointDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .analyticsInstanceId(analyticsInstanceId)
                .changeAnalyticsInstanceNetworkEndpointDetails(
                        changeAnalyticsInstanceNetworkEndpointDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",analyticsInstanceId=").append(String.valueOf(this.analyticsInstanceId));
        sb.append(",changeAnalyticsInstanceNetworkEndpointDetails=")
                .append(String.valueOf(this.changeAnalyticsInstanceNetworkEndpointDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeAnalyticsInstanceNetworkEndpointRequest)) {
            return false;
        }

        ChangeAnalyticsInstanceNetworkEndpointRequest other =
                (ChangeAnalyticsInstanceNetworkEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.analyticsInstanceId, other.analyticsInstanceId)
                && java.util.Objects.equals(
                        this.changeAnalyticsInstanceNetworkEndpointDetails,
                        other.changeAnalyticsInstanceNetworkEndpointDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.analyticsInstanceId == null
                                ? 43
                                : this.analyticsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeAnalyticsInstanceNetworkEndpointDetails == null
                                ? 43
                                : this.changeAnalyticsInstanceNetworkEndpointDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
