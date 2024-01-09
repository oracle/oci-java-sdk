/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateOdaPrivateEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateOdaPrivateEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class CreateOdaPrivateEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.CreateOdaPrivateEndpointDetails> {

    /** Details for the new ODA Private Endpoint. */
    private com.oracle.bmc.oda.model.CreateOdaPrivateEndpointDetails
            createOdaPrivateEndpointDetails;

    /** Details for the new ODA Private Endpoint. */
    public com.oracle.bmc.oda.model.CreateOdaPrivateEndpointDetails
            getCreateOdaPrivateEndpointDetails() {
        return createOdaPrivateEndpointDetails;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so that you can retry the request if there's a
     * timeout or server error without the risk of executing that same action again.
     *
     * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so that you can retry the request if there's a
     * timeout or server error without the risk of executing that same action again.
     *
     * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
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
    public com.oracle.bmc.oda.model.CreateOdaPrivateEndpointDetails getBody$() {
        return createOdaPrivateEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateOdaPrivateEndpointRequest,
                    com.oracle.bmc.oda.model.CreateOdaPrivateEndpointDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for the new ODA Private Endpoint. */
        private com.oracle.bmc.oda.model.CreateOdaPrivateEndpointDetails
                createOdaPrivateEndpointDetails = null;

        /**
         * Details for the new ODA Private Endpoint.
         *
         * @param createOdaPrivateEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder createOdaPrivateEndpointDetails(
                com.oracle.bmc.oda.model.CreateOdaPrivateEndpointDetails
                        createOdaPrivateEndpointDetails) {
            this.createOdaPrivateEndpointDetails = createOdaPrivateEndpointDetails;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's a
         * timeout or server error without the risk of executing that same action again.
         *
         * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there
         * are conflicting operations. For example, if an instance was deleted and purged from the
         * system, then the service might reject a retry of the original creation request.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's a
         * timeout or server error without the risk of executing that same action again.
         *
         * <p>Retry tokens expire after 24 hours, but they can become invalid before then if there
         * are conflicting operations. For example, if an instance was deleted and purged from the
         * system, then the service might reject a retry of the original creation request.
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
        public Builder copy(CreateOdaPrivateEndpointRequest o) {
            createOdaPrivateEndpointDetails(o.getCreateOdaPrivateEndpointDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateOdaPrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateOdaPrivateEndpointRequest
         */
        public CreateOdaPrivateEndpointRequest build() {
            CreateOdaPrivateEndpointRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.CreateOdaPrivateEndpointDetails body) {
            createOdaPrivateEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateOdaPrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateOdaPrivateEndpointRequest
         */
        public CreateOdaPrivateEndpointRequest buildWithoutInvocationCallback() {
            CreateOdaPrivateEndpointRequest request = new CreateOdaPrivateEndpointRequest();
            request.createOdaPrivateEndpointDetails = createOdaPrivateEndpointDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateOdaPrivateEndpointRequest(createOdaPrivateEndpointDetails, opcRequestId,
            // opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createOdaPrivateEndpointDetails(createOdaPrivateEndpointDetails)
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
        sb.append(",createOdaPrivateEndpointDetails=")
                .append(String.valueOf(this.createOdaPrivateEndpointDetails));
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
        if (!(o instanceof CreateOdaPrivateEndpointRequest)) {
            return false;
        }

        CreateOdaPrivateEndpointRequest other = (CreateOdaPrivateEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createOdaPrivateEndpointDetails, other.createOdaPrivateEndpointDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createOdaPrivateEndpointDetails == null
                                ? 43
                                : this.createOdaPrivateEndpointDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
