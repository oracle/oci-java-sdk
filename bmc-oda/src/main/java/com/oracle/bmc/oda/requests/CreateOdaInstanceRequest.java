/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/CreateOdaInstanceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateOdaInstanceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class CreateOdaInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.CreateOdaInstanceDetails> {

    /**
     * Details for the new Digital Assistant instance.
     */
    private com.oracle.bmc.oda.model.CreateOdaInstanceDetails createOdaInstanceDetails;

    /**
     * Details for the new Digital Assistant instance.
     */
    public com.oracle.bmc.oda.model.CreateOdaInstanceDetails getCreateOdaInstanceDetails() {
        return createOdaInstanceDetails;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so that you can retry the request if there's
     * a timeout or server error without the risk of executing that same action again.
     * <p>
     * Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so that you can retry the request if there's
     * a timeout or server error without the risk of executing that same action again.
     * <p>
     * Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.oda.model.CreateOdaInstanceDetails getBody$() {
        return createOdaInstanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateOdaInstanceRequest, com.oracle.bmc.oda.model.CreateOdaInstanceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for the new Digital Assistant instance.
         */
        private com.oracle.bmc.oda.model.CreateOdaInstanceDetails createOdaInstanceDetails = null;

        /**
         * Details for the new Digital Assistant instance.
         * @param createOdaInstanceDetails the value to set
         * @return this builder instance
         */
        public Builder createOdaInstanceDetails(
                com.oracle.bmc.oda.model.CreateOdaInstanceDetails createOdaInstanceDetails) {
            this.createOdaInstanceDetails = createOdaInstanceDetails;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's
         * a timeout or server error without the risk of executing that same action again.
         * <p>
         * Retry tokens expire after 24 hours, but they can become invalid before then if there are
         * conflicting operations. For example, if an instance was deleted and purged from the system,
         * then the service might reject a retry of the original creation request.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's
         * a timeout or server error without the risk of executing that same action again.
         * <p>
         * Retry tokens expire after 24 hours, but they can become invalid before then if there are
         * conflicting operations. For example, if an instance was deleted and purged from the system,
         * then the service might reject a retry of the original creation request.
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
        public Builder copy(CreateOdaInstanceRequest o) {
            createOdaInstanceDetails(o.getCreateOdaInstanceDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateOdaInstanceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateOdaInstanceRequest
         */
        public CreateOdaInstanceRequest build() {
            CreateOdaInstanceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.CreateOdaInstanceDetails body) {
            createOdaInstanceDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateOdaInstanceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateOdaInstanceRequest
         */
        public CreateOdaInstanceRequest buildWithoutInvocationCallback() {
            CreateOdaInstanceRequest request = new CreateOdaInstanceRequest();
            request.createOdaInstanceDetails = createOdaInstanceDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateOdaInstanceRequest(createOdaInstanceDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createOdaInstanceDetails(createOdaInstanceDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",createOdaInstanceDetails=")
                .append(String.valueOf(this.createOdaInstanceDetails));
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
        if (!(o instanceof CreateOdaInstanceRequest)) {
            return false;
        }

        CreateOdaInstanceRequest other = (CreateOdaInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createOdaInstanceDetails, other.createOdaInstanceDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createOdaInstanceDetails == null
                                ? 43
                                : this.createOdaInstanceDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
