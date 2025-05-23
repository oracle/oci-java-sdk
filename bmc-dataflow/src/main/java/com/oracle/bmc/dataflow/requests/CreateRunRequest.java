/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.requests;

import com.oracle.bmc.dataflow.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataflow/CreateRunExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateRunRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class CreateRunRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.dataflow.model.CreateRunDetails> {

    /** Details for creating a run of an application. */
    private com.oracle.bmc.dataflow.model.CreateRunDetails createRunDetails;

    /** Details for creating a run of an application. */
    public com.oracle.bmc.dataflow.model.CreateRunDetails getCreateRunDetails() {
        return createRunDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * (Optional header param, required for Resource Principal version 3.0+) Parent resource control
     * plane endpoint used to exchange for upper level resource principal token.
     */
    private String opcParentRptUrl;

    /**
     * (Optional header param, required for Resource Principal version 3.0+) Parent resource control
     * plane endpoint used to exchange for upper level resource principal token.
     */
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
    public com.oracle.bmc.dataflow.model.CreateRunDetails getBody$() {
        return createRunDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateRunRequest, com.oracle.bmc.dataflow.model.CreateRunDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for creating a run of an application. */
        private com.oracle.bmc.dataflow.model.CreateRunDetails createRunDetails = null;

        /**
         * Details for creating a run of an application.
         *
         * @param createRunDetails the value to set
         * @return this builder instance
         */
        public Builder createRunDetails(
                com.oracle.bmc.dataflow.model.CreateRunDetails createRunDetails) {
            this.createRunDetails = createRunDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * (Optional header param, required for Resource Principal version 3.0+) Parent resource
         * control plane endpoint used to exchange for upper level resource principal token.
         */
        private String opcParentRptUrl = null;

        /**
         * (Optional header param, required for Resource Principal version 3.0+) Parent resource
         * control plane endpoint used to exchange for upper level resource principal token.
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
        public Builder copy(CreateRunRequest o) {
            createRunDetails(o.getCreateRunDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            opcParentRptUrl(o.getOpcParentRptUrl());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateRunRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateRunRequest
         */
        public CreateRunRequest build() {
            CreateRunRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dataflow.model.CreateRunDetails body) {
            createRunDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateRunRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateRunRequest
         */
        public CreateRunRequest buildWithoutInvocationCallback() {
            CreateRunRequest request = new CreateRunRequest();
            request.createRunDetails = createRunDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.opcParentRptUrl = opcParentRptUrl;
            return request;
            // new CreateRunRequest(createRunDetails, opcRetryToken, opcRequestId, opcParentRptUrl);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createRunDetails(createRunDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
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
        sb.append(",createRunDetails=").append(String.valueOf(this.createRunDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcParentRptUrl=").append(String.valueOf(this.opcParentRptUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRunRequest)) {
            return false;
        }

        CreateRunRequest other = (CreateRunRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.createRunDetails, other.createRunDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcParentRptUrl, other.opcParentRptUrl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createRunDetails == null ? 43 : this.createRunDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcParentRptUrl == null ? 43 : this.opcParentRptUrl.hashCode());
        return result;
    }
}
