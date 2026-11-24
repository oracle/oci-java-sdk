/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CancelInstancePoolRefreshExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CancelInstancePoolRefreshRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CancelInstancePoolRefreshRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.CancelInstancePoolRefreshDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool.
     */
    private String instancePoolId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool.
     */
    public String getInstancePoolId() {
        return instancePoolId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool refresh.
     */
    private String refreshId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool refresh.
     */
    public String getRefreshId() {
        return refreshId;
    }
    /** The details for canceling the instance pool refresh. */
    private com.oracle.bmc.core.model.CancelInstancePoolRefreshDetails
            cancelInstancePoolRefreshDetails;

    /** The details for canceling the instance pool refresh. */
    public com.oracle.bmc.core.model.CancelInstancePoolRefreshDetails
            getCancelInstancePoolRefreshDetails() {
        return cancelInstancePoolRefreshDetails;
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
    public com.oracle.bmc.core.model.CancelInstancePoolRefreshDetails getBody$() {
        return cancelInstancePoolRefreshDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CancelInstancePoolRefreshRequest,
                    com.oracle.bmc.core.model.CancelInstancePoolRefreshDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool.
         */
        private String instancePoolId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool.
         *
         * @param instancePoolId the value to set
         * @return this builder instance
         */
        public Builder instancePoolId(String instancePoolId) {
            this.instancePoolId = instancePoolId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool refresh.
         */
        private String refreshId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool refresh.
         *
         * @param refreshId the value to set
         * @return this builder instance
         */
        public Builder refreshId(String refreshId) {
            this.refreshId = refreshId;
            return this;
        }

        /** The details for canceling the instance pool refresh. */
        private com.oracle.bmc.core.model.CancelInstancePoolRefreshDetails
                cancelInstancePoolRefreshDetails = null;

        /**
         * The details for canceling the instance pool refresh.
         *
         * @param cancelInstancePoolRefreshDetails the value to set
         * @return this builder instance
         */
        public Builder cancelInstancePoolRefreshDetails(
                com.oracle.bmc.core.model.CancelInstancePoolRefreshDetails
                        cancelInstancePoolRefreshDetails) {
            this.cancelInstancePoolRefreshDetails = cancelInstancePoolRefreshDetails;
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
        public Builder copy(CancelInstancePoolRefreshRequest o) {
            instancePoolId(o.getInstancePoolId());
            refreshId(o.getRefreshId());
            cancelInstancePoolRefreshDetails(o.getCancelInstancePoolRefreshDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CancelInstancePoolRefreshRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CancelInstancePoolRefreshRequest
         */
        public CancelInstancePoolRefreshRequest build() {
            CancelInstancePoolRefreshRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.CancelInstancePoolRefreshDetails body) {
            cancelInstancePoolRefreshDetails(body);
            return this;
        }

        /**
         * Build the instance of CancelInstancePoolRefreshRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CancelInstancePoolRefreshRequest
         */
        public CancelInstancePoolRefreshRequest buildWithoutInvocationCallback() {
            CancelInstancePoolRefreshRequest request = new CancelInstancePoolRefreshRequest();
            request.instancePoolId = instancePoolId;
            request.refreshId = refreshId;
            request.cancelInstancePoolRefreshDetails = cancelInstancePoolRefreshDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new CancelInstancePoolRefreshRequest(instancePoolId, refreshId,
            // cancelInstancePoolRefreshDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .instancePoolId(instancePoolId)
                .refreshId(refreshId)
                .cancelInstancePoolRefreshDetails(cancelInstancePoolRefreshDetails)
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
        sb.append(",instancePoolId=").append(String.valueOf(this.instancePoolId));
        sb.append(",refreshId=").append(String.valueOf(this.refreshId));
        sb.append(",cancelInstancePoolRefreshDetails=")
                .append(String.valueOf(this.cancelInstancePoolRefreshDetails));
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
        if (!(o instanceof CancelInstancePoolRefreshRequest)) {
            return false;
        }

        CancelInstancePoolRefreshRequest other = (CancelInstancePoolRefreshRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.instancePoolId, other.instancePoolId)
                && java.util.Objects.equals(this.refreshId, other.refreshId)
                && java.util.Objects.equals(
                        this.cancelInstancePoolRefreshDetails,
                        other.cancelInstancePoolRefreshDetails)
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
                        + (this.instancePoolId == null ? 43 : this.instancePoolId.hashCode());
        result = (result * PRIME) + (this.refreshId == null ? 43 : this.refreshId.hashCode());
        result =
                (result * PRIME)
                        + (this.cancelInstancePoolRefreshDetails == null
                                ? 43
                                : this.cancelInstancePoolRefreshDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
