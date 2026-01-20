/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateUserDefinedFunctionValidationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateUserDefinedFunctionValidationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class CreateUserDefinedFunctionValidationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataintegration.model.CreateUserDefinedFunctionValidationDetails> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /**
     * The information needed to create the UserDefinedFunction validation for the
     * UserDefinedFunction object.
     */
    private com.oracle.bmc.dataintegration.model.CreateUserDefinedFunctionValidationDetails
            createUserDefinedFunctionValidationDetails;

    /**
     * The information needed to create the UserDefinedFunction validation for the
     * UserDefinedFunction object.
     */
    public com.oracle.bmc.dataintegration.model.CreateUserDefinedFunctionValidationDetails
            getCreateUserDefinedFunctionValidationDetails() {
        return createUserDefinedFunctionValidationDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again.
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
    public com.oracle.bmc.dataintegration.model.CreateUserDefinedFunctionValidationDetails
            getBody$() {
        return createUserDefinedFunctionValidationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateUserDefinedFunctionValidationRequest,
                    com.oracle.bmc.dataintegration.model
                            .CreateUserDefinedFunctionValidationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The workspace ID. */
        private String workspaceId = null;

        /**
         * The workspace ID.
         *
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * The information needed to create the UserDefinedFunction validation for the
         * UserDefinedFunction object.
         */
        private com.oracle.bmc.dataintegration.model.CreateUserDefinedFunctionValidationDetails
                createUserDefinedFunctionValidationDetails = null;

        /**
         * The information needed to create the UserDefinedFunction validation for the
         * UserDefinedFunction object.
         *
         * @param createUserDefinedFunctionValidationDetails the value to set
         * @return this builder instance
         */
        public Builder createUserDefinedFunctionValidationDetails(
                com.oracle.bmc.dataintegration.model.CreateUserDefinedFunctionValidationDetails
                        createUserDefinedFunctionValidationDetails) {
            this.createUserDefinedFunctionValidationDetails =
                    createUserDefinedFunctionValidationDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again.
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
        public Builder copy(CreateUserDefinedFunctionValidationRequest o) {
            workspaceId(o.getWorkspaceId());
            createUserDefinedFunctionValidationDetails(
                    o.getCreateUserDefinedFunctionValidationDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateUserDefinedFunctionValidationRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateUserDefinedFunctionValidationRequest
         */
        public CreateUserDefinedFunctionValidationRequest build() {
            CreateUserDefinedFunctionValidationRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dataintegration.model.CreateUserDefinedFunctionValidationDetails
                        body) {
            createUserDefinedFunctionValidationDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateUserDefinedFunctionValidationRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateUserDefinedFunctionValidationRequest
         */
        public CreateUserDefinedFunctionValidationRequest buildWithoutInvocationCallback() {
            CreateUserDefinedFunctionValidationRequest request =
                    new CreateUserDefinedFunctionValidationRequest();
            request.workspaceId = workspaceId;
            request.createUserDefinedFunctionValidationDetails =
                    createUserDefinedFunctionValidationDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateUserDefinedFunctionValidationRequest(workspaceId,
            // createUserDefinedFunctionValidationDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .createUserDefinedFunctionValidationDetails(
                        createUserDefinedFunctionValidationDetails)
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",createUserDefinedFunctionValidationDetails=")
                .append(String.valueOf(this.createUserDefinedFunctionValidationDetails));
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
        if (!(o instanceof CreateUserDefinedFunctionValidationRequest)) {
            return false;
        }

        CreateUserDefinedFunctionValidationRequest other =
                (CreateUserDefinedFunctionValidationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(
                        this.createUserDefinedFunctionValidationDetails,
                        other.createUserDefinedFunctionValidationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.createUserDefinedFunctionValidationDetails == null
                                ? 43
                                : this.createUserDefinedFunctionValidationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
