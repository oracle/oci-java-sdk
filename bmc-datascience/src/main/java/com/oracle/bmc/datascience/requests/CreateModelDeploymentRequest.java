/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateModelDeploymentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateModelDeploymentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class CreateModelDeploymentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.CreateModelDeploymentDetails> {

    /** Details for creating a new model deployment. */
    private com.oracle.bmc.datascience.model.CreateModelDeploymentDetails
            createModelDeploymentDetails;

    /** Details for creating a new model deployment. */
    public com.oracle.bmc.datascience.model.CreateModelDeploymentDetails
            getCreateModelDeploymentDetails() {
        return createModelDeploymentDetails;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
    /** URL to fetch the Resource Principal Token from the parent resource. */
    private String opcParentRptUrl;

    /** URL to fetch the Resource Principal Token from the parent resource. */
    public String getOpcParentRptUrl() {
        return opcParentRptUrl;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datascience.model.CreateModelDeploymentDetails getBody$() {
        return createModelDeploymentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateModelDeploymentRequest,
                    com.oracle.bmc.datascience.model.CreateModelDeploymentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for creating a new model deployment. */
        private com.oracle.bmc.datascience.model.CreateModelDeploymentDetails
                createModelDeploymentDetails = null;

        /**
         * Details for creating a new model deployment.
         *
         * @param createModelDeploymentDetails the value to set
         * @return this builder instance
         */
        public Builder createModelDeploymentDetails(
                com.oracle.bmc.datascience.model.CreateModelDeploymentDetails
                        createModelDeploymentDetails) {
            this.createModelDeploymentDetails = createModelDeploymentDetails;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
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

        /** URL to fetch the Resource Principal Token from the parent resource. */
        private String opcParentRptUrl = null;

        /**
         * URL to fetch the Resource Principal Token from the parent resource.
         *
         * @param opcParentRptUrl the value to set
         * @return this builder instance
         */
        public Builder opcParentRptUrl(String opcParentRptUrl) {
            this.opcParentRptUrl = opcParentRptUrl;
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
        public Builder copy(CreateModelDeploymentRequest o) {
            createModelDeploymentDetails(o.getCreateModelDeploymentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            opcParentRptUrl(o.getOpcParentRptUrl());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateModelDeploymentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateModelDeploymentRequest
         */
        public CreateModelDeploymentRequest build() {
            CreateModelDeploymentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datascience.model.CreateModelDeploymentDetails body) {
            createModelDeploymentDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateModelDeploymentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateModelDeploymentRequest
         */
        public CreateModelDeploymentRequest buildWithoutInvocationCallback() {
            CreateModelDeploymentRequest request = new CreateModelDeploymentRequest();
            request.createModelDeploymentDetails = createModelDeploymentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.opcParentRptUrl = opcParentRptUrl;
            return request;
            // new CreateModelDeploymentRequest(createModelDeploymentDetails, opcRequestId,
            // opcRetryToken, opcParentRptUrl);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createModelDeploymentDetails(createModelDeploymentDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .opcParentRptUrl(opcParentRptUrl);
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
        sb.append(",createModelDeploymentDetails=")
                .append(String.valueOf(this.createModelDeploymentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcParentRptUrl=").append(String.valueOf(this.opcParentRptUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateModelDeploymentRequest)) {
            return false;
        }

        CreateModelDeploymentRequest other = (CreateModelDeploymentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createModelDeploymentDetails, other.createModelDeploymentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcParentRptUrl, other.opcParentRptUrl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createModelDeploymentDetails == null
                                ? 43
                                : this.createModelDeploymentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.opcParentRptUrl == null ? 43 : this.opcParentRptUrl.hashCode());
        return result;
    }
}
