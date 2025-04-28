/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.requests;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/CreateDomainGovernanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateDomainGovernanceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class CreateDomainGovernanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.tenantmanagercontrolplane.model.CreateDomainGovernanceDetails> {

    /** Parameters for adding domain governance to a claimed domain. */
    private com.oracle.bmc.tenantmanagercontrolplane.model.CreateDomainGovernanceDetails
            createDomainGovernanceDetails;

    /** Parameters for adding domain governance to a claimed domain. */
    public com.oracle.bmc.tenantmanagercontrolplane.model.CreateDomainGovernanceDetails
            getCreateDomainGovernanceDetails() {
        return createDomainGovernanceDetails;
    }
    /**
     * A token that uniquely identifies a request, so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request will be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request, so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request will be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.tenantmanagercontrolplane.model.CreateDomainGovernanceDetails getBody$() {
        return createDomainGovernanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateDomainGovernanceRequest,
                    com.oracle.bmc.tenantmanagercontrolplane.model.CreateDomainGovernanceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Parameters for adding domain governance to a claimed domain. */
        private com.oracle.bmc.tenantmanagercontrolplane.model.CreateDomainGovernanceDetails
                createDomainGovernanceDetails = null;

        /**
         * Parameters for adding domain governance to a claimed domain.
         *
         * @param createDomainGovernanceDetails the value to set
         * @return this builder instance
         */
        public Builder createDomainGovernanceDetails(
                com.oracle.bmc.tenantmanagercontrolplane.model.CreateDomainGovernanceDetails
                        createDomainGovernanceDetails) {
            this.createDomainGovernanceDetails = createDomainGovernanceDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request, so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request will be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request, so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request will be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateDomainGovernanceRequest o) {
            createDomainGovernanceDetails(o.getCreateDomainGovernanceDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateDomainGovernanceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateDomainGovernanceRequest
         */
        public CreateDomainGovernanceRequest build() {
            CreateDomainGovernanceRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.tenantmanagercontrolplane.model.CreateDomainGovernanceDetails body) {
            createDomainGovernanceDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateDomainGovernanceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateDomainGovernanceRequest
         */
        public CreateDomainGovernanceRequest buildWithoutInvocationCallback() {
            CreateDomainGovernanceRequest request = new CreateDomainGovernanceRequest();
            request.createDomainGovernanceDetails = createDomainGovernanceDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateDomainGovernanceRequest(createDomainGovernanceDetails, opcRetryToken,
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
                .createDomainGovernanceDetails(createDomainGovernanceDetails)
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
        sb.append(",createDomainGovernanceDetails=")
                .append(String.valueOf(this.createDomainGovernanceDetails));
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
        if (!(o instanceof CreateDomainGovernanceRequest)) {
            return false;
        }

        CreateDomainGovernanceRequest other = (CreateDomainGovernanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createDomainGovernanceDetails, other.createDomainGovernanceDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createDomainGovernanceDetails == null
                                ? 43
                                : this.createDomainGovernanceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
