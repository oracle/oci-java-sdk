/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.requests;

import com.oracle.bmc.mysql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/CreateBlueGreenDeploymentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateBlueGreenDeploymentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class CreateBlueGreenDeploymentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.mysql.model.CreateBlueGreenDeploymentDetails> {

    /** Details for creating a blue/green deployment, including target DB System overrides. */
    private com.oracle.bmc.mysql.model.CreateBlueGreenDeploymentDetails
            createBlueGreenDeploymentDetails;

    /** Details for creating a blue/green deployment, including target DB System overrides. */
    public com.oracle.bmc.mysql.model.CreateBlueGreenDeploymentDetails
            getCreateBlueGreenDeploymentDetails() {
        return createBlueGreenDeploymentDetails;
    }
    /**
     * Customer-defined unique identifier for the request. If you need to contact Oracle about a
     * specific request, please provide the request ID that you supplied in this header with the
     * request.
     */
    private String opcRequestId;

    /**
     * Customer-defined unique identifier for the request. If you need to contact Oracle about a
     * specific request, please provide the request ID that you supplied in this header with the
     * request.
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
    public com.oracle.bmc.mysql.model.CreateBlueGreenDeploymentDetails getBody$() {
        return createBlueGreenDeploymentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateBlueGreenDeploymentRequest,
                    com.oracle.bmc.mysql.model.CreateBlueGreenDeploymentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for creating a blue/green deployment, including target DB System overrides. */
        private com.oracle.bmc.mysql.model.CreateBlueGreenDeploymentDetails
                createBlueGreenDeploymentDetails = null;

        /**
         * Details for creating a blue/green deployment, including target DB System overrides.
         *
         * @param createBlueGreenDeploymentDetails the value to set
         * @return this builder instance
         */
        public Builder createBlueGreenDeploymentDetails(
                com.oracle.bmc.mysql.model.CreateBlueGreenDeploymentDetails
                        createBlueGreenDeploymentDetails) {
            this.createBlueGreenDeploymentDetails = createBlueGreenDeploymentDetails;
            return this;
        }

        /**
         * Customer-defined unique identifier for the request. If you need to contact Oracle about a
         * specific request, please provide the request ID that you supplied in this header with the
         * request.
         */
        private String opcRequestId = null;

        /**
         * Customer-defined unique identifier for the request. If you need to contact Oracle about a
         * specific request, please provide the request ID that you supplied in this header with the
         * request.
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
        public Builder copy(CreateBlueGreenDeploymentRequest o) {
            createBlueGreenDeploymentDetails(o.getCreateBlueGreenDeploymentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateBlueGreenDeploymentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateBlueGreenDeploymentRequest
         */
        public CreateBlueGreenDeploymentRequest build() {
            CreateBlueGreenDeploymentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.mysql.model.CreateBlueGreenDeploymentDetails body) {
            createBlueGreenDeploymentDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateBlueGreenDeploymentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateBlueGreenDeploymentRequest
         */
        public CreateBlueGreenDeploymentRequest buildWithoutInvocationCallback() {
            CreateBlueGreenDeploymentRequest request = new CreateBlueGreenDeploymentRequest();
            request.createBlueGreenDeploymentDetails = createBlueGreenDeploymentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateBlueGreenDeploymentRequest(createBlueGreenDeploymentDetails, opcRequestId,
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
                .createBlueGreenDeploymentDetails(createBlueGreenDeploymentDetails)
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
        sb.append(",createBlueGreenDeploymentDetails=")
                .append(String.valueOf(this.createBlueGreenDeploymentDetails));
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
        if (!(o instanceof CreateBlueGreenDeploymentRequest)) {
            return false;
        }

        CreateBlueGreenDeploymentRequest other = (CreateBlueGreenDeploymentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createBlueGreenDeploymentDetails,
                        other.createBlueGreenDeploymentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createBlueGreenDeploymentDetails == null
                                ? 43
                                : this.createBlueGreenDeploymentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
