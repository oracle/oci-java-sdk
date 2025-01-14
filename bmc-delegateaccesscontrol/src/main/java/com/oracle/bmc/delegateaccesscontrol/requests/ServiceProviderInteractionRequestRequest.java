/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.requests;

import com.oracle.bmc.delegateaccesscontrol.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/delegateaccesscontrol/ServiceProviderInteractionRequestExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ServiceProviderInteractionRequestRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class ServiceProviderInteractionRequestRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.delegateaccesscontrol.model
                        .ServiceProviderInteractionRequestDetails> {

    /** Unique Delegated Resource Access Request identifier */
    private String delegatedResourceAccessRequestId;

    /** Unique Delegated Resource Access Request identifier */
    public String getDelegatedResourceAccessRequestId() {
        return delegatedResourceAccessRequestId;
    }
    /** Details containing Query for additional information provided by Customer. */
    private com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionRequestDetails
            serviceProviderInteractionRequestDetails;

    /** Details containing Query for additional information provided by Customer. */
    public com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionRequestDetails
            getServiceProviderInteractionRequestDetails() {
        return serviceProviderInteractionRequestDetails;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionRequestDetails
            getBody$() {
        return serviceProviderInteractionRequestDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ServiceProviderInteractionRequestRequest,
                    com.oracle.bmc.delegateaccesscontrol.model
                            .ServiceProviderInteractionRequestDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Delegated Resource Access Request identifier */
        private String delegatedResourceAccessRequestId = null;

        /**
         * Unique Delegated Resource Access Request identifier
         *
         * @param delegatedResourceAccessRequestId the value to set
         * @return this builder instance
         */
        public Builder delegatedResourceAccessRequestId(String delegatedResourceAccessRequestId) {
            this.delegatedResourceAccessRequestId = delegatedResourceAccessRequestId;
            return this;
        }

        /** Details containing Query for additional information provided by Customer. */
        private com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionRequestDetails
                serviceProviderInteractionRequestDetails = null;

        /**
         * Details containing Query for additional information provided by Customer.
         *
         * @param serviceProviderInteractionRequestDetails the value to set
         * @return this builder instance
         */
        public Builder serviceProviderInteractionRequestDetails(
                com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionRequestDetails
                        serviceProviderInteractionRequestDetails) {
            this.serviceProviderInteractionRequestDetails =
                    serviceProviderInteractionRequestDetails;
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
        public Builder copy(ServiceProviderInteractionRequestRequest o) {
            delegatedResourceAccessRequestId(o.getDelegatedResourceAccessRequestId());
            serviceProviderInteractionRequestDetails(
                    o.getServiceProviderInteractionRequestDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ServiceProviderInteractionRequestRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ServiceProviderInteractionRequestRequest
         */
        public ServiceProviderInteractionRequestRequest build() {
            ServiceProviderInteractionRequestRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.delegateaccesscontrol.model.ServiceProviderInteractionRequestDetails
                        body) {
            serviceProviderInteractionRequestDetails(body);
            return this;
        }

        /**
         * Build the instance of ServiceProviderInteractionRequestRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ServiceProviderInteractionRequestRequest
         */
        public ServiceProviderInteractionRequestRequest buildWithoutInvocationCallback() {
            ServiceProviderInteractionRequestRequest request =
                    new ServiceProviderInteractionRequestRequest();
            request.delegatedResourceAccessRequestId = delegatedResourceAccessRequestId;
            request.serviceProviderInteractionRequestDetails =
                    serviceProviderInteractionRequestDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ServiceProviderInteractionRequestRequest(delegatedResourceAccessRequestId,
            // serviceProviderInteractionRequestDetails, opcRetryToken, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .delegatedResourceAccessRequestId(delegatedResourceAccessRequestId)
                .serviceProviderInteractionRequestDetails(serviceProviderInteractionRequestDetails)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch)
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
        sb.append(",delegatedResourceAccessRequestId=")
                .append(String.valueOf(this.delegatedResourceAccessRequestId));
        sb.append(",serviceProviderInteractionRequestDetails=")
                .append(String.valueOf(this.serviceProviderInteractionRequestDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceProviderInteractionRequestRequest)) {
            return false;
        }

        ServiceProviderInteractionRequestRequest other =
                (ServiceProviderInteractionRequestRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.delegatedResourceAccessRequestId,
                        other.delegatedResourceAccessRequestId)
                && java.util.Objects.equals(
                        this.serviceProviderInteractionRequestDetails,
                        other.serviceProviderInteractionRequestDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.delegatedResourceAccessRequestId == null
                                ? 43
                                : this.delegatedResourceAccessRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceProviderInteractionRequestDetails == null
                                ? 43
                                : this.serviceProviderInteractionRequestDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
