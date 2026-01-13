/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.modeldeployment.requests;

import com.oracle.bmc.modeldeployment.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/modeldeployment/PredictWithResponseStreamExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * PredictWithResponseStreamRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240424")
public class PredictWithResponseStreamRequest extends com.oracle.bmc.requests.BmcRequest<String> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model deployment.
     */
    private String modelDeploymentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model deployment.
     */
    public String getModelDeploymentId() {
        return modelDeploymentId;
    }
    /** Input data details for making a prediction call */
    private String requestBody;

    /** Input data details for making a prediction call */
    public String getRequestBody() {
        return requestBody;
    }
    /** Unique Oracle identifier for request */
    private String opcRequestId;

    /** Unique Oracle identifier for request */
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
    public String getBody$() {
        return requestBody;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PredictWithResponseStreamRequest, String> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model deployment.
         */
        private String modelDeploymentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model deployment.
         *
         * @param modelDeploymentId the value to set
         * @return this builder instance
         */
        public Builder modelDeploymentId(String modelDeploymentId) {
            this.modelDeploymentId = modelDeploymentId;
            return this;
        }

        /** Input data details for making a prediction call */
        private String requestBody = null;

        /**
         * Input data details for making a prediction call
         *
         * @param requestBody the value to set
         * @return this builder instance
         */
        public Builder requestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        /** Unique Oracle identifier for request */
        private String opcRequestId = null;

        /**
         * Unique Oracle identifier for request
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
        public Builder copy(PredictWithResponseStreamRequest o) {
            modelDeploymentId(o.getModelDeploymentId());
            requestBody(o.getRequestBody());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PredictWithResponseStreamRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PredictWithResponseStreamRequest
         */
        public PredictWithResponseStreamRequest build() {
            PredictWithResponseStreamRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(String body) {
            requestBody(body);
            return this;
        }

        /**
         * Build the instance of PredictWithResponseStreamRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PredictWithResponseStreamRequest
         */
        public PredictWithResponseStreamRequest buildWithoutInvocationCallback() {
            PredictWithResponseStreamRequest request = new PredictWithResponseStreamRequest();
            request.modelDeploymentId = modelDeploymentId;
            request.requestBody = requestBody;
            request.opcRequestId = opcRequestId;
            return request;
            // new PredictWithResponseStreamRequest(modelDeploymentId, requestBody, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .modelDeploymentId(modelDeploymentId)
                .requestBody(requestBody)
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
        sb.append(",modelDeploymentId=").append(String.valueOf(this.modelDeploymentId));
        sb.append(",requestBody=").append(String.valueOf(this.requestBody));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PredictWithResponseStreamRequest)) {
            return false;
        }

        PredictWithResponseStreamRequest other = (PredictWithResponseStreamRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.modelDeploymentId, other.modelDeploymentId)
                && java.util.Objects.equals(this.requestBody, other.requestBody)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.modelDeploymentId == null ? 43 : this.modelDeploymentId.hashCode());
        result = (result * PRIME) + (this.requestBody == null ? 43 : this.requestBody.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
