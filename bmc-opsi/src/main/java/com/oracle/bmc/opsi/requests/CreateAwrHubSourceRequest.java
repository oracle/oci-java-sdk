/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateAwrHubSourceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateAwrHubSourceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class CreateAwrHubSourceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.CreateAwrHubSourceDetails> {

    /** Payload containing details to register the source database */
    private com.oracle.bmc.opsi.model.CreateAwrHubSourceDetails createAwrHubSourceDetails;

    /** Payload containing details to register the source database */
    public com.oracle.bmc.opsi.model.CreateAwrHubSourceDetails getCreateAwrHubSourceDetails() {
        return createAwrHubSourceDetails;
    }
    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or server
     * error without risk of executing the same action again. Retry tokens expire after 24 hours.
     *
     * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or server
     * error without risk of executing the same action again. Retry tokens expire after 24 hours.
     *
     * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.opsi.model.CreateAwrHubSourceDetails getBody$() {
        return createAwrHubSourceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateAwrHubSourceRequest,
                    com.oracle.bmc.opsi.model.CreateAwrHubSourceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Payload containing details to register the source database */
        private com.oracle.bmc.opsi.model.CreateAwrHubSourceDetails createAwrHubSourceDetails =
                null;

        /**
         * Payload containing details to register the source database
         *
         * @param createAwrHubSourceDetails the value to set
         * @return this builder instance
         */
        public Builder createAwrHubSourceDetails(
                com.oracle.bmc.opsi.model.CreateAwrHubSourceDetails createAwrHubSourceDetails) {
            this.createAwrHubSourceDetails = createAwrHubSourceDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after
         * 24 hours.
         *
         * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to
         * conflicting operations, such as a resource being deleted or purged from the system.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after
         * 24 hours.
         *
         * <p>Note:* Retry tokens can be invalidated before the 24 hour time limit due to
         * conflicting operations, such as a resource being deleted or purged from the system.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
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
        public Builder copy(CreateAwrHubSourceRequest o) {
            createAwrHubSourceDetails(o.getCreateAwrHubSourceDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateAwrHubSourceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateAwrHubSourceRequest
         */
        public CreateAwrHubSourceRequest build() {
            CreateAwrHubSourceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.opsi.model.CreateAwrHubSourceDetails body) {
            createAwrHubSourceDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateAwrHubSourceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateAwrHubSourceRequest
         */
        public CreateAwrHubSourceRequest buildWithoutInvocationCallback() {
            CreateAwrHubSourceRequest request = new CreateAwrHubSourceRequest();
            request.createAwrHubSourceDetails = createAwrHubSourceDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateAwrHubSourceRequest(createAwrHubSourceDetails, opcRetryToken,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createAwrHubSourceDetails(createAwrHubSourceDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createAwrHubSourceDetails=")
                .append(String.valueOf(this.createAwrHubSourceDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAwrHubSourceRequest)) {
            return false;
        }

        CreateAwrHubSourceRequest other = (CreateAwrHubSourceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createAwrHubSourceDetails, other.createAwrHubSourceDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createAwrHubSourceDetails == null
                                ? 43
                                : this.createAwrHubSourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
